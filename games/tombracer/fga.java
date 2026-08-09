/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.BitSet;

final class fga implements sia {
    private boolean field_c;
    static String field_a;
    private int[] field_d;
    private int[] field_b;

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 32415) {
                break L1;
              } else {
                this.field_d = (int[]) null;
                break L1;
              }
            }
            ql.field_k.k(76, param0 ^ -30005);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fga.G(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 78 % ((-55 - param0) / 60);
                if (!rd.b(false)) {
                  break L2;
                } else {
                  if (!aga.a(false, param1).field_d) {
                    break L2;
                  } else {
                    stackIn_7_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_7_0 = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "fga.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void a(boolean param0, boolean param1) {
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_c) {
              if (param1) {
                if (param0) {
                  if (-3 < (ld.field_e ^ -1)) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if ((hf.field_b ^ -1) != -2) {
                        break L1;
                      } else {
                        try {
                          L2: {
                            var3_int = 0;
                            L3: while (true) {
                              L4: {
                                L5: {
                                  if (this.field_d.length <= var3_int) {
                                    break L5;
                                  } else {
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      L6: {
                                        if ((this.field_d[var3_int] ^ -1) <= (jm.field_m ^ -1)) {
                                          break L6;
                                        } else {
                                          if ((jm.field_m ^ -1) <= (40 + this.field_d[var3_int] ^ -1)) {
                                            break L6;
                                          } else {
                                            if ((lba.field_p ^ -1) >= (this.field_b[var3_int] ^ -1)) {
                                              break L6;
                                            } else {
                                              if ((this.field_b[var3_int] + 30 ^ -1) >= (lba.field_p ^ -1)) {
                                                break L6;
                                              } else {
                                                if (oj.field_tb[82]) {
                                                  break L6;
                                                } else {
                                                  L7: {
                                                    var4 = ak.a(var3_int, (byte) 56);
                                                    stackIn_32_0 = this;

                                                    stackIn_32_1 = 74;

                                                    if (f.field_e.get(var4)) {
                                                      stackIn_33_0 = this;
                                                      stackIn_33_1 = stackIn_32_1;
                                                      stackIn_33_2 = 0;
                                                      break L7;
                                                    } else {
                                                      stackIn_33_0 = this;
                                                      stackIn_33_1 = stackIn_32_1;
                                                      stackIn_33_2 = 1;
                                                      break L7;
                                                    }
                                                  }
                                                  this.a((byte) stackIn_33_1, stackIn_33_2 != 0, var4);
                                                  break L6;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3_int++;
                                      if (var5 == 0) {
                                        continue L3;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                break L4;
                              }
                              break L2;
                            }
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L8: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var3.printStackTrace();
                            break L8;
                          }
                        }
                        break L1;
                      }
                    }
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "fga.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                this.field_d = (int[]) null;
                break L1;
              }
            }
            stackIn_4_0 = this.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fga.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(byte param0, boolean param1, int param2) {
        int var4_int = 0;
        kh stackIn_3_0 = null;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              ql.field_k.k(77, -2988);
              ql.field_k.i(param2, 0);
              stackIn_3_0 = ql.field_k;

              if (!param1) {
                stackIn_4_0 = (kh) ((Object) stackIn_3_0);
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = (kh) ((Object) stackIn_3_0);
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((kh) (Object) stackIn_4_0).i(stackIn_4_1, 0);
            var4_int = -5 % ((param0 - -45) / 58);
            this.d(32415);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "fga.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    fga.a(-59, false, -121, (java.awt.Canvas) null);
                    break L2;
                  }
                }
                var4 = param3.getGraphics();
                gn.field_C.a(param2, param0, var4, 2);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref2);

            stackIn_10_1 = new StringBuilder().append("fga.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final void b(int param0) {
        try {
            int stackIn_18_0 = 0;
            BitSet stackIn_18_1 = null;
            int stackIn_19_0 = 0;
            BitSet stackIn_19_1 = null;
            int stackIn_19_2 = 0;
            int stackIn_47_0 = 0;
            int stackIn_61_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var2_int = 0;
            RuntimeException var2 = null;
            int var3_int = 0;
            ha var3 = null;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
            qva var6 = null;
            int var7 = 0;
            int var8 = 0;
            Object var9 = null;
            int var10 = 0;
            var10 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                if (!this.field_c) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (f.field_e != null) {
                    L1: {
                      L2: {
                        var2_int = aq.a(-5640);
                        if (null == this.field_d) {
                          break L2;
                        } else {
                          if (var2_int == this.field_d.length) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      this.field_b = new int[var2_int];
                      this.field_d = new int[var2_int];
                      var3_int = 20;
                      var4 = 30;
                      var5 = var3_int;
                      var6_int = 0;
                      L3: while (true) {
                        if ((var2_int ^ -1) >= (var6_int ^ -1)) {
                          break L1;
                        } else {
                          L4: {
                            if (var6_int % 15 != 0) {
                              break L4;
                            } else {
                              var4 += 30;
                              var5 = var3_int;
                              break L4;
                            }
                          }
                          this.field_d[var6_int] = var5;
                          var5 += 40;
                          this.field_b[var6_int] = var4;
                          var6_int++;
                          if (var10 == 0) {
                            continue L3;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    L5: {
                      var3 = tga.field_a;
                      var3.GA(0);
                      stackIn_18_0 = 22;

                      stackIn_18_1 = f.field_e;

                      if (rd.b(false)) {
                        stackIn_19_0 = stackIn_18_0;
                        stackIn_19_1 = (BitSet) ((Object) stackIn_18_1);
                        stackIn_19_2 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = stackIn_18_0;
                        stackIn_19_1 = (BitSet) ((Object) stackIn_18_1);
                        stackIn_19_2 = 1;
                        break L5;
                      }
                    }
                    L6: {
                      var4 = jk.a((byte) stackIn_19_0, stackIn_19_1, stackIn_19_2 != 0);
                      if (param0 == 1) {
                        break L6;
                      } else {
                        this.field_b = (int[]) null;
                        break L6;
                      }
                    }
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (var5 >= var2_int) {
                            break L9;
                          } else {
                            var6_int = ak.a(var5, (byte) 95);
                            var7 = f.field_e.get(var6_int) ? 1 : 0;
                            var8 = -10079437;
                            stackIn_61_0 = var7;

                            if (var10 != 0) {
                              break L8;
                            } else {
                              L10: {
                                L11: {
                                  if (stackIn_61_0 != 0) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if ((var5 ^ -1) <= (var4 ^ -1)) {
                                        break L12;
                                      } else {
                                        if (this.a((byte) -122, var6_int)) {
                                          break L12;
                                        } else {
                                          var8 = -7829453;
                                          if (var10 == 0) {
                                            break L10;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    if (this.a((byte) -120, var6_int)) {
                                      var8 = -2004318072;
                                      if (var10 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L13: {
                                  if (!this.a((byte) -121, var6_int)) {
                                    stackIn_47_0 = -13391309;
                                    break L13;
                                  } else {
                                    stackIn_47_0 = -2013231104;
                                    break L13;
                                  }
                                }
                                var8 = stackIn_47_0;
                                break L10;
                              }
                              L14: {
                                var3.c(var8, this.field_d[var5], 40, this.field_b[var5], -22971, 30);
                                var3.a(this.field_b[var5], this.field_d[var5], 30, 40, -10066330, (byte) -107);
                                var9 = null;
                                if (var6_int == -1) {
                                  break L14;
                                } else {
                                  var9 = Integer.toString(var6_int);
                                  break L14;
                                }
                              }
                              L15: {
                                if (var9 == null) {
                                  break L15;
                                } else {
                                  oka.a((String) (var9), 16777215, kn.field_p, -1, this.field_b[var5] - -15, 20 + this.field_d[var5], 0);
                                  break L15;
                                }
                              }
                              L16: {
                                var9 = null;
                                if (!aga.a(false, var6_int).field_d) {
                                  break L16;
                                } else {
                                  var9 = "M";
                                  break L16;
                                }
                              }
                              L17: {
                                if (null != var9) {
                                  oka.a((String) (var9), 16777215, kn.field_p, -1, 26 + this.field_b[var5], this.field_d[var5] + 20, 0);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              var5++;
                              if (var10 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        var5 = una.a(f.field_e, 20297);
                        stackIn_61_0 = 0;
                        break L8;
                      }
                      ts.a(stackIn_61_0, param0 + -16, 460, "max corridor: " + var5 + " / " + ml.a(param0 + 86), 10, kn.field_p, 16777215);
                      try {
                        L18: {
                          var3.e(param0 + -1);
                          break L18;
                        }
                      } catch (qva decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L19: {
                          var6 = (qva) (Object) decompiledCaughtException;
                          System.out.println(var6);
                          break L19;
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw tba.a((Throwable) ((Object) var2), "fga.B(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == 76) {
              L1: {
                if (!toa.field_j) {
                  f.field_e = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_c = true;
              this.field_d = null;
              this.d(32415);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fga.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean a(byte param0, char param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (13 != param2) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_c = false;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == -72) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_a = (String) null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param2 ^ -1) != -36) {
                            statePc = 33;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-101 >= (var4_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.a((byte) -128, false, var4_int);
                        var4_int++;
                        if (var7 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4_int = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var5 >= aq.a(param0 + -5568)) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_32_0 = 30;
                        stackIn_21_0 = stackIn_32_0;
                        if (var7 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 <= var4_int) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = ak.a(var5, (byte) 111);
                        if (!aga.a(false, var6).field_d) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.a((byte) 46, true, var5);
                        var4_int++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0 != 0;
                }
                case 33: {
                    try {
                        if (48 != param2) {
                            statePc = 46;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var5 ^ -1) <= (aq.a(-5640) ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_45_0 = var4_int;
                        stackIn_37_0 = stackIn_45_0;
                        if (var7 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 >= 10) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var6 = ak.a(var5, (byte) 125);
                        if (!aga.a(false, var6).field_d) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.a((byte) 110, true, var5);
                        var4_int++;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return stackIn_45_0 != 0;
                }
                case 46: {
                    try {
                        stackIn_47_0 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0 != 0;
                }
                case 48: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var4), "fga.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        try {
            int var1_int = 78 / ((63 - param0) / 40);
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fga.J(" + param0 + ')');
        }
    }

    fga() {
        this.field_c = false;
        this.field_d = null;
        this.field_b = null;
    }

    static {
        field_a = "Menu";
    }
}
