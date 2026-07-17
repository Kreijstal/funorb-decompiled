/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends rf {
    int field_j;
    bf field_h;
    int field_k;
    int field_o;
    int field_l;
    boolean field_p;
    private int field_g;
    static int field_w;
    int field_u;
    int field_r;
    int field_n;
    int field_z;
    static p field_x;
    private int field_t;
    int field_i;
    private int field_v;
    int field_q;
    private int field_m;
    static int field_s;
    static ue field_y;
    int field_f;

    private final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, d[] param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        d var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var8_int = 0;
              if (param1 >= 102) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            L2: {
              if (((bf) this).field_k > 0) {
                var9 = 0;
                L3: while (true) {
                  if (var9 >= 4000) {
                    break L2;
                  } else {
                    L4: {
                      var10 = param6[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        L5: {
                          if (var10.field_h == 1) {
                            break L5;
                          } else {
                            if (var10.field_h == 10) {
                              break L5;
                            } else {
                              if (var10.field_h == 11) {
                                break L5;
                              } else {
                                if (var10.field_h != 12) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        if (((bf) this).field_k > 0) {
                          if (param3 <= Math.abs(((bf) this).field_f - var10.field_d)) {
                            break L4;
                          } else {
                            if (param2 <= Math.abs(-var10.field_q + ((bf) this).field_u)) {
                              break L4;
                            } else {
                              L6: {
                                if (var10.field_i == 3) {
                                  var11 = 0;
                                  L7: while (true) {
                                    if (var11 >= 20) {
                                      break L6;
                                    } else {
                                      int discarded$5 = -4001;
                                      boolean discarded$6 = v.a(new d(var10.field_d, var10.field_q, sa.field_a[var11], sa.field_a[(var11 + 5) % 20], 65535, 1));
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if (var10.field_h != 1) {
                                  break L8;
                                } else {
                                  if (var10.field_o != 65280) {
                                    break L8;
                                  } else {
                                    var10.field_i = ((bf) this).field_k;
                                    break L8;
                                  }
                                }
                              }
                              na.field_d = na.field_d + 1;
                              fc.field_e = fc.field_e + ((param4 << 1) + -jl.field_d);
                              var10.field_o = 0;
                              ((bf) this).field_k = ((bf) this).field_k - var10.field_i;
                              ia.field_k = ia.field_k + param4;
                              var10.field_h = 5;
                              var10.field_i = 16;
                              var10.field_p = 0;
                              if (((bf) this).field_k > 0) {
                                var8_int = 1;
                                break L4;
                              } else {
                                L9: {
                                  if (2 != ((bf) this).field_q) {
                                    break L9;
                                  } else {
                                    L10: {
                                      wg.field_e = wg.field_e + 1;
                                      if (wg.field_e != 50) {
                                        break L10;
                                      } else {
                                        ph.a(246, false, 9);
                                        break L10;
                                      }
                                    }
                                    if (wg.field_e == 150) {
                                      ph.a(245, false, 10);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L11: {
                                  if (((bf) this).field_q != 12) {
                                    break L11;
                                  } else {
                                    L12: {
                                      qf.field_h = qf.field_h + 1;
                                      if (qf.field_h == 10) {
                                        ph.a(248, false, 7);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    if (qf.field_h == 30) {
                                      ph.a(247, false, 8);
                                      break L11;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                                stackOut_43_0 = 1;
                                stackIn_44_0 = stackOut_43_0;
                                return stackIn_44_0 != 0;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                int fieldTemp$7 = ((bf) this).field_r;
                ((bf) this).field_r = ((bf) this).field_r + 1;
                if (~param5 >= ~fieldTemp$7) {
                  break L2;
                } else {
                  if (((bf) this).field_r % (-qc.field_d + 3) != 0) {
                    break L2;
                  } else {
                    var9 = 0;
                    L13: while (true) {
                      if (param0 <= var9) {
                        break L2;
                      } else {
                        int discarded$8 = -4001;
                        boolean discarded$9 = v.a(new d(-16 + ((bf) this).field_f - -sh.b(-126, 32), ((bf) this).field_u + sh.b(64, 32) + -16, sh.b(-126, 64) + 64, 6));
                        var9++;
                        continue L13;
                      }
                    }
                  }
                }
              }
            }
            stackOut_47_0 = var8_int;
            stackIn_48_0 = stackOut_47_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var8 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var8;
            stackOut_49_1 = new StringBuilder().append("bf.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param6 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L14;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L14;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 41);
        }
        return stackIn_48_0 != 0;
    }

    private final void b(byte param0) {
        int var3 = 0;
        L0: {
          var3 = StarCannon.field_A;
          ((bf) this).field_g = ((bf) this).field_g + Math.abs(((bf) this).field_n);
          ((bf) this).field_t = ((bf) this).field_t + Math.abs(((bf) this).field_z);
          if (32 < ((bf) this).field_g) {
            L1: {
              if (((bf) this).field_n >= 0) {
                break L1;
              } else {
                ((bf) this).field_f = ((bf) this).field_f - (((bf) this).field_g >> 5);
                break L1;
              }
            }
            L2: {
              if (0 < ((bf) this).field_n) {
                ((bf) this).field_f = ((bf) this).field_f + (((bf) this).field_g >> 5);
                break L2;
              } else {
                break L2;
              }
            }
            ((bf) this).field_g = ((bf) this).field_g & 31;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (((bf) this).field_t <= 32) {
            break L3;
          } else {
            L4: {
              if (((bf) this).field_z >= 0) {
                break L4;
              } else {
                ((bf) this).field_u = ((bf) this).field_u - (((bf) this).field_t >> 5);
                break L4;
              }
            }
            L5: {
              if (0 < ((bf) this).field_z) {
                ((bf) this).field_u = ((bf) this).field_u + (((bf) this).field_t >> 5);
                break L5;
              } else {
                break L5;
              }
            }
            ((bf) this).field_t = 31 & ((bf) this).field_t;
            break L3;
          }
        }
        if (param0 == -24) {
          L6: {
            if (((bf) this).field_n < 0) {
              ((bf) this).field_n = ((bf) this).field_n + 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (((bf) this).field_z < 0) {
              ((bf) this).field_z = ((bf) this).field_z + 1;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (0 >= ((bf) this).field_n) {
              break L8;
            } else {
              ((bf) this).field_n = ((bf) this).field_n - 1;
              break L8;
            }
          }
          L9: {
            if (0 != ((bf) this).field_q) {
              L10: {
                ((bf) this).field_v = 2;
                if (((bf) this).field_n < -32) {
                  ((bf) this).field_v = ((bf) this).field_v - 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (((bf) this).field_n >= -16) {
                  break L11;
                } else {
                  ((bf) this).field_v = ((bf) this).field_v - 1;
                  break L11;
                }
              }
              L12: {
                if (((bf) this).field_n <= 16) {
                  break L12;
                } else {
                  ((bf) this).field_v = ((bf) this).field_v + 1;
                  break L12;
                }
              }
              if (((bf) this).field_n > 32) {
                ((bf) this).field_v = ((bf) this).field_v + 1;
                break L9;
              } else {
                break L9;
              }
            } else {
              ((bf) this).field_v = 4;
              if (((bf) this).field_n >= -160) {
                if (-100 > ((bf) this).field_n) {
                  ((bf) this).field_v = 1;
                  break L9;
                } else {
                  if (((bf) this).field_n >= -40) {
                    if (((bf) this).field_n < -16) {
                      ((bf) this).field_v = 3;
                      break L9;
                    } else {
                      if (((bf) this).field_n > 160) {
                        ((bf) this).field_v = 8;
                        break L9;
                      } else {
                        if (((bf) this).field_n > 100) {
                          ((bf) this).field_v = 7;
                          break L9;
                        } else {
                          if (((bf) this).field_n > 40) {
                            ((bf) this).field_v = 6;
                            break L9;
                          } else {
                            if (16 >= ((bf) this).field_n) {
                              break L9;
                            } else {
                              ((bf) this).field_v = 5;
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    ((bf) this).field_v = 2;
                    break L9;
                  }
                }
              } else {
                ((bf) this).field_v = 0;
                break L9;
              }
            }
          }
          L13: {
            if (((bf) this).field_z > 0) {
              ((bf) this).field_z = ((bf) this).field_z - 1;
              break L13;
            } else {
              break L13;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void d() {
        L0: {
          L1: {
            if (0 != ui.field_p) {
              break L1;
            } else {
              if (ha.field_d > 0) {
                fi.field_e.field_k = fi.field_e.field_k - 1;
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            ha.field_d = 512;
            if (0 == ui.field_p) {
              ui.field_p = 16;
              break L2;
            } else {
              break L2;
            }
          }
          mj.a(96, 12, 0, 27, 100);
          break L0;
        }
    }

    final static int e(int param0) {
        bl.field_b.a((byte) -71);
        if (!(jh.field_b.d((byte) -62))) {
            int discarded$0 = 125;
            return ck.a();
        }
        if (param0 != 0) {
            return -127;
        }
        return 0;
    }

    private final void a(vi param0, d[] param1, boolean param2, StarCannon param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        d var7 = null;
        int var8 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (0 == ((bf) this).field_v) {
                var5_int = 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((bf) this).field_v != 1) {
                break L2;
              } else {
                var5_int = 1;
                break L2;
              }
            }
            L3: {
              if (((bf) this).field_v == 3) {
                var5_int = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (4 == ((bf) this).field_v) {
                var5_int = 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              tj.field_w = ((bf) this).field_f;
              if (((bf) this).field_k > 0) {
                var6 = 0;
                L6: while (true) {
                  if (var6 >= 4000) {
                    L7: {
                      ((bf) this).field_m = (((bf) this).field_m + 1) % 8;
                      if (((bf) this).field_j <= 0) {
                        break L7;
                      } else {
                        ((bf) this).field_j = ((bf) this).field_j + 1;
                        var6 = qb.field_e;
                        if (var6 != 0) {
                          if (var6 == 1) {
                            this.a(param1, -70, param3, var5_int, param0);
                            break L7;
                          } else {
                            if (var6 != 2) {
                              break L7;
                            } else {
                              this.a(-76, param1, param0, param3);
                              break L7;
                            }
                          }
                        } else {
                          this.a(param3, var5_int, param1, (byte) -52, param0);
                          break L7;
                        }
                      }
                    }
                    ((bf) this).field_r = 0;
                    break L5;
                  } else {
                    L8: {
                      var7 = param1[var6];
                      if (var7 == null) {
                        break L8;
                      } else {
                        if (var7.field_h != 2) {
                          break L8;
                        } else {
                          if (16 <= Math.abs(-var7.field_d + ((bf) this).field_f)) {
                            break L8;
                          } else {
                            if (16 <= Math.abs(-var7.field_q + ((bf) this).field_u)) {
                              break L8;
                            } else {
                              L9: {
                                param1[var6].field_h = 0;
                                param1[var6].field_p = 256;
                                if (ha.field_d <= 0) {
                                  break L9;
                                } else {
                                  if (ui.field_p != 0) {
                                    break L9;
                                  } else {
                                    ((bf) this).field_k = ((bf) this).field_k - param1[var6].field_i;
                                    break L8;
                                  }
                                }
                              }
                              param1[var6].field_p = 16;
                              ui.field_p = 16;
                              ha.field_d = 512;
                              mj.a(96, 12, 0, 27, 100);
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    var6++;
                    continue L6;
                  }
                }
              } else {
                L10: {
                  ((bf) this).field_j = 0;
                  if (((bf) this).field_r != 1) {
                    break L10;
                  } else {
                    mj.a(128, 12, 0, 19, 100);
                    break L10;
                  }
                }
                L11: {
                  ((bf) this).field_r = ((bf) this).field_r + 1;
                  if (((bf) this).field_r >= 128) {
                    break L11;
                  } else {
                    int discarded$12 = -4001;
                    boolean discarded$13 = v.a(new d(-16 + ((bf) this).field_f + sh.b(65, 32), -16 + ((bf) this).field_u - -sh.b(50, 32), sh.b(-127, 64) + 64));
                    int discarded$14 = -4001;
                    boolean discarded$15 = v.a(new d(-24 + ((bf) this).field_f - -sh.b(-126, 48), ((bf) this).field_u - -sh.b(29, 48) - 24, sh.b(47, 64) + 64));
                    int discarded$16 = -4001;
                    boolean discarded$17 = v.a(new d(((bf) this).field_f + sh.b(117, 64) + -32, ((bf) this).field_u + sh.b(29, 64) - 32, sh.b(-30, 64) + 64));
                    int discarded$18 = -4001;
                    boolean discarded$19 = v.a(new d(-16 + ((bf) this).field_f - -sh.b(91, 32), 16 + ((bf) this).field_u + sh.b(17, 32), 64 + sh.b(25, 64)));
                    int discarded$20 = -4001;
                    boolean discarded$21 = v.a(new d(-24 + (((bf) this).field_f - -sh.b(-128, 48)), -40 + ((bf) this).field_u - -sh.b(-127, 48), 64 - -sh.b(96, 64)));
                    int discarded$22 = -4001;
                    boolean discarded$23 = v.a(new d(-16 + (((bf) this).field_f + sh.b(119, 32)), ((bf) this).field_u - -sh.b(-126, 32) + 32, sh.b(19, 64) + 64));
                    break L11;
                  }
                }
                L12: {
                  if (((bf) this).field_r <= 192) {
                    break L12;
                  } else {
                    ((bf) this).field_u = 480;
                    ((bf) this).field_f = 256;
                    if (gj.field_c >= 0) {
                      gj.field_c = gj.field_c - 1;
                      if (gj.field_c < 0) {
                        hh.field_c = 0;
                        dg.field_l = 0;
                        field_w = 0;
                        ha.field_c = 0;
                        mj.a(255, 12, 0, 32, 100);
                        jl.field_j = 5;
                        vb.field_m = 2;
                        ((bf) this).field_r = 256;
                        if (!wk.a(119)) {
                          pg.a(true, (byte) -98);
                          sa.a(nf.field_l + 3 * na.field_a, 23820);
                          fc.field_e = fc.field_e - (ia.field_k << 1);
                          ia.field_k = 0;
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              stackOut_25_0 = -104;
                              stackIn_28_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (0 < ia.field_k) {
                                break L14;
                              } else {
                                stackOut_26_0 = stackIn_26_0;
                                stackIn_29_0 = stackOut_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                if (0 == jg.field_H) {
                                  stackOut_29_0 = stackIn_29_0;
                                  stackOut_29_1 = 0;
                                  stackIn_30_0 = stackOut_29_0;
                                  stackIn_30_1 = stackOut_29_1;
                                  break L13;
                                } else {
                                  stackOut_27_0 = stackIn_27_0;
                                  stackIn_28_0 = stackOut_27_0;
                                  break L14;
                                }
                              }
                            }
                            stackOut_28_0 = stackIn_28_0;
                            stackOut_28_1 = 6;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            break L13;
                          }
                          od.a(stackIn_30_0, stackIn_30_1, false);
                          break L12;
                        }
                      } else {
                        dg.field_l = 0;
                        mj.a(96, 12, 0, 22, 100);
                        mj.a(255, 12, 0, 44, 100);
                        ((bf) this).field_f = 320;
                        tj.field_G = 150;
                        ((bf) this).field_r = 0;
                        ((bf) this).field_u = 580;
                        ha.field_d = 512;
                        ((bf) this).field_k = 1;
                        ui.field_p = 16;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (ah.field_a != null) {
                    ah.field_a.h(6000);
                    ah.field_a = null;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (null == ok.field_tb) {
                    break L16;
                  } else {
                    param0.a((c) (Object) ok.field_tb);
                    ok.field_tb = null;
                    break L16;
                  }
                }
                ((bf) this).field_z = ((bf) this).field_z + 10;
                break L5;
              }
            }
            this.b((byte) -24);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5;
            stackOut_61_1 = new StringBuilder().append("bf.P(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L17;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L17;
            }
          }
          L18: {
            stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L18;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L18;
            }
          }
          L19: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44).append(1).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param3 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L19;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 41);
        }
    }

    final boolean a(d[] param0, StarCannon param1, int param2) {
        RuntimeException var4 = null;
        int var9 = 0;
        int var14 = 0;
        vi var16 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var16 = jk.field_k;
                        if (param2 > 60) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.b((byte) 102);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = ((bf) this).field_q;
                        if (0 != var9) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalStateException("control fell off non-void method");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var9 != 22) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new IllegalStateException("control fell off non-void method");
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 == 17) {
                            statePc = -1;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var9 == 18) {
                            statePc = -1;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 != 19) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        return true;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        switch (var9) {
                            case 1: statePc = -1; break;
                            case 2: statePc = -1; break;
                            case 3: statePc = -1; break;
                            case 4: statePc = -1; break;
                            case 5: statePc = -1; break;
                            case 6: statePc = -1; break;
                            case 7: statePc = -1; break;
                            case 8: statePc = -1; break;
                            case 9: statePc = -1; break;
                            case 10: statePc = -1; break;
                            case 11: statePc = -1; break;
                            case 12: statePc = -1; break;
                            case 21: statePc = -1; break;
                            case 13: statePc = -1; break;
                            case 14: statePc = -1; break;
                            case 15: statePc = -1; break;
                            case 16: statePc = -1; break;
                            default: statePc = 12; break;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    var4 = (RuntimeException) (Object) caughtException;
                    stackOut_14_0 = (RuntimeException) var4;
                    stackOut_14_1 = new StringBuilder().append("bf.J(");
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "{...}";
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                    stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (param1 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "{...}";
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(StarCannon param0, int param1, d[] param2, byte param3, vi param4) {
        int var6_int = 0;
        int var7 = 0;
        L0: {
          var7 = StarCannon.field_A;
          var6_int = sd.field_c;
          if (0 != var6_int) {
            L1: {
              if (var6_int != 1) {
                if (var6_int != 2) {
                  if (var6_int != 3) {
                    if (4 == var6_int) {
                      if (((bf) this).field_j < 5) {
                        break L1;
                      } else {
                        this.a(65535, -13, -256, -16 - -param1, -48, 1, param2, -116);
                        this.a(65535, -13, -256, 8 + -param1, 48, 1, param2, -120);
                        this.a(65535, -18, -256, param1 + -11, 8, 1, param2, -59);
                        this.a(65535, -18, -256, -param1 + 3, -8, 1, param2, -67);
                        mj.a(dg.field_l * 3 / 5, 12, 0, 12, 67);
                        ((bf) this).field_j = 0;
                        break L0;
                      }
                    } else {
                      if (var6_int == 5) {
                        if (((bf) this).field_j < 5) {
                          break L1;
                        } else {
                          this.a(65535, -7, -256, -16 - -param1, -48, 1, param2, -62);
                          this.a(-26, 65535, param2, -107, 8, -384, 2, 1, -12 - -param1);
                          this.a(-26, 65535, param2, -119, -8, -384, 2, 1, 3 - param1);
                          this.a(65535, -7, -256, -param1 + 8, 48, 1, param2, -90);
                          mj.a(7 * dg.field_l / 10, 12, 0, 11, 67);
                          ((bf) this).field_j = 0;
                          break L0;
                        }
                      } else {
                        if (6 == var6_int) {
                          if (5 > ((bf) this).field_j) {
                            break L1;
                          } else {
                            this.a(65535, -7, -256, param1 + -20, -48, 1, param2, -123);
                            this.a(-26, 65535, param2, -117, 8, -384, 2, 1, -12 + param1);
                            this.a(65535, -22, -256, -6, -24, 1, param2, -108);
                            this.a(65535, -22, -256, -2, 24, 1, param2, -118);
                            this.a(-26, 65535, param2, -122, -8, -384, 2, 1, -param1 + 3);
                            this.a(65535, -7, -256, -param1 + 12, 48, 1, param2, -82);
                            mj.a(7 * dg.field_l / 10, 12, 0, 12, 67);
                            ((bf) this).field_j = 0;
                            break L0;
                          }
                        } else {
                          if (var6_int != 7) {
                            if (var6_int != 8) {
                              if (var6_int != 9) {
                                if (var6_int != 10) {
                                  if (11 != var6_int) {
                                    if (var6_int != 12) {
                                      if (var6_int == 13) {
                                        L2: {
                                          if (3 == ((bf) this).field_j) {
                                            this.a(-22, 65535, param2, -119, -16, -384, 2, 1, -7);
                                            this.a(-22, 65535, param2, -105, 16, -384, 2, 1, -2);
                                            break L2;
                                          } else {
                                            break L2;
                                          }
                                        }
                                        if (((bf) this).field_j < 5) {
                                          break L1;
                                        } else {
                                          ((bf) this).field_j = 0;
                                          this.a(-6, 65535, param2, -108, -80, -384, 2, 1, param1 + -22);
                                          this.a(-7, 65535, param2, -114, -64, -384, 2, 1, -20 + param1);
                                          this.a(-18, 65535, param2, -119, 8, -384, 2, 1, -12 + param1);
                                          this.a(-22, 16776960, param2, -104, -32, -384, 4, 1, -7);
                                          this.a(-22, 16776960, param2, -117, 32, -384, 4, 1, -2);
                                          this.a(-18, 65535, param2, -112, -8, -384, 2, 1, 3 + -param1);
                                          this.a(-7, 65535, param2, -124, 64, -384, 2, 1, 12 - param1);
                                          this.a(-6, 65535, param2, -113, 80, -384, 2, 1, -param1 + 14);
                                          mj.a(dg.field_l, 12, 0, 11, 50);
                                          break L0;
                                        }
                                      } else {
                                        if (var6_int != 14) {
                                          if (var6_int != 15) {
                                            if (16 == var6_int) {
                                              L3: {
                                                if (3 == ((bf) this).field_j) {
                                                  this.a(-18, 16776960, param2, -115, 4, -384, 1, 1, -12 + param1);
                                                  this.a(-22, 16776960, param2, -126, -16, -384, 4, 1, -7);
                                                  this.a(-22, 16776960, param2, -122, 16, -384, 4, 1, -2);
                                                  this.a(-18, 16776960, param2, -122, -4, -384, 1, 1, -param1 + 3);
                                                  mj.a(dg.field_l >> 1, 12, 0, 12, 50);
                                                  break L3;
                                                } else {
                                                  break L3;
                                                }
                                              }
                                              if (((bf) this).field_j >= 5) {
                                                ((bf) this).field_j = 0;
                                                this.a(-6, 65535, param2, -121, -80, -384, 2, 1, param1 + -22);
                                                this.a(-7, 16776960, param2, -123, -64, -384, 4, 1, -20 - -param1);
                                                this.a(-18, 16776960, param2, -122, 8, -384, 4, 1, -12 + param1);
                                                this.a(-22, 16776960, param2, -121, -32, -384, 4, 1, -7);
                                                this.a(-22, 16776960, param2, -113, 32, -384, 4, 1, -2);
                                                this.a(-18, 16776960, param2, -116, -8, -384, 4, 1, 3 + -param1);
                                                this.a(-7, 16776960, param2, -116, 64, -384, 4, 1, 12 + -param1);
                                                this.a(-6, 65535, param2, -126, 80, -384, 2, 1, 14 - param1);
                                                mj.a(dg.field_l, 12, 0, 11, 50);
                                                break L0;
                                              } else {
                                                break L0;
                                              }
                                            } else {
                                              if (var6_int != 17) {
                                                break L1;
                                              } else {
                                                L4: {
                                                  if (((bf) this).field_j != 3) {
                                                    break L4;
                                                  } else {
                                                    this.a(-22, 16777215, param2, -121, -16, -384, 8, 1, -7);
                                                    this.a(-22, 16777215, param2, -110, 16, -384, 8, 1, -2);
                                                    mj.a(dg.field_l >> 1, 12, 0, 12, 50);
                                                    break L4;
                                                  }
                                                }
                                                if (((bf) this).field_j < 5) {
                                                  break L1;
                                                } else {
                                                  ((bf) this).field_j = 0;
                                                  this.a(-6, 65535, param2, -123, -80, -384, 2, 1, param1 + -22);
                                                  this.a(-7, 16776960, param2, -128, -64, -384, 4, 1, param1 + -20);
                                                  this.a(-18, 16777215, param2, -126, 8, -384, 8, 1, param1 + -12);
                                                  this.a(-22, 16777215, param2, -126, -32, -384, 8, 1, -7);
                                                  this.a(-22, 16777215, param2, -124, 32, -384, 8, 1, -2);
                                                  this.a(-18, 16777215, param2, -113, -8, -384, 8, 1, 3 - param1);
                                                  this.a(-7, 16776960, param2, -120, 64, -384, 4, 1, 12 + -param1);
                                                  this.a(-6, 65535, param2, -104, 80, -384, 2, 1, 14 - param1);
                                                  mj.a(dg.field_l, 12, 0, 11, 50);
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            L5: {
                                              if (3 == ((bf) this).field_j) {
                                                this.a(-22, 65535, param2, -114, -16, -384, 2, 1, -7);
                                                this.a(-22, 65535, param2, -122, 16, -384, 2, 1, -2);
                                                mj.a(2 * dg.field_l / 5, 12, 0, 11, 50);
                                                break L5;
                                              } else {
                                                break L5;
                                              }
                                            }
                                            if (((bf) this).field_j >= 5) {
                                              ((bf) this).field_j = 0;
                                              this.a(-6, 65535, param2, -121, -80, -384, 1, 1, -22 - -param1);
                                              this.a(-7, 16776960, param2, -124, -64, -384, 4, 1, -20 - -param1);
                                              this.a(-18, 16776960, param2, -112, 8, -384, 4, 1, param1 + -12);
                                              this.a(-22, 16776960, param2, -109, -32, -384, 4, 1, -7);
                                              this.a(-22, 16776960, param2, -123, 32, -384, 4, 1, -2);
                                              this.a(-18, 16776960, param2, -121, -8, -384, 4, 1, 3 + -param1);
                                              this.a(-7, 16776960, param2, -108, 64, -384, 4, 1, -param1 + 12);
                                              this.a(-6, 65535, param2, -105, 80, -384, 1, 1, -param1 + 14);
                                              mj.a(dg.field_l * 4 / 5, 12, 0, 12, 50);
                                              break L0;
                                            } else {
                                              break L0;
                                            }
                                          }
                                        } else {
                                          L6: {
                                            if (((bf) this).field_j != 3) {
                                              break L6;
                                            } else {
                                              this.a(-22, 65535, param2, -122, -16, -384, 2, 1, -7);
                                              this.a(-22, 65535, param2, -107, 16, -384, 2, 1, -2);
                                              mj.a(2 * dg.field_l / 5, 12, 0, 12, 50);
                                              break L6;
                                            }
                                          }
                                          if (((bf) this).field_j < 5) {
                                            break L1;
                                          } else {
                                            ((bf) this).field_j = 0;
                                            this.a(-6, 65535, param2, -121, -80, -384, 1, 1, param1 + -22);
                                            this.a(-7, 65535, param2, -106, -64, -384, 2, 1, -20 + param1);
                                            this.a(-18, 16776960, param2, -117, 8, -384, 4, 1, -12 - -param1);
                                            this.a(-22, 16776960, param2, -120, -32, -384, 4, 1, -7);
                                            this.a(-22, 16776960, param2, -122, 32, -384, 4, 1, -2);
                                            this.a(-18, 16776960, param2, -107, -8, -384, 4, 1, 3 - param1);
                                            this.a(-7, 65535, param2, -109, 64, -384, 2, 1, -param1 + 12);
                                            this.a(-6, 65535, param2, -119, 80, -384, 1, 1, 14 + -param1);
                                            mj.a(4 * dg.field_l / 5, 12, 0, 11, 50);
                                            break L0;
                                          }
                                        }
                                      }
                                    } else {
                                      L7: {
                                        if (((bf) this).field_j != 3) {
                                          break L7;
                                        } else {
                                          this.a(-22, 65535, param2, -125, -16, -384, 2, 1, -7);
                                          this.a(-22, 65535, param2, -109, 16, -384, 2, 1, -2);
                                          break L7;
                                        }
                                      }
                                      if (((bf) this).field_j >= 5) {
                                        this.a(-6, 65535, param2, -106, -80, -384, 2, 1, param1 + -22);
                                        this.a(-7, 65535, param2, -111, -64, -384, 2, 1, param1 + -20);
                                        this.a(-18, 65535, param2, -115, 8, -384, 2, 1, param1 + -12);
                                        this.a(-22, 65535, param2, -104, -32, -384, 2, 1, -7);
                                        this.a(-22, 65535, param2, -105, 32, -384, 2, 1, -2);
                                        this.a(-18, 65535, param2, -121, -8, -384, 2, 1, 3 + -param1);
                                        this.a(-7, 65535, param2, -126, 64, -384, 2, 1, -param1 + 12);
                                        this.a(-6, 65535, param2, -113, 80, -384, 2, 1, -param1 + 14);
                                        mj.a(9 * dg.field_l / 10, 12, 0, 12, 50);
                                        ((bf) this).field_j = 0;
                                        break L0;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  } else {
                                    if (5 <= ((bf) this).field_j) {
                                      this.a(-6, 65535, param2, -128, -80, -384, 2, 1, -22 + param1);
                                      this.a(-7, 65535, param2, -128, -64, -384, 2, 1, param1 + -20);
                                      this.a(-18, 65535, param2, -125, 8, -384, 2, 1, -12 + param1);
                                      this.a(-22, 65535, param2, -118, -32, -384, 2, 1, -7);
                                      this.a(-22, 65535, param2, -105, 32, -384, 2, 1, -2);
                                      this.a(-18, 65535, param2, -123, -8, -384, 2, 1, -param1 + 3);
                                      this.a(-7, 65535, param2, -124, 64, -384, 2, 1, -param1 + 12);
                                      this.a(-6, 65535, param2, -108, 80, -384, 2, 1, -param1 + 14);
                                      mj.a(9 * dg.field_l / 10, 12, 0, 11, 50);
                                      ((bf) this).field_j = 0;
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  }
                                } else {
                                  if (5 > ((bf) this).field_j) {
                                    break L1;
                                  } else {
                                    this.a(-6, 65535, param2, -109, -80, -384, 1, 1, -22 + param1);
                                    this.a(-7, 65535, param2, -112, -64, -384, 2, 1, param1 + -20);
                                    this.a(-18, 65535, param2, -116, 8, -384, 2, 1, param1 + -12);
                                    this.a(-22, 65535, param2, -122, -32, -384, 2, 1, -7);
                                    this.a(-22, 65535, param2, -113, 32, -384, 2, 1, -2);
                                    this.a(-18, 65535, param2, -104, -8, -384, 2, 1, 3 - param1);
                                    this.a(-7, 65535, param2, -119, 64, -384, 2, 1, -param1 + 12);
                                    this.a(-6, 65535, param2, -106, 80, -384, 1, 1, 14 + -param1);
                                    mj.a(4 * dg.field_l / 5, 12, 0, 12, 50);
                                    ((bf) this).field_j = 0;
                                    break L0;
                                  }
                                }
                              } else {
                                if (5 > ((bf) this).field_j) {
                                  break L1;
                                } else {
                                  this.a(-6, 65535, param2, -125, -80, -384, 1, 1, -22 - -param1);
                                  this.a(-7, 65535, param2, -124, -64, -384, 1, 1, -20 + param1);
                                  this.a(-18, 65535, param2, -112, 8, -384, 2, 1, param1 + -12);
                                  this.a(-22, 65535, param2, -105, -32, -384, 2, 1, -7);
                                  this.a(-22, 65535, param2, -120, 32, -384, 2, 1, -2);
                                  this.a(-18, 65535, param2, -124, -8, -384, 2, 1, 3 + -param1);
                                  this.a(-7, 65535, param2, -128, 64, -384, 1, 1, -param1 + 12);
                                  this.a(-6, 65535, param2, -106, 80, -384, 1, 1, -param1 + 14);
                                  mj.a(4 * dg.field_l / 5, 12, 0, 11, 50);
                                  ((bf) this).field_j = 0;
                                  break L0;
                                }
                              }
                            } else {
                              if (5 > ((bf) this).field_j) {
                                break L1;
                              } else {
                                this.a(-7, 65535, param2, -115, -64, -384, 2, 1, -20 - -param1);
                                this.a(-18, 65535, param2, -110, 8, -384, 2, 1, param1 + -12);
                                this.a(-22, 65535, param2, -110, -32, -384, 2, 1, -7);
                                this.a(-22, 65535, param2, -121, 32, -384, 2, 1, -2);
                                this.a(-18, 65535, param2, -127, -8, -384, 2, 1, -param1 + 3);
                                this.a(-7, 65535, param2, -110, 64, -384, 2, 1, 12 - param1);
                                mj.a(7 * dg.field_l / 10, 12, 0, 12, 50);
                                ((bf) this).field_j = 0;
                                break L0;
                              }
                            }
                          } else {
                            if (((bf) this).field_j < 5) {
                              break L1;
                            } else {
                              this.a(65535, -7, -256, -20 - -param1, -64, 1, param2, -124);
                              this.a(-18, 65535, param2, -109, 8, -384, 2, 1, param1 + -12);
                              this.a(-22, 65535, param2, -125, -32, -384, 2, 1, -7);
                              this.a(-22, 65535, param2, -114, 32, -384, 2, 1, -2);
                              this.a(-18, 65535, param2, -125, -8, -384, 2, 1, -param1 + 3);
                              this.a(65535, -7, -256, 12 + -param1, 64, 1, param2, -66);
                              mj.a(dg.field_l * 7 / 10, 12, 0, 11, 50);
                              ((bf) this).field_j = 0;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (5 <= ((bf) this).field_j) {
                      this.a(65535, -13, -256, -16 - -param1, -32, 1, param2, -66);
                      this.a(65535, -13, -256, -param1 + 8, 32, 1, param2, -113);
                      this.a(65535, -22, -256, -4, 0, 1, param2, -74);
                      mj.a(dg.field_l * 3 / 5, 12, 0, 11, 67);
                      ((bf) this).field_j = 0;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  if (5 <= ((bf) this).field_j) {
                    this.a(65535, -13, -256, param1 + -16, -16, 1, param2, -84);
                    this.a(65535, -13, -256, -param1 + 8, 16, 1, param2, -109);
                    mj.a(3 * dg.field_l / 5, 12, 0, 12, 75);
                    ((bf) this).field_j = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                L8: {
                  if (((bf) this).field_j != 5) {
                    break L8;
                  } else {
                    this.a(65535, -13, -256, -16 - -param1, -32, 1, param2, -122);
                    this.a(65535, -13, -256, -param1 + 8, 32, 1, param2, -112);
                    break L8;
                  }
                }
                L9: {
                  if (((bf) this).field_j == 10) {
                    this.a(65535, -22, -256, -4, 0, 1, param2, -106);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (((bf) this).field_j % 5 != 0) {
                    break L10;
                  } else {
                    mj.a(3 * dg.field_l / 5, 12, 0, 11, 75);
                    break L10;
                  }
                }
                if (((bf) this).field_j < 10) {
                  break L1;
                } else {
                  ((bf) this).field_j = 0;
                  break L0;
                }
              }
            }
            break L0;
          } else {
            L11: {
              if (((bf) this).field_j != 4) {
                break L11;
              } else {
                this.a(65535, -13, -256, param1 + -16, -16, 1, param2, -99);
                break L11;
              }
            }
            L12: {
              if (((bf) this).field_j != 8) {
                break L12;
              } else {
                this.a(65535, -13, -256, -param1 + 8, 16, 1, param2, -118);
                break L12;
              }
            }
            L13: {
              if ((3 & ((bf) this).field_j) != 0) {
                break L13;
              } else {
                mj.a(dg.field_l >> 1, 12, 0, 12, 75);
                break L13;
              }
            }
            if (8 <= ((bf) this).field_j) {
              ((bf) this).field_j = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, d[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        d var10 = null;
        RuntimeException var10_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param3 <= -103) {
                break L1;
              } else {
                ((bf) this).field_g = -91;
                break L1;
              }
            }
            L2: {
              var10 = new d(((bf) this).field_f - -param8, param0 + ((bf) this).field_u, param4, param5, param1, param7, param6, 0);
              int discarded$12 = -4001;
              if (v.a(var10)) {
                var10.field_a = ((bf) this).field_f;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10_ref;
            stackOut_6_1 = new StringBuilder().append("bf.O(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void a(byte param0, String param1) {
        try {
            int discarded$0 = 8192;
            kl.a(param1);
            int var2_int = 81;
            sc.a(false, (byte) 106, bl.field_c);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "bf.G(" + 79 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, d[] param5, int param6, int param7, int param8, int param9) {
        d var11 = null;
        RuntimeException var11_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var11 = new d(param9, -22 + ((bf) this).field_u, 0, -512, param6, 12, param8, 0);
              int discarded$6 = -4001;
              if (!v.a(var11)) {
                break L1;
              } else {
                var11.field_a = param9;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var11_ref;
            stackOut_3_1 = new StringBuilder().append("bf.F(").append(-512).append(44).append(-22).append(44).append(12).append(44).append(0).append(44).append(0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param5 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param6 + 44 + -11 + 44 + param8 + 44 + param9 + 41);
        }
    }

    private final void a(int param0, d[] param1, vi param2, StarCannon param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = StarCannon.field_A;
        var5_int = ((bf) this).field_f;
        L0: {
          var6 = sd.field_c;
          if (0 != var6) {
            if (var6 != 1) {
              if (var6 == 2) {
                L1: {
                  L2: {
                    if (((bf) this).field_j == 4) {
                      break L2;
                    } else {
                      if (((bf) this).field_j == 8) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 0);
                  break L1;
                }
                L3: {
                  if (((bf) this).field_j != 4) {
                    break L3;
                  } else {
                    mj.a(dg.field_l * 4 / 7, 12, 0, 18, 80);
                    break L3;
                  }
                }
                if (((bf) this).field_j < 8) {
                  break L0;
                } else {
                  ((bf) this).field_j = 0;
                  break L0;
                }
              } else {
                if (var6 != 3) {
                  if (var6 != 4) {
                    if (var6 == 5) {
                      L4: {
                        L5: {
                          if (3 == ((bf) this).field_j) {
                            break L5;
                          } else {
                            if (((bf) this).field_j == 6) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                        break L4;
                      }
                      L6: {
                        if (3 != ((bf) this).field_j) {
                          break L6;
                        } else {
                          mj.a(4 * dg.field_l / 7, 12, 0, 18, 80);
                          break L6;
                        }
                      }
                      if (((bf) this).field_j < 6) {
                        break L0;
                      } else {
                        ((bf) this).field_j = 0;
                        break L0;
                      }
                    } else {
                      if (var6 != 6) {
                        if (var6 != 7) {
                          if (var6 == 8) {
                            L7: {
                              if (((bf) this).field_j != 2) {
                                break L7;
                              } else {
                                this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -4);
                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 4);
                                mj.a(dg.field_l * 4 / 7, 12, 0, 18, 50);
                                break L7;
                              }
                            }
                            L8: {
                              if (5 == ((bf) this).field_j) {
                                this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                                this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (((bf) this).field_j >= 5) {
                              ((bf) this).field_j = 0;
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            if (var6 == 9) {
                              L9: {
                                if (2 == ((bf) this).field_j) {
                                  this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 0);
                                  mj.a(4 * dg.field_l / 7, 12, 0, 16, 50);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if (((bf) this).field_j == 4) {
                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (((bf) this).field_j < 4) {
                                break L0;
                              } else {
                                ((bf) this).field_j = 0;
                                break L0;
                              }
                            } else {
                              if (var6 != 10) {
                                if (11 == var6) {
                                  L11: {
                                    if (((bf) this).field_j != 2) {
                                      break L11;
                                    } else {
                                      this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -8);
                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                      this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 8);
                                      mj.a(dg.field_l, 12, 0, 18, 100);
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (((bf) this).field_j == 4) {
                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (((bf) this).field_j < 4) {
                                    break L0;
                                  } else {
                                    ((bf) this).field_j = 0;
                                    break L0;
                                  }
                                } else {
                                  if (var6 == 12) {
                                    L13: {
                                      if (((bf) this).field_j == 2) {
                                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -8);
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 8);
                                        mj.a(dg.field_l * 4 / 7, 12, 0, 16, 50);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (4 != ((bf) this).field_j) {
                                        break L14;
                                      } else {
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                        break L14;
                                      }
                                    }
                                    if (((bf) this).field_j >= 4) {
                                      ((bf) this).field_j = 0;
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  } else {
                                    if (var6 == 13) {
                                      L15: {
                                        if (((bf) this).field_j == 2) {
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                          mj.a(dg.field_l * 4 / 7, 12, 0, 17, 50);
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if (4 != ((bf) this).field_j) {
                                          break L16;
                                        } else {
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                          break L16;
                                        }
                                      }
                                      if (((bf) this).field_j >= 4) {
                                        ((bf) this).field_j = 0;
                                        break L0;
                                      } else {
                                        break L0;
                                      }
                                    } else {
                                      if (var6 != 14) {
                                        if (var6 != 15) {
                                          if (var6 == 16) {
                                            L17: {
                                              if (((bf) this).field_j == 2) {
                                                this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, -12);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, 12);
                                                mj.a(4 * dg.field_l / 7, 12, 0, 17, 50);
                                                break L17;
                                              } else {
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              if (((bf) this).field_j == 4) {
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -12);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 12);
                                                break L18;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            if (((bf) this).field_j < 4) {
                                              break L0;
                                            } else {
                                              ((bf) this).field_j = 0;
                                              break L0;
                                            }
                                          } else {
                                            if (17 == var6) {
                                              L19: {
                                                if (2 != ((bf) this).field_j) {
                                                  break L19;
                                                } else {
                                                  this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, -12);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                  this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, 12);
                                                  mj.a(dg.field_l * 3 / 7, 12, 0, 16, 100);
                                                  break L19;
                                                }
                                              }
                                              L20: {
                                                if (((bf) this).field_j == 4) {
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -12);
                                                  this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, -10);
                                                  this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, -6);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                                  this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, -2);
                                                  this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, 2);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                                  this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, 6);
                                                  this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, 10);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 12);
                                                  mj.a(3 * dg.field_l / 7, 12, 0, 16, 50);
                                                  break L20;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              if (((bf) this).field_j >= 4) {
                                                ((bf) this).field_j = 0;
                                                break L0;
                                              } else {
                                                break L0;
                                              }
                                            } else {
                                              break L0;
                                            }
                                          }
                                        } else {
                                          L21: {
                                            if (((bf) this).field_j == 2) {
                                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -12);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 12);
                                              mj.a(4 * dg.field_l / 7, 12, 0, 16, 50);
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          L22: {
                                            if (((bf) this).field_j != 4) {
                                              break L22;
                                            } else {
                                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -12);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 12);
                                              break L22;
                                            }
                                          }
                                          if (((bf) this).field_j < 4) {
                                            break L0;
                                          } else {
                                            ((bf) this).field_j = 0;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        L23: {
                                          if (2 != ((bf) this).field_j) {
                                            break L23;
                                          } else {
                                            this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -12);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                            this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 12);
                                            mj.a(dg.field_l * 4 / 7, 12, 0, 18, 50);
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (4 == ((bf) this).field_j) {
                                            this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -12);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                            this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 12);
                                            break L24;
                                          } else {
                                            break L24;
                                          }
                                        }
                                        if (4 <= ((bf) this).field_j) {
                                          ((bf) this).field_j = 0;
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L25: {
                                  if (((bf) this).field_j == 2) {
                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                    mj.a(dg.field_l * 4 / 7, 12, 0, 17, 50);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                L26: {
                                  if (4 != ((bf) this).field_j) {
                                    break L26;
                                  } else {
                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                    break L26;
                                  }
                                }
                                if (4 <= ((bf) this).field_j) {
                                  ((bf) this).field_j = 0;
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          L27: {
                            if (2 == ((bf) this).field_j) {
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                              mj.a(dg.field_l * 4 / 7, 12, 0, 17, 80);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (((bf) this).field_j != 4) {
                              break L28;
                            } else {
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                              break L28;
                            }
                          }
                          if (((bf) this).field_j < 4) {
                            break L0;
                          } else {
                            ((bf) this).field_j = 0;
                            break L0;
                          }
                        }
                      } else {
                        L29: {
                          if (((bf) this).field_j != 2) {
                            break L29;
                          } else {
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                            mj.a(dg.field_l * 4 / 7, 12, 0, 16, 75);
                            break L29;
                          }
                        }
                        L30: {
                          if (((bf) this).field_j != 5) {
                            break L30;
                          } else {
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                            break L30;
                          }
                        }
                        if (((bf) this).field_j >= 5) {
                          ((bf) this).field_j = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    L31: {
                      if (((bf) this).field_j != 2) {
                        break L31;
                      } else {
                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                        mj.a(dg.field_l * 3 / 7, 12, 0, 17, 80);
                        break L31;
                      }
                    }
                    L32: {
                      if (4 == ((bf) this).field_j) {
                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    if (((bf) this).field_j < 4) {
                      break L0;
                    } else {
                      ((bf) this).field_j = 0;
                      break L0;
                    }
                  }
                } else {
                  L33: {
                    if (2 == ((bf) this).field_j) {
                      mj.a(4 * dg.field_l / 7, 12, 0, 16, 80);
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  L34: {
                    L35: {
                      if (3 == ((bf) this).field_j) {
                        break L35;
                      } else {
                        if (((bf) this).field_j != 6) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -4);
                    this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 4);
                    break L34;
                  }
                  if (((bf) this).field_j < 6) {
                    break L0;
                  } else {
                    ((bf) this).field_j = 0;
                    break L0;
                  }
                }
              }
            } else {
              L36: {
                L37: {
                  if (((bf) this).field_j == 3) {
                    break L37;
                  } else {
                    if (((bf) this).field_j != 6) {
                      break L36;
                    } else {
                      break L37;
                    }
                  }
                }
                this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 0);
                break L36;
              }
              L38: {
                if (((bf) this).field_j != 3) {
                  break L38;
                } else {
                  mj.a(dg.field_l * 4 / 7, 12, 0, 17, 80);
                  break L38;
                }
              }
              if (((bf) this).field_j < 6) {
                break L0;
              } else {
                ((bf) this).field_j = 0;
                break L0;
              }
            }
          } else {
            L39: {
              L40: {
                if (((bf) this).field_j == 4) {
                  break L40;
                } else {
                  if (((bf) this).field_j != 8) {
                    break L39;
                  } else {
                    break L40;
                  }
                }
              }
              this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 0);
              break L39;
            }
            L41: {
              if (((bf) this).field_j == 4) {
                mj.a(dg.field_l * 4 / 7, 12, 0, 16, 50);
                break L41;
              } else {
                break L41;
              }
            }
            if (((bf) this).field_j < 8) {
              break L0;
            } else {
              ((bf) this).field_j = 0;
              break L0;
            }
          }
        }
        ((bf) this).field_f = var5_int;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, d[] param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, param0, param6, -108, param4, param2, 1, param5, param3);
              if (param7 <= -54) {
                break L1;
              } else {
                ((bf) this).field_t = -2;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bf.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param7 + 41);
        }
    }

    final static int a(int param0, boolean param1, String param2, byte param3, ma param4, ma param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        CharSequence var14 = null;
        int stackIn_4_0 = 0;
        rb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        rb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        rb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        rb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        rb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        rb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        rb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_8_2 = null;
        rb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        rb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        rb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        int stackOut_30_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        try {
          L0: {
            L1: {
              var13 = param5.b(123);
              var8 = param4.b(123);
              if (m.field_b != null) {
                break L1;
              } else {
                if (!jh.a((byte) -68, false)) {
                  stackOut_3_0 = -1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (r.field_c != ua.field_b) {
                break L2;
              } else {
                L3: {
                  d.field_b.field_g = 0;
                  oj.field_g = null;
                  if (param2 != null) {
                    L4: {
                      var9 = 0;
                      if (!param1) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      ck.field_g.field_g = 0;
                      ck.field_g.c((byte) -113, di.field_l.nextInt());
                      ck.field_g.c((byte) -125, di.field_l.nextInt());
                      ck.field_g.a(false, var13);
                      ck.field_g.a(false, var8);
                      var14 = (CharSequence) (Object) param2;
                      ck.field_g.a(false, cc.a(20755, var14));
                      ck.field_g.c(param6, -306);
                      ck.field_g.a(param0, -127);
                      ck.field_g.a(var9, -107);
                      d.field_b.a(18, -116);
                      d.field_b.field_g = d.field_b.field_g + 2;
                      var10 = d.field_b.field_g;
                      var11_ref_String = uj.a(ll.b(112), 61);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    d.field_b.b(false, var11_ref_String);
                    int discarded$8 = 0;
                    fc.a(ck.field_g, (rb) (Object) d.field_b, ed.field_j, gg.field_e);
                    d.field_b.a((byte) 88, -var10 + d.field_b.field_g);
                    break L3;
                  } else {
                    L6: {
                      ck.field_g.field_g = 0;
                      ck.field_g.c((byte) -86, di.field_l.nextInt());
                      ck.field_g.c((byte) -95, di.field_l.nextInt());
                      stackOut_7_0 = ck.field_g;
                      stackOut_7_1 = 0;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (param5.c(0)) {
                        stackOut_9_0 = (rb) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = (String) var13;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L6;
                      } else {
                        stackOut_8_0 = (rb) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = "";
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L6;
                      }
                    }
                    L7: {
                      ((rb) (Object) stackIn_10_0).a(stackIn_10_1 != 0, stackIn_10_2);
                      stackOut_10_0 = ck.field_g;
                      stackOut_10_1 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (param4.c(0)) {
                        stackOut_12_0 = (rb) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = (String) var8;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L7;
                      } else {
                        stackOut_11_0 = (rb) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = "";
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L7;
                      }
                    }
                    ((rb) (Object) stackIn_13_0).a(stackIn_13_1 != 0, stackIn_13_2);
                    d.field_b.a(16, -58);
                    d.field_b.field_g = d.field_b.field_g + 1;
                    var9 = d.field_b.field_g;
                    int discarded$9 = 0;
                    fc.a(ck.field_g, (rb) (Object) d.field_b, ed.field_j, gg.field_e);
                    d.field_b.b(d.field_b.field_g - var9, 31700);
                    break L3;
                  }
                }
                nf.a(-1, (byte) 95);
                r.field_c = eb.field_a;
                break L2;
              }
            }
            L8: {
              if (eb.field_a != r.field_c) {
                break L8;
              } else {
                if (!ag.a(124, 1)) {
                  break L8;
                } else {
                  L9: {
                    var9 = se.field_p.j(7909);
                    se.field_p.field_g = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        r.field_c = dh.field_a;
                        ph.field_nb = new String[var9 - 100];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    mi.a(1048576, ll.b(107));
                    uj.field_r = vk.field_x;
                    int discarded$10 = 27;
                    ec.a();
                    eb.field_f = false;
                    stackOut_30_0 = var9;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  } else {
                    if (var9 != 99) {
                      r.field_c = ab.field_F;
                      il.field_g = -1;
                      vh.field_t = var9;
                      break L8;
                    } else {
                      boolean discarded$11 = ag.a(124, gd.a(true));
                      int discarded$12 = 0;
                      oj.field_g = new Boolean(vf.a((rb) (Object) se.field_p));
                      se.field_p.field_g = 0;
                      break L8;
                    }
                  }
                }
              }
            }
            L10: {
              if (dh.field_a != r.field_c) {
                break L10;
              } else {
                var9 = 2;
                if (!ag.a(125, var9)) {
                  break L10;
                } else {
                  var10 = se.field_p.i(-1174051992);
                  se.field_p.field_g = 0;
                  if (ag.a(126, var10)) {
                    var11 = ph.field_nb.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        int discarded$13 = 27;
                        ec.a();
                        eb.field_f = false;
                        stackOut_40_0 = var11 + 100;
                        stackIn_41_0 = stackOut_40_0;
                        return stackIn_41_0;
                      } else {
                        ph.field_nb[var12] = se.field_p.h(-12287);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
            }
            L12: {
              if (r.field_c != ab.field_F) {
                break L12;
              } else {
                if (fk.a(false)) {
                  L13: {
                    if (255 == vh.field_t) {
                      var9_ref_String = se.field_p.b((byte) -86);
                      if (var9_ref_String == null) {
                        break L13;
                      } else {
                        lj.a(var9_ref_String, 127, ll.b(111));
                        break L13;
                      }
                    } else {
                      uj.field_r = se.field_p.a(-125);
                      break L13;
                    }
                  }
                  int discarded$14 = 27;
                  ec.a();
                  eb.field_f = false;
                  stackOut_49_0 = vh.field_t;
                  stackIn_50_0 = stackOut_49_0;
                  return stackIn_50_0;
                } else {
                  break L12;
                }
              }
            }
            L14: {
              if (null == m.field_b) {
                if (eb.field_f) {
                  L15: {
                    int discarded$15 = -71;
                    if (30000L >= kg.b()) {
                      uj.field_r = va.field_o;
                      break L15;
                    } else {
                      uj.field_r = ti.field_g;
                      break L15;
                    }
                  }
                  eb.field_f = false;
                  stackOut_58_0 = 249;
                  stackIn_59_0 = stackOut_58_0;
                  return stackIn_59_0;
                } else {
                  var9 = sj.field_I;
                  sj.field_I = pe.field_c;
                  eb.field_f = true;
                  pe.field_c = var9;
                  break L14;
                }
              } else {
                break L14;
              }
            }
            stackOut_60_0 = -1;
            stackIn_61_0 = stackOut_60_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var7;
            stackOut_62_1 = new StringBuilder().append("bf.H(").append(param0).append(44).append(param1).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param2 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L16;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L16;
            }
          }
          L17: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(44).append(6).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param4 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L17;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L17;
            }
          }
          L18: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param5 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param6 + 41);
        }
        return stackIn_61_0;
    }

    public static void a() {
        field_x = null;
        field_y = null;
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        CharSequence var9 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        String stackOut_22_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (0 != param0) {
              if (1 == param0) {
                var9 = param3[0];
                var4 = var9;
                if (var4 != null) {
                  stackOut_8_0 = ((Object) (Object) var9).toString();
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  stackOut_6_0 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              } else {
                var4_int = param0;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        stackOut_22_0 = var6.toString();
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param3[var7];
                          if (var8 != null) {
                            StringBuilder discarded$5 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param3[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_1_0 = "";
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4_ref;
            stackOut_24_1 = new StringBuilder().append("bf.I(").append(param0).append(44).append(0).append(44).append(4).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_23_0;
    }

    private final void a(d[] param0, int param1, StarCannon param2, int param3, vi param4) {
        int var6_int = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = StarCannon.field_A;
            var6_int = sd.field_c;
            if (var6_int != 0) {
              if (var6_int != 1) {
                if (var6_int == 2) {
                  L2: {
                    if (((bf) this).field_j == 4) {
                      this.a(-11, 65280, param0, -128, -32, -64, 2, 11, -param3 + -12);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (6 != ((bf) this).field_j) {
                      break L3;
                    } else {
                      this.a(-11, 65280, param0, -113, 32, -64, 2, 11, 4 + -param3);
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (((bf) this).field_j == 4) {
                        break L5;
                      } else {
                        if (6 == ((bf) this).field_j) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    mj.a(dg.field_l * 3 / 10, 12, 0, 13, 40);
                    break L4;
                  }
                  if (((bf) this).field_j >= 10) {
                    ((bf) this).field_j = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (var6_int == 3) {
                    L6: {
                      if (((bf) this).field_j == 8) {
                        this.a(-11, 65280, param0, -104, -32, -64, 2, 11, -12 + -param3);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (((bf) this).field_j != 12) {
                        break L7;
                      } else {
                        this.a(-11, 65280, param0, -106, 32, -64, 2, 11, -param3 + 4);
                        break L7;
                      }
                    }
                    L8: {
                      if (10 == ((bf) this).field_j) {
                        this.a(-9, 65280, param0, -109, -128, -16, 2, 11, -param3 + -16);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (((bf) this).field_j != 14) {
                        break L9;
                      } else {
                        this.a(-9, 65280, param0, -112, 128, -16, 2, 11, -param3 + 8);
                        break L9;
                      }
                    }
                    L10: {
                      if (((bf) this).field_j != 16) {
                        break L10;
                      } else {
                        this.a(-10, 65280, param0, -128, -96, -32, 2, 11, -14 - param3);
                        break L10;
                      }
                    }
                    L11: {
                      if (20 != ((bf) this).field_j) {
                        break L11;
                      } else {
                        this.a(-10, 65280, param0, -107, 96, -32, 2, 11, -param3 + 6);
                        break L11;
                      }
                    }
                    L12: {
                      if (0 != (3 & ((bf) this).field_j)) {
                        break L12;
                      } else {
                        if (((bf) this).field_j > 4) {
                          mj.a(2 * dg.field_l / 5, 12, 0, 14, 50);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (((bf) this).field_j >= 20) {
                      ((bf) this).field_j = 0;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    if (var6_int != 4) {
                      if (var6_int == 5) {
                        L13: {
                          if (((bf) this).field_j == 4) {
                            this.a(-11, 65280, param0, -120, -32, -64, 2, 11, -param3 + -12);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (((bf) this).field_j != 5) {
                            break L14;
                          } else {
                            this.a(-9, 65280, param0, -112, -128, -16, 2, 11, -16 + -param3);
                            break L14;
                          }
                        }
                        L15: {
                          if (((bf) this).field_j != 6) {
                            break L15;
                          } else {
                            this.a(-11, 65280, param0, -118, 32, -64, 2, 11, -param3 + 4);
                            break L15;
                          }
                        }
                        L16: {
                          if (((bf) this).field_j == 7) {
                            this.a(-9, 65280, param0, -104, 128, -16, 2, 11, 8 + -param3);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (((bf) this).field_j != 8) {
                            break L17;
                          } else {
                            this.a(-10, 65280, param0, -122, -96, -32, 2, 11, -param3 + -14);
                            break L17;
                          }
                        }
                        L18: {
                          if (10 == ((bf) this).field_j) {
                            this.a(-10, 65280, param0, -127, 96, -32, 2, 11, 6 - param3);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          L20: {
                            if (((bf) this).field_j == 5) {
                              break L20;
                            } else {
                              if (10 != ((bf) this).field_j) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          mj.a(2 * dg.field_l / 5, 12, 0, 13, 40);
                          break L19;
                        }
                        if (((bf) this).field_j < 10) {
                          break L1;
                        } else {
                          ((bf) this).field_j = 0;
                          break L0;
                        }
                      } else {
                        if (var6_int != 6) {
                          if (var6_int == 7) {
                            L21: {
                              if (((bf) this).field_j == 4) {
                                this.a(-11, 16776960, param0, -114, -32, -64, 4, 11, -param3 + -12);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L22: {
                              if (6 == ((bf) this).field_j) {
                                this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, 4 + -param3);
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            L23: {
                              if (((bf) this).field_j == 8) {
                                this.a(-10, 16776960, param0, -115, -96, -32, 4, 11, -14 + -param3);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            L24: {
                              if (((bf) this).field_j != 10) {
                                break L24;
                              } else {
                                this.a(-10, 16776960, param0, -108, 96, -32, 4, 11, 6 + -param3);
                                break L24;
                              }
                            }
                            L25: {
                              if (5 != ((bf) this).field_j) {
                                break L25;
                              } else {
                                this.a(-9, 65280, param0, -121, -128, -16, 2, 11, -param3 + -16);
                                break L25;
                              }
                            }
                            L26: {
                              if (((bf) this).field_j == 7) {
                                this.a(-9, 65280, param0, -117, 128, -16, 2, 11, 8 - param3);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            L27: {
                              L28: {
                                if (((bf) this).field_j == 5) {
                                  break L28;
                                } else {
                                  if (((bf) this).field_j == 10) {
                                    break L28;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              mj.a(2 * dg.field_l / 5, 12, 0, 15, 60);
                              break L27;
                            }
                            if (((bf) this).field_j < 10) {
                              break L1;
                            } else {
                              ((bf) this).field_j = 0;
                              break L0;
                            }
                          } else {
                            if (var6_int != 8) {
                              if (var6_int != 9) {
                                if (10 != var6_int) {
                                  if (var6_int == 11) {
                                    L29: {
                                      if (((bf) this).field_j == 4) {
                                        this.a(-11, 16776960, param0, -125, -32, -64, 4, 11, -param3 + -12);
                                        this.a(-9, 16776960, param0, -116, -128, -16, 4, 11, -16 + -param3);
                                        this.a(-7, 65280, param0, -115, -256, 0, 2, 11, -20 - param3);
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    L30: {
                                      if (((bf) this).field_j == 6) {
                                        this.a(-11, 16776960, param0, -106, 32, -64, 4, 11, 4 - param3);
                                        this.a(-9, 16776960, param0, -105, 128, -16, 4, 11, -param3 + 8);
                                        this.a(-7, 65280, param0, -120, 256, 0, 2, 11, -param3 + 12);
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                    L31: {
                                      if (((bf) this).field_j != 8) {
                                        break L31;
                                      } else {
                                        this.a(-10, 16776960, param0, -111, -96, -32, 4, 11, -14 + -param3);
                                        this.a(-8, 16776960, param0, -124, -192, -8, 4, 11, -param3 + -18);
                                        break L31;
                                      }
                                    }
                                    L32: {
                                      if (10 != ((bf) this).field_j) {
                                        break L32;
                                      } else {
                                        this.a(-10, 16776960, param0, -127, 96, -32, 4, 11, 6 - param3);
                                        this.a(-8, 16776960, param0, -123, 192, -8, 4, 11, -param3 + 10);
                                        break L32;
                                      }
                                    }
                                    L33: {
                                      L34: {
                                        if (((bf) this).field_j == 5) {
                                          break L34;
                                        } else {
                                          if (((bf) this).field_j == 10) {
                                            break L34;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                      mj.a(dg.field_l >> 1, 12, 0, 13, 30);
                                      break L33;
                                    }
                                    if (((bf) this).field_j < 10) {
                                      break L1;
                                    } else {
                                      ((bf) this).field_j = 0;
                                      break L0;
                                    }
                                  } else {
                                    if (var6_int != 12) {
                                      if (var6_int != 13) {
                                        if (var6_int != 14) {
                                          if (var6_int == 15) {
                                            L35: {
                                              if (2 == ((bf) this).field_j) {
                                                this.a(-11, 16776960, param0, -127, -32, -64, 4, 11, -12 - param3);
                                                this.a(-11, 16776960, param0, -116, 32, -64, 4, 11, -param3 + 4);
                                                this.a(-9, 65280, param0, -119, -128, -16, 2, 11, -param3 + -16);
                                                this.a(-9, 65280, param0, -110, 128, -16, 2, 11, 8 + -param3);
                                                break L35;
                                              } else {
                                                break L35;
                                              }
                                            }
                                            L36: {
                                              if (3 == ((bf) this).field_j) {
                                                this.a(-10, 65280, param0, -108, -96, -32, 2, 11, -param3 + -14);
                                                this.a(-10, 65280, param0, -104, 96, -32, 2, 11, 6 - param3);
                                                this.a(-11, 65280, param0, -123, -32, -64, 2, 11, -12 + -param3);
                                                this.a(-9, 65280, param0, -125, -256, 0, 2, 11, -param3 + -16);
                                                break L36;
                                              } else {
                                                break L36;
                                              }
                                            }
                                            L37: {
                                              if (4 == ((bf) this).field_j) {
                                                this.a(-11, 65280, param0, -104, 32, -64, 2, 11, -param3 + 4);
                                                this.a(-10, 65280, param0, -106, -192, -8, 2, 11, -14 - param3);
                                                this.a(-9, 65280, param0, -118, 256, 0, 2, 11, 8 - param3);
                                                break L37;
                                              } else {
                                                break L37;
                                              }
                                            }
                                            L38: {
                                              if (((bf) this).field_j != 5) {
                                                break L38;
                                              } else {
                                                this.a(-10, 65280, param0, -104, 192, -8, 2, 11, -param3 + 6);
                                                this.a(-11, 65280, param0, -105, -64, -48, 1, 11, -param3 + -13);
                                                this.a(-11, 65280, param0, -112, 64, -48, 1, 11, 5 + -param3);
                                                break L38;
                                              }
                                            }
                                            L39: {
                                              if (((bf) this).field_j != 5) {
                                                break L39;
                                              } else {
                                                mj.a(dg.field_l >> 1, 12, 0, 14, 40);
                                                break L39;
                                              }
                                            }
                                            if (5 <= ((bf) this).field_j) {
                                              ((bf) this).field_j = 0;
                                              break L0;
                                            } else {
                                              break L0;
                                            }
                                          } else {
                                            if (var6_int == 16) {
                                              L40: {
                                                if (((bf) this).field_j != 2) {
                                                  break L40;
                                                } else {
                                                  this.a(-11, 16776960, param0, -104, -32, -64, 4, 11, -param3 + -12);
                                                  this.a(-11, 16776960, param0, -116, 32, -64, 4, 11, -param3 + 4);
                                                  this.a(-9, 65280, param0, -110, -128, -16, 2, 11, -param3 + -16);
                                                  this.a(-9, 65280, param0, -122, 128, -16, 2, 11, 8 + -param3);
                                                  break L40;
                                                }
                                              }
                                              L41: {
                                                if (3 == ((bf) this).field_j) {
                                                  this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -param3 + -14);
                                                  this.a(-10, 16776960, param0, -104, 96, -32, 4, 11, 6 - param3);
                                                  this.a(-11, 65280, param0, -124, -32, -64, 2, 11, -param3 + -12);
                                                  this.a(-9, 65280, param0, -115, -256, 0, 2, 11, -16 - param3);
                                                  break L41;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                              L42: {
                                                if (((bf) this).field_j == 4) {
                                                  this.a(-11, 65280, param0, -114, 32, -64, 2, 11, 4 - param3);
                                                  this.a(-10, 65280, param0, -115, -192, -8, 2, 11, -14 + -param3);
                                                  this.a(-9, 65280, param0, -119, 256, 0, 2, 11, -param3 + 8);
                                                  break L42;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                              L43: {
                                                if (((bf) this).field_j == 5) {
                                                  this.a(-10, 65280, param0, -104, 192, -8, 2, 11, 6 - param3);
                                                  this.a(-11, 65280, param0, -114, -64, -48, 1, 11, -13 - param3);
                                                  this.a(-11, 65280, param0, -105, 64, -48, 1, 11, 5 + -param3);
                                                  break L43;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                              L44: {
                                                if (5 != ((bf) this).field_j) {
                                                  break L44;
                                                } else {
                                                  mj.a(dg.field_l >> 1, 12, 0, 15, 60);
                                                  break L44;
                                                }
                                              }
                                              if (((bf) this).field_j >= 5) {
                                                ((bf) this).field_j = 0;
                                                break L0;
                                              } else {
                                                break L0;
                                              }
                                            } else {
                                              if (var6_int != 17) {
                                                break L1;
                                              } else {
                                                L45: {
                                                  if (((bf) this).field_j != 2) {
                                                    break L45;
                                                  } else {
                                                    this.a(-11, 16777215, param0, -106, -32, -64, 8, 11, -param3 + -12);
                                                    break L45;
                                                  }
                                                }
                                                L46: {
                                                  if (((bf) this).field_j != 2) {
                                                    break L46;
                                                  } else {
                                                    this.a(-11, 16777215, param0, -108, 32, -64, 8, 11, 4 + -param3);
                                                    break L46;
                                                  }
                                                }
                                                L47: {
                                                  if (((bf) this).field_j == 3) {
                                                    this.a(-10, 16777215, param0, -110, -96, -32, 8, 11, -param3 + -14);
                                                    break L47;
                                                  } else {
                                                    break L47;
                                                  }
                                                }
                                                L48: {
                                                  if (((bf) this).field_j == 3) {
                                                    this.a(-10, 16777215, param0, -123, 96, -32, 8, 11, -param3 + 6);
                                                    break L48;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                                L49: {
                                                  if (((bf) this).field_j == 2) {
                                                    this.a(-9, 16776960, param0, -124, -128, -16, 4, 11, -16 + -param3);
                                                    break L49;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                                L50: {
                                                  if (((bf) this).field_j != 2) {
                                                    break L50;
                                                  } else {
                                                    this.a(-9, 16776960, param0, -113, 128, -16, 4, 11, 8 - param3);
                                                    break L50;
                                                  }
                                                }
                                                L51: {
                                                  if (3 == ((bf) this).field_j) {
                                                    this.a(-11, 16776960, param0, -109, -32, -64, 4, 11, -param3 + -12);
                                                    break L51;
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                                L52: {
                                                  if (((bf) this).field_j != 4) {
                                                    break L52;
                                                  } else {
                                                    this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, 4 + -param3);
                                                    break L52;
                                                  }
                                                }
                                                L53: {
                                                  if (((bf) this).field_j != 4) {
                                                    break L53;
                                                  } else {
                                                    this.a(-10, 65280, param0, -113, -192, -8, 2, 11, -param3 + -14);
                                                    break L53;
                                                  }
                                                }
                                                L54: {
                                                  if (((bf) this).field_j != 5) {
                                                    break L54;
                                                  } else {
                                                    this.a(-10, 65280, param0, -117, 192, -8, 2, 11, -param3 + 6);
                                                    break L54;
                                                  }
                                                }
                                                L55: {
                                                  if (((bf) this).field_j == 3) {
                                                    this.a(-9, 65280, param0, -110, -256, 0, 2, 11, -param3 + -16);
                                                    break L55;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                                L56: {
                                                  if (4 != ((bf) this).field_j) {
                                                    break L56;
                                                  } else {
                                                    this.a(-9, 65280, param0, -121, 256, 0, 2, 11, 8 + -param3);
                                                    break L56;
                                                  }
                                                }
                                                L57: {
                                                  if (5 == ((bf) this).field_j) {
                                                    mj.a(dg.field_l >> 1, 12, 0, 13, 30);
                                                    break L57;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                                if (((bf) this).field_j < 5) {
                                                  break L1;
                                                } else {
                                                  ((bf) this).field_j = 0;
                                                  break L0;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L58: {
                                            if (((bf) this).field_j != 2) {
                                              break L58;
                                            } else {
                                              this.a(-11, 65280, param0, -115, -32, -64, 2, 11, -param3 + -12);
                                              this.a(-11, 65280, param0, -119, 32, -64, 2, 11, -param3 + 4);
                                              this.a(-9, 65280, param0, -108, -128, -16, 2, 11, -param3 + -16);
                                              this.a(-9, 65280, param0, -110, 128, -16, 2, 11, 8 + -param3);
                                              break L58;
                                            }
                                          }
                                          L59: {
                                            if (((bf) this).field_j == 3) {
                                              this.a(-10, 65280, param0, -127, -96, -32, 2, 11, -param3 + -14);
                                              this.a(-10, 65280, param0, -119, 96, -32, 2, 11, 6 - param3);
                                              this.a(-11, 65280, param0, -105, -32, -64, 2, 11, -param3 + -12);
                                              this.a(-9, 65280, param0, -122, -256, 0, 2, 11, -param3 + -16);
                                              break L59;
                                            } else {
                                              break L59;
                                            }
                                          }
                                          L60: {
                                            if (((bf) this).field_j != 4) {
                                              break L60;
                                            } else {
                                              this.a(-11, 65280, param0, -125, 32, -64, 2, 11, -param3 + 4);
                                              this.a(-10, 65280, param0, -108, -192, -8, 2, 11, -14 - param3);
                                              this.a(-9, 65280, param0, -118, 256, 0, 2, 11, 8 + -param3);
                                              break L60;
                                            }
                                          }
                                          L61: {
                                            if (((bf) this).field_j == 5) {
                                              this.a(-10, 65280, param0, -127, 192, -8, 2, 11, -param3 + 6);
                                              this.a(-11, 65280, param0, -120, -64, -48, 1, 11, -param3 + -13);
                                              this.a(-11, 65280, param0, -106, 64, -48, 1, 11, 5 + -param3);
                                              break L61;
                                            } else {
                                              break L61;
                                            }
                                          }
                                          L62: {
                                            if (((bf) this).field_j != 5) {
                                              break L62;
                                            } else {
                                              mj.a(dg.field_l >> 1, 12, 0, 13, 30);
                                              break L62;
                                            }
                                          }
                                          if (((bf) this).field_j >= 5) {
                                            ((bf) this).field_j = 0;
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      } else {
                                        L63: {
                                          if (((bf) this).field_j != 2) {
                                            break L63;
                                          } else {
                                            this.a(-11, 16776960, param0, -113, -32, -64, 4, 11, -param3 + -12);
                                            this.a(-9, 16776960, param0, -108, -128, -16, 4, 11, -param3 + -16);
                                            break L63;
                                          }
                                        }
                                        L64: {
                                          if (3 == ((bf) this).field_j) {
                                            this.a(-11, 16776960, param0, -116, 32, -64, 4, 11, 4 - param3);
                                            this.a(-9, 16776960, param0, -123, 128, -16, 4, 11, 8 - param3);
                                            break L64;
                                          } else {
                                            break L64;
                                          }
                                        }
                                        L65: {
                                          if (4 != ((bf) this).field_j) {
                                            break L65;
                                          } else {
                                            this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -14 - param3);
                                            break L65;
                                          }
                                        }
                                        L66: {
                                          if (5 == ((bf) this).field_j) {
                                            this.a(-10, 16776960, param0, -119, 96, -32, 4, 11, 6 - param3);
                                            break L66;
                                          } else {
                                            break L66;
                                          }
                                        }
                                        L67: {
                                          if (((bf) this).field_j == 7) {
                                            this.a(-11, 16776960, param0, -120, -32, -64, 4, 11, -12 - param3);
                                            this.a(-9, 16776960, param0, -119, -256, 0, 4, 11, -param3 + -16);
                                            break L67;
                                          } else {
                                            break L67;
                                          }
                                        }
                                        L68: {
                                          if (((bf) this).field_j == 8) {
                                            this.a(-11, 16776960, param0, -128, 32, -64, 4, 11, 4 - param3);
                                            this.a(-9, 16776960, param0, -122, 256, 0, 4, 11, -param3 + 8);
                                            break L68;
                                          } else {
                                            break L68;
                                          }
                                        }
                                        L69: {
                                          if (9 != ((bf) this).field_j) {
                                            break L69;
                                          } else {
                                            this.a(-10, 16776960, param0, -109, -192, -8, 4, 11, -param3 + -14);
                                            break L69;
                                          }
                                        }
                                        L70: {
                                          if (((bf) this).field_j == 10) {
                                            this.a(-10, 16776960, param0, -122, 192, -8, 4, 11, -param3 + 6);
                                            break L70;
                                          } else {
                                            break L70;
                                          }
                                        }
                                        L71: {
                                          L72: {
                                            if (((bf) this).field_j == 5) {
                                              break L72;
                                            } else {
                                              if (((bf) this).field_j == 10) {
                                                break L72;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                          mj.a(dg.field_l >> 1, 12, 0, 15, 60);
                                          break L71;
                                        }
                                        if (((bf) this).field_j >= 10) {
                                          ((bf) this).field_j = 0;
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    } else {
                                      L73: {
                                        if (((bf) this).field_j != 2) {
                                          break L73;
                                        } else {
                                          this.a(-11, 16776960, param0, -115, -32, -64, 4, 11, -12 - param3);
                                          this.a(-9, 65280, param0, -118, -128, -16, 2, 11, -param3 + -16);
                                          break L73;
                                        }
                                      }
                                      L74: {
                                        if (((bf) this).field_j != 3) {
                                          break L74;
                                        } else {
                                          this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, -param3 + 4);
                                          this.a(-9, 65280, param0, -110, 128, -16, 2, 11, -param3 + 8);
                                          break L74;
                                        }
                                      }
                                      L75: {
                                        if (((bf) this).field_j == 4) {
                                          this.a(-10, 16776960, param0, -112, -96, -32, 4, 11, -14 - param3);
                                          break L75;
                                        } else {
                                          break L75;
                                        }
                                      }
                                      L76: {
                                        if (((bf) this).field_j != 5) {
                                          break L76;
                                        } else {
                                          this.a(-10, 16776960, param0, -125, 96, -32, 4, 11, 6 + -param3);
                                          break L76;
                                        }
                                      }
                                      L77: {
                                        if (((bf) this).field_j == 7) {
                                          this.a(-11, 16776960, param0, -124, -32, -64, 4, 11, -param3 + -12);
                                          this.a(-9, 65280, param0, -125, -256, 0, 2, 11, -param3 + -16);
                                          break L77;
                                        } else {
                                          break L77;
                                        }
                                      }
                                      L78: {
                                        if (((bf) this).field_j != 8) {
                                          break L78;
                                        } else {
                                          this.a(-11, 16776960, param0, -118, 32, -64, 4, 11, -param3 + 4);
                                          this.a(-9, 65280, param0, -120, 256, 0, 2, 11, -param3 + 8);
                                          break L78;
                                        }
                                      }
                                      L79: {
                                        if (((bf) this).field_j == 9) {
                                          this.a(-10, 16776960, param0, -123, -192, -8, 4, 11, -param3 + -14);
                                          break L79;
                                        } else {
                                          break L79;
                                        }
                                      }
                                      L80: {
                                        if (((bf) this).field_j != 10) {
                                          break L80;
                                        } else {
                                          this.a(-10, 16776960, param0, -104, 192, -8, 4, 11, 6 + -param3);
                                          break L80;
                                        }
                                      }
                                      L81: {
                                        L82: {
                                          if (((bf) this).field_j == 5) {
                                            break L82;
                                          } else {
                                            if (((bf) this).field_j != 10) {
                                              break L81;
                                            } else {
                                              break L82;
                                            }
                                          }
                                        }
                                        mj.a(dg.field_l >> 1, 12, 0, 14, 40);
                                        break L81;
                                      }
                                      if (((bf) this).field_j < 10) {
                                        break L1;
                                      } else {
                                        ((bf) this).field_j = 0;
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  L83: {
                                    if (((bf) this).field_j == 4) {
                                      this.a(-11, 16776960, param0, -124, -32, -64, 4, 11, -param3 + -12);
                                      this.a(-9, 16776960, param0, -115, -128, -16, 4, 11, -param3 + -16);
                                      break L83;
                                    } else {
                                      break L83;
                                    }
                                  }
                                  L84: {
                                    if (6 == ((bf) this).field_j) {
                                      this.a(-11, 16776960, param0, -125, 32, -64, 4, 11, -param3 + 4);
                                      this.a(-9, 16776960, param0, -109, 128, -16, 4, 11, -param3 + 8);
                                      break L84;
                                    } else {
                                      break L84;
                                    }
                                  }
                                  L85: {
                                    if (((bf) this).field_j != 8) {
                                      break L85;
                                    } else {
                                      this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -14 + -param3);
                                      this.a(-8, 65280, param0, -108, -192, -8, 2, 11, -18 - param3);
                                      break L85;
                                    }
                                  }
                                  L86: {
                                    if (((bf) this).field_j != 10) {
                                      break L86;
                                    } else {
                                      this.a(-10, 16776960, param0, -111, 96, -32, 4, 11, -param3 + 6);
                                      this.a(-8, 65280, param0, -128, 192, -8, 2, 11, -param3 + 10);
                                      break L86;
                                    }
                                  }
                                  L87: {
                                    L88: {
                                      if (((bf) this).field_j == 5) {
                                        break L88;
                                      } else {
                                        if (((bf) this).field_j != 10) {
                                          break L87;
                                        } else {
                                          break L88;
                                        }
                                      }
                                    }
                                    mj.a(dg.field_l >> 1, 12, 0, 15, 60);
                                    break L87;
                                  }
                                  if (10 <= ((bf) this).field_j) {
                                    ((bf) this).field_j = 0;
                                    break L0;
                                  } else {
                                    break L0;
                                  }
                                }
                              } else {
                                L89: {
                                  if (((bf) this).field_j == 4) {
                                    this.a(-11, 16776960, param0, -112, -32, -64, 4, 11, -12 + -param3);
                                    this.a(-9, 65280, param0, -108, -128, -16, 2, 11, -16 + -param3);
                                    break L89;
                                  } else {
                                    break L89;
                                  }
                                }
                                L90: {
                                  if (6 == ((bf) this).field_j) {
                                    this.a(-11, 16776960, param0, -110, 32, -64, 4, 11, 4 + -param3);
                                    this.a(-9, 65280, param0, -108, 128, -16, 2, 11, -param3 + 8);
                                    break L90;
                                  } else {
                                    break L90;
                                  }
                                }
                                L91: {
                                  if (((bf) this).field_j != 8) {
                                    break L91;
                                  } else {
                                    this.a(-10, 16776960, param0, -122, -96, -32, 4, 11, -14 - param3);
                                    this.a(-8, 65280, param0, -105, -192, -8, 2, 11, -18 + -param3);
                                    break L91;
                                  }
                                }
                                L92: {
                                  if (((bf) this).field_j != 10) {
                                    break L92;
                                  } else {
                                    this.a(-10, 16776960, param0, -108, 96, -32, 4, 11, 6 + -param3);
                                    this.a(-8, 65280, param0, -123, 192, -8, 2, 11, -param3 + 10);
                                    break L92;
                                  }
                                }
                                L93: {
                                  L94: {
                                    if (((bf) this).field_j == 5) {
                                      break L94;
                                    } else {
                                      if (((bf) this).field_j != 10) {
                                        break L93;
                                      } else {
                                        break L94;
                                      }
                                    }
                                  }
                                  mj.a(dg.field_l >> 1, 12, 0, 14, 40);
                                  break L93;
                                }
                                if (((bf) this).field_j < 10) {
                                  break L1;
                                } else {
                                  ((bf) this).field_j = 0;
                                  break L0;
                                }
                              }
                            } else {
                              L95: {
                                if (((bf) this).field_j == 2) {
                                  this.a(-11, 65280, param0, -126, -32, -64, 2, 11, -12 - param3);
                                  this.a(-9, 65280, param0, -114, -128, -16, 2, 11, -param3 + -16);
                                  break L95;
                                } else {
                                  break L95;
                                }
                              }
                              L96: {
                                if (((bf) this).field_j == 3) {
                                  this.a(-11, 65280, param0, -126, 32, -64, 2, 11, 4 - param3);
                                  this.a(-9, 65280, param0, -105, 128, -16, 2, 11, 8 + -param3);
                                  break L96;
                                } else {
                                  break L96;
                                }
                              }
                              L97: {
                                if (4 != ((bf) this).field_j) {
                                  break L97;
                                } else {
                                  this.a(-10, 65280, param0, -110, -96, -32, 2, 11, -param3 + -14);
                                  break L97;
                                }
                              }
                              L98: {
                                if (((bf) this).field_j == 5) {
                                  this.a(-10, 65280, param0, -111, 96, -32, 2, 11, -param3 + 6);
                                  break L98;
                                } else {
                                  break L98;
                                }
                              }
                              L99: {
                                if (5 != ((bf) this).field_j) {
                                  break L99;
                                } else {
                                  mj.a(2 * dg.field_l / 5, 12, 0, 13, 30);
                                  break L99;
                                }
                              }
                              if (((bf) this).field_j >= 5) {
                                ((bf) this).field_j = 0;
                                break L0;
                              } else {
                                break L0;
                              }
                            }
                          }
                        } else {
                          L100: {
                            if (((bf) this).field_j != 4) {
                              break L100;
                            } else {
                              this.a(-11, 16776960, param0, -113, -32, -64, 4, 11, -12 + -param3);
                              break L100;
                            }
                          }
                          L101: {
                            if (((bf) this).field_j != 6) {
                              break L101;
                            } else {
                              this.a(-11, 16776960, param0, -113, 32, -64, 4, 11, -param3 + 4);
                              break L101;
                            }
                          }
                          L102: {
                            if (8 != ((bf) this).field_j) {
                              break L102;
                            } else {
                              this.a(-10, 65280, param0, -119, -96, -32, 2, 11, -14 - param3);
                              break L102;
                            }
                          }
                          L103: {
                            if (10 == ((bf) this).field_j) {
                              this.a(-10, 65280, param0, -109, 96, -32, 2, 11, -param3 + 6);
                              break L103;
                            } else {
                              break L103;
                            }
                          }
                          L104: {
                            if (((bf) this).field_j != 5) {
                              break L104;
                            } else {
                              this.a(-9, 65280, param0, -120, -128, -16, 2, 11, -16 - param3);
                              break L104;
                            }
                          }
                          L105: {
                            if (((bf) this).field_j == 7) {
                              this.a(-9, 65280, param0, -127, 128, -16, 2, 11, 8 - param3);
                              break L105;
                            } else {
                              break L105;
                            }
                          }
                          L106: {
                            L107: {
                              if (5 == ((bf) this).field_j) {
                                break L107;
                              } else {
                                if (((bf) this).field_j == 10) {
                                  break L107;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            mj.a(dg.field_l * 2 / 5, 12, 0, 14, 40);
                            break L106;
                          }
                          if (((bf) this).field_j < 10) {
                            break L1;
                          } else {
                            ((bf) this).field_j = 0;
                            break L0;
                          }
                        }
                      }
                    } else {
                      L108: {
                        if (((bf) this).field_j != 4) {
                          break L108;
                        } else {
                          this.a(-11, 65280, param0, -115, -32, -64, 2, 11, -param3 + -12);
                          break L108;
                        }
                      }
                      L109: {
                        if (((bf) this).field_j == 6) {
                          this.a(-11, 65280, param0, -125, 32, -64, 2, 11, -param3 + 4);
                          break L109;
                        } else {
                          break L109;
                        }
                      }
                      L110: {
                        if (((bf) this).field_j != 8) {
                          break L110;
                        } else {
                          this.a(-10, 65280, param0, -113, -96, -32, 2, 11, -param3 + -14);
                          break L110;
                        }
                      }
                      L111: {
                        if (((bf) this).field_j != 10) {
                          break L111;
                        } else {
                          this.a(-10, 65280, param0, -111, 96, -32, 2, 11, 6 - param3);
                          break L111;
                        }
                      }
                      L112: {
                        L113: {
                          if (((bf) this).field_j == 5) {
                            break L113;
                          } else {
                            if (((bf) this).field_j == 10) {
                              break L113;
                            } else {
                              break L112;
                            }
                          }
                        }
                        mj.a(2 * dg.field_l / 5, 12, 0, 15, 75);
                        break L112;
                      }
                      if (10 > ((bf) this).field_j) {
                        break L1;
                      } else {
                        ((bf) this).field_j = 0;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                L114: {
                  if (((bf) this).field_j == 5) {
                    this.a(-13, 16776960, param0, -119, -64, -64, 4, 11, -16 + param3);
                    break L114;
                  } else {
                    break L114;
                  }
                }
                L115: {
                  if (((bf) this).field_j == 15) {
                    this.a(-13, 65280, param0, -112, 64, -64, 2, 11, -param3 + 8);
                    break L115;
                  } else {
                    break L115;
                  }
                }
                L116: {
                  if (((bf) this).field_j == 25) {
                    this.a(-13, 65280, param0, -106, -64, -64, 2, 11, param3 + -16);
                    break L116;
                  } else {
                    break L116;
                  }
                }
                L117: {
                  if (((bf) this).field_j != 35) {
                    break L117;
                  } else {
                    this.a(-13, 16776960, param0, -109, 64, -64, 4, 11, -param3 + 8);
                    break L117;
                  }
                }
                L118: {
                  if (((bf) this).field_j % 6 == 0) {
                    mj.a(3 * dg.field_l / 10, 12, 0, 15, 75);
                    break L118;
                  } else {
                    break L118;
                  }
                }
                if (((bf) this).field_j >= 40) {
                  ((bf) this).field_j = 0;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              L119: {
                if (((bf) this).field_j == 4) {
                  this.a(-13, 65280, param0, -125, -64, -64, 2, 11, param3 + -16);
                  break L119;
                } else {
                  break L119;
                }
              }
              L120: {
                if (((bf) this).field_j == 12) {
                  this.a(-13, 65280, param0, -128, 64, -64, 2, 11, 8 - param3);
                  break L120;
                } else {
                  break L120;
                }
              }
              L121: {
                L122: {
                  if (((bf) this).field_j == 4) {
                    break L122;
                  } else {
                    if (((bf) this).field_j != 12) {
                      break L121;
                    } else {
                      break L122;
                    }
                  }
                }
                mj.a(dg.field_l * 3 / 10, 12, 0, 14, 50);
                break L121;
              }
              if (((bf) this).field_j < 16) {
                break L1;
              } else {
                ((bf) this).field_j = 0;
                break L0;
              }
            }
          }
          break L0;
        }
    }

    final void a(int param0, int param1) {
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
        int stackIn_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        L0: {
          var12 = StarCannon.field_A;
          var3 = 512;
          if (param0 == 65535) {
            break L0;
          } else {
            ((bf) this).field_l = 44;
            break L0;
          }
        }
        L1: {
          if (0 < ((bf) this).field_k) {
            var4 = (param1 >> 4) + ((bf) this).field_f;
            var9 = ((bf) this).field_q;
            if (0 != var9) {
              if (1 == var9) {
                if (rj.field_h == 1) {
                  gg.field_f[5 - -((bf) this).field_v].d(-16 + var4, ((bf) this).field_u + -16, 256);
                  break L1;
                } else {
                  gg.field_f[((bf) this).field_v].d(-16 + var4, ((bf) this).field_u + -16, var3);
                  break L1;
                }
              } else {
                if (var9 != 2) {
                  if (3 != var9) {
                    if (var9 == 4) {
                      gg.field_f[((bf) this).field_v + 25].d(var4 - 16, -16 + ((bf) this).field_u, var3);
                      break L1;
                    } else {
                      if (var9 == 5) {
                        gg.field_f[((bf) this).field_v + 20].d(var4 - 16, ((bf) this).field_u - 16, var3);
                        break L1;
                      } else {
                        L2: {
                          if (var9 != 6) {
                            if (var9 != 14) {
                              if (var9 == 7) {
                                if (fi.field_e.field_k > 0) {
                                  vc.field_m[1].e(var4 + -16, ((bf) this).field_u - 16);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                L3: {
                                  if (var9 != 8) {
                                    if (var9 == 9) {
                                      break L3;
                                    } else {
                                      if (var9 == 10) {
                                        if (af.field_w != null) {
                                          L4: {
                                            if (3 > ((bf) this).field_l) {
                                              L5: {
                                                if (((bf) this).field_l == 0) {
                                                  var9 = 257;
                                                  break L5;
                                                } else {
                                                  if (((bf) this).field_l != 1) {
                                                    var9 = 256;
                                                    break L5;
                                                  } else {
                                                    var9 = 256;
                                                    break L5;
                                                  }
                                                }
                                              }
                                              L6: {
                                                if (2 != ((bf) this).field_l) {
                                                  stackOut_106_0 = 0;
                                                  stackIn_107_0 = stackOut_106_0;
                                                  break L6;
                                                } else {
                                                  stackOut_105_0 = 16711680;
                                                  stackIn_107_0 = stackOut_105_0;
                                                  break L6;
                                                }
                                              }
                                              var10 = stackIn_107_0;
                                              var11 = ~var10 & 65793 + -var9;
                                              ki.c(var4, ((bf) this).field_u, 20 + ((bf) this).field_o, var10 | var9 * 96, 32);
                                              ki.c(var4, ((bf) this).field_u, ((bf) this).field_o + 19, var9 * 160 | var10, 32);
                                              var10 = 255 * var9 | var10;
                                              ki.c(var4, ((bf) this).field_u, 18 - -((bf) this).field_o, var10, 32);
                                              ki.c(var4, ((bf) this).field_u, ((bf) this).field_o + 17, var10 | var11 * 32, 32);
                                              ki.c(var4, ((bf) this).field_u, 16 + ((bf) this).field_o, var11 * 96 | var10, 32);
                                              ki.c(var4, ((bf) this).field_u, 14 - -((bf) this).field_o, 160 * var11 | var10, 32);
                                              ki.c(var4, ((bf) this).field_u, 12 + ((bf) this).field_o, var10 | var11 * 240, 32);
                                              break L4;
                                            } else {
                                              break L4;
                                            }
                                          }
                                          af.field_w[((bf) this).field_v * 8 - -((bf) this).field_l].c(var4 + -16, -16 + ((bf) this).field_u);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        if (var9 == 11) {
                                          sj.field_E[((bf) this).field_v].d(-64 + var4, ((bf) this).field_u - 64, 256);
                                          break L1;
                                        } else {
                                          if (12 == var9) {
                                            nd.field_j[((bf) this).field_v].d(var4 + -16, -16 + (((bf) this).field_u - 32), var3);
                                            break L1;
                                          } else {
                                            if (var9 != 21) {
                                              if (13 == var9) {
                                                if (0 >= fi.field_e.field_k) {
                                                  break L1;
                                                } else {
                                                  vc.field_m[2].e(var4 + -16, -16 + ((bf) this).field_u);
                                                  ie.field_A[((bf) this).field_o % 14].f(-8 + var4, ((bf) this).field_u + -16, 3 * ((bf) this).field_o);
                                                  if (StarCannon.field_z != -1) {
                                                    break L1;
                                                  } else {
                                                    if (-1 != pa.field_L) {
                                                      break L1;
                                                    } else {
                                                      ie.field_A[((bf) this).field_o % 14].f(-12 + var4 - -sh.b(-128, 8), ((bf) this).field_u - (20 - sh.b(-2, 8)), 2 * ((bf) this).field_o);
                                                      ie.field_A[((bf) this).field_o % 14].f(-14 + (var4 + sh.b(param0 + -65437, 12)), -22 + (((bf) this).field_u + sh.b(34, 12)), ((bf) this).field_o);
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (var9 != 15) {
                                                  if (var9 == 16) {
                                                    L7: {
                                                      if (((bf) this).field_v <= 4) {
                                                        break L7;
                                                      } else {
                                                        ((bf) this).field_v = 4;
                                                        break L7;
                                                      }
                                                    }
                                                    v.field_d[((bf) this).field_v].d(var4 + -128, -128 + ((bf) this).field_u, 256);
                                                    break L1;
                                                  } else {
                                                    if (17 == var9) {
                                                      el.field_H[((bf) this).field_v].d(-16 + var4, ((bf) this).field_u - 16, var3);
                                                      break L1;
                                                    } else {
                                                      if (var9 == 18) {
                                                        var7 = (int)(16.0 * Math.sin(0.1 * (double)((bf) this).field_u));
                                                        var8 = (int)(Math.cos(0.1 * (double)((bf) this).field_u) * 16.0);
                                                        gg.field_f[25 + ((bf) this).field_v].d(-var7 + (-16 + var4), -16 + (((bf) this).field_u - var8), var3);
                                                        gg.field_f[25 + ((bf) this).field_v].d(var7 + (var4 - 16), var8 + -16 + ((bf) this).field_u, var3);
                                                        gg.field_f[25 - -((bf) this).field_v].d(-16 + (var4 + -var8), -16 + ((bf) this).field_u + var7, var3);
                                                        gg.field_f[((bf) this).field_v + 25].d(var8 + (-16 + var4), ((bf) this).field_u + -16 - var7, var3);
                                                        break L1;
                                                      } else {
                                                        if (var9 == 19) {
                                                          gg.field_f[((bf) this).field_v + 25].d(-16 + var4, -16 + ((bf) this).field_u, var3);
                                                          break L1;
                                                        } else {
                                                          if (var9 != 22) {
                                                            break L1;
                                                          } else {
                                                            fl.field_f[((bf) this).field_l].e(-64 + var4, -64 + ((bf) this).field_u);
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L8: {
                                                    if (((bf) this).field_v <= 4) {
                                                      break L8;
                                                    } else {
                                                      ((bf) this).field_v = 4;
                                                      break L8;
                                                    }
                                                  }
                                                  fg.field_c[((bf) this).field_v].d(var4 - 128, -128 + ((bf) this).field_u, 256);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              qc.field_e[((bf) this).field_v].d(-48 + var4, -32 + ((bf) this).field_u, 256);
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                                if (0 < fi.field_e.field_k) {
                                  vc.field_m[3 - -((bf) this).field_v].e(-16 + var4, ((bf) this).field_u - 16);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                        if (fi.field_e.field_k > 0) {
                          vc.field_m[0].e(var4 - 16, -16 + ((bf) this).field_u);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    gf.field_a[((bf) this).field_v].d(var4 + -32, ((bf) this).field_u - 16, var3);
                    break L1;
                  }
                } else {
                  if (1 != rj.field_h) {
                    gg.field_f[10 - -((bf) this).field_v].d(-16 + var4, ((bf) this).field_u - 16, var3);
                    break L1;
                  } else {
                    gg.field_f[((bf) this).field_v + 15].d(var4 - 16, ((bf) this).field_u + -16, 256);
                    break L1;
                  }
                }
              }
            } else {
              L9: {
                var5 = ((bf) this).field_m >> 2;
                var6 = Math.abs(-((bf) this).field_v + 2);
                if (((bf) this).field_z == 0) {
                  var5++;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (0 > ((bf) this).field_z) {
                  var5 += 2;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                L12: {
                  if (0 >= ui.field_p) {
                    break L12;
                  } else {
                    if (!ti.field_d) {
                      ki.c(var4, ((bf) this).field_u, ui.field_p, 65535, -(ui.field_p * 255 / eg.field_l) + 256);
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (0 >= ha.field_d) {
                    break L13;
                  } else {
                    if (ti.field_d) {
                      break L13;
                    } else {
                      var9 = 0;
                      L14: while (true) {
                        if (314 <= var9) {
                          break L11;
                        } else {
                          var10 = var4 + (int)(Math.cos((double)(var9 + ha.field_d) / 50.1) * (double)ha.field_d);
                          var11 = (int)(Math.sin((double)(var9 + ha.field_d) / 50.1) * (double)ha.field_d) - -((bf) this).field_u;
                          ki.c(var10, var11, 3, 65535, 128);
                          var9 += 16;
                          continue L14;
                        }
                      }
                    }
                  }
                }
                ki.c(4 + (var4 - ((bf) this).field_v), ((bf) this).field_u, 20, 24831, 32);
                ki.c(var4 + (4 - ((bf) this).field_v), ((bf) this).field_u, 19, 41215, 32);
                ki.c(var4 + 4 - ((bf) this).field_v, ((bf) this).field_u, 18, 65535, 32);
                ki.c(var4 - (-4 - -((bf) this).field_v), ((bf) this).field_u, 17, 2162687, 32);
                ki.c(-((bf) this).field_v + var4 - -4, ((bf) this).field_u, 16, 6356991, 32);
                ki.c(var4 + (4 + -((bf) this).field_v), ((bf) this).field_u, 14, 10551295, 32);
                ki.c(-((bf) this).field_v + (var4 - -4), ((bf) this).field_u, 12, 15794175, 32);
                break L11;
              }
              var9 = jl.field_j;
              if (var9 == 5) {
                L15: {
                  L16: {
                    if (tj.field_G % 2 == 0) {
                      break L16;
                    } else {
                      if (ti.field_d) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  dl.field_c[((bf) this).field_v].e(-16 + var4, ((bf) this).field_u - 16);
                  break L15;
                }
                jg.field_C[var5].a(-4 + var4, 7 + ((bf) this).field_u, 16711680);
                break L1;
              } else {
                if (var9 != 10) {
                  if (var9 != 15) {
                    if (var9 != 20) {
                      break L1;
                    } else {
                      L17: {
                        L18: {
                          if (tj.field_G % 2 == 0) {
                            break L18;
                          } else {
                            if (ti.field_d) {
                              break L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                        dl.field_c[((bf) this).field_v].e(var4 + -16, -16 + ((bf) this).field_u);
                        break L17;
                      }
                      jg.field_C[var5].a(var4 - var6, 3 + ((bf) this).field_u, 16711680);
                      jg.field_C[var5].a(var4 - (-4 - -var6), ((bf) this).field_u + 3, 16711680);
                      jg.field_C[var5].a(var6 + (var4 - 8), 3 + ((bf) this).field_u, 16711680);
                      jg.field_C[var5].a(-12 + (var4 + var6), ((bf) this).field_u + 3, 16711680);
                      break L1;
                    }
                  } else {
                    L19: {
                      L20: {
                        jg.field_C[var5].a(-var6 + 2 + var4, ((bf) this).field_u - -3, 16711680);
                        jg.field_C[var5].a(var6 + (var4 - 10), ((bf) this).field_u + 3, 16711680);
                        if (0 == tj.field_G % 2) {
                          break L20;
                        } else {
                          if (ti.field_d) {
                            break L20;
                          } else {
                            break L19;
                          }
                        }
                      }
                      dl.field_c[((bf) this).field_v].e(-16 + var4, -16 + ((bf) this).field_u);
                      break L19;
                    }
                    jg.field_C[var5].a(var4 - 4, 7 + ((bf) this).field_u, 16711680);
                    break L1;
                  }
                } else {
                  L21: {
                    jg.field_C[var5].a(-var6 + (2 + var4), 3 + ((bf) this).field_u, 16711680);
                    jg.field_C[var5].a(var6 + (-10 + var4), 3 + ((bf) this).field_u, 16711680);
                    if (tj.field_G % 2 == 0) {
                      break L21;
                    } else {
                      if (ti.field_d) {
                        break L21;
                      } else {
                        break L1;
                      }
                    }
                  }
                  dl.field_c[((bf) this).field_v].e(-16 + var4, ((bf) this).field_u - 16);
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    bf(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param3 != 0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 2;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 4;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((bf) this).field_v = stackIn_3_1;
          ((bf) this).field_g = 0;
          ((bf) this).field_u = param1;
          ((bf) this).field_t = 0;
          ((bf) this).field_j = 0;
          ((bf) this).field_p = false;
          ((bf) this).field_m = 0;
          ((bf) this).field_l = 0;
          ((bf) this).field_k = 1;
          ((bf) this).field_h = null;
          ((bf) this).field_q = param3;
          ((bf) this).field_f = param0;
          ((bf) this).field_i = param2;
          ((bf) this).field_z = 0;
          ((bf) this).field_n = 0;
          ((bf) this).field_o = 0;
          ((bf) this).field_r = 0;
          if (((bf) this).field_q != 0) {
            break L1;
          } else {
            ((bf) this).field_k = 1;
            break L1;
          }
        }
        L2: {
          if (((bf) this).field_q != 1) {
            break L2;
          } else {
            ((bf) this).field_k = pf.field_d * 2 / 3 + 1;
            break L2;
          }
        }
        L3: {
          if (((bf) this).field_q != 2) {
            break L3;
          } else {
            ((bf) this).field_k = pf.field_d + 1;
            break L3;
          }
        }
        L4: {
          if (((bf) this).field_q != 3) {
            break L4;
          } else {
            ((bf) this).field_k = 51 - -(4 * pf.field_d);
            break L4;
          }
        }
        L5: {
          if (((bf) this).field_q != 4) {
            break L5;
          } else {
            ((bf) this).field_k = 2 * pf.field_d + 2;
            break L5;
          }
        }
        L6: {
          if (((bf) this).field_q != 5) {
            break L6;
          } else {
            ((bf) this).field_k = 3 + pf.field_d;
            break L6;
          }
        }
        L7: {
          if (((bf) this).field_q != 10) {
            break L7;
          } else {
            L8: {
              if (sh.b(-2, 2) == 0) {
                L9: {
                  ((bf) this).field_l = sh.b(-128, 3);
                  if (0 != rj.field_h) {
                    break L9;
                  } else {
                    if (sd.field_c < 6) {
                      break L9;
                    } else {
                      ((bf) this).field_l = sh.b(-127, 7);
                      break L9;
                    }
                  }
                }
                L10: {
                  if (rj.field_h != 1) {
                    break L10;
                  } else {
                    if (10 > sd.field_c) {
                      break L10;
                    } else {
                      ((bf) this).field_l = sh.b(53, 7);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (rj.field_h != 2) {
                    break L11;
                  } else {
                    if (sd.field_c < 16) {
                      break L11;
                    } else {
                      ((bf) this).field_l = sh.b(7, 7);
                      break L11;
                    }
                  }
                }
                if (rj.field_h != 3) {
                  break L8;
                } else {
                  if (sd.field_c < 17) {
                    break L8;
                  } else {
                    ((bf) this).field_l = sh.b(99, 7);
                    break L8;
                  }
                }
              } else {
                ((bf) this).field_l = sh.b(-127, 4) + 3;
                break L8;
              }
            }
            if (((bf) this).field_l != 5) {
              break L7;
            } else {
              ((bf) this).field_l = 7;
              break L7;
            }
          }
        }
        L12: {
          if (((bf) this).field_q != 12) {
            break L12;
          } else {
            ((bf) this).field_k = 100 + pf.field_d * 3;
            break L12;
          }
        }
        L13: {
          if (((bf) this).field_q != 21) {
            break L13;
          } else {
            ((bf) this).field_k = 100 - -(20 * pf.field_d);
            break L13;
          }
        }
        L14: {
          if (11 != ((bf) this).field_q) {
            break L14;
          } else {
            ((bf) this).field_k = 50 * pf.field_d + 200 << 2;
            if (rj.field_h != 3) {
              break L14;
            } else {
              ((bf) this).field_k = ((bf) this).field_k >> 2;
              break L14;
            }
          }
        }
        L15: {
          if (((bf) this).field_q != 15) {
            break L15;
          } else {
            L16: {
              ((bf) this).field_k = 50 * pf.field_d + 500 << 2;
              if (nf.field_l != 2) {
                break L16;
              } else {
                ((bf) this).field_k = pf.field_d * 50 + 750 << 2;
                break L16;
              }
            }
            if (rj.field_h != 3) {
              break L15;
            } else {
              ((bf) this).field_k = ((bf) this).field_k >> 2;
              break L15;
            }
          }
        }
        L17: {
          if (((bf) this).field_q != 16) {
            break L17;
          } else {
            ((bf) this).field_k = 50 * pf.field_d + 2000 << 2;
            if (rj.field_h != 3) {
              break L17;
            } else {
              ((bf) this).field_k = ((bf) this).field_k >> 2;
              break L17;
            }
          }
        }
        L18: {
          if (((bf) this).field_q != 17) {
            break L18;
          } else {
            ((bf) this).field_k = 2 * pf.field_d + 1;
            break L18;
          }
        }
        L19: {
          if (((bf) this).field_q != 18) {
            break L19;
          } else {
            ((bf) this).field_k = 30 - -(pf.field_d * 5);
            break L19;
          }
        }
        L20: {
          if (((bf) this).field_q != 19) {
            break L20;
          } else {
            ((bf) this).field_k = 20 + 4 * pf.field_d;
            break L20;
          }
        }
        L21: {
          if (((bf) this).field_q != 22) {
            break L21;
          } else {
            ((bf) this).field_k = 1;
            break L21;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new p();
    }
}
