def call(String[] args) {
  def asize = args.length
  echo "length is: ${asize}"
  for (x in args) {
    echo "arg is: $x"
  }
}
