/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ue {
    static int field_a;
    ol[] field_b;
    static ii[] field_c;

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 124) {
            break L0;
          } else {
            int discarded$2 = ((ue) this).b(-103, -63);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ue) this).field_b) {
              break L2;
            } else {
              if (((ue) this).field_b.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = ((ue) this).field_b[-1 + ((ue) this).field_b.length].field_f + -((ue) this).field_b[0].field_a;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int c(int param0, int param1) {
        int var4 = 0;
        ol var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        ol[] var7 = ((ue) this).field_b;
        ol[] var3 = var7;
        for (var4 = param0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param1 >= var5.field_g.length)) {
                return var5.field_g[param1];
            }
            param1 = param1 - (var5.field_g.length - 1);
        }
        return 0;
    }

    public static void a(byte param0) {
        field_c = null;
    }

    final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ol[] var4 = null;
        int var5 = 0;
        ol var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var2 = 119 / ((param0 - 61) / 46);
          var3 = -1;
          if (((ue) this).field_b != null) {
            var4 = ((ue) this).field_b;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                break L0;
              } else {
                var6 = var4[var5];
                if (var6 != null) {
                  var7 = var6.a(-44);
                  if (var3 < var7) {
                    var3 = var7;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var3;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        sj var1_ref = null;
        int var2_int = 0;
        sj var2 = null;
        String var3 = null;
        sj var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        sj var6 = null;
        sj var8 = null;
        String var9 = null;
        sj var10 = null;
        sj var12 = null;
        sj var13 = null;
        String stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        String stackOut_15_0 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (2 <= va.field_j) {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= 12) {
                  var1_int = 0;
                  L2: while (true) {
                    if (12 <= var1_int) {
                      var1_int = 0;
                      L3: while (true) {
                        if (var1_int >= 8) {
                          var1_ref = (sj) (Object) ch.field_e.a((byte) -95);
                          L4: while (true) {
                            if (var1_ref == null) {
                              var1_int = 0;
                              var2_int = 0;
                              L5: while (true) {
                                if (var2_int >= 12) {
                                  var2_int = 0;
                                  L6: while (true) {
                                    if (var2_int >= 12) {
                                      var2_int = 0;
                                      L7: while (true) {
                                        if (var2_int >= 8) {
                                          var2 = (sj) (Object) ch.field_e.a((byte) -95);
                                          L8: while (true) {
                                            if (var2 == null) {
                                              break L0;
                                            } else {
                                              var2.field_j = var2.field_g;
                                              var2.field_q = var2.field_p;
                                              var2 = (sj) (Object) ch.field_e.a(true);
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          L9: {
                                            var13 = si.field_i.field_e[var2_int];
                                            if (var13 == null) {
                                              break L9;
                                            } else {
                                              var13.a(var2_int, 28, si.field_i);
                                              break L9;
                                            }
                                          }
                                          var2_int++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      L10: {
                                        var12 = wk.field_a.field_e[var2_int];
                                        if (var12 != null) {
                                          var12.a(var2_int, 28, wk.field_a);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      var2_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  L11: {
                                    var3_ref = od.field_g.field_e[var2_int];
                                    if (var3_ref != null) {
                                      int incrementValue$1 = var1_int;
                                      var1_int++;
                                      var3_ref.a(incrementValue$1, 28, od.field_g);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  var2_int++;
                                  continue L5;
                                }
                              }
                            } else {
                              L12: {
                                if (var1_ref.field_o != de.field_d) {
                                  if (var1_ref.field_g != -2147483648) {
                                    System.out.println("Floating tile " + var1_ref.field_i + " with dest " + var1_ref.field_g + "," + var1_ref.field_p + " believes itself to be at " + ac.a(82, var1_ref.field_o) + "[" + var1_ref.field_t + "]");
                                    var2_int = 0;
                                    var3_int = 0;
                                    L13: while (true) {
                                      L14: {
                                        if (12 <= var3_int) {
                                          break L14;
                                        } else {
                                          if (wk.field_a.field_e[var3_int] == null) {
                                            var2_int = 1;
                                            var1_ref.a(var3_int, 28, wk.field_a);
                                            break L14;
                                          } else {
                                            var3_int++;
                                            continue L13;
                                          }
                                        }
                                      }
                                      if (var2_int == 0) {
                                        var5 = 0;
                                        var3_int = var5;
                                        L15: while (true) {
                                          if (var5 >= 8) {
                                            break L12;
                                          } else {
                                            if (null == si.field_i.field_e[var5]) {
                                              var1_ref.a(var5, 28, si.field_i);
                                              break L12;
                                            } else {
                                              var5++;
                                              continue L15;
                                            }
                                          }
                                        }
                                      } else {
                                        var1_ref = (sj) (Object) ch.field_e.a(true);
                                        continue L4;
                                      }
                                    }
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              var1_ref = (sj) (Object) ch.field_e.a(true);
                              continue L4;
                            }
                          }
                        } else {
                          L16: {
                            var10 = si.field_i.field_e[var1_int];
                            if (var10 == null) {
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          var1_int++;
                          continue L3;
                        }
                      }
                    } else {
                      L17: {
                        var8 = wk.field_a.field_e[var1_int];
                        if (var8 != null) {
                          L18: {
                            L19: {
                              if (var8.field_o != wk.field_a) {
                                break L19;
                              } else {
                                if (var8.field_t != var1_int) {
                                  break L19;
                                } else {
                                  stackOut_14_0 = "";
                                  stackIn_16_0 = stackOut_14_0;
                                  break L18;
                                }
                              }
                            }
                            stackOut_15_0 = "; believes itself to be at " + ac.a(97, var8.field_o) + "[" + var8.field_t + "]";
                            stackIn_16_0 = stackOut_15_0;
                            break L18;
                          }
                          var9 = stackIn_16_0;
                          var3 = var9;
                          System.out.println("carryover_rack[" + var1_int + "]=" + var8.field_i + " with dest " + var8.field_g + "," + var8.field_p + var9);
                          var8.field_g = -2147483648;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var1_int++;
                      continue L2;
                    }
                  }
                } else {
                  L20: {
                    var6 = od.field_g.field_e[var1_int];
                    if (var6 == null) {
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "ue.E(" + 31370 + 41);
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_12_0 = 0;
            if (nf.field_l.field_h < param0) {
              if (null != nk.field_b) {
                try {
                  L0: {
                    var2_int = nk.field_b.a((byte) -125);
                    if (var2_int <= 0) {
                      L1: {
                        field_a = 89;
                        if (var2_int < 0) {
                          break L1;
                        } else {
                          int discarded$5 = 1;
                          if (mc.b() <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      int discarded$6 = 1;
                      pc.a();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L2: {
                        if (param0 - nf.field_l.field_h < var2_int) {
                          var2_int = -nf.field_l.field_h + param0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      nk.field_b.a(nf.field_l.field_h, var2_int, nf.field_l.field_g, 5768);
                      wi.field_q = lk.a(0);
                      nf.field_l.field_h = nf.field_l.field_h + var2_int;
                      if (param0 > nf.field_l.field_h) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        nf.field_l.field_h = 0;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    int discarded$7 = 1;
                    pc.a();
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            if (param3 == 12) {
              var7 = param1.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if (var5_int <= 0) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_15_0 = (-param2 + param0 << 8) / var5_int;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  L2: {
                    var9 = param1.charAt(var8);
                    if (var9 == 60) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (var9 != 62) {
                        L3: {
                          if (var6 != 0) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L1;
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 126;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("ue.C(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_18_0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ol var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          if (null == ((ue) this).field_b) {
            break L0;
          } else {
            if (((ue) this).field_b.length == 0) {
              break L0;
            } else {
              if (param2 < ((ue) this).field_b[0].field_a) {
                break L0;
              } else {
                if (((ue) this).field_b[param1 + ((ue) this).field_b.length].field_f < param2) {
                  return -1;
                } else {
                  if (1 != ((ue) this).field_b.length) {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (((ue) this).field_b.length <= var5) {
                        return -1;
                      } else {
                        L2: {
                          var6 = ((ue) this).field_b[var5];
                          if (param2 < var6.field_a) {
                            break L2;
                          } else {
                            if (var6.field_f >= param2) {
                              var7 = var6.b(param1 + 29792, param0);
                              if (var7 != -1) {
                                return var4 + var7;
                              } else {
                                return -1;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_g.length);
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    return ((ue) this).field_b[0].b(29791, param0);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        ol var4 = null;
        int var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 != -1) {
            int discarded$0 = ((ue) this).b(79, -18);
        }
        for (var3 = 0; var3 < ((ue) this).field_b.length; var3++) {
            var4 = ((ue) this).field_b[var3];
            if (!(var4.field_g.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_g.length);
        }
        return ((ue) this).field_b.length;
    }

    static {
    }
}
