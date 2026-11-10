/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntPoint {
    static String field_b;
    static String field_c;
    int x;
    static int field_a;
    int y;
    static String field_e;

    public static void releaseStatics(byte param0) {
        if (param0 <= 96) {
          return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
    }

    public final String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    final static boolean hasAnyMask33(int param0, int param1, byte param2) {
        if (param2 < -69) {
          return (33 & param0) != 0 ? true : false;
        }
        IntPoint.releaseStatics((byte) 123);
        return (33 & param0) != 0 ? true : false;
    }

    final static byte[] unwrapByteStorage(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 != 13588) {
            field_c = (String) null;
          }
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof ByteStorage)) {
              throw new IllegalArgumentException();
            }
            var4 = (ByteStorage) (param0);
            stackIn_14_0 = var4.toByteArray(false);
            return stackIn_14_0;
          }
          var3 = (byte[]) (param0);
          if (!param2) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = lh.a(var3, 6711);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ir.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public IntPoint() {
    }

    IntPoint(int param0, int param1) {
        this.x = param0;
        this.y = param1;
    }

    static {
        field_b = "Wall Shadows: ";
        field_c = "I think the ceiling has a crush on you. Stay still too long, and you'll find yourself in a jam.";
        field_e = "All players have left <%0>'s game.";
    }
}
