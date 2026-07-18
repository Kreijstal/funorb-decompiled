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
            throw wg.a((Throwable) (Object) runtimeException, "od.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
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
        var15 = HostileSpawn.field_I ? 1 : 0;
        var9 = 3;
        var10 = new bd[]{new bd(var9, var9), new bd(3, var9), new bd(var9, var9), new bd(var9, 3), new bd(64, 64), new bd(var9, 3), new bd(var9, var9), new bd(3, var9), new bd(var9, var9)};
        var11_ref_bd__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_bd__.length) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (1 <= var11) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_D[var11 + 3 * (-1 + var9 - var12)] = param3;
                                var10[3].field_D[var11 * var9 + -1 + (var9 - var12)] = param3;
                                var10[7].field_D[var12 * 3 - -var11] = param3;
                                var10[5].field_D[var12 + var9 * var11] = param3;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 >= 1) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_D[3 * (var9 - (var12 + 1)) + var11] = 0;
                            var10[5].field_D[var9 * var11 - (-var9 + 1) - var12] = 0;
                            var10[1].field_D[var11 + var12 * 3] = param6;
                            var10[3].field_D[var12 + var9 * var11] = param6;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (~var9 >= ~var12) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_D[var12 + var9 * var11] = param6;
                          var10[0].field_D[var11 + var12 * var9] = param6;
                          if (var12 >= -var11 + var9) {
                            break L8;
                          } else {
                            var10[2].field_D[var12 + var9 * var11] = param6;
                            var10[6].field_D[var11 + var12 * var9] = param6;
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_D[(-var11 + var9 + -1) * var9 + var12] = 0;
                    var10[8].field_D[var12 + var9 * (-var11 + (var9 - 1))] = 0;
                    var10[2].field_D[-var11 + var9 - (1 - var9 * var12)] = 0;
                    var10[8].field_D[var9 * var12 + (-var11 + (-1 + var9))] = 0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_bd__[var12];
            var14 = 0;
            L10: while (true) {
              if (~var14 <= ~var13.field_D.length) {
                var12++;
                continue L0;
              } else {
                var13.field_D[var14] = param8;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static void k() {
        if (!(md.field_k)) {
            throw new IllegalStateException();
        }
        ka.field_r = true;
        int discarded$0 = -23960;
        w.b(false);
        fa.field_c = 0;
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          var2 = param0;
          if (var2 == 10) {
            break L0;
          } else {
            if (var2 == 11) {
              break L0;
            } else {
              if (var2 != 129) {
                if (var2 != 128) {
                  if (var2 != 131) {
                    if (var2 == 130) {
                      break L0;
                    } else {
                      if (var2 == 133) {
                        break L0;
                      } else {
                        if (132 != var2) {
                          return false;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              } else {
                return true;
              }
            }
          }
        }
        return true;
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
          var13 = HostileSpawn.field_I ? 1 : 0;
          if (!(param1 instanceof kc)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (kc) (Object) param1;
            var2 = var14.field_a + " | ";
            param1 = var14.field_g;
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 != -1) {
                var11 = var8.substring(0, var9);
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8;
                break L2;
              }
            }
            L3: {
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
                break L3;
              } else {
                if (var10 != -1) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + ' ';
                  continue L1;
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          }
        }
    }

    public static void e() {
        field_F = null;
        field_C = null;
        field_E = null;
        field_B = null;
        field_D = null;
        field_H = null;
        field_I = null;
        field_G = null;
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
                  if (((od) this).field_p instanceof k) {
                    ((k) (Object) ((od) this).field_p).a(var7, false, (od) this);
                    rh.field_D = null;
                    break L1;
                  } else {
                    if (var7.field_p instanceof k) {
                      ((k) (Object) var7.field_p).a(var7, false, (od) this);
                      rh.field_D = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7_ref;
            stackOut_9_1 = new StringBuilder().append("od.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param5 + ')');
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
