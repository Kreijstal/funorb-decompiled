/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kea extends td {
    static be[] field_r;
    static byte[] field_q;
    static int[] field_s;
    static String field_p;

    final static fea a(byte param0, byte[] param1) {
        fea var2 = null;
        RuntimeException var2_ref = null;
        fea stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new fea(param1, fl.field_j, fd.field_D, lq.field_A, eha.field_s, baa.field_P);
                al.b(-18073);
                if (param0 == -3) {
                  break L1;
                } else {
                  kea.b(5);
                  break L1;
                }
              }
              stackIn_6_0 = (fea) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("kea.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, vr param1) {
        sna var5 = null;
        sna var6 = null;
        sna var3 = null;
        try {
            ln.field_x = hca.a("basic", param1, param0 + 12213, "display_name_changed");
            rba.field_a = new ok(0L, ob.field_g, baa.field_A, cd.field_p);
            nr.field_w = new ok(0L, ob.field_g, lma.field_z, mna.field_r);
            ov.field_d = new sna(0L, (sna) null);
            kg.field_d = new sna(0L, qs.field_m);
            kg.field_d.field_N = 1;
            eda.field_k = new sna(0L, iia.field_m, bs.field_j);
            vl.field_d = new sna(0L, vda.field_a, te.field_f);
            if (param0 != -12238) {
                field_s = (int[]) null;
            }
            fa.field_k = new sna(0L, dla.field_k);
            ov.field_d.a(param0 ^ 12237, kg.field_d);
            ov.field_d.a(-1, eda.field_k);
            ov.field_d.a(-1, vl.field_d);
            ov.field_d.a(param0 ^ 12237, rba.field_a);
            ov.field_d.a(-1, fa.field_k);
            rba.field_a.field_xb.field_wb.a(qs.field_m, 80);
            rba.field_a.field_xb.field_wb.field_Y = 1;
            var5 = rba.field_a.field_xb.field_wb;
            var6 = var5;
            var6.field_N = 1;
            nr.field_w.field_xb.field_wb.a(qs.field_m, 88);
            var3 = nr.field_w.field_xb.field_wb;
            nr.field_w.field_xb.field_wb.field_Y = 1;
            var3.field_N = 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "kea.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kea(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_n = param3;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "kea.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        int fieldTemp$0 = 0;
        int incrementValue$1 = 0;
        tla stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        tla var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        aj[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        aj var14_ref_aj = null;
        int var14 = 0;
        wia var15 = null;
        int var15_int = 0;
        aga var16 = null;
        iv var17 = null;
        bm var17_ref = null;
        int var18 = 0;
        aga var19 = null;
        int[][] var23 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var19 = this.field_h.a(41, param0);
              var4 = new tla(this.field_g, new nq(var19));
              var4.field_v = this.field_k;
              var4.field_r = this.field_n;
              var23 = var4.d(false);
              var6 = 17;
              var7 = 17;
              var8 = -1 + var6 >> -1129643327;
              var9 = var7 - 1 >> -1108986527;
              var10 = 0;
              var11_int = 0;
              if (param1 == 3) {
                break L1;
              } else {
                field_s = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var6 <= var11_int) {
                var11 = new aj[var10];
                var10 = 0;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= var6) {
                    var12 = 0;
                    L4: while (true) {
                      L5: {
                        if (var12 >= var10 - 1) {
                          break L5;
                        } else {
                          if (6 <= var12) {
                            break L5;
                          } else {
                            L6: {
                              var13 = kla.a(-var12 + var10, param0.field_w, -2147483648) + var12;
                              if (var13 != var12) {
                                var14_ref_aj = var11[var12];
                                var11[var12] = var11[var13];
                                var11[var13] = var14_ref_aj;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var12++;
                            continue L4;
                          }
                        }
                      }
                      var12 = 0;
                      L7: while (true) {
                        L8: {
                          if (var12 >= var10) {
                            break L8;
                          } else {
                            if (var12 >= 6) {
                              break L8;
                            } else {
                              L9: {
                                var13 = var11[var12].field_c;
                                var14 = var11[var12].field_a;
                                var15 = param0.field_a[var13][var14];
                                var16 = var15.field_l;
                                if (var16 != null) {
                                  var17 = new iv(new nq(var16), false, 1, 50, 0);
                                  var4.field_o.a(var17, true);
                                  break L9;
                                } else {
                                  var17_ref = new bm(21, var13, var14);
                                  var4.field_o.a(var17_ref, true);
                                  break L9;
                                }
                              }
                              fieldTemp$0 = var4.field_u;
                              var4.field_u = var4.field_u + 1;
                              var4.field_t[fieldTemp$0] = var11[var12];
                              var12++;
                              continue L7;
                            }
                          }
                        }
                        stackIn_37_0 = (tla) (var4);
                        break L0;
                      }
                    }
                  } else {
                    var13 = 0;
                    L10: while (true) {
                      if (var13 >= var7) {
                        var12++;
                        continue L3;
                      } else {
                        L11: {
                          if (var23[var12][var13] != 1) {
                            break L11;
                          } else {
                            var14 = this.field_k - (var8 + -var12);
                            var15_int = this.field_n + -var9 - -var13;
                            if (!param0.a(var14, var15_int, (byte) -127)) {
                              break L11;
                            } else {
                              incrementValue$1 = var10;
                              var10++;
                              var11[incrementValue$1] = new aj(var14, var15_int);
                              break L11;
                            }
                          }
                        }
                        var13++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L12: while (true) {
                  if (var12 >= var7) {
                    var11_int++;
                    continue L2;
                  } else {
                    L13: {
                      if (var23[var11_int][var12] == 1) {
                        var10++;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var12++;
                    continue L12;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("kea.A(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L14;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L14;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_37_0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (dg.field_f <= param5) {
                break L1;
              } else {
                param0 = param0 - (dg.field_f - param5);
                param5 = dg.field_f;
                break L1;
              }
            }
            L2: {
              if (param4 < dg.field_j) {
                param1 = param1 - (dg.field_j - param4);
                param4 = dg.field_j;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 + param5 <= dg.field_h) {
                break L3;
              } else {
                param0 = dg.field_h - param5;
                break L3;
              }
            }
            L4: {
              if (param4 + param1 <= dg.field_k) {
                break L4;
              } else {
                param1 = dg.field_k - param4;
                break L4;
              }
            }
            L5: {
              if ((param0 ^ -1) >= -1) {
                break L5;
              } else {
                if (-1 > (param1 ^ -1)) {
                  var6_int = param5 - -(dg.field_i * param4);
                  if (param2 == 16711680) {
                    var7 = dg.field_i + -param0;
                    param4 = -param1;
                    L6: while (true) {
                      if (param4 >= 0) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param5 = -param0;
                        L7: while (true) {
                          if (0 <= param5) {
                            var6_int = var6_int + var7;
                            param4++;
                            continue L6;
                          } else {
                            var8 = dg.field_e[var6_int];
                            if ((param3 ^ -1) > (255 & var8 >> 661686440 ^ -1)) {
                              L8: {
                                if ((var8 & 16711680) >> -868367696 <= (var8 & 65280) >> 1034858792) {
                                  L9: {
                                    var9 = ((var8 & 16711680) >> 2009777583) + -60;
                                    if ((var9 ^ -1) < -256) {
                                      var9 = 255;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var10 = var8 & 65280;
                                  var10 = (var10 >> -1832179007) - (var10 >> 1769148997) & 65280;
                                  var11 = 31 & var8 >> 893005347;
                                  dg.field_e[var6_int] = mp.a(var11, mp.a(var10, var9 << -2067141424));
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var6_int++;
                              param5++;
                              continue L7;
                            } else {
                              var6_int++;
                              param5++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
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
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "kea.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    public static void b(int param0) {
        field_r = null;
        field_p = null;
        field_q = null;
        if (param0 != -26857) {
            return;
        }
        field_s = null;
    }

    static {
        field_r = new be[1];
        field_s = new int[8192];
        field_p = "Waiting for extra data";
    }
}
