/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dna extends PrefabComponent {
    static SpriteData field_F;
    static String field_I;
    static String field_H;
    static boolean field_G;

    public static void releaseStatics(byte param0) {
        field_F = null;
        field_I = null;
        field_H = null;
        if (param0 < 78) {
          dna.releaseStatics((byte) 9);
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          field_H = (String) null;
          return false;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          field_F = (SpriteData) null;
          return true;
        }
        return true;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_G = false;
          return 7;
        }
        return 7;
    }

    final static GraphicsQuality getGraphicsQuality(int param0) {
        int var1 = -98 % ((81 - param0) / 34);
        return GameFontMetrics.field_f;
    }

    dna(Room param0, int param1) {
        super(param0, param1);
    }

    final static int lowByte(int param0, int param1) {
        if (param1 != 255) {
          field_H = (String) null;
          return 255 & param0;
        }
        return 255 & param0;
    }

    dna(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_F = (SpriteData) null;
          return false;
        }
        return false;
    }

    static {
        field_I = "GRAPHICS MODE";
        field_H = "Private";
        field_G = false;
    }
}
