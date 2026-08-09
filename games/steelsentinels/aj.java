/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ck {
    int field_o;
    static int[] field_v;
    static cm field_x;
    int field_z;
    int field_t;
    int field_w;
    static wk[] field_r;
    int field_y;
    int[] field_q;
    static int field_u;
    int field_p;
    static int field_s;

    final static boolean a(int[] param0, byte param1, int[] param2, int param3, boolean param4) {
        int[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var17 = null;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            if (49 == param3) {
              L1: {
                L2: {
                  if (!param4) {
                    break L2;
                  } else {
                    if (!ve.a(param0, 1, 25)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var14 = n.field_z;
              var12 = var14;
              var11 = var12;
              var5 = var11;
              var6 = 0;
              L3: while (true) {
                if (var6 >= var14.length) {
                  var5_int = -62 / ((76 - param1) / 47);
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var7 = var14[var6];
                      if (t.a(param2, var7, -20370)) {
                        break L5;
                      } else {
                        if (bj.a(param2, var7, param4, (byte) 86)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var17 = nl.a(var7, (byte) 124);
                    var9 = 0;
                    L6: while (true) {
                      if (var9 >= -8 + var17.length) {
                        break L4;
                      } else {
                        if ((var17[var9] ^ -1) != (param3 ^ -1)) {
                          var9++;
                          continue L6;
                        } else {
                          stackIn_17_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5_ref);

            stackIn_24_1 = new StringBuilder().append("aj.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    public static void d(int param0) {
        field_v = null;
        field_r = null;
        field_x = null;
        if (param0 != -1) {
            field_s = -23;
        }
    }

    final static Boolean a(boolean param0) {
        if (!param0) {
            aj.a(true);
        }
        Boolean var1 = ma.field_bb;
        ma.field_bb = null;
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, byte param7) {
        try {
            this.field_w = param6;
            this.field_z = param2;
            if (param7 > -53) {
                this.field_q = (int[]) null;
            }
            this.field_p = param1;
            this.field_q = param4;
            this.field_o = param3;
            this.field_t = param5;
            this.field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "aj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    aj() {
    }

    static {
        field_v = new int[4];
        field_r = new wk[3];
        field_u = -1;
    }
}
