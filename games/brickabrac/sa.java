/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sa extends qg implements vc {
    static boolean field_E;

    public abstract void a(boolean param0, byte param1);

    private final void j(boolean param0) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        boolean stackIn_3_0 = false;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        Object stackOut_9_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        boolean stackOut_14_0 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (!nl.a(ch.field_g, (byte) 64)) {
                    break L3;
                  } else {
                    stackOut_2_0 = ((sa) this).a(jl.field_e, (byte) 47, si.field_a);
                    stackIn_15_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_3_0) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        stackOut_9_0 = this;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (param0) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L5;
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = 1;
                          stackIn_13_0 = stackOut_10_0;
                          stackIn_13_1 = stackOut_10_1;
                          break L5;
                        }
                      }
                      ((sa) this).h(stackIn_13_1 != 0);
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_14_0 = param0;
                stackIn_15_0 = stackOut_14_0;
                break L2;
              }
              L6: {
                if (stackIn_15_0) {
                  break L6;
                } else {
                  field_E = false;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "sa.LB(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            param0 = param0 & 8191;
            if (~param0 > param1) {
              L1: {
                if (param0 >= 2048) {
                  stackOut_11_0 = um.field_j[4096 - param0];
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_9_0 = um.field_j[param0];
                  stackIn_12_0 = stackOut_9_0;
                  break L1;
                }
              }
              break L0;
            } else {
              L2: {
                if (param0 < 6144) {
                  stackOut_6_0 = -um.field_j[-4096 + param0];
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_4_0 = -um.field_j[8192 + -param0];
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              }
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "sa.KB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final static boolean a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            if (dc.field_b == 13) {
              th.b(param1 ^ 103);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (dc.field_b == param1) {
                hd.field_a.f((byte) 41);
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (hd.field_a == null) {
                      break L2;
                    } else {
                      if (!hd.field_a.a(param2, param0, (byte) -126)) {
                        break L2;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_17_0 = stackOut_14_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "sa.IB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    public abstract void a(int param0);

    abstract void b(int param0, int param1);

    public abstract boolean a(int param0, char param1, int param2);

    private final void i(boolean param0) {
        try {
            if (param0) {
                ((sa) this).f(-67);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "sa.JB(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException runtimeException = null;
        java.awt.Canvas var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2 = gd.a((byte) 0);
            if (r.c((byte) -84)) {
              pk.a((byte) 68, var2, mj.a((byte) -81));
              return;
            } else {
              if (!un.field_f) {
                kn.a(true, var2);
                return;
              } else {
                L1: {
                  if (um.field_t) {
                    break L1;
                  } else {
                    if (og.h(-26090)) {
                      break L1;
                    } else {
                      ai.a((byte) 24, 100.0f, qm.field_e);
                      kn.a(true, var2);
                      return;
                    }
                  }
                }
                pe.field_i = true;
                var3 = kp.field_d.size() + -1;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var3 < 0) {
                        break L4;
                      } else {
                        ((vc) kp.field_d.elementAt(var3)).a(16769381);
                        var3--;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (param0 > 93) {
                      break L3;
                    } else {
                      field_E = false;
                      break L3;
                    }
                  }
                  L5: {
                    L6: {
                      if (!pe.field_i) {
                        break L6;
                      } else {
                        boolean discarded$3 = jj.a((byte) -123);
                        ck.a(var2, 0, 14209, 0);
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.i(false);
                    break L5;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "sa.T(" + param0 + ')');
        }
    }

    protected sa() {
    }

    final void a(int param0, wb param1) {
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
                al.field_j = param1;
                ((sa) this).a(8, true);
                ((sa) this).l(param0 ^ 3156);
                ((sa) this).i(2);
                ((sa) this).e(true);
                ((sa) this).b((byte) -67);
                if (param0 == 3160) {
                  ((sa) this).j(64);
                  ((sa) this).c((byte) -19);
                  ch.field_g[9] = -1;
                  ch.field_g[10] = -1;
                  kp.field_d = new Vector();
                  op.a((vc) this, 0);
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
                stackOut_4_1 = new StringBuilder().append("sa.HB(").append(param0).append(',');
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
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
              throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean a(pi param0, byte param1, int param2);

    final static void a(int param0, bi param1, String param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var7_int = (-param1.field_B + (param4 + (2 * param0 - param1.field_L))) / 2;
            var8 = -69 / ((param6 - -85) / 40);
            nn.field_g.b(param2, param3, var7_int + nn.field_g.field_B, param5, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("sa.NB(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void r(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        vc var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean stackIn_70_0 = false;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        boolean stackIn_91_0 = false;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_32_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        boolean stackOut_69_0 = false;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        boolean stackOut_90_0 = false;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == 10) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      var2_int = 0;
                      if (m.a(2)) {
                        break L4;
                      } else {
                        L5: {
                          if (!lg.a(9)) {
                            break L5;
                          } else {
                            L6: {
                              if (me.b(126)) {
                                break L6;
                              } else {
                                L7: {
                                  L8: {
                                    var3 = md.f((byte) 124);
                                    if (var3 == 2) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (var3 != 3) {
                                          break L9;
                                        } else {
                                          cp.a(true, 21543);
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (var3 != 4) {
                                        break L7;
                                      } else {
                                        he.a(qn.field_k, false, (byte) 61);
                                        wi.field_g = true;
                                        if (var5 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  nc.b(102);
                                  break L7;
                                }
                                ((sa) this).a(false, (byte) 69);
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            nk.a(58);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L10: {
                          if (!dj.c((byte) -33)) {
                            break L10;
                          } else {
                            L11: {
                              stackOut_32_0 = this;
                              stackIn_37_0 = stackOut_32_0;
                              stackIn_33_0 = stackOut_32_0;
                              if (ua.field_d == null) {
                                stackOut_37_0 = this;
                                stackOut_37_1 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                break L11;
                              } else {
                                stackOut_33_0 = this;
                                stackIn_35_0 = stackOut_33_0;
                                stackOut_35_0 = this;
                                stackOut_35_1 = 1;
                                stackIn_38_0 = stackOut_35_0;
                                stackIn_38_1 = stackOut_35_1;
                                break L11;
                              }
                            }
                            L12: {
                              L13: {
                                var3 = ((sa) this).b(stackIn_38_1 != 0, (byte) -118);
                                if (1 == var3) {
                                  break L13;
                                } else {
                                  if (var3 == 2) {
                                    break L13;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L14: {
                                if (null != ua.field_d) {
                                  nc.b(118);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var3 != 2) {
                                break L12;
                              } else {
                                nk.a(param0 ^ 2058, uc.e((byte) -85));
                                break L12;
                              }
                            }
                            ((sa) this).a(false, (byte) 81);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L15: {
                          if (!uc.f(21651)) {
                            break L15;
                          } else {
                            L16: {
                              if (me.b(param0 ^ -16)) {
                                break L16;
                              } else {
                                L17: {
                                  var3 = vh.h(0);
                                  if (1 != var3) {
                                    break L17;
                                  } else {
                                    he.a(mq.field_a, true, (byte) 97);
                                    break L17;
                                  }
                                }
                                ((sa) this).a(false, (byte) 7);
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            nk.a(param0 + 47);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L18: {
                          if (me.b(-34)) {
                            break L18;
                          } else {
                            var2_int = 1;
                            var3 = -1;
                            L19: while (true) {
                              stackOut_69_0 = jl.a((byte) 5);
                              stackIn_70_0 = stackOut_69_0;
                              L20: while (true) {
                                L21: {
                                  if (!stackIn_70_0) {
                                    break L21;
                                  } else {
                                    stackOut_71_0 = dc.field_b;
                                    stackOut_71_1 = -1;
                                    stackIn_104_0 = stackOut_71_0;
                                    stackIn_104_1 = stackOut_71_1;
                                    stackIn_72_0 = stackOut_71_0;
                                    stackIn_72_1 = stackOut_71_1;
                                    if (var5 != 0) {
                                      L22: while (true) {
                                        if (stackIn_104_0 >= stackIn_104_1) {
                                          break L2;
                                        } else {
                                          var4 = (vc) kp.field_d.elementAt(var3);
                                          var4.a(var2_int != 0, (byte) -126);
                                          if (var5 != 0) {
                                            break L1;
                                          } else {
                                            L23: {
                                              stackOut_106_0 = var2_int;
                                              stackIn_111_0 = stackOut_106_0;
                                              stackIn_107_0 = stackOut_106_0;
                                              if (var4.b(59)) {
                                                stackOut_111_0 = stackIn_111_0;
                                                stackOut_111_1 = 0;
                                                stackIn_112_0 = stackOut_111_0;
                                                stackIn_112_1 = stackOut_111_1;
                                                break L23;
                                              } else {
                                                stackOut_107_0 = stackIn_107_0;
                                                stackIn_109_0 = stackOut_107_0;
                                                stackOut_109_0 = stackIn_109_0;
                                                stackOut_109_1 = 1;
                                                stackIn_112_0 = stackOut_109_0;
                                                stackIn_112_1 = stackOut_109_1;
                                                break L23;
                                              }
                                            }
                                            var2_int = stackIn_112_0 & stackIn_112_1;
                                            var3++;
                                            if (var5 == 0) {
                                              stackOut_103_0 = var3;
                                              stackOut_103_1 = kp.field_d.size();
                                              stackIn_104_0 = stackOut_103_0;
                                              stackIn_104_1 = stackOut_103_1;
                                              continue L22;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L24: {
                                        L25: {
                                          if (stackIn_72_0 != stackIn_72_1) {
                                            break L25;
                                          } else {
                                            if (-1 != dc.field_b) {
                                              break L24;
                                            } else {
                                              if (var3 != -1) {
                                                dc.field_b = var3;
                                                var3 = -1;
                                                if (var5 == 0) {
                                                  break L24;
                                                } else {
                                                  break L25;
                                                }
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                        if (!uf.b(-102, dc.field_b)) {
                                          break L24;
                                        } else {
                                          var3 = dc.field_b;
                                          if (var5 == 0) {
                                            continue L19;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      var4_int = 0;
                                      L26: while (true) {
                                        L27: {
                                          if (~var4_int <= ~kp.field_d.size()) {
                                            break L27;
                                          } else {
                                            stackOut_90_0 = ((vc) kp.field_d.elementAt(var4_int)).a(dc.field_b, go.field_b, -81);
                                            stackIn_70_0 = stackOut_90_0;
                                            stackIn_91_0 = stackOut_90_0;
                                            if (var5 != 0) {
                                              continue L20;
                                            } else {
                                              if (stackIn_91_0) {
                                                break L27;
                                              } else {
                                                var4_int++;
                                                if (var5 == 0) {
                                                  continue L26;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (var5 == 0) {
                                          continue L19;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        nk.a(114);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((sa) this).a(false, (byte) 28);
                    break L3;
                  }
                  var3 = 0;
                  L28: while (true) {
                    stackOut_103_0 = var3;
                    stackOut_103_1 = kp.field_d.size();
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    if (stackIn_104_0 >= stackIn_104_1) {
                      break L2;
                    } else {
                      var4 = (vc) kp.field_d.elementAt(var3);
                      var4.a(var2_int != 0, (byte) -126);
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L29: {
                          stackOut_106_0 = var2_int;
                          stackIn_111_0 = stackOut_106_0;
                          stackIn_107_0 = stackOut_106_0;
                          if (var4.b(59)) {
                            stackOut_111_0 = stackIn_111_0;
                            stackOut_111_1 = 0;
                            stackIn_112_0 = stackOut_111_0;
                            stackIn_112_1 = stackOut_111_1;
                            break L29;
                          } else {
                            stackOut_107_0 = stackIn_107_0;
                            stackIn_109_0 = stackOut_107_0;
                            stackOut_109_0 = stackIn_109_0;
                            stackOut_109_1 = 1;
                            stackIn_112_0 = stackOut_109_0;
                            stackIn_112_1 = stackOut_109_1;
                            break L29;
                          }
                        }
                        var2_int = stackIn_112_0 & stackIn_112_1;
                        var3++;
                        if (var5 == 0) {
                          continue L28;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "sa.FB(" + param0 + ')');
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3 = new char[param2];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2 <= var4) {
                    break L3;
                  } else {
                    var3[var4] = param0;
                    var4++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = -55 / ((param1 - 75) / 40);
                break L2;
              }
              stackOut_8_0 = new String(var3);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3_ref, "sa.GB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    abstract void p(int param0);

    public final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 36) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "sa.B(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    abstract boolean q(int param0);

    final static void a(byte param0, jp param1, int param2, int param3, jp param4, jp param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              param5.d((param6 * 5 >> -1649660336) + ((-param5.field_x + param7) / 2 + param9), param2);
              param4.c(param9 + (param7 - param4.field_x) / 2 - (-(param6 * 10 >> 526831088) + -(10 / param3)), 480 + (param8 + (param2 - param4.field_z)));
              if (param0 > 79) {
                break L1;
              } else {
                sa.a((byte) 75, (jp) null, -80, -107, (jp) null, (jp) null, 10, 97, -30, 44);
                break L1;
              }
            }
            param1.c(10 / param3 + (param9 - (-((-param1.field_x + param7) / 2) + -(20 * param6 >> -2016118800))), 480 + (param2 + param8 - param1.field_z));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10;
            stackOut_5_1 = new StringBuilder().append("sa.MB(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        e var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ua.field_d) {
                break L1;
              } else {
                if (ua.field_d.field_e) {
                  nc.b(84);
                  ee.c(4);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              stackOut_8_0 = this;
              stackIn_11_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (ua.field_d == null) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                break L2;
              }
            }
            L3: {
              ((sa) this).b(stackIn_12_1 != 0, 1);
              if (param0 < -34) {
                break L3;
              } else {
                field_E = false;
                break L3;
              }
            }
            L4: {
              if (!lo.field_d) {
                break L4;
              } else {
                al.field_j.b(true);
                lo.field_d = false;
                break L4;
              }
            }
            L5: {
              if (r.c((byte) -87)) {
                ((sa) this).g(false);
                if (!r.c((byte) -113)) {
                  break L5;
                } else {
                  return;
                }
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                this.j(true);
                if (un.field_f) {
                  break L7;
                } else {
                  gk.a(qc.field_o, (byte) 112);
                  if (!al.field_j.a((byte) -54)) {
                    break L6;
                  } else {
                    al.field_j.a(false);
                    un.field_f = true;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  if (um.field_t) {
                    break L9;
                  } else {
                    if (!og.h(-26090)) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                this.r(10);
                if (var4 == 0) {
                  break L6;
                } else {
                  break L8;
                }
              }
              if (al.field_j.a(23570)) {
                um.field_t = true;
                ((sa) this).p(1);
                mc.a((byte) 126);
                break L6;
              } else {
                break L6;
              }
            }
            L10: {
              if (og.h(-26090)) {
                break L10;
              } else {
                L11: while (true) {
                  L12: {
                    L13: {
                      var2_ref = (e) (Object) lp.field_wb.c(3);
                      if (var2_ref != null) {
                        break L13;
                      } else {
                        if (var4 != 0) {
                          break L12;
                        } else {
                          if (var4 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    df.a(var2_ref, 4, -161);
                    break L12;
                  }
                  if (var4 == 0) {
                    continue L11;
                  } else {
                    break L10;
                  }
                }
              }
            }
            L14: {
              fk.a(14114);
              tm.a((byte) 110, 0);
              if (!ui.a(false)) {
                break L14;
              } else {
                L15: {
                  L16: {
                    var2_int = ((sa) this).o(-105);
                    if (0 == var2_int) {
                      break L16;
                    } else {
                      if (var2_int == 1) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  ((sa) this).b(var2_int, 1);
                  break L15;
                }
                L17: {
                  var3 = 0;
                  if (var2_int == 2) {
                    var3 = 1;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (((sa) this).q(73)) {
                    var3 = 1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (ui.a(false)) {
                    break L19;
                  } else {
                    var3 = 0;
                    break L19;
                  }
                }
                if (var3 == 0) {
                  break L14;
                } else {
                  qb.g(115);
                  break L14;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "sa.AA(" + param0 + ')');
        }
    }

    static {
    }
}
