/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    int field_b;
    static ip field_n;
    static String[][] field_m;
    boolean field_j;
    private Object[][] field_l;
    private Object[] field_g;
    private be field_k;
    static String field_c;
    private ng field_a;
    static String field_i;
    static String field_d;
    static String field_h;
    static boolean field_e;
    static ri field_f;

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -120)) {
              L1: {
                param0 = param0.toLowerCase();
                param1 = param1.toLowerCase();
                var6 = (CharSequence) ((Object) param0);
                var4_int = this.field_k.field_d.a(1481485697, kd.a(var6, -79));
                if (!param2) {
                  break L1;
                } else {
                  ul.b(((byte[]) (this.field_g[3]))[9]);
                  break L1;
                }
              }
              if (this.b(var4_int, -120)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_k.field_n[var4_int].a(1481485697, kd.a(var7, -93));
                stackIn_9_0 = this.a(var4_int, true, var5);
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ul.V(");

            if (param0 == null) {
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
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -110)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  this.field_l = (Object[][]) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, -53));
              stackIn_7_0 = this.a(-126, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ul.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(param1, 101))) {
            return false;
        }
        if (this.field_g[param1] != null) {
            return true;
        }
        this.c(-127, param1);
        if (param0 > -118) {
            return false;
        }
        if (this.field_g[param1] == null) {
            return false;
        }
        return true;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param0, 6327, param1)) {
            return false;
        }
        if (param2 != 0) {
            return false;
        }
        if (null != this.field_l[param1] && null != this.field_l[param1][param0]) {
            return true;
        }
        if (!(null == this.field_g[param1])) {
            return true;
        }
        this.c(-113, param1);
        if (null == this.field_g[param1]) {
            return false;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        L0: {
          L1: {
            if (this.field_j) {
              break L1;
            } else {
              this.field_g[param1] = ai.a(-137, false, this.field_a.a(-123, param1));
              if (!ZombieDawnMulti.field_E) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_g[param1] = this.field_a.a(-123, param1);
          break L0;
        }
        L2: {
          if (param0 < -85) {
            break L2;
          } else {
            this.field_k = (be) null;
            break L2;
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_h = null;
        if (param0 != -35) {
            ul.b((byte) -55);
        }
        field_m = (String[][]) null;
        field_n = null;
        field_f = null;
        field_d = null;
        field_i = null;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        byte[] stackIn_20_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(param1, param2 ^ -31366, param0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (this.field_l[param0] == null) {
                    break L2;
                  } else {
                    if (null == this.field_l[param0][param1]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(param0, true, param3, param1)) {
                  break L1;
                } else {
                  this.c(-101, param0);
                  if (this.a(param0, true, param3, param1)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_l[param0] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null != this.field_l[param0][param1]) {
                    var7 = h.a(this.field_l[param0][param1], -110, false);
                    var5 = var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (param2 == -25139) {
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (1 != this.field_b) {
                          break L5;
                        } else {
                          this.field_l[param0][param1] = null;
                          if ((this.field_k.field_b[param0] ^ -1) != -2) {
                            break L4;
                          } else {
                            this.field_l[param0] = null;
                            if (!ZombieDawnMulti.field_E) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (2 != this.field_b) {
                        break L4;
                      } else {
                        this.field_l[param0] = null;
                        break L4;
                      }
                    }
                  }
                  stackIn_29_0 = var5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_20_0 = (byte[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = var5;

            stackIn_32_1 = new StringBuilder().append("ul.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L6;
            } else {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return (byte[]) ((Object) stackIn_29_0);
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_54_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_115_0 = 0;
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
        int var14_int = 0;
        int[] var14 = null;
        int var15_int = 0;
        byte[][] var15 = null;
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
        k var26 = null;
        byte[] var27 = null;
        k var29 = null;
        k var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.b(param0, -116)) {
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
                        if (this.field_g[param0] != null) {
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
                        var5_int = this.field_k.field_s[param0];
                        var34 = this.field_k.field_i[param0];
                        var24 = var34;
                        var6 = var24;
                        if (null == this.field_l[param0]) {
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
                        array$0 = new Object[this.field_k.field_b[param0]];
                        this.field_l[param0] = array$0;
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
                        var7 = this.field_l[param0];
                        var8 = param1 ? 1 : 0;
                        var9_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var9_int ^ -1) <= (var5_int ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var22 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = var9_int;
                        if (var22 == 0) {
                            statePc = 16;
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
                        var10 = var34[var9_int];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null != var7[var10]) {
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
                        var8 = 0;
                        if (var22 == 0) {
                            statePc = 20;
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
                        var9_int++;
                        if (var22 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var8 != 0) {
                            statePc = 22;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    try {
                        if (param2 == null) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 != param2[0]) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1 != (param2[1] ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((param2[2] ^ -1) != -1) {
                            statePc = 30;
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
                        if (-1 == (param2[3] ^ -1)) {
                            statePc = 31;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var35 = h.a(this.field_g[param0], -42, true);
                        var25 = var35;
                        var9 = var25;
                        var26 = new k(var35);
                        var26.a(var26.field_m.length, param2, -2564, 5);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = h.a(this.field_g[param0], -124, false);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var36 = hb.a(var9, 0);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11_ref_RuntimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_36_0 = (RuntimeException) (var11_ref_RuntimeException);
                        stackIn_35_0 = stackIn_36_0;
                        stackIn_36_1 = new StringBuilder();
                        stackIn_35_1 = stackIn_36_1;
                        if (param2 == null) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackIn_37_2 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                        stackIn_37_2 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw fa.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param0 + " " + param2.length + " " + pb.a(var9, param2.length, (byte) -42) + " " + pb.a(var9, -2 + param2.length, (byte) 109) + " " + this.field_k.field_r[param0] + " " + this.field_k.field_o);
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (this.field_j) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_g[param0] = null;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-2 > (var5_int ^ -1)) {
                            statePc = 50;
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
                        if (var6 == null) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = var34[0];
                        if (var22 == 0) {
                            statePc = 45;
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
                        var11 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((this.field_b ^ -1) != -1) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7[var11] = ai.a(-137, false, var36);
                        if (var22 == 0) {
                            statePc = 49;
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
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7[var11] = var36;
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
                        if (var22 == 0) {
                            statePc = 125;
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
                        if (this.field_b != 2) {
                            statePc = 87;
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
                        var11 = var36.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - var12 * (var5_int * 4);
                        var29 = new k(var43);
                        var14_int = 0;
                        var15_int = 0;
                        var29.field_j = var11;
                        var16 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var16 >= var12) {
                            statePc = 66;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var17 = 0;
                        stackIn_67_0 = 0;
                        stackIn_54_0 = stackIn_67_0;
                        if (var22 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var18 = stackIn_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var5_int ^ -1) >= (var18 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var17 = var17 + var29.i(-1478490344);
                        if (var22 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var6 != null) {
                            statePc = 59;
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
                        var19 = var18;
                        if (var22 == 0) {
                            statePc = 60;
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
                        var19 = var34[var18];
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var19 == param3) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var14_int = var14_int + var17;
                        var15_int = var19;
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
                        var18++;
                        if (var22 == 0) {
                            statePc = 55;
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
                        var16++;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var22 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 == var14_int) {
                            statePc = 69;
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
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_70_0 = 1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 70: {
                    return stackIn_70_0 != 0;
                }
                case 71: {
                    try {
                        var44 = new byte[var14_int];
                        var29.field_j = var11;
                        var14_int = 0;
                        var17 = 0;
                        var18 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var18 >= var12) {
                            statePc = 86;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var19 = 0;
                        stackIn_126_0 = 0;
                        stackIn_74_0 = stackIn_126_0;
                        if (var22 != 0) {
                            statePc = 126;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var20 = stackIn_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((var20 ^ -1) <= (var5_int ^ -1)) {
                            statePc = 84;
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
                        var19 = var19 + var29.i(-1478490344);
                        if (var22 != 0) {
                            statePc = 85;
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
                        if (var6 != null) {
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
                        var21 = var20;
                        if (var22 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var21 = var34[var20];
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var21 == param3) {
                            statePc = 82;
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
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        d.a(var43, var17, var44, var14_int, var19);
                        var14_int = var14_int + var19;
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
                        var17 = var17 + var19;
                        var20++;
                        if (var22 == 0) {
                            statePc = 75;
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
                        var18++;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var22 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var7[var15_int] = var44;
                        if (var22 == 0) {
                            statePc = 125;
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
                        var11 = var36.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - 4 * var12 * var5_int;
                        var31 = new k(var43);
                        var39 = new int[var5_int];
                        var32 = var39;
                        var14 = var32;
                        var31.field_j = var11;
                        var15_int = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((var12 ^ -1) >= (var15_int ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var16 = 0;
                        stackIn_98_0 = 0;
                        stackIn_90_0 = stackIn_98_0;
                        if (var22 != 0) {
                            statePc = 98;
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
                        var17 = stackIn_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var5_int <= var17) {
                            statePc = 95;
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
                        var16 = var16 + var31.i(-1478490344);
                        var14[var17] = var14[var17] + var16;
                        var17++;
                        if (var22 != 0) {
                            statePc = 96;
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
                        if (var22 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var15_int++;
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
                        if (var22 == 0) {
                            statePc = 88;
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
                        stackIn_98_0 = var5_int;
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
                        var40 = new byte[stackIn_98_0][];
                        var33 = var40;
                        var15 = var33;
                        var16 = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var16 >= var5_int) {
                            statePc = 103;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        array$1 = new byte[var39[var16]];
                        var15[var16] = array$1;
                        var39[var16] = 0;
                        var16++;
                        if (var22 != 0) {
                            statePc = 104;
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
                        if (var22 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var31.field_j = var11;
                        var16 = 0;
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
                        var17 = 0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if ((var12 ^ -1) >= (var17 ^ -1)) {
                            statePc = 114;
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
                        var18 = 0;
                        stackIn_115_0 = 0;
                        stackIn_107_0 = stackIn_115_0;
                        if (var22 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var19 = stackIn_107_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if ((var19 ^ -1) <= (var5_int ^ -1)) {
                            statePc = 112;
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
                        var18 = var18 + var31.i(-1478490344);
                        d.a(var36, var16, var40[var19], var39[var19], var18);
                        var16 = var16 + var18;
                        var14[var19] = var14[var19] + var18;
                        var19++;
                        if (var22 != 0) {
                            statePc = 113;
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
                        if (var22 == 0) {
                            statePc = 108;
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
                        var17++;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var22 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackIn_115_0 = 0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var17 = stackIn_115_0;
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
                        if (var17 >= var5_int) {
                            statePc = 125;
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
                        if (var6 != null) {
                            statePc = 119;
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
                        var18 = var17;
                        if (var22 == 0) {
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
                        var18 = var34[var17];
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (this.field_b != 0) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var7[var18] = ai.a(-137, false, var40[var17]);
                        if (var22 == 0) {
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
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var7[var18] = var40[var17];
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
                        var17++;
                        if (var22 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
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
                    stackIn_129_1 = new StringBuilder().append("ul.M(").append(param0).append(',').append(param1).append(',');
                    stackIn_128_1 = stackIn_129_1;
                    if (param2 == null) {
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
                    throw fa.a((Throwable) ((Object) stackIn_130_0), stackIn_130_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.a((byte) -115)) {
          return 0;
        } else {
          var2 = 0;
          var3 = param0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_g.length <= var4) {
                  break L2;
                } else {
                  stackIn_10_0 = -1;

                  stackIn_10_1 = this.field_k.field_s[var4] ^ -1;

                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_10_0 <= stackIn_10_1) {
                        break L3;
                      } else {
                        var2 += 100;
                        var3 = var3 + this.a(var4, (byte) 120);
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_10_0 = -1;
              stackIn_10_1 = var2 ^ -1;
              break L1;
            }
            if (stackIn_10_0 == stackIn_10_1) {
              return 100;
            } else {
              var4 = var3 * 100 / var2;
              return var4;
            }
          }
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -109)) {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_k.field_d.a(1481485697, kd.a(var5, -37));
              if (!this.b(var3_int, -114)) {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = 7 % ((54 - param1) / 51);
                stackIn_8_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ul.P(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -115)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 0) {
                  break L1;
                } else {
                  this.field_a = (ng) (this.field_g[27]);
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, param0 + -17));
              stackIn_7_0 = this.a(var3_int, (byte) 125);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ul.W(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int c(int param0) {
        if (param0 != -1) {
            return 115;
        }
        if (!(this.a((byte) -108))) {
            return -1;
        }
        return this.field_k.field_b.length;
    }

    final int d(int param0, int param1) {
        if (!this.b(param0, param1 ^ -16)) {
            return 0;
        }
        if (param1 != -2) {
            this.c(((int[]) (((Object[]) (this.field_g[7]))[9]))[0], ((int[]) (this.field_g[0]))[2]);
        }
        return this.field_k.field_b[param0];
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -107) {
            return false;
        }
        if (null == this.field_k) {
            this.field_k = this.field_a.a((byte) -106);
            if (this.field_k == null) {
                return false;
            }
            this.field_l = new Object[this.field_k.field_e][];
            this.field_g = new Object[this.field_k.field_e];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_11_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.a((byte) -109)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= this.field_k.field_l.length) {
                  break L2;
                } else {
                  stackIn_11_0 = this.field_k.field_l[var3];

                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      var4 = stackIn_11_0;
                      if (null == this.field_g[var4]) {
                        this.c(-91, var4);
                        if (null != this.field_g[var4]) {
                          break L3;
                        } else {
                          var2 = 0;
                          break L3;
                        }
                      } else {
                        break L3;
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
        } else {
          return false;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a((byte) -116)) {
          return false;
        } else {
          L0: {
            if ((param2 ^ -1) > -1) {
              break L0;
            } else {
              if ((param0 ^ -1) > -1) {
                break L0;
              } else {
                if (param2 >= this.field_k.field_b.length) {
                  break L0;
                } else {
                  if (this.field_k.field_b[param2] <= param0) {
                    break L0;
                  } else {
                    if (param1 == 6327) {
                      return true;
                    } else {
                      return ((boolean[]) (this.field_g[17]))[2];
                    }
                  }
                }
              }
            }
          }
          if (em.field_P) {
            throw new IllegalArgumentException(param2 + " " + param0);
          } else {
            return false;
          }
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        int var3;
        if (!this.a((byte) -111)) {
          return false;
        } else {
          L0: {
            if ((param0 ^ -1) > -1) {
              break L0;
            } else {
              if (param0 >= this.field_k.field_b.length) {
                break L0;
              } else {
                if (-1 == (this.field_k.field_b[param0] ^ -1)) {
                  break L0;
                } else {
                  var3 = -116 / ((param1 - -61) / 53);
                  return true;
                }
              }
            }
          }
          if (!em.field_P) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
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
            if (!this.a((byte) -118)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_k.field_d.a(1481485697, kd.a(var6, 121));
              if (!this.b(var4_int, 10)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 < -23) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_k.field_n[var4_int].a(1481485697, kd.a(var7, 125));
                  stackIn_12_0 = this.b(var5, var4_int, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ul.R(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -112)) {
              L1: {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, param1 ^ -81));
                if (param1 == 2) {
                  break L1;
                } else {
                  ((long[]) (this.field_g[1]))[15] = 4L;
                  break L1;
                }
              }
              if ((var3_int ^ -1) > -1) {
                stackIn_8_0 = 0;
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ul.G(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final synchronized byte[] a(byte param0, int param1) {
        if (param0 != -77) {
            ul.b((byte) -63);
        }
        if (!this.a((byte) -128)) {
            return null;
        }
        if (!(this.field_k.field_b.length != 1)) {
            return this.a(0, true, param1);
        }
        if (!this.b(param1, -123)) {
            return null;
        }
        if (this.field_k.field_b[param1] == 1) {
            return this.a(param1, true, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0, byte param1) {
        if (!(this.b(param0, 55))) {
            return 0;
        }
        if (null != this.field_g[param0]) {
            return 100;
        }
        if (param1 < 96) {
            this.field_b = ((int[]) (this.field_g[16]))[7];
        }
        return this.field_a.b(param0, -3);
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param1, param2 + -117)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  ((boolean[]) (this.field_g[0]))[27] = true;
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param0);
              var4_int = this.field_k.field_n[param1].a(param2 ^ -1481485698, kd.a(var5, param2 + 126));
              if (!this.a(var4_int, 6327, param1)) {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var4_int;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ul.U(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.b(((int[]) (this.field_g[0]))[5]);
        }
        return this.a(param0, param2, -25139, (int[]) null);
    }

    ul(ng param0, boolean param1, int param2) {
        this.field_k = null;
        try {
            if (0 > param2 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_a = param0;
            this.field_j = param1 ? true : false;
            this.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Your zombies won't wander about if you train them to focus.";
        field_i = "Your hordes will move as fast as lightning...especially if you also equip Determined.";
        field_n = new ip();
        field_d = "Detonate";
        field_h = "Starve your zombies before unleashing them on humans! They'll lunge even faster and from further away than with Hungry.";
    }
}
