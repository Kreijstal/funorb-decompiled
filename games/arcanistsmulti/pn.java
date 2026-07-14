/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    static qb[][] field_b;
    static int field_d;
    static int[] field_a;
    static qb field_c;
    static qb field_e;

    public static void b(byte param0) {
        field_c = null;
        field_e = null;
        int var1 = -20 / ((34 - param0) / 57);
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 > -21) {
            field_d = -35;
        }
        io.field_n = oo.d(-9685);
        pm.field_e = new h();
        ke.g((byte) 94);
    }

    final static String a(int param0, String param1) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        int var4 = 0;
        if (param0 != 8671) {
            return null;
        }
        while (var4 < var2) {
            var3[var2 - 1 - var4] = param1.charAt(var4);
            var4++;
        }
        return new String(var3);
    }

    final static void c(int param0) {
        if (param0 != -11090) {
            return;
        }
        Object var2 = null;
        bb.a(on.field_d, -3, (String) null);
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var1 = 75 / ((param0 - 48) / 54);
            if (eo.field_c != null) {
              break L1;
            } else {
              if (rc.c(-1321)) {
                break L1;
              } else {
                if (null != db.field_a) {
                  break L1;
                } else {
                  if (!we.a((byte) -80)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param2 < -35) {
          L0: {
            in.field_Gb = pa.field_g;
            if (255 != param1) {
              L1: {
                if (param1 < 100) {
                  break L1;
                } else {
                  if (param1 <= 105) {
                    i.field_i = ho.a((byte) 102, args);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              i.field_i = ab.a(0, param1, param3);
              break L0;
            } else {
              L2: {
                stackOut_3_0 = 32517;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (-14 >= (qm.field_u ^ -1)) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L2;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L2;
                }
              }
              i.field_i = oj.a(stackIn_6_0, stackIn_6_1 != 0);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean b(int param0) {
        if (!(-1 != fj.field_h)) {
            if (!(pe.a((byte) -86, 1))) {
                return false;
            }
            fj.field_h = df.field_z.e((byte) -108);
            df.field_z.field_g = 0;
        }
        if (fj.field_h == -2) {
            if (!(pe.a((byte) -86, 2))) {
                return false;
            }
            fj.field_h = df.field_z.n(-98);
            df.field_z.field_g = 0;
        }
        if (param0 != -12564) {
            return false;
        }
        return pe.a((byte) -86, fj.field_h);
    }

    final static ri a(byte param0, String param1) {
        if (param1 != null) {
            // ifeq L14
        } else {
            return fc.field_c;
        }
        int var2 = param1.indexOf('@');
        if ((var2 ^ -1) == 0) {
            return uh.field_i;
        }
        if (param0 != 78) {
            field_e = null;
        }
        String var3 = param1.substring(0, var2);
        String var4 = param1.substring(1 + var2);
        ri var5 = pm.a((byte) -58, var3);
        if (!(var5 == null)) {
            return var5;
        }
        return tf.a(32752, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
