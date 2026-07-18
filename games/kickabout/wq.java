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
        int var3_int = 0;
        RuntimeException var3 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            var3_int = 99 / ((-59 - param1) / 58);
            stackOut_0_0 = param0 + 1L;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "wq.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static int b(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 46) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            stackOut_3_0 = bh.field_l - ka.field_a;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "wq.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2, byte param3, String param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param3 == 32) {
              ul.a(param1, 1, param2, false, (byte) 117, param5, 16, param0, 1, param4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("wq.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param5 + ')');
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
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        String stackIn_98_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        String stackOut_97_0 = null;
        String stackOut_95_0 = null;
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
                    if (!wl.field_o) {
                      break L13;
                    } else {
                      if (null != um.field_e) {
                        var3 = 0;
                        L14: while (true) {
                          if (~var3 <= ~um.field_e.field_o.field_I) {
                            break L13;
                          } else {
                            stackOut_55_0 = ~var3;
                            stackOut_55_1 = ~um.field_e.field_h;
                            stackIn_78_0 = stackOut_55_0;
                            stackIn_78_1 = stackOut_55_1;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            if (var8 != 0) {
                              break L12;
                            } else {
                              L15: {
                                if (stackIn_56_0 == stackIn_56_1) {
                                  stackOut_61_0 = 16777215;
                                  stackIn_62_0 = stackOut_61_0;
                                  break L15;
                                } else {
                                  stackOut_59_0 = 11184812;
                                  stackIn_62_0 = stackOut_59_0;
                                  break L15;
                                }
                              }
                              var4 = stackIn_62_0;
                              var5 = um.field_e.field_o.field_S[var3] + ": " + um.field_e.field_z[var3] + "ms / team " + um.field_e.field_o.field_g[var3].field_p;
                              pb.field_C.c(var5, 620, var2, var4, 0);
                              var2 += 20;
                              var3++;
                              if (var8 == 0) {
                                continue L14;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  L16: {
                    if (!pq.field_K) {
                      break L16;
                    } else {
                      var3_ref_String = "Synchronisation disabled";
                      pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                      var2 += 20;
                      break L16;
                    }
                  }
                  L17: {
                    if (pb.field_B) {
                      var3_ref_String = "Camera boundary disabled";
                      pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                      var2 += 20;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (gk.field_e) {
                      var3_ref_String = "Response Filter disabled";
                      pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                      var2 += 20;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (wp.field_f) {
                      var3_ref_String = "Smoothing disabled";
                      pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
                      var2 += 20;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  stackOut_77_0 = -1;
                  stackOut_77_1 = ~fa.field_j;
                  stackIn_78_0 = stackOut_77_0;
                  stackIn_78_1 = stackOut_77_1;
                  break L12;
                }
                L20: {
                  if (stackIn_78_0 != stackIn_78_1) {
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
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L24: {
                  if (wl.field_g) {
                    L25: {
                      var3 = pq.field_J / 5;
                      var4 = pq.field_J % 5;
                      if (var4 != 0) {
                        stackOut_97_0 = Integer.toString(var4);
                        stackIn_98_0 = stackOut_97_0;
                        break L25;
                      } else {
                        stackOut_95_0 = "all";
                        stackIn_98_0 = stackOut_95_0;
                        break L25;
                      }
                    }
                    var5 = stackIn_98_0;
                    var6 = "Viewing AI: " + var3 + "," + var5;
                    pb.field_C.c(var6, 620, var2, 16777215, 0);
                    var2 += 20;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                break L0;
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
          throw nb.a((Throwable) (Object) var1, "wq.F(" + param0 + ')');
        }
    }

    final static boolean c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        try {
          L0: {
            var1_int = 42 % ((param0 - -20) / 57);
            stackOut_0_0 = jn.a(17, so.a(71));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "wq.A(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        try {
            field_e = null;
            field_c = null;
            field_a = null;
            field_f = null;
            field_b = null;
            if (param0 >= -102) {
                wq.a(-76);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wq.D(" + param0 + ')');
        }
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
