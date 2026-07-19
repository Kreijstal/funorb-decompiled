/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk {
    static Random field_d;
    static String field_c;
    static int field_b;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, boolean param2, byte param3) {
        int var4 = -21 / ((param3 - 8) / 34);
        return gb.a(-1);
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            discarded$0 = gk.a(103, 65, true, (byte) -104);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          if (this != da.field_g) {
            if (da.field_f != this) {
              if (eh.field_b == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        field_d = new Random();
        field_c = "Player names can be up to 12 letters, numbers and underscores";
        field_b = 0;
    }
}
