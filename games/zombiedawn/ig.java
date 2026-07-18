/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends wo {
    static String field_Bb;

    final int j(byte param0) {
        if (param0 > -42) {
            return -15;
        }
        return super.j((byte) -86);
    }

    ig(int param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        ((ig) this).field_F = 0;
        super.l(param0);
        var2 = ((ig) this).a(true);
        var3 = var2 / 24;
        var4 = ((ig) this).f(param0 ^ 237239940);
        var5 = var4 / 24;
        var6 = 127 & ((ig) this).l(param0 + -157);
        if (((ig) this).field_F != 1) {
          if (var5 < 34) {
            L0: {
              if (45 <= var3) {
                break L0;
              } else {
                if (3 >= var3) {
                  break L0;
                } else {
                  if (var5 <= 5) {
                    break L0;
                  } else {
                    if (var6 == 3) {
                      dj.field_e.a((ig) this, (byte) 110);
                      ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
                      ((ig) this).b(-27598);
                      ((ig) this).d(0);
                      return;
                    } else {
                      if (var2 <= -24) {
                        ((ig) this).b(-27598);
                        ((ig) this).d(0);
                        return;
                      } else {
                        if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                          ((ig) this).b(-27598);
                          ((ig) this).d(0);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            L1: {
              var7 = 0;
              if (var6 == 10) {
                ((ig) this).field_X = var4;
                ((ig) this).field_Y = -96 + var2;
                var7 = 1;
                break L1;
              } else {
                L2: {
                  if (var6 == 14) {
                    break L2;
                  } else {
                    L3: {
                      if (var2 < 1080) {
                        break L3;
                      } else {
                        if (500 >= var4) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var6 != 2) {
                      if (var2 <= 48) {
                        L4: {
                          ((ig) this).field_Y = 24 + (so.c(48) + 96);
                          var7 = 1;
                          ((ig) this).field_X = -24 + (var4 + so.c(48));
                          if (var7 == 0) {
                            break L4;
                          } else {
                            ((ig) this).c(0, ((ig) this).field_D);
                            ((ig) this).e(1, -6904);
                            ((ig) this).field_Ab = false;
                            break L4;
                          }
                        }
                        if (var6 == 3) {
                          dj.field_e.a((ig) this, (byte) 110);
                          ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
                          ((ig) this).b(-27598);
                          ((ig) this).d(0);
                          return;
                        } else {
                          L5: {
                            if (var2 <= -24) {
                              ((ig) this).b(-27598);
                              ((ig) this).d(0);
                              break L5;
                            } else {
                              if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                                ((ig) this).b(-27598);
                                ((ig) this).d(0);
                                return;
                              } else {
                                break L5;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        if (var4 > 96) {
                          if (var2 >= 1080) {
                            ((ig) this).field_Y = -24 + -so.c(48) + 1008;
                            var7 = 1;
                            ((ig) this).field_X = so.c(48) + var4 + -24;
                            break L1;
                          } else {
                            if (1440 <= var4) {
                              ((ig) this).field_Y = so.c(48) + (var2 + -24);
                              ((ig) this).field_X = -24 + (so.c(8) + 1436);
                              var7 = 1;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          ((ig) this).field_Y = -24 + var2 - -so.c(48);
                          var7 = 1;
                          ((ig) this).field_X = -48 + (so.c(96) + 96);
                          break L1;
                        }
                      }
                    } else {
                      ((ig) this).field_Y = var2;
                      ((ig) this).field_X = var4 + 72;
                      var7 = 1;
                      break L1;
                    }
                  }
                }
                ((ig) this).field_X = var4;
                ((ig) this).field_Y = 96 + var2;
                var7 = 1;
                break L1;
              }
            }
            if (var7 != 0) {
              ((ig) this).c(0, ((ig) this).field_D);
              ((ig) this).e(1, -6904);
              ((ig) this).field_Ab = false;
              if (var6 == 3) {
                dj.field_e.a((ig) this, (byte) 110);
                ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
                ((ig) this).b(-27598);
                ((ig) this).d(0);
                return;
              } else {
                if (var2 <= -24) {
                  ((ig) this).b(-27598);
                  ((ig) this).d(0);
                  return;
                } else {
                  if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                    ((ig) this).b(-27598);
                    ((ig) this).d(0);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (var6 == 3) {
                dj.field_e.a((ig) this, (byte) 110);
                ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
                ((ig) this).b(-27598);
                ((ig) this).d(0);
                return;
              } else {
                if (var2 <= -24) {
                  ((ig) this).b(-27598);
                  ((ig) this).d(0);
                  return;
                } else {
                  if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                    ((ig) this).b(-27598);
                    ((ig) this).d(0);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            L6: {
              var7 = 0;
              if (var6 == 10) {
                ((ig) this).field_X = var4;
                ((ig) this).field_Y = -96 + var2;
                var7 = 1;
                break L6;
              } else {
                L7: {
                  if (var6 == 14) {
                    break L7;
                  } else {
                    L8: {
                      if (var2 < 1080) {
                        break L8;
                      } else {
                        if (500 >= var4) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var6 != 2) {
                      if (var2 <= 48) {
                        L9: {
                          ((ig) this).field_Y = 24 + (so.c(48) + 96);
                          var7 = 1;
                          ((ig) this).field_X = -24 + (var4 + so.c(48));
                          if (var7 == 0) {
                            break L9;
                          } else {
                            ((ig) this).c(0, ((ig) this).field_D);
                            ((ig) this).e(1, -6904);
                            ((ig) this).field_Ab = false;
                            break L9;
                          }
                        }
                        L10: {
                          if (var6 == 3) {
                            dj.field_e.a((ig) this, (byte) 110);
                            ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
                            ((ig) this).b(-27598);
                            ((ig) this).d(0);
                            break L10;
                          } else {
                            if (var2 <= -24) {
                              ((ig) this).b(-27598);
                              ((ig) this).d(0);
                              break L10;
                            } else {
                              if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                                ((ig) this).b(-27598);
                                ((ig) this).d(0);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        if (var4 > 96) {
                          if (var2 >= 1080) {
                            ((ig) this).field_Y = -24 + -so.c(48) + 1008;
                            var7 = 1;
                            ((ig) this).field_X = so.c(48) + var4 + -24;
                            break L6;
                          } else {
                            if (1440 <= var4) {
                              ((ig) this).field_Y = so.c(48) + (var2 + -24);
                              ((ig) this).field_X = -24 + (so.c(8) + 1436);
                              var7 = 1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          ((ig) this).field_Y = -24 + var2 - -so.c(48);
                          var7 = 1;
                          ((ig) this).field_X = -48 + (so.c(96) + 96);
                          break L6;
                        }
                      }
                    } else {
                      ((ig) this).field_Y = var2;
                      ((ig) this).field_X = var4 + 72;
                      var7 = 1;
                      break L6;
                    }
                  }
                }
                ((ig) this).field_X = var4;
                ((ig) this).field_Y = 96 + var2;
                var7 = 1;
                break L6;
              }
            }
            if (var7 == 0) {
              if (var6 == 3) {
                dj.field_e.a((ig) this, (byte) 110);
                ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
                ((ig) this).b(-27598);
                ((ig) this).d(0);
                return;
              } else {
                if (var2 <= -24) {
                  ((ig) this).b(-27598);
                  ((ig) this).d(0);
                  return;
                } else {
                  if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                    ((ig) this).b(-27598);
                    ((ig) this).d(0);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L11: {
                ((ig) this).c(0, ((ig) this).field_D);
                ((ig) this).e(1, -6904);
                ((ig) this).field_Ab = false;
                if (var6 == 3) {
                  dj.field_e.a((ig) this, (byte) 110);
                  ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
                  ((ig) this).b(-27598);
                  ((ig) this).d(0);
                  break L11;
                } else {
                  if (var2 <= -24) {
                    ((ig) this).b(-27598);
                    ((ig) this).d(0);
                    break L11;
                  } else {
                    if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                      ((ig) this).b(-27598);
                      ((ig) this).d(0);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          if (var6 == 3) {
            dj.field_e.a((ig) this, (byte) 110);
            ho.a(((ig) this).f(237239984), (byte) 54, ((ig) this).a(true));
            ((ig) this).b(-27598);
            ((ig) this).d(0);
            return;
          } else {
            if (var2 <= -24) {
              ((ig) this).b(-27598);
              ((ig) this).d(0);
              return;
            } else {
              if (~(24 + dj.field_e.field_H.field_u) >= ~var2) {
                ((ig) this).b(-27598);
                ((ig) this).d(0);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void g(int param0) {
        super.g(107);
        if (param0 >= 95) {
          if (((ig) this).f(237239984) + -48 > dj.field_e.field_H.field_p) {
            ((ig) this).b(-27598);
            ((ig) this).d(0);
            return;
          } else {
            if (((ig) this).a(true) + -48 <= dj.field_e.field_H.field_u) {
              return;
            } else {
              ((ig) this).b(-27598);
              ((ig) this).d(0);
              return;
            }
          }
        } else {
          ((ig) this).g(18);
          if (((ig) this).f(237239984) + -48 <= dj.field_e.field_H.field_p) {
            if (((ig) this).a(true) + -48 > dj.field_e.field_H.field_u) {
              ((ig) this).b(-27598);
              ((ig) this).d(0);
              return;
            } else {
              return;
            }
          } else {
            ((ig) this).b(-27598);
            ((ig) this).d(0);
            return;
          }
        }
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var3_int = param0.a(((ig) this).a(true), (byte) -103);
              var4 = param0.a(((ig) this).f(237239984), 0);
              bi.d(var3_int, var4, ((ig) this).field_pb, 65535);
              if (param1 == 5060) {
                break L1;
              } else {
                ig.m((byte) 7);
                break L1;
              }
            }
            bi.e(var3_int, var4, param0.a(((ig) this).field_Y, (byte) -128), param0.a(((ig) this).field_X, param1 + -5060), 16711935);
            var5 = 0;
            L2: while (true) {
              if (var5 >= ((ig) this).field_ub) {
                break L0;
              } else {
                var6 = param0.a(((ig) this).field_jb[var5], (byte) -115);
                var7 = param0.a(((ig) this).field_gb[var5], 0);
                bi.b(var6 - 1, var7 - 1, 3, 3, 0);
                bi.a(var6, var7, 65280);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ig.L(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void x(int param0) {
        field_Bb = null;
        if (param0 != -96) {
            ig.x(-81);
        }
    }

    final static void m(byte param0) {
        ce.field_q = false;
        nm.field_c = false;
        og.b(-115, -1);
        if (param0 > -43) {
            field_Bb = null;
            fk.field_F = ic.field_S;
            tk.field_a = ic.field_S;
            return;
        }
        fk.field_F = ic.field_S;
        tk.field_a = ic.field_S;
    }

    final void d(byte param0) {
        if (((ig) this).f(237239984) < 0) {
            return;
        }
        if (((ig) this).f(237239984) > dj.field_e.field_H.field_p) {
            return;
        }
        if (!(((ig) this).a(true) >= 0)) {
            return;
        }
        int var2 = 57 % ((param0 - 66) / 50);
        super.d((byte) 123);
    }

    final static int f(int param0, int param1) {
        return en.field_e[param1 & 2047];
    }

    final static void a(rb param0, int param1, int param2, int param3, int param4, rb param5, int param6, int param7, int param8, mf param9, int param10, mf param11, int param12, mf param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            re.field_g = param0;
            wb.field_m = param5;
            di.a(param17, param10, param12, (byte) -116, param19);
            int discarded$2 = 0;
            hn.a(1780, 0, param13);
            int discarded$3 = -386;
            ro.a(param4, param7, param9, param11, param16);
            ba.a(18002, param18, param2);
            kc.a((byte) 50, param15, param1, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var20;
            stackOut_2_1 = new StringBuilder().append("ig.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(495).append(',').append(param4).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param9 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param10).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param11 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param12).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param13 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 0 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = "FEAR";
    }
}
