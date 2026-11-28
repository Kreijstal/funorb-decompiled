/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int field_c;
    static BufferedSocket field_b;
    static int[] field_e;
    static ResourceArchive field_d;
    int field_a;

    final static void a(int param0, o param1, int param2) {
        BitPacketBuffer var3 = null;
        if (param2 != -31995) {
          return;
        }
        try {
          var3 = LoginPanel.field_D;
          var3.writeCipheredByte(false, param0);
          var3.writeByte(6389, 5);
          var3.writeByte(6389, 0);
          var3.writeShort(param1.field_j, param2 ^ 159700013);
          var3.writeByte(6389, param1.field_h);
          var3.writeByte(param2 + 38384, param1.field_n);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "nk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void clearStaticReferences(byte param0) {
        field_e = null;
        field_b = null;
        if (param0 != -119) {
          return;
        }
        field_d = null;
    }

    nk(int param0) {
        this.field_a = param0;
    }

    static {
        field_c = 0;
        field_e = new int[8192];
    }
}
