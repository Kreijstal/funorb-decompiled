/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends br {
    int field_m;
    int field_v;
    static String field_g;
    int field_i;
    int field_E;
    static boolean[][] field_k;
    int field_t;
    static ja field_j;
    static int[] field_n;
    int field_o;
    uj field_C;
    int field_B;
    nj field_h;
    int field_l;
    po field_x;
    int field_D;
    int field_A;
    int field_p;
    int field_q;
    int field_w;
    static String field_u;
    int field_y;
    jd field_f;
    int field_r;
    int field_s;
    int field_z;

    final static int a(fm param0, boolean param1, String param2, String[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
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
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param2);
              if (var5_int > param4) {
                break L1;
              } else {
                if ((param2.indexOf("<br>") ^ -1) == 0) {
                  param3[0] = param2;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (param4 + (var5_int + -1)) / param4;
            param4 = var5_int / var6;
            if (!param1) {
              var6 = 0;
              var7 = 0;
              var8 = param2.length();
              var9 = 0;
              L2: while (true) {
                if (var9 >= var8) {
                  L3: {
                    if (var8 > var7) {
                      incrementValue$0 = var6;
                      var6++;
                      param3[incrementValue$0] = param2.substring(var7, var8).trim();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackIn_27_0 = var6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param2.charAt(var9);
                      if (-33 == (var10 ^ -1)) {
                        break L5;
                      } else {
                        if (var10 != 45) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = param2.substring(var7, 1 + var9).trim();
                    var12 = param0.a(var11);
                    if (var12 < param4) {
                      break L4;
                    } else {
                      var7 = 1 + var9;
                      incrementValue$1 = var6;
                      var6++;
                      param3[incrementValue$1] = var11;
                      break L4;
                    }
                  }
                  if (var10 == 62) {
                    if (param2.regionMatches(var9 + -3, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param3[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
                      var7 = var9 - -1;
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_8_0 = 66;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("mb.A(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_27_0;
          }
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -31) {
            return -96;
        }
        int var2 = 0;
        if (param1 < 0 || (param1 ^ -1) <= -65537) {
            var2 += 16;
            param1 = param1 >>> 16;
        }
        if (!((param1 ^ -1) > -257)) {
            param1 = param1 >>> 8;
            var2 += 8;
        }
        if (param1 >= 16) {
            param1 = param1 >>> 4;
            var2 += 4;
        }
        if (4 <= param1) {
            var2 += 2;
            param1 = param1 >>> 2;
        }
        if (1 <= param1) {
            var2++;
            param1 = param1 >>> 1;
        }
        return var2 - -param1;
    }

    final void a(byte param0) {
        this.field_x = null;
        if (param0 != 71) {
            this.field_l = -91;
        }
        this.field_f = null;
        this.field_h = null;
        this.field_C = null;
    }

    public static void b(boolean param0) {
        field_n = null;
        if (param0) {
            field_j = (ja) null;
        }
        field_k = (boolean[][]) null;
        field_j = null;
        field_g = null;
        field_u = null;
    }

    mb() {
    }

    static {
        field_g = "Please log in to access this feature.";
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_u = "The following settings need to be changed:  ";
    }
}
