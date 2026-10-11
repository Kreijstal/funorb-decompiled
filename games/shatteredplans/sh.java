/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh implements fo {
    static fg field_c;
    private ob field_a;
    static int field_b;
    private int field_d;

    public final l a(byte param0) throws jn {
        int var8 = 0;
        int var2;
        int var3;
        l var4;
        int var5;
        vl var6;
        ln[] var7;
        ln var9;
        int var10;
        int var11;
        int var12;
        ln var13;
        int var14;
        int var11Lifetime1;
        int var12Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = pe.a((byte) 34, 11);
        var3 = ls.a(11, 2);
        var5 = -65 / ((-67 - param0) / 44);
        var4 = new l(var2, var3, this.field_d, 73);
        var6 = new vl(this.field_d, 2);
        var6.a(false, var4);
        var7 = var4.field_e;
        for (var8 = 0; var8 < var7.length; var8++) {
          var9 = var7[var8];
          var10 = this.field_a.j(-114);
          for (var11 = 0; var10 > var11; var11++) {
            var12 = this.field_a.j(-119);
            var13 = var4.field_e[var12];
            var9.a((byte) -114, var13);
            var13.a((byte) -122, var9);
          }
          var11Lifetime1 = 0;
          while (var11Lifetime1 < 4) {
            var12Lifetime1 = this.field_a.j(-75);
            var9.field_G[var11Lifetime1] = we.a(var12Lifetime1, 15);
            var11Lifetime1++;
            if (var11Lifetime1 < 4) {
              var9.field_G[var11Lifetime1] = we.a(var12Lifetime1, 240) >> 4;
              var11Lifetime1++;
              continue;
            }
            break;
          }
          var9.field_x = this.field_a.f(-20976);
          if ((var9.field_x & 32768) != 0) {
            var9.field_x = var9.field_x & 32767;
            var9.field_u = true;
          }
          var9.field_B = this.field_a.j(-84);
          var9.field_L = var9.field_B >>> 6;
          var9.field_B = var9.field_B & 63;
        }
        var4.a(26253);
        return var4;
    }

    final static void a(sd param0, int param1) {
        int[] var11 = null;
        int[] var9 = null;
        int[] var7 = null;
        int[] var12 = null;
        int[] var10 = null;
        int[] var2 = null;
        int dupTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        int var8 = 0;
        int var3 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3Lifetime1;
        try {
          var11 = new int[4];
          var9 = var11;
          var7 = var9;
          var12 = var7;
          var10 = var12;
          var2 = var10;
          sn.a(var11, (byte) -76, param0);
          dupTemp$0 = var11[0];
          var5 = dupTemp$0;
          var4 = dupTemp$0;
          for (var3 = 1; 4 > var3; var3++) {
            if (var11[var3] < var4) {
              var4 = var11[var3];
            }
            if (var5 > var11[var3]) {
              var5 = var11[var3];
            }
          }
          if (param1 != -5) {
            sh.b(31);
          }
          var8 = 0;
          var3Lifetime1 = var8;
          while (var8 < 4) {
            var7[var8] = var11[var8] - var5;
            var8++;
          }
          param0.field_u = var2;
          param0.field_r = var4;
          param0.field_w = mf.a((byte) 74, var12);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        int var1;
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = 52 / ((param0 + 16) / 49);
        var2 = pr.a(14274);
        var4 = var2 - tk.field_z;
        if (var4 > 30000L) {
          vj.field_C = 0;
        } else {
          var6 = 3000;
          if (vj.field_C >= 7) {
            var6 = 12000;
          } else {
            if (vj.field_C >= 5) {
              var6 = 9000;
            } else {
              if (vj.field_C >= 3) {
                var6 = 6000;
              }
            }
          }
          if (var4 <= (long)var6) {
            return false;
          }
          vj.field_C = vj.field_C + 1;
        }
        tk.field_z = var2;
        return true;
    }

    final static void a(int param0) {
        bg.field_g = false;
        ae.field_b = ~sa.field_a.j(-99) == param0 ? true : false;
    }

    public static void b(byte param0) {
        if (param0 != 87) {
          sh.a(false, 42, -4, 3);
        }
        field_c = null;
    }

    sh(ob param0, int param1) {
        try {
          this.field_d = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static nf a(boolean param0, int param1, int param2, int param3) {
        boolean stackIn_46_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        nf var8_ref_nf;
        int var9;
        nf var9_ref_nf;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = null;
        ji.field_I.field_xb.field_M.a(0);
        var5 = 0;
        var6 = 0;
        if (param0) {
          field_b = -115;
        }
        for (var7 = da.field_g - 1; 0 <= var7; var7--) {
          var8_ref_nf = wm.field_d[var7];
          var9 = 0;
          if (!bg.field_g &&
            kp.field_i > var5) {
            var10_int = id.a(-7019, var8_ref_nf.field_n);
            if (var10_int <= var8_ref_nf.a((byte) 116) && (var8_ref_nf.field_h ||
              !ti.a(var8_ref_nf.field_b, true))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_nf.field_j = null;
          } else {
            if (null != var8_ref_nf.field_j &&
              !qh.field_v) {
              var5++;
            } else {
              if (null != var8_ref_nf.field_j) {
              }
              var10 = hg.a(param0, var8_ref_nf);
              var11 = var10 + nq.a(var8_ref_nf.field_k);
              var12 = jl.a(var8_ref_nf, (byte) -73);
              var8_ref_nf.field_j = new qr(0L, bh.field_k, var11);
              var8_ref_nf.field_j.field_nb = ho.field_f;
              var8_ref_nf.field_j.field_jb = -(var12 >> 1 & 8355711) + var12 + (8355711 & bh.field_k.field_jb >> 1);
              var8_ref_nf.field_j.field_x = var12;
              var6 = var6 + param3;
              var8_ref_nf.field_j.field_qb = -(8355711 & var12 >> 1) + (var12 + (8355711 & bh.field_k.field_qb >> 1));
              var5++;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; da.field_g > var8; var8++) {
          var9_ref_nf = wm.field_d[var8];
          if (null != var9_ref_nf.field_j) {
            ji.field_I.field_xb.a(4, var9_ref_nf.field_j);
            var9_ref_nf.field_j.a(var9_ref_nf.field_j.e(false), param3, (byte) 111, var7Lifetime1, param2);
            if (0 != var9_ref_nf.field_j.field_rb) {
              var4 = var9_ref_nf;
            }
            var7Lifetime1 = var7Lifetime1 + param3;
          }
        }
        var8Lifetime1 = -var7Lifetime1 + var6 + (ji.field_I.field_xb.field_mb + ji.field_I.field_xb.field_gb);
        ji.field_I.field_xb.field_mb = ji.field_I.field_xb.field_mb - var8Lifetime1;
        ji.field_I.field_xb.field_db = ji.field_I.field_xb.field_db + var8Lifetime1;
        if (qh.field_v) {
          ji.field_I.field_xb.field_mb = var7Lifetime1;
        }
        ji.field_I.field_xb.field_gb = -ji.field_I.field_xb.field_mb + var7Lifetime1;
        if (qh.field_v) {
          qh.field_v = false;
          ji.field_I.field_xb.field_w = 0;
          ShatteredPlansClient.field_K = true;
          ji.field_I.field_xb.field_db = -ji.field_I.field_xb.field_mb + ji.field_I.field_zb.field_mb;
        }
        if (sr.field_h &&
          null != fa.field_X) {
          ShatteredPlansClient.field_K = true;
        }
        var9Lifetime1 = ji.field_I.field_zb.field_mb - ji.field_I.field_xb.field_mb - ji.field_I.field_xb.field_gb;
        if (ShatteredPlansClient.field_K) {
          ji.field_I.field_xb.field_w = var9Lifetime1 - ji.field_I.field_xb.field_db;
        }
        ji.field_I.a(param1 * 2 * param3, true, (byte) -114, param3);
        stackIn_46_0 = (var9Lifetime1 == ji.field_I.field_xb.field_w + ji.field_I.field_xb.field_db);
        ShatteredPlansClient.field_K = stackIn_46_0;
        return (nf) (var4);
    }

    static {
        field_c = new fg();
    }
}
