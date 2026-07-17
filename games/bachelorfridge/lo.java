/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lo {
    static pia field_b;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (qaa.field_e != null) {
                break L1;
              } else {
                var1_int = jm.field_k.length;
                qaa.field_e = new int[1 + var1_int];
                var2 = 0;
                L2: while (true) {
                  if (var2 >= var1_int) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= -1 + var1_int) {
                        var2 = 0;
                        L4: while (true) {
                          L5: {
                            if (var2 >= var1_int) {
                              break L5;
                            } else {
                              if (qaa.field_e[var2] == 0) {
                                qaa.field_e[var1_int] = qaa.field_e[1 + var2];
                                qaa.field_e[1 + var2] = -1;
                                break L5;
                              } else {
                                var2++;
                                continue L4;
                              }
                            }
                          }
                          L6: {
                            if (qaa.field_e[0] == -1) {
                              stackOut_18_0 = 1;
                              stackIn_19_0 = stackOut_18_0;
                              break L6;
                            } else {
                              stackOut_17_0 = 0;
                              stackIn_19_0 = stackOut_17_0;
                              break L6;
                            }
                          }
                          rba.field_b = stackIn_19_0;
                          raa.e((byte) 31);
                          break L1;
                        }
                      } else {
                        L7: {
                          var3 = kla.a(var1_int - var2, m.field_a, -2147483648) + var2;
                          if (var3 == var2) {
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    qaa.field_e[var2] = var2;
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            L8: {
              if (~f.b((byte) 73) >= ~(3500L + cr.field_a)) {
                break L8;
              } else {
                int fieldTemp$1 = rba.field_b + 1;
                rba.field_b = rba.field_b + 1;
                if (fieldTemp$1 != qaa.field_e.length) {
                  raa.e((byte) 31);
                  break L8;
                } else {
                  rba.field_b = 0;
                  raa.e((byte) 31);
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "lo.C(" + 75 + 41);
        }
    }

    final static boolean b(byte param0) {
        RuntimeException var1 = null;
        ola var1_ref = null;
        int var1_int = 0;
        int[] var2_ref_int__ = null;
        int var2 = 0;
        rk[] var3_ref_rk__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        boolean[] var7 = null;
        int var8 = 0;
        ola var9 = null;
        boolean[] var13 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_24_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (78 == ri.field_a) {
              L1: {
                if (null != mg.field_m) {
                  L2: {
                    if (!mg.field_m.a((byte) 127)) {
                      pma.b(0, 20208);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var9 = gca.a(0, (lu) (Object) ig.field_m);
                  var1_ref = var9;
                  var2_ref_int__ = rd.a(true, (lu) (Object) ig.field_m);
                  var3_ref_rk__ = tj.a((byte) 124, (lu) (Object) ig.field_m);
                  mg.field_m.field_e = var9;
                  mg.field_m.field_f = var2_ref_int__;
                  mg.field_m.field_i = var3_ref_rk__;
                  er.e((byte) -66);
                  break L1;
                } else {
                  break L1;
                }
              }
              hb.field_j = false;
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            } else {
              if (ri.field_a == 79) {
                L3: {
                  if (ig.field_m.b(16711935) == 1) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                var1_int = stackIn_16_0;
                var6 = new int[50];
                var2_ref_int__ = var6;
                var3 = ig.field_m.b(16711935);
                var4 = 0;
                L4: while (true) {
                  if (~var3 >= ~var4) {
                    L5: {
                      mg.field_m.field_f = var2_ref_int__;
                      pka.a((byte) -111, var1_int != 0);
                      if (var1_int == 0) {
                        break L5;
                      } else {
                        gs.field_f.b(11);
                        break L5;
                      }
                    }
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  } else {
                    var6[ig.field_m.b(16711935)] = ig.field_m.b(16711935);
                    var4++;
                    continue L4;
                  }
                }
              } else {
                if (ri.field_a != 80) {
                  if (ri.field_a == 82) {
                    var7 = new boolean[50];
                    var13 = var7;
                    var2 = 0;
                    var3 = ig.field_m.b(16711935);
                    var8 = 0;
                    var4 = var8;
                    L6: while (true) {
                      if (var8 >= 50) {
                        gs.field_f.a(10, var13);
                        stackOut_35_0 = 1;
                        stackIn_36_0 = stackOut_35_0;
                        break L0;
                      } else {
                        L7: {
                          if ((var3 & 1 << var2) != 1 << var2) {
                            break L7;
                          } else {
                            var7[var8] = true;
                            break L7;
                          }
                        }
                        L8: {
                          var2++;
                          if (var2 != 8) {
                            break L8;
                          } else {
                            var3 = ig.field_m.b(16711935);
                            var2 = 0;
                            break L8;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "lo.A(" + -102 + 41);
        }
        return stackIn_36_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
