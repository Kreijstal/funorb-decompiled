/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oh extends pb {
    static qk field_d;
    static int field_e;

    abstract f a(boolean param0, int param1, int param2, int param3, ta param4);

    oh() {
    }

    final void a(boolean param0, ta param1, boolean param2) {
        Object var5 = null;
        param1.field_j = param1.field_j + 1;
        if (param1.field_j >= 9) {
          param1.field_g = param1.field_g + 1;
          param1.field_j = 0;
          if (!param0) {
            return;
          } else {
            var5 = null;
            ((oh) this).a(false, (ta) null, false);
            return;
          }
        } else {
          if (!param2) {
            if (param0) {
              var5 = null;
              ((oh) this).a(false, (ta) null, false);
              return;
            } else {
              return;
            }
          } else {
            param1.field_g = param1.field_g + 1;
            param1.field_j = 0;
            if (!param0) {
              return;
            } else {
              var5 = null;
              ((oh) this).a(false, (ta) null, false);
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 32) {
            field_d = null;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (ja.a(param0, (byte) 15)) {
            return true;
          } else {
            if (param0 != 45) {
              if (param0 != 160) {
                if (32 != param0) {
                  if (param0 != 95) {
                    if (param1 != 108) {
                      oh.b(102);
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static mg a(boolean param0, String param1, boolean param2, String param3) {
        long var4 = 0L;
        String var6 = null;
        CharSequence var7 = null;
        L0: {
          var4 = 0L;
          var6 = null;
          if (0 == (param3.indexOf('@') ^ -1)) {
            var7 = (CharSequence) (Object) param3;
            var4 = ck.a((byte) -119, var7);
            break L0;
          } else {
            var6 = param3;
            break L0;
          }
        }
        if (param2) {
          field_e = -111;
          return rn.a(0, param0, var4, param1, var6);
        } else {
          return rn.a(0, param0, var4, param1, var6);
        }
    }

    final void a(int param0, int param1, ta param2) {
        int var4 = 0;
        var4 = m.field_l[param0] + param2.field_j;
        if (param1 != 23041505) {
          field_d = null;
          kk.field_a[param2.field_g][var4] = ((oh) this).a(false, param0, param2.field_f, (18 + var4 * 16384) / 37, param2);
          return;
        } else {
          kk.field_a[param2.field_g][var4] = ((oh) this).a(false, param0, param2.field_f, (18 + var4 * 16384) / 37, param2);
          return;
        }
    }

    static {
    }
}
