/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_h;
    int field_g;
    private ad field_f;
    private of field_a;
    static String field_c;
    private Object[][] field_e;
    private Object[] field_d;
    boolean field_b;

    private final synchronized void a(int param0, int param1) {
        L0: {
          L1: {
            if (!this.field_b) {
              break L1;
            } else {
              this.field_d[param1] = this.field_a.a(param1, (byte) 91);
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_d[param1] = qk.a(this.field_a.a(param1, (byte) 91), -1389597532, false);
          break L0;
        }
        L2: {
          if (param0 == 20351) {
            break L2;
          } else {
            field_c = (String) null;
            break L2;
          }
        }
    }

    final synchronized boolean b(int param0, byte param1) {
        if (!this.a(param0, (byte) -83)) {
          return false;
        } else {
          if (this.field_d[param0] == null) {
            if (param1 == -106) {
              this.a(20351, param0);
              if (null != this.field_d[param0]) {
                return true;
              } else {
                return false;
              }
            } else {
              return ((boolean[]) (this.field_d[0]))[0];
            }
          } else {
            return true;
          }
        }
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!this.a((byte) 121)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_h = (String) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var4, 90));
              if (!this.a(var3_int, (byte) -83)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ji.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param1) {
              if (!this.a((byte) 121)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_f.field_e.a((byte) -68, ta.a(var6, -10));
                if (!this.a(var4_int, (byte) -83)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var7 = (CharSequence) ((Object) param0);
                  var5 = this.field_f.field_o[var4_int].a((byte) -68, ta.a(var7, 11));
                  stackOut_11_0 = this.a((byte) -84, var5, var4_int);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("ji.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final int b(int param0, int param1) {
        if (param0 != -5228) {
            return -48;
        }
        if (!(this.a(param1, (byte) -83))) {
            return 0;
        }
        return this.field_f.field_k[param1];
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        if (param0 < 125) {
            field_c = (String) null;
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_4_0 = false;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!this.a((byte) 121)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = -49 / ((param1 - 13) / 42);
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_f.field_e.a((byte) -68, ta.a(var5, -112));
              stackOut_4_0 = this.b(var4, (byte) -106);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("ji.K(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (this.a((byte) 121)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var4, 86));
              if (var3_int < param1) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("ji.W(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        wl var26 = null;
        byte[] var27 = null;
        wl var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        wl var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_12_0 = false;
        int[] stackIn_16_0 = null;
        int stackIn_25_0 = 0;
        int[] stackIn_27_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_126_0 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_26_0 = null;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_125_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        var22 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.a(param1, (byte) -83)) {
              if (null != this.field_d[param1]) {
                L1: {
                  var5_int = this.field_f.field_B[param1];
                  var34 = this.field_f.field_v[param1];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_e[param1] == null) {
                    array$2 = new Object[this.field_f.field_k[param1]];
                    this.field_e[param1] = array$2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param3 == 26687) {
                  var7 = this.field_e[param1];
                  var8 = 1;
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var9_int >= var5_int) {
                          break L4;
                        } else {
                          stackOut_15_0 = (int[]) (var6);
                          stackIn_27_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var22 != 0) {
                            break L3;
                          } else {
                            L5: {
                              L6: {
                                if (stackIn_16_0 != null) {
                                  break L6;
                                } else {
                                  var10 = var9_int;
                                  if (var22 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var10 = var34[var9_int];
                              break L5;
                            }
                            L7: {
                              if (var7[var10] != null) {
                                break L7;
                              } else {
                                var8 = 0;
                                if (var22 == 0) {
                                  break L4;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var9_int++;
                            continue L2;
                          }
                        }
                      }
                      if (var8 == 0) {
                        stackOut_26_0 = (int[]) (param0);
                        stackIn_27_0 = stackOut_26_0;
                        break L3;
                      } else {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                    L8: {
                      L9: {
                        if (stackIn_27_0 == null) {
                          break L9;
                        } else {
                          L10: {
                            if (param0[0] != 0) {
                              break L10;
                            } else {
                              if (param0[1] != 0) {
                                break L10;
                              } else {
                                if (param0[2] != 0) {
                                  break L10;
                                } else {
                                  if (0 == param0[3]) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          var35 = cf.a(true, 78, this.field_d[param1]);
                          var25 = var35;
                          var9_array = var25;
                          var26 = new wl(var35);
                          var26.a((byte) 51, 5, param0, var26.field_r.length);
                          break L8;
                        }
                      }
                      var9_array = cf.a(false, param3 ^ 26717, this.field_d[param1]);
                      break L8;
                    }
                    try {
                      L11: {
                        var36 = i.a(var9_array, -120);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_37_0 = (RuntimeException) (var11_ref_RuntimeException);
                        stackOut_37_1 = new StringBuilder();
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (param0 == null) {
                          stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                          stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
                          stackOut_39_2 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          break L12;
                        } else {
                          stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                          stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                          stackOut_38_2 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          break L12;
                        }
                      }
                      throw dh.a((Throwable) ((Object) stackIn_40_0), (stackIn_40_2 != 0) + " " + param1 + " " + param0.length + " " + tj.a(param0.length, 0, var9_array) + " " + tj.a(-2 + param0.length, 0, var9_array) + " " + this.field_f.field_c[param1] + " " + this.field_f.field_s);
                    }
                    L13: {
                      if (!this.field_b) {
                        break L13;
                      } else {
                        this.field_d[param1] = null;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        L16: {
                          if (-2 <= (var5_int ^ -1)) {
                            break L16;
                          } else {
                            L17: {
                              if (-3 == (this.field_g ^ -1)) {
                                break L17;
                              } else {
                                var11 = var36.length;
                                var11--;
                                var12 = var23[var11] & 255;
                                var11 = var11 - 4 * (var12 * var5_int);
                                var29 = new wl(var43);
                                var38 = new int[var5_int];
                                var30 = var38;
                                var14_ref_int__ = var30;
                                var29.field_n = var11;
                                var15 = 0;
                                L18: while (true) {
                                  L19: {
                                    if (var15 >= var12) {
                                      stackOut_55_0 = var5_int;
                                      stackIn_56_0 = stackOut_55_0;
                                      break L19;
                                    } else {
                                      var16 = 0;
                                      stackOut_47_0 = 0;
                                      stackIn_56_0 = stackOut_47_0;
                                      stackIn_48_0 = stackOut_47_0;
                                      if (var22 != 0) {
                                        break L19;
                                      } else {
                                        var17 = stackIn_48_0;
                                        L20: while (true) {
                                          L21: {
                                            if (var5_int <= var17) {
                                              var15++;
                                              break L21;
                                            } else {
                                              var16 = var16 + var29.i(7553);
                                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                              var17++;
                                              if (var22 != 0) {
                                                break L21;
                                              } else {
                                                continue L20;
                                              }
                                            }
                                          }
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                  var39 = new byte[stackIn_56_0][];
                                  var31 = var39;
                                  var15_ref_byte____ = var31;
                                  var16 = 0;
                                  L22: while (true) {
                                    L23: {
                                      if (var5_int <= var16) {
                                        var29.field_n = var11;
                                        var16 = 0;
                                        break L23;
                                      } else {
                                        array$3 = new byte[var38[var16]];
                                        var15_ref_byte____[var16] = array$3;
                                        var38[var16] = 0;
                                        var16++;
                                        if (var22 != 0) {
                                          break L23;
                                        } else {
                                          continue L22;
                                        }
                                      }
                                    }
                                    var17 = 0;
                                    L24: while (true) {
                                      L25: {
                                        if (var17 >= var12) {
                                          stackOut_72_0 = 0;
                                          stackIn_73_0 = stackOut_72_0;
                                          break L25;
                                        } else {
                                          var18 = 0;
                                          stackOut_64_0 = 0;
                                          stackIn_73_0 = stackOut_64_0;
                                          stackIn_65_0 = stackOut_64_0;
                                          if (var22 != 0) {
                                            break L25;
                                          } else {
                                            var19 = stackIn_65_0;
                                            L26: while (true) {
                                              L27: {
                                                if (var19 >= var5_int) {
                                                  var17++;
                                                  break L27;
                                                } else {
                                                  var18 = var18 + var29.i(7553);
                                                  an.a(var36, var16, var39[var19], var38[var19], var18);
                                                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                  var16 = var16 + var18;
                                                  var19++;
                                                  if (var22 != 0) {
                                                    break L27;
                                                  } else {
                                                    continue L26;
                                                  }
                                                }
                                              }
                                              continue L24;
                                            }
                                          }
                                        }
                                      }
                                      var17 = stackIn_73_0;
                                      L28: while (true) {
                                        if (var17 >= var5_int) {
                                          if (var22 == 0) {
                                            break L15;
                                          } else {
                                            break L17;
                                          }
                                        } else {
                                          if (var22 != 0) {
                                            break L15;
                                          } else {
                                            L29: {
                                              L30: {
                                                if (var6 != null) {
                                                  break L30;
                                                } else {
                                                  var18 = var17;
                                                  if (var22 == 0) {
                                                    break L29;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                              var18 = var34[var17];
                                              break L29;
                                            }
                                            L31: {
                                              L32: {
                                                if (this.field_g == 0) {
                                                  break L32;
                                                } else {
                                                  var7[var18] = var39[var17];
                                                  if (var22 == 0) {
                                                    break L31;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                              var7[var18] = qk.a(var39[var17], -1389597532, false);
                                              break L31;
                                            }
                                            var17++;
                                            continue L28;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var11 = var36.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - var12 * var5_int * 4;
                            var32 = new wl(var43);
                            var14 = 0;
                            var32.field_n = var11;
                            var15 = 0;
                            var16 = 0;
                            L33: while (true) {
                              L34: {
                                if (var12 <= var16) {
                                  stackOut_99_0 = var14 ^ -1;
                                  stackIn_100_0 = stackOut_99_0;
                                  break L34;
                                } else {
                                  var17 = 0;
                                  stackOut_87_0 = 0;
                                  stackIn_100_0 = stackOut_87_0;
                                  stackIn_88_0 = stackOut_87_0;
                                  if (var22 != 0) {
                                    break L34;
                                  } else {
                                    var18 = stackIn_88_0;
                                    L35: while (true) {
                                      L36: {
                                        if (var18 >= var5_int) {
                                          var16++;
                                          break L36;
                                        } else {
                                          var17 = var17 + var32.i(7553);
                                          if (var22 != 0) {
                                            break L36;
                                          } else {
                                            L37: {
                                              L38: {
                                                if (var6 == null) {
                                                  break L38;
                                                } else {
                                                  var19 = var34[var18];
                                                  if (var22 == 0) {
                                                    break L37;
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                              }
                                              var19 = var18;
                                              break L37;
                                            }
                                            L39: {
                                              if (param2 != var19) {
                                                break L39;
                                              } else {
                                                var15 = var19;
                                                var14 = var14 + var17;
                                                break L39;
                                              }
                                            }
                                            var18++;
                                            continue L35;
                                          }
                                        }
                                      }
                                      continue L33;
                                    }
                                  }
                                }
                              }
                              if (stackIn_100_0 != -1) {
                                var44 = new byte[var14];
                                var32.field_n = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L40: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = var44;
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    var19 = 0;
                                    stackOut_105_0 = 0;
                                    stackIn_126_0 = stackOut_105_0;
                                    stackIn_106_0 = stackOut_105_0;
                                    if (var22 != 0) {
                                      break L14;
                                    } else {
                                      var20 = stackIn_106_0;
                                      L41: while (true) {
                                        L42: {
                                          if (var20 >= var5_int) {
                                            var18++;
                                            break L42;
                                          } else {
                                            var19 = var19 + var32.i(param3 ^ 30142);
                                            if (var22 != 0) {
                                              break L42;
                                            } else {
                                              L43: {
                                                L44: {
                                                  if (var6 != null) {
                                                    break L44;
                                                  } else {
                                                    var21 = var20;
                                                    if (var22 == 0) {
                                                      break L43;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                                var21 = var34[var20];
                                                break L43;
                                              }
                                              L45: {
                                                if (var21 != param2) {
                                                  break L45;
                                                } else {
                                                  an.a(var43, var17, var44, var14, var19);
                                                  var14 = var14 + var19;
                                                  break L45;
                                                }
                                              }
                                              var17 = var17 + var19;
                                              var20++;
                                              continue L41;
                                            }
                                          }
                                        }
                                        continue L40;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_101_0 = 1;
                                stackIn_102_0 = stackOut_101_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        L46: {
                          L47: {
                            if (var6 == null) {
                              break L47;
                            } else {
                              var11 = var34[0];
                              if (var22 == 0) {
                                break L46;
                              } else {
                                break L47;
                              }
                            }
                          }
                          var11 = 0;
                          break L46;
                        }
                        L48: {
                          if (-1 != (this.field_g ^ -1)) {
                            break L48;
                          } else {
                            var7[var11] = qk.a(var36, -1389597532, false);
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L48;
                            }
                          }
                        }
                        var7[var11] = var36;
                        return true;
                      }
                      stackOut_125_0 = 1;
                      stackIn_126_0 = stackOut_125_0;
                      break L14;
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  stackOut_11_0 = ((boolean[]) (((Object[]) (this.field_d[3]))[13]))[3];
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L49: {
            var5 = decompiledCaughtException;
            stackOut_127_0 = (RuntimeException) (var5);
            stackOut_127_1 = new StringBuilder().append("ji.U(");
            stackIn_129_0 = stackOut_127_0;
            stackIn_129_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param0 == null) {
              stackOut_129_0 = (RuntimeException) ((Object) stackIn_129_0);
              stackOut_129_1 = (StringBuilder) ((Object) stackIn_129_1);
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L49;
            } else {
              stackOut_128_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackOut_128_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackOut_128_2 = "{...}";
              stackIn_130_0 = stackOut_128_0;
              stackIn_130_1 = stackOut_128_1;
              stackIn_130_2 = stackOut_128_2;
              break L49;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_130_0), stackIn_130_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_102_0 != 0;
                } else {
                  return stackIn_126_0 != 0;
                }
              }
            }
          }
        }
    }

    final synchronized int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        var5 = client.field_A ? 1 : 0;
        if (!this.a((byte) 121)) {
          return 0;
        } else {
          L0: {
            if (param0 <= -44) {
              break L0;
            } else {
              this.a(91, ((int[]) (((Object[]) (this.field_d[2]))[0]))[0]);
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_d.length <= var4) {
                  break L3;
                } else {
                  stackOut_7_0 = this.field_f.field_B[var4];
                  stackIn_12_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_8_0 <= 0) {
                        break L4;
                      } else {
                        var3 = var3 + this.a((byte) 34, var4);
                        var2 += 100;
                        break L4;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
            if (stackIn_12_0 == var2) {
              return 100;
            } else {
              var4 = 100 * var3 / var2;
              return var4;
            }
          }
        }
    }

    final synchronized boolean a(byte param0) {
        L0: {
          if (this.field_f != null) {
            break L0;
          } else {
            this.field_f = this.field_a.a(true);
            if (null == this.field_f) {
              return false;
            } else {
              this.field_e = new Object[this.field_f.field_n][];
              this.field_d = new Object[this.field_f.field_n];
              break L0;
            }
          }
        }
        if (param0 != 121) {
          return false;
        } else {
          return true;
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (this.a((byte) 121)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_e.a((byte) -68, ta.a(var6, 79));
              if (this.a(var4_int, (byte) -83)) {
                if (param0 == 0) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_f.field_o[var4_int].a((byte) -68, ta.a(var7, -112));
                  stackOut_9_0 = this.a(var5, 32, var4_int);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = (byte[]) null;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ji.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        int discarded$2 = 0;
        if (this.a((byte) 121)) {
          L0: {
            if (param2 == -33) {
              break L0;
            } else {
              discarded$2 = this.a((byte) 6, ((int[]) (this.field_d[0]))[26]);
              break L0;
            }
          }
          L1: {
            if ((param0 ^ -1) > -1) {
              break L1;
            } else {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (param0 >= this.field_f.field_k.length) {
                  break L1;
                } else {
                  if (this.field_f.field_k[param0] <= param1) {
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (cd.field_i) {
            throw new IllegalArgumentException(param0 + " " + param1);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4 = 118 / ((param1 - -44) / 62);
        return this.a(param0, (int[]) null, param2, (byte) -33);
    }

    final static String[] a(char param0, byte param1, String param2) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_15_0 = null;
        String[] stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 == 66) {
              var10 = (CharSequence) ((Object) param2);
              var3_int = wg.a(true, var10, param0);
              var4 = new String[1 + var3_int];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                L2: {
                  if (var7 >= var3_int) {
                    var4[var3_int] = param2.substring(var6);
                    break L2;
                  } else {
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var8 = var6;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (param2.charAt(var8) == param0) {
                              break L5;
                            } else {
                              var8++;
                              if (var9 != 0) {
                                break L4;
                              } else {
                                if (var9 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          incrementValue$2 = var5;
                          var5++;
                          var4[incrementValue$2] = param2.substring(var6, var8);
                          var6 = var8 + 1;
                          var7++;
                          break L4;
                        }
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_15_0 = (String[]) (var4);
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (String[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("ji.A(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_16_0;
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        L0: {
          if (param1 == -83) {
            break L0;
          } else {
            this.field_a = (of) (this.field_d[0]);
            break L0;
          }
        }
        if (this.a((byte) 121)) {
          L1: {
            if (-1 < (param0 ^ -1)) {
              break L1;
            } else {
              if (param0 >= this.field_f.field_k.length) {
                break L1;
              } else {
                if (-1 == (this.field_f.field_k[param0] ^ -1)) {
                  break L1;
                } else {
                  return true;
                }
              }
            }
          }
          if (!cd.field_i) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != pd.field_f) {
            var3 = pd.field_f.c(497, param2);
            if (-2 != var3) {
                if (!((var3 ^ -1) == 0)) {
                    var4 = pd.field_f.e(5658) ? 1 : 0;
                    sn.a(pd.field_f.field_Tb, param0, pd.field_f.g((byte) -96), 97, var4 != 0, var3);
                }
                pd.field_f = null;
                tf.i((byte) -76);
            }
        }
        if (param1 != 0) {
            field_c = (String) null;
        }
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.a(param0, (byte) -83)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 13030) {
                  break L1;
                } else {
                  this.field_d = new Object[6];
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var5 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_o[param0].a((byte) -68, ta.a(var5, -127));
              if (this.a(param0, var4_int, (byte) -33)) {
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ji.C(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void c(int param0, int param1) {
        uf var2 = we.field_b;
        var2.f(param0, param1 ^ -3);
        var2.a(true, param1);
        var2.a(true, 3);
    }

    final synchronized int a(byte param0, int param1) {
        if (!(this.a(param1, (byte) -83))) {
            return 0;
        }
        if (param0 != 34) {
            field_h = (String) null;
        }
        if (!(this.field_d[param1] == null)) {
            return 100;
        }
        return this.field_a.a(param1, param0 ^ -102);
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (this.a((byte) 121)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var5, -128));
              var4 = 39 / ((param0 - -55) / 53);
              stackOut_3_0 = this.a((byte) 34, var3_int);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ji.G(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (this.a(param2, param0, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (this.field_e[param2] == null) {
                    break L2;
                  } else {
                    if (this.field_e[param2][param0] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!this.a(param1, param2, param0, 26687)) {
                  this.a(20351, param2);
                  if (this.a(param1, param2, param0, param3 + 26720)) {
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (null != this.field_e[param2]) {
                L3: {
                  if (this.field_e[param2][param0] == null) {
                    break L3;
                  } else {
                    var7 = cf.a(false, 95, this.field_e[param2][param0]);
                    var5 = var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 != null) {
                    L5: {
                      if (-2 == (this.field_g ^ -1)) {
                        break L5;
                      } else {
                        if ((this.field_g ^ -1) == -3) {
                          this.field_e[param2] = null;
                          if (!client.field_A) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_e[param2][param0] = null;
                    if ((this.field_f.field_k[param2] ^ -1) == -2) {
                      this.field_e[param2] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("ji.AA(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return (byte[]) ((Object) stackIn_27_0);
        }
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        var5 = client.field_A ? 1 : 0;
        if (this.a((byte) 121)) {
          if (param0) {
            return true;
          } else {
            var2 = 1;
            var3 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var3 >= this.field_f.field_f.length) {
                    break L2;
                  } else {
                    stackOut_5_0 = this.field_f.field_f[var3];
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        var4 = stackIn_6_0;
                        if (this.field_d[var4] != null) {
                          break L3;
                        } else {
                          this.a(20351, var4);
                          if (null != this.field_d[var4]) {
                            break L3;
                          } else {
                            var2 = 0;
                            break L3;
                          }
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_10_0 = var2;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              }
              return stackIn_11_0 != 0;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        boolean discarded$2 = false;
        if (this.a(param2, param1, (byte) -33)) {
          L0: {
            if (null == this.field_e[param2]) {
              break L0;
            } else {
              if (this.field_e[param2][param1] != null) {
                return true;
              } else {
                break L0;
              }
            }
          }
          if (null == this.field_d[param2]) {
            this.a(20351, param2);
            if (null == this.field_d[param2]) {
              if (param0 >= -59) {
                discarded$2 = this.a(false);
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    ji(of param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_f = null;
        try {
          L0: {
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ji) (this)).field_b = stackIn_7_1 != 0;
                  this.field_a = param0;
                  this.field_g = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ji.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Offer rematch";
        field_h = "FINAL!";
    }
}
