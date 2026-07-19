/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg {
    static int field_b;
    static long[] field_d;
    static o field_a;
    static String field_c;
    static boolean field_e;

    final static void c(byte param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sd var4_ref_sd = null;
        long var4 = 0L;
        int var5 = 0;
        qc var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        jd var27 = null;
        jd var28 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_68_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_67_0 = 0;
        var26 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -112) {
                break L1;
              } else {
                field_d = (long[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var27 = te.field_N;
                var28 = var27;
                var2 = var28.j(255);
                if (var2 != 0) {
                  break L3;
                } else {
                  var3 = var28.i(-109);
                  var4_ref_sd = (sd) ((Object) r.field_b.a((byte) 51));
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var4_ref_sd == null) {
                          break L6;
                        } else {
                          stackOut_6_0 = var3;
                          stackIn_12_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var26 != 0) {
                            break L5;
                          } else {
                            if (stackIn_7_0 == var4_ref_sd.field_o) {
                              break L6;
                            } else {
                              var4_ref_sd = (sd) ((Object) r.field_b.b(-125));
                              if (var26 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      if (var4_ref_sd == null) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            var5 = var28.j(255);
                            if (var5 == 0) {
                              break L8;
                            } else {
                              var6_int = var4_ref_sd.field_k;
                              da.field_a[0].field_c = false;
                              da.field_a[0].field_d = ne.field_g;
                              var7 = var4_ref_sd.field_l;
                              da.field_a[0].field_a = null;
                              var8_int = 1;
                              L9: while (true) {
                                L10: {
                                  if (var5 <= var8_int) {
                                    break L10;
                                  } else {
                                    da.field_a[var8_int].field_d = var27.h(115);
                                    da.field_a[var8_int].field_c = false;
                                    if (var26 != 0) {
                                      break L7;
                                    } else {
                                      L11: {
                                        L12: {
                                          if ((var28.j(255) ^ -1) != -2) {
                                            break L12;
                                          } else {
                                            da.field_a[var8_int].field_a = var28.h(105);
                                            if (var26 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        da.field_a[var8_int].field_a = null;
                                        break L11;
                                      }
                                      var8_int++;
                                      if (var26 == 0) {
                                        continue L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                dupTemp$6 = new String[3][var6_int];
                                var4_ref_sd.field_n = dupTemp$6;
                                var8 = dupTemp$6;
                                var9 = new String[3][var6_int];
                                dupTemp$7 = new long[3][var6_int];
                                var4_ref_sd.field_m = dupTemp$7;
                                var10 = dupTemp$7;
                                dupTemp$8 = new int[3][var7 * var6_int];
                                var4_ref_sd.field_i = dupTemp$8;
                                var11 = dupTemp$8;
                                var12 = 0;
                                var13 = 0;
                                var14 = 0;
                                var15 = 0;
                                var16 = 0;
                                var17 = 0;
                                var18 = var28.j(255);
                                if (0 >= var18) {
                                  break L8;
                                } else {
                                  var19 = 0;
                                  L13: while (true) {
                                    if (var18 <= var19) {
                                      break L8;
                                    } else {
                                      var20 = var27.j(255);
                                      var21 = da.field_a[var20].field_d;
                                      var22 = var28.a(10526);
                                      var24 = var28.field_m;
                                      if (var26 != 0) {
                                        break L7;
                                      } else {
                                        L14: {
                                          if (var6_int > var19) {
                                            var8[0][var12] = var21;
                                            var9[0][var12] = da.field_a[var20].field_a;
                                            var10[0][var12] = var22;
                                            var25 = 0;
                                            L15: while (true) {
                                              if (var7 <= var25) {
                                                var12++;
                                                break L14;
                                              } else {
                                                incrementValue$9 = var15;
                                                var15++;
                                                var11[0][incrementValue$9] = var27.e(true);
                                                var25++;
                                                if (var26 != 0) {
                                                  break L14;
                                                } else {
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L16: {
                                          L17: {
                                            if (var21 == null) {
                                              break L17;
                                            } else {
                                              if (kj.a(var21, (byte) -47)) {
                                                var8[1][var13] = ne.field_g;
                                                var9[1][var13] = null;
                                                var10[1][var13] = var22;
                                                var28.field_m = var24;
                                                var13++;
                                                var25 = 0;
                                                L18: while (true) {
                                                  if (var7 <= var25) {
                                                    break L17;
                                                  } else {
                                                    incrementValue$10 = var16;
                                                    var16++;
                                                    var11[1][incrementValue$10] = var27.e(true);
                                                    var25++;
                                                    if (var26 != 0) {
                                                      break L16;
                                                    } else {
                                                      continue L18;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var14 >= var6_int) {
                                              break L19;
                                            } else {
                                              if (!da.field_a[var20].field_c) {
                                                da.field_a[var20].field_c = true;
                                                var8[2][var14] = var21;
                                                var9[2][var14] = da.field_a[var20].field_a;
                                                var10[2][var14] = var22;
                                                var28.field_m = var24;
                                                var14++;
                                                var25 = 0;
                                                L20: while (true) {
                                                  if (var7 <= var25) {
                                                    break L19;
                                                  } else {
                                                    incrementValue$11 = var17;
                                                    var17++;
                                                    var11[2][incrementValue$11] = var27.e(true);
                                                    var25++;
                                                    if (var26 != 0) {
                                                      break L16;
                                                    } else {
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var19++;
                                          break L16;
                                        }
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var4_ref_sd.field_h = true;
                          var4_ref_sd.c(10);
                          break L7;
                        }
                        if (var26 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    je.a(stackIn_12_0 != 0);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L21: {
                if (1 == var2) {
                  break L21;
                } else {
                  hi.a((Throwable) null, "HS1: " + oc.a(false), 1);
                  je.a(false);
                  if (var26 == 0) {
                    break L2;
                  } else {
                    break L21;
                  }
                }
              }
              var3 = var28.i(-4);
              var4 = var28.a(10526);
              var6 = (qc) ((Object) sb.field_c.a((byte) 51));
              L22: while (true) {
                L23: {
                  L24: {
                    if (var6 == null) {
                      break L24;
                    } else {
                      stackOut_60_0 = var6.field_u ^ -1;
                      stackIn_68_0 = stackOut_60_0;
                      stackIn_61_0 = stackOut_60_0;
                      if (var26 != 0) {
                        break L23;
                      } else {
                        L25: {
                          if (stackIn_61_0 != (var3 ^ -1)) {
                            break L25;
                          } else {
                            if (var26 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        var6 = (qc) ((Object) sb.field_c.b(-111));
                        if (var26 == 0) {
                          continue L22;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                  if (var6 == null) {
                    stackOut_67_0 = 0;
                    stackIn_68_0 = stackOut_67_0;
                    break L23;
                  } else {
                    var6.field_n = var4;
                    var6.c(10);
                    break L2;
                  }
                }
                je.a(stackIn_68_0 != 0);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "pg.A(" + param0 + ')');
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

    final static int a(byte param0) {
        try {
            int discarded$1 = 0;
            IOException var1 = null;
            int var1_int = 0;
            gb var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_33_0 = 0;
            if (il.field_c.field_l >= 4) {
              if (-1 != il.field_c.field_c) {
                if (il.field_c.field_c != -2) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (0 == ug.field_f) {
                      ik.field_b = n.field_a.a(qk.field_o, ue.field_a, -28148);
                      ug.field_f = ug.field_f + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (ug.field_f ^ -1)) {
                      break L2;
                    } else {
                      if (2 != ik.field_b.field_c) {
                        if (-2 == (ik.field_b.field_c ^ -1)) {
                          ug.field_f = ug.field_f + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_13_0 = ua.a(-1, (byte) -86);
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (-3 != (ug.field_f ^ -1)) {
                      break L3;
                    } else {
                      qf.field_a = new ad((java.net.Socket) (ik.field_b.field_e), n.field_a);
                      var2 = new gb(13);
                      si.a(hj.field_x, (byte) 22, sa.field_o, q.field_a, var2);
                      var2.c(param0 + 35, 15);
                      var2.b(nc.field_a, false);
                      qf.field_a.a(-28748, 0, 13, var2.field_l);
                      ug.field_f = ug.field_f + 1;
                      cj.field_c = 30000L + je.a(1);
                      break L3;
                    }
                  }
                  L4: {
                    if (-4 != (ug.field_f ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if ((qf.field_a.b(-30119) ^ -1) >= -1) {
                          break L5;
                        } else {
                          var1_int = qf.field_a.a(-116);
                          if (0 != var1_int) {
                            stackOut_24_0 = ua.a(var1_int, (byte) -86);
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            ug.field_f = ug.field_f + 1;
                            if (!SolKnight.field_L) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if ((cj.field_c ^ -1L) <= (je.a(param0 ^ 82) ^ -1L)) {
                        break L4;
                      } else {
                        stackOut_28_0 = ua.a(-2, (byte) -86);
                        stackIn_29_0 = stackOut_28_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  L6: {
                    if (param0 == 83) {
                      break L6;
                    } else {
                      discarded$1 = pg.a((byte) 9);
                      break L6;
                    }
                  }
                  if ((ug.field_f ^ -1) != -5) {
                    stackOut_35_0 = -1;
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    il.field_c.a(la.field_n, (byte) 106, qf.field_a);
                    ug.field_f = 0;
                    ik.field_b = null;
                    qf.field_a = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ua.a(-3, (byte) -86);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_25_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_29_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_34_0;
                    } else {
                      return stackIn_36_0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        uc.field_b = (param0 << 666124592) / 150;
        if (param1 != 1) {
            field_e = false;
        }
        uc.field_c = param0 * 400 / 150;
        uc.field_e = param0 * 100 / 150;
    }

    public static void b(byte param0) {
        if (param0 <= 112) {
            field_b = -11;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_d = new long[32];
        field_c = "Menu: 'ESC'";
    }
}
