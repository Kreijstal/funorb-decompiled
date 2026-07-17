/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends pb {
    private int field_o;
    private hg field_l;
    static String field_m;
    static int field_n;

    w(int param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((w) this).field_l = new hg(param0);
              if (param1 == 8) {
                break L1;
              } else {
                var4 = null;
                ((w) this).b((int[]) null, 66);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("w.QA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final void g(int param0) {
        ((w) this).field_i = (7 + ((w) this).field_o) / param0;
    }

    final void f(boolean param0) {
        if (!param0) {
            field_m = null;
        }
        ((w) this).field_o = ((w) this).field_i * 8;
    }

    final int g(byte param0) {
        int var2 = 118 % ((39 - param0) / 51);
        int fieldTemp$0 = ((w) this).field_i;
        ((w) this).field_i = ((w) this).field_i + 1;
        return ((w) this).field_g[fieldTemp$0] + -((w) this).field_l.b(-1427) & 255;
    }

    final void b(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = Main.field_T;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param3) {
                L2: {
                  if (param2 == 28040) {
                    break L2;
                  } else {
                    ((w) this).field_l = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((w) this).field_i;
                ((w) this).field_i = ((w) this).field_i + 1;
                param1[var5_int - -param0] = (byte)(((w) this).field_g[fieldTemp$2] + -((w) this).field_l.b(-1427));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("w.SA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8) {
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var19 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param8 < 0) {
                break L1;
              } else {
                if (param7 < jb.field_c) {
                  L2: {
                    if (param3 >= 0) {
                      break L2;
                    } else {
                      if (param5 >= 0) {
                        break L2;
                      } else {
                        if (param6 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (jb.field_i > param3) {
                      break L3;
                    } else {
                      if (~jb.field_i < ~param5) {
                        break L3;
                      } else {
                        if (~param6 > ~jb.field_i) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param7 + param8;
                    if (~param7 != ~param2) {
                      L5: {
                        var10 = param3 << 16;
                        var9_int = param3 << 16;
                        var15 = -param7 + param2;
                        var11 = (-param3 + param5 << 16) / var15;
                        var12 = (param6 - param3 << 16) / var14;
                        if (~var12 >= ~var11) {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L5;
                        } else {
                          var13 = 0;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param7 >= 0) {
                            break L7;
                          } else {
                            if (param2 < 0) {
                              param7 = -param7 + param2;
                              var9_int = var9_int + var11 * param7;
                              var10 = var10 + param7 * var12;
                              param7 = param2;
                              break L6;
                            } else {
                              param7 = -param7;
                              var10 = var10 + param7 * var12;
                              var9_int = var9_int + param7 * var11;
                              param7 = 0;
                              break L7;
                            }
                          }
                        }
                        var16 = jb.field_e[param7];
                        L8: while (true) {
                          if (~param2 >= ~param7) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9_int >> 16;
                              if (~jb.field_i < ~var17) {
                                var18 = (var10 >> 16) + -(var9_int >> 16);
                                if (0 != var18) {
                                  L10: {
                                    if (jb.field_i > var18 + var17) {
                                      break L10;
                                    } else {
                                      var18 = -var17 + (jb.field_i + -1);
                                      break L10;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    int discarded$6 = -1483723263;
                                    a.a(var16 + var17, param1, var18, param0);
                                    break L9;
                                  } else {
                                    int discarded$7 = -1483723263;
                                    a.a(var16, param1, var17 + var18, param0);
                                    break L9;
                                  }
                                } else {
                                  if (var17 < 0) {
                                    break L9;
                                  } else {
                                    if (~var17 > ~jb.field_i) {
                                      int discarded$8 = -1483723263;
                                      a.a(var16 + var17, param1, var18, param0);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            param7++;
                            if (param7 >= jb.field_c) {
                              return;
                            } else {
                              var9_int = var9_int + var11;
                              var16 = var16 + vj.field_l;
                              var10 = var10 + var12;
                              continue L8;
                            }
                          }
                        }
                      }
                      var16 = -param2 + param8;
                      if (var16 != 0) {
                        L11: {
                          var17 = param6 << 16;
                          if (var13 == 0) {
                            var9_int = param5 << 16;
                            break L11;
                          } else {
                            var10 = param5 << 16;
                            break L11;
                          }
                        }
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (~param8 != ~param7) {
                          var15 = -param2 + param8;
                          if (~param5 >= ~param3) {
                            var11 = (param6 + -param5 << 16) / var15;
                            var12 = (param6 - param3 << 16) / var14;
                            var10 = param3 << 16;
                            var9_int = param5 << 16;
                            break L12;
                          } else {
                            var12 = (param6 - param5 << 16) / var15;
                            var11 = (-param3 + param6 << 16) / var14;
                            var10 = param5 << 16;
                            var9_int = param3 << 16;
                            break L12;
                          }
                        } else {
                          var10 = param5 << 16;
                          var9_int = param3 << 16;
                          var11 = 0;
                          var12 = 0;
                          break L12;
                        }
                      }
                      L13: {
                        if (param7 >= 0) {
                          break L13;
                        } else {
                          param7 = Math.min(-param7, -param7 + param2);
                          var9_int = var9_int + param7 * var11;
                          var10 = var10 + var12 * param7;
                          param7 = 0;
                          break L13;
                        }
                      }
                      var13 = 0;
                      break L4;
                    }
                  }
                  L14: {
                    if (param7 >= 0) {
                      break L14;
                    } else {
                      param7 = -param7;
                      var10 = var10 + param7 * var12;
                      var9_int = var9_int + param7 * var11;
                      param7 = 0;
                      break L14;
                    }
                  }
                  var15 = jb.field_e[param7];
                  L15: while (true) {
                    if (param7 >= param8) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (~jb.field_i >= ~var16) {
                          break L16;
                        } else {
                          var17 = (var10 >> 16) + -(var9_int >> 16);
                          if (var17 != 0) {
                            L17: {
                              if (~jb.field_i < ~(var17 + var16)) {
                                break L17;
                              } else {
                                var17 = -1 + (jb.field_i + -var16);
                                break L17;
                              }
                            }
                            if (0 <= var16) {
                              int discarded$9 = -1483723263;
                              a.a(var15 + var16, param1, var17, param0);
                              break L16;
                            } else {
                              int discarded$10 = -1483723263;
                              a.a(var15, param1, var17 + var16, param0);
                              break L16;
                            }
                          } else {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (var16 < jb.field_i) {
                                int discarded$11 = -1483723263;
                                a.a(var16 - -var15, param1, var17, param0);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      param7++;
                      if (~param7 <= ~jb.field_c) {
                        return;
                      } else {
                        var9_int = var9_int + var11;
                        var15 = var15 + vj.field_l;
                        var10 = var10 + var12;
                        continue L15;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var9;
            stackOut_75_1 = new StringBuilder().append("w.PA(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L18;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 1 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void h(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        int fieldTemp$0 = ((w) this).field_i;
        ((w) this).field_i = ((w) this).field_i + 1;
        ((w) this).field_g[fieldTemp$0] = (byte)(param0 + ((w) this).field_l.b(-1427));
    }

    public static void h() {
        field_m = null;
    }

    w(byte[] param0) {
        super(param0);
    }

    final int g(int param0, int param1) {
        int var6 = Main.field_T;
        if (param1 != -1) {
            return 42;
        }
        int var3 = ((w) this).field_o >> 3;
        int var4 = 8 + -(((w) this).field_o & 7);
        ((w) this).field_o = ((w) this).field_o + param0;
        int var5 = 0;
        while (var4 < param0) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((w) this).field_g[incrementValue$0] & sg.field_g[var4]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 != param0) {
            var5 = var5 + (((w) this).field_g[var3] >> -param0 + var4 & sg.field_g[param0]);
        } else {
            var5 = var5 + (((w) this).field_g[var3] & sg.field_g[var4]);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Play the game without logging in just yet";
    }
}
