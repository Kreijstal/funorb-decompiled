/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static jq field_c;
    static String field_a;
    static int[] field_b;

    public static void a(int param0) {
        if (param0 != -27153) {
          return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (param0) {
          if (ol.a(-128)) {
            param1 = false;
          }
          kq.a((byte) -57, param1);
          ms.b(20975);
          return;
        }
        field_a = (String) null;
        if (ol.a(-128)) {
          param1 = false;
        }
        kq.a((byte) -57, param1);
        ms.b(20975);
    }

    final static void a(fs param0, ob param1, int param2) {
        RuntimeException var3 = null;
        ob var4 = null;
        ob stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = (ob) (param1);
          if (param0 == null) {
            stackIn_3_1 = -1;
          } else {
            stackIn_3_1 = param0.field_x;
          }
          ((ob) (Object) stackIn_2_0).c(stackIn_3_1, (byte) -97);
          if (param2 == 9555) {
            return;
          }
          var4 = (ob) null;
          im.a((fs) null, (ob) null, -30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("im.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 75 % ((52 - param1) / 51);
          stackIn_1_0 = nn.a(-105, param0, false);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("im.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Withdraw request to join <%0>'s game";
        field_c = new jq();
    }
}
