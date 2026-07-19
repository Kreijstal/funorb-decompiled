/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static he field_d;
    static int field_c;
    static he[] field_b;
    static int field_a;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(ji.field_c);
            param1.removeFocusListener(ji.field_c);
            gm.field_O = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "tb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String b(byte param0) {
        if (-3 < (hj.field_f ^ -1)) {
          return a.field_c;
        } else {
          if (bi.field_I == null) {
            if (qd.field_Jb.a(0)) {
              if (qd.field_Jb.a(255, "commonui")) {
                if (!sb.field_i.a(0)) {
                  return bh.field_d;
                } else {
                  if (param0 == -81) {
                    if (sb.field_i.a(255, "commonui")) {
                      if (!ig.field_t.a(0)) {
                        return ia.field_b;
                      } else {
                        if (!ig.field_t.c((byte) 68)) {
                          return fb.field_a + " - " + ig.field_t.d((byte) 95) + "%";
                        } else {
                          return tl.field_J;
                        }
                      }
                    } else {
                      return ij.field_a + " - " + sb.field_i.b(param0 + 10542, "commonui") + "%";
                    }
                  } else {
                    return (String) null;
                  }
                }
              } else {
                return sa.field_b + " - " + qd.field_Jb.b(10461, "commonui") + "%";
              }
            } else {
              return td.field_o;
            }
          } else {
            if (!bi.field_I.a(0)) {
              return mi.field_d;
            } else {
              return dh.field_J;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        int var1 = 78 / ((param0 - -6) / 36);
    }

    static {
    }
}
