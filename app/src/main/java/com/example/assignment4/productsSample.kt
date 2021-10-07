package com.example.assignment4

class productsSample {


companion object
{
    fun getProducts():ArrayList<Product>{

        var productsList= ArrayList<Product>()

        productsList.add(Product("RCA Voyager 7",49.9,"Black",R.drawable.p1,1,"Introducing the RCA Voyager 7-inch Google Certified Tablet. Operating on Android 8.1, you can enjoy more of what the Google Play store has to offer. Share a smile with friends and family using the tablet's front camera. Use the tablet's built-in Bluetooth capability to connect and pair with compatible devices. Whether taking in a movie, playing a favorite game or surfing the Web, the RCA tablet's quad-core processor and 16GB flash-storage surely won't disappoint.\n" +
                "\n"))

        productsList.add(Product("HP Flyer Red 15.6",499.7,"Red",R.drawable.p2,2,"15.6 inch HD BrightView WLED-backlit display (1366x768) with build in HD webcam; SuperMulti DVD burner, HDMI\n" +
                "Intel Pentium Quad-Core N3540 processor 2.16GHz (with Max Turbo Speed of 2.66GHz), 4GB DDR3 SDRAM (2 slots), 500GB SATA hard drive\n" +
                "2 x USB 3.0 ports, 1 x USB 2.0 port, 1 x headphone/microphone combo jack, 1 x RJ-45 Ethernet port, 1 x HDMI port; 10/100Base-T Ethernet, 802.11b/g/n Wireless LAN;\n" +
                "Windows 10 Home; SuperMulti DVD Burner, Full-size island-style keyboard with numeric keypad\n"))

        productsList.add(Product("VIZIO 70-inch V-Series",751.2,"Black",R.drawable.p3,3,"VIZIO IQ Active 4K HDR Processor: Inside, the lightning-fast IQ Active processor delivers superior picture processing, and more intelligent 4K upscaling engine displaying your favorite HD entertainment in spectacular 4K quality.\n" +
                "Active Pixel Tuning: Intelligent pixel-level brightness adjustments for increased picture accuracy and contrast\n" +
                "V-Gaming Engine: Automatically makes the latest Xbox One and PlayStation gameplay more responsive with Auto Game Mode and the V-Series lowest input lag.\n"))

        productsList.add(Product("Epson WF-2750",433.33,"Black",R.drawable.p4,4,"This printer is designed for use with Epson cartridges only, not third party cartridges or ink; Cartridges described as Compatible, Remanufactured, refilled or refillable may not work properly or at all; See product description for more details"))

        return productsList
    }
}

}