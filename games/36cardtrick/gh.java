/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends IntrusiveNode {
    static PacketBuffer field_h;
    static boolean field_g;
    int field_m;
    static volatile boolean field_j;
    static RgbSprite[] field_n;
    static PcmStreamMixer field_k;
    static String field_i;
    int field_l;

    final static void a(byte param0, boolean param1) {
        nf.a(param1, (byte) -2, false);
        if (param0 != 59) {
          field_g = true;
        }
    }

    public static void clearStaticReferences(int param0) {
        field_n = null;
        field_i = null;
        field_k = null;
        field_h = null;
        if (param0 != 256) {
          field_i = (String) null;
        }
    }

    private gh() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1) {
        ml.field_a = param0;
        if (param1 != 31888) {
          gh.a((byte) -106, false);
        }
    }

    final static void a(RawPcmStream param0, byte param1) {
        try {
          if (param1 > -59) {
            gh.clearStaticReferences(-108);
          }
          aj.field_s.addLast(new gi(param0, param0), 27362);
          AccountCreationResultPanel.field_tb.b(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "gh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = true;
        field_g = false;
        field_i = "Close";
        field_h = new PacketBuffer(256);
    }
}
