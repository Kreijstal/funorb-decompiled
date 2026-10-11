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
        if (this.field_n) {
          throw new RuntimeException();
        }
        return this.field_p;
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 100) {
          jma.e(-2);
        }
    }

    final int e(byte param0) {
        if (param0 != -4) {
          jma.e(-40);
          if (!this.field_n) {
            return 100;
          }
          return 0;
        }
        if (!this.field_n) {
          return 100;
        }
        return 0;
    }

    jma() {
    }

    static {
        field_q = new Hashtable();
    }
}
