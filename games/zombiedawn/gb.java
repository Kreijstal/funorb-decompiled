/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb extends fb {
    private int field_D;
    private int field_E;
    private boolean field_F;

    gb(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((gb) this).field_E = 0;
        ((gb) this).field_D = pb.a(so.field_a, 5, 1);
        ((gb) this).field_F = true;
        ((gb) this).d((byte) 121);
    }

    final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 <= -76) {
                break L1;
              } else {
                var15 = null;
                oi discarded$1 = gb.a((String) null, -100, (dj) null, (String) null, (dj) null);
                break L1;
              }
            }
            L2: {
              var3_int = 0;
              if (((gb) this).field_F) {
                L3: {
                  var3_int = ((gb) this).field_E % 30;
                  if (var3_int <= 15) {
                    break L3;
                  } else {
                    var3_int = 30 + -var3_int;
                    break L3;
                  }
                }
                if (var3_int > 8) {
                  var3_int = 4;
                  break L2;
                } else {
                  if (var3_int <= 3) {
                    if (1 >= var3_int) {
                      var3_int = 1;
                      break L2;
                    } else {
                      var3_int = 2;
                      break L2;
                    }
                  } else {
                    var3_int = 3;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              var4 = param1.a(((gb) this).a(true), (byte) -81);
              var5 = -24 + param1.a(((gb) this).f(237239984) + -var3_int, 0);
              if (var4 < -48) {
                break L4;
              } else {
                if (var5 < -48) {
                  break L4;
                } else {
                  if (var4 > qj.field_d) {
                    break L4;
                  } else {
                    if (var5 > me.field_Bb) {
                      break L4;
                    } else {
                      L5: {
                        if (!ng.field_e) {
                          break L5;
                        } else {
                          if (((gb) this).field_C) {
                            bi.g(12 + var4, var5 - -12, 14, 16711680);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (!((gb) this).field_F) {
                          break L6;
                        } else {
                          var6 = -1 + var4 - -12;
                          var7 = -1 + var5 + 12;
                          var9 = 10;
                          var10 = 2;
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= 6) {
                              break L6;
                            } else {
                              var8 = (((gb) this).field_E + var11 * 6) % 120;
                              var12 = var11 * var9;
                              var13 = var11 * var10;
                              bi.d(gj.field_u[var8] + var6, gj.field_e[var8] + var7, 6, 0, var12);
                              bi.a(gj.field_u[var8] + var6 << 4, gj.field_e[var8] + var7 << 4, 96, var13, gj.field_b[((gb) this).field_t]);
                              var8 = (var8 + 60) % 120;
                              bi.d(gj.field_u[var8] + var6, gj.field_e[var8] + var7, 6, 0, var12);
                              bi.a(gj.field_u[var8] + var6 << 4, var7 + gj.field_e[var8] << 4, 96, var13, gj.field_b[((gb) this).field_t]);
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      kb.field_i[((gb) this).field_t].b(var4, var5);
                      break L0;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("gb.B(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final static oi a(String param0, int param1, dj param2, String param3, dj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        oi stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = param4.a(param3, (byte) 8);
            var6 = param4.a(var5_int, param0, true);
            if (param1 == -1) {
              stackOut_3_0 = la.a(param2, var6, param4, (byte) -126, var5_int);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (oi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("gb.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        va var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        kd var8 = null;
        L0: {
          var6 = ZombieDawn.field_J;
          if (5 != dj.field_e.field_H.field_A.field_a) {
            break L0;
          } else {
            L1: {
              var2 = (((gb) this).a(true) + 12) / 24;
              var3 = (-1 + ((gb) this).f(237239984)) / 24;
              if (var2 < 0) {
                break L1;
              } else {
                if (var3 < 0) {
                  break L1;
                } else {
                  if (dj.field_e.field_H.field_A.field_f[0].length <= var2) {
                    break L1;
                  } else {
                    if (dj.field_e.field_H.field_A.field_f.length > var3) {
                      var4 = ub.a(127, dj.field_e.field_H.field_A.field_f[var3][var2]);
                      if (var4 == null) {
                        break L0;
                      } else {
                        L2: {
                          if (0 <= var4.field_h) {
                            if (var4.field_h <= 0) {
                              ((gb) this).field_y = ((gb) this).field_y + var4.field_h;
                              break L2;
                            } else {
                              var5 = (var4.field_h + ((gb) this).field_y) % 1572864;
                              if (~var4.field_h < ~var5) {
                                ((gb) this).field_y = var4.field_h + (-var5 + ((gb) this).field_y);
                                break L2;
                              } else {
                                ((gb) this).field_y = ((gb) this).field_y + var4.field_h;
                                break L2;
                              }
                            }
                          } else {
                            var5 = ((gb) this).field_y % 1572864;
                            if (-var4.field_h <= var5) {
                              ((gb) this).field_y = ((gb) this).field_y + var4.field_h;
                              break L2;
                            } else {
                              ((gb) this).field_y = -1 + -var5 + ((gb) this).field_y;
                              break L2;
                            }
                          }
                        }
                        L3: {
                          ((gb) this).field_F = false;
                          if (var4.field_i >= 0) {
                            if (var4.field_i > 0) {
                              var5 = (var4.field_i + ((gb) this).field_x) % 1572864;
                              if (var4.field_i <= var5) {
                                ((gb) this).field_x = ((gb) this).field_x + var4.field_i;
                                break L3;
                              } else {
                                ((gb) this).field_x = var4.field_i - (var5 - ((gb) this).field_x);
                                break L3;
                              }
                            } else {
                              ((gb) this).field_x = ((gb) this).field_x + var4.field_i;
                              break L3;
                            }
                          } else {
                            var5 = ((gb) this).field_x % 1572864;
                            if (-var4.field_i <= var5) {
                              ((gb) this).field_x = ((gb) this).field_x + var4.field_i;
                              break L3;
                            } else {
                              ((gb) this).field_x = ((gb) this).field_x + (-var5 - 1);
                              break L3;
                            }
                          }
                        }
                        ((gb) this).d((byte) 120);
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        }
        L4: {
          ((gb) this).field_E = ((gb) this).field_E + 1;
          if (param0 >= 95) {
            break L4;
          } else {
            var7 = null;
            oi discarded$3 = gb.a((String) null, 58, (dj) null, (String) null, (dj) null);
            break L4;
          }
        }
        L5: {
          if (((gb) this).field_E >= 120) {
            ((gb) this).field_E = 0;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          int fieldTemp$4 = ((gb) this).field_D;
          ((gb) this).field_D = ((gb) this).field_D + 1;
          if (fieldTemp$4 > 5) {
            ((gb) this).field_D = 0;
            var8 = (kd) (Object) ((gb) this).a((byte) -74, 36, 2);
            L7: while (true) {
              if (var8 == null) {
                break L6;
              } else {
                L8: {
                  if (!var8.i((byte) -126)) {
                    break L8;
                  } else {
                    if (dj.field_e.field_Q.b(-4149, ((gb) this).field_t)) {
                      L9: {
                        fn discarded$5 = kh.a(9, false);
                        ck.a(((gb) this).field_t, 6836);
                        if (dj.field_e.field_q != 4) {
                          break L9;
                        } else {
                          if (dj.field_e.field_h != 0) {
                            break L9;
                          } else {
                            L10: {
                              if (cm.field_c != null) {
                                break L10;
                              } else {
                                if (((gb) this).field_t == 12) {
                                  cm.field_c = var8;
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (cm.field_c != var8) {
                              break L9;
                            } else {
                              if (((gb) this).field_t != 0) {
                                break L9;
                              } else {
                                if (!var8.x(124)) {
                                  dj.field_e.a(241, 14, (byte) -23);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      ((gb) this).b(-27598);
                      return;
                    } else {
                      break L8;
                    }
                  }
                }
                var8 = (kd) (Object) ((gb) this).e((byte) 32);
                continue L7;
              }
            }
          } else {
            break L6;
          }
        }
    }

    static {
    }
}
