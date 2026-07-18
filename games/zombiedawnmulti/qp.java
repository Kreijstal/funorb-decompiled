/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qp extends un {
    private pm field_q;
    static byte[][] field_t;
    static ja field_v;
    static String[] field_s;
    static String field_r;
    static ja[] field_u;
    static ef field_w;

    public static void h(int param0) {
        field_s = null;
        field_r = null;
        field_u = null;
        field_t = null;
        field_w = null;
        field_v = null;
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        if (!(oo.field_b < param0 - -param2)) {
            return param0;
        }
        int var4 = -6 % ((-7 - param1) / 32);
        if (!(-param2 + (param3 + param0) < 0)) {
            return -param2 + param0 - -param3;
        }
        return oo.field_b - param2;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4) {
        ja[] var5 = null;
        ja[] var6 = null;
        var6 = new ja[9];
        var5 = var6;
        ja dupTemp$4 = k.a(-109, param1, param3);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        ja dupTemp$5 = k.a(-125, param1, param4);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param0 == 0) {
          if (param2 > -55) {
            return null;
          } else {
            return var5;
          }
        } else {
          var6[4] = k.a(-124, 64, param0);
          if (param2 > -55) {
            return null;
          } else {
            return var5;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        ec.a(true, param1, -105);
    }

    final re a(boolean param0, String param1) {
        j var3 = null;
        RuntimeException var3_ref = null;
        re stackIn_6_0 = null;
        re stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        re stackOut_5_0 = null;
        re stackOut_9_0 = null;
        re stackOut_8_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            L2: {
              if (!(((qp) this).field_q instanceof kh)) {
                break L2;
              } else {
                var3 = ((kh) (Object) ((qp) this).field_q).a((byte) 101);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.d(49) == db.field_b) {
                    break L2;
                  } else {
                    stackOut_5_0 = jq.field_b;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
            }
            L3: {
              if (param1.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                stackOut_9_0 = db.field_b;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = jq.field_b;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("qp.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    qp(pm param0, pm param1) {
        super(param0);
        try {
            ((qp) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, int param1) {
        j var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!(((qp) this).field_q instanceof kh)) {
                break L1;
              } else {
                var3 = ((kh) (Object) ((qp) this).field_q).a((byte) 85);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.d(125) != db.field_b) {
                      break L2;
                    } else {
                      if (param0.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                        break L2;
                      } else {
                        stackOut_4_0 = de.field_d;
                        stackIn_5_0 = stackOut_4_0;
                        return stackIn_5_0;
                      }
                    }
                  }
                  stackOut_6_0 = var3.c(-122);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            if (!param0.equals((Object) (Object) ((qp) this).field_q.field_j)) {
              stackOut_10_0 = de.field_d;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              if (param1 != -1276425040) {
                ja[] discarded$2 = qp.a(-118, 127, -62, 52, -38);
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("qp.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return (String) (Object) stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Tech Master";
    }
}
