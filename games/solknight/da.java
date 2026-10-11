/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private int field_e;
    private ha field_g;
    private Object[] field_c;
    static ff field_i;
    private boolean field_h;
    static ef field_d;
    static int field_f;
    private wd field_j;
    private Object[][] field_b;
    static fa[] field_a;

    final synchronized boolean b(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        if (!this.c((byte) -121)) {
          return false;
        }
        var2 = param0 ? 1 : 0;
        for (var3 = 0; var3 < this.field_g.field_f.length; var3++) {
          var4 = this.field_g.field_f[var3];
          if (this.field_c[var4] == null) {
            this.c(var4, 115);
            if (this.field_c[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final int b(int param0, int param1) {
        boolean discarded$0 = false;
        if (!this.a((byte) 48, param1)) {
          return 0;
        }
        if (param0 < 5) {
          discarded$0 = this.a(127, (int[]) (this.field_c[0]), 89, true);
        }
        return this.field_g.field_o[param1];
    }

    final int a(byte param0) {
        if (!this.c((byte) -121)) {
          return -1;
        }
        int var2 = -50 / ((-34 - param0) / 38);
        return this.field_g.field_o.length;
    }

    private final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!this.c((byte) -121)) {
          return false;
        }
        if (param1) {
          field_d = (ef) null;
        }
        if (param0 >= 0 &&
          param2 >= 0 &&
          param0 < this.field_g.field_o.length &&
          this.field_g.field_o[param0] > param2) {
          return true;
        }
        if (!ab.field_t) {
          return false;
        }
        throw new IllegalArgumentException(param0 + " " + param2);
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -84, param2)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_g.field_j[param2].a(0, bk.a(param1 ^ param1, var5));
          if (this.a(param2, false, var4_int)) {
            return var4_int;
          }
          stackIn_6_0 = -1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("da.DA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int d(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c((byte) -121)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_e.a(0, bk.a(param0 ^ param0, var4));
          stackIn_4_0 = this.b((byte) 100, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("da.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.a((byte) -117, param0)) {
          return false;
        }
        if (this.field_c[param0] != null) {
          return true;
        }
        if (param1 != -1) {
          return false;
        }
        this.c(param0, 115);
        if (this.field_c[param0] != null) {
          return true;
        }
        return false;
    }

    final boolean a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c((byte) -121)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (!param2) {
            da.a(((boolean[]) (((Object[]) (this.field_c[4]))[1]))[4]);
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_g.field_e.a(0, bk.a(0, var6));
          if (!this.a((byte) 98, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_g.field_j[var4_int].a(0, bk.a(0, var7));
          stackIn_11_0 = this.a(100, var4_int, var5);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("da.N(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (!lh.field_l) {
          throw new IllegalStateException();
        }
        kk.field_c = param0;
        qa.a(false, -111);
        fj.field_i = 0;
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.a((byte) -114, param1)) {
          return 0;
        }
        if (param0 <= 78) {
          field_f = 108;
        }
        if (null != this.field_c[param1]) {
          return 100;
        }
        return this.field_j.a(param1, (byte) 31);
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param1, false, param2)) {
          return false;
        }
        if (this.field_b[param1] != null &&
          null != this.field_b[param1][param2]) {
          return true;
        }
        if (this.field_c[param1] != null) {
          return true;
        }
        this.c(param1, 107);
        if (this.field_c[param1] != null) {
          return true;
        }
        if (param0 != 100) {
          ((byte[]) (((Object[]) (this.field_c[5]))[7]))[0] = (byte) 125;
          return false;
        }
        return false;
    }

    final int c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c((byte) -121)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_e.a(0, bk.a(0, var4));
          if (param0 < 69) {
            stackIn_6_0 = ((int[]) (((Object[]) (this.field_c[5]))[1]))[1];
            return stackIn_6_0;
          }
          if (this.a((byte) -76, var3_int)) {
            return var3_int;
          }
          stackIn_10_0 = -1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("da.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!this.c((byte) -121)) {
          return false;
        }
        int var3 = -119 / ((param0 + 33) / 42);
        if (param1 >= 0 &&
          param1 < this.field_g.field_o.length &&
          this.field_g.field_o[param1] != 0) {
          return true;
        }
        if (!ab.field_t) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    public static void b(int param0) {
        if (param0 > -121) {
          da.a(true);
        }
        field_a = null;
        field_d = null;
        field_i = null;
    }

    final synchronized boolean c(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -121) {
          discarded$0 = this.a((byte) 64, 117);
        }
        if (null != this.field_g) {
          return true;
        }
        this.field_g = this.field_j.c(-68);
        if (null == this.field_g) {
          return false;
        }
        this.field_c = new Object[this.field_g.field_l];
        this.field_b = new Object[this.field_g.field_l][];
        return true;
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 12257) {
          return (byte[]) null;
        }
        return this.a((int[]) null, param0, -17, param2);
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var6Lifetime1;
        try {
          if (!this.a(param1, false, param3)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((null == this.field_b[param1] ||
            null == this.field_b[param1][param3]) && !this.a(param3, param0, param1, false)) {
            this.c(param1, 119);
            if (!this.a(param3, param0, param1, false)) {
              stackIn_10_0 = null;
              return (byte[]) (stackIn_10_0);
            }
          }
          if (null == this.field_b[param1]) {
            throw new RuntimeException("");
          }
          if (null != this.field_b[param1][param3]) {
            var7 = tk.a((byte) -59, false, this.field_b[param1][param3]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 == this.field_e) {
              this.field_b[param1][param3] = null;
              if (1 == this.field_g.field_o[param1]) {
                this.field_b[param1] = null;
              }
            } else {
              if (this.field_e != 2) {
                var6 = 91 / ((param2 - 50) / 45);
                return (byte[]) (var5);
              }
              this.field_b[param1] = null;
            }
          }
          var6Lifetime1 = 91 / ((param2 - 50) / 45);
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("da.U(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw fc.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized byte[] a(int param0, byte param1) {
        int var3 = -45 % ((5 - param1) / 37);
        if (!this.c((byte) -121)) {
          return null;
        }
        if (this.field_g.field_o.length == 1) {
          return this.b(0, 12257, param0);
        }
        if (!this.a((byte) 74, param0)) {
          return null;
        }
        if (this.field_g.field_o[param0] == 1) {
          return this.b(param0, 12257, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 < 93) {
          ((boolean[]) (this.field_c[2]))[21] = true;
        }
        if (this.field_h) {
          this.field_c[param0] = this.field_j.a(param0, 0);
        } else {
          this.field_c[param0] = w.a(this.field_j.a(param0, 0), (byte) 7, false);
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c((byte) -121)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param1 = param1.toLowerCase();
          if (param0 != 4) {
            this.field_b = (Object[][]) null;
          }
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_g.field_e.a(0, bk.a(0, var6));
          if (!this.a((byte) 106, var4_int)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_g.field_j[var4_int].a(0, bk.a(0, var7));
          stackIn_9_0 = this.b(var4_int, 12257, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("da.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized int b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param0 != -66) {
          return 45;
        }
        if (!this.c((byte) -121)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_c.length; var4++) {
          if (this.field_g.field_r[var4] > 0) {
            var3 = var3 + this.b((byte) 94, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          while (true) {
            param0--;
            if (param0 < 0) {
              if (param1 <= 14) {
                da.b(-34);
              }
              return;
            }
            var17 = param2;
            var10 = var17;
            var11 = param7;
            var12 = param9;
            var13 = param6;
            var14 = param8;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = (fi.a(var14, 33448895) >> 17) + fi.a(var12 >> 1, 16711680) - (-(fi.a(var13, 33423626) >> 9) - var15);
            param8 = param8 + param4;
            param7++;
            param9 = param9 + param5;
            param6 = param6 + param3;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("da.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(int param0) {
        sg.field_b[192] = 28;
        sg.field_b[222] = 58;
        sg.field_b[520] = 59;
        if (param0 != 0) {
          da.a(-106);
        }
        sg.field_b[92] = 74;
        sg.field_b[47] = 73;
        sg.field_b[91] = 42;
        sg.field_b[44] = 71;
        sg.field_b[93] = 43;
        sg.field_b[59] = 57;
        sg.field_b[46] = 72;
        sg.field_b[45] = 26;
        sg.field_b[61] = 27;
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c((byte) -121)) {
            return false;
          }
          var3_int = -60 / ((param0 + 39) / 59);
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4 = this.field_g.field_e.a(0, bk.a(0, var5));
          if (var4 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("da.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, boolean param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        int[] stackIn_28_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        int stackIn_57_0 = 0;
        gb stackIn_57_1 = null;
        boolean stackIn_58_2 = false;
        int stackIn_100_0 = 0;
        gb stackIn_100_1 = null;
        boolean stackIn_101_2 = false;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
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
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        gb var26 = null;
        byte[] var27 = null;
        int[] var29 = null;
        gb var30 = null;
        byte[][] var31 = null;
        gb var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = SolKnight.field_L ? 1 : 0;
        try {
          if (!this.a((byte) 104, param2)) {
            return false;
          }
          if (null == this.field_c[param2]) {
            return false;
          }
          var5_int = this.field_g.field_r[param2];
          var34 = this.field_g.field_a[param2];
          var24 = var34;
          var6 = var24;
          if (this.field_b[param2] == null) {
            array$0 = new Object[this.field_g.field_o[param2]];
            this.field_b[param2] = array$0;
          }
          var7 = this.field_b[param2];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 != null) {
              var10 = var34[var9_int];
            } else {
              var10 = var9_int;
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
          if (param3) {
            this.field_e = 3;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            if (param1[0] == 0) {
              stackIn_28_0 = (int[]) (param1);
              decompiledFrameRemainder0 = (stackIn_28_0[1] != 0 ||
                0 != param1[2] ||
                param1[3] != 0);
            }
            if (decompiledFrameRemainder0) {
              var35 = tk.a((byte) -76, true, this.field_c[param2]);
              var25 = var35;
              var9 = var25;
              var26 = new gb(var35);
              var26.a(param1, 5, 5838, var26.field_l.length);
              decompiledFrameRemainder1 = false;
            }
          }
          if (decompiledFrameRemainder1) {
            var9 = tk.a((byte) -110, false, this.field_c[param2]);
          }
          try {
            var36 = jh.a(var9, 6);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_38_0 = var11_ref_RuntimeException;
            stackIn_38_1 = new StringBuilder();
            stackIn_39_2 = (param1 != null);
            throw fc.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(gl.a(var9.length, var9, 125)).append(" ").append(gl.a(var9.length - 2, var9, 125)).append(" ").append(this.field_g.field_b[param2]).append(" ").append(this.field_g.field_d).toString());
          }
          if (this.field_h) {
            this.field_c[param2] = null;
          }
          if (var5_int > 1) {
            if (this.field_e == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * var12 * var5_int;
              var32 = new gb(var43);
              var14 = 0;
              var32.field_m = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.e(true);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param0) {
                    var15 = var19;
                    var14 = var14 + var17;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var14Lifetime1 = 0;
              var32.field_m = var11;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  stackIn_100_0 = var19;
                  stackIn_100_1 = var32;
                  stackIn_101_2 = !(param3);
                  var19 = stackIn_100_0 + ((gb) (Object) stackIn_100_1).e(stackIn_101_2);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param0 == var21) {
                    fk.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * (var12 * var5_int);
              var30 = new gb(var43);
              var30.field_m = var11;
              var38 = new int[var5_int];
              var29 = var38;
              var14_ref_int__ = var29;
              for (var15 = 0; var12 > var15; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  stackIn_57_0 = var16;
                  stackIn_57_1 = var30;
                  stackIn_58_2 = !(param3);
                  var16 = stackIn_57_0 + ((gb) (Object) stackIn_57_1).e(stackIn_58_2);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var5_int > var16; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var30.field_m = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var30.e(true);
                  fk.a(var43, var16, var39[var19], var38[var19], var18);
                  var16 = var16 + var18;
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_e == 0) {
                  var7[var18] = w.a(var39[var17], (byte) 7, false);
                } else {
                  var7[var18] = var39[var17];
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_e == 0) {
              var7[var11] = w.a(var36, (byte) 7, false);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_113_0 = var5;
          stackIn_113_1 = new StringBuilder().append("da.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(boolean param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = vd.a(param1, 0, param1.length, 160);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("da.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c((byte) -121)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_e.a(param0 ^ param0, bk.a(0, var4));
          stackIn_4_0 = this.a(var3_int, -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("da.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    da(wd param0, boolean param1, int param2) {
        this.field_g = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_j = param0;
          this.field_e = param2;
          this.field_h = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_i = new ff(6, 0, 4, 2);
        field_d = new ef();
        field_a = new fa[255];
        for (var0 = 0; field_a.length > var0; var0++) {
          field_a[var0] = new fa();
        }
    }
}
