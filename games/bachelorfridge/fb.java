/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends td {
    static int field_p;
    static kv field_r;
    static String field_q;

    public static void c(byte param0) {
        field_r = null;
        if (param0 != -91) {
            field_r = (kv) null;
        }
        field_q = null;
    }

    fb(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        fna stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        fna var4 = null;
        int[][] var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        ko var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        aga var15 = null;
        int[][] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var15 = this.field_h.a(40, param0);
            var4 = new fna(this.field_g, new nq(var15));
            var18 = new int[param0.g((byte) 79)][2];
            var16 = var18;
            var5 = var16;
            var6 = 0;
            var7_int = 0;
            L1: while (true) {
              if (param0.field_d <= var7_int) {
                var19 = new int[var18.length];
                var17 = var19;
                var7 = var17;
                var13 = 0;
                var8_int = var13;
                L2: while (true) {
                  if (var13 >= var19.length) {
                    var8 = new ko(new int[]{(int)f.b((byte) 73)});
                    var6 = 0;
                    var9 = 0;
                    L3: while (true) {
                      if (var19.length <= var9) {
                        L4: {
                          var9 = 0;
                          if (param1 == 3) {
                            break L4;
                          } else {
                            field_p = 40;
                            break L4;
                          }
                        }
                        L5: while (true) {
                          if (param0.field_d <= var9) {
                            stackIn_26_0 = (fna) (var4);
                            break L0;
                          } else {
                            var14 = 0;
                            var10 = var14;
                            L6: while (true) {
                              if (-8 >= (var14 ^ -1)) {
                                var9++;
                                continue L5;
                              } else {
                                L7: {
                                  if (!this.a(param0.field_S[var9].field_b[var14], -8, param0)) {
                                    break L7;
                                  } else {
                                    var4.field_o.a(new cn(new nq(param0.field_S[var9].field_b[var14]), var5[var19[var6]][0], var5[var19[var6]][1]), true);
                                    var6++;
                                    break L7;
                                  }
                                }
                                var14++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var10 = var8.a(-21000, var19.length);
                        var11 = var19[var10];
                        var7[var10] = var19[var9];
                        var19[var9] = var11;
                        var9++;
                        continue L3;
                      }
                    }
                  } else {
                    var19[var13] = var13;
                    var13++;
                    continue L2;
                  }
                }
              } else {
                var8_int = 0;
                L8: while (true) {
                  if (7 <= var8_int) {
                    var7_int++;
                    continue L1;
                  } else {
                    L9: {
                      if (this.a(param0.field_S[var7_int].field_b[var8_int], -8, param0)) {
                        var5[var6] = new int[]{param0.field_S[var7_int].field_b[var8_int].field_x, param0.field_S[var7_int].field_b[var8_int].field_J};
                        var6++;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var8_int++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("fb.A(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_26_0);
    }

    private final boolean a(aga param0, int param1, op param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (!param0.i(param1 + 116)) {
                if (param0.a(32, (byte) 60)) {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1 == -8) {
                    if (param2.b(false, param2.field_a[param0.field_x][param0.field_J].field_n) != -1) {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return true;
                    }
                  } else {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("fb.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_q = "***No Target!***";
    }
}
