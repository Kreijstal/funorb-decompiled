/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr implements dja {
    final static void a(lta param0, wfb param1) {
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
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        lta stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        Throwable decompiledCaughtException = null;
        lta stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_ref = "Normal mode";
              if (au.field_c == 1) {
                var3_ref = "Convex polygons mode";
                break L1;
              } else {
                if (au.field_c == 2) {
                  var3_ref = "Detail lines mode";
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            cka.a(-1, var3_ref, 16777215, 40, ip.field_p.width / 2 + -(kga.a(123, var3_ref) >> 1), 4266);
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
              var22 = param1.field_v;
              var20 = var22;
              var18 = var20;
              var16 = var18;
              var14 = var16;
              var23 = var14;
              var21 = var23;
              var19 = var21;
              var17 = var19;
              var4_array = var17;
              fg.a(16711935, param0.b(true, 0), param0.a(0, (byte) 122), 80);
              var5 = 0;
              L5: while (true) {
                if (var5 >= var22.length) {
                  var5 = 0;
                  L6: while (true) {
                    if (var5 >= var23.length) {
                      L7: {
                        if (au.field_c == 0) {
                          var5_ref_lsb__ = param1.field_o;
                          if (var5_ref_lsb__ == null) {
                            break L7;
                          } else {
                            var6 = 0;
                            L8: while (true) {
                              if (var5_ref_lsb__.length <= var6) {
                                break L7;
                              } else {
                                var7 = var5_ref_lsb__[var6].field_b;
                                var8 = var5_ref_lsb__[var6].field_c;
                                var9 = param0.a(var7, (byte) 120);
                                stackOut_33_0 = (lta) param0;
                                stackOut_33_1 = 1;
                                stackIn_35_0 = stackOut_33_0;
                                stackIn_35_1 = stackOut_33_1;
                                var10 = ((lta) (Object) stackIn_35_0).b(stackIn_35_1 != 0, var8);
                                ena.a(var10, (float)(int)(param0.field_a * 256.0f), -104, var9, 65280);
                                var11 = 8 * fc.a(var5_ref_lsb__[var6].field_a, (byte) 61) >> 8;
                                var12 = eu.a(var5_ref_lsb__[var6].field_a, 109) * 8 >> 8;
                                c.a(param0.b(true, var12 + var8), param0.a(var11 + var7, (byte) 127), var9, var10, -16777216, 16711680);
                                cka.a(-1, Integer.toString(var6), 16711935, var10, var9, 4266);
                                var6++;
                                continue L8;
                              }
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      var5 = param0.a(param1.field_b, (byte) 125);
                      var6 = param0.b(true, param1.field_i);
                      kq.a(2.0f, (byte) 115, var6, 255, var5);
                      break L0;
                    } else {
                      L9: {
                        var6 = var23[var5];
                        var7 = var4_array[var5 + 1];
                        var8 = param0.a(var6, (byte) 120);
                        var9 = param0.b(true, var7);
                        fg.a(16777215, var9, var8, 63);
                        if (au.field_c != 2) {
                          cka.a(1, "" + (var5 >> 1), 16777215, var9, var8, 4266);
                          var5 += 2;
                          break L9;
                        } else {
                          var5 += 2;
                          break L9;
                        }
                      }
                      var5 += 2;
                      continue L6;
                    }
                  }
                } else {
                  var6 = var22[var5];
                  var7 = var14[var5 - -1];
                  var8 = var14[(2 + var5) % var22.length];
                  var9 = var14[(3 + var5) % var22.length];
                  c.a(param0.b(true, var9), param0.a(var8, (byte) 121), param0.a(var6, (byte) 114), param0.b(true, var7), -16777216, 16711680);
                  var5 += 2;
                  continue L5;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("fr.D(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          L11: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 0 + 41);
        }
    }

    final static void a(boolean param0) {
        int discarded$0 = -24055;
        lga.a(param0);
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
