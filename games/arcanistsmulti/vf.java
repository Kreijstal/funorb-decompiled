/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vf extends pg {
    static so field_g;
    byte[] field_t;
    static ed field_k;
    static ec field_s;
    static kc field_i;
    static int field_m;
    static String field_p;
    static int field_o;
    static int field_q;
    static int field_r;
    static int[] field_n;
    static kc field_u;
    static int field_l;
    static int[] field_v;
    static String field_h;
    static String field_j;

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        String stackOut_20_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_16_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param2 == 3) {
              stackOut_2_0 = fm.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (6 != param2) {
                if (param2 == 7) {
                  stackOut_9_0 = mm.field_v;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (param2 == 8) {
                    stackOut_13_0 = mf.field_f;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (param2 != 9) {
                      if (10 == param2) {
                        stackOut_20_0 = oj.field_c;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (11 == param2) {
                          stackOut_24_0 = wd.field_f;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (param2 == 14) {
                            stackOut_28_0 = tj.a(-17, new String[1], ji.field_k);
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      stackOut_16_0 = v.field_n;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = rf.field_k;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("vf.B(").append(-111).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ')');
        }
        return stackIn_29_0;
    }

    final static cg a(long param0) {
        return (cg) (Object) kn.field_qb.a(param0, (byte) -121);
    }

    public static void a() {
        field_i = null;
        field_h = null;
        field_p = null;
        field_u = null;
        field_n = null;
        field_s = null;
        field_j = null;
        field_g = null;
        field_v = null;
        field_k = null;
    }

    vf(byte[] param0) {
        try {
            ((vf) this).field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new so(1);
        field_p = "Press '<col=ffffff><%0></col>' or '<col=ffffff><%1></col>' to cycle through your minions or to centre on your Arcanist.<br>  Use the '<col=ffffff>Arrow keys</col>' to scroll around the map.";
        int discarded$0 = 50;
        int discarded$1 = 100;
        km.a();
        field_v = new int[8192];
        field_h = "Spellbook not acquired";
    }
}
