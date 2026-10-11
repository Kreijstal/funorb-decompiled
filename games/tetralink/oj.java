/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    private int[] field_d;
    private int[] field_g;
    static hl field_a;
    private int field_k;
    private int field_i;
    private int field_e;
    static String field_h;
    static long field_c;
    static String field_f;
    static hl field_j;
    private int field_b;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(el param0, byte param1, boolean param2, String param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        try {
          gd.a((String) null, 255, (String) null, -1, ph.field_t, (int[]) null, 0L, param0, param0.j(-128));
          if (param0.field_Kb && (2 == param0.field_Zb ||
            !(2 > dd.field_c))) {
            var7 = hd.field_s;
            var8 = sk.a(new String[]{param3}, md.field_y, 119);
            var7.field_j.a(var8, 1, 10);
          }
          hd.field_s.b((byte) 79);
          if (param2) {
            if (nd.field_Nb != hd.field_s.field_c) {
              var11 = hd.field_s;
              var12 = sk.a(new String[]{param3}, vi.field_b, 120);
              var11.field_j.a(var12, 1, 15);
            } else {
              var9 = hd.field_s;
              var10 = sk.a(new String[]{param3}, wa.field_h, 127);
              var9.field_j.a(var10, 1, 16);
            }
          }
          var13 = hd.field_s;
          if (param1 < 103) {
            return;
          }
          var5 = ci.field_B;
          var6 = li.field_o;
          var13.field_j.a(0, var6, -117, 0, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("oj.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, int[] param1, byte param2, int param3, int[] param4) {
        int var10 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        var13 = TetraLink.field_J;
        try {
          if (param3 > param0) {
            var5_int = (param3 + param0) / 2;
            var6 = param0;
            var7 = param4[var5_int];
            param4[var5_int] = param4[param3];
            param4[param3] = var7;
            var8 = param1[var5_int];
            param1[var5_int] = param1[param3];
            param1[param3] = var8;
            stackIn_5_0 = (2147483647 != var7) ? 1 : 0;
            var9 = stackIn_5_0;
            for (var10 = param0; var10 < param3; var10++) {
              if ((var7 - (var10 & var9)) < param4[var10]) {
                var11 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6] = var11;
                var12 = param1[var10];
                param1[var10] = param1[var6];
                param1[var6++] = var12;
              }
            }
            param4[param3] = param4[var6];
            param4[var6] = var7;
            param1[param3] = param1[var6];
            param1[var6] = var8;
            oj.a(param0, param1, (byte) -63, var6 - 1, param4);
            oj.a(1 + var6, param1, (byte) -63, param3, param4);
          }
          if (param2 != -63) {
            var14 = (String) null;
            oj.a(126, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("oj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 == this.field_e) {
          this.a(-27169);
          this.field_e = 256;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_d[fieldTemp$0];
    }

    final static void b(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        v var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        bc var13 = null;
        int var14 = 0;
        bc var15 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = TetraLink.field_J;
        try {
          var13 = kb.field_q;
          var15 = var13;
          var2 = var15.d((byte) -99);
          if (param0 > -95) {
            oj.b((byte) -78);
          }
          var3 = (v) (tc.field_p.c(false));
          while (var3 != null) {
            if (var3.field_n != var2) {
              var3 = (v) (tc.field_p.a((byte) -70));
              continue;
            }
            break;
          }
          if (var3 == null) {
            mk.a(false);
            return;
          }
          var4 = var15.d((byte) -99);
          if (var4 != 0) {
            nj.field_a[0] = ph.field_w;
            var5 = var3.field_q;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              nj.field_a[var6_int] = var13.g((byte) 81);
            }
            lm.a(var5, var4, (byte) 71);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              lb.a(var15, false);
              if (var6_intLifetime1 == 0) {
                var3.field_B = tl.field_X;
                var3.field_s = fd.field_F;
                var3.field_o = om.field_Nb;
                var3.field_t = l.field_j;
                ug.a(fd.field_F, tl.field_X, om.field_Nb, 20, var6_intLifetime1, l.field_j);
              } else {
                ug.a(fd.field_F, tl.field_X, om.field_Nb, 20, var6_intLifetime1, l.field_j);
              }
            }
            ae.b(94, var5);
            dupTemp$0 = new String[2][var5];
            var3.field_p = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][var5 * 4];
            var3.field_y = dupTemp$1;
            var7 = dupTemp$1;
            var8 = nd.field_Mb;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = qd.field_W[var9];
              var6[0][var10] = nj.field_a[var11];
              var7[0][var10 * 4] = lb.field_P[var11];
              var7[0][var10 * 4 + 1] = ac.field_b[var11];
              var7[0][2 + var10 * 4] = ai.field_g[var11];
              var7[0][3 + 4 * var10] = gl.field_n[var11];
              if (ej.a(nj.field_a[var11], 4) &&
                ai.field_g[var11] + (ac.field_b[var11] + gl.field_n[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = qd.field_W[var5 + var9Lifetime1];
              var6[1][var14] = nj.field_a[var11Lifetime1];
              var7[1][4 * var14] = lb.field_P[var11Lifetime1];
              var7[1][4 * var14 + 1] = ac.field_b[var11Lifetime1];
              var7[1][var14 * 4 + 2] = ai.field_g[var11Lifetime1];
              var7[1][var14 * 4 + 3] = gl.field_n[var11Lifetime1];
              if (ej.a(nj.field_a[var11Lifetime1], 4) &&
                gl.field_n[var11Lifetime1] + ai.field_g[var11Lifetime1] + ac.field_b[var11Lifetime1] == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var14++;
              var9Lifetime1++;
            }
          }
          var3.field_u = true;
          var3.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "oj.A(" + param0 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_6_0 = (ke.a(param1, false) != null);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("oj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = TetraLink.field_J;
        if (param0 != -27169) {
          this.c(54);
        }
        int fieldTemp$0 = this.field_k + 1;
        this.field_k = this.field_k + 1;
        this.field_i = this.field_i + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_g[var2];
          if ((2 & var2) == 0) {
            if ((1 & var2) != 0) {
              this.field_b = this.field_b ^ this.field_b >>> 6;
            } else {
              this.field_b = this.field_b ^ this.field_b << 13;
            }
          } else {
            if (0 == (1 & var2)) {
              this.field_b = this.field_b ^ this.field_b << 2;
            } else {
              this.field_b = this.field_b ^ this.field_b >>> 16;
            }
          }
          this.field_b = this.field_b + this.field_g[255 & var2 + 128];
          dupTemp$1 = this.field_g[pl.a(1020, var3) >> 2] + this.field_b + this.field_i;
          var4 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          dupTemp$2 = this.field_g[pl.a(var4 >> 8 >> 2, 255)] + var3;
          this.field_i = dupTemp$2;
          this.field_d[var2] = dupTemp$2;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var11 = TetraLink.field_J;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 3) {
          String var12 = (String) null;
          oj.a((el) null, (byte) -74, true, (String) null);
        }
        int var4 = -1640531527;
        int var7 = -1640531527;
        int var10 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var9 = -1640531527;
        int var8 = -1640531527;
        int var3 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var4 = var4 + this.field_d[var2Lifetime1 + 1];
          var5 = var5 + this.field_d[2 + var2Lifetime1];
          var6 = var6 + this.field_d[3 + var2Lifetime1];
          var10 = var10 + this.field_d[7 + var2Lifetime1];
          var7 = var7 + this.field_d[var2Lifetime1 + 4];
          var9 = var9 + this.field_d[var2Lifetime1 + 6];
          var3 = var3 + this.field_d[var2Lifetime1];
          var8 = var8 + this.field_d[var2Lifetime1 + 5];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_g[var2Lifetime1] = var3;
          this.field_g[1 + var2Lifetime1] = var4;
          this.field_g[2 + var2Lifetime1] = var5;
          this.field_g[var2Lifetime1 + 3] = var6;
          this.field_g[4 + var2Lifetime1] = var7;
          this.field_g[5 + var2Lifetime1] = var8;
          this.field_g[var2Lifetime1 + 6] = var9;
          this.field_g[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; 256 > var2Lifetime2; var2Lifetime2 += 8) {
          var7 = var7 + this.field_g[4 + var2Lifetime2];
          var8 = var8 + this.field_g[var2Lifetime2 + 5];
          var5 = var5 + this.field_g[var2Lifetime2 + 2];
          var6 = var6 + this.field_g[var2Lifetime2 + 3];
          var9 = var9 + this.field_g[var2Lifetime2 + 6];
          var3 = var3 + this.field_g[var2Lifetime2];
          var10 = var10 + this.field_g[7 + var2Lifetime2];
          var4 = var4 + this.field_g[1 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_g[var2Lifetime2] = var3;
          this.field_g[1 + var2Lifetime2] = var4;
          this.field_g[var2Lifetime2 + 2] = var5;
          this.field_g[var2Lifetime2 + 3] = var6;
          this.field_g[4 + var2Lifetime2] = var7;
          this.field_g[var2Lifetime2 + 5] = var8;
          this.field_g[6 + var2Lifetime2] = var9;
          this.field_g[var2Lifetime2 + 7] = var10;
        }
        this.a(-27169);
        this.field_e = 256;
    }

    oj(int[] param0) {
        int var2_int = 0;
        try {
          this.field_d = new int[256];
          this.field_g = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_d[var2_int] = param0[var2_int];
          }
          this.b(3);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_j = null;
        field_a = null;
        field_h = null;
        int var1 = -111 % ((68 - param0) / 57);
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 10121) {
          oj.a(-107, -60, -22);
        }
        if (param0 == 1 &&
          bn.a(param2 ^ 10120, param1)) {
          return 29;
        }
        return ai.field_a[param0];
    }

    static {
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_h = "On";
    }
}
