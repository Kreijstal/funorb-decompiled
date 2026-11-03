/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_a;
    static PacketBuffer field_b;

    final static PaletteBitmapFont a(byte[] param0, int param1) {
        PaletteBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        PaletteBitmapFont stackIn_5_0 = null;
        PaletteBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = new PaletteBitmapFont(param0, IntrusiveNode.field_b, e.field_b, ByteStorage.field_g, ge.field_c, fl.field_g, wo.field_f);
          re.b(param1 ^ -28512);
          if (param1 == -28628) {
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          stackIn_5_0 = (PaletteBitmapFont) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("ed.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 61 % ((-1 - param0) / 61);
        field_b = null;
    }

    static {
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
