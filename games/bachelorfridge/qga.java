/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga extends td {
    static String field_q;
    static kv field_r;
    static int[] field_p;
    static String field_s;

    qga(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qga.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(op param0, int param1, aga param2, ct param3, byte param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var8_int = 0;
            L1: while (true) {
              if (param6 <= var8_int) {
                if (param4 == -90) {
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                if (this.a(param1 + -var8_int, param5 - param6 - -var8_int, param2, true, param3, param0)) {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (this.a(param1 - -var8_int, param6 + (param5 - var8_int), param2, true, param3, param0)) {
                    stackIn_10_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!this.a(-param6 + (param1 - -var8_int), var8_int + param5, param2, true, param3, param0)) {
                      if (!this.a(param1 - -param6 - var8_int, -var8_int + param5, param2, true, param3, param0)) {
                        var8_int++;
                        continue L1;
                      } else {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8);

            stackIn_25_1 = new StringBuilder().append("qga.E(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0 != 0;
                } else {
                  return stackIn_22_0 != 0;
                }
              }
            }
          }
        }
    }

    private final boolean a(op param0, int param1, int param2, aga param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param2 ^ -1) > -1) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 < param0.field_z) {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (param1 < param0.field_B) {
                      if (param3.a(param0.field_a[param2][param1].field_n, false)) {
                        if (null == param0.field_a[param2][param1].field_l) {
                          var6_int = 24 % ((-15 - param4) / 32);
                          stackIn_17_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          stackIn_15_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("qga.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                return stackIn_17_0 != 0;
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, aga param2, boolean param3, ct param4, op param5) {
        RuntimeException var7 = null;
        op var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(param5, param0, param1, param2, 79)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3) {
                  break L1;
                } else {
                  var8 = (op) null;
                  this.a((op) null, 4);
                  break L1;
                }
              }
              param4.field_o.a(new bj(new nq(param2), param1, param0), param3);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("qga.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final ii a(op param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        ct var4 = null;
        aga var5 = null;
        int var6 = 0;
        iv var7 = null;
        int var8 = 0;
        aga var9 = null;
        aga var10 = null;
        ew stackIn_7_0 = null;
        ct stackIn_13_0 = null;
        ct stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var10 = this.field_h.a(77, param0);
              var4 = new ct(this.field_g, new nq(var10));
              if (param1 == 3) {
                break L1;
              } else {
                var9 = (aga) null;
                discarded$1 = this.a((op) null, -99, -115, (aga) null, -106);
                break L1;
              }
            }
            L2: {
              var5 = this.field_j.a(79, param0);
              if (var5 == null) {
                break L2;
              } else {
                if (var5.i(param1 + -109)) {
                  break L2;
                } else {
                  var6 = 1;
                  L3: while (true) {
                    if (8 <= var6) {
                      stackIn_16_0 = (ct) (var4);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (this.a(param0, var10.field_J, var5, var4, (byte) -90, var10.field_x, var6)) {
                        var7 = new iv(this.field_j, false, 1, 20, 0);
                        var4.field_o.a(var7, true);
                        stackIn_13_0 = (ct) (var4);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            stackIn_7_0 = new ew(new nq(var10));
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("qga.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ii) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ii) ((Object) stackIn_13_0);
          } else {
            return (ii) ((Object) stackIn_16_0);
          }
        }
    }

    public static void c(byte param0) {
        field_s = null;
        field_r = null;
        field_p = null;
        if (param0 >= -42) {
            field_r = (kv) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    static {
        field_q = "<%0> is not on your friend list.";
        field_s = "Delete";
        field_p = new int[]{50, 7, 7, 5, 6, 6, 6, 7, 6};
    }
}
