/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr implements dja {
    final static void a(lta param0, wfb param1, boolean param2) {
        RuntimeException var3 = null;
        String var3_ref = null;
        Exception var4 = null;
        int[] var4_array = null;
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
        int stackIn_17_0 = 0;
        lta stackIn_17_1 = null;
        int stackIn_18_0 = 0;
        lta stackIn_18_1 = null;
        int stackIn_19_0 = 0;
        lta stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        lta stackIn_35_0 = null;
        lta stackIn_36_0 = null;
        lta stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        lta stackIn_39_0 = null;
        lta stackIn_40_0 = null;
        lta stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        lta stackOut_16_1 = null;
        int stackOut_18_0 = 0;
        lta stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_17_0 = 0;
        lta stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        lta stackOut_34_0 = null;
        lta stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        lta stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        lta stackOut_38_0 = null;
        lta stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        lta stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_ref = "Normal mode";
              if (au.field_c == 1) {
                var3_ref = "Convex polygons mode";
                break L1;
              } else {
                if (-3 == (au.field_c ^ -1)) {
                  var3_ref = "Detail lines mode";
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            cka.a(-1, var3_ref, 16777215, 40, ip.field_p.width / 2 + -(kga.a(123, var3_ref) >> 501580225), 4266);
            if (!param2) {
              if (param1.field_v != null) {
                L2: {
                  if (0 > fe.field_p) {
                    break L2;
                  } else {
                    if (au.field_c != 2) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          var15 = new ml(fe.field_p);
                          var15.a((pe) null, (byte) 84, 16777215, param0, false);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          var4.printStackTrace();
                          break L4;
                        }
                      }
                      break L2;
                    }
                  }
                }
                L5: {
                  var18 = param1.field_v;
                  var16 = var18;
                  var14 = var16;
                  var19 = var14;
                  var17 = var19;
                  var4_array = var17;
                  stackOut_16_0 = 16711935;
                  stackOut_16_1 = (lta) (param0);
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if (param2) {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = (lta) ((Object) stackIn_18_1);
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L5;
                  } else {
                    stackOut_17_0 = stackIn_17_0;
                    stackOut_17_1 = (lta) ((Object) stackIn_17_1);
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L5;
                  }
                }
                fg.a(stackIn_19_0, ((lta) (Object) stackIn_19_1).b(stackIn_19_2 != 0, 0), param0.a(0, (byte) 122), 80);
                var5 = 0;
                L6: while (true) {
                  if (var5 >= var18.length) {
                    var5 = 0;
                    L7: while (true) {
                      if (var5 >= var19.length) {
                        L8: {
                          if (au.field_c == 0) {
                            var5_ref_lsb__ = param1.field_o;
                            if (var5_ref_lsb__ == null) {
                              break L8;
                            } else {
                              var6 = 0;
                              L9: while (true) {
                                if (var5_ref_lsb__.length <= var6) {
                                  break L8;
                                } else {
                                  L10: {
                                    var7 = var5_ref_lsb__[var6].field_b;
                                    var8 = var5_ref_lsb__[var6].field_c;
                                    var9 = param0.a(var7, (byte) 120);
                                    stackOut_34_0 = (lta) (param0);
                                    stackIn_36_0 = stackOut_34_0;
                                    stackIn_35_0 = stackOut_34_0;
                                    if (param2) {
                                      stackOut_36_0 = (lta) ((Object) stackIn_36_0);
                                      stackOut_36_1 = 0;
                                      stackIn_37_0 = stackOut_36_0;
                                      stackIn_37_1 = stackOut_36_1;
                                      break L10;
                                    } else {
                                      stackOut_35_0 = (lta) ((Object) stackIn_35_0);
                                      stackOut_35_1 = 1;
                                      stackIn_37_0 = stackOut_35_0;
                                      stackIn_37_1 = stackOut_35_1;
                                      break L10;
                                    }
                                  }
                                  var10 = ((lta) (Object) stackIn_37_0).b(stackIn_37_1 != 0, var8);
                                  ena.a(var10, (float)(int)(param0.field_a * 256.0f), -104, var9, 65280);
                                  var11 = 8 * fc.a(var5_ref_lsb__[var6].field_a, (byte) 61) >> -861887992;
                                  var12 = eu.a(var5_ref_lsb__[var6].field_a, 109) * 8 >> -1871329272;
                                  c.a(param0.b(true, var12 + var8), param0.a(var11 + var7, (byte) 127), var9, var10, -16777216, 16711680);
                                  cka.a(-1, Integer.toString(var6), 16711935, var10, var9, 4266);
                                  var6++;
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                        L11: {
                          var5 = param0.a(param1.field_b, (byte) 125);
                          stackOut_38_0 = (lta) (param0);
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_39_0 = stackOut_38_0;
                          if (param2) {
                            stackOut_40_0 = (lta) ((Object) stackIn_40_0);
                            stackOut_40_1 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            break L11;
                          } else {
                            stackOut_39_0 = (lta) ((Object) stackIn_39_0);
                            stackOut_39_1 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            break L11;
                          }
                        }
                        var6 = ((lta) (Object) stackIn_41_0).b(stackIn_41_1 != 0, param1.field_i);
                        kq.a(2.0f, (byte) 115, var6, 255, var5);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L12: {
                          var6 = var19[var5];
                          var7 = var4_array[var5 + 1];
                          var8 = param0.a(var6, (byte) 120);
                          var9 = param0.b(true, var7);
                          fg.a(16777215, var9, var8, 63);
                          if ((au.field_c ^ -1) != -3) {
                            cka.a(1, "" + (var5 >> 1719440289), 16777215, var9, var8, 4266);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var5 += 2;
                        continue L7;
                      }
                    }
                  } else {
                    var6 = var18[var5];
                    var7 = var14[var5 - -1];
                    var8 = var14[(2 + var5) % var18.length];
                    var9 = var14[(3 + var5) % var18.length];
                    c.a(param0.b(true, var9), param0.a(var8, (byte) 121), param0.a(var6, (byte) 114), param0.b(true, var7), -16777216, 16711680);
                    var5 += 2;
                    continue L6;
                  }
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var3);
            stackOut_43_1 = new StringBuilder().append("fr.D(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L13;
            }
          }
          L14: {
            stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L14;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L14;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
        return (tv) ((Object) new rdb());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new rdb[param1]);
    }

    static {
    }
}
