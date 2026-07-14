/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr implements dja {
    final static void a(lta param0, wfb param1, boolean param2) {
        String var3 = null;
        int[] var4 = null;
        int var5 = 0;
        lsb[] var5_ref_lsb__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        ml var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        lsb[] var22 = null;
        int[] var23 = null;
        int[] var25 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_13_0 = 0;
        lta stackIn_13_1 = null;
        int stackIn_14_0 = 0;
        lta stackIn_14_1 = null;
        int stackIn_15_0 = 0;
        lta stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        lta stackIn_30_0 = null;
        lta stackIn_31_0 = null;
        lta stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        lta stackIn_34_0 = null;
        lta stackIn_35_0 = null;
        lta stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        lta stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        lta stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        lta stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        lta stackIn_53_0 = null;
        lta stackIn_54_0 = null;
        lta stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        lta stackIn_59_0 = null;
        lta stackIn_60_0 = null;
        lta stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        lta stackIn_63_0 = null;
        lta stackIn_64_0 = null;
        lta stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        lta stackIn_67_0 = null;
        lta stackIn_68_0 = null;
        lta stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackOut_12_0 = 0;
        lta stackOut_12_1 = null;
        int stackOut_14_0 = 0;
        lta stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_13_0 = 0;
        lta stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        lta stackOut_29_0 = null;
        lta stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        lta stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        lta stackOut_33_0 = null;
        lta stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        lta stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_37_0 = 0;
        lta stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        lta stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        lta stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        lta stackOut_62_0 = null;
        lta stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        lta stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        lta stackOut_58_0 = null;
        lta stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        lta stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        lta stackOut_52_0 = null;
        lta stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        lta stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        lta stackOut_66_0 = null;
        lta stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        lta stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          var3 = "Normal mode";
          if (au.field_c == 1) {
            var3 = "Convex polygons mode";
            break L0;
          } else {
            if (-3 == (au.field_c ^ -1)) {
              var3 = "Detail lines mode";
              break L0;
            } else {
              break L0;
            }
          }
        }
        cka.a(-1, var3, 16777215, 40, ip.field_p.width / 2 + -(kga.a(123, var3) >> 501580225), 4266);
        if (!param2) {
          if (param1.field_v != null) {
            L1: {
              if (0 > fe.field_p) {
                break L1;
              } else {
                if (au.field_c != 2) {
                  break L1;
                } else {
                  L2: {
                    var15 = new ml(fe.field_p);
                    var15.a((pe) null, (byte) 84, 16777215, param0, false);
                    var27 = param1.field_v;
                    var20 = var27;
                    var18 = var20;
                    var16 = var18;
                    var14 = var16;
                    var28 = var14;
                    var21 = var28;
                    var19 = var21;
                    var17 = var19;
                    var4 = var17;
                    stackOut_12_0 = 16711935;
                    stackOut_12_1 = (lta) param0;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (param2) {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = (lta) (Object) stackIn_14_1;
                      stackOut_14_2 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      break L2;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = (lta) (Object) stackIn_13_1;
                      stackOut_13_2 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      break L2;
                    }
                  }
                  fg.a(stackIn_15_0, ((lta) (Object) stackIn_15_1).b(stackIn_15_2 != 0, 0), param0.a(0, (byte) 122), 80);
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var27.length) {
                      L4: {
                        var5 = 0;
                        if (var5 >= var28.length) {
                          break L4;
                        } else {
                          L5: {
                            var6 = var28[var5];
                            var7 = var4[var5 + 1];
                            var8 = param0.a(var6, (byte) 120);
                            var9 = param0.b(true, var7);
                            fg.a(16777215, var9, var8, 63);
                            if ((au.field_c ^ -1) != -3) {
                              cka.a(1, "" + (var5 >> 1719440289), 16777215, var9, var8, 4266);
                              break L5;
                            } else {
                              var5 += 2;
                              break L5;
                            }
                          }
                          var5 += 2;
                          var5 += 2;
                          var5 += 2;
                          break L4;
                        }
                      }
                      L6: {
                        if (au.field_c == 0) {
                          var22 = param1.field_o;
                          var5_ref_lsb__ = var22;
                          if (var5_ref_lsb__ == null) {
                            break L6;
                          } else {
                            var6 = 0;
                            L7: while (true) {
                              if (var22.length <= var6) {
                                break L6;
                              } else {
                                L8: {
                                  var7 = var22[var6].field_b;
                                  var8 = var22[var6].field_c;
                                  var9 = param0.a(var7, (byte) 120);
                                  stackOut_29_0 = (lta) param0;
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_30_0 = stackOut_29_0;
                                  if (param2) {
                                    stackOut_31_0 = (lta) (Object) stackIn_31_0;
                                    stackOut_31_1 = 0;
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    break L8;
                                  } else {
                                    stackOut_30_0 = (lta) (Object) stackIn_30_0;
                                    stackOut_30_1 = 1;
                                    stackIn_32_0 = stackOut_30_0;
                                    stackIn_32_1 = stackOut_30_1;
                                    break L8;
                                  }
                                }
                                var10 = ((lta) (Object) stackIn_32_0).b(stackIn_32_1 != 0, var8);
                                ena.a(var10, (float)(int)(param0.field_a * 256.0f), -104, var9, 65280);
                                var11 = 8 * fc.a(var22[var6].field_a, (byte) 61) >> -861887992;
                                var12 = eu.a(var22[var6].field_a, 109) * 8 >> -1871329272;
                                c.a(param0.b(true, var12 + var8), param0.a(var11 + var7, (byte) 127), var9, var10, -16777216, 16711680);
                                cka.a(-1, Integer.toString(var6), 16711935, var10, var9, 4266);
                                var6++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      L9: {
                        var5 = param0.a(param1.field_b, (byte) 125);
                        stackOut_33_0 = (lta) param0;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (param2) {
                          stackOut_35_0 = (lta) (Object) stackIn_35_0;
                          stackOut_35_1 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          break L9;
                        } else {
                          stackOut_34_0 = (lta) (Object) stackIn_34_0;
                          stackOut_34_1 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          break L9;
                        }
                      }
                      var6 = ((lta) (Object) stackIn_36_0).b(stackIn_36_1 != 0, param1.field_i);
                      kq.a(2.0f, (byte) 115, var6, 255, var5);
                      return;
                    } else {
                      var6 = var27[var5];
                      var7 = var14[var5 - -1];
                      var8 = var14[(2 + var5) % var27.length];
                      var9 = var14[(3 + var5) % var27.length];
                      c.a(param0.b(true, var9), param0.a(var8, (byte) 121), param0.a(var6, (byte) 114), param0.b(true, var7), -16777216, 16711680);
                      var5 += 2;
                      continue L3;
                    }
                  }
                }
              }
            }
            L10: {
              var29 = param1.field_v;
              var23 = var29;
              var18 = var23;
              var16 = var18;
              var14 = var16;
              var30 = var14;
              var25 = var30;
              var19 = var25;
              var17 = var19;
              var4 = var17;
              stackOut_37_0 = 16711935;
              stackOut_37_1 = (lta) param0;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              if (param2) {
                stackOut_39_0 = stackIn_39_0;
                stackOut_39_1 = (lta) (Object) stackIn_39_1;
                stackOut_39_2 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                stackIn_40_2 = stackOut_39_2;
                break L10;
              } else {
                stackOut_38_0 = stackIn_38_0;
                stackOut_38_1 = (lta) (Object) stackIn_38_1;
                stackOut_38_2 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_40_2 = stackOut_38_2;
                break L10;
              }
            }
            fg.a(stackIn_40_0, ((lta) (Object) stackIn_40_1).b(stackIn_40_2 != 0, 0), param0.a(0, (byte) 122), 80);
            var5 = 0;
            L11: while (true) {
              if (var5 >= var29.length) {
                L12: {
                  var5 = 0;
                  if (var5 >= var30.length) {
                    break L12;
                  } else {
                    L13: {
                      var6 = var30[var5];
                      var7 = var4[var5 + 1];
                      var8 = param0.a(var6, (byte) 120);
                      var9 = param0.b(true, var7);
                      fg.a(16777215, var9, var8, 63);
                      if ((au.field_c ^ -1) != -3) {
                        cka.a(1, "" + (var5 >> 1719440289), 16777215, var9, var8, 4266);
                        break L13;
                      } else {
                        var5 += 2;
                        break L13;
                      }
                    }
                    var5 += 2;
                    var5 += 2;
                    break L12;
                  }
                }
                if (au.field_c == 0) {
                  var5_ref_lsb__ = param1.field_o;
                  if (var5_ref_lsb__ != null) {
                    var6 = 0;
                    L14: while (true) {
                      if (var5_ref_lsb__.length > var6) {
                        L15: {
                          var7 = var5_ref_lsb__[var6].field_b;
                          var8 = var5_ref_lsb__[var6].field_c;
                          var9 = param0.a(var7, (byte) 120);
                          stackOut_62_0 = (lta) param0;
                          stackIn_64_0 = stackOut_62_0;
                          stackIn_63_0 = stackOut_62_0;
                          if (param2) {
                            stackOut_64_0 = (lta) (Object) stackIn_64_0;
                            stackOut_64_1 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            stackIn_65_1 = stackOut_64_1;
                            break L15;
                          } else {
                            stackOut_63_0 = (lta) (Object) stackIn_63_0;
                            stackOut_63_1 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_65_1 = stackOut_63_1;
                            break L15;
                          }
                        }
                        var10 = ((lta) (Object) stackIn_65_0).b(stackIn_65_1 != 0, var8);
                        ena.a(var10, (float)(int)(param0.field_a * 256.0f), -104, var9, 65280);
                        var11 = 8 * fc.a(var5_ref_lsb__[var6].field_a, (byte) 61) >> -861887992;
                        var12 = eu.a(var5_ref_lsb__[var6].field_a, 109) * 8 >> -1871329272;
                        c.a(param0.b(true, var12 + var8), param0.a(var11 + var7, (byte) 127), var9, var10, -16777216, 16711680);
                        cka.a(-1, Integer.toString(var6), 16711935, var10, var9, 4266);
                        var6++;
                        continue L14;
                      } else {
                        L16: {
                          var5 = param0.a(param1.field_b, (byte) 125);
                          stackOut_58_0 = (lta) param0;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_59_0 = stackOut_58_0;
                          if (param2) {
                            stackOut_60_0 = (lta) (Object) stackIn_60_0;
                            stackOut_60_1 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            break L16;
                          } else {
                            stackOut_59_0 = (lta) (Object) stackIn_59_0;
                            stackOut_59_1 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            break L16;
                          }
                        }
                        var6 = ((lta) (Object) stackIn_61_0).b(stackIn_61_1 != 0, param1.field_i);
                        kq.a(2.0f, (byte) 115, var6, 255, var5);
                        return;
                      }
                    }
                  } else {
                    L17: {
                      var5 = param0.a(param1.field_b, (byte) 125);
                      stackOut_52_0 = (lta) param0;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_53_0 = stackOut_52_0;
                      if (param2) {
                        stackOut_54_0 = (lta) (Object) stackIn_54_0;
                        stackOut_54_1 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        break L17;
                      } else {
                        stackOut_53_0 = (lta) (Object) stackIn_53_0;
                        stackOut_53_1 = 1;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        break L17;
                      }
                    }
                    var6 = ((lta) (Object) stackIn_55_0).b(stackIn_55_1 != 0, param1.field_i);
                    kq.a(2.0f, (byte) 115, var6, 255, var5);
                    return;
                  }
                } else {
                  L18: {
                    var5 = param0.a(param1.field_b, (byte) 125);
                    stackOut_66_0 = (lta) param0;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_67_0 = stackOut_66_0;
                    if (param2) {
                      stackOut_68_0 = (lta) (Object) stackIn_68_0;
                      stackOut_68_1 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      break L18;
                    } else {
                      stackOut_67_0 = (lta) (Object) stackIn_67_0;
                      stackOut_67_1 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      break L18;
                    }
                  }
                  var6 = ((lta) (Object) stackIn_69_0).b(stackIn_69_1 != 0, param1.field_i);
                  kq.a(2.0f, (byte) 115, var6, 255, var5);
                  return;
                }
              } else {
                var6 = var29[var5];
                var7 = var14[var5 - -1];
                var8 = var14[(2 + var5) % var29.length];
                var9 = var14[(3 + var5) % var29.length];
                c.a(param0.b(true, var9), param0.a(var8, (byte) 121), param0.a(var6, (byte) 114), param0.b(true, var7), -16777216, 16711680);
                var5 += 2;
                continue L11;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
            return;
        }
        lga.a(param0, -24055);
        sj.a(param0, (byte) -93);
    }

    public final tv a(byte param0) {
        int var2 = 46 / ((param0 - -64) / 50);
        return (tv) (Object) new rdb();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new rdb[param1];
    }

    static {
    }
}
