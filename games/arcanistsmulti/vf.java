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
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        String stackOut_22_0 = null;
        String stackOut_26_0 = null;
        String stackOut_30_0 = null;
        String stackOut_18_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
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
                    L1: {
                      if (param0 < -5) {
                        break L1;
                      } else {
                        field_o = -110;
                        break L1;
                      }
                    }
                    if (param2 != 9) {
                      if (10 == param2) {
                        stackOut_22_0 = oj.field_c;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      } else {
                        if (11 == param2) {
                          stackOut_26_0 = wd.field_f;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        } else {
                          if (param2 == 14) {
                            stackOut_30_0 = tj.a(-17, new String[1], ji.field_k);
                            stackIn_31_0 = stackOut_30_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      stackOut_18_0 = v.field_n;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("vf.B(").append(param0).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L2;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param2 + 41);
        }
        return stackIn_31_0;
    }

    final static cg a(long param0, int param1) {
        if (param1 != 8192) {
            field_h = null;
            return (cg) (Object) kn.field_qb.a(param0, (byte) -121);
        }
        return (cg) (Object) kn.field_qb.a(param0, (byte) -121);
    }

    public static void a(int param0) {
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
            throw aa.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new so(1);
        field_p = "Press '<col=ffffff><%0></col>' or '<col=ffffff><%1></col>' to cycle through your minions or to centre on your Arcanist.<br>  Use the '<col=ffffff>Arrow keys</col>' to scroll around the map.";
        km.a(100, 50);
        field_v = new int[8192];
        field_h = "Spellbook not acquired";
    }
}
