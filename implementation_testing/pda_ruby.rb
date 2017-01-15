class Pda

	def initialize
	@example_array = [2, 5, 4, 7]
	
	@example_hash = {
		"Ruby" => "Ruby is good for web frameworks",
		"Java" => "Java is a portable, vm-run strictly typed language",
		"Javascript" => "JS is increasingly the lingua franca of the web"
	}
end

	def example_sort
		@example_array.sort!
		puts @example_array
	end

	def example_search language
		@example_hash.each do |key, value|
			if key == language
				puts value
			end
		end
	end

end

pda = Pda.new

pda.example_sort
pda.example_search "Java"