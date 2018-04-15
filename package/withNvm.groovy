def call(final String version = 'node', final Closure body) {
  echo "running with nvm: ${version}"

  body()
}

return this
