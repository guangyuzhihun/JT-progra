/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-10-16 11:29:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_002dparam_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<table class=\"easyui-datagrid\" id=\"itemParamList\" title=\"商品规格列表\"\n");
      out.write("       data-options=\"singleSelect:false, collapsible:true,\n");
      out.write("       pagination:true, url:'/item/param/list', method:'get',\n");
      out.write("       pageSize:30, toolbar:toolbar\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th data-options=\"field:'ck', checkbox:true\"></th>\n");
      out.write("            <th data-options=\"field:'id', width:60\">ID</th>\n");
      out.write("            <th data-options=\"field:'itemCatId', width:80\">商品类目ID</th>\n");
      out.write("            <th data-options=\"field:'itemCatName', width:100\">商品类目</th>\n");
      out.write("            <th data-options=\"field:'paramData', width:300, formatter:formatItemParamData\">规格（只显示分组名称）</th>\n");
      out.write("            <th data-options=\"field:'created', width:130, align:'center', formatter:KindEditorUtil.formatDateTime\">创建日期</th>\n");
      out.write("            <th data-options=\"field:'updated', width:130, align:'center', formatter:KindEditorUtil.formatDateTime\">更新日期</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("</table>\n");
      out.write("<!-- 此处未实现，暂时无用 zain 16/10/16 -->\n");
      out.write("<div id=\"itemEditWindow\" class=\"easyui-window\" title=\"编辑商品规格\" \n");
      out.write("     data-options=\"modal:true ,closed:true, iconCls:'icon-save', href:'/page/item-edit'\"\n");
      out.write("     style=\"width:500;height:450;\">\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\t//格式化数据\n");
      out.write("\tfunction formatItemParamData(value, index) {\n");
      out.write("\t    var json = JSON.parse(value);\n");
      out.write("\t    var array = [];\n");
      out.write("\t    $.each(json, function(i, e) {\n");
      out.write("\t        array.push(e.group);\n");
      out.write("\t    });\n");
      out.write("\t    return array.join(\",\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\tfunction getSelectionsIds() {\n");
      out.write("\t    var itemList = $(\"#itemParamList\");\n");
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
      out.write("\t        KindEditorUtil.createWindow({\n");
      out.write("\t            url : \"/page/item-param-add\",\n");
      out.write("\t        });\n");
      out.write("\t    }\n");
      out.write("\t}, {\n");
      out.write("\t    text : \"编辑\",\n");
      out.write("\t    iconCls : \"icon-edit\",\n");
      out.write("\t    handler : function() {\n");
      out.write("\t\t\talert(\"该功能未实现\");\t//不太重要，此处不再补全 zain 16/10/16\n");
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
      out.write("\t            //$.messager.confirm(\"确认\", \"确定删除ID为\" + ids + \"的商品规格吗？\", function(r) {\n");
      out.write("\t                if(true) {\n");
      out.write("\t                    var params = {\"ids\" : ids};\n");
      out.write("\t                    $.post(\"/item/param/delete\", params, function(data) {\n");
      out.write("\t                        if(200 == data.status) {\n");
      out.write("\t                          \t//$.message.alert(\"提示\", \"删除商品规格成功！\", undefined, function() {\n");
      out.write("\t\t                        //});\n");
      out.write("\t\t                        alert(\"删除商品规格成功！\");\n");
      out.write("\t\t                        $(\"#itemParamList\").datagrid(\"reload\");\n");
      out.write("\t                        }\n");
      out.write("\t                    });\n");
      out.write("\t                } // if over\n");
      out.write("\t            //}); \n");
      out.write("\t        } // handler over\n");
      out.write("\t}, \n");
      out.write("];\n");
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
