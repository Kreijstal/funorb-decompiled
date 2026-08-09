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

    final static void a(double param0, int[] param1, p param2, int param3, int param4, double param5, boolean param6) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        jb[] stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_55_0;
        jb[] stackIn_55_1;
        int stackIn_55_2;
        int stackIn_55_3;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_87_1 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        java.awt.Canvas var29 = null;
        int var30 = 0;
        var28 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = 0;
              if (25 != param4) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              var10 = stackIn_4_0;
              var11 = param2.field_l.field_f + (double)param2.field_j.field_e;
              if (!param6) {
                break L2;
              } else {
                var29 = (java.awt.Canvas) null;
                ui.a(-37, (java.awt.Canvas) null, (byte) -30, 35);
                break L2;
              }
            }
            var13 = (double)param2.field_j.field_g + param2.field_l.field_a;
            L3: while (true) {
              L4: {
                L5: {
                  if (-6 >= (param2.field_e ^ -1)) {
                    break L5;
                  } else {
                    if ((var9_int ^ -1) <= -5) {
                      break L5;
                    } else {
                      L6: {
                        if (4 > param2.field_e) {
                          param2.field_e = param2.field_e + 1;
                          break L6;
                        } else {
                          break L6;
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
                        var30 = 1;
                        var16 = var30;
                        L7: while (true) {
                          if (var30 >= rc.field_e) {
                            L8: {
                              if (var15 != 0) {
                                param2.field_i = 34;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            param1[param3] = 3;
                            continue L3;
                          } else {
                            var17 = 0;
                            var18 = 0;
                            var19 = re.field_n[var30];
                            var20 = var19.field_i;
                            if ((var19.field_I ^ -1) < -1) {
                              L9: {
                                L10: {
                                  if (var20 < 12) {
                                    break L10;
                                  } else {
                                    if ((var20 ^ -1) <= -19) {
                                      break L10;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L11: {
                                  L12: {
                                    var21 = var19.field_l.field_f + (double)var19.field_j.field_e;
                                    var17 = (int)(24.0 * (var21 - var11));
                                    var23 = (double)var19.field_j.field_g + var19.field_l.field_a;
                                    var18 = (int)((var23 - var13) * 24.0);
                                    var25 = 16;
                                    var26 = var20;
                                    if ((var26 ^ -1) == -9) {
                                      break L12;
                                    } else {
                                      if (var26 != 27) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var18 = (int)(24.0 * (var23 - 0.5 - var13));
                                  var17 = (int)((-var11 + (-0.5 + var21)) * 24.0);
                                  var25 = 24;
                                  break L11;
                                }
                                if (var17 >= -var25) {
                                  if (var17 <= var25) {
                                    if (-var25 <= var18) {
                                      if (var18 < var25) {
                                        L13: {
                                          if (!var19.field_b) {
                                            break L13;
                                          } else {
                                            var15 = 1;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          if (0 >= var19.field_I) {
                                            stackIn_44_0 = 0;
                                            break L14;
                                          } else {
                                            stackIn_44_0 = 1;
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          var26 = stackIn_44_0;
                                          if (var19.a(11, -96)) {
                                            L16: {
                                              if (var10 == 0) {
                                                var19.field_I = var19.field_I - 2;
                                                break L16;
                                              } else {
                                                var19.field_I = var19.field_I - 8;
                                                break L16;
                                              }
                                            }
                                            if (!var19.field_b) {
                                              break L15;
                                            } else {
                                              if (var19.field_I > 0) {
                                                L17: {
                                                  stackIn_54_0 = 8;

                                                  stackIn_54_1 = jc.field_c;

                                                  stackIn_54_2 = 1;

                                                  if (param6) {
                                                    stackIn_55_0 = stackIn_54_0;
                                                    stackIn_55_1 = (jb[]) ((Object) stackIn_54_1);
                                                    stackIn_55_2 = stackIn_54_2;
                                                    stackIn_55_3 = 0;
                                                    break L17;
                                                  } else {
                                                    stackIn_55_0 = stackIn_54_0;
                                                    stackIn_55_1 = (jb[]) ((Object) stackIn_54_1);
                                                    stackIn_55_2 = stackIn_54_2;
                                                    stackIn_55_3 = 1;
                                                    break L17;
                                                  }
                                                }
                                                tk.a(stackIn_55_0, stackIn_55_1, stackIn_55_2, stackIn_55_3 != 0);
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L18: {
                                          if (-1 >= (var19.field_I ^ -1)) {
                                            break L18;
                                          } else {
                                            var19.field_I = 0;
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          L20: {
                                            var19.field_F = 255;
                                            if (!od.a(var20, 1)) {
                                              break L20;
                                            } else {
                                              if (var19.field_h != 0) {
                                                break L20;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          param2.field_i = 11;
                                          param2.field_e = 1;
                                          break L19;
                                        }
                                        L21: {
                                          if ((var19.field_I ^ -1) < -1) {
                                            break L21;
                                          } else {
                                            if (var26 == 0) {
                                              break L21;
                                            } else {
                                              if (!var19.field_b) {
                                                break L21;
                                              } else {
                                                if ((var19.field_i ^ -1) != -28) {
                                                  dupTemp$0 = al.field_U[4] + 1;
                                                  al.field_U[4] = dupTemp$0;
                                                  if (30 != dupTemp$0) {
                                                    break L21;
                                                  } else {
                                                    ti.a(246, (byte) -30, 9);
                                                    break L21;
                                                  }
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        nh.a(var19, -29966);
                                        if (1 == uj.field_l) {
                                          L22: {
                                            var17 = (int)(24.0 * (-var11 + param5));
                                            var18 = (int)(24.0 * (-var13 + param0));
                                            var27 = -(int)Math.sqrt((double)(var17 * var17 - -(var18 * var18))) + 256;
                                            if (-129 <= (var27 ^ -1)) {
                                              break L22;
                                            } else {
                                              var27 = 128;
                                              break L22;
                                            }
                                          }
                                          if (-1 > (var27 ^ -1)) {
                                            eh.field_c.a(sf.field_V[38], 100, uh.field_i * var27 >> 143595689);
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          var30++;
                                          continue L7;
                                        }
                                      } else {
                                        var30++;
                                        continue L7;
                                      }
                                    } else {
                                      var30++;
                                      continue L7;
                                    }
                                  } else {
                                    var30++;
                                    continue L7;
                                  }
                                } else {
                                  var30++;
                                  continue L7;
                                }
                              }
                              var30++;
                              continue L7;
                            } else {
                              var30++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        param2.field_i = 11;
                        param2.field_e = 5;
                        var9_int = 4;
                        if (uj.field_l != 1) {
                          break L5;
                        } else {
                          L23: {
                            var15 = (int)((-var11 + param5) * 24.0);
                            var16 = (int)((-var13 + param0) * 24.0);
                            var17 = -(int)Math.sqrt((double)(var15 * var15 - -(var16 * var16))) + 256;
                            if (128 < var17) {
                              var17 = 128;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          if (var17 > 0) {
                            eh.field_c.a(sf.field_V[38], 100, uh.field_i * var17 >> -3218296);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var9 = decompiledCaughtException;
            stackIn_84_0 = (RuntimeException) (var9);

            stackIn_84_1 = new StringBuilder().append("ui.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "null";
              break L24;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "{...}";
              break L24;
            }
          }
          L25: {


            stackIn_87_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',');

            if (param2 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "null";
              break L25;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "{...}";
              break L25;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_85_0), stackIn_88_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0 != -1667734544) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            ui.a(-40, (java.awt.Canvas) null, (byte) -69, -92);
        }
        field_c = null;
        field_h = null;
    }

    final void a(int param0, dk param1) {
        try {
            if (param1.field_i != null) {
                param1.c(-1);
            }
            if (param0 != 24) {
                dk var4 = (dk) null;
                this.a(-75, (dk) null);
            }
            param1.field_i = this.field_a.field_i;
            param1.field_j = this.field_a;
            param1.field_i.field_j = param1;
            param1.field_j.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ui.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 321473616;
        int var4 = param2 & 65535;
        int var5 = param1 >> -1667734544;
        int var6 = param1 & param0;
        return var3 * param1 - (-(var5 * var4) + -(var4 * var6 >> -104655312));
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        int var6 = 0;
        float var6_float = 0.0f;
        int var7 = 0;
        float var7_float = 0.0f;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -69) {
                break L1;
              } else {
                ui.a(-0.019849789144301654, (int[]) null, (p) null, 108, -25, 1.6753937786913926, true);
                break L1;
              }
            }
            L2: {
              pl.field_k = true;
              if (param1 != param3) {
                if (param2 == param0) {
                  var5_int = param2 * ln.field_a.field_d;
                  if (param3 > param1) {
                    var6 = param1;
                    L3: while (true) {
                      if (param3 < var6) {
                        break L2;
                      } else {
                        if (!kc.a(var6 + var5_int, (byte) -124)) {
                          var6++;
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    var6 = param1;
                    L4: while (true) {
                      if (param3 > var6) {
                        break L2;
                      } else {
                        if (!kc.a(var5_int - -var6, (byte) 77)) {
                          var6--;
                          continue L4;
                        } else {
                          break L2;
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
                      L5: while (true) {
                        L6: {
                          if (var7 > param3) {
                            break L6;
                          } else {
                            if (kc.a(var7 + (int)var6_float * ln.field_a.field_d, (byte) 82)) {
                              break L6;
                            } else {
                              var6_float = var6_float + var5_float;
                              var7++;
                              continue L5;
                            }
                          }
                        }
                        break L2;
                      }
                    } else {
                      var7 = param1;
                      L7: while (true) {
                        L8: {
                          if (param3 > var7) {
                            break L8;
                          } else {
                            if (kc.a(var7 + (int)var6_float * ln.field_a.field_d, (byte) 8)) {
                              break L8;
                            } else {
                              var6_float = var6_float - var5_float;
                              var7--;
                              continue L7;
                            }
                          }
                        }
                        break L2;
                      }
                    }
                  } else {
                    var5_int = param2 * ln.field_a.field_d;
                    var6_float = (float)(-param1 + param3) / (float)(-param2 + param0);
                    var7_float = (float)param1;
                    if (param2 < param0) {
                      var8 = param2;
                      L9: while (true) {
                        L10: {
                          if (param0 < var8) {
                            break L10;
                          } else {
                            if (kc.a(var5_int + (int)var7_float, (byte) -12)) {
                              break L10;
                            } else {
                              var7_float = var7_float + var6_float;
                              var5_int = var5_int + ln.field_a.field_d;
                              var8++;
                              continue L9;
                            }
                          }
                        }
                        break L2;
                      }
                    } else {
                      var8 = param2;
                      L11: while (true) {
                        L12: {
                          if (var8 < param0) {
                            break L12;
                          } else {
                            if (kc.a((int)var7_float + var5_int, (byte) -123)) {
                              break L12;
                            } else {
                              var7_float = var7_float - var6_float;
                              var5_int = var5_int - ln.field_a.field_d;
                              var8--;
                              continue L11;
                            }
                          }
                        }
                        break L2;
                      }
                    }
                  }
                }
              } else {
                var5_int = param1 + param2 * ln.field_a.field_d;
                if (param2 >= param0) {
                  var6 = param2;
                  L13: while (true) {
                    if (var6 < param0) {
                      break L2;
                    } else {
                      if (!kc.a(var5_int, (byte) -120)) {
                        var5_int = var5_int - ln.field_a.field_d;
                        var6--;
                        continue L13;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  var6 = param2;
                  L14: while (true) {
                    if (param0 < var6) {
                      break L2;
                    } else {
                      if (!kc.a(var5_int, (byte) 120)) {
                        var5_int = var5_int + ln.field_a.field_d;
                        var6++;
                        continue L14;
                      } else {
                        break L2;
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
          throw wg.a((Throwable) ((Object) var5), "ui.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new kj((ui) (this)));
    }

    final dk a(boolean param0) {
        dk var2 = this.field_a.field_j;
        if (var2 == this.field_a) {
            return null;
        }
        if (!param0) {
            field_f = (String) null;
        }
        var2.c(-1);
        return var2;
    }

    final static void a(int param0, java.awt.Canvas param1, byte param2, int param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param1.getGraphics();
                var5 = -75 / ((param2 - 46) / 41);
                o.field_n.a(param3, (byte) -126, param0, var4);
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
            stackIn_6_0 = (RuntimeException) (var4_ref2);

            stackIn_6_1 = new StringBuilder().append("ui.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private ui() throws Throwable {
        throw new Error();
    }

    static {
        field_e = 50;
        field_f = "Someone's usefully left some rockets here.";
        field_h = "Return to game";
        field_d = "Previous";
        field_g = "Names cannot start or end with space or underscore";
    }
}
