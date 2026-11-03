/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk extends DualLinkNode {
    int field_t;
    static boolean field_u;
    static Sprite field_r;
    static int field_x;
    static String[] field_v;
    static PortalView field_w;
    static int field_q;
    static PlatformTaskDispatcher field_y;
    static String field_s;

    final static void a(int param0, boolean param1, int param2, byte param3, java.awt.Component param4, PlatformTaskDispatcher param5, int param6, MidiPcmStream param7) {
        try {
          PcmPlayerService.configure(param0, param1, 10);
          rm.field_b = PcmPlayerService.create(param5, param4, 0, param2);
          CipherPacketBuffer.field_u = PcmPlayerService.create(param5, param4, 1, param6);
          bh.field_a = new PcmStreamMixer();
          DualLinkDeque.field_d = param6 * 1000 / param0;
          CipherPacketBuffer.field_u.setSourceStream(bh.field_a);
          wd.field_L = param7;
          wd.field_L.a(uk.field_S, (byte) 116);
          int var8_int = 37 / ((param3 - 49) / 49);
          rm.field_b.setSourceStream(wd.field_L);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "kk.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean f(int param0);

    kk(int param0) {
        this.field_t = param0;
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_v = null;
        field_r = null;
        field_y = null;
        field_w = null;
        field_s = null;
    }

    abstract Object e(int param0);

    final static void a(int param0, int param1, int param2) {
        CipherPacketBuffer var3 = ma.field_a;
        var3.b((byte) -35, param2);
        var3.writeByte(109, 3);
        var3.writeByte(-59, 10);
        var3.a(param1, (byte) -110);
        int var4 = -18 / ((-55 - param0) / 40);
    }

    static {
        field_u = false;
        field_r = new Sprite(270, 70);
        field_v = new String[255];
    }
}
