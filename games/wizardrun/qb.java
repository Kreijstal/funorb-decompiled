/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qb extends ll {
    static String field_q;
    static boolean field_p;
    static kl field_r;
    static String field_s;

    public static void b(int param0) {
        if (param0 != -1) {
          qb.a((byte) 59, 86);
          field_r = null;
          field_s = null;
          field_q = null;
          return;
        } else {
          field_r = null;
          field_s = null;
          field_q = null;
          return;
        }
    }

    qb(vd param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_M, -1, 2147483647, false);
    }

    final static uh a(String param0, boolean param1, byte param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        if (param2 > -82) {
          L0: {
            L1: {
              qb.a((byte) -117, -79);
              var4 = 0L;
              var6 = null;
              if (0 != (param3.indexOf('@') ^ -1)) {
                break L1;
              } else {
                var7 = (CharSequence) (Object) param3;
                var4 = sb.a((byte) 124, var7);
                if (wizardrun.field_H == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (Object) (Object) param3;
            break L0;
          }
          return uk.a((String) var6, 8355711, var4, param1, param0);
        } else {
          L2: {
            L3: {
              var4 = 0L;
              var6 = null;
              if (0 != (param3.indexOf('@') ^ -1)) {
                break L3;
              } else {
                var8 = (CharSequence) (Object) param3;
                var4 = sb.a((byte) 124, var8);
                if (wizardrun.field_H == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var6 = (Object) (Object) param3;
            break L2;
          }
          return uk.a((String) var6, 8355711, var4, param1, param0);
        }
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        if (!(!param4)) {
            pe.a(param2.field_n, (byte) -14, param1 + param2.field_l, param2.field_r, param0 + param2.field_o);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    final static void a(byte param0, int param1) {
        L0: {
          r.field_e = 3 & param1 >> 704573220;
          if (2 < r.field_e) {
            r.field_e = 2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 52) {
          L1: {
            ff.field_J = param1 >> 407328610 & 3;
            if (ff.field_J > 2) {
              ff.field_J = 2;
              break L1;
            } else {
              break L1;
            }
          }
          di.field_e = 3 & param1;
          if (-3 > (di.field_e ^ -1)) {
            di.field_e = 2;
            return;
          } else {
            return;
          }
        } else {
          L2: {
            qb.b(73);
            ff.field_J = param1 >> 407328610 & 3;
            if (ff.field_J > 2) {
              ff.field_J = 2;
              break L2;
            } else {
              break L2;
            }
          }
          di.field_e = 3 & param1;
          if (-3 <= (di.field_e ^ -1)) {
            return;
          } else {
            di.field_e = 2;
            return;
          }
        }
    }

    qb(int param0) {
        this(gh.field_b, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Waiting for graphics";
        field_s = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_p = true;
    }
}
