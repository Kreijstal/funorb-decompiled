/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static java.applet.Applet field_b;
    private static qk field_a;

    public static void a(byte param0) {
        if (param0 != -127) {
            field_b = null;
        }
        field_a = null;
        field_b = null;
    }

    final static cn a(String param0, nh param1, String param2, byte param3) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (!(param1.b(param2, param0, (byte) -82))) {
            param2 = param2 + ".jpg";
        }
        cn var7 = new cn(param1.a(param0, param2, (byte) -127), (java.awt.Component) (Object) fi.d(false));
        cn var8 = var7;
        if (param3 != 71) {
            return null;
        }
        for (var5 = 0; var5 < var8.field_B.length; var5++) {
            var8.field_B[var5] = nb.a(var7.field_B[var5], 16777215);
        }
        return var8;
    }

    final static void b(int param0) {
        if (param0 <= 79) {
            field_a = null;
        }
        Object var2 = null;
        gg.a((byte) -103, (String) null, "");
    }

    final static void c(int param0) {
        bh.field_M = false;
        int discarded$5 = ra.field_c.c(true);
        if (param0 != 16777215) {
            field_b = null;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qk var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        qk stackIn_15_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        qk stackOut_14_0 = null;
        qk stackOut_13_0 = null;
        var10 = DungeonAssault.field_K;
        var1 = 108 % ((0 - param0) / 52);
        en.field_c = -(fa.field_i >> 1333739777) + wf.field_C;
        var2 = en.field_c;
        var3 = 0;
        L0: while (true) {
          if (uc.field_K.length <= var3) {
            return;
          } else {
            L1: {
              var4 = dd.field_A[var3];
              if (var4 < 0) {
                var5 = ui.field_b;
                break L1;
              } else {
                if (var4 == h.field_h.field_b) {
                  var5 = il.field_a;
                  break L1;
                } else {
                  var5 = dc.field_l;
                  break L1;
                }
              }
            }
            L2: {
              var6 = uc.field_K[var3];
              stackOut_7_0 = 107;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var4 < 0) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L2;
              }
            }
            L3: {
              var7 = rb.a((byte) stackIn_10_0, stackIn_10_1 != 0, var6);
              var8 = -(var7 >> 189617537) + tm.field_e;
              if (var4 >= 0) {
                L4: {
                  var2 = var2 + lc.field_j;
                  if (var4 != h.field_h.field_b) {
                    stackOut_14_0 = (qk) field_a;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = ug.field_y;
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_15_0;
                  if (var9 != null) {
                    var9.a(var2, cd.field_e - -(i.field_o << 200439425), var7 + (an.field_w << -589920415), 112, var8 - an.field_w);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var2 = var2 + i.field_o;
                break L3;
              } else {
                break L3;
              }
            }
            if (var4 >= 0) {
              mp.field_a.b(var6, var8, vk.field_e + var2, var5, -1);
              var2 = var2 + (cd.field_e + (i.field_o + lc.field_j));
              var3++;
              continue L0;
            } else {
              hc.field_e.b(var6, var8, var2 - -da.field_C, var5, -1);
              var2 = var2 + gb.field_a;
              var3++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
