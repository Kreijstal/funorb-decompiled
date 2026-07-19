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
        boolean discarded$3 = false;
        int fieldTemp$4 = 0;
        boolean discarded$5 = false;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        d var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var8_int = 0;
              if (param1 >= 102) {
                break L1;
              } else {
                field_x = (p) null;
                break L1;
              }
            }
            L2: {
              if (this.field_k > 0) {
                var9 = 0;
                L3: while (true) {
                  if ((var9 ^ -1) <= -4001) {
                    break L2;
                  } else {
                    var10 = param6[var9];
                    if (var10 != null) {
                      L4: {
                        if (var10.field_h == 1) {
                          break L4;
                        } else {
                          if ((var10.field_h ^ -1) == -11) {
                            break L4;
                          } else {
                            if (var10.field_h == 11) {
                              break L4;
                            } else {
                              if (-13 == (var10.field_h ^ -1)) {
                                break L4;
                              } else {
                                var9++;
                                continue L3;
                              }
                            }
                          }
                        }
                      }
                      L5: {
                        if (-1 > (this.field_k ^ -1)) {
                          if (param3 > Math.abs(this.field_f - var10.field_d)) {
                            if (param2 > Math.abs(-var10.field_q + this.field_u)) {
                              L6: {
                                if ((var10.field_i ^ -1) == -4) {
                                  var11 = 0;
                                  L7: while (true) {
                                    if (var11 >= 20) {
                                      break L6;
                                    } else {
                                      discarded$3 = v.a(new d(var10.field_d, var10.field_q, sa.field_a[var11], sa.field_a[(var11 + 5) % 20], 65535, 1), -4001);
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if ((var10.field_h ^ -1) != -2) {
                                  break L8;
                                } else {
                                  if (var10.field_o != 65280) {
                                    break L8;
                                  } else {
                                    var10.field_i = this.field_k;
                                    break L8;
                                  }
                                }
                              }
                              na.field_d = na.field_d + 1;
                              fc.field_e = fc.field_e + ((param4 << -533001279) + -jl.field_d);
                              var10.field_o = 0;
                              this.field_k = this.field_k - var10.field_i;
                              ia.field_k = ia.field_k + param4;
                              var10.field_h = 5;
                              var10.field_i = 16;
                              var10.field_p = 0;
                              if (-1 > (this.field_k ^ -1)) {
                                var8_int = 1;
                                break L5;
                              } else {
                                L9: {
                                  if (2 != this.field_q) {
                                    break L9;
                                  } else {
                                    L10: {
                                      wg.field_e = wg.field_e + 1;
                                      if ((wg.field_e ^ -1) != -51) {
                                        break L10;
                                      } else {
                                        ph.a(246, false, 9);
                                        break L10;
                                      }
                                    }
                                    if ((wg.field_e ^ -1) == -151) {
                                      ph.a(245, false, 10);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L11: {
                                  if ((this.field_q ^ -1) != -13) {
                                    break L11;
                                  } else {
                                    L12: {
                                      qf.field_h = qf.field_h + 1;
                                      if ((qf.field_h ^ -1) == -11) {
                                        ph.a(248, false, 7);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    if ((qf.field_h ^ -1) == -31) {
                                      ph.a(247, false, 8);
                                      break L11;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                                stackOut_47_0 = 1;
                                stackIn_48_0 = stackOut_47_0;
                                decompiledRegionSelector0 = 0;
                                break L0;
                              }
                            } else {
                              var9++;
                              continue L3;
                            }
                          } else {
                            var9++;
                            continue L3;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var9++;
                      continue L3;
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                fieldTemp$4 = this.field_r;
                this.field_r = this.field_r + 1;
                if (param5 <= fieldTemp$4) {
                  break L2;
                } else {
                  if (-1 != (this.field_r % (-qc.field_d + 3) ^ -1)) {
                    break L2;
                  } else {
                    var9 = 0;
                    L13: while (true) {
                      if (param0 <= var9) {
                        break L2;
                      } else {
                        discarded$5 = v.a(new d(-16 + this.field_f - -sh.b(-126, 32), this.field_u + sh.b(64, 32) + -16, sh.b(-126, 64) + 64, 6), -4001);
                        var9++;
                        continue L13;
                      }
                    }
                  }
                }
              }
            }
            stackOut_51_0 = var8_int;
            stackIn_52_0 = stackOut_51_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var8 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var8);
            stackOut_53_1 = new StringBuilder().append("bf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param6 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L14;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L14;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_48_0 != 0;
        } else {
          return stackIn_52_0 != 0;
        }
    }

    private final void b(byte param0) {
        int var3 = 0;
        L0: {
          var3 = StarCannon.field_A;
          this.field_g = this.field_g + Math.abs(this.field_n);
          this.field_t = this.field_t + Math.abs(this.field_z);
          if (32 < this.field_g) {
            L1: {
              if ((this.field_n ^ -1) <= -1) {
                break L1;
              } else {
                this.field_f = this.field_f - (this.field_g >> 604164613);
                break L1;
              }
            }
            L2: {
              if (0 < this.field_n) {
                this.field_f = this.field_f + (this.field_g >> 1638301125);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_g = this.field_g & 31;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if ((this.field_t ^ -1) >= -33) {
            break L3;
          } else {
            L4: {
              if (-1 >= (this.field_z ^ -1)) {
                break L4;
              } else {
                this.field_u = this.field_u - (this.field_t >> 1838461797);
                break L4;
              }
            }
            L5: {
              if (0 < this.field_z) {
                this.field_u = this.field_u + (this.field_t >> 1642507333);
                break L5;
              } else {
                break L5;
              }
            }
            this.field_t = 31 & this.field_t;
            break L3;
          }
        }
        if (param0 == -24) {
          L6: {
            if (this.field_n < 0) {
              this.field_n = this.field_n + 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (-1 < (this.field_z ^ -1)) {
              this.field_z = this.field_z + 1;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (0 >= this.field_n) {
              break L8;
            } else {
              this.field_n = this.field_n - 1;
              break L8;
            }
          }
          L9: {
            if (0 != this.field_q) {
              L10: {
                this.field_v = 2;
                if (this.field_n < -32) {
                  this.field_v = this.field_v - 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (this.field_n >= -16) {
                  break L11;
                } else {
                  this.field_v = this.field_v - 1;
                  break L11;
                }
              }
              L12: {
                if (this.field_n <= 16) {
                  break L12;
                } else {
                  this.field_v = this.field_v + 1;
                  break L12;
                }
              }
              if (this.field_n > 32) {
                this.field_v = this.field_v + 1;
                break L9;
              } else {
                break L9;
              }
            } else {
              this.field_v = 4;
              if (this.field_n >= -160) {
                if (-100 > this.field_n) {
                  this.field_v = 1;
                  break L9;
                } else {
                  if (this.field_n >= -40) {
                    if (this.field_n < -16) {
                      this.field_v = 3;
                      break L9;
                    } else {
                      if (-161 > (this.field_n ^ -1)) {
                        this.field_v = 8;
                        break L9;
                      } else {
                        if ((this.field_n ^ -1) < -101) {
                          this.field_v = 7;
                          break L9;
                        } else {
                          if (-41 > (this.field_n ^ -1)) {
                            this.field_v = 6;
                            break L9;
                          } else {
                            if (16 >= this.field_n) {
                              break L9;
                            } else {
                              this.field_v = 5;
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.field_v = 2;
                    break L9;
                  }
                }
              } else {
                this.field_v = 0;
                break L9;
              }
            }
          }
          L13: {
            if ((this.field_z ^ -1) < -1) {
              this.field_z = this.field_z - 1;
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

    private final void d(int param0) {
        L0: {
          L1: {
            if (param0 != ui.field_p) {
              break L1;
            } else {
              if ((ha.field_d ^ -1) < -1) {
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
            return ck.a((byte) 125);
        }
        if (param0 != 0) {
            return -127;
        }
        return 0;
    }

    private final void a(vi param0, d[] param1, boolean param2, StarCannon param3) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
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
        int decompiledRegionSelector0 = 0;
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
            if (param2) {
              L1: {
                var5_int = 0;
                if (0 == this.field_v) {
                  var5_int = 2;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((this.field_v ^ -1) != -2) {
                  break L2;
                } else {
                  var5_int = 1;
                  break L2;
                }
              }
              L3: {
                if (this.field_v == 3) {
                  var5_int = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (4 == this.field_v) {
                  var5_int = 2;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                tj.field_w = this.field_f;
                if (-1 > (this.field_k ^ -1)) {
                  var6 = 0;
                  L6: while (true) {
                    if ((var6 ^ -1) <= -4001) {
                      L7: {
                        this.field_m = (this.field_m + 1) % 8;
                        if (this.field_j <= 0) {
                          break L7;
                        } else {
                          this.field_j = this.field_j + 1;
                          var6 = qb.field_e;
                          if (var6 != 0) {
                            if (-2 == (var6 ^ -1)) {
                              this.a(param1, -70, param3, var5_int, param0);
                              break L7;
                            } else {
                              if ((var6 ^ -1) != -3) {
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
                      this.field_r = 0;
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
                            if (16 <= Math.abs(-var7.field_d + this.field_f)) {
                              break L8;
                            } else {
                              if (16 <= Math.abs(-var7.field_q + this.field_u)) {
                                break L8;
                              } else {
                                L9: {
                                  param1[var6].field_h = 0;
                                  param1[var6].field_p = 256;
                                  if (ha.field_d <= 0) {
                                    break L9;
                                  } else {
                                    if (-1 != (ui.field_p ^ -1)) {
                                      break L9;
                                    } else {
                                      this.field_k = this.field_k - param1[var6].field_i;
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
                    this.field_j = 0;
                    if ((this.field_r ^ -1) != -2) {
                      break L10;
                    } else {
                      mj.a(128, 12, 0, 19, 100);
                      break L10;
                    }
                  }
                  L11: {
                    this.field_r = this.field_r + 1;
                    if ((this.field_r ^ -1) <= -129) {
                      break L11;
                    } else {
                      discarded$6 = v.a(new d(-16 + this.field_f + sh.b(65, 32), -16 + this.field_u - -sh.b(50, 32), sh.b(-127, 64) + 64), -4001);
                      discarded$7 = v.a(new d(-24 + this.field_f - -sh.b(-126, 48), this.field_u - -sh.b(29, 48) - 24, sh.b(47, 64) + 64), -4001);
                      discarded$8 = v.a(new d(this.field_f + sh.b(117, 64) + -32, this.field_u + sh.b(29, 64) - 32, sh.b(-30, 64) + 64), -4001);
                      discarded$9 = v.a(new d(-16 + this.field_f - -sh.b(91, 32), 16 + this.field_u + sh.b(17, 32), 64 + sh.b(25, 64)), -4001);
                      discarded$10 = v.a(new d(-24 + (this.field_f - -sh.b(-128, 48)), -40 + this.field_u - -sh.b(-127, 48), 64 - -sh.b(96, 64)), -4001);
                      discarded$11 = v.a(new d(-16 + (this.field_f + sh.b(119, 32)), this.field_u - -sh.b(-126, 32) + 32, sh.b(19, 64) + 64), -4001);
                      break L11;
                    }
                  }
                  L12: {
                    if ((this.field_r ^ -1) >= -193) {
                      break L12;
                    } else {
                      this.field_u = 480;
                      this.field_f = 256;
                      if ((gj.field_c ^ -1) <= -1) {
                        gj.field_c = gj.field_c - 1;
                        if ((gj.field_c ^ -1) > -1) {
                          hh.field_c = 0;
                          dg.field_l = 0;
                          field_w = 0;
                          ha.field_c = 0;
                          mj.a(255, 12, 0, 32, 100);
                          jl.field_j = 5;
                          vb.field_m = 2;
                          this.field_r = 256;
                          if (!wk.a(119)) {
                            pg.a(true, (byte) -98);
                            sa.a(nf.field_l + 3 * na.field_a, 23820);
                            fc.field_e = fc.field_e - (ia.field_k << -140767999);
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
                          this.field_f = 320;
                          tj.field_G = 150;
                          this.field_r = 0;
                          this.field_u = 580;
                          ha.field_d = 512;
                          this.field_k = 1;
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
                      param0.a(ok.field_tb);
                      ok.field_tb = null;
                      break L16;
                    }
                  }
                  this.field_z = this.field_z + 10;
                  break L5;
                }
              }
              this.b((byte) -24);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) (var5);
            stackOut_61_1 = new StringBuilder().append("bf.P(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L17;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L17;
            }
          }
          L18: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L18;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L18;
            }
          }
          L19: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param3 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L19;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                        var9 = this.field_q;
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
                        if (-23 != (var9 ^ -1)) {
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
                        if ((var9 ^ -1) == -18) {
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
                        if (-19 == (var9 ^ -1)) {
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
                        if (-20 != (var9 ^ -1)) {
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
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackOut_14_0 = (RuntimeException) (var4);
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
                    stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackOut_15_2 = "{...}";
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
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
                    stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackOut_18_2 = "{...}";
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(StarCannon param0, int param1, d[] param2, byte param3, vi param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        vi var8 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var6_int = sd.field_c;
              if (0 != var6_int) {
                if (-2 != (var6_int ^ -1)) {
                  if (var6_int != 2) {
                    if ((var6_int ^ -1) != -4) {
                      if (4 == var6_int) {
                        if (this.field_j < 5) {
                          break L1;
                        } else {
                          this.a(65535, -13, -256, -16 - -param1, -48, 1, param2, -116);
                          this.a(65535, -13, -256, 8 + -param1, 48, 1, param2, -120);
                          this.a(65535, -18, -256, param1 + -11, 8, 1, param2, -59);
                          this.a(65535, -18, -256, -param1 + 3, -8, 1, param2, param3 + -15);
                          mj.a(dg.field_l * 3 / 5, 12, 0, 12, 67);
                          this.field_j = 0;
                          break L1;
                        }
                      } else {
                        if ((var6_int ^ -1) == -6) {
                          if ((this.field_j ^ -1) > -6) {
                            break L1;
                          } else {
                            this.a(65535, -7, -256, -16 - -param1, -48, 1, param2, -62);
                            this.a(-26, 65535, param2, -107, 8, -384, 2, 1, -12 - -param1);
                            this.a(-26, 65535, param2, -119, -8, -384, 2, 1, 3 - param1);
                            this.a(65535, -7, -256, -param1 + 8, 48, 1, param2, param3 + -38);
                            mj.a(7 * dg.field_l / 10, param3 ^ -64, 0, 11, 67);
                            this.field_j = 0;
                            break L1;
                          }
                        } else {
                          if (6 == var6_int) {
                            if (5 > this.field_j) {
                              break L1;
                            } else {
                              this.a(65535, -7, -256, param1 + -20, -48, 1, param2, -123);
                              this.a(-26, 65535, param2, param3 + -65, 8, -384, 2, 1, -12 + param1);
                              this.a(65535, -22, -256, -6, -24, 1, param2, -108);
                              this.a(65535, -22, -256, -2, 24, 1, param2, -118);
                              this.a(-26, 65535, param2, param3 ^ 74, -8, -384, 2, 1, -param1 + 3);
                              this.a(65535, -7, -256, -param1 + 12, 48, 1, param2, param3 + -30);
                              mj.a(7 * dg.field_l / 10, 12, 0, 12, 67);
                              this.field_j = 0;
                              break L1;
                            }
                          } else {
                            if ((var6_int ^ -1) != -8) {
                              if (var6_int != 8) {
                                if (-10 != (var6_int ^ -1)) {
                                  if ((var6_int ^ -1) != -11) {
                                    if (11 != var6_int) {
                                      if ((var6_int ^ -1) != -13) {
                                        if (var6_int == 13) {
                                          L2: {
                                            if (3 == this.field_j) {
                                              this.a(-22, 65535, param2, -119, -16, -384, 2, 1, -7);
                                              this.a(-22, 65535, param2, -105, 16, -384, 2, 1, -2);
                                              break L2;
                                            } else {
                                              break L2;
                                            }
                                          }
                                          if ((this.field_j ^ -1) > -6) {
                                            break L1;
                                          } else {
                                            this.field_j = 0;
                                            this.a(-6, 65535, param2, -108, -80, -384, 2, 1, param1 + -22);
                                            this.a(-7, 65535, param2, -114, -64, -384, 2, 1, -20 + param1);
                                            this.a(-18, 65535, param2, -119, 8, -384, 2, 1, -12 + param1);
                                            this.a(-22, 16776960, param2, -104, -32, -384, 4, 1, -7);
                                            this.a(-22, 16776960, param2, -117, 32, -384, 4, 1, -2);
                                            this.a(-18, 65535, param2, -112, -8, -384, 2, 1, 3 + -param1);
                                            this.a(-7, 65535, param2, -124, 64, -384, 2, 1, 12 - param1);
                                            this.a(-6, 65535, param2, -113, 80, -384, 2, 1, -param1 + 14);
                                            mj.a(dg.field_l, 12, 0, 11, 50);
                                            break L1;
                                          }
                                        } else {
                                          if (var6_int != 14) {
                                            if (var6_int != 15) {
                                              if (16 == var6_int) {
                                                L3: {
                                                  if (3 == this.field_j) {
                                                    this.a(-18, 16776960, param2, -115, 4, -384, 1, 1, -12 + param1);
                                                    this.a(-22, 16776960, param2, -126, -16, -384, 4, 1, -7);
                                                    this.a(-22, 16776960, param2, -122, 16, -384, 4, 1, -2);
                                                    this.a(-18, 16776960, param2, -122, -4, -384, 1, 1, -param1 + 3);
                                                    mj.a(dg.field_l >> 758127489, param3 + 64, 0, 12, 50);
                                                    break L3;
                                                  } else {
                                                    break L3;
                                                  }
                                                }
                                                if (this.field_j >= 5) {
                                                  this.field_j = 0;
                                                  this.a(-6, 65535, param2, param3 + -69, -80, -384, 2, 1, param1 + -22);
                                                  this.a(-7, 16776960, param2, param3 + -71, -64, -384, 4, 1, -20 - -param1);
                                                  this.a(-18, 16776960, param2, -122, 8, -384, 4, 1, -12 + param1);
                                                  this.a(-22, 16776960, param2, param3 ^ 75, -32, -384, 4, 1, -7);
                                                  this.a(-22, 16776960, param2, -113, 32, -384, 4, 1, -2);
                                                  this.a(-18, 16776960, param2, param3 ^ 64, -8, -384, 4, 1, 3 + -param1);
                                                  this.a(-7, 16776960, param2, -116, 64, -384, 4, 1, 12 + -param1);
                                                  this.a(-6, 65535, param2, -126, 80, -384, 2, 1, 14 - param1);
                                                  mj.a(dg.field_l, 12, 0, 11, 50);
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              } else {
                                                if ((var6_int ^ -1) != -18) {
                                                  break L1;
                                                } else {
                                                  L4: {
                                                    if ((this.field_j ^ -1) != -4) {
                                                      break L4;
                                                    } else {
                                                      this.a(-22, 16777215, param2, -121, -16, -384, 8, 1, -7);
                                                      this.a(-22, 16777215, param2, -110, 16, -384, 8, 1, -2);
                                                      mj.a(dg.field_l >> 1072987585, param3 ^ -64, 0, 12, 50);
                                                      break L4;
                                                    }
                                                  }
                                                  if ((this.field_j ^ -1) > -6) {
                                                    break L1;
                                                  } else {
                                                    this.field_j = 0;
                                                    this.a(-6, 65535, param2, -123, -80, -384, 2, 1, param1 + -22);
                                                    this.a(-7, 16776960, param2, param3 ^ 76, -64, -384, 4, 1, param1 + -20);
                                                    this.a(-18, 16777215, param2, -126, 8, -384, 8, 1, param1 + -12);
                                                    this.a(-22, 16777215, param2, -126, -32, -384, 8, 1, -7);
                                                    this.a(-22, 16777215, param2, param3 + -72, 32, -384, 8, 1, -2);
                                                    this.a(-18, 16777215, param2, -113, -8, -384, 8, 1, 3 - param1);
                                                    this.a(-7, 16776960, param2, -120, 64, -384, 4, 1, 12 + -param1);
                                                    this.a(-6, 65535, param2, -104, 80, -384, 2, 1, 14 - param1);
                                                    mj.a(dg.field_l, 12, 0, 11, 50);
                                                    break L1;
                                                  }
                                                }
                                              }
                                            } else {
                                              L5: {
                                                if (3 == this.field_j) {
                                                  this.a(-22, 65535, param2, -114, -16, -384, 2, 1, -7);
                                                  this.a(-22, 65535, param2, -122, 16, -384, 2, 1, -2);
                                                  mj.a(2 * dg.field_l / 5, 12, 0, 11, 50);
                                                  break L5;
                                                } else {
                                                  break L5;
                                                }
                                              }
                                              if (this.field_j >= 5) {
                                                this.field_j = 0;
                                                this.a(-6, 65535, param2, -121, -80, -384, 1, 1, -22 - -param1);
                                                this.a(-7, 16776960, param2, -124, -64, -384, 4, 1, -20 - -param1);
                                                this.a(-18, 16776960, param2, -112, 8, -384, 4, 1, param1 + -12);
                                                this.a(-22, 16776960, param2, -109, -32, -384, 4, 1, -7);
                                                this.a(-22, 16776960, param2, -123, 32, -384, 4, 1, -2);
                                                this.a(-18, 16776960, param2, -121, -8, -384, 4, 1, 3 + -param1);
                                                this.a(-7, 16776960, param2, param3 ^ 88, 64, -384, 4, 1, -param1 + 12);
                                                this.a(-6, 65535, param2, -105, 80, -384, 1, 1, -param1 + 14);
                                                mj.a(dg.field_l * 4 / 5, 12, 0, 12, 50);
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            L6: {
                                              if (this.field_j != 3) {
                                                break L6;
                                              } else {
                                                this.a(-22, 65535, param2, -122, -16, -384, 2, 1, -7);
                                                this.a(-22, 65535, param2, -107, 16, -384, 2, 1, -2);
                                                mj.a(2 * dg.field_l / 5, 12, 0, 12, 50);
                                                break L6;
                                              }
                                            }
                                            if (-6 < (this.field_j ^ -1)) {
                                              break L1;
                                            } else {
                                              this.field_j = 0;
                                              this.a(-6, 65535, param2, param3 ^ 75, -80, -384, 1, 1, param1 + -22);
                                              this.a(-7, 65535, param2, -106, -64, -384, 2, 1, -20 + param1);
                                              this.a(-18, 16776960, param2, param3 + -65, 8, -384, 4, 1, -12 - -param1);
                                              this.a(-22, 16776960, param2, param3 ^ 68, -32, -384, 4, 1, -7);
                                              this.a(-22, 16776960, param2, -122, 32, -384, 4, 1, -2);
                                              this.a(-18, 16776960, param2, param3 + -55, -8, -384, 4, 1, 3 - param1);
                                              this.a(-7, 65535, param2, -109, 64, -384, 2, 1, -param1 + 12);
                                              this.a(-6, 65535, param2, -119, 80, -384, 1, 1, 14 + -param1);
                                              mj.a(4 * dg.field_l / 5, param3 + 64, 0, 11, 50);
                                              break L1;
                                            }
                                          }
                                        }
                                      } else {
                                        L7: {
                                          if (this.field_j != 3) {
                                            break L7;
                                          } else {
                                            this.a(-22, 65535, param2, -125, -16, -384, 2, 1, -7);
                                            this.a(-22, 65535, param2, -109, 16, -384, 2, 1, -2);
                                            break L7;
                                          }
                                        }
                                        if (-6 >= (this.field_j ^ -1)) {
                                          this.a(-6, 65535, param2, param3 + -54, -80, -384, 2, 1, param1 + -22);
                                          this.a(-7, 65535, param2, -111, -64, -384, 2, 1, param1 + -20);
                                          this.a(-18, 65535, param2, param3 + -63, 8, -384, 2, 1, param1 + -12);
                                          this.a(-22, 65535, param2, -104, -32, -384, 2, 1, -7);
                                          this.a(-22, 65535, param2, param3 ^ 91, 32, -384, 2, 1, -2);
                                          this.a(-18, 65535, param2, -121, -8, -384, 2, 1, 3 + -param1);
                                          this.a(-7, 65535, param2, -126, 64, -384, 2, 1, -param1 + 12);
                                          this.a(-6, 65535, param2, param3 ^ 67, 80, -384, 2, 1, -param1 + 14);
                                          mj.a(9 * dg.field_l / 10, param3 ^ -64, 0, 12, 50);
                                          this.field_j = 0;
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    } else {
                                      if (5 <= this.field_j) {
                                        this.a(-6, 65535, param2, -128, -80, -384, 2, 1, -22 + param1);
                                        this.a(-7, 65535, param2, param3 + -76, -64, -384, 2, 1, param1 + -20);
                                        this.a(-18, 65535, param2, -125, 8, -384, 2, 1, -12 + param1);
                                        this.a(-22, 65535, param2, -118, -32, -384, 2, 1, -7);
                                        this.a(-22, 65535, param2, -105, 32, -384, 2, 1, -2);
                                        this.a(-18, 65535, param2, -123, -8, -384, 2, 1, -param1 + 3);
                                        this.a(-7, 65535, param2, -124, 64, -384, 2, 1, -param1 + 12);
                                        this.a(-6, 65535, param2, param3 + -56, 80, -384, 2, 1, -param1 + 14);
                                        mj.a(9 * dg.field_l / 10, 12, 0, 11, 50);
                                        this.field_j = 0;
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  } else {
                                    if (5 > this.field_j) {
                                      break L1;
                                    } else {
                                      this.a(-6, 65535, param2, -109, -80, -384, 1, 1, -22 + param1);
                                      this.a(-7, 65535, param2, param3 + -60, -64, -384, 2, 1, param1 + -20);
                                      this.a(-18, 65535, param2, -116, 8, -384, 2, 1, param1 + -12);
                                      this.a(-22, 65535, param2, -122, -32, -384, 2, 1, -7);
                                      this.a(-22, 65535, param2, -113, 32, -384, 2, 1, -2);
                                      this.a(-18, 65535, param2, -104, -8, -384, 2, 1, 3 - param1);
                                      this.a(-7, 65535, param2, -119, 64, -384, 2, 1, -param1 + 12);
                                      this.a(-6, 65535, param2, -106, 80, -384, 1, 1, 14 + -param1);
                                      mj.a(4 * dg.field_l / 5, 12, 0, 12, 50);
                                      this.field_j = 0;
                                      break L1;
                                    }
                                  }
                                } else {
                                  if (5 > this.field_j) {
                                    break L1;
                                  } else {
                                    this.a(-6, 65535, param2, -125, -80, -384, 1, 1, -22 - -param1);
                                    this.a(-7, 65535, param2, -124, -64, -384, 1, 1, -20 + param1);
                                    this.a(-18, 65535, param2, -112, 8, -384, 2, 1, param1 + -12);
                                    this.a(-22, 65535, param2, param3 + -53, -32, -384, 2, 1, -7);
                                    this.a(-22, 65535, param2, -120, 32, -384, 2, 1, -2);
                                    this.a(-18, 65535, param2, -124, -8, -384, 2, 1, 3 + -param1);
                                    this.a(-7, 65535, param2, -128, 64, -384, 1, 1, -param1 + 12);
                                    this.a(-6, 65535, param2, param3 + -54, 80, -384, 1, 1, -param1 + 14);
                                    mj.a(4 * dg.field_l / 5, 12, 0, 11, 50);
                                    this.field_j = 0;
                                    break L1;
                                  }
                                }
                              } else {
                                if (5 > this.field_j) {
                                  break L1;
                                } else {
                                  this.a(-7, 65535, param2, -115, -64, -384, 2, 1, -20 - -param1);
                                  this.a(-18, 65535, param2, -110, 8, -384, 2, 1, param1 + -12);
                                  this.a(-22, 65535, param2, param3 + -58, -32, -384, 2, 1, -7);
                                  this.a(-22, 65535, param2, -121, 32, -384, 2, 1, -2);
                                  this.a(-18, 65535, param2, -127, -8, -384, 2, 1, -param1 + 3);
                                  this.a(-7, 65535, param2, -110, 64, -384, 2, 1, 12 - param1);
                                  mj.a(7 * dg.field_l / 10, 12, 0, 12, 50);
                                  this.field_j = 0;
                                  break L1;
                                }
                              }
                            } else {
                              if ((this.field_j ^ -1) > -6) {
                                break L1;
                              } else {
                                this.a(65535, -7, -256, -20 - -param1, -64, 1, param2, param3 ^ 72);
                                this.a(-18, 65535, param2, -109, 8, -384, 2, 1, param1 + -12);
                                this.a(-22, 65535, param2, -125, -32, -384, 2, 1, -7);
                                this.a(-22, 65535, param2, -114, 32, -384, 2, 1, -2);
                                this.a(-18, 65535, param2, -125, -8, -384, 2, 1, -param1 + 3);
                                this.a(65535, -7, -256, 12 + -param1, 64, 1, param2, -66);
                                mj.a(dg.field_l * 7 / 10, param3 ^ -64, 0, 11, 50);
                                this.field_j = 0;
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (5 <= this.field_j) {
                        this.a(65535, -13, -256, -16 - -param1, -32, 1, param2, -66);
                        this.a(65535, -13, -256, -param1 + 8, 32, 1, param2, -113);
                        this.a(65535, -22, -256, -4, 0, 1, param2, param3 + -22);
                        mj.a(dg.field_l * 3 / 5, 12, 0, 11, 67);
                        this.field_j = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    if (5 <= this.field_j) {
                      this.a(65535, -13, -256, param1 + -16, -16, 1, param2, -84);
                      this.a(65535, -13, -256, -param1 + 8, 16, 1, param2, -109);
                      mj.a(3 * dg.field_l / 5, 12, 0, 12, 75);
                      this.field_j = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  L8: {
                    if (-6 != (this.field_j ^ -1)) {
                      break L8;
                    } else {
                      this.a(65535, -13, -256, -16 - -param1, -32, 1, param2, -122);
                      this.a(65535, -13, -256, -param1 + 8, 32, 1, param2, -112);
                      break L8;
                    }
                  }
                  L9: {
                    if (this.field_j == 10) {
                      this.a(65535, -22, -256, -4, 0, 1, param2, -106);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (this.field_j % 5 != 0) {
                      break L10;
                    } else {
                      mj.a(3 * dg.field_l / 5, param3 + 64, 0, 11, 75);
                      break L10;
                    }
                  }
                  if (-11 < (this.field_j ^ -1)) {
                    break L1;
                  } else {
                    this.field_j = 0;
                    break L1;
                  }
                }
              } else {
                L11: {
                  if (this.field_j != 4) {
                    break L11;
                  } else {
                    this.a(65535, -13, -256, param1 + -16, -16, 1, param2, -99);
                    break L11;
                  }
                }
                L12: {
                  if (-9 != (this.field_j ^ -1)) {
                    break L12;
                  } else {
                    this.a(65535, -13, -256, -param1 + 8, 16, 1, param2, -118);
                    break L12;
                  }
                }
                L13: {
                  if (-1 != (3 & this.field_j ^ -1)) {
                    break L13;
                  } else {
                    mj.a(dg.field_l >> -2074325791, 12, 0, 12, 75);
                    break L13;
                  }
                }
                if (8 <= this.field_j) {
                  this.field_j = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L14: {
              if (param3 == -52) {
                break L14;
              } else {
                var8 = (vi) null;
                this.a((d[]) null, -4, (StarCannon) null, -30, (vi) null);
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var6 = decompiledCaughtException;
            stackOut_106_0 = (RuntimeException) (var6);
            stackOut_106_1 = new StringBuilder().append("bf.C(");
            stackIn_108_0 = stackOut_106_0;
            stackIn_108_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param0 == null) {
              stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L15;
            } else {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "{...}";
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              break L15;
            }
          }
          L16: {
            stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
            stackOut_109_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_109_2).append(',').append(param1).append(',');
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param2 == null) {
              stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
              stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L16;
            } else {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L16;
            }
          }
          L17: {
            stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
            stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(',').append(param3).append(',');
            stackIn_114_0 = stackOut_112_0;
            stackIn_114_1 = stackOut_112_1;
            stackIn_113_0 = stackOut_112_0;
            stackIn_113_1 = stackOut_112_1;
            if (param4 == null) {
              stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L17;
            } else {
              stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackOut_113_2 = "{...}";
              stackIn_115_0 = stackOut_113_0;
              stackIn_115_1 = stackOut_113_1;
              stackIn_115_2 = stackOut_113_2;
              break L17;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ')');
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
                this.field_g = -91;
                break L1;
              }
            }
            L2: {
              var10 = new d(this.field_f - -param8, param0 + this.field_u, param4, param5, param1, param7, param6, 0);
              if (v.a(var10, -4001)) {
                var10.field_a = this.field_f;
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
            stackOut_6_0 = (RuntimeException) (var10_ref);
            stackOut_6_1 = new StringBuilder().append("bf.O(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
            kl.a(param1, 8192);
            int var2_int = -81 / ((-14 - param0) / 60);
            sc.a(false, (byte) 106, bl.field_c);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, d[] param5, int param6, int param7, int param8, int param9) {
        RuntimeException var11 = null;
        d[] var12 = null;
        d var13 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var13 = new d(param9 - -param4, param1 + this.field_u, param3, param0, param6, param2, param8, 0);
              if (!v.a(var13, -4001)) {
                break L1;
              } else {
                var13.field_a = param9;
                break L1;
              }
            }
            L2: {
              if (param7 == -11) {
                break L2;
              } else {
                var12 = (d[]) null;
                this.a(-54, 82, -43, 39, 0, -17, (d[]) null, 10);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var11 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var11);
            stackOut_5_1 = new StringBuilder().append("bf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final void a(int param0, d[] param1, vi param2, StarCannon param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_175_0 = null;
        StringBuilder stackIn_175_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        String stackIn_177_2 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_179_0 = null;
        StringBuilder stackIn_179_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        String stackIn_180_2 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_183_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_174_0 = null;
        StringBuilder stackOut_174_1 = null;
        RuntimeException stackOut_176_0 = null;
        StringBuilder stackOut_176_1 = null;
        String stackOut_176_2 = null;
        RuntimeException stackOut_175_0 = null;
        StringBuilder stackOut_175_1 = null;
        String stackOut_175_2 = null;
        RuntimeException stackOut_177_0 = null;
        StringBuilder stackOut_177_1 = null;
        RuntimeException stackOut_179_0 = null;
        StringBuilder stackOut_179_1 = null;
        String stackOut_179_2 = null;
        RuntimeException stackOut_178_0 = null;
        StringBuilder stackOut_178_1 = null;
        String stackOut_178_2 = null;
        RuntimeException stackOut_180_0 = null;
        StringBuilder stackOut_180_1 = null;
        RuntimeException stackOut_182_0 = null;
        StringBuilder stackOut_182_1 = null;
        String stackOut_182_2 = null;
        RuntimeException stackOut_181_0 = null;
        StringBuilder stackOut_181_1 = null;
        String stackOut_181_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            var5_int = this.field_f;
            if (param0 < -1) {
              L1: {
                var6 = sd.field_c;
                if (0 != var6) {
                  if (var6 != 1) {
                    if (-3 == (var6 ^ -1)) {
                      L2: {
                        L3: {
                          if (-5 == (this.field_j ^ -1)) {
                            break L3;
                          } else {
                            if ((this.field_j ^ -1) == -9) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 0);
                        break L2;
                      }
                      L4: {
                        if (this.field_j != 4) {
                          break L4;
                        } else {
                          mj.a(dg.field_l * 4 / 7, 12, 0, 18, 80);
                          break L4;
                        }
                      }
                      if (this.field_j < 8) {
                        break L1;
                      } else {
                        this.field_j = 0;
                        break L1;
                      }
                    } else {
                      if (var6 != 3) {
                        if (-5 != (var6 ^ -1)) {
                          if (-6 == (var6 ^ -1)) {
                            L5: {
                              L6: {
                                if (3 == this.field_j) {
                                  break L6;
                                } else {
                                  if (this.field_j == 6) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                              break L5;
                            }
                            L7: {
                              if (3 != this.field_j) {
                                break L7;
                              } else {
                                mj.a(4 * dg.field_l / 7, 12, 0, 18, 80);
                                break L7;
                              }
                            }
                            if (-7 < (this.field_j ^ -1)) {
                              break L1;
                            } else {
                              this.field_j = 0;
                              break L1;
                            }
                          } else {
                            if ((var6 ^ -1) != -7) {
                              if ((var6 ^ -1) != -8) {
                                if (var6 == 8) {
                                  L8: {
                                    if (-3 != (this.field_j ^ -1)) {
                                      break L8;
                                    } else {
                                      this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -4);
                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                      this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 4);
                                      mj.a(dg.field_l * 4 / 7, 12, 0, 18, 50);
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if (5 == this.field_j) {
                                      this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                                      this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  if (-6 >= (this.field_j ^ -1)) {
                                    this.field_j = 0;
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (-10 == (var6 ^ -1)) {
                                    L10: {
                                      if (2 == this.field_j) {
                                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 0);
                                        mj.a(4 * dg.field_l / 7, 12, 0, 16, 50);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (this.field_j == 4) {
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    if (-5 < (this.field_j ^ -1)) {
                                      break L1;
                                    } else {
                                      this.field_j = 0;
                                      break L1;
                                    }
                                  } else {
                                    if (var6 != 10) {
                                      if (11 == var6) {
                                        L12: {
                                          if (this.field_j != 2) {
                                            break L12;
                                          } else {
                                            this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -8);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                            this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 8);
                                            mj.a(dg.field_l, 12, 0, 18, 100);
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (-5 == (this.field_j ^ -1)) {
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        if (-5 < (this.field_j ^ -1)) {
                                          break L1;
                                        } else {
                                          this.field_j = 0;
                                          break L1;
                                        }
                                      } else {
                                        if (-13 == (var6 ^ -1)) {
                                          L14: {
                                            if (this.field_j == 2) {
                                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -8);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 8);
                                              mj.a(dg.field_l * 4 / 7, 12, 0, 16, 50);
                                              break L14;
                                            } else {
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            if (4 != this.field_j) {
                                              break L15;
                                            } else {
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                              break L15;
                                            }
                                          }
                                          if (this.field_j >= 4) {
                                            this.field_j = 0;
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        } else {
                                          if ((var6 ^ -1) == -14) {
                                            L16: {
                                              if (-3 == (this.field_j ^ -1)) {
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                mj.a(dg.field_l * 4 / 7, 12, 0, 17, 50);
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              if (4 != this.field_j) {
                                                break L17;
                                              } else {
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                                break L17;
                                              }
                                            }
                                            if (-5 >= (this.field_j ^ -1)) {
                                              this.field_j = 0;
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          } else {
                                            if (-15 != (var6 ^ -1)) {
                                              if ((var6 ^ -1) != -16) {
                                                if ((var6 ^ -1) == -17) {
                                                  L18: {
                                                    if (-3 == (this.field_j ^ -1)) {
                                                      this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, -12);
                                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                      this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, 12);
                                                      mj.a(4 * dg.field_l / 7, 12, 0, 17, 50);
                                                      break L18;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                  L19: {
                                                    if ((this.field_j ^ -1) == -5) {
                                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -12);
                                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 12);
                                                      break L19;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                  if (this.field_j < 4) {
                                                    break L1;
                                                  } else {
                                                    this.field_j = 0;
                                                    break L1;
                                                  }
                                                } else {
                                                  if (17 == var6) {
                                                    L20: {
                                                      if (2 != this.field_j) {
                                                        break L20;
                                                      } else {
                                                        this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, -12);
                                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                        this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, 12);
                                                        mj.a(dg.field_l * 3 / 7, 12, 0, 16, 100);
                                                        break L20;
                                                      }
                                                    }
                                                    L21: {
                                                      if (-5 == (this.field_j ^ -1)) {
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
                                                        break L21;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                    if (-5 >= (this.field_j ^ -1)) {
                                                      this.field_j = 0;
                                                      break L1;
                                                    } else {
                                                      break L1;
                                                    }
                                                  } else {
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                L22: {
                                                  if (-3 == (this.field_j ^ -1)) {
                                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -12);
                                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 12);
                                                    mj.a(4 * dg.field_l / 7, 12, 0, 16, 50);
                                                    break L22;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                                L23: {
                                                  if ((this.field_j ^ -1) != -5) {
                                                    break L23;
                                                  } else {
                                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -12);
                                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 12);
                                                    break L23;
                                                  }
                                                }
                                                if ((this.field_j ^ -1) > -5) {
                                                  break L1;
                                                } else {
                                                  this.field_j = 0;
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              L24: {
                                                if (2 != this.field_j) {
                                                  break L24;
                                                } else {
                                                  this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -12);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 12);
                                                  mj.a(dg.field_l * 4 / 7, 12, 0, 18, 50);
                                                  break L24;
                                                }
                                              }
                                              L25: {
                                                if (4 == this.field_j) {
                                                  this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -12);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                                  this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 12);
                                                  break L25;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                              if (4 <= this.field_j) {
                                                this.field_j = 0;
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L26: {
                                        if (this.field_j == 2) {
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                          mj.a(dg.field_l * 4 / 7, 12, 0, 17, 50);
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      L27: {
                                        if (4 != this.field_j) {
                                          break L27;
                                        } else {
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                          break L27;
                                        }
                                      }
                                      if (4 <= this.field_j) {
                                        this.field_j = 0;
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L28: {
                                  if (2 == this.field_j) {
                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                                    mj.a(dg.field_l * 4 / 7, 12, 0, 17, 80);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                L29: {
                                  if (this.field_j != 4) {
                                    break L29;
                                  } else {
                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                                    this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                                    break L29;
                                  }
                                }
                                if ((this.field_j ^ -1) > -5) {
                                  break L1;
                                } else {
                                  this.field_j = 0;
                                  break L1;
                                }
                              }
                            } else {
                              L30: {
                                if (-3 != (this.field_j ^ -1)) {
                                  break L30;
                                } else {
                                  this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                                  this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                                  mj.a(dg.field_l * 4 / 7, 12, 0, 16, 75);
                                  break L30;
                                }
                              }
                              L31: {
                                if ((this.field_j ^ -1) != -6) {
                                  break L31;
                                } else {
                                  this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                                  this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                                  break L31;
                                }
                              }
                              if (-6 >= (this.field_j ^ -1)) {
                                this.field_j = 0;
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          }
                        } else {
                          L32: {
                            if (this.field_j != 2) {
                              break L32;
                            } else {
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                              mj.a(dg.field_l * 3 / 7, 12, 0, 17, 80);
                              break L32;
                            }
                          }
                          L33: {
                            if (4 == this.field_j) {
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          if (-5 < (this.field_j ^ -1)) {
                            break L1;
                          } else {
                            this.field_j = 0;
                            break L1;
                          }
                        }
                      } else {
                        L34: {
                          if (2 == this.field_j) {
                            mj.a(4 * dg.field_l / 7, 12, 0, 16, 80);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          L36: {
                            if (3 == this.field_j) {
                              break L36;
                            } else {
                              if ((this.field_j ^ -1) != -7) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -4);
                          this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 4);
                          break L35;
                        }
                        if (this.field_j < 6) {
                          break L1;
                        } else {
                          this.field_j = 0;
                          break L1;
                        }
                      }
                    }
                  } else {
                    L37: {
                      L38: {
                        if (-4 == (this.field_j ^ -1)) {
                          break L38;
                        } else {
                          if ((this.field_j ^ -1) != -7) {
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 0);
                      break L37;
                    }
                    L39: {
                      if (-4 != (this.field_j ^ -1)) {
                        break L39;
                      } else {
                        mj.a(dg.field_l * 4 / 7, 12, 0, 17, 80);
                        break L39;
                      }
                    }
                    if ((this.field_j ^ -1) > -7) {
                      break L1;
                    } else {
                      this.field_j = 0;
                      break L1;
                    }
                  }
                } else {
                  L40: {
                    L41: {
                      if (this.field_j == 4) {
                        break L41;
                      } else {
                        if (-9 != (this.field_j ^ -1)) {
                          break L40;
                        } else {
                          break L41;
                        }
                      }
                    }
                    this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 0);
                    break L40;
                  }
                  L42: {
                    if (this.field_j == 4) {
                      mj.a(dg.field_l * 4 / 7, 12, 0, 16, 50);
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  if (-9 < (this.field_j ^ -1)) {
                    break L1;
                  } else {
                    this.field_j = 0;
                    break L1;
                  }
                }
              }
              this.field_f = var5_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L43: {
            var5 = decompiledCaughtException;
            stackOut_174_0 = (RuntimeException) (var5);
            stackOut_174_1 = new StringBuilder().append("bf.A(").append(param0).append(',');
            stackIn_176_0 = stackOut_174_0;
            stackIn_176_1 = stackOut_174_1;
            stackIn_175_0 = stackOut_174_0;
            stackIn_175_1 = stackOut_174_1;
            if (param1 == null) {
              stackOut_176_0 = (RuntimeException) ((Object) stackIn_176_0);
              stackOut_176_1 = (StringBuilder) ((Object) stackIn_176_1);
              stackOut_176_2 = "null";
              stackIn_177_0 = stackOut_176_0;
              stackIn_177_1 = stackOut_176_1;
              stackIn_177_2 = stackOut_176_2;
              break L43;
            } else {
              stackOut_175_0 = (RuntimeException) ((Object) stackIn_175_0);
              stackOut_175_1 = (StringBuilder) ((Object) stackIn_175_1);
              stackOut_175_2 = "{...}";
              stackIn_177_0 = stackOut_175_0;
              stackIn_177_1 = stackOut_175_1;
              stackIn_177_2 = stackOut_175_2;
              break L43;
            }
          }
          L44: {
            stackOut_177_0 = (RuntimeException) ((Object) stackIn_177_0);
            stackOut_177_1 = ((StringBuilder) (Object) stackIn_177_1).append(stackIn_177_2).append(',');
            stackIn_179_0 = stackOut_177_0;
            stackIn_179_1 = stackOut_177_1;
            stackIn_178_0 = stackOut_177_0;
            stackIn_178_1 = stackOut_177_1;
            if (param2 == null) {
              stackOut_179_0 = (RuntimeException) ((Object) stackIn_179_0);
              stackOut_179_1 = (StringBuilder) ((Object) stackIn_179_1);
              stackOut_179_2 = "null";
              stackIn_180_0 = stackOut_179_0;
              stackIn_180_1 = stackOut_179_1;
              stackIn_180_2 = stackOut_179_2;
              break L44;
            } else {
              stackOut_178_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackOut_178_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackOut_178_2 = "{...}";
              stackIn_180_0 = stackOut_178_0;
              stackIn_180_1 = stackOut_178_1;
              stackIn_180_2 = stackOut_178_2;
              break L44;
            }
          }
          L45: {
            stackOut_180_0 = (RuntimeException) ((Object) stackIn_180_0);
            stackOut_180_1 = ((StringBuilder) (Object) stackIn_180_1).append(stackIn_180_2).append(',');
            stackIn_182_0 = stackOut_180_0;
            stackIn_182_1 = stackOut_180_1;
            stackIn_181_0 = stackOut_180_0;
            stackIn_181_1 = stackOut_180_1;
            if (param3 == null) {
              stackOut_182_0 = (RuntimeException) ((Object) stackIn_182_0);
              stackOut_182_1 = (StringBuilder) ((Object) stackIn_182_1);
              stackOut_182_2 = "null";
              stackIn_183_0 = stackOut_182_0;
              stackIn_183_1 = stackOut_182_1;
              stackIn_183_2 = stackOut_182_2;
              break L45;
            } else {
              stackOut_181_0 = (RuntimeException) ((Object) stackIn_181_0);
              stackOut_181_1 = (StringBuilder) ((Object) stackIn_181_1);
              stackOut_181_2 = "{...}";
              stackIn_183_0 = stackOut_181_0;
              stackIn_183_1 = stackOut_181_1;
              stackIn_183_2 = stackOut_181_2;
              break L45;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_183_0), stackIn_183_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
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
                this.field_t = -2;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bf.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, boolean param1, String param2, byte param3, ma param4, ma param5, int param6) {
        boolean discarded$1 = false;
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
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
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
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
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
        int stackOut_51_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
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
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
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
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                      var14 = (CharSequence) ((Object) param2);
                      ck.field_g.a(false, cc.a(20755, var14));
                      ck.field_g.c(param6, -306);
                      ck.field_g.a(param0, param3 + -133);
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
                    fc.a(ck.field_g, d.field_b, ed.field_j, gg.field_e, 0);
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
                      if (param5.c(param3 ^ 6)) {
                        stackOut_9_0 = (rb) ((Object) stackIn_9_0);
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = (String) (var13);
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L6;
                      } else {
                        stackOut_8_0 = (rb) ((Object) stackIn_8_0);
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
                        stackOut_12_0 = (rb) ((Object) stackIn_12_0);
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = (String) (var8);
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L7;
                      } else {
                        stackOut_11_0 = (rb) ((Object) stackIn_11_0);
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = "";
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L7;
                      }
                    }
                    ((rb) (Object) stackIn_13_0).a(stackIn_13_1 != 0, stackIn_13_2);
                    d.field_b.a(16, param3 ^ -64);
                    d.field_b.field_g = d.field_b.field_g + 1;
                    var9 = d.field_b.field_g;
                    fc.a(ck.field_g, d.field_b, ed.field_j, gg.field_e, 0);
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
                if (!ag.a(param3 ^ 122, 1)) {
                  break L8;
                } else {
                  L9: {
                    var9 = se.field_p.j(param3 ^ 7907);
                    se.field_p.field_g = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (-106 <= (var9 ^ -1)) {
                        r.field_c = dh.field_a;
                        ph.field_nb = new String[var9 - 100];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    mi.a(param3 ^ 1048582, ll.b(param3 ^ 109));
                    uj.field_r = vk.field_x;
                    ec.a((byte) 27);
                    eb.field_f = false;
                    stackOut_30_0 = var9;
                    stackIn_31_0 = stackOut_30_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (-100 != (var9 ^ -1)) {
                      r.field_c = ab.field_F;
                      il.field_g = -1;
                      vh.field_t = var9;
                      break L8;
                    } else {
                      discarded$1 = ag.a(124, gd.a(true));
                      oj.field_g = new Boolean(vf.a(se.field_p, param3 + -6));
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
                  var10 = se.field_p.i(param3 ^ -1174051986);
                  se.field_p.field_g = 0;
                  if (ag.a(126, var10)) {
                    var11 = ph.field_nb.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        ec.a((byte) 27);
                        eb.field_f = false;
                        stackOut_40_0 = var11 + 100;
                        stackIn_41_0 = stackOut_40_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
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
              if (param3 == 6) {
                break L12;
              } else {
                bf.a(-76);
                break L12;
              }
            }
            L13: {
              if (r.field_c != ab.field_F) {
                break L13;
              } else {
                if (fk.a(false)) {
                  L14: {
                    if (255 == vh.field_t) {
                      var9_ref_String = se.field_p.b((byte) -86);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        lj.a(var9_ref_String, param3 ^ 121, ll.b(111));
                        break L14;
                      }
                    } else {
                      uj.field_r = se.field_p.a(-125);
                      break L14;
                    }
                  }
                  ec.a((byte) 27);
                  eb.field_f = false;
                  stackOut_51_0 = vh.field_t;
                  stackIn_52_0 = stackOut_51_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L13;
                }
              }
            }
            L15: {
              if (null == m.field_b) {
                if (eb.field_f) {
                  L16: {
                    if (30000L >= kg.b((byte) -71)) {
                      uj.field_r = va.field_o;
                      break L16;
                    } else {
                      uj.field_r = ti.field_g;
                      break L16;
                    }
                  }
                  eb.field_f = false;
                  stackOut_60_0 = 249;
                  stackIn_61_0 = stackOut_60_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  var9 = sj.field_I;
                  sj.field_I = pe.field_c;
                  eb.field_f = true;
                  pe.field_c = var9;
                  break L15;
                }
              } else {
                break L15;
              }
            }
            stackOut_62_0 = -1;
            stackIn_63_0 = stackOut_62_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var7);
            stackOut_64_1 = new StringBuilder().append("bf.H(").append(param0).append(',').append(param1).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param2 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L17;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L17;
            }
          }
          L18: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param3).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param4 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L18;
            }
          }
          L19: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L19;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_41_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_52_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_61_0;
                } else {
                  return stackIn_63_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_x = null;
        if (param0 != 15415) {
            field_w = 4;
        }
        field_y = null;
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        int discarded$7 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        ma var9 = null;
        CharSequence var10 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        String stackOut_24_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (0 != param0) {
              if (1 == param0) {
                var10 = param3[param1];
                var4 = var10;
                if (var4 != null) {
                  stackOut_8_0 = var10.toString();
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_6_0 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L1: {
                  if (param2 == 4) {
                    break L1;
                  } else {
                    var9 = (ma) null;
                    discarded$7 = bf.a(62, false, (String) null, (byte) 43, (ma) null, (ma) null, -127);
                    break L1;
                  }
                }
                var4_int = param1 + param0;
                var5 = 0;
                var6_int = param1;
                L2: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param1;
                    L3: while (true) {
                      if (var4_int <= var7) {
                        stackOut_24_0 = var6.toString();
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          var8 = param3[var7];
                          if (var8 != null) {
                            discarded$8 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$9 = var6.append("null");
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param3[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_1_0 = "";
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4_ref);
            stackOut_26_1 = new StringBuilder().append("bf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_25_0;
            }
          }
        }
    }

    private final void a(d[] param0, int param1, StarCannon param2, int param3, vi param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_373_0 = null;
        StringBuilder stackIn_373_1 = null;
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        RuntimeException stackIn_375_0 = null;
        StringBuilder stackIn_375_1 = null;
        String stackIn_375_2 = null;
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        RuntimeException stackIn_377_0 = null;
        StringBuilder stackIn_377_1 = null;
        RuntimeException stackIn_378_0 = null;
        StringBuilder stackIn_378_1 = null;
        String stackIn_378_2 = null;
        RuntimeException stackIn_379_0 = null;
        StringBuilder stackIn_379_1 = null;
        RuntimeException stackIn_380_0 = null;
        StringBuilder stackIn_380_1 = null;
        RuntimeException stackIn_381_0 = null;
        StringBuilder stackIn_381_1 = null;
        String stackIn_381_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_372_0 = null;
        StringBuilder stackOut_372_1 = null;
        RuntimeException stackOut_374_0 = null;
        StringBuilder stackOut_374_1 = null;
        String stackOut_374_2 = null;
        RuntimeException stackOut_373_0 = null;
        StringBuilder stackOut_373_1 = null;
        String stackOut_373_2 = null;
        RuntimeException stackOut_375_0 = null;
        StringBuilder stackOut_375_1 = null;
        RuntimeException stackOut_377_0 = null;
        StringBuilder stackOut_377_1 = null;
        String stackOut_377_2 = null;
        RuntimeException stackOut_376_0 = null;
        StringBuilder stackOut_376_1 = null;
        String stackOut_376_2 = null;
        RuntimeException stackOut_378_0 = null;
        StringBuilder stackOut_378_1 = null;
        RuntimeException stackOut_380_0 = null;
        StringBuilder stackOut_380_1 = null;
        String stackOut_380_2 = null;
        RuntimeException stackOut_379_0 = null;
        StringBuilder stackOut_379_1 = null;
        String stackOut_379_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var6_int = sd.field_c;
              if (var6_int != 0) {
                if ((var6_int ^ -1) != -2) {
                  if (var6_int == 2) {
                    L2: {
                      if (this.field_j == 4) {
                        this.a(-11, 65280, param0, -128, -32, -64, 2, 11, -param3 + -12);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (6 != this.field_j) {
                        break L3;
                      } else {
                        this.a(-11, 65280, param0, -113, 32, -64, 2, 11, 4 + -param3);
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        if ((this.field_j ^ -1) == -5) {
                          break L5;
                        } else {
                          if (6 == this.field_j) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      mj.a(dg.field_l * 3 / 10, 12, 0, 13, 40);
                      break L4;
                    }
                    if ((this.field_j ^ -1) <= -11) {
                      this.field_j = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    if ((var6_int ^ -1) == -4) {
                      L6: {
                        if (this.field_j == 8) {
                          this.a(-11, 65280, param0, -104, -32, -64, 2, 11, -12 + -param3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (this.field_j != 12) {
                          break L7;
                        } else {
                          this.a(-11, 65280, param0, -106, 32, -64, 2, 11, -param3 + 4);
                          break L7;
                        }
                      }
                      L8: {
                        if (10 == this.field_j) {
                          this.a(-9, 65280, param0, -109, -128, -16, 2, 11, -param3 + -16);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (this.field_j != 14) {
                          break L9;
                        } else {
                          this.a(-9, 65280, param0, -112, 128, -16, 2, 11, -param3 + 8);
                          break L9;
                        }
                      }
                      L10: {
                        if ((this.field_j ^ -1) != -17) {
                          break L10;
                        } else {
                          this.a(-10, 65280, param0, -128, -96, -32, 2, 11, -14 - param3);
                          break L10;
                        }
                      }
                      L11: {
                        if (20 != this.field_j) {
                          break L11;
                        } else {
                          this.a(-10, 65280, param0, -107, 96, -32, 2, 11, -param3 + 6);
                          break L11;
                        }
                      }
                      L12: {
                        if (0 != (3 & this.field_j)) {
                          break L12;
                        } else {
                          if (-5 > (this.field_j ^ -1)) {
                            mj.a(2 * dg.field_l / 5, 12, 0, 14, 50);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (-21 >= (this.field_j ^ -1)) {
                        this.field_j = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      if (-5 != (var6_int ^ -1)) {
                        if (var6_int == 5) {
                          L13: {
                            if (this.field_j == 4) {
                              this.a(-11, 65280, param0, -120, -32, -64, 2, 11, -param3 + -12);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if (-6 != (this.field_j ^ -1)) {
                              break L14;
                            } else {
                              this.a(-9, 65280, param0, -112, -128, -16, 2, 11, -16 + -param3);
                              break L14;
                            }
                          }
                          L15: {
                            if (this.field_j != 6) {
                              break L15;
                            } else {
                              this.a(-11, 65280, param0, -118, 32, -64, 2, 11, -param3 + 4);
                              break L15;
                            }
                          }
                          L16: {
                            if (-8 == (this.field_j ^ -1)) {
                              this.a(-9, 65280, param0, -104, 128, -16, 2, 11, 8 + -param3);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (-9 != (this.field_j ^ -1)) {
                              break L17;
                            } else {
                              this.a(-10, 65280, param0, -122, -96, -32, 2, 11, -param3 + -14);
                              break L17;
                            }
                          }
                          L18: {
                            if (10 == this.field_j) {
                              this.a(-10, 65280, param0, -127, 96, -32, 2, 11, 6 - param3);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              if ((this.field_j ^ -1) == -6) {
                                break L20;
                              } else {
                                if (10 != this.field_j) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            mj.a(2 * dg.field_l / 5, 12, 0, 13, 40);
                            break L19;
                          }
                          if (this.field_j < 10) {
                            break L1;
                          } else {
                            this.field_j = 0;
                            break L1;
                          }
                        } else {
                          if ((var6_int ^ -1) != -7) {
                            if ((var6_int ^ -1) == -8) {
                              L21: {
                                if (this.field_j == 4) {
                                  this.a(-11, 16776960, param0, -114, -32, -64, 4, 11, -param3 + -12);
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L22: {
                                if (6 == this.field_j) {
                                  this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, 4 + -param3);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              L23: {
                                if ((this.field_j ^ -1) == -9) {
                                  this.a(-10, 16776960, param0, -115, -96, -32, 4, 11, -14 + -param3);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                if (this.field_j != 10) {
                                  break L24;
                                } else {
                                  this.a(-10, 16776960, param0, -108, 96, -32, 4, 11, 6 + -param3);
                                  break L24;
                                }
                              }
                              L25: {
                                if (5 != this.field_j) {
                                  break L25;
                                } else {
                                  this.a(-9, 65280, param0, -121, -128, -16, 2, 11, -param3 + -16);
                                  break L25;
                                }
                              }
                              L26: {
                                if (-8 == (this.field_j ^ -1)) {
                                  this.a(-9, 65280, param0, -117, 128, -16, 2, 11, 8 - param3);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              L27: {
                                L28: {
                                  if ((this.field_j ^ -1) == -6) {
                                    break L28;
                                  } else {
                                    if (-11 == (this.field_j ^ -1)) {
                                      break L28;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                mj.a(2 * dg.field_l / 5, 12, 0, 15, 60);
                                break L27;
                              }
                              if (-11 < (this.field_j ^ -1)) {
                                break L1;
                              } else {
                                this.field_j = 0;
                                break L1;
                              }
                            } else {
                              if (-9 != (var6_int ^ -1)) {
                                if (var6_int != 9) {
                                  if (10 != var6_int) {
                                    if (-12 == (var6_int ^ -1)) {
                                      L29: {
                                        if (-5 == (this.field_j ^ -1)) {
                                          this.a(-11, 16776960, param0, -125, -32, -64, 4, 11, -param3 + -12);
                                          this.a(-9, 16776960, param0, -116, -128, -16, 4, 11, -16 + -param3);
                                          this.a(-7, 65280, param0, -115, -256, 0, 2, 11, -20 - param3);
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (this.field_j == 6) {
                                          this.a(-11, 16776960, param0, -106, 32, -64, 4, 11, 4 - param3);
                                          this.a(-9, 16776960, param0, -105, 128, -16, 4, 11, -param3 + 8);
                                          this.a(-7, 65280, param0, -120, 256, 0, 2, 11, -param3 + 12);
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (-9 != (this.field_j ^ -1)) {
                                          break L31;
                                        } else {
                                          this.a(-10, 16776960, param0, -111, -96, -32, 4, 11, -14 + -param3);
                                          this.a(-8, 16776960, param0, -124, -192, -8, 4, 11, -param3 + -18);
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (10 != this.field_j) {
                                          break L32;
                                        } else {
                                          this.a(-10, 16776960, param0, -127, 96, -32, 4, 11, 6 - param3);
                                          this.a(-8, 16776960, param0, -123, 192, -8, 4, 11, -param3 + 10);
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        L34: {
                                          if ((this.field_j ^ -1) == -6) {
                                            break L34;
                                          } else {
                                            if (-11 == (this.field_j ^ -1)) {
                                              break L34;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                        mj.a(dg.field_l >> -1342094463, 12, 0, 13, 30);
                                        break L33;
                                      }
                                      if (-11 < (this.field_j ^ -1)) {
                                        break L1;
                                      } else {
                                        this.field_j = 0;
                                        break L1;
                                      }
                                    } else {
                                      if (-13 != (var6_int ^ -1)) {
                                        if (var6_int != 13) {
                                          if (var6_int != 14) {
                                            if (var6_int == 15) {
                                              L35: {
                                                if (2 == this.field_j) {
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
                                                if (3 == this.field_j) {
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
                                                if (4 == this.field_j) {
                                                  this.a(-11, 65280, param0, -104, 32, -64, 2, 11, -param3 + 4);
                                                  this.a(-10, 65280, param0, -106, -192, -8, 2, 11, -14 - param3);
                                                  this.a(-9, 65280, param0, -118, 256, 0, 2, 11, 8 - param3);
                                                  break L37;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                              L38: {
                                                if ((this.field_j ^ -1) != -6) {
                                                  break L38;
                                                } else {
                                                  this.a(-10, 65280, param0, -104, 192, -8, 2, 11, -param3 + 6);
                                                  this.a(-11, 65280, param0, -105, -64, -48, 1, 11, -param3 + -13);
                                                  this.a(-11, 65280, param0, -112, 64, -48, 1, 11, 5 + -param3);
                                                  break L38;
                                                }
                                              }
                                              L39: {
                                                if (-6 != (this.field_j ^ -1)) {
                                                  break L39;
                                                } else {
                                                  mj.a(dg.field_l >> -1239721855, 12, 0, 14, 40);
                                                  break L39;
                                                }
                                              }
                                              if (5 <= this.field_j) {
                                                this.field_j = 0;
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              if (-17 == (var6_int ^ -1)) {
                                                L40: {
                                                  if (this.field_j != 2) {
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
                                                  if (3 == this.field_j) {
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
                                                  if ((this.field_j ^ -1) == -5) {
                                                    this.a(-11, 65280, param0, -114, 32, -64, 2, 11, 4 - param3);
                                                    this.a(-10, 65280, param0, -115, -192, -8, 2, 11, -14 + -param3);
                                                    this.a(-9, 65280, param0, -119, 256, 0, 2, 11, -param3 + 8);
                                                    break L42;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                                L43: {
                                                  if ((this.field_j ^ -1) == -6) {
                                                    this.a(-10, 65280, param0, -104, 192, -8, 2, 11, 6 - param3);
                                                    this.a(-11, 65280, param0, -114, -64, -48, 1, 11, -13 - param3);
                                                    this.a(-11, 65280, param0, -105, 64, -48, 1, 11, 5 + -param3);
                                                    break L43;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                                L44: {
                                                  if (5 != this.field_j) {
                                                    break L44;
                                                  } else {
                                                    mj.a(dg.field_l >> -431086367, 12, 0, 15, 60);
                                                    break L44;
                                                  }
                                                }
                                                if (this.field_j >= 5) {
                                                  this.field_j = 0;
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              } else {
                                                if (-18 != (var6_int ^ -1)) {
                                                  break L1;
                                                } else {
                                                  L45: {
                                                    if (-3 != (this.field_j ^ -1)) {
                                                      break L45;
                                                    } else {
                                                      this.a(-11, 16777215, param0, -106, -32, -64, 8, 11, -param3 + -12);
                                                      break L45;
                                                    }
                                                  }
                                                  L46: {
                                                    if (-3 != (this.field_j ^ -1)) {
                                                      break L46;
                                                    } else {
                                                      this.a(-11, 16777215, param0, -108, 32, -64, 8, 11, 4 + -param3);
                                                      break L46;
                                                    }
                                                  }
                                                  L47: {
                                                    if (-4 == (this.field_j ^ -1)) {
                                                      this.a(-10, 16777215, param0, -110, -96, -32, 8, 11, -param3 + -14);
                                                      break L47;
                                                    } else {
                                                      break L47;
                                                    }
                                                  }
                                                  L48: {
                                                    if (-4 == (this.field_j ^ -1)) {
                                                      this.a(-10, 16777215, param0, -123, 96, -32, 8, 11, -param3 + 6);
                                                      break L48;
                                                    } else {
                                                      break L48;
                                                    }
                                                  }
                                                  L49: {
                                                    if (this.field_j == 2) {
                                                      this.a(-9, 16776960, param0, -124, -128, -16, 4, 11, -16 + -param3);
                                                      break L49;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                  L50: {
                                                    if ((this.field_j ^ -1) != -3) {
                                                      break L50;
                                                    } else {
                                                      this.a(-9, 16776960, param0, -113, 128, -16, 4, 11, 8 - param3);
                                                      break L50;
                                                    }
                                                  }
                                                  L51: {
                                                    if (3 == this.field_j) {
                                                      this.a(-11, 16776960, param0, -109, -32, -64, 4, 11, -param3 + -12);
                                                      break L51;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                  L52: {
                                                    if ((this.field_j ^ -1) != -5) {
                                                      break L52;
                                                    } else {
                                                      this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, 4 + -param3);
                                                      break L52;
                                                    }
                                                  }
                                                  L53: {
                                                    if (-5 != (this.field_j ^ -1)) {
                                                      break L53;
                                                    } else {
                                                      this.a(-10, 65280, param0, -113, -192, -8, 2, 11, -param3 + -14);
                                                      break L53;
                                                    }
                                                  }
                                                  L54: {
                                                    if (-6 != (this.field_j ^ -1)) {
                                                      break L54;
                                                    } else {
                                                      this.a(-10, 65280, param0, -117, 192, -8, 2, 11, -param3 + 6);
                                                      break L54;
                                                    }
                                                  }
                                                  L55: {
                                                    if ((this.field_j ^ -1) == -4) {
                                                      this.a(-9, 65280, param0, -110, -256, 0, 2, 11, -param3 + -16);
                                                      break L55;
                                                    } else {
                                                      break L55;
                                                    }
                                                  }
                                                  L56: {
                                                    if (4 != this.field_j) {
                                                      break L56;
                                                    } else {
                                                      this.a(-9, 65280, param0, -121, 256, 0, 2, 11, 8 + -param3);
                                                      break L56;
                                                    }
                                                  }
                                                  L57: {
                                                    if (5 == this.field_j) {
                                                      mj.a(dg.field_l >> -1974597503, 12, 0, 13, 30);
                                                      break L57;
                                                    } else {
                                                      break L57;
                                                    }
                                                  }
                                                  if ((this.field_j ^ -1) > -6) {
                                                    break L1;
                                                  } else {
                                                    this.field_j = 0;
                                                    break L1;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            L58: {
                                              if ((this.field_j ^ -1) != -3) {
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
                                              if ((this.field_j ^ -1) == -4) {
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
                                              if ((this.field_j ^ -1) != -5) {
                                                break L60;
                                              } else {
                                                this.a(-11, 65280, param0, -125, 32, -64, 2, 11, -param3 + 4);
                                                this.a(-10, 65280, param0, -108, -192, -8, 2, 11, -14 - param3);
                                                this.a(-9, 65280, param0, -118, 256, 0, 2, 11, 8 + -param3);
                                                break L60;
                                              }
                                            }
                                            L61: {
                                              if ((this.field_j ^ -1) == -6) {
                                                this.a(-10, 65280, param0, -127, 192, -8, 2, 11, -param3 + 6);
                                                this.a(-11, 65280, param0, -120, -64, -48, 1, 11, -param3 + -13);
                                                this.a(-11, 65280, param0, -106, 64, -48, 1, 11, 5 + -param3);
                                                break L61;
                                              } else {
                                                break L61;
                                              }
                                            }
                                            L62: {
                                              if (-6 != (this.field_j ^ -1)) {
                                                break L62;
                                              } else {
                                                mj.a(dg.field_l >> -143378687, 12, 0, 13, 30);
                                                break L62;
                                              }
                                            }
                                            if (-6 >= (this.field_j ^ -1)) {
                                              this.field_j = 0;
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          }
                                        } else {
                                          L63: {
                                            if (-3 != (this.field_j ^ -1)) {
                                              break L63;
                                            } else {
                                              this.a(-11, 16776960, param0, -113, -32, -64, 4, 11, -param3 + -12);
                                              this.a(-9, 16776960, param0, -108, -128, -16, 4, 11, -param3 + -16);
                                              break L63;
                                            }
                                          }
                                          L64: {
                                            if (3 == this.field_j) {
                                              this.a(-11, 16776960, param0, -116, 32, -64, 4, 11, 4 - param3);
                                              this.a(-9, 16776960, param0, -123, 128, -16, 4, 11, 8 - param3);
                                              break L64;
                                            } else {
                                              break L64;
                                            }
                                          }
                                          L65: {
                                            if (4 != this.field_j) {
                                              break L65;
                                            } else {
                                              this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -14 - param3);
                                              break L65;
                                            }
                                          }
                                          L66: {
                                            if (5 == this.field_j) {
                                              this.a(-10, 16776960, param0, -119, 96, -32, 4, 11, 6 - param3);
                                              break L66;
                                            } else {
                                              break L66;
                                            }
                                          }
                                          L67: {
                                            if (this.field_j == 7) {
                                              this.a(-11, 16776960, param0, -120, -32, -64, 4, 11, -12 - param3);
                                              this.a(-9, 16776960, param0, -119, -256, 0, 4, 11, -param3 + -16);
                                              break L67;
                                            } else {
                                              break L67;
                                            }
                                          }
                                          L68: {
                                            if ((this.field_j ^ -1) == -9) {
                                              this.a(-11, 16776960, param0, -128, 32, -64, 4, 11, 4 - param3);
                                              this.a(-9, 16776960, param0, -122, 256, 0, 4, 11, -param3 + 8);
                                              break L68;
                                            } else {
                                              break L68;
                                            }
                                          }
                                          L69: {
                                            if (9 != this.field_j) {
                                              break L69;
                                            } else {
                                              this.a(-10, 16776960, param0, -109, -192, -8, 4, 11, -param3 + -14);
                                              break L69;
                                            }
                                          }
                                          L70: {
                                            if (-11 == (this.field_j ^ -1)) {
                                              this.a(-10, 16776960, param0, -122, 192, -8, 4, 11, -param3 + 6);
                                              break L70;
                                            } else {
                                              break L70;
                                            }
                                          }
                                          L71: {
                                            L72: {
                                              if (-6 == (this.field_j ^ -1)) {
                                                break L72;
                                              } else {
                                                if (-11 == (this.field_j ^ -1)) {
                                                  break L72;
                                                } else {
                                                  break L71;
                                                }
                                              }
                                            }
                                            mj.a(dg.field_l >> 863153121, 12, 0, 15, 60);
                                            break L71;
                                          }
                                          if (-11 >= (this.field_j ^ -1)) {
                                            this.field_j = 0;
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      } else {
                                        L73: {
                                          if (this.field_j != 2) {
                                            break L73;
                                          } else {
                                            this.a(-11, 16776960, param0, -115, -32, -64, 4, 11, -12 - param3);
                                            this.a(-9, 65280, param0, -118, -128, -16, 2, 11, -param3 + -16);
                                            break L73;
                                          }
                                        }
                                        L74: {
                                          if (this.field_j != 3) {
                                            break L74;
                                          } else {
                                            this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, -param3 + 4);
                                            this.a(-9, 65280, param0, -110, 128, -16, 2, 11, -param3 + 8);
                                            break L74;
                                          }
                                        }
                                        L75: {
                                          if (-5 == (this.field_j ^ -1)) {
                                            this.a(-10, 16776960, param0, -112, -96, -32, 4, 11, -14 - param3);
                                            break L75;
                                          } else {
                                            break L75;
                                          }
                                        }
                                        L76: {
                                          if (-6 != (this.field_j ^ -1)) {
                                            break L76;
                                          } else {
                                            this.a(-10, 16776960, param0, -125, 96, -32, 4, 11, 6 + -param3);
                                            break L76;
                                          }
                                        }
                                        L77: {
                                          if (-8 == (this.field_j ^ -1)) {
                                            this.a(-11, 16776960, param0, -124, -32, -64, 4, 11, -param3 + -12);
                                            this.a(-9, 65280, param0, -125, -256, 0, 2, 11, -param3 + -16);
                                            break L77;
                                          } else {
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          if (-9 != (this.field_j ^ -1)) {
                                            break L78;
                                          } else {
                                            this.a(-11, 16776960, param0, -118, 32, -64, 4, 11, -param3 + 4);
                                            this.a(-9, 65280, param0, -120, 256, 0, 2, 11, -param3 + 8);
                                            break L78;
                                          }
                                        }
                                        L79: {
                                          if (-10 == (this.field_j ^ -1)) {
                                            this.a(-10, 16776960, param0, -123, -192, -8, 4, 11, -param3 + -14);
                                            break L79;
                                          } else {
                                            break L79;
                                          }
                                        }
                                        L80: {
                                          if (-11 != (this.field_j ^ -1)) {
                                            break L80;
                                          } else {
                                            this.a(-10, 16776960, param0, -104, 192, -8, 4, 11, 6 + -param3);
                                            break L80;
                                          }
                                        }
                                        L81: {
                                          L82: {
                                            if (this.field_j == 5) {
                                              break L82;
                                            } else {
                                              if ((this.field_j ^ -1) != -11) {
                                                break L81;
                                              } else {
                                                break L82;
                                              }
                                            }
                                          }
                                          mj.a(dg.field_l >> 304192545, 12, 0, 14, 40);
                                          break L81;
                                        }
                                        if ((this.field_j ^ -1) > -11) {
                                          break L1;
                                        } else {
                                          this.field_j = 0;
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    L83: {
                                      if (this.field_j == 4) {
                                        this.a(-11, 16776960, param0, -124, -32, -64, 4, 11, -param3 + -12);
                                        this.a(-9, 16776960, param0, -115, -128, -16, 4, 11, -param3 + -16);
                                        break L83;
                                      } else {
                                        break L83;
                                      }
                                    }
                                    L84: {
                                      if (6 == this.field_j) {
                                        this.a(-11, 16776960, param0, -125, 32, -64, 4, 11, -param3 + 4);
                                        this.a(-9, 16776960, param0, -109, 128, -16, 4, 11, -param3 + 8);
                                        break L84;
                                      } else {
                                        break L84;
                                      }
                                    }
                                    L85: {
                                      if (-9 != (this.field_j ^ -1)) {
                                        break L85;
                                      } else {
                                        this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -14 + -param3);
                                        this.a(-8, 65280, param0, -108, -192, -8, 2, 11, -18 - param3);
                                        break L85;
                                      }
                                    }
                                    L86: {
                                      if ((this.field_j ^ -1) != -11) {
                                        break L86;
                                      } else {
                                        this.a(-10, 16776960, param0, -111, 96, -32, 4, 11, -param3 + 6);
                                        this.a(-8, 65280, param0, -128, 192, -8, 2, 11, -param3 + 10);
                                        break L86;
                                      }
                                    }
                                    L87: {
                                      L88: {
                                        if (-6 == (this.field_j ^ -1)) {
                                          break L88;
                                        } else {
                                          if ((this.field_j ^ -1) != -11) {
                                            break L87;
                                          } else {
                                            break L88;
                                          }
                                        }
                                      }
                                      mj.a(dg.field_l >> 1327871265, 12, 0, 15, 60);
                                      break L87;
                                    }
                                    if (10 <= this.field_j) {
                                      this.field_j = 0;
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  }
                                } else {
                                  L89: {
                                    if (-5 == (this.field_j ^ -1)) {
                                      this.a(-11, 16776960, param0, -112, -32, -64, 4, 11, -12 + -param3);
                                      this.a(-9, 65280, param0, -108, -128, -16, 2, 11, -16 + -param3);
                                      break L89;
                                    } else {
                                      break L89;
                                    }
                                  }
                                  L90: {
                                    if (6 == this.field_j) {
                                      this.a(-11, 16776960, param0, -110, 32, -64, 4, 11, 4 + -param3);
                                      this.a(-9, 65280, param0, -108, 128, -16, 2, 11, -param3 + 8);
                                      break L90;
                                    } else {
                                      break L90;
                                    }
                                  }
                                  L91: {
                                    if (-9 != (this.field_j ^ -1)) {
                                      break L91;
                                    } else {
                                      this.a(-10, 16776960, param0, -122, -96, -32, 4, 11, -14 - param3);
                                      this.a(-8, 65280, param0, -105, -192, -8, 2, 11, -18 + -param3);
                                      break L91;
                                    }
                                  }
                                  L92: {
                                    if (this.field_j != 10) {
                                      break L92;
                                    } else {
                                      this.a(-10, 16776960, param0, -108, 96, -32, 4, 11, 6 + -param3);
                                      this.a(-8, 65280, param0, -123, 192, -8, 2, 11, -param3 + 10);
                                      break L92;
                                    }
                                  }
                                  L93: {
                                    L94: {
                                      if (-6 == (this.field_j ^ -1)) {
                                        break L94;
                                      } else {
                                        if (-11 != (this.field_j ^ -1)) {
                                          break L93;
                                        } else {
                                          break L94;
                                        }
                                      }
                                    }
                                    mj.a(dg.field_l >> 1504096993, 12, 0, 14, 40);
                                    break L93;
                                  }
                                  if (this.field_j < 10) {
                                    break L1;
                                  } else {
                                    this.field_j = 0;
                                    break L1;
                                  }
                                }
                              } else {
                                L95: {
                                  if ((this.field_j ^ -1) == -3) {
                                    this.a(-11, 65280, param0, -126, -32, -64, 2, 11, -12 - param3);
                                    this.a(-9, 65280, param0, -114, -128, -16, 2, 11, -param3 + -16);
                                    break L95;
                                  } else {
                                    break L95;
                                  }
                                }
                                L96: {
                                  if (-4 == (this.field_j ^ -1)) {
                                    this.a(-11, 65280, param0, -126, 32, -64, 2, 11, 4 - param3);
                                    this.a(-9, 65280, param0, -105, 128, -16, 2, 11, 8 + -param3);
                                    break L96;
                                  } else {
                                    break L96;
                                  }
                                }
                                L97: {
                                  if (4 != this.field_j) {
                                    break L97;
                                  } else {
                                    this.a(-10, 65280, param0, -110, -96, -32, 2, 11, -param3 + -14);
                                    break L97;
                                  }
                                }
                                L98: {
                                  if ((this.field_j ^ -1) == -6) {
                                    this.a(-10, 65280, param0, -111, 96, -32, 2, 11, -param3 + 6);
                                    break L98;
                                  } else {
                                    break L98;
                                  }
                                }
                                L99: {
                                  if (5 != this.field_j) {
                                    break L99;
                                  } else {
                                    mj.a(2 * dg.field_l / 5, 12, 0, 13, 30);
                                    break L99;
                                  }
                                }
                                if (this.field_j >= 5) {
                                  this.field_j = 0;
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          } else {
                            L100: {
                              if (this.field_j != 4) {
                                break L100;
                              } else {
                                this.a(-11, 16776960, param0, -113, -32, -64, 4, 11, -12 + -param3);
                                break L100;
                              }
                            }
                            L101: {
                              if ((this.field_j ^ -1) != -7) {
                                break L101;
                              } else {
                                this.a(-11, 16776960, param0, -113, 32, -64, 4, 11, -param3 + 4);
                                break L101;
                              }
                            }
                            L102: {
                              if (8 != this.field_j) {
                                break L102;
                              } else {
                                this.a(-10, 65280, param0, -119, -96, -32, 2, 11, -14 - param3);
                                break L102;
                              }
                            }
                            L103: {
                              if (10 == this.field_j) {
                                this.a(-10, 65280, param0, -109, 96, -32, 2, 11, -param3 + 6);
                                break L103;
                              } else {
                                break L103;
                              }
                            }
                            L104: {
                              if (this.field_j != 5) {
                                break L104;
                              } else {
                                this.a(-9, 65280, param0, -120, -128, -16, 2, 11, -16 - param3);
                                break L104;
                              }
                            }
                            L105: {
                              if (this.field_j == 7) {
                                this.a(-9, 65280, param0, -127, 128, -16, 2, 11, 8 - param3);
                                break L105;
                              } else {
                                break L105;
                              }
                            }
                            L106: {
                              L107: {
                                if (5 == this.field_j) {
                                  break L107;
                                } else {
                                  if (-11 == (this.field_j ^ -1)) {
                                    break L107;
                                  } else {
                                    break L106;
                                  }
                                }
                              }
                              mj.a(dg.field_l * 2 / 5, 12, 0, 14, 40);
                              break L106;
                            }
                            if (-11 < (this.field_j ^ -1)) {
                              break L1;
                            } else {
                              this.field_j = 0;
                              break L1;
                            }
                          }
                        }
                      } else {
                        L108: {
                          if ((this.field_j ^ -1) != -5) {
                            break L108;
                          } else {
                            this.a(-11, 65280, param0, -115, -32, -64, 2, 11, -param3 + -12);
                            break L108;
                          }
                        }
                        L109: {
                          if (this.field_j == 6) {
                            this.a(-11, 65280, param0, -125, 32, -64, 2, 11, -param3 + 4);
                            break L109;
                          } else {
                            break L109;
                          }
                        }
                        L110: {
                          if (this.field_j != 8) {
                            break L110;
                          } else {
                            this.a(-10, 65280, param0, -113, -96, -32, 2, 11, -param3 + -14);
                            break L110;
                          }
                        }
                        L111: {
                          if (-11 != (this.field_j ^ -1)) {
                            break L111;
                          } else {
                            this.a(-10, 65280, param0, -111, 96, -32, 2, 11, 6 - param3);
                            break L111;
                          }
                        }
                        L112: {
                          L113: {
                            if (-6 == (this.field_j ^ -1)) {
                              break L113;
                            } else {
                              if (-11 == (this.field_j ^ -1)) {
                                break L113;
                              } else {
                                break L112;
                              }
                            }
                          }
                          mj.a(2 * dg.field_l / 5, 12, 0, 15, 75);
                          break L112;
                        }
                        if (10 > this.field_j) {
                          break L1;
                        } else {
                          this.field_j = 0;
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  L114: {
                    if ((this.field_j ^ -1) == -6) {
                      this.a(-13, 16776960, param0, -119, -64, -64, 4, 11, -16 + param3);
                      break L114;
                    } else {
                      break L114;
                    }
                  }
                  L115: {
                    if (this.field_j == 15) {
                      this.a(-13, 65280, param0, -112, 64, -64, 2, 11, -param3 + 8);
                      break L115;
                    } else {
                      break L115;
                    }
                  }
                  L116: {
                    if (-26 == (this.field_j ^ -1)) {
                      this.a(-13, 65280, param0, -106, -64, -64, 2, 11, param3 + -16);
                      break L116;
                    } else {
                      break L116;
                    }
                  }
                  L117: {
                    if (-36 != (this.field_j ^ -1)) {
                      break L117;
                    } else {
                      this.a(-13, 16776960, param0, -109, 64, -64, 4, 11, -param3 + 8);
                      break L117;
                    }
                  }
                  L118: {
                    if (this.field_j % 6 == 0) {
                      mj.a(3 * dg.field_l / 10, 12, 0, 15, 75);
                      break L118;
                    } else {
                      break L118;
                    }
                  }
                  if (this.field_j >= 40) {
                    this.field_j = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                L119: {
                  if (-5 == (this.field_j ^ -1)) {
                    this.a(-13, 65280, param0, -125, -64, -64, 2, 11, param3 + -16);
                    break L119;
                  } else {
                    break L119;
                  }
                }
                L120: {
                  if (-13 == (this.field_j ^ -1)) {
                    this.a(-13, 65280, param0, -128, 64, -64, 2, 11, 8 - param3);
                    break L120;
                  } else {
                    break L120;
                  }
                }
                L121: {
                  L122: {
                    if (-5 == (this.field_j ^ -1)) {
                      break L122;
                    } else {
                      if ((this.field_j ^ -1) != -13) {
                        break L121;
                      } else {
                        break L122;
                      }
                    }
                  }
                  mj.a(dg.field_l * 3 / 10, 12, 0, 14, 50);
                  break L121;
                }
                if (-17 < (this.field_j ^ -1)) {
                  break L1;
                } else {
                  this.field_j = 0;
                  break L1;
                }
              }
            }
            L123: {
              if (param1 <= -33) {
                break L123;
              } else {
                this.field_m = -64;
                break L123;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L124: {
            var6 = decompiledCaughtException;
            stackOut_372_0 = (RuntimeException) (var6);
            stackOut_372_1 = new StringBuilder().append("bf.E(");
            stackIn_374_0 = stackOut_372_0;
            stackIn_374_1 = stackOut_372_1;
            stackIn_373_0 = stackOut_372_0;
            stackIn_373_1 = stackOut_372_1;
            if (param0 == null) {
              stackOut_374_0 = (RuntimeException) ((Object) stackIn_374_0);
              stackOut_374_1 = (StringBuilder) ((Object) stackIn_374_1);
              stackOut_374_2 = "null";
              stackIn_375_0 = stackOut_374_0;
              stackIn_375_1 = stackOut_374_1;
              stackIn_375_2 = stackOut_374_2;
              break L124;
            } else {
              stackOut_373_0 = (RuntimeException) ((Object) stackIn_373_0);
              stackOut_373_1 = (StringBuilder) ((Object) stackIn_373_1);
              stackOut_373_2 = "{...}";
              stackIn_375_0 = stackOut_373_0;
              stackIn_375_1 = stackOut_373_1;
              stackIn_375_2 = stackOut_373_2;
              break L124;
            }
          }
          L125: {
            stackOut_375_0 = (RuntimeException) ((Object) stackIn_375_0);
            stackOut_375_1 = ((StringBuilder) (Object) stackIn_375_1).append(stackIn_375_2).append(',').append(param1).append(',');
            stackIn_377_0 = stackOut_375_0;
            stackIn_377_1 = stackOut_375_1;
            stackIn_376_0 = stackOut_375_0;
            stackIn_376_1 = stackOut_375_1;
            if (param2 == null) {
              stackOut_377_0 = (RuntimeException) ((Object) stackIn_377_0);
              stackOut_377_1 = (StringBuilder) ((Object) stackIn_377_1);
              stackOut_377_2 = "null";
              stackIn_378_0 = stackOut_377_0;
              stackIn_378_1 = stackOut_377_1;
              stackIn_378_2 = stackOut_377_2;
              break L125;
            } else {
              stackOut_376_0 = (RuntimeException) ((Object) stackIn_376_0);
              stackOut_376_1 = (StringBuilder) ((Object) stackIn_376_1);
              stackOut_376_2 = "{...}";
              stackIn_378_0 = stackOut_376_0;
              stackIn_378_1 = stackOut_376_1;
              stackIn_378_2 = stackOut_376_2;
              break L125;
            }
          }
          L126: {
            stackOut_378_0 = (RuntimeException) ((Object) stackIn_378_0);
            stackOut_378_1 = ((StringBuilder) (Object) stackIn_378_1).append(stackIn_378_2).append(',').append(param3).append(',');
            stackIn_380_0 = stackOut_378_0;
            stackIn_380_1 = stackOut_378_1;
            stackIn_379_0 = stackOut_378_0;
            stackIn_379_1 = stackOut_378_1;
            if (param4 == null) {
              stackOut_380_0 = (RuntimeException) ((Object) stackIn_380_0);
              stackOut_380_1 = (StringBuilder) ((Object) stackIn_380_1);
              stackOut_380_2 = "null";
              stackIn_381_0 = stackOut_380_0;
              stackIn_381_1 = stackOut_380_1;
              stackIn_381_2 = stackOut_380_2;
              break L126;
            } else {
              stackOut_379_0 = (RuntimeException) ((Object) stackIn_379_0);
              stackOut_379_1 = (StringBuilder) ((Object) stackIn_379_1);
              stackOut_379_2 = "{...}";
              stackIn_381_0 = stackOut_379_0;
              stackIn_381_1 = stackOut_379_1;
              stackIn_381_2 = stackOut_379_2;
              break L126;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_381_0), stackIn_381_2 + ')');
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
            this.field_l = 44;
            break L0;
          }
        }
        L1: {
          if (0 < this.field_k) {
            var4 = (param1 >> 1470718276) + this.field_f;
            var9 = this.field_q;
            if (0 != var9) {
              if (1 == var9) {
                if (rj.field_h == 1) {
                  gg.field_f[5 - -this.field_v].d(-16 + var4, this.field_u + -16, 256);
                  break L1;
                } else {
                  gg.field_f[this.field_v].d(-16 + var4, this.field_u + -16, var3);
                  break L1;
                }
              } else {
                if (-3 != (var9 ^ -1)) {
                  if (3 != var9) {
                    if (var9 == 4) {
                      gg.field_f[this.field_v + 25].d(var4 - 16, -16 + this.field_u, var3);
                      break L1;
                    } else {
                      if (var9 == 5) {
                        gg.field_f[this.field_v + 20].d(var4 - 16, this.field_u - 16, var3);
                        break L1;
                      } else {
                        L2: {
                          if (-7 != (var9 ^ -1)) {
                            if ((var9 ^ -1) != -15) {
                              if ((var9 ^ -1) == -8) {
                                if ((fi.field_e.field_k ^ -1) < -1) {
                                  vc.field_m[1].e(var4 + -16, this.field_u - 16);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                L3: {
                                  if (var9 != 8) {
                                    if (-10 == (var9 ^ -1)) {
                                      break L3;
                                    } else {
                                      if ((var9 ^ -1) == -11) {
                                        if (af.field_w != null) {
                                          L4: {
                                            if (3 > this.field_l) {
                                              L5: {
                                                if (this.field_l == 0) {
                                                  var9 = 257;
                                                  break L5;
                                                } else {
                                                  if (this.field_l != 1) {
                                                    var9 = 256;
                                                    break L5;
                                                  } else {
                                                    var9 = 256;
                                                    break L5;
                                                  }
                                                }
                                              }
                                              L6: {
                                                if (2 != this.field_l) {
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
                                              var11 = (var10 ^ -1) & 65793 + -var9;
                                              ki.c(var4, this.field_u, 20 + this.field_o, var10 | var9 * 96, 32);
                                              ki.c(var4, this.field_u, this.field_o + 19, var9 * 160 | var10, 32);
                                              var10 = 255 * var9 | var10;
                                              ki.c(var4, this.field_u, 18 - -this.field_o, var10, 32);
                                              ki.c(var4, this.field_u, this.field_o + 17, var10 | var11 * 32, 32);
                                              ki.c(var4, this.field_u, 16 + this.field_o, var11 * 96 | var10, 32);
                                              ki.c(var4, this.field_u, 14 - -this.field_o, 160 * var11 | var10, 32);
                                              ki.c(var4, this.field_u, 12 + this.field_o, var10 | var11 * 240, 32);
                                              break L4;
                                            } else {
                                              break L4;
                                            }
                                          }
                                          af.field_w[this.field_v * 8 - -this.field_l].c(var4 + -16, -16 + this.field_u);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        if ((var9 ^ -1) == -12) {
                                          sj.field_E[this.field_v].d(-64 + var4, this.field_u - 64, 256);
                                          break L1;
                                        } else {
                                          if (12 == var9) {
                                            nd.field_j[this.field_v].d(var4 + -16, -16 + (this.field_u - 32), var3);
                                            break L1;
                                          } else {
                                            if (-22 != (var9 ^ -1)) {
                                              if (13 == var9) {
                                                if (0 >= fi.field_e.field_k) {
                                                  break L1;
                                                } else {
                                                  vc.field_m[2].e(var4 + -16, -16 + this.field_u);
                                                  ie.field_A[this.field_o % 14].f(-8 + var4, this.field_u + -16, 3 * this.field_o);
                                                  if (StarCannon.field_z != -1) {
                                                    break L1;
                                                  } else {
                                                    if (-1 != pa.field_L) {
                                                      break L1;
                                                    } else {
                                                      ie.field_A[this.field_o % 14].f(-12 + var4 - -sh.b(-128, 8), this.field_u - (20 - sh.b(-2, 8)), 2 * this.field_o);
                                                      ie.field_A[this.field_o % 14].f(-14 + (var4 + sh.b(param0 + -65437, 12)), -22 + (this.field_u + sh.b(34, 12)), this.field_o);
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (var9 != 15) {
                                                  if (-17 == (var9 ^ -1)) {
                                                    L7: {
                                                      if ((this.field_v ^ -1) >= -5) {
                                                        break L7;
                                                      } else {
                                                        this.field_v = 4;
                                                        break L7;
                                                      }
                                                    }
                                                    v.field_d[this.field_v].d(var4 + -128, -128 + this.field_u, 256);
                                                    break L1;
                                                  } else {
                                                    if (17 == var9) {
                                                      el.field_H[this.field_v].d(-16 + var4, this.field_u - 16, var3);
                                                      break L1;
                                                    } else {
                                                      if (var9 == 18) {
                                                        var7 = (int)(16.0 * Math.sin(0.1 * (double)this.field_u));
                                                        var8 = (int)(Math.cos(0.1 * (double)this.field_u) * 16.0);
                                                        gg.field_f[25 + this.field_v].d(-var7 + (-16 + var4), -16 + (this.field_u - var8), var3);
                                                        gg.field_f[25 + this.field_v].d(var7 + (var4 - 16), var8 + -16 + this.field_u, var3);
                                                        gg.field_f[25 - -this.field_v].d(-16 + (var4 + -var8), -16 + this.field_u + var7, var3);
                                                        gg.field_f[this.field_v + 25].d(var8 + (-16 + var4), this.field_u + -16 - var7, var3);
                                                        break L1;
                                                      } else {
                                                        if (-20 == (var9 ^ -1)) {
                                                          gg.field_f[this.field_v + 25].d(-16 + var4, -16 + this.field_u, var3);
                                                          break L1;
                                                        } else {
                                                          if ((var9 ^ -1) != -23) {
                                                            break L1;
                                                          } else {
                                                            fl.field_f[this.field_l].e(-64 + var4, -64 + this.field_u);
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L8: {
                                                    if ((this.field_v ^ -1) >= -5) {
                                                      break L8;
                                                    } else {
                                                      this.field_v = 4;
                                                      break L8;
                                                    }
                                                  }
                                                  fg.field_c[this.field_v].d(var4 - 128, -128 + this.field_u, 256);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              qc.field_e[this.field_v].d(-48 + var4, -32 + this.field_u, 256);
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
                                  vc.field_m[3 - -this.field_v].e(-16 + var4, this.field_u - 16);
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
                        if ((fi.field_e.field_k ^ -1) < -1) {
                          vc.field_m[0].e(var4 - 16, -16 + this.field_u);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    gf.field_a[this.field_v].d(var4 + -32, this.field_u - 16, var3);
                    break L1;
                  }
                } else {
                  if (1 != rj.field_h) {
                    gg.field_f[10 - -this.field_v].d(-16 + var4, this.field_u - 16, var3);
                    break L1;
                  } else {
                    gg.field_f[this.field_v + 15].d(var4 - 16, this.field_u + -16, 256);
                    break L1;
                  }
                }
              }
            } else {
              L9: {
                var5 = this.field_m >> -39914718;
                var6 = Math.abs(-this.field_v + 2);
                if (this.field_z == 0) {
                  var5++;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (0 > this.field_z) {
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
                      ki.c(var4, this.field_u, ui.field_p, 65535, -(ui.field_p * 255 / eg.field_l) + 256);
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
                          var11 = (int)(Math.sin((double)(var9 + ha.field_d) / 50.1) * (double)ha.field_d) - -this.field_u;
                          ki.c(var10, var11, 3, 65535, 128);
                          var9 += 16;
                          continue L14;
                        }
                      }
                    }
                  }
                }
                ki.c(4 + (var4 - this.field_v), this.field_u, 20, 24831, 32);
                ki.c(var4 + (4 - this.field_v), this.field_u, 19, 41215, 32);
                ki.c(var4 + 4 - this.field_v, this.field_u, 18, 65535, 32);
                ki.c(var4 - (-4 - -this.field_v), this.field_u, 17, 2162687, 32);
                ki.c(-this.field_v + var4 - -4, this.field_u, 16, 6356991, 32);
                ki.c(var4 + (4 + -this.field_v), this.field_u, 14, 10551295, 32);
                ki.c(-this.field_v + (var4 - -4), this.field_u, 12, 15794175, 32);
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
                  dl.field_c[this.field_v].e(-16 + var4, this.field_u - 16);
                  break L15;
                }
                jg.field_C[var5].a(-4 + var4, 7 + this.field_u, 16711680);
                break L1;
              } else {
                if (-11 != (var9 ^ -1)) {
                  if (-16 != (var9 ^ -1)) {
                    if (-21 != (var9 ^ -1)) {
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
                        dl.field_c[this.field_v].e(var4 + -16, -16 + this.field_u);
                        break L17;
                      }
                      jg.field_C[var5].a(var4 - var6, 3 + this.field_u, 16711680);
                      jg.field_C[var5].a(var4 - (-4 - -var6), this.field_u + 3, 16711680);
                      jg.field_C[var5].a(var6 + (var4 - 8), 3 + this.field_u, 16711680);
                      jg.field_C[var5].a(-12 + (var4 + var6), this.field_u + 3, 16711680);
                      break L1;
                    }
                  } else {
                    L19: {
                      L20: {
                        jg.field_C[var5].a(-var6 + 2 + var4, this.field_u - -3, 16711680);
                        jg.field_C[var5].a(var6 + (var4 - 10), this.field_u + 3, 16711680);
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
                      dl.field_c[this.field_v].e(-16 + var4, -16 + this.field_u);
                      break L19;
                    }
                    jg.field_C[var5].a(var4 - 4, 7 + this.field_u, 16711680);
                    break L1;
                  }
                } else {
                  L21: {
                    jg.field_C[var5].a(-var6 + (2 + var4), 3 + this.field_u, 16711680);
                    jg.field_C[var5].a(var6 + (-10 + var4), 3 + this.field_u, 16711680);
                    if (-1 == (tj.field_G % 2 ^ -1)) {
                      break L21;
                    } else {
                      if (ti.field_d) {
                        break L21;
                      } else {
                        break L1;
                      }
                    }
                  }
                  dl.field_c[this.field_v].e(-16 + var4, this.field_u - 16);
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
          if (-1 != (param3 ^ -1)) {
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
          ((bf) (this)).field_v = stackIn_3_1;
          this.field_g = 0;
          this.field_u = param1;
          this.field_t = 0;
          this.field_j = 0;
          this.field_p = false;
          this.field_m = 0;
          this.field_l = 0;
          this.field_k = 1;
          this.field_h = null;
          this.field_q = param3;
          this.field_f = param0;
          this.field_i = param2;
          this.field_z = 0;
          this.field_n = 0;
          this.field_o = 0;
          this.field_r = 0;
          if (this.field_q != 0) {
            break L1;
          } else {
            this.field_k = 1;
            break L1;
          }
        }
        L2: {
          if (-2 != (this.field_q ^ -1)) {
            break L2;
          } else {
            this.field_k = pf.field_d * 2 / 3 + 1;
            break L2;
          }
        }
        L3: {
          if ((this.field_q ^ -1) != -3) {
            break L3;
          } else {
            this.field_k = pf.field_d + 1;
            break L3;
          }
        }
        L4: {
          if ((this.field_q ^ -1) != -4) {
            break L4;
          } else {
            this.field_k = 51 - -(4 * pf.field_d);
            break L4;
          }
        }
        L5: {
          if ((this.field_q ^ -1) != -5) {
            break L5;
          } else {
            this.field_k = 2 * pf.field_d + 2;
            break L5;
          }
        }
        L6: {
          if (-6 != (this.field_q ^ -1)) {
            break L6;
          } else {
            this.field_k = 3 + pf.field_d;
            break L6;
          }
        }
        L7: {
          if (this.field_q != 10) {
            break L7;
          } else {
            L8: {
              if (sh.b(-2, 2) == 0) {
                L9: {
                  this.field_l = sh.b(-128, 3);
                  if (0 != rj.field_h) {
                    break L9;
                  } else {
                    if (sd.field_c < 6) {
                      break L9;
                    } else {
                      this.field_l = sh.b(-127, 7);
                      break L9;
                    }
                  }
                }
                L10: {
                  if (-2 != (rj.field_h ^ -1)) {
                    break L10;
                  } else {
                    if (10 > sd.field_c) {
                      break L10;
                    } else {
                      this.field_l = sh.b(53, 7);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (-3 != (rj.field_h ^ -1)) {
                    break L11;
                  } else {
                    if ((sd.field_c ^ -1) > -17) {
                      break L11;
                    } else {
                      this.field_l = sh.b(7, 7);
                      break L11;
                    }
                  }
                }
                if ((rj.field_h ^ -1) != -4) {
                  break L8;
                } else {
                  if ((sd.field_c ^ -1) > -18) {
                    break L8;
                  } else {
                    this.field_l = sh.b(99, 7);
                    break L8;
                  }
                }
              } else {
                this.field_l = sh.b(-127, 4) + 3;
                break L8;
              }
            }
            if ((this.field_l ^ -1) != -6) {
              break L7;
            } else {
              this.field_l = 7;
              break L7;
            }
          }
        }
        L12: {
          if ((this.field_q ^ -1) != -13) {
            break L12;
          } else {
            this.field_k = 100 + pf.field_d * 3;
            break L12;
          }
        }
        L13: {
          if (-22 != (this.field_q ^ -1)) {
            break L13;
          } else {
            this.field_k = 100 - -(20 * pf.field_d);
            break L13;
          }
        }
        L14: {
          if (11 != this.field_q) {
            break L14;
          } else {
            this.field_k = 50 * pf.field_d + 200 << -215024062;
            if ((rj.field_h ^ -1) != -4) {
              break L14;
            } else {
              this.field_k = this.field_k >> 2;
              break L14;
            }
          }
        }
        L15: {
          if (-16 != (this.field_q ^ -1)) {
            break L15;
          } else {
            L16: {
              this.field_k = 50 * pf.field_d + 500 << -1575134782;
              if ((nf.field_l ^ -1) != -3) {
                break L16;
              } else {
                this.field_k = pf.field_d * 50 + 750 << -1764806494;
                break L16;
              }
            }
            if ((rj.field_h ^ -1) != -4) {
              break L15;
            } else {
              this.field_k = this.field_k >> 2;
              break L15;
            }
          }
        }
        L17: {
          if (this.field_q != 16) {
            break L17;
          } else {
            this.field_k = 50 * pf.field_d + 2000 << -327434078;
            if (-4 != (rj.field_h ^ -1)) {
              break L17;
            } else {
              this.field_k = this.field_k >> 2;
              break L17;
            }
          }
        }
        L18: {
          if (this.field_q != 17) {
            break L18;
          } else {
            this.field_k = 2 * pf.field_d + 1;
            break L18;
          }
        }
        L19: {
          if (-19 != (this.field_q ^ -1)) {
            break L19;
          } else {
            this.field_k = 30 - -(pf.field_d * 5);
            break L19;
          }
        }
        L20: {
          if ((this.field_q ^ -1) != -20) {
            break L20;
          } else {
            this.field_k = 20 + 4 * pf.field_d;
            break L20;
          }
        }
        L21: {
          if (-23 != (this.field_q ^ -1)) {
            break L21;
          } else {
            this.field_k = 1;
            break L21;
          }
        }
    }

    static {
        field_x = new p();
    }
}
