/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private wf field_e;
    private lh field_h;
    static oj field_b;
    static boolean field_c;
    private int field_g;
    private Object[] field_f;
    private Object[][] field_d;
    private boolean field_a;

    final static int a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 125) {
            stackIn_4_0 = uj.a(param0, (byte) 98, 10, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = -69;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pf.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 30300) {
          String var2 = (String) null;
          pf.a(-33, (String) null);
        }
        field_b = null;
    }

    final static pb[] a(String param0, byte param1, String param2, pf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        pb[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = -50 / ((19 - param1) / 61);
          var4_int = param3.b(param0, (byte) -118);
          var6 = param3.a(var4_int, param2, (byte) -11);
          stackIn_1_0 = vf.a(param3, (byte) -78, var6, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("pf.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -36) {
          discarded$0 = this.c(((int[]) (((Object[]) (this.field_f[2]))[41]))[5], 113, 73);
        }
        if (this.field_h != null) {
          return true;
        }
        this.field_h = this.field_e.a(-107);
        if (this.field_h == null) {
          return false;
        }
        this.field_d = new Object[this.field_h.field_e][];
        this.field_f = new Object[this.field_h.field_e];
        return true;
    }

    final boolean b(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -36)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param2 != 42) {
            stackIn_5_0 = ((boolean[]) (this.field_f[5]))[1];
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_h.field_q.a(rl.a(var6, (byte) 58), param2 + 85);
          if (!this.b(var4_int, param2 ^ -7256)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_h.field_c[var4_int].a(rl.a(var7, (byte) 115), 65);
          stackIn_10_0 = this.b(0, var4_int, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pf.AA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, int param1, byte param2, int[] param3) {
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        try {
          if (!this.c(param1, param0, -21293)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((this.field_d[param1] == null ||
            this.field_d[param1][param0] == null) && !this.a(0, param1, param0, param3)) {
            this.a((byte) -78, param1);
            if (!this.a(0, param1, param0, param3)) {
              stackIn_9_0 = null;
              return (byte[]) (stackIn_9_0);
            }
          }
          if (this.field_d[param1] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_d[param1][param0]) {
            var7 = tf.a(2, false, this.field_d[param1][param0]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          var6 = -32 % ((param2 + 60) / 38);
          if (var5 != null) {
            if (this.field_g == 1) {
              this.field_d[param1][param0] = null;
              if (this.field_h.field_g[param1] == 1) {
                this.field_d[param1] = null;
              }
            } else {
              if (this.field_g == 2) {
                this.field_d[param1] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("pf.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ma.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static n a(int param0, ha param1) {
        int var7 = 0;
        n stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        try {
          var2_int = param1.e(8, 8);
          if (0 < var2_int) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = mh.a(param1, (byte) -124) ? 1 : 0;
          var4 = mh.a(param1, (byte) -44) ? 1 : 0;
          var5 = new n();
          var5.field_n = (short)param1.e(16, 8);
          var5.field_f = vh.a((byte) 87, var5.field_f, param0, param1);
          var5.field_b = vh.a((byte) 120, var5.field_b, 16, param1);
          var5.field_a = vh.a((byte) 91, var5.field_a, 16, param1);
          var5.field_C = (short)param1.e(16, 8);
          var5.field_l = vh.a((byte) 99, var5.field_l, 16, param1);
          var5.field_z = vh.a((byte) 96, var5.field_z, 16, param1);
          var5.field_m = vh.a((byte) 82, var5.field_m, 16, param1);
          if (var3 != 0) {
            var5.field_D = (short)param1.e(16, 8);
            var5.field_r = vh.a((byte) 106, var5.field_r, 16, param1);
            var5.field_e = vh.a((byte) 54, var5.field_e, 16, param1);
            var5.field_K = vh.a((byte) 34, var5.field_K, 16, param1);
            var5.field_M = vh.a((byte) 110, var5.field_M, 16, param1);
            var5.field_h = vh.a((byte) 84, var5.field_h, 16, param1);
            var5.field_v = vh.a((byte) 65, var5.field_v, 16, param1);
          }
          if (var4 != 0) {
            param1.e(16, 8);
            var5.field_H = vh.a((byte) 23, var5.field_H, 16, param1);
            var5.field_E = vh.a((byte) 88, var5.field_E, 16, param1);
            var5.field_P = vh.a((byte) 48, var5.field_P, 16, param1);
            var5.field_s = vh.a((byte) 84, var5.field_s, 16, param1);
            var5.field_I = vh.a((byte) 116, var5.field_I, 16, param1);
          }
          if (mh.a(param1, (byte) -79)) {
            var5.field_c = vh.a((byte) 22, var5.field_c, 16, param1);
          }
          if (mh.a(param1, (byte) -126)) {
            var5.field_g = wh.a(16, param1, var5.field_g, (byte) 50);
            var6 = 0;
            for (var7 = 0; var5.field_g.length > var7; var7++) {
              if ((255 & var5.field_g[var7]) > var6) {
                var6 = var5.field_g[var7] & 255;
              }
            }
            if (var6 == 0) {
              var5.field_g = null;
            } else {
              var5.field_N = (byte)(1 + var6);
            }
          }
          stackIn_23_0 = var5;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("pf.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -36)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_h.field_q.a(rl.a(var4, (byte) 80), 111);
          if (param0 != 0) {
            ((byte[]) (this.field_f[3]))[0] = (byte) 66;
          }
          stackIn_6_0 = this.a(var3_int, 0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final synchronized boolean c(int param0, int param1, int param2) {
        if (param2 != -21293) {
          return true;
        }
        if (!this.a((byte) -36)) {
          return false;
        }
        if (param0 < 0 ||
          param1 < 0 ||
          this.field_h.field_g.length <= param0 ||
          this.field_h.field_g[param0] <= param1) {
          if (!fe.field_b) {
            return false;
          }
          throw new IllegalArgumentException(param0 + " " + param1);
        }
        return true;
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != 0) {
          return 20;
        }
        if (!this.b(param0, -7294)) {
          return 0;
        }
        if (null != this.field_f[param0]) {
          return 100;
        }
        return this.field_e.a(0, param0);
    }

    final synchronized boolean c(byte param0) {
        int var3 = 0;
        byte[] discarded$0 = null;
        int var2;
        int var4;
        int var5;
        int[] var6;
        var5 = stellarshard.field_B;
        if (!this.a((byte) -36)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; var3 < this.field_h.field_k.length; var3++) {
          var4 = this.field_h.field_k[var3];
          if (this.field_f[var4] == null) {
            this.a((byte) -85, var4);
            if (this.field_f[var4] == null) {
              var2 = 0;
            }
          }
        }
        if (param0 != -111) {
          var6 = (int[]) null;
          discarded$0 = this.a(((int[]) (this.field_f[0]))[4], ((int[]) (this.field_f[0]))[6], (byte) 73, (int[]) null);
        }
        return var2 != 0;
    }

    final int a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param0, -7294)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          if (param2 != -11) {
            this.a((byte) -32, -9);
          }
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_h.field_c[param0].a(rl.a(var5, (byte) 88), param2 ^ 117);
          if (this.c(param0, var4_int, param2 ^ 21286)) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("pf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = stellarshard.field_B;
        if (!this.a((byte) -36)) {
          return 0;
        }
        var2 = 0;
        if (param0 != 1) {
          this.a((byte) 33, -59);
        }
        var3 = 0;
        for (var4 = 0; var4 < this.field_f.length; var4++) {
          if (this.field_h.field_p[var4] > 0) {
            var3 = var3 + this.a(var4, param0 ^ 1);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + gg.a(param1, "\n", "%0a", 97));
        if (param0 != 17651) {
          pf.a(20);
        }
    }

    final synchronized byte[] a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -36)) {
            return null;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param0);
          var4_int = this.field_h.field_q.a(rl.a(var7, (byte) 72), 0);
          if (param2 != -12) {
            var6 = (String) null;
            this.b((String) null, (String) null, (byte) 114);
          }
          if (!this.b(var4_int, -7294)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var8 = (CharSequence) ((Object) param1);
          var5 = this.field_h.field_c[var4_int].a(rl.a(var8, (byte) 97), -125);
          stackIn_9_0 = this.a(var5, 16, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("pf.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.c(param1, param2, -21293)) {
          return false;
        }
        if (param0 != 0) {
          this.field_e = (wf) null;
        }
        if (this.field_d[param1] != null &&
          null != this.field_d[param1][param2]) {
          return true;
        }
        if (null != this.field_f[param1]) {
          return true;
        }
        this.a((byte) 118, param1);
        if (null != this.field_f[param1]) {
          return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, byte param1) {
        int var3 = 48 / ((param1 - 72) / 51);
        if (!this.b(param0, -7294)) {
          return false;
        }
        if (this.field_f[param0] != null) {
          return true;
        }
        this.a((byte) -103, param0);
        if (null == this.field_f[param0]) {
          return false;
        }
        return true;
    }

    private final synchronized boolean b(int param0, int param1) {
        boolean discarded$0 = false;
        if (!this.a((byte) -36)) {
          return false;
        }
        if (param1 != -7294) {
          discarded$0 = this.b(((int[]) (((Object[]) (this.field_f[2]))[11]))[5], -36);
        }
        if (param0 >= 0 &&
          param0 < this.field_h.field_g.length &&
          0 != this.field_h.field_g[param0]) {
          return true;
        }
        if (!fe.field_b) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final boolean c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -36)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_q.a(rl.a(var4, (byte) 95), 122);
          if (0 > var3_int) {
            return false;
          }
          if (param1 == -116) {
            return true;
          }
          this.a((byte) 95);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("pf.O(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -36)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_q.a(rl.a(var4, (byte) 124), param1 - 17);
          if (param1 != -109) {
            this.field_h = (lh) null;
          }
          stackIn_6_0 = this.a(var3_int, (byte) -121);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pf.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(byte param0, int param1) {
        int var3 = -23 / ((param0 - 7) / 54);
        if (this.field_a) {
          this.field_f[param1] = this.field_e.a((byte) 35, param1);
        } else {
          this.field_f[param1] = ch.a(136, false, this.field_e.a((byte) 35, param1));
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != 16) {
          this.field_a = false;
        }
        return this.a(param0, param2, (byte) -98, (int[]) null);
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        ka var26 = null;
        byte[] var27 = null;
        ka var29 = null;
        ka var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14_intLifetime1;
        var22 = stellarshard.field_B;
        try {
          if (!this.b(param1, -7294)) {
            return false;
          }
          if (null == this.field_f[param1]) {
            return false;
          }
          var5_int = this.field_h.field_p[param1];
          var34 = this.field_h.field_b[param1];
          var24 = var34;
          var6 = var24;
          if (this.field_d[param1] == null) {
            array$0 = new Object[this.field_h.field_g[param1]];
            this.field_d[param1] = array$0;
          }
          var7 = this.field_d[param1];
          var8 = 1;
          for (var9_int = param0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null && (param3[0] != 0 ||
            param3[1] != 0 ||
            param3[2] != 0 ||
            0 != param3[3])) {
            var35 = tf.a(2, true, this.field_f[param1]);
            var25 = var35;
            var9 = var25;
            var26 = new ka(var35);
            var26.a(99, param3, 5, var26.field_r.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = tf.a(2, false, this.field_f[param1]);
          }
          try {
            var36 = sl.a((byte) -76, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var11_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param3 != null);
            throw ma.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(bg.a(var9.length, var9, 0)).append(" ").append(bg.a(var9.length - 2, var9, 0)).append(" ").append(this.field_h.field_l[param1]).append(" ").append(this.field_h.field_m).toString());
          }
          if (this.field_a) {
            this.field_f[param1] = null;
          }
          if (var5_int > 1) {
            if (2 == this.field_g) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var5_int * (var12 * 4);
              var29 = new ka(var43);
              var14_int = 0;
              var29.field_k = var11;
              var15_int = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.b(false);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param2) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var14_intLifetime1 = 0;
              var29.field_k = var11;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var29.b(false);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param2) {
                    ri.a(var43, var17, var44, var14_intLifetime1, var19);
                    var14_intLifetime1 = var14_intLifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15_int] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var5_int * (var12 * 4);
              var31 = new ka(var43);
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              var31.field_k = var11;
              for (var15_int = 0; var12 > var15_int; var15_int++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var31.b(false);
                  var14[var17] = var14[var17] + var16;
                }
              }
              var40 = new byte[var5_int][];
              var33 = var40;
              var15 = var33;
              for (var16 = 0; var5_int > var16; var16++) {
                array$1 = new byte[var39[var16]];
                var15[var16] = array$1;
                var39[var16] = 0;
              }
              var31.field_k = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var31.b(false);
                  ri.a(var43, var16, var40[var19], var39[var19], var18);
                  var14[var19] = var14[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 != null) {
                  var18 = var34[var17];
                } else {
                  var18 = var17;
                }
                if (this.field_g != 0) {
                  var7[var18] = var40[var17];
                } else {
                  var7[var18] = ch.a(136, false, var40[var17]);
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_g == 0) {
              var7[var11] = ch.a(ih.a(param0, 136), false, var36);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("pf.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -36)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param1 != -118) {
            var4 = (String) null;
            this.a((String) null, (String) null, (byte) 45);
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_q.a(rl.a(var5, (byte) 79), -128);
          if (this.b(var3_int, -7294)) {
            stackIn_9_0 = var3_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pf.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          if (param1 != 123) {
            CharSequence var3 = (CharSequence) null;
            pf.a((CharSequence) null, (byte) 96);
          }
          be.a(param0, "", (byte) 110);
          wf.a(63, param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pf.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    pf(wf param0, boolean param1, int param2) {
        this.field_h = null;
        try {
          if (param2 < 0 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_e = param0;
          this.field_g = param2;
          this.field_a = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new oj();
    }
}
