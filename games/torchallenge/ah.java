/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_g;
    static int[] field_e;
    static int[][] field_a;
    static boolean field_i;
    static String field_c;
    static ka[][][][] field_d;
    static boolean field_h;
    static int[] field_f;
    static int[][][] field_j;
    static int field_b;

    final static void b(int param0, int param1) {
        int var2 = 0;
        ba.field_i = null;
        var2 = 32 - -(4 * param0);
        kd.field_m = null;
        if (param1 == -22081) {
          kd.field_m = new ra(var2, param0);
          ba.field_i = kd.field_m;
          if (wi.field_a != null) {
            L0: {
              if (fj.field_m == null) {
                uf.c(-7668);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (null == pa.field_z) {
                jf.m(115);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == lj.field_j) {
                hl.a((byte) 50);
                break L2;
              } else {
                break L2;
              }
            }
            if (null != je.field_c[param0]) {
              if (ol.field_a) {
                kd.field_m.b((byte) 63);
                kd.field_m.a(param1 + 22083, param0);
                return;
              } else {
                mf.a(false, je.field_c[param0], param1 ^ -2282, false);
                kd.field_m.b((byte) 63);
                kd.field_m.a(param1 + 22083, param0);
                return;
              }
            } else {
              kd.field_m.b((byte) 63);
              kd.field_m.a(param1 + 22083, param0);
              return;
            }
          } else {
            L3: {
              lb.d((byte) -81);
              if (fj.field_m == null) {
                uf.c(-7668);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == pa.field_z) {
                jf.m(115);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == lj.field_j) {
                hl.a((byte) 50);
                break L5;
              } else {
                break L5;
              }
            }
            if (null != je.field_c[param0]) {
              if (ol.field_a) {
                kd.field_m.b((byte) 63);
                kd.field_m.a(param1 + 22083, param0);
                return;
              } else {
                mf.a(false, je.field_c[param0], param1 ^ -2282, false);
                kd.field_m.b((byte) 63);
                kd.field_m.a(param1 + 22083, param0);
                return;
              }
            } else {
              kd.field_m.b((byte) 63);
              kd.field_m.a(param1 + 22083, param0);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 > -44) {
            return false;
        }
        return !ji.field_k.b(0) ? true : false;
    }

    final static int a(int param0, int param1) {
        param0 = (param0 & 1431655765) - -(param1 & param0 >>> 36966785);
        param0 = (param0 & 858993459) - -(-1288490189 & param0 >>> -59873918);
        param0 = (param0 >>> -493740412) + param0 & 252645135;
        param0 = param0 + (param0 >>> -1919828760);
        param0 = param0 + (param0 >>> -303345392);
        return 255 & param0;
    }

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        oi var3 = null;
        if (param2 != null) {
          if (param2.length <= 136) {
            if (!param0) {
              if (param1) {
                return (Object) (Object) ek.a(param2, -48);
              } else {
                return (Object) (Object) param2;
              }
            } else {
              return null;
            }
          } else {
            var3 = new oi();
            ((of) (Object) var3).a(50, param2);
            return (Object) (Object) var3;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_j = null;
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0 > 26) {
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        bk var4 = null;
        tc var5 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        var4 = (bk) (Object) na.field_d.c((byte) 118);
        if (param0 != -86) {
          field_i = true;
          L0: while (true) {
            if (var4 == null) {
              var5 = (tc) (Object) gf.field_q.c((byte) -18);
              L1: while (true) {
                if (var5 != null) {
                  ue.a(var5, 2, param1);
                  var5 = (tc) (Object) gf.field_q.c(param0 ^ 344);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              ae.a(param1, var4, -15024);
              var4 = (bk) (Object) na.field_d.c(-270);
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var4 == null) {
              var5 = (tc) (Object) gf.field_q.c((byte) -18);
              L3: while (true) {
                if (var5 != null) {
                  ue.a(var5, 2, param1);
                  var5 = (tc) (Object) gf.field_q.c(param0 ^ 344);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              ae.a(param1, var4, -15024);
              var4 = (bk) (Object) na.field_d.c(-270);
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[][]{new int[7], new int[7], new int[7]};
        field_i = false;
        field_d = new ka[9][8][3][];
        field_h = false;
        field_e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_f = new int[]{20, 30, 40};
        field_c = "This password contains repeated characters, and would be easy to guess";
        field_j = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
