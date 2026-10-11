/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class um {
    static int field_h;
    static String field_c;
    static hb[] field_i;
    int field_f;
    static String field_d;
    static String field_e;
    String field_a;
    static rh field_g;
    static String[] field_b;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 == -27549) {
          return new java.net.Socket(this.field_a, this.field_f);
        }
        um.a(10, false);
        return new java.net.Socket(this.field_a, this.field_f);
    }

    final static void a(int param0, boolean param1) {
        ql.field_d = param0;
        if (param1) {
          um.a(-85, false);
          if (null != ob.field_Xb) {
            ob.field_Xb.c(param0, 24509);
            if (ek.field_b != null) {
              ek.field_b.a(param0, 256);
            }
            return;
          }
          if (ek.field_b != null) {
            ek.field_b.a(param0, 256);
          }
          return;
        }
        if (null == ob.field_Xb) {
          if (ek.field_b != null) {
            ek.field_b.a(param0, 256);
          }
          return;
        }
        ob.field_Xb.c(param0, 24509);
        if (ek.field_b != null) {
          ek.field_b.a(param0, 256);
        }
    }

    abstract java.net.Socket b(int param0) throws IOException;

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          field_e = null;
          field_g = null;
          field_i = null;
          field_b = null;
          field_c = null;
          return;
        }
        um.a(-95, true);
        field_e = null;
        field_g = null;
        field_i = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_e = "The pit in this room prevents raiders from easily crossing it.";
        field_d = "No";
        field_c = "Risk of waking dragon is 10% + proportion of gold taken.";
        field_b = new String[]{"Circumvent", "Defeat any room. (Single use)"};
    }
}
