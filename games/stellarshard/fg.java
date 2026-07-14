/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends ig {
    int field_N;
    int field_F;
    int field_I;
    int field_J;
    static oj field_G;
    int field_L;
    int field_H;
    static pb[] field_P;
    static int field_O;
    static int field_M;
    static float field_K;

    public static void g(int param0) {
        field_P = null;
        if (param0 != 0) {
            return;
        }
        field_G = null;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = stellarshard.field_B;
        if (param5 >= 24) {
          if (super.a(param0, param1, param2, param3, param4, (byte) 67, param6)) {
            var8 = param1 - (((fg) this).field_L + ((fg) this).field_w + param4);
            var9 = param3 + (-((fg) this).field_k + (-param6 + -((fg) this).field_F));
            if (((fg) this).field_I * ((fg) this).field_I > var8 * var8 - -(var9 * var9)) {
              var10 = Math.atan2((double)var9, (double)var8) - sj.field_I;
              if (var10 >= 0.0) {
                if (0.0 < var10) {
                  var10 = var10 + 3.141592653589793 / (double)((fg) this).field_N;
                  ((fg) this).field_J = (int)(var10 * (double)((fg) this).field_N / 6.283185307179586);
                  L0: while (true) {
                    if (((fg) this).field_N <= ((fg) this).field_J) {
                      ((fg) this).field_J = ((fg) this).field_J - ((fg) this).field_N;
                      continue L0;
                    } else {
                      L1: while (true) {
                        if ((((fg) this).field_J ^ -1) <= -1) {
                          return true;
                        } else {
                          ((fg) this).field_J = ((fg) this).field_J + ((fg) this).field_N;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  ((fg) this).field_J = (int)(var10 * (double)((fg) this).field_N / 6.283185307179586);
                  L2: while (true) {
                    if (((fg) this).field_N <= ((fg) this).field_J) {
                      ((fg) this).field_J = ((fg) this).field_J - ((fg) this).field_N;
                      continue L2;
                    } else {
                      L3: while (true) {
                        if ((((fg) this).field_J ^ -1) <= -1) {
                          return true;
                        } else {
                          ((fg) this).field_J = ((fg) this).field_J + ((fg) this).field_N;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } else {
                var10 = var10 - 3.141592653589793 / (double)((fg) this).field_N;
                ((fg) this).field_J = (int)(var10 * (double)((fg) this).field_N / 6.283185307179586);
                L4: while (true) {
                  if (((fg) this).field_N > ((fg) this).field_J) {
                    L5: while (true) {
                      if ((((fg) this).field_J ^ -1) <= -1) {
                        return true;
                      } else {
                        ((fg) this).field_J = ((fg) this).field_J + ((fg) this).field_N;
                        continue L5;
                      }
                    }
                  } else {
                    ((fg) this).field_J = ((fg) this).field_J - ((fg) this).field_N;
                    continue L4;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((fg) this).field_J = -18;
          if (super.a(param0, param1, param2, param3, param4, (byte) 67, param6)) {
            var8 = param1 - (((fg) this).field_L + ((fg) this).field_w + param4);
            var9 = param3 + (-((fg) this).field_k + (-param6 + -((fg) this).field_F));
            if (((fg) this).field_I * ((fg) this).field_I > var8 * var8 - -(var9 * var9)) {
              L6: {
                var10 = Math.atan2((double)var9, (double)var8) - sj.field_I;
                if (var10 < 0.0) {
                  var10 = var10 - 3.141592653589793 / (double)((fg) this).field_N;
                  break L6;
                } else {
                  if (0.0 < var10) {
                    var10 = var10 + 3.141592653589793 / (double)((fg) this).field_N;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              ((fg) this).field_J = (int)(var10 * (double)((fg) this).field_N / 6.283185307179586);
              L7: while (true) {
                if (((fg) this).field_N <= ((fg) this).field_J) {
                  ((fg) this).field_J = ((fg) this).field_J - ((fg) this).field_N;
                  continue L7;
                } else {
                  L8: while (true) {
                    if ((((fg) this).field_J ^ -1) <= -1) {
                      return true;
                    } else {
                      ((fg) this).field_J = ((fg) this).field_J + ((fg) this).field_N;
                      continue L8;
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
    }

    private fg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new oj();
    }
}
