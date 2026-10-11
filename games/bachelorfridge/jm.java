/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jm extends bw {
    static StringBuilder field_g;
    static String[] field_k;
    static String field_l;
    int field_j;
    static String field_h;
    static kv[] field_f;
    static lna field_i;

    public static void c(byte param0) {
        field_k = null;
        field_f = null;
        field_h = null;
        int var1 = -120 / ((47 - param0) / 40);
        field_l = null;
        field_g = null;
        field_i = null;
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int stackIn_19_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_28_0 = 0;
        boolean stackIn_29_1 = false;
        if (gs.field_f != null) {
          gs.field_f.a(2, 0, param0);
        }
        if (dj.field_c != null) {
          dj.field_c.b(78, param0);
        }
        if (!param1) {
          jm.a((byte) 31, 92);
        }
        if (null != sna.field_fb) {
          sna.field_fb.b(106, param0);
        }
        if (vla.field_w &&
          sia.field_h) {
          if (vs.field_d) {
            stackIn_19_0 = (lna.field_q) ? 1 : 0;
          } else {
            stackIn_19_0 = 0;
          }
          var2 = stackIn_19_0;
          stackIn_24_0 = (param0) && (aja.e(11)) && (var2 == 0);
          ji.a(stackIn_24_0, 76);
          if (var2 != 0) {
            stackIn_28_0 = 0;
            stackIn_29_1 = (param0) && (aja.e(11));
            av.a(stackIn_28_0, stackIn_29_1);
          }
        }
    }

    final static String a(byte param0, String param1, char param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = BachelorFridge.field_y;
        try {
          var4_int = param1.length();
          var5 = param3.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param1.indexOf((int) param2, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          if (param0 != 75) {
            field_i = (lna) null;
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param1.indexOf((int) param2, var9);
            if (var10 < 0) {
              discarded$0 = var8.append(param1.substring(var9));
              stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            discarded$1 = var8.append(param1.substring(var9, var10));
            discarded$2 = var8.append(param3);
            var9 = var10 + 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("jm.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(lu param0, byte param1) {
        try {
          param0.d(this.field_j, 0);
          if (param1 != -63) {
            field_f = (kv[]) null;
          }
          this.b(param0, (byte) 87);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jm.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(lu param0, byte param1) {
        try {
          int var3_int = -10 / ((37 - param1) / 38);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    jm() {
    }

    abstract void a(boolean param0, op param1);

    final static String a(byte param0, int param1) {
        if (param0 > -15) {
          field_l = (String) null;
        }
        return 1 + param1 + "/6";
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int var7 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          var6_int = -param5 + param0;
          if (param1 > -46) {
            field_l = (String) null;
          }
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param3.charAt(param5 + var7);
              if ((0 >= var8 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[var7 + param2] = (byte)-128;
                    break;
                  case 8218:
                    param4[param2 + var7] = (byte)-126;
                    break;
                  case 402:
                    param4[var7 + param2] = (byte)-125;
                    break;
                  case 8222:
                    param4[param2 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param4[var7 + param2] = (byte)-123;
                    break;
                  case 8224:
                    param4[var7 + param2] = (byte)-122;
                    break;
                  case 8225:
                    param4[var7 + param2] = (byte)-121;
                    break;
                  case 710:
                    param4[var7 + param2] = (byte)-120;
                    break;
                  case 8240:
                    param4[param2 + var7] = (byte)-119;
                    break;
                  case 352:
                    param4[param2 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param4[var7 + param2] = (byte)-117;
                    break;
                  case 338:
                    param4[var7 + param2] = (byte)-116;
                    break;
                  case 381:
                    param4[param2 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param4[var7 + param2] = (byte)-111;
                    break;
                  case 8217:
                    param4[var7 + param2] = (byte)-110;
                    break;
                  case 8220:
                    param4[param2 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param4[param2 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param4[var7 + param2] = (byte)-107;
                    break;
                  case 8211:
                    param4[param2 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param4[param2 + var7] = (byte)-105;
                    break;
                  case 732:
                    param4[var7 + param2] = (byte)-104;
                    break;
                  case 8482:
                    param4[var7 + param2] = (byte)-103;
                    break;
                  case 353:
                    param4[var7 + param2] = (byte)-102;
                    break;
                  case 8250:
                    param4[param2 + var7] = (byte)-101;
                    break;
                  case 339:
                    param4[var7 + param2] = (byte)-100;
                    break;
                  case 382:
                    param4[var7 + param2] = (byte)-98;
                    break;
                  case 376:
                    param4[param2 + var7] = (byte)-97;
                    break;
                  default:
                    param4[var7 + param2] = (byte)63;
                    break;
                }
              } else {
                param4[var7 + param2] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("jm.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(')').toString());
        }
    }

    void a(ub param0, int param1) {
        try {
          if (param1 > -2) {
            field_i = (lna) null;
          }
          this.a(false, param0.field_o.field_h);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Please try changing the following settings:  ";
        field_k = new String[]{"Attempting to Identify Mystery Meat", "Calculating Chunk Density", "Tenderising Roast Beef", "Smoking Kippers for Breakfast", "Toasting Hot Cross Buns", "Nerfing Tofu", "Reticulating Slimes", "Awaiting Pizza Delivery", "Distributing Gas Masks", "Searching for Cutlery", "Attempting to Force Lid", "Recharging Energy Drink", "Discarding Fish Heads", "Wrestling with Shellfish", "Compiling Grocery List", "Retrieving Last Year's Data", "Pondering Purpose of Trainer", "Lying about Cake", "Fetching Filth", "P-P-P-Picking up Packets", "Decoding Sell-By Date", "Corrupting Vegetables", "Saving up Sporx", "Shaking Cola Bottles", "Cutting off Mouldy Bits", "Prepping Flies for Launch", "Crying over Spilt Milk", "Churning Memory (into Butter)", "Cerealizing Objects", "Loading Haggis. Reluctantly", "Going to Brussels for Sprouts"};
        field_h = "Most objects in the fridge can be used by clicking or dragging. Mouse over objects to see what they are, when you're done click here to continue. <br><col=BBFF00> Next</col>";
        field_g = new StringBuilder(80);
    }
}
