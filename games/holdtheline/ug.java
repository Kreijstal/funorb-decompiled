/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug implements dh {
    private int field_l;
    static bm[] field_d;
    private qi field_c;
    private int field_k;
    private int field_e;
    private int field_h;
    static ah field_g;
    private int field_j;
    private int field_a;
    static String field_i;
    static String field_f;
    static String field_m;
    static uf field_b;

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ok.field_f = param0;
              if (param1 == 0) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ug.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_g = null;
        field_b = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_d = null;
    }

    final static void b(int param0) {
        kf.field_F = kf.field_F - 1;
        tc.a(tn.field_h[kf.field_F], gd.field_c[kf.field_F], bd.field_V[kf.field_F]);
        tc.field_d = ce.field_q[kf.field_F];
        tc.field_e = dm.field_b[kf.field_F];
        tc.field_a = m.field_c[kf.field_F];
        tc.field_i = mk.field_n[kf.field_F];
        if (param0 != -1) {
            field_g = (ah) null;
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        th var16 = null;
        th var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var16 = new th(param1);
              var17 = var16;
              var17.field_l = -2 + param1.length;
              vn.field_d = var17.k(72);
              qe.field_f = new boolean[vn.field_d];
              nk.field_K = new int[vn.field_d];
              if (param0 == -97) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            wc.field_i = new byte[vn.field_d][];
            la.field_j = new int[vn.field_d];
            lk.field_e = new byte[vn.field_d][];
            wb.field_g = new int[vn.field_d];
            ad.field_d = new int[vn.field_d];
            var17.field_l = -7 + param1.length + -(8 * vn.field_d);
            bo.field_b = var17.k(-85);
            ih.field_o = var17.k(59);
            var3 = 1 + (var17.f((byte) -64) & 255);
            var4 = 0;
            L2: while (true) {
              if (var4 >= vn.field_d) {
                var4 = 0;
                L3: while (true) {
                  if (vn.field_d <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= vn.field_d) {
                        var4 = 0;
                        L5: while (true) {
                          if (vn.field_d <= var4) {
                            var17.field_l = -((-1 + var3) * 3) + -(vn.field_d * 8) + (param1.length - 7);
                            dd.field_E = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var17.field_l = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= vn.field_d) {
                                    break L0;
                                  } else {
                                    var5 = nk.field_K[var4];
                                    var6 = ad.field_d[var4];
                                    var7 = var5 * var6;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    lk.field_e[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    wc.field_i[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.f((byte) -59);
                                    stackIn_24_0 = 0;
                                    stackIn_24_1 = 1 & var11;
                                    L8: {
                                      if (stackIn_24_0 == stackIn_24_1) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var7 <= var12) {
                                            if (0 == (var11 & 2)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    dupTemp$0 = var17.f(0);
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_50_0 = var10;

                                                    if (-1 == var13) {
                                                      stackIn_51_0 = stackIn_50_0;
                                                      stackIn_51_1 = 0;
                                                      break L11;
                                                    } else {
                                                      stackIn_51_0 = stackIn_50_0;
                                                      stackIn_51_1 = 1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_51_0 | stackIn_51_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.f(0);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var12 >= var5) {
                                            if (-1 != (var11 & 2 ^ -1)) {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        dupTemp$1 = var17.f(0);
                                                        var9[var13 * var5 + var12] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_39_0 = var10;

                                                        if (var14 == -1) {
                                                          stackIn_40_0 = stackIn_39_0;
                                                          stackIn_40_1 = 0;
                                                          break L15;
                                                        } else {
                                                          stackIn_40_0 = stackIn_39_0;
                                                          stackIn_40_1 = 1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_40_0 | stackIn_40_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var12 - -(var5 * var13)] = var17.f(0);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    qe.field_f[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  dd.field_E[var4] = var17.c(false);
                                  if (dd.field_E[var4] != 0) {
                                    break L17;
                                  } else {
                                    dd.field_E[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            ad.field_d[var4] = var17.k(101);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        nk.field_K[var4] = var17.k(79);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    wb.field_g[var4] = var17.k(-56);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                la.field_j[var4] = var16.k(123);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var2);

            stackIn_56_1 = new StringBuilder().append("ug.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L18;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L18;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        n stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        km var12 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof km)) {
                stackIn_4_0 = null;
                break L1;
              } else {
                stackIn_4_0 = (n) (param3);
                break L1;
              }
            }
            L2: {
              var12 = (km) ((Object) stackIn_4_0);
              tc.f(param1 - -param3.field_k, param4 + param3.field_o, param3.field_x, param3.field_u, this.field_h);
              if (var12 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = param3.field_x - var12.field_I * 2;
            if (param2 <= -48) {
              var8 = param3.field_k + param1 - -var12.field_I;
              var9 = var12.field_H + (param4 + param3.field_o);
              tc.d(var8, var9, var7 + var8, var9, this.field_j);
              var10 = var12.a((byte) 104) - 1;
              L3: while (true) {
                if (var10 < 0) {
                  L4: {
                    if (this.field_c != null) {
                      this.field_c.b(var12.field_q, var7 / 2 + var8, var12.field_H + (var9 + this.field_c.field_F), this.field_k, this.field_a);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  tc.d(var8 - -(var7 * var12.a(false, var10) / var12.a(0)), var9, this.field_e, this.field_l);
                  var10--;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("ug.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(da param0, int param1, int param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = jn.a(14, (byte) -96, param0);
                var5 = jn.a(13, (byte) -96, param0);
                var6 = param0.h(2, 7);
                var7 = hk.field_c[param2][param1];
                var8 = on.field_v[param2][param1];
                if ((var7 ^ -1) == 0) {
                  break L2;
                } else {
                  L3: {
                    if (var4_int > var7) {
                      break L3;
                    } else {
                      if (-1 != var4_int) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ad.field_a = true;
                  break L1;
                }
              }
              hk.field_c[param2][param1] = var4_int;
              ha.field_j[param2][param1] = var6;
              break L1;
            }
            L4: {
              L5: {
                if ((var8 ^ -1) == 0) {
                  break L5;
                } else {
                  L6: {
                    if (var8 < var5) {
                      break L6;
                    } else {
                      if (var5 == -1) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ad.field_a = true;
                  break L4;
                }
              }
              on.field_v[param2][param1] = var5;
              break L4;
            }
            var9 = 92 / ((33 - param3) / 57);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ug.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ug(qi param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_a = param2;
            this.field_h = param4;
            this.field_c = param0;
            this.field_e = param5;
            this.field_l = param6;
            this.field_j = param3;
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_i = "Game Achievements";
        field_g = new ah();
        field_m = "<col=2>This is a members-only setting. If you are a member, log in to select.";
        field_f = "Loading...";
    }
}
