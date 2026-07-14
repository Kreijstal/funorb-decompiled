/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends dj {
    private int field_o;
    static boolean field_l;
    static jp field_q;
    static ff field_s;
    static oe[] field_p;
    private long field_m;
    private long field_r;
    private int field_j;
    static long field_i;
    private long field_k;
    private long[] field_n;

    final int a(int param0, long param1) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 15) {
            return -72;
        }
        if (((cg) this).field_m > ((cg) this).field_r) {
            ((cg) this).field_k = ((cg) this).field_k + (((cg) this).field_m + -((cg) this).field_r);
            ((cg) this).field_r = ((cg) this).field_r + (-((cg) this).field_r + ((cg) this).field_m);
            ((cg) this).field_m = ((cg) this).field_m + param1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            ((cg) this).field_m = ((cg) this).field_m + param1;
            // if_icmpge L111
        } while (((cg) this).field_r > ((cg) this).field_m);
        if ((((cg) this).field_m ^ -1L) > (((cg) this).field_r ^ -1L)) {
            ((cg) this).field_m = ((cg) this).field_r;
        }
        return var4;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        mh stackIn_3_0 = null;
        mh stackIn_4_0 = null;
        mh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        mh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        mh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        mh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_11_0 = 0;
        mh stackOut_2_0;
        mh stackOut_4_0;
        int stackOut_4_1;
        mh stackOut_3_0;
        int stackOut_3_1;
        mh stackOut_5_0;
        int stackOut_5_1;
        mh stackOut_7_0;
        int stackOut_7_1;
        int stackOut_7_2;
        mh stackOut_6_0;
        int stackOut_6_1;
        int stackOut_6_2;
        int stackOut_10_0;
        int stackOut_9_0;
        L0: {
          fo.field_i = lb.field_d;
          kp.field_a = lb.field_c;
          on.e(-67);
          ap.field_b.a(fe.field_gb.field_Ib, 0, 80, 0, fe.field_gb.field_cb + -40 + -2);
          dn.field_N.a(np.field_a, 0, 0, bn.field_q.field_Ib, (byte) 64);
          if (param0 > 16) {
            break L0;
          } else {
            field_l = true;
            break L0;
          }
        }
        L1: {
          var1 = np.field_a + 2;
          stackOut_2_0 = vn.field_A;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (vd.field_e) {
            stackOut_4_0 = (mh) (Object) stackIn_4_0;
            stackOut_4_1 = var1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = (mh) (Object) stackIn_3_0;
            stackOut_3_1 = 0;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          stackOut_5_0 = (mh) (Object) stackIn_5_0;
          stackOut_5_1 = -stackIn_5_1 + bn.field_q.field_cb;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          stackIn_6_0 = stackOut_5_0;
          stackIn_6_1 = stackOut_5_1;
          if (vd.field_e) {
            stackOut_7_0 = (mh) (Object) stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = var1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            break L2;
          } else {
            stackOut_6_0 = (mh) (Object) stackIn_6_0;
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = 0;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            break L2;
          }
        }
        L3: {
          ((mh) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, 0, bn.field_q.field_Ib, (byte) 64);
          s.b(124);
          jf.field_k.a(40, fe.field_gb.field_cb - 40, 0, fe.field_gb.field_Ib, (byte) 64);
          sc.field_b.a(30, 0, 0, rm.field_a.field_Ib, (byte) 64);
          ll.field_e.a(-72 + rm.field_a.field_cb, 30, 0, rm.field_a.field_Ib, (byte) 64);
          nk.field_g.a(30, 5, 5, 68, (byte) 64);
          nk.field_a.a(30, 5, 75, 78, (byte) 64);
          kk.field_b.a(30, 5, 155, 48, (byte) 64);
          la.field_b.a(30, 5, 205, 48, (byte) 64);
          if (!vd.field_e) {
            stackOut_10_0 = 200;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 250;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var2 = stackIn_11_0;
          wh.field_h.a(30, 5, 5 - -var2, -var2 + 363, (byte) 64);
          dp.field_x.a(30, 5, 370, rm.field_a.field_Ib - 10 - 365, (byte) 64);
          rl.field_e.a(2, (byte) -128, -5 + (ll.field_e.field_Ib + -5), 5, 37, ec.field_J, -5 + (-5 + ll.field_e.field_cb + -32));
          var3 = (rm.field_a.field_Ib + 2) / 2;
          gj.field_b.a(40, -40 + rm.field_a.field_cb, 0, var3 - 2, (byte) 64);
          if (vd.field_e) {
            break L4;
          } else {
            var3 = 0;
            break L4;
          }
        }
        td.field_v.a(40, rm.field_a.field_cb + -40, var3, -var3 + rm.field_a.field_Ib, (byte) 64);
    }

    final static int a(int param0, byte[] param1, byte param2) {
        if (param2 != -86) {
            field_i = -76L;
        }
        return ba.a(param1, 9, 0, param0);
    }

    final void a(int param0) {
        if ((((cg) this).field_m ^ -1L) < (((cg) this).field_r ^ -1L)) {
            ((cg) this).field_r = ((cg) this).field_r + (-((cg) this).field_r + ((cg) this).field_m);
        }
        if (param0 != 1) {
            Object var3 = null;
            cg.a((vl[]) null, (byte) 16, (vl) null, true);
        }
        ((cg) this).field_k = 0L;
    }

    final long d(byte param0) {
        int var2 = 116 / ((param0 - -1) / 38);
        ((cg) this).field_r = ((cg) this).field_r + this.e((byte) -64);
        if ((((cg) this).field_r ^ -1L) > (((cg) this).field_m ^ -1L)) {
            return (-((cg) this).field_r + ((cg) this).field_m) / 1000000L;
        }
        return 0L;
    }

    private final long e(byte param0) {
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -((cg) this).field_k + var2;
        ((cg) this).field_k = var2;
        if (4999999999L > (var4 ^ -1L)) {
            if (!((var4 ^ -1L) <= -5000000001L)) {
                ((cg) this).field_n[((cg) this).field_o] = var4;
                if (!((((cg) this).field_j ^ -1) <= -2)) {
                    ((cg) this).field_j = ((cg) this).field_j + 1;
                }
                ((cg) this).field_o = (1 + ((cg) this).field_o) % 10;
            }
        }
        if (param0 >= -19) {
            field_q = null;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((cg) this).field_j; var8++) {
            var6 = var6 + ((cg) this).field_n[(10 + ((cg) this).field_o + -var8) % 10];
        }
        return var6 / (long)((cg) this).field_j;
    }

    final static void a(vl[] param0, byte param1, vl param2, boolean param3) {
        vl var10 = null;
        on var8 = null;
        int var9 = BrickABrac.field_J ? 1 : 0;
        int var4 = param2.e(param1 ^ 88);
        cl[] var5 = new cl[var4];
        int var6 = 0;
        cl var7 = (cl) (Object) param2.d(-79);
        while (var7 != null) {
            var6++;
            var5[var6] = (cl) (Object) param0;
            var7 = (cl) (Object) param2.a((byte) 116);
        }
        var6 = 0;
        if (param1 != 35) {
            return;
        }
        while (var6 < param0.length) {
            var10 = param0[var6];
            var8 = (on) (Object) var10.d(param1 + -159);
            while (var8 != null) {
                if (!((var8.field_N & 4) == 0)) {
                    var8.a(var5[var8.field_M], param3, 4);
                }
                var8 = (on) (Object) var10.a((byte) 116);
            }
            var6++;
        }
    }

    public static void f(byte param0) {
        if (param0 > -89) {
            field_q = null;
        }
        field_s = null;
        field_q = null;
        field_p = null;
    }

    cg() {
        ((cg) this).field_o = 0;
        ((cg) this).field_r = 0L;
        ((cg) this).field_m = 0L;
        ((cg) this).field_k = 0L;
        ((cg) this).field_n = new long[10];
        ((cg) this).field_j = 1;
        ((cg) this).field_r = System.nanoTime();
        ((cg) this).field_m = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = null;
        field_p = new oe[4];
    }
}
