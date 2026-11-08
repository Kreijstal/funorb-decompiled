/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static IntrusiveNodeHashTable field_c;
    static int field_b;
    static SceneWidget field_d;
    static int field_a;

    final static SceneWidget b(int param0) {
        int var1 = 103 % ((param0 - 47) / 39);
        return IconTextSceneWidget.field_Gb.field_Eb;
    }

    final static void a(int param0, byte param1) {
        CipherPacketBuffer var2 = he.field_e;
        var2.writeOpcode((byte) -81, param0);
        var2.writeByte(1, (byte) -101);
        if (param1 == -96) {
          var2.writeByte(3, (byte) -48);
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != 3) {
          return;
        }
        TextButton.a(TextButton.field_C, (byte) -104);
    }

    final static void c(int param0) {
        if (oj.field_i) {
          SecondaryNodeDeque.a(param0 + 11);
        }
        if (param0 != 3) {
          uc.a(-77);
          return;
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        int var1 = -58 % ((param0 + 15) / 35);
        field_d = null;
    }

    static {
        field_b = 0;
    }
}
