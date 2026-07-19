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
        if (param0 >= -90) {
            field_a = (String) null;
        }
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
                            if ((qaa.field_e[0] ^ -1) == 0) {
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
                        var3 = kla.a(var1_int - var2, m.field_a, -2147483648) + var2;
                        if (var3 != var2) {
                          var4 = qaa.field_e[var2];
                          qaa.field_e[var2] = qaa.field_e[var3];
                          qaa.field_e[var3] = var4;
                          var2++;
                          continue L3;
                        } else {
                          var2++;
                          continue L3;
                        }
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
            L7: {
              if ((f.b((byte) 73) ^ -1L) >= (3500L + cr.field_a ^ -1L)) {
                break L7;
              } else {
                L8: {
                  fieldTemp$1 = rba.field_b + 1;
                  rba.field_b = rba.field_b + 1;
                  if (fieldTemp$1 != qaa.field_e.length) {
                    break L8;
                  } else {
                    rba.field_b = 0;
                    break L8;
                  }
                }
                raa.e((byte) 31);
                break L7;
              }
            }
            L9: {
              if (param0 > 73) {
                break L9;
              } else {
                field_b = (pia) null;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "lo.C(" + param0 + ')');
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
        int stackIn_38_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_37_0 = 0;
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
                  var9 = gca.a(0, ig.field_m);
                  var1_ref = var9;
                  var2_ref_int__ = rd.a(true, ig.field_m);
                  var3_ref_rk__ = tj.a((byte) 124, ig.field_m);
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ri.field_a == 79) {
                L3: {
                  if ((ig.field_m.b(16711935) ^ -1) == -2) {
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
                  if (var3 <= var4) {
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
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var6[ig.field_m.b(16711935)] = ig.field_m.b(16711935);
                    var4++;
                    continue L4;
                  }
                }
              } else {
                if (-81 != (ri.field_a ^ -1)) {
                  L6: {
                    if (param0 < -83) {
                      break L6;
                    } else {
                      field_a = (String) null;
                      break L6;
                    }
                  }
                  if (-83 == (ri.field_a ^ -1)) {
                    var7 = new boolean[50];
                    var13 = var7;
                    var2 = 0;
                    var3 = ig.field_m.b(16711935);
                    var8 = 0;
                    var4 = var8;
                    L7: while (true) {
                      if ((var8 ^ -1) <= -51) {
                        gs.field_f.a(10, var13);
                        stackOut_37_0 = 1;
                        stackIn_38_0 = stackOut_37_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L8: {
                          if ((var3 & 1 << var2) != 1 << var2) {
                            break L8;
                          } else {
                            var7[var8] = true;
                            break L8;
                          }
                        }
                        var2++;
                        if ((var2 ^ -1) == -9) {
                          var3 = ig.field_m.b(16711935);
                          var2 = 0;
                          var8++;
                          continue L7;
                        } else {
                          var8++;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "lo.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              return stackIn_38_0 != 0;
            }
          }
        }
    }

    static {
        field_a = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
