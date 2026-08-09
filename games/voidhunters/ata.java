/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ata extends htb {
    int field_J;
    int field_B;
    int field_I;
    static phb field_K;
    int field_F;
    int field_E;
    static String field_L;
    int field_D;
    static int field_H;
    static String field_G;

    public static void a(int param0) {
        if (param0 != 6344) {
          ata.e(-68);
          field_G = null;
          field_L = null;
          field_K = null;
          return;
        } else {
          field_G = null;
          field_L = null;
          field_K = null;
          return;
        }
    }

    final static boolean e(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        var1_ref = gha.field_q;
        synchronized (var1_ref) {
          L0: {
            if (nwa.field_a != bva.field_c) {
              pma.field_o = npa.field_a[bva.field_c];
              jl.field_r = gca.field_q[bva.field_c];
              bva.field_c = param0 & bva.field_c + 1;
              stackIn_5_0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param6 < -17) {
                break L1;
              } else {
                this.field_E = 45;
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -99)) {
              stackIn_19_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var8_int = param0 + (-this.field_g + (-param1 - this.field_J));
              var9 = param2 + (-this.field_B + -this.field_r + -param5);
              if (this.field_F * this.field_F > var9 * var9 + var8_int * var8_int) {
                L2: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - oea.field_q;
                  if (var10 >= 0.0) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)this.field_I;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)this.field_I;
                    break L2;
                  }
                }
                this.field_D = (int)((double)this.field_I * var10 / 6.283185307179586);
                L3: while (true) {
                  if (this.field_D < this.field_I) {
                    L4: while (true) {
                      if (-1 >= (this.field_D ^ -1)) {
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_D = this.field_D + this.field_I;
                        continue L4;
                      }
                    }
                  } else {
                    this.field_D = this.field_D - this.field_I;
                    continue L3;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("ata.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private ata() throws Throwable {
        throw new Error();
    }

    static {
        field_L = "game_settings.dat";
        field_K = new phb(540, 140);
        field_G = "Hold the Component";
    }
}
