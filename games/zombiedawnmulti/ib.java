/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements nl {
    static int field_b;
    static int field_a;

    final static boolean b(int param0) {
        if (param0 == 23517) {
          if (ki.field_h != null) {
            if (!vo.field_l.a((byte) -90)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ib.a(54);
          if (ki.field_h != null) {
            if (!vo.field_l.a((byte) -90)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int var6 = 0;
        int var7 = 0;
        ja var8 = null;
        var6 = param4.field_y + param3;
        var7 = param4.field_i + param1;
        ng.a(1, var6, param4.field_n, var7, param4.field_w);
        if (param2 == -15112) {
          var8 = rj.field_I[1];
          if (param4 instanceof gn) {
            if (!((gn) (Object) param4).field_G) {
              L0: {
                if (param4.c(124)) {
                  hl.a(2 + var7, 2 + var6, (byte) 111, param4.field_n + -4, param4.field_w + -4);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var8.e(var6 - -1 - -(-var8.field_z + param4.field_n >> -1994921183), (param4.field_w + -var8.field_u >> 472537569) + var7 + 1, 256);
                if (param4.c(124)) {
                  hl.a(2 + var7, 2 + var6, (byte) 111, param4.field_n + -4, param4.field_w + -4);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param4.c(124)) {
                hl.a(2 + var7, 2 + var6, (byte) 111, param4.field_n + -4, param4.field_w + -4);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != param0) {
            return qb.field_a[param0];
        }
        if (!iq.a((byte) 98, param2)) {
            return qb.field_a[param0];
        }
        return 29;
    }

    final static void a(int param0) {
        if (-11 == (a.field_b ^ -1)) {
          ji.b(117);
          a.field_b = 11;
          if (param0 <= -37) {
            eb.field_p = true;
            return;
          } else {
            ib.a(74);
            eb.field_p = true;
            return;
          }
        } else {
          if (!re.b(-113)) {
            ji.b(117);
            a.field_b = 11;
            if (param0 > -37) {
              ib.a(74);
              eb.field_p = true;
              return;
            } else {
              eb.field_p = true;
              return;
            }
          } else {
            if (param0 <= -37) {
              eb.field_p = true;
              return;
            } else {
              ib.a(74);
              eb.field_p = true;
              return;
            }
          }
        }
    }

    final static we a(byte param0, jd param1) {
        if (param0 != 112) {
            return null;
        }
        return tf.a(uj.a(param1, 100, 96), (byte) -98);
    }

    static {
    }
}
