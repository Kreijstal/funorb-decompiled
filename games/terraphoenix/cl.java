/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends gb implements jf, n {
    private eb field_G;
    static d field_J;
    static String field_I;
    private tj field_H;
    private vj field_F;

    cl(tj param0) {
        super(0, 0, 288, 0, (cj) null);
        String var7 = null;
        int var3 = 0;
        fd var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_H = param0;
            this.field_G = new eb(rj.field_e, (sc) null);
            this.field_G.field_l = (cj) ((Object) new ic());
            var7 = ij.a(new String[]{this.f((byte) -69), this.d(false)}, -1, rf.field_y);
            var3 = 20;
            var4 = new fd(qk.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, qk.field_e.field_s, -1, 2147483647, true);
            this.field_F = new vj(var7, var4);
            this.field_F.field_x = "";
            this.field_F.a(0, ig.field_b, (byte) 126);
            this.field_F.a(1, ig.field_b, (byte) 25);
            this.field_F.field_r = (sc) (this);
            this.field_F.field_p = -40 + this.field_p;
            this.field_F.b(var3, -96, 26, -40 + this.field_p);
            var3 = var3 + (15 + this.field_F.field_n);
            this.b((byte) 95, this.field_F);
            var5 = 4;
            var6 = 200;
            this.field_G.a(var3, (byte) 46, var6, 300 - var6 >> 457850785, 40);
            this.field_G.field_r = (sc) (this);
            this.b((byte) 95, this.field_G);
            this.a(0, (byte) 64, 300, 0, var5 + (var3 - -55));
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "cl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String f(byte param0) {
        int var2 = -98 / ((param0 - 56) / 33);
        return "<u=2164A2><col=2164A2>";
    }

    public static void g(byte param0) {
        field_I = null;
        field_J = null;
        if (param0 <= 110) {
            ci var2 = (ci) null;
            cl.a(-65, 31, (byte) -36, (ci) null, -121, -18);
        }
    }

    public final void a(byte param0, vj param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = -51 / ((param0 - -10) / 40);
              if (-1 == (param3 ^ -1)) {
                ld.a((byte) -29, "terms.ws");
                break L1;
              } else {
                if (1 != param3) {
                  if (-3 == (param3 ^ -1)) {
                    ld.a((byte) -29, "conduct.ws");
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ld.a((byte) -29, "privacy.ws");
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("cl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static eg a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        if (param7 != 43) {
            ci var9 = (ci) null;
            cl.a(-72, 87, (byte) 30, (ci) null, -31, 97);
        }
        eg var8 = new eg(param3, param6, param1, param4, param2, param5);
        ic.field_s.a(var8, -16611);
        qc.a(param0, var8, (byte) -7);
        return var8;
    }

    private final String d(boolean param0) {
        if (param0) {
            cl.g((byte) -109);
        }
        return "</col></u>";
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param3 ^ -1)) {
                if (param3 == 99) {
                  stackIn_10_0 = this.a(param1, (byte) 92);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(48, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("cl.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, ci param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var6_int = (-param0 + param5 << 51425640) / param3.field_q;
              var7 = (param0 << -1646954200) - -(var6_int * param3.field_p);
              param4 = param4 + param3.field_v;
              param1 = param1 + param3.field_p;
              var8 = param4 * l.field_k + param1;
              var9 = 0;
              var10 = param3.field_t;
              var11 = param3.field_r;
              var12 = -var11 + l.field_k;
              var13 = 9 / ((param2 - 24) / 56);
              if (l.field_d > param4) {
                var15 = l.field_d + -param4;
                var9 = var9 + var15 * var11;
                var8 = var8 + l.field_k * var15;
                var10 = var10 - var15;
                param4 = l.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var14 = 0;
              if (l.field_b <= param1) {
                break L2;
              } else {
                var15 = -param1 + l.field_b;
                var9 = var9 + var15;
                var12 = var12 + var15;
                param1 = l.field_b;
                var7 = var7 + var15 * var6_int;
                var8 = var8 + var15;
                var11 = var11 - var15;
                var14 = var14 + var15;
                break L2;
              }
            }
            L3: {
              if (param4 + var10 > l.field_c) {
                var10 = var10 - (-l.field_c + (param4 + var10));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (l.field_f >= var11 + param1) {
                break L4;
              } else {
                var15 = -l.field_f + param1 + var11;
                var11 = var11 - var15;
                var12 = var12 + var15;
                var14 = var14 + var15;
                break L4;
              }
            }
            L5: {
              if (0 >= var11) {
                break L5;
              } else {
                if ((var10 ^ -1) < -1) {
                  param4 = -var10;
                  L6: while (true) {
                    if (param4 >= 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var15 = var7;
                      param1 = -var11;
                      L7: while (true) {
                        if (-1 >= (param1 ^ -1)) {
                          var9 = var9 + var14;
                          var8 = var8 + var12;
                          param4++;
                          continue L6;
                        } else {
                          L8: {
                            var16 = var15 >> -1399656376;
                            var15 = var15 + var6_int;
                            var17 = -var16 + 256;
                            if ((var16 ^ -1) <= -1) {
                              L9: {
                                incrementValue$0 = var9;
                                var9++;
                                var18 = param3.field_z[incrementValue$0];
                                if (-1 == (var18 ^ -1)) {
                                  break L9;
                                } else {
                                  if (-256 > (var16 ^ -1)) {
                                    l.field_i[var8] = var18;
                                    break L9;
                                  } else {
                                    var19 = l.field_i[var8];
                                    var20 = 16711935 & (var19 & 16711935) * var17 + (var18 & 16711935) * var16 >> -505920216;
                                    l.field_i[var8] = var20 - -dg.a(dg.a(65280, var19) * var17 - -(dg.a(65280, var18) * var16) >> 388622664, 65280);
                                    break L9;
                                  }
                                }
                              }
                              var8++;
                              break L8;
                            } else {
                              var9++;
                              var8++;
                              break L8;
                            }
                          }
                          param1++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6);

            stackIn_31_1 = new StringBuilder().append("cl.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        try {
            if (this.field_G == param0) {
                jh.c((byte) 114);
                this.field_H.h((byte) -126);
            }
            int var6_int = 15 / ((param4 - -5) / 57);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "cl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_I = "Error connecting to server. Please try using a different server.";
    }
}
