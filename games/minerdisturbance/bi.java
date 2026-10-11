/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends pi {
    int field_n;
    static int field_p;
    int field_o;
    static int field_q;

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          if (!ok.a(111, param2, param1)) {
            return false;
          }
          if (param0) {
            field_p = -19;
          }
          for (var3_int = 0; param2.length() > var3_int; var3_int++) {
            if (!rb.a((byte) 124, param2.charAt(var3_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("bi.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          for (var2_int = param0; var2_int < param1.length(); var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ra.a((byte) 121, (char) var3) &&
              !g.a((char) var3, (byte) -68)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("bi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        CharSequence var2;
        boolean stackIn_6_0 = false;
        if (param0 != -11) {
          var2 = (CharSequence) null;
          bi.a(false, true, (CharSequence) null);
        }
        stackIn_6_0 = (fh.field_b >= 10) && (13 <= af.field_u);
        return stackIn_6_0;
    }

    private bi() throws Throwable {
        throw new Error();
    }

    final static String a(int[] param0, boolean param1) {
        int var3 = 0;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        StringBuilder var5 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          var5 = new StringBuilder("[");
          var2 = var5;
          for (var3 = 0; var3 < param0.length; var3++) {
            if (0 != var3) {
              discarded$2 = var2.append(',');
            }
            discarded$3 = var5.append("0x").append(Integer.toHexString(param0[var3]));
          }
          if (param1) {
            stackIn_12_0 = var2.append(']').toString();
            return stackIn_12_0;
          }
          stackIn_10_0 = (String) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("bi.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = 4;
    }
}
