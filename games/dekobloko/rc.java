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
        int[] stackIn_3_0 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var6 = new int[8];
            var3 = var6;
            var4 = 0;
            if (param1 == 47) {
              L1: while (true) {
                if (8 <= var4) {
                  stackIn_7_0 = (int[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6[var4] = lb.a(param2[var4] ^ -1, param0[var4]);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (int[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("rc.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_k = null;
        field_c = null;
        if (param0 >= -103) {
            return;
        }
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
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
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
        if (param0) {
            rc.a(true);
        }
        return kf.field_Q != null ? true : false;
    }

    final static ke a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        ke stackIn_2_0 = null;
        ke stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ke stackIn_7_0 = null;
        ke stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ke stackIn_10_0 = null;
        ke stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int var6;
        int var7;
        ke var8;
        ke var9;
        L0: {
          var8 = new ke(2);
          var9 = var8;
          stackIn_2_0 = (ke) (var9);

          if (!param1) {
            stackIn_3_0 = (ke) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (ke) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_s = stackIn_3_1 != 0;
          if (param3 <= 0) {
            break L1;
          } else {
            rc.a(-21);
            break L1;
          }
        }
        L2: {
          stackIn_7_0 = (ke) (var9);

          if (!param2) {
            stackIn_8_0 = (ke) ((Object) stackIn_7_0);
            stackIn_8_1 = 0;
            break L2;
          } else {
            stackIn_8_0 = (ke) ((Object) stackIn_7_0);
            stackIn_8_1 = 1;
            break L2;
          }
        }
        L3: {
          stackIn_8_0.field_j = stackIn_8_1 != 0;
          stackIn_10_0 = (ke) (var9);

          if (!param0) {
            stackIn_11_0 = (ke) ((Object) stackIn_10_0);
            stackIn_11_1 = 0;
            break L3;
          } else {
            stackIn_11_0 = (ke) ((Object) stackIn_10_0);
            stackIn_11_1 = 1;
            break L3;
          }
        }
        L4: {
          stackIn_11_0.field_r = stackIn_11_1 != 0;
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
            break L4;
          } else {
            var6 = var7;
            break L4;
          }
        }
        L5: {
          var7 = w.field_kb.a(si.field_g);
          if (var7 <= var6) {
            break L5;
          } else {
            var6 = var7;
            break L5;
          }
        }
        L6: {
          var7 = w.field_kb.a(gf.a(-127, param1, param2, param0));
          if (var6 < var7) {
            var6 = var7;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var7 = w.field_kb.a(ri.a(0, param1, param2, param0));
          if (var7 <= var6) {
            break L7;
          } else {
            var6 = var7;
            break L7;
          }
        }
        L8: {
          var7 = w.field_kb.a(kk.a(param2, param1, param0, true));
          if (var6 < var7) {
            var6 = var7;
            break L8;
          } else {
            break L8;
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
