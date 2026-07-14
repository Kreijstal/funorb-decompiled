/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hj {
    static int field_f;
    static String field_h;
    int field_d;
    static ok field_g;
    String field_b;
    static String field_a;
    static nh field_e;
    static gk field_i;
    static String field_c;

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 != -20385) {
          field_e = null;
          field_e = null;
          field_h = null;
          return;
        } else {
          field_e = null;
          field_h = null;
          return;
        }
    }

    abstract java.net.Socket a(boolean param0) throws IOException;

    final static int a(int param0, boolean param1, String param2) {
        if (param0 == 12286) {
          if (!param1) {
            return k.field_H.b(param2);
          } else {
            return sl.field_o.b(param2);
          }
        } else {
          field_g = null;
          if (!param1) {
            return k.field_H.b(param2);
          } else {
            return sl.field_o.b(param2);
          }
        }
    }

    final static String a(String param0, vj param1, String param2, int param3, int param4) {
        if (param4 != 17733) {
            field_h = null;
            if (!(param1.a(0))) {
                return param0;
            }
            return param2 + " - " + param1.a(71, param3) + "%";
        }
        if (!(param1.a(0))) {
            return param0;
        }
        return param2 + " - " + param1.a(71, param3) + "%";
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 31619) {
            return null;
        }
        return new java.net.Socket(((hj) this).field_b, ((hj) this).field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Music:";
        field_e = null;
        field_h = "Player Name: ";
        field_c = "Charge the Verne Cannon";
    }
}
