/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends wd {
    static eh field_C;
    int field_I;
    int field_H;
    int field_J;
    static mf field_B;
    int field_F;
    int field_D;
    int field_K;

    public static void a(boolean param0) {
        field_B = null;
        field_C = null;
        if (!param0) {
            return;
        }
        Object var2 = null;
        boolean discarded$0 = fh.a((byte) 84, (CharSequence) null);
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != 73) {
            return true;
        }
        return f.a((byte) 108, param1, false);
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Bounce.field_N;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = param3 - (((fh) this).field_H + param2 + ((fh) this).field_r);
          var9 = -param6 - (((fh) this).field_i + (((fh) this).field_D - param5));
          if (((fh) this).field_I * ((fh) this).field_I > var8 * var8 - -(var9 * var9)) {
            L0: {
              var10 = Math.atan2((double)var9, (double)var8) - q.field_L;
              if (var10 < 0.0) {
                var10 = var10 - 3.141592653589793 / (double)((fh) this).field_K;
                break L0;
              } else {
                if (0.0 >= var10) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((fh) this).field_K;
                  ((fh) this).field_J = (int)((double)((fh) this).field_K * var10 / 6.283185307179586);
                  L1: while (true) {
                    if (((fh) this).field_J >= ((fh) this).field_K) {
                      ((fh) this).field_J = ((fh) this).field_J - ((fh) this).field_K;
                      continue L1;
                    } else {
                      L2: while (true) {
                        if (((fh) this).field_J >= 0) {
                          return true;
                        } else {
                          ((fh) this).field_J = ((fh) this).field_J + ((fh) this).field_K;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((fh) this).field_J = (int)((double)((fh) this).field_K * var10 / 6.283185307179586);
            L3: while (true) {
              if (((fh) this).field_J >= ((fh) this).field_K) {
                ((fh) this).field_J = ((fh) this).field_J - ((fh) this).field_K;
                continue L3;
              } else {
                L4: while (true) {
                  if (((fh) this).field_J >= 0) {
                    return true;
                  } else {
                    ((fh) this).field_J = ((fh) this).field_J + ((fh) this).field_K;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private fh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new eh(15, 0, 1, 0);
    }
}
