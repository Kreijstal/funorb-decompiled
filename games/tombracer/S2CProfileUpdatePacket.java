/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CProfileUpdatePacket implements GamePacket {
    private taa field_a;
    static AsyncRequest field_c;
    static int field_b;
    static boolean field_d;

    public static void releaseStatics(int param0) {
        if (param0 != 200) {
          S2CProfileUpdatePacket.releaseStatics(33);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final void applyTo(PlayerProfile param0, byte param1) {
        if (param1 > -10) {
          return;
        }
        try {
          param0.queueUpdate(8, this.field_a);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "bga.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        if (param0 != 200) {
          return;
        }
        try {
          this.field_a.a(param1, param0 ^ 32582);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "bga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        try {
          this.field_a = hka.a(0, param0);
          if (param1 != -19) {
            field_d = true;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "bga.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = 200;
        field_d = false;
    }
}
