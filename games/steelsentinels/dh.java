/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends kd {
    static wk[] field_y;
    static int field_D;
    static gh field_E;
    static int field_B;
    static int field_F;
    static byte[][] field_A;
    static int[][][] field_C;
    static cm field_z;

    final static String a(String param0, byte param1, int param2) {
        int var3 = 0;
        if (param2 == 3) {
          return nh.field_n;
        } else {
          var3 = -26 % ((param1 - 3) / 46);
          if (6 == param2) {
            return qh.field_Vb;
          } else {
            if (7 == param2) {
              return li.field_C;
            } else {
              if (8 == param2) {
                return lb.field_kc;
              } else {
                if (param2 == 9) {
                  return ik.field_i;
                } else {
                  if (-11 == (param2 ^ -1)) {
                    return te.field_d;
                  } else {
                    if ((param2 ^ -1) == -12) {
                      return ef.field_a;
                    } else {
                      if (param2 != 14) {
                        return null;
                      } else {
                        return db.a(k.field_Kb, -107, new String[1]);
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = qe.a(di.field_h, ul.field_d, -126);
          if (1 != var2) {
            break L0;
          } else {
            param1 = "<img=0>" + param1;
            break L0;
          }
        }
        if (param0 != -27905) {
          L1: {
            var3 = null;
            fh discarded$4 = dh.a(78, -81, (cm) null, (byte) 87, (cm) null);
            if (var2 != 2) {
              break L1;
            } else {
              param1 = "<img=1>" + param1;
              break L1;
            }
          }
          return param1;
        } else {
          L2: {
            if (var2 != 2) {
              break L2;
            } else {
              param1 = "<img=1>" + param1;
              break L2;
            }
          }
          return param1;
        }
    }

    final static void a(String param0, byte param1) {
        if (param1 < 116) {
            Object var3 = null;
            dh.a((String) null, (byte) -27);
        }
    }

    final static cm a(int param0, int param1) {
        int var2 = 88 % ((4 - param0) / 44);
        return rf.a(true, 1, (byte) -127, false, false, param1);
    }

    public static void c(byte param0) {
        field_E = null;
        field_z = null;
        field_A = null;
        field_C = null;
        field_y = null;
        int var1 = 2 % ((param0 - 12) / 54);
    }

    dh() {
    }

    final static fh a(int param0, int param1, cm param2, byte param3, cm param4) {
        int var5 = 0;
        if (!wa.a((byte) 30, param1, param0, param2)) {
          return null;
        } else {
          var5 = -18 % ((param3 - 56) / 45);
          return sn.a(param4.a(param0, (byte) 79, param1), 103);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 0;
        field_C = new int[][][]{new int[3][], new int[3][]};
        field_A = new byte[1000][];
    }
}
