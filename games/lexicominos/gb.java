/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    private String field_c;
    private boolean field_b;
    static int field_a;
    static boolean field_d;

    gb(String param0, boolean param1) {
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_c = param0;
          if (null == this.field_c) {
            this.field_c = "";
          }
          stackIn_6_1 = (param1);
          this.field_b = stackIn_6_1;
          if (this.field_c.length() == 0) {
            this.field_b = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gb.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static aj a(int param0, int param1) {
        int var3 = 0;
        aj[] var2;
        int var4;
        aj[] var5;
        var4 = Lexicominos.field_L ? 1 : 0;
        var5 = ah.a((byte) -55);
        var2 = var5;
        if (param1 != 2121865922) {
          gb.a(71, -115);
        }
        for (var3 = 0; var3 < var5.length; var3++) {
          if (var5[var3].field_a == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    final static we[] a(byte param0, ab param1) {
        int var5 = 0;
        we[] stackIn_6_0 = null;
        we[] stackIn_13_0 = null;
        we[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        we[] var4 = null;
        we var6 = null;
        int var7 = 0;
        ab var8 = null;
        ei var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 >= -66) {
            var8 = (ab) null;
            gb.a((byte) 108, (ab) null);
          }
          if (!param1.b(0)) {
            stackIn_6_0 = new we[]{};
            return stackIn_6_0;
          }
          var9 = param1.a((byte) 127);
          while (var9.field_b == 0) {
            ge.a(0, 10L);
          }
          if (2 == var9.field_b) {
            stackIn_13_0 = new we[]{};
            return stackIn_13_0;
          }
          var11 = (int[]) (var9.field_g);
          var10 = var11;
          var3 = var10;
          var4 = new we[var11.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new we();
            var4[var5] = var6;
            var6.field_a = var3[var5 << 2];
            var6.field_e = var3[1 + (var5 << 2)];
            var6.field_f = var3[(var5 << 2) + 2];
            var6.field_k = var3[(var5 << 2) + 3];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("gb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    gb(String param0) {
        this(param0, false);
    }

    final boolean a(int param0) {
        if (param0 != 15738) {
          field_a = -125;
        }
        return this.field_b;
    }

    final String b(int param0) {
        if (param0 != 25545) {
          return (String) null;
        }
        return this.field_c;
    }

    static {
        field_d = false;
    }
}
