/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc extends to {
    private hc field_w;
    private int field_u;
    private String field_A;
    private boolean field_y;
    static String field_v;
    private int field_z;
    private int field_x;

    final static int a(String param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        int var6 = 0;
        RuntimeException var7_ref_RuntimeException = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9_int = 0;
        Throwable var9 = null;
        int var10 = 0;
        String var11 = null;
        File var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (bm.field_I.field_q) {
              if (!vg.field_j.containsKey(param0)) {
                var11 = ob.a(param0, (byte) -18);
                if (var11 == null) {
                  stackIn_10_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var3 = bl.field_g + var11;
                  if (rj.field_b.a(var3, -126, "")) {
                    if (rj.field_b.c(var3, -14012)) {
                      var15 = rj.field_b.a(var3, (byte) -71, "");
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
                        stackIn_21_0 = -1;
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
                                var16 = ee.a(true, var12);
                                var14 = var16;
                                var8 = var14;
                                if (var8 == null) {
                                  break L4;
                                } else {
                                  if (var15.length != var16.length) {
                                    break L4;
                                  } else {
                                    var9_int = 0;
                                    L5: while (true) {
                                      if (var16.length <= var9_int) {
                                        break L3;
                                      } else {
                                        if (var15[var9_int] == var16[var9_int]) {
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
                                    bm.field_I.a(var12, var15, true);
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
                              stackIn_38_0 = -1;
                              return stackIn_38_0;
                            }
                            vn.a(0, var12, param0);
                            stackIn_40_0 = 100;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_42_0 = -1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      stackIn_16_0 = rj.field_b.a(var3, (byte) -79);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = -1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 100;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var2);

            stackIn_45_1 = new StringBuilder().append("bc.V(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L8;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_40_0;
                  } else {
                    return stackIn_42_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void j(int param0) {
        field_v = null;
        if (param0 != 14912) {
            field_v = (String) null;
        }
    }

    final String c(byte param0) {
        int var2;
        String var3;
        ea stackIn_3_0 = null;
        ea stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ea stackIn_7_0 = null;
        ea stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        var2 = this.field_s.field_g ? 1 : 0;
        this.field_s.field_g = this.field_g;
        if (param0 >= -41) {
          L0: {
            field_v = (String) null;
            var3 = this.field_s.c((byte) -75);
            stackIn_7_0 = this.field_s;

            if (var2 == 0) {
              stackIn_8_0 = (ea) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (ea) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_g = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            var3 = this.field_s.c((byte) -75);
            stackIn_3_0 = this.field_s;

            if (var2 == 0) {
              stackIn_4_0 = (ea) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (ea) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_g = stackIn_4_1 != 0;
          return var3;
        }
    }

    bc(int param0, int param1, int param2, int param3, ea param4, boolean param5, int param6, int param7, hc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ir) null, (no) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_x = param6;
              this.field_z = param7;
              this.field_A = param10;
              this.field_u = param9;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((bc) (this)).field_y = stackIn_4_1 != 0;
              this.field_w = param8;
              this.field_s = param4;
              var12_int = -this.field_z + this.field_x;
              var13 = this.field_w.a(param10, var12_int, this.field_w.field_I) - -(2 * this.field_z);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(var13, param0, param1, param2, (byte) 123);
                break L2;
              }
            }
            L3: {
              if (!this.field_y) {
                stackIn_10_0 = this.field_x - -(this.field_z * 2);
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_s.a(param3 - 2 * this.field_z, var14, this.field_z + (var13 - param3 >> -1964588735), param2 - (this.field_x - -(this.field_z * 3)), (byte) 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("bc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_6_0 = 0;
        hc stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_8_5;
        int stackIn_8_6;
        int stackIn_8_7;
        hc stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        var5 = this.field_p + param3;
        if (param0 >= 64) {
          var6 = this.field_h + param2;
          super.a((byte) 108, param1, param2, param3);
          if (0 != param1) {
            return;
          } else {
            L0: {
              if (!this.field_y) {
                stackIn_6_0 = 0;
                break L0;
              } else {
                stackIn_6_0 = -this.field_x + this.field_q + -(2 * this.field_z);
                break L0;
              }
            }
            L1: {
              var7 = stackIn_6_0;
              stackIn_8_0 = this.field_w;

              stackIn_8_1 = this.field_A;

              stackIn_8_2 = this.field_z + var7 + var5;

              stackIn_8_3 = var6 - -this.field_z;

              stackIn_8_4 = -this.field_z + this.field_x;

              stackIn_8_5 = -(2 * this.field_z) + this.field_n;

              stackIn_8_6 = this.field_u;

              stackIn_8_7 = -1;

              if (!this.field_y) {
                stackIn_9_0 = (hc) ((Object) stackIn_8_0);
                stackIn_9_1 = (String) ((Object) stackIn_8_1);
                stackIn_9_2 = stackIn_8_2;
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = stackIn_8_4;
                stackIn_9_5 = stackIn_8_5;
                stackIn_9_6 = stackIn_8_6;
                stackIn_9_7 = stackIn_8_7;
                stackIn_9_8 = 2;
                break L1;
              } else {
                stackIn_9_0 = (hc) ((Object) stackIn_8_0);
                stackIn_9_1 = (String) ((Object) stackIn_8_1);
                stackIn_9_2 = stackIn_8_2;
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = stackIn_8_4;
                stackIn_9_5 = stackIn_8_5;
                stackIn_9_6 = stackIn_8_6;
                stackIn_9_7 = stackIn_8_7;
                stackIn_9_8 = 0;
                break L1;
              }
            }
            ((hc) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, this.field_w.field_I);
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_v = "Connection lost. <%0>";
    }
}
