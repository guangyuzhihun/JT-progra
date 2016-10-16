/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-10-16 12:59:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<table class=\"easyui-datagrid\" id=\"itemList\" title=\"商品列表\"\n");
      out.write("       data-options=\"singleSelect:false, collapsible:true,\n");
      out.write("       pagination:true, url:'/item/query', method:'get',\n");
      out.write("       pageSize:30, toolbar:toolbar\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th data-options=\"field:'ck', checkbox:true\"></th>\n");
      out.write("            <th data-options=\"field:'id', width:60\">商品ID</th>\n");
      out.write("            <th data-options=\"field:'title', width:200\">商品标题</th>\n");
      out.write("            <th data-options=\"field:'cid', width:100\">叶子目录</th>\n");
      out.write("            <th data-options=\"field:'sellPoint', width:100\">卖点</th>\n");
      out.write("            <th data-options=\"field:'price', width:70, align:'right', formatter:KindEditorUtil.formatPrice\">价格</th>\n");
      out.write("            <th data-options=\"field:'num', width:70, align:'right'\">库存数量</th>\n");
      out.write("            <th data-options=\"field:'barcode', width:100\">条形码</th>\n");
      out.write("            <th data-options=\"field:'status', width:60, align:'center', formatter:KindEditorUtil.formatItemStatus\">状态</th>\n");
      out.write("            <th data-options=\"field:'created', width:130, align:'center', formatter:KindEditorUtil.formatDateTime\">创建日期</th>\n");
      out.write("            <th data-options=\"field:'updated', width:130, align:'center', formatter:KindEditorUtil.formatDateTime\">更新日期</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<div id=\"itemEditWindow\" class=\"easyui-window\" title=\"编辑商品\" \n");
      out.write("     data-options=\"modal:true ,closed:true, iconCls:'icon-save', href:'/page/item-edit'\"\n");
      out.write("     style=\"width:500;height:450;\">\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\t\n");
      out.write("\tfunction getSelectionsIds() {\n");
      out.write("\t    var itemList = $(\"#itemList\");\n");
      out.write("\t    var sels = itemList.datagrid(\"getSelections\"); //easyUI提供，获取用户节点对象集合\n");
      out.write("\t    var ids = [];\n");
      out.write("\t    for(var i in sels) {\n");
      out.write("\t        ids.push(sels[i].id);\n");
      out.write("\t    }\n");
      out.write("\t    ids = ids.join(\",\"); //将集合转为逗号连接字符串\n");
      out.write("\t    return ids;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tvar toolbar = [{\n");
      out.write("\t    text : \"新增\",\n");
      out.write("\t    iconCls : \"icon-add\",\n");
      out.write("\t    handler : function() {\n");
      out.write("\t        $(\".tree-title:contains('新增商品')\").parent().click();\n");
      out.write("\t    }\n");
      out.write("\t}, {\n");
      out.write("\t    text : \"编辑\",\n");
      out.write("\t    iconCls : \"icon-edit\",\n");
      out.write("\t    handler : function() {\n");
      out.write("\t        var ids = getSelectionsIds();\n");
      out.write("\t        if(ids.length == 0) {\n");
      out.write("\t            alert(\"必须选择一个商品才能编辑！\");\n");
      out.write("\t            return;\n");
      out.write("\t        }\n");
      out.write("\t        if(ids.indexOf(\",\") > 0) {\n");
      out.write("\t            alert(\"只能选择一个商品！\");\n");
      out.write("\t            return;\n");
      out.write("\t        }\n");
      out.write("\t        \n");
      out.write("\t        $(\"#itemEditWindow\").window({\n");
      out.write("\t            onLoad : function() {\n");
      out.write("\t                //回显数据，没有查询数据库，直接从列表中获取所需数据，性能高。可能造成数据不一致问题。有需要的话可以换成后台数据查找\n");
      out.write("\t                var data = $(\"#itemList\").datagrid(\"getSelections\")[0]; //后面这个中括号0这个方法可以获取jQuery对象中的dom对象，很好使！zain\n");
      out.write("\t            \tdata.priceView = KindEditorUtil.formatPrice(data.price);\n");
      out.write("\t            \t$(\"#itemEditForm\").form(\"load\", data);\n");
      out.write("\t            \t\n");
      out.write("\t            \t//加载商品 RESTFul\n");
      out.write("\t            \t$.getJSON(\"/item/query/item/desc/\" + data.id, function(_data) {\n");
      out.write("\t            \t    if(_data.status == 200) {\n");
      out.write("\t            \t        itemEditEditor.html(_data.data.itemDesc);\n");
      out.write("\t            \t    }\n");
      out.write("\t            \t});\n");
      out.write("\t            \t\n");
      out.write("\t            \t//加载商品规格\n");
      out.write("\t            \t$.getJSON(\"/item/param/item/query/\" + data.id, function(_data) {\n");
      out.write("\t            \t    if(_data && _data.status == 200 && _data.data && _data.data.paramData) {\n");
      out.write("\t            \t        $(\"#itemEditForm .params\").show();\n");
      out.write("\t            \t        $(\"#itemEditForm [name=itemParams]\").val(_data.data.paramData);\n");
      out.write("\t            \t        $(\"#itemEditForm [name=itemParamId]\").val(_data.data.id);\n");
      out.write("\t            \t        \n");
      out.write("\t            \t        //回显商品规格\n");
      out.write("\t            \t        var paramData = JSON.parse(_data.data.paramData);\n");
      out.write("\t            \t        \n");
      out.write("\t            \t        var html = \"<ul>\";\n");
      out.write("\t            \t        for(var i in paramData) {\n");
      out.write("\t            \t            var pd = paramData[i];\n");
      out.write("\t            \t            html += \"<li><table>\";\n");
      out.write("\t            \t            html += \"<tr><td colspan=\\\"2\\\" class=\\\"group\\\">\" + pd.group + \"</td></tr>\";\n");
      out.write("\t            \t            \n");
      out.write("\t            \t            for(var j in pd.params) {\n");
      out.write("\t            \t                var ps = pd.params[j];\n");
      out.write("\t            \t                html += \"<tr><td class=\\\"param\\\"><span>\" + ps.k + \"</span>: </td>\"\n");
      out.write("\t            \t                \t\t  + \"<td><input autocomplete=\\\"off\\\" type=\\\"text\\\" value='\" + ps.v + \"'/></td></tr>\";\n");
      out.write("\t            \t            } \n");
      out.write("\t            \t            \n");
      out.write("\t            \t            html += \"</li></table>\";\n");
      out.write("\t            \t        }\n");
      out.write("\t            \t        html += \"</ul>\";\n");
      out.write("\t            \t        $(\"#itemEditForm .params td\").eq(1).html(html);\n");
      out.write("\t            \t    } // if over\n");
      out.write("\t            \t});  // $.getJson over\n");
      out.write("\t            \t\n");
      out.write("\t            \tKindEditorUtil.init({\n");
      out.write("\t            \t    \"pics\" : data.image,\n");
      out.write("\t            \t    \"cid\" : data.cid,\n");
      out.write("\t            \t    fun : function(node) {\n");
      out.write("\t            \t        KindEditorUtil.changeItemParam(node,  \"itemEditForm\");\n");
      out.write("\t            \t    }\n");
      out.write("\t            \t});\n");
      out.write("\t            \t\n");
      out.write("\t            } // onLoad over\n");
      out.write("\t        }).window(\"open\"); // $(\"#itemEditWindow\").window over\n");
      out.write("\t    } // handler over\n");
      out.write("\t}, { \n");
      out.write("\t        text : \"删除\",\n");
      out.write("\t        iconCls : \"icon-cancel\",\n");
      out.write("\t        handler : function() {\n");
      out.write("\t            var ids = getSelectionsIds();\n");
      out.write("\t            if(ids.length == 0) {\n");
      out.write("\t                alert(\"未选中商品！\");\n");
      out.write("\t                return;\n");
      out.write("\t            }\n");
      out.write("\t            //$.messager.confirm(\"确认\", \"确定删除ID为\" + ids + \"的商品吗？\", function(r) {\n");
      out.write("\t                if(true) {\n");
      out.write("\t                    var params = {\"ids\" : ids};\n");
      out.write("\t                    $.post(\"/item/delete\", params, function(data) {\n");
      out.write("\t                        if(200 == data.status) {\n");
      out.write("\t                          \t//$.message.alert(\"提示\", \"删除商品成功！\", undefined, function() {\n");
      out.write("\t\t                        //});\n");
      out.write("\t\t                        alert(\"删除商品成功！\");\n");
      out.write("\t\t                        $(\"#itemList\").datagrid(\"reload\");\n");
      out.write("\t                        }\n");
      out.write("\t                    });\n");
      out.write("\t                } // if over\n");
      out.write("\t            //}); \n");
      out.write("\t        } // handler over\n");
      out.write("\t\t\n");
      out.write("\t    \n");
      out.write("\t}, \"-\", {\n");
      out.write("\t    text : \"下架\",\n");
      out.write("\t    iconCls : \"icon-remove\",\n");
      out.write("\t    handler : function() {\n");
      out.write("\t        \n");
      out.write("\t    }\n");
      out.write("\t}];\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
