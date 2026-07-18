/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static jk field_h;
    int field_d;
    static String[] field_g;
    int field_c;
    static kd field_a;
    static int[] field_f;
    static oh field_b;
    static kd field_e;

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_f = null;
        field_b = null;
    }

    final static void a(ah param0, jb param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        qa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            var3_int = th.field_l;
            ck.field_bb = new hl(0L, (hl) null);
            if (param0 == null) {
              var10 = null;
              fk.a(-96, (Throwable) null, "QC1");
              return;
            } else {
              param0.field_f = false;
              param0.field_d = 0;
              n.field_U = new hj(var3_int, param0, param0);
              eh.field_p = new u(var3_int, param0, param0, (sm) (Object) new vc());
              var4 = wn.a(false);
              if (var4 != null) {
                s.a(-1, var4);
                var12 = null;
                wa.field_a = ec.a(1513239, (jb) null, 5138823, 4020342, (byte) -120, 65793, 65793, 2245737, 1127256, 65793, 8947848, 1513239, 0);
                ec.field_b = ec.a(0, param1, 0, 0, (byte) -120, 0, 0, 0, 0, 0, 0, 0, 16764006);
                hc.field_n = ec.a(0, param1, 0, 0, (byte) -120, 0, 0, 0, 0, 0, 0, 0, 16777215);
                var5 = ra.field_f;
                var6 = ra.field_e;
                var16 = ra.field_b;
                ab.field_R = new oh(10, 14);
                ab.field_R.c();
                var8 = 2;
                L1: while (true) {
                  if (7 <= var8) {
                    ra.a(var16, var5, var6);
                    rh.field_F = gm.a(-122, wa.field_a, var4, hc.field_n, ec.field_b);
                    ck.field_bb.field_fb = new je();
                    break L0;
                  } else {
                    ra.c(var8, 1 + var8, -(var8 << 1) + 14, 16777215);
                    var8++;
                    continue L1;
                  }
                }
              } else {
                var11 = null;
                fk.a(-124, (Throwable) null, "QC2");
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("db.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 122 + ')');
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        hl stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        hl stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        hl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        hl stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        hl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        hl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_9_0 = 0;
        hl stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        hl stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        hl stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        hl stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        hl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        hl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          bk.field_c = ra.field_e;
          cf.field_n = ra.field_f;
          lj.a((byte) -94);
          gg.field_j.a(0, 0, hn.field_P.field_R - 42, 53, hn.field_P.field_Hb);
          uh.field_e.a((byte) -107, uh.field_f.field_Hb, 0, qe.field_d, 0);
          var1 = 2 + qe.field_d;
          stackOut_0_0 = hh.field_c;
          stackOut_0_1 = -116;
          stackOut_0_2 = uh.field_f.field_Hb;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (!kj.field_b) {
            stackOut_2_0 = (hl) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = (hl) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = var1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (hl) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = stackIn_3_2;
          stackOut_3_3 = stackIn_3_3;
          stackOut_3_4 = uh.field_f.field_R;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_5_4 = stackOut_3_4;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          if (!kj.field_b) {
            stackOut_5_0 = (hl) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = stackIn_5_4;
            stackOut_5_5 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            stackIn_6_5 = stackOut_5_5;
            break L1;
          } else {
            stackOut_4_0 = (hl) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = stackIn_4_4;
            stackOut_4_5 = var1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            break L1;
          }
        }
        L2: {
          ((hl) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 - stackIn_6_5, 0);
          g.c(1753);
          gg.field_i.a((byte) -87, hn.field_P.field_Hb, hn.field_P.field_R - 40, 40, 0);
          qn.field_r.a((byte) -123, qe.field_c.field_Hb, 0, 30, 0);
          da.field_f.a((byte) -90, qe.field_c.field_Hb, 30, qe.field_c.field_R - 72, 0);
          v.field_A.a((byte) -85, 68, 5, 30, 5);
          wc.field_D.a((byte) -86, 78, 5, 30, 75);
          jm.field_a.a((byte) -125, 48, 5, 30, 155);
          dh.field_p.a((byte) -121, 48, 5, 30, 205);
          if (!kj.field_b) {
            stackOut_8_0 = 200;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 250;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var2 = stackIn_9_0;
          rj.field_d.a((byte) -107, 363 - var2, 5, 30, var2 + 5);
          rm.field_g.a((byte) -83, qe.field_c.field_Hb - 375, 5, 30, 370);
          ph.field_t.a(da.field_f.field_Hb - 10, ha.field_e, -32 + (da.field_f.field_R - 10), true, 37, 5, 2);
          var3 = (qe.field_c.field_Hb + 2) / 2;
          ei.field_q.a((byte) -116, -2 + var3, qe.field_c.field_R + -40, 40, 0);
          if (!kj.field_b) {
            var3 = 0;
            break L3;
          } else {
            break L3;
          }
        }
        je.field_e.a((byte) -91, qe.field_c.field_Hb - var3, qe.field_c.field_R + -40, 40, var3);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    db(int param0, int param1, int param2, int param3) {
        ((db) this).field_c = param3;
        ((db) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new jk();
    }
}
