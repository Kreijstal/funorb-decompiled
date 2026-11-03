/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static java.awt.Frame field_b;
    String field_f;
    Archive field_a;
    String field_c;
    String field_d;
    int field_e;

    final static boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        if (20 > DefensiveAi.field_p) {
          return true;
        }
        if (!QuaternaryNodeList.b(109)) {
          return true;
        }
        if (CheckboxPainter.field_n <= 0) {
          return false;
        }
        if (!dh.a(-12165)) {
          return true;
        }
        return false;
    }

    final static void a(gr param0, int param1, boolean param2) {
        CipherPacketBuffer var3 = null;
        if (param2) {
          return;
        }
        try {
          var3 = js.field_f;
          var3.h(param1, 255);
          var3.writeByte(param0.field_k, (byte) -81);
          var3.writeByte(param0.field_j, (byte) -124);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "uf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -18 / ((-32 - param0) / 52);
        field_b = null;
    }

    private uf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
