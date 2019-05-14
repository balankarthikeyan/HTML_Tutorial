const readyHandleBars = element => {
  const getDom = document.querySelector(element);
  getDom.setAttribute("type", "text/x-handlebars-template");
  const templateHtmldata = getDom.innerHTML;
  const handlebarComplieData = Handlebars.compile(templateHtmldata);

  /**
   * @Generate_html_using_template_and_data
   */
  const response = handlebarComplieData(wordings);

  /**
   * @Add_the_result_to_the_DOM
   */
  getDom.removeAttribute("type");
  getDom.innerHTML = response;
};

readyHandleBars("#renderedContent");
