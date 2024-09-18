def call(Map config = [:]) {
  hello(name: "Kanha Phol", dayOfWeek:"Monday")
  loadlinux(name:"build_and_run.sh")
  sh " ./hello_world.sh ${config.name} ${config.dayOfWeek}."
}
