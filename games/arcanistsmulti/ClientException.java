/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static kc field_d;
    static h field_b;
    static int field_c;
    Throwable cause;
    static String field_j;
    String context;
    static int field_a;
    static String field_f;
    static String field_h;
    static int field_e;

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_b = (h) null;
          }
          if (fn.field_f == null) {
            return false;
          }
          stackIn_9_0 = !(param1.toLowerCase().indexOf(fn.field_f.toLowerCase()) < 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("p.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param2 == 11) {
          he.field_e.writeOpcode((byte) -124, 58);
          he.field_e.writeByte(param0, (byte) -82);
          he.field_e.writeShort(param6, (byte) -68);
          he.field_e.writeShort(param8, (byte) -68);
          he.field_e.writeShort(param7, (byte) -95);
          he.field_e.writeShort(param1, (byte) -59);
          he.field_e.writeShort(param4, (byte) -66);
          he.field_e.writeByte(param3, (byte) -35);
          he.field_e.writeByte(param5, (byte) -128);
          return;
        }
        String var10 = (String) null;
        ClientException.a(2, (String) null);
        he.field_e.writeOpcode((byte) -124, 58);
        he.field_e.writeByte(param0, (byte) -82);
        he.field_e.writeShort(param6, (byte) -68);
        he.field_e.writeShort(param8, (byte) -68);
        he.field_e.writeShort(param7, (byte) -95);
        he.field_e.writeShort(param1, (byte) -59);
        he.field_e.writeShort(param4, (byte) -66);
        he.field_e.writeByte(param3, (byte) -35);
        he.field_e.writeByte(param5, (byte) -128);
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 != -46) {
          return;
        }
        field_h = null;
        field_j = null;
        field_d = null;
        field_f = null;
    }

    ClientException(Throwable param0, String param1) {
        this.cause = param0;
        this.context = param1;
    }

    static {
        field_a = 48;
        field_f = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_h = "Bombs:";
    }
}
