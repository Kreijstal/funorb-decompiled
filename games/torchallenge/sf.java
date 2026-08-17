/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private lj field_g;
    private je field_e;
    static int[] field_b;
    private lj field_f;
    static int field_c;
    static lj field_a;
    static ka[][][] field_d;

    final lh a(int param0, byte param1) {
        lh var3 = null;
        byte[] var4 = null;
        lh stackIn_2_0 = null;
        lh stackIn_14_0 = null;
        lh stackIn_16_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = (lh) (this.field_e.a((long)param0, 0));
            if (var3 == null) {
              L1: {
                if (param0 >= 32768) {
                  var4 = this.field_g.c(1, param0 & 32767, 0);
                  break L1;
                } else {
                  var4 = this.field_f.c(1, param0, 0);
                  break L1;
                }
              }
              L2: {
                var3 = new lh();
                if (var4 == null) {
                  break L2;
                } else {
                  var3.a(new uf(var4), (byte) -113);
                  break L2;
                }
              }
              L3: {
                if (param0 >= 32768) {
                  var3.d(0);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (param1 <= -8) {
                this.field_e.a(var3, (byte) 96, (long)param0);
                stackIn_16_0 = (lh) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_14_0 = (lh) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (lh) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3_ref), "sf.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static void a(ka param0, ka[] param1, int param2, int param3, int param4, int param5, byte param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7_int = param4 + (param5 - 1);
              var8 = -1 + (param3 + param2);
              var9 = param1[0].field_q;
              var10 = param1[0].field_v;
              param0.d();
              param1[0].g(param4, param2);
              param1[2].g(-var9 + var7_int, param2);
              param1[6].g(param4, var8 + -var10);
              param1[8].g(var7_int + -var9, -var10 + var8);
              param1[1].d(var9 + param4, param2, -(2 * var9) + param5, var10);
              param1[7].d(param4 + var9, var8 - var10, param5 - var9 * 2, var10);
              param1[3].d(param4, param2 + var10, var9, param3 - var10 * 2);
              if (param6 == -55) {
                break L1;
              } else {
                field_a = (lj) null;
                break L1;
              }
            }
            param1[5].d(var7_int + -var9, param2 - -var10, var9, param3 - var10 * 2);
            param1[4].d(param4 - -var9, param2 + var10, -(var9 * 2) + param5, -(2 * var10) + param3);
            la.field_f.a(-47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("sf.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = 99 / ((72 - param0) / 41);
              var1_int = -1;
              var3 = rj.field_g;
              var4 = cj.field_b ? 1 : 0;
              if ((pg.field_q ^ -1) < -1) {
                pg.field_q = pg.field_q - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (bc.field_o == 1) {
                  break L3;
                } else {
                  L4: {
                    if (bc.field_o != 3) {
                      break L4;
                    } else {
                      if (!ad.field_j) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if ((bc.field_o ^ -1) != 0) {
                      break L5;
                    } else {
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if ((ea.field_e ^ -1) > -1) {
                          break L5;
                        } else {
                          if (wb.field_p == null) {
                            break L5;
                          } else {
                            if ((gl.field_k ^ -1) >= -1) {
                              break L5;
                            } else {
                              if (0 != ea.field_e) {
                                if (-2 == (ea.field_e ^ -1)) {
                                  var1_int = 1;
                                  break L2;
                                } else {
                                  if ((ea.field_e ^ -1) != -3) {
                                    if ((ea.field_e ^ -1) != -4) {
                                      if (-5 == (ea.field_e ^ -1)) {
                                        var1_int = 4;
                                        break L2;
                                      } else {
                                        if ((ea.field_e ^ -1) == -6) {
                                          var1_int = 5;
                                          break L2;
                                        } else {
                                          if (-7 != (ea.field_e ^ -1)) {
                                            if (-8 == (ea.field_e ^ -1)) {
                                              var1_int = 6;
                                              break L2;
                                            } else {
                                              if (8 != ea.field_e) {
                                                break L2;
                                              } else {
                                                var1_int = 6;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var1_int = 6;
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      var1_int = 3;
                                      break L2;
                                    }
                                  } else {
                                    var1_int = 2;
                                    break L2;
                                  }
                                }
                              } else {
                                var1_int = 0;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (13 != bc.field_o) {
                      break L6;
                    } else {
                      L7: {
                        if (-3 == (var3 ^ -1)) {
                          break L7;
                        } else {
                          if ((var3 ^ -1) == -2) {
                            break L7;
                          } else {
                            if (3 != var3) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var1_int = 9;
                      break L2;
                    }
                  }
                  L8: {
                    if ((bc.field_o ^ -1) != -14) {
                      break L8;
                    } else {
                      if (var3 != 4) {
                        break L8;
                      } else {
                        var1_int = -1;
                        break L2;
                      }
                    }
                  }
                  L9: {
                    if (13 != bc.field_o) {
                      break L9;
                    } else {
                      if (-6 != (var3 ^ -1)) {
                        break L9;
                      } else {
                        if (gh.field_x) {
                          var1_int = 11;
                          break L2;
                        } else {
                          var1_int = 10;
                          break L2;
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (13 != bc.field_o) {
                        break L11;
                      } else {
                        if ((var3 ^ -1) == -8) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (-16 == (bc.field_o ^ -1)) {
                      break L10;
                    } else {
                      L12: {
                        if (13 != bc.field_o) {
                          break L12;
                        } else {
                          if (6 == var3) {
                            var1_int = 12;
                            break L2;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if ((bc.field_o ^ -1) == -1) {
                          break L13;
                        } else {
                          if (12 == bc.field_o) {
                            break L13;
                          } else {
                            if (3 == bc.field_o) {
                              break L13;
                            } else {
                              if (2 == bc.field_o) {
                                break L13;
                              } else {
                                if ((bc.field_o ^ -1) != -5) {
                                  if (-1 == bc.field_o) {
                                    break L2;
                                  } else {
                                    var1_int = 8;
                                    break L2;
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                      }
                      var1_int = 7;
                      break L2;
                    }
                  }
                  var1_int = 13;
                  break L2;
                }
              }
              var1_int = ag.field_d;
              break L2;
            }
            L14: {
              if ((ag.field_d ^ -1) != (var1_int ^ -1)) {
                L15: {
                  bd.d(1);
                  if (0 == (var1_int ^ -1)) {
                    break L15;
                  } else {
                    pg.field_q = 10;
                    break L15;
                  }
                }
                ag.field_d = var1_int;
                break L14;
              } else {
                if (-1 != (pg.field_q ^ -1)) {
                  break L14;
                } else {
                  pg.field_q = -1;
                  if (ag.field_d == -1) {
                    break L14;
                  } else {
                    var5 = dd.field_n[var1_int] ? 1 : 0;
                    lg.a(var5 != 0, (byte) -79, al.field_x[var1_int]);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "sf.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
            if (param0) {
                field_c = 84;
            }
            field_d = (ka[][][]) null;
            field_b = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "sf.D(" + param0 + ')');
        }
    }

    private sf() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "sf.<init>()");
        }
    }

    static {
        field_c = 0;
        field_b = new int[12];
        field_d = new ka[4][2][2];
    }
}
