/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rb {
    static Random field_g;
    static String field_d;
    static int field_j;
    static volatile int field_a;
    static sg field_h;
    static long field_c;
    static byte[] field_i;
    static String field_e;
    static String field_b;
    static int field_f;

    final static int firstQuadrantAngle8192(int deltaX, int obfuscationGuard, int deltaY) {
        if (obfuscationGuard != 2048) {
          rb.firstQuadrantAngle8192(-3, -22, 110);
          if (deltaX < deltaY) {
            return 2048 - df.atanFixed16ToAngle8192(-3720, (deltaX << 16) / deltaY);
          }
          return df.atanFixed16ToAngle8192(-3720, (deltaY << 16) / deltaX);
        }
        if (deltaX < deltaY) {
          return 2048 - df.atanFixed16ToAngle8192(-3720, (deltaX << 16) / deltaY);
        }
        return df.atanFixed16ToAngle8192(-3720, (deltaY << 16) / deltaX);
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_e = null;
        field_i = null;
        field_b = null;
        field_g = null;
        if (param0 != -82) {
          rb.a((byte) -125);
        }
    }

    static {
        field_g = new Random();
        field_a = 0;
        field_e = "Macroing or use of bots";
        field_j = 2;
        field_b = "Press ESC for Options Menu";
        field_d = "Players";
    }
}
