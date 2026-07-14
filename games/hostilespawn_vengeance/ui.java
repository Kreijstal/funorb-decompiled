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
        int var9 = 0;
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
        Object var29 = null;
        int stackIn_3_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        jb[] stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_50_0 = 0;
        jb[] stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        int stackIn_51_0 = 0;
        jb[] stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_48_0 = 0;
        jb[] stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_50_0 = 0;
        jb[] stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int stackOut_49_0 = 0;
        jb[] stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        L0: {
          var28 = HostileSpawn.field_I ? 1 : 0;
          var9 = 0;
          if (25 != param4) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = stackIn_3_0;
          var11 = param2.field_l.field_f + (double)param2.field_j.field_e;
          if (!param6) {
            break L1;
          } else {
            var29 = null;
            ui.a(-37, (java.awt.Canvas) null, (byte) -30, 35);
            break L1;
          }
        }
        L2: {
          var13 = (double)param2.field_j.field_g + param2.field_l.field_a;
          if (-6 >= (param2.field_e ^ -1)) {
            break L2;
          } else {
            if (var9 >= 4) {
              break L2;
            } else {
              L3: {
                if (4 > param2.field_e) {
                  param2.field_e = param2.field_e + 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var9++;
                if (2 != param1[param2.field_j.b(-4)]) {
                  break L4;
                } else {
                  param2.field_i = 11;
                  param2.field_e = 5;
                  var9 = 4;
                  if (uj.field_l != 1) {
                    break L2;
                  } else {
                    L5: {
                      var15 = (int)((-var11 + param5) * 24.0);
                      var16 = (int)((-var13 + param0) * 24.0);
                      var17 = -(int)Math.sqrt((double)(var15 * var15 - -(var16 * var16))) + 256;
                      if (128 < var17) {
                        var17 = 128;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var17 > 0) {
                        eh.field_c.a(sf.field_V[38], 100, uh.field_i * var17 >> -3218296);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              param2.field_l.a(5, (byte) 94, param2.field_c);
              ln.field_a.field_u[param2.field_j.b(-4)] = 48;
              param2.a(8573);
              var11 = (double)param2.field_j.field_e + param2.field_l.field_f;
              var13 = (double)param2.field_j.field_g + param2.field_l.field_a;
              param1[param3] = 0;
              var15 = 0;
              var16 = 1;
              L7: while (true) {
                L8: {
                  if (var16 >= rc.field_e) {
                    break L8;
                  } else {
                    L9: {
                      var17 = 0;
                      var18 = 0;
                      var19 = re.field_n[var16];
                      var20 = var19.field_i;
                      if ((var19.field_I ^ -1) >= -1) {
                        break L9;
                      } else {
                        L10: {
                          if (var20 < 12) {
                            break L10;
                          } else {
                            if (var20 >= 18) {
                              break L10;
                            } else {
                              if (0 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
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
                            if (var26 == 8) {
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
                        if (var17 < -var25) {
                          break L9;
                        } else {
                          if (var17 > var25) {
                            break L9;
                          } else {
                            if (-var25 > var18) {
                              break L9;
                            } else {
                              if (var18 >= var25) {
                                break L9;
                              } else {
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
                                    stackOut_38_0 = 0;
                                    stackIn_39_0 = stackOut_38_0;
                                    break L14;
                                  } else {
                                    stackOut_37_0 = 1;
                                    stackIn_39_0 = stackOut_37_0;
                                    break L14;
                                  }
                                }
                                L15: {
                                  var26 = stackIn_39_0;
                                  if (var19.a(11, -96)) {
                                    L16: {
                                      L17: {
                                        if (var10 == 0) {
                                          break L17;
                                        } else {
                                          var19.field_I = var19.field_I - 8;
                                          if (0 == 0) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      var19.field_I = var19.field_I - 2;
                                      break L16;
                                    }
                                    if (!var19.field_b) {
                                      break L15;
                                    } else {
                                      if (var19.field_I > 0) {
                                        L18: {
                                          stackOut_48_0 = 8;
                                          stackOut_48_1 = jc.field_c;
                                          stackOut_48_2 = 1;
                                          stackIn_50_0 = stackOut_48_0;
                                          stackIn_50_1 = stackOut_48_1;
                                          stackIn_50_2 = stackOut_48_2;
                                          stackIn_49_0 = stackOut_48_0;
                                          stackIn_49_1 = stackOut_48_1;
                                          stackIn_49_2 = stackOut_48_2;
                                          if (param6) {
                                            stackOut_50_0 = stackIn_50_0;
                                            stackOut_50_1 = (jb[]) (Object) stackIn_50_1;
                                            stackOut_50_2 = stackIn_50_2;
                                            stackOut_50_3 = 0;
                                            stackIn_51_0 = stackOut_50_0;
                                            stackIn_51_1 = stackOut_50_1;
                                            stackIn_51_2 = stackOut_50_2;
                                            stackIn_51_3 = stackOut_50_3;
                                            break L18;
                                          } else {
                                            stackOut_49_0 = stackIn_49_0;
                                            stackOut_49_1 = (jb[]) (Object) stackIn_49_1;
                                            stackOut_49_2 = stackIn_49_2;
                                            stackOut_49_3 = 1;
                                            stackIn_51_0 = stackOut_49_0;
                                            stackIn_51_1 = stackOut_49_1;
                                            stackIn_51_2 = stackOut_49_2;
                                            stackIn_51_3 = stackOut_49_3;
                                            break L18;
                                          }
                                        }
                                        tk.a(stackIn_51_0, stackIn_51_1, stackIn_51_2, stackIn_51_3 != 0);
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                L19: {
                                  if (-1 >= (var19.field_I ^ -1)) {
                                    break L19;
                                  } else {
                                    var19.field_I = 0;
                                    break L19;
                                  }
                                }
                                L20: {
                                  L21: {
                                    var19.field_F = 255;
                                    if (!od.a(var20, 1)) {
                                      break L21;
                                    } else {
                                      if (var19.field_h != 0) {
                                        break L21;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  param2.field_i = 11;
                                  param2.field_e = 1;
                                  break L20;
                                }
                                L22: {
                                  if ((var19.field_I ^ -1) < -1) {
                                    break L22;
                                  } else {
                                    if (var26 == 0) {
                                      break L22;
                                    } else {
                                      if (!var19.field_b) {
                                        break L22;
                                      } else {
                                        if ((var19.field_i ^ -1) != -28) {
                                          al.field_U[4] = al.field_U[4] + 1;
                                          if (30 != al.field_U[4] + 1) {
                                            break L22;
                                          } else {
                                            ti.a(246, (byte) -30, 9);
                                            break L22;
                                          }
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                }
                                nh.a(var19, -29966);
                                if (1 != uj.field_l) {
                                  break L9;
                                } else {
                                  L23: {
                                    var17 = (int)(24.0 * (-var11 + param5));
                                    var18 = (int)(24.0 * (-var13 + param0));
                                    var27 = -(int)Math.sqrt((double)(var17 * var17 - -(var18 * var18))) + 256;
                                    if (var27 <= 128) {
                                      break L23;
                                    } else {
                                      var27 = 128;
                                      break L23;
                                    }
                                  }
                                  if (var27 > 0) {
                                    eh.field_c.a(sf.field_V[38], 100, uh.field_i * var27 >> 143595689);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var16++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L24: {
                  if (var15 != 0) {
                    param2.field_i = 34;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                param1[param3] = 3;
                break L2;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0 != -1667734544) {
            Object var2 = null;
            ui.a(-40, (java.awt.Canvas) null, (byte) -69, -92);
        }
        field_c = null;
        field_h = null;
    }

    final void a(int param0, dk param1) {
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
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 321473616;
        int var4 = param2 & 65535;
        int var5 = param1 >> -1667734544;
        int var6 = param1 & param0;
        return var3 * param1 - (-(var5 * var4) + -(var4 * var6 >> -104655312));
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        float var5_float = 0.0f;
        int var6 = 0;
        float var6_float = 0.0f;
        float var7_float = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          if (param4 == -69) {
            break L0;
          } else {
            ui.a(-0.019849789144301654, (int[]) null, (p) null, 108, -25, 1.6753937786913926, true);
            break L0;
          }
        }
        L1: {
          pl.field_k = true;
          if (param1 != param3) {
            if (param2 == param0) {
              var5 = param2 * ln.field_a.field_d;
              if (param3 > param1) {
                var6 = param1;
                L2: while (true) {
                  if (param3 < var6) {
                    break L1;
                  } else {
                    if (!kc.a(var6 + var5, (byte) -124)) {
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
                    if (!kc.a(var5 - -var6, (byte) 77)) {
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
                var5 = param2 * ln.field_a.field_d;
                var6_float = (float)(-param1 + param3) / (float)(-param2 + param0);
                var7_float = (float)param1;
                if (param2 < param0) {
                  var8 = param2;
                  L6: while (true) {
                    if (param0 < var8) {
                      break L1;
                    } else {
                      if (kc.a(var5 + (int)var7_float, (byte) -12)) {
                        break L1;
                      } else {
                        var7_float = var7_float + var6_float;
                        var5 = var5 + ln.field_a.field_d;
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
                      if (kc.a((int)var7_float + var5, (byte) -123)) {
                        break L1;
                      } else {
                        var7_float = var7_float - var6_float;
                        var5 = var5 - ln.field_a.field_d;
                        var8--;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var5 = param1 + param2 * ln.field_a.field_d;
            if (param2 >= param0) {
              var6 = param2;
              L8: while (true) {
                if (var6 < param0) {
                  break L1;
                } else {
                  if (!kc.a(var5, (byte) -120)) {
                    var5 = var5 - ln.field_a.field_d;
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
                  if (!kc.a(var5, (byte) 120)) {
                    var5 = var5 + ln.field_a.field_d;
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

    final static void a(int param0, java.awt.Canvas param1, byte param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param1.getGraphics();
            int var5 = -75 / ((param2 - 46) / 41);
            o.field_n.a(param3, (byte) -126, param0, var4);
            var4.dispose();
        } catch (Exception exception) {
            param1.repaint();
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
