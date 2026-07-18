/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends pj implements hf {
    static String field_i;
    static pi field_h;
    static String field_j;
    private vb field_g;

    final qh c(int param0) {
        if (param0 != 4) {
            field_i = null;
        }
        return ((k) this).a(((k) this).field_g.field_A, (byte) 106);
    }

    abstract qh a(String param0, byte param1);

    final static void d(byte param0) {
        if (param0 < 114) {
            return;
        }
        int discarded$0 = -105;
        ga.d();
    }

    abstract String a(int param0, String param1);

    public final void a(vb param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > -39) {
                field_h = null;
                ((k) this).a(false);
                break L1;
              } else {
                ((k) this).a(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("k.I(");
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
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static jp a(jp param0, int param1) {
        jp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        jp stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new jp(param0.field_x, 8 * param0.field_z);
              var3.g();
              if (param1 > 74) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= 8) {
                kc.field_q.a((byte) 89);
                stackOut_6_0 = (jp) var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.c(0, param0.field_z * var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("k.U(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + 8 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
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
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 < 0) {
                break L1;
              } else {
                if (mg.field_b <= param2) {
                  break L1;
                } else {
                  L2: {
                    if (param7 >= 0) {
                      break L2;
                    } else {
                      if (param0 >= 0) {
                        break L2;
                      } else {
                        if (param1 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (mg.field_e > param7) {
                      break L3;
                    } else {
                      if (~param0 > ~mg.field_e) {
                        break L3;
                      } else {
                        if (param1 >= mg.field_e) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param2 + param4;
                    if (~param5 == ~param2) {
                      L5: {
                        if (~param4 == ~param2) {
                          var9_int = param7 << 16;
                          var11 = 0;
                          var10 = param0 << 16;
                          var12 = 0;
                          break L5;
                        } else {
                          var15 = -param5 + param4;
                          if (param0 > param7) {
                            var10 = param0 << 16;
                            var11 = (-param7 + param1 << 16) / var14;
                            var12 = (param1 - param0 << 16) / var15;
                            var9_int = param7 << 16;
                            break L5;
                          } else {
                            var9_int = param0 << 16;
                            var10 = param7 << 16;
                            var12 = (param1 + -param7 << 16) / var14;
                            var11 = (-param0 + param1 << 16) / var15;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (param2 < 0) {
                          param2 = Math.min(-param2, -param2 + param5);
                          var10 = var10 + param2 * var12;
                          var9_int = var9_int + var11 * param2;
                          param2 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param7 << 16;
                        var9_int = param7 << 16;
                        var15 = -param2 + param5;
                        var11 = (param0 + -param7 << 16) / var15;
                        var12 = (-param7 + param1 << 16) / var14;
                        if (~var11 <= ~var12) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        } else {
                          var13 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        if (0 > param2) {
                          if (param5 < 0) {
                            param2 = param5 + -param2;
                            var9_int = var9_int + param2 * var11;
                            var10 = var10 + var12 * param2;
                            param2 = param5;
                            break L8;
                          } else {
                            param2 = -param2;
                            var10 = var10 + var12 * param2;
                            var9_int = var9_int + param2 * var11;
                            param2 = 0;
                            var16 = mg.field_g[param2];
                            L9: while (true) {
                              if (~param5 >= ~param2) {
                                break L8;
                              } else {
                                L10: {
                                  var17 = var9_int >> 16;
                                  if (mg.field_e > var17) {
                                    var18 = -(var9_int >> 16) + (var10 >> 16);
                                    if (var18 == 0) {
                                      if (var17 < 0) {
                                        break L10;
                                      } else {
                                        if (mg.field_e > var17) {
                                          int discarded$9 = -1;
                                          wc.a(param3, var18, param6, var16 + var17);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    } else {
                                      L11: {
                                        if (mg.field_e > var17 - -var18) {
                                          break L11;
                                        } else {
                                          var18 = -1 + -var17 + mg.field_e;
                                          break L11;
                                        }
                                      }
                                      if (var17 < 0) {
                                        int discarded$10 = -1;
                                        wc.a(param3, var17 + var18, param6, var16);
                                        break L10;
                                      } else {
                                        int discarded$11 = -1;
                                        wc.a(param3, var18, param6, var17 + var16);
                                        break L10;
                                      }
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                param2++;
                                if (~param2 > ~mg.field_b) {
                                  var9_int = var9_int + var11;
                                  var16 = var16 + lb.field_c;
                                  var10 = var10 + var12;
                                  continue L9;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = mg.field_g[param2];
                          L12: while (true) {
                            if (~param5 >= ~param2) {
                              break L8;
                            } else {
                              L13: {
                                var17 = var9_int >> 16;
                                if (mg.field_e > var17) {
                                  var18 = -(var9_int >> 16) + (var10 >> 16);
                                  if (var18 == 0) {
                                    if (var17 < 0) {
                                      break L13;
                                    } else {
                                      if (mg.field_e > var17) {
                                        int discarded$12 = -1;
                                        wc.a(param3, var18, param6, var16 + var17);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      if (mg.field_e > var17 - -var18) {
                                        break L14;
                                      } else {
                                        var18 = -1 + -var17 + mg.field_e;
                                        break L14;
                                      }
                                    }
                                    if (var17 < 0) {
                                      int discarded$13 = -1;
                                      wc.a(param3, var17 + var18, param6, var16);
                                      break L13;
                                    } else {
                                      int discarded$14 = -1;
                                      wc.a(param3, var18, param6, var17 + var16);
                                      break L13;
                                    }
                                  }
                                } else {
                                  break L13;
                                }
                              }
                              param2++;
                              if (~param2 > ~mg.field_b) {
                                var9_int = var9_int + var11;
                                var16 = var16 + lb.field_c;
                                var10 = var10 + var12;
                                continue L12;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                      var16 = param4 - param5;
                      if (var16 != 0) {
                        L15: {
                          var17 = param1 << 16;
                          if (var13 == 0) {
                            var9_int = param0 << 16;
                            break L15;
                          } else {
                            var10 = param0 << 16;
                            break L15;
                          }
                        }
                        var12 = (-var10 + var17) / var16;
                        var11 = (var17 - var9_int) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if (param2 >= 0) {
                      break L16;
                    } else {
                      param2 = -param2;
                      var9_int = var9_int + var11 * param2;
                      var10 = var10 + param2 * var12;
                      param2 = 0;
                      break L16;
                    }
                  }
                  var15 = mg.field_g[param2];
                  L17: while (true) {
                    if (param2 >= param4) {
                      break L0;
                    } else {
                      L18: {
                        var16 = var9_int >> 16;
                        if (~mg.field_e < ~var16) {
                          var17 = (var10 >> 16) + -(var9_int >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L18;
                            } else {
                              if (var16 >= mg.field_e) {
                                break L18;
                              } else {
                                int discarded$15 = -1;
                                wc.a(param3, var17, param6, var16 + var15);
                                break L18;
                              }
                            }
                          } else {
                            L19: {
                              if (~mg.field_e < ~(var16 - -var17)) {
                                break L19;
                              } else {
                                var17 = -1 + mg.field_e + -var16;
                                break L19;
                              }
                            }
                            if (var16 >= 0) {
                              int discarded$16 = -1;
                              wc.a(param3, var17, param6, var16 - -var15);
                              break L18;
                            } else {
                              int discarded$17 = -1;
                              wc.a(param3, var17 + var16, param6, var15);
                              break L18;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      param2++;
                      if (~param2 <= ~mg.field_b) {
                        return;
                      } else {
                        var15 = var15 + lb.field_c;
                        var9_int = var9_int + var11;
                        var10 = var10 + var12;
                        continue L17;
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
          L20: {
            var9 = decompiledCaughtException;
            stackOut_92_0 = (RuntimeException) var9;
            stackOut_92_1 = new StringBuilder().append("k.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param3 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L20;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L20;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + 0 + ')');
        }
    }

    public static void c() {
        field_i = null;
        field_j = null;
        field_h = null;
    }

    final String b(int param0) {
        if (param0 != 28600) {
            field_j = null;
        }
        return ((k) this).a(56, ((k) this).field_g.field_A);
    }

    public final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -27) {
            break L0;
          } else {
            k.d((byte) 112);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((k) this).field_g.field_A == null) {
              break L2;
            } else {
              if (0 != ((k) this).field_g.field_A.length()) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    k(vb param0) {
        try {
            ((k) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vb param0, int param1) {
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
              if (param1 == -40) {
                break L1;
              } else {
                var4 = null;
                qh discarded$2 = ((k) this).a((String) null, (byte) -114);
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
            stackOut_3_1 = new StringBuilder().append("k.H(");
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
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "OK";
        field_i = "Staff impersonation";
    }
}
