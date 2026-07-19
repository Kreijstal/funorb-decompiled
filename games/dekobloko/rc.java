/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc implements Runnable {
    volatile en[] field_l;
    volatile boolean field_b;
    volatile boolean field_j;
    fd field_f;
    static vj field_e;
    static int field_a;
    static ui field_d;
    static ji field_k;
    static String field_h;
    static String field_g;
    static sg[] field_c;
    static ud field_i;

    final static int[] a(int[] param0, byte param1, int[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var6 = new int[8];
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (8 <= var4) {
                stackOut_5_0 = (int[]) (var3);
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var6[var4] = lb.a(~param2[var4], param0[var4]);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("rc.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(47).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_k = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_i = null;
    }

    public final void run() {
        int var1_int = 0;
        en var2 = null;
        int var4 = client.field_A ? 1 : 0;
        this.field_b = true;
        try {
            while (!this.field_j) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = this.field_l[var1_int];
                    if (var2 != null) {
                        var2.g();
                    }
                }
                ua.a(10L, -128);
                db.a(-68, (Object) null, this.field_f);
            }
        } catch (Exception exception) {
            String var5 = (String) null;
            qb.a((Throwable) ((Object) exception), 16408, (String) null);
        } finally {
            this.field_b = false;
        }
    }

    final static boolean a(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = rc.a(true);
        }
        return kf.field_Q != null ? true : false;
    }

    final static ke a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        ke var8 = null;
        ke var9 = null;
        ke stackIn_1_0 = null;
        ke stackIn_2_0 = null;
        ke stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ke stackIn_4_0 = null;
        ke stackIn_5_0 = null;
        ke stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ke stackOut_0_0 = null;
        ke stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ke stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        ke stackOut_3_0 = null;
        ke stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ke stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var8 = new ke(2);
          var9 = var8;
          stackOut_0_0 = (ke) (var9);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (ke) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ke) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_s = stackIn_3_1 != 0;
          stackOut_3_0 = (ke) (var9);
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
            stackOut_5_0 = (ke) ((Object) stackIn_5_0);
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (ke) ((Object) stackIn_4_0);
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackIn_6_0.field_j = stackIn_6_1 != 0;
          var9.field_r = true;
          var9.a(new ec(20, qn.field_rb, a.field_t), 115);
          var9.a(new ec(21, lg.field_T, a.field_t), 102);
          var8.field_f[0].field_l = 320 + -(var8.field_f[0].field_n / 2);
          var8.field_f[0].field_m = 150;
          var8.field_f[1].field_m = 250;
          var8.field_f[1].field_l = 320 - var8.field_f[1].field_n / 2;
          var9.a(-1, param4, -129);
          var6 = var8.field_f[0].field_n;
          var7 = var8.field_f[1].field_n;
          if (var6 >= var7) {
            break L2;
          } else {
            var6 = var7;
            break L2;
          }
        }
        L3: {
          var7 = w.field_kb.a(si.field_g);
          if (var7 <= var6) {
            break L3;
          } else {
            var6 = var7;
            break L3;
          }
        }
        L4: {
          var7 = w.field_kb.a(gf.a(-127, param1, param2, true));
          if (var6 < var7) {
            var6 = var7;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var7 = w.field_kb.a(ri.a(0, param1, param2, true));
          if (var7 <= var6) {
            break L5;
          } else {
            var6 = var7;
            break L5;
          }
        }
        L6: {
          var7 = w.field_kb.a(kk.a(param2, param1, true, true));
          if (var6 < var7) {
            var6 = var7;
            break L6;
          } else {
            break L6;
          }
        }
        var9.field_z = 76;
        var9.field_w = -(var6 / 2) + 280;
        var9.field_q = 260;
        var9.field_y = -var9.field_w + (var6 / 2 + 360);
        return var9;
    }

    rc() {
        this.field_l = new en[2];
        this.field_j = false;
        this.field_b = false;
    }

    static {
        int var0 = 0;
        field_a = 0;
        field_h = "Left";
        field_e = new vj();
        field_c = new sg[255];
        field_g = "Cancel unrated rematch";
        for (var0 = 0; var0 < field_c.length; var0++) {
            field_c[var0] = new sg();
        }
    }
}
