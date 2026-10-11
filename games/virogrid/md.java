/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static int field_b;
    static byte[][] field_g;
    static String field_c;
    private int[] field_f;
    static long field_a;
    static dj field_e;
    static boolean field_d;
    static vc field_i;
    static eh field_h;

    final static mg[] a(boolean param0, int param1) {
        mg[] var3 = null;
        mg[] var2 = null;
        mg[] var3Lifetime1;
        mg[] var2Lifetime1;
        if (param0) {
          var3 = new mg[9];
          var2 = var3;
          var3[4] = eg.a(64, (byte) 40, param1);
          return var2;
        }
        md.a(2);
        var3Lifetime1 = new mg[9];
        var2Lifetime1 = var3Lifetime1;
        var3Lifetime1[4] = eg.a(64, (byte) 40, param1);
        return var2Lifetime1;
    }

    final static ck a(String[] args, int param1) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        ck stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 7655) {
            md.a((byte) -70);
          }
          var2 = new ck(false);
          var2.field_b = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("md.H(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 11265) {
          md.a((byte) -50);
          return true;
        }
        return true;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return null != he.field_Xb ? true : false;
        }
        md.a(true, 11);
        return null != he.field_Xb ? true : false;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, bk param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          sb.field_b[0] = mc.field_c.nextInt();
          sb.field_b[1] = mc.field_c.nextInt();
          sb.field_b[2] = (int)(ph.field_i >> 32);
          sb.field_b[3] = (int)ph.field_i;
          gg.field_D.field_l = 0;
          gg.field_D.a(sb.field_b[0], (byte) -42);
          gg.field_D.a(sb.field_b[1], (byte) -42);
          gg.field_D.a(sb.field_b[2], (byte) -42);
          gg.field_D.a(sb.field_b[3], (byte) -42);
          kl.a(gg.field_D, (byte) 111);
          gg.field_D.a((byte) -126, param3);
          param4.a(false, gg.field_D);
          gk.field_g.field_l = 0;
          if (param0) {
            gk.field_g.a(18, param1 ^ -122);
          } else {
            gk.field_g.a(16, 61);
          }
          gk.field_g.field_l = gk.field_g.field_l + 2;
          var5_int = gk.field_g.field_l;
          gk.field_g.a(cj.field_c, (byte) -42);
          gk.field_g.a((byte) -30, vi.field_n);
          var6 = 0;
          if (wg.field_c) {
            var6 = var6 | 1;
          }
          if (el.field_k) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (mj.field_B != null) {
            var6 = var6 | 16;
          }
          gk.field_g.a(var6, -114);
          var7 = sh.b(-88, mb.g((byte) -80));
          if (var7 == null) {
            var7 = "";
          }
          gk.field_g.a(var7, (byte) -63);
          if (null != mj.field_B) {
            gk.field_g.b(mj.field_B, (byte) 127);
          }
          nl.a(on.field_a, gg.field_D, gk.field_g, ch.field_i, param1);
          gk.field_g.c(-var5_int + gk.field_g.field_l, -3991);
          al.b(~param1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("md.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_c = null;
        field_e = null;
        field_g = (byte[][]) null;
        int var1 = 80 % ((param0 - 9) / 34);
        field_h = null;
    }

    final static aj a(byte param0) {
        bk var2 = null;
        bk var2Lifetime1;
        if (vf.field_f == null) {
          vf.field_f = new aj(dk.field_j, 20, 0, 0, 0, 11579568, -1, 0, 0, dk.field_j.field_H, -1, 2147483647, true);
          if (param0 > -102) {
            var2 = (bk) null;
            md.a(false, -13, true, -83, (bk) null);
            return vf.field_f;
          }
          return vf.field_f;
        }
        if (param0 <= -102) {
          return vf.field_f;
        }
        var2Lifetime1 = (bk) null;
        md.a(false, -13, true, -83, (bk) null);
        return vf.field_f;
    }

    final int b(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = (this.field_f.length >> 1) - 1;
        var4 = param1 & var3;
        if (!param0) {
          return -35;
        }
        while (true) {
          var5 = this.field_f[var4 + (var4 + 1)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_f[var4 + var4] == param1) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    md(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_f = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_f[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (this.field_f[1 + var4 + var4] != -1) {
              var4 = var2_int - 1 & var4 + 1;
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("md.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_c = "Continue";
        field_d = false;
    }
}
