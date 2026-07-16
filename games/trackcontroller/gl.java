/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ok {
    static int field_I;
    int field_H;
    static vl field_E;

    public static void j(int param0) {
        if (param0 != -101) {
            return;
        }
        field_E = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        qj var6 = null;
        if (-1 == (param0 ^ -1)) {
          if (null != ((gl) this).field_B) {
            if (((gl) this).field_H == 0) {
              return;
            } else {
              if (((gl) this).field_H != 256) {
                var6 = new qj(((gl) this).field_B.field_x, ((gl) this).field_B.field_u);
                if (param3 != 29221) {
                  return;
                } else {
                  mb.a((byte) -12, var6);
                  ((gl) this).field_B.a(param0, 0, 0, param3 + 0);
                  ch.m(param3 + -29294);
                  var6.d(((gl) this).field_p + param1, ((gl) this).field_m + param2, ((gl) this).field_H);
                  return;
                }
              } else {
                ((gl) this).field_B.a(param0, param1 + ((gl) this).field_p, ((gl) this).field_m + param2, param3 + 0);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public gl() {
        super(0, 0, 0, 0, (t) null, (tg) null);
        ((gl) this).field_H = 256;
    }

    final static void a(String param0, String[] param1, int param2, byte param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        fd.field_h = cj.field_e;
        if (param2 != 255) {
          if ((param2 ^ -1) > -101) {
            h.field_c = wg.a((byte) 54, param2, param0);
            if (param3 >= 93) {
              return;
            } else {
              field_I = -52;
              return;
            }
          } else {
            if (-106 > (param2 ^ -1)) {
              h.field_c = wg.a((byte) 54, param2, param0);
              if (param3 >= 93) {
                return;
              } else {
                field_I = -52;
                return;
              }
            } else {
              h.field_c = qg.a(param1, 91);
              if (param3 < 93) {
                field_I = -52;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L0: {
            if (-14 >= (da.field_o ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          h.field_c = oc.a(stackIn_4_0 != 0, -21017);
          if (param3 < 93) {
            field_I = -52;
            return;
          } else {
            return;
          }
        }
    }

    final static qj[] b(int param0, int param1, int param2, int param3, int param4) {
        qj[] var7 = new qj[9];
        qj[] var5 = var7;
        qj dupTemp$0 = ee.a(param0, param1, (byte) 104);
        var7[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        qj dupTemp$1 = ee.a(param2, param1, (byte) -74);
        var7[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        int var6 = 87 % ((-23 - param3) / 37);
        if (!(param4 == 0)) {
            var7[4] = ee.a(param4, 64, (byte) 104);
        }
        return var5;
    }

    gl(al param0) {
        super(param0.field_p, param0.field_m, param0.field_x, param0.field_u, (t) null, (tg) null);
        param0.a(((gl) this).field_u, -3050, 0, ((gl) this).field_x, 0);
        ((gl) this).field_H = 256;
        ((gl) this).field_B = param0;
    }

    static {
    }
}
