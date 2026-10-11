/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends mi {
    static int[] field_s;
    static String field_t;
    static String field_q;
    private Object field_r;

    final static void b(boolean param0, int param1) {
        bd.field_a = (55 & param1) >> 4;
        if (2 < bd.field_a) {
          bd.field_a = 2;
        }
        sc.field_b = (param1 & 12) >> 2;
        if (sc.field_b > 2) {
          sc.field_b = 2;
        }
        bd.field_b = param1 & 3;
        if (!param0) {
          ej.f(96);
        }
        if (bd.field_b > 2) {
          bd.field_b = 2;
        }
    }

    final static int a(boolean param0, int param1) {
        param1 = (param1 & 1431655765) + ((param1 & -1431655766) >>> 1);
        param1 = ((param1 & -858993460) >>> 2) + (858993459 & param1);
        param1 = 252645135 & param1 + (param1 >>> 4);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        if (param0) {
          return 255 & param1;
        }
        ue var3 = (ue) null;
        ej.a((ue) null, (ue) null, 8);
        return 255 & param1;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = StarCannon.field_A;
        bj.field_d = null;
        bg.field_a = 0;
        ok.field_sb = null;
        var2 = va.field_s;
        va.field_s = ob.field_b;
        if (param1 == 51) {
          jh.field_b.field_d = 2;
          jh.field_b.field_p = jh.field_b.field_p + 1;
          ob.field_b = var2;
          if (param0 <= jh.field_b.field_p &&
            param1 == 51) {
            return 2;
          }
          if (jh.field_b.field_p >= 2 &&
            param1 == 50) {
            return 5;
          }
        } else {
          if (50 != param1) {
            jh.field_b.field_d = 1;
            jh.field_b.field_p = jh.field_b.field_p + 1;
            ob.field_b = var2;
            if (param0 <= jh.field_b.field_p &&
              param1 == 51) {
              return 2;
            }
            if (jh.field_b.field_p >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (jh.field_b.field_p >= 4) {
              return 1;
            }
            return -1;
          }
          jh.field_b.field_d = 5;
          jh.field_b.field_p = jh.field_b.field_p + 1;
          ob.field_b = var2;
          if (param0 <= jh.field_b.field_p) {
            if (param1 == 51) {
              return 2;
            }
            if (jh.field_b.field_p >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (jh.field_b.field_p >= 4) {
              return 1;
            }
            return -1;
          }
          if (jh.field_b.field_p < 2) {
            if (jh.field_b.field_p >= 4) {
              return 1;
            }
            return -1;
          }
          if (param1 == 50) {
            return 5;
          }
        }
        if (jh.field_b.field_p < 4) {
          return -1;
        }
        return 1;
    }

    public static void f(int param0) {
        field_s = null;
        field_t = null;
        int var1 = 2 / ((-62 - param0) / 53);
        field_q = null;
    }

    final static void f(byte param0) {
        if (param0 != -80) {
          return;
        }
        ne.a(true, lh.field_D, wj.field_c, param0 + 230);
        vj.field_V = true;
    }

    ej(Object param0, int param1) {
        super(param1);
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Object d(byte param0) {
        int var2 = -91 % ((26 - param0) / 56);
        return this.field_r;
    }

    final boolean e(int param0) {
        if (param0 != 1) {
          this.e(-86);
          return false;
        }
        return false;
    }

    final static void a(ue param0, ue param1, int param2) {
        try {
          g.field_a = param0;
          pf.field_a = param1;
          if (param2 >= -73) {
            field_q = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ej.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = new int[8192];
        field_q = "Updates will sent to the email address you've given";
        field_t = "Play the game without logging in just yet";
    }
}
