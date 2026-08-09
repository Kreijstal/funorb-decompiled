/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends za {
    static int field_o;
    jaclib.memory.heap.NativeHeap field_m;
    static gf field_n;
    static int[] field_q;
    static mm field_p;

    final static void c(byte param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = cv.field_G;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                if (param0 == 71) {
                  break L0;
                } else {
                  field_q = (int[]) null;
                  return;
                }
              } else {
                incrementValue$8 = var2;
                var2++;
                var5[incrementValue$8] = 0;
                incrementValue$9 = var2;
                var2++;
                var5[incrementValue$9] = 0;
                incrementValue$10 = var2;
                var2++;
                var5[incrementValue$10] = 0;
                incrementValue$11 = var2;
                var2++;
                var5[incrementValue$11] = 0;
                incrementValue$12 = var2;
                var2++;
                var5[incrementValue$12] = 0;
                incrementValue$13 = var2;
                var2++;
                var5[incrementValue$13] = 0;
                incrementValue$14 = var2;
                var2++;
                var5[incrementValue$14] = 0;
                incrementValue$15 = var2;
                var2++;
                var5[incrementValue$15] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "ad.B(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        kd.field_a[4] = new int[]{5};
        iv.field_g[4] = new ak(4);
        si.a(400, 38, 10, 2, new int[]{8, 9, 10, 21, 20, 5}, 2, 468);
        iv.field_g[2] = new ak(2);
        if (0 < ct.field_x) {
          if (!uc.a((byte) -29, lt.field_m)) {
            L0: {
              if (2 <= ku.field_j) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (mq.a(8230, 25)) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L1;
              } else {
                break L1;
              }
            }
            ut.field_j = param0;
            return;
          } else {
            L2: {
              si.a(150, 38, 170, 2, new int[]{1, 28, 12, 13, 4, 3, 7}, 1, 470);
              iv.field_g[1] = new ak(1);
              si.a(150, 38, 170, 2, new int[]{12, 13, 27, 4, 5}, 8, 470);
              iv.field_g[8] = new ak(8);
              if (2 <= ku.field_j) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (mq.a(8230, 25)) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L3;
              } else {
                break L3;
              }
            }
            ut.field_j = param0;
            return;
          }
        } else {
          L4: {
            if (2 <= ku.field_j) {
              si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
              iv.field_g[0] = new ak(0);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (mq.a(8230, 25)) {
              si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
              iv.field_g[0] = new ak(0);
              break L5;
            } else {
              break L5;
            }
          }
          ut.field_j = param0;
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = new byte[param1];
              var4 = var5;
              if (param3 > 48) {
                break L1;
              } else {
                field_n = (gf) null;
                break L1;
              }
            }
            la.a(param0, param2, var5, 0, param1);
            stackIn_3_0 = (byte[]) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ad.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(int param0) {
        if (param0 != -20388) {
          field_q = (int[]) null;
          field_q = null;
          field_p = null;
          field_n = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_n = null;
          return;
        }
    }

    final static ne e(int param0) {
        ne var1;
        if (param0 != 12768) {
          return (ne) null;
        } else {
          var1 = new ne(vf.field_d, li.field_u, er.field_h[0], av.field_C[0], vg.field_k[0], we.field_B[0], ag.field_d[0], iv.field_l);
          tl.a((byte) -20);
          return var1;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 55 / ((25 - param0) / 42);
          if ((mp.field_a ^ -1) <= -11) {
            if (!lf.b(-251)) {
              lk.b();
              kd.a(240, 320, 256);
              um.a(0, 0, param1, (byte) 125);
              return;
            } else {
              if (0 == jv.field_a) {
                jv.a(false, (byte) -71, param2);
                um.a(0, 0, param1, (byte) 125);
                return;
              } else {
                od.a(-97, param1);
                return;
              }
            }
          } else {
            L0: {
              var4 = 0;
              if (pt.field_a) {
                pt.field_a = false;
                var4 = 1;
                break L0;
              } else {
                break L0;
              }
            }
            hh.a(true, bp.g(14296), bf.field_a, var4 != 0, dn.b(102));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ad.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    ad(int param0) {
        this.field_m = new jaclib.memory.heap.NativeHeap(param0);
    }

    final void a(int param0) {
        if (param0 != -4009) {
            return;
        }
        this.field_m.a();
    }

    static {
        field_o = 50;
        field_q = new int[8192];
        field_n = new gf();
        field_p = new mm();
    }
}
