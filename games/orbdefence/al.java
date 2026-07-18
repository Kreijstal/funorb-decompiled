/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class al extends java.awt.Canvas {
    static hj field_d;
    static dd field_c;
    static int field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((al) this).field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "al.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 < 0) {
                break L1;
              } else {
                if (param6 >= wi.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (0 <= param5) {
                      break L2;
                    } else {
                      if (param3 >= 0) {
                        break L2;
                      } else {
                        if (0 > param2) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~wi.field_c < ~param5) {
                      break L3;
                    } else {
                      if (~param3 > ~wi.field_c) {
                        break L3;
                      } else {
                        if (param2 < wi.field_c) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param6 + param8;
                    if (~param1 == ~param6) {
                      L5: {
                        if (param8 != param6) {
                          var15 = -param1 + param8;
                          if (param3 > param5) {
                            var9_int = param5 << 16;
                            var10 = param3 << 16;
                            var12 = (-param3 + param2 << 16) / var15;
                            var11 = (-param5 + param2 << 16) / var14;
                            break L5;
                          } else {
                            var9_int = param3 << 16;
                            var11 = (-param3 + param2 << 16) / var15;
                            var10 = param5 << 16;
                            var12 = (param2 + -param5 << 16) / var14;
                            break L5;
                          }
                        } else {
                          var10 = param3 << 16;
                          var11 = 0;
                          var9_int = param5 << 16;
                          var12 = 0;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if (0 <= param6) {
                        break L4;
                      } else {
                        param6 = Math.min(-param6, -param6 + param1);
                        var10 = var10 + var12 * param6;
                        var9_int = var9_int + var11 * param6;
                        param6 = 0;
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param5 << 16;
                        var9_int = param5 << 16;
                        var15 = param1 - param6;
                        var11 = (-param5 + param3 << 16) / var15;
                        var12 = (-param5 + param2 << 16) / var14;
                        if (~var11 > ~var12) {
                          var13 = 0;
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param6 >= 0) {
                            break L8;
                          } else {
                            if (param1 >= 0) {
                              param6 = -param6;
                              var9_int = var9_int + var11 * param6;
                              var10 = var10 + param6 * var12;
                              param6 = 0;
                              break L8;
                            } else {
                              param6 = param1 - param6;
                              var9_int = var9_int + var11 * param6;
                              var10 = var10 + var12 * param6;
                              param6 = param1;
                              break L7;
                            }
                          }
                        }
                        var16 = wi.field_i[param6];
                        L9: while (true) {
                          if (~param1 >= ~param6) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 16;
                              if (~var17 <= ~wi.field_c) {
                                break L10;
                              } else {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L10;
                                  } else {
                                    if (var17 >= wi.field_c) {
                                      break L10;
                                    } else {
                                      int discarded$6 = 1;
                                      mb.a(var18, var17 - -var16, param0, param7);
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (~wi.field_c >= ~(var18 + var17)) {
                                      var18 = -1 + (-var17 + wi.field_c);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    int discarded$7 = 1;
                                    mb.a(var18, var17 - -var16, param0, param7);
                                    break L10;
                                  } else {
                                    int discarded$8 = 1;
                                    mb.a(var18 - -var17, var16, param0, param7);
                                    break L10;
                                  }
                                }
                              }
                            }
                            param6++;
                            if (param6 < wi.field_a) {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + ul.field_f;
                              continue L9;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = param8 - param1;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L12: {
                          if (var13 == 0) {
                            var9_int = param3 << 16;
                            break L12;
                          } else {
                            var10 = param3 << 16;
                            break L12;
                          }
                        }
                        var17 = param2 << 16;
                        var12 = (var17 - var10) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (param6 >= 0) {
                      break L13;
                    } else {
                      param6 = -param6;
                      var10 = var10 + param6 * var12;
                      var9_int = var9_int + var11 * param6;
                      param6 = 0;
                      break L13;
                    }
                  }
                  var15 = wi.field_i[param6];
                  L14: while (true) {
                    if (param6 >= param8) {
                      break L0;
                    } else {
                      L15: {
                        var16 = var9_int >> 16;
                        if (~wi.field_c >= ~var16) {
                          break L15;
                        } else {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 != 0) {
                            L16: {
                              if (wi.field_c > var17 + var16) {
                                break L16;
                              } else {
                                var17 = wi.field_c + -var16 - 1;
                                break L16;
                              }
                            }
                            if (var16 < 0) {
                              int discarded$9 = 1;
                              mb.a(var16 + var17, var15, param0, param7);
                              break L15;
                            } else {
                              int discarded$10 = 1;
                              mb.a(var17, var15 + var16, param0, param7);
                              break L15;
                            }
                          } else {
                            if (var16 < 0) {
                              break L15;
                            } else {
                              if (var16 < wi.field_c) {
                                int discarded$11 = 1;
                                mb.a(var17, var16 - -var15, param0, param7);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      param6++;
                      if (~param6 <= ~wi.field_a) {
                        return;
                      } else {
                        var9_int = var9_int + var11;
                        var10 = var10 + var12;
                        var15 = var15 + ul.field_f;
                        continue L14;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var9;
            stackOut_72_1 = new StringBuilder().append("al.A(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L17;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L17;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 30979 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a() {
        field_d = null;
        int var1 = 0;
        field_c = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((al) this).field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "al.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ki a(boolean param0, int param1, int param2, int param3, boolean param4) {
        try {
            Object var6 = null;
            Object var7 = null;
            ak var8 = null;
            ki stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            ki stackOut_14_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (lh.field_b.field_u != null) {
                    vg.field_q = new dj(lh.field_b.field_u, 5200, 0);
                    lh.field_b.field_u = null;
                    var6 = (Object) (Object) new eh(255, vg.field_q, new dj(lh.field_b.field_g, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != vg.field_q) {
                    L3: {
                      if (null == ok.field_a) {
                        ok.field_a = new dj[lh.field_b.field_p.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (null != ok.field_a[param2]) {
                        break L4;
                      } else {
                        ok.field_a[param2] = new dj(lh.field_b.field_p[param2], 12000, 0);
                        lh.field_b.field_p[param2] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new eh(param2, vg.field_q, ok.field_a[param2], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  var8 = ed.field_b.a(false, param2, false, (eh) var6, (eh) var7);
                  if (param4) {
                    var8.d((byte) 111);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_14_0 = new ki((jl) (Object) var8, param0, param3);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    al(java.awt.Component param0) {
        try {
            ((al) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "al.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
