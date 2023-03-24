public class Volume { //Fernando
    double value;
    String unit_of_measurement;
//default constructor resulting in 0 meters
        public Volume(){
        value = 0.0;
        unit_of_measurement = "m";
        }

        public Volume (double n, String u) throws Exception{
                value = n;
                unit_of_measurement = u;
                validateunit();
        }

        public static void listUnits() {
                System.out.println("Imperial Units of Volume");
                System.out.println("\"ts\", for Tea Spoon");
                System.out.println("\"tbs\", for Table Spoon");
                System.out.println("\"oz\", for Fluid Ounces");
                System.out.println("\"c\", for Cups");
                System.out.println("\"p\", for Pint");
                System.out.println("\"q\", for Quarts");
                System.out.println("\"g\", for Gallon");
                System.out.println("Metric Units of Distance");
                System.out.println("\"ml\", for Milliliter");
                System.out.println("\"l\", for Liter");
                System.out.println("\"cml\", for Cubic Millimeter");
                System.out.println("\"cc\", for Cubic Centimeter");
                System.out.println("\"cm\", for Cubic Meter");
        }
        //create an exception to throw for invalid unit_of_measurement, create method to validate said unit
        Exception e = new Exception("Invalid unit type error. Use Volume.listUnits() to view valid unit_of_measurement values.");
        //compare unit of measurement value to a list of acceptable values. accommodate some values, throw exception otherwise
        public void validateUnit() throws Exception {
                String[] valid_unit_values = new String[]{ //strings of unit values used in formula methods
                        "ts", "tbs", "oz", "c", "p", "q", "g", "ml", "l", "cml", "cc", "cm"
                };
                String[] near_miss = new String[]{ //strings equal to, but still need to be changed to previous string values
                        "Tea Spoon", "Table Spoon", "Fluid Ounces", "Cups", "Pint", "Quarts",
                        "Gallon", "Milliliter", "Liter", "Cubic Millimeter", "Cubic Centimeter", "Cubic Meter"
                };
                boolean invalid = true; //behavior flag
                for (int i = 0; i < near_miss.length; i++) { //check against non-abbreviated forms, change to valid form if match
                        if (this.unit_of_measurement.equalsIgnoreCase(near_miss[i])) {
                                this.unit_of_measurement = valid_unit_values[i];
                                invalid = false;
                                break;
                        } //check against abbreviated forms, ignoring case. make sure case matches.
                        else if (this.unit_of_measurement.equalsIgnoreCase(valid_unit_values[i])) {
                                this.unit_of_measurement = valid_unit_values[i];
                                invalid = false;
                                break;
                        }
                }

                if (invalid) { //if the input unit does not match, throw special exception
                        throw e;
                }
        }

//create static methods of conversion
       //Tea Spoons (ts) to other measurements
        public static double tstots(double n){return n * 1;}
        public static double tstotbs (double n){return n * .3333333333;}
        public static double tstooz (double n){return n * 0.1666666667;}
        public static double tstoc(double n){return n * 0.0208333333;}
        public static double tstop(double n){return n * 0.0104166667;}
        public static double tstoq(double n){return n * 0.0052083333;}
        public static double tstog(double n){return n * 0.0013020833;}
        public static double tstoml(double n){return n * 4.9289192708;}
        public static double tstol(double n){return n * 0.0049289193;}
        public static double tstocml(double n){return n * 4928.9192708;}
        public static double tstocc(double n){return n * 4.9289192708;}
        public static double tstocm(double n){return n * 0.0000049289;}
        //Table Spoon (tbs) to other measurements
        public static double tbstots(double n){return n * 3;}
        public static double tbstotbs(double n){return n * 1;}
        public static double tbstooz(double n){return n * .5;}
        public static double tbstoc(double n){return n * 0.0625;}
        public static double tbstop(double n){return n * 0.03125;}
        public static double tbstoq(double n){return n * 0.015625;}
        public static double tbstog(double n){return n * 0.00390625;}
        public static double tbstoml(double n){return n * 14.786757812;}
        public static double tbstol(double n){return n * 0.0147867578;}
        public static double tbstocml(double n){return n *14786.757812;}
        public static double tbstocc(double n){return n * 14.786757812;}
        public static double tbstocm(double n){return n * 0.0000147868;}
        //Ounces (oz) to other measurements
        public static double oztots(double n){return n * 6;}
        public static double oztotbs(double n){return n * 2;}
        public static double oztooz(double n){return n * 1;}
        public static double oztoc(double n){return n * 0.125;}
        public static double oztop(double n){return n * 0.0625;}
        public static double oztoq(double n){return n * 0.03125;}
        public static double oztog(double n){return n * 0.0078125;}
        public static double oztoml(double n){return n * 29.573515625;}
        public static double oztol(double n){return n * 0.0295735156;}
        public static double oztocml(double n){return n * 29573.515625;}
        public static double oztocc(double n){return n * 29.573515625;}
        public static double oztocm(double n){return n * 0.0000295735;}
        //Cup (c) to others measurements
        public static double ctots(double n){return n * 48;}
        public static double ctotbs(double n){return n * 16;}
        public static double ctooz(double n){return n * 8;}
        public static double ctoc(double n){return n * 1;}
        public static double ctop(double n){return n * .5;}
        public static double ctoq(double n){return n * .25;}
        public static double ctog(double n){return n * 0.0625;}
        public static double ctoml(double n){return n * 236.588125;}
        public static double ctol(double n){return n * 0.236588125;}
        public static double ctocml(double n){return n * 236588.125;}
        public static double ctocc(double n){return n * 236.588125;}
        public static double ctocm(double n){return n * 0.0002365881;}
        //Pint (p) to others measurements
        public static double ptots(double n){return n * 96;}
        public static double ptotbs(double n){return n * 32;}
        public static double ptooz(double n){return n * 16;}
        public static double ptoc(double n){return n * 2;}
        public static double ptop(double n){return n * 1;}
        public static double ptoq(double n){return n * .5;}
        public static double ptog(double n){return n * .125;}
        public static double ptoml(double n){return n * 473.17625;}
        public static double ptol(double n){return n * 0.47317625;}
        public static double ptocml(double n){return n * 473176.25;}
        public static double ptocc(double n){return n * 473.17625;}
        public static double ptocm(double n){return n * 0.0004731763;}
        //Quart (q) to others measurements
        public static double qtots(double n){return n * 192;}
        public static double qtotbs(double n){return n * 64;}
        public static double qtooz(double n){return n * 32;}
        public static double qtoc(double n){return n * 4;}
        public static double qtop(double n){return n * 2;}
        public static double qtoq(double n){return n * 1;}
        public static double qtog(double n){return n * .25;}
        public static double qtoml(double n){return n * 946.3525;}
        public static double qtol(double n){return n * 0.9463525;}
        public static double qtocml(double n){return n * 946352.5;}
        public static double qtocc(double n){return n * 946.3525;}
        public static double qtocm(double n){return n * 0.0009463525;}
        //Gallon (g) to others measurements
        public static double gtots(double n){return n * 768;}
        public static double gtotbs(double n){return n * 256;}
        public static double gtooz(double n){return n * 128;}
        public static double gtoc(double n){return n * 16;}
        public static double gtop(double n){return n * 8;}
        public static double gtoq(double n){return n * 4;}
        public static double gtog(double n){return n *1;}
        public static double gtoml(double n){return n * 3785.41;}
        public static double gtol(double n){return n * 3.78541;}
        public static double gtocml(double n){return n * 3785410;}
        public static double gtocc(double n){return n * 3785.41;}
        public static double gtocm(double n){return n * 0.00378541;}
        //Milliliters (ml) to others measurements
        public static double mltots(double n){return n * 0.2028842318;}
        public static double mltotbs(double n){return n * 0.0676280773;}
        public static double mltooz(double n){return n * 0.0338140386;}
        public static double mltoc(double n){return n * 0.0042267548;}
        public static double mltop(double n){return n * 0.0021133774;}
        public static double mltoq(double n){return n * 0.0010566887;}
        public static double mltog(double n){return n * 0.0002641722;}
        public static double mltoml(double n){return n * 1;}
        public static double mltol(double n){return n * 0.001;}
        public static double mltocml(double n){return n * 1000;}
        public static double mltocc(double n){return n * 1;}
        public static double mltocm(double n){return n * 0.000001;}
        //Liters (l) to others measurements
        public static double ltots(double n){return n * 202.88423183;}
        public static double ltotbs(double n){return n * 67.628077276;}
        public static double ltooz(double n){return n * 33.814038638;}
        public static double ltoc(double n){return n * 4.2267548297;}
        public static double ltop(double n){return n * 2.1133774149;}
        public static double ltoq(double n){return n * 1.0566887074;}
        public static double ltog(double n){return n * 0.2641721769;}
        public static double ltoml(double n){return n * 1000;}
        public static double ltol(double n){return n * 1;}
        public static double ltocml(double n){return n * 1000000;}
        public static double ltocc(double n){return n * 1000;}
        public static double ltocm(double n){return n * 0.001;}
        //Cubic Millimeters (cml) to others measurements
        public static double cmltots(double n){return n * 0.0002028842;}
        public static double cmltotbs(double n){return n * 0.0000676281;}
        public static double cmltooz(double n){return n * 0.000033814;}
        public static double cmltoc(double n){return n * 0.0000042268;}
        public static double cmltop(double n){return n * 0.0000021134;}
        public static double cmltoq(double n){return n * 0.0000010567;}
        public static double cmltog(double n){return n * 2.641721768;}
        public static double cmltoml(double n){return n * 0.001;}
        public static double cmltol(double n){return n * 0.000001;}
        public static double cmltocml(double n){return n * 1;}
        public static double cmltocc(double n){return n * 0.001;}
        public static double cmltocm(double n){return n * 9;}
        //Cubic Centimeters (cc) to others measurements
        public static double cctots(double n){return n * 0.2028842318;}
        public static double cctotbs(double n){return n * 0.0676280773;}
        public static double cctooz(double n){return n * 0.0338140386;}
        public static double cctoc(double n){return n * 0.0042267548;}
        public static double cctop(double n){return n * 0.0021133774;}
        public static double cctoq(double n){return n * 0.0010566887;}
        public static double cctog(double n){return n * 0.0002641722;}
        public static double cctoml(double n){return n * 1;}
        public static double cctol(double n){return n * 0.001;}
        public static double cctocml(double n){return n * 1000;}
        public static double cctocc(double n){return n * 1;}
        public static double cctocm(double n){return n * 0.000001;}
        //Cubic Meters (cm) to others measurements
        public static double cmtots(double n){return n * 202884.23183;}
        public static double cmtotbs(double n){return n * 67628.077276;}
        public static double cmtooz(double n){return n * 33814.038638;}
        public static double cmtoc(double n){return n * 4226.7548297;}
        public static double cmtop(double n){return n * 2113.3774149;}
        public static double cmtoq(double n){return n * 1056.6887074;}
        public static double cmtog(double n){return n * 264.17217686;}
        public static double cmtoml(double n){return n * 1000000;}
        public static double cmtol(double n){return n * 1000;}
        public static double cmtocml(double n){return n * 1000000000;}
        public static double cmtocc(double n){return n * 1000000;}
        public static double cmtocm(double n){return n * 1;}


        //create non-static conversions, which confirm their own unit type and process accordingly, for every included unit of distance
        public double toTS() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstots(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstots(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztots(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctots(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptots(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtots(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtots(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltots(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltots(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltots(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctots(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtots(this.value);
                                } else System.out.println("This unit of measurement is not recognized.");
                                return -1.0;
                        }

        public double toTBS() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstotbs(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstotbs(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztotbs(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctotbs(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptotbs(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtotbs(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtotbs(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltotbs(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltotbs(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltotbs(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctotbs(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtotbs(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }

        public double toOZ() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstooz(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstooz(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztooz(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctooz(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptooz(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtooz(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtooz(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltooz(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltooz(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltooz(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctooz(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtooz(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }

        public double toC() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstoc(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstoc(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztoc(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctoc(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptoc(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtoc(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtoc(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltoc(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltoc(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltoc(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctoc(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtoc(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }

        public double toP() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstop(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstop(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztop(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctop(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptop(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtop(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtop(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltop(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltop(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltop(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctop(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtop(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }

        public double toQ() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstoq(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstoq(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztoq(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctoq(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptoq(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtoq(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtoq(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltoq(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltoq(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltoq(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctoq(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtoq(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }

        public double toG() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstog(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstog(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztog(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctog(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptog(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtog(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtog(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltog(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltog(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltog(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctog(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtog(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }



        public double toML() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstoml(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstoml(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztoml(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctoml(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptoml(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtoml(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtoml(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltoml(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltoml(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltoml(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctoml(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtoml(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }
        public double toL() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstol(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstol(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztol(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctol(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptol(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtol(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtol(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltol(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltol(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltol(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctol(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtol(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }
        public double toCML() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstocm(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstocm(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztocm(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctocm(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptocm(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtocm(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtocm(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltocm(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltocm(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltocm(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctocm(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtocm(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }
        public double toCC() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstocc(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstocc(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztocc(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctocc(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptocc(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtocc(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtocc(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltocc(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltocc(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltocc(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctocc(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtocc(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }

        public double toCM() {
                if (this.unit_of_measurement.equals("ts")) {
                        return tstocm(this.value);
                } else if (this.unit_of_measurement.equals("tbs")) {
                        return tbstocm(this.value);
                } else if (this.unit_of_measurement.equals("oz")) {
                        return oztocm(this.value);
                } else if (this.unit_of_measurement.equals("c")) {
                        return ctocm(this.value);
                } else if (this.unit_of_measurement.equals("p")) {
                        return ptocm(this.value);
                } else if (this.unit_of_measurement.equals("q")) {
                        return qtocm(this.value);
                } else if (this.unit_of_measurement.equals("g")) {
                        return gtocm(this.value);
                } else if (this.unit_of_measurement.equals("ml")) {
                        return mltocm(this.value);
                } else if (this.unit_of_measurement.equals("l")) {
                        return ltocm(this.value);
                } else if (this.unit_of_measurement.equals("cml")) {
                        return cmltocm(this.value);
                }  else if (this.unit_of_measurement.equals("cc")) {
                        return cctocm(this.value);
                }  else if (this.unit_of_measurement.equals("cm")) {
                        return cmtocm(this.value);
                } else System.out.println("This unit of measurement is not recognized.");
                return 0.0;
        }


}
