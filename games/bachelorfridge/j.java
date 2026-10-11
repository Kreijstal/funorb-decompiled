/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends bca {
    int[] field_q;
    int field_r;
    int field_s;

    j(lu param0) {
        super(param0);
        int var3 = 0;
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = param0.e((byte) 85);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int >= 0) {
              this.field_o.a(dca.a((byte) 102, param0), true);
              continue;
            }
            break;
          }
          this.field_r = param0.b(16711935);
          this.field_s = param0.b(16711935);
          this.field_q = new int[this.field_o.g(0)];
          for (var3 = 0; this.field_q.length > var3; var3++) {
            this.field_q[var3] = param0.b(16711935);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("j.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0, lu param1) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          super.a((byte) -63, param1);
          param1.d(this.field_r, 0);
          param1.d(this.field_s, 0);
          var7 = this.field_q;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            param1.d(var5, 0);
          }
          if (param0 <= -12) {
            return;
          }
          this.field_q = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("j.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        cma stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new cma(param1, this);
            return (at) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (at) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("j.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param4 = param4 - (lo.field_b.a(param0) >> 1);
          ce.a(!param5, param2, param1, param0, param4, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("j.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int[][] a(int param0, int param1, op param2, aga param3) {
        int[][] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int[][] var7 = null;
        int[][] var8 = null;
        int[][] var9 = null;
        int[][] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new int[17][17];
          var8 = var9;
          var7 = var8;
          var5 = var7;
          var9[6][7] = 1;
          var9[5][8] = 1;
          var9[7][7] = 1;
          var6 = 117 / ((55 - param1) / 46);
          var9[7][6] = 1;
          var9[6][9] = 1;
          var9[6][8] = 1;
          var9[7][10] = 1;
          var9[8][6] = 1;
          var9[7][8] = 1;
          var9[7][9] = 1;
          var9[8][7] = 1;
          var9[8][5] = 1;
          var9[8][9] = 1;
          var9[9][6] = 1;
          var9[8][11] = 1;
          var9[8][8] = 1;
          var9[8][10] = 1;
          var9[9][7] = 1;
          var9[9][8] = 1;
          var9[10][7] = 1;
          var9[9][9] = 1;
          var9[9][10] = 1;
          var9[10][9] = 1;
          var9[10][8] = 1;
          var9[11][8] = 1;
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    j(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        aga var3 = null;
        int var4 = 0;
        int var5 = 0;
        pp var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = BachelorFridge.field_y;
        try {
          var3 = this.field_l.a(8, param0);
          var5 = 0 / ((12 - param1) / 35);
          var4 = 0;
          var6 = (pp) (this.field_o.b((byte) 90));
          while (var6 != null) {
            if (!(var6 instanceof iv)) {
              var6.a(var3, param0, 12);
            } else {
              ((iv) (var6)).a((byte) -67, var3, param0, this.field_q[var4]);
            }
            var6 = (pp) (this.field_o.c(0));
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("j.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
