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
          boolean discarded$2 = ata.e(-68);
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
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) gha.field_q;
                    // monitorenter gha.field_q
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (nwa.field_a != bva.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        pma.field_o = npa.field_a[bva.field_c];
                        jl.field_r = gca.field_q[bva.field_c];
                        bva.field_c = param0 & bva.field_c + 1;
                        // monitorexit var1_ref
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        if (param6 < -17) {
          if (super.a(param0, param1, param2, param3, param4, param5, (byte) -99)) {
            var8 = param0 + (-((ata) this).field_g + (-param1 - ((ata) this).field_J));
            var9 = param2 + (-((ata) this).field_B + -((ata) this).field_r + -param5);
            if (((ata) this).field_F * ((ata) this).field_F > var9 * var9 + var8 * var8) {
              var10 = Math.atan2((double)var9, (double)var8) - oea.field_q;
              if (var10 >= 0.0) {
                if (0.0 >= var10) {
                  ((ata) this).field_D = (int)((double)((ata) this).field_I * var10 / 6.283185307179586);
                  L0: while (true) {
                    if (((ata) this).field_D >= ((ata) this).field_I) {
                      ((ata) this).field_D = ((ata) this).field_D - ((ata) this).field_I;
                      continue L0;
                    } else {
                      L1: while (true) {
                        if (-1 >= (((ata) this).field_D ^ -1)) {
                          return true;
                        } else {
                          ((ata) this).field_D = ((ata) this).field_D + ((ata) this).field_I;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((ata) this).field_I;
                  ((ata) this).field_D = (int)((double)((ata) this).field_I * var10 / 6.283185307179586);
                  L2: while (true) {
                    if (((ata) this).field_D < ((ata) this).field_I) {
                      L3: while (true) {
                        if (-1 >= (((ata) this).field_D ^ -1)) {
                          return true;
                        } else {
                          ((ata) this).field_D = ((ata) this).field_D + ((ata) this).field_I;
                          continue L3;
                        }
                      }
                    } else {
                      ((ata) this).field_D = ((ata) this).field_D - ((ata) this).field_I;
                      continue L2;
                    }
                  }
                }
              } else {
                var10 = var10 - 3.141592653589793 / (double)((ata) this).field_I;
                ((ata) this).field_D = (int)((double)((ata) this).field_I * var10 / 6.283185307179586);
                L4: while (true) {
                  if (((ata) this).field_D >= ((ata) this).field_I) {
                    ((ata) this).field_D = ((ata) this).field_D - ((ata) this).field_I;
                    continue L4;
                  } else {
                    L5: while (true) {
                      if (-1 >= (((ata) this).field_D ^ -1)) {
                        return true;
                      } else {
                        ((ata) this).field_D = ((ata) this).field_D + ((ata) this).field_I;
                        continue L5;
                      }
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
        } else {
          ((ata) this).field_E = 45;
          if (super.a(param0, param1, param2, param3, param4, param5, (byte) -99)) {
            var8 = param0 + (-((ata) this).field_g + (-param1 - ((ata) this).field_J));
            var9 = param2 + (-((ata) this).field_B + -((ata) this).field_r + -param5);
            if (((ata) this).field_F * ((ata) this).field_F > var9 * var9 + var8 * var8) {
              L6: {
                var10 = Math.atan2((double)var9, (double)var8) - oea.field_q;
                if (var10 >= 0.0) {
                  if (0.0 < var10) {
                    var10 = var10 + 3.141592653589793 / (double)((ata) this).field_I;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  var10 = var10 - 3.141592653589793 / (double)((ata) this).field_I;
                  break L6;
                }
              }
              ((ata) this).field_D = (int)((double)((ata) this).field_I * var10 / 6.283185307179586);
              L7: while (true) {
                if (((ata) this).field_D >= ((ata) this).field_I) {
                  ((ata) this).field_D = ((ata) this).field_D - ((ata) this).field_I;
                  continue L7;
                } else {
                  L8: while (true) {
                    if (-1 >= (((ata) this).field_D ^ -1)) {
                      return true;
                    } else {
                      ((ata) this).field_D = ((ata) this).field_D + ((ata) this).field_I;
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
