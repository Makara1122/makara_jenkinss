def call(Map config = [:]){
  def loadresource = libraryResource "com/planetpop/script/linux/nextjs_jenkins/${config.name}"
  writeFile file: "${config.name}", text: loadresource
  sh " chmod +x ./${config.name} "
}
