/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends gi {
    static rf field_i;
    static ge field_h;
    static qe field_j;

    public static void d(int param0) {
        if (param0 != 1) {
            field_j = null;
        }
        field_h = null;
        field_j = null;
        field_i = null;
    }

    final static short[] a(lh param0, byte param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = param0.e(param2, (byte) 18);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (var4 == param3.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          L2: {
            var5 = -84 % ((-44 - param1) / 46);
            var6 = param0.e(4, (byte) -122);
            var7 = (short)param0.e(16, (byte) 90);
            if ((var6 ^ -1) < -1) {
              var8 = 0;
              L3: while (true) {
                if (var4 <= var8) {
                  break L2;
                } else {
                  param3[var8] = (short)(param0.e(var6, (byte) -107) + var7);
                  var8++;
                  continue L3;
                }
              }
            } else {
              var8 = 0;
              L4: while (true) {
                if (var8 >= var4) {
                  break L2;
                } else {
                  param3[var8] = (short)var7;
                  var8++;
                  continue L4;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          ea.field_a = null;
          hf.field_C = 0;
          tc.field_e = null;
          var2 = j.field_ib;
          j.field_ib = vc.field_e;
          p.field_a.field_c = p.field_a.field_c + 1;
          vc.field_e = var2;
          if ((param1 ^ -1) == -52) {
            p.field_a.field_h = 2;
            break L0;
          } else {
            if (param1 != 50) {
              p.field_a.field_h = 1;
              break L0;
            } else {
              p.field_a.field_h = 5;
              break L0;
            }
          }
        }
        L1: {
          if (p.field_a.field_c < 2) {
            break L1;
          } else {
            if (param1 != -52) {
              break L1;
            } else {
              return 2;
            }
          }
        }
        L2: {
          if (-3 > p.field_a.field_c) {
            break L2;
          } else {
            if (param1 == 50) {
              return 5;
            } else {
              break L2;
            }
          }
        }
        if (-5 < (p.field_a.field_c ^ -1)) {
          L3: {
            if (param0 == 85) {
              break L3;
            } else {
              field_h = null;
              break L3;
            }
          }
          return -1;
        } else {
          return 1;
        }
    }

    private uj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
