/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sha extends pu {
    static vr field_l;
    static int field_m;

    final static void a(vr param0, boolean param1) {
        kv var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new kv(param0.a((byte) 123, "", "final_frame.jpg"), (java.awt.Component) (Object) dca.field_y);
        var3 = var2.field_q;
        var4 = var2.field_p;
        if (param1) {
          return;
        } else {
          uc.d(76);
          nd.field_g = new kv(var3, 3 * var4 / 4);
          nd.field_g.b();
          var2.c(0, 0);
          lt.field_a = new kv(var3, var4 - nd.field_g.field_p);
          lt.field_a.b();
          var2.c(0, -nd.field_g.field_p);
          lt.field_a.field_u = nd.field_g.field_p;
          db.b(99);
          return;
        }
    }

    final static boolean a(byte param0, String param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        if (!lna.field_q) {
          return false;
        } else {
          if (param0 == -24) {
            if (gk.field_d == 2) {
              if (df.field_s == null) {
                return false;
              } else {
                L0: {
                  var4 = (CharSequence) (Object) param1;
                  if (!df.field_s.equals((Object) (Object) fq.a(param0 + 24, var4))) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L0;
                  }
                }
                return stackIn_18_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            field_l = null;
            if (gk.field_d == 2) {
              if (df.field_s != null) {
                var3 = (CharSequence) (Object) param1;
                if (df.field_s.equals((Object) (Object) fq.a(param0 + 24, var3))) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 3) {
            return;
        }
        field_l = null;
    }

    static {
    }
}
