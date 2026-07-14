/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_c;
    static vn[] field_a;
    static vn[] field_b;

    final static void a(int param0) {
        r.a(da.field_i, -49, true, to.field_d);
        pk.field_J = true;
        if (param0 != 419) {
            ed.a(-38);
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        qd.field_e = param1;
        var2 = qd.field_e;
        if ((var2 ^ -1) != -2) {
          if (var2 != 0) {
            if (param0 != -11325) {
              field_c = null;
              return;
            } else {
              return;
            }
          } else {
            no.field_G = new int[]{230, 150, 180, 100};
            sf.field_d = new int[]{26, 182, 370, 463};
            ki.field_X = new int[]{-1, 160, 342, 435};
            gj.field_n = new int[]{178, 50, 134, 33};
            cj.field_c = new int[]{220, 347, 515, -1};
            fl.field_c = new int[]{170, 150, 140, 160};
            pj.field_u = new int[]{135, 135, 90, 120};
            if (param0 == -11325) {
              return;
            } else {
              field_c = null;
              return;
            }
          }
        } else {
          fl.field_c = new int[]{180, 180, 180, 180};
          gj.field_n = new int[]{165, 21, 108, 30};
          pj.field_u = new int[]{135, 135, 140, 140};
          ki.field_X = new int[]{-1, 110, 290, 415};
          cj.field_c = new int[]{220, 307, 490, -1};
          sf.field_d = new int[]{26, 117, 304, 419};
          no.field_G = new int[]{230, 80, 160, 100};
          if (param0 == -11325) {
            return;
          } else {
            field_c = null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -115 / ((3 - param0) / 39);
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, String param1) {
        if (param0 < 81) {
          return;
        } else {
          System.out.println("Error: " + fg.a("%0a", -127, "\n", param1));
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        Object var3 = null;
        if (param1 != -105) {
          var3 = null;
          String discarded$2 = ed.a((CharSequence) null, (byte) -46);
          return fh.a(param0, param1 ^ -7154, false);
        } else {
          return fh.a(param0, param1 ^ -7154, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
    }
}
