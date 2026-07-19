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
                this.j(68);
            }
            this.field_Y = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "qb.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
                field_ab = (int[]) null;
                break L1;
              }
            }
            var2 = new ud(param1, param1);
            uc.field_j.a(var2, -7044);
            ti.field_f.a(param1);
            stackOut_2_0 = (ud) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("qb.PA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void j(int param0) {
        super.j(-115);
        if (!(null == this.field_Y)) {
            this.field_Y.a((byte) -127);
        }
        int var2 = 82 % ((param0 - -67) / 44);
    }

    final String c(byte param0) {
        oe discarded$2 = null;
        if (this.field_v) {
          if (null == this.field_z) {
            return null;
          } else {
            L0: {
              if (param0 > 14) {
                break L0;
              } else {
                discarded$2 = this.a(-32);
                break L0;
              }
            }
            ja.a(ad.field_m, gb.field_j + this.field_t - this.field_Z, (byte) -41);
            return this.field_z;
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
            this.field_Z = -this.field_m + gb.field_j - param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "qb.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final oe a(int param0) {
        if (param0 <= 22) {
            return (oe) null;
        }
        return this.field_Y;
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
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
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
                        if ((param4 ^ -1) > -1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
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
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var14 = param1 + -param0;
                      if (param0 != param8) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            if (param1 != param0) {
                              break L7;
                            } else {
                              var11 = 0;
                              var10 = param2 << 683691216;
                              var9_int = param5 << 52491888;
                              var12 = 0;
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var15 = -param8 + param1;
                            if (param2 > param5) {
                              break L8;
                            } else {
                              var9_int = param2 << 1572534864;
                              var11 = (-param2 + param4 << -1121663312) / var15;
                              var12 = (-param5 + param4 << 443778768) / var14;
                              var10 = param5 << 1321325072;
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var9_int = param5 << 2093622896;
                          var12 = (-param2 + param4 << 1329580880) / var15;
                          var10 = param2 << 1976027664;
                          var11 = (-param5 + param4 << 1404301008) / var14;
                          break L6;
                        }
                        L9: {
                          if (-1 < (param0 ^ -1)) {
                            param0 = Math.min(-param0, param8 - param0);
                            var9_int = var9_int + var11 * param0;
                            var10 = var10 + var12 * param0;
                            param0 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var13 = 0;
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L10: {
                      L11: {
                        var10 = param5 << -642121360;
                        var9_int = param5 << -642121360;
                        var15 = -param0 + param8;
                        var12 = (param4 - param5 << 2052610192) / var14;
                        var11 = (-param5 + param2 << 1898951536) / var15;
                        if (var12 > var11) {
                          break L11;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          if (var19 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var13 = 0;
                      break L10;
                    }
                    L12: {
                      L13: {
                        L14: {
                          if (0 > param0) {
                            L15: {
                              if ((param8 ^ -1) > -1) {
                                break L15;
                              } else {
                                param0 = -param0;
                                var9_int = var9_int + param0 * var11;
                                var10 = var10 + var12 * param0;
                                param0 = 0;
                                if (var19 == 0) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            param0 = -param0 + param8;
                            var10 = var10 + param0 * var12;
                            var9_int = var9_int + param0 * var11;
                            param0 = param8;
                            if (var19 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                        var16 = hk.field_d[param0];
                        L16: while (true) {
                          if (param8 <= param0) {
                            break L13;
                          } else {
                            var17 = var9_int >> -1002808816;
                            stackOut_34_0 = var17;
                            stackOut_34_1 = hk.field_i;
                            stackIn_52_0 = stackOut_34_0;
                            stackIn_52_1 = stackOut_34_1;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            if (var19 != 0) {
                              break L12;
                            } else {
                              L17: {
                                if (stackIn_35_0 >= stackIn_35_1) {
                                  break L17;
                                } else {
                                  L18: {
                                    var18 = -(var9_int >> -1703864080) + (var10 >> -429786000);
                                    if (0 == var18) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (var18 + var17 < hk.field_i) {
                                          break L19;
                                        } else {
                                          var18 = hk.field_i + (-var17 + -1);
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if (var17 >= 0) {
                                          break L20;
                                        } else {
                                          wd.a(0, var16, var17 + var18, param3, param7);
                                          if (var19 == 0) {
                                            break L17;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      wd.a(0, var17 + var16, var18, param3, param7);
                                      if (var19 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  if (-1 < (var17 ^ -1)) {
                                    break L17;
                                  } else {
                                    if (var17 >= hk.field_i) {
                                      break L17;
                                    } else {
                                      wd.a(0, var16 + var17, var18, param3, param7);
                                      break L17;
                                    }
                                  }
                                }
                              }
                              param0++;
                              if (param0 >= hk.field_a) {
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var9_int = var9_int + var11;
                                var16 = var16 + mi.field_a;
                                var10 = var10 + var12;
                                continue L16;
                              }
                            }
                          }
                        }
                      }
                      stackOut_51_0 = param1;
                      stackOut_51_1 = -param8;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      break L12;
                    }
                    L21: {
                      var16 = stackIn_52_0 + stackIn_52_1;
                      if (var16 == 0) {
                        break L21;
                      } else {
                        L22: {
                          L23: {
                            if (var13 != 0) {
                              break L23;
                            } else {
                              var9_int = param2 << 2045014000;
                              if (var19 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var10 = param2 << 530486256;
                          break L22;
                        }
                        var17 = param4 << 576940944;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    break L4;
                  }
                  if (param6 >= 31) {
                    L24: {
                      if ((param0 ^ -1) <= -1) {
                        break L24;
                      } else {
                        param0 = -param0;
                        var9_int = var9_int + var11 * param0;
                        var10 = var10 + var12 * param0;
                        param0 = 0;
                        break L24;
                      }
                    }
                    var15 = hk.field_d[param0];
                    L25: while (true) {
                      L26: {
                        if (param1 <= param0) {
                          break L26;
                        } else {
                          var16 = var9_int >> -967566704;
                          if (var19 != 0) {
                            break L26;
                          } else {
                            L27: {
                              if (var16 < hk.field_i) {
                                L28: {
                                  var17 = (var10 >> 1105812848) - (var9_int >> -2004820752);
                                  if (-1 != (var17 ^ -1)) {
                                    break L28;
                                  } else {
                                    if (0 > var16) {
                                      break L27;
                                    } else {
                                      if (hk.field_i > var16) {
                                        wd.a(0, var16 - -var15, var17, param3, param7);
                                        if (var19 == 0) {
                                          break L27;
                                        } else {
                                          break L28;
                                        }
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                                L29: {
                                  if (var17 + var16 >= hk.field_i) {
                                    var17 = -1 + hk.field_i - var16;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                L30: {
                                  if (0 <= var16) {
                                    break L30;
                                  } else {
                                    wd.a(0, var15, var17 - -var16, param3, param7);
                                    if (var19 == 0) {
                                      break L27;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                wd.a(0, var16 + var15, var17, param3, param7);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            param0++;
                            if (param0 < hk.field_a) {
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              var15 = var15 + mi.field_a;
                              continue L25;
                            } else {
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var9 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) (var9);
            stackOut_83_1 = new StringBuilder().append("qb.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param7 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L31;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L31;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void f(byte param0) {
        field_cb = null;
        int var1 = 113 / ((-12 - param0) / 49);
        field_L = null;
        field_X = null;
        field_ab = null;
        field_bb = null;
        field_W = null;
    }

    static {
        field_ab = new int[8192];
        field_L = new wb(2);
        field_X = "COMBO<br>BONUS";
        field_bb = "Loading fonts";
        field_W = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
