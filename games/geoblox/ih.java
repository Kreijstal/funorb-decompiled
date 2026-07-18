/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static df field_a;
    static h field_c;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = Geoblox.field_C;
        try {
            eg.field_p.a(111);
            var1_int = 10 / ((param0 - 68) / 57);
            for (var2 = 0; var2 < 32; var2++) {
                pb.field_p[var2] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                tl.field_l[var1_int] = 0L;
            }
            nf.field_w = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ih.C(" + param0 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (!ji.field_r.c(13519)) {
              break L1;
            } else {
              if (!wd.field_e.c(13519)) {
                break L1;
              } else {
                if (!bh.field_c.c(13519)) {
                  break L1;
                } else {
                  if (jl.field_t) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1, ja param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var22 = 0;
        int var23 = 0;
        ja var24 = null;
        int var25 = 0;
        Object var26 = null;
        ja var26_ref = null;
        int var27 = 0;
        int[] var34 = null;
        int[] var35 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var26 = null;
        var27 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var4_int = param3 + -(vf.field_L.field_s / 2);
              var4_int = var4_int + vf.field_L.field_u;
              var5 = -(vf.field_L.field_o / 2) + param1;
              var5 = var5 + vf.field_L.field_p;
              var6 = -var4_int + bk.field_a.field_u;
              var7 = bk.field_a.field_p - var5;
              var8 = vf.field_L.field_r;
              if (var8 <= var6) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = bk.field_a.field_r;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var9 = stackIn_4_0;
              var10 = vf.field_L.field_m;
              if (~var7 <= ~var10) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = bk.field_a.field_m;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var11 = stackIn_7_0;
              if (var6 <= 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var6;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var12 = stackIn_10_0;
              if (var7 > 0) {
                stackOut_12_0 = var7;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 0;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var13 = stackIn_13_0;
              var14 = var6 - -var9;
              if (~var14 < ~var8) {
                var14 = var8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var15 = var11 + var7;
              if (~var15 < ~var10) {
                var15 = var10;
                break L6;
              } else {
                break L6;
              }
            }
            var14 = var14 - var12;
            var15 = var15 - var13;
            var16 = var8 * var13 - -var12;
            var17 = -var14 + var8;
            var18 = var12 + (-var6 + (-var7 + var13) * var9);
            var19 = -var14 + var9;
            var34 = vf.field_L.field_v;
            var35 = bk.field_a.field_v;
            var22 = var15;
            L7: while (true) {
              if (0 >= var22) {
                break L0;
              } else {
                var23 = var14;
                L8: while (true) {
                  if (var23 <= 0) {
                    var18 = var18 + var19;
                    var16 = var16 + var17;
                    var22--;
                    continue L7;
                  } else {
                    L9: {
                      if (var34[var16] != 0) {
                        if (var35[var18] != 16777215) {
                          if (var35[var18] == 0) {
                            break L9;
                          } else {
                            L10: {
                              var24 = tl.field_g[-1 + var35[var18]];
                              if (var24.field_z != 2) {
                                stackOut_34_0 = 0;
                                stackIn_35_0 = stackOut_34_0;
                                break L10;
                              } else {
                                stackOut_33_0 = 1;
                                stackIn_35_0 = stackOut_33_0;
                                break L10;
                              }
                            }
                            L11: {
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              if (param2.field_z != 2) {
                                stackOut_37_0 = stackIn_37_0;
                                stackOut_37_1 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                break L11;
                              } else {
                                stackOut_36_0 = stackIn_36_0;
                                stackOut_36_1 = 1;
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_38_1 = stackOut_36_1;
                                break L11;
                              }
                            }
                            L12: {
                              var25 = stackIn_38_0 ^ stackIn_38_1;
                              if (var25 == 0) {
                                break L12;
                              } else {
                                var26_ref = (ja) (Object) ra.field_a.e(1);
                                if (var26_ref != null) {
                                  L13: {
                                    L14: {
                                      if (param2.field_z != 2) {
                                        break L14;
                                      } else {
                                        if (var25 != 0) {
                                          var26_ref.a(96, (float)param3, 8, param2.field_w, param2.field_M, 0, param2.field_u, (float)param1, param2.field_F, param2.field_C, 0.0f);
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var26_ref.a(-121, var24.field_o, 8, var24.field_w, var24.field_M, 0, var24.field_u, var24.field_v, var24.field_F, var24.field_C, 0.0f);
                                    break L13;
                                  }
                                  bh.field_c.a(-42, (hf) (Object) var26_ref);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (ik.a(var24, param2, false)) {
                              return;
                            } else {
                              break L9;
                            }
                          }
                        } else {
                          param2.field_t = true;
                          if (param2.field_z != 3) {
                            if (4 == param2.field_z) {
                              jc.a(7, false);
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            jl.field_t = true;
                            break L9;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    var18++;
                    var16++;
                    var23--;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var4;
            stackOut_53_1 = new StringBuilder().append("ih.A(").append(-1).append(',').append(param1).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param2 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L15;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L15;
            }
          }
          throw t.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + param3 + ')');
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 > 119) {
              stackOut_3_0 = pf.field_O.a(0, param1, "");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ih.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have 1 unread message!";
        field_a = null;
    }
}
