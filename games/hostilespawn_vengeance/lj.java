/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lj extends dk {
    static String field_r;
    static vm field_u;
    int field_s;
    static int field_q;
    static fd field_t;

    abstract boolean e(int param0);

    abstract Object c(byte param0);

    final static int d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!jn.e((byte) 73)) {
                L2: {
                  mc.field_F.a((byte) -102, sd.a(2, j.field_c, rb.field_m), sd.a(2, ec.field_a, rc.field_b));
                  if (!mc.field_F.b(0)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 > mc.field_F.field_f) {
                        break L4;
                      } else {
                        L5: {
                          var3 = ue.field_k[mc.field_F.field_f];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (var3 == 5) {
                              break L5;
                            } else {
                              L6: {
                                var4 = -61 % ((param0 - 31) / 58);
                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  if (be.field_e != 2) {
                                    break L6;
                                  } else {
                                    var5 = hn.a((byte) 80) + -fj.field_Rb;
                                    var7 = (int)((-var5 + 10999L) / 1000L);
                                    if (var7 > 0) {
                                      break L6;
                                    } else {
                                      var3 = 2;
                                      hh.a(5, 5, true);
                                      break L6;
                                    }
                                  }
                                }
                              }
                              return var3;
                            }
                          }
                        }
                        pk.g(-89);
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (be.field_e != 2) {
                      pk.g(-61);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L7: {
                  var4 = -61 % ((param0 - 31) / 58);
                  if (var3 != 0) {
                    break L7;
                  } else {
                    if (be.field_e != 2) {
                      break L7;
                    } else {
                      var5 = hn.a((byte) 80) + -fj.field_Rb;
                      var7 = (int)((-var5 + 10999L) / 1000L);
                      if (var7 > 0) {
                        break L7;
                      } else {
                        var3 = 2;
                        hh.a(5, 5, true);
                        break L7;
                      }
                    }
                  }
                }
                stackOut_28_0 = var3;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              } else {
                L8: {
                  mc.field_F.c(0);
                  if (!mc.field_F.b(0)) {
                    break L8;
                  } else {
                    var1_int = 1;
                    break L8;
                  }
                }
                if (13 == pj.field_e) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "lj.O(" + param0 + 41);
        }
        return stackIn_29_0;
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        if (param0 != 15) {
            int discarded$0 = lj.d(-119);
        }
    }

    final static void a(int[] param0, int param1, int param2, p param3) {
        RuntimeException var4 = null;
        double var4_double = 0.0;
        double var6 = 0.0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        Object var13 = null;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        oj var27 = null;
        int var28 = 0;
        double var29 = 0.0;
        int var31 = 0;
        double var32_double = 0.0;
        int var32 = 0;
        double var34 = 0.0;
        int var36 = 0;
        int var37 = 0;
        double var38 = 0.0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        oj var43 = null;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var42 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 == 0) {
              L1: {
                if (param3.field_e == 0) {
                  L2: {
                    var4_double = param3.field_l.field_f + (double)param3.field_j.field_e;
                    var6 = (double)param3.field_j.field_g + param3.field_l.field_a;
                    var8 = 0;
                    if (19 == param3.field_i) {
                      L3: while (true) {
                        if (param3.field_e != 0) {
                          break L2;
                        } else {
                          L4: {
                            var8++;
                            if (var8 <= 32) {
                              break L4;
                            } else {
                              param3.field_e = 1;
                              param3.field_i = -1;
                              break L4;
                            }
                          }
                          L5: {
                            param3.field_l.a(2, (byte) 94, param3.field_c);
                            param3.a(param2 + 8573);
                            param0[param1] = 0;
                            if (param0[param3.field_j.b(param2 + -4)] != 2) {
                              break L5;
                            } else {
                              param3.field_e = 1;
                              param3.field_c = 255.0 * Math.random();
                              break L5;
                            }
                          }
                          param0[param1] = 3;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var9 = param3.field_l.field_f + (double)param3.field_j.field_e;
                  var11 = param3.field_l.field_a + (double)param3.field_j.field_g;
                  var13 = null;
                  param3.field_i = -1;
                  var26 = 0;
                  L6: while (true) {
                    if (var26 >= rc.field_e) {
                      break L1;
                    } else {
                      L7: {
                        var27 = re.field_n[var26];
                        var43 = var27;
                        var43 = var27;
                        var28 = var27.field_I;
                        if (var27.field_i == 0) {
                          var28 = eh.field_g;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (var28 <= 0) {
                          break L8;
                        } else {
                          if (20 == var27.field_i) {
                            break L8;
                          } else {
                            if (var27.a((byte) 54)) {
                              break L8;
                            } else {
                              L9: {
                                var29 = 1.0;
                                var24 = var27.field_l.field_a + (double)var27.field_j.field_g;
                                if (var27.field_i != 20) {
                                  break L9;
                                } else {
                                  var29 = 0.5;
                                  break L9;
                                }
                              }
                              L10: {
                                var22 = var27.field_l.field_f + (double)var27.field_j.field_e;
                                var16 = -var29 + var24;
                                var14 = var22 - var29;
                                var18 = var14 + var29 * 2.0;
                                var20 = var29 * 2.0 + var16;
                                var31 = 0;
                                if (null == var27.field_u) {
                                  L11: {
                                    L12: {
                                      if (fb.a(var16, (byte) 43, var20, var9, var14, var6, var18, var11, var4_double)) {
                                        break L12;
                                      } else {
                                        if (!fb.a(var20, (byte) 43, var16, var9, var14, var6, var18, var11, var4_double)) {
                                          stackOut_38_0 = 0;
                                          stackIn_39_0 = stackOut_38_0;
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    stackOut_37_0 = 1;
                                    stackIn_39_0 = stackOut_37_0;
                                    break L11;
                                  }
                                  var31 = stackIn_39_0;
                                  break L10;
                                } else {
                                  var32_double = var9 - var4_double;
                                  var34 = -var6 + var11;
                                  var36 = -(var27.field_u.field_z >> 1) + (int)(var22 * 24.0);
                                  var37 = (int)(var24 * 24.0) + -(var27.field_u.field_A >> 1);
                                  var38 = 0.0;
                                  L13: while (true) {
                                    L14: {
                                      if (1.0 <= var38) {
                                        break L14;
                                      } else {
                                        if (var31 != 0) {
                                          break L14;
                                        } else {
                                          L15: {
                                            var40 = (int)((var38 * var32_double + var4_double) * 24.0);
                                            var41 = (int)((var6 + var38 * var34) * 24.0);
                                            if (!var27.field_u.d(var36, var37, var40, var41)) {
                                              stackOut_29_0 = 0;
                                              stackIn_30_0 = stackOut_29_0;
                                              break L15;
                                            } else {
                                              stackOut_28_0 = 1;
                                              stackIn_30_0 = stackOut_28_0;
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            var31 = stackIn_30_0;
                                            if (var31 == 0) {
                                              break L16;
                                            } else {
                                              var4_double = var4_double + var32_double * var38;
                                              var6 = var6 + var38 * var34;
                                              break L16;
                                            }
                                          }
                                          var38 = var38 + 0.05;
                                          continue L13;
                                        }
                                      }
                                    }
                                    break L10;
                                  }
                                }
                              }
                              if (var31 == 0) {
                                break L8;
                              } else {
                                L17: {
                                  var43 = var27;
                                  if (var43.field_I <= 0) {
                                    stackOut_43_0 = 0;
                                    stackIn_44_0 = stackOut_43_0;
                                    break L17;
                                  } else {
                                    stackOut_42_0 = 1;
                                    stackIn_44_0 = stackOut_42_0;
                                    break L17;
                                  }
                                }
                                L18: {
                                  var32 = stackIn_44_0;
                                  if (var26 != 0) {
                                    break L18;
                                  } else {
                                    ci.a(5, 58);
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (var26 <= 0) {
                                    break L19;
                                  } else {
                                    if (8 == var43.field_i) {
                                      break L19;
                                    } else {
                                      if (!var43.a(19, -100)) {
                                        break L19;
                                      } else {
                                        if (var43.field_i == 0) {
                                          ci.a(15, 102);
                                          break L19;
                                        } else {
                                          var43.field_I = var43.field_I - 15;
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                }
                                L20: {
                                  L21: {
                                    if (5 == var43.field_i) {
                                      break L21;
                                    } else {
                                      if (22 != var43.field_i) {
                                        break L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  if (16 <= param3.field_e) {
                                    break L20;
                                  } else {
                                    var43.field_I = 0;
                                    break L20;
                                  }
                                }
                                L22: {
                                  var43.field_F = 255;
                                  param3.field_e = 1;
                                  if (var43.field_I >= 0) {
                                    break L22;
                                  } else {
                                    var43.field_I = 0;
                                    break L22;
                                  }
                                }
                                L23: {
                                  param3.field_c = Math.random() * 255.0;
                                  param3.field_j.field_g = var43.field_j.field_g;
                                  param3.field_j.field_e = var43.field_j.field_e;
                                  param3.field_l.field_f = var43.field_l.field_f + Math.random() - 0.5;
                                  param3.field_l.field_a = var43.field_l.field_a + Math.random() - 0.5;
                                  if (0 < var43.field_I) {
                                    break L23;
                                  } else {
                                    if (var43.field_i == 0) {
                                      break L23;
                                    } else {
                                      param3.field_i = 3;
                                      if (!var43.field_b) {
                                        break L23;
                                      } else {
                                        if (var32 == 0) {
                                          break L23;
                                        } else {
                                          if (27 != var43.field_i) {
                                            al.field_U[2] = al.field_U[2] + 1;
                                            if (al.field_U[2] + 1 == 30) {
                                              ti.a(248, (byte) -18, 7);
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                nh.a(var43, -29966);
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      var26++;
                      continue L6;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L24: {
                param3.field_e = param3.field_e + 1;
                if (param3.field_e > 32) {
                  param3.field_i = -1;
                  break L24;
                } else {
                  break L24;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var4 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var4;
            stackOut_74_1 = new StringBuilder().append("lj.G(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L25;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L25;
            }
          }
          L26: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param3 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L26;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L26;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 41);
        }
    }

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (jc.field_b != null) {
            var1 = (Object) (Object) jc.field_b;
            synchronized (var1) {
              L1: {
                jc.field_b = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
    }

    lj(int param0) {
        ((lj) this).field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Loading graphics";
        field_q = 0;
    }
}
