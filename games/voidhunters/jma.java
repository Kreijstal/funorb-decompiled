/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jma extends jtb {
    int field_r;
    static Hashtable field_q;
    fo field_o;
    byte[] field_p;

    final byte[] a(int param0) {
        int var2 = -61 % ((17 - param0) / 58);
        if (((jma) this).field_n) {
            throw new RuntimeException();
        }
        return ((jma) this).field_p;
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 100) {
            jma.e(-2);
        }
    }

    final int e(byte param0) {
        if (param0 == -4) {
          if (((jma) this).field_n) {
            return 0;
          } else {
            return 100;
          }
        } else {
          jma.e(-40);
          if (((jma) this).field_n) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    jma() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new Hashtable();
    }
}
