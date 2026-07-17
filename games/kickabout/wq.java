/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static boolean field_g;
    static String field_f;
    static String field_b;
    static long field_d;
    static String field_c;
    static String field_e;
    static String[] field_a;

    final static long a(long param0, int param1) {
        int var3 = 99 / ((-59 - param1) / 58);
        return param0 + 1L;
    }

    final static int b(byte param0) {
        if (param0 != 46) {
            field_c = null;
            return bh.field_l - ka.field_a;
        }
        return bh.field_l - ka.field_a;
    }

    final static void a(int param0, int param1, int param2, byte param3, String param4, int param5) {
        if (param3 != 32) {
            return;
        }
        try {
            ul.a(param1, 1, param2, false, (byte) 117, param5, 16, param0, 1, param4);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wq.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        String var3_ref_String = null;
        int var3 = 0;
        int var4 = 0;
        long var5_long = 0L;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_46_0 = 0;
        String stackIn_74_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        String stackOut_73_0 = null;
        String stackOut_72_0 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (hr.field_k) {
                var1_int++;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!gd.field_a) {
                break L2;
              } else {
                var1_int++;
                break L2;
              }
            }
            L3: {
              if (!gk.field_e) {
                break L3;
              } else {
                var1_int++;
                break L3;
              }
            }
            L4: {
              if (!pq.field_K) {
                break L4;
              } else {
                var1_int++;
                break L4;
              }
            }
            L5: {
              if (!wp.field_f) {
                break L5;
              } else {
                var1_int++;
                break L5;
              }
            }
            L6: {
              if (wl.field_g) {
                var1_int++;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (fa.field_j == 0) {
                break L7;
              } else {
                var1_int++;
                break L7;
              }
            }
            L8: {
              if (pb.field_B) {
                var1_int++;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (!wl.field_o) {
                break L9;
              } else {
                if (null != um.field_e) {
                  var1_int = var1_int + um.field_e.field_o.field_I;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            if (var1_int != 0) {
              var1_int = var1_int * 20 + 10;
              on.a(470, 10, 160, var1_int, 34);
              on.e(470, 10, 160, var1_int, 3355477);
              on.e(471, 11, 158, -2 + var1_int, 11184844);
              on.e(472, 12, 156, var1_int + -4, 5592439);
              if (param0 >= 13) {
                L10: {
                  var2 = 30;
                  if (gd.field_a) {
                    var3_long = Runtime.getRuntime().totalMemory();
                    var5_long = Runtime.getRuntime().freeMemory();
                    var7 = (-var5_long + var3_long) / 1024L + " kB / " + var3_long / 1024L + " kB";
                    pb.field_C.c(var7, 620, var2, 16777215, 0);
                    var2 += 20;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (hr.field_k) {
                    var3_ref_String = nk.field_h + " fps / " + fb.field_T + " lps";
                    pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                    var2 += 20;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    L14: {
                      if (!wl.field_o) {
                        break L14;
                      } else {
                        if (null != um.field_e) {
                          var3 = 0;
                          L15: while (true) {
                            if (~var3 <= ~um.field_e.field_o.field_I) {
                              break L14;
                            } else {
                              stackOut_39_0 = ~var3;
                              stackOut_39_1 = ~um.field_e.field_h;
                              stackIn_42_0 = stackOut_39_0;
                              stackIn_42_1 = stackOut_39_1;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              if (var8 != 0) {
                                if (stackIn_42_0 != stackIn_42_1) {
                                  break L13;
                                } else {
                                  break L12;
                                }
                              } else {
                                L16: {
                                  if (stackIn_40_0 == stackIn_40_1) {
                                    stackOut_45_0 = 16777215;
                                    stackIn_46_0 = stackOut_45_0;
                                    break L16;
                                  } else {
                                    stackOut_44_0 = 11184812;
                                    stackIn_46_0 = stackOut_44_0;
                                    break L16;
                                  }
                                }
                                var4 = stackIn_46_0;
                                var5 = um.field_e.field_o.field_S[var3] + ": " + um.field_e.field_z[var3] + "ms / team " + um.field_e.field_o.field_g[var3].field_p;
                                pb.field_C.c(var5, 620, var2, var4, 0);
                                var2 += 20;
                                var3++;
                                if (var8 == 0) {
                                  continue L15;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L17: {
                      if (!pq.field_K) {
                        break L17;
                      } else {
                        var3_ref_String = "Synchronisation disabled";
                        pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                        var2 += 20;
                        break L17;
                      }
                    }
                    L18: {
                      if (pb.field_B) {
                        var3_ref_String = "Camera boundary disabled";
                        pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                        var2 += 20;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (gk.field_e) {
                        var3_ref_String = "Response Filter disabled";
                        pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                        var2 += 20;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (wp.field_f) {
                        var3_ref_String = "Smoothing disabled";
                        pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                        var2 += 20;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    if (fa.field_j != 0) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                  L21: {
                    var3_ref_String = "Range:";
                    if (1 != fa.field_j) {
                      break L21;
                    } else {
                      var3_ref_String = var3_ref_String + " Ball";
                      break L21;
                    }
                  }
                  L22: {
                    if (fa.field_j == 2) {
                      var3_ref_String = var3_ref_String + " Player";
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (fa.field_j == 3) {
                      var3_ref_String = var3_ref_String + " Ball & Player";
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                  var2 += 20;
                  break L12;
                }
                if (wl.field_g) {
                  L24: {
                    var3 = pq.field_J / 5;
                    var4 = pq.field_J % 5;
                    if (var4 != 0) {
                      stackOut_73_0 = Integer.toString(var4);
                      stackIn_74_0 = stackOut_73_0;
                      break L24;
                    } else {
                      stackOut_72_0 = "all";
                      stackIn_74_0 = stackOut_72_0;
                      break L24;
                    }
                  }
                  var5 = stackIn_74_0;
                  var6 = "Viewing AI: " + var3 + "," + var5;
                  pb.field_C.c(var6, 620, var2, 16777215, 0);
                  var2 += 20;
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "wq.F(" + param0 + 41);
        }
    }

    final static boolean c(byte param0) {
        int var1 = 42 % ((param0 - -20) / 57);
        return jn.a(17, so.a(71));
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_f = null;
        field_b = null;
        wq.a(-76);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You need to play <%0> more rated games to unlock this option.";
        field_b = "Cancel draw";
        field_f = "<lt>";
        field_e = "rematch! ";
        field_g = false;
        field_a = new String[]{"Circle", "Square", "Triangle", "Diamond"};
    }
}
