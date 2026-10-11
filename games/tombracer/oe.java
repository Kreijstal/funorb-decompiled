/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends kca {
    static String field_l;
    private tra field_k;
    static int[] field_j;

    oe(tra param0, tra param1) {
        super(param0);
        try {
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof mk) {
            var3 = ((mk) ((Object) this.field_k)).a((byte) 92);
            if (var3 != null) {
              if (var3.b(-4666) == uh.field_k &&
                !param1.equals(this.field_k.field_o)) {
                stackIn_7_0 = bha.field_q;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.a(103);
              return stackIn_9_0;
            }
          }
          if (param0 != -1) {
            field_j = (int[]) null;
          }
          if (param1.equals(this.field_k.field_o)) {
            return null;
          }
          stackIn_15_0 = bha.field_q;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("oe.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_l = null;
        if (param0 != -112) {
          field_j = (int[]) null;
          field_j = null;
          return;
        }
        field_j = null;
    }

    final it a(byte param0, String param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        it stackIn_5_0 = null;
        it stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof mk) {
            var3 = ((mk) ((Object) this.field_k)).a((byte) 89);
            if (var3 != null &&
              var3.b(param0 ^ -4664) != uh.field_k) {
              stackIn_5_0 = fp.field_c;
              return stackIn_5_0;
            }
          }
          if (param0 != 14) {
            var4 = (String) null;
            this.a(63, (String) null);
          }
          if (!param1.equals(this.field_k.field_o)) {
            stackIn_11_0 = fp.field_c;
          } else {
            stackIn_11_0 = uh.field_k;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("oe.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_l = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_j = new int[]{0, 10, 11};
    }
}
