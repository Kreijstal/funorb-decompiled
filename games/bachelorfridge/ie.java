/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static int[] field_b;
    static int field_a;

    final static EventEffect a(PacketBuffer param0, boolean param1) {
        RuntimeException var2 = null;
        PacketBuffer var3 = null;
        dh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var3 = (PacketBuffer) null;
            ie.a((PacketBuffer) null, true);
          }
          stackIn_3_0 = new dh();
          return (EventEffect) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ie.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          PacketBuffer var2 = (PacketBuffer) null;
          ie.a((PacketBuffer) null, true);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = new int[4];
        field_a = 0;
    }
}
