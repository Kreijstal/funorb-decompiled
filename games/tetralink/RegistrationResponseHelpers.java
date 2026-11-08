/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationResponseHelpers {
    static LoginProgressHelpers field_d;
    static double field_b;
    static int field_e;
    static int field_a;
    static java.applet.Applet field_c;
    static String field_f;

    final static AccountServerResult takeRegistrationResponse(int param0) {
        if (HotspotTextWidget.field_Q == AnimationPlayer.field_d) {
          throw new IllegalStateException();
        }
        if (field_d == AnimationPlayer.field_d) {
          AnimationPlayer.field_d = HotspotTextWidget.field_Q;
          return TextHighlightSpan.field_n;
        }
        if (param0 < 126) {
          return (AccountServerResult) null;
        }
        return null;
    }

    public static void releaseStatics(int param0) {
        if (param0 == -137) {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        RegistrationResponseHelpers.wrapBytes((byte[]) null, false, -83);
        field_f = null;
        field_d = null;
        field_c = null;
    }

    final static Object wrapBytes(byte[] param0, boolean param1, int param2) {
        DirectByteStorage var3 = null;
        RuntimeException var3_ref = null;
        DirectByteStorage stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param2 > ~param0.length) {
            var3 = new DirectByteStorage();
            ((ByteStorage) ((Object) var3)).setBytes(-10543, param0);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param1) {
            stackIn_10_0 = PacketFlushHelpers.copyBytes(-14074, param0);
            return stackIn_10_0;
          }
          stackIn_8_0 = (byte[]) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ik.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = new LoginProgressHelpers();
        field_b = Math.atan2(1.0, 0.0);
    }
}
