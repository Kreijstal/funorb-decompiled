/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh {
    static dl field_c;
    static int[][] field_f;
    static String field_a;
    static ob field_e;
    static int field_d;
    static km field_g;
    static km field_b;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0) {
        pe var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ae.field_g.c();
              ac.field_c.c();
              ql.field_t = ql.field_t - 1;
              if (ql.field_t == 0) {
                ql.field_t = 200;
                var1 = (pe) (Object) co.field_a.a((byte) -112);
                L2: while (true) {
                  if (var1 == null) {
                    if (gk.field_f == null) {
                      break L1;
                    } else {
                      var1 = (pe) (Object) gk.field_f.a((byte) -112);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (var1.field_h.b(false)) {
                              break L4;
                            } else {
                              var1.a(false);
                              break L4;
                            }
                          }
                          var1 = (pe) (Object) gk.field_f.a(16213);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var1.field_h.b(false)) {
                        break L5;
                      } else {
                        var1.a(false);
                        break L5;
                      }
                    }
                    var1 = (pe) (Object) co.field_a.a(16213);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (vg.field_B == null) {
                break L6;
              } else {
                if (vg.field_B.d(120)) {
                  break L6;
                } else {
                  qi.field_b = null;
                  break L6;
                }
              }
            }
            L7: {
              if (!param0) {
                break L7;
              } else {
                field_f = null;
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1_ref, "kh.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ji.field_e != null) {
                    ji.field_e.b(120);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null == bc.field_a) {
                    break L2;
                  } else {
                    bc.field_a.b((byte) -56);
                    break L2;
                  }
                }
                L3: {
                  if (dj.field_l == null) {
                    break L3;
                  } else {
                    {
                      L4: {
                        dj.field_l.b((byte) 14);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (null != ij.field_n) {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= ij.field_n.length) {
                        break L6;
                      } else {
                        L8: {
                          if (ij.field_n[var1_int] != null) {
                            {
                              L9: {
                                ij.field_n[var1_int].b((byte) 14);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw kg.a((Throwable) (Object) var1, "kh.E(" + 0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(km param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dj var9 = null;
        String var10 = null;
        mg var11 = null;
        dj var12 = null;
        String var13 = null;
        mg var14 = null;
        dj var15 = null;
        String var16 = null;
        mg var17 = null;
        dj var18 = null;
        String var19 = null;
        mg var20 = null;
        dj var21 = null;
        String var22 = null;
        mg var23 = null;
        dj var24 = null;
        String var25 = null;
        mg var26 = null;
        dj var27 = null;
        String var28 = null;
        mg var29 = null;
        dj var30 = null;
        String var31 = null;
        mg var32 = null;
        dj var33 = null;
        String var34 = null;
        mg var35 = null;
        dj var36 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              ai.a(param1, (um) null, (int[]) null, (String) null, 0L, (String) null, -1, param0, 60);
              if (param1 == 0) {
                var9 = md.field_e;
                var11 = j.field_k[0];
                var29 = var11;
                var29 = var11;
                var10 = vb.field_d;
                var9.field_a.a(var10, (byte) 89, 11, var11);
                var12 = md.field_e;
                var14 = j.field_k[1];
                var29 = var14;
                var29 = var14;
                var13 = ql.field_p;
                var12.field_a.a(var13, (byte) 89, 12, var14);
                var15 = md.field_e;
                var17 = j.field_k[2];
                var29 = var17;
                var29 = var17;
                var16 = f.field_h;
                var15.field_a.a(var16, (byte) 89, 13, var17);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (1 != param1) {
                break L2;
              } else {
                var18 = md.field_e;
                var20 = j.field_k[0];
                var29 = var20;
                var29 = var20;
                var19 = pc.field_c;
                var18.field_a.a(var19, (byte) 89, 11, var20);
                var21 = md.field_e;
                var23 = j.field_k[1];
                var29 = var23;
                var29 = var23;
                var22 = oa.field_u;
                var21.field_a.a(var22, (byte) 89, 12, var23);
                var24 = md.field_e;
                var26 = j.field_k[2];
                var29 = var26;
                var29 = var26;
                var25 = la.field_m;
                var24.field_a.a(var25, (byte) 89, 13, var26);
                break L2;
              }
            }
            L3: {
              if (param1 == 2) {
                var27 = md.field_e;
                var29 = j.field_k[0];
                var28 = bf.field_s;
                var27.field_a.a(var28, (byte) 89, 11, var29);
                var30 = md.field_e;
                var32 = j.field_k[1];
                var31 = ql.field_f;
                var30.field_a.a(var31, (byte) 89, 12, var32);
                var33 = md.field_e;
                var35 = j.field_k[2];
                var34 = mi.field_a;
                var33.field_a.a(var34, (byte) 89, 13, var35);
                break L3;
              } else {
                break L3;
              }
            }
            var36 = md.field_e;
            var4 = param0.field_Bb;
            var5 = param0.field_J;
            var6 = param0.field_K;
            var7 = param0.field_ub;
            var36.field_a.a(var7, 0, var6, var4, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kh.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + 20435 + ')');
        }
    }

    final static mg[] a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        mg[] var10 = null;
        mg[] var11_ref_mg__ = null;
        int var11 = 0;
        int var12 = 0;
        mg var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Virogrid.field_F ? 1 : 0;
        var9 = 3;
        var10 = new mg[]{new mg(var9, var9), new mg(3, var9), new mg(var9, var9), new mg(var9, 3), new mg(64, 64), new mg(var9, 3), new mg(var9, var9), new mg(3, var9), new mg(var9, var9)};
        var11_ref_mg__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_mg__.length) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 < 1) {
                                var10[1].field_B[var11 + (-1 + var9 - var12) * 3] = 65793;
                                var10[3].field_B[-var12 - (1 + -var9) + var11 * var9] = 65793;
                                var10[7].field_B[var11 + var12 * 3] = 65793;
                                var10[5].field_B[var12 + var9 * var11] = 65793;
                                var12++;
                                continue L5;
                              } else {
                                var11++;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 < 1) {
                            var10[7].field_B[(-var12 + (var9 - 1)) * 3 - -var11] = 0;
                            var10[5].field_B[var11 * var9 + (-var12 + -1) + var9] = 0;
                            var10[1].field_B[3 * var12 - -var11] = 0;
                            var10[3].field_B[var11 * var9 - -var12] = 0;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_B[var12 + var9 * var11] = 0;
                        var10[0].field_B[var12 * var9 - -var11] = 0;
                        if (var9 - var11 > var12) {
                          var10[2].field_B[var12 - -(var11 * var9)] = 0;
                          var10[6].field_B[var9 * var12 - -var11] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[var12 + (-var11 + (var9 - 1)) * var9] = 0;
                    var10[8].field_B[var12 + (var9 + (-var11 + -1)) * var9] = 0;
                    var10[2].field_B[var9 * var12 + (-var11 + -1 + var9)] = 0;
                    var10[8].field_B[var9 - (1 - -var11 - var9 * var12)] = 0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_mg__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_B.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, e param4, byte param5, mg[] param6, int param7, int param8, int param9, int param10, mg[] param11, int param12, e param13, boolean param14) {
        try {
            Object var16 = null;
            ok.a(param0, 480, jl.field_E, -100, param3, param9, en.field_Kb, param2, param10, param13, param1, (mg[]) null, 0, param8, param7, ti.field_b, param11, param4, param6, param12, 0);
            int var15_int = 0;
            ti.a(param14, -1502464351);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "kh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + -59 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + (param13 != null ? "{...}" : "null") + ',' + param14 + ')');
        }
    }

    final static gh a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        gh var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        gh stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_15_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (ie.field_a != null) {
            L0: {
              var2_int = 0 % ((param0 - -51) / 62);
              var7 = (CharSequence) (Object) param1;
              var3 = c.a(var7, true);
              if (var3 == null) {
                var3 = param1;
                break L0;
              } else {
                break L0;
              }
            }
            var4 = (gh) (Object) ie.field_a.a((long)var3.hashCode(), (byte) 96);
            L1: while (true) {
              if (var4 != null) {
                L2: {
                  var8 = (CharSequence) (Object) var4.field_Hb;
                  var5 = c.a(var8, true);
                  if (var5 == null) {
                    var5 = var4.field_Hb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var5.equals((Object) (Object) var3)) {
                  stackOut_15_0 = (gh) var4;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  var4 = (gh) (Object) ie.field_a.c(48);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dl();
        field_a = "Add name";
        field_e = new ob();
    }
}
