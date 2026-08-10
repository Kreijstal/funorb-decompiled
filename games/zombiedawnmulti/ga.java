/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends k {
    static cj field_r;
    static String field_t;
    static gp field_u;
    static String field_w;
    static int[] field_s;
    private o field_p;
    static String field_q;
    static int[] field_v;
    private int field_o;

    final void a(byte param0, int[] param1) {
        try {
            int var3_int = -83 / ((26 - param0) / 43);
            this.field_p = new o(param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ga.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void l(int param0) {
        if (param0 != -3093) {
            field_u = (gp) null;
        }
        this.field_j = (7 + this.field_o) / 8;
    }

    final static void i(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ga var13 = null;
        int var14 = 0;
        ga var15 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 31) {
                break L1;
              } else {
                ga.j(81);
                break L1;
              }
            }
            var13 = s.field_e;
            var15 = var13;
            var2 = var15.g(31365);
            var3 = (vg) ((Object) ag.field_i.c(116));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var2 == var3.field_i) {
                    break L3;
                  } else {
                    var3 = (vg) ((Object) ag.field_i.b(6));
                    continue L2;
                  }
                }
              }
              if (var3 == null) {
                ak.a((byte) -123);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L4: {
                  var4 = var15.g(31365);
                  if (var4 != 0) {
                    kk.field_v[0] = ta.field_lb;
                    var5 = var3.field_p;
                    var6_int = 1;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        s.a(var4, (byte) 111, var5);
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= var4) {
                            md.a(var5, -109);
                            dupTemp$0 = new String[2][var5];
                            var3.field_t = dupTemp$0;
                            var6 = dupTemp$0;
                            dupTemp$1 = new int[2][4 * var5];
                            var3.field_k = dupTemp$1;
                            var7 = dupTemp$1;
                            var8 = lj.field_n;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var9 = 0;
                                var14 = 0;
                                var10 = var14;
                                L8: while (true) {
                                  if (var9 >= var8) {
                                    break L4;
                                  } else {
                                    L9: {
                                      var11 = la.field_c[var9 + var5];
                                      var6[1][var14] = kk.field_v[var11];
                                      var7[1][var14 * 4] = lb.field_c[var11];
                                      var7[1][4 * var14 + 1] = vk.field_J[var11];
                                      var7[1][2 + 4 * var14] = kj.field_p[var11];
                                      var7[1][3 + var14 * 4] = ie.field_ob[var11];
                                      if (sf.a(1, kk.field_v[var11])) {
                                        if (0 == vk.field_J[var11] - -kj.field_p[var11] + ie.field_ob[var11]) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var9++;
                                    var14++;
                                    continue L8;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = la.field_c[var9];
                                  var6[0][var10] = kk.field_v[var11];
                                  var7[0][var10 * 4] = lb.field_c[var11];
                                  var7[0][1 + 4 * var10] = vk.field_J[var11];
                                  var7[0][2 + var10 * 4] = kj.field_p[var11];
                                  var7[0][3 + 4 * var10] = ie.field_ob[var11];
                                  if (!sf.a(1, kk.field_v[var11])) {
                                    break L10;
                                  } else {
                                    if (vk.field_J[var11] - -kj.field_p[var11] - -ie.field_ob[var11] != 0) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              sn.a(4050, var15);
                              if (-1 != (var6_int ^ -1)) {
                                k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                                break L11;
                              } else {
                                var3.field_m = vn.field_e;
                                var3.field_g = jq.field_a;
                                var3.field_o = ao.field_c;
                                var3.field_l = qc.field_q;
                                k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        kk.field_v[var6_int] = var13.f((byte) -116);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3.field_j = true;
                var3.a(true);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ga.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        if (param0 != -35) {
            return;
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$0] = (byte)(param1 + this.field_p.a(-48));
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (param0 <= var5_int) {
                break L0;
              } else {
                fieldTemp$2 = this.field_j;
                this.field_j = this.field_j + 1;
                param3[var5_int + param2] = (byte)(this.field_m[fieldTemp$2] + -this.field_p.a(-90));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static uc a(String param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        uc stackIn_9_0 = null;
        uc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!tg.field_g.d(-99)) {
                break L1;
              } else {
                if (!param0.equals(tg.field_g.a(31027))) {
                  L2: {
                    stackIn_5_0 = (String) (param0);

                    if (param1) {
                      stackIn_6_0 = (String) ((Object) stackIn_5_0);
                      stackIn_6_1 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = (String) ((Object) stackIn_5_0);
                      stackIn_6_1 = 1;
                      break L2;
                    }
                  }
                  tg.field_g = tg.a(stackIn_6_0, stackIn_6_1 != 0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (!param1) {
              stackIn_11_0 = tg.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = (uc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ga.K(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final int h(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != 14862) {
            return -77;
        }
        int var3 = this.field_o >> 1350894083;
        int var4 = 8 - (7 & this.field_o);
        int var5 = 0;
        this.field_o = this.field_o + param0;
        while (var4 < param0) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((mb.field_n[var4] & this.field_m[incrementValue$0]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (this.field_m[var3] >> var4 - param0 & mb.field_n[param0]);
        } else {
            var5 = var5 + (mb.field_n[var4] & this.field_m[var3]);
        }
        return var5;
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (param0 == 0) {
            var2 = li.field_C;
        }
        if (!(-2 != (param0 ^ -1))) {
            var2 = qe.field_g;
        }
        if (!param1) {
            field_r = (cj) null;
        }
        if (param0 == 2) {
            var2 = ba.field_q;
        }
        return var2;
    }

    final int m(int param0) {
        int var2 = 114 % ((param0 - -34) / 50);
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_m[fieldTemp$0] + -this.field_p.a(-25) & 255;
    }

    final void k(int param0) {
        this.field_o = this.field_j * 8;
        if (param0 != -1136) {
            field_u = (gp) null;
        }
    }

    public static void j(int param0) {
        field_t = null;
        field_u = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_w = null;
        field_v = null;
        if (param0 > -34) {
            ga.a(-13, true);
        }
    }

    ga(byte[] param0) {
        super(param0);
    }

    ga(int param0) {
        super(param0);
    }

    static {
        field_t = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "You have entered another game.";
        field_w = "Error connecting to server. Please try using a different server.";
        field_s = new int[]{42, 43, 38};
        field_v = new int[]{98, 214, 334, 455, 577};
    }
}
