/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;
    static boolean field_c;
    static String field_b;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 14) {
          param2 = qe.a((byte) 36, '_', param2, "");
          var3 = pc.a(param2, 0);
          if (0 == param1.indexOf(param2)) {
            if (0 != param1.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_a = null;
          param2 = qe.a((byte) 36, '_', param2, "");
          var3 = pc.a(param2, 0);
          if (0 != param1.indexOf(param2)) {
            return true;
          } else {
            L0: {
              if (0 == param1.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(boolean param0, byte param1, mg param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        pj.field_r[0] = og.field_w.nextInt();
        pj.field_r[1] = og.field_w.nextInt();
        pj.field_r[2] = (int)(md.field_m >> 787276256);
        pj.field_r[3] = (int)md.field_m;
        sp.field_c.field_f = 0;
        sp.field_c.a(pj.field_r[0], -16384);
        sp.field_c.a(pj.field_r[1], -16384);
        sp.field_c.a(pj.field_r[2], param1 + -16459);
        sp.field_c.a(pj.field_r[3], -16384);
        lo.a(param1 + -51, sp.field_c);
        sp.field_c.c(-161478600, param3);
        param2.a(sp.field_c, (byte) 124);
        tp.field_f.field_f = 0;
        if (!param0) {
          L0: {
            tp.field_f.a(true, 16);
            tp.field_f.field_f = tp.field_f.field_f + 2;
            var5 = tp.field_f.field_f;
            tp.field_f.a(tb.field_g, -16384);
            tp.field_f.b(vb.field_m, (byte) 13);
            var6 = 0;
            if (!fj.field_d) {
              break L0;
            } else {
              var6 = var6 | 1;
              break L0;
            }
          }
          L1: {
            if (ag.field_b) {
              var6 = var6 | 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param4) {
              break L2;
            } else {
              var6 = var6 | 8;
              break L2;
            }
          }
          L3: {
            if (ld.field_r == null) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          tp.field_f.a(true, var6);
          var7 = mf.a(le.b((byte) -20), -28697);
          if (param1 == 75) {
            L4: {
              if (var7 == null) {
                var7 = "";
                break L4;
              } else {
                break L4;
              }
            }
            tp.field_f.b(var7, (byte) -23);
            if (null != ld.field_r) {
              tp.field_f.a(ld.field_r, (byte) -117);
              tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -107, lm.field_j);
              tp.field_f.b(977272835, -var5 + tp.field_f.field_f);
              ak.a(-1, (byte) -48);
              return;
            } else {
              tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -107, lm.field_j);
              tp.field_f.b(977272835, -var5 + tp.field_f.field_f);
              ak.a(-1, (byte) -48);
              return;
            }
          } else {
            L5: {
              field_a = null;
              if (var7 == null) {
                var7 = "";
                break L5;
              } else {
                break L5;
              }
            }
            tp.field_f.b(var7, (byte) -23);
            if (null == ld.field_r) {
              tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -107, lm.field_j);
              tp.field_f.b(977272835, -var5 + tp.field_f.field_f);
              ak.a(-1, (byte) -48);
              return;
            } else {
              tp.field_f.a(ld.field_r, (byte) -117);
              tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -107, lm.field_j);
              tp.field_f.b(977272835, -var5 + tp.field_f.field_f);
              ak.a(-1, (byte) -48);
              return;
            }
          }
        } else {
          L6: {
            tp.field_f.a(true, 18);
            tp.field_f.field_f = tp.field_f.field_f + 2;
            var5 = tp.field_f.field_f;
            tp.field_f.a(tb.field_g, -16384);
            tp.field_f.b(vb.field_m, (byte) 13);
            var6 = 0;
            if (!fj.field_d) {
              break L6;
            } else {
              var6 = var6 | 1;
              break L6;
            }
          }
          L7: {
            if (ag.field_b) {
              var6 = var6 | 4;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (!param4) {
              break L8;
            } else {
              var6 = var6 | 8;
              break L8;
            }
          }
          L9: {
            if (ld.field_r == null) {
              break L9;
            } else {
              var6 = var6 | 16;
              break L9;
            }
          }
          tp.field_f.a(true, var6);
          var7 = mf.a(le.b((byte) -20), -28697);
          if (param1 != 75) {
            L10: {
              field_a = null;
              if (var7 == null) {
                var7 = "";
                break L10;
              } else {
                break L10;
              }
            }
            tp.field_f.b(var7, (byte) -23);
            if (null == ld.field_r) {
              tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -107, lm.field_j);
              tp.field_f.b(977272835, -var5 + tp.field_f.field_f);
              ak.a(-1, (byte) -48);
              return;
            } else {
              tp.field_f.a(ld.field_r, (byte) -117);
              tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -107, lm.field_j);
              tp.field_f.b(977272835, -var5 + tp.field_f.field_f);
              ak.a(-1, (byte) -48);
              return;
            }
          } else {
            L11: {
              if (var7 == null) {
                var7 = "";
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              tp.field_f.b(var7, (byte) -23);
              if (null == ld.field_r) {
                break L12;
              } else {
                tp.field_f.a(ld.field_r, (byte) -117);
                break L12;
              }
            }
            tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -107, lm.field_j);
            tp.field_f.b(977272835, -var5 + tp.field_f.field_f);
            ak.a(-1, (byte) -48);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -6) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Last Spider";
        field_a = "Type your age in years";
    }
}
