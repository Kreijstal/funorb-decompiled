/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    String field_d;
    boolean field_c;
    String field_a;
    static String field_b;

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = OrbDefence.field_D ? 1 : 0;
            if (0 >= tc.field_b) {
              break L1;
            } else {
              if (null != ne.field_b) {
                L2: {
                  L3: {
                    mg.field_k = ne.field_b.c(126);
                    fh.a(17489, 2);
                    if (mg.field_k != null) {
                      break L3;
                    } else {
                      var2 = 3;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = 2;
                  l.a(mg.field_k, -80);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    L4: {
                      if (n.b((byte) 127)) {
                        break L4;
                      } else {
                        var2 = 1;
                        break L4;
                      }
                    }
                    var2 = 0;
                    break L2;
                  }
                }
                if (null == ne.field_b) {
                  L5: {
                    if (fh.field_c) {
                      gb.a(true, var2, param0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param1 <= -119) {
                    return;
                  } else {
                    hb.a(108);
                    return;
                  }
                } else {
                  if (param1 > -119) {
                    hb.a(108);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                mg.field_k = wd.a(480, (byte) 109, 0, 0, wc.field_c, 640);
                if (var3 == 0) {
                  L6: {
                    if (mg.field_k != null) {
                      break L6;
                    } else {
                      var2 = 3;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2 = 2;
                  l.a(mg.field_k, -80);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  L7: {
                    L8: {
                      mg.field_k = ne.field_b.c(126);
                      fh.a(17489, 2);
                      if (mg.field_k != null) {
                        break L8;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var2 = 2;
                    l.a(mg.field_k, -80);
                    if (var3 == 0) {
                      break L7;
                    } else {
                      L9: {
                        if (n.b((byte) 127)) {
                          break L9;
                        } else {
                          var2 = 1;
                          break L9;
                        }
                      }
                      var2 = 0;
                      break L7;
                    }
                  }
                  L10: {
                    if (null != ne.field_b) {
                      break L10;
                    } else {
                      if (fh.field_c) {
                        gb.a(true, var2, param0);
                        break L10;
                      } else {
                        if (param1 > -119) {
                          hb.a(108);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (param1 > -119) {
                    hb.a(108);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L11: {
            if (n.b((byte) 127)) {
              break L11;
            } else {
              var2 = 1;
              if (var3 == 0) {
                break L0;
              } else {
                break L11;
              }
            }
          }
          var2 = 0;
          break L0;
        }
        L12: {
          if (null != ne.field_b) {
            break L12;
          } else {
            if (fh.field_c) {
              gb.a(true, var2, param0);
              break L12;
            } else {
              if (param1 > -119) {
                hb.a(108);
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param1 > -119) {
          hb.a(108);
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fb var4 = null;
        int var4_int = 0;
        qf var5_ref_qf = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        se var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = cd.field_t;
              if (param0 == 554553416) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = var9.b((byte) 90);
                var3 = var9.b((byte) 90);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (1 != var2) {
                      break L4;
                    } else {
                      var4_int = var9.c(true);
                      var5_ref_qf = (qf) ((Object) vb.field_h.b((byte) -124));
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var5_ref_qf == null) {
                              break L7;
                            } else {
                              stackOut_7_0 = var5_ref_qf.field_j;
                              stackOut_7_1 = var3;
                              stackIn_16_0 = stackOut_7_0;
                              stackIn_16_1 = stackOut_7_1;
                              stackIn_8_0 = stackOut_7_0;
                              stackIn_8_1 = stackOut_7_1;
                              if (var8 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_8_0 != stackIn_8_1) {
                                    break L8;
                                  } else {
                                    if (var4_int != var5_ref_qf.field_i) {
                                      break L8;
                                    } else {
                                      if (var8 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                var5_ref_qf = (qf) ((Object) vb.field_h.d(853));
                                if (var8 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var5_ref_qf == null) {
                            stackOut_15_0 = param0;
                            stackOut_15_1 = 554553381;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L6;
                          } else {
                            var5_ref_qf.b(param0 ^ 554553457);
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        th.a(stackIn_16_0 ^ stackIn_16_1);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  pe.a((byte) -13, (Throwable) null, "LR1: " + sj.b(true));
                  th.a(106);
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = (fb) ((Object) mg.field_l.b((byte) -41));
              if (var4 == null) {
                th.a(113);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L9: {
                  var5 = tf.field_c - var9.field_i;
                  var11 = var4.field_g;
                  var10 = var11;
                  var6 = var10;
                  if (var11.length << -1845973534 < var5) {
                    var5 = var11.length << 791664770;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var7 = 0;
                L10: while (true) {
                  if (var7 < var5) {
                    var6[var7 >> -1453597886] = var6[var7 >> -1453597886] + (var9.b((byte) 90) << (vi.a(3, var7) << 554553416));
                    var7++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      continue L10;
                    }
                  } else {
                    var4.b(57);
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "hb.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, hj param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9_int = -param0 + (param5 + param8.field_p + param1);
            var10 = param1 + (param8.field_p - (-param5 + -param6));
            var11 = param8.field_u - (-param7 - (param8.field_k >> -536031135));
            ul.i(var9_int, 0, var10, param2 + var11);
            param8.e(param5 + param4, param7 + -1, param3);
            param8.e(-1 + param5, param7 - -1, param3);
            ul.b(rh.field_e);
            ul.i(1 + var9_int, 0, var10 + 1, param2 + var11);
            param8.e(param5 - -1, -1 + param7, param3);
            param8.e(param5 - -1, 1 + param7, param3);
            ul.b(rh.field_e);
            var9_int = -param6 + param8.field_o + param8.field_p + (param5 + -param1);
            var10 = -param0 + (-param1 + (param5 + param8.field_o + param8.field_p));
            ul.i(var9_int, var11 + -param2, var10, 480);
            param8.e(-1 + param5, -1 + param7, param3);
            param8.e(-1 + param5, param7 - -1, param3);
            ul.b(rh.field_e);
            ul.i(var9_int + 1, var11 + -param2, var10 - -1, 480);
            param8.e(1 + param5, param7 - 1, param3);
            param8.e(1 + param5, param7 + 1, param3);
            ul.b(rh.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var9);
            stackOut_2_1 = new StringBuilder().append("hb.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param8 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
    }

    final static void a(long param0, int param1) {
        if (param0 > 0L) {
          if (param1 >= 93) {
            if (0L == param0 % 10L) {
              km.a(param0 + -1L, -25680);
              km.a(1L, -25680);
              if (OrbDefence.field_D) {
                km.a(param0, -25680);
                return;
              } else {
                return;
              }
            } else {
              km.a(param0, -25680);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 < 98) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Loading sound effects";
    }
}
