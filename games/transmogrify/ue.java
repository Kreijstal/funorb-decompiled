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
        L0: {
          if (param0 > 124) {
            break L0;
          } else {
            this.b(-103, -63);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_b) {
              break L2;
            } else {
              if (this.field_b.length <= 0) {
                break L2;
              } else {
                stackIn_6_0 = this.field_b[-1 + this.field_b.length].field_f + -this.field_b[0].field_a;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int c(int param0, int param1) {
        int var4 = 0;
        ol var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        ol[] var7 = this.field_b;
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
        if (param0 != 18) {
            field_a = -77;
        }
    }

    final int b(byte param0) {
        int var2;
        int var3;
        ol[] var4;
        int var5;
        ol var6;
        int var8;
        int var7;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var2 = 119 / ((param0 - 61) / 46);
          var3 = -1;
          if (this.field_b != null) {
            var4 = this.field_b;
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

    final static void b(int param0) {
        int incrementValue$0 = 0;
        String stackIn_12_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        sj var1 = null;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        sj var2 = null;
        sj var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        sj var6 = null;
        String var7 = null;
        sj var8 = null;
        String var9 = null;
        sj var10 = null;
        String var11 = null;
        sj var12 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (2 <= va.field_j) {
              var1_int = 0;
              L1: while (true) {
                if (-13 >= (var1_int ^ -1)) {
                  var1_int = 0;
                  L2: while (true) {
                    if (12 <= var1_int) {
                      var1_int = 0;
                      L3: while (true) {
                        if (var1_int >= 8) {
                          if (param0 == 31370) {
                            var1 = (sj) ((Object) ch.field_e.a((byte) -95));
                            L4: while (true) {
                              if (null == var1) {
                                var1_int = 0;
                                var2_int = 0;
                                L5: while (true) {
                                  if ((var2_int ^ -1) <= -13) {
                                    var2_int = 0;
                                    L6: while (true) {
                                      if (-13 >= (var2_int ^ -1)) {
                                        var2_int = 0;
                                        L7: while (true) {
                                          if (var2_int >= 8) {
                                            var2 = (sj) ((Object) ch.field_e.a((byte) -95));
                                            L8: while (true) {
                                              if (var2 == null) {
                                                decompiledRegionSelector0 = 1;
                                                break L0;
                                              } else {
                                                var2.field_j = var2.field_g;
                                                var2.field_q = var2.field_p;
                                                var2 = (sj) ((Object) ch.field_e.a(true));
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            L9: {
                                              var3 = si.field_i.field_e[var2_int];
                                              if (null == var3) {
                                                break L9;
                                              } else {
                                                var3.a(var2_int, 28, si.field_i);
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
                                      var3 = od.field_g.field_e[var2_int];
                                      if (null != var3) {
                                        incrementValue$0 = var1_int;
                                        var1_int++;
                                        var3.a(incrementValue$0, 28, od.field_g);
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
                                  if (var1.field_o != de.field_d) {
                                    if (var1.field_g != -2147483648) {
                                      System.out.println("Floating tile " + var1.field_i + " with dest " + var1.field_g + "," + var1.field_p + " believes itself to be at " + ac.a(82, var1.field_o) + "[" + var1.field_t + "]");
                                      var2_int = 0;
                                      var3_int = 0;
                                      L13: while (true) {
                                        L14: {
                                          if (12 <= var3_int) {
                                            break L14;
                                          } else {
                                            if (wk.field_a.field_e[var3_int] == null) {
                                              var2_int = 1;
                                              var1.a(var3_int, 28, wk.field_a);
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
                                            if ((var5 ^ -1) <= -9) {
                                              break L12;
                                            } else {
                                              if (null == si.field_i.field_e[var5]) {
                                                var1.a(var5, 28, si.field_i);
                                                break L12;
                                              } else {
                                                var5++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        } else {
                                          var1 = (sj) ((Object) ch.field_e.a(true));
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
                                var1 = (sj) ((Object) ch.field_e.a(true));
                                continue L4;
                              }
                            }
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        } else {
                          var10 = si.field_i.field_e[var1_int];
                          if (var10 != null) {
                            L16: {
                              L17: {
                                if (si.field_i != var10.field_o) {
                                  break L17;
                                } else {
                                  if (var10.field_t != var1_int) {
                                    break L17;
                                  } else {
                                    stackIn_31_0 = "";
                                    break L16;
                                  }
                                }
                              }
                              stackIn_31_0 = "; believes itself to be at " + ac.a(49, var10.field_o) + "[" + var10.field_t + "]";
                              break L16;
                            }
                            var11 = stackIn_31_0;
                            var3_ref = var11;
                            System.out.println("new_rack[" + var1_int + "]=" + var10.field_i + " with dest " + var10.field_g + "," + var10.field_p + var11);
                            var10.field_g = -2147483648;
                            var1_int++;
                            continue L3;
                          } else {
                            var1_int++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L18: {
                        var8 = wk.field_a.field_e[var1_int];
                        if (var8 != null) {
                          L19: {
                            L20: {
                              if (var8.field_o != wk.field_a) {
                                break L20;
                              } else {
                                if (var8.field_t != var1_int) {
                                  break L20;
                                } else {
                                  stackIn_21_0 = "";
                                  break L19;
                                }
                              }
                            }
                            stackIn_21_0 = "; believes itself to be at " + ac.a(97, var8.field_o) + "[" + var8.field_t + "]";
                            break L19;
                          }
                          var9 = stackIn_21_0;
                          var3_ref = var9;
                          System.out.println("carryover_rack[" + var1_int + "]=" + var8.field_i + " with dest " + var8.field_g + "," + var8.field_p + var9);
                          var8.field_g = -2147483648;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      var1_int++;
                      continue L2;
                    }
                  }
                } else {
                  var6 = od.field_g.field_e[var1_int];
                  if (var6 != null) {
                    L21: {
                      L22: {
                        if (var6.field_o != od.field_g) {
                          break L22;
                        } else {
                          if (var1_int == var6.field_t) {
                            stackIn_12_0 = "";
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      stackIn_12_0 = "; believes itself to be at " + ac.a(38, var6.field_o) + "[" + var6.field_t + "]";
                      break L21;
                    }
                    var7 = stackIn_12_0;
                    var3_ref = var7;
                    System.out.println("submission_rack[" + var1_int + "]=" + var6.field_i + " with dest " + var6.field_g + "," + var6.field_p + var7);
                    var6.field_g = -2147483648;
                    var1_int++;
                    continue L1;
                  } else {
                    var1_int++;
                    continue L1;
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ue.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            if (nf.field_l.field_h < param0) {
              if (null != nk.field_b) {
                try {
                  L0: {
                    var2_int = nk.field_b.a((byte) -125);
                    if (-1 <= (var2_int ^ -1)) {
                      L1: {
                        if (param1 == 0) {
                          break L1;
                        } else {
                          field_a = 89;
                          break L1;
                        }
                      }
                      L2: {
                        if ((var2_int ^ -1) > -1) {
                          break L2;
                        } else {
                          if ((mc.b(true) ^ -1L) >= -30001L) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      pc.a(1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        if (param0 - nf.field_l.field_h < var2_int) {
                          var2_int = -nf.field_l.field_h + param0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      nk.field_b.a(nf.field_l.field_h, var2_int, nf.field_l.field_g, 5768);
                      wi.field_q = lk.a(param1 ^ 0);
                      nf.field_l.field_h = nf.field_l.field_h + var2_int;
                      if (param0 > nf.field_l.field_h) {
                        stackIn_11_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        nf.field_l.field_h = 0;
                        stackIn_13_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    pc.a(1);
                    decompiledRegionSelector0 = 3;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_11_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_13_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                  if (-1 <= (var5_int ^ -1)) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_18_0 = (-param2 + param0 << -1172669496) / var5_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L2: {
                    var9 = param1.charAt(var8);
                    if ((var9 ^ -1) == -61) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (var9 != 62) {
                        if (var6 == 0) {
                          if (var9 == 32) {
                            var5_int++;
                            break L2;
                          } else {
                            var8++;
                            continue L1;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
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
              stackIn_3_0 = 126;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("ue.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        ol var6;
        int var7;
        int var8;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          if (null == this.field_b) {
            break L0;
          } else {
            if (-1 == (this.field_b.length ^ -1)) {
              break L0;
            } else {
              if (param2 < this.field_b[0].field_a) {
                break L0;
              } else {
                if (this.field_b[param1 + this.field_b.length].field_f < param2) {
                  return -1;
                } else {
                  if (1 != this.field_b.length) {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (this.field_b.length <= var5) {
                        return -1;
                      } else {
                        L2: {
                          var6 = this.field_b[var5];
                          if (param2 < var6.field_a) {
                            break L2;
                          } else {
                            if (var6.field_f >= param2) {
                              var7 = var6.b(param1 + 29792, param0);
                              if (0 != (var7 ^ -1)) {
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
                    return this.field_b[0].b(29791, param0);
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
            this.b(79, -18);
        }
        for (var3 = 0; var3 < this.field_b.length; var3++) {
            var4 = this.field_b[var3];
            if (!(var4.field_g.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_g.length);
        }
        return this.field_b.length;
    }

    static {
    }
}
