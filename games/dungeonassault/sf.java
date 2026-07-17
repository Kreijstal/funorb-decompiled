/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf implements cl {
    static int field_h;
    static String field_e;
    static int[] field_b;
    private wm field_f;
    static md field_c;
    private int field_a;
    static String field_i;
    private int field_d;
    static int field_g;
    private pj field_j;

    final static void d() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var1_int = gg.field_a[0];
            var2 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (~gg.field_a.length >= ~var2) {
                    break L3;
                  } else {
                    var3 = gg.field_a[var2];
                    cj.a(hf.field_yb, var2 << 4, hf.field_yb, var1_int, var3);
                    var1_int = var1_int + var3;
                    var2++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
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
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "sf.L(" + 3 + 41);
        }
    }

    public final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = bl.field_d[3].field_y;
              param0 = param0 - (((sf) this).field_a + var4_int);
              var5 = var4_int + 32;
              param2 = param2 - (var4_int + ((sf) this).field_d);
              var6 = param0 / var5;
              var7 = param2 / var5;
              if (param1 == 19091) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              if (0 > param0) {
                break L2;
              } else {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (var6 >= 7) {
                    break L2;
                  } else {
                    if (7 > var7) {
                      stackOut_15_0 = var6 + 7 * var7;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_17_0 = -1;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "sf.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_18_0;
    }

    public final void a(int param0, int param1) {
        try {
            if (param0 != 15122) {
                ((sf) this).a(-109, -25);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sf.K(" + param0 + 44 + param1 + 41);
        }
    }

    public final void a(int param0) {
        try {
            if (param0 != 2985) {
                ((sf) this).a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sf.D(" + param0 + 41);
        }
    }

    public final gg b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gg stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var3_int = bl.field_d[3].field_y;
              var4 = 32 + var3_int;
              var5 = param0 % 7;
              var6 = param0 / 7;
              if (param1 == -15390) {
                break L1;
              } else {
                ((sf) this).field_a = 43;
                break L1;
              }
            }
            stackOut_3_0 = new gg(var5 * var4 + (((sf) this).field_a - -var3_int) - -16, var6 * var4 + var3_int + (((sf) this).field_d - -16));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "sf.F(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Exception var2 = null;
            RuntimeException var2_ref = null;
            java.net.URL var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var2_ref2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(j.a((byte) 124, var2_ref2, param1), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    var2.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("sf.O(").append(0).append(44);
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_10_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(byte param0) {
        try {
            int var2_int = 27 / ((param0 - 4) / 45);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sf.H(" + param0 + 41);
        }
    }

    public final void a(boolean param0) {
        try {
            if (!param0) {
                ((sf) this).b((byte) -123);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sf.C(" + param0 + 41);
        }
    }

    public static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_e = null;
            field_i = null;
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "sf.N(" + 114 + 41);
        }
    }

    public final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        wm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        ai var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wm stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_203_1 = 0;
        RuntimeException decompiledCaughtException = null;
        wm stackOut_4_0 = null;
        wm stackOut_2_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_168_1 = 0;
        int stackOut_170_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_183_1 = 0;
        int stackOut_202_0 = 0;
        int stackOut_202_1 = 0;
        var16 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_int = bl.field_d[3].field_y;
              var3 = var2_int + 32;
              var4 = var2_int - -(7 * var3);
              gf.b(((sf) this).field_a + -4, ((sf) this).field_d + -4, 8 + var4, var4 + 8, 0);
              rp.a(8, 2 + var4, (byte) 108, -1 + ((sf) this).field_a, var4 + 2, kc.field_S, ((sf) this).field_d + -1);
              if (((sf) this).field_j == null) {
                stackOut_4_0 = ((sf) this).field_f;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = ((sf) this).field_j.b((byte) -6);
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_5_0;
              var6 = 0;
              if (param0 == -55) {
                break L2;
              } else {
                ((sf) this).b((byte) 36);
                break L2;
              }
            }
            var7 = ((sf) this).field_a;
            var8 = ((sf) this).field_d;
            var9 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var9 >= 7) {
                    break L5;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_171_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var16 != 0) {
                      break L4;
                    } else {
                      var10 = stackIn_11_0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if (7 <= var10) {
                              break L8;
                            } else {
                              stackOut_13_0 = -1;
                              stackOut_13_1 = ~var9;
                              stackIn_169_0 = stackOut_13_0;
                              stackIn_169_1 = stackOut_13_1;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              if (var16 != 0) {
                                break L7;
                              } else {
                                L9: {
                                  L10: {
                                    if (stackIn_14_0 > stackIn_14_1) {
                                      break L10;
                                    } else {
                                      bl.field_d[0].h(var2_int + var7, var8);
                                      if (var16 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    var11_int = 0;
                                    if (!((sf) this).field_f.a(35 + var6, (byte) 96)) {
                                      break L11;
                                    } else {
                                      var12 = -7 + var6;
                                      if (!var5.a(35 + var6, (byte) 97)) {
                                        break L11;
                                      } else {
                                        L12: {
                                          L13: {
                                            if (null == ((sf) this).field_j) {
                                              break L13;
                                            } else {
                                              L14: {
                                                L15: {
                                                  if (((sf) this).field_j.field_j.a(var6, (byte) 104)) {
                                                    break L15;
                                                  } else {
                                                    if (((sf) this).field_j.field_B != var6) {
                                                      break L14;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                if (((sf) this).field_j.field_j.a(var12, (byte) 90)) {
                                                  break L13;
                                                } else {
                                                  if (~var12 != ~((sf) this).field_j.field_B) {
                                                    break L14;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              stackOut_39_0 = 0;
                                              stackIn_40_0 = stackOut_39_0;
                                              break L12;
                                            }
                                          }
                                          stackOut_37_0 = 1;
                                          stackIn_40_0 = stackOut_37_0;
                                          break L12;
                                        }
                                        L16: {
                                          var13 = stackIn_40_0;
                                          if (var13 != 0) {
                                            stackOut_43_0 = 1;
                                            stackIn_44_0 = stackOut_43_0;
                                            break L16;
                                          } else {
                                            stackOut_41_0 = 2;
                                            stackIn_44_0 = stackOut_41_0;
                                            break L16;
                                          }
                                        }
                                        var11_int = stackIn_44_0;
                                        break L11;
                                      }
                                    }
                                  }
                                  bl.field_d[var11_int].h(var2_int + var7, var8);
                                  break L9;
                                }
                                L17: {
                                  L18: {
                                    if (0 < var10) {
                                      break L18;
                                    } else {
                                      bl.field_d[3].h(var7, var2_int + var8);
                                      if (var16 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    var11_int = 3;
                                    if (((sf) this).field_f.a(-1 + -(var6 / 7) + var6, (byte) 103)) {
                                      var12 = -1 + var6;
                                      if (var5.a(-1 + (-(var6 / 7) + var6), (byte) 122)) {
                                        L20: {
                                          L21: {
                                            if (null == ((sf) this).field_j) {
                                              break L21;
                                            } else {
                                              L22: {
                                                L23: {
                                                  if (((sf) this).field_j.field_j.a(var6, (byte) 115)) {
                                                    break L23;
                                                  } else {
                                                    if (((sf) this).field_j.field_B != var6) {
                                                      break L22;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                if (((sf) this).field_j.field_j.a(var12, (byte) 97)) {
                                                  break L21;
                                                } else {
                                                  if (((sf) this).field_j.field_B != var12) {
                                                    break L22;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              stackOut_71_0 = 0;
                                              stackIn_72_0 = stackOut_71_0;
                                              break L20;
                                            }
                                          }
                                          stackOut_69_0 = 1;
                                          stackIn_72_0 = stackOut_69_0;
                                          break L20;
                                        }
                                        L24: {
                                          var13 = stackIn_72_0;
                                          if (var13 != 0) {
                                            stackOut_75_0 = 4;
                                            stackIn_76_0 = stackOut_75_0;
                                            break L24;
                                          } else {
                                            stackOut_73_0 = 5;
                                            stackIn_76_0 = stackOut_73_0;
                                            break L24;
                                          }
                                        }
                                        var11_int = stackIn_76_0;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  bl.field_d[var11_int].h(var7, var8 + var2_int);
                                  break L17;
                                }
                                L25: {
                                  L26: {
                                    if (((sf) this).field_j == null) {
                                      break L26;
                                    } else {
                                      var11 = ((sf) this).field_j.field_h[var6];
                                      if (var16 == 0) {
                                        break L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  var11 = qj.field_c[var6];
                                  if (var11 != null) {
                                    break L25;
                                  } else {
                                    var11 = gm.field_d.field_L[var6];
                                    break L25;
                                  }
                                }
                                L27: {
                                  L28: {
                                    var12 = var11.field_a;
                                    if (((sf) this).field_j == null) {
                                      break L28;
                                    } else {
                                      if (!((sf) this).field_j.field_p.a(var6, (byte) 72)) {
                                        stackOut_88_0 = 0;
                                        stackIn_89_0 = stackOut_88_0;
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  stackOut_86_0 = 1;
                                  stackIn_89_0 = stackOut_86_0;
                                  break L27;
                                }
                                L29: {
                                  var13 = stackIn_89_0;
                                  if (var13 != 0) {
                                    break L29;
                                  } else {
                                    if (24 == var6) {
                                      break L29;
                                    } else {
                                      var12 = 1;
                                      break L29;
                                    }
                                  }
                                }
                                L30: {
                                  L31: {
                                    if (3 == var12) {
                                      break L31;
                                    } else {
                                      L32: {
                                        L33: {
                                          if (null == ((sf) this).field_j) {
                                            break L33;
                                          } else {
                                            if (((sf) this).field_j.field_j == null) {
                                              break L33;
                                            } else {
                                              if (!((sf) this).field_j.field_j.a(var6, (byte) 68)) {
                                                break L33;
                                              } else {
                                                stackOut_104_0 = 1;
                                                stackIn_107_0 = stackOut_104_0;
                                                break L32;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_106_0 = 0;
                                        stackIn_107_0 = stackOut_106_0;
                                        break L32;
                                      }
                                      L34: {
                                        var14 = stackIn_107_0;
                                        if (var13 == 0) {
                                          stackOut_110_0 = 0;
                                          stackIn_111_0 = stackOut_110_0;
                                          break L34;
                                        } else {
                                          stackOut_108_0 = this.c(var6, param0 ^ -87);
                                          stackIn_111_0 = stackOut_108_0;
                                          break L34;
                                        }
                                      }
                                      L35: {
                                        L36: {
                                          var15 = stackIn_111_0;
                                          if (var12 != 1) {
                                            break L36;
                                          } else {
                                            ja.field_b[1].h(var2_int + var7, var2_int + var8);
                                            if (var16 == 0) {
                                              break L35;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                        L37: {
                                          if (0 != var12) {
                                            break L37;
                                          } else {
                                            ja.field_b[0].h(var7 - -var2_int, var8 + var2_int);
                                            p.field_G[var15].d(var7 - -var2_int, var2_int + var8, 128);
                                            qe.b(var7 + var2_int, var8 + var2_int, 32, 32, 0, 0, 0);
                                            if (var16 == 0) {
                                              break L35;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        L38: {
                                          ja.field_b[var12].h(var7 + var2_int, var2_int + var8);
                                          if (var6 == 24) {
                                            break L38;
                                          } else {
                                            p.field_G[var15].d(var2_int + var7, var8 + var2_int, 64);
                                            break L38;
                                          }
                                        }
                                        if (var14 != 0) {
                                          sm.field_g.d((-sm.field_g.field_y + 32 >> 1) + (var2_int + var7), (32 - sm.field_g.field_v >> 1) + (var8 - -var2_int), 128);
                                          break L35;
                                        } else {
                                          break L35;
                                        }
                                      }
                                      if (var16 == 0) {
                                        break L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  L39: {
                                    if (0 != var6) {
                                      break L39;
                                    } else {
                                      ja.field_b[3].h(var2_int + var7, var2_int + var8);
                                      if (var16 == 0) {
                                        break L30;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  L40: {
                                    if (var6 == 6) {
                                      break L40;
                                    } else {
                                      L41: {
                                        if (var6 != 42) {
                                          break L41;
                                        } else {
                                          ja.field_b[3].g(var2_int + var7, var8 + var2_int);
                                          if (var16 == 0) {
                                            break L30;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                      if (48 == var6) {
                                        ja.field_b[3].b(var7 + var2_int, var8 + var2_int);
                                        if (var16 == 0) {
                                          break L30;
                                        } else {
                                          break L40;
                                        }
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  ja.field_b[3].f(var7 + var2_int, var2_int + var8);
                                  break L30;
                                }
                                L42: {
                                  if (((sf) this).field_j != null) {
                                    L43: {
                                      if (var6 != ((sf) this).field_j.field_q) {
                                        break L43;
                                      } else {
                                        rj.field_k.h(var7 - (-2 - (var3 - rj.field_k.field_E >> 1)), 2 + (var8 - -(-rj.field_k.field_G + var3 >> 1)));
                                        if (var16 == 0) {
                                          break L42;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    if (~((sf) this).field_j.field_B == ~var6) {
                                      rj.field_k.d((var3 - rj.field_k.field_E >> 1) + 2 + var7, (var3 - rj.field_k.field_G >> 1) + (2 + var8), 128);
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  } else {
                                    break L42;
                                  }
                                }
                                var7 = var7 + var3;
                                var10++;
                                var6++;
                                if (var16 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          bl.field_d[3].h(var7, var8 - -var2_int);
                          var7 = ((sf) this).field_a;
                          var9++;
                          stackOut_168_0 = var8;
                          stackOut_168_1 = var3;
                          stackIn_169_0 = stackOut_168_0;
                          stackIn_169_1 = stackOut_168_1;
                          break L7;
                        }
                        var8 = stackIn_169_0 + stackIn_169_1;
                        if (var16 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                stackOut_170_0 = 0;
                stackIn_171_0 = stackOut_170_0;
                break L4;
              }
              var9 = stackIn_171_0;
              L44: while (true) {
                L45: {
                  L46: {
                    if (var9 >= 7) {
                      break L46;
                    } else {
                      bl.field_d[0].h(var7 - -var2_int, var8);
                      var9++;
                      var7 = var7 + var3;
                      if (var16 != 0) {
                        break L45;
                      } else {
                        if (var16 == 0) {
                          continue L44;
                        } else {
                          break L46;
                        }
                      }
                    }
                  }
                  jh.c();
                  gf.e(((sf) this).field_a, ((sf) this).field_d, ((sf) this).field_a - -var4, ((sf) this).field_d - -var4);
                  var7 = ((sf) this).field_a;
                  var8 = ((sf) this).field_d;
                  break L45;
                }
                var9 = 0;
                L47: while (true) {
                  L48: {
                    L49: {
                      if (8 <= var9) {
                        break L49;
                      } else {
                        if (var16 != 0) {
                          break L48;
                        } else {
                          var10 = 0;
                          L50: while (true) {
                            L51: {
                              L52: {
                                if (var10 >= 8) {
                                  break L52;
                                } else {
                                  stackOut_183_0 = var9;
                                  stackOut_183_1 = 3;
                                  stackIn_203_0 = stackOut_183_0;
                                  stackIn_203_1 = stackOut_183_1;
                                  stackIn_184_0 = stackOut_183_0;
                                  stackIn_184_1 = stackOut_183_1;
                                  if (var16 != 0) {
                                    break L51;
                                  } else {
                                    L53: {
                                      L54: {
                                        L55: {
                                          L56: {
                                            if (stackIn_184_0 == stackIn_184_1) {
                                              break L56;
                                            } else {
                                              if (var9 != 4) {
                                                break L55;
                                              } else {
                                                break L56;
                                              }
                                            }
                                          }
                                          if (var10 == 3) {
                                            break L54;
                                          } else {
                                            if (var10 == 4) {
                                              break L54;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        gf.b(-1 + var7, -1 + var8, 2 + var2_int, 2 + var2_int, 8421504);
                                        gf.b(var7, var8, var2_int, var2_int, 16777215);
                                        if (var16 == 0) {
                                          break L53;
                                        } else {
                                          break L54;
                                        }
                                      }
                                      gf.b(var7 - 2, -2 + var8, var2_int - -4, var2_int - -4, 8421504);
                                      gf.b(-1 + var7, -1 + var8, 2 + var2_int, var2_int - -2, 16777215);
                                      break L53;
                                    }
                                    var7 = var7 + var3;
                                    var10++;
                                    if (var16 == 0) {
                                      continue L50;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              var9++;
                              var7 = ((sf) this).field_a;
                              stackOut_202_0 = var8;
                              stackOut_202_1 = var3;
                              stackIn_203_0 = stackOut_202_0;
                              stackIn_203_1 = stackOut_202_1;
                              break L51;
                            }
                            var8 = stackIn_203_0 + stackIn_203_1;
                            if (var16 == 0) {
                              continue L47;
                            } else {
                              break L49;
                            }
                          }
                        }
                      }
                    }
                    jh.b();
                    break L48;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "sf.G(" + param0 + 41);
        }
    }

    public final void c(int param0) {
        try {
            if (param0 != -30876) {
                sf.d(27, 16);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sf.E(" + param0 + 41);
        }
    }

    public final void a(int param0, int param1, int param2) {
        try {
            if (param0 != -9398) {
                field_g = -19;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sf.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void b(int param0) {
        try {
            if (param0 != -20827) {
                ((sf) this).a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sf.J(" + param0 + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        wm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        var16 = DungeonAssault.field_K;
        try {
          L0: {
            if (null != ((sf) this).field_j) {
              L1: {
                if (param2 > 0) {
                  break L1;
                } else {
                  if (param0) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              var4_int = (int)(0.5 + Math.cos((double)((float)mo.field_a / 5.0f)) * 3.0);
              var5 = ((sf) this).field_j.b((byte) -128).a((byte) -53, ((sf) this).field_j.field_v);
              if (param1 == -1723) {
                var6 = 36;
                var7 = 4;
                var8 = 0;
                var9 = var7 + ((sf) this).field_a;
                var10 = ((sf) this).field_d - -var7;
                var11 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var11 >= 7) {
                        break L4;
                      } else {
                        if (var16 != 0) {
                          break L3;
                        } else {
                          var12 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (7 <= var12) {
                                  break L7;
                                } else {
                                  stackOut_13_0 = ~var11;
                                  stackOut_13_1 = -1;
                                  stackIn_101_0 = stackOut_13_0;
                                  stackIn_101_1 = stackOut_13_1;
                                  stackIn_14_0 = stackOut_13_0;
                                  stackIn_14_1 = stackOut_13_1;
                                  if (var16 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_14_0 >= stackIn_14_1) {
                                          break L9;
                                        } else {
                                          if (!var5.a(35 + var8, (byte) 106)) {
                                            break L9;
                                          } else {
                                            var13 = var8 - 7;
                                            if (!((sf) this).field_j.field_m.a(var8, (byte) 83)) {
                                              break L8;
                                            } else {
                                              if (!((sf) this).field_j.field_m.a(var13, (byte) 68)) {
                                                break L8;
                                              } else {
                                                L10: {
                                                  L11: {
                                                    if (((sf) this).field_j.field_j.a(var8, (byte) 77)) {
                                                      break L11;
                                                    } else {
                                                      if (var8 != ((sf) this).field_j.field_q) {
                                                        stackOut_32_0 = 0;
                                                        stackIn_33_0 = stackOut_32_0;
                                                        break L10;
                                                      } else {
                                                        break L11;
                                                      }
                                                    }
                                                  }
                                                  stackOut_30_0 = 1;
                                                  stackIn_33_0 = stackOut_30_0;
                                                  break L10;
                                                }
                                                L12: {
                                                  L13: {
                                                    var14 = stackIn_33_0;
                                                    if (((sf) this).field_j.field_j.a(var13, (byte) 78)) {
                                                      break L13;
                                                    } else {
                                                      if (~var13 != ~((sf) this).field_j.field_q) {
                                                        stackOut_39_0 = 0;
                                                        stackIn_40_0 = stackOut_39_0;
                                                        break L12;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                  stackOut_37_0 = 1;
                                                  stackIn_40_0 = stackOut_37_0;
                                                  break L12;
                                                }
                                                L14: {
                                                  L15: {
                                                    var15 = stackIn_40_0;
                                                    if (var14 == 0) {
                                                      break L15;
                                                    } else {
                                                      if (var15 == 0) {
                                                        break L14;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  if (var14 != 0) {
                                                    break L9;
                                                  } else {
                                                    if (var15 == 0) {
                                                      break L9;
                                                    } else {
                                                      i.field_v.h(-1 + (var9 - -(var6 + -i.field_v.field_y >> 1)), (-i.field_v.field_v + -4 >> 1) + (var4_int + var10));
                                                      if (var16 == 0) {
                                                        break L9;
                                                      } else {
                                                        break L14;
                                                      }
                                                    }
                                                  }
                                                }
                                                fo.field_a.h((var6 - fo.field_a.field_y >> 1) + (-1 + var9), (-fo.field_a.field_v + -4 >> 1) + -var4_int + var10);
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (0 >= var12) {
                                        break L8;
                                      } else {
                                        if (var5.a(-1 + var8 + -(var8 / 7), (byte) 84)) {
                                          var13 = var8 + -1;
                                          if (!((sf) this).field_j.field_m.a(var8, (byte) 110)) {
                                            break L8;
                                          } else {
                                            L16: {
                                              if (((sf) this).field_j.field_m.a(var13, (byte) 79)) {
                                                break L16;
                                              } else {
                                                if (var16 == 0) {
                                                  break L8;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              L18: {
                                                if (((sf) this).field_j.field_j.a(var8, (byte) 84)) {
                                                  break L18;
                                                } else {
                                                  if (((sf) this).field_j.field_q != var8) {
                                                    stackOut_76_0 = 0;
                                                    stackIn_77_0 = stackOut_76_0;
                                                    break L17;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              stackOut_74_0 = 1;
                                              stackIn_77_0 = stackOut_74_0;
                                              break L17;
                                            }
                                            L19: {
                                              L20: {
                                                var14 = stackIn_77_0;
                                                if (((sf) this).field_j.field_j.a(var13, (byte) 93)) {
                                                  break L20;
                                                } else {
                                                  if (((sf) this).field_j.field_q != var13) {
                                                    stackOut_83_0 = 0;
                                                    stackIn_84_0 = stackOut_83_0;
                                                    break L19;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              stackOut_81_0 = 1;
                                              stackIn_84_0 = stackOut_81_0;
                                              break L19;
                                            }
                                            L21: {
                                              L22: {
                                                var15 = stackIn_84_0;
                                                if (var14 != 0) {
                                                  break L22;
                                                } else {
                                                  if (var15 != 0) {
                                                    break L21;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              if (var14 == 0) {
                                                break L8;
                                              } else {
                                                if (var15 != 0) {
                                                  break L8;
                                                } else {
                                                  qi.field_i.h(var9 + (-var4_int - -(-qp.field_a.field_y + -2 >> 1)), -1 + var10 - -(-qp.field_a.field_v + var6 >> 1));
                                                  if (var16 == 0) {
                                                    break L8;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                            qp.field_a.h((-qp.field_a.field_y + -2 >> 1) + (var9 + var4_int), var10 + (-1 - -(var6 + -qp.field_a.field_v >> 1)));
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var8++;
                                    var9 = var9 + var6;
                                    var12++;
                                    if (var16 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var9 = var7 + ((sf) this).field_a;
                              stackOut_100_0 = var10;
                              stackOut_100_1 = var6;
                              stackIn_101_0 = stackOut_100_0;
                              stackIn_101_1 = stackOut_100_1;
                              break L6;
                            }
                            var10 = stackIn_101_0 + stackIn_101_1;
                            var11++;
                            if (var16 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "sf.I(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final int c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 > 82) {
              L1: {
                var3_int = 0;
                if (param0 % 7 == 0) {
                  break L1;
                } else {
                  if (!((sf) this).field_f.a(-1 + (param0 + -(param0 / 7)), (byte) 99)) {
                    break L1;
                  } else {
                    var3_int = var3_int | 1;
                    break L1;
                  }
                }
              }
              L2: {
                if (6 == param0 % 7) {
                  break L2;
                } else {
                  if (((sf) this).field_f.a(param0 + -(param0 / 7), (byte) 89)) {
                    var3_int = var3_int | 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 <= 6) {
                  break L3;
                } else {
                  if (!((sf) this).field_f.a(param0 - -35, (byte) 70)) {
                    break L3;
                  } else {
                    var3_int = var3_int | 4;
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 >= 42) {
                  break L4;
                } else {
                  if (((sf) this).field_f.a(42 + param0, (byte) 74)) {
                    var3_int = var3_int | 8;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_27_0 = var3_int;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              stackOut_1_0 = -82;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "sf.P(" + param0 + 44 + param1 + 41);
        }
        return stackIn_28_0;
    }

    sf(go param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = bl.field_d[3].field_y;
                var5 = 32 + var4_int;
                var6 = var4_int - -(var5 * 7);
                if (null != param0) {
                  break L2;
                } else {
                  ((sf) this).field_f = gm.field_d.field_k;
                  ((sf) this).field_j = null;
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((sf) this).field_j = param0.field_Y;
              ((sf) this).field_f = ((sf) this).field_j.field_v;
              break L1;
            }
            ((sf) this).field_a = param1 - (var6 >> 1);
            ((sf) this).field_d = param2 + -(var6 >> 1);
            ((sf) this).a(15122, 0);
            ((sf) this).a(15122, 6);
            ((sf) this).a(15122, 42);
            ((sf) this).a(15122, 48);
            ((sf) this).b(-20827);
            jh.c();
            p.field_G = new cn[16];
            var7 = 0;
            L3: while (true) {
              stackOut_8_0 = 16;
              stackOut_8_1 = var7;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              L4: while (true) {
                L5: {
                  L6: {
                    if (stackIn_9_0 <= stackIn_9_1) {
                      break L6;
                    } else {
                      var8 = new cn(32, 32);
                      var8.e();
                      gf.b(0, 0, 32, 32, 65793);
                      var9 = 16777215;
                      var10 = 10;
                      var11 = -var10 + (32 - var10);
                      if (var13 != 0) {
                        break L5;
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          L8: {
                            if (var12 >= 2) {
                              break L8;
                            } else {
                              gf.b(var10, var10, var11, var11, var9);
                              stackOut_13_0 = -1;
                              stackOut_13_1 = ~(var7 & 1);
                              stackIn_9_0 = stackOut_13_0;
                              stackIn_9_1 = stackOut_13_1;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              if (var13 != 0) {
                                continue L4;
                              } else {
                                L9: {
                                  if (stackIn_14_0 != stackIn_14_1) {
                                    gf.b(0, var10, var11 + var10, var11, var9);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                L10: {
                                  if ((var7 & 2) != 0) {
                                    gf.b(var10, var10, var11 + var10, var11, var9);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  if ((4 & var7) != 0) {
                                    gf.b(var10, 0, var11, var10 + var11, var9);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if ((8 & var7) == 0) {
                                    break L12;
                                  } else {
                                    gf.b(var10, var10, var11, var11 + var10, var9);
                                    break L12;
                                  }
                                }
                                var9 = 0;
                                var11 -= 2;
                                var10++;
                                var12++;
                                if (var13 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          p.field_G[var7] = var8;
                          var7++;
                          if (var13 == 0) {
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  jh.b();
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("sf.<init>(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L13;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L13;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        fa var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_17_0 = false;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            oo.field_d = param1;
            var2 = (fa) (Object) ud.field_v.e(-24172);
            var3 = -72 / ((param0 - -32) / 61);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var2 == null) {
                      break L4;
                    } else {
                      stackOut_3_0 = var2.field_o.c(-71);
                      stackIn_19_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var4 != 0) {
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (stackIn_19_0) {
                                break L7;
                              } else {
                                var2.a(false);
                                if (var4 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var2.field_n.h(128 + oo.field_d * var2.field_l >> 8);
                            break L6;
                          }
                          var2 = (fa) (Object) oi.field_F.a(4);
                          if (var4 == 0) {
                            if (var2 == null) {
                              break L3;
                            } else {
                              if (var4 != 0) {
                                break L2;
                              } else {
                                stackOut_17_0 = var2.field_o.c(-70);
                                stackIn_19_0 = stackOut_17_0;
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        L8: {
                          L9: {
                            if (stackIn_4_0) {
                              break L9;
                            } else {
                              var2.a(false);
                              if (var4 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var2.field_n.h(oo.field_d * var2.field_l + 128 >> 8);
                          break L8;
                        }
                        var2 = (fa) (Object) ud.field_v.a(4);
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (oi.field_F == null) {
                    break L3;
                  } else {
                    var2 = (fa) (Object) oi.field_F.e(-24172);
                    L10: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        if (var4 != 0) {
                          break L2;
                        } else {
                          stackOut_17_0 = var2.field_o.c(-70);
                          stackIn_19_0 = stackOut_17_0;
                          L11: {
                            L12: {
                              if (stackIn_19_0) {
                                break L12;
                              } else {
                                var2.a(false);
                                if (var4 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var2.field_n.h(128 + oo.field_d * var2.field_l >> 8);
                            break L11;
                          }
                          var2 = (fa) (Object) oi.field_F.a(4);
                          if (var4 == 0) {
                            continue L10;
                          } else {
                            break L3;
                          }
                        }
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
          throw vk.a((Throwable) (Object) runtimeException, "sf.M(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_g = 0;
        field_b = new int[]{1052688, 1056800, 1056784, 4198416, 2105408, 4202560};
        field_i = "Vampire Bats";
        field_c = new md();
    }
}
