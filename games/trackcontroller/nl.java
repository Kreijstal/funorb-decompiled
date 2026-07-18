/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends RuntimeException {
    String field_a;
    Throwable field_d;
    static String field_c;
    static String field_f;
    static long field_e;
    static boolean field_b;

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        na var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_40_0 = 0;
        na stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        na stackOut_44_0 = null;
        na stackOut_43_0 = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = me.field_q;
              var2 = 0;
              if (di.field_h == 2) {
                var3_long = -fe.field_N + qg.a(false);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~var3 <= ~sa.field_I.length) {
                break L0;
              } else {
                L3: {
                  var4 = mj.field_b[var3];
                  if (var4 >= 0) {
                    if (~vi.field_f.field_e == ~var4) {
                      var5 = j.field_a;
                      break L3;
                    } else {
                      var5 = sl.field_n;
                      break L3;
                    }
                  } else {
                    var5 = db.field_db;
                    break L3;
                  }
                }
                L4: {
                  var6 = sa.field_I[var3];
                  if (di.field_h != 2) {
                    break L4;
                  } else {
                    if (1 == var2) {
                      L5: {
                        if (~jf.field_i.length >= ~el.field_O.length) {
                          stackOut_18_0 = el.field_O.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = jf.field_i.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_19_0;
                        if (bk.field_J.length >= ue.field_c.length) {
                          stackOut_21_0 = bk.field_J.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L6;
                        } else {
                          stackOut_20_0 = ue.field_c.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_22_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var3 >= 6 + var7) {
                            break L7;
                          } else {
                            L8: {
                              if (0 > -var7 + var3 - (6 + -el.field_O.length)) {
                                stackOut_26_0 = "";
                                stackIn_27_0 = stackOut_26_0;
                                break L8;
                              } else {
                                stackOut_25_0 = el.field_O[-var7 + (el.field_O.length + var3) + -6];
                                stackIn_27_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L7;
                          }
                        }
                      }
                      if (~var3 > ~(7 - -var7)) {
                        break L4;
                      } else {
                        if (~var3 <= ~(7 - (-var7 - var8))) {
                          break L4;
                        } else {
                          L9: {
                            if (~bk.field_J.length >= ~(-var7 + var3 + -7)) {
                              stackOut_32_0 = "";
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = bk.field_J[-var7 + (-7 + var3)];
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var4 < 0) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L11;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    break L11;
                  }
                }
                L12: {
                  var7 = ib.a(stackIn_40_0 != 0, 10, var6);
                  var8 = sf.field_F + -(var7 >> 1);
                  if (0 <= var4) {
                    L13: {
                      var1_int = var1_int + na.field_e;
                      if (~var4 == ~vi.field_f.field_e) {
                        stackOut_44_0 = nh.field_c;
                        stackIn_45_0 = stackOut_44_0;
                        break L13;
                      } else {
                        stackOut_43_0 = mk.field_a;
                        stackIn_45_0 = stackOut_43_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_45_0;
                      if (var9 != null) {
                        var9.a((of.field_f << 1) + pc.field_m, var8 - mb.field_c, var1_int, (byte) 39, (mb.field_c << 1) + var7);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + of.field_f;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (0 > var4) {
                    r.field_k.c(var6, var8, ai.field_h + var1_int, var5, -1);
                    var1_int = var1_int + dh.field_l;
                    break L15;
                  } else {
                    mk.field_b.c(var6, var8, dk.field_a + var1_int, var5, -1);
                    var1_int = var1_int + (na.field_e + of.field_f + pc.field_m);
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "nl.C(" + -77 + ')');
        }
    }

    final static int b(byte param0) {
        ij.field_d.a((byte) 95);
        if (!rj.field_d.b(29166)) {
            return bl.a((byte) -124);
        }
        return 0;
    }

    nl(Throwable param0, String param1) {
        ((nl) this).field_a = param1;
        ((nl) this).field_d = param0;
    }

    final static u a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        L0: {
          L1: {
            var15 = TrackController.field_F ? 1 : 0;
            var8 = param3;
            var9 = param6;
            var10 = 0;
            var11 = 0;
            if (param5 == 512) {
              break L1;
            } else {
              if (param0 == 4096) {
                break L1;
              } else {
                L2: {
                  if (param5 == 256) {
                    break L2;
                  } else {
                    if (param0 == 8192) {
                      break L2;
                    } else {
                      break L0;
                    }
                  }
                }
                var11 = 1;
                break L0;
              }
            }
          }
          var11 = -1;
          break L0;
        }
        L3: {
          L4: {
            if (param5 == 128) {
              break L4;
            } else {
              if (16384 == param0) {
                break L4;
              } else {
                L5: {
                  if (param5 == 1024) {
                    break L5;
                  } else {
                    if (param0 != 2048) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                var10 = 1;
                break L3;
              }
            }
          }
          var10 = -1;
          break L3;
        }
        L6: {
          L7: {
            if (var10 == 0) {
              break L7;
            } else {
              if (0 == var11) {
                break L7;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L6;
              }
            }
          }
          stackOut_17_0 = 0;
          stackIn_18_0 = stackOut_17_0;
          break L6;
        }
        L8: {
          var12 = stackIn_18_0;
          if (var12 != 0) {
            L9: {
              L10: {
                if (param5 == 128) {
                  break L10;
                } else {
                  if (2048 == param0) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              var9 += 25;
              break L9;
            }
            L11: {
              L12: {
                if (param5 == 512) {
                  break L12;
                } else {
                  if (8192 != param0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              var8 += 25;
              break L11;
            }
            L13: {
              if (var10 != -1) {
                if (param5 == 1024) {
                  if (4096 == param0) {
                    var13 = -param4 + 13;
                    var14 = -var13 + 52;
                    break L13;
                  } else {
                    var13 = param4 - -39;
                    var14 = -var13;
                    break L13;
                  }
                } else {
                  if (param5 != 256) {
                    var13 = 13 - -param4;
                    var14 = -var13;
                    break L13;
                  } else {
                    var13 = -param4 + 39;
                    var14 = 52 + -var13;
                    break L13;
                  }
                }
              } else {
                if (param5 != 128) {
                  if (param5 == 256) {
                    var13 = param4 + -39;
                    var14 = -var13;
                    break L13;
                  } else {
                    var13 = -13 + -param4;
                    var14 = 52 + -var13;
                    break L13;
                  }
                } else {
                  if (4096 != param0) {
                    var13 = -39 + -param4;
                    var14 = -var13 + 52;
                    break L13;
                  } else {
                    var13 = -13 + param4;
                    var14 = -var13;
                    break L13;
                  }
                }
              }
            }
            var14 = gj.a(2, 104, var14);
            var8 = var8 + kj.field_s[var14];
            var9 = var9 - kj.field_t[var14];
            break L8;
          } else {
            L14: {
              var14 = param4;
              if (param7 == 24) {
                L15: {
                  if (param5 != 256) {
                    stackOut_28_0 = Math.max(0, param4);
                    stackIn_29_0 = stackOut_28_0;
                    break L15;
                  } else {
                    stackOut_27_0 = Math.min(0, param4);
                    stackIn_29_0 = stackOut_27_0;
                    break L15;
                  }
                }
                var14 = stackIn_29_0;
                break L14;
              } else {
                if (param7 == 25) {
                  L16: {
                    if (param5 == 128) {
                      stackOut_24_0 = Math.min(0, param4);
                      stackIn_25_0 = stackOut_24_0;
                      break L16;
                    } else {
                      stackOut_23_0 = Math.max(0, param4);
                      stackIn_25_0 = stackOut_23_0;
                      break L16;
                    }
                  }
                  var14 = stackIn_25_0;
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L17: {
              stackOut_30_0 = 26;
              stackIn_32_0 = stackOut_30_0;
              stackIn_31_0 = stackOut_30_0;
              if (var10 == 0) {
                stackOut_32_0 = stackIn_32_0;
                stackOut_32_1 = 1 + var11;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                break L17;
              } else {
                stackOut_31_0 = stackIn_31_0;
                stackOut_31_1 = 2 + -var10;
                stackIn_33_0 = stackOut_31_0;
                stackIn_33_1 = stackOut_31_1;
                break L17;
              }
            }
            var13 = stackIn_33_0 * stackIn_33_1;
            var9 = var9 + (13 + var10 * var14);
            var8 = var8 + (13 + var11 * var14);
            break L8;
          }
        }
        L18: {
          if (!param1) {
            var13 += 52;
            break L18;
          } else {
            break L18;
          }
        }
        var13 = gj.a(2, 104, var13);
        mb.field_d[var13].e(-(mb.field_d[var13].field_t / 2) + var8, -(mb.field_d[var13].field_q / 2) + var9);
        return new u(var8, var9);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
        field_c = "Passwords must be between 5 and 20 characters long";
    }
}
