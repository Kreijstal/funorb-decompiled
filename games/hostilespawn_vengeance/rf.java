/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf implements nn {
    private int field_g;
    static int field_f;
    private int field_h;
    static String[] field_s;
    private int field_a;
    static int field_c;
    private int field_j;
    private int field_k;
    private int field_r;
    private vm field_n;
    static String field_e;
    private int field_d;
    private int field_l;
    static volatile int field_o;
    private int field_b;
    static String field_q;
    private int field_m;
    static byte[][] field_i;
    private int field_p;

    final static sm a(int param0, java.awt.Component param1, int param2, boolean param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          sm var5 = null;
          wa var5_ref = null;
          sm stackIn_2_0 = null;
          sm stackIn_4_0 = null;
          wa stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param3) {
                stackIn_2_0 = (sm) null;
                return stackIn_2_0;
              }
              var4 = Class.forName("ff");
              var5 = (sm) (var4.newInstance());
              var5.a(param2, param1, 9484, param0);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new wa();
              ((sm) ((Object) var5_ref)).a(param2, param1, 9484, param0);
              stackIn_6_0 = var5_ref;
              return (sm) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("rf.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        ag stackIn_3_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vf var11 = null;
        try {
          if (param3 instanceof vf) {
            stackIn_3_0 = (ag) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (vf) (stackIn_3_0);
          if (var11 != null) {
            param4 = param4 & var11.field_D;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          si.c(param1 + param3.field_v, param0 + param3.field_m, param3.field_s, param3.field_x, this.field_h);
          var8 = param1 + param3.field_v + this.field_r;
          var9 = this.field_d + (param0 + param3.field_m);
          si.b(var8, var9, this.field_a, this.field_k, 5592405);
          si.c(var8, var9, this.field_a, this.field_k, var7);
          if (param2 != 15430) {
            rf.a(true, '\0');
          }
          if (var11.field_A) {
            si.g(var8, var9, this.field_a + var8, this.field_k + var9, 1);
            si.g(this.field_a + var8, var9, var8, this.field_k + var9, 1);
          }
          if (null == this.field_n) {
            return;
          }
          var10 = this.field_j + (this.field_r + this.field_a);
          this.field_n.a(param3.field_n, param3.field_v + param1 + var10, this.field_l + (param0 + param3.field_m), param3.field_s - this.field_j - var10, param3.field_x - (this.field_j << 1), this.field_g, this.field_m, this.field_b, this.field_p, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("rf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final static bd a(int param0) {
        int var4_int = 0;
        bd var4 = null;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        int var1 = hd.field_r[0] * sf.field_X[0];
        byte[] var7 = ja.field_e[0];
        int[] var3 = new int[var1];
        bd var4Lifetime1;
        int var4_intLifetime1;
        if (param0 <= -43) {
          for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = bf.field_d[ua.a((int) var7[var4_int], 255)];
          }
          var4 = new bd(ra.field_a, GameCanvas.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var3);
          uj.d(92);
          return var4;
        }
        rf.b(-63);
        for (var4_intLifetime1 = 0; var1 > var4_intLifetime1; var4_intLifetime1++) {
          var3[var4_intLifetime1] = bf.field_d[ua.a((int) var7[var4_intLifetime1], 255)];
        }
        var4Lifetime1 = new bd(ra.field_a, GameCanvas.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var3);
        uj.d(92);
        return var4Lifetime1;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 == 5592405) {
          field_s = null;
          field_i = (byte[][]) null;
          field_q = null;
          return;
        }
        field_e = (String) null;
        field_s = null;
        field_i = (byte[][]) null;
        field_q = null;
    }

    final static boolean a(boolean param0, char param1) {
        boolean stackIn_27_0 = false;
        if (!param0) {
          return true;
        }
        if (48 > param1) {
          if (65 > param1) {
            if (97 <= param1 &&
              param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_27_0 = (97 <= param1) && (param1 <= 122);
          return stackIn_27_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (65 <= param1 &&
          param1 <= 90) {
          return true;
        }
        if (97 > param1) {
          return false;
        }
        if (param1 > 122) {
          return false;
        }
        return true;
    }

    rf(vm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_p = 1;
        this.field_b = 1;
        try {
          this.field_a = param8;
          this.field_m = param4;
          this.field_k = param7;
          this.field_d = param6;
          this.field_n = param0;
          this.field_j = param1;
          this.field_g = param3;
          this.field_l = param2;
          this.field_h = param9;
          this.field_r = param5;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = 0;
        field_q = "Walk onto the platform to bring the reactor online.";
        field_s = new String[]{"Auto gun", "Close-range assault gun", "Flamethrower", "Railgun", "Rocket launcher", "Plasma cannon", "Grenade launcher"};
        field_o = 0;
        field_i = new byte[1000][];
    }
}
