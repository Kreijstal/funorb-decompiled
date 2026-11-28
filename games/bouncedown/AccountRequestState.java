/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRequestState {
    static int field_e;
    static IntrusiveDeque field_d;
    static BufferedSocket field_a;
    static RgbSprite field_b;
    static String field_c;

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 <= -87) {
          field_d = null;
          field_b = null;
          return;
        }
        PacketBuffer var2 = (PacketBuffer) null;
        AccountRequestState.a(-20, 44, (PacketBuffer) null);
        field_d = null;
        field_b = null;
    }

    final static String a(int param0, int param1, PacketBuffer param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.readUnsignedSmart(param1 ^ -2706);
            if (param0 < var3_int) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param2.position = param2.position + pa.field_d.a(var4, param2.position, 0, param2.payload, param1 ^ param1, var3_int);
            var5 = lh.decodeCp1252String(0, -3789, var3_int, var4);
            stackIn_4_0 = var5;
            return stackIn_4_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_6_0 = "Cabbage";
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("mf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 0) {
          return 12;
        }
        int var3 = param2 >>> 31;
        return -var3 + (param2 + var3) / param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_d = new IntrusiveDeque();
        field_c = "This entry doesn't match";
    }
}
