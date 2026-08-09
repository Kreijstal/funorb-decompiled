/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends ae {
    static boolean field_T;
    int field_S;
    static hl field_Q;
    static int field_ab;
    int field_bb;
    int field_V;
    static int[] field_Y;
    int field_U;
    static oh field_X;
    static int[] field_W;
    static oh field_P;
    static kh[] field_cb;
    int field_R;
    int field_Z;

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TetraLink.field_J;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_16_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_V + -param1 + (-this.field_t + param6);
                var9 = param5 + -param3 + -this.field_w - this.field_Z;
                if (var9 * var9 + var8_int * var8_int >= this.field_bb * this.field_bb) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - ik.field_b;
                    if (var10 < 0.0) {
                      var10 = var10 - 3.141592653589793 / (double)this.field_R;
                      break L2;
                    } else {
                      if (0.0 < var10) {
                        var10 = var10 + 3.141592653589793 / (double)this.field_R;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_S = (int)((double)this.field_R * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (this.field_S < this.field_R) {
                      L4: while (true) {
                        if ((this.field_S ^ -1) <= -1) {
                          break L1;
                        } else {
                          this.field_S = this.field_S + this.field_R;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_S = this.field_S - this.field_R;
                      continue L3;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8);

            stackIn_19_1 = new StringBuilder().append("qd.PA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final static el c(int param0, int param1) {
        gb stackIn_4_0 = null;
        gb stackIn_8_0 = null;
        if (param0 < 107) {
          L0: {
            field_P = (oh) null;
            if (null == db.field_e) {
              stackIn_8_0 = null;
              break L0;
            } else {
              stackIn_8_0 = db.field_e.a((long)param1, 1);
              break L0;
            }
          }
          return (el) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null == db.field_e) {
              stackIn_4_0 = null;
              break L1;
            } else {
              stackIn_4_0 = db.field_e.a((long)param1, 1);
              break L1;
            }
          }
          return (el) ((Object) stackIn_4_0);
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            return;
        }
        field_cb = null;
        field_Y = null;
        field_W = null;
        field_P = null;
        field_Q = null;
        field_X = null;
    }

    private qd() throws Throwable {
        throw new Error();
    }

    static {
        field_Y = new int[4];
        field_T = false;
    }
}
