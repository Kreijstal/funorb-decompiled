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
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
                          if ((var3 ^ -1) == -3) {
                            break L5;
                          } else {
                            if (-6 == (var3 ^ -1)) {
                              break L5;
                            } else {
                              L6: {
                                var4 = -61 % ((param0 - 31) / 58);
                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  if (-3 != (be.field_e ^ -1)) {
                                    break L6;
                                  } else {
                                    var5 = hn.a((byte) 80) + -fj.field_Rb;
                                    var7 = (int)((-var5 + 10999L) / 1000L);
                                    if (-1 > (var7 ^ -1)) {
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
                    if (-3 != (be.field_e ^ -1)) {
                      break L7;
                    } else {
                      var5 = hn.a((byte) 80) + -fj.field_Rb;
                      var7 = (int)((-var5 + 10999L) / 1000L);
                      if (-1 > (var7 ^ -1)) {
                        break L7;
                      } else {
                        var3 = 2;
                        hh.a(5, 5, true);
                        break L7;
                      }
                    }
                  }
                }
                stackIn_29_0 = var3;
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
          throw wg.a((Throwable) ((Object) var1), "lj.O(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        if (param0 != 15) {
            lj.d(-119);
        }
    }

    final static void a(int[] param0, int param1, int param2, p param3) {
        int dupTemp$0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
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
        var42 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 == 0) {
              L1: {
                if (-1 == (param3.field_e ^ -1)) {
                  L2: {
                    var4_double = param3.field_l.field_f + (double)param3.field_j.field_e;
                    var6 = (double)param3.field_j.field_g + param3.field_l.field_a;
                    var8 = 0;
                    if (19 == param3.field_i) {
                      L3: while (true) {
                        if (-1 != (param3.field_e ^ -1)) {
                          break L2;
                        } else {
                          L4: {
                            var8++;
                            if ((var8 ^ -1) >= -33) {
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
                            if ((param0[param3.field_j.b(param2 + -4)] ^ -1) != -3) {
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
                        if ((var27.field_i ^ -1) == -1) {
                          var28 = eh.field_g;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (-1 > (var28 ^ -1)) {
                        if (20 != var27.field_i) {
                          if (!var27.a((byte) 54)) {
                            L8: {
                              var29 = 1.0;
                              var24 = var27.field_l.field_a + (double)var27.field_j.field_g;
                              if ((var27.field_i ^ -1) != -21) {
                                break L8;
                              } else {
                                var29 = 0.5;
                                break L8;
                              }
                            }
                            L9: {
                              var22 = var27.field_l.field_f + (double)var27.field_j.field_e;
                              var16 = -var29 + var24;
                              var14 = var22 - var29;
                              var18 = var14 + var29 * 2.0;
                              var20 = var29 * 2.0 + var16;
                              var31 = 0;
                              if (null == var27.field_u) {
                                L10: {
                                  if (!fb.a(var16, (byte) 43, var20, var9, var14, var6, var18, var11, var4_double)) {
                                    if (fb.a(var20, (byte) 43, var16, var9, var14, var6, var18, var11, var4_double)) {
                                      stackIn_43_0 = 1;
                                      break L10;
                                    } else {
                                      stackIn_43_0 = 0;
                                      break L10;
                                    }
                                  } else {
                                    stackIn_43_0 = 1;
                                    break L10;
                                  }
                                }
                                var31 = stackIn_43_0;
                                break L9;
                              } else {
                                var32_double = var9 - var4_double;
                                var34 = -var6 + var11;
                                var36 = -(var27.field_u.field_z >> 1219654337) + (int)(var22 * 24.0);
                                var37 = (int)(var24 * 24.0) + -(var27.field_u.field_A >> 1644465761);
                                var38 = 0.0;
                                L11: while (true) {
                                  if (1.0 <= var38) {
                                    break L9;
                                  } else {
                                    if (var31 != 0) {
                                      break L9;
                                    } else {
                                      L12: {
                                        var40 = (int)((var38 * var32_double + var4_double) * 24.0);
                                        var41 = (int)((var6 + var38 * var34) * 24.0);
                                        if (!var27.field_u.d(var36, var37, var40, var41)) {
                                          stackIn_33_0 = 0;
                                          break L12;
                                        } else {
                                          stackIn_33_0 = 1;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        var31 = stackIn_33_0;
                                        if (var31 == 0) {
                                          break L13;
                                        } else {
                                          var4_double = var4_double + var32_double * var38;
                                          var6 = var6 + var38 * var34;
                                          break L13;
                                        }
                                      }
                                      var38 = var38 + 0.05;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            }
                            if (var31 != 0) {
                              L14: {
                                var43 = var27;
                                if (var43.field_I <= 0) {
                                  stackIn_49_0 = 0;
                                  break L14;
                                } else {
                                  stackIn_49_0 = 1;
                                  break L14;
                                }
                              }
                              L15: {
                                var32 = stackIn_49_0;
                                if (var26 != 0) {
                                  break L15;
                                } else {
                                  ci.a(5, 58);
                                  break L15;
                                }
                              }
                              L16: {
                                if (var26 <= 0) {
                                  break L16;
                                } else {
                                  if (8 == var43.field_i) {
                                    break L16;
                                  } else {
                                    if (!var43.a(19, -100)) {
                                      break L16;
                                    } else {
                                      if (var43.field_i == 0) {
                                        ci.a(15, 102);
                                        break L16;
                                      } else {
                                        var43.field_I = var43.field_I - 15;
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              L17: {
                                L18: {
                                  if (5 == var43.field_i) {
                                    break L18;
                                  } else {
                                    if (22 != var43.field_i) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                if (16 <= param3.field_e) {
                                  break L17;
                                } else {
                                  var43.field_I = 0;
                                  break L17;
                                }
                              }
                              L19: {
                                var43.field_F = 255;
                                param3.field_e = 1;
                                if (-1 >= (var43.field_I ^ -1)) {
                                  break L19;
                                } else {
                                  var43.field_I = 0;
                                  break L19;
                                }
                              }
                              L20: {
                                param3.field_c = Math.random() * 255.0;
                                param3.field_j.field_g = var43.field_j.field_g;
                                param3.field_j.field_e = var43.field_j.field_e;
                                param3.field_l.field_f = var43.field_l.field_f + Math.random() - 0.5;
                                param3.field_l.field_a = var43.field_l.field_a + Math.random() - 0.5;
                                if (0 < var43.field_I) {
                                  break L20;
                                } else {
                                  if (-1 == (var43.field_i ^ -1)) {
                                    break L20;
                                  } else {
                                    param3.field_i = 3;
                                    if (!var43.field_b) {
                                      break L20;
                                    } else {
                                      if (var32 == 0) {
                                        break L20;
                                      } else {
                                        if (27 != var43.field_i) {
                                          dupTemp$0 = al.field_U[2] + 1;
                                          al.field_U[2] = dupTemp$0;
                                          if (dupTemp$0 == 30) {
                                            ti.a(248, (byte) -18, 7);
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              nh.a(var43, -29966);
                              var26++;
                              continue L6;
                            } else {
                              var26++;
                              continue L6;
                            }
                          } else {
                            var26++;
                            continue L6;
                          }
                        } else {
                          var26++;
                          continue L6;
                        }
                      } else {
                        var26++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              L21: {
                param3.field_e = param3.field_e + 1;
                if ((param3.field_e ^ -1) < -33) {
                  param3.field_i = -1;
                  break L21;
                } else {
                  break L21;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var4);

            stackIn_80_1 = new StringBuilder().append("lj.G(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L22;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_83_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L23;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L23;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_81_0), stackIn_84_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void d(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        L0: {
          if (jc.field_b != null) {
            var1 = jc.field_b;
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
        L2: {
          if (param0 == 114) {
            break L2;
          } else {
            field_q = -64;
            break L2;
          }
        }
    }

    lj(int param0) {
        this.field_s = param0;
    }

    static {
        field_r = "Loading graphics";
        field_q = 0;
    }
}
