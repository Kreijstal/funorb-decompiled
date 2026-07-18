/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rfa extends ug implements sia {
    static String field_B;
    static jea field_C;

    abstract boolean a(int param0, kh param1, byte param2);

    final void c(int param0) {
        RuntimeException runtimeException = null;
        java.awt.Canvas var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = kw.b((byte) -97);
            if (wna.c(-127)) {
              fh.a(vka.A(90), var2, param0);
              return;
            } else {
              if (!lla.field_b) {
                dba.a(var2, (byte) 101);
                return;
              } else {
                L1: {
                  if (av.field_e) {
                    break L1;
                  } else {
                    if (!vpa.a(109)) {
                      ima.a(100.0f, th.field_u, -75);
                      dba.a(var2, (byte) 111);
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                cna.field_a = true;
                if (param0 == 0) {
                  var3 = -1 + kra.field_c.size();
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            ((sia) kra.field_c.elementAt(var3)).b(param0 + 1);
                            var3--;
                            if (var4 != 0) {
                              break L4;
                            } else {
                              if (var4 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          if (cna.field_a) {
                            break L6;
                          } else {
                            this.c(true);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                        boolean discarded$2 = pka.a(false);
                        break L4;
                      }
                      fga.a(0, false, 0, var2);
                      break L3;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "rfa.P(" + param0 + ')');
        }
    }

    final void a(eb param0, int param1) {
        try {
            RuntimeException runtimeException = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            RuntimeException decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                dma.field_l = param0;
                ((rfa) this).b((byte) 106, true);
                if (param1 > 34) {
                  ((rfa) this).s(-1);
                  ((rfa) this).j(-13);
                  ((rfa) this).o(9822);
                  ((rfa) this).g((byte) -126);
                  ((rfa) this).p(22);
                  ((rfa) this).d((byte) 87);
                  vca.field_c[9] = -1;
                  vca.field_c[10] = -1;
                  kra.field_c = new Vector();
                  aca.a((sia) this, 19711);
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                runtimeException = decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) runtimeException;
                stackOut_4_1 = new StringBuilder().append("rfa.GB(");
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_8_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected rfa() {
    }

    private final void c(boolean param0) {
        try {
            if (!param0) {
                field_B = null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rfa.KB(" + param0 + ')');
        }
    }

    public abstract void a(boolean param0, boolean param1);

    public static void w(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_C = null;
              if (param0 >= 105) {
                break L1;
              } else {
                iu[] discarded$2 = rfa.a((iu[]) null, 100);
                break L1;
              }
            }
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "rfa.LB(" + param0 + ')');
        }
    }

    abstract void b(int param0, int param1);

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        sia var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_42_0 = false;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        boolean stackIn_63_0 = false;
        int stackIn_75_0 = 0;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_41_0 = false;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        boolean stackOut_62_0 = false;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        boolean stackOut_108_0 = false;
        int stackOut_108_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (lca.a(stackIn_5_0 != 0)) {
                    break L4;
                  } else {
                    L5: {
                      if (!una.a((byte) 127)) {
                        break L5;
                      } else {
                        L6: {
                          if (sr.a(126)) {
                            break L6;
                          } else {
                            L7: {
                              L8: {
                                var3 = vk.c(107);
                                if (var3 != 2) {
                                  break L8;
                                } else {
                                  og.b(0);
                                  if (var5 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (var3 == 3) {
                                  break L9;
                                } else {
                                  if (var3 == 4) {
                                    ts.a((byte) -63, ck.field_b, false);
                                    kpa.field_c = true;
                                    if (var5 == 0) {
                                      break L7;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              in.a(-30600, true);
                              break L7;
                            }
                            ((rfa) this).a(true, false);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                        au.b(false);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L10: {
                      if (fja.h(105)) {
                        break L10;
                      } else {
                        L11: {
                          if (ofa.d(true)) {
                            break L11;
                          } else {
                            L12: {
                              if (sr.a(125)) {
                                break L12;
                              } else {
                                var2_int = 1;
                                var3 = -1;
                                L13: while (true) {
                                  stackOut_41_0 = es.a(true);
                                  stackIn_42_0 = stackOut_41_0;
                                  L14: while (true) {
                                    L15: {
                                      if (!stackIn_42_0) {
                                        break L15;
                                      } else {
                                        stackOut_43_0 = 0;
                                        stackOut_43_1 = ~fna.field_h;
                                        stackIn_109_0 = stackOut_43_0;
                                        stackIn_109_1 = stackOut_43_1;
                                        stackIn_44_0 = stackOut_43_0;
                                        stackIn_44_1 = stackOut_43_1;
                                        if (var5 != 0) {
                                          break L2;
                                        } else {
                                          L16: {
                                            L17: {
                                              if (stackIn_44_0 == stackIn_44_1) {
                                                break L17;
                                              } else {
                                                if (on.a((byte) 15, fna.field_h)) {
                                                  var3 = fna.field_h;
                                                  if (var5 == 0) {
                                                    continue L13;
                                                  } else {
                                                    break L17;
                                                  }
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            if (fna.field_h != -1) {
                                              break L16;
                                            } else {
                                              if (var3 != -1) {
                                                fna.field_h = var3;
                                                var3 = -1;
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          var4_int = 0;
                                          L18: while (true) {
                                            L19: {
                                              if (~kra.field_c.size() >= ~var4_int) {
                                                break L19;
                                              } else {
                                                stackOut_62_0 = ((sia) kra.field_c.elementAt(var4_int)).a((byte) -72, kda.field_td, fna.field_h);
                                                stackIn_42_0 = stackOut_62_0;
                                                stackIn_63_0 = stackOut_62_0;
                                                if (var5 != 0) {
                                                  continue L14;
                                                } else {
                                                  if (stackIn_63_0) {
                                                    break L19;
                                                  } else {
                                                    var4_int++;
                                                    if (var5 == 0) {
                                                      continue L18;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var5 == 0) {
                                              continue L13;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var5 == 0) {
                                      break L3;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            L20: {
                              if (param0) {
                                stackOut_74_0 = 0;
                                stackIn_75_0 = stackOut_74_0;
                                break L20;
                              } else {
                                stackOut_72_0 = 1;
                                stackIn_75_0 = stackOut_72_0;
                                break L20;
                              }
                            }
                            au.b(stackIn_75_0 != 0);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L21: {
                          if (sr.a(119)) {
                            break L21;
                          } else {
                            L22: {
                              var3 = kc.a(true);
                              if (var3 != 1) {
                                break L22;
                              } else {
                                ts.a((byte) -63, ura.field_a, true);
                                break L22;
                              }
                            }
                            ((rfa) this).a(true, false);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L21;
                            }
                          }
                        }
                        au.b(false);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L23: {
                      stackOut_86_0 = this;
                      stackOut_86_1 = -85;
                      stackIn_91_0 = stackOut_86_0;
                      stackIn_91_1 = stackOut_86_1;
                      stackIn_87_0 = stackOut_86_0;
                      stackIn_87_1 = stackOut_86_1;
                      if (null == dq.field_f) {
                        stackOut_91_0 = this;
                        stackOut_91_1 = stackIn_91_1;
                        stackOut_91_2 = 0;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        stackIn_92_2 = stackOut_91_2;
                        break L23;
                      } else {
                        stackOut_87_0 = this;
                        stackOut_87_1 = stackIn_87_1;
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_89_1 = stackOut_87_1;
                        stackOut_89_0 = this;
                        stackOut_89_1 = stackIn_89_1;
                        stackOut_89_2 = 1;
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_92_2 = stackOut_89_2;
                        break L23;
                      }
                    }
                    L24: {
                      L25: {
                        var3 = ((rfa) this).a(stackIn_92_1, stackIn_92_2 != 0);
                        if (var3 == 1) {
                          break L25;
                        } else {
                          if (var3 == 2) {
                            break L25;
                          } else {
                            break L24;
                          }
                        }
                      }
                      L26: {
                        if (dq.field_f == null) {
                          break L26;
                        } else {
                          og.b(0);
                          break L26;
                        }
                      }
                      if (2 == var3) {
                        hha.a(di.a(110), (byte) -95);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    ((rfa) this).a(true, false);
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                ((rfa) this).a(param0, false);
                break L3;
              }
              stackOut_108_0 = param0;
              stackOut_108_1 = 1;
              stackIn_109_0 = stackOut_108_0 ? 1 : 0;
              stackIn_109_1 = stackOut_108_1;
              break L2;
            }
            if (stackIn_109_0 == stackIn_109_1) {
              var3 = 0;
              L27: while (true) {
                L28: {
                  L29: {
                    if (~kra.field_c.size() >= ~var3) {
                      break L29;
                    } else {
                      var4 = (sia) kra.field_c.elementAt(var3);
                      var4.a(true, var2_int != 0);
                      if (var5 != 0) {
                        break L28;
                      } else {
                        L30: {
                          stackOut_114_0 = var2_int;
                          stackIn_119_0 = stackOut_114_0;
                          stackIn_115_0 = stackOut_114_0;
                          if (var4.a(-2)) {
                            stackOut_119_0 = stackIn_119_0;
                            stackOut_119_1 = 0;
                            stackIn_120_0 = stackOut_119_0;
                            stackIn_120_1 = stackOut_119_1;
                            break L30;
                          } else {
                            stackOut_115_0 = stackIn_115_0;
                            stackIn_117_0 = stackOut_115_0;
                            stackOut_117_0 = stackIn_117_0;
                            stackOut_117_1 = 1;
                            stackIn_120_0 = stackOut_117_0;
                            stackIn_120_1 = stackOut_117_1;
                            break L30;
                          }
                        }
                        var2_int = stackIn_120_0 & stackIn_120_1;
                        var3++;
                        if (var5 == 0) {
                          continue L27;
                        } else {
                          break L29;
                        }
                      }
                    }
                  }
                  break L28;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "rfa.IB(" + param0 + ')');
        }
    }

    public abstract void b(int param0);

    public final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "rfa.A(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static iu[] a(iu[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        iu var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        iu[] stackIn_6_0 = null;
        iu[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        iu[] stackOut_5_0 = null;
        iu[] stackOut_9_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param1 >= 111) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (~param0.length >= ~var2_int) {
                      break L3;
                    } else {
                      var3 = param0[var2_int];
                      param0[var2_int].field_p = 0;
                      var3.field_o = 0;
                      param0[var2_int].field_n = param0[var2_int].field_m;
                      stackOut_5_0 = (iu[]) param0;
                      stackIn_10_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        stackIn_6_0[var2_int].field_k = param0[var2_int].field_q;
                        var2_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_9_0 = (iu[]) param0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (iu[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("rfa.HB(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        cga var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (dq.field_f == null) {
                break L1;
              } else {
                if (!dq.field_f.field_b) {
                  break L1;
                } else {
                  og.b(0);
                  vd.b(1);
                  break L1;
                }
              }
            }
            L2: {
              stackOut_7_0 = this;
              stackOut_7_1 = -127;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (dq.field_f == null) {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L2;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 1;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_11_2 = stackOut_8_2;
                break L2;
              }
            }
            L3: {
              ((rfa) this).c((byte) stackIn_11_1, stackIn_11_2 != 0);
              if (!lpa.field_w) {
                break L3;
              } else {
                dma.field_l.a((byte) -38);
                lpa.field_w = false;
                break L3;
              }
            }
            L4: {
              if (wna.c(-128)) {
                ((rfa) this).r(114);
                if (wna.c(-112)) {
                  return;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              L6: {
                this.u(97);
                if (!lla.field_b) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (av.field_e) {
                        break L8;
                      } else {
                        if (!vpa.a(84)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.b(true);
                    if (var4 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                  if (!dma.field_l.a(-127)) {
                    break L5;
                  } else {
                    av.field_e = true;
                    ((rfa) this).v(24230);
                    ln.A(116);
                    if (var4 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              tc.a(pg.field_y, -2886);
              if (dma.field_l.b(-4171)) {
                dma.field_l.b((byte) -49);
                lla.field_b = true;
                break L5;
              } else {
                break L5;
              }
            }
            L9: {
              L10: {
                if (vpa.a(66)) {
                  break L10;
                } else {
                  L11: while (true) {
                    var2_ref = (cga) (Object) sua.field_H.c(119);
                    if (var2_ref == null) {
                      break L10;
                    } else {
                      woa.a(4, var2_ref, false);
                      if (var4 != 0) {
                        break L9;
                      } else {
                        if (var4 == 0) {
                          continue L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
              }
              dra.a(param0);
              vsa.c((byte) 120, 0);
              break L9;
            }
            L12: {
              if (!uma.b(-1)) {
                break L12;
              } else {
                L13: {
                  L14: {
                    var2_int = ((rfa) this).t(8);
                    if (0 == var2_int) {
                      break L14;
                    } else {
                      if (var2_int == 1) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ((rfa) this).b(var2_int, 120);
                  break L13;
                }
                L15: {
                  var3 = 0;
                  if (var2_int != 2) {
                    break L15;
                  } else {
                    var3 = 1;
                    break L15;
                  }
                }
                L16: {
                  if (!((rfa) this).h((byte) 84)) {
                    break L16;
                  } else {
                    var3 = 1;
                    break L16;
                  }
                }
                L17: {
                  if (uma.b(-1)) {
                    break L17;
                  } else {
                    var3 = 0;
                    break L17;
                  }
                }
                if (var3 != 0) {
                  dw.b((byte) -16);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "rfa.K(" + param0 + ')');
        }
    }

    abstract void v(int param0);

    private final void u(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 68 % ((param0 - 52) / 40);
            L1: while (true) {
              L2: {
                L3: {
                  if (!cj.a(vca.field_c, 0)) {
                    break L3;
                  } else {
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!((rfa) this).a(oka.field_z, vc.field_q, (byte) 105)) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((rfa) this).m(-5);
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "rfa.JB(" + param0 + ')');
        }
    }

    public abstract boolean a(byte param0, char param1, int param2);

    abstract boolean h(byte param0);

    static {
    }
}
