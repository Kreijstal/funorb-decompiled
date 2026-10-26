/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static nf field_b;
    static BitmapFont field_c;
    static int field_a;

    final static boolean a(boolean param0, PacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.readUnsignedByte(119);
          if (!param0) {
            field_b = (nf) null;
          }
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("b.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != 28) {
          b.a(75, (byte) -109, false, 57);
        }
    }

    final static boolean b(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 > -41) {
          return false;
        }
        if (ml.field_p) {
          stackIn_7_0 = true;
        } else {
          if (cn.b(true)) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    final static int a(int param0, byte param1, boolean param2, int param3) {
        if (param1 != 72) {
          b.a((byte) 89);
          return de.a((byte) 92);
        }
        return de.a((byte) 92);
    }

    static {
        field_b = new nf();
        field_a = 2;
    }
}
