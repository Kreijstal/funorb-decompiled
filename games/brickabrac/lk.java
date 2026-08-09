/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends qd {
    static th field_o;
    static jp field_t;
    private ie field_r;
    vl field_v;
    static int field_p;
    static boolean field_s;
    static jp[] field_n;
    static int[] field_u;
    static String field_q;
    ra field_m;

    final void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (ka) ((Object) this.field_v.d(-123));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_r.a(var6, -128)) {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_z >= var5) {
                        this.a(var5, var5 + var4_int, param0, var4_int, -1048576, var6);
                        var6.field_z = var6.field_z - var5;
                        break L2;
                      } else {
                        this.a(var6.field_z, var4_int + var5, param0, var4_int, -1048576, var6);
                        var5 = var5 - var6.field_z;
                        var4_int = var4_int + var6.field_z;
                        if (!this.field_r.a(23300, param0, var5, var6, var4_int)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (ka) ((Object) this.field_v.a((byte) 116));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("lk.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        ka var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = BrickABrac.field_J ? 1 : 0;
        this.field_m.a(param0);
        var3 = (ka) ((Object) this.field_v.d(-18));
        L0: while (true) {
          if (var3 != null) {
            stackIn_4_0 = this.field_r.a(var3, -112);
            L1: {
              if (stackIn_4_0) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_z >= var2) {
                    this.a((byte) -109, var2, var3);
                    var3.field_z = var3.field_z - var2;
                    break L1;
                  } else {
                    this.a((byte) -128, var3.field_z, var3);
                    var2 = var2 - var3.field_z;
                    if (this.field_r.a(23300, (int[]) null, var2, var3, 0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (ka) ((Object) this.field_v.a((byte) 116));
            continue L0;
          } else {
            return;
          }
        }
    }

    final int b() {
        return 0;
    }

    final qd a() {
        ka var1 = (ka) ((Object) this.field_v.d(-81));
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_y == null)) {
            return (qd) ((Object) var1.field_y);
        }
        return this.d();
    }

    private final void a(int param0, int param1, int[] param2, int param3, int param4, ka param5) {
        ie stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ka stackIn_15_2 = null;
        ie stackIn_16_0;
        int stackIn_16_1;
        ka stackIn_16_2;
        int stackIn_16_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kl var11 = null;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param4 == -1048576) {
              L1: {
                if ((4 & this.field_r.field_n[param5.field_u]) == 0) {
                  break L1;
                } else {
                  if (0 > param5.field_x) {
                    var7_int = this.field_r.field_U[param5.field_u] / tj.field_q;
                    L2: while (true) {
                      var8 = (1048575 - (-var7_int + param5.field_j)) / var7_int;
                      if (var8 <= param0) {
                        L3: {
                          param5.field_y.b(param2, param3, var8);
                          param0 = param0 - var8;
                          param5.field_j = param5.field_j + (var7_int * var8 + -1048576);
                          param3 = param3 + var8;
                          var9 = tj.field_q / 100;
                          var10 = 262144 / var7_int;
                          if (var10 < var9) {
                            var9 = var10;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          var11 = param5.field_y;
                          if (-1 == (this.field_r.field_y[param5.field_u] ^ -1)) {
                            param5.field_y = kl.a(param5.field_F, var11.e(), var11.g(), var11.f());
                            break L4;
                          } else {
                            L5: {
                              param5.field_y = kl.a(param5.field_F, var11.e(), 0, var11.f());
                              stackIn_15_0 = this.field_r;

                              stackIn_15_1 = 0;

                              stackIn_15_2 = (ka) (param5);

                              if (param5.field_k.field_j[param5.field_B] >= 0) {
                                stackIn_16_0 = (ie) ((Object) stackIn_15_0);
                                stackIn_16_1 = stackIn_15_1;
                                stackIn_16_2 = (ka) ((Object) stackIn_15_2);
                                stackIn_16_3 = 0;
                                break L5;
                              } else {
                                stackIn_16_0 = (ie) ((Object) stackIn_15_0);
                                stackIn_16_1 = stackIn_15_1;
                                stackIn_16_2 = (ka) ((Object) stackIn_15_2);
                                stackIn_16_3 = 1;
                                break L5;
                              }
                            }
                            ((ie) (Object) stackIn_16_0).a(stackIn_16_1 != 0, stackIn_16_2, stackIn_16_3 != 0);
                            param5.field_y.a(var9, var11.g());
                            break L4;
                          }
                        }
                        L6: {
                          if ((param5.field_k.field_j[param5.field_B] ^ -1) <= -1) {
                            break L6;
                          } else {
                            param5.field_y.f(-1);
                            break L6;
                          }
                        }
                        var11.g(var9);
                        var11.b(param2, param3, -param3 + param1);
                        if (var11.k()) {
                          this.field_m.b(var11);
                          continue L2;
                        } else {
                          continue L2;
                        }
                      } else {
                        param5.field_j = param5.field_j + param0 * var7_int;
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              param5.field_y.b(param2, param3, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("lk.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, ka param2) {
        ie stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ka stackIn_9_2 = null;
        ie stackIn_10_0;
        int stackIn_10_1;
        ka stackIn_10_2;
        int stackIn_10_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -97) {
                break L1;
              } else {
                this.field_v = (vl) null;
                break L1;
              }
            }
            L2: {
              if ((this.field_r.field_n[param2.field_u] & 4) == 0) {
                break L2;
              } else {
                if (-1 >= (param2.field_x ^ -1)) {
                  break L2;
                } else {
                  var4_int = this.field_r.field_U[param2.field_u] / tj.field_q;
                  var5 = (-param2.field_j + var4_int + 1048575) / var4_int;
                  param2.field_j = 1048575 & var4_int * param1 + param2.field_j;
                  if (param1 >= var5) {
                    L3: {
                      if (0 == this.field_r.field_y[param2.field_u]) {
                        param2.field_y = kl.a(param2.field_F, param2.field_y.e(), param2.field_y.g(), param2.field_y.f());
                        break L3;
                      } else {
                        L4: {
                          param2.field_y = kl.a(param2.field_F, param2.field_y.e(), 0, param2.field_y.f());
                          stackIn_9_0 = this.field_r;

                          stackIn_9_1 = 0;

                          stackIn_9_2 = (ka) (param2);

                          if (-1 >= (param2.field_k.field_j[param2.field_B] ^ -1)) {
                            stackIn_10_0 = (ie) ((Object) stackIn_9_0);
                            stackIn_10_1 = stackIn_9_1;
                            stackIn_10_2 = (ka) ((Object) stackIn_9_2);
                            stackIn_10_3 = 0;
                            break L4;
                          } else {
                            stackIn_10_0 = (ie) ((Object) stackIn_9_0);
                            stackIn_10_1 = stackIn_9_1;
                            stackIn_10_2 = (ka) ((Object) stackIn_9_2);
                            stackIn_10_3 = 1;
                            break L4;
                          }
                        }
                        ((ie) (Object) stackIn_10_0).a(stackIn_10_1 != 0, stackIn_10_2, stackIn_10_3 != 0);
                        break L3;
                      }
                    }
                    L5: {
                      if (param2.field_k.field_j[param2.field_B] >= 0) {
                        break L5;
                      } else {
                        param2.field_y.f(-1);
                        break L5;
                      }
                    }
                    param1 = param2.field_j / var4_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            param2.field_y.a(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("lk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final qd d() {
        ka var1_ref = null;
        do {
            var1_ref = (ka) ((Object) this.field_v.a((byte) 116));
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_y);
        return (qd) ((Object) var1_ref.field_y);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var12 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (16745759 & param1) >> -1090375312;
        int var5 = (param1 & 65300) >> -2138173880;
        int var6 = 255 & param1;
        int var7 = (param2 & 16728276) >> 356181904;
        int var8 = (65533 & param2) >> -633671544;
        int var9 = 255 & param2;
        int var11 = 60 / ((param0 - -44) / 54);
        for (var10 = 0; 256 > var10; var10++) {
            var12 = 256 + -var10;
            var14[var10] = (var6 * var10 >> 1946782312) + (var9 * var12 >> 474903144) + (((var5 * var10 >> 285234568) - -(var8 * var12 >> 1075781768) << -1022285976) + ((var7 * var12 >> 933825160) + (var10 * var4 >> -844674712) << 1505390288));
        }
        return var3;
    }

    public static void c(int param0) {
        field_u = null;
        field_q = null;
        field_o = null;
        field_n = null;
        if (param0 != 2143) {
          lk.c(-30);
          field_t = null;
          return;
        } else {
          field_t = null;
          return;
        }
    }

    lk(ie param0) {
        this.field_v = new vl();
        this.field_m = new ra();
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new th(15, 0, 1, 0);
        field_q = "ON";
    }
}
