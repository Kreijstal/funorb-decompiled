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
        if (param0 != -27549) {
          um.a(10, false);
          return new java.net.Socket(this.field_a, this.field_f);
        } else {
          return new java.net.Socket(this.field_a, this.field_f);
        }
    }

    final static void a(int param0, boolean param1) {
        ql.field_d = param0;
        if (!param1) {
          if (null != ob.field_Xb) {
            L0: {
              ob.field_Xb.c(param0, 24509);
              if (ek.field_b != null) {
                ek.field_b.a(param0, 256);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (ek.field_b != null) {
                ek.field_b.a(param0, 256);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          um.a(-85, false);
          if (null == ob.field_Xb) {
            L2: {
              if (ek.field_b != null) {
                ek.field_b.a(param0, 256);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              ob.field_Xb.c(param0, 24509);
              if (ek.field_b != null) {
                ek.field_b.a(param0, 256);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    abstract java.net.Socket b(int param0) throws IOException;

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          um.a(-95, true);
          field_e = null;
          field_g = null;
          field_i = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_i = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        field_e = "The pit in this room prevents raiders from easily crossing it.";
        field_d = "No";
        field_c = "Risk of waking dragon is 10% + proportion of gold taken.";
        field_b = new String[]{"Circumvent", "Defeat any room. (Single use)"};
    }
}
