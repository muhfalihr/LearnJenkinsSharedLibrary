def call(steps, var) {
    def type = var.getClass().getSimpleName()
    steps.echo(type)
}