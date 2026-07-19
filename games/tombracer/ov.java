/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov extends nv implements mra {
    private pc field_s;
    private up field_r;
    private mg field_n;
    private int field_u;
    private boolean field_q;
    private int field_w;
    private boolean field_v;
    private boolean field_t;
    private int field_o;
    static int field_p;

    public final boolean b(int param0) {
        int var2 = -21 % ((37 - param0) / 45);
        return this.field_t;
    }

    final void a(up param0, boolean param1) {
        try {
            this.field_r = param0;
            if (!param1) {
                this.field_u = -49;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ov.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void k(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        la var9 = null;
        int var10 = 0;
        pc var11 = null;
        int var12 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (!this.field_q) {
            break L0;
          } else {
            if (this.m((byte) 19).u(-25561)) {
              this.field_t = false;
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (!this.i(12340).g(108)) {
            if (null != this.field_n) {
              this.field_n.d(0);
              if (!this.field_n.c(0)) {
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (this.field_v) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((ov) (this)).field_v = stackIn_12_1 != 0;
                this.field_o = 0;
                break L1;
              }
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        this.field_t = this.field_v;
        if (!this.field_v) {
          return;
        } else {
          L3: {
            var2 = this.field_w;
            if (0 != var2) {
              break L3;
            } else {
              var2 = 268435456;
              break L3;
            }
          }
          L4: {
            L5: {
              if (0 >= this.field_u) {
                break L5;
              } else {
                this.field_o = this.field_o + this.field_u;
                if (this.field_o <= var2) {
                  break L4;
                } else {
                  this.field_o = var2;
                  if (var12 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_o = var2;
            break L4;
          }
          L6: {
            L7: {
              L8: {
                var3 = this.field_g.g(-25787) >> -655995902;
                var4 = hua.a((byte) 111, var3);
                var5 = bua.a(0, var3);
                var6 = 131072 + iia.d(this.field_g.c(param0 + -5467), this.field_g.a((byte) 55), param0 ^ 5416) / 2;
                var7 = this.field_g.d(3) + gqa.a(var4, (byte) 24, var6);
                var8 = this.field_g.e(9648) + gqa.a(var5, (byte) 24, var6);
                this.field_s.a(var7, gqa.a(var4, (byte) 24, this.field_o) + var7, var8, gqa.a(var5, (byte) 24, this.field_o) + var8, 44);
                this.field_s.field_b = this.field_o;
                this.field_s.field_i = this.field_g.P(param0 ^ param0) << -569600144;
                var9_int = this.field_r.field_j;
                if (3 == var9_int) {
                  this.field_s.field_j = 6;
                  if (var12 == 0) {
                    break L6;
                  } else {
                    break L8;
                  }
                } else {
                  if (-3 == (var9_int ^ -1)) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_s.field_j = 7;
              if (var12 == 0) {
                break L6;
              } else {
                break L7;
              }
            }
            this.field_s.field_j = 5;
            break L6;
          }
          L9: {
            var9 = this.b(true);
            var10 = var9.a(1, this.field_g, -66, this.field_s, this.e(6), this.field_r) ? 1 : 0;
            var9.b(false).a((byte) 120, this.field_s, this.field_r);
            if (var10 == 0) {
              break L9;
            } else {
              var11 = this.field_s;
              L10: while (true) {
                if (var11 == null) {
                  break L9;
                } else {
                  if (!var11.field_l) {
                    break L9;
                  } else {
                    L11: {
                      if (null != var11.field_h) {
                        break L11;
                      } else {
                        var9.b(false).a(var11, this.field_g, (byte) -123);
                        discarded$1 = var9.a(param0 ^ 5463, var11.field_a, this.field_r, 524288, 524288, var11.field_e);
                        break L11;
                      }
                    }
                    var11 = var11.field_h;
                    if (var12 == 0) {
                      continue L10;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    final pc c(int param0) {
        if (param0 < 99) {
            return (pc) null;
        }
        return this.field_s;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        char stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        char stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!q.a(param1, 11955)) {
                var6 = aba.field_c;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3 >= var6.length) {
                        break L3;
                      } else {
                        var4 = var6[var3];
                        stackOut_9_0 = var4;
                        stackOut_9_1 = param1;
                        stackIn_15_0 = stackOut_9_0;
                        stackIn_15_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          if (stackIn_10_0 != stackIn_10_1) {
                            var3++;
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                    stackOut_14_0 = param0;
                    stackOut_14_1 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L2;
                  }
                  L4: {
                    if (stackIn_15_0 > stackIn_15_1) {
                      break L4;
                    } else {
                      field_p = -59;
                      break L4;
                    }
                  }
                  var7 = hb.field_x;
                  var2 = var7;
                  var3 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var3 >= var7.length) {
                          break L7;
                        } else {
                          var4 = var7[var3];
                          stackOut_19_0 = var4 ^ -1;
                          stackIn_26_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (var5 != 0) {
                            break L6;
                          } else {
                            if (stackIn_20_0 == (param1 ^ -1)) {
                              stackOut_22_0 = 1;
                              stackIn_23_0 = stackOut_22_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var3++;
                              if (var5 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L6;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "ov.R(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            if (param0) {
                this.field_u = -117;
            }
            this.field_n.a(15637, param1);
            param1.a((byte) -23, this.field_w >> 1482967088, 10);
            this.field_r.a(param1, (byte) 125);
            param1.a((byte) 85, !this.field_q ? 0 : 1, 1);
            param1.a((byte) 45, this.field_u >> 554970192, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ov.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_q = false;
        }
        return 4;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
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
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_43_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ufa.a(-57, param1);
              var7_int = 0;
              var8 = -param0 + param1;
              if (0 > var8) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var9 = param1;
            var10 = -param1;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            if (!param3) {
              L2: {
                if (param2 < gca.field_d) {
                  break L2;
                } else {
                  if ((param2 ^ -1) >= (hc.field_h ^ -1)) {
                    var39 = vaa.field_a[param2];
                    var16 = rp.a(ss.field_c, -16226, pka.field_b, param6 - param1);
                    var17 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -param1);
                    var18 = rp.a(ss.field_c, -16226, pka.field_b, param6 + -var8);
                    var19 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var8);
                    nra.a((byte) -55, param4, var18, var39, var16);
                    nra.a((byte) -55, param5, var19, var39, var18);
                    nra.a((byte) -55, param4, var17, var39, var19);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var14 = -1;
              L3: while (true) {
                L4: {
                  L5: {
                    if ((var9 ^ -1) >= (var7_int ^ -1)) {
                      break L5;
                    } else {
                      var14 += 2;
                      var13 += 2;
                      var10 = var10 + var13;
                      var12 = var12 + var14;
                      if (var23 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (0 > var12) {
                            break L6;
                          } else {
                            if (var11 >= 1) {
                              var11--;
                              var12 = var12 - (var11 << -765234271);
                              pqa.field_m[var11] = var7_int;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var7_int++;
                          if (0 <= var10) {
                            var9--;
                            var10 = var10 - (var9 << -900984191);
                            var15 = param2 - var9;
                            var16 = param2 + var9;
                            if (var16 < gca.field_d) {
                              break L7;
                            } else {
                              if (hc.field_h >= var15) {
                                L8: {
                                  if ((var8 ^ -1) >= (var9 ^ -1)) {
                                    break L8;
                                  } else {
                                    L9: {
                                      var17 = pqa.field_m[var9];
                                      var18 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var7_int);
                                      var19 = rp.a(ss.field_c, -16226, pka.field_b, -var7_int + param6);
                                      var20 = rp.a(ss.field_c, -16226, pka.field_b, var17 + param6);
                                      var21 = rp.a(ss.field_c, -16226, pka.field_b, -var17 + param6);
                                      if (var16 <= hc.field_h) {
                                        var40 = vaa.field_a[var16];
                                        nra.a((byte) -55, param4, var21, var40, var19);
                                        nra.a((byte) -55, param5, var20, var40, var21);
                                        nra.a((byte) -55, param4, var18, var40, var20);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if ((var15 ^ -1) <= (gca.field_d ^ -1)) {
                                        var41 = vaa.field_a[var15];
                                        nra.a((byte) -55, param4, var21, var41, var19);
                                        nra.a((byte) -55, param5, var20, var41, var21);
                                        nra.a((byte) -55, param4, var18, var41, var20);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    if (var23 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L11: {
                                  var17 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var7_int);
                                  var18 = rp.a(ss.field_c, -16226, pka.field_b, -var7_int + param6);
                                  if ((var16 ^ -1) < (hc.field_h ^ -1)) {
                                    break L11;
                                  } else {
                                    nra.a((byte) -55, param4, var17, vaa.field_a[var16], var18);
                                    break L11;
                                  }
                                }
                                if (gca.field_d <= var15) {
                                  nra.a((byte) -55, param4, var17, vaa.field_a[var15], var18);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        L12: {
                          var15 = param2 + -var7_int;
                          var16 = param2 - -var7_int;
                          if ((var16 ^ -1) > (gca.field_d ^ -1)) {
                            break L12;
                          } else {
                            if ((hc.field_h ^ -1) > (var15 ^ -1)) {
                              break L12;
                            } else {
                              var17 = var9 + param6;
                              var18 = param6 + -var9;
                              if ((var17 ^ -1) > (pka.field_b ^ -1)) {
                                break L12;
                              } else {
                                if ((var18 ^ -1) < (ss.field_c ^ -1)) {
                                  break L12;
                                } else {
                                  L13: {
                                    var17 = rp.a(ss.field_c, -16226, pka.field_b, var17);
                                    var18 = rp.a(ss.field_c, -16226, pka.field_b, var18);
                                    if (var8 <= var7_int) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if ((var11 ^ -1) > (var7_int ^ -1)) {
                                          stackOut_42_0 = pqa.field_m[var7_int];
                                          stackIn_43_0 = stackOut_42_0;
                                          break L14;
                                        } else {
                                          stackOut_41_0 = var11;
                                          stackIn_43_0 = stackOut_41_0;
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        var19 = stackIn_43_0;
                                        var20 = rp.a(ss.field_c, -16226, pka.field_b, param6 + var19);
                                        var21 = rp.a(ss.field_c, -16226, pka.field_b, -var19 + param6);
                                        if (var16 <= hc.field_h) {
                                          var42 = vaa.field_a[var16];
                                          nra.a((byte) -55, param4, var21, var42, var18);
                                          nra.a((byte) -55, param5, var20, var42, var21);
                                          nra.a((byte) -55, param4, var17, var42, var20);
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if ((var15 ^ -1) > (gca.field_d ^ -1)) {
                                          break L16;
                                        } else {
                                          var43 = vaa.field_a[var15];
                                          nra.a((byte) -55, param4, var21, var43, var18);
                                          nra.a((byte) -55, param5, var20, var43, var21);
                                          nra.a((byte) -55, param4, var17, var43, var20);
                                          break L16;
                                        }
                                      }
                                      if (var23 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L17: {
                                    if (hc.field_h >= var16) {
                                      nra.a((byte) -55, param4, var17, vaa.field_a[var16], var18);
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  if ((gca.field_d ^ -1) >= (var15 ^ -1)) {
                                    nra.a((byte) -55, param4, var17, vaa.field_a[var15], var18);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (var23 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  break L4;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "ov.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ov(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        this.field_s = new pc();
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_n = new mg(param0.field_E, param1);
              this.field_w = param1.b((byte) 44, 10) << 1993083792;
              this.field_r = ad.a((byte) 87, param1);
              if (8 > param0.field_E) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if ((param1.b((byte) 44, 1) ^ -1) != -2) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((ov) (this)).field_q = stackIn_5_1 != 0;
                break L1;
              }
            }
            L3: {
              if (-12 < (param0.field_E ^ -1)) {
                break L3;
              } else {
                this.field_u = param1.b((byte) 44, 8) << 2075528272;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("ov.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -58) {
          L0: {
            L1: {
              if (uk.a(param2, (byte) 2, param1)) {
                break L1;
              } else {
                if (!pr.a(param1, -23611, param2)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static boolean b(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -1 % ((param0 - 63) / 46);
            if (hb.field_t == null) {
              break L1;
            } else {
              if (hb.field_t.field_c != param1) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final int a(int param0, int param1) {
        param0 = upa.a(this.field_v, param0, (byte) -106);
        param0 = fs.a((byte) 127, param0, this.field_o);
        if (param1 >= -48) {
            return 84;
        }
        return param0;
    }

    public final void m(int param0) {
        int var2 = 12 % ((param0 - 28) / 49);
        if (!(!this.field_k)) {
            return;
        }
        super.m(78);
        if (!(this.field_f)) {
            this.field_t = false;
        }
    }

    public final void a(int param0, mg param1) {
        boolean discarded$0 = false;
        try {
            this.field_n = param1;
            if (param0 < 81) {
                discarded$0 = this.p((byte) -109);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ov.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            this.field_r.a(this.e(6), 2348);
            if (!param0) {
                this.field_q = true;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ov.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            this.a(true, (fsa) null);
        }
        return false;
    }

    ov(la param0, boolean param1) {
        super(param0, param1);
        this.field_s = new pc();
        this.field_o = 0;
        try {
            this.field_n = new mg();
            this.field_r = new up(1, 10);
            this.field_r.b(1, 13);
            this.field_w = 0;
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ov.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, iq param1) {
        int discarded$0 = 0;
        try {
            super.b(117, param1);
            if (param0 < 112) {
                discarded$0 = this.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ov.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
