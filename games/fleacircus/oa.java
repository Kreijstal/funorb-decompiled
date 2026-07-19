/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends lh {
    static String field_o;
    byte[] field_k;
    int field_i;
    static rh field_l;
    static int field_j;
    static int[] field_m;
    static boolean field_n;

    public static void a(byte param0) {
        field_l = null;
        if (param0 >= -67) {
            return;
        }
        field_m = null;
        field_o = null;
    }

    private oa() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        L0: {
          if (-8 != (param0 ^ -1)) {
            break L0;
          } else {
            if (qh.c((byte) 57)) {
              break L0;
            } else {
              if (0 >= wc.field_q) {
                break L0;
              } else {
                param0 = 0;
                break L0;
              }
            }
          }
        }
        if (bc.field_V == param0) {
          return;
        } else {
          pg.field_f = -60;
          bc.field_V = param0;
          af.field_g = 0;
          if (bc.field_V == 0) {
            L1: {
              bj.field_m = bc.field_V;
              k.a(0, td.field_j);
              if ((bc.field_V ^ -1) <= -1) {
                pi.field_b[bc.field_V].a(param1, true);
                break L1;
              } else {
                break L1;
              }
            }
            var3 = -72 % ((param2 - -26) / 39);
            if (-9 != (bc.field_V ^ -1)) {
              return;
            } else {
              vf.e(-6359);
              return;
            }
          } else {
            if (-2 != bc.field_V) {
              L2: {
                if ((bc.field_V ^ -1) <= -1) {
                  pi.field_b[bc.field_V].a(param1, true);
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = -72 % ((param2 - -26) / 39);
              if (-9 != (bc.field_V ^ -1)) {
                return;
              } else {
                vf.e(-6359);
                return;
              }
            } else {
              L3: {
                bj.field_m = bc.field_V;
                k.a(0, td.field_j);
                if ((bc.field_V ^ -1) <= -1) {
                  pi.field_b[bc.field_V].a(param1, true);
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = -72 % ((param2 - -26) / 39);
              if (-9 != (bc.field_V ^ -1)) {
                return;
              } else {
                vf.e(-6359);
                return;
              }
            }
          }
        }
    }

    final static ob a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ob stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = 0;
              if (param1 <= -5) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var2_int <= var3) {
                  break L3;
                } else {
                  var4 = param0.charAt(var3);
                  if (var4 >= 48) {
                    if (57 >= var4) {
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              stackOut_10_0 = je.field_M;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("oa.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    static {
        field_n = false;
        field_m = new int[5];
    }
}
