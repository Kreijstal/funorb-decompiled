/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends pm {
    static RenderSprite[] brassFrameSprites;
    static int field_f;

    ko(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(PacketBuffer param0, int param1, byte param2) {
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            int var3_int = param0.readUnsignedSmart(-129);
            if (param1 < var3_int) {
              var3_int = param1;
            }
            if (param2 > -100) {
              String stackIn_5_0 = (String) null;
              return stackIn_5_0;
            }
            byte[] var4 = new byte[var3_int];
            param0.position = param0.position + tq.field_i.a(0, var3_int, param0.payload, true, param0.position, var4);
            String var5 = hf.a(26, var3_int, 0, var4);
            String stackIn_7_0 = var5;
            return stackIn_7_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var3 = (Exception) (Object) decompiledCaughtException;
            String stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("ko.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final eo a(int param0) {
        if (param0 >= -51) {
          this.a(-83);
          return iu.field_h;
        }
        return iu.field_h;
    }

    public static void c(int param0) {
        brassFrameSprites = null;
        if (param0 != 0) {
          PacketBuffer var2 = (PacketBuffer) null;
          ko.a((PacketBuffer) null, 0, (byte) -22);
        }
    }

    static {
    }
}
