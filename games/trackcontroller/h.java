/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class h {
    static char[] field_e;
    static String field_a;
    static nj field_c;
    static String[] field_b;
    static long field_d;

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0 != -31279) {
          h.a((byte) -80, 8);
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract void a(java.awt.Component param0, int param1);

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        if (param0 > -22) {
          h.b(109);
          var3 = fb.field_a;
          if (5 > var3) {
            var2 = var3 * (var3 * 8192) / 1100;
          } else {
            if (105 <= var3) {
              if (120 > var3) {
                var3 = -var3 + 120;
                var2 = 8192 - var3 * var3 * 8192 / 3300;
              }
            } else {
              var2 = (-40960 + var3 * 16384) / 220;
            }
          }
          var4 = 1;
          var5 = 0;
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (5 == param1) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (param1 == 8) {
              var4 = -1;
              var5 = -1;
            }
          }
          if (11 == param1) {
            var4 = -1;
          }
          if (param1 == 12) {
            var4 = -1;
            var5 = -1;
          }
          if (param1 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 14) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 15) {
            var5 = 1;
            var4 = 1;
          }
          ba.field_a = te.a(var5 * var2, 0, var2 * var4);
          return;
        }
        var3Lifetime1 = fb.field_a;
        if (5 > var3Lifetime1) {
          var2 = var3Lifetime1 * (var3Lifetime1 * 8192) / 1100;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (5 == param1) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param1 == 6) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param1 == 7 ||
            param1 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
        } else {
          if (105 > var3Lifetime1) {
            var2 = (-40960 + var3Lifetime1 * 16384) / 220;
            var4Lifetime1 = 1;
            var5Lifetime1 = 0;
            if (param1 == 3) {
              var4Lifetime1 = -1;
            }
            if (param1 == 1) {
              var5Lifetime1 = 1;
            }
            if (param1 == 4) {
              var5Lifetime1 = 1;
              var4Lifetime1 = 1;
            }
            if (5 == param1) {
              var4Lifetime1 = -1;
              var5Lifetime1 = 1;
            }
            if (param1 == 6) {
              var4Lifetime1 = 1;
              var5Lifetime1 = -1;
            }
            if (param1 == 7) {
              var4Lifetime1 = -1;
              var5Lifetime1 = -1;
            } else {
              if (param1 == 8) {
                var4Lifetime1 = -1;
                var5Lifetime1 = -1;
              }
            }
          } else {
            if (120 <= var3Lifetime1) {
              var4Lifetime1 = 1;
              var5Lifetime1 = 0;
              if (param1 == 3) {
                var4Lifetime1 = -1;
              }
              if (param1 == 1) {
                var5Lifetime1 = 1;
              }
              if (param1 == 4) {
                var5Lifetime1 = 1;
                var4Lifetime1 = 1;
              }
              if (5 == param1) {
                var4Lifetime1 = -1;
                var5Lifetime1 = 1;
              }
              if (param1 == 6) {
                var4Lifetime1 = 1;
                var5Lifetime1 = -1;
              }
              if (param1 == 7 ||
                param1 == 8) {
                var4Lifetime1 = -1;
                var5Lifetime1 = -1;
              }
              if (11 == param1) {
                var4Lifetime1 = -1;
              }
              if (param1 == 12) {
                var4Lifetime1 = -1;
                var5Lifetime1 = -1;
              }
              if (param1 == 13) {
                var4Lifetime1 = 1;
                var5Lifetime1 = -1;
              }
              if (param1 == 14) {
                var4Lifetime1 = -1;
                var5Lifetime1 = 1;
              }
              if (param1 == 15) {
                var5Lifetime1 = 1;
                var4Lifetime1 = 1;
              }
              ba.field_a = te.a(var5Lifetime1 * var2, 0, var2 * var4Lifetime1);
              return;
            }
            var3Lifetime1 = -var3Lifetime1 + 120;
            var2 = 8192 - var3Lifetime1 * var3Lifetime1 * 8192 / 3300;
            var4Lifetime1 = 1;
            var5Lifetime1 = 0;
            if (param1 == 3) {
              var4Lifetime1 = -1;
            }
            if (param1 == 1) {
              var5Lifetime1 = 1;
            }
            if (param1 == 4) {
              var5Lifetime1 = 1;
              var4Lifetime1 = 1;
            }
            if (5 == param1) {
              var4Lifetime1 = -1;
              var5Lifetime1 = 1;
            }
            if (param1 == 6) {
              var4Lifetime1 = 1;
              var5Lifetime1 = -1;
            }
            if (param1 == 7 ||
              param1 == 8) {
              var4Lifetime1 = -1;
              var5Lifetime1 = -1;
            }
          }
        }
        if (11 == param1) {
          var4Lifetime1 = -1;
        }
        if (param1 == 12) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (param1 == 13) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param1 == 14) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param1 == 15) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        ba.field_a = te.a(var5Lifetime1 * var2, 0, var2 * var4Lifetime1);
        return;
    }

    abstract int a(int param0);

    final static int a(byte param0, oh param1, int param2, String param3, String[] param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = param1.a(param3);
          if (param2 >= var5_int &&
            param3.indexOf("<br>") == -1) {
            param4[0] = param3;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (-1 + (var5_int + param2)) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param3.length();
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param3.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param3.substring(var7, var9 + 1).trim();
              var12 = param1.a(var11);
              if (var12 >= param2) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param4[incrementValue$2] = param3.substring(var7, var9 - 3).trim();
              var7 = var9 + 1;
            }
          }
          if (param0 != -8) {
            field_c = (nj) null;
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$0] = param3.substring(var7, var8).trim();
          }
          stackIn_24_0 = var6Lifetime1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("h.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_a = "This password contains your email address, and would be easy to guess";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
