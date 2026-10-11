/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    int field_b;
    int field_a;

    final static void a(byte param0) {
        ed.field_t = null;
        hf.field_b = null;
        sc.field_e = false;
        qc.field_e = null;
        if (param0 != 9) {
          return;
        }
        nl.field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, le param4, int param5, int param6, int param7, int param8, le param9, int param10, int param11, db[] param12, db[] param13, int param14, boolean param15, int param16, db[] param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          gl.a(param4, param0, param1, param5, param20, param6, new wh(param17), param18, param9, new wh(param13), param14, param19, 0, param7, param2, param10, new wh(param12), param8, param16, param3, param11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("aj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param13 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ke a(byte param0, ke param1, ke param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        ke stackIn_6_0 = null;
        ke stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = param2.field_i.length;
          var8 = new byte[var3_int + param1.field_i.length];
          var7 = var8;
          var4 = var7;
          o.a(param2.field_i, 0, var8, 0, var3_int);
          o.a(param1.field_i, 0, var4, var3_int, param1.field_i.length);
          for (var5 = 0; var8.length > var5; var5++) {
            var4[var5] = (byte)(var4[var5] * 2);
          }
          if (param0 == -42) {
            stackIn_8_0 = new ke(param2.field_m, var8, 0, var3_int);
            return stackIn_8_0;
          }
          stackIn_6_0 = (ke) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("aj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    aj(int param0, int param1, int param2, int param3) {
        this.field_b = param3;
        this.field_a = param0;
    }

    static {
    }
}
