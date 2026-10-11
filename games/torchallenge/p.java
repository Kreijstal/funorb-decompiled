/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int field_b;
    static int[][][] field_f;
    static String[][] field_d;
    static int[][] field_a;
    static String[][] field_c;
    static int[][][] field_e;

    final static void a(int param0) {
        dd.field_t = null;
        h.field_a = (byte[][]) null;
        ug.field_e = null;
        td.field_m = null;
        lg.field_e = null;
        pg.field_r = null;
        if (param0 != 0) {
          field_c = (String[][]) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = TorChallenge.field_F ? 1 : 0;
        var8 = -param0 + 32 * param4;
        var9 = var8 + 32;
        if (var8 < 0) {
          var10 = -1;
        } else {
          var10 = 1;
        }
        var8 = var8 * var10;
        if (var8 > 1024) {
          var10 = -var10;
        }
        if (var9 < 0) {
          var11 = -1;
        } else {
          var11 = 1;
        }
        var9 = var9 * var11;
        if (var9 > 1024) {
          var11 = -var11;
        }
        var12 = wi.field_a[var8];
        var13 = wi.field_a[var9];
        gl.field_l[param3][param2][0][0] = 320 + var10 * (fj.a(1870096848, var12, 23592960) >> 16);
        gl.field_l[param3][param2][0][1] = 320 + var11 * (fj.a(1870096848, var13, 23592960) >> 16);
        gl.field_l[param3][param2][1][0] = (fj.a(1870096848, var12, 19398656) >> 16) * var10 + 320;
        gl.field_l[param3][param2][1][1] = 320 + var11 * (fj.a(1870096848, var13, 19398656) >> 16);
        gl.field_l[param3][param2][2][0] = (fj.a(1870096848, var12, 18874368) >> 16) * var10 + 320;
        gl.field_l[param3][param2][2][1] = 320 + var11 * (fj.a(1870096848, var13, 18874368) >> 16);
        vb.field_a[param3][param2] = param4 + param1 / 32;
        if (param6 > -5) {
          return;
        }
        if (0 > vb.field_a[param3][param2]) {
          dupTemp$0 = vb.field_a[param3];
          dupTemp$0[param2] = dupTemp$0[param2] + 64;
        }
        if (vb.field_a[param3][param2] >= 64) {
          dupTemp$1 = vb.field_a[param3];
          dupTemp$1[param2] = dupTemp$1[param2] - 64;
        }
        if ((param4 < 0 ||
          param4 > 64) &&
          (param4 > 0 ||
          param4 < -64)) {
          nj.field_b[vb.field_a[param3][param2]][0] = 360 + (fj.a(1870096848, fj.field_m[16 + var8], 23592960) >> 16);
          nj.field_b[vb.field_a[param3][param2]][1] = 296 + (fj.a(1870096848, fj.field_m[var8 + 16], 19398656) >> 16);
        } else {
          nj.field_b[vb.field_a[param3][param2]][0] = -(fj.a(1870096848, fj.field_m[16 + var8], 23592960) >> 16) + 360;
          nj.field_b[vb.field_a[param3][param2]][1] = -(fj.a(1870096848, fj.field_m[var8 + 16], 19398656) >> 16) + 296;
        }
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        lc var4_ref_lc = null;
        int var4 = 0;
        lc var5 = null;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (qc.field_d != aj.field_c) {
            return false;
          }
          if (param0 != 16) {
            p.a(72);
          }
          var2_long = ol.a(256);
          if (sl.field_b != 0 &&
            jf.field_tb < 0) {
            var4_ref_lc = (lc) (ba.field_a.c((byte) -5));
            if (var4_ref_lc != null &&
              var2_long > var4_ref_lc.field_l) {
              var4_ref_lc.a(true);
              bb.field_i = var4_ref_lc.field_q.length;
              id.field_b.field_q = 0;
              for (var5_int = 0; var5_int < bb.field_i; var5_int++) {
                id.field_b.field_m[var5_int] = var4_ref_lc.field_q[var5_int];
              }
              ul.field_j = uc.field_X;
              uc.field_X = md.field_i;
              md.field_i = cb.field_g;
              cb.field_g = var4_ref_lc.field_i;
              return true;
            }
          }
          while (true) {
            if (jf.field_tb < 0) {
              id.field_b.field_q = 0;
              if (!pe.a((byte) 119, 1)) {
                return false;
              }
              jf.field_tb = id.field_b.o(11650);
              id.field_b.field_q = 0;
              bb.field_i = param1[jf.field_tb];
            }
            if (!md.a((byte) 124)) {
              return false;
            }
            if (sl.field_b == 0) {
              ul.field_j = uc.field_X;
              uc.field_X = md.field_i;
              md.field_i = cb.field_g;
              cb.field_g = jf.field_tb;
              jf.field_tb = -1;
              return true;
            }
            var4 = sl.field_b;
            if (0.0 != tf.field_i) {
              var4 = (int)((double)var4 + id.field_a.nextGaussian() * tf.field_i);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new lc((long)var4 + var2_long, jf.field_tb, new byte[bb.field_i]);
            for (var6 = 0; var6 < bb.field_i; var6++) {
              var5.field_q[var6] = id.field_b.field_m[var6];
            }
            ba.field_a.a(var5, -111);
            jf.field_tb = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("p.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        field_d = (String[][]) null;
        field_a = (int[][]) null;
        if (!param0) {
          p.a(-93);
        }
        field_f = (int[][][]) null;
        field_c = (String[][]) null;
        field_e = (int[][][]) null;
    }

    static {
        field_f = new int[10][2][2];
        field_a = new int[][]{new int[]{0, 119}, new int[]{0, 60}, new int[]{0, 60}};
        field_e = new int[][][]{new int[][]{new int[]{0, 2, 0}, new int[]{2, 0}, new int[]{2, 0}, new int[]{1, 2, 1, 2, 1, 2}, new int[]{2, 0}, new int[]{0}, new int[]{2, 2, 2, 2, 2, 2}}, new int[][]{new int[]{1, 0}, new int[]{1, 0, 1, 0}, new int[]{0, 1, 1, 1, 0, 0}, new int[]{0, 1, 1, 0, 1, 0}, new int[]{0, 1, 1, 0, 0}, new int[]{1, 1, 0, 1, 0}, new int[]{0}}, new int[][]{new int[]{0, 3, 0}, new int[]{0, 3}, new int[]{0, 2, 2, 0}, new int[]{0, 2, 2, 3, 3, 3}, new int[]{0, 2, 2}, new int[]{0}, new int[]{2, 2, 2, 2, 3, 3}}};
        field_c = new String[][]{new String[]{"Aerial attack", " - Hold while in the air."}, new String[]{"Charge attack", "."}, new String[]{"Attack upwards", " - Hold while attacking."}, new String[]{"Attack behind", " - Press while attacking."}};
        field_d = new String[][]{new String[]{"<img=1> / <img=0>", "<img=3> / <img=4> / <img=5>", "<img=7> / <img=6>", "<img=2>"}, new String[]{"<img=7> / <img=6>", "<img=7> / <img=6> + <img=2> +<br><img=1> / <img=0>", "<img=3>", "<img=1> / <img=0>"}};
    }
}
