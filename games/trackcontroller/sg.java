/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    String field_g;
    kk field_c;
    String field_f;
    String field_b;
    int field_h;
    static ba field_d;
    static String field_e;
    static kk field_a;

    final static void a(java.awt.Frame param0, byte param1, uf param2) {
        ce var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -105) {
                break L1;
              } else {
                sg.a(97, 56, -128, -60, -109, -37);
                break L1;
              }
            }
            L2: while (true) {
              var3 = param2.a(param0, -59);
              L3: while (true) {
                if (var3.field_f != 0) {
                  if (var3.field_f == 1) {
                    param0.setVisible(false);
                    param0.dispose();
                    break L0;
                  } else {
                    wl.a(100L, false);
                    continue L2;
                  }
                } else {
                  wl.a(10L, false);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("sg.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ti.field_j[oe.field_c] = param1;
        lf.field_Y[oe.field_c] = oe.field_c;
        if (param5 != -733) {
            return;
        }
        g.field_u[oe.field_c] = param4;
        if (vi.field_d < param4) {
            sd.field_b = param4;
        }
        if (!(fj.field_U <= param4)) {
            mj.field_d = param4;
        }
        ii.field_q[oe.field_c] = param0;
        qf.field_a[oe.field_c] = param2;
        qi.field_b[oe.field_c] = param3;
        int var6 = param3 + (param2 + param0);
        int var7 = var6 == 0 ? 0 : param0 * 1000 / var6;
        va.field_e[oe.field_c] = var7;
        if (var7 < mj.field_d) {
            mj.field_d = var7;
        }
        oe.field_c = oe.field_c + 1;
        if (var7 > sd.field_b) {
            sd.field_b = var7;
        }
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 68) {
                break L1;
              } else {
                field_a = (kk) null;
                break L1;
              }
            }
            var6_int = -param4 + param5;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param1.charAt(var7 + param4);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (255 < var8) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 == 8364) {
                      param2[param0 - -var7] = (byte)-128;
                      break L3;
                    } else {
                      if (var8 != 8218) {
                        if (var8 != 402) {
                          if (var8 == 8222) {
                            param2[param0 + var7] = (byte)-124;
                            break L3;
                          } else {
                            if (var8 != 8230) {
                              if (var8 == 8224) {
                                param2[var7 + param0] = (byte)-122;
                                break L3;
                              } else {
                                if (8225 == var8) {
                                  param2[var7 + param0] = (byte)-121;
                                  break L3;
                                } else {
                                  if (710 == var8) {
                                    param2[param0 + var7] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (var8 != 8240) {
                                      if (352 != var8) {
                                        if (var8 == 8249) {
                                          param2[param0 - -var7] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (338 == var8) {
                                            param2[var7 + param0] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 == 381) {
                                              param2[var7 + param0] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var8 != 8216) {
                                                if (8217 == var8) {
                                                  param2[var7 + param0] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param2[param0 - -var7] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (8226 == var8) {
                                                        param2[var7 + param0] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param2[var7 + param0] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param2[param0 - -var7] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (353 == var8) {
                                                                  param2[param0 + var7] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param2[param0 + var7] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (339 != var8) {
                                                                      if (var8 == 382) {
                                                                        param2[var7 + param0] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (376 != var8) {
                                                                          param2[var7 + param0] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          param2[param0 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      param2[param0 - -var7] = (byte)-100;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param2[param0 - -var7] = (byte)-104;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          param2[var7 + param0] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      param2[param0 - -var7] = (byte)-108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param2[param0 - -var7] = (byte)-111;
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        param2[param0 - -var7] = (byte)-118;
                                        break L3;
                                      }
                                    } else {
                                      param2[var7 + param0] = (byte)-119;
                                      break L3;
                                    }
                                  }
                                }
                              }
                            } else {
                              param2[var7 + param0] = (byte)-123;
                              break L3;
                            }
                          }
                        } else {
                          param2[param0 + var7] = (byte)-125;
                          break L3;
                        }
                      } else {
                        param2[param0 + var7] = (byte)-126;
                        break L3;
                      }
                    }
                  }
                  param2[var7 + param0] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("sg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

            if (param2 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    private sg() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -8217) {
            sg.a(-34);
        }
        field_a = null;
    }

    static {
        field_d = new ba();
        field_e = "Return to game";
    }
}
