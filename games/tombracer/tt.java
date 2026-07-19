/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends vg implements bo {
    private int[][] field_f;
    static String field_g;
    private boolean[] field_h;

    public final void a(kh param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_4_0 = null;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        boolean[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_18_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.h((byte) 125);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (this.field_f.length <= var3_int) {
                      break L4;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_19_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          stackOut_4_0 = ((tt) (this)).field_h;
                          stackOut_4_1 = var3_int;
                          stackIn_6_0 = stackOut_4_0;
                          stackIn_6_1 = stackOut_4_1;
                          stackIn_5_0 = stackOut_4_0;
                          stackIn_5_1 = stackOut_4_1;
                          if ((param0.b((byte) 44, 1) ^ -1) == -2) {
                            stackOut_6_0 = (boolean[]) ((Object) stackIn_6_0);
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            break L5;
                          } else {
                            stackOut_5_0 = (boolean[]) ((Object) stackIn_5_0);
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 0;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_7_2 = stackOut_5_2;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            stackIn_7_0[stackIn_7_1] = stackIn_7_2 != 0;
                            if (this.field_h[var3_int]) {
                              var4 = 0;
                              L8: while (true) {
                                if (var4 >= this.field_f[var3_int].length) {
                                  break L7;
                                } else {
                                  this.field_f[var3_int][var4] = vp.a(param0.b((byte) 44, 7), param1 + -6468);
                                  var4++;
                                  if (var5 != 0) {
                                    break L6;
                                  } else {
                                    if (var5 == 0) {
                                      continue L8;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                          var3_int++;
                          break L6;
                        }
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1 != -19) {
                    stackOut_18_0 = this;
                    stackIn_19_0 = stackOut_18_0;
                    break L3;
                  } else {
                    param0.i((byte) 98);
                    break L2;
                  }
                }
                ((tt) (this)).field_h = (boolean[]) null;
                param0.i((byte) 98);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("tt.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        String stackIn_4_0 = null;
        String stackIn_5_0 = null;
        String stackOut_3_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var1 = "S2CActionPacket playerOrders:";
        var2 = 0;
        L0: while (true) {
          if (this.field_f.length > var2) {
            stackOut_3_0 = var1 + " " + this.field_h[var2];
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var3 == 0) {
              var1 = stackIn_5_0;
              var2++;
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return var1;
          }
        }
    }

    final static roa a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -1) {
          var2 = param1;
          if (4 != var2) {
            if (-1 != (var2 ^ -1)) {
              if (-2 != (var2 ^ -1)) {
                if (2 == var2) {
                  return mr.a((byte) 125);
                } else {
                  throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                }
              } else {
                if (var3 != 0) {
                  if (2 == var2) {
                    return mr.a((byte) 125);
                  } else {
                    throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                  }
                } else {
                  return ik.b(-17698);
                }
              }
            } else {
              if (var3 != 0) {
                if (-2 != (var2 ^ -1)) {
                  if (2 == var2) {
                    return mr.a((byte) 125);
                  } else {
                    throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                  }
                } else {
                  if (2 == var2) {
                    return mr.a((byte) 125);
                  } else {
                    throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                  }
                }
              } else {
                return gda.a(true);
              }
            }
          } else {
            return eo.D((byte) -110);
          }
        } else {
          tt.a(59);
          var2 = param1;
          if (4 != var2) {
            if (-1 == (var2 ^ -1)) {
              if (var3 != 0) {
                if (-2 == (var2 ^ -1)) {
                  if (var3 != 0) {
                    if (2 != var2) {
                      throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                    } else {
                      return mr.a((byte) 125);
                    }
                  } else {
                    return ik.b(-17698);
                  }
                } else {
                  if (2 == var2) {
                    return mr.a((byte) 125);
                  } else {
                    throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                  }
                }
              } else {
                return gda.a(true);
              }
            } else {
              if (-2 != (var2 ^ -1)) {
                if (2 != var2) {
                  throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                } else {
                  return mr.a((byte) 125);
                }
              } else {
                if (var3 != 0) {
                  if (2 == var2) {
                    return mr.a((byte) 125);
                  } else {
                    throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
                  }
                } else {
                  return ik.b(-17698);
                }
              }
            }
          } else {
            return eo.D((byte) -110);
          }
        }
    }

    public final void a(int param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        kh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean stackOut_4_2 = false;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.i(8);
              var3_int = 0;
              if (param0 == 200) {
                break L1;
              } else {
                this.field_h = (boolean[]) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int >= this.field_f.length) {
                    break L4;
                  } else {
                    stackOut_4_0 = (kh) (param1);
                    stackOut_4_1 = 71;
                    stackOut_4_2 = this.field_h[var3_int];
                    stackIn_17_0 = stackOut_4_0;
                    stackIn_17_1 = stackOut_4_1;
                    stackIn_17_2 = stackOut_4_2 ? 1 : 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        stackOut_5_0 = (kh) ((Object) stackIn_5_0);
                        stackOut_5_1 = stackIn_5_1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (!stackIn_5_2) {
                          stackOut_7_0 = (kh) ((Object) stackIn_7_0);
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          break L5;
                        } else {
                          stackOut_6_0 = (kh) ((Object) stackIn_6_0);
                          stackOut_6_1 = stackIn_6_1;
                          stackOut_6_2 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          ((kh) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, 1);
                          if (!this.field_h[var3_int]) {
                            break L7;
                          } else {
                            var4 = 0;
                            L8: while (true) {
                              if (var4 >= this.field_f[var3_int].length) {
                                break L7;
                              } else {
                                param1.a((byte) -23, uja.a(-47, this.field_f[var3_int][var4]), 7);
                                var4++;
                                if (var5 != 0) {
                                  break L6;
                                } else {
                                  if (var5 == 0) {
                                    continue L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var3_int++;
                        break L6;
                      }
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_16_0 = (kh) (param1);
                stackOut_16_1 = param0;
                stackOut_16_2 = -1826190886;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L3;
              }
              ((kh) (Object) stackIn_17_0).k(stackIn_17_1 + stackIn_17_2);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (runtimeException);
            stackOut_19_1 = new StringBuilder().append("tt.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        if (param0 != 4) {
            cn var2 = (cn) null;
            discarded$0 = tt.a((cn) null, (byte) -100);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static boolean a(cn param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 101 / ((param1 - 15) / 60);
            stackOut_0_0 = param0.a(0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("tt.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(boolean param0, int param1) {
        if (param0) {
            return true;
        }
        return this.field_h[param1];
    }

    tt(int param0) {
        this.field_f = new int[param0][8];
        this.field_h = new boolean[param0];
    }

    final int a(boolean param0, int param1, int param2) {
        boolean discarded$2 = false;
        cn var5 = null;
        if (param0) {
          var5 = (cn) null;
          discarded$2 = tt.a((cn) null, (byte) 42);
          return this.field_f[param1][param2];
        } else {
          return this.field_f[param1][param2];
        }
    }

    static {
        field_g = "Return to Main Menu";
    }
}
