/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class od extends fc {
    static bd field_D;
    static String field_B;
    static bd[] field_G;
    static java.lang.reflect.Constructor field_F;
    static String field_E;
    static String field_C;
    static fk field_I;
    static String field_H;

    private od(int param0, int param1, int param2, int param3, nn param4, mh param5, ag param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((od) this).field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "od.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static bd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        bd[] var10 = null;
        bd[] var11_ref_bd__ = null;
        int var11 = 0;
        int var12 = 0;
        bd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        var15 = HostileSpawn.field_I ? 1 : 0;
        var9 = param2 + (param4 - -param7);
        var10 = new bd[]{new bd(var9, var9), new bd(param0, var9), new bd(var9, var9), new bd(var9, param0), new bd(64, 64), new bd(var9, param0), new bd(var9, var9), new bd(param0, var9), new bd(var9, var9)};
        var11_ref_bd__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_bd__.length) {
                break L2;
              } else {
                var13 = var11_ref_bd__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var14 >= var13.field_D.length) {
                          break L5;
                        } else {
                          var13.field_D[var14] = param8;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (var11 >= param4) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var9 <= var12) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_D[(-var11 + var9 + -1) * var9 + var12] = param5;
                        var10[8].field_D[var12 + var9 * (-var11 + (var9 - 1))] = param5;
                        var10[2].field_D[-var11 + var9 - (1 - var9 * var12)] = param5;
                        var10[8].field_D[var9 * var12 + (-var11 + (-1 + var9))] = param5;
                        var12++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          continue L8;
                        }
                      }
                    }
                    continue L6;
                  }
                }
              }
            }
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = param4;
              stackOut_23_1 = var11;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 <= stackIn_24_1) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var9 <= var12) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_D[var12 + var9 * var11] = param6;
                        var10[0].field_D[var11 + var12 * var9] = param6;
                        stackOut_27_0 = var12;
                        stackOut_27_1 = -var11 + var9;
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                var11 = stackIn_31_0;
                L13: while (true) {
                  L14: {
                    if (var11 >= param0) {
                      stackOut_41_0 = param1;
                      stackIn_42_0 = stackOut_41_0;
                      break L14;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_42_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var15 != 0) {
                        break L14;
                      } else {
                        var12 = stackIn_34_0;
                        L15: while (true) {
                          L16: {
                            if (param4 <= var12) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_D[param0 * (var9 - (var12 + 1)) + var11] = param5;
                              var10[5].field_D[var9 * var11 - (-var9 + 1) - var12] = param5;
                              var10[1].field_D[var11 + var12 * param0] = param6;
                              var10[3].field_D[var12 + var9 * var11] = param6;
                              var12++;
                              if (var15 != 0) {
                                break L16;
                              } else {
                                continue L15;
                              }
                            }
                          }
                          continue L13;
                        }
                      }
                    }
                  }
                  if (stackIn_42_0 < 17) {
                    return null;
                  } else {
                    var11 = 0;
                    L17: while (true) {
                      L18: {
                        if (var11 >= param0 >> 1) {
                          break L18;
                        } else {
                          var12 = 0;
                          L19: while (true) {
                            L20: {
                              if (var12 >= param2) {
                                var11++;
                                break L20;
                              } else {
                                var10[1].field_D[var11 + param0 * (-1 + var9 - var12)] = param3;
                                var10[3].field_D[var11 * var9 + -1 + (var9 - var12)] = param3;
                                var10[7].field_D[var12 * param0 - -var11] = param3;
                                var10[5].field_D[var12 + var9 * var11] = param3;
                                var12++;
                                if (var15 != 0) {
                                  break L20;
                                } else {
                                  continue L19;
                                }
                              }
                            }
                            if (var15 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      return var10;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void k(int param0) {
        if (!(md.field_k)) {
            throw new IllegalStateException();
        }
        ka.field_r = true;
        w.b(false, -23960);
        fa.field_c = param0;
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var2 = param0;
        if (var2 != 10) {
          if (var2 != 11) {
            L0: {
              if (var2 != 129) {
                break L0;
              } else {
                if (var3 != 0) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            L1: {
              if (var2 != 128) {
                break L1;
              } else {
                if (var3 != 0) {
                  break L1;
                } else {
                  return true;
                }
              }
            }
            L2: {
              if (var2 != 131) {
                break L2;
              } else {
                if (var3 != 0) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            if (var2 != 130) {
              if (var2 != 133) {
                if (132 == var2) {
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        kc var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          L1: {
            var13 = HostileSpawn.field_I ? 1 : 0;
            if (!(param1 instanceof kc)) {
              break L1;
            } else {
              var14 = (kc) (Object) param1;
              var2 = var14.field_a + " | ";
              param1 = var14.field_g;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          break L0;
        }
        L2: {
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var15);
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var11 = var5;
          var2 = var11;
          var11 = var5;
          var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
          if (param0 == -77) {
            break L2;
          } else {
            boolean discarded$1 = od.a(68, -28);
            break L2;
          }
        }
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L3: while (true) {
          L4: {
            L5: {
              var8 = var6.readLine();
              var11 = var8;
              var2 = var11;
              var11 = var8;
              if (var8 == null) {
                break L5;
              } else {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var13 != 0) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      if (var9 != -1) {
                        break L7;
                      } else {
                        var11 = var8;
                        if (var13 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = var8.substring(0, var9);
                    var2 = var11;
                    var2 = var11;
                    break L6;
                  }
                  L8: {
                    var16 = var11.trim();
                    var2 = var16;
                    var2 = var16;
                    var17 = var16.substring(1 + var16.lastIndexOf(' '));
                    var2 = var17;
                    var2 = var17;
                    var18 = var17.substring(var17.lastIndexOf('\t') + 1);
                    var2 = var18;
                    var2 = var18;
                    var19 = var2 + var18;
                    var2 = var19;
                    var2 = var19;
                    if (-1 == var9) {
                      break L8;
                    } else {
                      if (var10 != -1) {
                        var12 = var8.indexOf(".java:", var9);
                        if (var12 < 0) {
                          break L8;
                        } else {
                          var2 = var19 + var8.substring(var12 - -5, var10);
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  var2 = var2 + 32;
                  if (var13 == 0) {
                    continue L3;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var2 = var2 + "| " + var7;
            break L4;
          }
          return var2;
        }
    }

    public static void e(byte param0) {
        field_F = null;
        if (param0 > -43) {
          return;
        } else {
          field_C = null;
          field_E = null;
          field_B = null;
          field_D = null;
          field_H = null;
          field_I = null;
          field_G = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        rj var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = rh.field_D;
              if (var7 == null) {
                break L1;
              } else {
                if (((od) this).b(param3, param0, 255, param1, param2)) {
                  L2: {
                    if (((od) this).field_p instanceof k) {
                      break L2;
                    } else {
                      if (var7.field_p instanceof k) {
                        ((k) (Object) var7.field_p).a(var7, false, (od) this);
                        rh.field_D = null;
                        if (!HostileSpawn.field_I) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((k) (Object) ((od) this).field_p).a(var7, false, (od) this);
                  rh.field_D = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7_ref;
            stackOut_9_1 = new StringBuilder().append("od.GA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "<col=ffffff>Health<nbsp>packs</col><br>One of the wonders of the century, the Omega Medicine Inc. health pack combines nanites with stem cells to repair almost every injury in a matter of seconds.";
        field_E = "Use the rocket launcher to destroy the turrets blocking the lift.";
        field_C = "<col=ffffff>Grenade<nbsp>launcher</col><br>The grenade launcher takes explosive ammo, and sets it to detonate after a time delay instead of on impact. It is very useful for clearing small rooms with the minimum of personal risk, but less useful in open spaces.";
        field_H = "Connection timed out. Please try using a different server.";
    }
}
