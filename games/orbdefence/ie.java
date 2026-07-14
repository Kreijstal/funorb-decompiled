/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ie extends o {
    final static boolean a(int param0, int param1, String param2, String param3, rf param4, boolean param5, String param6) {
        if (!(qc.field_g == tl.field_h)) {
            return false;
        }
        ig var8 = new ig(bm.field_d, param4);
        bm.field_d.b((byte) 74, (pj) (Object) var8);
        if (param1 != -10031) {
            return false;
        }
        if (fk.a(param1 + 11144)) {
            var8.f((byte) 121);
        } else {
            ae.field_a = param0;
            bh.field_e = param2;
            tl.field_g = null;
            of.field_H = param6;
            qc.field_g = mg.field_m;
            sk.field_G = param3;
            mb.field_c = param5 ? true : false;
            return true;
        }
        return true;
    }

    ie() {
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        Object var3 = null;
        if (param0.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (!param0.equals((Object) (Object) "I")) {
            if (!param0.equals((Object) (Object) "S")) {
              if (!param0.equals((Object) (Object) "J")) {
                if (param1 > 16) {
                  if (param0.equals((Object) (Object) "Z")) {
                    return Boolean.TYPE;
                  } else {
                    if (!param0.equals((Object) (Object) "F")) {
                      if (!param0.equals((Object) (Object) "D")) {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      } else {
                        return Double.TYPE;
                      }
                    } else {
                      return Float.TYPE;
                    }
                  }
                } else {
                  var3 = null;
                  boolean discarded$6 = ie.a(-70, -101, (String) null, (String) null, (rf) null, true, (String) null);
                  if (param0.equals((Object) (Object) "Z")) {
                    return Boolean.TYPE;
                  } else {
                    if (!param0.equals((Object) (Object) "F")) {
                      if (!param0.equals((Object) (Object) "D")) {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      } else {
                        return Double.TYPE;
                      }
                    } else {
                      return Float.TYPE;
                    }
                  }
                }
              } else {
                return Long.TYPE;
              }
            } else {
              return Short.TYPE;
            }
          } else {
            return Integer.TYPE;
          }
        }
    }

    static {
    }
}
