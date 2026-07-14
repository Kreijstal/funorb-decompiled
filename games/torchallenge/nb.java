/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nb {
    static ka field_a;

    final static void a(int param0, boolean param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1) {
                  break L0;
                } else {
                  field_a = null;
                  break L0;
                }
              }
              Object discarded$1 = ff.a("resizing", new Object[1], gi.b(12476), -29585);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -26375) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (gj.field_c < 10) {
              break L2;
            } else {
              if (lj.field_q) {
                break L2;
              } else {
                if (hf.a(4)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static boolean a(int param0, byte param1) {
        if (!((param0 ^ -1) != -17)) {
            return true;
        }
        if (param1 < 112) {
            field_a = null;
            return false;
        }
        return false;
    }

    final static void a(byte param0, int[][] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        qe var15 = null;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_58_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        var6 = 0;
        if (param0 == 42) {
          var11 = 0;
          L0: while (true) {
            if (64 <= var11) {
              if (ea.field_g == null) {
                return;
              } else {
                var14 = 0;
                var11 = var14;
                L1: while (true) {
                  if (var14 >= ea.field_g.length) {
                    return;
                  } else {
                    if (ea.field_g[var14] != null) {
                      var15 = ea.field_g[var14];
                      if (var15.field_F != 0) {
                        L2: {
                          if (param1[0][0] <= param1[0][1]) {
                            var8 = param1[0][1];
                            var7 = param1[0][0];
                            if (var7 <= var15.field_o) {
                              break L2;
                            } else {
                              if (var15.field_o < var8) {
                                break L2;
                              } else {
                                var14++;
                                continue L1;
                              }
                            }
                          } else {
                            var8 = param1[0][0];
                            var7 = param1[0][1];
                            if (var15.field_o < var7) {
                              break L2;
                            } else {
                              if (var15.field_o >= var8) {
                                break L2;
                              } else {
                                var14++;
                                continue L1;
                              }
                            }
                          }
                        }
                        L3: {
                          if (var15.field_H >= param1[1][0]) {
                            break L3;
                          } else {
                            if (var15.field_H < param1[1][1]) {
                              break L3;
                            } else {
                              var14++;
                              continue L1;
                            }
                          }
                        }
                        L4: {
                          if (-9 >= var15.field_F) {
                            if (-22 >= var15.field_F) {
                              stackOut_39_0 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              break L4;
                            } else {
                              stackOut_38_0 = 0;
                              stackIn_41_0 = stackOut_38_0;
                              break L4;
                            }
                          } else {
                            stackOut_36_0 = 0;
                            stackIn_41_0 = stackOut_36_0;
                            break L4;
                          }
                        }
                        L5: {
                          var3 = stackIn_41_0;
                          if (var15.field_L != 13) {
                            if (var3 == 0) {
                              if ((var15.field_F ^ -1) != -23) {
                                stackOut_47_0 = 1;
                                stackIn_49_0 = stackOut_47_0;
                                break L5;
                              } else {
                                stackOut_46_0 = 0;
                                stackIn_49_0 = stackOut_46_0;
                                break L5;
                              }
                            } else {
                              stackOut_44_0 = 0;
                              stackIn_49_0 = stackOut_44_0;
                              break L5;
                            }
                          } else {
                            stackOut_42_0 = 0;
                            stackIn_49_0 = stackOut_42_0;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            var4 = stackIn_49_0;
                            if (13 == var15.field_L) {
                              break L7;
                            } else {
                              if ((var15.field_db ^ -1) > -1) {
                                break L7;
                              } else {
                                if (var15.field_F == 22) {
                                  break L7;
                                } else {
                                  stackOut_52_0 = 0;
                                  stackIn_58_0 = stackOut_52_0;
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var3 == 0) {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            break L6;
                          } else {
                            stackOut_55_0 = 0;
                            stackIn_58_0 = stackOut_55_0;
                            break L6;
                          }
                        }
                        L8: {
                          var5 = stackIn_58_0;
                          if (var3 != 0) {
                            break L8;
                          } else {
                            if (var4 != 0) {
                              break L8;
                            } else {
                              if (var5 != 0) {
                                break L8;
                              } else {
                                var14++;
                                continue L1;
                              }
                            }
                          }
                        }
                        L9: {
                          if (var3 != 0) {
                            var9 = 0;
                            break L9;
                          } else {
                            if (var4 == 0) {
                              var9 = 2;
                              break L9;
                            } else {
                              var9 = 1;
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (0 > var15.field_H) {
                            break L10;
                          } else {
                            if (var15.field_H >= ol.field_g.field_a) {
                              break L10;
                            } else {
                              if (bi.field_g[var15.field_o][var15.field_H][var9] == null) {
                                bi.field_g[var15.field_o][var15.field_H][var9] = new int[9];
                                bi.field_g[var15.field_o][var15.field_H][var9][var6] = 0;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        if (var15.field_H >= 0) {
                          if (var15.field_H < ol.field_g.field_a) {
                            if (8 > bi.field_g[var15.field_o][var15.field_H][var9][var6]) {
                              bi.field_g[var15.field_o][var15.field_H][var9][var6] = bi.field_g[var15.field_o][var15.field_H][var9][var6] + 1;
                              var10 = bi.field_g[var15.field_o][var15.field_H][var9][var6];
                              bi.field_g[var15.field_o][var15.field_H][var9][var10] = var14;
                              var14++;
                              continue L1;
                            } else {
                              var14++;
                              continue L1;
                            }
                          } else {
                            var14++;
                            continue L1;
                          }
                        } else {
                          var14++;
                          continue L1;
                        }
                      } else {
                        var14++;
                        continue L1;
                      }
                    } else {
                      var14++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var12 = 0;
              L11: while (true) {
                if (var12 >= ol.field_g.field_a) {
                  var11++;
                  continue L0;
                } else {
                  var9 = 0;
                  L12: while (true) {
                    if (-4 >= (var9 ^ -1)) {
                      var12++;
                      continue L11;
                    } else {
                      if (null != bi.field_g[var11][var12][var9]) {
                        bi.field_g[var11][var12][var9][var6] = 0;
                        var9++;
                        continue L12;
                      } else {
                        var9++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void b(int param0, int param1) {
        if (param1 != -1) {
            boolean discarded$0 = nb.a(127, (byte) -24);
        }
        nk.field_h = param0;
        if (!(null == la.field_a)) {
            la.field_a.c(param0, false);
        }
        if (null != la.field_d) {
            la.field_d.a(-127, param0);
        }
    }

    final static void a(int param0, int param1) {
        try {
            if (qf.field_a != null) {
                // if_icmpgt L31
                // if_acmpne L23
            } else {
                dk.field_s.field_q = 0;
                return;
            }
            if (param1 == dk.field_s.field_q) {
                if (!((ol.a(param1 + 257) ^ -1L) >= (i.field_q - -10000L ^ -1L))) {
                    dk.field_s.d(25, param0);
                }
            }
            if (!(0 >= dk.field_s.field_q)) {
                try {
                    qf.field_a.a(dk.field_s.field_q, 0, (byte) 113, dk.field_s.field_m);
                    i.field_q = ol.a(256);
                } catch (IOException iOException) {
                    ob.b(-125);
                }
                dk.field_s.field_q = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 > -69) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
