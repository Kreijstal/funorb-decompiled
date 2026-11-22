/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static int[] field_b;
    static String field_a;
    static int field_e;
    static boolean field_d;
    static dd field_f;
    static String field_c;

    abstract int pollRotation(int param0);

    final static int c(int param0) {
        if (param0 != 24178) {
          MouseWheelInput.c(61);
          return em.field_d;
        }
        return em.field_d;
    }

    abstract void detach(byte param0, java.awt.Component param1);

    abstract void attach(int param0, java.awt.Component param1);

    final static byte[] extractBytes(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param1 instanceof byte[]) {
            var3 = (byte[]) (param1);
            if (!param2) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            stackIn_6_0 = BoundedRandomAccessFile.copyByteArray(1, var3);
            return stackIn_6_0;
          }
          if (param0) {
            MouseWheelInput.a(-40);
          }
          if (!(param1 instanceof ByteStorage)) {
            throw new IllegalArgumentException();
          }
          var4 = (ByteStorage) (param1);
          stackIn_14_0 = var4.getBytes(256);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("jg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 <= -9) {
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        }
        MouseWheelInput.a(-122);
        field_a = null;
        field_f = null;
        field_b = null;
    }

    static {
        field_a = "Loading...";
        field_e = 0;
        field_c = "<%0>Anti-Gravity:<%1> when a flea touches one of these, the gravity is reversed and all the fleas fly upwards. Everything now works upside down, including balloons and springs. Touching it again turns the gravity back to normal.";
        field_b = new int[8192];
    }
}
