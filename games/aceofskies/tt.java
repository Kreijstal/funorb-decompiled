/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static String[][] field_d;
    static String field_b;
    static vd[] field_c;
    static boolean field_a;

    public static void a(int param0) {
        if (param0 != 20525) {
            return;
        }
        field_d = (String[][]) null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        wf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ds var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2048) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var4 = (ds) ((Object) cl.field_eb.d(268435455));
            L2: while (true) {
              if (var4 == null) {
                var2 = ep.field_z.d(268435455);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    hn.a(0, param0);
                    var2 = ep.field_z.b((byte) 103);
                    continue L3;
                  }
                }
              } else {
                nn.a(var4, param0, (byte) 62);
                var4 = (ds) ((Object) cl.field_eb.b((byte) 103));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "tt.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        if (null != jf.field_a) {
          pg.a(jf.field_a, param0 ^ -32631);
          jf.field_a.a((byte) 87, pt.field_b);
          jf.field_a = null;
          if (null == aj.field_s) {
            if (param0 != -32546) {
              field_c = (vd[]) null;
              ci.field_f.requestFocus();
              return;
            } else {
              ci.field_f.requestFocus();
              return;
            }
          } else {
            aj.field_s.c(1);
            if (param0 == -32546) {
              ci.field_f.requestFocus();
              return;
            } else {
              field_c = (vd[]) null;
              ci.field_f.requestFocus();
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param1) {
          L0: {
            field_d = (String[][]) null;
            if (0 == (param0 & 2048)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == (param0 & 2048)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_d = new String[][]{new String[]{"single_shot1", "single_shot2", "single_shot3", "single_shot4", "single_shot5"}, new String[]{"double_shot1", "double_shot2", "double_shot3", "double_shot4", "double_shot5"}, new String[]{"spreader_shot1", "spreader_shot2"}, new String[]{"gattling_loop1", "gattling_loop2", "gattling_loop3", "gattling_loop4"}, new String[]{"ufo_shot1", "ufo_shot2", "ufo_shot3", "ufo_shot4"}};
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = false;
    }
}
