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
            throw t.a((Throwable) ((Object) runtimeException), "ih.C(" + param0 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (!ji.field_r.c(13519)) {
                break L1;
              } else {
                if (!wd.field_e.c(13519)) {
                  break L1;
                } else {
                  if (!bh.field_c.c(param0 + 13519)) {
                    break L1;
                  } else {
                    if (jl.field_t) {
                      break L1;
                    } else {
                      stackIn_8_0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = 0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 46) {
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1, ja param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = bk.field_a.field_r;
                break L1;
              }
            }
            L2: {
              var9 = stackIn_4_0;
              var10 = vf.field_L.field_m;
              if (var7 >= var10) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = bk.field_a.field_m;
                break L2;
              }
            }
            L3: {
              var11 = stackIn_7_0;
              if ((var6 ^ -1) >= param0) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = var6;
                break L3;
              }
            }
            L4: {
              var12 = stackIn_10_0;
              if (-1 > (var7 ^ -1)) {
                stackIn_13_0 = var7;
                break L4;
              } else {
                stackIn_13_0 = 0;
                break L4;
              }
            }
            L5: {
              var13 = stackIn_13_0;
              var14 = var6 - -var9;
              if (var14 > var8) {
                var14 = var8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var15 = var11 + var7;
              if (var15 > var10) {
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
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var23 = var14;
                L8: while (true) {
                  if ((var23 ^ -1) >= -1) {
                    var18 = var18 + var19;
                    var16 = var16 + var17;
                    var22--;
                    continue L7;
                  } else {
                    L9: {
                      if ((var34[var16] ^ -1) != -1) {
                        if (-16777216 != (var35[var18] ^ -1)) {
                          if (var35[var18] == 0) {
                            break L9;
                          } else {
                            L10: {
                              var24 = tl.field_g[-1 + var35[var18]];
                              if (-3 != (var24.field_z ^ -1)) {
                                stackIn_35_0 = 0;
                                break L10;
                              } else {
                                stackIn_35_0 = 1;
                                break L10;
                              }
                            }
                            L11: {


                              if (-3 != (param2.field_z ^ -1)) {

                                stackIn_38_1 = 0;
                                break L11;
                              } else {

                                stackIn_38_1 = 1;
                                break L11;
                              }
                            }
                            L12: {
                              var25 = stackIn_35_0 ^ stackIn_38_1;
                              if (var25 == 0) {
                                break L12;
                              } else {
                                var26_ref = (ja) ((Object) ra.field_a.e(1));
                                if (var26_ref != null) {
                                  L13: {
                                    L14: {
                                      if ((param2.field_z ^ -1) != -3) {
                                        break L14;
                                      } else {
                                        if (var25 != 0) {
                                          var26_ref.a(param0 ^ -97, (float)param3, 8, param2.field_w, param2.field_M, 0, param2.field_u, (float)param1, param2.field_F, param2.field_C, 0.0f);
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var26_ref.a(-121, var24.field_o, 8, var24.field_w, var24.field_M, 0, var24.field_u, var24.field_v, var24.field_F, var24.field_C, 0.0f);
                                    break L13;
                                  }
                                  bh.field_c.a(-42, var26_ref);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (ik.a(var24, param2, false)) {
                              decompiledRegionSelector0 = 1;
                              break L0;
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
            stackIn_55_0 = (RuntimeException) (var4);

            stackIn_55_1 = new StringBuilder().append("ih.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L15;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L15;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 119) {
              stackIn_4_0 = pf.field_O.a(0, param1, "");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ih.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_b = "You have 1 unread message!";
        field_a = null;
    }
}
