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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!jn.e((byte) 73)) {
            L1: {
              mc.field_F.a((byte) -102, sd.a(2, j.field_c, rb.field_m), sd.a(2, ec.field_a, rc.field_b));
              if (!mc.field_F.b(0)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            var3 = 0;
            if (var1 != 0) {
              if (0 <= mc.field_F.field_f) {
                var3 = ue.field_k[mc.field_F.field_f];
                if (var3 != -3) {
                  if (-6 != var3) {
                    L2: {
                      var4 = -61 % ((param0 - 31) / 58);
                      if (var3 != -1) {
                        break L2;
                      } else {
                        if (-3 != be.field_e) {
                          break L2;
                        } else {
                          var5 = hn.a((byte) 80) + -fj.field_Rb;
                          var7 = (int)((-var5 + 10999L) / 1000L);
                          if (-1 > (var7 ^ -1)) {
                            break L2;
                          } else {
                            var3 = 2;
                            hh.a(5, 5, true);
                            break L2;
                          }
                        }
                      }
                    }
                    return var3;
                  } else {
                    pk.g(-89);
                    L3: {
                      var4 = -61 % ((param0 - 31) / 58);
                      if (var3 != -1) {
                        break L3;
                      } else {
                        if (-3 != be.field_e) {
                          break L3;
                        } else {
                          var5 = hn.a((byte) 80) + -fj.field_Rb;
                          var7 = (int)((-var5 + 10999L) / 1000L);
                          if (-1 > (var7 ^ -1)) {
                            break L3;
                          } else {
                            var3 = 2;
                            hh.a(5, 5, true);
                            break L3;
                          }
                        }
                      }
                    }
                    return var3;
                  }
                } else {
                  pk.g(-89);
                  L4: {
                    var4 = -61 % ((param0 - 31) / 58);
                    if (var3 != -1) {
                      break L4;
                    } else {
                      if (-3 != be.field_e) {
                        break L4;
                      } else {
                        var5 = hn.a((byte) 80) + -fj.field_Rb;
                        var7 = (int)((-var5 + 10999L) / 1000L);
                        if (-1 > (var7 ^ -1)) {
                          break L4;
                        } else {
                          var3 = 2;
                          hh.a(5, 5, true);
                          break L4;
                        }
                      }
                    }
                  }
                  return var3;
                }
              } else {
                L5: {
                  if (var2 == 0) {
                    break L5;
                  } else {
                    if (be.field_e != 2) {
                      pk.g(-61);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var4 = -61 % ((param0 - 31) / 58);
                  if (var3 != -1) {
                    break L6;
                  } else {
                    if (-3 != be.field_e) {
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
            } else {
              L7: {
                if (var2 == 0) {
                  break L7;
                } else {
                  if (be.field_e != 2) {
                    pk.g(-61);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                var4 = -61 % ((param0 - 31) / 58);
                if (var3 != -1) {
                  break L8;
                } else {
                  if (-3 != be.field_e) {
                    break L8;
                  } else {
                    var5 = hn.a((byte) 80) + -fj.field_Rb;
                    var7 = (int)((-var5 + 10999L) / 1000L);
                    if (-1 > (var7 ^ -1)) {
                      break L8;
                    } else {
                      var3 = 2;
                      hh.a(5, 5, true);
                      break L8;
                    }
                  }
                }
              }
              return var3;
            }
          } else {
            L9: {
              mc.field_F.c(0);
              if (!mc.field_F.b(0)) {
                break L9;
              } else {
                var1 = 1;
                break L9;
              }
            }
            if (13 == pj.field_e) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
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
        double var4 = 0.0;
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
        int stackIn_29_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        var42 = HostileSpawn.field_I ? 1 : 0;
        if (param2 == 0) {
          L0: {
            if (-1 == (param3.field_e ^ -1)) {
              L1: {
                var4 = param3.field_l.field_f + (double)param3.field_j.field_e;
                var6 = (double)param3.field_j.field_g + param3.field_l.field_a;
                var8 = 0;
                if (19 == param3.field_i) {
                  L2: while (true) {
                    if (-1 != (param3.field_e ^ -1)) {
                      break L1;
                    } else {
                      L3: {
                        var8++;
                        if ((var8 ^ -1) >= -33) {
                          break L3;
                        } else {
                          param3.field_e = 1;
                          param3.field_i = -1;
                          break L3;
                        }
                      }
                      L4: {
                        param3.field_l.a(2, (byte) 94, param3.field_c);
                        param3.a(param2 + 8573);
                        param0[param1] = 0;
                        if ((param0[param3.field_j.b(param2 + -4)] ^ -1) != -3) {
                          break L4;
                        } else {
                          param3.field_e = 1;
                          param3.field_c = 255.0 * Math.random();
                          break L4;
                        }
                      }
                      param0[param1] = 3;
                      if (0 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = param3.field_l.field_f + (double)param3.field_j.field_e;
              var11 = param3.field_l.field_a + (double)param3.field_j.field_g;
              var13 = null;
              param3.field_i = -1;
              var26 = 0;
              L5: while (true) {
                if (var26 >= rc.field_e) {
                  break L0;
                } else {
                  L6: {
                    var27 = re.field_n[var26];
                    var43 = var27;
                    var43 = var27;
                    var28 = var27.field_I;
                    if ((var27.field_i ^ -1) == -1) {
                      var28 = eh.field_g;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var28 <= 0) {
                      break L7;
                    } else {
                      if (20 == var27.field_i) {
                        break L7;
                      } else {
                        if (var27.a((byte) 54)) {
                          break L7;
                        } else {
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
                            L10: {
                              var22 = var27.field_l.field_f + (double)var27.field_j.field_e;
                              var16 = -var29 + var24;
                              var14 = var22 - var29;
                              var18 = var14 + var29 * 2.0;
                              var20 = var29 * 2.0 + var16;
                              var31 = 0;
                              if (null == var27.field_u) {
                                break L10;
                              } else {
                                var32_double = var9 - var4;
                                var34 = -var6 + var11;
                                var36 = -(var27.field_u.field_z >> 1219654337) + (int)(var22 * 24.0);
                                var37 = (int)(var24 * 24.0) + -(var27.field_u.field_A >> 1644465761);
                                var38 = 0.0;
                                L11: while (true) {
                                  L12: {
                                    if (1.0 <= var38) {
                                      break L12;
                                    } else {
                                      if (var31 != 0) {
                                        break L12;
                                      } else {
                                        L13: {
                                          var40 = (int)((var38 * var32_double + var4) * 24.0);
                                          var41 = (int)((var6 + var38 * var34) * 24.0);
                                          if (!var27.field_u.d(var36, var37, var40, var41)) {
                                            stackOut_28_0 = 0;
                                            stackIn_29_0 = stackOut_28_0;
                                            break L13;
                                          } else {
                                            stackOut_27_0 = 1;
                                            stackIn_29_0 = stackOut_27_0;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          var31 = stackIn_29_0;
                                          if (var31 == 0) {
                                            break L14;
                                          } else {
                                            var4 = var4 + var32_double * var38;
                                            var6 = var6 + var38 * var34;
                                            break L14;
                                          }
                                        }
                                        var38 = var38 + 0.05;
                                        if (0 == 0) {
                                          continue L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  if (0 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            L15: {
                              if (!fb.a(var16, (byte) 43, var20, var9, var14, var6, var18, var11, var4)) {
                                if (fb.a(var20, (byte) 43, var16, var9, var14, var6, var18, var11, var4)) {
                                  stackOut_37_0 = 1;
                                  stackIn_39_0 = stackOut_37_0;
                                  break L15;
                                } else {
                                  stackOut_36_0 = 0;
                                  stackIn_39_0 = stackOut_36_0;
                                  break L15;
                                }
                              } else {
                                stackOut_34_0 = 1;
                                stackIn_39_0 = stackOut_34_0;
                                break L15;
                              }
                            }
                            var31 = stackIn_39_0;
                            break L9;
                          }
                          if (var31 == 0) {
                            break L7;
                          } else {
                            L16: {
                              var43 = var27;
                              if (var43.field_I <= 0) {
                                stackOut_43_0 = 0;
                                stackIn_44_0 = stackOut_43_0;
                                break L16;
                              } else {
                                stackOut_42_0 = 1;
                                stackIn_44_0 = stackOut_42_0;
                                break L16;
                              }
                            }
                            L17: {
                              var32 = stackIn_44_0;
                              if (var26 != 0) {
                                break L17;
                              } else {
                                ci.a(5, 58);
                                break L17;
                              }
                            }
                            L18: {
                              if (var26 <= 0) {
                                break L18;
                              } else {
                                if (8 == var43.field_i) {
                                  break L18;
                                } else {
                                  if (!var43.a(19, -100)) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (var43.field_i == 0) {
                                        break L19;
                                      } else {
                                        var43.field_I = var43.field_I - 15;
                                        if (0 == 0) {
                                          break L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    ci.a(15, 102);
                                    break L18;
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
                              if (-1 >= (var43.field_I ^ -1)) {
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
                                if (-1 == (var43.field_i ^ -1)) {
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
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  var26++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L24: {
            param3.field_e = param3.field_e + 1;
            if ((param3.field_e ^ -1) < -33) {
              param3.field_i = -1;
              break L24;
            } else {
              break L24;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (jc.field_b != null) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) jc.field_b;
                    // monitorenter jc.field_b
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        jc.field_b = null;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    if (param0 == 114) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    field_q = -64;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
