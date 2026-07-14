/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rg extends IOException {
    static tj field_d;
    static boolean field_b;
    static String field_h;
    static u[] field_e;
    static boolean field_a;
    static im[] field_g;
    static int field_c;
    static int field_f;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param1 >> 2028909343 & -1 + param2;
        if (param0 < 32) {
          field_a = true;
          return var3 + (param1 - -(param1 >>> 19910335)) % param2;
        } else {
          return var3 + (param1 - -(param1 >>> 19910335)) % param2;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ql.field_L.a(88, param0, param3, param2, param6);
        if (param4 != -4803) {
          return;
        } else {
          L0: {
            if (ji.field_n != null) {
              ji.field_n.a(param3, param3, param1, param5, -gr.field_Y + param5, -126);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    rg(String param0) {
        super(param0);
    }

    final static void a(byte param0, boolean param1) {
        L0: {
          if (ko.field_S != null) {
            oh.a(ko.field_S, false);
            break L0;
          } else {
            break L0;
          }
        }
        if (null == un.field_Lb) {
          gd.a(3206, param1);
          if (up.field_z == null) {
            dc.a(param1, (byte) -110);
            if (param0 != 53) {
              field_g = null;
              return;
            } else {
              return;
            }
          } else {
            up.field_z.b(param1, 0);
            dc.a(param1, (byte) -110);
            if (param0 != 53) {
              field_g = null;
              return;
            } else {
              return;
            }
          }
        } else {
          un.field_Lb.a(param1, -64);
          gd.a(3206, param1);
          if (up.field_z != null) {
            up.field_z.b(param1, 0);
            dc.a(param1, (byte) -110);
            if (param0 == 53) {
              return;
            } else {
              field_g = null;
              return;
            }
          } else {
            dc.a(param1, (byte) -110);
            if (param0 != 53) {
              field_g = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_h = null;
        field_e = null;
        int var1 = 80 / ((-45 - param0) / 57);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Yes";
        field_c = 0;
    }
}
