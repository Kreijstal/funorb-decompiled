/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends bca {
    static int field_s;
    static String[] field_q;
    static boolean field_r;

    final void a(op param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = -128 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        int var12Lifetime1;
        int var12Lifetime2;
        var14 = BachelorFridge.field_y;
        try {
          var9 = param3 - param0;
          var8_int = param5 + param0;
          for (var12 = param5; var8_int > var12; var12++) {
            hba.a(param7, param1, tj.field_b[var12], 7, param6);
          }
          if (param4 != -1) {
            jl.d(62);
          }
          var10 = param1 + param0;
          for (var12Lifetime1 = param3; var12Lifetime1 > var9; var12Lifetime1--) {
            hba.a(param7, param1, tj.field_b[var12Lifetime1], 7, param6);
          }
          var11 = param6 - param0;
          for (var12Lifetime2 = var8_int; var9 >= var12Lifetime2; var12Lifetime2++) {
            var18 = tj.field_b[var12Lifetime2];
            hba.a(param7, param1, var18, param4 + 8, var10);
            hba.a(param2, var10, var18, 7, var11);
            hba.a(param7, var11, var18, param4 ^ -8, param6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var8), "jl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        op var4 = null;
        maa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (op) null;
            this.a((op) null, -117);
          }
          stackIn_3_0 = new maa(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    jl(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = param0.e((byte) 78);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("jl.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    jl(int param0, nq param1) {
        super(param0, param1);
    }

    public static void d(int param0) {
        if (param0 != -17509) {
          field_r = false;
          field_q = null;
          return;
        }
        field_q = null;
    }

    static {
        field_s = -1;
        field_q = new String[]{"attack", "move", "passive", "special"};
    }
}
