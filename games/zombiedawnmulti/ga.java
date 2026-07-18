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
            ((ga) this).field_p = new o(param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ga.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void l(int param0) {
        if (param0 != -3093) {
            field_u = null;
        }
        ((ga) this).field_j = (7 + ((ga) this).field_o) / 8;
    }

    final static void i() {
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
        int var15 = 0;
        ga var16 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var13 = s.field_e;
            var16 = var13;
            var2 = var16.g(31365);
            var3 = (vg) (Object) ag.field_i.c(116);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 == var3.field_i) {
                    break L2;
                  } else {
                    var3 = (vg) (Object) ag.field_i.b(6);
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                ak.a((byte) -123);
                return;
              } else {
                L3: {
                  var4 = var16.g(31365);
                  if (var4 != 0) {
                    kk.field_v[0] = ta.field_lb;
                    var5 = var3.field_p;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        s.a(var4, (byte) 111, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            md.a(var5, -109);
                            String[][] dupTemp$2 = new String[2][var5];
                            var3.field_t = dupTemp$2;
                            var6 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][4 * var5];
                            var3.field_k = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = lj.field_n;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var14 >= var8) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = la.field_c[var14 + var5];
                                      var6[1][var15] = kk.field_v[var11];
                                      var7[1][var15 * 4] = lb.field_c[var11];
                                      var7[1][4 * var15 + 1] = vk.field_J[var11];
                                      var7[1][2 + 4 * var15] = kj.field_p[var11];
                                      var7[1][3 + var15 * 4] = ie.field_ob[var11];
                                      if (sf.a(1, kk.field_v[var11])) {
                                        if (0 == vk.field_J[var11] - -kj.field_p[var11] + ie.field_ob[var11]) {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = la.field_c[var9];
                                  var6[0][var10] = kk.field_v[var11];
                                  var7[0][var10 * 4] = lb.field_c[var11];
                                  var7[0][1 + 4 * var10] = vk.field_J[var11];
                                  var7[0][2 + var10 * 4] = kj.field_p[var11];
                                  var7[0][3 + 4 * var10] = ie.field_ob[var11];
                                  if (!sf.a(1, kk.field_v[var11])) {
                                    break L9;
                                  } else {
                                    if (vk.field_J[var11] - -kj.field_p[var11] - -ie.field_ob[var11] != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              sn.a(4050, (k) (Object) var16);
                              if (var6_int != 0) {
                                k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                                break L10;
                              } else {
                                var3.field_m = vn.field_e;
                                var3.field_g = jq.field_a;
                                var3.field_o = ao.field_c;
                                var3.field_l = qc.field_q;
                                k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        kk.field_v[var6_int] = var13.f((byte) -116);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var3.field_j = true;
                var3.a(true);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "ga.G(" + 104 + ')');
        }
    }

    final void b(byte param0, int param1) {
        if (param0 != -35) {
            return;
        }
        int fieldTemp$0 = ((ga) this).field_j;
        ((ga) this).field_j = ((ga) this).field_j + 1;
        ((ga) this).field_m[fieldTemp$0] = (byte)(param1 + ((ga) this).field_p.a(-48));
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (param0 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((ga) this).field_j;
                ((ga) this).field_j = ((ga) this).field_j + 1;
                param3[var5_int + param2] = (byte)(((ga) this).field_m[fieldTemp$5] + -((ga) this).field_p.a(-90));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static uc a(String param0) {
        RuntimeException var2 = null;
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
            if (!tg.field_g.d(-99)) {
              break L0;
            } else {
              if (!param0.equals((Object) (Object) tg.field_g.a(31027))) {
                int discarded$2 = 1;
                tg.field_g = tg.a(param0);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return tg.field_g;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ga.K(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + false + ')');
        }
    }

    final int h(int param0, int param1) {
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != 14862) {
            return -77;
        }
        int var3 = ((ga) this).field_o >> 3;
        int var4 = 8 - (7 & ((ga) this).field_o);
        int var5 = 0;
        ((ga) this).field_o = ((ga) this).field_o + param0;
        while (var4 < param0) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((mb.field_n[var4] & ((ga) this).field_m[incrementValue$0]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((ga) this).field_m[var3] >> var4 - param0 & mb.field_n[param0]);
        } else {
            var5 = var5 + (mb.field_n[var4] & ((ga) this).field_m[var3]);
        }
        return var5;
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (param0 == 0) {
            var2 = li.field_C;
        }
        if (!(param0 != 1)) {
            var2 = qe.field_g;
        }
        if (param0 == 2) {
            var2 = ba.field_q;
        }
        return var2;
    }

    final int m(int param0) {
        int var2 = 114 % ((param0 - -34) / 50);
        int fieldTemp$0 = ((ga) this).field_j;
        ((ga) this).field_j = ((ga) this).field_j + 1;
        return ((ga) this).field_m[fieldTemp$0] + -((ga) this).field_p.a(-25) & 255;
    }

    final void k(int param0) {
        ((ga) this).field_o = ((ga) this).field_j * 8;
        if (param0 != -1136) {
            field_u = null;
        }
    }

    public static void j() {
        field_t = null;
        field_u = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_w = null;
        field_v = null;
    }

    ga(byte[] param0) {
        super(param0);
    }

    ga(int param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "You have entered another game.";
        field_w = "Error connecting to server. Please try using a different server.";
        field_s = new int[]{42, 43, 38};
        field_v = new int[]{98, 214, 334, 455, 577};
    }
}
