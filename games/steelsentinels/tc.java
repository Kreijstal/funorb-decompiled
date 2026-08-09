/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends ck {
    static String field_s;
    static int[] field_B;
    int field_t;
    int field_w;
    static int[] field_A;
    int field_u;
    static String field_v;
    int[] field_q;
    int field_o;
    static String field_r;
    int field_p;
    int field_C;
    static int field_x;
    long field_D;
    int field_y;
    static int field_z;

    public static void a(boolean param0) {
        field_A = null;
        field_r = null;
        if (param0) {
          tc.a(59, -75);
          field_s = null;
          field_B = null;
          field_v = null;
          return;
        } else {
          field_s = null;
          field_B = null;
          field_v = null;
          return;
        }
    }

    final static gh d(int param0) {
        if (param0 != 800) {
            return (gh) null;
        }
        return eh.a(false);
    }

    final static db a(String param0, int param1, int param2) {
        r var3 = null;
        RuntimeException var3_ref = null;
        r stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 22137) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            var3 = new r();
            ((db) ((Object) var3)).field_e = param0;
            ((db) ((Object) var3)).field_c = param1;
            stackIn_3_0 = (r) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("tc.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (db) ((Object) stackIn_3_0);
    }

    final static void a(int param0, int param1) {
        kj var2;
        if (param0 != 87) {
          field_r = (String) null;
          var2 = mm.field_g;
          var2.a(param1, (byte) -117);
          var2.a((byte) 124, 1);
          var2.a((byte) 112, 0);
          return;
        } else {
          var2 = mm.field_g;
          var2.a(param1, (byte) -117);
          var2.a((byte) 124, 1);
          var2.a((byte) 112, 0);
          return;
        }
    }

    final static int a(int param0, mi param1, int param2, String param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = param1.c(param3);
              if (param0 < var5_int) {
                break L1;
              } else {
                if (param3.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param4[0] = param3;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (param2 == 75) {
                break L2;
              } else {
                field_s = (String) null;
                break L2;
              }
            }
            var6 = (var5_int - -param0 - 1) / param0;
            param0 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param3.length();
            var9 = 0;
            L3: while (true) {
              if (var8 <= var9) {
                L4: {
                  if (var8 > var7) {
                    incrementValue$0 = var6;
                    var6++;
                    param4[incrementValue$0] = param3.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_26_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param3.charAt(var9);
                    if ((var10 ^ -1) == -33) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param3.substring(var7, var9 - -1).trim();
                  var12 = param1.c(var11);
                  if (param0 <= var12) {
                    var7 = var9 + 1;
                    incrementValue$1 = var6;
                    var6++;
                    param4[incrementValue$1] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (62 != var10) {
                    break L7;
                  } else {
                    if (!param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      break L7;
                    } else {
                      incrementValue$2 = var6;
                      var6++;
                      param4[incrementValue$2] = param3.substring(var7, var9 + -3).trim();
                      var7 = var9 + 1;
                      break L7;
                    }
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("tc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_26_0;
        }
    }

    final static void a(byte param0) {
        int var1;
        ag.field_p.h(126);
        if (null == r.field_r) {
          r.field_r = new ki(ag.field_p, ba.field_f);
          ag.field_p.a(r.field_r, 62);
          var1 = -37 % ((param0 - 8) / 39);
          return;
        } else {
          ag.field_p.a(r.field_r, 62);
          var1 = -37 % ((param0 - 8) / 39);
          return;
        }
    }

    final static void a(long param0, byte param1) {
        try {
            try {
                Thread.sleep(param0);
            } catch (InterruptedException interruptedException) {
            }
            if (param1 <= 114) {
                String var4 = (String) null;
                tc.a((String) null, -125, -121);
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    tc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_u = param3;
            this.field_y = param0;
            this.field_w = param5;
            this.field_q = param6;
            this.field_t = param4;
            fieldTemp$0 = od.field_h;
            od.field_h = od.field_h + 1;
            this.field_p = fieldTemp$0 & 65535;
            this.field_o = param1;
            this.field_C = param2;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "tc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = new int[110];
        field_s = " seconds";
        field_A = new int[8192];
        field_B[59] = 200;
        field_B[25] = 25;
        field_B[20] = 75;
        field_B[76] = 600;
        field_B[70] = 500;
        field_B[60] = 400;
        field_B[68] = 500;
        field_B[28] = 75;
        field_B[0] = 500;
        field_B[82] = 600;
        field_B[62] = 750;
        field_B[57] = 400;
        field_B[51] = 200;
        field_B[53] = 300;
        field_B[92] = 5000;
        field_B[43] = 500;
        field_B[45] = 750;
        field_B[49] = 1000;
        field_B[31] = 150;
        field_B[89] = 1000;
        field_B[54] = 400;
        field_B[58] = 250;
        field_B[71] = 500;
        field_B[69] = 1000;
        field_B[32] = 100;
        field_B[35] = 250;
        field_B[46] = 750;
        field_B[44] = 750;
        field_B[48] = 1000;
        field_B[88] = 3000;
        field_B[52] = 1337;
        field_B[24] = 25;
        field_B[1] = 200;
        field_B[85] = 800;
        field_B[81] = 800;
        field_B[18] = 25;
        field_B[83] = 600;
        field_B[33] = 200;
        field_B[73] = 600;
        field_B[47] = 750;
        field_B[3] = 300;
        field_B[86] = 800;
        field_B[23] = 25;
        field_B[91] = 800;
        field_B[34] = 200;
        field_B[26] = 25;
        field_B[21] = 75;
        field_B[63] = 200;
        field_B[87] = 1000;
        field_B[74] = 500;
        field_B[30] = 100;
        field_B[37] = 100;
        field_B[38] = 200;
        field_B[56] = 400;
        field_B[50] = 1000;
        field_B[80] = 800;
        field_B[64] = 500;
        field_B[27] = 75;
        field_B[78] = 500;
        field_B[90] = 1000;
        field_B[66] = 500;
        field_B[55] = 750;
        field_B[72] = 1000;
        field_B[93] = 2000;
        field_B[17] = 25;
        field_B[75] = 2000;
        field_B[77] = 600;
        field_B[67] = 400;
        field_B[95] = 1000;
        field_B[65] = 750;
        field_B[84] = 2000;
        field_B[79] = 2000;
        field_B[22] = 100;
        field_B[2] = 400;
        field_B[29] = 100;
        field_B[61] = 200;
        field_B[36] = 200;
        field_B[19] = 75;
        field_v = "Disruptive behaviour";
        field_x = 20;
        field_r = "Arm slot";
    }
}
