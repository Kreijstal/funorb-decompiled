/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rda extends ci {
    static String[] field_m;
    static int[] field_n;
    private rra[] field_p;
    static int field_o;

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.a(80, (int[][]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-1 != (param2 ^ -1)) {
                  break L3;
                } else {
                  this.field_p = new rra[param1.h(255)];
                  var4_int = 0;
                  L4: while (true) {
                    L5: {
                      if (this.field_p.length <= var4_int) {
                        break L5;
                      } else {
                        var5 = param1.h(255);
                        var6 = var5;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          L6: {
                            L7: {
                              L8: {
                                L9: {
                                  if (0 == var6) {
                                    this.field_p[var4_int] = (rra) ((Object) od.a(0, param1));
                                    if (var7 == 0) {
                                      break L6;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    if ((var6 ^ -1) == -2) {
                                      break L9;
                                    } else {
                                      if (-3 == (var6 ^ -1)) {
                                        break L8;
                                      } else {
                                        if (3 == var6) {
                                          break L7;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                                this.field_p[var4_int] = (rra) ((Object) lga.a(param1, (byte) -88));
                                if (var7 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                              this.field_p[var4_int] = (rra) ((Object) gpa.a(4, param1));
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                            this.field_p[var4_int] = (rra) ((Object) cba.a(64, param1));
                            break L6;
                          }
                          var4_int++;
                          if (var7 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (-2 != (param2 ^ -1)) {
                break L2;
              } else {
                L10: {
                  stackOut_21_0 = this;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if ((param1.h(255) ^ -1) != -2) {
                    stackOut_23_0 = this;
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L10;
                  } else {
                    stackOut_22_0 = this;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L10;
                  }
                }
                ((rda) (this)).field_g = stackIn_24_1 != 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("rda.A(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int[][] param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        rra var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ns.field_g;
              if (param0 == -8883) {
                break L1;
              } else {
                discarded$2 = rda.d(56);
                break L1;
              }
            }
            var4 = qda.field_i;
            nfa.a(param1, param0 ^ -8901);
            loa.a(una.field_b, false, 0, 0, hba.field_b);
            if (null != this.field_p) {
              var5 = 0;
              L2: while (true) {
                if (var5 >= this.field_p.length) {
                  break L0;
                } else {
                  var6 = this.field_p[var5];
                  var7 = var6.field_c;
                  var8 = var6.field_b;
                  if (var9 == 0) {
                    L3: {
                      L4: {
                        if (var7 < 0) {
                          break L4;
                        } else {
                          L5: {
                            if (0 > var8) {
                              break L5;
                            } else {
                              var6.a((byte) -122, var3_int, var4);
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var6.a(var4, 119, var3_int);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if ((var8 ^ -1) <= -1) {
                        var6.a(var3_int, var4, true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("rda.D(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    public rda() {
        super(0, true);
    }

    final static void d(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -128) {
            discarded$0 = rda.d(63);
            bl.field_a = null;
            return;
        }
        bl.field_a = null;
    }

    final static void e(int param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var3 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == wg.field_l) {
                    break L1;
                  } else {
                    wg.field_l.a(param0 + -21);
                    break L1;
                  }
                }
                if (param0 == 0) {
                  L2: {
                    if (null == ep.field_k) {
                      break L2;
                    } else {
                      ep.field_k.a((byte) 118);
                      break L2;
                    }
                  }
                  L3: {
                    if (null == wka.field_c) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          wka.field_c.b((byte) -52);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      break L3;
                    }
                  }
                  L6: {
                    if (null == tna.field_c) {
                      break L6;
                    } else {
                      var1_int = 0;
                      L7: while (true) {
                        if (var1_int >= tna.field_c.length) {
                          break L6;
                        } else {
                          if (var3 == 0) {
                            L8: {
                              if (tna.field_c[var1_int] != null) {
                                try {
                                  L9: {
                                    tna.field_c[var1_int].b((byte) -37);
                                    break L9;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var2_ref = (IOException) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var1_int++;
                            continue L7;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw tba.a((Throwable) ((Object) var1), "rda.C(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_n = null;
        if (param0 > -82) {
            field_o = -33;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param0 == 1) {
          var4 = this.field_i.a((byte) 107, param1);
          var3 = var4;
          if (this.field_i.field_d) {
            this.a(-8883, this.field_i.a(0));
            return var4;
          } else {
            return var4;
          }
        } else {
          field_n = (int[]) null;
          var4 = this.field_i.a((byte) 107, param1);
          var3 = var4;
          if (!this.field_i.field_d) {
            return var4;
          } else {
            this.a(-8883, this.field_i.a(0));
            return var4;
          }
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int[][] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var20 = null;
        int[][] var22 = null;
        int[][][] var23 = null;
        int[][] var24 = null;
        int[][] var26 = null;
        int[][][] var28 = null;
        int[] var33 = null;
        int[][] var34 = null;
        int[][][] var35 = null;
        int[] var36 = null;
        int[][] stackIn_8_0 = null;
        int[][] stackIn_16_0 = null;
        int[][] stackIn_21_0 = null;
        int[][] stackIn_29_0 = null;
        int[][] stackOut_20_0 = null;
        int[][] stackOut_28_0 = null;
        int[][] stackOut_7_0 = null;
        int[][] stackOut_15_0 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        var17 = this.field_h.a(param0, (byte) 125);
        var3 = var17;
        if (param1 == -1) {
          if (!this.field_h.field_f) {
            return var17;
          } else {
            var4 = ns.field_g;
            var5 = qda.field_i;
            var34 = new int[var5][var4];
            var35 = this.field_h.a((byte) -98);
            this.a(-8883, var34);
            var8 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var8 >= qda.field_i) {
                    break L2;
                  } else {
                    var36 = var34[var8];
                    var24 = var35[var8];
                    var20 = var24;
                    var10 = var20;
                    var11 = var24[0];
                    var12 = var24[1];
                    stackOut_20_0 = (int[][]) (var10);
                    stackIn_29_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var16 != 0) {
                      break L1;
                    } else {
                      var13 = stackIn_21_0[2];
                      var14 = 0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (ns.field_g <= var14) {
                              break L5;
                            } else {
                              var15 = var36[var14];
                              var13[var14] = sea.c(255, var15) << -1948639356;
                              var12[var14] = sea.c(65280, var15) >> 78470276;
                              var11[var14] = sea.c(var15, 16711680) >> -1606044692;
                              var14++;
                              if (var16 != 0) {
                                break L4;
                              } else {
                                if (var16 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var8++;
                          break L4;
                        }
                        if (var16 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_28_0 = (int[][]) (var17);
                stackIn_29_0 = stackOut_28_0;
                break L1;
              }
              return stackIn_29_0;
            }
          }
        } else {
          L6: {
            L7: {
              field_m = (String[]) null;
              if (this.field_h.field_f) {
                var4 = ns.field_g;
                var5 = qda.field_i;
                var26 = new int[var5][var4];
                var22 = var26;
                var28 = this.field_h.a((byte) -98);
                var23 = var28;
                this.a(-8883, var26);
                var8 = 0;
                L8: while (true) {
                  if (var8 < qda.field_i) {
                    var26 = var22;
                    var28 = var23;
                    var33 = var26[var8];
                    var24 = var28[var8];
                    var20 = var24;
                    var10 = var20;
                    var11 = var24[0];
                    var12 = var24[1];
                    stackOut_7_0 = (int[][]) (var10);
                    stackIn_16_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var16 != 0) {
                      break L6;
                    } else {
                      var13 = stackIn_8_0[2];
                      var14 = 0;
                      L9: while (true) {
                        L10: {
                          L11: {
                            if (ns.field_g <= var14) {
                              break L11;
                            } else {
                              var15 = var33[var14];
                              var13[var14] = sea.c(255, var15) << -1948639356;
                              var12[var14] = sea.c(65280, var15) >> 78470276;
                              var11[var14] = sea.c(var15, 16711680) >> -1606044692;
                              var14++;
                              if (var16 != 0) {
                                break L10;
                              } else {
                                if (var16 == 0) {
                                  continue L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var8++;
                          break L10;
                        }
                        if (var16 == 0) {
                          continue L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                  } else {
                    return var17;
                  }
                }
              } else {
                break L7;
              }
            }
            stackOut_15_0 = (int[][]) (var17);
            stackIn_16_0 = stackOut_15_0;
            break L6;
          }
          return stackIn_16_0;
        }
    }

    final static boolean d(int param0) {
        if (param0 != 20125) {
            return true;
        }
        return ld.field_e >= 2 ? true : false;
    }

    static {
    }
}
