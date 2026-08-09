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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) 121)) {
              stackIn_3_0 = -1;
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
                stackIn_9_0 = -1;
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ji.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              if (!this.a((byte) 121)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_f.field_e.a((byte) -68, ta.a(var6, -10));
                if (!this.a(var4_int, (byte) -83)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var7 = (CharSequence) ((Object) param0);
                  var5 = this.field_f.field_o[var4_int].a((byte) -68, ta.a(var7, 11));
                  stackIn_12_0 = this.a((byte) -84, var5, var4_int);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ji.N(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) 121)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = -49 / ((param1 - 13) / 42);
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_f.field_e.a((byte) -68, ta.a(var5, -112));
              stackIn_5_0 = this.b(var4, (byte) -106);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ji.K(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 121)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var4, 86));
              if (var3_int < param1) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
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
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ji.W(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        Object[] array$0 = null;
        byte[] array$1 = null;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14_ref_int__ = null;
        int var14 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.a(param1, (byte) -83)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (null != this.field_d[param1]) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var5_int = this.field_f.field_B[param1];
                        var34 = this.field_f.field_v[param1];
                        var24 = var34;
                        var6 = var24;
                        if (this.field_e[param1] == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        array$0 = new Object[this.field_f.field_k[param1]];
                        this.field_e[param1] = array$0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param3 == 26687) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = ((boolean[]) (((Object[]) (this.field_d[3]))[13]))[3];
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var7 = this.field_e[param1];
                        var8 = 1;
                        var9_int = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9_int >= var5_int) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_27_0 = (int[]) (var6);
                        stackIn_16_0 = stackIn_27_0;
                        if (var22 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = var9_int;
                        if (var22 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10 = var34[var9_int];
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7[var10] != null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = 0;
                        if (var22 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int++;
                        if (var22 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var8 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    try {
                        stackIn_27_0 = (int[]) (param0);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == null) {
                            statePc = 34;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param0[0] != 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param0[1] != 0) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param0[2] != 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (0 == param0[3]) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var35 = cf.a(true, 78, this.field_d[param1]);
                        var25 = var35;
                        var9 = var25;
                        var26 = new wl(var35);
                        var26.a((byte) 51, 5, param0, var26.field_r.length);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = cf.a(false, param3 ^ 26717, this.field_d[param1]);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var36 = i.a(var9, -120);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var11_ref_RuntimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_39_0 = (RuntimeException) (var11_ref_RuntimeException);
                        stackIn_38_0 = stackIn_39_0;
                        stackIn_39_1 = new StringBuilder();
                        stackIn_38_1 = stackIn_39_1;
                        if (param0 == null) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = (RuntimeException) ((Object) stackIn_38_0);
                        stackIn_40_1 = (StringBuilder) ((Object) stackIn_38_1);
                        stackIn_40_2 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                        stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                        stackIn_40_2 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw dh.a((Throwable) ((Object) stackIn_40_0), (stackIn_40_2 != 0) + " " + param1 + " " + param0.length + " " + tj.a(param0.length, 0, var9) + " " + tj.a(-2 + param0.length, 0, var9) + " " + this.field_f.field_c[param1] + " " + this.field_f.field_s);
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!this.field_b) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_d[param1] = null;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-2 <= (var5_int ^ -1)) {
                            statePc = 118;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-3 == (this.field_g ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
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
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var15 >= var12) {
                            statePc = 55;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var16 = 0;
                        stackIn_56_0 = 0;
                        stackIn_48_0 = stackIn_56_0;
                        if (var22 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var17 = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var5_int <= var17) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var16 = var16 + var29.i(7553);
                        var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                        var17++;
                        if (var22 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var22 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var15++;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var22 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_56_0 = var5_int;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var39 = new byte[stackIn_56_0][];
                        var31 = var39;
                        var15_ref_byte____ = var31;
                        var16 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var5_int <= var16) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        array$1 = new byte[var38[var16]];
                        var15_ref_byte____[var16] = array$1;
                        var38[var16] = 0;
                        var16++;
                        if (var22 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var22 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var29.field_n = var11;
                        var16 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var17 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var17 >= var12) {
                            statePc = 72;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var18 = 0;
                        stackIn_73_0 = 0;
                        stackIn_65_0 = stackIn_73_0;
                        if (var22 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var19 = stackIn_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var19 >= var5_int) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var18 = var18 + var29.i(7553);
                        an.a(var36, var16, var39[var19], var38[var19], var18);
                        var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                        var16 = var16 + var18;
                        var19++;
                        if (var22 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var22 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var17++;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var22 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var17 = stackIn_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var17 >= var5_int) {
                            statePc = 84;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var22 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var6 != null) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var18 = var17;
                        if (var22 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var18 = var34[var17];
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (this.field_g == 0) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var7[var18] = var39[var17];
                        if (var22 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var7[var18] = qk.a(var39[var17], -1389597532, false);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var17++;
                        if (var22 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var22 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var11 = var36.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - var12 * var5_int * 4;
                        var32 = new wl(var43);
                        var14 = 0;
                        var32.field_n = var11;
                        var15 = 0;
                        var16 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var12 <= var16) {
                            statePc = 99;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var17 = 0;
                        stackIn_100_0 = 0;
                        stackIn_88_0 = stackIn_100_0;
                        if (var22 != 0) {
                            statePc = 100;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var18 = stackIn_88_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var18 >= var5_int) {
                            statePc = 97;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var17 = var17 + var32.i(7553);
                        if (var22 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var6 == null) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var19 = var34[var18];
                        if (var22 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var19 = var18;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (param2 != var19) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var15 = var19;
                        var14 = var14 + var17;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var18++;
                        if (var22 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var16++;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var22 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackIn_100_0 = var14 ^ -1;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 != -1) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = 1;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 102: {
                    return stackIn_102_0 != 0;
                }
                case 103: {
                    try {
                        var44 = new byte[var14];
                        var32.field_n = var11;
                        var14 = 0;
                        var17 = 0;
                        var18 = 0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var18 >= var12) {
                            statePc = 117;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var19 = 0;
                        stackIn_126_0 = 0;
                        stackIn_106_0 = stackIn_126_0;
                        if (var22 != 0) {
                            statePc = 126;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var20 = stackIn_106_0;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var20 >= var5_int) {
                            statePc = 115;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var19 = var19 + var32.i(param3 ^ 30142);
                        if (var22 != 0) {
                            statePc = 116;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var6 != null) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var21 = var20;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var21 = var34[var20];
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var21 != param2) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        an.a(var43, var17, var44, var14, var19);
                        var14 = var14 + var19;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var17 = var17 + var19;
                        var20++;
                        if (var22 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var18++;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var22 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var7[var15] = var44;
                        if (var22 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (var6 == null) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var11 = var34[0];
                        if (var22 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var11 = 0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (-1 != (this.field_g ^ -1)) {
                            statePc = 124;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var7[var11] = qk.a(var36, -1389597532, false);
                        if (var22 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var7[var11] = var36;
                        return true;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackIn_126_0 = 1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 126: {
                    return stackIn_126_0 != 0;
                }
                case 127: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_129_0 = (RuntimeException) (var5);
                    stackIn_128_0 = stackIn_129_0;
                    stackIn_129_1 = new StringBuilder().append("ji.U(");
                    stackIn_128_1 = stackIn_129_1;
                    if (param0 == null) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_130_0 = (RuntimeException) ((Object) stackIn_128_0);
                    stackIn_130_1 = (StringBuilder) ((Object) stackIn_128_1);
                    stackIn_130_2 = "{...}";
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    stackIn_130_0 = (RuntimeException) ((Object) stackIn_129_0);
                    stackIn_130_1 = (StringBuilder) ((Object) stackIn_129_1);
                    stackIn_130_2 = "null";
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    throw dh.a((Throwable) ((Object) stackIn_130_0), stackIn_130_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized int b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_12_0 = 0;
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
                  stackIn_12_0 = this.field_f.field_B[var4];

                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_12_0 <= 0) {
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
              stackIn_12_0 = 0;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_10_0 = this.a(var5, 32, var4_int);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ji.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
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
        if (this.a((byte) 121)) {
          L0: {
            if (param2 == -33) {
              break L0;
            } else {
              this.a((byte) 6, ((int[]) (this.field_d[0]))[26]);
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
        int incrementValue$1 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 66) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (String[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var10 = (CharSequence) ((Object) param2);
                        var3_int = wg.a(true, var10, param0);
                        var4 = new String[1 + var3_int];
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 >= var3_int) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var9 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = var6;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param2.charAt(var8) == param0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8++;
                        if (var9 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$1] = param2.substring(var6, var8);
                        var6 = var8 + 1;
                        var7++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4[var3_int] = param2.substring(var6);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = (String[]) (var4);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var3);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("ji.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param2 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(param0, (byte) -83)) {
              stackIn_3_0 = -1;
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
                stackIn_10_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ji.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 121)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var5, -128));
              var4 = 39 / ((param0 - -55) / 53);
              stackIn_4_0 = this.a((byte) 34, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ji.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
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
                stackIn_27_0 = var5;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = var5;

            stackIn_30_1 = new StringBuilder().append("ji.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
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
        int stackIn_11_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
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
                    stackIn_11_0 = this.field_f.field_f[var3];

                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        var4 = stackIn_11_0;
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
                stackIn_11_0 = var2;
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
                this.a(false);
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
        this.field_f = null;
        try {
            if (-1 < (param2 ^ -1) || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_b = param1 ? true : false;
            this.field_a = param0;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ji.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Offer rematch";
        field_h = "FINAL!";
    }
}
