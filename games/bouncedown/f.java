/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static e field_a;

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          if (!ne.a(param1, param2, (byte) -33)) {
            return false;
          }
          if (param0 <= 94) {
            var5 = (CharSequence) null;
            f.a((byte) -52, (CharSequence) null, true);
          }
          var3_int = 0;
          while (true) {
            if (param1.length() <= var3_int) {
              return true;
            }
            if (uc.a(2, param1.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("f.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.math.BigInteger param0, boolean param1, wi param2, wi param3, java.math.BigInteger param4) {
        try {
          if (param1) {
            field_a = (e) null;
          }
          dk.a(param3.field_h, 0, param2, 0, param4, param0, param3.field_i);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "f.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static qh a(String param0, int param1) {
        RuntimeException var2 = null;
        qh stackIn_2_0 = null;
        qh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -96) {
            stackIn_2_0 = (qh) null;
            return stackIn_2_0;
          }
          if (pb.field_k.a(1000) &&
            !param0.equals(pb.field_k.a((byte) -101))) {
            pb.field_k = kg.a(2, param0);
          }
          stackIn_7_0 = pb.field_k;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("f.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -7355) {
          f.a(-56);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(char param0, boolean param1) {
        if (param1) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (param0 != 45) {
          return false;
        }
        return true;
    }

    static {
    }
}
