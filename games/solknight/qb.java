/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends vg implements wj {
    private oe field_Y;
    static int[] field_ab;
    static da field_cb;
    private int field_Z;
    static wb field_L;
    static String field_X;
    static String[] field_W;
    static String field_bb;

    final void a(oe param0, boolean param1) {
        try {
            if (param1) {
                ((qb) this).j(68);
            }
            ((qb) this).field_Y = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "qb.QA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static ud a(boolean param0, qi param1) {
        ud var2 = null;
        RuntimeException var2_ref = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_2_0 = null;
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
            L1: {
              if (param0) {
                break L1;
              } else {
                field_ab = null;
                break L1;
              }
            }
            var2 = new ud(param1, (gg) (Object) param1);
            uc.field_j.a((gg) (Object) var2, -7044);
            ti.field_f.a((ej) (Object) param1);
            stackOut_2_0 = (ud) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("qb.PA(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final void j(int param0) {
        super.j(-115);
        if (!(null == ((qb) this).field_Y)) {
            ((qb) this).field_Y.a((byte) -127);
        }
        int var2 = 82 % ((param0 - -67) / 44);
    }

    final String c(byte param0) {
        if (((qb) this).field_v) {
          if (null == ((qb) this).field_z) {
            return null;
          } else {
            L0: {
              if (param0 > 14) {
                break L0;
              } else {
                oe discarded$2 = ((qb) this).a(-32);
                break L0;
              }
            }
            ja.a(ad.field_m, gb.field_j + ((qb) this).field_t - ((qb) this).field_Z, (byte) -41);
            return ((qb) this).field_z;
          }
        } else {
          return null;
        }
    }

    qb(String param0, dg param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((qb) this).field_Z = -((qb) this).field_m + gb.field_j - param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "qb.JA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public final oe a(int param0) {
        if (param0 <= 22) {
            return null;
        }
        return ((qb) this).field_Y;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
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
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param1) {
                break L1;
              } else {
                if (hk.field_a > param0) {
                  L2: {
                    if (param5 >= 0) {
                      break L2;
                    } else {
                      if (0 <= param2) {
                        break L2;
                      } else {
                        if (param4 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (hk.field_i > param5) {
                      break L3;
                    } else {
                      if (param2 < hk.field_i) {
                        break L3;
                      } else {
                        if (hk.field_i <= param4) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param1 + -param0;
                    if (param0 != param8) {
                      L5: {
                        var10 = param5 << 16;
                        var9_int = param5 << 16;
                        var15 = -param0 + param8;
                        var12 = (param4 - param5 << 16) / var14;
                        var11 = (-param5 + param2 << 16) / var15;
                        if (var12 > var11) {
                          var13 = 0;
                          break L5;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L5;
                        }
                      }
                      L6: {
                        if (0 > param0) {
                          if (param8 < 0) {
                            param0 = -param0 + param8;
                            var10 = var10 + param0 * var12;
                            var9_int = var9_int + param0 * var11;
                            param0 = param8;
                            break L6;
                          } else {
                            param0 = -param0;
                            var9_int = var9_int + param0 * var11;
                            var10 = var10 + var12 * param0;
                            param0 = 0;
                            var16 = hk.field_d[param0];
                            L7: while (true) {
                              if (param8 <= param0) {
                                break L6;
                              } else {
                                L8: {
                                  var17 = var9_int >> 16;
                                  if (var17 >= hk.field_i) {
                                    break L8;
                                  } else {
                                    var18 = -(var9_int >> 16) + (var10 >> 16);
                                    if (0 == var18) {
                                      if (var17 < 0) {
                                        break L8;
                                      } else {
                                        if (var17 >= hk.field_i) {
                                          break L8;
                                        } else {
                                          wd.a(0, var16 + var17, var18, param3, param7);
                                          break L8;
                                        }
                                      }
                                    } else {
                                      L9: {
                                        if (var18 + var17 < hk.field_i) {
                                          break L9;
                                        } else {
                                          var18 = hk.field_i + (-var17 + -1);
                                          break L9;
                                        }
                                      }
                                      if (var17 >= 0) {
                                        wd.a(0, var17 + var16, var18, param3, param7);
                                        break L8;
                                      } else {
                                        wd.a(0, var16, var17 + var18, param3, param7);
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                param0++;
                                if (param0 >= hk.field_a) {
                                  return;
                                } else {
                                  var9_int = var9_int + var11;
                                  var16 = var16 + mi.field_a;
                                  var10 = var10 + var12;
                                  continue L7;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = hk.field_d[param0];
                          L10: while (true) {
                            if (param8 <= param0) {
                              break L6;
                            } else {
                              L11: {
                                var17 = var9_int >> 16;
                                if (var17 >= hk.field_i) {
                                  break L11;
                                } else {
                                  var18 = -(var9_int >> 16) + (var10 >> 16);
                                  if (0 == var18) {
                                    if (var17 < 0) {
                                      break L11;
                                    } else {
                                      if (var17 >= hk.field_i) {
                                        break L11;
                                      } else {
                                        wd.a(0, var16 + var17, var18, param3, param7);
                                        break L11;
                                      }
                                    }
                                  } else {
                                    L12: {
                                      if (var18 + var17 < hk.field_i) {
                                        break L12;
                                      } else {
                                        var18 = hk.field_i + (-var17 + -1);
                                        break L12;
                                      }
                                    }
                                    if (var17 >= 0) {
                                      wd.a(0, var17 + var16, var18, param3, param7);
                                      break L11;
                                    } else {
                                      wd.a(0, var16, var17 + var18, param3, param7);
                                      break L11;
                                    }
                                  }
                                }
                              }
                              param0++;
                              if (param0 >= hk.field_a) {
                                return;
                              } else {
                                var9_int = var9_int + var11;
                                var16 = var16 + mi.field_a;
                                var10 = var10 + var12;
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      var16 = param1 + -param8;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L13: {
                          if (var13 != 0) {
                            var10 = param2 << 16;
                            break L13;
                          } else {
                            var9_int = param2 << 16;
                            break L13;
                          }
                        }
                        var17 = param4 << 16;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      }
                    } else {
                      L14: {
                        if (param1 != param0) {
                          var15 = -param8 + param1;
                          if (param2 > param5) {
                            var9_int = param5 << 16;
                            var12 = (-param2 + param4 << 16) / var15;
                            var10 = param2 << 16;
                            var11 = (-param5 + param4 << 16) / var14;
                            break L14;
                          } else {
                            var9_int = param2 << 16;
                            var11 = (-param2 + param4 << 16) / var15;
                            var12 = (-param5 + param4 << 16) / var14;
                            var10 = param5 << 16;
                            break L14;
                          }
                        } else {
                          var11 = 0;
                          var10 = param2 << 16;
                          var9_int = param5 << 16;
                          var12 = 0;
                          break L14;
                        }
                      }
                      L15: {
                        if (param0 < 0) {
                          param0 = Math.min(-param0, param8 - param0);
                          var9_int = var9_int + var11 * param0;
                          var10 = var10 + var12 * param0;
                          param0 = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var13 = 0;
                      break L4;
                    }
                  }
                  if (param6 >= 31) {
                    L16: {
                      if (param0 >= 0) {
                        break L16;
                      } else {
                        param0 = -param0;
                        var9_int = var9_int + var11 * param0;
                        var10 = var10 + var12 * param0;
                        param0 = 0;
                        break L16;
                      }
                    }
                    var15 = hk.field_d[param0];
                    L17: while (true) {
                      if (param1 <= param0) {
                        break L0;
                      } else {
                        L18: {
                          var16 = var9_int >> 16;
                          if (var16 < hk.field_i) {
                            var17 = (var10 >> 16) - (var9_int >> 16);
                            if (var17 != 0) {
                              L19: {
                                if (var17 + var16 >= hk.field_i) {
                                  var17 = -1 + hk.field_i - var16;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              if (0 <= var16) {
                                wd.a(0, var16 + var15, var17, param3, param7);
                                break L18;
                              } else {
                                wd.a(0, var15, var17 - -var16, param3, param7);
                                break L18;
                              }
                            } else {
                              if (0 > var16) {
                                break L18;
                              } else {
                                if (hk.field_i > var16) {
                                  wd.a(0, var16 - -var15, var17, param3, param7);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                        param0++;
                        if (param0 < hk.field_a) {
                          var10 = var10 + var12;
                          var9_int = var9_int + var11;
                          var15 = var15 + mi.field_a;
                          continue L17;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    return;
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
          L20: {
            var9 = decompiledCaughtException;
            stackOut_92_0 = (RuntimeException) var9;
            stackOut_92_1 = new StringBuilder().append("qb.EB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param7 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + 44 + param8 + 41);
        }
    }

    public static void f(byte param0) {
        field_cb = null;
        int var1 = 113;
        field_L = null;
        field_X = null;
        field_ab = null;
        field_bb = null;
        field_W = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = new int[8192];
        field_L = new wb(2);
        field_X = "COMBO<br>BONUS";
        field_bb = "Loading fonts";
        field_W = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
