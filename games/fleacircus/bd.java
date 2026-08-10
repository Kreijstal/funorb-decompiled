/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bd extends oh implements da {
    private lk field_lb;
    static int[] field_ob;
    private boolean field_mb;
    static java.awt.Image field_kb;
    private boolean field_rb;
    private boolean field_nb;
    private fa field_qb;
    private boolean field_pb;

    final void n(int param0) {
        if (!this.field_G) {
          return;
        } else {
          if (param0 == -22645) {
            L0: {
              this.field_G = false;
              if (this.field_pb) {
                ek.a((byte) -6);
                break L0;
              } else {
                if (this.field_mb) {
                  cj.a(param0 + 22645);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0, int param1, String param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        bm stackIn_12_0 = null;
        bm stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        bm var7 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_rb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_rb = true;
                stackIn_6_0 = this;

                if (param1 != 256) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((bd) (this)).field_nb = stackIn_7_1 != 0;
                this.field_lb.a((byte) 105, 4210752, 8405024);
                var7 = new bm((bd) (this), this.field_qb, param2);
                if (-6 != (param1 ^ -1)) {
                  if (-257 == (param1 ^ -1)) {
                    var7.a((kd) (this), true, uh.field_o);
                    break L2;
                  } else {
                    L3: {
                      stackIn_12_0 = (bm) (var7);

                      if (this.field_pb) {
                        stackIn_13_0 = (bm) ((Object) stackIn_12_0);
                        stackIn_13_1 = uh.field_o;
                        break L3;
                      } else {
                        stackIn_13_0 = (bm) ((Object) stackIn_12_0);
                        stackIn_13_1 = mi.field_k;
                        break L3;
                      }
                    }
                    ((bm) (Object) stackIn_13_0).a(stackIn_13_1, -23493, -1);
                    break L2;
                  }
                } else {
                  var7.a(ld.field_c, -23493, 11);
                  var7.a(vk.field_K, -23493, 17);
                  break L2;
                }
              }
              L4: {
                if ((param1 ^ -1) != -4) {
                  if (4 == param1) {
                    var7.a(uj.field_e, -23493, 8);
                    break L4;
                  } else {
                    if (-7 == (param1 ^ -1)) {
                      var7.a(cb.field_s, -23493, 9);
                      break L4;
                    } else {
                      if (9 != param1) {
                        break L4;
                      } else {
                        var7.a((kd) (this), true, fc.field_d);
                        break L4;
                      }
                    }
                  }
                } else {
                  var7.a(bm.field_N, -23493, 7);
                  break L4;
                }
              }
              L5: {
                this.d(var7, 26034);
                if (param0 <= -2) {
                  break L5;
                } else {
                  var6 = (String) null;
                  this.a((byte) 83, 85, (String) null);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4);

            stackIn_28_1 = new StringBuilder().append("bd.MB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        field_ob = null;
        if (param0 != 127) {
            bd.g((byte) 53);
        }
        field_kb = null;
    }

    bd(f param0, fa param1, String param2, boolean param3, boolean param4) {
        super(param0, new bm((bd) null, param1, param2), 77, 10, 10);
        try {
            this.field_qb = param1;
            this.field_pb = param3 ? true : false;
            this.field_mb = param4 ? true : false;
            this.field_nb = false;
            this.field_rb = false;
            this.field_lb = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_lb.field_H = true;
            this.a((qa) (this.field_lb), (byte) -97);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void o(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ll var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        bh var6_ref_bh = null;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ih var28 = null;
        var26 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var28 = ae.field_a;
              var2 = var28.e(false);
              if (0 == var2) {
                var3 = var28.d((byte) 108);
                var4 = (ll) ((Object) jj.field_S.c((byte) 47));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if ((var3 ^ -1) == (var4.field_k ^ -1)) {
                        break L3;
                      } else {
                        var4 = (ll) ((Object) jj.field_S.b((byte) -105));
                        continue L2;
                      }
                    }
                  }
                  if (var4 != null) {
                    L4: {
                      var5 = var28.e(false);
                      if (0 == var5) {
                        break L4;
                      } else {
                        var6 = var4.field_q;
                        de.field_n[0].field_b = b.field_e;
                        de.field_n[0].field_e = null;
                        de.field_n[0].field_i = false;
                        var7 = var4.field_t;
                        var8_int = 1;
                        L5: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$0 = new String[3][var6];
                            var4.field_i = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6];
                            dupTemp$1 = new long[3][var6];
                            var4.field_u = dupTemp$1;
                            var10 = dupTemp$1;
                            dupTemp$2 = new int[3][var6 * var7];
                            var4.field_p = dupTemp$2;
                            var11 = dupTemp$2;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.e(false);
                            if (0 < var18) {
                              var19 = 0;
                              L6: while (true) {
                                if (var19 >= var18) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.e(false);
                                    var21 = de.field_n[var20].field_b;
                                    var22 = var28.f(-103);
                                    var24 = var28.field_i;
                                    if (var19 < var6) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = de.field_n[var20].field_e;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          break L7;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var11[0][incrementValue$3] = var28.c((byte) 127);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (!ng.a(var21, (byte) 7)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = b.field_e;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_i = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var11[1][incrementValue$4] = var28.c((byte) -31);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 >= var6) {
                                      break L11;
                                    } else {
                                      if (!de.field_n[var20].field_i) {
                                        de.field_n[var20].field_i = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = de.field_n[var20].field_e;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_i = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var11[2][incrementValue$5] = var28.c((byte) 123);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            L13: {
                              de.field_n[var8_int].field_b = var28.h(0);
                              de.field_n[var8_int].field_i = false;
                              if (-2 == (var28.e(false) ^ -1)) {
                                de.field_n[var8_int].field_e = var28.h(param0 + 24021);
                                break L13;
                              } else {
                                de.field_n[var8_int].field_e = null;
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var4.field_l = true;
                    var4.c(param0 + 24020);
                    break L1;
                  } else {
                    k.c(param0 ^ 13077);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  ud.a("HS1: " + ak.a(true), (Throwable) null, 0);
                  k.c(-28354);
                  break L1;
                } else {
                  var3 = var28.d((byte) -53);
                  var4_long = var28.f(-102);
                  var6_ref_bh = (bh) ((Object) wi.field_j.c((byte) 47));
                  L14: while (true) {
                    L15: {
                      if (var6_ref_bh == null) {
                        break L15;
                      } else {
                        if ((var3 ^ -1) != (var6_ref_bh.field_s ^ -1)) {
                          var6_ref_bh = (bh) ((Object) wi.field_j.b((byte) -105));
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var6_ref_bh != null) {
                      var6_ref_bh.field_k = var4_long;
                      var6_ref_bh.c(-1);
                      break L1;
                    } else {
                      k.c(param0 ^ 13077);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            L16: {
              if (param0 == -24021) {
                break L16;
              } else {
                bd.o(-33);
                break L16;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "bd.KB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            this.field_rb = false;
        }
        this.field_lb.a((byte) 92, 4210752, 2121792);
        bm var2 = new bm((bd) (this), this.field_qb, kb.field_m);
        var2.a(rc.field_f, -23493, 15);
        this.d(var2, 26034);
    }

    public void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (!this.field_nb) {
                qg.a("tochangedisplayname.ws", rl.a((byte) -72), 0);
                break L1;
              } else {
                cg.a((byte) -105, 3);
                this.n(-22645);
                break L1;
              }
            }
            L2: {
              if (param3 == 248) {
                break L2;
              } else {
                this.field_lb = (lk) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("bd.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (13 != param1) {
              L1: {
                if (param0 == -2) {
                  break L1;
                } else {
                  field_kb = (java.awt.Image) null;
                  break L1;
                }
              }
              stackIn_6_0 = super.a(-2, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.n(-22645);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("bd.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
    }
}
