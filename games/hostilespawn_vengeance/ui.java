/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ui implements Iterable {
    static String field_f;
    static String field_h;
    static int field_e;
    dk field_a;
    static String field_d;
    static bd field_c;
    static bd field_b;
    static String field_g;

    final static void a(double param0, int[] param1, p param2, int param3, int param4, double param5) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        oj var19 = null;
        int var20 = 0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int stackIn_4_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var28 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = 0;
              if (25 != param4) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var10 = stackIn_4_0;
            var11 = param2.field_l.field_f + (double)param2.field_j.field_e;
            var13 = (double)param2.field_j.field_g + param2.field_l.field_a;
            L2: while (true) {
              L3: {
                L4: {
                  if (param2.field_e >= 5) {
                    break L4;
                  } else {
                    if (var9_int >= 4) {
                      break L4;
                    } else {
                      L5: {
                        if (4 > param2.field_e) {
                          param2.field_e = param2.field_e + 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var9_int++;
                      if (2 != param1[param2.field_j.b(-4)]) {
                        param2.field_l.a(5, (byte) 94, param2.field_c);
                        ln.field_a.field_u[param2.field_j.b(-4)] = 48;
                        param2.a(8573);
                        var11 = (double)param2.field_j.field_e + param2.field_l.field_f;
                        var13 = (double)param2.field_j.field_g + param2.field_l.field_a;
                        param1[param3] = 0;
                        var15 = 0;
                        var29 = 1;
                        var16 = var29;
                        L6: while (true) {
                          if (var29 >= rc.field_e) {
                            L7: {
                              if (var15 != 0) {
                                param2.field_i = 34;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            param1[param3] = 3;
                            continue L2;
                          } else {
                            L8: {
                              var17 = 0;
                              var18 = 0;
                              var19 = re.field_n[var29];
                              var20 = var19.field_i;
                              if (var19.field_I <= 0) {
                                break L8;
                              } else {
                                L9: {
                                  if (var20 < 12) {
                                    break L9;
                                  } else {
                                    if (var20 >= 18) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L10: {
                                  L11: {
                                    var21 = var19.field_l.field_f + (double)var19.field_j.field_e;
                                    var17 = (int)(24.0 * (var21 - var11));
                                    var23 = (double)var19.field_j.field_g + var19.field_l.field_a;
                                    var18 = (int)((var23 - var13) * 24.0);
                                    var25 = 16;
                                    var26 = var20;
                                    if (var26 == 8) {
                                      break L11;
                                    } else {
                                      if (var26 != 27) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var18 = (int)(24.0 * (var23 - 0.5 - var13));
                                  var17 = (int)((-var11 + (-0.5 + var21)) * 24.0);
                                  var25 = 24;
                                  break L10;
                                }
                                if (~var17 > ~-var25) {
                                  break L8;
                                } else {
                                  if (~var17 < ~var25) {
                                    break L8;
                                  } else {
                                    if (~-var25 < ~var18) {
                                      break L8;
                                    } else {
                                      if (var18 >= var25) {
                                        break L8;
                                      } else {
                                        L12: {
                                          if (!var19.field_b) {
                                            break L12;
                                          } else {
                                            var15 = 1;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (0 >= var19.field_I) {
                                            stackOut_36_0 = 0;
                                            stackIn_37_0 = stackOut_36_0;
                                            break L13;
                                          } else {
                                            stackOut_35_0 = 1;
                                            stackIn_37_0 = stackOut_35_0;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          var26 = stackIn_37_0;
                                          if (var19.a(11, -96)) {
                                            L15: {
                                              if (var10 == 0) {
                                                var19.field_I = var19.field_I - 2;
                                                break L15;
                                              } else {
                                                var19.field_I = var19.field_I - 8;
                                                break L15;
                                              }
                                            }
                                            if (!var19.field_b) {
                                              break L14;
                                            } else {
                                              if (var19.field_I > 0) {
                                                int discarded$1 = 1;
                                                tk.a(8, jc.field_c, 1);
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L16: {
                                          if (var19.field_I >= 0) {
                                            break L16;
                                          } else {
                                            var19.field_I = 0;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          L18: {
                                            var19.field_F = 255;
                                            if (!od.a(var20, 1)) {
                                              break L18;
                                            } else {
                                              if (var19.field_h != 0) {
                                                break L18;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          param2.field_i = 11;
                                          param2.field_e = 1;
                                          break L17;
                                        }
                                        L19: {
                                          if (var19.field_I > 0) {
                                            break L19;
                                          } else {
                                            if (var26 == 0) {
                                              break L19;
                                            } else {
                                              if (!var19.field_b) {
                                                break L19;
                                              } else {
                                                if (var19.field_i != 27) {
                                                  al.field_U[4] = al.field_U[4] + 1;
                                                  if (30 != al.field_U[4] + 1) {
                                                    break L19;
                                                  } else {
                                                    ti.a(246, (byte) -30, 9);
                                                    break L19;
                                                  }
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        nh.a(var19, -29966);
                                        if (1 != uj.field_l) {
                                          break L8;
                                        } else {
                                          L20: {
                                            var17 = (int)(24.0 * (-var11 + param5));
                                            var18 = (int)(24.0 * (-var13 + param0));
                                            var27 = -(int)Math.sqrt((double)(var17 * var17 - -(var18 * var18))) + 256;
                                            if (var27 <= 128) {
                                              break L20;
                                            } else {
                                              var27 = 128;
                                              break L20;
                                            }
                                          }
                                          if (var27 > 0) {
                                            eh.field_c.a(sf.field_V[38], 100, uh.field_i * var27 >> 9);
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var29++;
                            continue L6;
                          }
                        }
                      } else {
                        param2.field_i = 11;
                        param2.field_e = 5;
                        var9_int = 4;
                        if (uj.field_l != 1) {
                          break L4;
                        } else {
                          L21: {
                            var15 = (int)((-var11 + param5) * 24.0);
                            var16 = (int)((-var13 + param0) * 24.0);
                            var17 = -(int)Math.sqrt((double)(var15 * var15 - -(var16 * var16))) + 256;
                            if (128 < var17) {
                              var17 = 128;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (var17 > 0) {
                            eh.field_c.a(sf.field_V[38], 100, uh.field_i * var17 >> 8);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var9 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var9;
            stackOut_71_1 = new StringBuilder().append("ui.A(").append(param0).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L22;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L22;
            }
          }
          L23: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44);
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + 0 + 41);
        }
    }

    public static void a() {
        field_g = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_c = null;
        field_h = null;
    }

    final void a(int param0, dk param1) {
        try {
            if (param1.field_i != null) {
                param1.c(-1);
            }
            if (param0 != 24) {
                Object var4 = null;
                ((ui) this).a(-75, (dk) null);
            }
            param1.field_i = ((ui) this).field_a.field_i;
            param1.field_j = ((ui) this).field_a;
            param1.field_i.field_j = param1;
            param1.field_j.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ui.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        int var5 = param1 >> 16;
        int var6 = param1 & 65535;
        return var3 * param1 - (-(var5 * var4) + -(var4 * var6 >> 16));
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        float var5_float = 0.0f;
        int var6 = 0;
        float var6_float = 0.0f;
        float var7_float = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              pl.field_k = true;
              if (param1 != param3) {
                if (param2 == param0) {
                  var5_int = param2 * ln.field_a.field_d;
                  if (param3 > param1) {
                    var6 = param1;
                    L2: while (true) {
                      if (param3 < var6) {
                        break L1;
                      } else {
                        if (!kc.a(var6 + var5_int, (byte) -124)) {
                          var6++;
                          continue L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    var6 = param1;
                    L3: while (true) {
                      if (param3 > var6) {
                        break L1;
                      } else {
                        if (!kc.a(var5_int - -var6, (byte) 77)) {
                          var6--;
                          continue L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  if (Math.abs(param0 - param2) < Math.abs(-param1 + param3)) {
                    var5_float = (float)(-param2 + param0) / (float)(param3 + -param1);
                    var6_float = (float)param2;
                    if (param3 > param1) {
                      var7 = param1;
                      L4: while (true) {
                        if (var7 > param3) {
                          break L1;
                        } else {
                          if (kc.a(var7 + (int)var6_float * ln.field_a.field_d, (byte) 82)) {
                            break L1;
                          } else {
                            var6_float = var6_float + var5_float;
                            var7++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var7 = param1;
                      L5: while (true) {
                        if (param3 > var7) {
                          break L1;
                        } else {
                          if (kc.a(var7 + (int)var6_float * ln.field_a.field_d, (byte) 8)) {
                            break L1;
                          } else {
                            var6_float = var6_float - var5_float;
                            var7--;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var5_int = param2 * ln.field_a.field_d;
                    var6_float = (float)(-param1 + param3) / (float)(-param2 + param0);
                    var7_float = (float)param1;
                    if (param2 < param0) {
                      var8 = param2;
                      L6: while (true) {
                        if (param0 < var8) {
                          break L1;
                        } else {
                          if (kc.a(var5_int + (int)var7_float, (byte) -12)) {
                            break L1;
                          } else {
                            var7_float = var7_float + var6_float;
                            var5_int = var5_int + ln.field_a.field_d;
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      var8 = param2;
                      L7: while (true) {
                        if (var8 < param0) {
                          break L1;
                        } else {
                          if (kc.a((int)var7_float + var5_int, (byte) -123)) {
                            break L1;
                          } else {
                            var7_float = var7_float - var6_float;
                            var5_int = var5_int - ln.field_a.field_d;
                            var8--;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var5_int = param1 + param2 * ln.field_a.field_d;
                if (param2 >= param0) {
                  var6 = param2;
                  L8: while (true) {
                    if (var6 < param0) {
                      break L1;
                    } else {
                      if (!kc.a(var5_int, (byte) -120)) {
                        var5_int = var5_int - ln.field_a.field_d;
                        var6--;
                        continue L8;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  var6 = param2;
                  L9: while (true) {
                    if (param0 < var6) {
                      break L1;
                    } else {
                      if (!kc.a(var5_int, (byte) 120)) {
                        var5_int = var5_int + ln.field_a.field_d;
                        var6++;
                        continue L9;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var5, "ui.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + -69 + 41);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new kj((ui) this);
    }

    final dk a(boolean param0) {
        dk var2 = ((ui) this).field_a.field_j;
        if (var2 == ((ui) this).field_a) {
            return null;
        }
        if (!param0) {
            field_f = null;
        }
        var2.c(-1);
        return var2;
    }

    final static void a(int param0, java.awt.Canvas param1, byte param2) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param1.getGraphics();
                var5 = -75 / ((param2 - 46) / 41);
                o.field_n.a(0, (byte) -126, 0, var4);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param1.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("ui.D(").append(0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L3;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 44 + 0 + 41);
        }
    }

    private ui() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 50;
        field_f = "Someone's usefully left some rockets here.";
        field_h = "Return to game";
        field_d = "Previous";
        field_g = "Names cannot start or end with space or underscore";
    }
}
