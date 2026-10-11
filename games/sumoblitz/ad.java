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
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = cv.field_G;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 == 71) {
            return;
          }
          field_q = (int[]) null;
          return;
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
        if (0 >= ct.field_x) {
          if (!(2 > ku.field_j)) {
            si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            iv.field_g[0] = new ak(0);
          }
          if (mq.a(8230, 25)) {
            si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            iv.field_g[0] = new ak(0);
          }
          ut.field_j = param0;
          return;
        }
        if (uc.a((byte) -29, lt.field_m)) {
          si.a(150, 38, 170, 2, new int[]{1, 28, 12, 13, 4, 3, 7}, 1, 470);
          iv.field_g[1] = new ak(1);
          si.a(150, 38, 170, 2, new int[]{12, 13, 27, 4, 5}, 8, 470);
          iv.field_g[8] = new ak(8);
          if (!(2 > ku.field_j)) {
            si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            iv.field_g[0] = new ak(0);
          }
          if (mq.a(8230, 25)) {
            si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            iv.field_g[0] = new ak(0);
          }
          ut.field_j = param0;
          return;
        }
        if (!(2 > ku.field_j)) {
          si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
          iv.field_g[0] = new ak(0);
        }
        if (mq.a(8230, 25)) {
          si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
          iv.field_g[0] = new ak(0);
        }
        ut.field_j = param0;
    }

    final static byte[] a(byte[] param0, int param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new byte[param1];
          var4 = var5;
          if (param3 <= 48) {
            field_n = (gf) null;
          }
          la.a(param0, param2, var5, 0, param1);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ad.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 == -20388) {
          field_q = null;
          field_p = null;
          field_n = null;
          return;
        }
        field_q = (int[]) null;
        field_q = null;
        field_p = null;
        field_n = null;
    }

    final static ne e(int param0) {
        ne var1 = null;
        if (param0 == 12768) {
          var1 = new ne(vf.field_d, li.field_u, er.field_h[0], av.field_C[0], vg.field_k[0], we.field_B[0], ag.field_d[0], iv.field_l);
          tl.a((byte) -20);
          return var1;
        }
        return (ne) null;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 55 / ((25 - param0) / 42);
          if (mp.field_a < 10) {
            var4 = 0;
            if (pt.field_a) {
              pt.field_a = false;
              var4 = 1;
            }
            hh.a(true, bp.g(14296), bf.field_a, var4 != 0, dn.b(102));
            return;
          }
          if (!lf.b(-251)) {
            lk.b();
            kd.a(240, 320, 256);
            um.a(0, 0, param1, (byte) 125);
            return;
          }
          if (0 != jv.field_a) {
            od.a(-97, param1);
            return;
          }
          jv.a(false, (byte) -71, param2);
          um.a(0, 0, param1, (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ad.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
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
