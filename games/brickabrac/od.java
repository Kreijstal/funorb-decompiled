/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_a;
    static int field_c;

    od(java.awt.Component param0) {
        try {
            ((od) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((od) this).field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "od.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = BrickABrac.field_J ? 1 : 0;
          if (13 != pp.field_a) {
            if (pp.field_a == 14) {
              if (0 >= jl.field_a) {
                break L0;
              } else {
                int fieldTemp$5 = jl.field_a - 1;
                jl.field_a = jl.field_a - 1;
                if (0 == fieldTemp$5) {
                  mn.field_v = de.field_x;
                  tb.field_eb = hq.field_y;
                  pp.field_a = -1;
                  jl.field_a = 250;
                  ga.field_i = 0;
                  c.field_i = un.field_e;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              if (pp.field_a == 0) {
                if (0 >= jl.field_a) {
                  break L0;
                } else {
                  int fieldTemp$6 = jl.field_a - 1;
                  jl.field_a = jl.field_a - 1;
                  if (0 == fieldTemp$6) {
                    pp.field_a = -1;
                    ga.field_i = 1;
                    jl.field_a = 250;
                    c.field_i = un.field_e;
                    mn.field_v = de.field_x;
                    tb.field_eb = va.field_d;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                if (pp.field_a == 1) {
                  break L0;
                } else {
                  if (2 == pp.field_a) {
                    if (0 >= jl.field_a) {
                      break L0;
                    } else {
                      int fieldTemp$7 = jl.field_a - 1;
                      jl.field_a = jl.field_a - 1;
                      if (0 != fieldTemp$7) {
                        break L0;
                      } else {
                        tb.field_eb = op.field_b;
                        pp.field_a = -1;
                        ga.field_i = 3;
                        break L0;
                      }
                    }
                  } else {
                    if (pp.field_a == 3) {
                      break L0;
                    } else {
                      if (pp.field_a != 4) {
                        if (pp.field_a != 5) {
                          if (pp.field_a == 6) {
                            pp.field_a = da.field_G;
                            ga.field_i = da.field_G;
                            break L0;
                          } else {
                            L1: {
                              if (pp.field_a == 8) {
                                break L1;
                              } else {
                                if (pp.field_a != 9) {
                                  if (pp.field_a != 10) {
                                    if (pp.field_a == 11) {
                                      break L0;
                                    } else {
                                      if (pp.field_a == 12) {
                                        break L0;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  } else {
                                    ga.field_i = da.field_G;
                                    pp.field_a = da.field_G;
                                    break L0;
                                  }
                                } else {
                                  break L1;
                                }
                              }
                            }
                            if (jl.field_a <= 0) {
                              break L0;
                            } else {
                              int fieldTemp$8 = jl.field_a - 1;
                              jl.field_a = jl.field_a - 1;
                              if (fieldTemp$8 != 0) {
                                break L0;
                              } else {
                                ga.field_i = 11;
                                pp.field_a = -1;
                                tb.field_eb = bj.field_U;
                                wl.field_N = true;
                                break L0;
                              }
                            }
                          }
                        } else {
                          break L0;
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (0 >= jl.field_a) {
              break L0;
            } else {
              int fieldTemp$9 = jl.field_a - 1;
              jl.field_a = jl.field_a - 1;
              if (0 != fieldTemp$9) {
                break L0;
              } else {
                mn.field_v = de.field_x;
                pp.field_a = -1;
                c.field_i = un.field_e;
                tb.field_eb = sb.field_d;
                jl.field_a = 250;
                ga.field_i = 14;
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 == 32) {
            break L2;
          } else {
            field_c = 109;
            break L2;
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((od) this).field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "od.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 != 0) {
                var6 = ai.field_r;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2_ref, "od.D(" + param0 + ',' + -12 + ')');
        }
        return stackIn_20_0 != 0;
    }

    public static void a(boolean param0) {
        if (param0) {
            od.a((byte) 23);
        }
        field_b = null;
    }

    final static void a(int param0, long param1, StringBuilder param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              gh.field_e.setLength(0);
              if (param1 >= 0L) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var4_int = stackIn_4_0;
            var5 = 0;
            L2: while (true) {
              StringBuilder discarded$11 = gh.field_e.append((char)(48 + (int)(param1 % 10L)));
              param1 = param1 / 10L;
              var5++;
              if (0L != param1) {
                continue L2;
              } else {
                L3: {
                  if (var4_int == 0) {
                    break L3;
                  } else {
                    StringBuilder discarded$12 = gh.field_e.append('-');
                    break L3;
                  }
                }
                var6 = var5 - 1;
                L4: while (true) {
                  if (var6 < 0) {
                    break L0;
                  } else {
                    StringBuilder discarded$13 = param2.append(gh.field_e.charAt(var6));
                    var6--;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("od.C(").append(-9).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Shortcut Reference";
    }
}
