/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static ci[] field_b;
    static int field_d;
    static String field_c;
    static int field_e;
    static String field_f;
    static String field_a;

    final static void a(java.awt.Canvas param0, boolean param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (uh.field_H > -11) {
          L0: {
            var3 = 0;
            if (il.field_e) {
              var3 = 1;
              il.field_e = false;
              break L0;
            } else {
              break L0;
            }
          }
          sa.a(-26, vb.b((byte) -27), fc.a(-1), oi.field_H, var3 != 0);
          if (param2 != 80) {
            field_c = null;
            return;
          } else {
            return;
          }
        } else {
          if (!sl.a((byte) -40)) {
            l.a();
            ch.a((byte) -79, 240, 320);
            ia.a(0, param0, 0, (byte) 113);
            if (param2 != 80) {
              field_c = null;
              return;
            } else {
              return;
            }
          } else {
            if (-1 != q.field_Jb) {
              ej.a(-12966, param0);
              if (param2 == 80) {
                return;
              } else {
                field_c = null;
                return;
              }
            } else {
              ad.a(param1, 0, false);
              ia.a(0, param0, 0, (byte) 126);
              if (param2 == 80) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -58) {
          field_f = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -12) {
            return false;
        }
        return -251 > (kf.field_f ^ -1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "EXCLUSIVE";
        field_f = "Go Back";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_e = 20;
    }
}
