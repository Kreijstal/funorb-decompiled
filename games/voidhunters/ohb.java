/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ohb extends rqa {
    static mm field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(176, 62, param0[0].a(124));
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        if (param0 != 84) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    ohb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static nl a(int param0, int param1, int param2) {
        Object var3 = null;
        nl var3_ref = null;
        int var4 = 0;
        var3 = null;
        var4 = VoidHunters.field_G;
        if (param1 <= -17) {
          var3_ref = (nl) (Object) gtb.field_d.d(0);
          L0: while (true) {
            if (var3_ref != null) {
              L1: {
                if (param0 != var3_ref.field_k) {
                  break L1;
                } else {
                  if (param2 == var3_ref.field_l) {
                    return var3_ref;
                  } else {
                    break L1;
                  }
                }
              }
              var3_ref = (nl) (Object) gtb.field_d.a((byte) 59);
              continue L0;
            } else {
              return null;
            }
          }
        } else {
          ohb.e((byte) -51);
          var3_ref = (nl) (Object) gtb.field_d.d(0);
          L2: while (true) {
            if (var3_ref != null) {
              L3: {
                if (param0 != var3_ref.field_k) {
                  break L3;
                } else {
                  if (param2 == var3_ref.field_l) {
                    return var3_ref;
                  } else {
                    break L3;
                  }
                }
              }
              var3_ref = (nl) (Object) gtb.field_d.a((byte) 59);
              continue L2;
            } else {
              return null;
            }
          }
        }
    }

    static {
    }
}
