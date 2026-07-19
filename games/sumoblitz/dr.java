/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr extends ah {
    private int field_T;
    static vl[] field_S;

    final static void o(int param0) {
        fq.field_f.a(-115);
        if (param0 != 250) {
            dr.o(-9);
        }
    }

    dr(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  var6 = Sumoblitz.field_L ? 1 : 0;
                  var5 = this.field_Q;
                  if ((var5 ^ -1) != -7) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-8 != (var5 ^ -1)) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_T = 0;
              if (var6 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            this.field_T = 1;
            if (var6 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          this.field_T = -1;
          break L0;
        }
    }

    final void d(int param0) {
        super.d(-104);
        if (-1 != this.field_T) {
          if (-1 == ((this.field_r - 100) % 250 ^ -1)) {
            oc.a(uj.a(this.field_T, this.field_C - this.field_E, 0, (byte) 84, this.field_z + -this.field_A), false);
            if (param0 >= -55) {
              dr.c(true);
              return;
            } else {
              return;
            }
          } else {
            if (param0 >= -55) {
              dr.c(true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 >= -55) {
            dr.c(true);
            return;
          } else {
            return;
          }
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_S = null;
    }

    static {
    }
}
