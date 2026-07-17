/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk implements Iterable {
    static dd[] field_b;
    ma[] field_k;
    static boolean field_c;
    int field_h;
    static nm field_d;
    private static int field_f;
    static dd field_g;
    static int field_a;
    static int field_l;
    static int field_m;
    static dd[] field_i;
    private ma field_e;
    static int field_j;

    final static void a(int[] param0, int param1, eg param2) {
        try {
            RuntimeException var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            RuntimeException decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            var7 = Pool.field_O;
            try {
              L0: {
                d.a(param2, -23109);
                var4 = param2.field_D + param2.field_w >> 1;
                var5 = param2.field_y + param2.field_S >> 1;
                var6 = param2.field_V + param2.field_x >> 1;
                var3_int = 0;
                L1: while (true) {
                  if (param2.field_g.length <= var3_int) {
                    var3_int = 0;
                    L2: while (true) {
                      if (var3_int >= param2.field_Y.length) {
                        var3_int = 0;
                        L3: while (true) {
                          if (var3_int >= param2.field_q.length) {
                            L4: {
                              if (param1 < -121) {
                                break L4;
                              } else {
                                field_i = null;
                                break L4;
                              }
                            }
                            L5: {
                              L6: {
                                if (param0.length != 12) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (65536 != param0[3]) {
                                      break L7;
                                    } else {
                                      if (param0[4] != -1) {
                                        break L7;
                                      } else {
                                        if (0 != param0[5]) {
                                          break L7;
                                        } else {
                                          if (0 != param0[6]) {
                                            break L7;
                                          } else {
                                            if (-65537 != param0[7]) {
                                              break L7;
                                            } else {
                                              if (param0[8] != 0) {
                                                break L7;
                                              } else {
                                                if (param0[9] != 0) {
                                                  break L7;
                                                } else {
                                                  if (param0[10] != 0) {
                                                    break L7;
                                                  } else {
                                                    if (param0[11] != 65536) {
                                                      break L7;
                                                    } else {
                                                      break L6;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  System.out.println("Recentring with transformation");
                                  new Throwable().printStackTrace();
                                  param0[1] = param0[1] + (var4 * param0[6] + (var5 * param0[7] - -(param0[8] * var6)) >> 16);
                                  param0[2] = param0[2] + (param0[11] * var6 + param0[9] * var4 - -(var5 * param0[10]) >> 16);
                                  param0[0] = param0[0] + (param0[4] * var5 + var4 * param0[3] - -(var6 * param0[5]) >> 16);
                                  break L5;
                                }
                              }
                              param0[1] = param0[1] + var5;
                              param0[2] = param0[2] + var6;
                              param0[0] = param0[0] + var4;
                              break L5;
                            }
                            param2.a();
                            break L0;
                          } else {
                            param2.field_q[var3_int] = param2.field_q[var3_int] - var6;
                            var3_int++;
                            continue L3;
                          }
                        }
                      } else {
                        param2.field_Y[var3_int] = param2.field_Y[var3_int] - var5;
                        var3_int++;
                        continue L2;
                      }
                    }
                  } else {
                    param2.field_g[var3_int] = param2.field_g[var3_int] - var4;
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = decompiledCaughtException;
                stackOut_27_0 = (RuntimeException) var3;
                stackOut_27_1 = new StringBuilder().append("uk.F(");
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param0 == null) {
                  stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                  stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L8;
                } else {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L8;
                }
              }
              L9: {
                stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44).append(param1).append(44);
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (param2 == null) {
                  stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                  stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                  stackOut_32_2 = "null";
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  break L9;
                } else {
                  stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                  stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                  stackOut_31_2 = "{...}";
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  break L9;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, dd[] param11, int param12, lr param13, int param14, int param15, int param16, int param17, dd[] param18, dd[] param19, lr param20) {
        RuntimeException var21 = null;
        Object var22 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param12 == -23994) {
                break L1;
              } else {
                var22 = null;
                uk.a(-48, (java.applet.Applet) null);
                break L1;
              }
            }
            wk.a(param9, param5, param13, param8, param20, param4, param15, new nm(param11), param3, param17, new nm(param19), param10, param0, param2, param1, param7, 255, param6, new nm(param18), param16, param14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var21;
            stackOut_4_1 = new StringBuilder().append("uk.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param11 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param12).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param13 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param14).append(44).append(param15).append(44).append(param16).append(44).append(param17).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param18 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param19 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param20 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final void a(ma param0, boolean param1, long param2) {
        ma var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
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
        try {
          L0: {
            L1: {
              if (param0.field_k == null) {
                break L1;
              } else {
                param0.a((byte) -117);
                break L1;
              }
            }
            L2: {
              var5 = ((uk) this).field_k[(int)((long)(((uk) this).field_h + -1) & param2)];
              param0.field_d = var5;
              param0.field_k = var5.field_k;
              param0.field_k.field_d = param0;
              param0.field_c = param2;
              param0.field_d.field_k = param0;
              if (param1) {
                break L2;
              } else {
                var6 = null;
                uk.a((int[]) null, 89, (eg) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("uk.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new hb((uk) this);
    }

    final static pn a(int param0, byte param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pn var8_ref_pn = null;
        int var9 = 0;
        pn var9_ref_pn = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        var13 = Pool.field_O;
        qd.field_b.field_Rb.field_T.d((byte) 90);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = aa.field_e - 1;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (aa.field_e <= var8) {
                L2: {
                  var8 = qd.field_b.field_Rb.field_Db + qd.field_b.field_Rb.field_Cb + (-var7 - -var6);
                  qd.field_b.field_Rb.field_Db = qd.field_b.field_Rb.field_Db - var8;
                  qd.field_b.field_Rb.field_eb = qd.field_b.field_Rb.field_eb + var8;
                  if (lf.field_c) {
                    qd.field_b.field_Rb.field_Db = var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!lf.field_c) {
                    break L3;
                  } else {
                    lf.field_c = false;
                    qd.field_b.field_Rb.field_E = 0;
                    gd.field_b = true;
                    qd.field_b.field_Rb.field_eb = -qd.field_b.field_Rb.field_Db + qd.field_b.field_Sb.field_Db;
                    break L3;
                  }
                }
                L4: {
                  if (param1 <= -58) {
                    break L4;
                  } else {
                    field_a = 102;
                    break L4;
                  }
                }
                L5: {
                  qd.field_b.field_Rb.field_Cb = -qd.field_b.field_Rb.field_Db + var7;
                  if (!rg.field_p) {
                    break L5;
                  } else {
                    if (null != uq.field_D) {
                      gd.field_b = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var9 = -qd.field_b.field_Rb.field_Cb - (qd.field_b.field_Rb.field_Db - qd.field_b.field_Sb.field_Db);
                  if (gd.field_b) {
                    qd.field_b.field_Rb.field_E = -qd.field_b.field_Rb.field_eb + var9;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  qd.field_b.a(-1207, param0 * (2 * param2), param2, true);
                  if (qd.field_b.field_Rb.field_eb - -qd.field_b.field_Rb.field_E != var9) {
                    stackOut_42_0 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    break L7;
                  } else {
                    stackOut_41_0 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    break L7;
                  }
                }
                gd.field_b = stackIn_43_0 != 0;
                return (pn) var4;
              } else {
                var9_ref_pn = wb.field_e[var8];
                if (var9_ref_pn.field_u != null) {
                  L8: {
                    qd.field_b.field_Rb.a(-104, var9_ref_pn.field_u);
                    var9_ref_pn.field_u.b(var7, 2147483647, param3, var9_ref_pn.field_u.b(true), param2);
                    if (var9_ref_pn.field_u.field_R == 0) {
                      break L8;
                    } else {
                      var4 = (Object) (Object) var9_ref_pn;
                      break L8;
                    }
                  }
                  var7 = var7 + param2;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L9: {
              var8_ref_pn = wb.field_e[var7];
              var9 = 0;
              if (ea.field_z) {
                break L9;
              } else {
                if (var5 < ap.field_E) {
                  var10_int = f.a(5, var8_ref_pn.field_p);
                  if (var8_ref_pn.b(14842) < var10_int) {
                    break L9;
                  } else {
                    L10: {
                      if (var8_ref_pn.field_g) {
                        break L10;
                      } else {
                        if (!ia.a(var8_ref_pn.field_q, 24552)) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var9 = 1;
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
            }
            if (var9 != 0) {
              L11: {
                var5++;
                if (null == var8_ref_pn.field_u) {
                  break L11;
                } else {
                  if (lf.field_c) {
                    break L11;
                  } else {
                    var7--;
                    continue L0;
                  }
                }
              }
              L12: {
                if (null != var8_ref_pn.field_u) {
                  break L12;
                } else {
                  ib.field_r = ib.field_r + 1;
                  break L12;
                }
              }
              var10 = ge.a((byte) -24, var8_ref_pn);
              var11 = var10 + lr.a(var8_ref_pn.field_f);
              var12 = fn.a(var8_ref_pn, -55);
              var8_ref_pn.field_u = new vh(0L, kb.field_h, var11);
              var8_ref_pn.field_u.field_P = -(var12 >> 1 & 8355711) + (var12 + ((16711423 & kb.field_h.field_P) >> 1));
              var8_ref_pn.field_u.field_I = m.field_c;
              var8_ref_pn.field_u.field_N = var12;
              var8_ref_pn.field_u.field_K = var12 + -(var12 >> 1 & 8355711) + ((kb.field_h.field_K & 16711423) >> 1);
              var6 = var6 + param2;
              var7--;
              continue L0;
            } else {
              var8_ref_pn.field_u = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 >= -37) {
            field_g = null;
        }
        field_b = null;
        field_i = null;
        field_d = null;
    }

    final ma a(int param0, long param1) {
        ma var5 = null;
        int var6 = Pool.field_O;
        if (param0 != -28010) {
            return null;
        }
        ma var4 = ((uk) this).field_k[(int)(param1 & (long)(-1 + ((uk) this).field_h))];
        ((uk) this).field_e = var4.field_d;
        while (((uk) this).field_e != var4) {
            if (!(~param1 != ~((uk) this).field_e.field_c)) {
                var5 = ((uk) this).field_e;
                ((uk) this).field_e = ((uk) this).field_e.field_d;
                return var5;
            }
            ((uk) this).field_e = ((uk) this).field_e.field_d;
        }
        ((uk) this).field_e = null;
        return null;
    }

    uk(int param0) {
        int var2 = 0;
        ma var3 = null;
        ((uk) this).field_h = param0;
        ((uk) this).field_k = new ma[param0];
        for (var2 = 0; var2 < param0; var2++) {
            ma dupTemp$0 = new ma();
            var3 = dupTemp$0;
            ((uk) this).field_k[var2] = dupTemp$0;
            var3.field_k = var3;
            var3.field_d = var3;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = p.a((byte) -100, var4, param1).getFile();
                      Object discarded$6 = mo.a("updatelinks", new Object[2], 98, param1);
                      Object discarded$7 = mo.a("updatelinks", new Object[2], 70, param1);
                      Object discarded$8 = mo.a("updatelinks", new Object[2], 116, param1);
                      Object discarded$9 = mo.a("updatelinks", new Object[2], param0 ^ 558370174, param1);
                      Object discarded$10 = mo.a("updatelinks", new Object[2], param0 ^ 558370117, param1);
                      if (param0 == 558370049) {
                        break L2;
                      } else {
                        field_b = null;
                        break L2;
                      }
                    }
                    Object discarded$11 = mo.a("updatelinks", new Object[2], 125, param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("uk.G(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_m = 0;
        field_a = 1 << field_f;
        field_j = -1;
        field_c = false;
    }
}
