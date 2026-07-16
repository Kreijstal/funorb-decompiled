/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    ot field_h;
    int field_a;
    int field_e;
    int field_b;
    static int field_f;
    static sm field_g;
    static sr field_k;
    boolean field_j;
    up field_d;
    static String field_l;
    static String field_c;
    static int field_i;

    final static boolean a(int param0, int param1) {
        gn var2 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (param0 > 70) {
          var2 = pn.field_z.g(24009);
          L0: while (true) {
            if (var2 instanceof wh) {
              if (((wh) (Object) var2).a(false) == param1) {
                return true;
              } else {
                var2 = var2.field_d;
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          vs.a(50);
          var2 = pn.field_z.g(24009);
          L1: while (true) {
            if (var2 instanceof wh) {
              if (((wh) (Object) var2).a(false) == param1) {
                return true;
              } else {
                var2 = var2.field_d;
                continue L1;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        L0: {
          if (!param0) {
            on.b();
            on.b();
            on.b();
            break L0;
          } else {
            on.a(0, 0, on.field_g, on.field_f, 0, 192);
            break L0;
          }
        }
        oa.a((byte) -126, param0);
        if (param2 == 39) {
          return;
        } else {
          int discarded$2 = vs.a(115, 82L);
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
          vs.a(-50);
          field_l = null;
          field_c = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_c = null;
          field_k = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, up param3, boolean param4, int param5) {
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gm var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var16 = Kickabout.field_G;
          ((vs) this).field_d.a((byte) -122, param3);
          ((vs) this).field_a = param1;
          ((vs) this).field_b = param5;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((vs) this).field_j = stackIn_3_1 != 0;
          ((vs) this).field_e = param2;
          var17 = new int[]{158, 220, 222, param0};
          var7 = var17;
          var8 = new int[]{1200, 800, 800, 800};
          var9 = ((vs) this).field_e;
          var10 = ((vs) this).field_b;
          var11 = ((vs) this).field_a;
          if (var9 != -1) {
            break L1;
          } else {
            var10 = ((vs) this).field_d.field_l % 14;
            var9 = ((vs) this).field_d.field_e % 7;
            var11 = 31;
            break L1;
          }
        }
        var12 = mg.a(((vs) this).field_d, var9, var10, ((vs) this).field_j, var11, (byte) 108);
        var12.field_mb.a(0, 99);
        iw.a(-81, tm.field_u);
        on.b();
        var12.a(var8[((vs) this).field_d.field_q], 0, on.field_g >> 1542306177, var17[((vs) this).field_d.field_q], (byte) -118);
        ta.e(122);
        eo.a(tm.field_u, ((vs) this).field_h);
        var13 = (((vs) this).field_h.field_v + -2) * ((vs) this).field_h.field_o;
        var14 = -((vs) this).field_h.field_o;
        L2: while (true) {
          if (0 <= var14) {
            var14 = -((vs) this).field_h.field_o;
            L3: while (true) {
              if (0 > var14) {
                var15 = ((vs) this).field_h.field_y[var13];
                int incrementValue$2 = var13;
                var13++;
                ((vs) this).field_h.field_y[incrementValue$2] = hf.a(qj.b(var15, 16777215), qj.b(-1090519040, var15 >>> -1785521694));
                var14++;
                continue L3;
              } else {
                return;
              }
            }
          } else {
            var15 = ((vs) this).field_h.field_y[var13];
            int incrementValue$3 = var13;
            var13++;
            ((vs) this).field_h.field_y[incrementValue$3] = hf.a(qj.b(var15, -33554431) >>> 1419581057, qj.b(var15, 16777215));
            var14++;
            continue L2;
          }
        }
    }

    vs() {
        ((vs) this).field_d = new up();
        ((vs) this).field_h = new ot(38, 46);
    }

    final static void a(String param0, String[] param1, byte param2, int param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var5 = Kickabout.field_G;
        if (param2 >= 76) {
          wk.field_f = cr.field_d;
          if (param3 != 255) {
            if (param3 >= 100) {
              if (105 < param3) {
                kl.field_a = wb.a(-126, param0, param3);
                return;
              } else {
                kl.field_a = wt.a(-111, param1);
                return;
              }
            } else {
              kl.field_a = wb.a(-126, param0, param3);
              return;
            }
          } else {
            L0: {
              if (-14 >= (tn.field_b ^ -1)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            kl.field_a = mf.a(stackIn_6_0 != 0, 124);
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, long param1) {
        if (param0 != -1090519040) {
            vs.a(false, true, (byte) -125);
            return (int)(param1 / 60000L);
        }
        return (int)(param1 / 60000L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_k = (sr) (Object) new rl();
        field_l = "trapping the mouse prevents you from clicking outside the game during a match";
        field_i = 0;
        field_c = "Your request to join has been declined.";
    }
}
