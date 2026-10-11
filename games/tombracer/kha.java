/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kha {
    static String field_a;
    int field_d;
    int[] field_c;
    int field_b;

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        if (!param0) {
          this.field_d = -57;
        }
        if (this.field_c != null &&
          0 != this.field_c.length) {
          stackIn_6_0 = this.field_c[-1 + this.field_c.length];
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_c == null) {
          return 0;
        }
        if (0 == this.field_c.length) {
          return 0;
        }
        for (var3 = 1; var3 < this.field_c.length; var3++) {
          if (param0 < (this.field_c[var3 - 1] + this.field_c[var3] >> 1)) {
            return var3 - 1;
          }
        }
        if (param1 != -1) {
          field_a = (String) null;
        }
        return -1 + this.field_c.length;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
          field_a = (String) null;
        }
    }

    final static java.awt.Frame a(fia param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_33_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        Object stackIn_39_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        dh[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        dh[] var10 = null;
        naa var11 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param0.a((byte) 69)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param4 == 0) {
            var10 = af.a(66, param0);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_a == param5 &&
                param2 == var10[var8].field_c && ((param1 == 0 ||
                var10[var8].field_b == param1) &&
                (var7_int == 0 ||
                !(var10[var8].field_d <= param4)))) {
                var7_int = 1;
                param4 = var10[var8].field_d;
              }
            }
            if (var7_int == 0) {
              stackIn_27_0 = null;
              return (java.awt.Frame) (stackIn_27_0);
            }
          }
          var11 = param0.a(param4, param1, param2, (byte) 66, param5);
          while (var11.field_b == 0) {
            vja.a(0, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_f);
          if (var7 == null) {
            stackIn_33_0 = null;
            return (java.awt.Frame) (stackIn_33_0);
          }
          if (param3 != 10) {
            stackIn_36_0 = (java.awt.Frame) null;
            return stackIn_36_0;
          }
          if (var11.field_b != 2) {
            stackIn_41_0 = var7;
            return stackIn_41_0;
          }
          vf.a(31637, param0, var7);
          stackIn_39_0 = null;
          return (java.awt.Frame) (stackIn_39_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_44_0 = var6_ref;
          stackIn_44_1 = new StringBuilder().append("kha.A(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    kha(int param0, int param1, int param2) {
        this.field_b = param1;
        this.field_d = param0;
        this.field_c = new int[param2 + 1];
    }

    static {
        field_a = "500+";
    }
}
