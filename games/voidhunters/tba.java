/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tba extends rqa {
    static int field_o;
    static int field_p;
    static asb field_q;

    tba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 != -114) {
            tba.e((byte) 98);
            ela.field_o = param0;
            gi.field_b = param2;
            return;
        }
        ela.field_o = param0;
        gi.field_b = param2;
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            if (mn.a(var6, (byte) -121)) {
              if (qja.a((byte) -75, param1)) {
                stackIn_6_0 = oja.field_o;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-3 != (iwa.field_b ^ -1)) {
                  stackIn_10_0 = ma.field_o;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (ltb.a((byte) -94, param1)) {
                    stackIn_14_0 = isa.a(vjb.field_c, new String[]{param1}, 100);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-101 < (mq.field_k ^ -1)) {
                      if (uaa.a(param1, (byte) -93)) {
                        stackIn_21_0 = isa.a(ceb.field_r, new String[]{param1}, 76);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var5 = dpa.field_p;
                        var5.h(param0 ^ 24333, param2);
                        var5.field_e = var5.field_e + 1;
                        var4 = var5.field_e;
                        var5.c(0, param0);
                        var5.a(true, param1);
                        var5.e(var5.field_e + -var4, -129);
                        stackIn_23_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = am.field_o;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = tjb.field_Cb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("tba.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L1;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    return (String) ((Object) stackIn_23_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 >= -79) {
            tba.a(23, (byte) -112, 66);
        }
    }

    final static Boolean a(int param0) {
        int var1 = 118 % ((param0 - 12) / 55);
        Boolean var2 = ehb.field_f;
        ehb.field_f = null;
        return var2;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_p = -35;
                break L1;
              }
            }
            si.a(191, 62, param0[0].a(85));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("tba.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
