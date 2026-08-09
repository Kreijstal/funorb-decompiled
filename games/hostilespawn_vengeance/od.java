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
            this.field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "od.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static bd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int statePc = 0;
        int var9 = 0;
        bd[] var10 = null;
        bd[] var11_ref_bd__ = null;
        int var11 = 0;
        int var12 = 0;
        bd var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = HostileSpawn.field_I ? 1 : 0;
                    var9 = param2 + (param4 - -param7);
                    var10 = new bd[]{new bd(var9, var9), new bd(param0, var9), new bd(var9, var9), new bd(var9, param0), new bd(64, 64), new bd(var9, param0), new bd(var9, var9), new bd(param0, var9), new bd(var9, var9)};
                    var11_ref_bd__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var12 >= var11_ref_bd__.length) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_bd__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var14 >= var13.field_D.length) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_D[var14] = param8;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var11 >= param4) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var9 <= var12) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_D[(-var11 + var9 + -1) * var9 + var12] = param5;
                    var10[8].field_D[var12 + var9 * (-var11 + (var9 - 1))] = param5;
                    var10[2].field_D[-var11 + var9 - (1 - var9 * var12)] = param5;
                    var10[8].field_D[var9 * var12 + (-var11 + (-1 + var9))] = param5;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = param4;
                    stackIn_24_1 = var11;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 <= stackIn_24_1) {
                        statePc = 33;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_34_0 = 0;
                    stackIn_26_0 = stackIn_34_0;
                    if (var15 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var12) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_D[var12 + var9 * var11] = param6;
                    var10[0].field_D[var11 + var12 * var9] = param6;
                    stackIn_24_0 = var12;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = -var11 + var9;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 >= stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[2].field_D[var12 + var9 * var11] = param6;
                    var10[6].field_D[var11 + var12 * var9] = param6;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var11 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var11 >= param0) {
                        statePc = 44;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_45_0 = 0;
                    stackIn_37_0 = stackIn_45_0;
                    if (var15 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var12 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param4 <= var12) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var10[7].field_D[param0 * (var9 - (var12 + 1)) + var11] = param5;
                    var10[5].field_D[var9 * var11 - (-var9 + 1) - var12] = param5;
                    var10[1].field_D[var11 + var12 * param0] = param6;
                    var10[3].field_D[var12 + var9 * var11] = param6;
                    var12++;
                    if (var15 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var15 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var11++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = param1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 < 17) {
                        statePc = 56;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var11 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var11 >= param0 >> 1644375105) {
                        statePc = 55;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var12 >= param2) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10[1].field_D[var11 + param0 * (-1 + var9 - var12)] = param3;
                    var10[3].field_D[var11 * var9 + -1 + (var9 - var12)] = param3;
                    var10[7].field_D[var12 * param0 - -var11] = param3;
                    var10[5].field_D[var12 + var9 * var11] = param3;
                    var12++;
                    if (var15 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var15 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var15 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return var10;
                }
                case 56: {
                    return (bd[]) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var2 = param0;
        if (var2 != 10) {
          if (var2 != 11) {
            L0: {
              if (-130 != (var2 ^ -1)) {
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
            if ((var2 ^ -1) != -131) {
              if (var2 != 133) {
                if (132 != var2) {
                  if (param1 != 1) {
                    return true;
                  } else {
                    return false;
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
        } else {
          return true;
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        kc var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        L0: {
          L1: {
            var13 = HostileSpawn.field_I ? 1 : 0;
            if (!(param1 instanceof kc)) {
              break L1;
            } else {
              var14 = (kc) ((Object) param1);
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
          var4 = new PrintWriter((Writer) ((Object) var15));
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var11 = var5;
          var2 = var11;
          var11 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          if (param0 == -77) {
            break L2;
          } else {
            od.a(68, -28);
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
                      if ((var9 ^ -1) != 0) {
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
                    var2 = var19;
                    if (-1 == var9) {
                      break L8;
                    } else {
                      if (0 != (var10 ^ -1)) {
                        var12 = var8.indexOf(".java:", var9);
                        if (-1 < (var12 ^ -1)) {
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
                  var2 = var2 + ' ';
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3, param4, param5);
                var7 = rh.field_D;
                if (var7 == null) {
                  break L2;
                } else {
                  if (this.b(param3, param0, 255, param1, param2)) {
                    L3: {
                      if (this.field_p instanceof k) {
                        break L3;
                      } else {
                        if (var7.field_p instanceof k) {
                          ((k) ((Object) var7.field_p)).a(var7, false, (od) (this));
                          rh.field_D = null;
                          if (!HostileSpawn.field_I) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    ((k) ((Object) this.field_p)).a(var7, false, (od) (this));
                    rh.field_D = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7_ref);

            stackIn_11_1 = new StringBuilder().append("od.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ')');
        }
    }

    static {
        field_B = "<col=ffffff>Health<nbsp>packs</col><br>One of the wonders of the century, the Omega Medicine Inc. health pack combines nanites with stem cells to repair almost every injury in a matter of seconds.";
        field_E = "Use the rocket launcher to destroy the turrets blocking the lift.";
        field_C = "<col=ffffff>Grenade<nbsp>launcher</col><br>The grenade launcher takes explosive ammo, and sets it to detonate after a time delay instead of on impact. It is very useful for clearing small rooms with the minimum of personal risk, but less useful in open spaces.";
        field_H = "Connection timed out. Please try using a different server.";
    }
}
