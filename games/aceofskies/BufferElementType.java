/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BufferElementType {
    int field_c;
    static BufferElementType field_a;
    static BufferElementType field_j;
    static BufferElementType field_e;
    static BufferElementType field_h;
    static BufferElementType field_b;
    static BufferElementType field_f;
    static BufferElementType field_d;
    static BufferElementType field_i;
    static SpriteData[] achievementSpriteData;
    static int field_k;

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = -114 % ((-75 - param2) / 38);
        return 0 != (param1 & 2048) ? true : false;
    }

    public static void a(byte param0) {
        field_d = null;
        achievementSpriteData = null;
        field_f = null;
        field_i = null;
        field_e = null;
        field_b = null;
        if (param0 == -86) {
          field_a = null;
          field_j = null;
          field_h = null;
          return;
        }
        BufferElementType.a(119);
        field_a = null;
        field_j = null;
        field_h = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          rr.a("", (byte) -112, param1);
          if (!param0) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            BufferElementType.a(true, (java.applet.Applet) null);
          }
          jn.a((byte) 120, param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "la.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private BufferElementType(int param0) {
        this.field_c = param0;
    }

    final static String a(int param0) {
        if (jq.field_fb == ht.field_k) {
          return BoundedRandomAccessFile.field_g;
        }
        if (nb.field_c == jq.field_fb) {
          return OpenGlBuffer.field_j;
        }
        if (param0 != 4) {
          field_h = (BufferElementType) null;
          if (!gm.field_x.a(false)) {
            return OpenGlBuffer.field_j;
          }
          return se.field_a;
        }
        if (!gm.field_x.a(false)) {
          return OpenGlBuffer.field_j;
        }
        return se.field_a;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new BufferElementType(1);
        field_j = new BufferElementType(2);
        field_e = new BufferElementType(4);
        field_h = new BufferElementType(1);
        field_b = new BufferElementType(2);
        field_f = new BufferElementType(4);
        field_d = new BufferElementType(2);
        field_i = new BufferElementType(4);
    }
}
