/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends sk {
    byte field_y;
    int field_s;
    static da field_u;
    PacketBuffer field_v;
    static PacketBuffer field_z;
    static double field_w;
    static int field_t;
    static String field_x;

    final int a(byte param0) {
        if (param0 != -126) {
          return -80;
        }
        if (null == this.field_v) {
          return 0;
        }
        return this.field_v.position * 100 / (-this.field_y + this.field_v.payload.length);
    }

    final byte[] f(int param0) {
        if (this.field_m) {
          throw new RuntimeException();
        }
        if (this.field_v.position < this.field_v.payload.length - this.field_y) {
          throw new RuntimeException();
        }
        if (param0 == 0) {
          return this.field_v.payload;
        }
        this.a((byte) 76);
        return this.field_v.payload;
    }

    public static void i(int param0) {
        field_u = null;
        field_x = null;
        if (param0 >= -69) {
          field_w = 1.4661964452487954;
          field_z = null;
          return;
        }
        field_z = null;
    }

    ic() {
    }

    static {
        field_z = new PacketBuffer(256);
        field_w = Math.atan2(1.0, 0.0);
        field_t = -1811547031;
        field_x = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
