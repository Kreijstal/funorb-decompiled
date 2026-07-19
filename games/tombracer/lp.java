/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    int field_b;
    boolean field_a;
    int field_d;
    int field_e;
    int field_c;
    boolean field_i;
    int field_f;
    static ko field_h;
    static int field_g;

    final void a(int param0, int param1, uia param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -1) {
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      var4_int = param2.h(255);
                      if (var4_int != 0) {
                        break L4;
                      } else {
                        if (var5 != 0) {
                          break L3;
                        } else {
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.a(param2, param1, (byte) -124, var4_int);
                    break L3;
                  }
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("lp.A(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static vna a(byte param0, String param1) {
        RuntimeException var2 = null;
        vna var2_ref = null;
        in var3 = null;
        int var4 = 0;
        int var5 = 0;
        vna stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        vna stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                field_h = (ko) null;
                break L1;
              }
            }
            var2_ref = new vna();
            var3 = new in(param1);
            L2: while (true) {
              L3: {
                if (var3.a(0)) {
                  break L3;
                } else {
                  var4 = var3.b(21098);
                  if (Character.isWhitespace((char) var4)) {
                    continue L2;
                  } else {
                    L4: {
                      if (var4 == 34) {
                        var2_ref.b((byte) -81, hb.a(var3, false));
                        break L4;
                      } else {
                        if (var4 == 39) {
                          var2_ref.b((byte) -81, hb.a(var3, false));
                          break L4;
                        } else {
                          L5: {
                            if (var4 == 40) {
                              break L5;
                            } else {
                              L6: {
                                if (var4 == 41) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (44 == var4) {
                                      break L7;
                                    } else {
                                      var2_ref.b((byte) -75, ska.a(param0 + -93, var3));
                                      if (var5 == 0) {
                                        break L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var2_ref.b((byte) -107, new mi(qba.field_c, var3.field_b + -1));
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var2_ref.b((byte) -112, new mi(rs.field_a, var3.field_b - 1));
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var2_ref.b((byte) -90, new mi(lna.field_a, -1 + var3.field_b));
                          if (var5 == 0) {
                            break L4;
                          } else {
                            var2_ref.b((byte) -81, hb.a(var3, false));
                            break L4;
                          }
                        }
                      }
                    }
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_23_0 = (vna) (var2_ref);
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("lp.B(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    private final void a(uia param0, int param1, byte param2, int param3) {
        byte discarded$1 = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (1 != param3) {
                  break L2;
                } else {
                  this.field_f = param0.d(126);
                  if ((this.field_f ^ -1) != -65536) {
                    break L1;
                  } else {
                    this.field_f = -1;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if ((param3 ^ -1) == -3) {
                  break L3;
                } else {
                  L4: {
                    if (-4 != (param3 ^ -1)) {
                      break L4;
                    } else {
                      discarded$1 = param0.c((byte) 64);
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param3 == 4) {
                      break L5;
                    } else {
                      L6: {
                        if (param3 != 5) {
                          break L6;
                        } else {
                          this.field_c = param0.h(255);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (param3 == 6) {
                          break L7;
                        } else {
                          if (param3 == 7) {
                            this.field_i = true;
                            if (var6 == 0) {
                              break L1;
                            } else {
                              break L7;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      this.field_a = true;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  this.field_e = param0.h(255);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_d = 1 + param0.d(123);
              this.field_b = 1 + param0.d(122);
              break L1;
            }
            if (param2 < -121) {
              break L0;
            } else {
              lp.a((byte) -38);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("lp.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 34) {
            field_g = 31;
            field_h = null;
            return;
        }
        field_h = null;
    }

    lp() {
        this.field_e = 2;
        this.field_a = false;
        this.field_i = false;
        this.field_b = 64;
        this.field_d = 64;
        this.field_f = -1;
        this.field_c = 1;
    }

    static {
        field_h = new ko(1);
        field_g = 0;
    }
}
