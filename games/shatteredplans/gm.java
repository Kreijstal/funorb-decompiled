/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends oh {
    static String[] field_l;
    static qr field_m;
    int field_h;
    al field_p;
    static String field_o;
    static int[] field_k;
    static int field_i;
    static String field_j;
    oh field_n;

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_48_2 = null;
        String[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        String stackIn_55_2 = null;
        String stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        boolean stackIn_90_2 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          eh.field_C = param2;
          bh.field_j = true;
          if (eh.field_C == 0) {
            var3_int = db.a(fp.field_c, um.field_c, hl.field_D, ts.field_K, 3);
            var4 = 3 + var3_int;
            kr.field_f = new String[var4];
            ss.field_a = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              ss.field_a[var5] = -1;
            }
            ShatteredPlansClient.field_E = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              kr.field_f[var5] = ts.field_K[var5];
            }
            kr.field_f[-3 + var4] = "";
            kr.field_f[-2 + var4] = jm.field_s;
            ss.field_a[var4 - 2] = 0;
            ShatteredPlansClient.field_E[0] = 4;
            kr.field_f[var4 - 1] = nf.field_i;
            ss.field_a[var4 - 1] = 1;
            ShatteredPlansClient.field_E[1] = 5;
          } else if (eh.field_C == 1) {
            var3_int = db.a(fp.field_c, um.field_c, hl.field_D, ts.field_K, 3);
            var4 = 2 + var3_int;
            kr.field_f = new String[var4];
            ss.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              ss.field_a[var5] = -1;
            }
            ShatteredPlansClient.field_E = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              kr.field_f[var5] = ts.field_K[var5];
            }
            kr.field_f[var4 - 2] = "";
            kr.field_f[-1 + var4] = nf.field_i;
            ss.field_a[var4 - 1] = 0;
            ShatteredPlansClient.field_E[0] = 5;
          } else if (eh.field_C != 2) {
            if (eh.field_C == 3) {
              if (fa.field_W.field_w) {
                var3_int = db.a(fp.field_c, um.field_c, ja.field_k, ts.field_K, 3);
              } else {
                var3_int = db.a(fp.field_c, um.field_c, ne.field_n, ts.field_K, 3);
              }
              var4 = 2 + var3_int;
              kr.field_f = new String[var4];
              ss.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ss.field_a[var5] = -1;
              }
              ShatteredPlansClient.field_E = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                kr.field_f[var5] = ts.field_K[var5];
              }
              kr.field_f[-2 + var4] = "";
              kr.field_f[-1 + var4] = nf.field_i;
              ss.field_a[-1 + var4] = 0;
              ShatteredPlansClient.field_E[0] = 5;
            } else if (4 == eh.field_C) {
              var3_int = db.a(fp.field_c, um.field_c, lp.field_z, ts.field_K, 3);
              var4 = var3_int + 2;
              kr.field_f = new String[var4];
              ss.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ss.field_a[var5] = -1;
              }
              ShatteredPlansClient.field_E = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                kr.field_f[var5] = ts.field_K[var5];
              }
              kr.field_f[var4 - 2] = "";
              kr.field_f[-1 + var4] = nf.field_i;
              ss.field_a[-1 + var4] = 0;
              ShatteredPlansClient.field_E[0] = 5;
            } else {
              if (eh.field_C != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = db.a(fp.field_c, um.field_c, sc.field_p, ts.field_K, 3);
              var4 = 3 + var3_int;
              kr.field_f = new String[var4];
              ss.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ss.field_a[var5] = -1;
              }
              ShatteredPlansClient.field_E = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                kr.field_f[var5] = ts.field_K[var5];
              }
              kr.field_f[-3 + var4] = "";
              kr.field_f[-2 + var4] = qq.field_t;
              ss.field_a[var4 - 2] = 0;
              ShatteredPlansClient.field_E[0] = 3;
              kr.field_f[-1 + var4] = nf.field_i;
              ss.field_a[-1 + var4] = 1;
              ShatteredPlansClient.field_E[1] = 5;
            }
          } else {
            var3_int = db.a(fp.field_c, um.field_c, re.a(vs.field_f, 4371, new String[]{"<br><%0><br>"}), ts.field_K, 3);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ts.field_K[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            kp.field_o = new String[var4];
            ps.a(ts.field_K, 0, kp.field_o, 0, var4);
            kd.field_b = new String[-1 + (var3_int - var4)];
            ps.a(ts.field_K, var4 + 1, kd.field_b, 0, var3_int + (-var4 - 1));
            var4 = -1;
            var3_int = db.a(fp.field_c, um.field_c, re.a(ln.field_U, 4371, new String[]{"<br><%0><br>"}), ts.field_K, 3);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ts.field_K[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            el.field_d = new String[var4];
            ps.a(ts.field_K, 0, el.field_d, 0, var4);
            hm.field_p = new String[-1 + (var3_int - var4)];
            ps.a(ts.field_K, var4 + 1, hm.field_p, 0, var3_int - var4 - 1);
            if (kp.field_o.length >= el.field_d.length) {
              stackIn_37_0 = kp.field_o.length;
            } else {
              stackIn_37_0 = el.field_d.length;
            }
            var5 = stackIn_37_0;
            if (hm.field_p.length > kd.field_b.length) {
              stackIn_40_0 = hm.field_p.length;
            } else {
              stackIn_40_0 = kd.field_b.length;
            }
            var6 = stackIn_40_0;
            var7 = var6 + var5 + 7;
            kr.field_f = new String[var7];
            ss.field_a = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              ss.field_a[var8] = -1;
            }
            ShatteredPlansClient.field_E = new int[2];
            kr.field_f[0] = wp.field_b;
            ss.field_a[1] = 0;
            kr.field_f[1] = pa.field_h;
            kr.field_f[2] = ld.field_i;
            ss.field_a[3] = 1;
            kr.field_f[5] = "";
            ShatteredPlansClient.field_E[1] = 2;
            ShatteredPlansClient.field_E[0] = 5;
            kr.field_f[3] = dd.field_a;
            kr.field_f[4] = ge.field_m;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_47_0 = kr.field_f;
              stackIn_47_1 = var8Lifetime2 + 6;
              if (0 > el.field_d.length + var8Lifetime2 - var5) {
                stackIn_48_2 = "";
              } else {
                stackIn_48_2 = el.field_d[var8Lifetime2 - (-el.field_d.length + var5)];
              }
              stackIn_47_0[stackIn_47_1] = stackIn_48_2;
            }
            kr.field_f[var5 + 6] = null;
            ss.field_a[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_52_0 = kr.field_f;
              stackIn_52_1 = 7 - (-var5 - var8Lifetime3);
              stackIn_52_2 = ~var8Lifetime3;
              stackIn_52_3 = ~hm.field_p.length;
              if (stackIn_52_2 > stackIn_52_3) {
                stackIn_55_2 = hm.field_p[var8Lifetime3];
              } else {
                stackIn_55_2 = "";
              }
              stackIn_52_0[stackIn_52_1] = stackIn_55_2;
            }
            br.field_p = pr.a(14274);
          }
          dc.field_l.field_b = ShatteredPlansClient.field_E.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; kr.field_f.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_89_0 = kr.field_f[var4Lifetime1];
            stackIn_89_1 = 0;
            stackIn_90_2 = !(ss.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = vm.a(stackIn_89_0, stackIn_89_1, stackIn_90_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (eh.field_C == 2) {
            var11 = kp.field_o;
            var4_ref_String__ = var11;
            for (var5Lifetime2 = 0; var11.length > var5Lifetime2; var5Lifetime2++) {
              var12 = var11[var5Lifetime2];
              var7Lifetime1 = vm.a(var12, 0, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = kd.field_b;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var13 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = vm.a(var13, 0, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          mr.field_a = (sm.field_b + ar.field_i << 1) * dc.field_l.field_b;
          db.field_f = cn.field_w - (var3_intLifetime1 >> 1);
          ho.field_a = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + cn.field_w);
          for (var4Lifetime2 = 0; var4Lifetime2 < kr.field_f.length; var4Lifetime2++) {
            stackIn_115_0 = mr.field_a;
            if (0 > ss.field_a[var4Lifetime2]) {
              stackIn_116_1 = e.field_d;
            } else {
              stackIn_116_1 = id.field_b;
            }
            mr.field_a = stackIn_115_0 + stackIn_116_1;
          }
          uq.field_k = dm.field_i - (mr.field_a >> 1);
          m.field_w = new int[kr.field_f.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = -123 / ((-15 - param1) / 55);
          var6Lifetime1 = uq.field_k;
          while (var4Lifetime3 < kr.field_f.length) {
            var7Lifetime2 = ss.field_a[var4Lifetime3];
            if (var7Lifetime2 >= 0) {
              var8Lifetime1 = vm.a(kr.field_f[var4Lifetime3], 0, true);
              var9 = cn.field_w - (var8Lifetime1 >> 1);
              var6Lifetime1 = var6Lifetime1 + sm.field_b;
              m.field_w[var4Lifetime3] = new int[4];
              m.field_w[var4Lifetime3][0] = var9 - tr.field_Lb;
              m.field_w[var4Lifetime3][1] = var6Lifetime1;
              m.field_w[var4Lifetime3][2] = var8Lifetime1 + (tr.field_Lb << 1);
              var6Lifetime1 = var6Lifetime1 + (id.field_b + ((ar.field_i << 1) + sm.field_b));
              m.field_w[var4Lifetime3][3] = (ar.field_i << 1) + id.field_b;
            } else {
              var6Lifetime1 = var6Lifetime1 + e.field_d;
            }
            var4Lifetime3++;
          }
          if (2 == eh.field_C) {
            dc.field_l.a(-1, -1, param0, 99);
          } else {
            dc.field_l.a(kq.a(pd.field_k, bb.field_b, 16777215), 0, param0, -58);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "gm.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, String param1) {
        cg.field_F = param1;
        if (param0 <= 48) {
          return;
        }
        try {
          qj.a((byte) -127, 12);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gm.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_o = null;
        if (param0 >= -100) {
          return;
        }
        field_j = null;
        field_l = null;
        field_m = null;
    }

    final void a(byte param0, int param1) {
        this.field_h = param1;
        this.field_p.e(128 + tf.field_p * param1 >> 8);
        int var3 = 85 % ((param0 - 59) / 59);
    }

    gm(al param0, oh param1) {
        try {
          this.field_p = param0;
          this.field_h = param0.i();
          this.field_n = param1;
          this.field_p.e(128 + this.field_h * tf.field_p >> 8);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Friends";
        field_k = new int[]{8372223, 8380207, 16744192, 16711935};
        field_j = "Game full";
    }
}
