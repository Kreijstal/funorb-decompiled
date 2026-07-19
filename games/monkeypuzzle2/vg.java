/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends jj {
    private kf field_H;
    static int field_J;
    private String field_N;
    private int field_L;
    private le field_I;
    static int[] field_K;
    static le field_M;

    final static boolean c(boolean param0) {
        if (!param0) {
          if ((k.field_g ^ -1) <= -11) {
            if (-14 < (mc.field_a ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final String a(byte param0) {
        if (param0 == 54) {
            return null;
        }
        field_K = (int[]) null;
        return null;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
            this.field_L = this.field_L + 1;
            if (param3 > -13) {
                field_M = (le) null;
            }
            super.a(param0, param1, param2, (byte) -89);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("vg.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    vg(kf param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, bk.a(true));
        try {
            this.field_N = param1;
            this.field_H = param0;
            this.a(param5, 13361, param2, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        na var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        le var16 = null;
        Object var17 = null;
        le var18 = null;
        le var19 = null;
        le var20 = null;
        Object var21 = null;
        le var22 = null;
        le var23 = null;
        le var24 = null;
        Object var25 = null;
        le var26 = null;
        le var27 = null;
        le var28 = null;
        ui var29 = null;
        ui var30 = null;
        ui var31 = null;
        L0: {
          L1: {
            var17 = null;
            var21 = null;
            var25 = null;
            var13 = MonkeyPuzzle2.field_F ? 1 : 0;
            var6 = this.field_H.b(false);
            if (ke.field_d == var6) {
              var5 = w.field_a;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            } else {
              if (var6 != f.field_g) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var5 = w.field_a;
                    if (var13 == 0) {
                      break L3;
                    } else {
                      var5 = this.field_H.b((byte) -123);
                      if (var5 == null) {
                        var5 = this.field_N;
                        break L3;
                      } else {
                        if (var5.equals(this.field_s)) {
                          break L2;
                        } else {
                          this.field_s = var5;
                          this.a(true);
                          break L2;
                        }
                      }
                    }
                  }
                  if (var5.equals(this.field_s)) {
                    break L2;
                  } else {
                    this.field_s = var5;
                    this.a(true);
                    break L2;
                  }
                }
                super.a(param0, param1, param2, param3);
                var6 = this.field_H.b(false);
                var29 = (ui) ((Object) this.field_h);
                var9 = this.field_r + param3;
                var10 = var29.a((we) (this), -73, param2) - -(var29.a(-1, (we) (this)).b(62) >> -2113262815);
                if (var6 != ke.field_d) {
                  if (var6 != f.field_g) {
                    if (ol.field_h != var6) {
                      if (var6 == wj.field_i) {
                        var18 = hk.field_i[1];
                        var18.c(var9, var10 - (var18.field_j >> -1745016767), 256);
                        if (var13 == 0) {
                          return;
                        } else {
                          L4: {
                            var19 = hk.field_i[2];
                            var19.c(var9, var10 + -(var19.field_j >> 1660784481), 256);
                            var20 = hk.field_i[0];
                            var11 = var20.field_m << -851647583;
                            var12 = var20.field_n << -1285006847;
                            if (this.field_I == null) {
                              break L4;
                            } else {
                              if (this.field_I.field_k < var11) {
                                break L4;
                              } else {
                                if (this.field_I.field_j < var12) {
                                  break L4;
                                } else {
                                  mc.a(-8497, this.field_I);
                                  ge.d();
                                  break L4;
                                }
                              }
                            }
                          }
                          this.field_I = new le(var11, var12);
                          mc.a(param0 ^ -8495, this.field_I);
                          var20.b(112, 144, var20.field_m << 243330020, var20.field_n << -829455484, -this.field_L << -1069800406, 4096);
                          tj.b(param0 ^ 659);
                          this.field_I.c(-(var20.field_m >> 1774671457) + var9, var10 + -var20.field_n, 256);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L5: {
                        var19 = hk.field_i[2];
                        var19.c(var9, var10 + -(var19.field_j >> 1660784481), 256);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          L6: {
                            var20 = hk.field_i[0];
                            var11 = var20.field_m << -851647583;
                            var12 = var20.field_n << -1285006847;
                            if (this.field_I == null) {
                              break L6;
                            } else {
                              if (this.field_I.field_k < var11) {
                                break L6;
                              } else {
                                if (this.field_I.field_j < var12) {
                                  break L6;
                                } else {
                                  mc.a(-8497, this.field_I);
                                  ge.d();
                                  break L6;
                                }
                              }
                            }
                          }
                          this.field_I = new le(var11, var12);
                          mc.a(param0 ^ -8495, this.field_I);
                          var20.b(112, 144, var20.field_m << 243330020, var20.field_n << -829455484, -this.field_L << -1069800406, 4096);
                          tj.b(param0 ^ 659);
                          this.field_I.c(-(var20.field_m >> 1774671457) + var9, var10 + -var20.field_n, 256);
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      L8: {
                        var20 = hk.field_i[0];
                        var11 = var20.field_m << -851647583;
                        var12 = var20.field_n << -1285006847;
                        if (this.field_I == null) {
                          break L8;
                        } else {
                          if (this.field_I.field_k < var11) {
                            break L8;
                          } else {
                            if (this.field_I.field_j < var12) {
                              break L8;
                            } else {
                              mc.a(-8497, this.field_I);
                              ge.d();
                              if (var13 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      this.field_I = new le(var11, var12);
                      mc.a(param0 ^ -8495, this.field_I);
                      break L7;
                    }
                    var20.b(112, 144, var20.field_m << 243330020, var20.field_n << -829455484, -this.field_L << -1069800406, 4096);
                    tj.b(param0 ^ 659);
                    this.field_I.c(-(var20.field_m >> 1774671457) + var9, var10 + -var20.field_n, 256);
                    return;
                  }
                } else {
                  L9: {
                    L10: {
                      var20 = hk.field_i[0];
                      var11 = var20.field_m << -851647583;
                      var12 = var20.field_n << -1285006847;
                      if (this.field_I == null) {
                        break L10;
                      } else {
                        if (this.field_I.field_k < var11) {
                          break L10;
                        } else {
                          if (this.field_I.field_j < var12) {
                            break L10;
                          } else {
                            mc.a(-8497, this.field_I);
                            ge.d();
                            if (var13 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    this.field_I = new le(var11, var12);
                    mc.a(param0 ^ -8495, this.field_I);
                    break L9;
                  }
                  var20.b(112, 144, var20.field_m << 243330020, var20.field_n << -829455484, -this.field_L << -1069800406, 4096);
                  tj.b(param0 ^ 659);
                  this.field_I.c(-(var20.field_m >> 1774671457) + var9, var10 + -var20.field_n, 256);
                  return;
                }
              }
            }
          }
          var5 = this.field_H.b((byte) -123);
          if (var5 != null) {
            break L0;
          } else {
            var5 = this.field_N;
            break L0;
          }
        }
        if (var5.equals(this.field_s)) {
          L11: {
            super.a(param0, param1, param2, param3);
            var6 = this.field_H.b(false);
            var31 = (ui) ((Object) this.field_h);
            var9 = this.field_r + param3;
            var10 = var31.a((we) (this), -73, param2) - -(var31.a(-1, (we) (this)).b(62) >> -2113262815);
            if (var6 == ke.field_d) {
              break L11;
            } else {
              if (var6 == f.field_g) {
                break L11;
              } else {
                L12: {
                  if (ol.field_h == var6) {
                    break L12;
                  } else {
                    if (var6 == wj.field_i) {
                      var26 = hk.field_i[1];
                      var26.c(var9, var10 - (var26.field_j >> -1745016767), 256);
                      if (var13 != 0) {
                        break L12;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                var27 = hk.field_i[2];
                var27.c(var9, var10 + -(var27.field_j >> 1660784481), 256);
                if (var13 != 0) {
                  break L11;
                } else {
                  return;
                }
              }
            }
          }
          var28 = hk.field_i[0];
          var11 = var28.field_m << -851647583;
          var12 = var28.field_n << -1285006847;
          if (this.field_I != null) {
            if (this.field_I.field_k >= var11) {
              if (this.field_I.field_j >= var12) {
                mc.a(-8497, this.field_I);
                ge.d();
                if (var13 != 0) {
                  this.field_I = new le(var11, var12);
                  mc.a(param0 ^ -8495, this.field_I);
                  var28.b(112, 144, var28.field_m << 243330020, var28.field_n << -829455484, -this.field_L << -1069800406, 4096);
                  tj.b(param0 ^ 659);
                  this.field_I.c(-(var28.field_m >> 1774671457) + var9, var10 + -var28.field_n, 256);
                  return;
                } else {
                  var28.b(112, 144, var28.field_m << 243330020, var28.field_n << -829455484, -this.field_L << -1069800406, 4096);
                  tj.b(param0 ^ 659);
                  this.field_I.c(-(var28.field_m >> 1774671457) + var9, var10 + -var28.field_n, 256);
                  return;
                }
              } else {
                this.field_I = new le(var11, var12);
                mc.a(param0 ^ -8495, this.field_I);
                var28.b(112, 144, var28.field_m << 243330020, var28.field_n << -829455484, -this.field_L << -1069800406, 4096);
                tj.b(param0 ^ 659);
                this.field_I.c(-(var28.field_m >> 1774671457) + var9, var10 + -var28.field_n, 256);
                return;
              }
            } else {
              this.field_I = new le(var11, var12);
              mc.a(param0 ^ -8495, this.field_I);
              var28.b(112, 144, var28.field_m << 243330020, var28.field_n << -829455484, -this.field_L << -1069800406, 4096);
              tj.b(param0 ^ 659);
              this.field_I.c(-(var28.field_m >> 1774671457) + var9, var10 + -var28.field_n, 256);
              return;
            }
          } else {
            this.field_I = new le(var11, var12);
            mc.a(param0 ^ -8495, this.field_I);
            var28.b(112, 144, var28.field_m << 243330020, var28.field_n << -829455484, -this.field_L << -1069800406, 4096);
            tj.b(param0 ^ 659);
            this.field_I.c(-(var28.field_m >> 1774671457) + var9, var10 + -var28.field_n, 256);
            return;
          }
        } else {
          L13: {
            this.field_s = var5;
            this.a(true);
            super.a(param0, param1, param2, param3);
            var6 = this.field_H.b(false);
            var30 = (ui) ((Object) this.field_h);
            var9 = this.field_r + param3;
            var10 = var30.a((we) (this), -73, param2) - -(var30.a(-1, (we) (this)).b(62) >> -2113262815);
            if (var6 == ke.field_d) {
              break L13;
            } else {
              if (var6 == f.field_g) {
                break L13;
              } else {
                L14: {
                  if (ol.field_h == var6) {
                    break L14;
                  } else {
                    if (var6 == wj.field_i) {
                      var22 = hk.field_i[1];
                      var22.c(var9, var10 - (var22.field_j >> -1745016767), 256);
                      if (var13 != 0) {
                        break L14;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                var23 = hk.field_i[2];
                var23.c(var9, var10 + -(var23.field_j >> 1660784481), 256);
                if (var13 != 0) {
                  break L13;
                } else {
                  return;
                }
              }
            }
          }
          var24 = hk.field_i[0];
          var16 = var24;
          var11 = var24.field_m << -851647583;
          var12 = var24.field_n << -1285006847;
          if (this.field_I != null) {
            if (this.field_I.field_k >= var11) {
              if (this.field_I.field_j >= var12) {
                mc.a(-8497, this.field_I);
                ge.d();
                if (var13 == 0) {
                  var24.b(112, 144, var24.field_m << 243330020, var24.field_n << -829455484, -this.field_L << -1069800406, 4096);
                  tj.b(param0 ^ 659);
                  this.field_I.c(-(var24.field_m >> 1774671457) + var9, var10 + -var24.field_n, 256);
                  return;
                } else {
                  this.field_I = new le(var11, var12);
                  mc.a(param0 ^ -8495, this.field_I);
                  var24.b(112, 144, var24.field_m << 243330020, var24.field_n << -829455484, -this.field_L << -1069800406, 4096);
                  tj.b(param0 ^ 659);
                  this.field_I.c(-(var24.field_m >> 1774671457) + var9, var10 + -var24.field_n, 256);
                  return;
                }
              } else {
                this.field_I = new le(var11, var12);
                mc.a(param0 ^ -8495, this.field_I);
                var24.b(112, 144, var24.field_m << 243330020, var24.field_n << -829455484, -this.field_L << -1069800406, 4096);
                tj.b(param0 ^ 659);
                this.field_I.c(-(var24.field_m >> 1774671457) + var9, var10 + -var24.field_n, 256);
                return;
              }
            } else {
              this.field_I = new le(var11, var12);
              mc.a(param0 ^ -8495, this.field_I);
              var24.b(112, 144, var24.field_m << 243330020, var24.field_n << -829455484, -this.field_L << -1069800406, 4096);
              tj.b(param0 ^ 659);
              this.field_I.c(-(var24.field_m >> 1774671457) + var9, var10 + -var24.field_n, 256);
              return;
            }
          } else {
            this.field_I = new le(var11, var12);
            mc.a(param0 ^ -8495, this.field_I);
            var24.b(112, 144, var24.field_m << 243330020, var24.field_n << -829455484, -this.field_L << -1069800406, 4096);
            tj.b(param0 ^ 659);
            this.field_I.c(-(var24.field_m >> 1774671457) + var9, var10 + -var24.field_n, 256);
            return;
          }
        }
    }

    final static boolean a(int param0, hb param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        hb var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param0 > 59) {
                break L1;
              } else {
                var3 = (hb) null;
                discarded$2 = vg.a(122, (hb) null);
                break L1;
              }
            }
            L2: {
              if (param1.f(8, 1) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("vg.BA(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public static void k(int param0) {
        field_M = null;
        field_K = null;
        if (param0 != -3114) {
            vg.k(-104);
        }
    }

    final static void a(int param0) {
        if (param0 >= 108) {
          if (-33 <= (ol.field_e ^ -1)) {
            w.a(-1, 0);
            if (MonkeyPuzzle2.field_F) {
              w.a(-1, -32 + ol.field_e);
              return;
            } else {
              return;
            }
          } else {
            w.a(-1, -32 + ol.field_e);
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_J = 200;
        field_K = new int[]{12348480, 16059704, 16770581, 7783495, 4555448};
    }
}
