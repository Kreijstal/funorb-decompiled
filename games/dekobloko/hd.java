/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends bh {
    static String field_t;
    static String field_o;
    static String field_v;
    static String field_p;
    static int field_s;
    static w field_q;
    static int field_u;
    static c field_r;
    static int field_n;

    private hd() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1, ve param2, String param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        try {
          L0: {
            L1: {
              sl.a((String) null, (int[]) null, (byte) 105, gf.field_c, param2, (String) null, 0L, -1, param2.e(-88));
              if (!param2.field_lc) {
                break L1;
              } else {
                L2: {
                  if (2 == param2.field_qc) {
                    break L2;
                  } else {
                    if (te.field_p >= 2) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var7 = w.field_H;
                var8 = cm.a((byte) 86, ec.field_a, new String[]{param3});
                var7.field_h.a(var8, 10, 126);
                break L1;
              }
            }
            L3: {
              w.field_H.b(-119);
              if (!param1) {
                break L3;
              } else {
                if (w.field_H.field_f != ta.field_b) {
                  var11 = w.field_H;
                  var12 = cm.a((byte) 86, sb.field_p, new String[]{param3});
                  var11.field_h.a(var12, 15, param0 ^ 91);
                  break L3;
                } else {
                  var9 = w.field_H;
                  var10 = cm.a((byte) 94, fb.field_d, new String[]{param3});
                  var9.field_h.a(var10, 16, param0 + 87);
                  break L3;
                }
              }
            }
            var13 = w.field_H;
            var5 = he.field_S;
            var6 = nf.field_h;
            var13.field_h.b(var6, var5, 123, param0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("hd.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 22771) {
          field_u = -48;
          field_o = null;
          field_q = null;
          field_v = null;
          field_p = null;
          field_t = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_q = null;
          field_v = null;
          field_p = null;
          field_t = null;
          field_r = null;
          return;
        }
    }

    static {
        field_o = "Won";
        field_t = "Don't mind";
        field_p = "Similar rating";
        field_v = "Real-life threats";
    }
}
