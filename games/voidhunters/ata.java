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

    public static void a() {
        field_G = null;
        field_L = null;
        field_K = null;
    }

    final static boolean e() {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) gha.field_q;
        synchronized (var1_ref) {
          L0: {
            if (nwa.field_a != bva.field_c) {
              pma.field_o = npa.field_a[bva.field_c];
              jl.field_r = gca.field_q[bva.field_c];
              bva.field_c = 127 & bva.field_c + 1;
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param6 < -17) {
                break L1;
              } else {
                ((ata) this).field_E = 45;
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -99)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              var8_int = param0 + (-((ata) this).field_g + (-param1 - ((ata) this).field_J));
              var9 = param2 + (-((ata) this).field_B + -((ata) this).field_r + -param5);
              if (((ata) this).field_F * ((ata) this).field_F > var9 * var9 + var8_int * var8_int) {
                L2: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - oea.field_q;
                  if (var10 >= 0.0) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)((ata) this).field_I;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((ata) this).field_I;
                    break L2;
                  }
                }
                ((ata) this).field_D = (int)((double)((ata) this).field_I * var10 / 6.283185307179586);
                L3: while (true) {
                  if (((ata) this).field_D < ((ata) this).field_I) {
                    L4: while (true) {
                      if (((ata) this).field_D >= 0) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
                      } else {
                        ((ata) this).field_D = ((ata) this).field_D + ((ata) this).field_I;
                        continue L4;
                      }
                    }
                  } else {
                    ((ata) this).field_D = ((ata) this).field_D - ((ata) this).field_I;
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
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("ata.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    private ata() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "game_settings.dat";
        field_K = new phb(540, 140);
        field_G = "Hold the Component";
    }
}
