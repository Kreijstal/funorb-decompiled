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
                Object discarded$1 = ff.a("resizing", new Object[1], gi.b(12476), -29585);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (gj.field_c < 10) {
              break L1;
            } else {
              if (lj.field_q) {
                break L1;
              } else {
                if (hf.a(4)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static boolean a(int param0, byte param1) {
        if (!(param0 != 16)) {
            return true;
        }
        if (param1 < 112) {
            field_a = null;
            return false;
        }
        return false;
    }

    final static void a(byte param0, int[][] param1) {
        RuntimeException var2 = null;
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
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var6 = 0;
            if (param0 == 42) {
              var11 = 0;
              L1: while (true) {
                if (64 <= var11) {
                  if (ea.field_g == null) {
                    return;
                  } else {
                    var14 = 0;
                    var11 = var14;
                    L2: while (true) {
                      if (var14 >= ea.field_g.length) {
                        break L0;
                      } else {
                        L3: {
                          if (ea.field_g[var14] != null) {
                            var15 = ea.field_g[var14];
                            if (var15.field_F != 0) {
                              L4: {
                                if (param1[0][0] <= param1[0][1]) {
                                  var8 = param1[0][1];
                                  var7 = param1[0][0];
                                  if (var7 <= var15.field_o) {
                                    break L4;
                                  } else {
                                    if (var15.field_o >= var8) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  var8 = param1[0][0];
                                  var7 = param1[0][1];
                                  if (var15.field_o < var7) {
                                    break L4;
                                  } else {
                                    if (var15.field_o < var8) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              L5: {
                                if (var15.field_H >= param1[1][0]) {
                                  break L5;
                                } else {
                                  if (var15.field_H < param1[1][1]) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L6: {
                                if (-9 >= var15.field_F) {
                                  if (-22 >= var15.field_F) {
                                    stackOut_37_0 = 1;
                                    stackIn_39_0 = stackOut_37_0;
                                    break L6;
                                  } else {
                                    stackOut_36_0 = 0;
                                    stackIn_39_0 = stackOut_36_0;
                                    break L6;
                                  }
                                } else {
                                  stackOut_34_0 = 0;
                                  stackIn_39_0 = stackOut_34_0;
                                  break L6;
                                }
                              }
                              L7: {
                                var3 = stackIn_39_0;
                                if (var15.field_L != 13) {
                                  if (var3 == 0) {
                                    if (var15.field_F == 22) {
                                      stackOut_45_0 = 0;
                                      stackIn_47_0 = stackOut_45_0;
                                      break L7;
                                    } else {
                                      stackOut_44_0 = 1;
                                      stackIn_47_0 = stackOut_44_0;
                                      break L7;
                                    }
                                  } else {
                                    stackOut_42_0 = 0;
                                    stackIn_47_0 = stackOut_42_0;
                                    break L7;
                                  }
                                } else {
                                  stackOut_40_0 = 0;
                                  stackIn_47_0 = stackOut_40_0;
                                  break L7;
                                }
                              }
                              L8: {
                                L9: {
                                  var4 = stackIn_47_0;
                                  if (13 == var15.field_L) {
                                    break L9;
                                  } else {
                                    if (var15.field_db < 0) {
                                      break L9;
                                    } else {
                                      if (var15.field_F == 22) {
                                        break L9;
                                      } else {
                                        stackOut_50_0 = 0;
                                        stackIn_56_0 = stackOut_50_0;
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                if (var3 == 0) {
                                  stackOut_54_0 = 1;
                                  stackIn_56_0 = stackOut_54_0;
                                  break L8;
                                } else {
                                  stackOut_53_0 = 0;
                                  stackIn_56_0 = stackOut_53_0;
                                  break L8;
                                }
                              }
                              L10: {
                                var5 = stackIn_56_0;
                                if (var3 != 0) {
                                  break L10;
                                } else {
                                  if (var4 != 0) {
                                    break L10;
                                  } else {
                                    if (var5 == 0) {
                                      break L3;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (var3 != 0) {
                                  var9 = 0;
                                  break L11;
                                } else {
                                  if (var4 == 0) {
                                    var9 = 2;
                                    break L11;
                                  } else {
                                    var9 = 1;
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (0 > var15.field_H) {
                                  break L12;
                                } else {
                                  if (var15.field_H >= ol.field_g.field_a) {
                                    break L12;
                                  } else {
                                    if (bi.field_g[var15.field_o][var15.field_H][var9] == null) {
                                      bi.field_g[var15.field_o][var15.field_H][var9] = new int[9];
                                      bi.field_g[var15.field_o][var15.field_H][var9][var6] = 0;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              if (var15.field_H < 0) {
                                break L3;
                              } else {
                                if (var15.field_H >= ol.field_g.field_a) {
                                  break L3;
                                } else {
                                  if (8 > bi.field_g[var15.field_o][var15.field_H][var9][var6]) {
                                    bi.field_g[var15.field_o][var15.field_H][var9][var6] = bi.field_g[var15.field_o][var15.field_H][var9][var6] + 1;
                                    var10 = bi.field_g[var15.field_o][var15.field_H][var9][var6];
                                    bi.field_g[var15.field_o][var15.field_H][var9][var10] = var14;
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            } else {
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                        var14++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var12 = 0;
                  L13: while (true) {
                    if (var12 >= ol.field_g.field_a) {
                      var11++;
                      continue L1;
                    } else {
                      var9 = 0;
                      L14: while (true) {
                        if (var9 >= 3) {
                          var12++;
                          continue L13;
                        } else {
                          L15: {
                            if (null == bi.field_g[var11][var12][var9]) {
                              break L15;
                            } else {
                              bi.field_g[var11][var12][var9][var6] = 0;
                              break L15;
                            }
                          }
                          var9++;
                          continue L14;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var2;
            stackOut_77_1 = new StringBuilder().append("nb.A(").append(param0).append(44);
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param1 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L16;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L16;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 41);
        }
    }

    final static void b(int param0, int param1) {
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
            Throwable decompiledCaughtException = null;
            L0: {
              if (qf.field_a == null) {
                break L0;
              } else {
                L1: {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (qc.field_d != aj.field_c) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (dk.field_s.field_q != 0) {
                    break L2;
                  } else {
                    if (~ol.a(256) < ~(i.field_q - -10000L)) {
                      dk.field_s.d(25, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 < dk.field_s.field_q) {
                    {
                      L4: {
                        qf.field_a.a(dk.field_s.field_q, 0, (byte) 113, dk.field_s.field_m);
                        i.field_q = ol.a(256);
                        break L4;
                      }
                    }
                    dk.field_s.field_q = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            dk.field_s.field_q = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_a = null;
    }

    static {
    }
}
