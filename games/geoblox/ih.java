/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static df field_a;
    static h field_c;

    final static void b(int param0) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        eg.field_p.a(111);
        int var1 = 10 / ((param0 - 68) / 57);
        for (var2 = 0; var2 < 32; var2++) {
            pb.field_p[var2] = 0L;
        }
        for (var1 = 0; var1 < 32; var1++) {
            tl.field_l[var1] = 0L;
        }
        nf.field_w = 0;
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
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
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
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
        int var4 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        L0: {
          var26 = null;
          var27 = Geoblox.field_C;
          var4 = param3 + -(vf.field_L.field_s / 2);
          var4 = var4 + vf.field_L.field_u;
          var5 = -(vf.field_L.field_o / 2) + param1;
          var5 = var5 + vf.field_L.field_p;
          var6 = -var4 + bk.field_a.field_u;
          var7 = bk.field_a.field_p - var5;
          var8 = vf.field_L.field_r;
          if (var8 <= var6) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = bk.field_a.field_r;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var9 = stackIn_3_0;
          var10 = vf.field_L.field_m;
          if (var7 >= var10) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = bk.field_a.field_m;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var11 = stackIn_6_0;
          if (var6 >= param0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var6;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var12 = stackIn_9_0;
          if (-1 < var7) {
            stackOut_11_0 = var7;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 0;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var13 = stackIn_12_0;
          var14 = var6 - -var9;
          if (var14 > var8) {
            var14 = var8;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var15 = var11 + var7;
          if (var15 > var10) {
            var15 = var10;
            break L5;
          } else {
            break L5;
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
        L6: while (true) {
          if (0 >= var22) {
            return;
          } else {
            var23 = var14;
            L7: while (true) {
              if ((var23 ^ -1) >= -1) {
                var18 = var18 + var19;
                var16 = var16 + var17;
                var22--;
                continue L6;
              } else {
                if (var34[var16] != -1) {
                  if (-16777216 != var35[var18]) {
                    if (var35[var18] != -1) {
                      L8: {
                        var24 = tl.field_g[-1 + var35[var18]];
                        if (-3 != var24.field_z) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L8;
                        } else {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L8;
                        }
                      }
                      L9: {
                        stackOut_35_0 = stackIn_35_0;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_36_0 = stackOut_35_0;
                        if (-3 != (param2.field_z ^ -1)) {
                          stackOut_37_0 = stackIn_37_0;
                          stackOut_37_1 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          break L9;
                        } else {
                          stackOut_36_0 = stackIn_36_0;
                          stackOut_36_1 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          break L9;
                        }
                      }
                      L10: {
                        var25 = stackIn_38_0 ^ stackIn_38_1;
                        if (var25 == 0) {
                          break L10;
                        } else {
                          var26_ref = (ja) (Object) ra.field_a.e(1);
                          if (var26_ref != null) {
                            L11: {
                              L12: {
                                if ((param2.field_z ^ -1) != -3) {
                                  break L12;
                                } else {
                                  if (var25 != 0) {
                                    var26_ref.a(param0 ^ -97, (float)param3, 8, param2.field_w, param2.field_M, 0, param2.field_u, (float)param1, param2.field_F, param2.field_C, 0.0f);
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var26_ref.a(-121, var24.field_o, 8, var24.field_w, var24.field_M, 0, var24.field_u, var24.field_v, var24.field_F, var24.field_C, 0.0f);
                              break L11;
                            }
                            bh.field_c.a(-42, (hf) (Object) var26_ref);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (ik.a(var24, param2, false)) {
                        return;
                      } else {
                        var18++;
                        var16++;
                        var23--;
                        continue L7;
                      }
                    } else {
                      var18++;
                      var16++;
                      var23--;
                      continue L7;
                    }
                  } else {
                    param2.field_t = true;
                    if (param2.field_z != 3) {
                      if (4 == param2.field_z) {
                        jc.a(7, false);
                        var18++;
                        var16++;
                        var23--;
                        continue L7;
                      } else {
                        var18++;
                        var16++;
                        var23--;
                        continue L7;
                      }
                    } else {
                      jl.field_t = true;
                      var18++;
                      var16++;
                      var23--;
                      continue L7;
                    }
                  }
                } else {
                  var18++;
                  var16++;
                  var23--;
                  continue L7;
                }
              }
            }
          }
        }
    }

    final static byte[] a(int param0, String param1) {
        if (param0 <= 119) {
            return null;
        }
        return pf.field_O.a(0, param1, "");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have 1 unread message!";
        field_a = null;
    }
}
