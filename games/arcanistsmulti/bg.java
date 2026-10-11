/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg {
    static kg field_d;
    static String field_b;
    static int field_c;
    static boolean field_a;
    static qb field_e;

    public static void a(byte param0) {
        if (param0 <= -7) {
          field_e = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_c = 105;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    abstract void a(int param0, byte[] param1);

    final static boolean a(int param0, char param1) {
        if (param1 < 32) {
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param0 != -256) {
            bg.a((byte) 112);
          }
          if (param1 != 8364 &&
            param1 != 338 &&
            8212 != param1 &&
            param1 != 339) {
            if (param1 != 376) {
              return false;
            }
            return true;
          }
          return true;
        }
        if (126 >= param1) {
          return true;
        }
        if (param1 < 160) {
          if (param0 == -256) {
            if (param1 == 8364) {
              return true;
            }
            if (param1 == 338) {
              return true;
            }
            if (8212 == param1) {
              return true;
            }
            if (param1 == 339) {
              return true;
            }
            if (param1 != 376) {
              return false;
            }
            return true;
          }
          bg.a((byte) 112);
        } else {
          if (param1 <= 255) {
            return true;
          }
          if (param0 != -256) {
            bg.a((byte) 112);
          }
        }
        if (param1 == 8364) {
          return true;
        }
        if (param1 == 338) {
          return true;
        }
        if (8212 == param1) {
          return true;
        }
        if (param1 == 339) {
          return true;
        }
        if (param1 == 376) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1) {
        if (nm.field_h == -1) {
          nm.field_h = param1;
          lc.a((byte) 112);
          he.field_e.b((byte) -76, 66);
          he.field_e.f(param1, (byte) -78);
          if (param0 > qf.field_d) {
            return;
          }
          if (ua.field_P + ta.a(true, param1) > jf.field_j) {
            return;
          }
          if ((cb.field_e & 1L << param1) == 0L) {
            ua.field_P = ua.field_P + ta.a(true, param1);
            nm.field_h = -1;
            cb.field_e = cb.field_e | 1L << param1;
            return;
          }
          return;
        }
        if (param1 != nm.field_h) {
          return;
        }
        nm.field_h = param1;
        lc.a((byte) 112);
        he.field_e.b((byte) -76, 66);
        he.field_e.f(param1, (byte) -78);
        if (param0 > qf.field_d) {
          return;
        }
        if (ua.field_P + ta.a(true, param1) > jf.field_j) {
          return;
        }
        if ((cb.field_e & 1L << param1) == 0L) {
          ua.field_P = ua.field_P + ta.a(true, param1);
          nm.field_h = -1;
          cb.field_e = cb.field_e | 1L << param1;
          return;
        }
    }

    final static void a(boolean param0, byte param1) {
        n.field_g.a(param0, true);
        cn var2 = ln.field_U;
        if (var2 != null) {
          var2.a(n.field_g.field_V, true, n.field_g.field_nb);
          if (param1 > -11) {
            bg.a(97, -65);
            return;
          }
          return;
        }
        if (param1 <= -11) {
          return;
        }
        bg.a(97, -65);
    }

    abstract byte[] b(byte param0);

    static {
        field_b = "Real-life threats";
        field_c = 32;
    }
}
