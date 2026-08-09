/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends td {
    static eh field_p;
    static String field_q;

    final static ee a(vr param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        ee stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                var6 = (String) null;
                ch.a((vr) null, -47, (String) null, (String) null);
                break L1;
              }
            }
            var4_int = param0.a(param2, false);
            var5 = param0.a((byte) 6, var4_int, param3);
            stackIn_3_0 = aj.a(var5, var4_int, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ch.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final ii a(op param0, int param1) {
        ii stackIn_3_0 = null;
        ir stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ir var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            var18 = this.field_h.a(49, param0);
            var4 = new ir(this.field_g, new nq(var18));
            this.field_k = var18.field_x;
            this.field_n = var18.field_J;
            var22 = var4.d(9);
            var6 = 17;
            var7 = 17;
            var8 = -1 + var6 >> -1048674911;
            var9 = -1 + var7 >> 1071393921;
            if (param1 == 3) {
              var10 = 0;
              L1: while (true) {
                if (var6 <= var10) {
                  stackIn_24_0 = (ir) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var11 = 0;
                  L2: while (true) {
                    if (var11 >= var7) {
                      var10++;
                      continue L1;
                    } else {
                      if ((var22[var10][var11] ^ -1) == -2) {
                        var12 = this.field_k + var10 + -var8;
                        var13 = var11 + -var9 + this.field_n;
                        if (var12 >= 0) {
                          if (var12 < param0.field_z) {
                            if (0 <= var13) {
                              if (param0.field_B > var13) {
                                L3: {
                                  var14 = param0.field_a[var12][var13];
                                  var15 = var14.field_l;
                                  if (var15 != null) {
                                    var16 = new iv(new nq(var15), false, 1, 0, 40);
                                    var4.field_o.a(var16, true);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                var11++;
                                continue L2;
                              } else {
                                var11++;
                                continue L2;
                              }
                            } else {
                              var11++;
                              continue L2;
                            }
                          } else {
                            var11++;
                            continue L2;
                          }
                        } else {
                          var11++;
                          continue L2;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("ch.A(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_24_0);
        }
    }

    final static int a(byte param0, int param1) {
        String var2 = lka.field_E[param1][14];
        var2 = var2.trim();
        var2 = var2.toLowerCase();
        if (param0 != 91) {
            return -119;
        }
        if (!(!var2.equals(""))) {
            return -1;
        }
        return ((ji) ((Object) i.field_h.a(true, (long)var2.hashCode()))).field_h;
    }

    public static void c(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 14) {
            ch.b(56);
        }
    }

    final static boolean b(int param0) {
        if (param0 <= 63) {
            field_q = (String) null;
        }
        return gfa.field_i;
    }

    final static rj a(boolean param0, lu param1) {
        RuntimeException var2 = null;
        lu var3 = null;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = (lu) null;
                ch.a(false, (lu) null);
                break L1;
              }
            }
            stackIn_3_0 = new rj(param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.a(3), param1.b(16711935));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ch.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    ch(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        field_q = "Previous";
    }
}
