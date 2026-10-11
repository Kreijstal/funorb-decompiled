/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static int[] field_i;
    static int field_h;
    static String field_k;
    private int[] field_c;
    static bd field_e;
    private boolean field_f;
    static bd[] field_l;
    private int field_a;
    private int field_g;
    private int field_j;
    private int[] field_d;
    private boolean[] field_b;

    final static boolean b(int param0) {
        if (param0 != 32674) {
          field_k = (String) null;
        }
        return ti.field_b == ki.field_f ? true : false;
    }

    final boolean a(int param0, int param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param1 != -28) {
          field_k = (String) null;
        }
        stackIn_6_0 = (param2 == this.field_g) && (param0 == this.field_a);
        return stackIn_6_0;
    }

    final void d(int param0) {
        kf.a(this.field_c, 0, kh.field_ib, 0, kh.field_ib.length);
        kf.a(this.field_d, 0, kh.field_U, 0, kh.field_U.length);
        kf.a(this.field_b, 0, kh.field_Q, 0, kh.field_Q.length);
        if (param0 != 64) {
          field_k = (String) null;
        }
        wa.field_p = this.field_j;
        vj.field_s = 0;
        uf.field_h = this.field_f;
        n.field_s = 0;
        eh.field_g = ba.a((byte) 113);
        w.field_r = 0;
    }

    final static String a(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          var4 = -98 % ((param1 - 85) / 38);
          for (var5 = 0; var2_int > var5; var5++) {
            var3[-var5 - 1 + var2_int] = param0.charAt(var5);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ia.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(p param0, int[] param1, int param2) {
        int var8 = 0;
        int dupTemp$0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_double = (double)(-param0.field_e + 100) / 15.0;
          var5 = 5;
          var3_double = var3_double / (double)var5;
          if (param2 != -14808) {
            var15 = (int[]) null;
            ia.a((p) null, (int[]) null, 42);
          }
          for (var6 = 0; var6 < var5; var6++) {
            boolean decompiledFrameRemainder0 = true;
            param0.field_l.b(var3_double, param0.field_c, 98);
            param0.a(8573);
            var7 = param0.field_j.b(param2 ^ 14804);
            if (param1[var7] == 2) {
              param0.field_l.b(-var3_double, param0.field_c, 126);
              param0.a(8573);
              if (param1[-ln.field_a.field_d + var7] != 2 &&
                64.0 <= param0.field_c &&
                192.0 >= param0.field_c) {
                param0.field_c = -param0.field_c + 128.0;
                param0.field_e = (int)(-((double)(-param0.field_e + 100) / 1.5) + 100.0);
              } else {
                if (param1[ln.field_a.field_d + var7] != 2 && (!(64.0 <= param0.field_c) ||
                  !(param0.field_c <= 192.0))) {
                  param0.field_e = (int)(-((double)(-param0.field_e + 100) / 1.5) + 100.0);
                  param0.field_c = -param0.field_c + 128.0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (param1[-1 + var7] != 2 &&
                    128.0 <= param0.field_c) {
                    param0.field_c = -param0.field_c + 256.0;
                    param0.field_e = (int)(-((double)(100 - param0.field_e) / 1.5) + 100.0);
                  } else {
                    if (param1[var7 + 1] != 2 &&
                      128.0 > param0.field_c) {
                      param0.field_e = (int)(100.0 - (double)(100 - param0.field_e) / 1.5);
                      param0.field_c = 256.0 - param0.field_c;
                    }
                  }
                }
              }
            }
          }
          param0.field_e = param0.field_e + 2;
          var6Lifetime1 = param0.field_j.field_e;
          var7Lifetime1 = param0.field_j.field_g;
          for (var8 = 0; var8 < rc.field_e; var8++) {
            var9 = re.field_n[var8];
            stackIn_30_0 = (var9.field_I <= 0) ? 0 : 1;
            var10 = stackIn_30_0;
            var11 = var9.field_I;
            if (var9.field_i == 0) {
              var11 = eh.field_g;
            }
            var12 = var9.field_j.field_e - var6Lifetime1;
            var13 = var9.field_j.field_g - var7Lifetime1;
            if (var12 < 0) {
              var12 = -var12;
            }
            if (var13 < 0) {
              var13 = -var13;
            }
            if (2 > var12 &&
              var13 < 2) {
              param0.field_e = param0.field_e + 20;
              var11--;
              if (0 >= var11 &&
                var9.field_i != 0 &&
                var10 != 0 &&
                var9.field_b &&
                var9.field_i != 27) {
                dupTemp$0 = al.field_U[2] + 1;
                al.field_U[2] = dupTemp$0;
                if (dupTemp$0 == 30) {
                  ti.a(248, (byte) 43, 7);
                }
              }
            }
            if (var9.field_i != 0) {
              if (var9.a(31, -108)) {
                var9.field_I = var11;
              }
            } else {
              if (param0.field_i != 35 &&
                param0.field_e < 40 &&
                var11 < eh.field_g) {
                ci.a(-var11 + eh.field_g, 125);
              }
            }
          }
          if (param0.field_e >= 100) {
            param0.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_61_0 = var3;
          stackIn_61_1 = new StringBuilder().append("ia.C(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(')').toString());
        }
    }

    final void c(int param0) {
        this.field_a = bm.field_c;
        this.field_g = rl.field_c;
        kf.a(kh.field_ib, 0, this.field_c, 0, kh.field_ib.length);
        kf.a(kh.field_U, 0, this.field_d, 0, kh.field_U.length);
        if (param0 != -32238) {
          return;
        }
        kf.a(kh.field_Q, 0, this.field_b, 0, kh.field_Q.length);
        this.field_f = uf.field_h;
        this.field_j = wa.field_p;
    }

    public static void a(byte param0) {
        field_k = null;
        field_i = null;
        int var1 = -105 / ((param0 - 39) / 35);
        field_l = null;
        field_e = null;
    }

    final void a(int param0) {
        this.field_g = -1;
        if (param0 != 0) {
          String var3 = (String) null;
          ia.a((String) null, 69);
        }
    }

    ia() {
        this.field_c = new int[kh.field_ib.length];
        this.field_d = new int[kh.field_U.length];
        this.field_b = new boolean[kh.field_Q.length];
        this.field_g = -1;
    }

    static {
        field_l = new bd[222];
        field_k = "Switch level set";
        field_i = new int[4];
    }
}
