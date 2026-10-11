/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends dl {
    static String field_C;
    byte[] field_x;
    ah field_A;
    static int field_y;
    int field_B;
    static int field_z;
    static int field_D;

    final int f(int param0) {
        if (param0 != 8651) {
          field_C = (String) null;
          if (this.field_q) {
            return 0;
          }
          return 100;
        }
        if (this.field_q) {
          return 0;
        }
        return 100;
    }

    final static String i(int param0) {
        if (param0 > -104) {
          return (String) null;
        }
        return fg.field_m;
    }

    public static void b(boolean param0) {
        if (param0) {
          field_D = 35;
          field_C = null;
          return;
        }
        field_C = null;
    }

    final static void a(boolean param0, boolean param1) {
        ib.field_g = 0;
        ql.field_o = 0;
        bf.field_b = 0;
        td.field_i = hd.field_c;
        ul.field_G = new pl(2);
        ul.field_G.a(em.a(kc.field_b, param1, ag.field_f), -1, param0, -81);
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            var2 += 16;
            param1 = param1 >> 16;
          }
          if (255 < param1) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2 += 4;
          }
          if (3 < param1) {
            param1 = param1 >> 2;
            var2 += 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (-65536 > param1) {
          param1 = param1 >> 16;
          var2Lifetime1 += 16;
        }
        if (param1 < -256) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param1 < -16) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (~param1 > param0) {
          param1 = param1 >> 2;
          var2Lifetime1 += 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    final byte[] g(int param0) {
        if (this.field_q) {
          throw new RuntimeException();
        }
        if (param0 != 100) {
          return (byte[]) null;
        }
        return this.field_x;
    }

    final static boolean j(int param0) {
        if (param0 != 32391) {
          qh.a(1, 113);
          if (null == sg.field_h) {
            return false;
          }
          if (fh.field_b == rh.field_k) {
            return true;
          }
          return false;
        }
        if (null == sg.field_h) {
          return false;
        }
        if (fh.field_b == rh.field_k) {
          return true;
        }
        return false;
    }

    final static boolean c(byte param0) {
        if (param0 < 31) {
          field_z = 27;
          return ci.field_f;
        }
        return ci.field_f;
    }

    qh() {
    }

    static {
        field_C = "Log in / Create account";
        field_z = 0;
    }
}
