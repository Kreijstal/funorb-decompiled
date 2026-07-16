/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends sq {
    static String field_h;
    int[] field_g;
    static int field_e;
    private int[] field_f;

    final boolean a(int param0, byte param1, qe param2) {
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          if (param1 == 9) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 == (param0 ^ -1)) {
              break L2;
            } else {
              if ((param0 ^ -1) == -9) {
                if (-3 != (param2.field_z ^ -1)) {
                  break L2;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              } else {
                L3: {
                  var4 = ((af) this).b(param0, 30554);
                  if ((param2.field_z ^ -1) == 0) {
                    L4: {
                      if (var4 == 0) {
                        break L4;
                      } else {
                        if (-2 != (var4 ^ -1)) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (param2.field_z != var4) {
                      stackOut_7_0 = 0;
                      stackIn_13_0 = stackOut_7_0;
                      break L3;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_13_0 = stackOut_6_0;
                      break L3;
                    }
                  }
                }
                return stackIn_13_0 != 0;
              }
            }
          }
          stackOut_16_0 = 0;
          stackIn_17_0 = stackOut_16_0;
          break L1;
        }
        return stackIn_17_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = Pool.field_O;
          var6 = 8 + param1 + 8 + 487 + param3;
          wa.field_hb.b(3, 2147483647, 3, var6 + -6, fl.field_q.field_Db + -6);
          var7 = -5 + wa.field_hb.field_Db;
          ph.field_d.b(-param2 + var7, 2147483647, 5, param3 + 2 + 485 + param1, param2);
          pa.field_J.b(0, 2147483647, param1, -param1 + (ph.field_d.field_gb + -fj.field_j.field_gb), param2);
          fj.field_j.b(0, 2147483647, param1 + pa.field_J.field_gb, fj.field_j.field_gb, param2);
          var7 = var7 - (2 + param2);
          qd.field_b.a(param3, -5 + var7, (byte) -112, 2, param3 + 2 + (485 + param1), 5, 5);
          if (sg.field_J == null) {
            break L0;
          } else {
            sg.field_J.a(qd.field_b.field_gb, qd.field_b.field_qb, qd.field_b.field_Db, false, qd.field_b.field_eb);
            break L0;
          }
        }
        L1: {
          var8 = fl.field_q.field_gb + (-param1 - var6);
          var9 = var8 / 2;
          if (param4 == 36) {
            break L1;
          } else {
            field_h = null;
            break L1;
          }
        }
        var10 = var9 - -param0 - -param1;
        var11 = 0;
        var12 = 0;
        L2: while (true) {
          if ((var12 ^ -1) <= -7) {
            return;
          } else {
            L3: {
              if (var12 >= 5) {
                break L3;
              } else {
                if (il.field_g[var12] != null) {
                  break L3;
                } else {
                  var12++;
                  continue L2;
                }
              }
            }
            var13 = var11 * (-6 + (fl.field_q.field_Db - -2)) / (bq.field_m + 1) + 3;
            var11++;
            var7 = -var13 + 1 - -((2 + (-6 + fl.field_q.field_Db)) * var11 / (1 + bq.field_m));
            if (5 > var12) {
              il.field_g[var12].b(var13, 2147483647, var6, var8, var7);
              ln.field_v[var12].b(0, param4 ^ 2147483611, param1, var9 - param1, var7);
              uo.field_Mb[var12].b(param5, 2147483647, var9, param0, var7 - param5 + -param5);
              ta.field_b[var12].b(param5, 2147483647, var10, -var10 + var8 + -param1, -param5 + (var7 + -param5));
              var12++;
              continue L2;
            } else {
              d.field_e.b(var13, 2147483647, var6, var8, var7);
              var12++;
              continue L2;
            }
          }
        }
    }

    af(al param0) {
        super(param0);
        if (param0.field_n >= 2) {
            ((af) this).field_f = new int[]{-1, -1};
        }
        ((af) this).field_g = new int[]{-1, -1};
    }

    public static void h(byte param0) {
        field_h = null;
        if (param0 >= -2) {
            dd[] discarded$0 = af.a(-47, 110, -56, 55, 78);
        }
    }

    final int a(qe param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6 = 0;
        int var9 = Pool.field_O;
        if (param1 <= 82) {
            dd[] discarded$0 = af.a(66, 112, 38, -91, 125);
        }
        if (((af) this).field_f != null) {
            var3 = ((af) this).field_d.field_n / 2;
            var4 = param0.field_L / var3;
            var5 = (var4 - -1) % 2;
            for (var7 = 1; var7 <= var3; var7++) {
                var8 = (((af) this).field_f[var5] - -var7) % var3;
                var6 = var3 * var5 + var8;
                if (0 == (1 << var6 & ((af) this).field_d.field_p)) {
                    ((af) this).field_f[var5] = var8;
                    return var6;
                }
            }
            return param0.field_L;
        }
        return (1 + param0.field_L) % ((af) this).field_d.field_n;
    }

    final void c(int param0) {
        if (param0 > -25) {
            return;
        }
        wj.field_S[10] = dq.field_a.a((byte) 96, 0);
        wj.field_S[11] = dq.field_a.a((byte) 40, 1);
    }

    final int b(int param0) {
        int var2 = 90 % ((-79 - param0) / 38);
        return 1;
    }

    private final boolean r(int param0) {
        if (param0 != 9) {
            return false;
        }
        return true;
    }

    private final int c(byte param0) {
        if (param0 != 116) {
            ((af) this).field_f = null;
        }
        return this.u(4);
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4) {
        dd[] var6 = new dd[9];
        dd[] var5 = var6;
        if (param1 != 64) {
            af.a(-37, true);
        }
        dd dupTemp$0 = ad.a(param3, param4, 7);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        dd dupTemp$1 = ad.a(param2, param4, 7);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param0 == 0)) {
            var6[4] = ad.a(param0, 64, 7);
        }
        return var5;
    }

    private final int d(byte param0) {
        int var2 = -75 % ((27 - param0) / 44);
        return 0;
    }

    final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aa var6_ref_aa = null;
        int var7 = 0;
        cr var7_ref_cr = null;
        int var8 = 0;
        int var9_int = 0;
        aa var9 = null;
        cr var10_ref_cr = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qe var13 = null;
        qe var14 = null;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        var12 = Pool.field_O;
        var13 = ((af) this).field_d.j(76);
        var14 = var13;
        if (var14 != null) {
          if ((var14.field_q ^ -1) == -3) {
            L0: {
              var3 = var14.field_z;
              var4 = 0;
              if (!((af) this).field_d.d((byte) 123)) {
                break L0;
              } else {
                var14.a(3, -14, new int[1]);
                var14.field_t = true;
                var4 = var4 | (this.q(1) | um.field_c);
                var14.field_w = (byte)(var14.field_w - 1);
                break L0;
              }
            }
            L1: {
              if (var14.field_n != 8) {
                if (var14.field_n == -1) {
                  var14.a(7, -14, new int[1]);
                  var14.field_t = true;
                  var4 = var4 | this.w(-2);
                  var14.field_w = (byte)(var14.field_w - 1);
                  break L1;
                } else {
                  if (var3 == -1) {
                    break L1;
                  } else {
                    if (((af) this).b(var14.field_n, 30554) == var3) {
                      break L1;
                    } else {
                      var14.a(1, -14, new int[1]);
                      var14.field_t = true;
                      var4 = var4 | this.b(true);
                      var14.field_w = (byte)(var14.field_w - 1);
                      break L1;
                    }
                  }
                }
              } else {
                if (var3 != 2) {
                  var14.a(2, -14, new int[1]);
                  var14.field_t = true;
                  var4 = var4 | this.o(-17);
                  var14.field_w = (byte)(var14.field_w - 1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var14.field_m.c(0)) {
                var5 = 0;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ((af) this).field_d.field_l.length) {
                    if ((this.t(-91) ^ -1) >= (var5 ^ -1)) {
                      if (var7 < this.d((byte) 87)) {
                        L4: {
                          if (-1 != (var7 ^ -1)) {
                            var14.a(14, -14, new int[0]);
                            break L4;
                          } else {
                            var14.a(13, -14, new int[0]);
                            break L4;
                          }
                        }
                        var14.field_t = true;
                        var4 = var4 | this.e((byte) 91);
                        break L2;
                      } else {
                        if ((var6 ^ -1) <= (this.p(89) ^ -1)) {
                          break L2;
                        } else {
                          L5: {
                            if (var6 != 0) {
                              var14.a(16, -14, new int[0]);
                              break L5;
                            } else {
                              var14.a(15, -14, new int[0]);
                              break L5;
                            }
                          }
                          var14.field_t = true;
                          var4 = var4 | this.g((byte) -46);
                          break L2;
                        }
                      }
                    } else {
                      L6: {
                        if (0 == var5) {
                          var14.a(12, -14, new int[0]);
                          break L6;
                        } else {
                          var14.a(6, -14, new int[0]);
                          break L6;
                        }
                      }
                      var14.field_t = true;
                      var4 = var4 | this.s(0);
                      break L2;
                    }
                  } else {
                    L7: {
                      if (0 < ((af) this).field_d.field_l[var8].field_c) {
                        L8: {
                          var5++;
                          var9_int = ((af) this).b(var8, 30554);
                          if ((var9_int ^ -1) != (var3 ^ -1)) {
                            break L8;
                          } else {
                            var6++;
                            break L8;
                          }
                        }
                        L9: {
                          if (var9_int == 0) {
                            break L9;
                          } else {
                            if (var9_int == 1) {
                              break L9;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7++;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var8++;
                    continue L3;
                  }
                }
              } else {
                L10: {
                  var5 = var14.field_m.a(45);
                  if (0 != var4) {
                    break L10;
                  } else {
                    if (-2 != (var5 ^ -1)) {
                      break L10;
                    } else {
                      if (8 != ((cr) (Object) var14.field_m.c((byte) -25)).field_n) {
                        break L10;
                      } else {
                        if (-3 == (var3 ^ -1)) {
                          return ag.field_e;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                var6_ref_aa = new aa(var14.field_m);
                var7_ref_cr = (cr) (Object) var6_ref_aa.b((byte) -92);
                L11: while (true) {
                  if (var7_ref_cr == null) {
                    break L2;
                  } else {
                    if (var7_ref_cr.field_n != 8) {
                      var7_ref_cr = (cr) (Object) var6_ref_aa.b(-97);
                      continue L11;
                    } else {
                      var14.a(5, -14, new int[1]);
                      return hm.field_e;
                    }
                  }
                }
              }
            }
            L12: {
              var5 = -52 % ((param0 - -37) / 60);
              if (!var14.field_t) {
                break L12;
              } else {
                if (0 == (nr.field_Y & var4)) {
                  if (((af) this).a((1 + ((af) this).field_d.field_A) % ((af) this).field_d.field_n, -119)) {
                    var14.a(11, -14, new int[0]);
                    var4 = this.f((byte) -30);
                    break L12;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (var14.field_m.c(0)) {
                break L13;
              } else {
                var6 = 0;
                var7 = 0;
                var8 = ((cr) (Object) var14.field_m.c((byte) 109)).field_n;
                var9 = new aa(var14.field_m);
                var10_ref_cr = (cr) (Object) var9.b((byte) -92);
                L14: while (true) {
                  if (var10_ref_cr == null) {
                    L15: {
                      if ((var4 ^ -1) != -1) {
                        break L15;
                      } else {
                        if ((var3 ^ -1) == 0) {
                          if (-1 <= (var7 ^ -1)) {
                            L16: {
                              ((af) this).a((int) ((af) this).b(var8, 30554), -1, var14.field_L);
                              stackOut_90_0 = var4;
                              stackIn_92_0 = stackOut_90_0;
                              stackIn_91_0 = stackOut_90_0;
                              if (this.r(9)) {
                                stackOut_92_0 = stackIn_92_0;
                                stackOut_92_1 = nd.field_j;
                                stackIn_93_0 = stackOut_92_0;
                                stackIn_93_1 = stackOut_92_1;
                                break L16;
                              } else {
                                stackOut_91_0 = stackIn_91_0;
                                stackOut_91_1 = 0;
                                stackIn_93_0 = stackOut_91_0;
                                stackIn_93_1 = stackOut_91_1;
                                break L16;
                              }
                            }
                            var4 = stackIn_93_0 | stackIn_93_1;
                            var4 = var4 | i.field_m;
                            break L13;
                          } else {
                            L17: {
                              var10 = this.v(-13243);
                              var11 = 3 & var10;
                              if ((var11 ^ -1) != -1) {
                                if ((var11 ^ -1) != -2) {
                                  break L17;
                                } else {
                                  var4 = var4 | (oa.field_b | i.field_m);
                                  break L17;
                                }
                              } else {
                                var4 = var4 | i.field_m;
                                ((af) this).a((int) ((af) this).b(var8, 30554), -1, var14.field_L);
                                break L17;
                              }
                            }
                            L18: {
                              if ((8 & var10 ^ -1) != -9) {
                                break L18;
                              } else {
                                var4 = var4 | nd.field_j;
                                break L18;
                              }
                            }
                            return var4;
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    if ((var7 ^ -1) >= -1) {
                      if (-1 != (var4 ^ -1)) {
                        break L13;
                      } else {
                        if (0 < var6) {
                          var4 = var4 | nd.field_j;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    } else {
                      var14.a(4, -14, new int[1]);
                      var14.field_t = true;
                      var4 = var4 | this.c((byte) 116);
                      break L13;
                    }
                  } else {
                    L19: {
                      if (0 == (var10_ref_cr.field_n & 7)) {
                        break L19;
                      } else {
                        if (var3 != -1) {
                          if (((af) this).b(var10_ref_cr.field_n, 30554) == var3) {
                            var14.field_w = (byte)(var14.field_w + 1);
                            var6++;
                            break L19;
                          } else {
                            var14.field_w = (byte)(var14.field_w - 1);
                            var7++;
                            break L19;
                          }
                        } else {
                          if (this.a(var8, var10_ref_cr.field_n, (byte) 35)) {
                            var14.field_w = (byte)(var14.field_w + 1);
                            var6++;
                            break L19;
                          } else {
                            var7++;
                            var14.field_w = (byte)(var14.field_w + 1);
                            break L19;
                          }
                        }
                      }
                    }
                    var10_ref_cr = (cr) (Object) var9.b(-108);
                    continue L14;
                  }
                }
              }
            }
            L20: {
              if (!((af) this).field_d.a(false, (byte) 69, var14)) {
                if (!((af) this).a(var14.field_L % ((af) this).field_d.field_n, -57)) {
                  break L20;
                } else {
                  var14.field_w = (byte)(var14.field_w - 1);
                  break L20;
                }
              } else {
                if (((af) this).a((1 + var14.field_L) % ((af) this).field_d.field_n, -122)) {
                  var14.field_w = (byte)(var14.field_w + 1);
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            return var4;
          } else {
            throw new IllegalStateException("Shot not finished yet, foo!");
          }
        } else {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        }
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
            field_e = -117;
        }
        return uj.field_a;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 > 25) {
            break L0;
          } else {
            ((af) this).field_g = null;
            break L0;
          }
        }
        L1: {
          if ((param0 & 7) == 0) {
            break L1;
          } else {
            if ((param1 & 7) == 0) {
              break L1;
            } else {
              L2: {
                if (((af) this).b(param0, 30554) != ((af) this).b(param1, 30554)) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              return stackIn_9_0 != 0;
            }
          }
        }
        return false;
    }

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        if (param0 < -113) {
          var3 = ((af) this).field_d.field_n / 2;
          param1 = param1 % 2;
          var4 = 0;
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              var6 = var5 + var3 * param1;
              if (((af) this).a((byte) 36, var6)) {
                if ((1 << var6 & ((af) this).field_d.field_p) == 0) {
                  var4 = var4 | 1 << var6;
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return -16;
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_1_0 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackOut_0_0 = null;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var9 = Pool.field_O;
          ((af) this).field_d.e(12226, 0);
          var3 = 1;
          var4 = 1;
          stackOut_0_0 = ((af) this).field_g;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((af) this).field_d.field_n == 1) {
            stackOut_2_0 = (int[]) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (int[]) (Object) stackIn_1_0;
            stackOut_1_1 = param0 / (((af) this).field_d.field_n >> -12476831);
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0[stackIn_3_1];
          if (param1 <= -28) {
            break L1;
          } else {
            field_h = null;
            break L1;
          }
        }
        L2: {
          if (var5 == -1) {
            var10 = 1;
            var6 = var10;
            L3: while (true) {
              if (16 <= var10) {
                break L2;
              } else {
                if ((var10 ^ -1) != -9) {
                  if (((af) this).field_d.field_r[var10].field_j) {
                    var3 = 0;
                    break L2;
                  } else {
                    var10++;
                    continue L3;
                  }
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
          } else {
            var6 = (var5 << 1912934147) + 1;
            var7 = var6 - -7;
            var8 = var6;
            L4: while (true) {
              L5: {
                if (var7 <= var8) {
                  break L5;
                } else {
                  if (((af) this).field_d.field_l[var8].field_s) {
                    var4 = 0;
                    if (((af) this).field_d.field_r[var8].field_j) {
                      var3 = 0;
                      break L5;
                    } else {
                      var8++;
                      continue L4;
                    }
                  } else {
                    var8++;
                    continue L4;
                  }
                }
              }
              if (var4 == 0) {
                break L2;
              } else {
                if (((af) this).field_d.field_r[8].field_j) {
                  var3 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          }
        }
        return var3 != 0;
    }

    private final int w(int param0) {
        if (param0 != -2) {
            return -119;
        }
        return this.u(4);
    }

    private final int u(int param0) {
        if (param0 != 4) {
            Object var3 = null;
            int discarded$0 = ((af) this).a((qe) null, (byte) 56);
        }
        return sg.field_O | ll.field_f;
    }

    private final int p(int param0) {
        if (param0 <= 46) {
            Object var3 = null;
            dd discarded$0 = ((af) this).b((qe) null, -66);
            return 0;
        }
        return 0;
    }

    final static void a(int param0, boolean param1) {
        oi var3 = (oi) (Object) qr.field_a.c((byte) 69);
        while (var3 != null) {
            ra.a(param0, var3, -102);
            var3 = (oi) (Object) qr.field_a.f((byte) -5);
        }
        if (!param1) {
            return;
        }
        fl var4 = (fl) (Object) cq.field_g.c((byte) 83);
        while (var4 != null) {
            pm.a(var4, param0, true);
            var4 = (fl) (Object) cq.field_g.f((byte) -5);
        }
    }

    final byte b(int param0, int param1) {
        L0: {
          if (param1 == 30554) {
            break L0;
          } else {
            field_e = -70;
            break L0;
          }
        }
        if (0 == param0) {
          return (byte) -1;
        } else {
          if ((param0 ^ -1) != -9) {
            L1: {
              if (0 > param0) {
                break L1;
              } else {
                if (-17 <= (param0 ^ -1)) {
                  return (byte)((param0 & 9) >> -1674602461);
                } else {
                  break L1;
                }
              }
            }
            return (byte) -1;
          } else {
            return (byte) 2;
          }
        }
    }

    final void a(qe param0, boolean param1) {
        int var3 = 0;
        super.a(param0, param1);
        if (null != ((af) this).field_f) {
            var3 = ((af) this).field_d.field_n / 2;
            ((af) this).field_f[((af) this).c(-125, param0.field_L)] = param0.field_L % var3;
        }
    }

    final int a(qe param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        var3 = 34 % ((param1 - -32) / 40);
        var4 = param0.field_z;
        if (var4 == -1) {
          return 9;
        } else {
          if ((var4 ^ -1) == -1) {
            return 10;
          } else {
            if (var4 != 1) {
              if (-3 != (var4 ^ -1)) {
                return -1;
              } else {
                return 12;
              }
            } else {
              return 11;
            }
          }
        }
    }

    private final int s(int param0) {
        if (param0 != 0) {
            ((af) this).field_f = null;
        }
        return (((af) this).field_d.j(46).field_M ^ -1) > -1 ? this.u(4) : ob.field_F | sg.field_O;
    }

    private final int b(boolean param0) {
        if (!param0) {
            return 115;
        }
        return this.u(4);
    }

    final dd b(qe param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Pool.field_O;
          if (param1 == 1) {
            break L0;
          } else {
            ((af) this).field_f = null;
            break L0;
          }
        }
        if ((param0.field_z ^ -1) == 0) {
          return mf.field_n;
        } else {
          L1: {
            if (!(dq.field_a instanceof mf)) {
              break L1;
            } else {
              var3 = param0.field_z;
              if (0 != var3) {
                if (var3 != 1) {
                  if ((var3 ^ -1) == -3) {
                    return dq.field_a.field_e[8];
                  } else {
                    break L1;
                  }
                } else {
                  return dq.field_a.field_e[10];
                }
              } else {
                return dq.field_a.field_e[1];
              }
            }
          }
          return dq.field_a.field_e[param0.field_z];
        }
    }

    final boolean f(int param0) {
        if (param0 <= 113) {
            return true;
        }
        return true;
    }

    private final int v(int param0) {
        if (param0 != -13243) {
            field_e = 18;
        }
        return 9;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 <= 122) {
            int discarded$0 = ((af) this).b(-73);
        }
        return this.b(param0, (byte) 122, param2);
    }

    private final int t(int param0) {
        int var2 = -15 % ((-49 - param0) / 40);
        return (((af) this).field_d.j(106).field_M ^ -1) > -1 ? 0 : 1;
    }

    final int e(int param0) {
        if (param0 <= 64) {
            ((af) this).field_g = null;
        }
        return 2;
    }

    private final int q(int param0) {
        if (param0 != 1) {
            return -95;
        }
        return this.u(param0 ^ 5) | nr.field_R;
    }

    private final boolean b(int param0, byte param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 >= 19) {
          if (param0 == -1) {
            L0: {
              if ((param2 & 7) == 0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            return stackIn_16_0 != 0;
          } else {
            if ((param0 ^ -1) != -3) {
              L1: {
                L2: {
                  if (0 == (param2 & 7)) {
                    break L2;
                  } else {
                    if ((1 & param2 >> -1828597245) != param0) {
                      break L2;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L1;
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L1;
              }
              return stackIn_12_0 != 0;
            } else {
              L3: {
                if (8 != param2) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return stackIn_7_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    final int m(int param0) {
        if (param0 != 0) {
            af.a(108, false);
        }
        return 1;
    }

    private final boolean d(int param0, int param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        if (param0 != 85884769) {
            return false;
        }
        for (var3 = 1 + (param1 << -1102572189); (param1 << -2010250525) + 8 > var3; var3++) {
            if (!(!((af) this).field_d.field_l[var3].field_s)) {
                return false;
            }
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = -2 != (((af) this).field_d.field_n ^ -1) ? param2 / (((af) this).field_d.field_n >> 85884769) : 0;
        ((af) this).field_g[var4] = param0;
        if (param1 != -1) {
            int discarded$0 = this.c((byte) 2);
        }
        ((af) this).field_g[1 - var4] = 1 - param0;
    }

    final int i(int param0) {
        if (param0 != 26840) {
            return -37;
        }
        return 16;
    }

    final int a(boolean param0) {
        if (param0) {
            return 0;
        }
        return 1;
    }

    final boolean c(qe param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var3 = ((af) this).b(param0.field_n, 30554);
        if (param1 <= -33) {
          L0: {
            var4 = param0.field_z;
            if (-1 != var4) {
              if (var3 != var4) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            } else {
              L1: {
                if (var3 == 0) {
                  break L1;
                } else {
                  if (1 != var3) {
                    stackOut_7_0 = 0;
                    stackIn_11_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_11_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_11_0 != 0;
        } else {
          return true;
        }
    }

    private final int f(byte param0) {
        if (param0 != -30) {
            int discarded$0 = ((af) this).a(-100);
        }
        return sg.field_O | ll.field_f | nr.field_R | ve.field_j;
    }

    final String a(int param0, String[] param1) {
        int var3 = 0;
        String[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        if (((af) this).field_d.field_n > param0) {
          if (2 == ((af) this).field_d.field_n) {
            return nr.a(param1, param0 ^ -2, w.field_g);
          } else {
            var3 = param1.length >> -1931652927;
            var4 = new String[2][var3];
            var5 = 0;
            L0: while (true) {
              if (var5 >= param1.length) {
                return nr.a(new String[2], -1, ub.field_o);
              } else {
                var6 = var5 % var3;
                if (var6 != 0) {
                  if (var3 - 1 != var6) {
                    var4[var5 / var3][var6] = nr.a(new String[1], param0 + -2, bc.field_h);
                    var5++;
                    continue L0;
                  } else {
                    var4[var5 / var3][var6] = nr.a(new String[1], param0 + -2, lq.field_N);
                    var5++;
                    continue L0;
                  }
                } else {
                  var4[var5 / var3][var6] = nr.a(new String[1], -1, en.field_e);
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    private final int o(int param0) {
        if (param0 != -17) {
            ((af) this).field_g = null;
        }
        return this.u(4);
    }

    final int e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (param1 > 119) {
            break L0;
          } else {
            ((af) this).field_g = null;
            break L0;
          }
        }
        var3 = 0;
        var4 = 1 + (param0 << 1897518947);
        L1: while (true) {
          if (var4 >= (param0 << 1105205699) - -8) {
            return var3;
          } else {
            if (!((af) this).field_d.field_l[var4].field_s) {
              var3++;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static int c(byte param0, int param1) {
        if (param0 > -120) {
            return 48;
        }
        param1 = param1 & 8191;
        if ((param1 ^ -1) > -4097) {
            return param1 >= 2048 ? wf.field_b[-param1 + 4096] : wf.field_b[param1];
        }
        return param1 < 6144 ? -wf.field_b[-4096 + param1] : -wf.field_b[8192 + -param1];
    }

    final void a(ge param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((af) this).e(99, 46);
        }
        int var3 = param0.e((byte) 105);
        ((af) this).field_g[0] = var3 >> 255384967;
        if (0 == (((af) this).field_g[0] ^ -1)) {
            ((af) this).field_g[1] = -1;
        } else {
            ((af) this).field_g[1] = 1 - ((af) this).field_g[0];
        }
        if (null != ((af) this).field_f) {
            ((af) this).field_f[0] = rb.b(7, var3);
            if ((((af) this).field_f[0] ^ -1) == -8) {
                ((af) this).field_f[0] = -1;
            }
            ((af) this).field_f[1] = rb.b(var3, 63) >> -630118109;
            if (!(((af) this).field_f[1] != 7)) {
                ((af) this).field_f[1] = -1;
            }
        }
    }

    final int f(int param0, int param1) {
        if (param0 != 22533) {
            dd[] discarded$0 = af.a(115, -64, -57, 83, -73);
        }
        return ((af) this).field_g[1 == ((af) this).field_d.field_n ? 0 : param1 / (((af) this).field_d.field_n >> 1773321921)];
    }

    private final int g(byte param0) {
        if (param0 != -46) {
            return -121;
        }
        return this.s(0);
    }

    private final int e(byte param0) {
        if (param0 <= 52) {
            boolean discarded$0 = this.a(11, -35, (byte) -35);
        }
        return this.s(0);
    }

    final int h(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        L0: {
          var5 = Pool.field_O;
          var6 = ((af) this).field_d.j(param0 + 118);
          var3 = 0;
          var4 = var6.field_u;
          if (2 != var4) {
            if (-4 != (var4 ^ -1)) {
              if ((var4 ^ -1) != -2) {
                var3 = this.u(4);
                break L0;
              } else {
                var3 = this.u(param0 ^ -5) | nr.field_R;
                break L0;
              }
            } else {
              var3 = this.u(4) | nr.field_V;
              break L0;
            }
          } else {
            var3 = this.u(4) | nr.field_Q;
            break L0;
          }
        }
        L1: {
          var6.a(17, param0 + -13, new int[1]);
          if (((af) this).a((var6.field_L - param0) % ((af) this).field_d.field_n, -112)) {
            var6.a(11, -14, new int[0]);
            var3 = this.f((byte) -30);
            break L1;
          } else {
            break L1;
          }
        }
        var6.field_t = true;
        return var3;
    }

    final int c(int param0, int param1) {
        if (param0 > -36) {
            ((af) this).field_f = null;
        }
        return 1 != ((af) this).field_d.field_n ? param1 / (((af) this).field_d.field_n >> -573043071) : 0;
    }

    final int a(int param0) {
        int var2 = 0;
        L0: {
          var2 = ((af) this).f(22533, ((af) this).field_d.field_A);
          if (param0 == -1) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var2 == 0) {
              break L2;
            } else {
              if (-2 != (var2 ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (this.d(85884769, var2)) {
            return 2;
          } else {
            break L1;
          }
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You have declined the invitation.";
    }
}
