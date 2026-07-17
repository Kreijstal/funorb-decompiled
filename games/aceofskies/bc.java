/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class bc extends to {
    private hc field_w;
    private int field_u;
    private String field_A;
    private boolean field_y;
    static String field_v;
    private int field_z;
    private int field_x;

    final static int a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        int var6 = 0;
        RuntimeException var7_ref_RuntimeException = null;
        int var7 = 0;
        byte[] var8 = null;
        Throwable var9 = null;
        int var9_int = 0;
        int var10 = 0;
        String var11 = null;
        File var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (bm.field_I.field_q) {
              if (!vg.field_j.containsKey((Object) (Object) param0)) {
                var11 = ob.a(param0, (byte) -18);
                if (var11 == null) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var3 = bl.field_g + var11;
                  if (rj.field_b.a(var3, -126, "")) {
                    if (rj.field_b.c(var3, -14012)) {
                      var19 = rj.field_b.a(var3, (byte) -71, "");
                      var17 = var19;
                      var15 = var17;
                      var13 = var15;
                      var4 = var13;
                      var6 = -26 / ((param1 - -35) / 33);
                      var5 = null;
                      try {
                        L1: {
                          var12 = qc.a(true, var11);
                          break L1;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var7_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackOut_20_0 = -1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                      L2: {
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var12 != null) {
                            L3: {
                              L4: {
                                var7 = 1;
                                var20 = ee.a(true, var12);
                                var18 = var20;
                                var16 = var18;
                                var14 = var16;
                                var8 = var14;
                                if (var8 == null) {
                                  break L4;
                                } else {
                                  if (var19.length != var20.length) {
                                    break L4;
                                  } else {
                                    var9_int = 0;
                                    L5: while (true) {
                                      if (var20.length <= var9_int) {
                                        break L3;
                                      } else {
                                        if (var19[var9_int] == var20[var9_int]) {
                                          var9_int++;
                                          continue L5;
                                        } else {
                                          var7 = 0;
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var7 = 0;
                              break L3;
                            }
                            try {
                              L6: {
                                L7: {
                                  if (var7 == 0) {
                                    boolean discarded$1 = bm.field_I.a(var12, var19, true);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                break L6;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var9 = decompiledCaughtException;
                              stackOut_37_0 = -1;
                              stackIn_38_0 = stackOut_37_0;
                              return stackIn_38_0;
                            }
                            vn.a(0, var12, param0);
                            stackOut_39_0 = 100;
                            stackIn_40_0 = stackOut_39_0;
                            return stackIn_40_0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_41_0 = -1;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    } else {
                      stackOut_15_0 = rj.field_b.a(var3, (byte) -79);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = -1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              } else {
                stackOut_5_0 = 100;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var2;
            stackOut_43_1 = new StringBuilder().append("bc.V(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L8;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 41);
        }
        return stackIn_42_0;
    }

    public static void j(int param0) {
        field_v = null;
    }

    final String c(byte param0) {
        int var2 = 0;
        String var3 = null;
        ea stackIn_2_0 = null;
        ea stackIn_3_0 = null;
        ea stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ea stackIn_6_0 = null;
        ea stackIn_7_0 = null;
        ea stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ea stackOut_5_0 = null;
        ea stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ea stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ea stackOut_1_0 = null;
        ea stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ea stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = ((bc) this).field_s.field_g ? 1 : 0;
        ((bc) this).field_s.field_g = ((bc) this).field_g;
        if (param0 >= -41) {
          L0: {
            field_v = null;
            var3 = ((bc) this).field_s.c((byte) -75);
            stackOut_5_0 = ((bc) this).field_s;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var2 == 0) {
              stackOut_7_0 = (ea) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (ea) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_g = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            var3 = ((bc) this).field_s.c((byte) -75);
            stackOut_1_0 = ((bc) this).field_s;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = (ea) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ea) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_g = stackIn_4_1 != 0;
          return var3;
        }
    }

    bc(int param0, int param1, int param2, int param3, ea param4, boolean param5, int param6, int param7, hc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ir) null, (no) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((bc) this).field_x = param6;
              ((bc) this).field_z = param7;
              ((bc) this).field_A = param10;
              ((bc) this).field_u = param9;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((bc) this).field_y = stackIn_4_1 != 0;
              ((bc) this).field_w = param8;
              ((bc) this).field_s = param4;
              var12_int = -((bc) this).field_z + ((bc) this).field_x;
              var13 = ((bc) this).field_w.a(param10, var12_int, ((bc) this).field_w.field_I) - -(2 * ((bc) this).field_z);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                ((bc) this).a(var13, param0, param1, param2, (byte) 123);
                break L2;
              }
            }
            L3: {
              if (!((bc) this).field_y) {
                stackOut_9_0 = ((bc) this).field_x - -(((bc) this).field_z * 2);
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((bc) this).field_s.a(param3 - 2 * ((bc) this).field_z, var14, ((bc) this).field_z + (var13 - param3 >> 1), param2 - (((bc) this).field_x - -(((bc) this).field_z * 3)), (byte) 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("bc.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        hc stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        hc stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        hc stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        hc stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        hc stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        hc stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        var5 = ((bc) this).field_p + param3;
        if (param0 >= 64) {
          var6 = ((bc) this).field_h + param2;
          super.a((byte) 108, param1, param2, param3);
          if (0 != param1) {
            return;
          } else {
            L0: {
              if (!((bc) this).field_y) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = -((bc) this).field_x + ((bc) this).field_q + -(2 * ((bc) this).field_z);
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_6_0;
              stackOut_6_0 = ((bc) this).field_w;
              stackOut_6_1 = ((bc) this).field_A;
              stackOut_6_2 = ((bc) this).field_z + var7 + var5;
              stackOut_6_3 = var6 - -((bc) this).field_z;
              stackOut_6_4 = -((bc) this).field_z + ((bc) this).field_x;
              stackOut_6_5 = -(2 * ((bc) this).field_z) + ((bc) this).field_n;
              stackOut_6_6 = ((bc) this).field_u;
              stackOut_6_7 = -1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_8_4 = stackOut_6_4;
              stackIn_8_5 = stackOut_6_5;
              stackIn_8_6 = stackOut_6_6;
              stackIn_8_7 = stackOut_6_7;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              if (!((bc) this).field_y) {
                stackOut_8_0 = (hc) (Object) stackIn_8_0;
                stackOut_8_1 = (String) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = stackIn_8_6;
                stackOut_8_7 = stackIn_8_7;
                stackOut_8_8 = 2;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                stackIn_9_5 = stackOut_8_5;
                stackIn_9_6 = stackOut_8_6;
                stackIn_9_7 = stackOut_8_7;
                stackIn_9_8 = stackOut_8_8;
                break L1;
              } else {
                stackOut_7_0 = (hc) (Object) stackIn_7_0;
                stackOut_7_1 = (String) (Object) stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = stackIn_7_5;
                stackOut_7_6 = stackIn_7_6;
                stackOut_7_7 = stackIn_7_7;
                stackOut_7_8 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                stackIn_9_5 = stackOut_7_5;
                stackIn_9_6 = stackOut_7_6;
                stackIn_9_7 = stackOut_7_7;
                stackIn_9_8 = stackOut_7_8;
                break L1;
              }
            }
            int discarded$1 = ((hc) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, ((bc) this).field_w.field_I);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Connection lost. <%0>";
    }
}
