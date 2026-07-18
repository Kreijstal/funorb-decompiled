/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static je field_a;
    static int field_b;
    private ho[][] field_d;

    public static void a(boolean param0) {
        try {
            field_a = null;
            field_c = null;
            if (param0) {
                field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "cm.G(" + param0 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        cf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ho var6 = null;
        om var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != ((cm) this).field_d[param1]) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((cm) this).a(-6, 29, -98, 117, 69);
                  break L1;
                }
              }
              var3 = br.a(param1, (byte) -93);
              var4 = 0;
              var5 = 0;
              L2: while (true) {
                L3: {
                  if (~var5 <= ~var3.field_n.length) {
                    break L3;
                  } else {
                    L4: {
                      var6 = ((cm) this).field_d[param1][var5];
                      var7 = var3.field_n[var5];
                      if (var6 == null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L4;
                      } else {
                        stackOut_10_0 = b.a(var7.field_m, var7.field_F, var6.field_c, (byte) 25, var6.field_b);
                        stackIn_13_0 = stackOut_10_0;
                        break L4;
                      }
                    }
                    var8 = stackIn_13_0;
                    var4 = var4 + var8;
                    var5++;
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_14_0 = var4;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref, "cm.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final static String b(boolean param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_25_0 = null;
        String stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_22_0 = false;
        String stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + me.field_c + " " + ba.field_F + " " + sj.field_e + ") " + nm.field_o;
                if (fk.field_b > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (~var2 <= ~fk.field_b) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & mg.field_e.field_o[var2];
                      var4 = var3 >> -1969862716;
                      var3 = var3 & 15;
                      stackOut_6_0 = ~var4;
                      stackIn_23_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 > -11) {
                              break L5;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 48;
                          break L4;
                        }
                        L6: {
                          L7: {
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_22_0 = param0;
              stackIn_23_0 = stackOut_22_0 ? 1 : 0;
              break L1;
            }
            if (stackIn_23_0 == 0) {
              stackOut_26_0 = (String) var1_ref;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              stackOut_24_0 = null;
              stackIn_25_0 = stackOut_24_0;
              return (String) (Object) stackIn_25_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "cm.H(" + param0 + ')');
        }
        return stackIn_27_0;
    }

    final void a(int param0, vh param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param1.e((byte) -104);
            var5 = 0;
            if (param2 <= -109) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 == var4_int) {
                      break L3;
                    } else {
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if ((var4_int & 1) != 0) {
                              ((cm) this).field_d[var5] = new ho[64];
                              L6: while (true) {
                                int dupTemp$1 = param1.k(0);
                                var6 = dupTemp$1;
                                if (255 == dupTemp$1) {
                                  break L5;
                                } else {
                                  stackOut_12_0 = -8;
                                  stackOut_12_1 = ~param0;
                                  stackIn_20_0 = stackOut_12_0;
                                  stackIn_20_1 = stackOut_12_1;
                                  stackIn_13_0 = stackOut_12_0;
                                  stackIn_13_1 = stackOut_12_1;
                                  if (var10 != 0) {
                                    break L4;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_13_0 < stackIn_13_1) {
                                          break L8;
                                        } else {
                                          var7 = param1.e((byte) -104);
                                          var8 = param1.e((byte) -104);
                                          if (var10 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      var7 = 2000;
                                      var9 = param1.e((byte) -104);
                                      var8 = var9;
                                      break L7;
                                    }
                                    ((cm) this).field_d[var5][var6] = new ho(var7, var8);
                                    if (var10 == 0) {
                                      continue L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          stackOut_19_0 = var4_int;
                          stackOut_19_1 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L4;
                        }
                        var4_int = stackIn_20_0 >> stackIn_20_1;
                        var5++;
                        if (var10 == 0) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) runtimeException;
            stackOut_22_1 = new StringBuilder().append("cm.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final static void a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                String discarded$2 = cm.b(false);
                break L1;
              }
            }
            wb.a(false, (byte) 32, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cm.D(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        cf var5 = null;
        om var6 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = 54 / ((67 - param1) / 36);
              if (((cm) this).field_d[param0] == null) {
                break L1;
              } else {
                if (null == ((cm) this).field_d[param0][param2]) {
                  break L1;
                } else {
                  var5 = br.a(param0, (byte) -57);
                  var6 = var5.field_n[param2];
                  stackOut_8_0 = b.a(var6.field_m, var6.field_F, ((cm) this).field_d[param0][param2].field_c, (byte) 25, ((cm) this).field_d[param0][param2].field_b);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "cm.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((cm) this).field_d[param3] != null) {
                break L1;
              } else {
                ((cm) this).field_d[param3] = new ho[64];
                break L1;
              }
            }
            L2: {
              if (param0 == 65535) {
                break L2;
              } else {
                field_b = -24;
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  L6: {
                    if (-1 != param2) {
                      break L6;
                    } else {
                      if (-1 == param4) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (65535 != param2) {
                    break L4;
                  } else {
                    if (param4 != 65535) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                ((cm) this).field_d[param3][param1] = null;
                if (!ArmiesOfGielinor.field_M) {
                  break L3;
                } else {
                  break L4;
                }
              }
              ((cm) this).field_d[param3][param1] = new ho(param2, param4);
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "cm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (jj.b((byte) -73)) {
                param1 = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              nm.a((byte) 95, param1);
              if (gl.field_b) {
                qn.d(ij.field_w.field_a.field_S, ij.field_w.field_a.field_ab, ij.field_w.field_a.field_gb, ij.field_w.field_a.field_ob);
                ij.field_w.field_a.b(param1, 20);
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 == 2000) {
              ArmiesOfGielinor.b(0, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "cm.E(" + param0 + ',' + param1 + ')');
        }
    }

    public cm() {
        try {
            ((cm) this).field_d = new ho[3][];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "cm.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unrated game";
    }
}
