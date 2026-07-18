/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    boolean field_J;
    dk field_h;
    int field_f;
    int field_E;
    int field_j;
    int field_d;
    int field_B;
    boolean field_r;
    boolean field_m;
    private r field_D;
    static ci field_g;
    r[] field_C;
    int field_k;
    hk field_e;
    static rh field_l;
    boolean field_M;
    th field_n;
    private int field_z;
    int field_N;
    r field_q;
    boolean field_b;
    static int[] field_t;
    static ci[] field_p;
    int field_a;
    boolean field_u;
    gi[] field_F;
    int field_i;
    int field_x;
    private boolean field_A;
    String field_K;
    boolean field_v;
    private boolean field_I;
    int field_c;
    private int field_s;
    boolean field_w;
    int field_L;
    static String field_o;
    int field_H;
    int field_y;
    Terraphoenix field_G;

    private final void a(boolean param0, r param1) {
        RuntimeException var3 = null;
        dl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            ((e) this).field_h.b((byte) -109);
            if (!param0) {
              param1.field_w = 1;
              var4 = -1 + param1.field_F;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~(1 + param1.field_F) > ~var4) {
                      break L3;
                    } else {
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var5 = -1 + param1.field_H;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (param1.field_H - -1 < var5) {
                                break L6;
                              } else {
                                var3_ref = ((e) this).field_h.a(107, var5, param1.field_E, var4);
                                if (var6 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (null == var3_ref) {
                                      break L7;
                                    } else {
                                      if (((e) this).field_h.field_g[param1.field_F][param1.field_H] < ((e) this).field_h.field_g[var4][var5]) {
                                        if (var3_ref.a(-param1.field_H + var5, var4 + -param1.field_F, -128) > 50) {
                                          break L7;
                                        } else {
                                          param1.field_jb = 20;
                                          param1.field_d = param1.field_B;
                                          param1.field_w = 0;
                                          param1.field_S = true;
                                          param1.field_r = null;
                                          param1.field_Y = true;
                                          param1.field_n = var5;
                                          param1.field_A = 0;
                                          param1.field_X = var4;
                                          return;
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var4++;
                            break L5;
                          }
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  param1.field_Y = true;
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("e.F(").append(param0).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, ci param5) {
        RuntimeException var7 = null;
        ci var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var23 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var7_ref = u.field_e[param3];
              var8 = param1;
              var8 = var8 + param5.field_p;
              var9 = param4;
              var9 = var9 + param5.field_v;
              var10 = 0;
              var11 = param5.field_p + param1;
              var14 = 104 % ((-39 - param2) / 63);
              var12 = param4 + param5.field_v;
              var13 = param5.field_t;
              var15 = param5.field_r;
              var16 = 0;
              var17 = param5.field_p - -(param5.field_v * var7_ref.field_r);
              if (l.field_d > var9) {
                var19 = l.field_d - var9;
                var17 = var17 + var19 * var15;
                var13 = var13 - var19;
                var9 = l.field_d;
                var12 = var12 + var19;
                var10 = var10 + var15 * var19;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var18 = 64 + -param5.field_r;
              if (var8 < l.field_b) {
                var19 = -var8 + l.field_b;
                var10 = var10 + var19;
                var8 = l.field_b;
                var17 = var17 + var19;
                var15 = var15 - var19;
                var16 = var16 + var19;
                var11 = var11 + var19;
                var18 = var18 + var19;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~l.field_c <= ~(var9 + var13)) {
                break L3;
              } else {
                var13 = var13 - (var13 + (var9 + -l.field_c));
                break L3;
              }
            }
            L4: {
              if (~(var8 - -var15) >= ~l.field_f) {
                break L4;
              } else {
                var19 = -l.field_f + var15 + var8;
                var16 = var16 + var19;
                var18 = var18 + var19;
                var15 = var15 - var19;
                break L4;
              }
            }
            L5: {
              if (0 >= var15) {
                break L5;
              } else {
                if (var13 <= 0) {
                  break L5;
                } else {
                  var20 = var11;
                  var21 = var12;
                  var22 = -(var15 >> -1531228030);
                  var15 = -(3 & var15);
                  var9 = -var13;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var9 >= 0) {
                          break L8;
                        } else {
                          if (var23 != 0) {
                            break L7;
                          } else {
                            var8 = var22;
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (0 <= var8) {
                                    break L11;
                                  } else {
                                    int incrementValue$15 = var10;
                                    var10++;
                                    var19 = param5.field_z[incrementValue$15];
                                    stackOut_25_0 = ~var19;
                                    stackOut_25_1 = -1;
                                    stackIn_66_0 = stackOut_25_0;
                                    stackIn_66_1 = stackOut_25_1;
                                    stackIn_26_0 = stackOut_25_0;
                                    stackIn_26_1 = stackOut_25_1;
                                    if (var23 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        L13: {
                                          if (stackIn_26_0 != stackIn_26_1) {
                                            break L13;
                                          } else {
                                            var20++;
                                            var17++;
                                            if (var23 == 0) {
                                              break L12;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        int incrementValue$16 = var20;
                                        var20++;
                                        int incrementValue$17 = var17;
                                        var17++;
                                        gd.field_a[incrementValue$16][var21] = 144 * param0 + (var21 + var7_ref.field_z[incrementValue$17] / 5);
                                        break L12;
                                      }
                                      L14: {
                                        L15: {
                                          int incrementValue$18 = var10;
                                          var10++;
                                          var19 = param5.field_z[incrementValue$18];
                                          if (var19 != 0) {
                                            break L15;
                                          } else {
                                            var20++;
                                            var17++;
                                            if (var23 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        int incrementValue$19 = var20;
                                        var20++;
                                        int incrementValue$20 = var17;
                                        var17++;
                                        gd.field_a[incrementValue$19][var21] = param0 * 144 + (var21 - -(var7_ref.field_z[incrementValue$20] / 5));
                                        break L14;
                                      }
                                      L16: {
                                        L17: {
                                          int incrementValue$21 = var10;
                                          var10++;
                                          var19 = param5.field_z[incrementValue$21];
                                          if (0 != var19) {
                                            break L17;
                                          } else {
                                            var20++;
                                            var17++;
                                            if (var23 == 0) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        int incrementValue$22 = var20;
                                        var20++;
                                        int incrementValue$23 = var17;
                                        var17++;
                                        gd.field_a[incrementValue$22][var21] = var21 + (param0 * 144 + var7_ref.field_z[incrementValue$23] / 5);
                                        break L16;
                                      }
                                      L18: {
                                        L19: {
                                          int incrementValue$24 = var10;
                                          var10++;
                                          var19 = param5.field_z[incrementValue$24];
                                          if (var19 != 0) {
                                            break L19;
                                          } else {
                                            var20++;
                                            var17++;
                                            if (var23 == 0) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        int incrementValue$25 = var20;
                                        var20++;
                                        int incrementValue$26 = var17;
                                        var17++;
                                        gd.field_a[incrementValue$25][var21] = var21 - -(param0 * 144) + var7_ref.field_z[incrementValue$26] / 5;
                                        break L18;
                                      }
                                      var8++;
                                      if (var23 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                var8 = var15;
                                L20: while (true) {
                                  L21: {
                                    if (var8 >= 0) {
                                      break L21;
                                    } else {
                                      int incrementValue$27 = var10;
                                      var10++;
                                      var19 = param5.field_z[incrementValue$27];
                                      stackOut_55_0 = -1;
                                      stackOut_55_1 = ~var19;
                                      stackIn_66_0 = stackOut_55_0;
                                      stackIn_66_1 = stackOut_55_1;
                                      stackIn_56_0 = stackOut_55_0;
                                      stackIn_56_1 = stackOut_55_1;
                                      if (var23 != 0) {
                                        break L10;
                                      } else {
                                        L22: {
                                          L23: {
                                            if (stackIn_56_0 != stackIn_56_1) {
                                              break L23;
                                            } else {
                                              var17++;
                                              var20++;
                                              if (var23 == 0) {
                                                break L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          int incrementValue$28 = var20;
                                          var20++;
                                          int incrementValue$29 = var17;
                                          var17++;
                                          gd.field_a[incrementValue$28][var21] = 144 * param0 + (var21 + var7_ref.field_z[incrementValue$29] / 5);
                                          break L22;
                                        }
                                        var8++;
                                        if (var23 == 0) {
                                          continue L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                  var17 = var17 + var18;
                                  var20 = var11;
                                  stackOut_65_0 = var10;
                                  stackOut_65_1 = var16;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  break L10;
                                }
                              }
                              var10 = stackIn_66_0 + stackIn_66_1;
                              var21++;
                              var9++;
                              if (var23 == 0) {
                                continue L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      break L7;
                    }
                    break L0;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var7;
            stackOut_68_1 = new StringBuilder().append("e.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param5 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L24;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L24;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ')');
        }
    }

    final static void a(byte param0) {
        if (!ib.p(86)) {
            return;
        }
        try {
            int var1_int = -25 / ((param0 - 65) / 50);
            ja.a(-110, false, 4);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "e.L(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        th var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var3 = ((e) this).field_n;
              if (param0 == 29518) {
                break L1;
              } else {
                this.a((Terraphoenix) null, false);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var3 == null) {
                      break L5;
                    } else {
                      stackOut_5_0 = ~param1;
                      stackOut_5_1 = ~var3.field_a;
                      stackIn_13_0 = stackOut_5_0;
                      stackIn_13_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (stackIn_6_0 == stackIn_6_1) {
                          break L5;
                        } else {
                          var3 = var3.field_f;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_11_0 = ~param1;
                    stackOut_11_1 = ~var3.field_a;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L4;
                  }
                }
                if (stackIn_13_0 == stackIn_13_1) {
                  if (var3.field_h) {
                    break L3;
                  } else {
                    var3.field_h = true;
                    var3.field_d = 250;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "e.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              L2: {
                if (!((e) this).field_G.field_db) {
                  break L2;
                } else {
                  qd.a((byte) 69, 11);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (1 != ((e) this).field_G.field_Bb) {
                  break L3;
                } else {
                  qd.a((byte) 26, 13);
                  break L3;
                }
              }
              L4: {
                if (((e) this).field_G.field_Bb == 2) {
                  qd.a((byte) 113, 11);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (((e) this).field_G.field_Bb != 3) {
                  break L5;
                } else {
                  qd.a((byte) 104, 11);
                  break L5;
                }
              }
              L6: {
                if (4 == ((e) this).field_G.field_Bb) {
                  qd.a((byte) 122, 11);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (((e) this).field_G.field_Bb == 5) {
                  qd.a((byte) 76, 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (((e) this).field_G.field_Bb != 6) {
                  break L8;
                } else {
                  qd.a((byte) 58, 11);
                  break L8;
                }
              }
              L9: {
                if (7 != ((e) this).field_G.field_Bb) {
                  break L9;
                } else {
                  qd.a((byte) 32, 5);
                  break L9;
                }
              }
              L10: {
                if (((e) this).field_G.field_Bb != 8) {
                  break L10;
                } else {
                  qd.a((byte) 44, 11);
                  break L10;
                }
              }
              L11: {
                if (((e) this).field_G.field_Bb != 9) {
                  break L11;
                } else {
                  qd.a((byte) 24, 5);
                  break L11;
                }
              }
              L12: {
                if (((e) this).field_G.field_Bb == 10) {
                  qd.a((byte) 52, 11);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (((e) this).field_G.field_Bb == 11) {
                  qd.a((byte) 53, 4);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (((e) this).field_G.field_Bb == 12) {
                  qd.a((byte) 29, 11);
                  break L14;
                } else {
                  break L14;
                }
              }
              if (13 != ((e) this).field_G.field_Bb) {
                break L1;
              } else {
                qd.a((byte) 70, 11);
                break L1;
              }
            }
            L15: {
              if (param0 <= -74) {
                break L15;
              } else {
                ((e) this).field_B = 101;
                break L15;
              }
            }
            var2_int = 0;
            L16: while (true) {
              L17: {
                L18: {
                  if (~var2_int <= ~((e) this).field_C.length) {
                    break L18;
                  } else {
                    if (var3 != 0) {
                      break L17;
                    } else {
                      L19: {
                        if (null != ((e) this).field_C[var2_int]) {
                          L20: {
                            if (((e) this).field_C[var2_int].field_Z == null) {
                              break L20;
                            } else {
                              L21: {
                                L22: {
                                  if (((e) this).field_G.field_Bb == 5) {
                                    break L22;
                                  } else {
                                    if (((e) this).field_G.field_Bb == 7) {
                                      break L22;
                                    } else {
                                      if (((e) this).field_G.field_Bb != 9) {
                                        break L21;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                                ((e) this).field_C[var2_int].field_h = true;
                                ((e) this).field_C[var2_int].field_R = ((e) this).field_C[var2_int].field_E;
                                ((e) this).field_C[var2_int].field_i = ((e) this).field_C[var2_int].field_F;
                                ((e) this).field_C[var2_int].field_gb = ((e) this).field_C[var2_int].field_H;
                                break L21;
                              }
                              L23: {
                                L24: {
                                  if (!((e) this).field_J) {
                                    break L24;
                                  } else {
                                    ((e) this).field_C[var2_int].b(60);
                                    if (var3 == 0) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                ((e) this).field_C[var2_int].b(60);
                                ((e) this).field_C[var2_int].field_jb = 0;
                                break L23;
                              }
                              L25: {
                                if (null != ((e) this).field_q) {
                                  break L25;
                                } else {
                                  ((e) this).field_q = ((e) this).field_C[var2_int];
                                  break L25;
                                }
                              }
                              ((e) this).field_C[var2_int].a(false);
                              if (var3 == 0) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L26: {
                            if (!((e) this).field_J) {
                              break L26;
                            } else {
                              ((e) this).field_C[var2_int].b(60);
                              ((e) this).field_C[var2_int].field_q = -(int)(Math.random() * (double)((e) this).field_C[var2_int].field_jb);
                              if (var3 == 0) {
                                break L19;
                              } else {
                                break L26;
                              }
                            }
                          }
                          ((e) this).field_C[var2_int].b(60);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L16;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "e.I(" + param0 + ')');
        }
    }

    private final int a(byte param0, r param1, r param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2.field_F + -param1.field_F;
              var5 = -param1.field_H + param2.field_H;
              if (param0 == -60) {
                break L1;
              } else {
                ((e) this).field_i = 27;
                break L1;
              }
            }
            stackOut_3_0 = (int)Math.sqrt((double)(var4_int * var4_int + var5 * var5));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("e.R(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(Terraphoenix param0, boolean param1) {
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        Object var4_ref = null;
        dl var5 = null;
        int var5_int = 0;
        oh var5_ref = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        r stackIn_9_0 = null;
        r stackIn_9_1 = null;
        r stackIn_21_0 = null;
        r stackIn_37_0 = null;
        r stackIn_97_0 = null;
        r stackIn_98_0 = null;
        r stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        r stackIn_224_0 = null;
        r stackIn_225_0 = null;
        r stackIn_226_0 = null;
        int stackIn_226_1 = 0;
        r stackIn_380_0 = null;
        r stackIn_380_1 = null;
        int stackIn_392_0 = 0;
        int stackIn_393_0 = 0;
        int stackIn_394_0 = 0;
        int stackIn_394_1 = 0;
        int stackIn_397_0 = 0;
        r stackIn_458_0 = null;
        ga stackIn_470_0 = null;
        r stackIn_475_0 = null;
        ga stackIn_477_0 = null;
        int stackIn_580_0 = 0;
        int stackIn_581_0 = 0;
        int stackIn_582_0 = 0;
        int stackIn_582_1 = 0;
        int stackIn_650_0 = 0;
        int stackIn_651_0 = 0;
        int stackIn_652_0 = 0;
        int stackIn_652_1 = 0;
        r stackOut_8_0 = null;
        r stackOut_8_1 = null;
        r stackOut_20_0 = null;
        r stackOut_36_0 = null;
        r stackOut_96_0 = null;
        r stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        r stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        r stackOut_223_0 = null;
        r stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        r stackOut_224_0 = null;
        int stackOut_224_1 = 0;
        r stackOut_379_0 = null;
        r stackOut_379_1 = null;
        int stackOut_391_0 = 0;
        int stackOut_393_0 = 0;
        int stackOut_393_1 = 0;
        int stackOut_392_0 = 0;
        int stackOut_392_1 = 0;
        int stackOut_396_0 = 0;
        int stackOut_395_0 = 0;
        r stackOut_457_0 = null;
        ga stackOut_469_0 = null;
        r stackOut_474_0 = null;
        ga stackOut_476_0 = null;
        int stackOut_579_0 = 0;
        int stackOut_581_0 = 0;
        int stackOut_581_1 = 0;
        int stackOut_580_0 = 0;
        int stackOut_580_1 = 0;
        int stackOut_649_0 = 0;
        int stackOut_651_0 = 0;
        int stackOut_651_1 = 0;
        int stackOut_650_0 = 0;
        int stackOut_650_1 = 0;
        L0: {
          var9 = Terraphoenix.field_V;
          if (le.field_q == null) {
            break L0;
          } else {
            le.field_q.field_g = ((e) this).field_y;
            le.field_q.field_z = ((e) this).field_N;
            le.field_q.field_c = ((e) this).field_j;
            if (le.field_q.b(0)) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  if (null == ((e) this).field_q) {
                    break L5;
                  } else {
                    if (((e) this).field_q.field_P > 0) {
                      break L5;
                    } else {
                      this.b((byte) -3);
                      var3_int = 0;
                      var4 = 0;
                      L6: while (true) {
                        L7: {
                          if (var4 >= 12) {
                            break L7;
                          } else {
                            stackOut_8_0 = ((e) this).field_q;
                            stackOut_8_1 = ((e) this).field_C[var4];
                            stackIn_380_0 = stackOut_8_0;
                            stackIn_380_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L8: {
                                if (stackIn_9_0 != stackIn_9_1) {
                                  break L8;
                                } else {
                                  var3_int = var4;
                                  break L8;
                                }
                              }
                              var4++;
                              if (var9 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var4 = 0;
                        L9: while (true) {
                          L10: {
                            var4++;
                            var3_int++;
                            if (12 <= var3_int) {
                              var3_int -= 12;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (var4 >= 12) {
                              break L11;
                            } else {
                              if (((e) this).field_C[var3_int] == null) {
                                continue L9;
                              } else {
                                stackOut_20_0 = ((e) this).field_C[var3_int];
                                stackIn_37_0 = stackOut_20_0;
                                stackIn_21_0 = stackOut_20_0;
                                if (var9 != 0) {
                                  break L4;
                                } else {
                                  if (stackIn_21_0.field_Z == null) {
                                    continue L9;
                                  } else {
                                    if (0 >= ((e) this).field_C[var3_int].field_jb) {
                                      continue L9;
                                    } else {
                                      if (0 >= ((e) this).field_C[var3_int].field_P) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L12: {
                            if (null == ((e) this).field_C[var3_int]) {
                              break L12;
                            } else {
                              if (null == ((e) this).field_C[var3_int].field_Z) {
                                break L12;
                              } else {
                                if (((e) this).field_C[var3_int].field_P <= 0) {
                                  break L12;
                                } else {
                                  ((e) this).field_q = ((e) this).field_C[var3_int];
                                  sj.field_b = (((e) this).field_q.field_F + -((e) this).field_q.field_H) * 32;
                                  lg.field_c = 16 * (((e) this).field_q.field_F - -((e) this).field_q.field_H) - ((e) this).field_q.field_E * 48;
                                  eg.field_p = ((e) this).field_q.field_E;
                                  break L12;
                                }
                              }
                            }
                          }
                          L13: {
                            if (7 > ((e) this).field_B) {
                              break L13;
                            } else {
                              if (10 <= ((e) this).field_B) {
                                break L13;
                              } else {
                                ((e) this).field_B = ((e) this).field_B + 1;
                                break L13;
                              }
                            }
                          }
                          ((e) this).a(-1);
                          ((e) this).field_m = false;
                          ((e) this).field_L = 0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                stackOut_36_0 = ((e) this).field_q;
                stackIn_37_0 = stackOut_36_0;
                break L4;
              }
              L14: {
                if (stackIn_37_0 == null) {
                  break L14;
                } else {
                  if (((e) this).field_q.field_b != null) {
                    break L14;
                  } else {
                    ((e) this).field_m = false;
                    break L14;
                  }
                }
              }
              L15: {
                if (1 == ((e) this).field_N) {
                  if (!gj.a((e) this, ((e) this).field_y, (byte) 114, ((e) this).field_j)) {
                    break L15;
                  } else {
                    return;
                  }
                } else {
                  break L15;
                }
              }
              L16: {
                if (((e) this).field_j >= 365) {
                  break L16;
                } else {
                  if (((e) this).field_j <= 39) {
                    break L16;
                  } else {
                    L17: {
                      if (null == ((e) this).field_q) {
                        break L17;
                      } else {
                        if (((e) this).field_q.field_P > 0) {
                          break L17;
                        } else {
                          return;
                        }
                      }
                    }
                    L18: {
                      var3 = null;
                      var4_ref = null;
                      if (!ha.field_o) {
                        L19: {
                          var5 = ((e) this).field_h.a(94, vf.field_a, cm.field_d, uf.field_c);
                          if (null == ((e) this).field_q) {
                            break L19;
                          } else {
                            if (uf.field_c == -1) {
                              break L19;
                            } else {
                              L20: {
                                var3 = (Object) (Object) ke.field_g;
                                var4_ref = (Object) (Object) va.field_b;
                                if (uf.field_c != ql.field_i) {
                                  break L20;
                                } else {
                                  if (~vf.field_a != ~ld.field_e) {
                                    break L20;
                                  } else {
                                    var3 = (Object) (Object) wg.field_k;
                                    if (null == var5) {
                                      break L20;
                                    } else {
                                      if (var5.field_w) {
                                        var3 = (Object) (Object) bm.field_b;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                              }
                              if (((e) this).field_w) {
                                L21: {
                                  var3 = (Object) (Object) rl.field_c;
                                  if (oh.field_f == 0) {
                                    break L21;
                                  } else {
                                    sj.field_b = 32 * uf.field_c + -(32 * vf.field_a);
                                    lg.field_c = -(eg.field_p * 48) + vf.field_a * 16 + 16 * uf.field_c;
                                    break L21;
                                  }
                                }
                                var4_ref = null;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        L22: {
                          if (var5 == null) {
                            break L22;
                          } else {
                            if (null == var5.field_h) {
                              break L22;
                            } else {
                              if (var5.field_h.field_C != 0) {
                                break L22;
                              } else {
                                if (var5.field_h.field_Z == null) {
                                  break L22;
                                } else {
                                  var3 = (Object) (Object) (ef.field_a + var5.field_h.field_Z.b(1));
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        if (null == var5) {
                          break L18;
                        } else {
                          L23: {
                            L24: {
                              if (null == var5.field_h) {
                                break L24;
                              } else {
                                if (var5.field_h.field_C == 0) {
                                  break L24;
                                } else {
                                  if (var5.field_h.field_k) {
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            if (((e) this).field_L != 1) {
                              break L18;
                            } else {
                              break L23;
                            }
                          }
                          L25: {
                            var3 = (Object) (Object) q.field_Fb;
                            if (!((e) this).field_m) {
                              break L25;
                            } else {
                              var3 = (Object) (Object) hm.field_G;
                              break L25;
                            }
                          }
                          L26: {
                            if (((e) this).field_L != 1) {
                              break L26;
                            } else {
                              var4_ref = (Object) (Object) cm.field_a;
                              break L26;
                            }
                          }
                          L27: {
                            var6 = ((e) this).field_q.field_U;
                            var7 = ((e) this).field_q.field_ab;
                            ((e) this).field_q.a(true, uf.field_c, vf.field_a);
                            if (Math.abs(var6 - ((e) this).field_q.field_U) < 2) {
                              break L27;
                            } else {
                              if (Math.abs(-((e) this).field_q.field_U + var6) > 6) {
                                break L27;
                              } else {
                                ((e) this).field_q.field_ab = 0;
                                break L27;
                              }
                            }
                          }
                          L28: {
                            stackOut_96_0 = ((e) this).field_q;
                            stackIn_98_0 = stackOut_96_0;
                            stackIn_97_0 = stackOut_96_0;
                            if (param1) {
                              stackOut_98_0 = (r) (Object) stackIn_98_0;
                              stackOut_98_1 = 0;
                              stackIn_99_0 = stackOut_98_0;
                              stackIn_99_1 = stackOut_98_1;
                              break L28;
                            } else {
                              stackOut_97_0 = (r) (Object) stackIn_97_0;
                              stackOut_97_1 = 1;
                              stackIn_99_0 = stackOut_97_0;
                              stackIn_99_1 = stackOut_97_1;
                              break L28;
                            }
                          }
                          L29: {
                            var8 = ((r) (Object) stackIn_99_0).c(stackIn_99_1 != 0);
                            ((e) this).field_q.field_ab = var7;
                            if (var5.field_A != ((e) this).field_q.field_F) {
                              break L29;
                            } else {
                              if (var5.field_n != ((e) this).field_q.field_H) {
                                break L29;
                              } else {
                                var3 = var4_ref;
                                var4_ref = null;
                                break L29;
                              }
                            }
                          }
                          L30: {
                            ((e) this).field_q.field_U = var6;
                            if (((e) this).field_m) {
                              var8 = 15;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (((e) this).field_q.field_jb >= var8) {
                              break L31;
                            } else {
                              L32: {
                                if (-10 + var8 > ((e) this).field_q.field_jb) {
                                  break L32;
                                } else {
                                  if (((e) this).field_m) {
                                    break L32;
                                  } else {
                                    if (10 <= ((e) this).field_q.field_jb) {
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                              }
                              var3 = (Object) (Object) m.field_h;
                              break L31;
                            }
                          }
                          if (((e) this).field_m) {
                            break L18;
                          } else {
                            if (((e) this).field_q.field_nb.field_c > 0) {
                              break L18;
                            } else {
                              if (7 == ((e) this).field_q.field_nb.field_g) {
                                break L18;
                              } else {
                                if (((e) this).field_q.field_nb.field_g != 6) {
                                  var4_ref = null;
                                  var3 = (Object) (Object) (fl.field_d + "<br>" + ql.field_f);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                    L33: {
                      if (2 != ((e) this).field_N) {
                        break L33;
                      } else {
                        L34: {
                          if (!ha.field_o) {
                            break L34;
                          } else {
                            if (5 <= ((e) this).field_B) {
                              break L34;
                            } else {
                              break L33;
                            }
                          }
                        }
                        L35: {
                          this.b((byte) -3);
                          qd.a((byte) 39, 34);
                          if (((e) this).field_B != 5) {
                            break L35;
                          } else {
                            ((e) this).field_B = 6;
                            break L35;
                          }
                        }
                        L36: {
                          L37: {
                            if (((e) this).field_L > 0) {
                              break L37;
                            } else {
                              if (!((e) this).field_m) {
                                break L36;
                              } else {
                                break L37;
                              }
                            }
                          }
                          ((e) this).field_L = 0;
                          ((e) this).field_m = false;
                          if (var9 == 0) {
                            break L33;
                          } else {
                            break L36;
                          }
                        }
                        if (0 >= ((e) this).field_q.field_jb) {
                          break L33;
                        } else {
                          if (((e) this).field_w) {
                            break L33;
                          } else {
                            var5_int = ((e) this).field_q.field_U;
                            ((e) this).field_q.a(true, uf.field_c, vf.field_a);
                            ok.field_i = true;
                            if (~var5_int != ~((e) this).field_q.field_U) {
                              ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - 1;
                              ((e) this).field_q.field_ab = 0;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                    }
                    L38: {
                      if (((e) this).field_m) {
                        ((e) this).field_L = 1;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    L39: {
                      L40: {
                        L41: {
                          if (uf.field_c == -1) {
                            break L41;
                          } else {
                            L42: {
                              L43: {
                                if (oh.field_f != 1) {
                                  break L43;
                                } else {
                                  if (!((e) this).field_m) {
                                    break L42;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              if (((e) this).field_N != 1) {
                                break L41;
                              } else {
                                break L42;
                              }
                            }
                            if (((e) this).field_L <= 0) {
                              break L41;
                            } else {
                              L44: {
                                if (!ha.field_o) {
                                  break L44;
                                } else {
                                  if (4 > ((e) this).field_B) {
                                    break L41;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              if (uf.field_c != ((e) this).field_q.field_F) {
                                break L40;
                              } else {
                                if (~((e) this).field_q.field_H != ~vf.field_a) {
                                  break L40;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                        }
                        if (((e) this).field_N != 1) {
                          break L39;
                        } else {
                          if (((e) this).field_L != 0) {
                            break L39;
                          } else {
                            L45: {
                              L46: {
                                qd.a((byte) 45, 22);
                                ok.field_i = true;
                                var5 = ((e) this).field_h.a(117, vf.field_a, cm.field_d, uf.field_c);
                                ((e) this).field_m = false;
                                if (((e) this).field_q == null) {
                                  break L46;
                                } else {
                                  L47: {
                                    L48: {
                                      if (!ha.field_o) {
                                        break L48;
                                      } else {
                                        if (((e) this).field_B >= 8) {
                                          break L48;
                                        } else {
                                          L49: {
                                            if (((e) this).field_B != 0) {
                                              break L49;
                                            } else {
                                              if (uf.field_c < 8) {
                                                break L49;
                                              } else {
                                                if (uf.field_c > 10) {
                                                  break L49;
                                                } else {
                                                  if (vf.field_a == 4) {
                                                    break L48;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (((e) this).field_B != 2) {
                                            break L47;
                                          } else {
                                            if (8 > uf.field_c) {
                                              break L47;
                                            } else {
                                              if (uf.field_c > 10) {
                                                break L47;
                                              } else {
                                                if (vf.field_a != 8) {
                                                  break L47;
                                                } else {
                                                  break L48;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (!((e) this).field_w) {
                                      ((e) this).field_q.field_n = vf.field_a;
                                      ((e) this).field_q.field_S = true;
                                      ((e) this).field_q.field_r = null;
                                      ((e) this).field_q.field_A = 0;
                                      ((e) this).field_q.field_d = ((e) this).field_q.field_B;
                                      ((e) this).field_q.field_X = uf.field_c;
                                      ((e) this).field_q.field_N = cm.field_d;
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  }
                                  L50: {
                                    if (null != var5) {
                                      break L50;
                                    } else {
                                      this.b((byte) -3);
                                      ((e) this).field_q.field_S = false;
                                      if (var9 == 0) {
                                        break L45;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  L51: {
                                    if (var5.field_h == null) {
                                      break L51;
                                    } else {
                                      if (var5.field_h.field_C != 0) {
                                        break L51;
                                      } else {
                                        if (var5.field_h.field_Z == null) {
                                          break L51;
                                        } else {
                                          L52: {
                                            if (!ha.field_o) {
                                              break L52;
                                            } else {
                                              if (7 > ((e) this).field_B) {
                                                break L51;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                          L53: {
                                            ((e) this).field_q.field_S = false;
                                            if (7 > ((e) this).field_B) {
                                              break L53;
                                            } else {
                                              if (((e) this).field_B >= 10) {
                                                break L53;
                                              } else {
                                                ((e) this).field_B = ((e) this).field_B + 1;
                                                break L53;
                                              }
                                            }
                                          }
                                          ((e) this).field_q = ((e) this).field_h.a(102, vf.field_a, cm.field_d, uf.field_c).field_h;
                                          ((e) this).a(-1);
                                          ((e) this).field_m = false;
                                          ((e) this).field_L = 0;
                                          break L51;
                                        }
                                      }
                                    }
                                  }
                                  L54: {
                                    if (var5.field_h == null) {
                                      break L54;
                                    } else {
                                      if (var5.field_h.field_C != 1) {
                                        break L54;
                                      } else {
                                        if (!var5.field_h.field_k) {
                                          break L54;
                                        } else {
                                          L55: {
                                            if (!ha.field_o) {
                                              break L55;
                                            } else {
                                              if (5 <= ((e) this).field_B) {
                                                break L55;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          }
                                          L56: {
                                            ((e) this).field_q.field_X = uf.field_c;
                                            ((e) this).field_q.field_d = 2;
                                            ((e) this).field_q.field_N = cm.field_d;
                                            ok.field_i = true;
                                            ((e) this).field_q.field_n = vf.field_a;
                                            ((e) this).field_q.field_S = true;
                                            ((e) this).field_q.field_A = 0;
                                            if (!((e) this).field_m) {
                                              break L56;
                                            } else {
                                              ((e) this).field_q.field_d = 4;
                                              break L56;
                                            }
                                          }
                                          L57: {
                                            var6 = ((e) this).field_q.field_U;
                                            var7 = ((e) this).field_q.field_ab;
                                            ((e) this).field_q.a(param1, ((e) this).field_q.field_X, ((e) this).field_q.field_n);
                                            stackOut_223_0 = ((e) this).field_q;
                                            stackIn_225_0 = stackOut_223_0;
                                            stackIn_224_0 = stackOut_223_0;
                                            if (param1) {
                                              stackOut_225_0 = (r) (Object) stackIn_225_0;
                                              stackOut_225_1 = 0;
                                              stackIn_226_0 = stackOut_225_0;
                                              stackIn_226_1 = stackOut_225_1;
                                              break L57;
                                            } else {
                                              stackOut_224_0 = (r) (Object) stackIn_224_0;
                                              stackOut_224_1 = 1;
                                              stackIn_226_0 = stackOut_224_0;
                                              stackIn_226_1 = stackOut_224_1;
                                              break L57;
                                            }
                                          }
                                          L58: {
                                            var8 = ((r) (Object) stackIn_226_0).c(stackIn_226_1 != 0);
                                            if (Math.abs(var6 + -((e) this).field_q.field_U) < 2) {
                                              break L58;
                                            } else {
                                              if (Math.abs(-((e) this).field_q.field_U + var6) <= 6) {
                                                ((e) this).field_q.field_ab = 0;
                                                break L58;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                          L59: {
                                            ((e) this).field_q.field_ab = var7;
                                            if (!((e) this).field_m) {
                                              break L59;
                                            } else {
                                              var8 = 15;
                                              break L59;
                                            }
                                          }
                                          L60: {
                                            ((e) this).field_q.field_U = var6;
                                            if (((e) this).field_q.field_jb >= var8) {
                                              break L60;
                                            } else {
                                              L61: {
                                                if (((e) this).field_q.field_jb < 10) {
                                                  break L61;
                                                } else {
                                                  if (((e) this).field_m) {
                                                    break L61;
                                                  } else {
                                                    if (10 > ((e) this).field_q.field_jb) {
                                                      break L61;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                }
                                              }
                                              ((e) this).field_q.field_S = false;
                                              break L60;
                                            }
                                          }
                                          L62: {
                                            if (((e) this).field_q.field_nb.field_c != 0) {
                                              break L62;
                                            } else {
                                              if (((e) this).field_m) {
                                                break L62;
                                              } else {
                                                ((e) this).field_q.field_S = false;
                                                break L62;
                                              }
                                            }
                                          }
                                          if (!((e) this).field_q.field_S) {
                                            break L54;
                                          } else {
                                            if (((e) this).field_m) {
                                              ((e) this).field_L = 0;
                                              break L54;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L63: {
                                    if (!((e) this).field_q.field_S) {
                                      break L63;
                                    } else {
                                      if (((e) this).field_q.field_d == 2) {
                                        break L63;
                                      } else {
                                        if (((e) this).field_q.field_d == 4) {
                                          break L63;
                                        } else {
                                          if (((e) this).field_w) {
                                            break L45;
                                          } else {
                                            L64: {
                                              L65: {
                                                if (-1 == var5.field_v) {
                                                  break L65;
                                                } else {
                                                  if (var5.field_v == 2) {
                                                    break L65;
                                                  } else {
                                                    if (var5.field_v != 3) {
                                                      break L64;
                                                    } else {
                                                      break L65;
                                                    }
                                                  }
                                                }
                                              }
                                              ql.field_i = uf.field_c;
                                              fi.field_m = null;
                                              ((e) this).field_q.field_S = false;
                                              ld.field_e = vf.field_a;
                                              og.field_d = -1;
                                              if (var9 == 0) {
                                                break L45;
                                              } else {
                                                break L64;
                                              }
                                            }
                                            L66: {
                                              if (ql.field_i != uf.field_c) {
                                                break L66;
                                              } else {
                                                if (ld.field_e != vf.field_a) {
                                                  break L66;
                                                } else {
                                                  L67: {
                                                    if (fi.field_m == null) {
                                                      break L67;
                                                    } else {
                                                      if (Math.random() * 100.0 >= (double)fi.field_m.a(param1)) {
                                                        break L67;
                                                      } else {
                                                        L68: {
                                                          var6_ref_int__ = new int[]{2, 10, 11};
                                                          var7_ref_int__ = new int[]{15, 20, 21};
                                                          if (((e) this).field_q.field_Z.field_y) {
                                                            qd.a((byte) 54, var6_ref_int__[(int)(Math.random() * (double)var6_ref_int__.length)]);
                                                            break L68;
                                                          } else {
                                                            break L68;
                                                          }
                                                        }
                                                        if (((e) this).field_q.field_Z.field_y) {
                                                          break L67;
                                                        } else {
                                                          qd.a((byte) 125, var7_ref_int__[(int)(Math.random() * (double)var7_ref_int__.length)]);
                                                          break L67;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  this.b((byte) -3);
                                                  if (((e) this).field_B != 0) {
                                                    break L45;
                                                  } else {
                                                    ((e) this).field_B = 1;
                                                    if (var9 == 0) {
                                                      break L45;
                                                    } else {
                                                      break L66;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            ql.field_i = uf.field_c;
                                            ld.field_e = vf.field_a;
                                            og.field_d = -1;
                                            ((e) this).field_q.field_S = false;
                                            ((e) this).field_q.field_c.field_h = null;
                                            fi.field_m = ((e) this).field_h.a(false, ((e) this).field_q.field_n, ((e) this).field_q.field_H, -89, true, ((e) this).field_q.field_N, ((e) this).field_q.field_E, ((e) this).field_q.field_X, ((e) this).field_q.field_F);
                                            ((e) this).field_q.field_c.field_h = ((e) this).field_q;
                                            if (fi.field_m == null) {
                                              break L45;
                                            } else {
                                              og.field_d = fi.field_m.a(param1);
                                              if (var9 == 0) {
                                                break L45;
                                              } else {
                                                break L63;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.b((byte) -3);
                                  if (var9 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (null != var5) {
                                if (null == var5.field_h) {
                                  break L45;
                                } else {
                                  if (0 != var5.field_h.field_C) {
                                    break L45;
                                  } else {
                                    if (null != var5.field_h.field_Z) {
                                      this.b((byte) -3);
                                      ((e) this).field_m = false;
                                      ((e) this).field_q = var5.field_h;
                                      ((e) this).field_L = 0;
                                      ((e) this).a(-1);
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                              } else {
                                break L45;
                              }
                            }
                            if (var9 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                      L69: {
                        this.b((byte) -3);
                        ((e) this).field_q.field_X = uf.field_c;
                        ok.field_i = true;
                        if (((e) this).field_B != 4) {
                          break L69;
                        } else {
                          ((e) this).field_B = 5;
                          break L69;
                        }
                      }
                      L70: {
                        ((e) this).field_q.field_n = vf.field_a;
                        ((e) this).field_q.field_N = cm.field_d;
                        ((e) this).field_q.field_d = 2;
                        ((e) this).field_q.field_S = true;
                        if (!((e) this).field_m) {
                          break L70;
                        } else {
                          ((e) this).field_q.field_d = 4;
                          break L70;
                        }
                      }
                      L71: {
                        ((e) this).field_q.field_A = 0;
                        var5_int = ((e) this).field_q.field_U;
                        var6 = ((e) this).field_q.field_ab;
                        ((e) this).field_q.a(true, uf.field_c, vf.field_a);
                        if (Math.abs(-((e) this).field_q.field_U + var5_int) < 2) {
                          break L71;
                        } else {
                          if (Math.abs(-((e) this).field_q.field_U + var5_int) <= 6) {
                            ((e) this).field_q.field_ab = 0;
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                      }
                      L72: {
                        var7 = ((e) this).field_q.c(false);
                        if (!((e) this).field_m) {
                          break L72;
                        } else {
                          var7 = 15;
                          break L72;
                        }
                      }
                      L73: {
                        ((e) this).field_q.field_U = var5_int;
                        ((e) this).field_q.field_ab = var6;
                        if (~var7 >= ~((e) this).field_q.field_jb) {
                          break L73;
                        } else {
                          L74: {
                            if (~((e) this).field_q.field_jb > ~(var7 - 10)) {
                              break L74;
                            } else {
                              if (((e) this).field_m) {
                                break L74;
                              } else {
                                if (((e) this).field_q.field_jb < 10) {
                                  break L74;
                                } else {
                                  break L73;
                                }
                              }
                            }
                          }
                          ((e) this).field_q.field_S = false;
                          break L73;
                        }
                      }
                      L75: {
                        if (((e) this).field_q.field_nb.field_c != 0) {
                          break L75;
                        } else {
                          if (!((e) this).field_m) {
                            ((e) this).field_q.field_S = false;
                            break L75;
                          } else {
                            break L75;
                          }
                        }
                      }
                      if (!((e) this).field_q.field_S) {
                        break L39;
                      } else {
                        if (((e) this).field_m) {
                          ((e) this).field_L = 0;
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L76: {
                      L77: {
                        L78: {
                          if (null == var3) {
                            break L78;
                          } else {
                            if (null != var4_ref) {
                              break L77;
                            } else {
                              break L78;
                            }
                          }
                        }
                        L79: {
                          if (var3 != null) {
                            param0.field_Eb = new String[1];
                            param0.field_Eb[0] = (String) var3;
                            break L79;
                          } else {
                            break L79;
                          }
                        }
                        if (null != var4_ref) {
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = (String) var4_ref;
                          if (var9 == 0) {
                            break L76;
                          } else {
                            break L77;
                          }
                        } else {
                          break L76;
                        }
                      }
                      param0.field_Eb = new String[2];
                      param0.field_Eb[1] = (String) var4_ref;
                      param0.field_Eb[0] = (String) var3;
                      break L76;
                    }
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              L80: {
                var3_int = ((e) this).field_y;
                var4 = ((e) this).field_j - 385;
                if (var3_int < 99) {
                  break L80;
                } else {
                  if (var3_int >= 125) {
                    break L80;
                  } else {
                    if (var4 < 66) {
                      break L80;
                    } else {
                      if (var4 >= 92) {
                        break L80;
                      } else {
                        L81: {
                          if (!ha.field_o) {
                            break L81;
                          } else {
                            if (((e) this).field_B < 11) {
                              break L80;
                            } else {
                              break L81;
                            }
                          }
                        }
                        if (((e) this).field_q.field_B == 0) {
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = fa.field_e;
                          if (((e) this).field_N == 1) {
                            L82: {
                              qd.a((byte) 16, 33);
                              var5_int = ((e) this).field_q.g(12384);
                              ((e) this).field_q.field_B = 1;
                              ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - var5_int;
                              ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - ((e) this).field_q.field_jb / 2;
                              if (((e) this).field_q.field_jb < 0) {
                                ((e) this).field_q.field_jb = 0;
                                break L82;
                              } else {
                                break L82;
                              }
                            }
                            ((e) this).field_q.b(var5_int, (byte) -126);
                            break L80;
                          } else {
                            break L80;
                          }
                        } else {
                          break L80;
                        }
                      }
                    }
                  }
                }
              }
              if (var3_int < 127) {
                break L2;
              } else {
                if (var3_int >= 153) {
                  break L2;
                } else {
                  if (var4 < 66) {
                    break L2;
                  } else {
                    if (92 <= var4) {
                      break L2;
                    } else {
                      if (1 != ((e) this).field_q.field_B) {
                        break L2;
                      } else {
                        L83: {
                          if (!ha.field_o) {
                            break L83;
                          } else {
                            if (((e) this).field_B < 11) {
                              break L2;
                            } else {
                              break L83;
                            }
                          }
                        }
                        L84: {
                          if (((e) this).field_q.field_B != 1) {
                            break L84;
                          } else {
                            param0.field_Eb = new String[1];
                            param0.field_Eb[0] = db.field_a;
                            break L84;
                          }
                        }
                        if (((e) this).field_N != 1) {
                          break L2;
                        } else {
                          qd.a((byte) 47, 33);
                          ((e) this).field_q.field_B = 0;
                          stackOut_379_0 = ((e) this).field_q;
                          stackOut_379_1 = ((e) this).field_q;
                          stackIn_380_0 = stackOut_379_0;
                          stackIn_380_1 = stackOut_379_1;
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_380_0.field_jb = stackIn_380_1.field_jb + ((e) this).field_q.field_jb / 2;
            break L2;
          }
          L85: {
            if (var3_int < 155) {
              break L85;
            } else {
              if (var3_int >= 181) {
                break L85;
              } else {
                if (66 > var4) {
                  break L85;
                } else {
                  if (var4 >= 92) {
                    break L85;
                  } else {
                    param0.field_Eb = new String[1];
                    param0.field_Eb[0] = of.field_i;
                    if (((e) this).field_N == 1) {
                      L86: {
                        stackOut_391_0 = 39;
                        stackIn_393_0 = stackOut_391_0;
                        stackIn_392_0 = stackOut_391_0;
                        if (d.field_H) {
                          stackOut_393_0 = stackIn_393_0;
                          stackOut_393_1 = 34;
                          stackIn_394_0 = stackOut_393_0;
                          stackIn_394_1 = stackOut_393_1;
                          break L86;
                        } else {
                          stackOut_392_0 = stackIn_392_0;
                          stackOut_392_1 = 33;
                          stackIn_394_0 = stackOut_392_0;
                          stackIn_394_1 = stackOut_392_1;
                          break L86;
                        }
                      }
                      L87: {
                        qd.a((byte) stackIn_394_0, stackIn_394_1);
                        if (d.field_H) {
                          stackOut_396_0 = 0;
                          stackIn_397_0 = stackOut_396_0;
                          break L87;
                        } else {
                          stackOut_395_0 = 1;
                          stackIn_397_0 = stackOut_395_0;
                          break L87;
                        }
                      }
                      d.field_H = stackIn_397_0 != 0;
                      break L85;
                    } else {
                      break L85;
                    }
                  }
                }
              }
            }
          }
          L88: {
            if (var3_int < 184) {
              break L88;
            } else {
              if (var3_int >= 210) {
                break L88;
              } else {
                if (var4 < 66) {
                  break L88;
                } else {
                  if (var4 >= 92) {
                    break L88;
                  } else {
                    if (eg.field_p <= 0) {
                      break L88;
                    } else {
                      L89: {
                        if (!ha.field_o) {
                          break L89;
                        } else {
                          if (((e) this).field_B >= 12) {
                            break L89;
                          } else {
                            break L88;
                          }
                        }
                      }
                      L90: {
                        if (eg.field_p > 1) {
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = di.field_g + (eg.field_p - 1);
                          break L90;
                        } else {
                          break L90;
                        }
                      }
                      L91: {
                        if (eg.field_p != 1) {
                          break L91;
                        } else {
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = ph.field_u;
                          break L91;
                        }
                      }
                      if (((e) this).field_N == 1) {
                        L92: {
                          qd.a((byte) 80, 25);
                          if (((e) this).field_B != 12) {
                            break L92;
                          } else {
                            ((e) this).field_B = 13;
                            break L92;
                          }
                        }
                        eg.field_p = eg.field_p - 1;
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                  }
                }
              }
            }
          }
          L93: {
            if (212 > var3_int) {
              break L93;
            } else {
              if (238 <= var3_int) {
                break L93;
              } else {
                if (var4 < 66) {
                  break L93;
                } else {
                  if (92 <= var4) {
                    break L93;
                  } else {
                    if (eg.field_p >= 5) {
                      break L93;
                    } else {
                      L94: {
                        if (!ha.field_o) {
                          break L94;
                        } else {
                          if (((e) this).field_B >= 12) {
                            break L94;
                          } else {
                            break L93;
                          }
                        }
                      }
                      param0.field_Eb = new String[1];
                      param0.field_Eb[0] = di.field_g + (eg.field_p + 1);
                      if (((e) this).field_N == 1) {
                        L95: {
                          qd.a((byte) 107, 24);
                          if (((e) this).field_B != 12) {
                            break L95;
                          } else {
                            ((e) this).field_B = 13;
                            break L95;
                          }
                        }
                        eg.field_p = eg.field_p + 1;
                        break L93;
                      } else {
                        break L93;
                      }
                    }
                  }
                }
              }
            }
          }
          L96: {
            if (var3_int < 241) {
              break L96;
            } else {
              if (267 <= var3_int) {
                break L96;
              } else {
                if (66 > var4) {
                  break L96;
                } else {
                  if (92 <= var4) {
                    break L96;
                  } else {
                    L97: {
                      if (!ha.field_o) {
                        break L97;
                      } else {
                        if (((e) this).field_B >= 7) {
                          break L97;
                        } else {
                          break L96;
                        }
                      }
                    }
                    param0.field_Eb = new String[1];
                    param0.field_Eb[0] = sd.field_f;
                    if (((e) this).field_N == 1) {
                      qd.a((byte) 109, 24);
                      var5_int = 0;
                      var6 = 0;
                      L98: while (true) {
                        L99: {
                          L100: {
                            L101: {
                              if (var6 >= 12) {
                                break L101;
                              } else {
                                stackOut_457_0 = ((e) this).field_q;
                                stackIn_475_0 = stackOut_457_0;
                                stackIn_458_0 = stackOut_457_0;
                                if (var9 != 0) {
                                  break L100;
                                } else {
                                  L102: {
                                    if (stackIn_458_0 != ((e) this).field_C[var6]) {
                                      break L102;
                                    } else {
                                      var5_int = var6;
                                      break L102;
                                    }
                                  }
                                  var6++;
                                  if (var9 == 0) {
                                    continue L98;
                                  } else {
                                    break L101;
                                  }
                                }
                              }
                            }
                            var6 = 0;
                            L103: while (true) {
                              L104: {
                                var6++;
                                var5_int++;
                                if (var5_int >= 12) {
                                  var5_int -= 12;
                                  break L104;
                                } else {
                                  break L104;
                                }
                              }
                              L105: {
                                if (var6 >= 12) {
                                  break L105;
                                } else {
                                  if (((e) this).field_C[var5_int] == null) {
                                    continue L103;
                                  } else {
                                    stackOut_469_0 = ((e) this).field_C[var5_int].field_Z;
                                    stackIn_477_0 = stackOut_469_0;
                                    stackIn_470_0 = stackOut_469_0;
                                    if (var9 != 0) {
                                      break L99;
                                    } else {
                                      if (stackIn_470_0 == null) {
                                        continue L103;
                                      } else {
                                        if (((e) this).field_C[var5_int].field_jb <= 0) {
                                          continue L103;
                                        } else {
                                          if (((e) this).field_C[var5_int].field_P <= 0) {
                                            continue L103;
                                          } else {
                                            break L105;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_474_0 = ((e) this).field_C[var5_int];
                              stackIn_475_0 = stackOut_474_0;
                              break L100;
                            }
                          }
                          if (stackIn_475_0 == null) {
                            break L96;
                          } else {
                            stackOut_476_0 = ((e) this).field_C[var5_int].field_Z;
                            stackIn_477_0 = stackOut_476_0;
                            break L99;
                          }
                        }
                        if (stackIn_477_0 == null) {
                          break L96;
                        } else {
                          if (((e) this).field_C[var5_int].field_P > 0) {
                            L106: {
                              ((e) this).field_q = ((e) this).field_C[var5_int];
                              lg.field_c = -(((e) this).field_q.field_E * 48) + (((e) this).field_q.field_H + ((e) this).field_q.field_F) * 16;
                              ((e) this).field_m = false;
                              if (((e) this).field_B < 7) {
                                break L106;
                              } else {
                                if (((e) this).field_B >= 10) {
                                  break L106;
                                } else {
                                  ((e) this).field_B = ((e) this).field_B + 1;
                                  break L106;
                                }
                              }
                            }
                            sj.field_b = 32 * (-((e) this).field_q.field_H + ((e) this).field_q.field_F);
                            eg.field_p = ((e) this).field_q.field_E;
                            ((e) this).field_L = 0;
                            ((e) this).a(-1);
                            break L96;
                          } else {
                            break L96;
                          }
                        }
                      }
                    } else {
                      break L96;
                    }
                  }
                }
              }
            }
          }
          L107: {
            L108: {
              L109: {
                if (var3_int < 13) {
                  break L109;
                } else {
                  if (var3_int >= 81) {
                    break L109;
                  } else {
                    if (12 > var4) {
                      break L109;
                    } else {
                      if (var4 < 80) {
                        break L108;
                      } else {
                        break L109;
                      }
                    }
                  }
                }
              }
              if (var3_int < 269) {
                break L107;
              } else {
                if (var3_int >= 295) {
                  break L107;
                } else {
                  if (66 > var4) {
                    break L107;
                  } else {
                    if (var4 >= 92) {
                      break L107;
                    } else {
                      break L108;
                    }
                  }
                }
              }
            }
            L110: {
              if (!ha.field_o) {
                break L110;
              } else {
                if (((e) this).field_B < 9) {
                  break L107;
                } else {
                  break L110;
                }
              }
            }
            param0.field_Eb = new String[1];
            param0.field_Eb[0] = ab.field_f;
            if (((e) this).field_N != 1) {
              break L107;
            } else {
              qd.a((byte) 18, 33);
              lg.field_c = -(48 * ((e) this).field_q.field_E) + (((e) this).field_q.field_F - -((e) this).field_q.field_H) * 16;
              eg.field_p = ((e) this).field_q.field_E;
              sj.field_b = 32 * (((e) this).field_q.field_F + -((e) this).field_q.field_H);
              break L107;
            }
          }
          L111: {
            if (var3_int < 309) {
              break L111;
            } else {
              if (var3_int >= 457) {
                break L111;
              } else {
                if (var4 < 10) {
                  break L111;
                } else {
                  if (var4 >= 83) {
                    break L111;
                  } else {
                    L112: {
                      if (!ha.field_o) {
                        break L112;
                      } else {
                        if (5 <= ((e) this).field_B) {
                          break L112;
                        } else {
                          if (3 == ((e) this).field_B) {
                            break L112;
                          } else {
                            break L111;
                          }
                        }
                      }
                    }
                    L113: {
                      var5_ref = ((e) this).field_q.field_nb;
                      if (null == var5_ref) {
                        break L113;
                      } else {
                        L114: {
                          if (0 == var5_ref.field_g) {
                            break L114;
                          } else {
                            if (var5_ref.field_g == 3) {
                              break L114;
                            } else {
                              if (8 == var5_ref.field_g) {
                                break L114;
                              } else {
                                if (12 != var5_ref.field_g) {
                                  break L113;
                                } else {
                                  break L114;
                                }
                              }
                            }
                          }
                        }
                        var5_ref = ((e) this).field_q.field_eb;
                        break L113;
                      }
                    }
                    if (null == var5_ref) {
                      break L111;
                    } else {
                      L115: {
                        param0.field_Eb = new String[1];
                        param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + gl.field_h;
                        if (((e) this).field_L != 1) {
                          break L115;
                        } else {
                          param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + td.field_a;
                          break L115;
                        }
                      }
                      L116: {
                        if (ef.field_j < 324) {
                          break L116;
                        } else {
                          if (ef.field_j > 354) {
                            break L116;
                          } else {
                            if (var4 < 50) {
                              break L116;
                            } else {
                              if (80 < var4) {
                                break L116;
                              } else {
                                if (var5_ref.field_c >= var5_ref.a(true)) {
                                  break L116;
                                } else {
                                  if (var5_ref.field_g == 6) {
                                    break L116;
                                  } else {
                                    if (var5_ref.field_g == 7) {
                                      break L116;
                                    } else {
                                      param0.field_Eb = new String[1];
                                      param0.field_Eb[0] = rf.field_q + od.field_c[var5_ref.field_g].field_j + hi.field_Y;
                                      if (1 == ((e) this).field_N) {
                                        L117: {
                                          var6 = 14;
                                          if (~var6 < ~((e) this).field_q.field_jb) {
                                            break L117;
                                          } else {
                                            var5_ref.a(0);
                                            qd.a((byte) 120, od.field_c[var5_ref.field_g].field_n);
                                            ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - var6;
                                            ((e) this).field_q.b(var6, (byte) -116);
                                            ((e) this).field_q.field_ab = 0;
                                            break L117;
                                          }
                                        }
                                        if (var9 == 0) {
                                          break L111;
                                        } else {
                                          break L116;
                                        }
                                      } else {
                                        break L111;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (1 != ((e) this).field_N) {
                        break L111;
                      } else {
                        L118: {
                          L119: {
                            if (((e) this).field_q.field_eb == null) {
                              break L119;
                            } else {
                              L120: {
                                if (((e) this).field_q.field_nb.field_g == 0) {
                                  break L120;
                                } else {
                                  if (8 == ((e) this).field_q.field_nb.field_g) {
                                    break L120;
                                  } else {
                                    if (((e) this).field_q.field_nb.field_g == 3) {
                                      break L120;
                                    } else {
                                      if (((e) this).field_q.field_nb.field_g != 12) {
                                        break L119;
                                      } else {
                                        break L120;
                                      }
                                    }
                                  }
                                }
                              }
                              L121: {
                                var5_ref = ((e) this).field_q.field_nb;
                                ((e) this).field_q.field_nb = ((e) this).field_q.field_eb;
                                if (((e) this).field_m) {
                                  ((e) this).field_L = 0;
                                  break L121;
                                } else {
                                  break L121;
                                }
                              }
                              ((e) this).field_q.field_eb = var5_ref;
                              ((e) this).field_q.field_ab = 0;
                              if (var9 == 0) {
                                break L118;
                              } else {
                                break L119;
                              }
                            }
                          }
                          L122: {
                            if (!((e) this).field_m) {
                              break L122;
                            } else {
                              ((e) this).field_L = 0;
                              if (var9 == 0) {
                                break L118;
                              } else {
                                break L122;
                              }
                            }
                          }
                          ((e) this).field_L = 1 + -((e) this).field_L;
                          break L118;
                        }
                        L123: {
                          if (((e) this).field_B == 3) {
                            ((e) this).field_B = 4;
                            break L123;
                          } else {
                            break L123;
                          }
                        }
                        L124: {
                          ((e) this).field_m = false;
                          stackOut_579_0 = 41;
                          stackIn_581_0 = stackOut_579_0;
                          stackIn_580_0 = stackOut_579_0;
                          if (((e) this).field_L == 0) {
                            stackOut_581_0 = stackIn_581_0;
                            stackOut_581_1 = 34;
                            stackIn_582_0 = stackOut_581_0;
                            stackIn_582_1 = stackOut_581_1;
                            break L124;
                          } else {
                            stackOut_580_0 = stackIn_580_0;
                            stackOut_580_1 = 33;
                            stackIn_582_0 = stackOut_580_0;
                            stackIn_582_1 = stackOut_580_1;
                            break L124;
                          }
                        }
                        qd.a((byte) stackIn_582_0, stackIn_582_1);
                        break L111;
                      }
                    }
                  }
                }
              }
            }
          }
          L125: {
            if (var3_int < 467) {
              break L125;
            } else {
              if (var3_int >= 540) {
                break L125;
              } else {
                if (var4 < 10) {
                  break L125;
                } else {
                  if (83 <= var4) {
                    break L125;
                  } else {
                    L126: {
                      if (!ha.field_o) {
                        break L126;
                      } else {
                        if (((e) this).field_B >= 5) {
                          break L126;
                        } else {
                          if (((e) this).field_B != 3) {
                            break L125;
                          } else {
                            break L126;
                          }
                        }
                      }
                    }
                    L127: {
                      L128: {
                        var5_ref = ((e) this).field_q.field_eb;
                        if (null == var5_ref) {
                          break L128;
                        } else {
                          if (var5_ref.field_g == 0) {
                            break L127;
                          } else {
                            if (var5_ref.field_g == 3) {
                              break L127;
                            } else {
                              if (8 == var5_ref.field_g) {
                                break L127;
                              } else {
                                if (var5_ref.field_g == 12) {
                                  break L127;
                                } else {
                                  break L128;
                                }
                              }
                            }
                          }
                        }
                      }
                      var5_ref = ((e) this).field_q.field_nb;
                      break L127;
                    }
                    if (var5_ref == null) {
                      break L125;
                    } else {
                      L129: {
                        param0.field_Eb = new String[1];
                        param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + gl.field_h;
                        if (((e) this).field_L != 1) {
                          break L129;
                        } else {
                          param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + td.field_a;
                          break L129;
                        }
                      }
                      L130: {
                        L131: {
                          if (ef.field_j < 481) {
                            break L131;
                          } else {
                            if (ef.field_j > 511) {
                              break L131;
                            } else {
                              if (var4 < 50) {
                                break L131;
                              } else {
                                if (var4 > 80) {
                                  break L131;
                                } else {
                                  if (~var5_ref.field_c <= ~var5_ref.a(true)) {
                                    break L131;
                                  } else {
                                    if (var5_ref.field_g == 6) {
                                      break L131;
                                    } else {
                                      if (7 != var5_ref.field_g) {
                                        break L130;
                                      } else {
                                        break L131;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (((e) this).field_N != 1) {
                          break L125;
                        } else {
                          L132: {
                            L133: {
                              if (null == ((e) this).field_q.field_eb) {
                                break L133;
                              } else {
                                if (0 == ((e) this).field_q.field_nb.field_g) {
                                  break L133;
                                } else {
                                  if (((e) this).field_q.field_nb.field_g == 8) {
                                    break L133;
                                  } else {
                                    if (((e) this).field_q.field_nb.field_g == 3) {
                                      break L133;
                                    } else {
                                      if (((e) this).field_q.field_nb.field_g == 12) {
                                        break L133;
                                      } else {
                                        L134: {
                                          var5_ref = ((e) this).field_q.field_nb;
                                          ((e) this).field_q.field_nb = ((e) this).field_q.field_eb;
                                          ((e) this).field_q.field_ab = 0;
                                          if (((e) this).field_m) {
                                            ((e) this).field_L = 0;
                                            break L134;
                                          } else {
                                            break L134;
                                          }
                                        }
                                        ((e) this).field_q.field_eb = var5_ref;
                                        if (var9 == 0) {
                                          break L132;
                                        } else {
                                          break L133;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L135: {
                              if (((e) this).field_m) {
                                break L135;
                              } else {
                                ((e) this).field_L = 1 + -((e) this).field_L;
                                if (var9 == 0) {
                                  break L132;
                                } else {
                                  break L135;
                                }
                              }
                            }
                            ((e) this).field_L = 0;
                            break L132;
                          }
                          L136: {
                            if (((e) this).field_B != 3) {
                              break L136;
                            } else {
                              ((e) this).field_B = 4;
                              break L136;
                            }
                          }
                          L137: {
                            ((e) this).field_m = false;
                            if (((e) this).field_B == 5) {
                              ((e) this).field_B = 6;
                              break L137;
                            } else {
                              break L137;
                            }
                          }
                          L138: {
                            stackOut_649_0 = 16;
                            stackIn_651_0 = stackOut_649_0;
                            stackIn_650_0 = stackOut_649_0;
                            if (((e) this).field_L == 0) {
                              stackOut_651_0 = stackIn_651_0;
                              stackOut_651_1 = 34;
                              stackIn_652_0 = stackOut_651_0;
                              stackIn_652_1 = stackOut_651_1;
                              break L138;
                            } else {
                              stackOut_650_0 = stackIn_650_0;
                              stackOut_650_1 = 33;
                              stackIn_652_0 = stackOut_650_0;
                              stackIn_652_1 = stackOut_650_1;
                              break L138;
                            }
                          }
                          qd.a((byte) stackIn_652_0, stackIn_652_1);
                          if (var9 == 0) {
                            break L125;
                          } else {
                            break L130;
                          }
                        }
                      }
                      param0.field_Eb = new String[1];
                      param0.field_Eb[0] = rf.field_q + od.field_c[var5_ref.field_g].field_j + hi.field_Y;
                      if (((e) this).field_N == 1) {
                        var6 = 14;
                        if (~((e) this).field_q.field_jb <= ~var6) {
                          var5_ref.a(0);
                          qd.a((byte) 25, od.field_c[var5_ref.field_g].field_n);
                          ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - var6;
                          ((e) this).field_q.b(var6, (byte) -117);
                          ((e) this).field_q.field_ab = 0;
                          break L125;
                        } else {
                          break L125;
                        }
                      } else {
                        break L125;
                      }
                    }
                  }
                }
              }
            }
          }
          L139: {
            if (547 > var3_int) {
              break L139;
            } else {
              if (595 <= var3_int) {
                break L139;
              } else {
                if (var4 < 35) {
                  break L139;
                } else {
                  if (var4 >= 83) {
                    break L139;
                  } else {
                    L140: {
                      if (!ha.field_o) {
                        break L140;
                      } else {
                        if (((e) this).field_B < 14) {
                          break L139;
                        } else {
                          break L140;
                        }
                      }
                    }
                    L141: {
                      param0.field_Eb = new String[1];
                      param0.field_Eb[0] = wg.field_g;
                      if (!((e) this).field_m) {
                        break L141;
                      } else {
                        param0.field_Eb[0] = kd.field_d;
                        break L141;
                      }
                    }
                    if (1 != ((e) this).field_N) {
                      break L139;
                    } else {
                      L142: {
                        if (0 == ((e) this).field_L) {
                          break L142;
                        } else {
                          if (!((e) this).field_m) {
                            break L142;
                          } else {
                            qd.a((byte) 108, 34);
                            ((e) this).field_m = false;
                            ((e) this).field_L = 0;
                            if (var9 == 0) {
                              break L139;
                            } else {
                              break L142;
                            }
                          }
                        }
                      }
                      ((e) this).field_L = 1;
                      ((e) this).field_m = true;
                      qd.a((byte) 102, 33);
                      break L139;
                    }
                  }
                }
              }
            }
          }
          if (var3_int < ge.field_b) {
            break L1;
          } else {
            if (var3_int >= vb.field_i + ge.field_b) {
              break L1;
            } else {
              if (var4 < 9) {
                break L1;
              } else {
                if (var4 >= 84) {
                  break L1;
                } else {
                  L143: {
                    if (!ha.field_o) {
                      break L143;
                    } else {
                      if (((e) this).field_B >= 10) {
                        break L143;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param0.field_Eb = new String[1];
                  param0.field_Eb[0] = kd.field_e;
                  if (((e) this).field_N != 1) {
                    break L1;
                  } else {
                    L144: {
                      if (((e) this).field_B != 10) {
                        break L144;
                      } else {
                        ((e) this).field_B = 11;
                        break L144;
                      }
                    }
                    ((e) this).a(param0, (byte) 69);
                    qd.a((byte) 59, 32);
                    break L1;
                  }
                }
              }
            }
          }
        }
        L145: {
          if (param1) {
            break L145;
          } else {
            ((e) this).field_e = null;
            break L145;
          }
        }
    }

    final void a(byte param0, int param1) {
        int var3_int = 0;
        oh var4_ref_oh = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        r stackIn_101_0 = null;
        r stackIn_101_1 = null;
        r stackIn_113_0 = null;
        r stackIn_118_0 = null;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        r stackIn_203_0 = null;
        r stackIn_203_1 = null;
        int stackIn_236_0 = 0;
        int stackIn_236_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        r stackOut_100_0 = null;
        r stackOut_100_1 = null;
        r stackOut_112_0 = null;
        r stackOut_117_0 = null;
        int stackOut_153_0 = 0;
        int stackOut_153_1 = 0;
        r stackOut_202_0 = null;
        r stackOut_202_1 = null;
        int stackOut_235_0 = 0;
        int stackOut_235_1 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          if (param1 != 64) {
            break L0;
          } else {
            if (mm.field_e >= 2) {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((e) this).field_I) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              ((e) this).field_I = stackIn_7_1 != 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param1 != 49) {
            break L2;
          } else {
            if (ha.field_o) {
              break L2;
            } else {
              L3: {
                if (d.field_H) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              d.field_H = stackIn_15_0 != 0;
              break L2;
            }
          }
        }
        L4: {
          if (param1 != 40) {
            break L4;
          } else {
            if (ha.field_o) {
              break L4;
            } else {
              L5: {
                if (ce.field_e) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L5;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  break L5;
                }
              }
              ce.field_e = stackIn_23_0 != 0;
              break L4;
            }
          }
        }
        L6: {
          if (wb.field_e != param1) {
            break L6;
          } else {
            if (!ha.field_o) {
              L7: {
                stackOut_28_0 = this;
                stackIn_30_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (((e) this).field_w) {
                  stackOut_30_0 = this;
                  stackOut_30_1 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  break L7;
                } else {
                  stackOut_29_0 = this;
                  stackOut_29_1 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  break L7;
                }
              }
              ((e) this).field_w = stackIn_31_1 != 0;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L8: {
          if (param1 != 32) {
            break L8;
          } else {
            if (mm.field_e >= 2) {
              L9: {
                if (g.field_tb) {
                  stackOut_38_0 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  break L9;
                } else {
                  stackOut_37_0 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  break L9;
                }
              }
              g.field_tb = stackIn_39_0 != 0;
              break L8;
            } else {
              break L8;
            }
          }
        }
        L10: {
          if (param1 != 39) {
            break L10;
          } else {
            if (!ha.field_o) {
              L11: {
                if (fd.field_o) {
                  stackOut_46_0 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  break L11;
                } else {
                  stackOut_45_0 = 1;
                  stackIn_47_0 = stackOut_45_0;
                  break L11;
                }
              }
              fd.field_o = stackIn_47_0 != 0;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (!((e) this).field_J) {
            break L12;
          } else {
            if (~rh.field_c != ~param1) {
              break L12;
            } else {
              if (((e) this).field_q.field_S) {
                break L12;
              } else {
                L13: {
                  if (!ha.field_o) {
                    break L13;
                  } else {
                    if (11 > ((e) this).field_B) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (((e) this).field_q.field_B == 0) {
                  L14: {
                    var3_int = ((e) this).field_q.g(12384);
                    ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - var3_int;
                    ((e) this).field_q.field_B = 1;
                    ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - ((e) this).field_q.field_jb / 2;
                    if (((e) this).field_q.field_jb >= 0) {
                      break L14;
                    } else {
                      ((e) this).field_q.field_jb = 0;
                      break L14;
                    }
                  }
                  ((e) this).field_q.b(var3_int, (byte) -64);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
          }
        }
        L15: {
          if (!((e) this).field_J) {
            break L15;
          } else {
            if (param1 != 35) {
              break L15;
            } else {
              if (((e) this).field_q.field_S) {
                break L15;
              } else {
                L16: {
                  if (!ha.field_o) {
                    break L16;
                  } else {
                    if (((e) this).field_B < 11) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                if (1 != ((e) this).field_q.field_B) {
                  break L15;
                } else {
                  ((e) this).field_q.field_jb = ((e) this).field_q.field_jb + ((e) this).field_q.field_jb / 2;
                  ((e) this).field_q.field_B = 0;
                  break L15;
                }
              }
            }
          }
        }
        L17: {
          if (!((e) this).field_J) {
            break L17;
          } else {
            if (param1 != 36) {
              break L17;
            } else {
              if (mm.field_e >= 2) {
                ((e) this).field_q.field_jb = ((e) this).field_q.field_v;
                kg.field_q = true;
                break L17;
              } else {
                break L17;
              }
            }
          }
        }
        L18: {
          if (!((e) this).field_J) {
            break L18;
          } else {
            if (param1 != 56) {
              break L18;
            } else {
              var3_int = 14;
              var4_ref_oh = ((e) this).field_q.field_nb;
              if (~od.field_c[var4_ref_oh.field_g].field_o >= ~var4_ref_oh.field_c) {
                break L18;
              } else {
                if (~((e) this).field_q.field_jb <= ~var3_int) {
                  var4_ref_oh.a(0);
                  qd.a((byte) 73, od.field_c[var4_ref_oh.field_g].field_n);
                  ((e) this).field_q.field_jb = ((e) this).field_q.field_jb - var3_int;
                  ((e) this).field_q.b(var3_int, (byte) -111);
                  ((e) this).field_q.field_ab = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
          }
        }
        L19: {
          L20: {
            L21: {
              L22: {
                L23: {
                  if (!((e) this).field_J) {
                    break L23;
                  } else {
                    if (param1 != 69) {
                      break L23;
                    } else {
                      L24: {
                        if (!ha.field_o) {
                          break L24;
                        } else {
                          if (((e) this).field_B >= 7) {
                            break L24;
                          } else {
                            break L23;
                          }
                        }
                      }
                      this.b((byte) -3);
                      var3_int = 0;
                      var4 = 0;
                      L25: while (true) {
                        L26: {
                          if (var4 >= 12) {
                            break L26;
                          } else {
                            stackOut_100_0 = ((e) this).field_q;
                            stackOut_100_1 = ((e) this).field_C[var4];
                            stackIn_203_0 = stackOut_100_0;
                            stackIn_203_1 = stackOut_100_1;
                            stackIn_101_0 = stackOut_100_0;
                            stackIn_101_1 = stackOut_100_1;
                            if (var5 != 0) {
                              break L22;
                            } else {
                              L27: {
                                if (stackIn_101_0 != stackIn_101_1) {
                                  break L27;
                                } else {
                                  var3_int = var4;
                                  break L27;
                                }
                              }
                              var4++;
                              if (var5 == 0) {
                                continue L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        var4 = 0;
                        L28: while (true) {
                          L29: {
                            var3_int++;
                            if (var3_int >= 12) {
                              var3_int -= 12;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            L31: {
                              var4++;
                              if (var4 >= 12) {
                                break L31;
                              } else {
                                if (null == ((e) this).field_C[var3_int]) {
                                  continue L28;
                                } else {
                                  stackOut_112_0 = ((e) this).field_C[var3_int];
                                  stackIn_118_0 = stackOut_112_0;
                                  stackIn_113_0 = stackOut_112_0;
                                  if (var5 != 0) {
                                    break L30;
                                  } else {
                                    if (stackIn_113_0.field_Z == null) {
                                      continue L28;
                                    } else {
                                      if (((e) this).field_C[var3_int].field_jb <= 0) {
                                        continue L28;
                                      } else {
                                        if (((e) this).field_C[var3_int].field_P <= 0) {
                                          continue L28;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_117_0 = ((e) this).field_C[var3_int];
                            stackIn_118_0 = stackOut_117_0;
                            break L30;
                          }
                          L32: {
                            if (stackIn_118_0 == null) {
                              break L32;
                            } else {
                              if (null == ((e) this).field_C[var3_int].field_Z) {
                                break L32;
                              } else {
                                if (((e) this).field_C[var3_int].field_P > 0) {
                                  ((e) this).field_q = ((e) this).field_C[var3_int];
                                  sj.field_b = 32 * (-((e) this).field_q.field_H + ((e) this).field_q.field_F);
                                  eg.field_p = ((e) this).field_q.field_E;
                                  lg.field_c = (((e) this).field_q.field_H + ((e) this).field_q.field_F) * 16 - ((e) this).field_q.field_E * 48;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          L33: {
                            if (((e) this).field_B < 7) {
                              break L33;
                            } else {
                              if (((e) this).field_B < 10) {
                                ((e) this).field_B = ((e) this).field_B + 1;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          ((e) this).a(-1);
                          ((e) this).field_m = false;
                          ok.field_i = true;
                          ((e) this).field_L = 0;
                          break L23;
                        }
                      }
                    }
                  }
                }
                L34: {
                  if (!((e) this).field_J) {
                    break L34;
                  } else {
                    if (param1 != ef.field_h) {
                      break L34;
                    } else {
                      L35: {
                        if (!ha.field_o) {
                          break L35;
                        } else {
                          if (((e) this).field_B < 9) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      lg.field_c = 16 * (((e) this).field_q.field_F - -((e) this).field_q.field_H) + -(((e) this).field_q.field_E * 48);
                      sj.field_b = 32 * (((e) this).field_q.field_F - ((e) this).field_q.field_H);
                      eg.field_p = ((e) this).field_q.field_E;
                      break L34;
                    }
                  }
                }
                if (param0 == -106) {
                  L36: {
                    if (!((e) this).field_J) {
                      break L36;
                    } else {
                      if (param1 == 80) {
                        var3_int = 0;
                        var4 = 0;
                        L37: while (true) {
                          if (0 != var4) {
                            break L36;
                          } else {
                            if (110 <= var3_int) {
                              break L36;
                            } else {
                              L38: {
                                ((e) this).field_s = ((e) this).field_s + 1;
                                var3_int++;
                                if (((e) this).field_s >= 100) {
                                  ((e) this).field_s = 0;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              if (((e) this).field_C[((e) this).field_s] == null) {
                                continue L37;
                              } else {
                                stackOut_153_0 = ((e) this).field_C[((e) this).field_s].field_C;
                                stackOut_153_1 = 1;
                                stackIn_236_0 = stackOut_153_0;
                                stackIn_236_1 = stackOut_153_1;
                                stackIn_154_0 = stackOut_153_0;
                                stackIn_154_1 = stackOut_153_1;
                                if (var5 != 0) {
                                  break L19;
                                } else {
                                  if (stackIn_154_0 != stackIn_154_1) {
                                    continue L37;
                                  } else {
                                    if (((e) this).field_h.a((byte) -93, ((e) this).field_q, ((e) this).field_C[((e) this).field_s])) {
                                      sj.field_b = 32 * (-((e) this).field_C[((e) this).field_s].field_H + ((e) this).field_C[((e) this).field_s].field_F);
                                      var4 = 1;
                                      lg.field_c = -(48 * ((e) this).field_C[((e) this).field_s].field_E) + (((e) this).field_C[((e) this).field_s].field_H + ((e) this).field_C[((e) this).field_s].field_F) * 16;
                                      eg.field_p = ((e) this).field_C[((e) this).field_s].field_E;
                                      if (var5 == 0) {
                                        continue L37;
                                      } else {
                                        break L36;
                                      }
                                    } else {
                                      continue L37;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L36;
                      }
                    }
                  }
                  L39: {
                    if (!((e) this).field_J) {
                      break L39;
                    } else {
                      if (param1 != fl.field_b) {
                        break L39;
                      } else {
                        L40: {
                          if (!ha.field_o) {
                            break L40;
                          } else {
                            if (((e) this).field_B == 3) {
                              break L40;
                            } else {
                              if (((e) this).field_B >= 5) {
                                break L40;
                              } else {
                                break L39;
                              }
                            }
                          }
                        }
                        L41: {
                          this.b((byte) -3);
                          if (3 == ((e) this).field_B) {
                            ((e) this).field_B = 4;
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        L42: {
                          L43: {
                            if (!((e) this).field_m) {
                              break L43;
                            } else {
                              ((e) this).field_m = false;
                              if (var5 == 0) {
                                break L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                          ((e) this).field_L = 1 + -((e) this).field_L;
                          break L42;
                        }
                        if (5 == ((e) this).field_B) {
                          ((e) this).field_B = 6;
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                  }
                  L44: {
                    if (!((e) this).field_J) {
                      break L44;
                    } else {
                      if (param1 != 52) {
                        break L44;
                      } else {
                        L45: {
                          if (!ha.field_o) {
                            break L45;
                          } else {
                            if (14 <= ((e) this).field_B) {
                              break L45;
                            } else {
                              break L44;
                            }
                          }
                        }
                        this.b((byte) -3);
                        if (null == ((e) this).field_q.field_b) {
                          break L44;
                        } else {
                          L46: {
                            if (((e) this).field_m) {
                              break L46;
                            } else {
                              ((e) this).field_L = 1;
                              ((e) this).field_m = true;
                              if (var5 == 0) {
                                break L44;
                              } else {
                                break L46;
                              }
                            }
                          }
                          ((e) this).field_m = false;
                          ((e) this).field_L = 0;
                          break L44;
                        }
                      }
                    }
                  }
                  if (!((e) this).field_J) {
                    break L20;
                  } else {
                    if (param1 != 67) {
                      break L20;
                    } else {
                      if (ha.field_o) {
                        break L20;
                      } else {
                        if (((e) this).field_q.field_jb <= 0) {
                          break L20;
                        } else {
                          this.b((byte) -3);
                          var3_int = ((e) this).field_q.field_U;
                          ((e) this).field_q.a(true, uf.field_c, vf.field_a);
                          if (~((e) this).field_q.field_U != ~var3_int) {
                            stackOut_202_0 = ((e) this).field_q;
                            stackOut_202_1 = ((e) this).field_q;
                            stackIn_203_0 = stackOut_202_0;
                            stackIn_203_1 = stackOut_202_1;
                            break L22;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
              stackIn_203_0.field_jb = stackIn_203_1.field_jb - 1;
              ((e) this).field_q.field_ab = 0;
              break L21;
            }
            ok.field_i = true;
            break L20;
          }
          L47: {
            if (!((e) this).field_J) {
              break L47;
            } else {
              if (param1 != 42) {
                break L47;
              } else {
                if (g.field_tb) {
                  break L47;
                } else {
                  L48: {
                    if (!ha.field_o) {
                      break L48;
                    } else {
                      if (((e) this).field_B < 12) {
                        break L47;
                      } else {
                        break L48;
                      }
                    }
                  }
                  L49: {
                    this.b((byte) -3);
                    eg.field_p = eg.field_p - 1;
                    if (((e) this).field_B != 12) {
                      break L49;
                    } else {
                      ((e) this).field_B = 13;
                      break L49;
                    }
                  }
                  if (eg.field_p >= 0) {
                    break L47;
                  } else {
                    eg.field_p = 0;
                    break L47;
                  }
                }
              }
            }
          }
          L50: {
            if (!((e) this).field_J) {
              break L50;
            } else {
              if (43 != param1) {
                break L50;
              } else {
                if (g.field_tb) {
                  break L50;
                } else {
                  L51: {
                    if (!ha.field_o) {
                      break L51;
                    } else {
                      if (((e) this).field_B >= 12) {
                        break L51;
                      } else {
                        break L50;
                      }
                    }
                  }
                  L52: {
                    this.b((byte) -3);
                    if (((e) this).field_B == 12) {
                      ((e) this).field_B = 13;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  eg.field_p = eg.field_p + 1;
                  if (eg.field_p > 5) {
                    eg.field_p = 5;
                    break L50;
                  } else {
                    break L50;
                  }
                }
              }
            }
          }
          stackOut_235_0 = 55;
          stackOut_235_1 = param1;
          stackIn_236_0 = stackOut_235_0;
          stackIn_236_1 = stackOut_235_1;
          break L19;
        }
        L53: {
          if (stackIn_236_0 != stackIn_236_1) {
            break L53;
          } else {
            if (mm.field_e < 2) {
              break L53;
            } else {
              this.a(true);
              ((e) this).a(((e) this).field_G, (byte) -67);
              break L53;
            }
          }
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_o = null;
              if (param0 == 20) {
                break L1;
              } else {
                e.b(-97);
                break L1;
              }
            }
            field_g = null;
            field_l = null;
            field_t = null;
            field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "e.Q(" + param0 + ')');
        }
    }

    private final void a(int param0, Terraphoenix param1, boolean param2) {
        Object var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dl var9_ref_dl = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        dl var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_45_0 = null;
        r stackIn_53_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_178_0 = 0;
        r stackIn_201_0 = null;
        Object stackIn_296_0 = null;
        dl stackIn_296_1 = null;
        int stackIn_309_0 = 0;
        Object stackIn_311_0 = null;
        dk stackIn_311_1 = null;
        int stackIn_311_2 = 0;
        int stackIn_311_3 = 0;
        int stackIn_311_4 = 0;
        int stackIn_311_5 = 0;
        Object stackIn_312_0 = null;
        dk stackIn_312_1 = null;
        int stackIn_312_2 = 0;
        int stackIn_312_3 = 0;
        int stackIn_312_4 = 0;
        int stackIn_312_5 = 0;
        Object stackIn_313_0 = null;
        dk stackIn_313_1 = null;
        int stackIn_313_2 = 0;
        int stackIn_313_3 = 0;
        int stackIn_313_4 = 0;
        int stackIn_313_5 = 0;
        Object stackIn_314_0 = null;
        dk stackIn_314_1 = null;
        int stackIn_314_2 = 0;
        int stackIn_314_3 = 0;
        int stackIn_314_4 = 0;
        int stackIn_314_5 = 0;
        int stackIn_314_6 = 0;
        Object stackIn_321_0 = null;
        dl stackIn_321_1 = null;
        int stackIn_326_0 = 0;
        int stackIn_327_0 = 0;
        int stackIn_328_0 = 0;
        int stackIn_329_0 = 0;
        int stackIn_329_1 = 0;
        int stackIn_353_0 = 0;
        int stackIn_353_1 = 0;
        boolean stackIn_356_0 = false;
        boolean stackIn_359_0 = false;
        int stackIn_378_0 = 0;
        int stackIn_380_0 = 0;
        int stackIn_380_1 = 0;
        Object stackOut_39_0 = null;
        Object stackOut_44_0 = null;
        r stackOut_52_0 = null;
        int stackOut_80_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        Object stackOut_200_0 = null;
        Object stackOut_295_0 = null;
        dl stackOut_295_1 = null;
        int stackOut_308_0 = 0;
        int stackOut_307_0 = 0;
        Object stackOut_310_0 = null;
        dk stackOut_310_1 = null;
        int stackOut_310_2 = 0;
        int stackOut_310_3 = 0;
        int stackOut_310_4 = 0;
        int stackOut_310_5 = 0;
        Object stackOut_313_0 = null;
        dk stackOut_313_1 = null;
        int stackOut_313_2 = 0;
        int stackOut_313_3 = 0;
        int stackOut_313_4 = 0;
        int stackOut_313_5 = 0;
        int stackOut_313_6 = 0;
        Object stackOut_311_0 = null;
        dk stackOut_311_1 = null;
        int stackOut_311_2 = 0;
        int stackOut_311_3 = 0;
        int stackOut_311_4 = 0;
        int stackOut_311_5 = 0;
        Object stackOut_312_0 = null;
        dk stackOut_312_1 = null;
        int stackOut_312_2 = 0;
        int stackOut_312_3 = 0;
        int stackOut_312_4 = 0;
        int stackOut_312_5 = 0;
        int stackOut_312_6 = 0;
        Object stackOut_320_0 = null;
        dl stackOut_320_1 = null;
        int stackOut_325_0 = 0;
        int stackOut_324_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_328_0 = 0;
        int stackOut_328_1 = 0;
        int stackOut_327_0 = 0;
        int stackOut_327_1 = 0;
        int stackOut_352_0 = 0;
        int stackOut_352_1 = 0;
        boolean stackOut_355_0 = false;
        boolean stackOut_358_0 = false;
        int stackOut_377_0 = 0;
        int stackOut_376_0 = 0;
        int stackOut_379_0 = 0;
        int stackOut_379_1 = 0;
        L0: {
          var16 = Terraphoenix.field_V;
          var4 = null;
          if (param0 == 22341) {
            break L0;
          } else {
            this.a(95, (Terraphoenix) null, false);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          L2: {
            if (var6 >= ((e) this).field_C.length) {
              break L2;
            } else {
              L3: {
                if (null == ((e) this).field_C[var6]) {
                  break L3;
                } else {
                  if (((e) this).field_C[var6].field_Z != null) {
                    break L3;
                  } else {
                    L4: {
                      if (param1.field_Bb != 0) {
                        break L4;
                      } else {
                        if (((e) this).field_C[var6].field_k) {
                          break L4;
                        } else {
                          if (((e) this).field_C[var6].field_h) {
                            break L4;
                          } else {
                            if (((e) this).field_B >= 16) {
                              break L4;
                            } else {
                              if (fa.field_a > 0) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (((e) this).field_C[var6].field_P <= 0) {
                      break L3;
                    } else {
                      if (!((e) this).field_C[var6].field_Y) {
                        var4 = (Object) (Object) ((e) this).field_C[var6];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              var6++;
              continue L1;
            }
          }
          L5: {
            L6: {
              var5 = null;
              if (null != var4) {
                break L6;
              } else {
                var6 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var6 >= 50) {
                        break L9;
                      } else {
                        if (var16 != 0) {
                          break L8;
                        } else {
                          if (null == ((e) this).field_F[var6]) {
                            var6++;
                            if (var16 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    ((e) this).a(param1, (byte) 99);
                    break L8;
                  }
                  if (var16 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L10: {
              L11: {
                if ((Object) (Object) ((e) this).field_D == var4) {
                  break L11;
                } else {
                  var6 = 0;
                  L12: while (true) {
                    if (var6 >= 50) {
                      break L11;
                    } else {
                      stackOut_39_0 = this;
                      stackIn_45_0 = stackOut_39_0;
                      stackIn_40_0 = stackOut_39_0;
                      if (var16 != 0) {
                        break L10;
                      } else {
                        if (((e) this).field_F[var6] == null) {
                          var6++;
                          if (var16 == 0) {
                            continue L12;
                          } else {
                            break L11;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              ((r) var4).field_f = false;
              stackOut_44_0 = this;
              stackIn_45_0 = stackOut_44_0;
              break L10;
            }
            L13: {
              ((e) this).field_D = (r) var4;
              var6 = 0;
              var7 = 20000;
              if (null == ((r) var4).field_a) {
                break L13;
              } else {
                if (0 >= ((r) var4).field_a.field_P) {
                  ((r) var4).field_a = null;
                  ((r) var4).field_w = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            var8 = 0;
            L14: while (true) {
              L15: {
                L16: {
                  L17: {
                    if (var8 >= ((e) this).field_C.length) {
                      break L17;
                    } else {
                      stackOut_52_0 = ((e) this).field_C[var8];
                      stackIn_201_0 = stackOut_52_0;
                      stackIn_53_0 = stackOut_52_0;
                      if (var16 != 0) {
                        break L16;
                      } else {
                        L18: {
                          if (stackIn_53_0 == null) {
                            break L18;
                          } else {
                            if (((e) this).field_C[var8].field_P <= 0) {
                              break L18;
                            } else {
                              if (~((r) var4).field_C == ~((e) this).field_C[var8].field_C) {
                                break L18;
                              } else {
                                L19: {
                                  if (((e) this).field_C[var8].field_k) {
                                    break L19;
                                  } else {
                                    if (((e) this).field_C[var8].field_h) {
                                      break L19;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L20: {
                                  var9 = 1;
                                  var10 = ((e) this).field_C[var8].field_F;
                                  var11_int = ((e) this).field_C[var8].field_H;
                                  if (!((e) this).field_C[var8].field_k) {
                                    var10 = ((e) this).field_C[var8].field_i;
                                    var11_int = ((e) this).field_C[var8].field_gb;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  L22: {
                                    ((r) var4).a(true, var10, var11_int);
                                    var12 = ((e) this).field_h.a((byte) -93, (r) var4, ((e) this).field_C[var8]) ? 1 : 0;
                                    var13 = -((r) var4).field_F + var10;
                                    var14 = -((r) var4).field_H + var11_int;
                                    var15 = var13 * var13 + var14 * var14;
                                    if (null == var5) {
                                      break L22;
                                    } else {
                                      L23: {
                                        L24: {
                                          if (var12 != 0) {
                                            break L24;
                                          } else {
                                            if (var6 == 0) {
                                              break L23;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                        if (var12 != 0) {
                                          break L23;
                                        } else {
                                          if (var12 == 0) {
                                            var9 = 0;
                                            if (var16 == 0) {
                                              break L21;
                                            } else {
                                              break L23;
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      L25: {
                                        if (7 == param1.field_Bb) {
                                          break L25;
                                        } else {
                                          L26: {
                                            stackOut_80_0 = 0;
                                            stackIn_83_0 = stackOut_80_0;
                                            stackIn_81_0 = stackOut_80_0;
                                            if (param1.field_db) {
                                              stackOut_83_0 = stackIn_83_0;
                                              stackOut_83_1 = 0;
                                              stackIn_84_0 = stackOut_83_0;
                                              stackIn_84_1 = stackOut_83_1;
                                              break L26;
                                            } else {
                                              stackOut_81_0 = stackIn_81_0;
                                              stackIn_82_0 = stackOut_81_0;
                                              stackOut_82_0 = stackIn_82_0;
                                              stackOut_82_1 = 1;
                                              stackIn_84_0 = stackOut_82_0;
                                              stackIn_84_1 = stackOut_82_1;
                                              break L26;
                                            }
                                          }
                                          if (stackIn_84_0 != stackIn_84_1) {
                                            L27: {
                                              if (~((r) var5).field_E != ~((r) var4).field_E) {
                                                break L27;
                                              } else {
                                                if (~((e) this).field_C[var8].field_E == ~((r) var4).field_E) {
                                                  break L27;
                                                } else {
                                                  if (var12 == 0) {
                                                    var9 = 0;
                                                    break L27;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                            }
                                            L28: {
                                              if (((r) var4).field_E >= ((r) var5).field_E) {
                                                break L28;
                                              } else {
                                                if (((r) var4).field_E <= ((e) this).field_C[var8].field_E) {
                                                  break L28;
                                                } else {
                                                  if (var12 != 0) {
                                                    break L28;
                                                  } else {
                                                    var9 = 0;
                                                    break L28;
                                                  }
                                                }
                                              }
                                            }
                                            if (var12 != 0) {
                                              break L25;
                                            } else {
                                              if (~((e) this).field_C[var8].field_E > ~((r) var4).field_E) {
                                                var9 = 0;
                                                break L25;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (var12 != 0) {
                                          break L29;
                                        } else {
                                          if (((r) var4).field_z != 1) {
                                            break L29;
                                          } else {
                                            L30: {
                                              if (((r) var4).field_c.field_d) {
                                                stackOut_110_0 = 0;
                                                stackIn_111_0 = stackOut_110_0;
                                                break L30;
                                              } else {
                                                stackOut_109_0 = 1;
                                                stackIn_111_0 = stackOut_109_0;
                                                break L30;
                                              }
                                            }
                                            L31: {
                                              stackOut_111_0 = stackIn_111_0;
                                              stackIn_113_0 = stackOut_111_0;
                                              stackIn_112_0 = stackOut_111_0;
                                              if (((e) this).field_C[var8].field_c.field_d) {
                                                stackOut_113_0 = stackIn_113_0;
                                                stackOut_113_1 = 0;
                                                stackIn_114_0 = stackOut_113_0;
                                                stackIn_114_1 = stackOut_113_1;
                                                break L31;
                                              } else {
                                                stackOut_112_0 = stackIn_112_0;
                                                stackOut_112_1 = 1;
                                                stackIn_114_0 = stackOut_112_0;
                                                stackIn_114_1 = stackOut_112_1;
                                                break L31;
                                              }
                                            }
                                            if (stackIn_114_0 == stackIn_114_1) {
                                              break L29;
                                            } else {
                                              if (!((e) this).field_A) {
                                                var9 = 0;
                                                break L29;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L32: {
                                        if (var12 != 0) {
                                          break L32;
                                        } else {
                                          if (((r) var4).field_z != 2) {
                                            break L32;
                                          } else {
                                            if (~((e) this).field_C[var8].field_E <= ~((r) var4).field_E) {
                                              break L32;
                                            } else {
                                              L33: {
                                                if (((r) var4).field_c.field_d) {
                                                  stackOut_127_0 = 0;
                                                  stackIn_128_0 = stackOut_127_0;
                                                  break L33;
                                                } else {
                                                  stackOut_126_0 = 1;
                                                  stackIn_128_0 = stackOut_126_0;
                                                  break L33;
                                                }
                                              }
                                              if (stackIn_128_0 != (((e) this).field_C[var8].field_c.field_d ? 1 : 0)) {
                                                break L32;
                                              } else {
                                                L34: {
                                                  if (!((e) this).field_A) {
                                                    break L34;
                                                  } else {
                                                    if (param1.field_Bb == 6) {
                                                      break L32;
                                                    } else {
                                                      break L34;
                                                    }
                                                  }
                                                }
                                                var9 = 0;
                                                break L32;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L35: {
                                        if (var12 != 0) {
                                          break L35;
                                        } else {
                                          if (3 > ((r) var4).field_z) {
                                            break L35;
                                          } else {
                                            if (~((e) this).field_C[var8].field_E > ~((r) var4).field_E) {
                                              var9 = 0;
                                              break L35;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                      }
                                      if (var7 >= var15) {
                                        break L21;
                                      } else {
                                        var9 = 0;
                                        if (var16 == 0) {
                                          break L21;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                  L36: {
                                    if (var12 != 0) {
                                      break L36;
                                    } else {
                                      if (~((e) this).field_C[var8].field_E > ~((r) var4).field_E) {
                                        var9 = 0;
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                  L37: {
                                    if (var12 != 0) {
                                      break L37;
                                    } else {
                                      if (((r) var4).field_z != 1) {
                                        break L37;
                                      } else {
                                        L38: {
                                          if (((e) this).field_C[var8].field_c.field_d) {
                                            stackOut_155_0 = 0;
                                            stackIn_156_0 = stackOut_155_0;
                                            break L38;
                                          } else {
                                            stackOut_154_0 = 1;
                                            stackIn_156_0 = stackOut_154_0;
                                            break L38;
                                          }
                                        }
                                        L39: {
                                          stackOut_156_0 = stackIn_156_0;
                                          stackIn_158_0 = stackOut_156_0;
                                          stackIn_157_0 = stackOut_156_0;
                                          if (((r) var4).field_c.field_d) {
                                            stackOut_158_0 = stackIn_158_0;
                                            stackOut_158_1 = 0;
                                            stackIn_159_0 = stackOut_158_0;
                                            stackIn_159_1 = stackOut_158_1;
                                            break L39;
                                          } else {
                                            stackOut_157_0 = stackIn_157_0;
                                            stackOut_157_1 = 1;
                                            stackIn_159_0 = stackOut_157_0;
                                            stackIn_159_1 = stackOut_157_1;
                                            break L39;
                                          }
                                        }
                                        if (stackIn_159_0 == stackIn_159_1) {
                                          break L37;
                                        } else {
                                          L40: {
                                            if (((e) this).field_A) {
                                              stackOut_163_0 = 0;
                                              stackIn_164_0 = stackOut_163_0;
                                              break L40;
                                            } else {
                                              stackOut_162_0 = 1;
                                              stackIn_164_0 = stackOut_162_0;
                                              break L40;
                                            }
                                          }
                                          if (stackIn_164_0 == 1) {
                                            var9 = 0;
                                            break L37;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L41: {
                                    if (var12 != 0) {
                                      break L41;
                                    } else {
                                      if (2 != ((r) var4).field_z) {
                                        break L41;
                                      } else {
                                        if (((r) var4).field_E <= ((e) this).field_C[var8].field_E) {
                                          break L41;
                                        } else {
                                          if (((e) this).field_C[var8].field_c.field_d == ((r) var4).field_c.field_d) {
                                            break L41;
                                          } else {
                                            L42: {
                                              if (((e) this).field_A) {
                                                stackOut_177_0 = 0;
                                                stackIn_178_0 = stackOut_177_0;
                                                break L42;
                                              } else {
                                                stackOut_176_0 = 1;
                                                stackIn_178_0 = stackOut_176_0;
                                                break L42;
                                              }
                                            }
                                            L43: {
                                              if (stackIn_178_0 != 0) {
                                                break L43;
                                              } else {
                                                if (param1.field_Bb == 6) {
                                                  break L41;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                            }
                                            var9 = 0;
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var12 != 0) {
                                    break L21;
                                  } else {
                                    if (((r) var4).field_z < 3) {
                                      break L21;
                                    } else {
                                      if (((r) var4).field_E <= ((e) this).field_C[var8].field_E) {
                                        break L21;
                                      } else {
                                        var9 = 0;
                                        break L21;
                                      }
                                    }
                                  }
                                }
                                if (var9 == 0) {
                                  break L18;
                                } else {
                                  var6 = var12;
                                  var5 = (Object) (Object) ((e) this).field_C[var8];
                                  var7 = var15;
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        var8++;
                        if (var16 == 0) {
                          continue L14;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  L44: {
                    if (null == ((r) var4).field_a) {
                      break L44;
                    } else {
                      if (((r) var4).field_a.field_P <= 0) {
                        break L44;
                      } else {
                        if (!((r) var4).field_a.field_k) {
                          break L44;
                        } else {
                          var8 = ((r) var4).field_a.field_F - ((r) var4).field_F;
                          var9 = ((r) var4).field_a.field_H - ((r) var4).field_H;
                          var10 = var9 * var9 + var8 * var8;
                          var5 = (Object) (Object) ((r) var4).field_a;
                          var6 = ((e) this).field_h.a((byte) -93, (r) var4, (r) var5) ? 1 : 0;
                          var7 = var10;
                          break L44;
                        }
                      }
                    }
                  }
                  L45: {
                    if (var6 == 0) {
                      break L45;
                    } else {
                      ((r) var4).field_a = (r) var5;
                      if (var16 == 0) {
                        break L15;
                      } else {
                        break L45;
                      }
                    }
                  }
                  stackOut_200_0 = var4;
                  stackIn_201_0 = (r) (Object) stackOut_200_0;
                  break L16;
                }
                stackIn_201_0.field_a = null;
                break L15;
              }
              L46: {
                var7 = (int)Math.sqrt((double)var7);
                if (0 == ((r) var4).field_w) {
                  L47: {
                    L48: {
                      var8 = od.field_c[((r) var4).field_nb.field_g].field_m;
                      if (0 == var8) {
                        break L48;
                      } else {
                        if (1 != var8) {
                          break L47;
                        } else {
                          if (10.0 <= Math.random() * 100.0) {
                            break L47;
                          } else {
                            break L48;
                          }
                        }
                      }
                    }
                    if (((r) var4).field_B == 1) {
                      ((r) var4).field_B = 0;
                      ((r) var4).field_jb = ((r) var4).field_jb * 3 / 2;
                      break L47;
                    } else {
                      break L47;
                    }
                  }
                  L49: {
                    if (var8 != 4) {
                      break L49;
                    } else {
                      if (((r) var4).field_B != 1) {
                        break L49;
                      } else {
                        if (((r) var4).field_mb <= ((r) var4).field_P) {
                          break L49;
                        } else {
                          ((r) var4).field_jb = ((r) var4).field_jb * 3 / 2;
                          ((r) var4).field_B = 0;
                          break L49;
                        }
                      }
                    }
                  }
                  L50: {
                    if (var5 == null) {
                      break L50;
                    } else {
                      L51: {
                        if (var6 == 0) {
                          break L51;
                        } else {
                          L52: {
                            ((r) var4).field_w = 3;
                            if (1 != var8) {
                              break L52;
                            } else {
                              ((r) var4).field_w = 4;
                              if (((r) var4).field_ab != 0) {
                                break L52;
                              } else {
                                if ((double)var7 <= Math.random() * 10.0 + 10.0) {
                                  break L52;
                                } else {
                                  ((r) var4).field_w = 3;
                                  break L52;
                                }
                              }
                            }
                          }
                          L53: {
                            if (var8 == 2) {
                              ((r) var4).field_w = 4;
                              break L53;
                            } else {
                              break L53;
                            }
                          }
                          L54: {
                            if (3 == var8) {
                              ((r) var4).field_w = 5;
                              break L54;
                            } else {
                              break L54;
                            }
                          }
                          if (((r) var4).field_z >= 2) {
                            ((r) var4).field_w = 5;
                            if (var16 == 0) {
                              break L46;
                            } else {
                              break L51;
                            }
                          } else {
                            break L46;
                          }
                        }
                      }
                      ((r) var4).field_w = 2;
                      if (var16 == 0) {
                        break L46;
                      } else {
                        break L50;
                      }
                    }
                  }
                  ((r) var4).field_w = 1;
                  var6 = 0;
                  break L46;
                } else {
                  break L46;
                }
              }
              L55: {
                L56: {
                  L57: {
                    L58: {
                      var8 = ((r) var4).field_w;
                      if (var8 == 0) {
                        ((r) var4).field_Y = true;
                        break L58;
                      } else {
                        if (var8 == 1) {
                          break L58;
                        } else {
                          L59: {
                            if (2 != var8) {
                              break L59;
                            } else {
                              if (var16 == 0) {
                                break L57;
                              } else {
                                break L59;
                              }
                            }
                          }
                          L60: {
                            if (var8 != 3) {
                              break L60;
                            } else {
                              if (var16 == 0) {
                                break L57;
                              } else {
                                break L60;
                              }
                            }
                          }
                          if (var8 == 4) {
                            break L56;
                          } else {
                            if (var8 == 5) {
                              break L55;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (7 == ((r) var4).field_t) {
                      ((r) var4).field_Y = true;
                      return;
                    } else {
                      if (param2) {
                        break L5;
                      } else {
                        L61: {
                          if (var6 == 0) {
                            break L61;
                          } else {
                            if (null == var5) {
                              break L61;
                            } else {
                              if (((r) var5).field_P <= 0) {
                                break L61;
                              } else {
                                L62: {
                                  L63: {
                                    if (var6 != 0) {
                                      break L63;
                                    } else {
                                      if (var5 == null) {
                                        break L62;
                                      } else {
                                        if (((r) var5).field_P <= 0) {
                                          break L62;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                  }
                                  ((r) var4).field_w = 4;
                                  if (var16 == 0) {
                                    break L5;
                                  } else {
                                    break L62;
                                  }
                                }
                                ((r) var4).field_Y = true;
                                if (var16 == 0) {
                                  break L5;
                                } else {
                                  break L61;
                                }
                              }
                            }
                          }
                        }
                        L64: {
                          L65: {
                            L66: {
                              if (Math.abs(((r) var4).field_X - ((r) var4).field_F) >= 2) {
                                break L66;
                              } else {
                                if (Math.abs(-((r) var4).field_H + ((r) var4).field_n) < 2) {
                                  break L65;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            if (null == ((e) this).field_h.a(false, ((r) var4).field_X, ((r) var4).field_E, ((r) var4).field_F, ((r) var4).field_n, ((r) var4).field_H, 86)) {
                              break L65;
                            } else {
                              ((r) var4).field_A = 0;
                              ((r) var4).field_d = ((r) var4).field_B;
                              ((r) var4).field_S = true;
                              if (var16 == 0) {
                                break L64;
                              } else {
                                break L65;
                              }
                            }
                          }
                          ((r) var4).field_A = 0;
                          ((r) var4).field_S = true;
                          ((r) var4).field_d = ((r) var4).field_B;
                          var8 = 0;
                          var10 = 0;
                          L67: while (true) {
                            L68: {
                              ((r) var4).field_X = 4 + (int)(Math.random() * (double)(((e) this).field_h.field_b - 8));
                              ((r) var4).field_n = 4 + (int)(Math.random() * (double)(-8 + ((e) this).field_h.field_e));
                              ((r) var4).field_N = ((r) var4).field_E;
                              if (((r) var4).field_z != 2) {
                                break L68;
                              } else {
                                ((r) var4).field_N = 1;
                                break L68;
                              }
                            }
                            L69: {
                              if (((r) var4).field_z == 3) {
                                ((r) var4).field_N = 2;
                                break L69;
                              } else {
                                break L69;
                              }
                            }
                            L70: {
                              if (4 == ((r) var4).field_z) {
                                ((r) var4).field_N = 4;
                                break L70;
                              } else {
                                break L70;
                              }
                            }
                            var9_ref_dl = ((e) this).field_h.a(-115, ((r) var4).field_n, ((r) var4).field_E, ((r) var4).field_X);
                            ((r) var4).field_c.field_h = null;
                            stackOut_295_0 = null;
                            stackOut_295_1 = (dl) var9_ref_dl;
                            stackIn_296_0 = stackOut_295_0;
                            stackIn_296_1 = stackOut_295_1;
                            L71: while (true) {
                              L72: {
                                if (stackIn_296_0 == (Object) (Object) stackIn_296_1) {
                                  break L72;
                                } else {
                                  L73: {
                                    if (~((r) var4).field_X != ~((r) var4).field_F) {
                                      break L73;
                                    } else {
                                      if (((r) var4).field_n != ((r) var4).field_H) {
                                        break L73;
                                      } else {
                                        break L72;
                                      }
                                    }
                                  }
                                  var8 = 1;
                                  if (0 != ((r) var4).field_z) {
                                    break L72;
                                  } else {
                                    if (var9_ref_dl.field_d) {
                                      var8 = 0;
                                      break L72;
                                    } else {
                                      break L72;
                                    }
                                  }
                                }
                              }
                              L74: {
                                if (var8 != 0) {
                                  stackOut_308_0 = 0;
                                  stackIn_309_0 = stackOut_308_0;
                                  break L74;
                                } else {
                                  stackOut_307_0 = 1;
                                  stackIn_309_0 = stackOut_307_0;
                                  break L74;
                                }
                              }
                              L75: {
                                if (stackIn_309_0 != 0) {
                                  break L75;
                                } else {
                                  L76: {
                                    stackOut_310_0 = null;
                                    stackOut_310_1 = ((e) this).field_h;
                                    stackOut_310_2 = ((r) var4).field_n;
                                    stackOut_310_3 = ((r) var4).field_H;
                                    stackOut_310_4 = ((r) var4).field_F;
                                    stackOut_310_5 = ((r) var4).field_N;
                                    stackIn_313_0 = stackOut_310_0;
                                    stackIn_313_1 = stackOut_310_1;
                                    stackIn_313_2 = stackOut_310_2;
                                    stackIn_313_3 = stackOut_310_3;
                                    stackIn_313_4 = stackOut_310_4;
                                    stackIn_313_5 = stackOut_310_5;
                                    stackIn_311_0 = stackOut_310_0;
                                    stackIn_311_1 = stackOut_310_1;
                                    stackIn_311_2 = stackOut_310_2;
                                    stackIn_311_3 = stackOut_310_3;
                                    stackIn_311_4 = stackOut_310_4;
                                    stackIn_311_5 = stackOut_310_5;
                                    if (((r) var4).field_C <= 0) {
                                      stackOut_313_0 = stackIn_313_0;
                                      stackOut_313_1 = (dk) (Object) stackIn_313_1;
                                      stackOut_313_2 = stackIn_313_2;
                                      stackOut_313_3 = stackIn_313_3;
                                      stackOut_313_4 = stackIn_313_4;
                                      stackOut_313_5 = stackIn_313_5;
                                      stackOut_313_6 = 0;
                                      stackIn_314_0 = stackOut_313_0;
                                      stackIn_314_1 = stackOut_313_1;
                                      stackIn_314_2 = stackOut_313_2;
                                      stackIn_314_3 = stackOut_313_3;
                                      stackIn_314_4 = stackOut_313_4;
                                      stackIn_314_5 = stackOut_313_5;
                                      stackIn_314_6 = stackOut_313_6;
                                      break L76;
                                    } else {
                                      stackOut_311_0 = stackIn_311_0;
                                      stackOut_311_1 = (dk) (Object) stackIn_311_1;
                                      stackOut_311_2 = stackIn_311_2;
                                      stackOut_311_3 = stackIn_311_3;
                                      stackOut_311_4 = stackIn_311_4;
                                      stackOut_311_5 = stackIn_311_5;
                                      stackIn_312_0 = stackOut_311_0;
                                      stackIn_312_1 = stackOut_311_1;
                                      stackIn_312_2 = stackOut_311_2;
                                      stackIn_312_3 = stackOut_311_3;
                                      stackIn_312_4 = stackOut_311_4;
                                      stackIn_312_5 = stackOut_311_5;
                                      stackOut_312_0 = stackIn_312_0;
                                      stackOut_312_1 = (dk) (Object) stackIn_312_1;
                                      stackOut_312_2 = stackIn_312_2;
                                      stackOut_312_3 = stackIn_312_3;
                                      stackOut_312_4 = stackIn_312_4;
                                      stackOut_312_5 = stackIn_312_5;
                                      stackOut_312_6 = 1;
                                      stackIn_314_0 = stackOut_312_0;
                                      stackIn_314_1 = stackOut_312_1;
                                      stackIn_314_2 = stackOut_312_2;
                                      stackIn_314_3 = stackOut_312_3;
                                      stackIn_314_4 = stackOut_312_4;
                                      stackIn_314_5 = stackOut_312_5;
                                      stackIn_314_6 = stackOut_312_6;
                                      break L76;
                                    }
                                  }
                                  if (stackIn_314_0 == (Object) (Object) ((dk) (Object) stackIn_314_1).a(stackIn_314_2, stackIn_314_3, stackIn_314_4, stackIn_314_5, stackIn_314_6 != 0, ((r) var4).field_X, ((r) var4).field_E, true)) {
                                    var8 = 0;
                                    break L75;
                                  } else {
                                    break L75;
                                  }
                                }
                              }
                              L77: {
                                ((r) var4).field_c.field_h = (r) var4;
                                var10++;
                                if (25 >= var10) {
                                  break L77;
                                } else {
                                  var8 = 1;
                                  ((r) var4).field_Y = true;
                                  ((r) var4).field_S = false;
                                  break L77;
                                }
                              }
                              if (0 == var8) {
                                continue L67;
                              } else {
                                stackOut_320_0 = null;
                                stackOut_320_1 = (dl) var9_ref_dl;
                                stackIn_296_0 = stackOut_320_0;
                                stackIn_296_1 = stackOut_320_1;
                                stackIn_321_0 = stackOut_320_0;
                                stackIn_321_1 = stackOut_320_1;
                                if (var16 != 0) {
                                  continue L71;
                                } else {
                                  L78: {
                                    if (stackIn_321_0 == (Object) (Object) stackIn_321_1) {
                                      break L78;
                                    } else {
                                      L79: {
                                        if (var9_ref_dl.field_d) {
                                          stackOut_325_0 = 0;
                                          stackIn_326_0 = stackOut_325_0;
                                          break L79;
                                        } else {
                                          stackOut_324_0 = 1;
                                          stackIn_326_0 = stackOut_324_0;
                                          break L79;
                                        }
                                      }
                                      L80: {
                                        stackOut_326_0 = stackIn_326_0;
                                        stackIn_328_0 = stackOut_326_0;
                                        stackIn_327_0 = stackOut_326_0;
                                        if (((r) var4).field_c.field_d) {
                                          stackOut_328_0 = stackIn_328_0;
                                          stackOut_328_1 = 0;
                                          stackIn_329_0 = stackOut_328_0;
                                          stackIn_329_1 = stackOut_328_1;
                                          break L80;
                                        } else {
                                          stackOut_327_0 = stackIn_327_0;
                                          stackOut_327_1 = 1;
                                          stackIn_329_0 = stackOut_327_0;
                                          stackIn_329_1 = stackOut_327_1;
                                          break L80;
                                        }
                                      }
                                      if (stackIn_329_0 != stackIn_329_1) {
                                        ((r) var4).field_Y = true;
                                        ((r) var4).field_S = false;
                                        break L78;
                                      } else {
                                        break L78;
                                      }
                                    }
                                  }
                                  ((r) var4).field_r = null;
                                  ((r) var4).field_w = 0;
                                  break L64;
                                }
                              }
                            }
                          }
                        }
                        if ((double)((r) var4).field_jb >= (double)((r) var4).field_v * Math.random()) {
                          break L5;
                        } else {
                          L81: {
                            if (!param2) {
                              this.a(false, (r) var4);
                              break L81;
                            } else {
                              break L81;
                            }
                          }
                          ((r) var4).field_Y = true;
                          if (var16 == 0) {
                            break L5;
                          } else {
                            break L57;
                          }
                        }
                      }
                    }
                  }
                  if (((r) var4).field_t == 7) {
                    ((r) var4).field_Y = true;
                    return;
                  } else {
                    L82: {
                      if (((r) var4).field_w != 3) {
                        break L82;
                      } else {
                        break L82;
                      }
                    }
                    L83: {
                      if (null != var5) {
                        break L83;
                      } else {
                        ((r) var4).field_w = 0;
                        if (var16 == 0) {
                          break L5;
                        } else {
                          break L83;
                        }
                      }
                    }
                    L84: {
                      if (!param2) {
                        ((r) var4).field_A = 0;
                        ((r) var4).field_d = ((r) var4).field_B;
                        ((r) var4).field_S = true;
                        var8 = 0;
                        var9 = 0;
                        L85: while (true) {
                          var8 = 1;
                          var10 = 0;
                          var11 = null;
                          L86: while (true) {
                            ((r) var4).field_X = ((r) var5).field_F - -(int)(9.0 * Math.random() - 4.0);
                            ((r) var4).field_n = ((r) var5).field_H + (int)(9.0 * Math.random() - 4.0);
                            ((r) var4).field_N = ((r) var5).field_E;
                            var11_ref = ((r) var4).field_c.field_s.a(-82, ((r) var4).field_n, ((r) var4).field_N, ((r) var4).field_X);
                            int incrementValue$1 = var10;
                            var10++;
                            stackOut_352_0 = ~incrementValue$1;
                            stackOut_352_1 = -6;
                            stackIn_353_0 = stackOut_352_0;
                            stackIn_353_1 = stackOut_352_1;
                            L87: while (true) {
                              L88: {
                                L89: {
                                  if (stackIn_353_0 <= stackIn_353_1) {
                                    break L89;
                                  } else {
                                    if (null == var11_ref) {
                                      continue L86;
                                    } else {
                                      stackOut_355_0 = var11_ref.field_z;
                                      stackIn_359_0 = stackOut_355_0;
                                      stackIn_356_0 = stackOut_355_0;
                                      if (var16 != 0) {
                                        break L88;
                                      } else {
                                        if (!stackIn_356_0) {
                                          continue L86;
                                        } else {
                                          break L89;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_358_0 = ((r) var5).field_k;
                                stackIn_359_0 = stackOut_358_0;
                                break L88;
                              }
                              L90: {
                                if (!stackIn_359_0) {
                                  ((r) var4).field_X = ((r) var5).field_i - -(int)(-4.0 + Math.random() * 9.0);
                                  ((r) var4).field_n = ((r) var5).field_gb - -(int)(9.0 * Math.random() - 4.0);
                                  ((r) var4).field_N = ((r) var5).field_R;
                                  break L90;
                                } else {
                                  break L90;
                                }
                              }
                              L91: {
                                L92: {
                                  ((r) var4).field_c.field_h = null;
                                  ((r) var4).field_r = null;
                                  if (((r) var4).field_C != 0) {
                                    break L92;
                                  } else {
                                    ((r) var4).field_r = ((e) this).field_h.a(((r) var4).field_n, ((r) var4).field_H, ((r) var4).field_F, ((r) var4).field_N, false, ((r) var4).field_X, ((r) var4).field_E, true);
                                    if (((r) var4).field_r == null) {
                                      var8 = 0;
                                      if (var16 == 0) {
                                        break L91;
                                      } else {
                                        break L92;
                                      }
                                    } else {
                                      break L91;
                                    }
                                  }
                                }
                                ((e) this).field_h.b((byte) 75);
                                ((r) var4).field_r = ((e) this).field_h.a(((r) var4).field_n, ((r) var4).field_N, ((r) var4).field_X, ((r) var4).field_E, ((r) var4).field_H, ((r) var4).field_F, true);
                                if (null != ((r) var4).field_r) {
                                  break L91;
                                } else {
                                  var8 = 0;
                                  break L91;
                                }
                              }
                              L93: {
                                ((r) var4).field_c.field_h = (r) var4;
                                var9++;
                                if (var9 > 25) {
                                  L94: {
                                    ((r) var4).field_w = 1;
                                    var8 = 1;
                                    if (od.field_c[((r) var4).field_nb.field_g].field_m <= 1) {
                                      break L94;
                                    } else {
                                      ((r) var4).field_Y = true;
                                      break L94;
                                    }
                                  }
                                  ((r) var4).field_X = ((r) var4).field_F;
                                  ((r) var4).field_S = false;
                                  ((r) var4).field_n = ((r) var4).field_H;
                                  break L93;
                                } else {
                                  break L93;
                                }
                              }
                              L95: {
                                if (var8 != 0) {
                                  stackOut_377_0 = 0;
                                  stackIn_378_0 = stackOut_377_0;
                                  break L95;
                                } else {
                                  stackOut_376_0 = 1;
                                  stackIn_378_0 = stackOut_376_0;
                                  break L95;
                                }
                              }
                              if (stackIn_378_0 == 1) {
                                continue L85;
                              } else {
                                stackOut_379_0 = 2;
                                stackOut_379_1 = ((r) var4).field_w;
                                stackIn_353_0 = stackOut_379_0;
                                stackIn_353_1 = stackOut_379_1;
                                stackIn_380_0 = stackOut_379_0;
                                stackIn_380_1 = stackOut_379_1;
                                if (var16 != 0) {
                                  continue L87;
                                } else {
                                  if (stackIn_380_0 != stackIn_380_1) {
                                    break L84;
                                  } else {
                                    if (var6 == 0) {
                                      break L84;
                                    } else {
                                      ((r) var4).field_S = false;
                                      ((r) var4).field_w = 0;
                                      ((r) var4).field_X = ((r) var4).field_F;
                                      ((r) var4).field_n = ((r) var4).field_H;
                                      break L84;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L84;
                      }
                    }
                    L96: {
                      var8 = (int)(10.0 * Math.random() + 10.0);
                      if (((r) var4).field_t != 9) {
                        break L96;
                      } else {
                        ((r) var4).field_ab = 0;
                        var8 = 2;
                        break L96;
                      }
                    }
                    L97: {
                      if (3 != ((r) var4).field_w) {
                        break L97;
                      } else {
                        L98: {
                          if (~var8 < ~var7) {
                            break L98;
                          } else {
                            if (((r) var4).field_ab <= 0) {
                              break L97;
                            } else {
                              break L98;
                            }
                          }
                        }
                        if (var6 == 0) {
                          break L97;
                        } else {
                          L99: {
                            if (~((r) var4).field_jb <= ~((r) var4).c(false)) {
                              break L99;
                            } else {
                              if (((r) var4).field_jb <= 10) {
                                break L97;
                              } else {
                                break L99;
                              }
                            }
                          }
                          L100: {
                            if (var5 == null) {
                              break L100;
                            } else {
                              ((r) var4).field_N = ((r) var5).field_E;
                              ((r) var4).field_n = ((r) var5).field_H;
                              ((r) var4).field_A = 0;
                              ((r) var4).field_d = 2;
                              ((r) var4).field_S = true;
                              ((r) var4).field_X = ((r) var5).field_F;
                              if (this.a((byte) -60, (r) var5, (r) var4) >= 8) {
                                break L97;
                              } else {
                                if (null == ((r) var4).field_b) {
                                  break L97;
                                } else {
                                  ((r) var4).field_d = 4;
                                  if (var16 == 0) {
                                    break L97;
                                  } else {
                                    break L100;
                                  }
                                }
                              }
                            }
                          }
                          ((r) var4).field_w = 0;
                          break L97;
                        }
                      }
                    }
                    if (var16 == 0) {
                      break L5;
                    } else {
                      break L56;
                    }
                  }
                }
                L101: {
                  if (((r) var4).field_jb <= ((r) var4).c(false)) {
                    break L101;
                  } else {
                    L102: {
                      L103: {
                        if (var5 == null) {
                          break L103;
                        } else {
                          if (((r) var5).field_P > 0) {
                            break L102;
                          } else {
                            break L103;
                          }
                        }
                      }
                      ((r) var4).field_w = 0;
                      if (var16 == 0) {
                        break L5;
                      } else {
                        break L102;
                      }
                    }
                    ((r) var4).field_n = ((r) var5).field_H;
                    ((r) var4).field_X = ((r) var5).field_F;
                    ((r) var4).field_S = true;
                    ((r) var4).field_A = 0;
                    ((r) var4).field_d = 2;
                    ((r) var4).field_N = ((r) var5).field_E;
                    if (this.a((byte) -60, (r) var5, (r) var4) >= 8) {
                      break L5;
                    } else {
                      if (null == ((r) var4).field_b) {
                        break L5;
                      } else {
                        ((r) var4).field_d = 4;
                        if (var16 == 0) {
                          break L5;
                        } else {
                          break L101;
                        }
                      }
                    }
                  }
                }
                if (!param2) {
                  if (((r) var4).field_t == 7) {
                    ((r) var4).field_Y = true;
                    return;
                  } else {
                    this.a(false, (r) var4);
                    if (var16 == 0) {
                      break L5;
                    } else {
                      break L55;
                    }
                  }
                } else {
                  break L5;
                }
              }
              L104: {
                L105: {
                  if (var6 == 0) {
                    break L105;
                  } else {
                    if (~((r) var4).field_jb <= ~((r) var4).c(false)) {
                      break L104;
                    } else {
                      if (((r) var4).field_ab > 0) {
                        break L104;
                      } else {
                        if (((r) var4).field_jb > 10) {
                          break L104;
                        } else {
                          break L105;
                        }
                      }
                    }
                  }
                }
                if (!param2) {
                  if (7 != ((r) var4).field_t) {
                    this.a(false, (r) var4);
                    if (var16 == 0) {
                      break L5;
                    } else {
                      break L104;
                    }
                  } else {
                    ((r) var4).field_Y = true;
                    return;
                  }
                } else {
                  break L5;
                }
              }
              L106: {
                if (~((r) var4).field_jb <= ~((r) var4).c(false)) {
                  break L106;
                } else {
                  if (((r) var4).field_jb > 10) {
                    break L106;
                  } else {
                    if (!param2) {
                      if (((r) var4).field_t != 7) {
                        this.a(false, (r) var4);
                        if (var16 == 0) {
                          break L5;
                        } else {
                          break L106;
                        }
                      } else {
                        ((r) var4).field_Y = true;
                        return;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L107: {
                if (null != var5) {
                  break L107;
                } else {
                  ((r) var4).field_w = 0;
                  if (var16 == 0) {
                    break L5;
                  } else {
                    break L107;
                  }
                }
              }
              ((r) var4).field_d = 2;
              ((r) var4).field_S = true;
              ((r) var4).field_A = 0;
              ((r) var4).field_N = ((r) var5).field_E;
              ((r) var4).field_X = ((r) var5).field_F;
              ((r) var4).field_n = ((r) var5).field_H;
              if (this.a((byte) -60, (r) var5, (r) var4) >= 8) {
                break L5;
              } else {
                if (((r) var4).field_b != null) {
                  ((r) var4).field_d = 4;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
          }
          return;
        }
    }

    final void a(gi param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param1 == -51) {
                break L1;
              } else {
                this.a((Terraphoenix) null, false);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int >= 50) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (((e) this).field_F[var3_int] == null) {
                        ((e) this).field_F[var3_int] = param0;
                        return;
                      } else {
                        var3_int++;
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("e.J(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == -1) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((e) this).field_C.length <= var2_int) {
                      break L3;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (((e) this).field_C[var2_int] == null) {
                            break L4;
                          } else {
                            if (null != ((e) this).field_C[var2_int].field_Z) {
                              break L4;
                            } else {
                              if (((e) this).field_C[var2_int].field_P <= 0) {
                                break L4;
                              } else {
                                L5: {
                                  if (((e) this).field_h.a((byte) -93, ((e) this).field_q, ((e) this).field_C[var2_int])) {
                                    break L5;
                                  } else {
                                    ((e) this).field_C[var2_int].field_ib = false;
                                    if (var3 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                ((e) this).field_C[var2_int].field_ib = true;
                                break L4;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "e.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ci param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_175_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_216_0 = 0;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        RuntimeException stackIn_222_0 = null;
        StringBuilder stackIn_222_1 = null;
        String stackIn_222_2 = null;
        Throwable caughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_166_1 = 0;
        int stackOut_174_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_215_0 = 0;
        RuntimeException stackOut_218_0 = null;
        StringBuilder stackOut_218_1 = null;
        RuntimeException stackOut_219_0 = null;
        StringBuilder stackOut_219_1 = null;
        String stackOut_219_2 = null;
        RuntimeException stackOut_221_0 = null;
        StringBuilder stackOut_221_1 = null;
        String stackOut_221_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param5 == 28144) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ((e) this).a(42, 90);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (param4) {
                        statePc = 73;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var7_int = param0;
                    var8 = param1;
                    var7_int = var7_int + param3.field_p;
                    var8 = var8 + param3.field_v;
                    var9 = 0;
                    var10 = param0 - -param3.field_p;
                    var11 = param3.field_v + param1;
                    var12 = param3.field_t;
                    var13 = param3.field_r;
                    var14 = 0;
                    if (~l.field_d >= ~var8) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var15 = l.field_d + -var8;
                    var11 = var11 + var15;
                    var8 = l.field_d;
                    var9 = var9 + var13 * var15;
                    var12 = var12 - var15;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (~(var8 + var12) < ~l.field_c) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12 = var12 - (var12 + (var8 - l.field_c));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (l.field_b > var7_int) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var15 = l.field_b + -var7_int;
                    var7_int = l.field_b;
                    var13 = var13 - var15;
                    var14 = var14 + var15;
                    var10 = var10 + var15;
                    var9 = var9 + var15;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var7_int - -var13 > l.field_f) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var15 = -l.field_f + (var7_int + var13);
                    var14 = var14 + var15;
                    var13 = var13 - var15;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (0 >= var13) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var12 > 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    var16 = var10;
                    var17 = var11;
                    var18 = -(var13 >> -1702500478);
                    var13 = -(var13 & 3);
                    var8 = -var12;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var8 >= 0) {
                        statePc = 72;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7_int = var18;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var7_int >= 0) {
                        statePc = 57;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    int incrementValue$30 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$30];
                    stackOut_29_0 = ~var15;
                    stackOut_29_1 = -1;
                    stackIn_59_0 = stackOut_29_0;
                    stackIn_59_1 = stackOut_29_1;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    if (var20 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 == stackIn_30_1) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    int incrementValue$31 = var16;
                    var16++;
                    gd.field_a[incrementValue$31][var17] = param2 * 144 + var17;
                    if (var20 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var16++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    int incrementValue$32 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$32];
                    if (var15 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    int incrementValue$33 = var16;
                    var16++;
                    gd.field_a[incrementValue$33][var17] = param2 * 144 + var17;
                    if (var20 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var16++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    int incrementValue$34 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$34];
                    if (var15 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    int incrementValue$35 = var16;
                    var16++;
                    gd.field_a[incrementValue$35][var17] = 144 * param2 + var17;
                    if (var20 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var16++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    int incrementValue$36 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$36];
                    if (0 != var15) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var16++;
                    if (var20 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    int incrementValue$37 = var16;
                    var16++;
                    gd.field_a[incrementValue$37][var17] = 144 * param2 + var17;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var7_int++;
                    if (var20 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var7_int = var13;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = ~var7_int;
                    stackOut_58_1 = -1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 <= stackIn_59_1) {
                        statePc = 70;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    int incrementValue$38 = var9;
                    var9++;
                    var15 = param3.field_z[incrementValue$38];
                    stackOut_60_0 = 0;
                    stackOut_60_1 = var15;
                    stackIn_71_0 = stackOut_60_0;
                    stackIn_71_1 = stackOut_60_1;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    if (var20 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 != stackIn_61_1) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var16++;
                    if (var20 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    int incrementValue$39 = var16;
                    var16++;
                    gd.field_a[incrementValue$39][var17] = var17 - -(param2 * 144);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var7_int++;
                    if (var20 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var16 = var10;
                    stackOut_70_0 = var9;
                    stackOut_70_1 = var14;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var9 = stackIn_71_0 + stackIn_71_1;
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var20 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var7_int = -16 + (param3.field_u + param2 * 144);
                    if (60 != param3.field_u) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var7_int = param2 * 144 + (param3.field_u + -12);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var8 = param0;
                    var8 = var8 + param3.field_p;
                    var9 = param1;
                    var9 = var9 + param3.field_v;
                    var10 = 0;
                    var11 = param3.field_p + param0;
                    var12 = param3.field_v + param1;
                    var13 = param3.field_t;
                    var14 = param3.field_r;
                    var15 = 0;
                    if (var9 >= l.field_d) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var16 = l.field_d + -var9;
                    var9 = l.field_d;
                    var10 = var10 + var16 * var14;
                    var12 = var12 + var16;
                    var13 = var13 - var16;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (l.field_b <= var8) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var16 = -var8 + l.field_b;
                    var8 = l.field_b;
                    var10 = var10 + var16;
                    var15 = var15 + var16;
                    var11 = var11 + var16;
                    var14 = var14 - var16;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var13 + var9 <= l.field_c) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var13 = var13 - (-l.field_c + var9 - -var13);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var14 + var8 <= l.field_f) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var16 = var8 - -var14 + -l.field_f;
                    var14 = var14 - var16;
                    var15 = var15 + var16;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (var14 <= 0) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var13 <= 0) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    return;
                }
                case 90: {
                    var17 = var11;
                    var18 = var12;
                    if (param3.field_u == 112) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (param3.field_u != 60) {
                        statePc = 130;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var19 = -(var14 >> 2094240962);
                    var14 = -(var14 & 3);
                    var9 = -var13;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var9 >= 0) {
                        statePc = 129;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var8 = var19;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (0 <= var8) {
                        statePc = 118;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    int incrementValue$40 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$40];
                    stackOut_99_0 = ~var16;
                    stackOut_99_1 = -1;
                    stackIn_128_0 = stackOut_99_0;
                    stackIn_128_1 = stackOut_99_1;
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    if (var20 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 == stackIn_100_1) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    gd.field_a[var17][var18] = Math.abs(var17 - param0 + -param3.field_q) / 2 + var7_int + param1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var17++;
                    int incrementValue$41 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$41];
                    if (var16 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    gd.field_a[var17][var18] = Math.abs(-param3.field_q + (var17 + -param0)) / 2 + (var7_int + param1);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    int incrementValue$42 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$42];
                    var17++;
                    if (var16 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 112: {
                    gd.field_a[var17][var18] = param1 - -var7_int + Math.abs(var17 - (param0 - -param3.field_q)) / 2;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    int incrementValue$43 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$43];
                    var17++;
                    if (var16 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 116: {
                    gd.field_a[var17][var18] = Math.abs(-param0 + (var17 + -param3.field_q)) / 2 + param1 + var7_int;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var8 = var14;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (var8 >= 0) {
                        statePc = 127;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    int incrementValue$44 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$44];
                    stackOut_120_0 = 0;
                    stackOut_120_1 = var16;
                    stackIn_128_0 = stackOut_120_0;
                    stackIn_128_1 = stackOut_120_1;
                    stackIn_121_0 = stackOut_120_0;
                    stackIn_121_1 = stackOut_120_1;
                    if (var20 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (stackIn_121_0 == stackIn_121_1) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    gd.field_a[var17][var18] = Math.abs(-param0 + var17 + -param3.field_q) / 2 + (var7_int + param1);
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var17 = var11;
                    stackOut_127_0 = var10;
                    stackOut_127_1 = var15;
                    stackIn_128_0 = stackOut_127_0;
                    stackIn_128_1 = stackOut_127_1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var10 = stackIn_128_0 + stackIn_128_1;
                    var18++;
                    var9++;
                    if (var20 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (var20 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (~param0 != ~var17) {
                        statePc = 169;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var19 = -(var14 >> -732073726);
                    var14 = -(3 & var14);
                    var9 = -var13;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (var9 >= 0) {
                        statePc = 168;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var8 = var19;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var8 >= 0) {
                        statePc = 156;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    int incrementValue$45 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$45];
                    stackOut_138_0 = -1;
                    stackOut_138_1 = ~var16;
                    stackIn_158_0 = stackOut_138_0;
                    stackIn_158_1 = stackOut_138_1;
                    stackIn_139_0 = stackOut_138_0;
                    stackIn_139_1 = stackOut_138_1;
                    if (var20 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (stackIn_139_0 != stackIn_139_1) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    gd.field_a[var17][var18] = var7_int + param1 + -((var17 - param0) / 2);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var17++;
                    int incrementValue$46 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$46];
                    if (var16 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 147: {
                    gd.field_a[var17][var18] = param1 + var7_int + -((var17 - param0) / 2);
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    var17++;
                    int incrementValue$47 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$47];
                    if (0 == var16) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    gd.field_a[var17][var18] = var7_int + (param1 - (-param0 + var17) / 2);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var17++;
                    int incrementValue$48 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$48];
                    if (var16 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    gd.field_a[var17][var18] = var7_int + param1 + -((-param0 + var17) / 2);
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var8 = var14;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    stackOut_157_0 = 0;
                    stackOut_157_1 = var8;
                    stackIn_158_0 = stackOut_157_0;
                    stackIn_158_1 = stackOut_157_1;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 <= stackIn_158_1) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    int incrementValue$49 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$49];
                    stackOut_159_0 = -1;
                    stackOut_159_1 = ~var16;
                    stackIn_167_0 = stackOut_159_0;
                    stackIn_167_1 = stackOut_159_1;
                    stackIn_160_0 = stackOut_159_0;
                    stackIn_160_1 = stackOut_159_1;
                    if (var20 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (stackIn_160_0 == stackIn_160_1) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    gd.field_a[var17][var18] = -((-param0 + var17) / 2) + var7_int + param1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var17++;
                    var8++;
                    if (var20 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var17 = var11;
                    var18++;
                    stackOut_166_0 = var10;
                    stackOut_166_1 = var15;
                    stackIn_167_0 = stackOut_166_0;
                    stackIn_167_1 = stackOut_166_1;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var10 = stackIn_167_0 + stackIn_167_1;
                    var9++;
                    if (var20 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (var20 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var19 = -(var14 >> 1336811746);
                    var14 = -(3 & var14);
                    var9 = -var13;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (var9 >= 0) {
                        statePc = 223;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var20 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var8 = var19;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (var8 >= 0) {
                        statePc = 202;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    int incrementValue$50 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$50];
                    stackOut_174_0 = var16;
                    stackIn_203_0 = stackOut_174_0;
                    stackIn_175_0 = stackOut_174_0;
                    if (var20 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (stackIn_175_0 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    int incrementValue$51 = var17;
                    var17++;
                    gd.field_a[incrementValue$51][var18] = param1 + (var7_int + -((64 + (-var17 - -param0)) / 2));
                    if (var20 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var17++;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    int incrementValue$52 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$52];
                    if (var16 == 0) {
                        statePc = 187;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    int incrementValue$53 = var17;
                    var17++;
                    gd.field_a[incrementValue$53][var18] = -((64 + -var17 - -param0) / 2) + var7_int + param1;
                    if (var20 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var17++;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    int incrementValue$54 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$54];
                    if (var16 != 0) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var17++;
                    if (var20 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    int incrementValue$55 = var17;
                    var17++;
                    gd.field_a[incrementValue$55][var18] = param1 + var7_int - (param0 + -var17 - -64) / 2;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    int incrementValue$56 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$56];
                    if (var16 == 0) {
                        statePc = 199;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    int incrementValue$57 = var17;
                    var17++;
                    gd.field_a[incrementValue$57][var18] = -((64 + -var17 + param0) / 2) + (var7_int + param1);
                    if (var20 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var17++;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    var8++;
                    if (var20 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    stackOut_202_0 = var14;
                    stackIn_203_0 = stackOut_202_0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var8 = stackIn_203_0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var8 >= 0) {
                        statePc = 215;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    int incrementValue$58 = var10;
                    var10++;
                    var16 = param3.field_z[incrementValue$58];
                    stackOut_205_0 = var16;
                    stackIn_216_0 = stackOut_205_0;
                    stackIn_206_0 = stackOut_205_0;
                    if (var20 != 0) {
                        statePc = 216;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (stackIn_206_0 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var17++;
                    if (var20 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    int incrementValue$59 = var17;
                    var17++;
                    gd.field_a[incrementValue$59][var18] = -((param0 + -var17 + 64) / 2) + param1 + var7_int;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    var8++;
                    if (var20 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var18++;
                    var10 = var10 + var15;
                    stackOut_215_0 = var11;
                    stackIn_216_0 = stackOut_215_0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    var17 = stackIn_216_0;
                    var9++;
                    if (var20 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, Terraphoenix param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        r stackIn_4_0 = null;
        ga stackIn_27_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_103_0 = null;
        hk stackIn_136_0 = null;
        hk stackIn_138_0 = null;
        hk stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        hk stackIn_147_0 = null;
        hk stackIn_149_0 = null;
        hk stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        r stackIn_209_0 = null;
        ga stackIn_210_0 = null;
        hk stackIn_266_0 = null;
        hk stackIn_268_0 = null;
        hk stackIn_270_0 = null;
        hk stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        hk stackIn_289_0 = null;
        hk stackIn_291_0 = null;
        hk stackIn_293_0 = null;
        hk stackIn_294_0 = null;
        int stackIn_294_1 = 0;
        hk stackIn_301_0 = null;
        hk stackIn_303_0 = null;
        hk stackIn_305_0 = null;
        hk stackIn_306_0 = null;
        int stackIn_306_1 = 0;
        int stackIn_382_0 = 0;
        int stackIn_382_1 = 0;
        int stackIn_455_0 = 0;
        int stackIn_476_0 = 0;
        int stackIn_523_0 = 0;
        int stackIn_523_1 = 0;
        r stackIn_528_0 = null;
        r stackIn_548_0 = null;
        RuntimeException stackIn_597_0 = null;
        StringBuilder stackIn_597_1 = null;
        RuntimeException stackIn_599_0 = null;
        StringBuilder stackIn_599_1 = null;
        RuntimeException stackIn_600_0 = null;
        StringBuilder stackIn_600_1 = null;
        String stackIn_600_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        r stackOut_3_0 = null;
        ga stackOut_209_0 = null;
        r stackOut_208_0 = null;
        ga stackOut_26_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_102_0 = null;
        hk stackOut_135_0 = null;
        hk stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        hk stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        hk stackOut_146_0 = null;
        hk stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        hk stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        hk stackOut_265_0 = null;
        hk stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        hk stackOut_266_0 = null;
        hk stackOut_268_0 = null;
        int stackOut_268_1 = 0;
        hk stackOut_288_0 = null;
        hk stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        hk stackOut_289_0 = null;
        hk stackOut_291_0 = null;
        int stackOut_291_1 = 0;
        hk stackOut_300_0 = null;
        hk stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        hk stackOut_301_0 = null;
        hk stackOut_303_0 = null;
        int stackOut_303_1 = 0;
        int stackOut_381_0 = 0;
        int stackOut_381_1 = 0;
        int stackOut_454_0 = 0;
        int stackOut_475_0 = 0;
        int stackOut_522_0 = 0;
        int stackOut_522_1 = 0;
        r stackOut_527_0 = null;
        r stackOut_547_0 = null;
        RuntimeException stackOut_596_0 = null;
        StringBuilder stackOut_596_1 = null;
        RuntimeException stackOut_599_0 = null;
        StringBuilder stackOut_599_1 = null;
        String stackOut_599_2 = null;
        RuntimeException stackOut_597_0 = null;
        StringBuilder stackOut_597_1 = null;
        String stackOut_597_2 = null;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            ja.field_i = 7;
            rk.field_c = 32;
            wb.field_g = 20;
            hh.field_m.a();
            l.a();
            k.field_f.a(0);
            var4 = -88 % ((-66 - param0) / 59);
            var3_int = 0;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (((e) this).field_C.length <= var6) {
                      break L4;
                    } else {
                      stackOut_3_0 = ((e) this).field_C[var6];
                      stackIn_209_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var12 != 0) {
                        L5: while (true) {
                          stackOut_209_0 = stackIn_209_0.field_Z;
                          stackIn_210_0 = stackOut_209_0;
                          L6: {
                            if (stackIn_210_0.field_b == null) {
                              break L6;
                            } else {
                              ((e) this).field_C[var6].field_Z.field_b = ((e) this).field_C[var6].field_Z.field_b.a(((e) this).field_e.field_l, param1.field_I, 8);
                              break L6;
                            }
                          }
                          L7: {
                            if (null == ((e) this).field_C[var6].field_Z.field_A) {
                              break L7;
                            } else {
                              ((e) this).field_C[var6].field_Z.field_A = ((e) this).field_C[var6].field_Z.field_A.a(((e) this).field_e.field_l, param1.field_I, 8);
                              break L7;
                            }
                          }
                          L8: while (true) {
                            var6++;
                            if (var12 == 0) {
                              if (var6 >= ((e) this).field_C.length) {
                                break L2;
                              } else {
                                if (null != ((e) this).field_C[var6]) {
                                  L9: {
                                    if (null != ((e) this).field_C[var6].field_Z) {
                                      break L9;
                                    } else {
                                      if (((e) this).field_C[var6].field_P > 0) {
                                        continue L8;
                                      } else {
                                        L10: {
                                          if (((e) this).field_C[var6].field_t != 0) {
                                            break L10;
                                          } else {
                                            ((e) this).field_e.field_g = ((e) this).field_e.field_g + 1;
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if (((e) this).field_C[var6].field_t != 1) {
                                            break L11;
                                          } else {
                                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (((e) this).field_C[var6].field_t != 2) {
                                            break L12;
                                          } else {
                                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (((e) this).field_C[var6].field_t == 3) {
                                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                            ((e) this).field_e.field_l.field_a[17] = ((e) this).field_e.field_l.field_a[17] + 1;
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          if (((e) this).field_C[var6].field_t == 4) {
                                            ((e) this).field_e.field_b = ((e) this).field_e.field_b + 1;
                                            break L14;
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          if (((e) this).field_C[var6].field_t != 5) {
                                            break L15;
                                          } else {
                                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (6 != ((e) this).field_C[var6].field_t) {
                                            break L16;
                                          } else {
                                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                            break L16;
                                          }
                                        }
                                        if (((e) this).field_C[var6].field_t == 9) {
                                          ((e) this).field_e.field_m = ((e) this).field_e.field_m + 1;
                                          if (var12 == 0) {
                                            continue L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  if (param1.field_Bb != 12) {
                                    stackOut_208_0 = ((e) this).field_C[var6];
                                    stackIn_209_0 = stackOut_208_0;
                                    continue L5;
                                  } else {
                                    continue L8;
                                  }
                                } else {
                                  continue L8;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        L17: {
                          if (stackIn_4_0 != null) {
                            if (((e) this).field_C[var6].field_P > 0) {
                              L18: {
                                if (null == ((e) this).field_C[var6].field_c) {
                                  break L18;
                                } else {
                                  ((e) this).field_C[var6].field_c.field_h = null;
                                  break L18;
                                }
                              }
                              L19: {
                                if (null != ((e) this).field_C[var6].field_Z) {
                                  break L19;
                                } else {
                                  if (((e) this).field_C[var6].field_C == 0) {
                                    break L19;
                                  } else {
                                    var5++;
                                    if (var12 == 0) {
                                      break L17;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var3_int++;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            break L17;
                          }
                        }
                        var6++;
                        if (var12 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var6 = 0;
                  L20: while (true) {
                    L21: {
                      if (~var6 <= ~param1.field_nb.length) {
                        break L21;
                      } else {
                        stackOut_26_0 = param1.field_nb[var6];
                        stackIn_210_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var12 != 0) {
                          L22: while (true) {
                            L23: {
                              if (stackIn_210_0.field_b == null) {
                                break L23;
                              } else {
                                ((e) this).field_C[var6].field_Z.field_b = ((e) this).field_C[var6].field_Z.field_b.a(((e) this).field_e.field_l, param1.field_I, 8);
                                break L23;
                              }
                            }
                            L24: {
                              if (null == ((e) this).field_C[var6].field_Z.field_A) {
                                break L24;
                              } else {
                                ((e) this).field_C[var6].field_Z.field_A = ((e) this).field_C[var6].field_Z.field_A.a(((e) this).field_e.field_l, param1.field_I, 8);
                                break L24;
                              }
                            }
                            L25: while (true) {
                              var6++;
                              if (var12 == 0) {
                                if (var6 >= ((e) this).field_C.length) {
                                  break L2;
                                } else {
                                  if (null != ((e) this).field_C[var6]) {
                                    L26: {
                                      if (null != ((e) this).field_C[var6].field_Z) {
                                        break L26;
                                      } else {
                                        if (((e) this).field_C[var6].field_P > 0) {
                                          continue L25;
                                        } else {
                                          L27: {
                                            if (((e) this).field_C[var6].field_t != 0) {
                                              break L27;
                                            } else {
                                              ((e) this).field_e.field_g = ((e) this).field_e.field_g + 1;
                                              break L27;
                                            }
                                          }
                                          L28: {
                                            if (((e) this).field_C[var6].field_t != 1) {
                                              break L28;
                                            } else {
                                              ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                              break L28;
                                            }
                                          }
                                          L29: {
                                            if (((e) this).field_C[var6].field_t != 2) {
                                              break L29;
                                            } else {
                                              ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            if (((e) this).field_C[var6].field_t == 3) {
                                              ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                              ((e) this).field_e.field_l.field_a[17] = ((e) this).field_e.field_l.field_a[17] + 1;
                                              break L30;
                                            } else {
                                              break L30;
                                            }
                                          }
                                          L31: {
                                            if (((e) this).field_C[var6].field_t == 4) {
                                              ((e) this).field_e.field_b = ((e) this).field_e.field_b + 1;
                                              break L31;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            if (((e) this).field_C[var6].field_t != 5) {
                                              break L32;
                                            } else {
                                              ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                              break L32;
                                            }
                                          }
                                          L33: {
                                            if (6 != ((e) this).field_C[var6].field_t) {
                                              break L33;
                                            } else {
                                              ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                              break L33;
                                            }
                                          }
                                          if (((e) this).field_C[var6].field_t == 9) {
                                            ((e) this).field_e.field_m = ((e) this).field_e.field_m + 1;
                                            if (var12 == 0) {
                                              continue L25;
                                            } else {
                                              break L26;
                                            }
                                          } else {
                                            continue L25;
                                          }
                                        }
                                      }
                                    }
                                    if (param1.field_Bb != 12) {
                                      stackOut_208_0 = ((e) this).field_C[var6];
                                      stackIn_209_0 = stackOut_208_0;
                                      stackOut_209_0 = stackIn_209_0.field_Z;
                                      stackIn_210_0 = stackOut_209_0;
                                      continue L22;
                                    } else {
                                      continue L25;
                                    }
                                  } else {
                                    continue L25;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        } else {
                          L34: {
                            if (stackIn_27_0 == null) {
                              break L34;
                            } else {
                              ((e) this).field_e.field_e = ((e) this).field_e.field_e + 1;
                              break L34;
                            }
                          }
                          var6++;
                          if (var12 == 0) {
                            continue L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    L35: {
                      if (var3_int <= 0) {
                        break L35;
                      } else {
                        if (var5 != 0) {
                          break L35;
                        } else {
                          if (!((e) this).field_r) {
                            break L3;
                          } else {
                            break L35;
                          }
                        }
                      }
                    }
                    L36: {
                      ((e) this).field_f = 2;
                      if (!((e) this).field_r) {
                        break L36;
                      } else {
                        ((e) this).field_e.field_i = -1;
                        var6 = 0;
                        L37: while (true) {
                          L38: {
                            L39: {
                              if (var6 >= ((e) this).field_C.length) {
                                break L39;
                              } else {
                                stackOut_45_0 = this;
                                stackIn_103_0 = stackOut_45_0;
                                stackIn_46_0 = stackOut_45_0;
                                if (var12 != 0) {
                                  break L38;
                                } else {
                                  L40: {
                                    if (((e) this).field_C[var6] != null) {
                                      L41: {
                                        if (((e) this).field_C[var6].field_Z == null) {
                                          break L41;
                                        } else {
                                          if (param1.field_Bb == 12) {
                                            break L40;
                                          } else {
                                            L42: {
                                              if (null != ((e) this).field_C[var6].field_Z.field_b) {
                                                ((e) this).field_C[var6].field_Z.field_b = ((e) this).field_C[var6].field_Z.field_b.a(((e) this).field_e.field_l, param1.field_I, 8);
                                                break L42;
                                              } else {
                                                break L42;
                                              }
                                            }
                                            if (((e) this).field_C[var6].field_Z.field_A == null) {
                                              break L40;
                                            } else {
                                              ((e) this).field_C[var6].field_Z.field_A = ((e) this).field_C[var6].field_Z.field_A.a(((e) this).field_e.field_l, param1.field_I, 8);
                                              if (var12 == 0) {
                                                break L40;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L43: {
                                        if (((e) this).field_C[var6].field_t == 0) {
                                          ((e) this).field_e.field_g = ((e) this).field_e.field_g + 1;
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                      L44: {
                                        if (((e) this).field_C[var6].field_t != 1) {
                                          break L44;
                                        } else {
                                          ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                          break L44;
                                        }
                                      }
                                      L45: {
                                        if (((e) this).field_C[var6].field_t != 2) {
                                          break L45;
                                        } else {
                                          ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                          break L45;
                                        }
                                      }
                                      L46: {
                                        if (((e) this).field_C[var6].field_t != 3) {
                                          break L46;
                                        } else {
                                          ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                          ((e) this).field_e.field_l.field_a[17] = ((e) this).field_e.field_l.field_a[17] + 1;
                                          break L46;
                                        }
                                      }
                                      L47: {
                                        if (4 != ((e) this).field_C[var6].field_t) {
                                          break L47;
                                        } else {
                                          ((e) this).field_e.field_b = ((e) this).field_e.field_b + 1;
                                          break L47;
                                        }
                                      }
                                      L48: {
                                        if (((e) this).field_C[var6].field_t == 5) {
                                          ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      L49: {
                                        if (6 != ((e) this).field_C[var6].field_t) {
                                          break L49;
                                        } else {
                                          ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                          break L49;
                                        }
                                      }
                                      L50: {
                                        if (9 == ((e) this).field_C[var6].field_t) {
                                          ((e) this).field_e.field_m = ((e) this).field_e.field_m + 1;
                                          break L50;
                                        } else {
                                          break L50;
                                        }
                                      }
                                      L51: {
                                        if (((e) this).field_C[var6].field_nb != null) {
                                          ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_nb.field_g] = ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_nb.field_g] + 1;
                                          break L51;
                                        } else {
                                          break L51;
                                        }
                                      }
                                      if (((e) this).field_C[var6].field_b == null) {
                                        break L40;
                                      } else {
                                        ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_b.field_g] = ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_b.field_g] + ((e) this).field_C[var6].field_b.field_d;
                                        break L40;
                                      }
                                    } else {
                                      break L40;
                                    }
                                  }
                                  var6++;
                                  if (var12 == 0) {
                                    continue L37;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                            stackOut_102_0 = this;
                            stackIn_103_0 = stackOut_102_0;
                            break L38;
                          }
                          ((e) this).field_i = 6;
                          if (var12 == 0) {
                            break L2;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    L52: {
                      ((e) this).field_i = 5;
                      if (param1.field_Bb == 1) {
                        ((e) this).field_e.field_i = -2;
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                    L53: {
                      if (param1.field_Bb == 2) {
                        ((e) this).field_e.field_i = -2;
                        break L53;
                      } else {
                        break L53;
                      }
                    }
                    L54: {
                      if (param1.field_Bb == 3) {
                        ((e) this).field_e.field_i = -2;
                        break L54;
                      } else {
                        break L54;
                      }
                    }
                    L55: {
                      if (param1.field_Bb == 4) {
                        ((e) this).field_e.field_i = -1;
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                    L56: {
                      if (param1.field_Bb != 5) {
                        break L56;
                      } else {
                        ((e) this).field_e.field_i = -2;
                        break L56;
                      }
                    }
                    L57: {
                      if (param1.field_Bb != 6) {
                        break L57;
                      } else {
                        ((e) this).field_e.field_i = -1;
                        break L57;
                      }
                    }
                    L58: {
                      if (param1.field_Bb == 7) {
                        ((e) this).field_e.field_i = -2;
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    L59: {
                      if (param1.field_Bb == 8) {
                        L60: {
                          stackOut_135_0 = ((e) this).field_e;
                          stackIn_138_0 = stackOut_135_0;
                          stackIn_136_0 = stackOut_135_0;
                          if (param1.field_vb != 1) {
                            stackOut_138_0 = (hk) (Object) stackIn_138_0;
                            stackOut_138_1 = -1;
                            stackIn_139_0 = stackOut_138_0;
                            stackIn_139_1 = stackOut_138_1;
                            break L60;
                          } else {
                            stackOut_136_0 = (hk) (Object) stackIn_136_0;
                            stackOut_136_1 = -3;
                            stackIn_139_0 = stackOut_136_0;
                            stackIn_139_1 = stackOut_136_1;
                            break L60;
                          }
                        }
                        stackIn_139_0.field_i = stackIn_139_1;
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    L61: {
                      if (9 != param1.field_Bb) {
                        break L61;
                      } else {
                        ((e) this).field_e.field_i = -2;
                        break L61;
                      }
                    }
                    L62: {
                      if (10 == param1.field_Bb) {
                        L63: {
                          stackOut_146_0 = ((e) this).field_e;
                          stackIn_149_0 = stackOut_146_0;
                          stackIn_147_0 = stackOut_146_0;
                          if (param1.field_vb != 1) {
                            stackOut_149_0 = (hk) (Object) stackIn_149_0;
                            stackOut_149_1 = -3;
                            stackIn_150_0 = stackOut_149_0;
                            stackIn_150_1 = stackOut_149_1;
                            break L63;
                          } else {
                            stackOut_147_0 = (hk) (Object) stackIn_147_0;
                            stackOut_147_1 = -1;
                            stackIn_150_0 = stackOut_147_0;
                            stackIn_150_1 = stackOut_147_1;
                            break L63;
                          }
                        }
                        stackIn_150_0.field_i = stackIn_150_1;
                        break L62;
                      } else {
                        break L62;
                      }
                    }
                    L64: {
                      if (param1.field_Bb == 11) {
                        ((e) this).field_e.field_i = -4;
                        break L64;
                      } else {
                        break L64;
                      }
                    }
                    L65: {
                      if (12 == param1.field_Bb) {
                        ((e) this).field_e.field_i = -3;
                        break L65;
                      } else {
                        break L65;
                      }
                    }
                    L66: {
                      if (param1.field_Bb != 13) {
                        break L66;
                      } else {
                        ((e) this).field_e.field_i = -5;
                        break L66;
                      }
                    }
                    L67: {
                      if (!param1.field_db) {
                        break L67;
                      } else {
                        ((e) this).field_e.field_i = -6;
                        break L67;
                      }
                    }
                    var6 = 0;
                    L68: while (true) {
                      if (var6 >= ((e) this).field_C.length) {
                        break L2;
                      } else {
                        L69: {
                          if (null != ((e) this).field_C[var6]) {
                            L70: {
                              if (null != ((e) this).field_C[var6].field_Z) {
                                break L70;
                              } else {
                                if (((e) this).field_C[var6].field_P > 0) {
                                  break L69;
                                } else {
                                  L71: {
                                    if (((e) this).field_C[var6].field_t != 0) {
                                      break L71;
                                    } else {
                                      ((e) this).field_e.field_g = ((e) this).field_e.field_g + 1;
                                      break L71;
                                    }
                                  }
                                  L72: {
                                    if (((e) this).field_C[var6].field_t != 1) {
                                      break L72;
                                    } else {
                                      ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                      break L72;
                                    }
                                  }
                                  L73: {
                                    if (((e) this).field_C[var6].field_t != 2) {
                                      break L73;
                                    } else {
                                      ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                      break L73;
                                    }
                                  }
                                  L74: {
                                    if (((e) this).field_C[var6].field_t == 3) {
                                      ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                      ((e) this).field_e.field_l.field_a[17] = ((e) this).field_e.field_l.field_a[17] + 1;
                                      break L74;
                                    } else {
                                      break L74;
                                    }
                                  }
                                  L75: {
                                    if (((e) this).field_C[var6].field_t == 4) {
                                      ((e) this).field_e.field_b = ((e) this).field_e.field_b + 1;
                                      break L75;
                                    } else {
                                      break L75;
                                    }
                                  }
                                  L76: {
                                    if (((e) this).field_C[var6].field_t != 5) {
                                      break L76;
                                    } else {
                                      ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                      break L76;
                                    }
                                  }
                                  L77: {
                                    if (6 != ((e) this).field_C[var6].field_t) {
                                      break L77;
                                    } else {
                                      ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                                      break L77;
                                    }
                                  }
                                  if (((e) this).field_C[var6].field_t == 9) {
                                    ((e) this).field_e.field_m = ((e) this).field_e.field_m + 1;
                                    if (var12 == 0) {
                                      break L69;
                                    } else {
                                      break L70;
                                    }
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                            }
                            if (param1.field_Bb != 12) {
                              stackOut_208_0 = ((e) this).field_C[var6];
                              stackIn_209_0 = stackOut_208_0;
                              stackOut_209_0 = stackIn_209_0.field_Z;
                              stackIn_210_0 = stackOut_209_0;
                              L78: {
                                if (stackIn_210_0.field_b == null) {
                                  break L78;
                                } else {
                                  ((e) this).field_C[var6].field_Z.field_b = ((e) this).field_C[var6].field_Z.field_b.a(((e) this).field_e.field_l, param1.field_I, 8);
                                  break L78;
                                }
                              }
                              if (null == ((e) this).field_C[var6].field_Z.field_A) {
                                break L69;
                              } else {
                                ((e) this).field_C[var6].field_Z.field_A = ((e) this).field_C[var6].field_Z.field_A.a(((e) this).field_e.field_l, param1.field_I, 8);
                                break L69;
                              }
                            } else {
                              break L69;
                            }
                          } else {
                            break L69;
                          }
                        }
                        var6++;
                        if (var12 == 0) {
                          continue L68;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L79: {
                  if (param1.field_db) {
                    break L79;
                  } else {
                    L80: {
                      if (param1.field_Bb != 2) {
                        break L80;
                      } else {
                        mh.a((byte) 117, 9, 246);
                        break L80;
                      }
                    }
                    L81: {
                      if (param1.field_Bb == 6) {
                        mh.a((byte) 123, 10, 245);
                        break L81;
                      } else {
                        break L81;
                      }
                    }
                    L82: {
                      if (param1.field_Bb != 10) {
                        break L82;
                      } else {
                        mh.a((byte) 113, 11, 244);
                        break L82;
                      }
                    }
                    if (param1.field_Bb != 13) {
                      break L79;
                    } else {
                      L83: {
                        mh.a((byte) 127, 12, 243);
                        if (param1.field_fb) {
                          mh.a((byte) 119, 13, 242);
                          break L83;
                        } else {
                          break L83;
                        }
                      }
                      L84: {
                        if (!param1.field_ob) {
                          break L84;
                        } else {
                          if (fa.field_a != 1) {
                            break L84;
                          } else {
                            mh.a((byte) 117, 14, 241);
                            break L84;
                          }
                        }
                      }
                      if (fa.field_a != 2) {
                        break L79;
                      } else {
                        mh.a((byte) 121, 15, 240);
                        break L79;
                      }
                    }
                  }
                }
                L85: {
                  if (!param1.field_db) {
                    break L85;
                  } else {
                    param1.field_M = param1.field_M + 1;
                    param1.field_Fb = param1.field_Fb + 1;
                    qc.field_c = qc.field_c + 1;
                    if (mb.b(0, -64)) {
                      mh.a((byte) 120, 16, 239);
                      break L85;
                    } else {
                      break L85;
                    }
                  }
                }
                L86: {
                  ((e) this).field_f = 1;
                  ((e) this).field_i = 6;
                  if (13 == param1.field_Bb) {
                    ((e) this).field_i = 4;
                    break L86;
                  } else {
                    break L86;
                  }
                }
                L87: {
                  if (param1.field_Bb == 1) {
                    ((e) this).field_e.field_i = 1;
                    break L87;
                  } else {
                    break L87;
                  }
                }
                L88: {
                  if (2 != param1.field_Bb) {
                    break L88;
                  } else {
                    ((e) this).field_e.field_i = 2;
                    break L88;
                  }
                }
                L89: {
                  if (3 != param1.field_Bb) {
                    break L89;
                  } else {
                    L90: {
                      stackOut_265_0 = ((e) this).field_e;
                      stackIn_270_0 = stackOut_265_0;
                      stackIn_266_0 = stackOut_265_0;
                      if (param1.field_ub == 1) {
                        stackOut_270_0 = (hk) (Object) stackIn_270_0;
                        stackOut_270_1 = 3;
                        stackIn_271_0 = stackOut_270_0;
                        stackIn_271_1 = stackOut_270_1;
                        break L90;
                      } else {
                        stackOut_266_0 = (hk) (Object) stackIn_266_0;
                        stackIn_268_0 = stackOut_266_0;
                        stackOut_268_0 = (hk) (Object) stackIn_268_0;
                        stackOut_268_1 = 4;
                        stackIn_271_0 = stackOut_268_0;
                        stackIn_271_1 = stackOut_268_1;
                        break L90;
                      }
                    }
                    stackIn_271_0.field_i = stackIn_271_1;
                    break L89;
                  }
                }
                L91: {
                  if (4 == param1.field_Bb) {
                    ((e) this).field_e.field_i = 5;
                    break L91;
                  } else {
                    break L91;
                  }
                }
                L92: {
                  if (5 == param1.field_Bb) {
                    ((e) this).field_e.field_i = 2;
                    break L92;
                  } else {
                    break L92;
                  }
                }
                L93: {
                  if (6 != param1.field_Bb) {
                    break L93;
                  } else {
                    ((e) this).field_e.field_i = 6;
                    break L93;
                  }
                }
                L94: {
                  if (param1.field_Bb == 7) {
                    ((e) this).field_e.field_i = 2;
                    break L94;
                  } else {
                    break L94;
                  }
                }
                L95: {
                  if (param1.field_Bb != 8) {
                    break L95;
                  } else {
                    L96: {
                      stackOut_288_0 = ((e) this).field_e;
                      stackIn_293_0 = stackOut_288_0;
                      stackIn_289_0 = stackOut_288_0;
                      if (1 != param1.field_vb) {
                        stackOut_293_0 = (hk) (Object) stackIn_293_0;
                        stackOut_293_1 = 8;
                        stackIn_294_0 = stackOut_293_0;
                        stackIn_294_1 = stackOut_293_1;
                        break L96;
                      } else {
                        stackOut_289_0 = (hk) (Object) stackIn_289_0;
                        stackIn_291_0 = stackOut_289_0;
                        stackOut_291_0 = (hk) (Object) stackIn_291_0;
                        stackOut_291_1 = 7;
                        stackIn_294_0 = stackOut_291_0;
                        stackIn_294_1 = stackOut_291_1;
                        break L96;
                      }
                    }
                    stackIn_294_0.field_i = stackIn_294_1;
                    break L95;
                  }
                }
                L97: {
                  if (9 == param1.field_Bb) {
                    ((e) this).field_e.field_i = 2;
                    break L97;
                  } else {
                    break L97;
                  }
                }
                L98: {
                  if (10 != param1.field_Bb) {
                    break L98;
                  } else {
                    L99: {
                      stackOut_300_0 = ((e) this).field_e;
                      stackIn_305_0 = stackOut_300_0;
                      stackIn_301_0 = stackOut_300_0;
                      if (param1.field_vb == 1) {
                        stackOut_305_0 = (hk) (Object) stackIn_305_0;
                        stackOut_305_1 = 8;
                        stackIn_306_0 = stackOut_305_0;
                        stackIn_306_1 = stackOut_305_1;
                        break L99;
                      } else {
                        stackOut_301_0 = (hk) (Object) stackIn_301_0;
                        stackIn_303_0 = stackOut_301_0;
                        stackOut_303_0 = (hk) (Object) stackIn_303_0;
                        stackOut_303_1 = 7;
                        stackIn_306_0 = stackOut_303_0;
                        stackIn_306_1 = stackOut_303_1;
                        break L99;
                      }
                    }
                    stackIn_306_0.field_i = stackIn_306_1;
                    break L98;
                  }
                }
                L100: {
                  if (param1.field_Bb != 11) {
                    break L100;
                  } else {
                    ((e) this).field_e.field_i = 9;
                    break L100;
                  }
                }
                L101: {
                  if (param1.field_Bb != 12) {
                    break L101;
                  } else {
                    ((e) this).field_e.field_i = 10;
                    break L101;
                  }
                }
                L102: {
                  if (param1.field_Bb != 13) {
                    break L102;
                  } else {
                    ((e) this).field_e.field_i = 11;
                    break L102;
                  }
                }
                L103: {
                  if (!param1.field_db) {
                    break L103;
                  } else {
                    ((e) this).field_e.field_i = 12;
                    break L103;
                  }
                }
                var6 = 0;
                L104: while (true) {
                  if (((e) this).field_C.length <= var6) {
                    break L2;
                  } else {
                    L105: {
                      if (null != ((e) this).field_C[var6]) {
                        L106: {
                          if (((e) this).field_C[var6].field_Z == null) {
                            break L106;
                          } else {
                            if (param1.field_Bb != 12) {
                              L107: {
                                if (((e) this).field_C[var6].field_Z.field_b == null) {
                                  break L107;
                                } else {
                                  ((e) this).field_C[var6].field_Z.field_b = ((e) this).field_C[var6].field_Z.field_b.a(((e) this).field_e.field_l, param1.field_I, 8);
                                  break L107;
                                }
                              }
                              if (((e) this).field_C[var6].field_Z.field_A == null) {
                                break L105;
                              } else {
                                ((e) this).field_C[var6].field_Z.field_A = ((e) this).field_C[var6].field_Z.field_A.a(((e) this).field_e.field_l, param1.field_I, 8);
                                if (var12 == 0) {
                                  break L105;
                                } else {
                                  break L106;
                                }
                              }
                            } else {
                              break L105;
                            }
                          }
                        }
                        L108: {
                          if (((e) this).field_C[var6].field_t == 0) {
                            ((e) this).field_e.field_g = ((e) this).field_e.field_g + 1;
                            break L108;
                          } else {
                            break L108;
                          }
                        }
                        L109: {
                          if (((e) this).field_C[var6].field_t == 1) {
                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                            break L109;
                          } else {
                            break L109;
                          }
                        }
                        L110: {
                          if (2 == ((e) this).field_C[var6].field_t) {
                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                            break L110;
                          } else {
                            break L110;
                          }
                        }
                        L111: {
                          if (((e) this).field_C[var6].field_t != 3) {
                            break L111;
                          } else {
                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                            ((e) this).field_e.field_l.field_a[17] = ((e) this).field_e.field_l.field_a[17] + 1;
                            break L111;
                          }
                        }
                        L112: {
                          if (((e) this).field_C[var6].field_t != 4) {
                            break L112;
                          } else {
                            ((e) this).field_e.field_b = ((e) this).field_e.field_b + 1;
                            break L112;
                          }
                        }
                        L113: {
                          if (((e) this).field_C[var6].field_t != 5) {
                            break L113;
                          } else {
                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                            break L113;
                          }
                        }
                        L114: {
                          if (6 == ((e) this).field_C[var6].field_t) {
                            ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                            break L114;
                          } else {
                            break L114;
                          }
                        }
                        L115: {
                          if (((e) this).field_C[var6].field_t == 9) {
                            ((e) this).field_e.field_m = ((e) this).field_e.field_m + 1;
                            break L115;
                          } else {
                            break L115;
                          }
                        }
                        L116: {
                          if (((e) this).field_C[var6].field_nb == null) {
                            break L116;
                          } else {
                            if (19 <= ((e) this).field_C[var6].field_nb.field_g) {
                              break L116;
                            } else {
                              ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_nb.field_g] = ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_nb.field_g] + 1;
                              break L116;
                            }
                          }
                        }
                        if (null != ((e) this).field_C[var6].field_b) {
                          ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_b.field_g] = ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_b.field_g] + ((e) this).field_C[var6].field_b.field_d;
                          break L105;
                        } else {
                          break L105;
                        }
                      } else {
                        break L105;
                      }
                    }
                    var6++;
                    if (var12 == 0) {
                      continue L104;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var7 = 0;
              var8 = 0;
              var9 = 0;
              var6 = 0;
              L117: while (true) {
                L118: {
                  L119: {
                    if (~var6 <= ~ak.field_q) {
                      break L119;
                    } else {
                      stackOut_381_0 = ~var6;
                      stackOut_381_1 = -13;
                      stackIn_523_0 = stackOut_381_0;
                      stackIn_523_1 = stackOut_381_1;
                      stackIn_382_0 = stackOut_381_0;
                      stackIn_382_1 = stackOut_381_1;
                      if (var12 != 0) {
                        break L118;
                      } else {
                        L120: {
                          if (stackIn_382_0 <= stackIn_382_1) {
                            break L120;
                          } else {
                            param1.field_nb[var6] = null;
                            break L120;
                          }
                        }
                        L121: {
                          if (((e) this).field_C[var6] == null) {
                            break L121;
                          } else {
                            L122: {
                              if (null == ((e) this).field_C[var6].field_Z) {
                                break L122;
                              } else {
                                if (0 < ((e) this).field_C[var6].field_P) {
                                  break L122;
                                } else {
                                  if (((e) this).field_C[var6].field_T <= 0) {
                                    break L122;
                                  } else {
                                    L123: {
                                      if (((e) this).field_f == 1) {
                                        break L123;
                                      } else {
                                        if (!((e) this).field_r) {
                                          break L122;
                                        } else {
                                          break L123;
                                        }
                                      }
                                    }
                                    ((e) this).field_C[var6].field_P = ((e) this).field_C[var6].field_P + ((e) this).field_C[var6].field_T;
                                    ((e) this).field_C[var6].field_T = 0;
                                    ((e) this).field_e.field_f = ((e) this).field_e.field_f + 1;
                                    break L122;
                                  }
                                }
                              }
                            }
                            L124: {
                              if (((e) this).field_C[var6].field_P <= 0) {
                                break L124;
                              } else {
                                if (null != ((e) this).field_C[var6].field_Z) {
                                  L125: {
                                    param1.field_nb[var6] = ((e) this).field_C[var6].field_Z;
                                    param1.field_nb[var6].field_b = ((e) this).field_C[var6].field_nb;
                                    param1.field_nb[var6].field_A = ((e) this).field_C[var6].field_eb;
                                    if (null != param1.field_nb[var6].field_b) {
                                      L126: {
                                        var10 = param1.field_nb[var6].field_b.field_g;
                                        if (0 == var10) {
                                          break L126;
                                        } else {
                                          if (3 == var10) {
                                            break L126;
                                          } else {
                                            if (var10 == 8) {
                                              break L126;
                                            } else {
                                              if (var10 != 12) {
                                                break L125;
                                              } else {
                                                break L126;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var11_ref_oh = param1.field_nb[var6].field_A;
                                      param1.field_nb[var6].field_A = param1.field_nb[var6].field_b;
                                      param1.field_nb[var6].field_b = var11_ref_oh;
                                      break L125;
                                    } else {
                                      break L125;
                                    }
                                  }
                                  L127: {
                                    param1.field_nb[var6].field_i = ((e) this).field_C[var6].field_b;
                                    if (((e) this).field_C[var6].field_Z.field_e <= 0) {
                                      break L127;
                                    } else {
                                      if (((e) this).field_C[var6].field_Z.field_h == 0) {
                                        ((e) this).field_C[var6].field_Z.field_h = 1;
                                        break L127;
                                      } else {
                                        break L127;
                                      }
                                    }
                                  }
                                  L128: {
                                    if (((e) this).field_C[var6].field_Z.field_h != 2) {
                                      break L128;
                                    } else {
                                      var8++;
                                      break L128;
                                    }
                                  }
                                  L129: {
                                    if (((e) this).field_C[var6].field_Z.field_h == 3) {
                                      var9++;
                                      break L129;
                                    } else {
                                      break L129;
                                    }
                                  }
                                  L130: {
                                    if (((e) this).field_C[var6].field_Z.field_h == 1) {
                                      var7++;
                                      break L130;
                                    } else {
                                      break L130;
                                    }
                                  }
                                  L131: {
                                    int discarded$1 = ((e) this).field_C[var6].field_Z.d((byte) 126);
                                    var10 = -((e) this).field_C[var6].field_Z.field_v + ((e) this).field_C[var6].field_Z.field_x;
                                    if (var10 > 0) {
                                      L132: {
                                        if (var10 <= 20) {
                                          break L132;
                                        } else {
                                          var10 = 20;
                                          break L132;
                                        }
                                      }
                                      ((e) this).field_C[var6].field_Z.field_v = (int)((double)((e) this).field_C[var6].field_Z.field_v + (3.0 * Math.random() * (double)var10 / 4.0 + (double)(var10 / 4)));
                                      if (((e) this).field_C[var6].field_Z.field_v > 100) {
                                        ((e) this).field_C[var6].field_Z.field_v = 100;
                                        break L131;
                                      } else {
                                        break L131;
                                      }
                                    } else {
                                      break L131;
                                    }
                                  }
                                  var11 = 0;
                                  L133: while (true) {
                                    L134: {
                                      L135: {
                                        if (var11 >= ((e) this).field_C[var6].field_Z.field_h) {
                                          break L135;
                                        } else {
                                          stackOut_454_0 = (100.0 * Math.random() < (double)((e) this).field_C[var6].field_Z.field_t ? -1 : (100.0 * Math.random() == (double)((e) this).field_C[var6].field_Z.field_t ? 0 : 1));
                                          stackIn_476_0 = stackOut_454_0;
                                          stackIn_455_0 = stackOut_454_0;
                                          if (var12 != 0) {
                                            break L134;
                                          } else {
                                            L136: {
                                              if (stackIn_455_0 > 0) {
                                                ((e) this).field_C[var6].field_Z.field_t = ((e) this).field_C[var6].field_Z.field_t + 1;
                                                break L136;
                                              } else {
                                                break L136;
                                              }
                                            }
                                            L137: {
                                              if (100.0 * Math.random() > (double)((e) this).field_C[var6].field_Z.field_w) {
                                                ((e) this).field_C[var6].field_Z.field_w = ((e) this).field_C[var6].field_Z.field_w + 1;
                                                break L137;
                                              } else {
                                                break L137;
                                              }
                                            }
                                            L138: {
                                              if (Math.random() * 100.0 <= (double)((e) this).field_C[var6].field_Z.field_v) {
                                                break L138;
                                              } else {
                                                ((e) this).field_C[var6].field_Z.field_v = ((e) this).field_C[var6].field_Z.field_v + 1;
                                                break L138;
                                              }
                                            }
                                            L139: {
                                              if (Math.random() * 100.0 > (double)((e) this).field_C[var6].field_Z.field_B) {
                                                ((e) this).field_C[var6].field_Z.field_B = ((e) this).field_C[var6].field_Z.field_B + 1;
                                                break L139;
                                              } else {
                                                break L139;
                                              }
                                            }
                                            L140: {
                                              if (Math.random() * 100.0 <= (double)((e) this).field_C[var6].field_Z.field_q) {
                                                break L140;
                                              } else {
                                                ((e) this).field_C[var6].field_Z.field_q = ((e) this).field_C[var6].field_Z.field_q + 1;
                                                break L140;
                                              }
                                            }
                                            var11++;
                                            if (var12 == 0) {
                                              continue L133;
                                            } else {
                                              break L135;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_475_0 = 0;
                                      stackIn_476_0 = stackOut_475_0;
                                      break L134;
                                    }
                                    L141: {
                                      if (stackIn_476_0 < ((e) this).field_C[var6].field_Z.field_h) {
                                        L142: {
                                          if (~(33 * ((e) this).field_C[var6].field_Z.field_h - -1) >= ~((e) this).field_C[var6].field_Z.field_t) {
                                            break L142;
                                          } else {
                                            ((e) this).field_C[var6].field_Z.field_t = ((e) this).field_C[var6].field_Z.field_t + 1;
                                            break L142;
                                          }
                                        }
                                        L143: {
                                          if (33 * ((e) this).field_C[var6].field_Z.field_h - -1 <= ((e) this).field_C[var6].field_Z.field_w) {
                                            break L143;
                                          } else {
                                            ((e) this).field_C[var6].field_Z.field_w = ((e) this).field_C[var6].field_Z.field_w + 1;
                                            break L143;
                                          }
                                        }
                                        L144: {
                                          if (~(33 * ((e) this).field_C[var6].field_Z.field_h + 1) >= ~((e) this).field_C[var6].field_Z.field_v) {
                                            break L144;
                                          } else {
                                            ((e) this).field_C[var6].field_Z.field_v = ((e) this).field_C[var6].field_Z.field_v + 1;
                                            break L144;
                                          }
                                        }
                                        L145: {
                                          if (~(((e) this).field_C[var6].field_Z.field_h * 33 - -1) >= ~((e) this).field_C[var6].field_Z.field_B) {
                                            break L145;
                                          } else {
                                            ((e) this).field_C[var6].field_Z.field_B = ((e) this).field_C[var6].field_Z.field_B + 1;
                                            break L145;
                                          }
                                        }
                                        if (~(((e) this).field_C[var6].field_Z.field_h * 33 - -1) >= ~((e) this).field_C[var6].field_Z.field_q) {
                                          break L141;
                                        } else {
                                          ((e) this).field_C[var6].field_Z.field_q = ((e) this).field_C[var6].field_Z.field_q + 1;
                                          break L141;
                                        }
                                      } else {
                                        break L141;
                                      }
                                    }
                                    L146: {
                                      if (((e) this).field_C[var6].field_Z.field_B >= 90) {
                                        mh.a((byte) 121, 0, 255);
                                        break L146;
                                      } else {
                                        break L146;
                                      }
                                    }
                                    L147: {
                                      if (((e) this).field_C[var6].field_Z.field_t < 90) {
                                        break L147;
                                      } else {
                                        mh.a((byte) 125, 1, 254);
                                        break L147;
                                      }
                                    }
                                    if (var12 == 0) {
                                      break L121;
                                    } else {
                                      break L124;
                                    }
                                  }
                                } else {
                                  break L121;
                                }
                              }
                            }
                            L148: {
                              if (((e) this).field_C[var6].field_Z != null) {
                                ((e) this).field_e.field_k = ((e) this).field_e.field_k + 1;
                                break L148;
                              } else {
                                break L148;
                              }
                            }
                            if (((e) this).field_f == 1) {
                              L149: {
                                if (null != ((e) this).field_C[var6].field_nb) {
                                  ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_nb.field_g] = ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_nb.field_g] + 1;
                                  break L149;
                                } else {
                                  break L149;
                                }
                              }
                              L150: {
                                if (null == ((e) this).field_C[var6].field_eb) {
                                  break L150;
                                } else {
                                  ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_eb.field_g] = ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_eb.field_g] + 1;
                                  break L150;
                                }
                              }
                              if (null == ((e) this).field_C[var6].field_b) {
                                break L121;
                              } else {
                                ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_b.field_g] = ((e) this).field_e.field_l.field_a[((e) this).field_C[var6].field_b.field_g] + ((e) this).field_C[var6].field_b.field_d;
                                break L121;
                              }
                            } else {
                              break L121;
                            }
                          }
                        }
                        var6++;
                        if (var12 == 0) {
                          continue L117;
                        } else {
                          break L119;
                        }
                      }
                    }
                  }
                  stackOut_522_0 = ~((var8 + 1) * 2);
                  stackOut_522_1 = ~var7;
                  stackIn_523_0 = stackOut_522_0;
                  stackIn_523_1 = stackOut_522_1;
                  break L118;
                }
                L151: {
                  if (stackIn_523_0 > stackIn_523_1) {
                    var10 = 0;
                    var6 = 0;
                    L152: while (true) {
                      L153: {
                        L154: {
                          if (var6 >= ak.field_q) {
                            break L154;
                          } else {
                            stackOut_527_0 = ((e) this).field_C[var6];
                            stackIn_548_0 = stackOut_527_0;
                            stackIn_528_0 = stackOut_527_0;
                            if (var12 != 0) {
                              break L153;
                            } else {
                              L155: {
                                if (stackIn_528_0 == null) {
                                  break L155;
                                } else {
                                  if (null == ((e) this).field_C[var6].field_Z) {
                                    break L155;
                                  } else {
                                    if (((e) this).field_C[var6].field_Z.field_h != 1) {
                                      break L155;
                                    } else {
                                      L156: {
                                        if (var10 == 0) {
                                          break L156;
                                        } else {
                                          if (~((e) this).field_C[var6].field_Z.field_e < ~((e) this).field_C[var10].field_Z.field_e) {
                                            break L156;
                                          } else {
                                            break L155;
                                          }
                                        }
                                      }
                                      var10 = var6;
                                      break L155;
                                    }
                                  }
                                }
                              }
                              var6++;
                              if (var12 == 0) {
                                continue L152;
                              } else {
                                break L154;
                              }
                            }
                          }
                        }
                        var8++;
                        var7--;
                        stackOut_547_0 = ((e) this).field_C[var10];
                        stackIn_548_0 = stackOut_547_0;
                        break L153;
                      }
                      stackIn_548_0.field_Z.field_h = 2;
                      break L151;
                    }
                  } else {
                    break L151;
                  }
                }
                L157: {
                  if (var8 <= 2 * var9 - -2) {
                    break L157;
                  } else {
                    if (var9 != 0) {
                      break L157;
                    } else {
                      var10 = 0;
                      var6 = 0;
                      L158: while (true) {
                        L159: {
                          L160: {
                            if (~var6 <= ~ak.field_q) {
                              break L160;
                            } else {
                              if (var12 != 0) {
                                break L159;
                              } else {
                                L161: {
                                  if (null == ((e) this).field_C[var6]) {
                                    break L161;
                                  } else {
                                    if (null == ((e) this).field_C[var6].field_Z) {
                                      break L161;
                                    } else {
                                      if (((e) this).field_C[var6].field_Z.field_h > 2) {
                                        break L161;
                                      } else {
                                        L162: {
                                          if (0 == var10) {
                                            break L162;
                                          } else {
                                            if (((e) this).field_C[var6].field_Z.field_e <= ((e) this).field_C[var10].field_Z.field_e) {
                                              break L161;
                                            } else {
                                              break L162;
                                            }
                                          }
                                        }
                                        var10 = var6;
                                        break L161;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                if (var12 == 0) {
                                  continue L158;
                                } else {
                                  break L160;
                                }
                              }
                            }
                          }
                          ((e) this).field_C[var10].field_Z.field_h = 3;
                          mh.a((byte) 118, 4, 251);
                          var9++;
                          break L159;
                        }
                        var8--;
                        break L157;
                      }
                    }
                  }
                }
                L163: {
                  if (5 != ((e) this).field_i) {
                    L164: {
                      if (param1.field_Y) {
                        mh.a((byte) 125, 5, 250);
                        break L164;
                      } else {
                        break L164;
                      }
                    }
                    L165: {
                      if (param1.field_E) {
                        mh.a((byte) 124, 6, 249);
                        break L165;
                      } else {
                        break L165;
                      }
                    }
                    L166: {
                      if (param1.field_Ab) {
                        mh.a((byte) 112, 7, 248);
                        break L166;
                      } else {
                        break L166;
                      }
                    }
                    if (param1.field_H) {
                      mh.a((byte) 113, 8, 247);
                      break L163;
                    } else {
                      break L163;
                    }
                  } else {
                    break L163;
                  }
                }
                cb.a(false, ((e) this).field_i);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L167: {
            var3 = decompiledCaughtException;
            stackOut_596_0 = (RuntimeException) var3;
            stackOut_596_1 = new StringBuilder().append("e.T(").append(param0).append(',');
            stackIn_599_0 = stackOut_596_0;
            stackIn_599_1 = stackOut_596_1;
            stackIn_597_0 = stackOut_596_0;
            stackIn_597_1 = stackOut_596_1;
            if (param1 == null) {
              stackOut_599_0 = (RuntimeException) (Object) stackIn_599_0;
              stackOut_599_1 = (StringBuilder) (Object) stackIn_599_1;
              stackOut_599_2 = "null";
              stackIn_600_0 = stackOut_599_0;
              stackIn_600_1 = stackOut_599_1;
              stackIn_600_2 = stackOut_599_2;
              break L167;
            } else {
              stackOut_597_0 = (RuntimeException) (Object) stackIn_597_0;
              stackOut_597_1 = (StringBuilder) (Object) stackIn_597_1;
              stackOut_597_2 = "{...}";
              stackIn_600_0 = stackOut_597_0;
              stackIn_600_1 = stackOut_597_1;
              stackIn_600_2 = stackOut_597_2;
              break L167;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_600_0, stackIn_600_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var8_ref_dl = null;
        ci var8_ref_ci = null;
        th var8_ref_th = null;
        int var9 = 0;
        ci var9_ref_ci = null;
        r var9_ref_r = null;
        oh var9_ref_oh = null;
        int var10_int = 0;
        ci var10 = null;
        dl var10_ref = null;
        Object var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var15_ref_String = null;
        int var16 = 0;
        String var16_ref_String = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_15_0 = 0;
        dl stackIn_41_0 = null;
        dk stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        dk stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        dk stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        Object stackIn_121_0 = null;
        Object stackIn_129_0 = null;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_142_0 = 0;
        ci[] stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_152_2 = 0;
        ci[] stackIn_153_0 = null;
        ci[] stackIn_154_0 = null;
        ci[] stackIn_155_0 = null;
        ci[] stackIn_156_0 = null;
        ci[] stackIn_157_0 = null;
        ci[] stackIn_158_0 = null;
        ci[] stackIn_159_0 = null;
        ci[] stackIn_160_0 = null;
        ci[] stackIn_161_0 = null;
        ci[] stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_189_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_201_2 = 0;
        int stackIn_201_3 = 0;
        int stackIn_201_4 = 0;
        int stackIn_202_0 = 0;
        int stackIn_202_1 = 0;
        int stackIn_202_2 = 0;
        int stackIn_203_0 = 0;
        int stackIn_203_1 = 0;
        int stackIn_203_2 = 0;
        int stackIn_204_0 = 0;
        int stackIn_204_1 = 0;
        int stackIn_204_2 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_205_2 = 0;
        int stackIn_205_3 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int stackIn_206_3 = 0;
        int stackIn_207_0 = 0;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int stackIn_207_3 = 0;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        int stackIn_208_3 = 0;
        int stackIn_208_4 = 0;
        int stackIn_245_0 = 0;
        int stackIn_245_1 = 0;
        int stackIn_245_2 = 0;
        int stackIn_245_3 = 0;
        int stackIn_245_4 = 0;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        int stackIn_266_2 = 0;
        int stackIn_266_3 = 0;
        int stackIn_266_4 = 0;
        int stackIn_267_0 = 0;
        int stackIn_267_1 = 0;
        int stackIn_267_2 = 0;
        int stackIn_268_0 = 0;
        int stackIn_268_1 = 0;
        int stackIn_268_2 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        int stackIn_269_2 = 0;
        int stackIn_270_0 = 0;
        int stackIn_270_1 = 0;
        int stackIn_270_2 = 0;
        int stackIn_270_3 = 0;
        int stackIn_271_0 = 0;
        int stackIn_271_1 = 0;
        int stackIn_271_2 = 0;
        int stackIn_271_3 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_272_2 = 0;
        int stackIn_272_3 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_273_2 = 0;
        int stackIn_273_3 = 0;
        int stackIn_273_4 = 0;
        int stackIn_314_0 = 0;
        int stackIn_314_1 = 0;
        int stackIn_314_2 = 0;
        int stackIn_314_3 = 0;
        int stackIn_314_4 = 0;
        Object stackIn_352_0 = null;
        Object stackIn_352_1 = null;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        dl stackIn_425_0 = null;
        Object stackIn_523_0 = null;
        Object stackIn_523_1 = null;
        Object stackIn_532_0 = null;
        Object stackIn_539_0 = null;
        Object stackIn_542_0 = null;
        Object stackIn_542_1 = null;
        int stackIn_552_0 = 0;
        int stackIn_552_1 = 0;
        ci[] stackIn_559_0 = null;
        int stackIn_559_1 = 0;
        int stackIn_559_2 = 0;
        boolean stackIn_571_0 = false;
        boolean stackIn_582_0 = false;
        dk stackIn_602_0 = null;
        dk stackIn_607_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        dl stackOut_40_0 = null;
        dk stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        dk stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        dk stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        Object stackOut_120_0 = null;
        Object stackOut_128_0 = null;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        boolean stackOut_141_0 = false;
        ci[] stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_151_2 = 0;
        ci[] stackOut_152_0 = null;
        ci[] stackOut_153_0 = null;
        ci[] stackOut_154_0 = null;
        ci[] stackOut_155_0 = null;
        ci[] stackOut_156_0 = null;
        ci[] stackOut_157_0 = null;
        ci[] stackOut_158_0 = null;
        ci[] stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        ci[] stackOut_159_0 = null;
        ci[] stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int stackOut_188_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_189_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_190_1 = 0;
        int stackOut_200_0 = 0;
        int stackOut_200_1 = 0;
        int stackOut_200_2 = 0;
        int stackOut_200_3 = 0;
        int stackOut_200_4 = 0;
        int stackOut_201_0 = 0;
        int stackOut_201_1 = 0;
        int stackOut_201_2 = 0;
        int stackOut_204_0 = 0;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        int stackOut_204_3 = 0;
        int stackOut_202_0 = 0;
        int stackOut_202_1 = 0;
        int stackOut_202_2 = 0;
        int stackOut_203_0 = 0;
        int stackOut_203_1 = 0;
        int stackOut_203_2 = 0;
        int stackOut_203_3 = 0;
        int stackOut_205_0 = 0;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int stackOut_205_3 = 0;
        int stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        int stackOut_207_2 = 0;
        int stackOut_207_3 = 0;
        int stackOut_207_4 = 0;
        int stackOut_206_0 = 0;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int stackOut_206_3 = 0;
        int stackOut_206_4 = 0;
        int stackOut_244_0 = 0;
        int stackOut_244_1 = 0;
        int stackOut_244_2 = 0;
        int stackOut_244_3 = 0;
        int stackOut_244_4 = 0;
        int stackOut_265_0 = 0;
        int stackOut_265_1 = 0;
        int stackOut_265_2 = 0;
        int stackOut_265_3 = 0;
        int stackOut_265_4 = 0;
        int stackOut_266_0 = 0;
        int stackOut_266_1 = 0;
        int stackOut_266_2 = 0;
        int stackOut_269_0 = 0;
        int stackOut_269_1 = 0;
        int stackOut_269_2 = 0;
        int stackOut_269_3 = 0;
        int stackOut_267_0 = 0;
        int stackOut_267_1 = 0;
        int stackOut_267_2 = 0;
        int stackOut_268_0 = 0;
        int stackOut_268_1 = 0;
        int stackOut_268_2 = 0;
        int stackOut_268_3 = 0;
        int stackOut_270_0 = 0;
        int stackOut_270_1 = 0;
        int stackOut_270_2 = 0;
        int stackOut_270_3 = 0;
        int stackOut_272_0 = 0;
        int stackOut_272_1 = 0;
        int stackOut_272_2 = 0;
        int stackOut_272_3 = 0;
        int stackOut_272_4 = 0;
        int stackOut_271_0 = 0;
        int stackOut_271_1 = 0;
        int stackOut_271_2 = 0;
        int stackOut_271_3 = 0;
        int stackOut_271_4 = 0;
        int stackOut_313_0 = 0;
        int stackOut_313_1 = 0;
        int stackOut_313_2 = 0;
        int stackOut_313_3 = 0;
        int stackOut_313_4 = 0;
        Object stackOut_351_0 = null;
        Object stackOut_351_1 = null;
        int stackOut_372_0 = 0;
        int stackOut_372_1 = 0;
        dl stackOut_424_0 = null;
        Object stackOut_522_0 = null;
        Object stackOut_522_1 = null;
        Object stackOut_531_0 = null;
        Object stackOut_538_0 = null;
        Object stackOut_541_0 = null;
        Object stackOut_541_1 = null;
        int stackOut_551_0 = 0;
        int stackOut_551_1 = 0;
        ci[] stackOut_558_0 = null;
        int stackOut_558_1 = 0;
        int stackOut_558_2 = 0;
        boolean stackOut_570_0 = false;
        boolean stackOut_581_0 = false;
        dk stackOut_601_0 = null;
        dk stackOut_606_0 = null;
        var19 = Terraphoenix.field_V;
        var3_int = li.field_a ? 1 : 0;
        tg.field_l = -1;
        rd.field_t = 0;
        li.field_a = false;
        if (((e) this).field_u) {
          L0: {
            if (((e) this).field_q != null) {
              L1: {
                tg.field_l = -1;
                if (null == ((e) this).field_q.field_c.field_C) {
                  break L1;
                } else {
                  L2: {
                    if (((e) this).field_q.field_c.field_C.field_C == null) {
                      break L2;
                    } else {
                      tg.field_l = 1 + ((e) this).field_q.field_E;
                      break L2;
                    }
                  }
                  if (((e) this).field_q.field_c.field_C.field_b != -1) {
                    tg.field_l = ((e) this).field_q.field_E;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              tg.field_l = eg.field_p;
              break L0;
            } else {
              break L0;
            }
          }
          L3: {
            var4 = 0;
            if (hl.field_a) {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L3;
            } else {
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L3;
            }
          }
          L4: {
            L5: {
              var5 = stackIn_15_0;
              if (jb.field_b >= 365) {
                break L5;
              } else {
                if (39 < jb.field_b) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            var5 = 0;
            break L4;
          }
          L6: {
            if (!param1) {
              break L6;
            } else {
              var5 = 0;
              break L6;
            }
          }
          L7: {
            if (ld.field_b) {
              var5 = 0;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (!((e) this).field_J) {
              var5 = 0;
              break L8;
            } else {
              break L8;
            }
          }
          ((e) this).field_h.a(false, var5 != 0);
          var6 = 0;
          L9: while (true) {
            L10: {
              L11: {
                if (((e) this).field_C.length <= var6) {
                  break L11;
                } else {
                  if (var19 != 0) {
                    break L10;
                  } else {
                    L12: {
                      if (null != ((e) this).field_C[var6]) {
                        ((e) this).field_C[var6].e((byte) 41);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var6++;
                    if (var19 == 0) {
                      continue L9;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              if (!eh.field_m) {
                break L10;
              } else {
                var6 = -(32 * ui.field_f.field_H) + (-sj.field_b + (320 + 32 * ui.field_f.field_F));
                var7 = ui.field_f.field_H * 16 + 16 * ui.field_f.field_F + (240 + (-lg.field_c + -(ui.field_f.field_E * 48 / 100)) - 32);
                var8 = -320 + var6;
                var8 += 304;
                var9 = -240 + var7 - 32;
                var9 += 224;
                ui.field_f.field_g.a(var9, 4, var8, -22899, ui.field_f);
                ck.a(ui.field_f.field_g, -31661);
                break L10;
              }
            }
            L13: {
              L14: {
                L15: {
                  L16: {
                    L17: {
                      L18: {
                        L19: {
                          L20: {
                            if (var5 == 0) {
                              break L20;
                            } else {
                              var4 = -sj.field_b + 320;
                              var4 = var4 + 32 * (-vf.field_a + uf.field_c);
                              var6 = 240 + -lg.field_c;
                              var6 = var6 + 16 * (vf.field_a + uf.field_c);
                              var7 = 0;
                              L21: while (true) {
                                if (var7 > eg.field_p) {
                                  break L20;
                                } else {
                                  var8_ref_dl = ((e) this).field_h.a(-99, vf.field_a, var7, uf.field_c);
                                  stackOut_40_0 = (dl) var8_ref_dl;
                                  stackIn_425_0 = stackOut_40_0;
                                  stackIn_41_0 = stackOut_40_0;
                                  if (var19 != 0) {
                                    break L19;
                                  } else {
                                    L22: {
                                      if (stackIn_41_0 != null) {
                                        L23: {
                                          var9_ref_ci = hb.field_p[0];
                                          if (var8_ref_dl.field_h == null) {
                                            break L23;
                                          } else {
                                            if (~eg.field_p != ~var7) {
                                              break L23;
                                            } else {
                                              L24: {
                                                if (null == var8_ref_dl.field_h.field_Z) {
                                                  break L24;
                                                } else {
                                                  var9_ref_ci = hb.field_p[2];
                                                  if (var19 == 0) {
                                                    break L23;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              if (1 == var8_ref_dl.field_h.field_C) {
                                                if (!var8_ref_dl.field_h.field_k) {
                                                  break L23;
                                                } else {
                                                  var9_ref_ci = hb.field_p[1];
                                                  break L23;
                                                }
                                              } else {
                                                var9_ref_ci = null;
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        L25: {
                                          if (((e) this).field_L == 0) {
                                            break L25;
                                          } else {
                                            if (~eg.field_p != ~var7) {
                                              break L25;
                                            } else {
                                              var9_ref_ci = hb.field_p[1];
                                              break L25;
                                            }
                                          }
                                        }
                                        L26: {
                                          if (var9_ref_ci == hb.field_p[1]) {
                                            if (((e) this).field_q == null) {
                                              break L26;
                                            } else {
                                              L27: {
                                                var10_int = ((e) this).field_q.field_U;
                                                var11_int = ((e) this).field_q.field_ab;
                                                ((e) this).field_q.a(param0, uf.field_c, vf.field_a);
                                                if (2 > Math.abs(var10_int + -((e) this).field_q.field_U)) {
                                                  break L27;
                                                } else {
                                                  if (Math.abs(var10_int - ((e) this).field_q.field_U) > 6) {
                                                    break L27;
                                                  } else {
                                                    ((e) this).field_q.field_ab = 0;
                                                    break L27;
                                                  }
                                                }
                                              }
                                              L28: {
                                                var12 = ((e) this).field_q.c(false);
                                                if (((e) this).field_m) {
                                                  var12 = 15;
                                                  break L28;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                              L29: {
                                                L30: {
                                                  ((e) this).field_q.field_U = var10_int;
                                                  ((e) this).field_q.field_ab = var11_int;
                                                  if (((e) this).field_m) {
                                                    break L30;
                                                  } else {
                                                    if (0 < ((e) this).field_q.field_nb.field_c) {
                                                      break L30;
                                                    } else {
                                                      if (7 == ((e) this).field_q.field_nb.field_g) {
                                                        break L30;
                                                      } else {
                                                        if (6 != ((e) this).field_q.field_nb.field_g) {
                                                          break L29;
                                                        } else {
                                                          break L30;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L31: {
                                                  if (~var12 >= ~((e) this).field_q.field_jb) {
                                                    break L31;
                                                  } else {
                                                    L32: {
                                                      if (var12 + -10 > ((e) this).field_q.field_jb) {
                                                        break L32;
                                                      } else {
                                                        if (((e) this).field_m) {
                                                          break L32;
                                                        } else {
                                                          if (((e) this).field_q.field_jb >= 10) {
                                                            break L31;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    ((e) this).field_h.a(-(48 * var7) + -36 + var6, 16711680, var4, -2, hj.field_A);
                                                    if (var19 == 0) {
                                                      break L26;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                                L33: {
                                                  if (var12 <= ((e) this).field_q.field_jb) {
                                                    break L33;
                                                  } else {
                                                    var12 = ((e) this).field_q.field_jb;
                                                    break L33;
                                                  }
                                                }
                                                var13 = var12;
                                                ((e) this).field_h.a(-(var7 * 48) + (var6 - 36), 16711680, var4, -2, Integer.toString(var13));
                                                if (var19 == 0) {
                                                  break L26;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                              ((e) this).field_h.a(-36 + var6 - 48 * var7, 16711680, var4, -2, ta.field_a);
                                              break L26;
                                            }
                                          } else {
                                            break L26;
                                          }
                                        }
                                        if (hb.field_p[0] != var9_ref_ci) {
                                          break L22;
                                        } else {
                                          if (var7 != eg.field_p) {
                                            break L22;
                                          } else {
                                            L34: {
                                              if (var8_ref_dl.field_z) {
                                                break L34;
                                              } else {
                                                if (!var8_ref_dl.field_d) {
                                                  break L34;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            L35: {
                                              if (var8_ref_dl.field_v == 4) {
                                                rh.field_b[9].b(-16 + var4, var6 + (-36 - 48 * var7));
                                                rh.field_b[9].b(-16 + var4, var6 + -36 + (-(var7 * 48) - -8));
                                                break L35;
                                              } else {
                                                break L35;
                                              }
                                            }
                                            if (5 == var8_ref_dl.field_v) {
                                              rh.field_b[10].b(-16 + var4, -(var7 * 48) + -36 + var6);
                                              rh.field_b[10].b(var4 + -16, 8 + (var6 - (36 - -(var7 * 48))));
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var7++;
                                    if (var19 == 0) {
                                      continue L21;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L36: {
                            if (ql.field_i <= -1) {
                              break L36;
                            } else {
                              if (ld.field_e <= -1) {
                                break L36;
                              } else {
                                if (var5 != 0) {
                                  L37: {
                                    var4 = -sj.field_b + 320;
                                    var6 = -lg.field_c + 240;
                                    var4 = var4 + 32 * (ql.field_i - ld.field_e);
                                    var6 = var6 + 16 * (ld.field_e + ql.field_i);
                                    var7 = ((e) this).field_q.field_N;
                                    if (og.field_d <= 0) {
                                      break L37;
                                    } else {
                                      L38: {
                                        var8_ref_ci = hb.field_p[3];
                                        var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                                        ve.a(var8_ref_ci, -5353, var7 * 144 + var9, var6 + (-(var7 * 48) - var9), var4 - 24);
                                        var9 = (int)(Math.cos(mm.field_f) * 24.0 + 24.0);
                                        ve.a(var8_ref_ci, -5353, var9 + var7 * 144, -var9 + -(48 * var7) + var6, -24 + var4);
                                        var10_int = og.field_d;
                                        stackOut_113_0 = ((e) this).field_h;
                                        stackOut_113_1 = var6 + (-24 + -(var7 * 48));
                                        stackIn_115_0 = stackOut_113_0;
                                        stackIn_115_1 = stackOut_113_1;
                                        stackIn_114_0 = stackOut_113_0;
                                        stackIn_114_1 = stackOut_113_1;
                                        if (~var10_int < ~((e) this).field_q.field_jb) {
                                          stackOut_115_0 = (dk) (Object) stackIn_115_0;
                                          stackOut_115_1 = stackIn_115_1;
                                          stackOut_115_2 = 16711680;
                                          stackIn_116_0 = stackOut_115_0;
                                          stackIn_116_1 = stackOut_115_1;
                                          stackIn_116_2 = stackOut_115_2;
                                          break L38;
                                        } else {
                                          stackOut_114_0 = (dk) (Object) stackIn_114_0;
                                          stackOut_114_1 = stackIn_114_1;
                                          stackOut_114_2 = 65280;
                                          stackIn_116_0 = stackOut_114_0;
                                          stackIn_116_1 = stackOut_114_1;
                                          stackIn_116_2 = stackOut_114_2;
                                          break L38;
                                        }
                                      }
                                      ((dk) (Object) stackIn_116_0).a(stackIn_116_1, stackIn_116_2, var4, -2, Integer.toString(var10_int));
                                      if (var19 == 0) {
                                        break L36;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  var8_ref_ci = hb.field_p[3];
                                  var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                                  ve.a(var8_ref_ci, -5353, var9 + var7 * 144, -(48 * var7) + (var6 + -var9), var4 + -24);
                                  var9 = (int)(24.0 + 24.0 * Math.cos(mm.field_f));
                                  ve.a(var8_ref_ci, -5353, 144 * var7 - -var9, -(48 * var7) + (var6 - var9), -24 + var4);
                                  ((e) this).field_h.a(-(48 * var7) + (-24 + var6), 16711680, var4, -2, rj.field_f);
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                          var6 = 0;
                          L39: while (true) {
                            L40: {
                              L41: {
                                if (50 <= var6) {
                                  break L41;
                                } else {
                                  stackOut_120_0 = this;
                                  stackIn_129_0 = stackOut_120_0;
                                  stackIn_121_0 = stackOut_120_0;
                                  if (var19 != 0) {
                                    break L40;
                                  } else {
                                    L42: {
                                      if (((e) this).field_F[var6] == null) {
                                        break L42;
                                      } else {
                                        ((e) this).field_F[var6].c(16);
                                        break L42;
                                      }
                                    }
                                    var6++;
                                    if (var19 == 0) {
                                      continue L39;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                              }
                              L43: {
                                if (le.field_q != null) {
                                  le.field_q.d((byte) 124);
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                              stackOut_128_0 = this;
                              stackIn_129_0 = stackOut_128_0;
                              break L40;
                            }
                            L44: {
                              L45: {
                                if (!((e) this).field_I) {
                                  break L45;
                                } else {
                                  var6 = 0;
                                  L46: while (true) {
                                    stackOut_131_0 = 640;
                                    stackOut_131_1 = var6;
                                    stackIn_132_0 = stackOut_131_0;
                                    stackIn_132_1 = stackOut_131_1;
                                    L47: while (true) {
                                      if (stackIn_132_0 <= stackIn_132_1) {
                                        break L45;
                                      } else {
                                        stackOut_133_0 = 0;
                                        stackIn_142_0 = stackOut_133_0;
                                        stackIn_134_0 = stackOut_133_0;
                                        if (var19 != 0) {
                                          break L44;
                                        } else {
                                          var7 = stackIn_134_0;
                                          L48: while (true) {
                                            L49: {
                                              if (var7 >= 480) {
                                                break L49;
                                              } else {
                                                stackOut_136_0 = -1;
                                                stackOut_136_1 = ~gd.field_a[var6][var7];
                                                stackIn_132_0 = stackOut_136_0;
                                                stackIn_132_1 = stackOut_136_1;
                                                stackIn_137_0 = stackOut_136_0;
                                                stackIn_137_1 = stackOut_136_1;
                                                if (var19 != 0) {
                                                  continue L47;
                                                } else {
                                                  L50: {
                                                    if (stackIn_137_0 <= stackIn_137_1) {
                                                      break L50;
                                                    } else {
                                                      l.a(var6, var7, (2048 * gd.field_a[var6][var7] + (gd.field_a[var6][var7] * 16 - -(262144 * gd.field_a[var6][var7]))) % 16777215);
                                                      break L50;
                                                    }
                                                  }
                                                  var7++;
                                                  if (var19 == 0) {
                                                    continue L48;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var19 == 0) {
                                              continue L46;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              jl.h((byte) -108);
                              stackOut_141_0 = param0;
                              stackIn_142_0 = stackOut_141_0 ? 1 : 0;
                              break L44;
                            }
                            if (stackIn_142_0 == 1) {
                              L51: {
                                var6 = 608;
                                var7 = 448;
                                if (((e) this).field_J) {
                                  var7 = 320;
                                  wc.a((e) this, var7, var6, -11669);
                                  break L51;
                                } else {
                                  break L51;
                                }
                              }
                              L52: {
                                if (((e) this).field_J) {
                                  var8 = 385;
                                  ic.field_t.b(0, var8);
                                  var9 = 0;
                                  L53: while (true) {
                                    L54: {
                                      if (7 <= var9) {
                                        break L54;
                                      } else {
                                        stackOut_151_0 = nb.field_d;
                                        stackOut_151_1 = ~(28 * var9 + 97);
                                        stackOut_151_2 = ~((e) this).field_y;
                                        stackIn_559_0 = stackOut_151_0;
                                        stackIn_559_1 = stackOut_151_1;
                                        stackIn_559_2 = stackOut_151_2;
                                        stackIn_152_0 = stackOut_151_0;
                                        stackIn_152_1 = stackOut_151_1;
                                        stackIn_152_2 = stackOut_151_2;
                                        if (var19 != 0) {
                                          break L14;
                                        } else {
                                          L55: {
                                            L56: {
                                              stackOut_152_0 = (ci[]) (Object) stackIn_152_0;
                                              stackIn_160_0 = stackOut_152_0;
                                              stackIn_153_0 = stackOut_152_0;
                                              if (stackIn_152_1 < stackIn_152_2) {
                                                break L56;
                                              } else {
                                                stackOut_153_0 = (ci[]) (Object) stackIn_153_0;
                                                stackIn_154_0 = stackOut_153_0;
                                                stackOut_154_0 = (ci[]) (Object) stackIn_154_0;
                                                stackIn_160_0 = stackOut_154_0;
                                                stackIn_155_0 = stackOut_154_0;
                                                if (~(99 + (28 * var9 + 24)) >= ~((e) this).field_y) {
                                                  break L56;
                                                } else {
                                                  stackOut_155_0 = (ci[]) (Object) stackIn_155_0;
                                                  stackIn_156_0 = stackOut_155_0;
                                                  stackOut_156_0 = (ci[]) (Object) stackIn_156_0;
                                                  stackIn_160_0 = stackOut_156_0;
                                                  stackIn_157_0 = stackOut_156_0;
                                                  if (-2 + var8 + 66 >= ((e) this).field_j) {
                                                    break L56;
                                                  } else {
                                                    stackOut_157_0 = (ci[]) (Object) stackIn_157_0;
                                                    stackIn_158_0 = stackOut_157_0;
                                                    stackOut_158_0 = (ci[]) (Object) stackIn_158_0;
                                                    stackIn_161_0 = stackOut_158_0;
                                                    stackIn_159_0 = stackOut_158_0;
                                                    if (~(26 + (-2 + var8 + 66)) < ~((e) this).field_j) {
                                                      stackOut_161_0 = (ci[]) (Object) stackIn_161_0;
                                                      stackOut_161_1 = var9 - -8;
                                                      stackIn_162_0 = stackOut_161_0;
                                                      stackIn_162_1 = stackOut_161_1;
                                                      break L55;
                                                    } else {
                                                      stackOut_159_0 = (ci[]) (Object) stackIn_159_0;
                                                      stackIn_160_0 = stackOut_159_0;
                                                      break L56;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_160_0 = (ci[]) (Object) stackIn_160_0;
                                            stackOut_160_1 = var9;
                                            stackIn_162_0 = stackOut_160_0;
                                            stackIn_162_1 = stackOut_160_1;
                                            break L55;
                                          }
                                          ((ci) (Object) stackIn_162_0[stackIn_162_1]).b(99 + (var9 * 28 - 2), -2 + (66 + var8));
                                          var9++;
                                          if (var19 == 0) {
                                            continue L53;
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                    }
                                    L57: {
                                      if (((e) this).field_q == null) {
                                        break L57;
                                      } else {
                                        if (((e) this).field_J) {
                                          L58: {
                                            nf.field_g[((e) this).field_q.field_Z.field_d].b(10, 9 + var8);
                                            var9_ref_oh = ((e) this).field_q.field_nb;
                                            if (null == var9_ref_oh) {
                                              break L58;
                                            } else {
                                              L59: {
                                                if (var9_ref_oh.field_g == 0) {
                                                  break L59;
                                                } else {
                                                  if (var9_ref_oh.field_g == 3) {
                                                    break L59;
                                                  } else {
                                                    if (var9_ref_oh.field_g == 8) {
                                                      break L59;
                                                    } else {
                                                      if (var9_ref_oh.field_g != 12) {
                                                        break L58;
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var9_ref_oh = ((e) this).field_q.field_eb;
                                              break L58;
                                            }
                                          }
                                          L60: {
                                            L61: {
                                              L62: {
                                                L63: {
                                                  L64: {
                                                    L65: {
                                                      if (var9_ref_oh != null) {
                                                        break L65;
                                                      } else {
                                                        if (((e) this).field_q.field_Z.field_b == null) {
                                                          break L64;
                                                        } else {
                                                          if (((e) this).field_q.field_Z.field_b.field_g != 17) {
                                                            break L64;
                                                          } else {
                                                            cc.field_i[17].a(192, 93, 367, 10 + (var8 + 36), (byte) 21);
                                                            if (var19 == 0) {
                                                              break L64;
                                                            } else {
                                                              break L65;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L66: {
                                                      cc.field_i[var9_ref_oh.field_g].a(192, 93, 383, var8 - -46, (byte) 21);
                                                      if (((e) this).field_q.field_nb != var9_ref_oh) {
                                                        break L66;
                                                      } else {
                                                        l.e(310, var8 + 10, 148, 73, 16777215);
                                                        if (((e) this).field_L != 1) {
                                                          break L66;
                                                        } else {
                                                          L67: {
                                                            stackOut_188_0 = 1;
                                                            stackIn_191_0 = stackOut_188_0;
                                                            stackIn_189_0 = stackOut_188_0;
                                                            if (((e) this).field_m) {
                                                              stackOut_191_0 = stackIn_191_0;
                                                              stackOut_191_1 = 0;
                                                              stackIn_192_0 = stackOut_191_0;
                                                              stackIn_192_1 = stackOut_191_1;
                                                              break L67;
                                                            } else {
                                                              stackOut_189_0 = stackIn_189_0;
                                                              stackIn_190_0 = stackOut_189_0;
                                                              stackOut_190_0 = stackIn_190_0;
                                                              stackOut_190_1 = 1;
                                                              stackIn_192_0 = stackOut_190_0;
                                                              stackIn_192_1 = stackOut_190_1;
                                                              break L67;
                                                            }
                                                          }
                                                          if (stackIn_192_0 != stackIn_192_1) {
                                                            break L66;
                                                          } else {
                                                            l.e(311, 11 - -var8, 146, 71, 16711680);
                                                            break L66;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L68: {
                                                      if (0 >= var9_ref_oh.a(true)) {
                                                        break L68;
                                                      } else {
                                                        L69: {
                                                          var10_int = 73 / var9_ref_oh.a(true);
                                                          if (var10_int >= 1) {
                                                            break L69;
                                                          } else {
                                                            var10_int = 1;
                                                            break L69;
                                                          }
                                                        }
                                                        if (1 > var10_int) {
                                                          break L68;
                                                        } else {
                                                          var12 = 1;
                                                          L70: while (true) {
                                                            if (~var12 < ~var9_ref_oh.a(true)) {
                                                              break L68;
                                                            } else {
                                                              var11_int = (int)(((double)(-var12) + (double)var9_ref_oh.a(param0) / 2.0) * (double)var10_int + (double)(var8 + 47));
                                                              stackOut_200_0 = 314;
                                                              stackOut_200_1 = var11_int;
                                                              stackOut_200_2 = 4;
                                                              stackOut_200_3 = 1;
                                                              stackOut_200_4 = var10_int;
                                                              stackIn_245_0 = stackOut_200_0;
                                                              stackIn_245_1 = stackOut_200_1;
                                                              stackIn_245_2 = stackOut_200_2;
                                                              stackIn_245_3 = stackOut_200_3;
                                                              stackIn_245_4 = stackOut_200_4;
                                                              stackIn_201_0 = stackOut_200_0;
                                                              stackIn_201_1 = stackOut_200_1;
                                                              stackIn_201_2 = stackOut_200_2;
                                                              stackIn_201_3 = stackOut_200_3;
                                                              stackIn_201_4 = stackOut_200_4;
                                                              if (var19 != 0) {
                                                                break L63;
                                                              } else {
                                                                L71: {
                                                                  stackOut_201_0 = stackIn_201_0;
                                                                  stackOut_201_1 = stackIn_201_1;
                                                                  stackOut_201_2 = stackIn_201_2;
                                                                  stackIn_204_0 = stackOut_201_0;
                                                                  stackIn_204_1 = stackOut_201_1;
                                                                  stackIn_204_2 = stackOut_201_2;
                                                                  stackIn_202_0 = stackOut_201_0;
                                                                  stackIn_202_1 = stackOut_201_1;
                                                                  stackIn_202_2 = stackOut_201_2;
                                                                  if (stackIn_201_3 < stackIn_201_4) {
                                                                    stackOut_204_0 = stackIn_204_0;
                                                                    stackOut_204_1 = stackIn_204_1;
                                                                    stackOut_204_2 = stackIn_204_2;
                                                                    stackOut_204_3 = var10_int + -1;
                                                                    stackIn_205_0 = stackOut_204_0;
                                                                    stackIn_205_1 = stackOut_204_1;
                                                                    stackIn_205_2 = stackOut_204_2;
                                                                    stackIn_205_3 = stackOut_204_3;
                                                                    break L71;
                                                                  } else {
                                                                    stackOut_202_0 = stackIn_202_0;
                                                                    stackOut_202_1 = stackIn_202_1;
                                                                    stackOut_202_2 = stackIn_202_2;
                                                                    stackIn_203_0 = stackOut_202_0;
                                                                    stackIn_203_1 = stackOut_202_1;
                                                                    stackIn_203_2 = stackOut_202_2;
                                                                    stackOut_203_0 = stackIn_203_0;
                                                                    stackOut_203_1 = stackIn_203_1;
                                                                    stackOut_203_2 = stackIn_203_2;
                                                                    stackOut_203_3 = 1;
                                                                    stackIn_205_0 = stackOut_203_0;
                                                                    stackIn_205_1 = stackOut_203_1;
                                                                    stackIn_205_2 = stackOut_203_2;
                                                                    stackIn_205_3 = stackOut_203_3;
                                                                    break L71;
                                                                  }
                                                                }
                                                                L72: {
                                                                  stackOut_205_0 = stackIn_205_0;
                                                                  stackOut_205_1 = stackIn_205_1;
                                                                  stackOut_205_2 = stackIn_205_2;
                                                                  stackOut_205_3 = stackIn_205_3;
                                                                  stackIn_207_0 = stackOut_205_0;
                                                                  stackIn_207_1 = stackOut_205_1;
                                                                  stackIn_207_2 = stackOut_205_2;
                                                                  stackIn_207_3 = stackOut_205_3;
                                                                  stackIn_206_0 = stackOut_205_0;
                                                                  stackIn_206_1 = stackOut_205_1;
                                                                  stackIn_206_2 = stackOut_205_2;
                                                                  stackIn_206_3 = stackOut_205_3;
                                                                  if (var9_ref_oh.field_c < var12) {
                                                                    stackOut_207_0 = stackIn_207_0;
                                                                    stackOut_207_1 = stackIn_207_1;
                                                                    stackOut_207_2 = stackIn_207_2;
                                                                    stackOut_207_3 = stackIn_207_3;
                                                                    stackOut_207_4 = 16711680;
                                                                    stackIn_208_0 = stackOut_207_0;
                                                                    stackIn_208_1 = stackOut_207_1;
                                                                    stackIn_208_2 = stackOut_207_2;
                                                                    stackIn_208_3 = stackOut_207_3;
                                                                    stackIn_208_4 = stackOut_207_4;
                                                                    break L72;
                                                                  } else {
                                                                    stackOut_206_0 = stackIn_206_0;
                                                                    stackOut_206_1 = stackIn_206_1;
                                                                    stackOut_206_2 = stackIn_206_2;
                                                                    stackOut_206_3 = stackIn_206_3;
                                                                    stackOut_206_4 = 65280;
                                                                    stackIn_208_0 = stackOut_206_0;
                                                                    stackIn_208_1 = stackOut_206_1;
                                                                    stackIn_208_2 = stackOut_206_2;
                                                                    stackIn_208_3 = stackOut_206_3;
                                                                    stackIn_208_4 = stackOut_206_4;
                                                                    break L72;
                                                                  }
                                                                }
                                                                l.f(stackIn_208_0, stackIn_208_1, stackIn_208_2, stackIn_208_3, stackIn_208_4);
                                                                var12++;
                                                                if (var19 == 0) {
                                                                  continue L70;
                                                                } else {
                                                                  break L68;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var9_ref_oh != ((e) this).field_q.field_nb) {
                                                      break L64;
                                                    } else {
                                                      L73: {
                                                        var10_int = (int)Math.sqrt((double)(((e) this).field_q.c((byte) -16) * ((e) this).field_q.field_y));
                                                        if (95 >= var10_int) {
                                                          break L73;
                                                        } else {
                                                          var10_int = 95;
                                                          break L73;
                                                        }
                                                      }
                                                      og.field_f.a(var10_int + "%", 449, 80 + var8, 16777215, -1);
                                                      if (6 == var9_ref_oh.field_g) {
                                                        break L64;
                                                      } else {
                                                        if (7 == var9_ref_oh.field_g) {
                                                          break L64;
                                                        } else {
                                                          if (~var9_ref_oh.field_c <= ~var9_ref_oh.a(true)) {
                                                            break L64;
                                                          } else {
                                                            L74: {
                                                              nb.field_d[7].b(324, 50 + var8);
                                                              if (ef.field_j < 324) {
                                                                break L74;
                                                              } else {
                                                                if (ef.field_j > 354) {
                                                                  break L74;
                                                                } else {
                                                                  if (jb.field_b < var8 + 50) {
                                                                    break L74;
                                                                  } else {
                                                                    if (80 + var8 >= jb.field_b) {
                                                                      nb.field_d[15].b(324, 50 + var8);
                                                                      break L74;
                                                                    } else {
                                                                      break L74;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (var9_ref_oh.field_c > 0) {
                                                              break L64;
                                                            } else {
                                                              if (mm.field_f > 3.14) {
                                                                break L64;
                                                              } else {
                                                                l.d(324, 50 + var8, 30, 30, 16711680, 128);
                                                                break L64;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L75: {
                                                    L76: {
                                                      var9_ref_oh = ((e) this).field_q.field_eb;
                                                      if (var9_ref_oh == null) {
                                                        break L76;
                                                      } else {
                                                        if (var9_ref_oh.field_g == 0) {
                                                          break L75;
                                                        } else {
                                                          if (3 == var9_ref_oh.field_g) {
                                                            break L75;
                                                          } else {
                                                            if (8 == var9_ref_oh.field_g) {
                                                              break L75;
                                                            } else {
                                                              if (12 != var9_ref_oh.field_g) {
                                                                break L76;
                                                              } else {
                                                                break L75;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9_ref_oh = ((e) this).field_q.field_nb;
                                                    break L75;
                                                  }
                                                  if (var9_ref_oh != null) {
                                                    var10_int = 467;
                                                    stackOut_244_0 = var10_int;
                                                    stackOut_244_1 = 10 + var8;
                                                    stackOut_244_2 = var10_int - -73;
                                                    stackOut_244_3 = var8 - -10;
                                                    stackOut_244_4 = 73;
                                                    stackIn_245_0 = stackOut_244_0;
                                                    stackIn_245_1 = stackOut_244_1;
                                                    stackIn_245_2 = stackOut_244_2;
                                                    stackIn_245_3 = stackOut_244_3;
                                                    stackIn_245_4 = stackOut_244_4;
                                                    break L63;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                                L77: {
                                                  L78: {
                                                    l.c(stackIn_245_0, stackIn_245_1, stackIn_245_2, stackIn_245_3 + stackIn_245_4);
                                                    if (var9_ref_oh.field_g != 0) {
                                                      break L78;
                                                    } else {
                                                      cc.field_i[var9_ref_oh.field_g].a(192, 93, var10_int - -81, var8 - -46, (byte) 21);
                                                      if (var19 == 0) {
                                                        break L77;
                                                      } else {
                                                        break L78;
                                                      }
                                                    }
                                                  }
                                                  cc.field_i[var9_ref_oh.field_g].a(192, 93, var10_int + 73, 36 + var8 - -10, (byte) 21);
                                                  break L77;
                                                }
                                                L79: {
                                                  l.c();
                                                  if (var9_ref_oh == ((e) this).field_q.field_nb) {
                                                    l.e(var10_int, 10 - -var8, 73, 73, 16777215);
                                                    if (1 != ((e) this).field_L) {
                                                      break L79;
                                                    } else {
                                                      if (!((e) this).field_m) {
                                                        l.e(1 + var10_int, var8 + 11, 71, 71, 16711680);
                                                        break L79;
                                                      } else {
                                                        break L79;
                                                      }
                                                    }
                                                  } else {
                                                    break L79;
                                                  }
                                                }
                                                L80: {
                                                  if (0 < var9_ref_oh.a(true)) {
                                                    L81: {
                                                      var11_int = 73 / var9_ref_oh.a(true);
                                                      if (var11_int < 1) {
                                                        var11_int = 1;
                                                        break L81;
                                                      } else {
                                                        break L81;
                                                      }
                                                    }
                                                    L82: {
                                                      if (1 <= var11_int) {
                                                        var13 = 1;
                                                        L83: while (true) {
                                                          if (~var9_ref_oh.a(true) > ~var13) {
                                                            break L82;
                                                          } else {
                                                            var12 = (int)((double)(var8 - -47) + ((double)(-var13) + (double)var9_ref_oh.a(true) / 2.0) * (double)var11_int);
                                                            stackOut_265_0 = var10_int + 4;
                                                            stackOut_265_1 = var12;
                                                            stackOut_265_2 = 4;
                                                            stackOut_265_3 = -2;
                                                            stackOut_265_4 = ~var11_int;
                                                            stackIn_314_0 = stackOut_265_0;
                                                            stackIn_314_1 = stackOut_265_1;
                                                            stackIn_314_2 = stackOut_265_2;
                                                            stackIn_314_3 = stackOut_265_3;
                                                            stackIn_314_4 = stackOut_265_4;
                                                            stackIn_266_0 = stackOut_265_0;
                                                            stackIn_266_1 = stackOut_265_1;
                                                            stackIn_266_2 = stackOut_265_2;
                                                            stackIn_266_3 = stackOut_265_3;
                                                            stackIn_266_4 = stackOut_265_4;
                                                            if (var19 != 0) {
                                                              break L61;
                                                            } else {
                                                              L84: {
                                                                stackOut_266_0 = stackIn_266_0;
                                                                stackOut_266_1 = stackIn_266_1;
                                                                stackOut_266_2 = stackIn_266_2;
                                                                stackIn_269_0 = stackOut_266_0;
                                                                stackIn_269_1 = stackOut_266_1;
                                                                stackIn_269_2 = stackOut_266_2;
                                                                stackIn_267_0 = stackOut_266_0;
                                                                stackIn_267_1 = stackOut_266_1;
                                                                stackIn_267_2 = stackOut_266_2;
                                                                if (stackIn_266_3 <= stackIn_266_4) {
                                                                  stackOut_269_0 = stackIn_269_0;
                                                                  stackOut_269_1 = stackIn_269_1;
                                                                  stackOut_269_2 = stackIn_269_2;
                                                                  stackOut_269_3 = 1;
                                                                  stackIn_270_0 = stackOut_269_0;
                                                                  stackIn_270_1 = stackOut_269_1;
                                                                  stackIn_270_2 = stackOut_269_2;
                                                                  stackIn_270_3 = stackOut_269_3;
                                                                  break L84;
                                                                } else {
                                                                  stackOut_267_0 = stackIn_267_0;
                                                                  stackOut_267_1 = stackIn_267_1;
                                                                  stackOut_267_2 = stackIn_267_2;
                                                                  stackIn_268_0 = stackOut_267_0;
                                                                  stackIn_268_1 = stackOut_267_1;
                                                                  stackIn_268_2 = stackOut_267_2;
                                                                  stackOut_268_0 = stackIn_268_0;
                                                                  stackOut_268_1 = stackIn_268_1;
                                                                  stackOut_268_2 = stackIn_268_2;
                                                                  stackOut_268_3 = -1 + var11_int;
                                                                  stackIn_270_0 = stackOut_268_0;
                                                                  stackIn_270_1 = stackOut_268_1;
                                                                  stackIn_270_2 = stackOut_268_2;
                                                                  stackIn_270_3 = stackOut_268_3;
                                                                  break L84;
                                                                }
                                                              }
                                                              L85: {
                                                                stackOut_270_0 = stackIn_270_0;
                                                                stackOut_270_1 = stackIn_270_1;
                                                                stackOut_270_2 = stackIn_270_2;
                                                                stackOut_270_3 = stackIn_270_3;
                                                                stackIn_272_0 = stackOut_270_0;
                                                                stackIn_272_1 = stackOut_270_1;
                                                                stackIn_272_2 = stackOut_270_2;
                                                                stackIn_272_3 = stackOut_270_3;
                                                                stackIn_271_0 = stackOut_270_0;
                                                                stackIn_271_1 = stackOut_270_1;
                                                                stackIn_271_2 = stackOut_270_2;
                                                                stackIn_271_3 = stackOut_270_3;
                                                                if (~var9_ref_oh.field_c > ~var13) {
                                                                  stackOut_272_0 = stackIn_272_0;
                                                                  stackOut_272_1 = stackIn_272_1;
                                                                  stackOut_272_2 = stackIn_272_2;
                                                                  stackOut_272_3 = stackIn_272_3;
                                                                  stackOut_272_4 = 16711680;
                                                                  stackIn_273_0 = stackOut_272_0;
                                                                  stackIn_273_1 = stackOut_272_1;
                                                                  stackIn_273_2 = stackOut_272_2;
                                                                  stackIn_273_3 = stackOut_272_3;
                                                                  stackIn_273_4 = stackOut_272_4;
                                                                  break L85;
                                                                } else {
                                                                  stackOut_271_0 = stackIn_271_0;
                                                                  stackOut_271_1 = stackIn_271_1;
                                                                  stackOut_271_2 = stackIn_271_2;
                                                                  stackOut_271_3 = stackIn_271_3;
                                                                  stackOut_271_4 = 65280;
                                                                  stackIn_273_0 = stackOut_271_0;
                                                                  stackIn_273_1 = stackOut_271_1;
                                                                  stackIn_273_2 = stackOut_271_2;
                                                                  stackIn_273_3 = stackOut_271_3;
                                                                  stackIn_273_4 = stackOut_271_4;
                                                                  break L85;
                                                                }
                                                              }
                                                              l.f(stackIn_273_0, stackIn_273_1, stackIn_273_2, stackIn_273_3, stackIn_273_4);
                                                              var13++;
                                                              if (var19 == 0) {
                                                                continue L83;
                                                              } else {
                                                                break L82;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        break L82;
                                                      }
                                                    }
                                                    if (var9_ref_oh.field_g == 6) {
                                                      break L80;
                                                    } else {
                                                      if (var9_ref_oh.field_g == 7) {
                                                        break L80;
                                                      } else {
                                                        if (var9_ref_oh.field_c >= var9_ref_oh.a(true)) {
                                                          break L80;
                                                        } else {
                                                          nb.field_d[7].b(478, var8 - -50);
                                                          if (var9_ref_oh.field_c > 0) {
                                                            break L80;
                                                          } else {
                                                            if (3.14 >= mm.field_f) {
                                                              l.d(478, var8 - -50, 30, 30, 16711680, 128);
                                                              if (-464 + (var10_int + 478) > ef.field_j) {
                                                                break L80;
                                                              } else {
                                                                if (-464 + (508 + var10_int) < ef.field_j) {
                                                                  break L80;
                                                                } else {
                                                                  if (~jb.field_b > ~(var8 - -50)) {
                                                                    break L80;
                                                                  } else {
                                                                    if (~jb.field_b < ~(var8 - -80)) {
                                                                      break L80;
                                                                    } else {
                                                                      nb.field_d[15].b(478, var8 - -50);
                                                                      break L80;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              break L80;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L80;
                                                  }
                                                }
                                                if (((e) this).field_q.field_nb == var9_ref_oh) {
                                                  L86: {
                                                    var11_int = (int)Math.sqrt((double)(((e) this).field_q.c((byte) -16) * ((e) this).field_q.field_y));
                                                    if (95 < var11_int) {
                                                      var11_int = 95;
                                                      break L86;
                                                    } else {
                                                      break L86;
                                                    }
                                                  }
                                                  og.field_f.a(var11_int + "%", -464 + (531 + var10_int), 80 + var8, 16777215, -1);
                                                  break L62;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                              L87: {
                                                if (null == ((e) this).field_q.field_b) {
                                                  break L87;
                                                } else {
                                                  L88: {
                                                    l.c(547, 35 + var8, 595, 48 + var8 + 35);
                                                    var10 = cc.field_i[((e) this).field_q.field_b.field_g].d();
                                                    var10.b();
                                                    if (((e) this).field_q.field_b.field_g == 5) {
                                                      var10.b(547 - var10.field_p - -6, 26 + (var8 - -(var10.field_v / 2)));
                                                      break L88;
                                                    } else {
                                                      break L88;
                                                    }
                                                  }
                                                  L89: {
                                                    if (((e) this).field_q.field_b.field_g != 11) {
                                                      break L89;
                                                    } else {
                                                      var10.b(547 - var10.field_p, -3 + (var8 - (-32 + -(var10.field_v / 2))));
                                                      break L89;
                                                    }
                                                  }
                                                  L90: {
                                                    l.c();
                                                    if (!((e) this).field_m) {
                                                      break L90;
                                                    } else {
                                                      l.e(547, var8 + 35, 48, 48, 16777215);
                                                      l.e(548, var8 + 36, 46, 46, 16711680);
                                                      break L90;
                                                    }
                                                  }
                                                  og.field_f.a(Integer.toString(((e) this).field_q.field_b.field_d), 589, var8 - -81, 16777215, -1);
                                                  break L87;
                                                }
                                              }
                                              L91: {
                                                if (((e) this).field_q.field_B != 0) {
                                                  break L91;
                                                } else {
                                                  l.d(100, var8 - -67, 24, 24, 0, 128);
                                                  break L91;
                                                }
                                              }
                                              L92: {
                                                if (((e) this).field_q.field_B != 1) {
                                                  break L92;
                                                } else {
                                                  l.d(128, 67 + var8, 24, 24, 0, 128);
                                                  break L92;
                                                }
                                              }
                                              if (eg.field_p == 0) {
                                                stackOut_313_0 = 185;
                                                stackOut_313_1 = var8 - -67;
                                                stackOut_313_2 = 24;
                                                stackOut_313_3 = 24;
                                                stackOut_313_4 = 0;
                                                stackIn_314_0 = stackOut_313_0;
                                                stackIn_314_1 = stackOut_313_1;
                                                stackIn_314_2 = stackOut_313_2;
                                                stackIn_314_3 = stackOut_313_3;
                                                stackIn_314_4 = stackOut_313_4;
                                                break L61;
                                              } else {
                                                break L60;
                                              }
                                            }
                                            l.d(stackIn_314_0, stackIn_314_1, stackIn_314_2, stackIn_314_3, stackIn_314_4, 128);
                                            break L60;
                                          }
                                          L93: {
                                            if (5 > eg.field_p) {
                                              break L93;
                                            } else {
                                              l.d(213, var8 + 67, 24, 24, 0, 128);
                                              break L93;
                                            }
                                          }
                                          L94: {
                                            L95: {
                                              var10_int = 133;
                                              var11_int = ((e) this).field_q.field_P * var10_int / ((e) this).field_q.field_mb;
                                              var12 = var10_int * ((e) this).field_q.field_T / ((e) this).field_q.field_mb;
                                              var13 = (((e) this).field_q.field_u + ((e) this).field_q.field_m) * var10_int / 200;
                                              l.d(var11_int + 159, var8 + 28, var10_int - var11_int, 7, 16776960, 128);
                                              l.d(var11_int + 159 + var12, var8 - -28, -var12 - (var11_int - var10_int), 7, 0, 192);
                                              l.d(159 - -var13, 45 + var8, var10_int + -var13, 7, 0, 192);
                                              var14 = ((e) this).field_q.field_jb;
                                              if (((e) this).field_q.field_B == 0) {
                                                break L95;
                                              } else {
                                                var15 = var10_int * ((e) this).field_q.field_jb / ((e) this).field_q.field_v;
                                                l.d(159 - -var15, var8 - -11, -var15 + var10_int, 7, 0, 192);
                                                if (var19 == 0) {
                                                  break L94;
                                                } else {
                                                  break L95;
                                                }
                                              }
                                            }
                                            var14 = 2 * var14 / 3;
                                            var15 = var10_int * var14 / ((e) this).field_q.field_v;
                                            l.d(159, var8 + 11, var15, 7, 16777215, 128);
                                            l.d(159 - -var15, var8 - -11, -var15 + var10_int, 7, 0, 192);
                                            break L94;
                                          }
                                          L96: {
                                            var14 = ((e) this).field_q.field_jb;
                                            var15_ref_String = Integer.toString(var14);
                                            if (((e) this).field_q.field_B == 0) {
                                              var15_ref_String = "<lt>" + var15_ref_String + "<gt>";
                                              break L96;
                                            } else {
                                              break L96;
                                            }
                                          }
                                          L97: {
                                            var16_ref_String = Integer.toString(((e) this).field_q.field_P);
                                            if (((e) this).field_q.field_T <= 0) {
                                              break L97;
                                            } else {
                                              L98: {
                                                var17 = ((e) this).field_q.field_P - -((e) this).field_q.field_T;
                                                if (99 < var17) {
                                                  var17 = 99;
                                                  break L98;
                                                } else {
                                                  break L98;
                                                }
                                              }
                                              var16_ref_String = var16_ref_String + "/" + var17;
                                              break L97;
                                            }
                                          }
                                          og.field_f.c(var15_ref_String, 134, 18 + var8, 0, 0);
                                          og.field_f.c(var16_ref_String, 134, 35 + var8, 0, 0);
                                          og.field_f.c(Integer.toString(((e) this).field_q.field_u + ((e) this).field_q.field_m), 134, var8 - -52, 0, 0);
                                          og.field_f.c(var15_ref_String, 135, 17 + var8, 0, 0);
                                          og.field_f.c(var16_ref_String, 135, var8 + 34, 0, 0);
                                          og.field_f.c(Integer.toString(((e) this).field_q.field_m + ((e) this).field_q.field_u), 135, var8 - -51, 0, 0);
                                          og.field_f.c(var15_ref_String, 135, 18 + var8, 8421631, -1);
                                          og.field_f.c(var16_ref_String, 135, 35 + var8, 16719904, -1);
                                          og.field_f.c(Integer.toString(((e) this).field_q.field_u - -((e) this).field_q.field_m), 135, 52 + var8, 2162464, -1);
                                          break L57;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                    L99: {
                                      if (ha.field_o) {
                                        L100: {
                                          if (((e) this).field_B >= 2) {
                                            break L100;
                                          } else {
                                            l.f(306, 7 - -var8, 234, 79, 0);
                                            break L100;
                                          }
                                        }
                                        L101: {
                                          if (((e) this).field_B < 7) {
                                            l.f(241, 66 + var8, 26, 26, 0);
                                            break L101;
                                          } else {
                                            break L101;
                                          }
                                        }
                                        L102: {
                                          if (((e) this).field_B < 9) {
                                            l.f(269, var8 + 66, 26, 26, 0);
                                            break L102;
                                          } else {
                                            break L102;
                                          }
                                        }
                                        L103: {
                                          if (((e) this).field_B < 10) {
                                            l.f(606, 7 - -var8, 29, 79, 0);
                                            break L103;
                                          } else {
                                            break L103;
                                          }
                                        }
                                        L104: {
                                          if (((e) this).field_B >= 11) {
                                            break L104;
                                          } else {
                                            l.f(99, 66 + var8, 54, 26, 0);
                                            break L104;
                                          }
                                        }
                                        L105: {
                                          if (((e) this).field_B >= 12) {
                                            break L105;
                                          } else {
                                            l.f(184, var8 + 66, 54, 26, 0);
                                            break L105;
                                          }
                                        }
                                        if (((e) this).field_B < 14) {
                                          l.f(541, 7 - -var8, 54, 54, 0);
                                          break L99;
                                        } else {
                                          break L99;
                                        }
                                      } else {
                                        break L99;
                                      }
                                    }
                                    var9 = 0;
                                    var10_int = -1;
                                    var11_int = 0;
                                    var12 = 0;
                                    L106: while (true) {
                                      L107: {
                                        if (12 <= var12) {
                                          break L107;
                                        } else {
                                          stackOut_351_0 = null;
                                          stackOut_351_1 = this;
                                          stackIn_542_0 = stackOut_351_0;
                                          stackIn_542_1 = stackOut_351_1;
                                          stackIn_352_0 = stackOut_351_0;
                                          stackIn_352_1 = stackOut_351_1;
                                          if (var19 != 0) {
                                            break L16;
                                          } else {
                                            L108: {
                                              if (stackIn_352_0 == (Object) (Object) ((e) this).field_C[var12]) {
                                                break L108;
                                              } else {
                                                if (null == ((e) this).field_C[var12].field_Z) {
                                                  break L108;
                                                } else {
                                                  if (((e) this).field_C[var12].field_P <= 0) {
                                                    break L108;
                                                  } else {
                                                    L109: {
                                                      if (((e) this).field_q != null) {
                                                        break L109;
                                                      } else {
                                                        ((e) this).field_q = ((e) this).field_C[var11_int];
                                                        break L109;
                                                      }
                                                    }
                                                    L110: {
                                                      if (((e) this).field_C[var12] != ((e) this).field_q) {
                                                        break L110;
                                                      } else {
                                                        var10_int = var9;
                                                        break L110;
                                                      }
                                                    }
                                                    var11_int = var12;
                                                    var9++;
                                                    break L108;
                                                  }
                                                }
                                              }
                                            }
                                            var12++;
                                            if (var19 == 0) {
                                              continue L106;
                                            } else {
                                              break L107;
                                            }
                                          }
                                        }
                                      }
                                      L111: {
                                        L112: {
                                          if (var9 > 1) {
                                            break L112;
                                          } else {
                                            var12 = 90;
                                            if (var19 == 0) {
                                              break L111;
                                            } else {
                                              break L112;
                                            }
                                          }
                                        }
                                        var12 = 550 / (-1 + var9);
                                        break L111;
                                      }
                                      L113: {
                                        if (var12 <= 90) {
                                          break L113;
                                        } else {
                                          var12 = 90;
                                          break L113;
                                        }
                                      }
                                      var13 = -1 + var9;
                                      L114: while (true) {
                                        if (var13 < 0) {
                                          break L52;
                                        } else {
                                          var14 = var12;
                                          stackOut_372_0 = ~var10_int;
                                          stackOut_372_1 = ~var13;
                                          stackIn_552_0 = stackOut_372_0;
                                          stackIn_552_1 = stackOut_372_1;
                                          stackIn_373_0 = stackOut_372_0;
                                          stackIn_373_1 = stackOut_372_1;
                                          if (var19 != 0) {
                                            break L15;
                                          } else {
                                            L115: {
                                              if (stackIn_373_0 != stackIn_373_1) {
                                                break L115;
                                              } else {
                                                var14 = 90;
                                                break L115;
                                              }
                                            }
                                            L116: {
                                              var4 = var13 * var12;
                                              if (~var10_int <= ~var13) {
                                                break L116;
                                              } else {
                                                var4 = var4 + (90 - var12);
                                                break L116;
                                              }
                                            }
                                            L117: while (true) {
                                              L118: {
                                                L119: {
                                                  if (null == ((e) this).field_C[var11_int]) {
                                                    break L119;
                                                  } else {
                                                    if (((e) this).field_C[var11_int].field_P > 0) {
                                                      break L118;
                                                    } else {
                                                      break L119;
                                                    }
                                                  }
                                                }
                                                var11_int--;
                                                if (var19 == 0) {
                                                  continue L117;
                                                } else {
                                                  break L118;
                                                }
                                              }
                                              L120: {
                                                var8 = 384;
                                                if (var4 + (-th.field_i.field_r - -var14) > ef.field_j) {
                                                  break L120;
                                                } else {
                                                  if (jb.field_b < 365) {
                                                    break L120;
                                                  } else {
                                                    if (394 < jb.field_b) {
                                                      break L120;
                                                    } else {
                                                      if (~ef.field_j < ~(var14 + var4)) {
                                                        break L120;
                                                      } else {
                                                        L121: {
                                                          if (!ha.field_o) {
                                                            break L121;
                                                          } else {
                                                            if (((e) this).field_B >= 7) {
                                                              break L121;
                                                            } else {
                                                              break L120;
                                                            }
                                                          }
                                                        }
                                                        ((e) this).field_G.field_Eb = new String[1];
                                                        ((e) this).field_G.field_Eb[0] = ne.field_b + ((e) this).field_C[var11_int].field_Z.b(1);
                                                        if (oh.field_f == 1) {
                                                          L122: {
                                                            if (((e) this).field_B < 7) {
                                                              break L122;
                                                            } else {
                                                              if (((e) this).field_B >= 10) {
                                                                break L122;
                                                              } else {
                                                                if (sj.field_b == 32 * (((e) this).field_q.field_F + -((e) this).field_q.field_H)) {
                                                                  break L122;
                                                                } else {
                                                                  if (16 * (((e) this).field_q.field_F + ((e) this).field_q.field_H) != lg.field_c) {
                                                                    ((e) this).field_B = ((e) this).field_B + 1;
                                                                    break L122;
                                                                  } else {
                                                                    break L122;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          ((e) this).field_q = ((e) this).field_C[var11_int];
                                                          eg.field_p = ((e) this).field_q.field_E;
                                                          sj.field_b = (-((e) this).field_q.field_H + ((e) this).field_q.field_F) * 32;
                                                          lg.field_c = 16 * (((e) this).field_q.field_F + ((e) this).field_q.field_H);
                                                          ((e) this).a(-1);
                                                          ((e) this).field_L = 0;
                                                          ((e) this).field_m = false;
                                                          break L120;
                                                        } else {
                                                          break L120;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L123: {
                                                var15 = ((e) this).field_C[var11_int].field_jb;
                                                var16 = 52428;
                                                var17 = 65535;
                                                var18 = 16777215;
                                                if (((e) this).field_C[var11_int].field_B != 0) {
                                                  break L123;
                                                } else {
                                                  var17 = 16711680;
                                                  var18 = 16744576;
                                                  var16 = 13369344;
                                                  break L123;
                                                }
                                              }
                                              L124: {
                                                L125: {
                                                  if (~var10_int == ~var13) {
                                                    break L125;
                                                  } else {
                                                    th.field_i.b(var4 - th.field_i.field_r - -var14, 365);
                                                    og.field_f.b(((e) this).field_C[var11_int].field_Z.a(-1426, -12 + var14 + -8), var4, var8 + -5, 52224, -1);
                                                    og.field_f.a(Integer.toString(var15), -5 + (var14 + var4), -5 + var8, var16, -1);
                                                    if (var19 == 0) {
                                                      break L124;
                                                    } else {
                                                      break L125;
                                                    }
                                                  }
                                                }
                                                vl.field_c.b(var14 + var4 + -vl.field_c.field_r, 365);
                                                og.field_f.b(((e) this).field_C[var11_int].field_Z.a(-1426, -20 + var14), var4, var8 - 5, 65280, -1);
                                                og.field_f.a(Integer.toString(var15), -5 + (var4 - -var14), -5 + var8, var17, -1);
                                                break L124;
                                              }
                                              L126: {
                                                if (((e) this).field_C[var11_int].field_ob) {
                                                  l.e(89 + -vl.field_c.field_r + var4 - (-var14 - -1), 383, 4, 16777215);
                                                  l.e(89 + (-vl.field_c.field_r + (var4 + var14)) + 1, 383, 4, 16777215);
                                                  l.e(-vl.field_c.field_r + var4 + (var14 + 89), 383, 3, 16711680);
                                                  l.e(var4 + (-vl.field_c.field_r - -var14) - -89, 383, 2, 0);
                                                  break L126;
                                                } else {
                                                  break L126;
                                                }
                                              }
                                              L127: {
                                                if (((e) this).field_C[var11_int].field_v != ((e) this).field_C[var11_int].field_jb) {
                                                  break L127;
                                                } else {
                                                  if (1 != ((e) this).field_C[var11_int].field_B) {
                                                    break L127;
                                                  } else {
                                                    og.field_f.a(Integer.toString(var15), var14 + var4 - 5, var8 - 5, var18, -1);
                                                    break L127;
                                                  }
                                                }
                                              }
                                              var11_int--;
                                              var13--;
                                              if (var19 == 0) {
                                                continue L114;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L52;
                                }
                              }
                              if (!g.field_tb) {
                                break L18;
                              } else {
                                if (mm.field_e >= 2) {
                                  vc.field_f.b("QA MODE", 10, 70, 16711823, 0);
                                  stackOut_424_0 = ((e) this).field_h.a(-111, vf.field_a, eg.field_p, uf.field_c);
                                  stackIn_425_0 = stackOut_424_0;
                                  break L19;
                                } else {
                                  break L18;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        }
                        var8_ref_dl = stackIn_425_0;
                        if (null != var8_ref_dl) {
                          L128: {
                            if (null == oi.field_J) {
                              break L128;
                            } else {
                              l.f(0, 100, oi.field_J.field_q, oi.field_J.field_u, 16711823);
                              oi.field_J.b(0, 100);
                              break L128;
                            }
                          }
                          L129: {
                            var9_ref_r = var8_ref_dl.field_h;
                            var10_int = 80;
                            if (null == var9_ref_r) {
                              break L129;
                            } else {
                              L130: {
                                og.field_f.a(var9_ref_r.field_K, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Health " + var9_ref_r.field_P + "/" + var9_ref_r.field_mb, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Armour " + var9_ref_r.field_u + "/" + var9_ref_r.field_fb, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Shield " + var9_ref_r.field_m + "/" + var9_ref_r.field_J, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Weapon: " + od.field_c[var9_ref_r.field_nb.field_g].field_j, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                if (null != var9_ref_r.field_b) {
                                  og.field_f.a("Nades:  " + od.field_c[var9_ref_r.field_b.field_g].field_j + "*" + var9_ref_r.field_b.field_d, 630, var10_int, 16777215, 0);
                                  break L130;
                                } else {
                                  break L130;
                                }
                              }
                              L131: {
                                var10_int += 12;
                                og.field_f.a("Tus " + var9_ref_r.field_jb + "/" + var9_ref_r.field_v, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Interupt " + var9_ref_r.field_q, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                var10_int += 12;
                                og.field_f.a("Use [ and ] to change weapon", 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Use <lt> and > to change tus", 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Hold shift and use <lt> and > to change interupttus", 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Press / to kill this unit", 630, var10_int, 16777215, 0);
                                if (!bh.field_e[uf.field_b]) {
                                  break L131;
                                } else {
                                  L132: {
                                    if (!bh.field_e[81]) {
                                      break L132;
                                    } else {
                                      L133: {
                                        var9_ref_r.field_q = var9_ref_r.field_q - 1;
                                        if (~var9_ref_r.field_q <= ~-var9_ref_r.field_v) {
                                          break L133;
                                        } else {
                                          var9_ref_r.field_q = -var9_ref_r.field_v;
                                          break L133;
                                        }
                                      }
                                      if (-var9_ref_r.field_jb > var9_ref_r.field_q) {
                                        var9_ref_r.field_jb = -var9_ref_r.field_q;
                                        if (var19 == 0) {
                                          break L131;
                                        } else {
                                          break L132;
                                        }
                                      } else {
                                        break L131;
                                      }
                                    }
                                  }
                                  L134: {
                                    var9_ref_r.field_jb = var9_ref_r.field_jb - 1;
                                    if (var9_ref_r.field_jb >= 0) {
                                      break L134;
                                    } else {
                                      var9_ref_r.field_jb = 0;
                                      break L134;
                                    }
                                  }
                                  if (~var9_ref_r.field_q > ~-var9_ref_r.field_jb) {
                                    var9_ref_r.field_q = -var9_ref_r.field_jb;
                                    break L131;
                                  } else {
                                    break L131;
                                  }
                                }
                              }
                              L135: {
                                var10_int += 12;
                                if (!bh.field_e[ne.field_e]) {
                                  break L135;
                                } else {
                                  L136: {
                                    if (bh.field_e[81]) {
                                      break L136;
                                    } else {
                                      L137: {
                                        var9_ref_r.field_jb = var9_ref_r.field_jb + 1;
                                        if (var9_ref_r.field_v < var9_ref_r.field_jb) {
                                          var9_ref_r.field_jb = var9_ref_r.field_v;
                                          break L137;
                                        } else {
                                          break L137;
                                        }
                                      }
                                      if (~(var9_ref_r.field_q + var9_ref_r.field_jb) >= ~var9_ref_r.field_v) {
                                        break L135;
                                      } else {
                                        var9_ref_r.field_q = var9_ref_r.field_v + -var9_ref_r.field_jb;
                                        if (var19 == 0) {
                                          break L135;
                                        } else {
                                          break L136;
                                        }
                                      }
                                    }
                                  }
                                  L138: {
                                    var9_ref_r.field_q = var9_ref_r.field_q + 1;
                                    if (~var9_ref_r.field_q >= ~var9_ref_r.field_v) {
                                      break L138;
                                    } else {
                                      var9_ref_r.field_q = var9_ref_r.field_v;
                                      break L138;
                                    }
                                  }
                                  if (~var9_ref_r.field_v > ~(var9_ref_r.field_q + var9_ref_r.field_jb)) {
                                    var9_ref_r.field_jb = var9_ref_r.field_v + -var9_ref_r.field_q;
                                    break L135;
                                  } else {
                                    break L135;
                                  }
                                }
                              }
                              L139: {
                                if (25 <= nd.field_k) {
                                  break L139;
                                } else {
                                  L140: {
                                    if (!bh.field_e[42]) {
                                      break L140;
                                    } else {
                                      L141: {
                                        var9_ref_r.field_nb.field_g = var9_ref_r.field_nb.field_g - 1;
                                        if (var9_ref_r.field_nb.field_g == 17) {
                                          var9_ref_r.field_nb.field_g = 16;
                                          break L141;
                                        } else {
                                          break L141;
                                        }
                                      }
                                      L142: {
                                        if (var9_ref_r.field_nb.field_g != 5) {
                                          break L142;
                                        } else {
                                          var9_ref_r.field_nb.field_g = 4;
                                          break L142;
                                        }
                                      }
                                      L143: {
                                        if (11 != var9_ref_r.field_nb.field_g) {
                                          break L143;
                                        } else {
                                          var9_ref_r.field_nb.field_g = 10;
                                          break L143;
                                        }
                                      }
                                      nd.field_k = 25;
                                      if (var9_ref_r.field_nb.field_g > -1) {
                                        break L140;
                                      } else {
                                        var9_ref_r.field_nb.field_g = 18;
                                        break L140;
                                      }
                                    }
                                  }
                                  if (!bh.field_e[43]) {
                                    break L139;
                                  } else {
                                    L144: {
                                      var9_ref_r.field_nb.field_g = var9_ref_r.field_nb.field_g + 1;
                                      if (17 == var9_ref_r.field_nb.field_g) {
                                        var9_ref_r.field_nb.field_g = 18;
                                        break L144;
                                      } else {
                                        break L144;
                                      }
                                    }
                                    L145: {
                                      if (var9_ref_r.field_nb.field_g == 5) {
                                        var9_ref_r.field_nb.field_g = 6;
                                        break L145;
                                      } else {
                                        break L145;
                                      }
                                    }
                                    L146: {
                                      if (var9_ref_r.field_nb.field_g == 11) {
                                        var9_ref_r.field_nb.field_g = 12;
                                        break L146;
                                      } else {
                                        break L146;
                                      }
                                    }
                                    L147: {
                                      if (var9_ref_r.field_nb.field_g >= 19) {
                                        var9_ref_r.field_nb.field_g = 0;
                                        break L147;
                                      } else {
                                        break L147;
                                      }
                                    }
                                    nd.field_k = 25;
                                    break L139;
                                  }
                                }
                              }
                              if (!bh.field_e[73]) {
                                break L18;
                              } else {
                                var9_ref_r.field_d = 5;
                                var9_ref_r.field_A = 0;
                                var9_ref_r.field_S = true;
                                var9_ref_r.field_P = 0;
                                if (var19 == 0) {
                                  break L18;
                                } else {
                                  break L129;
                                }
                              }
                            }
                          }
                          L148: {
                            L149: {
                              if (var8_ref_dl.field_v == 0) {
                                break L149;
                              } else {
                                if (var8_ref_dl.field_v != 1) {
                                  break L148;
                                } else {
                                  break L149;
                                }
                              }
                            }
                            og.field_f.a("Press the numberkeys from 0 to 6 to create a unit here", 630, var10_int, 16777215, 0);
                            var10_int += 12;
                            break L148;
                          }
                          L150: {
                            var11 = null;
                            if (bh.field_e[25]) {
                              var11 = (Object) (Object) new r(0, ((e) this).field_G.field_Bb);
                              break L150;
                            } else {
                              break L150;
                            }
                          }
                          L151: {
                            if (bh.field_e[16]) {
                              var11 = (Object) (Object) new r(1, ((e) this).field_G.field_Bb);
                              break L151;
                            } else {
                              break L151;
                            }
                          }
                          L152: {
                            if (!bh.field_e[17]) {
                              break L152;
                            } else {
                              var11 = (Object) (Object) new r(2, ((e) this).field_G.field_Bb);
                              break L152;
                            }
                          }
                          L153: {
                            if (!bh.field_e[18]) {
                              break L153;
                            } else {
                              var11 = (Object) (Object) new r(3, ((e) this).field_G.field_Bb);
                              break L153;
                            }
                          }
                          L154: {
                            if (!bh.field_e[19]) {
                              break L154;
                            } else {
                              var11 = (Object) (Object) new r(4, ((e) this).field_G.field_Bb);
                              break L154;
                            }
                          }
                          L155: {
                            if (bh.field_e[20]) {
                              var11 = (Object) (Object) new r(5, ((e) this).field_G.field_Bb);
                              break L155;
                            } else {
                              break L155;
                            }
                          }
                          L156: {
                            if (!bh.field_e[21]) {
                              break L156;
                            } else {
                              var11 = (Object) (Object) new r(6, ((e) this).field_G.field_Bb);
                              break L156;
                            }
                          }
                          L157: {
                            if (null != var11) {
                              var12 = 0;
                              L158: while (true) {
                                if (~((e) this).field_C.length >= ~var12) {
                                  break L157;
                                } else {
                                  stackOut_522_0 = null;
                                  stackOut_522_1 = this;
                                  stackIn_542_0 = stackOut_522_0;
                                  stackIn_542_1 = stackOut_522_1;
                                  stackIn_523_0 = stackOut_522_0;
                                  stackIn_523_1 = stackOut_522_1;
                                  if (var19 != 0) {
                                    break L16;
                                  } else {
                                    if (stackIn_523_0 == (Object) (Object) ((e) this).field_C[var12]) {
                                      ((e) this).field_C[var12] = (r) var11;
                                      ((r) var11).field_c = var8_ref_dl;
                                      ((r) var11).field_H = vf.field_a;
                                      ((r) var11).field_E = eg.field_p;
                                      var8_ref_dl.field_h = (r) var11;
                                      ((r) var11).field_F = uf.field_c;
                                      var11 = null;
                                      break L157;
                                    } else {
                                      var12++;
                                      if (var19 == 0) {
                                        continue L158;
                                      } else {
                                        break L157;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L157;
                            }
                          }
                          if (var11 == null) {
                            break L18;
                          } else {
                            var12 = 0;
                            L159: while (true) {
                              if (((e) this).field_C.length <= var12) {
                                break L18;
                              } else {
                                stackOut_531_0 = this;
                                stackIn_539_0 = stackOut_531_0;
                                stackIn_532_0 = stackOut_531_0;
                                if (var19 != 0) {
                                  break L17;
                                } else {
                                  L160: {
                                    if (((e) this).field_C[var12] == null) {
                                      break L160;
                                    } else {
                                      if (0 < ((e) this).field_C[var12].field_P) {
                                        break L160;
                                      } else {
                                        ((e) this).field_C[var12] = (r) var11;
                                        ((r) var11).field_H = vf.field_a;
                                        ((r) var11).field_c = var8_ref_dl;
                                        ((r) var11).field_E = eg.field_p;
                                        var8_ref_dl.field_h = (r) var11;
                                        ((r) var11).field_F = uf.field_c;
                                        var11 = null;
                                        break L18;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (var19 == 0) {
                                    continue L159;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      stackOut_538_0 = this;
                      stackIn_539_0 = stackOut_538_0;
                      break L17;
                    }
                    L161: {
                      if (!((e) this).field_w) {
                        break L161;
                      } else {
                        ((e) this).field_h.c(5);
                        break L161;
                      }
                    }
                    stackOut_541_0 = null;
                    stackOut_541_1 = this;
                    stackIn_542_0 = stackOut_541_0;
                    stackIn_542_1 = stackOut_541_1;
                    break L16;
                  }
                  L162: {
                    if (stackIn_542_0 != (Object) (Object) ((e) this).field_K) {
                      break L162;
                    } else {
                      if (((e) this).field_J) {
                        break L162;
                      } else {
                        L163: {
                          ((e) this).field_K = mk.field_f;
                          var8 = vc.field_f.b(((e) this).field_K);
                          var9 = 24;
                          if (var8 >= 320) {
                            var8 = 320;
                            break L163;
                          } else {
                            break L163;
                          }
                        }
                        var9 = 24 * vc.field_f.c(((e) this).field_K, var8);
                        l.f(320 + -(var8 / 2) + -10, 237 - (var9 / 2 - 122), var8 + 20, 8 + var9, 8388608);
                        jl.a(jc.field_G, 6 + var9 + 8, 116 + (-(var9 / 2) + 240), 20 + var8 - -6, (byte) -115, -13 + (-(var8 / 2) + 320));
                        int discarded$6 = kb.a(116, 24, var8 + (-(var8 / 2) + 320), ((e) this).field_K, -(var8 / 2) + 320, 50 + (240 + -var9 + 105), 16777215);
                        ((e) this).field_K = null;
                        break L162;
                      }
                    }
                  }
                  if (null != ((e) this).field_K) {
                    jm.field_h = jm.field_h + 1;
                    stackOut_551_0 = ~jm.field_h;
                    stackOut_551_1 = -101;
                    stackIn_552_0 = stackOut_551_0;
                    stackIn_552_1 = stackOut_551_1;
                    break L15;
                  } else {
                    break L13;
                  }
                }
                L164: {
                  if (stackIn_552_0 >= stackIn_552_1) {
                    break L164;
                  } else {
                    lg.field_c = ((e) this).field_k;
                    ((e) this).field_K = null;
                    sj.field_b = ((e) this).field_c;
                    jm.field_h = 0;
                    eg.field_p = ((e) this).field_E;
                    break L164;
                  }
                }
                L165: {
                  var8 = vc.field_f.b(((e) this).field_K);
                  var9 = 24;
                  if (var8 < 320) {
                    break L165;
                  } else {
                    var8 = 320;
                    break L165;
                  }
                }
                L166: {
                  if (var8 >= og.field_f.b(jc.field_B)) {
                    break L166;
                  } else {
                    var8 = og.field_f.b(jc.field_B);
                    break L166;
                  }
                }
                var9 = 24 + 24 * vc.field_f.c(((e) this).field_K, var8);
                l.f(-10 + -(var8 / 2) + 320, 50 + (-28 + -(var9 / 2) + 240), var8 - -20, 8 + var9, 8388608);
                stackOut_558_0 = jc.field_G;
                stackOut_558_1 = var9 - -14;
                stackOut_558_2 = 209 + (-(var9 / 2) + 50);
                stackIn_559_0 = stackOut_558_0;
                stackIn_559_1 = stackOut_558_1;
                stackIn_559_2 = stackOut_558_2;
                break L14;
              }
              jl.a(stackIn_559_0, stackIn_559_1, stackIn_559_2, var8 - -26, (byte) 103, -3 + (310 - var8 / 2));
              int discarded$7 = vc.field_f.a(((e) this).field_K, -(var8 / 2) + 320, 24 + (240 - var9 / 2), var8, var9, 16777215, 0, 1, 0, vc.field_f.field_s);
              og.field_f.c(jc.field_B, 320, 24 + (var9 / 2 + 240), 16777215, -1);
              break L13;
            }
            L167: {
              vb.field_i = 25;
              ge.field_b = 610;
              if (!((e) this).field_J) {
                break L167;
              } else {
                boolean discarded$8 = tf.a(vb.field_i, (byte) 29, 390, ge.field_b, true, 89);
                break L167;
              }
            }
            L168: {
              L169: {
                L170: {
                  if (!((e) this).field_w) {
                    break L170;
                  } else {
                    if (!((e) this).field_J) {
                      break L170;
                    } else {
                      break L169;
                    }
                  }
                }
                L171: {
                  var8_ref_th = ((e) this).field_n;
                  var9 = 361;
                  if (!((e) this).field_J) {
                    var9 = 472;
                    break L171;
                  } else {
                    break L171;
                  }
                }
                L172: while (true) {
                  if (var8_ref_th == null) {
                    break L169;
                  } else {
                    rh.field_b[11].a(0, -14 + var9, 16, 16);
                    stackOut_570_0 = var8_ref_th.field_h;
                    stackIn_582_0 = stackOut_570_0;
                    stackIn_571_0 = stackOut_570_0;
                    if (var19 != 0) {
                      break L168;
                    } else {
                      L173: {
                        L174: {
                          if (stackIn_571_0) {
                            break L174;
                          } else {
                            L175: {
                              var10_int = 65280;
                              if (1 != var8_ref_th.field_d / 5 % 2) {
                                break L175;
                              } else {
                                var10_int = 16777215;
                                break L175;
                              }
                            }
                            og.field_f.b(var8_ref_th.field_b, 21, var9, 0, -1);
                            og.field_f.b(var8_ref_th.field_b, 19, var9, 0, -1);
                            og.field_f.b(var8_ref_th.field_b, 20, var9 - -1, 0, -1);
                            og.field_f.b(var8_ref_th.field_b, 20, -1 + var9, 0, -1);
                            og.field_f.b(var8_ref_th.field_b, 20, var9, var10_int, -1);
                            if (var19 == 0) {
                              break L173;
                            } else {
                              break L174;
                            }
                          }
                        }
                        var10_int = 65793 * var8_ref_th.field_d;
                        og.field_f.b(var8_ref_th.field_b, 21, var9, 0, -1);
                        og.field_f.b(var8_ref_th.field_b, 19, var9, 0, -1);
                        og.field_f.b(var8_ref_th.field_b, 20, var9 - -1, 0, -1);
                        og.field_f.b(var8_ref_th.field_b, 20, -1 + var9, 0, -1);
                        og.field_f.b(var8_ref_th.field_b, 20, var9, var10_int, -1);
                        break L173;
                      }
                      L176: {
                        if (null != var8_ref_th) {
                          var8_ref_th = var8_ref_th.field_f;
                          break L176;
                        } else {
                          break L176;
                        }
                      }
                      var9 -= 16;
                      if (var19 == 0) {
                        continue L172;
                      } else {
                        break L169;
                      }
                    }
                  }
                }
              }
              stackOut_581_0 = param1;
              stackIn_582_0 = stackOut_581_0;
              break L168;
            }
            L177: {
              if (!stackIn_582_0) {
                break L177;
              } else {
                ((e) this).field_G.field_Eb = null;
                break L177;
              }
            }
            L178: {
              if (((e) this).field_J) {
                l.d(162, 7, 364, 33, 0, 128);
                l.b(162, 39, 364, 4473924);
                ua.field_b.b(0, 0);
                if (null != ((e) this).field_G.field_Eb) {
                  L179: {
                    if (((e) this).field_G.field_Eb.length != 1) {
                      break L179;
                    } else {
                      int discarded$9 = og.field_f.a(((e) this).field_G.field_Eb[0], 178, 6, 332, 33, 16777215, -1, 1, 1, 12);
                      if (var19 == 0) {
                        break L178;
                      } else {
                        break L179;
                      }
                    }
                  }
                  int discarded$10 = og.field_f.a(((e) this).field_G.field_Eb[0], 178, 6, 162, 33, 16777215, -1, 1, 1, 12);
                  l.f(344, 10, 27, 4473924);
                  int discarded$11 = og.field_f.a(((e) this).field_G.field_Eb[1], 348, 6, 162, 33, 16777215, -1, 1, 1, 12);
                  break L178;
                } else {
                  break L178;
                }
              } else {
                break L178;
              }
            }
            L180: {
              if (!((e) this).field_b) {
                break L180;
              } else {
                le.field_q = null;
                break L180;
              }
            }
            L181: {
              if (le.field_q != null) {
                le.field_q.a((byte) -100);
                break L181;
              } else {
                break L181;
              }
            }
            L182: {
              L183: {
                if (var3_int == 0) {
                  break L183;
                } else {
                  if (li.field_a) {
                    break L183;
                  } else {
                    var8 = 0;
                    L184: while (true) {
                      stackOut_601_0 = ((e) this).field_h;
                      stackIn_602_0 = stackOut_601_0;
                      L185: while (true) {
                        if (~stackIn_602_0.field_b >= ~var8) {
                          break L183;
                        } else {
                          if (var19 != 0) {
                            break L182;
                          } else {
                            var9 = 0;
                            L186: while (true) {
                              L187: {
                                if (~((e) this).field_h.field_e >= ~var9) {
                                  break L187;
                                } else {
                                  stackOut_606_0 = ((e) this).field_h;
                                  stackIn_602_0 = stackOut_606_0;
                                  stackIn_607_0 = stackOut_606_0;
                                  if (var19 != 0) {
                                    continue L185;
                                  } else {
                                    var10_ref = stackIn_607_0.field_f[var8][var9];
                                    L188: while (true) {
                                      L189: {
                                        L190: {
                                          if (null == var10_ref) {
                                            break L190;
                                          } else {
                                            var10_ref.field_p = 0;
                                            var10_ref = var10_ref.field_C;
                                            if (var19 != 0) {
                                              break L189;
                                            } else {
                                              if (var19 == 0) {
                                                continue L188;
                                              } else {
                                                break L190;
                                              }
                                            }
                                          }
                                        }
                                        var9++;
                                        break L189;
                                      }
                                      if (var19 == 0) {
                                        continue L186;
                                      } else {
                                        break L187;
                                      }
                                    }
                                  }
                                }
                              }
                              var8++;
                              if (var19 == 0) {
                                continue L184;
                              } else {
                                break L183;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break L182;
            }
            return;
          }
        } else {
          ((e) this).field_h.a(24, (byte) -122, 92);
          return;
        }
    }

    private final void b(byte param0) {
        try {
            fi.field_m = null;
            ql.field_i = -1;
            ld.field_e = -1;
            og.field_d = -1;
            if (param0 != -3) {
                ((e) this).field_d = 61;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "e.G(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, ci param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var18 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = -16 + param3.field_u;
              if (60 != param3.field_u) {
                break L1;
              } else {
                var5_int = -12 + param3.field_u;
                break L1;
              }
            }
            var6 = param2;
            var6 = var6 + param3.field_p;
            var7 = param1;
            var7 = var7 + param3.field_v;
            var8 = 0;
            var9 = param3.field_p + param2;
            var10 = param1 - -param3.field_v;
            var11 = param3.field_t;
            var12 = param3.field_r;
            if (param0 == -101) {
              L2: {
                if (l.field_d <= var7) {
                  break L2;
                } else {
                  var14 = l.field_d + -var7;
                  var11 = var11 - var14;
                  var8 = var8 + var14 * var12;
                  var7 = l.field_d;
                  var10 = var10 + var14;
                  break L2;
                }
              }
              L3: {
                var13 = 0;
                if (l.field_c >= var7 + var11) {
                  break L3;
                } else {
                  var11 = var11 - (-l.field_c + (var11 + var7));
                  break L3;
                }
              }
              L4: {
                if (var6 < l.field_b) {
                  var14 = l.field_b + -var6;
                  var13 = var13 + var14;
                  var8 = var8 + var14;
                  var12 = var12 - var14;
                  var9 = var9 + var14;
                  var6 = l.field_b;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (l.field_f < var6 + var12) {
                  var14 = var12 + var6 - l.field_f;
                  var12 = var12 - var14;
                  var13 = var13 + var14;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (0 >= var12) {
                  break L6;
                } else {
                  if (var11 <= 0) {
                    break L6;
                  } else {
                    var15 = var9;
                    var16 = var10;
                    var17 = -(var12 >> 193240131);
                    var12 = -(var12 & 7);
                    var7 = -var11;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (0 <= var7) {
                            break L9;
                          } else {
                            if (var18 != 0) {
                              break L8;
                            } else {
                              var6 = var17;
                              L10: while (true) {
                                L11: {
                                  L12: {
                                    if (var6 >= 0) {
                                      break L12;
                                    } else {
                                      int incrementValue$9 = var8;
                                      var8++;
                                      var14 = param3.field_z[incrementValue$9];
                                      stackOut_29_0 = 0;
                                      stackOut_29_1 = var14;
                                      stackIn_69_0 = stackOut_29_0;
                                      stackIn_69_1 = stackOut_29_1;
                                      stackIn_30_0 = stackOut_29_0;
                                      stackIn_30_1 = stackOut_29_1;
                                      if (var18 != 0) {
                                        break L11;
                                      } else {
                                        L13: {
                                          if (stackIn_30_0 != stackIn_30_1) {
                                            gd.field_a[var15][var16] = param1 + (var5_int - -(Math.abs(var15 - var9) / 2));
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          var15++;
                                          int incrementValue$10 = var8;
                                          var8++;
                                          var14 = param3.field_z[incrementValue$10];
                                          if (var14 == 0) {
                                            break L14;
                                          } else {
                                            gd.field_a[var15][var16] = param1 + var5_int - -(Math.abs(var15 + -var9) / 2);
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          int incrementValue$11 = var8;
                                          var8++;
                                          var14 = param3.field_z[incrementValue$11];
                                          var15++;
                                          if (var14 == 0) {
                                            break L15;
                                          } else {
                                            gd.field_a[var15][var16] = Math.abs(var15 - var9) / 2 + (param1 - -var5_int);
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          var15++;
                                          int incrementValue$12 = var8;
                                          var8++;
                                          var14 = param3.field_z[incrementValue$12];
                                          if (var14 != 0) {
                                            gd.field_a[var15][var16] = Math.abs(-var9 + var15) / 2 + param1 + var5_int;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        var15++;
                                        var6++;
                                        if (var18 == 0) {
                                          continue L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  var6 = var17;
                                  L17: while (true) {
                                    L18: {
                                      if (var6 >= 0) {
                                        break L18;
                                      } else {
                                        int incrementValue$13 = var8;
                                        var8++;
                                        var14 = param3.field_z[incrementValue$13];
                                        stackOut_48_0 = -1;
                                        stackOut_48_1 = ~var14;
                                        stackIn_69_0 = stackOut_48_0;
                                        stackIn_69_1 = stackOut_48_1;
                                        stackIn_49_0 = stackOut_48_0;
                                        stackIn_49_1 = stackOut_48_1;
                                        if (var18 != 0) {
                                          break L11;
                                        } else {
                                          L19: {
                                            if (stackIn_49_0 != stackIn_49_1) {
                                              gd.field_a[var15][var16] = Math.abs(var15 - var9 + var17 * 8) / 2 + var5_int + param1;
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            var15++;
                                            int incrementValue$14 = var8;
                                            var8++;
                                            var14 = param3.field_z[incrementValue$14];
                                            if (var14 != 0) {
                                              gd.field_a[var15][var16] = var5_int + param1 + Math.abs(var17 * 8 + (var15 - var9)) / 2;
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          L21: {
                                            var15++;
                                            int incrementValue$15 = var8;
                                            var8++;
                                            var14 = param3.field_z[incrementValue$15];
                                            if (0 != var14) {
                                              gd.field_a[var15][var16] = Math.abs(8 * var17 + var15 + -var9) / 2 + (param1 + var5_int);
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          L22: {
                                            var15++;
                                            int incrementValue$16 = var8;
                                            var8++;
                                            var14 = param3.field_z[incrementValue$16];
                                            if (var14 != 0) {
                                              gd.field_a[var15][var16] = param1 - -var5_int + Math.abs(var17 * 8 + var15 - var9) / 2;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                          var15++;
                                          var6++;
                                          if (var18 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                    var6 = var12;
                                    stackOut_68_0 = ~var6;
                                    stackOut_68_1 = -1;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    break L11;
                                  }
                                }
                                L23: while (true) {
                                  L24: {
                                    L25: {
                                      if (stackIn_69_0 <= stackIn_69_1) {
                                        break L25;
                                      } else {
                                        int incrementValue$17 = var8;
                                        var8++;
                                        var14 = param3.field_z[incrementValue$17];
                                        stackOut_70_0 = 0;
                                        stackOut_70_1 = var14;
                                        stackIn_78_0 = stackOut_70_0;
                                        stackIn_78_1 = stackOut_70_1;
                                        stackIn_71_0 = stackOut_70_0;
                                        stackIn_71_1 = stackOut_70_1;
                                        if (var18 != 0) {
                                          break L24;
                                        } else {
                                          L26: {
                                            if (stackIn_71_0 == stackIn_71_1) {
                                              break L26;
                                            } else {
                                              gd.field_a[var15][var16] = var5_int + (param1 - -(Math.abs(var17 * 8 + (var15 + -var9)) / 2));
                                              break L26;
                                            }
                                          }
                                          var15++;
                                          var6++;
                                          if (var18 == 0) {
                                            stackOut_68_0 = ~var6;
                                            stackOut_68_1 = -1;
                                            stackIn_69_0 = stackOut_68_0;
                                            stackIn_69_1 = stackOut_68_1;
                                            continue L23;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_77_0 = var8;
                                    stackOut_77_1 = var13;
                                    stackIn_78_0 = stackOut_77_0;
                                    stackIn_78_1 = stackOut_77_1;
                                    break L24;
                                  }
                                  var8 = stackIn_78_0 + stackIn_78_1;
                                  var16++;
                                  var15 = var9;
                                  var7++;
                                  if (var18 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                        break L8;
                      }
                      break L0;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var5 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var5;
            stackOut_80_1 = new StringBuilder().append("e.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L27;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L27;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        th var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = ((e) this).field_n;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = param0;
                    stackOut_3_1 = var4.field_a;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == stackIn_4_1) {
                        if (0 != var4.field_b.compareTo(param1)) {
                          ((e) this).field_n = new th(param0, param1, ((e) this).field_n);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var4 = var4.field_f;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (null != var4) {
                    break L4;
                  } else {
                    ((e) this).field_n = new th(param0, param1, ((e) this).field_n);
                    break L4;
                  }
                }
                stackOut_16_0 = param2;
                stackOut_16_1 = -3;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L5: {
                if (stackIn_17_0 <= stackIn_17_1) {
                  break L5;
                } else {
                  ((e) this).field_z = -33;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4_ref;
            stackOut_21_1 = new StringBuilder().append("e.N(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= ((e) this).field_C.length) {
                      break L3;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null == ((e) this).field_C[var2_int]) {
                            break L4;
                          } else {
                            if (null == ((e) this).field_C[var2_int].field_Z) {
                              ((e) this).field_C[var2_int].field_P = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "e.E(" + param0 + ')');
        }
    }

    final void a(Terraphoenix param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        r var4_ref_r = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        r stackIn_4_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        r stackIn_53_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_91_0 = 0;
        r stackIn_94_0 = null;
        r stackIn_144_0 = null;
        r stackIn_170_0 = null;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        String stackIn_219_2 = null;
        RuntimeException decompiledCaughtException = null;
        r stackOut_3_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        r stackOut_52_0 = null;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_90_0 = 0;
        r stackOut_93_0 = null;
        r stackOut_143_0 = null;
        r stackOut_169_0 = null;
        RuntimeException stackOut_215_0 = null;
        StringBuilder stackOut_215_1 = null;
        RuntimeException stackOut_218_0 = null;
        StringBuilder stackOut_218_1 = null;
        String stackOut_218_2 = null;
        RuntimeException stackOut_216_0 = null;
        StringBuilder stackOut_216_1 = null;
        String stackOut_216_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            ((e) this).field_L = 0;
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (var3_int >= 12) {
                          break L6;
                        } else {
                          stackOut_3_0 = ((e) this).field_C[var3_int];
                          stackIn_53_0 = stackOut_3_0;
                          stackIn_4_0 = stackOut_3_0;
                          if (var7 != 0) {
                            break L5;
                          } else {
                            L7: {
                              if (stackIn_4_0 == null) {
                                break L7;
                              } else {
                                if (((e) this).field_C[var3_int].field_Z == null) {
                                  break L7;
                                } else {
                                  ((e) this).field_C[var3_int].field_ob = false;
                                  break L7;
                                }
                              }
                            }
                            var3_int++;
                            if (var7 == 0) {
                              continue L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L8: {
                        var4 = 100 % ((param1 - 17) / 46);
                        this.b((byte) -3);
                        ((e) this).field_D = null;
                        stackOut_13_0 = this;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (((e) this).field_J) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          break L8;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = 1;
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          break L8;
                        }
                      }
                      L9: {
                        ((e) this).field_J = stackIn_17_1 != 0;
                        if (!((e) this).field_J) {
                          break L9;
                        } else {
                          jh.field_n = jh.field_n + 1;
                          break L9;
                        }
                      }
                      if (((e) this).field_J) {
                        break L3;
                      } else {
                        L10: {
                          if (12 == param0.field_Bb) {
                            break L10;
                          } else {
                            if (13 == param0.field_Bb) {
                              break L10;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L11: {
                          if (Math.random() * 100.0 >= 50.0) {
                            break L11;
                          } else {
                            if (((e) this).field_h.field_f[((e) this).field_h.field_b / 2][2].field_z) {
                              break L11;
                            } else {
                              if (((e) this).field_h.a(((e) this).field_h.field_b / 2, false, 0, 2)) {
                                break L11;
                              } else {
                                var3_int = 0;
                                var4_ref_r = ((e) this).field_C[0];
                                L12: while (true) {
                                  L13: {
                                    if (var4_ref_r == null) {
                                      break L13;
                                    } else {
                                      stackOut_38_0 = ~(((e) this).field_C.length + -1);
                                      stackOut_38_1 = ~var3_int;
                                      stackIn_58_0 = stackOut_38_0;
                                      stackIn_58_1 = stackOut_38_1;
                                      stackIn_39_0 = stackOut_38_0;
                                      stackIn_39_1 = stackOut_38_1;
                                      if (var7 != 0) {
                                        L14: while (true) {
                                          if (stackIn_58_0 >= stackIn_58_1) {
                                            break L4;
                                          } else {
                                            var3_int++;
                                            var4_ref_r = ((e) this).field_C[var3_int];
                                            if (var7 == 0) {
                                              if (var4_ref_r == null) {
                                                break L4;
                                              } else {
                                                stackOut_55_0 = var3_int;
                                                stackIn_65_0 = stackOut_55_0;
                                                stackIn_56_0 = stackOut_55_0;
                                                if (var7 != 0) {
                                                  break L2;
                                                } else {
                                                  stackOut_56_0 = stackIn_56_0;
                                                  stackOut_56_1 = ((e) this).field_C.length - 1;
                                                  stackIn_58_0 = stackOut_56_0;
                                                  stackIn_58_1 = stackOut_56_1;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                      } else {
                                        if (stackIn_39_0 >= stackIn_39_1) {
                                          break L13;
                                        } else {
                                          var3_int++;
                                          var4_ref_r = ((e) this).field_C[var3_int];
                                          if (var7 == 0) {
                                            continue L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (null != var4_ref_r) {
                                    break L11;
                                  } else {
                                    ((e) this).field_C[var3_int] = new r(4, param0.field_Bb);
                                    var4_ref_r = ((e) this).field_C[var3_int];
                                    var4_ref_r.field_F = ((e) this).field_h.field_b / 2;
                                    var4_ref_r.field_H = 2;
                                    var4_ref_r.field_c = ((e) this).field_h.field_f[((e) this).field_h.field_b / 2][2];
                                    var4_ref_r.field_c.field_h = var4_ref_r;
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (50.0 <= Math.random() * 100.0) {
                          break L3;
                        } else {
                          if (((e) this).field_h.field_f[2][((e) this).field_h.field_e / 2].field_z) {
                            break L3;
                          } else {
                            if (((e) this).field_h.a(2, false, 0, ((e) this).field_h.field_e / 2)) {
                              break L3;
                            } else {
                              var3_int = 0;
                              stackOut_52_0 = ((e) this).field_C[0];
                              stackIn_53_0 = stackOut_52_0;
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    var4_ref_r = stackIn_53_0;
                    L15: while (true) {
                      if (var4_ref_r == null) {
                        break L4;
                      } else {
                        stackOut_55_0 = var3_int;
                        stackIn_65_0 = stackOut_55_0;
                        stackIn_56_0 = stackOut_55_0;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          stackOut_56_0 = stackIn_56_0;
                          stackOut_56_1 = ((e) this).field_C.length - 1;
                          stackIn_58_0 = stackOut_56_0;
                          stackIn_58_1 = stackOut_56_1;
                          if (stackIn_58_0 >= stackIn_58_1) {
                            break L4;
                          } else {
                            var3_int++;
                            var4_ref_r = ((e) this).field_C[var3_int];
                            if (var7 == 0) {
                              continue L15;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var4_ref_r == null) {
                    ((e) this).field_C[var3_int] = new r(4, param0.field_Bb);
                    var4_ref_r = ((e) this).field_C[var3_int];
                    var4_ref_r.field_F = 2;
                    var4_ref_r.field_H = ((e) this).field_h.field_e / 2;
                    var4_ref_r.field_c = ((e) this).field_h.field_f[2][((e) this).field_h.field_e / 2];
                    var4_ref_r.field_c.field_h = var4_ref_r;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3_int = 0;
                stackOut_64_0 = 0;
                stackIn_65_0 = stackOut_64_0;
                break L2;
              }
              var5 = stackIn_65_0;
              L16: while (true) {
                stackOut_66_0 = ~((e) this).field_h.field_b;
                stackOut_66_1 = ~var5;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                L17: while (true) {
                  L18: {
                    L19: {
                      if (stackIn_67_0 >= stackIn_67_1) {
                        break L19;
                      } else {
                        stackOut_68_0 = 0;
                        stackIn_91_0 = stackOut_68_0;
                        stackIn_69_0 = stackOut_68_0;
                        if (var7 != 0) {
                          break L18;
                        } else {
                          var6 = stackIn_69_0;
                          L20: while (true) {
                            L21: {
                              if (var6 >= ((e) this).field_h.field_e) {
                                break L21;
                              } else {
                                ((e) this).field_h.field_f[var5][var6].field_B = false;
                                stackOut_71_0 = 0;
                                stackOut_71_1 = ((e) this).field_h.field_f[var5][var6].field_i;
                                stackIn_67_0 = stackOut_71_0;
                                stackIn_67_1 = stackOut_71_1;
                                stackIn_72_0 = stackOut_71_0;
                                stackIn_72_1 = stackOut_71_1;
                                if (var7 != 0) {
                                  continue L17;
                                } else {
                                  L22: {
                                    if (stackIn_72_0 < stackIn_72_1) {
                                      L23: {
                                        if ((1 & ((e) this).field_h.field_f[var5][var6].field_i) <= 0) {
                                          break L23;
                                        } else {
                                          if (((e) this).field_h.field_f[var5][var6].field_g % 4 == 3) {
                                            ((e) this).field_h.field_f[var5][var6].field_g = ((e) this).field_h.field_f[var5][var6].field_g - 3;
                                            ((e) this).field_h.field_f[var5][var6].a(1, true, 114);
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      if (0 >= (2 & ((e) this).field_h.field_f[var5][var6].field_i)) {
                                        break L22;
                                      } else {
                                        if (((e) this).field_h.field_f[var5][var6].field_k % 4 == 3) {
                                          ((e) this).field_h.field_f[var5][var6].field_k = ((e) this).field_h.field_f[var5][var6].field_k - 3;
                                          ((e) this).field_h.field_f[var5][var6].a(2, true, 87);
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    } else {
                                      break L22;
                                    }
                                  }
                                  var6++;
                                  if (var7 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L16;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                    }
                    stackOut_90_0 = 0;
                    stackIn_91_0 = stackOut_90_0;
                    break L18;
                  }
                  var4 = stackIn_91_0;
                  ((e) this).field_A = false;
                  var5 = 0;
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (var5 >= ((e) this).field_C.length) {
                            break L27;
                          } else {
                            stackOut_93_0 = ((e) this).field_C[var5];
                            stackIn_170_0 = stackOut_93_0;
                            stackIn_94_0 = stackOut_93_0;
                            if (var7 != 0) {
                              break L26;
                            } else {
                              L28: {
                                if (stackIn_94_0 == null) {
                                  break L28;
                                } else {
                                  if (((e) this).field_C[var5].field_P <= 0) {
                                    break L28;
                                  } else {
                                    L29: {
                                      L30: {
                                        if (null != ((e) this).field_C[var5].field_Z) {
                                          break L30;
                                        } else {
                                          if (((e) this).field_C[var5].field_C != 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        var3_int++;
                                        if (((e) this).field_z <= 0) {
                                          break L31;
                                        } else {
                                          if (((e) this).field_C[var5].field_c == null) {
                                            break L31;
                                          } else {
                                            if (!((e) this).field_C[var5].field_c.field_d) {
                                              break L31;
                                            } else {
                                              ((e) this).field_A = true;
                                              break L31;
                                            }
                                          }
                                        }
                                      }
                                      L32: {
                                        if (((e) this).field_C[var5].field_Z == null) {
                                          break L32;
                                        } else {
                                          if (null == ((e) this).field_C[var5].field_c) {
                                            break L32;
                                          } else {
                                            ((e) this).field_q = ((e) this).field_C[var5];
                                            break L32;
                                          }
                                        }
                                      }
                                      L33: {
                                        if (!((e) this).field_J) {
                                          break L33;
                                        } else {
                                          ((e) this).field_C[var5].b(60);
                                          if (var7 == 0) {
                                            break L28;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                      ((e) this).field_C[var5].f(100);
                                      if (var7 == 0) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    L34: {
                                      if (((e) this).field_C[var5].field_C != 1) {
                                        break L34;
                                      } else {
                                        var4++;
                                        break L34;
                                      }
                                    }
                                    L35: {
                                      L36: {
                                        if (((e) this).field_J) {
                                          break L36;
                                        } else {
                                          ((e) this).field_C[var5].b(60);
                                          if (var7 == 0) {
                                            break L35;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                      ((e) this).field_C[var5].f(106);
                                      break L35;
                                    }
                                    ((e) this).field_C[var5].field_k = false;
                                    var6 = 0;
                                    L37: while (true) {
                                      if (((e) this).field_C.length <= var6) {
                                        break L28;
                                      } else {
                                        stackOut_143_0 = ((e) this).field_C[var6];
                                        stackIn_170_0 = stackOut_143_0;
                                        stackIn_144_0 = stackOut_143_0;
                                        if (var7 != 0) {
                                          break L26;
                                        } else {
                                          L38: {
                                            if (stackIn_144_0 == null) {
                                              break L38;
                                            } else {
                                              if (((e) this).field_C[var6].field_C != 0) {
                                                break L38;
                                              } else {
                                                if (((e) this).field_C[var6].field_P <= 0) {
                                                  break L38;
                                                } else {
                                                  if (~((e) this).field_C[var5].field_E == ~((e) this).field_C[var6].field_E) {
                                                    if (!((e) this).field_h.a((byte) -93, ((e) this).field_C[var6], ((e) this).field_C[var5])) {
                                                      break L38;
                                                    } else {
                                                      ((e) this).field_C[var5].field_k = true;
                                                      ((e) this).field_C[var5].field_h = true;
                                                      ((e) this).field_C[var5].field_i = ((e) this).field_C[var5].field_F;
                                                      ((e) this).field_C[var5].field_gb = ((e) this).field_C[var5].field_H;
                                                      break L38;
                                                    }
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var7 == 0) {
                                            continue L37;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        if (!((e) this).field_J) {
                          break L25;
                        } else {
                          if (null != ((e) this).field_q) {
                            lg.field_c = -(((e) this).field_q.field_E * 48) + 16 * (((e) this).field_q.field_F + ((e) this).field_q.field_H);
                            stackOut_169_0 = ((e) this).field_q;
                            stackIn_170_0 = stackOut_169_0;
                            break L26;
                          } else {
                            break L25;
                          }
                        }
                      }
                      eg.field_p = stackIn_170_0.field_E;
                      sj.field_b = 32 * (((e) this).field_q.field_F - ((e) this).field_q.field_H);
                      ((e) this).a(-1);
                      ((e) this).field_d = ((e) this).field_d + 1;
                      ((e) this).field_m = false;
                      ((e) this).field_L = 0;
                      jm.field_h = 0;
                      ((e) this).field_k = lg.field_c;
                      ((e) this).field_E = eg.field_p;
                      ((e) this).field_c = sj.field_b;
                      ((e) this).field_K = mc.field_a + ((e) this).field_d;
                      ((e) this).field_a = ((e) this).field_q.field_F;
                      ((e) this).field_x = ((e) this).field_q.field_H;
                      break L25;
                    }
                    L39: {
                      if (((e) this).field_A) {
                        break L39;
                      } else {
                        if (((e) this).field_z <= 0) {
                          break L39;
                        } else {
                          if (((e) this).field_J) {
                            if (((e) this).field_z > 0) {
                              L40: {
                                ((e) this).field_z = ((e) this).field_z - 1;
                                if (((e) this).field_z <= 0) {
                                  break L40;
                                } else {
                                  if (((e) this).field_z <= 3) {
                                    qd.a((byte) 91, 89);
                                    if (var7 == 0) {
                                      break L39;
                                    } else {
                                      break L40;
                                    }
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              qd.a((byte) 57, 90);
                              ((e) this).a(0, param0);
                              break L39;
                            } else {
                              break L39;
                            }
                          } else {
                            break L39;
                          }
                        }
                      }
                    }
                    L41: {
                      if (!((e) this).field_A) {
                        break L41;
                      } else {
                        if (4 <= ((e) this).field_z) {
                          break L41;
                        } else {
                          if (!((e) this).field_J) {
                            break L41;
                          } else {
                            if (((e) this).field_z <= 0) {
                              break L41;
                            } else {
                              ((e) this).field_z = 4;
                              break L41;
                            }
                          }
                        }
                      }
                    }
                    L42: {
                      L43: {
                        L44: {
                          if (var4 != 0) {
                            break L44;
                          } else {
                            if (!((e) this).field_J) {
                              break L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                        if (var3_int != 0) {
                          break L42;
                        } else {
                          break L43;
                        }
                      }
                      ((e) this).a(-125, param0);
                      break L42;
                    }
                    ((e) this).field_h.b((byte) -19);
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L45: {
            var3 = decompiledCaughtException;
            stackOut_215_0 = (RuntimeException) var3;
            stackOut_215_1 = new StringBuilder().append("e.O(");
            stackIn_218_0 = stackOut_215_0;
            stackIn_218_1 = stackOut_215_1;
            stackIn_216_0 = stackOut_215_0;
            stackIn_216_1 = stackOut_215_1;
            if (param0 == null) {
              stackOut_218_0 = (RuntimeException) (Object) stackIn_218_0;
              stackOut_218_1 = (StringBuilder) (Object) stackIn_218_1;
              stackOut_218_2 = "null";
              stackIn_219_0 = stackOut_218_0;
              stackIn_219_1 = stackOut_218_1;
              stackIn_219_2 = stackOut_218_2;
              break L45;
            } else {
              stackOut_216_0 = (RuntimeException) (Object) stackIn_216_0;
              stackOut_216_1 = (StringBuilder) (Object) stackIn_216_1;
              stackOut_216_2 = "{...}";
              stackIn_219_0 = stackOut_216_0;
              stackIn_219_1 = stackOut_216_1;
              stackIn_219_2 = stackOut_216_2;
              break L45;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_219_0, stackIn_219_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0, Terraphoenix param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        th var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dl var7_ref_dl = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_27_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        boolean stackIn_97_0 = false;
        Object stackIn_114_0 = null;
        Object stackIn_114_1 = null;
        Object stackIn_130_0 = null;
        Object stackIn_130_1 = null;
        r stackIn_149_0 = null;
        r stackIn_221_0 = null;
        boolean stackIn_236_0 = false;
        Object stackIn_254_0 = null;
        r stackIn_254_1 = null;
        Object stackIn_256_0 = null;
        r stackIn_256_1 = null;
        r stackIn_262_0 = null;
        r stackIn_272_0 = null;
        r stackIn_273_0 = null;
        r stackIn_292_0 = null;
        Object stackIn_313_0 = null;
        r stackIn_313_1 = null;
        Object stackIn_332_0 = null;
        r stackIn_332_1 = null;
        Object stackIn_333_0 = null;
        r stackIn_333_1 = null;
        r stackIn_349_0 = null;
        r stackIn_390_0 = null;
        Object stackIn_439_0 = null;
        r stackIn_439_1 = null;
        Object stackIn_494_0 = null;
        r stackIn_494_1 = null;
        int stackIn_568_0 = 0;
        Object stackIn_574_0 = null;
        Object stackIn_574_1 = null;
        Object stackIn_576_0 = null;
        r stackIn_576_1 = null;
        int stackIn_598_0 = 0;
        int stackIn_611_0 = 0;
        int stackIn_681_0 = 0;
        r stackIn_686_0 = null;
        Object stackIn_763_0 = null;
        r stackIn_763_1 = null;
        Object stackIn_797_0 = null;
        r stackIn_797_1 = null;
        Object stackIn_831_0 = null;
        Object stackIn_831_1 = null;
        Object stackIn_850_0 = null;
        Object stackIn_850_1 = null;
        Object stackIn_864_0 = null;
        Object stackIn_864_1 = null;
        Object stackIn_865_0 = null;
        r stackIn_865_1 = null;
        r stackIn_884_0 = null;
        r stackIn_909_0 = null;
        RuntimeException stackIn_927_0 = null;
        StringBuilder stackIn_927_1 = null;
        RuntimeException stackIn_929_0 = null;
        StringBuilder stackIn_929_1 = null;
        RuntimeException stackIn_930_0 = null;
        StringBuilder stackIn_930_1 = null;
        String stackIn_930_2 = null;
        Throwable caughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        boolean stackOut_96_0 = false;
        Object stackOut_113_0 = null;
        Object stackOut_113_1 = null;
        Object stackOut_129_0 = null;
        Object stackOut_129_1 = null;
        r stackOut_148_0 = null;
        r stackOut_220_0 = null;
        boolean stackOut_235_0 = false;
        Object stackOut_253_0 = null;
        r stackOut_253_1 = null;
        Object stackOut_254_0 = null;
        r stackOut_254_1 = null;
        r stackOut_260_0 = null;
        r stackOut_271_0 = null;
        r stackOut_272_0 = null;
        r stackOut_291_0 = null;
        Object stackOut_312_0 = null;
        r stackOut_312_1 = null;
        Object stackOut_331_0 = null;
        r stackOut_331_1 = null;
        Object stackOut_332_0 = null;
        r stackOut_332_1 = null;
        r stackOut_348_0 = null;
        r stackOut_389_0 = null;
        Object stackOut_438_0 = null;
        r stackOut_438_1 = null;
        Object stackOut_493_0 = null;
        r stackOut_493_1 = null;
        int stackOut_567_0 = 0;
        Object stackOut_573_0 = null;
        Object stackOut_573_1 = null;
        Object stackOut_574_0 = null;
        r stackOut_574_1 = null;
        int stackOut_595_0 = 0;
        int stackOut_597_0 = 0;
        int stackOut_608_0 = 0;
        int stackOut_610_0 = 0;
        int stackOut_678_0 = 0;
        int stackOut_680_0 = 0;
        r stackOut_685_0 = null;
        Object stackOut_762_0 = null;
        r stackOut_762_1 = null;
        Object stackOut_796_0 = null;
        r stackOut_796_1 = null;
        Object stackOut_830_0 = null;
        Object stackOut_830_1 = null;
        Object stackOut_849_0 = null;
        Object stackOut_849_1 = null;
        Object stackOut_862_0 = null;
        Object stackOut_862_1 = null;
        Object stackOut_864_0 = null;
        r stackOut_864_1 = null;
        r stackOut_883_0 = null;
        r stackOut_907_0 = null;
        RuntimeException stackOut_926_0 = null;
        StringBuilder stackOut_926_1 = null;
        RuntimeException stackOut_927_0 = null;
        StringBuilder stackOut_927_1 = null;
        String stackOut_927_2 = null;
        RuntimeException stackOut_929_0 = null;
        StringBuilder stackOut_929_1 = null;
        String stackOut_929_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (null != le.field_q) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    le.field_q.a(false);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    hl.field_a = false;
                    if (!((e) this).field_u) {
                        statePc = 8;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (1 == ((e) this).field_N) {
                        statePc = 11;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((e) this).field_u = true;
                    var3_int = 0;
                    var4_int = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (~var4_int <= ~ak.field_q) {
                        statePc = 109;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var12 != 0) {
                        statePc = 110;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null == ((e) this).field_C[var4_int]) {
                        statePc = 108;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (((e) this).field_C[var4_int].field_c != null) {
                        statePc = 108;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var3_int >= 1) {
                        statePc = 106;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var3_int++;
                    var5 = 0;
                    var6 = 1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var10 = 1;
                    var8 = (int)((double)(-var6) + (double)var6 * Math.random() * 2.0) - -uf.field_c;
                    if (1 > var8) {
                        statePc = 26;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = 1;
                    stackIn_27_0 = stackOut_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var8 = stackIn_27_0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var9 = (int)((double)(-var6) + 2.0 * (Math.random() * (double)var6)) - -vf.field_a;
                    if (var9 >= 1) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var9 = 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (-2 + ((e) this).field_h.field_b < var8) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var8 = -2 + ((e) this).field_h.field_b;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (((e) this).field_h.field_e - 2 >= var9) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var9 = ((e) this).field_h.field_e - 2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    ((e) this).field_C[var4_int].field_F = var8;
                    var5++;
                    ((e) this).field_C[var4_int].field_H = var9;
                    var7_ref_dl = ((e) this).field_h.a(109, ((e) this).field_C[var4_int].field_H, 0, ((e) this).field_C[var4_int].field_F);
                    if (var5 <= 10) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5 = 0;
                    var6++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (2 != ((e) this).field_h.field_a) {
                        statePc = 68;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((e) this).field_C[var4_int].a(true, ((e) this).field_h.field_b / 2, ((e) this).field_h.field_e / 2);
                    ((e) this).field_C[var4_int].field_U = ((e) this).field_C[var4_int].field_U + 4;
                    if (8 <= ((e) this).field_C[var4_int].field_U) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((e) this).field_C[var4_int].field_U = ((e) this).field_C[var4_int].field_U - 8;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11 = ((e) this).field_h.field_b / 4;
                    if (param1.field_Bb == 11) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var11 = ((e) this).field_h.field_b / 8 - -1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var8 < -var11 + ((e) this).field_h.field_b / 2) {
                        statePc = 59;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (~var8 < ~(var11 + ((e) this).field_h.field_b / 2)) {
                        statePc = 59;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (((e) this).field_h.field_e / 2 + -var11 > var9) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (~(((e) this).field_h.field_e / 2 - -var11) <= ~var9) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var10 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var9 >= ((e) this).field_h.field_e / 2 + -var11 + 3) {
                        statePc = 68;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (((e) this).field_h.field_b / 2 - 1 > var8) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (~var8 < ~(((e) this).field_h.field_b / 2 - -1)) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var10 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (((e) this).field_h.field_a == 3) {
                        statePc = 71;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 71: {
                    ((e) this).field_C[var4_int].a(true, ((e) this).field_h.field_b / 2, ((e) this).field_h.field_e / 2);
                    if (~var8 >= ~(((e) this).field_h.field_b / 8)) {
                        statePc = 82;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (~(((e) this).field_h.field_b * 7 / 8) >= ~var8) {
                        statePc = 82;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (((e) this).field_h.field_e / 8 >= var9) {
                        statePc = 82;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (~(((e) this).field_h.field_e * 7 / 8) >= ~var9) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var10 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (((e) this).field_h.field_a == 4) {
                        statePc = 88;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (1 == ((e) this).field_h.field_a) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    ((e) this).field_C[var4_int].a(true, ((e) this).field_h.field_b / 2, ((e) this).field_h.field_e / 2);
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (((e) this).field_h.field_f[((e) this).field_C[var4_int].field_F][((e) this).field_C[var4_int].field_H].field_v < 3) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var10 = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = 0;
                    stackIn_94_0 = stackOut_91_0;
                    stackIn_92_0 = stackOut_91_0;
                    if (var10 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = stackIn_92_0;
                    stackOut_92_1 = 1;
                    stackIn_95_0 = stackOut_92_0;
                    stackIn_95_1 = stackOut_92_1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 94: {
                    stackOut_94_0 = stackIn_94_0;
                    stackOut_94_1 = 0;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 != stackIn_95_1) {
                        statePc = 24;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackOut_96_0 = ((e) this).field_h.a(((e) this).field_C[var4_int].field_F, false, 0, ((e) this).field_C[var4_int].field_H);
                    stackIn_27_0 = stackOut_96_0 ? 1 : 0;
                    stackIn_97_0 = stackOut_96_0;
                    if (var12 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0) {
                        statePc = 24;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var7_ref_dl.field_d) {
                        statePc = 24;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    ((e) this).field_h.field_f[((e) this).field_C[var4_int].field_F][((e) this).field_C[var4_int].field_H].field_h = ((e) this).field_C[var4_int];
                    ((e) this).field_C[var4_int].field_c = ((e) this).field_h.field_f[((e) this).field_C[var4_int].field_F][((e) this).field_C[var4_int].field_H];
                    ((e) this).field_q = ((e) this).field_C[var4_int];
                    lg.field_c = 16 * (((e) this).field_q.field_F - -((e) this).field_q.field_H);
                    eg.field_p = ((e) this).field_q.field_E;
                    sj.field_b = (-((e) this).field_q.field_H + ((e) this).field_q.field_F) * 32;
                    if (null == ((e) this).field_C[var4_int].field_nb) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    qd.a((byte) 114, od.field_c[((e) this).field_C[var4_int].field_nb.field_g].field_n);
                    if (var12 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    qd.a((byte) 127, od.field_c[((e) this).field_C[var4_int].field_eb.field_g].field_n);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    ((e) this).a(-1);
                    if (var12 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    ((e) this).field_u = false;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    var4_int++;
                    if (var12 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    ((e) this).field_u = false;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    return;
                }
                case 111: {
                    var3_int = 1;
                    var4_int = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var4_int >= 12) {
                        statePc = 125;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = null;
                    stackOut_113_1 = this;
                    stackIn_130_0 = stackOut_113_0;
                    stackIn_130_1 = stackOut_113_1;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    if (var12 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (stackIn_114_0 == (Object) (Object) ((e) this).field_C[var4_int]) {
                        statePc = 124;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (((e) this).field_C[var4_int].field_P <= 0) {
                        statePc = 124;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (((e) this).field_C[var4_int].field_Z == null) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var3_int = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var4_int++;
                    if (var12 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var3_int != 0) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    ((e) this).a(29518, 2);
                    ((e) this).a(-1, rf.field_s, -41);
                    ((e) this).field_b = true;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    stackOut_129_0 = null;
                    stackOut_129_1 = this;
                    stackIn_130_0 = stackOut_129_0;
                    stackIn_130_1 = stackOut_129_1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (stackIn_130_0 == (Object) (Object) ((e) this).field_n) {
                        statePc = 139;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (!((e) this).field_n.field_h) {
                        statePc = 139;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (((e) this).field_n.field_d > 0) {
                        statePc = 139;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    ((e) this).field_n = ((e) this).field_n.field_f;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var4 = ((e) this).field_n;
                    if (var4 != null) {
                        statePc = 234;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (((e) this).field_b) {
                        statePc = 145;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (!((e) this).field_v) {
                        statePc = 180;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var5 = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (~var5 <= ~((e) this).field_C.length) {
                        statePc = 180;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    stackOut_148_0 = ((e) this).field_C[var5];
                    stackIn_221_0 = stackOut_148_0;
                    stackIn_149_0 = stackOut_148_0;
                    if (var12 != 0) {
                        statePc = 221;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (stackIn_149_0 == null) {
                        statePc = 163;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (((e) this).field_C[var5].field_Z == null) {
                        statePc = 157;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (0 < ((e) this).field_C[var5].field_P) {
                        statePc = 161;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    ((e) this).field_C[var5].field_nb = null;
                    ((e) this).field_C[var5].field_b = null;
                    if (var12 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    ((e) this).field_C[var5] = null;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (((e) this).field_C[var5] == null) {
                        statePc = 179;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (null != ((e) this).field_C[var5].field_Z) {
                        statePc = 169;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (((e) this).field_C[var5].field_P > 0) {
                        statePc = 179;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (((e) this).field_C[var5].field_P + ((e) this).field_C[var5].field_T <= 0) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    ((e) this).field_e.field_f = ((e) this).field_e.field_f + 1;
                    if (var12 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    ((e) this).field_e.field_k = ((e) this).field_e.field_k + 1;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    ((e) this).field_C[var5] = null;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (!((e) this).field_r) {
                        statePc = 232;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var5 = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (~var5 <= ~((e) this).field_C.length) {
                        statePc = 232;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var12 != 0) {
                        statePc = 233;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (null == ((e) this).field_C[var5]) {
                        statePc = 220;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (((e) this).field_C[var5].field_c.field_d) {
                        statePc = 192;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (((e) this).field_C[var5].field_Z != null) {
                        statePc = 211;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (((e) this).field_C[var5].field_P <= 0) {
                        statePc = 198;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (((e) this).field_C[var5].field_t != 4) {
                        statePc = 201;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (((e) this).field_C[var5].field_t == 9) {
                        statePc = 205;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    ((e) this).field_e.field_j = ((e) this).field_e.field_j + 1;
                    if (var12 == 0) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    ((e) this).field_e.field_m = ((e) this).field_e.field_m + 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (((e) this).field_C[var5].field_t == 4) {
                        statePc = 210;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 210: {
                    ((e) this).field_e.field_b = ((e) this).field_e.field_b + 1;
                    if (var12 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (((e) this).field_C[var5].field_T + ((e) this).field_C[var5].field_P > 0) {
                        statePc = 217;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    ((e) this).field_e.field_k = ((e) this).field_e.field_k + 1;
                    if (var12 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    ((e) this).field_e.field_h = ((e) this).field_e.field_h + 1;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    ((e) this).field_C[var5] = null;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    stackOut_220_0 = ((e) this).field_C[var5];
                    stackIn_221_0 = stackOut_220_0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (stackIn_221_0 == null) {
                        statePc = 231;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (((e) this).field_C[var5].field_Z != null) {
                        statePc = 231;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (((e) this).field_C[var5].field_P > 0) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    ((e) this).field_C[var5] = null;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    ((e) this).a(41, param1);
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    return;
                }
                case 234: {
                    if (null == var4) {
                        statePc = 567;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    stackOut_235_0 = ((e) this).field_b;
                    stackIn_568_0 = stackOut_235_0 ? 1 : 0;
                    stackIn_236_0 = stackOut_235_0;
                    if (var12 != 0) {
                        statePc = 568;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (stackIn_236_0) {
                        statePc = 240;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var4.field_h = true;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (param1.field_Bb > 0) {
                        statePc = 245;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (var4.field_a != 1) {
                        statePc = 536;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (var4.field_h) {
                        statePc = 536;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (var4.field_a != 0) {
                        statePc = 267;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var5 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (var5 >= 12) {
                        statePc = 267;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    stackOut_253_0 = null;
                    stackOut_253_1 = ((e) this).field_C[var5];
                    stackIn_494_0 = stackOut_253_0;
                    stackIn_494_1 = stackOut_253_1;
                    stackIn_254_0 = stackOut_253_0;
                    stackIn_254_1 = stackOut_253_1;
                    if (var12 != 0) {
                        statePc = 494;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    stackOut_254_0 = stackIn_254_0;
                    stackOut_254_1 = (r) (Object) stackIn_254_1;
                    stackIn_256_0 = stackOut_254_0;
                    stackIn_256_1 = stackOut_254_1;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (stackIn_256_0 == (Object) (Object) stackIn_256_1) {
                        statePc = 266;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (null == ((e) this).field_C[var5].field_Z) {
                        statePc = 266;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    stackOut_260_0 = ((e) this).field_C[var5];
                    stackIn_262_0 = stackOut_260_0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (stackIn_262_0.field_c.field_C.field_v != -1) {
                        statePc = 265;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 265: {
                    ((e) this).a(29518, 0);
                    var5 = 12;
                    ((e) this).a(1, pl.field_G, -84);
                    if (var12 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (var4.field_a == 1) {
                        statePc = 269;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var3_int = 1;
                    var5 = 0;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if (~var5 <= ~((e) this).field_C.length) {
                        statePc = 282;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    stackOut_271_0 = ((e) this).field_C[var5];
                    stackIn_272_0 = stackOut_271_0;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    stackOut_272_0 = (r) (Object) stackIn_272_0;
                    stackIn_262_0 = stackOut_272_0;
                    stackIn_273_0 = stackOut_272_0;
                    if (var12 != 0) {
                        statePc = 262;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (stackIn_273_0 == null) {
                        statePc = 281;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (((e) this).field_C[var5].field_P <= 0) {
                        statePc = 281;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (((e) this).field_C[var5].field_C != 1) {
                        statePc = 281;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var3_int = 0;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 270;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (var3_int != 0) {
                        statePc = 285;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 285: {
                    ((e) this).a(29518, 1);
                    ((e) this).field_b = true;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (var4.field_a == 2) {
                        statePc = 289;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var3_int = 1;
                    var5 = 0;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    if (var5 >= 12) {
                        statePc = 303;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = ((e) this).field_C[var5];
                    stackIn_272_0 = stackOut_291_0;
                    stackIn_292_0 = stackOut_291_0;
                    if (var12 != 0) {
                        statePc = 272;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (stackIn_292_0 == null) {
                        statePc = 302;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (((e) this).field_C[var5].field_P <= 0) {
                        statePc = 302;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (((e) this).field_C[var5].field_Z != null) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var3_int = 0;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 290;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (var3_int != 0) {
                        statePc = 306;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 306: {
                    ((e) this).a(29518, 2);
                    ((e) this).a(-1, rf.field_s, -8);
                    ((e) this).field_b = true;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    if (var4.field_a == 3) {
                        statePc = 310;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var5 = 0;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if (var5 >= ((e) this).field_C.length) {
                        statePc = 328;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    stackOut_312_0 = null;
                    stackOut_312_1 = ((e) this).field_C[var5];
                    stackIn_332_0 = stackOut_312_0;
                    stackIn_332_1 = stackOut_312_1;
                    stackIn_313_0 = stackOut_312_0;
                    stackIn_313_1 = stackOut_312_1;
                    if (var12 != 0) {
                        statePc = 332;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (stackIn_313_0 == (Object) (Object) stackIn_313_1) {
                        statePc = 327;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (6 != ((e) this).field_C[var5].field_t) {
                        statePc = 327;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (((e) this).field_C[var5].field_k) {
                        statePc = 325;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (((e) this).field_C[var5].field_P > 0) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    ((e) this).a(param0 ^ -29519, 3);
                    ((e) this).a(9, ki.field_Z, -7);
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (var4.field_a != 9) {
                        statePc = 344;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var5 = 0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (((e) this).field_C.length <= var5) {
                        statePc = 344;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    stackOut_331_0 = null;
                    stackOut_331_1 = ((e) this).field_C[var5];
                    stackIn_332_0 = stackOut_331_0;
                    stackIn_332_1 = stackOut_331_1;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    stackOut_332_0 = stackIn_332_0;
                    stackOut_332_1 = (r) (Object) stackIn_332_1;
                    stackIn_313_0 = stackOut_332_0;
                    stackIn_313_1 = stackOut_332_1;
                    stackIn_333_0 = stackOut_332_0;
                    stackIn_333_1 = stackOut_332_1;
                    if (var12 != 0) {
                        statePc = 313;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (stackIn_333_0 == (Object) (Object) stackIn_333_1) {
                        statePc = 343;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (!((e) this).field_C[var5].field_s) {
                        statePc = 343;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (null != ((e) this).field_C[var5].field_Z) {
                        statePc = 342;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 342: {
                    ((e) this).a(29518, 9);
                    ((e) this).a(4, ch.field_h, -110);
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 330;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    if (var4.field_a == 4) {
                        statePc = 346;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 346: {
                    var3_int = 1;
                    var5 = 0;
                    var6 = 0;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    if (var6 >= 12) {
                        statePc = 379;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    stackOut_348_0 = ((e) this).field_C[var6];
                    stackIn_686_0 = stackOut_348_0;
                    stackIn_349_0 = stackOut_348_0;
                    if (var12 != 0) {
                        statePc = 686;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (stackIn_349_0 == null) {
                        statePc = 365;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    if (((e) this).field_C[var6].field_P <= 0) {
                        statePc = 365;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (!((e) this).field_C[var6].field_s) {
                        statePc = 365;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (((e) this).field_C[var6].field_Z == null) {
                        statePc = 365;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    if (((e) this).field_C[var6].field_c.field_d) {
                        statePc = 365;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    var5 = 1;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    if (null == ((e) this).field_C[var6]) {
                        statePc = 378;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    if (((e) this).field_C[var6].field_P <= 0) {
                        statePc = 378;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (null == ((e) this).field_C[var6].field_Z) {
                        statePc = 378;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    if (((e) this).field_C[var6].field_c.field_d) {
                        statePc = 377;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 377: {
                    var3_int = 0;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 347;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    ((e) this).field_h.field_m = 1;
                    if (var3_int == 0) {
                        statePc = 386;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if (var5 != 0) {
                        statePc = 385;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 385: {
                    ((e) this).a(29518, 4);
                    ((e) this).field_b = true;
                    ((e) this).field_v = true;
                    statePc = 386;
                    continue stateLoop;
                }
                case 386: {
                    if (var4.field_a != 5) {
                        statePc = 433;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    var3_int = 1;
                    var5 = 0;
                    var6 = 0;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    if (var6 >= 12) {
                        statePc = 426;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    stackOut_389_0 = ((e) this).field_C[var6];
                    stackIn_686_0 = stackOut_389_0;
                    stackIn_390_0 = stackOut_389_0;
                    if (var12 != 0) {
                        statePc = 686;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    if (stackIn_390_0 == null) {
                        statePc = 408;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if (((e) this).field_C[var6].field_P <= 0) {
                        statePc = 408;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (null == ((e) this).field_C[var6].field_Z) {
                        statePc = 408;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    if (Math.abs(-(((e) this).field_h.field_b / 2) + ((e) this).field_C[var6].field_F) >= ((e) this).field_h.field_b / 2 + -5) {
                        statePc = 408;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    if (~Math.abs(-(((e) this).field_h.field_e / 2) + ((e) this).field_C[var6].field_H) > ~(((e) this).field_h.field_e / 2 + -5)) {
                        statePc = 407;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 407: {
                    var3_int = 0;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    if (((e) this).field_C[var6] == null) {
                        statePc = 425;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    if (((e) this).field_C[var6].field_P <= 0) {
                        statePc = 425;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (!((e) this).field_C[var6].field_s) {
                        statePc = 425;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    if (((e) this).field_C[var6].field_Z == null) {
                        statePc = 425;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    if (Math.abs(((e) this).field_C[var6].field_F + -(((e) this).field_h.field_b / 2)) >= -5 + ((e) this).field_h.field_b / 2) {
                        statePc = 424;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    if (Math.abs(-(((e) this).field_h.field_e / 2) + ((e) this).field_C[var6].field_H) < -5 + ((e) this).field_h.field_e / 2) {
                        statePc = 425;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    var5 = 1;
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 388;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    ((e) this).field_h.field_m = 2;
                    if (var3_int == 0) {
                        statePc = 433;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    if (var5 != 0) {
                        statePc = 432;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 432: {
                    ((e) this).a(29518, 5);
                    ((e) this).field_v = true;
                    ((e) this).field_b = true;
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    if (6 == var4.field_a) {
                        statePc = 436;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 436: {
                    var3_int = 1;
                    var5 = 0;
                    var6 = 0;
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    if (12 <= var6) {
                        statePc = 481;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    stackOut_438_0 = null;
                    stackOut_438_1 = ((e) this).field_C[var6];
                    stackIn_576_0 = stackOut_438_0;
                    stackIn_576_1 = stackOut_438_1;
                    stackIn_439_0 = stackOut_438_0;
                    stackIn_439_1 = stackOut_438_1;
                    if (var12 != 0) {
                        statePc = 576;
                    } else {
                        statePc = 439;
                    }
                    continue stateLoop;
                }
                case 439: {
                    if (stackIn_439_0 == (Object) (Object) stackIn_439_1) {
                        statePc = 463;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    if (((e) this).field_C[var6].field_P <= 0) {
                        statePc = 463;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 445: {
                    if (((e) this).field_C[var6].field_Z == null) {
                        statePc = 463;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (1 != ((e) this).field_C[var6].field_E) {
                        statePc = 463;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    if (((e) this).field_C[var6].field_F > 12) {
                        statePc = 463;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    if (((e) this).field_C[var6].field_H > 12) {
                        statePc = 463;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    if (((e) this).field_C[var6].field_s) {
                        statePc = 462;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 462: {
                    var5 = 1;
                    statePc = 463;
                    continue stateLoop;
                }
                case 463: {
                    if (((e) this).field_C[var6] == null) {
                        statePc = 480;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    if (((e) this).field_C[var6].field_P <= 0) {
                        statePc = 480;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    if (null == ((e) this).field_C[var6].field_Z) {
                        statePc = 480;
                    } else {
                        statePc = 470;
                    }
                    continue stateLoop;
                }
                case 470: {
                    if (((e) this).field_C[var6].field_E != 1) {
                        statePc = 479;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    if (((e) this).field_C[var6].field_F > 12) {
                        statePc = 479;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 476: {
                    if (((e) this).field_C[var6].field_H <= 12) {
                        statePc = 480;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    var3_int = 0;
                    statePc = 480;
                    continue stateLoop;
                }
                case 480: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    ((e) this).field_h.field_m = 3;
                    if (var3_int == 0) {
                        statePc = 488;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 482: {
                    if (var5 != 0) {
                        statePc = 487;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 487: {
                    ((e) this).a(param0 ^ -29519, 6);
                    ((e) this).field_v = true;
                    ((e) this).field_b = true;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    if (var4.field_a == 7) {
                        statePc = 491;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 491: {
                    ((e) this).field_h.field_m = 4;
                    var5 = 0;
                    statePc = 492;
                    continue stateLoop;
                }
                case 492: {
                    if (var5 >= 12) {
                        statePc = 510;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    stackOut_493_0 = null;
                    stackOut_493_1 = ((e) this).field_C[var5];
                    stackIn_332_0 = stackOut_493_0;
                    stackIn_332_1 = stackOut_493_1;
                    stackIn_494_0 = stackOut_493_0;
                    stackIn_494_1 = stackOut_493_1;
                    if (var12 != 0) {
                        statePc = 332;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    if (stackIn_494_0 == (Object) (Object) stackIn_494_1) {
                        statePc = 509;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    if (((e) this).field_C[var5].field_P <= 0) {
                        statePc = 509;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    if (!((e) this).field_C[var5].field_s) {
                        statePc = 509;
                    } else {
                        statePc = 501;
                    }
                    continue stateLoop;
                }
                case 501: {
                    if (null == ((e) this).field_C[var5].field_Z) {
                        statePc = 509;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 504: {
                    if (((e) this).field_C[var5].field_E != 2) {
                        statePc = 509;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    ((e) this).a(29518, 7);
                    dd.field_M = 8;
                    ((e) this).a(4, va.field_j, param0 + -13);
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 492;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    if (var4.field_a == 8) {
                        statePc = 513;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (3 != ((e) this).field_z) {
                        statePc = 519;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    if (var4.field_b == vk.field_a) {
                        statePc = 519;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 517: {
                    var4.field_b = vk.field_a;
                    var4.field_d = 0;
                    statePc = 519;
                    continue stateLoop;
                }
                case 519: {
                    if (2 != ((e) this).field_z) {
                        statePc = 526;
                    } else {
                        statePc = 520;
                    }
                    continue stateLoop;
                }
                case 520: {
                    if (fc.field_h != var4.field_b) {
                        statePc = 525;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 525: {
                    var4.field_b = fc.field_h;
                    var4.field_d = 0;
                    statePc = 526;
                    continue stateLoop;
                }
                case 526: {
                    if (((e) this).field_z != 1) {
                        statePc = 532;
                    } else {
                        statePc = 527;
                    }
                    continue stateLoop;
                }
                case 527: {
                    if (var4.field_b == jm.field_a) {
                        statePc = 532;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 530: {
                    var4.field_d = 0;
                    var4.field_b = jm.field_a;
                    statePc = 532;
                    continue stateLoop;
                }
                case 532: {
                    if (((e) this).field_z == 0) {
                        statePc = 535;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 535: {
                    ((e) this).a(29518, 8);
                    ((e) this).a(-1, rf.field_s, -104);
                    ((e) this).field_b = true;
                    ((e) this).field_r = true;
                    statePc = 536;
                    continue stateLoop;
                }
                case 536: {
                    if (null == var4.field_f) {
                        statePc = 545;
                    } else {
                        statePc = 537;
                    }
                    continue stateLoop;
                }
                case 537: {
                    if (!var4.field_f.field_h) {
                        statePc = 545;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    if (var4.field_f.field_d > 0) {
                        statePc = 545;
                    } else {
                        statePc = 543;
                    }
                    continue stateLoop;
                }
                case 543: {
                    var4.field_f = var4.field_f.field_f;
                    statePc = 545;
                    continue stateLoop;
                }
                case 545: {
                    if (var4.field_h) {
                        statePc = 558;
                    } else {
                        statePc = 546;
                    }
                    continue stateLoop;
                }
                case 546: {
                    if (var4.field_d >= 250) {
                        statePc = 552;
                    } else {
                        statePc = 549;
                    }
                    continue stateLoop;
                }
                case 549: {
                    var4.field_d = var4.field_d + 1;
                    if (var12 == 0) {
                        statePc = 563;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    if (le.field_q == null) {
                        statePc = 563;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 555: {
                    var4.field_d = 0;
                    if (var12 == 0) {
                        statePc = 563;
                    } else {
                        statePc = 558;
                    }
                    continue stateLoop;
                }
                case 558: {
                    if (var4.field_d <= 0) {
                        statePc = 563;
                    } else {
                        statePc = 561;
                    }
                    continue stateLoop;
                }
                case 561: {
                    var4.field_d = var4.field_d - 1;
                    statePc = 563;
                    continue stateLoop;
                }
                case 563: {
                    if (null != var4) {
                        statePc = 566;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 566: {
                    var4 = var4.field_f;
                    if (var12 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 567: {
                    stackOut_567_0 = ja.field_n;
                    stackIn_568_0 = stackOut_567_0;
                    statePc = 568;
                    continue stateLoop;
                }
                case 568: {
                    if (stackIn_568_0 <= 0) {
                        statePc = 571;
                    } else {
                        statePc = 569;
                    }
                    continue stateLoop;
                }
                case 569: {
                    ja.field_n = ja.field_n - 1;
                    statePc = 571;
                    continue stateLoop;
                }
                case 571: {
                    var6 = 0;
                    var5 = 0;
                    statePc = 572;
                    continue stateLoop;
                }
                case 572: {
                    if (~var5 <= ~((e) this).field_C.length) {
                        statePc = 830;
                    } else {
                        statePc = 573;
                    }
                    continue stateLoop;
                }
                case 573: {
                    stackOut_573_0 = null;
                    stackOut_573_1 = this;
                    stackIn_831_0 = stackOut_573_0;
                    stackIn_831_1 = stackOut_573_1;
                    stackIn_574_0 = stackOut_573_0;
                    stackIn_574_1 = stackOut_573_1;
                    if (var12 != 0) {
                        statePc = 831;
                    } else {
                        statePc = 574;
                    }
                    continue stateLoop;
                }
                case 574: {
                    stackOut_574_0 = stackIn_574_0;
                    stackOut_574_1 = ((e) this).field_C[var5];
                    stackIn_576_0 = stackOut_574_0;
                    stackIn_576_1 = stackOut_574_1;
                    statePc = 576;
                    continue stateLoop;
                }
                case 576: {
                    if (stackIn_576_0 == (Object) (Object) stackIn_576_1) {
                        statePc = 829;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 577: {
                    if (0 >= ((e) this).field_C[var5].field_cb) {
                        statePc = 582;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    ((e) this).field_C[var5].field_cb = ((e) this).field_C[var5].field_cb - 8;
                    statePc = 582;
                    continue stateLoop;
                }
                case 582: {
                    if (((e) this).field_C[var5].field_ib) {
                        statePc = 668;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 583: {
                    if (((e) this).field_C[var5].field_Z != null) {
                        statePc = 645;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 586: {
                    if (((e) this).field_C[var5].field_t == 7) {
                        statePc = 668;
                    } else {
                        statePc = 589;
                    }
                    continue stateLoop;
                }
                case 589: {
                    if (!((e) this).field_J) {
                        statePc = 618;
                    } else {
                        statePc = 592;
                    }
                    continue stateLoop;
                }
                case 592: {
                    if (((e) this).field_C[var5].field_k) {
                        statePc = 597;
                    } else {
                        statePc = 595;
                    }
                    continue stateLoop;
                }
                case 595: {
                    stackOut_595_0 = 1;
                    stackIn_598_0 = stackOut_595_0;
                    statePc = 598;
                    continue stateLoop;
                }
                case 597: {
                    stackOut_597_0 = 0;
                    stackIn_598_0 = stackOut_597_0;
                    statePc = 598;
                    continue stateLoop;
                }
                case 598: {
                    if (stackIn_598_0 == 1) {
                        statePc = 618;
                    } else {
                        statePc = 599;
                    }
                    continue stateLoop;
                }
                case 599: {
                    if (((e) this).field_q == null) {
                        statePc = 618;
                    } else {
                        statePc = 602;
                    }
                    continue stateLoop;
                }
                case 602: {
                    if (((e) this).field_q.field_B == 1) {
                        statePc = 612;
                    } else {
                        statePc = 605;
                    }
                    continue stateLoop;
                }
                case 605: {
                    if (((e) this).field_q.field_S) {
                        statePc = 610;
                    } else {
                        statePc = 608;
                    }
                    continue stateLoop;
                }
                case 608: {
                    stackOut_608_0 = 1;
                    stackIn_611_0 = stackOut_608_0;
                    statePc = 611;
                    continue stateLoop;
                }
                case 610: {
                    stackOut_610_0 = 0;
                    stackIn_611_0 = stackOut_610_0;
                    statePc = 611;
                    continue stateLoop;
                }
                case 611: {
                    if (stackIn_611_0 == 0) {
                        statePc = 618;
                    } else {
                        statePc = 612;
                    }
                    continue stateLoop;
                }
                case 612: {
                    if (((e) this).field_C[var5].field_P <= 0) {
                        statePc = 618;
                    } else {
                        statePc = 615;
                    }
                    continue stateLoop;
                }
                case 615: {
                    if (((e) this).field_h.a((byte) -93, ((e) this).field_q, ((e) this).field_C[var5])) {
                        statePc = 621;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 618: {
                    ((e) this).field_C[var5].field_p = 0;
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 621;
                    }
                    continue stateLoop;
                }
                case 621: {
                    if (!((e) this).field_J) {
                        statePc = 638;
                    } else {
                        statePc = 624;
                    }
                    continue stateLoop;
                }
                case 624: {
                    if (((e) this).field_q == null) {
                        statePc = 638;
                    } else {
                        statePc = 627;
                    }
                    continue stateLoop;
                }
                case 627: {
                    if (((e) this).field_q.field_d == 0) {
                        statePc = 633;
                    } else {
                        statePc = 630;
                    }
                    continue stateLoop;
                }
                case 630: {
                    if (1 != ((e) this).field_q.field_d) {
                        statePc = 638;
                    } else {
                        statePc = 633;
                    }
                    continue stateLoop;
                }
                case 633: {
                    if (((e) this).field_q.field_B == 0) {
                        statePc = 638;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    ((e) this).field_q.field_X = ((e) this).field_q.field_F;
                    ((e) this).field_q.field_n = ((e) this).field_q.field_H;
                    ((e) this).field_q.field_r = null;
                    statePc = 638;
                    continue stateLoop;
                }
                case 638: {
                    if (!((e) this).field_C[var5].field_l) {
                        statePc = 641;
                    } else {
                        statePc = 644;
                    }
                    continue stateLoop;
                }
                case 641: {
                    ((e) this).field_C[var5].field_l = true;
                    ((e) this).field_a = ((e) this).field_C[var5].field_F;
                    ((e) this).field_x = ((e) this).field_C[var5].field_H;
                    ((e) this).field_k = lg.field_c;
                    ((e) this).field_c = sj.field_b;
                    ((e) this).field_E = eg.field_p;
                    eg.field_p = ((e) this).field_C[var5].field_E;
                    ((e) this).field_K = ib.field_X;
                    if (((e) this).field_C[var5].field_t < 1) {
                        statePc = 644;
                    } else {
                        statePc = 642;
                    }
                    continue stateLoop;
                }
                case 642: {
                    ((e) this).field_K = p.field_d;
                    statePc = 644;
                    continue stateLoop;
                }
                case 644: {
                    ((e) this).field_C[var5].field_ib = true;
                    qd.a((byte) 26, 3);
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 645: {
                    if (0 < ((e) this).field_C[var5].field_P) {
                        statePc = 660;
                    } else {
                        statePc = 648;
                    }
                    continue stateLoop;
                }
                case 648: {
                    if (null != ((e) this).field_K) {
                        statePc = 660;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 651: {
                    param1.field_Y = false;
                    ((e) this).field_C[var5].field_p = ((e) this).field_C[var5].field_p + 1;
                    if (((e) this).field_C[var5].field_p > 25) {
                        statePc = 656;
                    } else {
                        statePc = 668;
                    }
                    continue stateLoop;
                }
                case 656: {
                    ((e) this).field_a = ((e) this).field_C[var5].field_F;
                    ((e) this).field_x = ((e) this).field_C[var5].field_H;
                    ((e) this).field_c = sj.field_b;
                    ((e) this).field_k = lg.field_c;
                    ((e) this).field_E = eg.field_p;
                    eg.field_p = ((e) this).field_C[var5].field_E;
                    ((e) this).field_K = ((e) this).field_C[var5].field_Z.b(1) + aa.field_r;
                    if (((e) this).field_C[var5].field_T <= 0) {
                        statePc = 659;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 657: {
                    ((e) this).field_K = ((e) this).field_C[var5].field_Z.b(1) + d.field_O;
                    statePc = 659;
                    continue stateLoop;
                }
                case 659: {
                    ((e) this).field_C[var5].field_ib = true;
                    qd.a((byte) 126, 3);
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 660;
                    }
                    continue stateLoop;
                }
                case 660: {
                    if (((e) this).field_C[var5].field_P > 0) {
                        statePc = 666;
                    } else {
                        statePc = 663;
                    }
                    continue stateLoop;
                }
                case 663: {
                    ((e) this).field_C[var5].field_p = 26;
                    if (var12 == 0) {
                        statePc = 668;
                    } else {
                        statePc = 666;
                    }
                    continue stateLoop;
                }
                case 666: {
                    ((e) this).field_C[var5].field_p = 0;
                    statePc = 668;
                    continue stateLoop;
                }
                case 668: {
                    if (7 == ((e) this).field_C[var5].field_t) {
                        statePc = 685;
                    } else {
                        statePc = 669;
                    }
                    continue stateLoop;
                }
                case 669: {
                    if (((e) this).field_C[var5].field_Z == null) {
                        statePc = 674;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 674: {
                    if (((e) this).field_C[var5].field_d != 5) {
                        statePc = 685;
                    } else {
                        statePc = 675;
                    }
                    continue stateLoop;
                }
                case 675: {
                    if (((e) this).field_C[var5].field_S) {
                        statePc = 680;
                    } else {
                        statePc = 678;
                    }
                    continue stateLoop;
                }
                case 678: {
                    stackOut_678_0 = 1;
                    stackIn_681_0 = stackOut_678_0;
                    statePc = 681;
                    continue stateLoop;
                }
                case 680: {
                    stackOut_680_0 = 0;
                    stackIn_681_0 = stackOut_680_0;
                    statePc = 681;
                    continue stateLoop;
                }
                case 681: {
                    if (stackIn_681_0 == 1) {
                        statePc = 684;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 684: {
                    ((e) this).field_C[var5].field_d = 6;
                    statePc = 685;
                    continue stateLoop;
                }
                case 685: {
                    stackOut_685_0 = ((e) this).field_C[var5];
                    stackIn_686_0 = stackOut_685_0;
                    statePc = 686;
                    continue stateLoop;
                }
                case 686: {
                    if (stackIn_686_0.field_P > 0) {
                        statePc = 689;
                    } else {
                        statePc = 829;
                    }
                    continue stateLoop;
                }
                case 689: {
                    if ((1 & ((e) this).field_h.a(112, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_i) <= 0) {
                        statePc = 701;
                    } else {
                        statePc = 690;
                    }
                    continue stateLoop;
                }
                case 690: {
                    if (((e) this).field_h.a(-63, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_g % 4 == 0) {
                        statePc = 695;
                    } else {
                        statePc = 701;
                    }
                    continue stateLoop;
                }
                case 695: {
                    ((e) this).field_C[var5].field_c.field_g = ((e) this).field_C[var5].field_c.field_g + 3;
                    ((e) this).field_C[var5].field_c.a(1, true, -114);
                    if (24 <= ((e) this).field_C[var5].field_c.field_g) {
                        statePc = 699;
                    } else {
                        statePc = 696;
                    }
                    continue stateLoop;
                }
                case 696: {
                    qd.a((byte) 125, 87);
                    if (var12 == 0) {
                        statePc = 701;
                    } else {
                        statePc = 699;
                    }
                    continue stateLoop;
                }
                case 699: {
                    qd.a((byte) 84, 86);
                    statePc = 701;
                    continue stateLoop;
                }
                case 701: {
                    if ((((e) this).field_h.a(param0 + -35, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_i & 2) <= 0) {
                        statePc = 713;
                    } else {
                        statePc = 702;
                    }
                    continue stateLoop;
                }
                case 702: {
                    if (0 != ((e) this).field_h.a(-124, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_k % 4) {
                        statePc = 713;
                    } else {
                        statePc = 705;
                    }
                    continue stateLoop;
                }
                case 705: {
                    ((e) this).field_C[var5].field_c.field_k = ((e) this).field_C[var5].field_c.field_k + 3;
                    ((e) this).field_C[var5].field_c.a(2, true, 81);
                    if (((e) this).field_C[var5].field_c.field_k >= 24) {
                        statePc = 711;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 708: {
                    qd.a((byte) 70, 87);
                    if (var12 == 0) {
                        statePc = 713;
                    } else {
                        statePc = 711;
                    }
                    continue stateLoop;
                }
                case 711: {
                    qd.a((byte) 54, 86);
                    statePc = 713;
                    continue stateLoop;
                }
                case 713: {
                    if ((4 & ((e) this).field_h.a(105, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_i) <= 0) {
                        statePc = 725;
                    } else {
                        statePc = 714;
                    }
                    continue stateLoop;
                }
                case 714: {
                    if (((e) this).field_h.a(127, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F + 1).field_g % 4 == 0) {
                        statePc = 719;
                    } else {
                        statePc = 725;
                    }
                    continue stateLoop;
                }
                case 719: {
                    dl dupTemp$2 = ((e) this).field_h.a(param0 ^ -112, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F - -1);
                    dupTemp$2.field_g = dupTemp$2.field_g + 3;
                    ((e) this).field_h.a(98, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F + 1).a(1, true, -111);
                    if (((e) this).field_h.a(-64, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F + 1).field_g < 24) {
                        statePc = 723;
                    } else {
                        statePc = 720;
                    }
                    continue stateLoop;
                }
                case 720: {
                    qd.a((byte) 101, 86);
                    if (var12 == 0) {
                        statePc = 725;
                    } else {
                        statePc = 723;
                    }
                    continue stateLoop;
                }
                case 723: {
                    qd.a((byte) 82, 87);
                    statePc = 725;
                    continue stateLoop;
                }
                case 725: {
                    if ((((e) this).field_h.a(param0 ^ 72, ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_i & 8) <= 0) {
                        statePc = 737;
                    } else {
                        statePc = 726;
                    }
                    continue stateLoop;
                }
                case 726: {
                    if (((e) this).field_h.a(param0 + -116, 1 + ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_k % 4 == 0) {
                        statePc = 731;
                    } else {
                        statePc = 737;
                    }
                    continue stateLoop;
                }
                case 731: {
                    dl dupTemp$3 = ((e) this).field_h.a(91, ((e) this).field_C[var5].field_H + 1, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F);
                    dupTemp$3.field_k = dupTemp$3.field_k + 3;
                    ((e) this).field_h.a(86, 1 + ((e) this).field_C[var5].field_H, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).a(2, true, -113);
                    if (((e) this).field_h.a(param0 + -78, ((e) this).field_C[var5].field_H - -1, ((e) this).field_C[var5].field_E, ((e) this).field_C[var5].field_F).field_k >= 24) {
                        statePc = 735;
                    } else {
                        statePc = 732;
                    }
                    continue stateLoop;
                }
                case 732: {
                    qd.a((byte) 36, 87);
                    if (var12 == 0) {
                        statePc = 737;
                    } else {
                        statePc = 735;
                    }
                    continue stateLoop;
                }
                case 735: {
                    qd.a((byte) 116, 86);
                    statePc = 737;
                    continue stateLoop;
                }
                case 737: {
                    if (((e) this).field_C[var5].field_C == 1) {
                        statePc = 786;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 738: {
                    if (((e) this).field_C[var5].field_k) {
                        statePc = 743;
                    } else {
                        statePc = 744;
                    }
                    continue stateLoop;
                }
                case 743: {
                    ((e) this).field_C[var5].field_h = true;
                    ((e) this).field_C[var5].field_i = ((e) this).field_C[var5].field_F;
                    ((e) this).field_C[var5].field_gb = ((e) this).field_C[var5].field_H;
                    ((e) this).field_C[var5].field_R = ((e) this).field_C[var5].field_E;
                    ((e) this).field_C[var5].field_k = false;
                    statePc = 744;
                    continue stateLoop;
                }
                case 744: {
                    if (((e) this).field_J) {
                        statePc = 750;
                    } else {
                        statePc = 745;
                    }
                    continue stateLoop;
                }
                case 745: {
                    if (!ok.field_i) {
                        statePc = 750;
                    } else {
                        statePc = 748;
                    }
                    continue stateLoop;
                }
                case 748: {
                    ((e) this).field_C[var5].a((byte) -46, false);
                    statePc = 750;
                    continue stateLoop;
                }
                case 750: {
                    if (!((e) this).field_J) {
                        statePc = 760;
                    } else {
                        statePc = 751;
                    }
                    continue stateLoop;
                }
                case 751: {
                    if (((e) this).field_q != ((e) this).field_C[var5]) {
                        statePc = 760;
                    } else {
                        statePc = 754;
                    }
                    continue stateLoop;
                }
                case 754: {
                    if (ok.field_i) {
                        statePc = 759;
                    } else {
                        statePc = 760;
                    }
                    continue stateLoop;
                }
                case 759: {
                    ((e) this).field_C[var5].a((byte) -51, true);
                    statePc = 760;
                    continue stateLoop;
                }
                case 760: {
                    ((e) this).field_C[var5].field_k = false;
                    var7 = 0;
                    statePc = 761;
                    continue stateLoop;
                }
                case 761: {
                    if (~((e) this).field_C.length >= ~var7) {
                        statePc = 782;
                    } else {
                        statePc = 762;
                    }
                    continue stateLoop;
                }
                case 762: {
                    stackOut_762_0 = null;
                    stackOut_762_1 = ((e) this).field_C[var7];
                    stackIn_865_0 = stackOut_762_0;
                    stackIn_865_1 = stackOut_762_1;
                    stackIn_763_0 = stackOut_762_0;
                    stackIn_763_1 = stackOut_762_1;
                    if (var12 != 0) {
                        statePc = 865;
                    } else {
                        statePc = 763;
                    }
                    continue stateLoop;
                }
                case 763: {
                    if (stackIn_763_0 == (Object) (Object) stackIn_763_1) {
                        statePc = 781;
                    } else {
                        statePc = 766;
                    }
                    continue stateLoop;
                }
                case 766: {
                    if (((e) this).field_C[var7].field_C != 1) {
                        statePc = 781;
                    } else {
                        statePc = 769;
                    }
                    continue stateLoop;
                }
                case 769: {
                    if (((e) this).field_C[var7].field_P <= 0) {
                        statePc = 781;
                    } else {
                        statePc = 772;
                    }
                    continue stateLoop;
                }
                case 772: {
                    if (((e) this).field_h.a((byte) -93, ((e) this).field_C[var7], ((e) this).field_C[var5])) {
                        statePc = 777;
                    } else {
                        statePc = 778;
                    }
                    continue stateLoop;
                }
                case 777: {
                    ((e) this).field_C[var5].field_k = true;
                    ((e) this).field_C[var5].field_h = true;
                    ((e) this).field_C[var5].field_i = ((e) this).field_C[var5].field_F;
                    ((e) this).field_C[var5].field_gb = ((e) this).field_C[var5].field_H;
                    ((e) this).field_C[var5].field_R = ((e) this).field_C[var5].field_E;
                    statePc = 778;
                    continue stateLoop;
                }
                case 778: {
                    if (!((e) this).field_C[var5].field_db) {
                        statePc = 781;
                    } else {
                        statePc = 779;
                    }
                    continue stateLoop;
                }
                case 779: {
                    ((e) this).field_C[var5].field_h = true;
                    ((e) this).field_C[var5].field_i = ((e) this).field_C[var5].field_F;
                    ((e) this).field_C[var5].field_gb = ((e) this).field_C[var5].field_H;
                    ((e) this).field_C[var5].field_R = ((e) this).field_C[var5].field_E;
                    statePc = 781;
                    continue stateLoop;
                }
                case 781: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 761;
                    } else {
                        statePc = 782;
                    }
                    continue stateLoop;
                }
                case 782: {
                    if (((e) this).field_C[var5].field_k) {
                        statePc = 785;
                    } else {
                        statePc = 829;
                    }
                    continue stateLoop;
                }
                case 785: {
                    ((e) this).field_C[var5].field_h = false;
                    if (var12 == 0) {
                        statePc = 829;
                    } else {
                        statePc = 786;
                    }
                    continue stateLoop;
                }
                case 786: {
                    if (((e) this).field_C[var5].field_k) {
                        statePc = 792;
                    } else {
                        statePc = 789;
                    }
                    continue stateLoop;
                }
                case 789: {
                    if (((e) this).field_C[var5].field_t != 6) {
                        statePc = 794;
                    } else {
                        statePc = 792;
                    }
                    continue stateLoop;
                }
                case 792: {
                    ((e) this).field_C[var5].field_h = true;
                    ((e) this).field_C[var5].field_i = ((e) this).field_C[var5].field_F;
                    ((e) this).field_C[var5].field_gb = ((e) this).field_C[var5].field_H;
                    ((e) this).field_C[var5].field_R = ((e) this).field_C[var5].field_E;
                    ((e) this).field_C[var5].field_k = false;
                    statePc = 794;
                    continue stateLoop;
                }
                case 794: {
                    var7 = 0;
                    var8 = 0;
                    statePc = 795;
                    continue stateLoop;
                }
                case 795: {
                    if (((e) this).field_C.length <= var8) {
                        statePc = 823;
                    } else {
                        statePc = 796;
                    }
                    continue stateLoop;
                }
                case 796: {
                    stackOut_796_0 = null;
                    stackOut_796_1 = ((e) this).field_C[var8];
                    stackIn_865_0 = stackOut_796_0;
                    stackIn_865_1 = stackOut_796_1;
                    stackIn_797_0 = stackOut_796_0;
                    stackIn_797_1 = stackOut_796_1;
                    if (var12 != 0) {
                        statePc = 865;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 797: {
                    if (stackIn_797_0 == (Object) (Object) stackIn_797_1) {
                        statePc = 822;
                    } else {
                        statePc = 800;
                    }
                    continue stateLoop;
                }
                case 800: {
                    if (((e) this).field_C[var8].field_C != 0) {
                        statePc = 822;
                    } else {
                        statePc = 803;
                    }
                    continue stateLoop;
                }
                case 803: {
                    if (((e) this).field_C[var8].field_P > 0) {
                        statePc = 808;
                    } else {
                        statePc = 822;
                    }
                    continue stateLoop;
                }
                case 808: {
                    if (!((e) this).field_h.a((byte) -93, ((e) this).field_C[var8], ((e) this).field_C[var5])) {
                        statePc = 812;
                    } else {
                        statePc = 809;
                    }
                    continue stateLoop;
                }
                case 809: {
                    ((e) this).field_C[var5].field_k = true;
                    ((e) this).field_C[var5].field_h = true;
                    ((e) this).field_C[var5].field_i = ((e) this).field_C[var5].field_F;
                    ((e) this).field_C[var5].field_gb = ((e) this).field_C[var5].field_H;
                    ((e) this).field_C[var5].field_R = ((e) this).field_C[var5].field_E;
                    if (var12 == 0) {
                        statePc = 819;
                    } else {
                        statePc = 812;
                    }
                    continue stateLoop;
                }
                case 812: {
                    if (!((e) this).field_C[var5].field_h) {
                        statePc = 819;
                    } else {
                        statePc = 815;
                    }
                    continue stateLoop;
                }
                case 815: {
                    if (!((e) this).field_h.a(param0 + 10057, ((e) this).field_C[var5], ((e) this).field_C[var8], true)) {
                        statePc = 819;
                    } else {
                        statePc = 818;
                    }
                    continue stateLoop;
                }
                case 818: {
                    var7 = 1;
                    statePc = 819;
                    continue stateLoop;
                }
                case 819: {
                    if (!((e) this).field_C[var5].field_db) {
                        statePc = 822;
                    } else {
                        statePc = 820;
                    }
                    continue stateLoop;
                }
                case 820: {
                    ((e) this).field_C[var5].field_h = true;
                    ((e) this).field_C[var5].field_i = ((e) this).field_C[var5].field_F;
                    ((e) this).field_C[var5].field_gb = ((e) this).field_C[var5].field_H;
                    ((e) this).field_C[var5].field_R = ((e) this).field_C[var5].field_E;
                    statePc = 822;
                    continue stateLoop;
                }
                case 822: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 795;
                    } else {
                        statePc = 823;
                    }
                    continue stateLoop;
                }
                case 823: {
                    if (((e) this).field_C[var5].field_k) {
                        statePc = 827;
                    } else {
                        statePc = 824;
                    }
                    continue stateLoop;
                }
                case 824: {
                    if (var7 == 0) {
                        statePc = 829;
                    } else {
                        statePc = 827;
                    }
                    continue stateLoop;
                }
                case 827: {
                    ((e) this).field_C[var5].field_h = false;
                    statePc = 829;
                    continue stateLoop;
                }
                case 829: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 572;
                    } else {
                        statePc = 830;
                    }
                    continue stateLoop;
                }
                case 830: {
                    stackOut_830_0 = null;
                    stackOut_830_1 = this;
                    stackIn_831_0 = stackOut_830_0;
                    stackIn_831_1 = stackOut_830_1;
                    statePc = 831;
                    continue stateLoop;
                }
                case 831: {
                    if (stackIn_831_0 == (Object) (Object) ((e) this).field_K) {
                        statePc = 841;
                    } else {
                        statePc = 832;
                    }
                    continue stateLoop;
                }
                case 832: {
                    if (le.field_q == null) {
                        statePc = 841;
                    } else {
                        statePc = 835;
                    }
                    continue stateLoop;
                }
                case 835: {
                    if ("" == le.field_q.field_o) {
                        statePc = 840;
                    } else {
                        statePc = 841;
                    }
                    continue stateLoop;
                }
                case 840: {
                    ((e) this).field_K = null;
                    statePc = 841;
                    continue stateLoop;
                }
                case 841: {
                    ok.field_i = false;
                    if (param0 == -1) {
                        statePc = 844;
                    } else {
                        statePc = 842;
                    }
                    continue stateLoop;
                }
                case 842: {
                    ((e) this).field_s = 75;
                    statePc = 844;
                    continue stateLoop;
                }
                case 844: {
                    q.field_Ib = false;
                    if (!((e) this).field_J) {
                        statePc = 847;
                    } else {
                        statePc = 845;
                    }
                    continue stateLoop;
                }
                case 845: {
                    q.field_Ib = true;
                    statePc = 847;
                    continue stateLoop;
                }
                case 847: {
                    var7 = 0;
                    var5 = 0;
                    statePc = 848;
                    continue stateLoop;
                }
                case 848: {
                    if (50 <= var5) {
                        statePc = 859;
                    } else {
                        statePc = 849;
                    }
                    continue stateLoop;
                }
                case 849: {
                    stackOut_849_0 = null;
                    stackOut_849_1 = this;
                    stackIn_864_0 = stackOut_849_0;
                    stackIn_864_1 = stackOut_849_1;
                    stackIn_850_0 = stackOut_849_0;
                    stackIn_850_1 = stackOut_849_1;
                    if (var12 != 0) {
                        statePc = 864;
                    } else {
                        statePc = 850;
                    }
                    continue stateLoop;
                }
                case 850: {
                    if (stackIn_850_0 == (Object) (Object) ((e) this).field_F[var5]) {
                        statePc = 858;
                    } else {
                        statePc = 853;
                    }
                    continue stateLoop;
                }
                case 853: {
                    if (null != ((e) this).field_F[var5].field_e) {
                        statePc = 857;
                    } else {
                        statePc = 856;
                    }
                    continue stateLoop;
                }
                case 856: {
                    var7 = 1;
                    statePc = 857;
                    continue stateLoop;
                }
                case 857: {
                    ((e) this).field_F[var5] = ((e) this).field_F[var5].a((byte) 11);
                    statePc = 858;
                    continue stateLoop;
                }
                case 858: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 848;
                    } else {
                        statePc = 859;
                    }
                    continue stateLoop;
                }
                case 859: {
                    var5 = 0;
                    statePc = 860;
                    continue stateLoop;
                }
                case 860: {
                    if (~var5 <= ~((e) this).field_C.length) {
                        statePc = 872;
                    } else {
                        statePc = 861;
                    }
                    continue stateLoop;
                }
                case 861: {
                    if (var12 != 0) {
                        statePc = 874;
                    } else {
                        statePc = 862;
                    }
                    continue stateLoop;
                }
                case 862: {
                    stackOut_862_0 = null;
                    stackOut_862_1 = this;
                    stackIn_864_0 = stackOut_862_0;
                    stackIn_864_1 = stackOut_862_1;
                    statePc = 864;
                    continue stateLoop;
                }
                case 864: {
                    stackOut_864_0 = stackIn_864_0;
                    stackOut_864_1 = ((e) this).field_C[var5];
                    stackIn_865_0 = stackOut_864_0;
                    stackIn_865_1 = stackOut_864_1;
                    statePc = 865;
                    continue stateLoop;
                }
                case 865: {
                    if (stackIn_865_0 != (Object) (Object) stackIn_865_1) {
                        statePc = 867;
                    } else {
                        statePc = 871;
                    }
                    continue stateLoop;
                }
                case 867: {
                    if (((e) this).field_C[var5].field_S) {
                        statePc = 870;
                    } else {
                        statePc = 871;
                    }
                    continue stateLoop;
                }
                case 870: {
                    ((e) this).field_C[var5].a(var7 != 0, (byte) -127);
                    var6 = 1;
                    statePc = 871;
                    continue stateLoop;
                }
                case 871: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 860;
                    } else {
                        statePc = 872;
                    }
                    continue stateLoop;
                }
                case 872: {
                    if (!li.field_a) {
                        statePc = 874;
                    } else {
                        statePc = 873;
                    }
                    continue stateLoop;
                }
                case 873: {
                    var6 = 1;
                    statePc = 874;
                    continue stateLoop;
                }
                case 874: {
                    if (((e) this).field_w) {
                        statePc = 877;
                    } else {
                        statePc = 878;
                    }
                    continue stateLoop;
                }
                case 877: {
                    ((e) this).field_h.c((byte) -96);
                    statePc = 878;
                    continue stateLoop;
                }
                case 878: {
                    if (var6 != 0) {
                        statePc = 881;
                    } else {
                        statePc = 894;
                    }
                    continue stateLoop;
                }
                case 881: {
                    var8 = 0;
                    statePc = 882;
                    continue stateLoop;
                }
                case 882: {
                    if (var8 >= 12) {
                        statePc = 894;
                    } else {
                        statePc = 883;
                    }
                    continue stateLoop;
                }
                case 883: {
                    stackOut_883_0 = ((e) this).field_C[var8];
                    stackIn_909_0 = stackOut_883_0;
                    stackIn_884_0 = stackOut_883_0;
                    if (var12 != 0) {
                        statePc = 909;
                    } else {
                        statePc = 884;
                    }
                    continue stateLoop;
                }
                case 884: {
                    if (stackIn_884_0 == null) {
                        statePc = 893;
                    } else {
                        statePc = 887;
                    }
                    continue stateLoop;
                }
                case 887: {
                    if (((e) this).field_C[var8].field_Z != null) {
                        statePc = 892;
                    } else {
                        statePc = 893;
                    }
                    continue stateLoop;
                }
                case 892: {
                    ((e) this).field_C[var8].field_ob = false;
                    statePc = 893;
                    continue stateLoop;
                }
                case 893: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 882;
                    } else {
                        statePc = 894;
                    }
                    continue stateLoop;
                }
                case 894: {
                    if (var6 == 0) {
                        statePc = 897;
                    } else {
                        statePc = 903;
                    }
                    continue stateLoop;
                }
                case 897: {
                    if (((e) this).field_J) {
                        statePc = 901;
                    } else {
                        statePc = 898;
                    }
                    continue stateLoop;
                }
                case 898: {
                    this.a(22341, param1, var7 != 0);
                    if (var12 == 0) {
                        statePc = 903;
                    } else {
                        statePc = 901;
                    }
                    continue stateLoop;
                }
                case 901: {
                    this.a(param1, true);
                    statePc = 903;
                    continue stateLoop;
                }
                case 903: {
                    if (0 > ((e) this).field_B) {
                        statePc = 924;
                    } else {
                        statePc = 904;
                    }
                    continue stateLoop;
                }
                case 904: {
                    if (((e) this).field_B >= 16) {
                        statePc = 924;
                    } else {
                        statePc = 907;
                    }
                    continue stateLoop;
                }
                case 907: {
                    stackOut_907_0 = ((e) this).field_C[9];
                    stackIn_909_0 = stackOut_907_0;
                    statePc = 909;
                    continue stateLoop;
                }
                case 909: {
                    if (stackIn_909_0.field_k) {
                        statePc = 922;
                    } else {
                        statePc = 910;
                    }
                    continue stateLoop;
                }
                case 910: {
                    if (((e) this).field_C[10].field_k) {
                        statePc = 922;
                    } else {
                        statePc = 913;
                    }
                    continue stateLoop;
                }
                case 913: {
                    if (((e) this).field_C[11].field_k) {
                        statePc = 922;
                    } else {
                        statePc = 916;
                    }
                    continue stateLoop;
                }
                case 916: {
                    if (((e) this).field_C[6].field_P <= 0) {
                        statePc = 922;
                    } else {
                        statePc = 919;
                    }
                    continue stateLoop;
                }
                case 919: {
                    if (((e) this).field_C[7].field_P > 0) {
                        statePc = 924;
                    } else {
                        statePc = 922;
                    }
                    continue stateLoop;
                }
                case 922: {
                    ((e) this).field_B = 16;
                    statePc = 924;
                    continue stateLoop;
                }
                case 924: {
                    ha.field_o = false;
                    statePc = 931;
                    continue stateLoop;
                }
                case 931: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    e(Terraphoenix param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        dl var17_ref_dl = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dl var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Terraphoenix stackIn_2_0 = null;
        Terraphoenix stackIn_4_0 = null;
        Terraphoenix stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Terraphoenix stackIn_6_0 = null;
        Terraphoenix stackIn_8_0 = null;
        Terraphoenix stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Terraphoenix stackIn_10_0 = null;
        Terraphoenix stackIn_12_0 = null;
        Terraphoenix stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Terraphoenix stackIn_14_0 = null;
        Terraphoenix stackIn_16_0 = null;
        Terraphoenix stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ga stackIn_225_0 = null;
        r stackIn_301_0 = null;
        ga stackIn_306_0 = null;
        int stackIn_313_0 = 0;
        int stackIn_313_1 = 0;
        int stackIn_333_0 = 0;
        int stackIn_333_1 = 0;
        r stackIn_336_0 = null;
        int stackIn_409_0 = 0;
        int stackIn_411_0 = 0;
        int stackIn_455_0 = 0;
        Object stackIn_458_0 = null;
        r stackIn_528_0 = null;
        int stackIn_563_0 = 0;
        int stackIn_639_0 = 0;
        r stackIn_686_0 = null;
        Object stackIn_702_0 = null;
        Object stackIn_709_0 = null;
        Object stackIn_767_0 = null;
        RuntimeException stackIn_770_0 = null;
        StringBuilder stackIn_770_1 = null;
        RuntimeException stackIn_772_0 = null;
        StringBuilder stackIn_772_1 = null;
        RuntimeException stackIn_773_0 = null;
        StringBuilder stackIn_773_1 = null;
        String stackIn_773_2 = null;
        Throwable caughtException = null;
        Terraphoenix stackOut_1_0 = null;
        Terraphoenix stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Terraphoenix stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Terraphoenix stackOut_5_0 = null;
        Terraphoenix stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Terraphoenix stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Terraphoenix stackOut_9_0 = null;
        Terraphoenix stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Terraphoenix stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Terraphoenix stackOut_13_0 = null;
        Terraphoenix stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Terraphoenix stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ga stackOut_224_0 = null;
        r stackOut_300_0 = null;
        ga stackOut_304_0 = null;
        int stackOut_312_0 = 0;
        int stackOut_312_1 = 0;
        int stackOut_332_0 = 0;
        int stackOut_332_1 = 0;
        r stackOut_335_0 = null;
        int stackOut_408_0 = 0;
        int stackOut_409_0 = 0;
        int stackOut_454_0 = 0;
        Object stackOut_457_0 = null;
        r stackOut_527_0 = null;
        int stackOut_560_0 = 0;
        int stackOut_562_0 = 0;
        int stackOut_636_0 = 0;
        int stackOut_638_0 = 0;
        r stackOut_685_0 = null;
        Object stackOut_701_0 = null;
        Object stackOut_708_0 = null;
        Object stackOut_766_0 = null;
        RuntimeException stackOut_769_0 = null;
        StringBuilder stackOut_769_1 = null;
        RuntimeException stackOut_770_0 = null;
        StringBuilder stackOut_770_1 = null;
        String stackOut_770_2 = null;
        RuntimeException stackOut_772_0 = null;
        StringBuilder stackOut_772_1 = null;
        String stackOut_772_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = Terraphoenix.field_V;
                    ((e) this).field_D = null;
                    ((e) this).field_F = new gi[50];
                    ((e) this).field_w = false;
                    ((e) this).field_n = null;
                    ((e) this).field_C = new r[100];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    System.gc();
                    ((e) this).field_i = 1;
                    le.field_q = null;
                    this.b((byte) -3);
                    ((e) this).field_f = 0;
                    ((e) this).field_G = param0;
                    ((e) this).field_z = 0;
                    ((e) this).field_v = false;
                    ((e) this).field_L = 0;
                    ok.field_i = true;
                    ((e) this).field_J = false;
                    ((e) this).field_b = false;
                    ((e) this).field_B = -1;
                    eg.field_p = 0;
                    li.field_a = false;
                    ((e) this).field_r = false;
                    ((e) this).field_A = false;
                    ((e) this).field_e = new hk();
                    var2_int = 0;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var10 = 0;
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    stackOut_1_0 = (Terraphoenix) param0;
                    stackIn_4_0 = stackOut_1_0;
                    stackIn_2_0 = stackOut_1_0;
                    if (param0.field_Bb <= 2) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = (Terraphoenix) (Object) stackIn_2_0;
                    stackOut_2_1 = 1;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_5_1 = stackOut_2_1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = (Terraphoenix) (Object) stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_5_0.field_Ab = stackIn_5_1 != 0;
                    stackOut_5_0 = (Terraphoenix) param0;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (param0.field_Bb <= 2) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = (Terraphoenix) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_9_1 = stackOut_6_1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = (Terraphoenix) (Object) stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_9_0.field_H = stackIn_9_1 != 0;
                    stackOut_9_0 = (Terraphoenix) param0;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (param0.field_Bb <= 2) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = (Terraphoenix) (Object) stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_13_1 = stackOut_10_1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackOut_12_0 = (Terraphoenix) (Object) stackIn_12_0;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_13_0.field_E = stackIn_13_1 != 0;
                    stackOut_13_0 = (Terraphoenix) param0;
                    stackIn_16_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (param0.field_Bb <= 2) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = (Terraphoenix) (Object) stackIn_14_0;
                    stackOut_14_1 = 1;
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = (Terraphoenix) (Object) stackIn_16_0;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_17_0.field_Y = stackIn_17_1 != 0;
                    var14 = 0;
                    if (param0.field_db) {
                        statePc = 138;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var15 = param0.field_Bb;
                    if (var15 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var15 == 1) {
                        statePc = 94;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var15 == 2) {
                        statePc = 98;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (3 != var15) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var24 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var15 != 4) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var24 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (5 != var15) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var24 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var15 != 6) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var24 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (7 != var15) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var24 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var15 != 8) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var24 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (9 != var15) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var24 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var15 != 10) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var24 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var15 == 11) {
                        statePc = 135;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var15 == 12) {
                        statePc = 136;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var15 != 13) {
                        statePc = 222;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var24 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ((e) this).field_B = 0;
                    var2_int = 10;
                    le.field_q = new ad(0);
                    le.field_q.field_A = (e) this;
                    if (fa.field_a < 1) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    ((e) this).a(1, kl.field_d[76], -87);
                    if (var24 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    ((e) this).a(-1, ak.field_c, -32);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (2 != fa.field_a) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var2_int = 14;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    ((e) this).field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var2_int = 16;
                    var6 = 4;
                    ((e) this).field_J = false;
                    if (fa.field_a == 2) {
                        statePc = 97;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var2_int = 20;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var9 = 2;
                    var2_int = 12;
                    var8 = 2;
                    ((e) this).field_J = true;
                    if (fa.field_a == 2) {
                        statePc = 101;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var2_int = 20;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var3 = 1;
                    var2_int = 16;
                    ((e) this).field_J = true;
                    if (fa.field_a != 2) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var2_int = 20;
                    var3 = 2;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    ((e) this).field_i = 2;
                    if (param0.field_ub == 2) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var10 = 2;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var9 = 1;
                    var8 = 1;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var3 = 6;
                    ((e) this).field_z = 15;
                    var11 = 0;
                    var12 = 2;
                    ((e) this).field_J = false;
                    if (fa.field_a != 2) {
                        statePc = 222;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var12 = 4;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var12 = 6;
                    var3 = 6;
                    var11 = 4;
                    if (fa.field_a != 2) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var12 = 8;
                    var11 = 6;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    ((e) this).field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var3 = 6;
                    ((e) this).field_z = 10;
                    var11 = 4;
                    var13 = 4;
                    var12 = 4;
                    var8 = 3;
                    if (fa.field_a != 0) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var11 = 2;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    ((e) this).field_J = false;
                    if (fa.field_a != 2) {
                        statePc = 222;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var12 = 8;
                    var13 = 6;
                    var11 = 6;
                    var3 = 4;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var13 = 6;
                    var3 = 4;
                    var12 = 8;
                    ((e) this).field_J = true;
                    var11 = 4;
                    if (2 != fa.field_a) {
                        statePc = 222;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var13 = 8;
                    var3 = 2;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    ((e) this).field_J = true;
                    ((e) this).field_i = 3;
                    if (1 != param0.field_vb) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var13 = 4;
                    var3 = 4;
                    var12 = 2;
                    var4 = 1;
                    var8 = 10;
                    var9 = 2;
                    var5 = 4;
                    var14 = 6;
                    if (var24 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var9 = 2;
                    var8 = 6;
                    ((e) this).field_z = 5;
                    var12 = 6;
                    var3 = 4;
                    var13 = 4;
                    ((e) this).field_J = false;
                    var4 = 1;
                    var14 = 6;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    dd.field_M = 7;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var13 = 6;
                    var14 = 6;
                    var12 = 6;
                    var3 = 18;
                    if (fa.field_a == 2) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var12 = 12;
                    var3 = 12;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    ((e) this).field_J = true;
                    var11 = 0;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    ((e) this).field_i = 3;
                    if (param0.field_vb != 1) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var9 = 2;
                    var4 = 1;
                    var8 = 6;
                    var5 = 6;
                    var12 = 4;
                    ((e) this).field_z = 5;
                    ((e) this).field_J = false;
                    var13 = 4;
                    var14 = 6;
                    if (var24 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var5 = 10;
                    var13 = 4;
                    var12 = 0;
                    var14 = 6;
                    var4 = 1;
                    var9 = 2;
                    var8 = 10;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    dd.field_M = 7;
                    ((e) this).field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    dd.field_M = 4;
                    ((e) this).field_i = 2;
                    var12 = 6;
                    var14 = 6;
                    var13 = 6;
                    var5 = 6;
                    ((e) this).field_J = true;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    ((e) this).field_J = true;
                    dd.field_M = 4;
                    ((e) this).field_i = 3;
                    var8 = 8;
                    var5 = 2;
                    var14 = 8;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var8 = 12;
                    var5 = 4;
                    ((e) this).field_J = true;
                    dd.field_M = 4;
                    ((e) this).field_i = 3;
                    var14 = 12;
                    if (var24 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var15 = param0.field_Bb;
                    if (var15 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var15 == 1) {
                        statePc = 219;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (var15 == 2) {
                        statePc = 219;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (3 == var15) {
                        statePc = 202;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (var15 != 4) {
                        statePc = 154;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var24 == 0) {
                        statePc = 209;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var15 != 5) {
                        statePc = 160;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (6 == var15) {
                        statePc = 216;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var15 != 7) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var15 != 8) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (var24 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (9 != var15) {
                        statePc = 181;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (var15 == 10) {
                        statePc = 218;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (11 != var15) {
                        statePc = 190;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (12 != var15) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (var15 != 13) {
                        statePc = 219;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (qc.field_c < 4) {
                        statePc = 207;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var6 = -qc.field_c + 4;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    var2_int = qc.field_c + 6;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (4 > qc.field_c) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var6 = 4 - qc.field_c;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    var2_int = 8 - -qc.field_c;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var2_int = qc.field_c + 10;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    var2_int = 12 - -qc.field_c;
                    if (var24 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var2_int = 14 + qc.field_c;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    ((e) this).field_i = 2;
                    if (!mb.b(0, 109)) {
                        statePc = 221;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var7 = 88;
                    var6 = 0;
                    var2_int = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    ((e) this).field_J = true;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    var16 = 0;
                    ((e) this).field_u = false;
                    ak.field_q = 0;
                    var15 = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (var15 >= 12) {
                        statePc = 231;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    stackOut_224_0 = param0.field_nb[var15];
                    stackIn_306_0 = stackOut_224_0;
                    stackIn_225_0 = stackOut_224_0;
                    if (var24 != 0) {
                        statePc = 306;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (stackIn_225_0 != null) {
                        statePc = 229;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 229: {
                    ((e) this).field_C[ak.field_q] = new r(param0.field_nb[var15]);
                    ak.field_q = ak.field_q + 1;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    ((e) this).field_h = new dk((e) this);
                    if (param0.field_Bb != 0) {
                        statePc = 233;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var15 = 0;
                    ((e) this).field_C[var15].field_F = 3;
                    ((e) this).field_C[var15].field_H = 4;
                    ((e) this).field_C[var15].field_E = 0;
                    ((e) this).field_C[var15].field_U = 2;
                    var17_ref_dl = ((e) this).field_h.a(120, ((e) this).field_C[var15].field_H, ((e) this).field_C[var15].field_E, ((e) this).field_C[var15].field_F);
                    var17_ref_dl.field_h = ((e) this).field_C[var15];
                    ((e) this).field_C[var15].field_c = var17_ref_dl;
                    ((e) this).field_q = ((e) this).field_C[var15];
                    ((e) this).field_u = true;
                    ((e) this).field_C[1] = null;
                    ((e) this).field_C[2] = null;
                    eg.field_p = ((e) this).field_q.field_E;
                    ((e) this).field_C[3] = null;
                    lg.field_c = (((e) this).field_q.field_F + ((e) this).field_q.field_H) * 16;
                    sj.field_b = (((e) this).field_q.field_F + -((e) this).field_q.field_H) * 32;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (param0.field_Bb == 1) {
                        statePc = 236;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var15 = 0;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (var15 >= 12) {
                        statePc = 278;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var24 != 0) {
                        statePc = 279;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (null == ((e) this).field_C[var15]) {
                        statePc = 277;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (null == ((e) this).field_C[var15].field_Z) {
                        statePc = 277;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (0 == var15) {
                        statePc = 250;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 250: {
                    ((e) this).field_C[var15].field_F = 42;
                    ((e) this).field_C[var15].field_H = 31;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if (var15 == 1) {
                        statePc = 254;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 254: {
                    ((e) this).field_C[var15].field_F = 41;
                    ((e) this).field_C[var15].field_H = 30;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if (var15 != 2) {
                        statePc = 258;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    ((e) this).field_C[var15].field_F = 41;
                    ((e) this).field_C[var15].field_H = 28;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (var15 != 3) {
                        statePc = 261;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    ((e) this).field_C[var15].field_F = 42;
                    ((e) this).field_C[var15].field_H = 27;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (var15 == 4) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    ((e) this).field_C[var15].field_F = 44;
                    ((e) this).field_C[var15].field_H = 31;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (var15 == 5) {
                        statePc = 268;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 268: {
                    ((e) this).field_C[var15].field_F = 45;
                    ((e) this).field_C[var15].field_H = 30;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (6 == var15) {
                        statePc = 272;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 272: {
                    ((e) this).field_C[var15].field_F = 45;
                    ((e) this).field_C[var15].field_H = 28;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if (var15 != 7) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    ((e) this).field_C[var15].field_F = 44;
                    ((e) this).field_C[var15].field_H = 27;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    ((e) this).field_C[var15].field_U = 6;
                    ((e) this).field_C[var15].field_E = 0;
                    var17_ref_dl = ((e) this).field_h.a(-75, ((e) this).field_C[var15].field_H, ((e) this).field_C[var15].field_E, ((e) this).field_C[var15].field_F);
                    var17_ref_dl.field_h = ((e) this).field_C[var15];
                    var17_ref_dl.field_j = -1;
                    var17_ref_dl.field_v = 0;
                    ((e) this).field_C[var15].field_c = var17_ref_dl;
                    ((e) this).field_q = ((e) this).field_C[var15];
                    eg.field_p = ((e) this).field_q.field_E;
                    lg.field_c = (((e) this).field_q.field_F + ((e) this).field_q.field_H) * 16;
                    sj.field_b = (-((e) this).field_q.field_H + ((e) this).field_q.field_F) * 32;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 237;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    ((e) this).field_u = true;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (param0.field_db) {
                        statePc = 310;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (param0.field_Bb != 8) {
                        statePc = 286;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (param0.field_vb == 1) {
                        statePc = 298;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (param0.field_Bb != 10) {
                        statePc = 292;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (param0.field_vb == 2) {
                        statePc = 298;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (param0.field_Bb == 12) {
                        statePc = 298;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (13 != param0.field_Bb) {
                        statePc = 310;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var15 = 0;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (12 <= var15) {
                        statePc = 309;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    stackOut_300_0 = ((e) this).field_C[var15];
                    stackIn_336_0 = stackOut_300_0;
                    stackIn_301_0 = stackOut_300_0;
                    if (var24 != 0) {
                        statePc = 336;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    if (stackIn_301_0 == null) {
                        statePc = 308;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    stackOut_304_0 = ((e) this).field_C[var15].field_Z;
                    stackIn_306_0 = stackOut_304_0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (stackIn_306_0 == null) {
                        statePc = 308;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    ((e) this).field_C[var15].field_F = var15 / 3 % 2 + (2 * (var15 % 3) + (((e) this).field_h.field_b + -9));
                    ((e) this).field_C[var15].field_H = ((e) this).field_h.field_e + -8 + var15 / 3;
                    ((e) this).field_C[var15].field_E = 0;
                    ((e) this).field_C[var15].field_U = 5;
                    var17_ref_dl = ((e) this).field_h.a(-121, ((e) this).field_C[var15].field_H, ((e) this).field_C[var15].field_E, ((e) this).field_C[var15].field_F);
                    var17_ref_dl.field_h = ((e) this).field_C[var15];
                    ((e) this).field_C[var15].field_c = var17_ref_dl;
                    ((e) this).field_q = ((e) this).field_C[var15];
                    lg.field_c = (((e) this).field_q.field_F - -((e) this).field_q.field_H) * 16;
                    eg.field_p = ((e) this).field_q.field_E;
                    sj.field_b = (((e) this).field_q.field_F + -((e) this).field_q.field_H) * 32;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    ((e) this).field_u = true;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    var16 = ak.field_q;
                    var15 = 0;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if (~var15 <= ~var6) {
                        statePc = 332;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    ((e) this).field_C[var16] = new r(7, param0.field_Bb);
                    stackOut_312_0 = ~param0.field_Bb;
                    stackOut_312_1 = -2;
                    stackIn_333_0 = stackOut_312_0;
                    stackIn_333_1 = stackOut_312_1;
                    stackIn_313_0 = stackOut_312_0;
                    stackIn_313_1 = stackOut_312_1;
                    if (var24 != 0) {
                        statePc = 333;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (stackIn_313_0 == stackIn_313_1) {
                        statePc = 317;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (var15 != 0) {
                        statePc = 320;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    ((e) this).field_C[var16].field_F = 28;
                    ((e) this).field_C[var16].field_H = 37;
                    ((e) this).field_C[var16].field_U = 6;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if (1 == var15) {
                        statePc = 323;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 323: {
                    ((e) this).field_C[var16].field_F = 42;
                    ((e) this).field_C[var16].field_H = 43;
                    ((e) this).field_C[var16].field_U = 4;
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if (2 != var15) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    ((e) this).field_C[var16].field_F = 34;
                    ((e) this).field_C[var16].field_H = 19;
                    ((e) this).field_C[var16].field_U = 2;
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    if (var15 != 3) {
                        statePc = 330;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    ((e) this).field_C[var16].field_F = 27;
                    ((e) this).field_C[var16].field_H = 21;
                    ((e) this).field_C[var16].field_U = 4;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    ((e) this).field_C[var16].field_E = 0;
                    var17_ref_dl = ((e) this).field_h.a(-49, ((e) this).field_C[var16].field_H, ((e) this).field_C[var16].field_E, ((e) this).field_C[var16].field_F);
                    var17_ref_dl.field_h = ((e) this).field_C[var16];
                    ((e) this).field_C[var16].field_c = var17_ref_dl;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    var16++;
                    ak.field_q = ak.field_q + 1;
                    var15++;
                    if (var24 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    stackOut_332_0 = -12;
                    stackOut_332_1 = ~param0.field_Bb;
                    stackIn_333_0 = stackOut_332_0;
                    stackIn_333_1 = stackOut_332_1;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (stackIn_333_0 == stackIn_333_1) {
                        statePc = 335;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 335: {
                    stackOut_335_0 = ((e) this).field_C[0];
                    stackIn_336_0 = stackOut_335_0;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    stackIn_336_0.field_s = true;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    if (12 != param0.field_Bb) {
                        statePc = 340;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    ((e) this).field_C[0].field_s = true;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    if (param0.field_Bb == 13) {
                        statePc = 343;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 343: {
                    ((e) this).field_C[0].field_s = true;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    var15 = 0;
                    statePc = 345;
                    continue stateLoop;
                }
                case 345: {
                    if (var2_int <= var15) {
                        statePc = 350;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    ((e) this).field_C[var16] = new r(0, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 351;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    if (var24 == 0) {
                        statePc = 345;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    var15 = 0;
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (~var15 <= ~var3) {
                        statePc = 358;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    ((e) this).field_C[var16] = new r(1, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 359;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (var24 == 0) {
                        statePc = 351;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    var15 = 0;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    if (~var12 >= ~var15) {
                        statePc = 366;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    ((e) this).field_C[var16] = new r(2, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 367;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    if (var24 == 0) {
                        statePc = 359;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    var15 = 0;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    if (var15 >= var13) {
                        statePc = 374;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    ((e) this).field_C[var16] = new r(3, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 375;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    if (var24 == 0) {
                        statePc = 367;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    var15 = 0;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (var15 >= var5) {
                        statePc = 382;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    ((e) this).field_C[var16] = new r(4, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 383;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (var24 == 0) {
                        statePc = 375;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    var15 = 0;
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    if (~var15 <= ~var14) {
                        statePc = 390;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    ((e) this).field_C[var16] = new r(5, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 391;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (var24 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var15 = 0;
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    if (~var4 >= ~var15) {
                        statePc = 398;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    ((e) this).field_C[var16] = new r(6, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 399;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if (var24 == 0) {
                        statePc = 391;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    var15 = 0;
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if (~var7 >= ~var15) {
                        statePc = 406;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    ((e) this).field_C[var16] = new r(9, param0.field_Bb);
                    var16++;
                    var15++;
                    if (var24 != 0) {
                        statePc = 407;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if (var24 == 0) {
                        statePc = 399;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    var15 = var16 - 1;
                    statePc = 407;
                    continue stateLoop;
                }
                case 407: {
                    if (var15 < ak.field_q) {
                        statePc = 454;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    stackOut_408_0 = ~((e) this).field_C[var15].field_t;
                    stackIn_455_0 = stackOut_408_0;
                    stackIn_409_0 = stackOut_408_0;
                    if (var24 != 0) {
                        statePc = 455;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    stackOut_409_0 = stackIn_409_0;
                    stackIn_411_0 = stackOut_409_0;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    if (stackIn_411_0 == -5) {
                        statePc = 453;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    if (((e) this).field_C[var15].field_t == 6) {
                        statePc = 453;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    if (var10 > 0) {
                        statePc = 432;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (var9 > 0) {
                        statePc = 429;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    if (0 >= var8) {
                        statePc = 434;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    var8--;
                    ((e) this).field_C[var15].field_z = 2;
                    if (var24 == 0) {
                        statePc = 434;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    ((e) this).field_C[var15].field_z = 3;
                    var9--;
                    if (var24 == 0) {
                        statePc = 434;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    ((e) this).field_C[var15].field_z = 4;
                    var10--;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if (param0.field_Bb != 3) {
                        statePc = 444;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    if (((e) this).field_C[var15].field_t != 1) {
                        statePc = 444;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    if (param0.field_ub == 2) {
                        statePc = 443;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 443: {
                    ((e) this).field_C[var15].field_z = 2;
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    if (param0.field_Bb != 3) {
                        statePc = 453;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 445: {
                    if (((e) this).field_C[var15].field_t != 1) {
                        statePc = 453;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (param0.field_ub != 1) {
                        statePc = 453;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    ((e) this).field_C[var15].field_z = 1;
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    var15--;
                    if (var24 == 0) {
                        statePc = 407;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    stackOut_454_0 = 0;
                    stackIn_455_0 = stackOut_454_0;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    var17 = stackIn_455_0;
                    var15 = 0;
                    statePc = 456;
                    continue stateLoop;
                }
                case 456: {
                    if (var15 >= ((e) this).field_C.length) {
                        statePc = 753;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    stackOut_457_0 = null;
                    stackIn_767_0 = stackOut_457_0;
                    stackIn_458_0 = stackOut_457_0;
                    if (var24 != 0) {
                        statePc = 767;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    if (stackIn_458_0 == (Object) (Object) ((e) this).field_C[var15]) {
                        statePc = 752;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    if (((e) this).field_C[var15].field_Z != null) {
                        statePc = 752;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    if (((e) this).field_C[var15].field_c == null) {
                        statePc = 469;
                    } else {
                        statePc = 752;
                    }
                    continue stateLoop;
                }
                case 469: {
                    var17 = 0;
                    if (0 == param0.field_Bb) {
                        statePc = 472;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 472: {
                    var17 = 2;
                    statePc = 473;
                    continue stateLoop;
                }
                case 473: {
                    if (param0.field_Bb != 1) {
                        statePc = 480;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if (((e) this).field_C[var15].field_t == 0) {
                        statePc = 479;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 479: {
                    var17 = 1;
                    statePc = 480;
                    continue stateLoop;
                }
                case 480: {
                    if (param0.field_Bb != 11) {
                        statePc = 482;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    var17 = 1;
                    statePc = 482;
                    continue stateLoop;
                }
                case 482: {
                    if (((e) this).field_C[var15].field_z != 0) {
                        statePc = 487;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    if (var11 <= 0) {
                        statePc = 487;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    var11--;
                    var17 = 1;
                    statePc = 487;
                    continue stateLoop;
                }
                case 487: {
                    if (((e) this).field_C[var15].field_t == 9) {
                        statePc = 490;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 490: {
                    var17 = 1;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if (0 != var17) {
                        statePc = 687;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if (0 != ((e) this).field_C[var15].field_C) {
                        statePc = 497;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    ((e) this).field_C[var15].field_z = 0;
                    statePc = 497;
                    continue stateLoop;
                }
                case 497: {
                    if (((e) this).field_C[var15].field_z != 0) {
                        statePc = 521;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    if (((e) this).field_C[var15].field_t <= 0) {
                        statePc = 521;
                    } else {
                        statePc = 501;
                    }
                    continue stateLoop;
                }
                case 501: {
                    if (((e) this).field_C[var15].field_C != 1) {
                        statePc = 521;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 504: {
                    if (param0.field_Bb == 4) {
                        statePc = 518;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    if (6 == param0.field_Bb) {
                        statePc = 518;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    if (param0.field_Bb == 8) {
                        statePc = 518;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (param0.field_Bb == 10) {
                        statePc = 518;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 518: {
                    if (50.0 <= Math.random() * 100.0) {
                        statePc = 521;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    ((e) this).field_C[var15].field_z = 1;
                    statePc = 521;
                    continue stateLoop;
                }
                case 521: {
                    ((e) this).field_C[var15].field_U = (int)(8.0 * Math.random());
                    var23 = 0;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    var18 = (int)(Math.random() * (double)((e) this).field_h.field_b / 2.0) - -(((e) this).field_h.field_b / 4);
                    var23++;
                    var19 = (int)(Math.random() * (double)((e) this).field_h.field_e / 2.0) + ((e) this).field_h.field_e / 4;
                    if (((e) this).field_C[var15].field_t < 1) {
                        statePc = 525;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 523: {
                    if (6 < ((e) this).field_C[var15].field_t) {
                        statePc = 525;
                    } else {
                        statePc = 524;
                    }
                    continue stateLoop;
                }
                case 524: {
                    var18 = 2 + (int)(Math.random() * (double)(-4 + ((e) this).field_h.field_b));
                    var19 = (int)(Math.random() * (double)(-4 + ((e) this).field_h.field_e)) + 2;
                    statePc = 525;
                    continue stateLoop;
                }
                case 525: {
                    if (9 != param0.field_Bb) {
                        statePc = 527;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    var18 = 2 + (int)(Math.random() * (double)(-4 + ((e) this).field_h.field_b));
                    var19 = (int)(Math.random() * (double)(((e) this).field_h.field_e - 4)) - -2;
                    statePc = 527;
                    continue stateLoop;
                }
                case 527: {
                    var20 = 0;
                    stackOut_527_0 = ((e) this).field_C[var15];
                    stackIn_528_0 = stackOut_527_0;
                    statePc = 528;
                    continue stateLoop;
                }
                case 528: {
                    if (stackIn_528_0.field_t == 0) {
                        statePc = 572;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    if (((e) this).field_C[var15].field_t == 7) {
                        statePc = 572;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 530: {
                    if (9 == ((e) this).field_C[var15].field_t) {
                        statePc = 572;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    var21 = ((e) this).field_h.a(-118, var19, var20, var18);
                    if (var21.field_C == null) {
                        statePc = 540;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    if (((e) this).field_C[var15].field_z >= 2) {
                        statePc = 539;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 539: {
                    var20++;
                    var21 = ((e) this).field_h.a(-51, var19, var20, var18);
                    statePc = 540;
                    continue stateLoop;
                }
                case 540: {
                    if (null == var21.field_C) {
                        statePc = 545;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if (3 > ((e) this).field_C[var15].field_z) {
                        statePc = 545;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    var20++;
                    var21 = ((e) this).field_h.a(-48, var19, var20, var18);
                    statePc = 545;
                    continue stateLoop;
                }
                case 545: {
                    if (var21.field_C == null) {
                        statePc = 552;
                    } else {
                        statePc = 546;
                    }
                    continue stateLoop;
                }
                case 546: {
                    if (((e) this).field_C[var15].field_z == 4) {
                        statePc = 551;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 551: {
                    var20++;
                    var21 = ((e) this).field_h.a(102, var19, var20, var18);
                    statePc = 552;
                    continue stateLoop;
                }
                case 552: {
                    if (null == var21.field_C) {
                        statePc = 559;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    if (((e) this).field_C[var15].field_z == 4) {
                        statePc = 558;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 558: {
                    var20++;
                    var21 = ((e) this).field_h.a(-63, var19, var20, var18);
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    if (((e) this).field_h.a(var18, false, var20, var19)) {
                        statePc = 562;
                    } else {
                        statePc = 560;
                    }
                    continue stateLoop;
                }
                case 560: {
                    stackOut_560_0 = 1;
                    stackIn_563_0 = stackOut_560_0;
                    statePc = 563;
                    continue stateLoop;
                }
                case 562: {
                    stackOut_562_0 = 0;
                    stackIn_563_0 = stackOut_562_0;
                    statePc = 563;
                    continue stateLoop;
                }
                case 563: {
                    var22 = stackIn_563_0;
                    if (~(((e) this).field_C[var15].field_z - 1) >= ~var21.field_r) {
                        statePc = 565;
                    } else {
                        statePc = 564;
                    }
                    continue stateLoop;
                }
                case 564: {
                    var22 = 0;
                    statePc = 565;
                    continue stateLoop;
                }
                case 565: {
                    if (4 == var21.field_b) {
                        statePc = 684;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    if (var21.field_b != 14) {
                        statePc = 571;
                    } else {
                        statePc = 684;
                    }
                    continue stateLoop;
                }
                case 571: {
                    var22 = 0;
                    if (var24 == 0) {
                        statePc = 684;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    var21 = ((e) this).field_h.a(124, var19, var20, var18);
                    if (var21.field_C == null) {
                        statePc = 579;
                    } else {
                        statePc = 573;
                    }
                    continue stateLoop;
                }
                case 573: {
                    if (((e) this).field_C[var15].field_z >= 2) {
                        statePc = 578;
                    } else {
                        statePc = 579;
                    }
                    continue stateLoop;
                }
                case 578: {
                    var20++;
                    var21 = ((e) this).field_h.a(-32, var19, var20, var18);
                    statePc = 579;
                    continue stateLoop;
                }
                case 579: {
                    if (var21.field_C == null) {
                        statePc = 584;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    if (((e) this).field_C[var15].field_z < 3) {
                        statePc = 584;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 583: {
                    var20++;
                    var21 = ((e) this).field_h.a(114, var19, var20, var18);
                    statePc = 584;
                    continue stateLoop;
                }
                case 584: {
                    if (null == var21.field_C) {
                        statePc = 589;
                    } else {
                        statePc = 585;
                    }
                    continue stateLoop;
                }
                case 585: {
                    if (((e) this).field_C[var15].field_z != 4) {
                        statePc = 589;
                    } else {
                        statePc = 588;
                    }
                    continue stateLoop;
                }
                case 588: {
                    var20++;
                    var21 = ((e) this).field_h.a(-36, var19, var20, var18);
                    statePc = 589;
                    continue stateLoop;
                }
                case 589: {
                    if (null == var21.field_C) {
                        statePc = 596;
                    } else {
                        statePc = 590;
                    }
                    continue stateLoop;
                }
                case 590: {
                    if (((e) this).field_C[var15].field_z == 4) {
                        statePc = 595;
                    } else {
                        statePc = 596;
                    }
                    continue stateLoop;
                }
                case 595: {
                    var20++;
                    var21 = ((e) this).field_h.a(-111, var19, var20, var18);
                    statePc = 596;
                    continue stateLoop;
                }
                case 596: {
                    if (var23 <= 1000) {
                        statePc = 603;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 597: {
                    if (((e) this).field_C[var15].field_z == 4) {
                        statePc = 602;
                    } else {
                        statePc = 603;
                    }
                    continue stateLoop;
                }
                case 602: {
                    ((e) this).field_C[var15].field_z = 3;
                    statePc = 603;
                    continue stateLoop;
                }
                case 603: {
                    if (1250 >= var23) {
                        statePc = 610;
                    } else {
                        statePc = 604;
                    }
                    continue stateLoop;
                }
                case 604: {
                    if (((e) this).field_C[var15].field_z == 3) {
                        statePc = 609;
                    } else {
                        statePc = 610;
                    }
                    continue stateLoop;
                }
                case 609: {
                    ((e) this).field_C[var15].field_z = 2;
                    statePc = 610;
                    continue stateLoop;
                }
                case 610: {
                    if (var23 <= 1500) {
                        statePc = 617;
                    } else {
                        statePc = 611;
                    }
                    continue stateLoop;
                }
                case 611: {
                    if (2 == ((e) this).field_C[var15].field_z) {
                        statePc = 616;
                    } else {
                        statePc = 617;
                    }
                    continue stateLoop;
                }
                case 616: {
                    ((e) this).field_C[var15].field_z = 0;
                    statePc = 617;
                    continue stateLoop;
                }
                case 617: {
                    if (var21.field_C == null) {
                        statePc = 625;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 618: {
                    if (!param0.field_db) {
                        statePc = 625;
                    } else {
                        statePc = 621;
                    }
                    continue stateLoop;
                }
                case 621: {
                    if (Math.random() * 100.0 >= 75.0) {
                        statePc = 625;
                    } else {
                        statePc = 624;
                    }
                    continue stateLoop;
                }
                case 624: {
                    var20++;
                    var21 = ((e) this).field_h.a(88, var19, var20, var18);
                    statePc = 625;
                    continue stateLoop;
                }
                case 625: {
                    if (var21.field_C == null) {
                        statePc = 635;
                    } else {
                        statePc = 626;
                    }
                    continue stateLoop;
                }
                case 626: {
                    if (!param0.field_db) {
                        statePc = 635;
                    } else {
                        statePc = 629;
                    }
                    continue stateLoop;
                }
                case 629: {
                    if (75.0 > Math.random() * 100.0) {
                        statePc = 634;
                    } else {
                        statePc = 635;
                    }
                    continue stateLoop;
                }
                case 634: {
                    var20++;
                    var21 = ((e) this).field_h.a(124, var19, var20, var18);
                    statePc = 635;
                    continue stateLoop;
                }
                case 635: {
                    if (((e) this).field_h.a(var18, false, var20, var19)) {
                        statePc = 638;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    stackOut_636_0 = 1;
                    stackIn_639_0 = stackOut_636_0;
                    statePc = 639;
                    continue stateLoop;
                }
                case 638: {
                    stackOut_638_0 = 0;
                    stackIn_639_0 = stackOut_638_0;
                    statePc = 639;
                    continue stateLoop;
                }
                case 639: {
                    var22 = stackIn_639_0;
                    if (!param0.field_db) {
                        statePc = 644;
                    } else {
                        statePc = 640;
                    }
                    continue stateLoop;
                }
                case 640: {
                    if (6 != var21.field_b) {
                        statePc = 644;
                    } else {
                        statePc = 643;
                    }
                    continue stateLoop;
                }
                case 643: {
                    var22 = 0;
                    statePc = 644;
                    continue stateLoop;
                }
                case 644: {
                    if (!param0.field_db) {
                        statePc = 651;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 645: {
                    if (12 == var21.field_b) {
                        statePc = 650;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 650: {
                    var22 = 0;
                    statePc = 651;
                    continue stateLoop;
                }
                case 651: {
                    if (1 >= param0.field_Bb) {
                        statePc = 656;
                    } else {
                        statePc = 652;
                    }
                    continue stateLoop;
                }
                case 652: {
                    if (var21.field_b != 0) {
                        statePc = 656;
                    } else {
                        statePc = 655;
                    }
                    continue stateLoop;
                }
                case 655: {
                    var22 = 0;
                    statePc = 656;
                    continue stateLoop;
                }
                case 656: {
                    if (~(-1 + ((e) this).field_C[var15].field_z) >= ~var21.field_r) {
                        statePc = 663;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 657: {
                    if (((e) this).field_C[var15].field_z < 4) {
                        statePc = 662;
                    } else {
                        statePc = 663;
                    }
                    continue stateLoop;
                }
                case 662: {
                    var22 = 0;
                    statePc = 663;
                    continue stateLoop;
                }
                case 663: {
                    if (~((e) this).field_C[var15].field_z >= ~var21.field_r) {
                        statePc = 670;
                    } else {
                        statePc = 664;
                    }
                    continue stateLoop;
                }
                case 664: {
                    if (((e) this).field_C[var15].field_z == 4) {
                        statePc = 669;
                    } else {
                        statePc = 670;
                    }
                    continue stateLoop;
                }
                case 669: {
                    var22 = 0;
                    statePc = 670;
                    continue stateLoop;
                }
                case 670: {
                    if (var21.field_b == 3) {
                        statePc = 673;
                    } else {
                        statePc = 674;
                    }
                    continue stateLoop;
                }
                case 673: {
                    var22 = 0;
                    statePc = 674;
                    continue stateLoop;
                }
                case 674: {
                    if (var21.field_b == 5) {
                        statePc = 677;
                    } else {
                        statePc = 678;
                    }
                    continue stateLoop;
                }
                case 677: {
                    var22 = 0;
                    statePc = 678;
                    continue stateLoop;
                }
                case 678: {
                    if (8 != var21.field_b) {
                        statePc = 680;
                    } else {
                        statePc = 679;
                    }
                    continue stateLoop;
                }
                case 679: {
                    var22 = 0;
                    statePc = 680;
                    continue stateLoop;
                }
                case 680: {
                    if (-1 == var21.field_b) {
                        statePc = 683;
                    } else {
                        statePc = 684;
                    }
                    continue stateLoop;
                }
                case 683: {
                    var22 = 0;
                    statePc = 684;
                    continue stateLoop;
                }
                case 684: {
                    if (var22 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 685: {
                    ((e) this).field_C[var15].field_F = var18;
                    ((e) this).field_C[var15].field_H = var19;
                    ((e) this).field_C[var15].field_E = var20;
                    var21 = ((e) this).field_h.a(-119, var19, var20, var18);
                    var21.field_h = ((e) this).field_C[var15];
                    stackOut_685_0 = ((e) this).field_C[var15];
                    stackIn_528_0 = stackOut_685_0;
                    stackIn_686_0 = stackOut_685_0;
                    if (var24 != 0) {
                        statePc = 528;
                    } else {
                        statePc = 686;
                    }
                    continue stateLoop;
                }
                case 686: {
                    stackIn_686_0.field_c = var21;
                    statePc = 687;
                    continue stateLoop;
                }
                case 687: {
                    if (1 == var17) {
                        statePc = 690;
                    } else {
                        statePc = 710;
                    }
                    continue stateLoop;
                }
                case 690: {
                    ((e) this).field_C[var15].field_U = (int)(8.0 * Math.random());
                    ((e) this).field_C[var15].field_z = 0;
                    statePc = 691;
                    continue stateLoop;
                }
                case 691: {
                    var20 = (int)(Math.random() * 4.0);
                    var18 = (int)(Math.random() * (double)(-6 + ((e) this).field_h.field_b)) + 3;
                    var19 = 3 + (int)(Math.random() * (double)(-6 + ((e) this).field_h.field_e));
                    if (param0.field_Bb == 1) {
                        statePc = 693;
                    } else {
                        statePc = 694;
                    }
                    continue stateLoop;
                }
                case 693: {
                    var20 = 0;
                    statePc = 694;
                    continue stateLoop;
                }
                case 694: {
                    if (0 == var20) {
                        statePc = 697;
                    } else {
                        statePc = 698;
                    }
                    continue stateLoop;
                }
                case 697: {
                    var18 = (int)(Math.random() * 3.0 + 2.0);
                    statePc = 698;
                    continue stateLoop;
                }
                case 698: {
                    if (1 == var20) {
                        statePc = 701;
                    } else {
                        statePc = 703;
                    }
                    continue stateLoop;
                }
                case 701: {
                    stackOut_701_0 = this;
                    stackIn_702_0 = stackOut_701_0;
                    statePc = 702;
                    continue stateLoop;
                }
                case 702: {
                    var18 = ((e) this).field_h.field_b - (int)(3.0 * Math.random() + 2.0);
                    statePc = 703;
                    continue stateLoop;
                }
                case 703: {
                    if (var20 != 2) {
                        statePc = 705;
                    } else {
                        statePc = 704;
                    }
                    continue stateLoop;
                }
                case 704: {
                    var19 = (int)(2.0 + Math.random() * 3.0);
                    statePc = 705;
                    continue stateLoop;
                }
                case 705: {
                    if (3 != var20) {
                        statePc = 707;
                    } else {
                        statePc = 706;
                    }
                    continue stateLoop;
                }
                case 706: {
                    var19 = ((e) this).field_h.field_e + -(int)(3.0 * Math.random() + 2.0);
                    statePc = 707;
                    continue stateLoop;
                }
                case 707: {
                    if (((e) this).field_h.a(var18, false, 0, var19)) {
                        statePc = 691;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 708: {
                    ((e) this).field_C[var15].field_F = var18;
                    ((e) this).field_C[var15].field_H = var19;
                    ((e) this).field_h.field_f[var18][var19].field_h = ((e) this).field_C[var15];
                    stackOut_708_0 = this;
                    stackIn_702_0 = stackOut_708_0;
                    stackIn_709_0 = stackOut_708_0;
                    if (var24 != 0) {
                        statePc = 702;
                    } else {
                        statePc = 709;
                    }
                    continue stateLoop;
                }
                case 709: {
                    ((e) this).field_C[var15].field_c = ((e) this).field_h.field_f[var18][var19];
                    statePc = 710;
                    continue stateLoop;
                }
                case 710: {
                    if (2 == var17) {
                        statePc = 713;
                    } else {
                        statePc = 752;
                    }
                    continue stateLoop;
                }
                case 713: {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                    if (~var15 == ~(0 - -ak.field_q)) {
                        statePc = 716;
                    } else {
                        statePc = 717;
                    }
                    continue stateLoop;
                }
                case 716: {
                    var19 = 16;
                    var20 = 0;
                    ((e) this).field_C[var15].field_nb = new oh(2);
                    var18 = 20;
                    statePc = 717;
                    continue stateLoop;
                }
                case 717: {
                    if (ak.field_q + 1 != var15) {
                        statePc = 719;
                    } else {
                        statePc = 718;
                    }
                    continue stateLoop;
                }
                case 718: {
                    ((e) this).field_C[var15].field_nb = new oh(2);
                    var19 = 20;
                    var18 = 19;
                    var20 = 0;
                    statePc = 719;
                    continue stateLoop;
                }
                case 719: {
                    if (ak.field_q + 2 != var15) {
                        statePc = 721;
                    } else {
                        statePc = 720;
                    }
                    continue stateLoop;
                }
                case 720: {
                    var20 = 0;
                    var18 = 26;
                    var19 = 21;
                    ((e) this).field_C[var15].field_nb = new oh(1);
                    statePc = 721;
                    continue stateLoop;
                }
                case 721: {
                    if (~(ak.field_q + 3) == ~var15) {
                        statePc = 724;
                    } else {
                        statePc = 725;
                    }
                    continue stateLoop;
                }
                case 724: {
                    var20 = 0;
                    var18 = 27;
                    ((e) this).field_C[var15].field_nb = new oh(1);
                    var19 = 18;
                    statePc = 725;
                    continue stateLoop;
                }
                case 725: {
                    if (4 + ak.field_q != var15) {
                        statePc = 727;
                    } else {
                        statePc = 726;
                    }
                    continue stateLoop;
                }
                case 726: {
                    var20 = 0;
                    var19 = 30;
                    ((e) this).field_C[var15].field_nb = new oh(0);
                    var18 = 28;
                    statePc = 727;
                    continue stateLoop;
                }
                case 727: {
                    if (var15 != ak.field_q + 5) {
                        statePc = 729;
                    } else {
                        statePc = 728;
                    }
                    continue stateLoop;
                }
                case 728: {
                    ((e) this).field_C[var15].field_nb = new oh(1);
                    var19 = 33;
                    var20 = 0;
                    var18 = 27;
                    statePc = 729;
                    continue stateLoop;
                }
                case 729: {
                    if (var15 != ak.field_q + 6) {
                        statePc = 731;
                    } else {
                        statePc = 730;
                    }
                    continue stateLoop;
                }
                case 730: {
                    var19 = 31;
                    ((e) this).field_C[var15].field_nb = new oh(1);
                    var20 = 0;
                    var18 = 29;
                    statePc = 731;
                    continue stateLoop;
                }
                case 731: {
                    if (~(7 - -ak.field_q) != ~var15) {
                        statePc = 733;
                    } else {
                        statePc = 732;
                    }
                    continue stateLoop;
                }
                case 732: {
                    ((e) this).field_C[var15].field_nb = new oh(3);
                    var20 = 0;
                    var18 = 25;
                    var19 = 5;
                    statePc = 733;
                    continue stateLoop;
                }
                case 733: {
                    if (var15 == ak.field_q + 8) {
                        statePc = 736;
                    } else {
                        statePc = 737;
                    }
                    continue stateLoop;
                }
                case 736: {
                    var18 = 26;
                    var19 = 5;
                    ((e) this).field_C[var15].field_nb = new oh(1);
                    var20 = 0;
                    statePc = 737;
                    continue stateLoop;
                }
                case 737: {
                    if (~var15 != ~(ak.field_q + 9)) {
                        statePc = 739;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 738: {
                    ((e) this).field_C[var15].field_nb = new oh(3);
                    var20 = 0;
                    var18 = 27;
                    var19 = 5;
                    statePc = 739;
                    continue stateLoop;
                }
                case 739: {
                    if (~var15 != ~(10 - -ak.field_q)) {
                        statePc = 741;
                    } else {
                        statePc = 740;
                    }
                    continue stateLoop;
                }
                case 740: {
                    var19 = 37;
                    var20 = 0;
                    var18 = 2;
                    ((e) this).field_C[var15].field_nb = new oh(2);
                    statePc = 741;
                    continue stateLoop;
                }
                case 741: {
                    if (var15 != ak.field_q + 11) {
                        statePc = 743;
                    } else {
                        statePc = 742;
                    }
                    continue stateLoop;
                }
                case 742: {
                    ((e) this).field_C[var15].field_nb = new oh(2);
                    var18 = 3;
                    var20 = 0;
                    var19 = 38;
                    statePc = 743;
                    continue stateLoop;
                }
                case 743: {
                    if (~var15 == ~(ak.field_q + 12)) {
                        statePc = 746;
                    } else {
                        statePc = 747;
                    }
                    continue stateLoop;
                }
                case 746: {
                    var18 = 29;
                    var19 = 2;
                    var20 = 0;
                    ((e) this).field_C[var15].field_nb = new oh(2);
                    statePc = 747;
                    continue stateLoop;
                }
                case 747: {
                    if (13 + ak.field_q == var15) {
                        statePc = 750;
                    } else {
                        statePc = 751;
                    }
                    continue stateLoop;
                }
                case 750: {
                    var20 = 0;
                    var18 = 29;
                    ((e) this).field_C[var15].field_nb = new oh(2);
                    var19 = 1;
                    statePc = 751;
                    continue stateLoop;
                }
                case 751: {
                    ((e) this).field_C[var15].field_F = var18;
                    ((e) this).field_C[var15].field_H = var19;
                    ((e) this).field_C[var15].field_E = var20;
                    var21 = ((e) this).field_h.a(-125, var19, var20, var18);
                    var21.field_h = ((e) this).field_C[var15];
                    ((e) this).field_C[var15].field_c = var21;
                    ((e) this).field_C[var15].field_U = 6;
                    statePc = 752;
                    continue stateLoop;
                }
                case 752: {
                    var15++;
                    if (var24 == 0) {
                        statePc = 456;
                    } else {
                        statePc = 753;
                    }
                    continue stateLoop;
                }
                case 753: {
                    ((e) this).field_d = 0;
                    if (((e) this).field_J) {
                        statePc = 756;
                    } else {
                        statePc = 757;
                    }
                    continue stateLoop;
                }
                case 756: {
                    ((e) this).field_d = 1;
                    statePc = 757;
                    continue stateLoop;
                }
                case 757: {
                    if (!((e) this).field_u) {
                        statePc = 760;
                    } else {
                        statePc = 758;
                    }
                    continue stateLoop;
                }
                case 758: {
                    ((e) this).c((byte) -116);
                    statePc = 760;
                    continue stateLoop;
                }
                case 760: {
                    if (le.field_q == null) {
                        statePc = 774;
                    } else {
                        statePc = 761;
                    }
                    continue stateLoop;
                }
                case 761: {
                    if (fa.field_a > 0) {
                        statePc = 766;
                    } else {
                        statePc = 774;
                    }
                    continue stateLoop;
                }
                case 766: {
                    le.field_q.c((byte) 51);
                    ((e) this).field_B = -1;
                    stackOut_766_0 = null;
                    stackIn_767_0 = stackOut_766_0;
                    statePc = 767;
                    continue stateLoop;
                }
                case 767: {
                    le.field_q = (ad) (Object) stackIn_767_0;
                    statePc = 774;
                    continue stateLoop;
                }
                case 774: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[4];
        field_o = null;
        field_l = new rh(13, 0, 1, 0);
    }
}
