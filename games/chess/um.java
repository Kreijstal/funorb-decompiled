/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static int[] field_j;
    boolean field_k;
    private Object[] field_m;
    int field_f;
    static km field_c;
    private ua field_i;
    private lj field_d;
    private Object[][] field_e;
    static String field_h;
    static wf field_b;
    static jk field_g;
    static int field_a;
    static lm[] field_l;

    public static void d() {
        field_b = null;
        field_g = null;
        field_l = null;
        field_j = null;
        field_h = null;
        field_c = null;
    }

    final static void a() {
        in.field_a = false;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (param0 != 0) {
            ((byte[]) ((um) this).field_m[8])[0] = ((byte[]) ((Object[]) ((um) this).field_m[5])[10])[18];
        }
        if (!((um) this).c((byte) 127)) {
            return false;
        }
        if (param1 >= 0) {
            if (((um) this).field_d.field_o.length > param1) {
                if (((um) this).field_d.field_o[param1] != 0) {
                    return true;
                }
            }
        }
        if (!om.field_j) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final int a(boolean param0) {
        if (param0) {
            field_b = null;
        }
        if (!((um) this).c((byte) 126)) {
            return -1;
        }
        return ((um) this).field_d.field_o.length;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_4_0 = null;
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
            if (((um) this).c((byte) 119)) {
              if (param1 == 30045) {
                param0 = param0.toLowerCase();
                param2 = param2.toLowerCase();
                var6 = (CharSequence) (Object) param0;
                var4_int = ((um) this).field_d.field_e.a(ga.a((byte) -75, var6), (byte) 17);
                if (this.b(0, var4_int)) {
                  var7 = (CharSequence) (Object) param2;
                  var5 = ((um) this).field_d.field_j[var4_int].a(ga.a((byte) -106, var7), (byte) 17);
                  stackOut_9_0 = ((um) this).a(var4_int, var5, 5847);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("um.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        if (((um) this).c((byte) 122)) {
          L0: {
            var2 = 0;
            if (param0 <= -53) {
              break L0;
            } else {
              boolean discarded$2 = ((um) this).a((byte) -102, ((int[]) ((um) this).field_m[4])[2], ((int[]) ((Object[]) ((Object[]) ((um) this).field_m[3])[13])[0])[13]);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((um) this).field_m.length <= var4) {
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (0 < ((um) this).field_d.field_l[var4]) {
                var3 = var3 + ((um) this).c(var4, -91);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return 0;
        }
    }

    private final synchronized byte[] a(boolean param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_9_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (this.b(param3, param2, 0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((um) this).field_e[param3] == null) {
                    break L2;
                  } else {
                    if (null == ((um) this).field_e[param3][param2]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(param1, 123, param2, param3)) {
                  break L1;
                } else {
                  this.a(param3, 11076);
                  if (this.a(param1, -41, param2, param3)) {
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (byte[]) (Object) stackIn_9_0;
                  }
                }
              }
              if (((um) this).field_e[param3] != null) {
                L3: {
                  if (((um) this).field_e[param3][param2] == null) {
                    break L3;
                  } else {
                    var7 = jf.a(false, false, ((um) this).field_e[param3][param2]);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((um) this).field_f != 1) {
                      if (((um) this).field_f == 2) {
                        ((um) this).field_e[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      ((um) this).field_e[param3][param2] = null;
                      if (1 != ((um) this).field_d.field_o[param3]) {
                        break L4;
                      } else {
                        ((um) this).field_e[param3] = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_22_0 = var5;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_24_0 = var5;
            stackOut_24_1 = new StringBuilder().append("um.R(").append(true).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_23_0;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((um) this).c((byte) 127)) {
              if (param1 == 100) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -110, var4), (byte) 17);
                stackOut_6_0 = ((um) this).a(var3_int, (byte) -72);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("um.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.b(param1, param2, 0)) {
            return false;
        }
        int var4 = 124 % ((14 - param0) / 54);
        if (null != ((um) this).field_e[param1]) {
            if (!(((um) this).field_e[param1][param2] == null)) {
                return true;
            }
        }
        if (null != ((um) this).field_m[param1]) {
            return true;
        }
        this.a(param1, 11076);
        if (null != ((um) this).field_m[param1]) {
            return true;
        }
        return false;
    }

    final synchronized int c(int param0, int param1) {
        if (param1 > -27) {
            return 121;
        }
        if (!(this.b(0, param0))) {
            return 0;
        }
        if (!(((um) this).field_m[param0] == null)) {
            return 100;
        }
        return ((um) this).field_i.b(110, param0);
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((um) this).c((byte) 124)) {
              if (param0 == 4) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -100, var4), (byte) 17);
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("um.G(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.b(0, param0)) {
            return false;
        }
        if (!(null == ((um) this).field_m[param0])) {
            return true;
        }
        this.a(param0, 11076);
        if (((um) this).field_m[param0] != null) {
            return true;
        }
        if (param1 != -72) {
            ((byte[]) ((um) this).field_m[1])[3] = ((byte[]) ((Object[]) ((um) this).field_m[20])[2])[19];
            return false;
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 5847) {
            field_l = (lm[]) ((um) this).field_m[2];
        }
        return this.a(true, (int[]) null, param1, param0);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        p var10 = null;
        byte[] var10_array = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        p var14 = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17_int = 0;
        byte[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var23 = Chess.field_G;
        try {
          L0: {
            if (this.b(0, param3)) {
              if (((um) this).field_m[param3] != null) {
                L1: {
                  var5_int = ((um) this).field_d.field_l[param3];
                  var6 = ((um) this).field_d.field_h[param3];
                  if (((um) this).field_e[param3] != null) {
                    break L1;
                  } else {
                    ((um) this).field_e[param3] = new Object[((um) this).field_d.field_o[param3]];
                    break L1;
                  }
                }
                var7 = ((um) this).field_e[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (~var9_int <= ~var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10_int = var6[var9_int];
                          break L4;
                        } else {
                          var10_int = var9_int;
                          break L4;
                        }
                      }
                      if (null == var7[var10_int]) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param0 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param0[0]) {
                              break L7;
                            } else {
                              if (0 != param0[1]) {
                                break L7;
                              } else {
                                if (param0[2] != 0) {
                                  break L7;
                                } else {
                                  if (param0[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = jf.a(true, false, ((um) this).field_m[param3]);
                          var10 = new p(var9_array);
                          var10.a(5, param0, (byte) -67, var10.field_o.length);
                          break L5;
                        }
                      }
                      var9_array = jf.a(false, false, ((um) this).field_m[param3]);
                      break L5;
                    }
                    var11 = -12 / ((49 - param1) / 41);
                    try {
                      L8: {
                        var24 = dj.a(var9_array, -21);
                        var10_array = var24;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var12_ref_RuntimeException = decompiledCaughtException;
                        stackOut_33_0 = (RuntimeException) var12_ref_RuntimeException;
                        stackOut_33_1 = new StringBuilder();
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param0 == null) {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          break L9;
                        } else {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          break L9;
                        }
                      }
                      throw fk.a((Throwable) (Object) stackIn_36_0, (stackIn_36_2 != 0) + " " + param3 + " " + param0.length + " " + ke.a(var9_array, 21106, param0.length) + " " + ke.a(var9_array, 21106, param0.length + -2) + " " + ((um) this).field_d.field_p[param3] + " " + ((um) this).field_d.field_c);
                    }
                    L10: {
                      if (((um) this).field_k) {
                        ((um) this).field_m[param3] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int > 1) {
                        if (2 == ((um) this).field_f) {
                          var12 = var24.length;
                          var12--;
                          var13 = 255 & var24[var12];
                          var12 = var12 - 4 * var5_int * var13;
                          var14 = new p(var10_array);
                          var15 = 0;
                          var14.field_l = var12;
                          var16 = 0;
                          var17_int = 0;
                          L12: while (true) {
                            if (~var17_int <= ~var13) {
                              if (var15 == 0) {
                                stackOut_85_0 = 1;
                                stackIn_86_0 = stackOut_85_0;
                                return stackIn_86_0 != 0;
                              } else {
                                var17 = new byte[var15];
                                var14.field_l = var12;
                                var15 = 0;
                                var18 = 0;
                                var19 = 0;
                                L13: while (true) {
                                  if (var13 <= var19) {
                                    var7[var16] = (Object) (Object) var17;
                                    break L11;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L14: while (true) {
                                      if (~var21 <= ~var5_int) {
                                        var19++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var20 = var20 + var14.e((byte) -94);
                                          if (var6 == null) {
                                            var22 = var21;
                                            break L15;
                                          } else {
                                            var22 = var6[var21];
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var22 == param2) {
                                            ne.a(var10_array, var18, var17, var15, var20);
                                            var15 = var15 + var20;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        var18 = var18 + var20;
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var18 = 0;
                              var19 = 0;
                              L17: while (true) {
                                if (~var5_int >= ~var19) {
                                  var17_int++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var18 = var18 + var14.e((byte) -105);
                                    if (var6 == null) {
                                      var20 = var19;
                                      break L18;
                                    } else {
                                      var20 = var6[var19];
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (~var20 != ~param2) {
                                      break L19;
                                    } else {
                                      var15 = var15 + var18;
                                      var16 = var20;
                                      break L19;
                                    }
                                  }
                                  var19++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = var24.length;
                          var12--;
                          var13 = 255 & var24[var12];
                          var12 = var12 - var5_int * (var13 * 4);
                          var14 = new p(var10_array);
                          var15_ref_int__ = new int[var5_int];
                          var14.field_l = var12;
                          var16 = 0;
                          L20: while (true) {
                            if (var13 <= var16) {
                              var16_ref_byte____ = new byte[var5_int][];
                              var17_int = 0;
                              L21: while (true) {
                                if (var17_int >= var5_int) {
                                  var14.field_l = var12;
                                  var17_int = 0;
                                  var18 = 0;
                                  L22: while (true) {
                                    if (var13 <= var18) {
                                      var18 = 0;
                                      L23: while (true) {
                                        if (~var5_int >= ~var18) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 != null) {
                                              var19 = var6[var18];
                                              break L24;
                                            } else {
                                              var19 = var18;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (((um) this).field_f == 0) {
                                              var7[var19] = vm.a(25633, var16_ref_byte____[var18], false);
                                              break L25;
                                            } else {
                                              var7[var19] = (Object) (Object) var16_ref_byte____[var18];
                                              break L25;
                                            }
                                          }
                                          var18++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L26: while (true) {
                                        if (~var5_int >= ~var20) {
                                          var18++;
                                          continue L22;
                                        } else {
                                          var19 = var19 + var14.e((byte) -127);
                                          ne.a(var10_array, var17_int, var16_ref_byte____[var20], var15_ref_int__[var20], var19);
                                          var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                          var17_int = var17_int + var19;
                                          var20++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var16_ref_byte____[var17_int] = new byte[var15_ref_int__[var17_int]];
                                  var15_ref_int__[var17_int] = 0;
                                  var17_int++;
                                  continue L21;
                                }
                              }
                            } else {
                              var17_int = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L20;
                                } else {
                                  var17_int = var17_int + var14.e((byte) -119);
                                  var15_ref_int__[var18] = var15_ref_int__[var18] + var17_int;
                                  var18++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 == null) {
                            var12 = 0;
                            break L28;
                          } else {
                            var12 = var6[0];
                            break L28;
                          }
                        }
                        if (((um) this).field_f == 0) {
                          var7[var12] = vm.a(25633, var10_array, false);
                          break L11;
                        } else {
                          var7[var12] = (Object) (Object) var24;
                          return true;
                        }
                      }
                    }
                    stackOut_100_0 = 1;
                    stackIn_101_0 = stackOut_100_0;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var5;
            stackOut_102_1 = new StringBuilder().append("um.E(");
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param0 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L29;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L29;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_101_0 != 0;
    }

    final int a(byte param0, int param1) {
        if (!this.b(0, param1)) {
            return 0;
        }
        if (param0 >= -49) {
            ((um) this).field_d = null;
        }
        return ((um) this).field_d.field_o[param1];
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (((um) this).c((byte) 127)) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (param1 < 0) {
                break L0;
              } else {
                if (((um) this).field_d.field_o.length <= param0) {
                  break L0;
                } else {
                  if (param1 < ((um) this).field_d.field_o[param0]) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!om.field_j) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        } else {
          return false;
        }
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
            if (!this.b(0, param2)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 == 7) {
                  break L1;
                } else {
                  ((um) this).field_m = (Object[]) ((um) this).field_m[1];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var4_int = ((um) this).field_d.field_j[param2].a(ga.a((byte) -77, var5), (byte) 17);
              if (!this.b(param2, var4_int, 0)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return var4_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("um.H(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        cd[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cd stackIn_6_2 = null;
        cd stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        rk stackIn_6_6 = null;
        rk stackIn_6_7 = null;
        Object stackIn_6_8 = null;
        cd[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cd stackIn_7_2 = null;
        cd stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        rk stackIn_7_6 = null;
        rk stackIn_7_7 = null;
        Object stackIn_7_8 = null;
        cd[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cd stackIn_8_2 = null;
        cd stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        rk stackIn_8_6 = null;
        rk stackIn_8_7 = null;
        Object stackIn_8_8 = null;
        int stackIn_8_9 = 0;
        cd[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cd stackIn_9_2 = null;
        cd stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        rk stackIn_9_6 = null;
        rk stackIn_9_7 = null;
        Object stackIn_9_8 = null;
        int stackIn_9_9 = 0;
        cd[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        cd stackIn_10_2 = null;
        cd stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        rk stackIn_10_6 = null;
        rk stackIn_10_7 = null;
        Object stackIn_10_8 = null;
        int stackIn_10_9 = 0;
        cd[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cd stackIn_11_2 = null;
        cd stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        rk stackIn_11_6 = null;
        rk stackIn_11_7 = null;
        Object stackIn_11_8 = null;
        int stackIn_11_9 = 0;
        cd[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cd stackIn_12_2 = null;
        cd stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        rk stackIn_12_6 = null;
        rk stackIn_12_7 = null;
        Object stackIn_12_8 = null;
        int stackIn_12_9 = 0;
        int stackIn_12_10 = 0;
        RuntimeException decompiledCaughtException = null;
        cd[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cd stackOut_5_2 = null;
        cd stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        rk stackOut_5_6 = null;
        rk stackOut_5_7 = null;
        Object stackOut_5_8 = null;
        cd[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cd stackOut_7_2 = null;
        cd stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        rk stackOut_7_6 = null;
        rk stackOut_7_7 = null;
        Object stackOut_7_8 = null;
        int stackOut_7_9 = 0;
        cd[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cd stackOut_6_2 = null;
        cd stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        rk stackOut_6_6 = null;
        rk stackOut_6_7 = null;
        Object stackOut_6_8 = null;
        int stackOut_6_9 = 0;
        cd[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        cd stackOut_8_2 = null;
        cd stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        rk stackOut_8_6 = null;
        rk stackOut_8_7 = null;
        Object stackOut_8_8 = null;
        int stackOut_8_9 = 0;
        cd[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        cd stackOut_9_2 = null;
        cd stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        rk stackOut_9_6 = null;
        rk stackOut_9_7 = null;
        Object stackOut_9_8 = null;
        int stackOut_9_9 = 0;
        cd[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cd stackOut_11_2 = null;
        cd stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        rk stackOut_11_6 = null;
        rk stackOut_11_7 = null;
        Object stackOut_11_8 = null;
        int stackOut_11_9 = 0;
        int stackOut_11_10 = 0;
        cd[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        cd stackOut_10_2 = null;
        cd stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        rk stackOut_10_6 = null;
        rk stackOut_10_7 = null;
        Object stackOut_10_8 = null;
        int stackOut_10_9 = 0;
        int stackOut_10_10 = 0;
        var2 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (null != qd.field_w) {
                break L1;
              } else {
                qd.field_w = new qe();
                break L1;
              }
            }
            mi.field_q = new wg(100, 100, 150, bj.field_bb[0], wh.field_c, bj.field_bb[1], dj.field_t, (km) null);
            hg.field_b = new wg(100, 100, 150, bj.field_bb[0], wh.field_c, bj.field_bb[1], dj.field_t, (km) null);
            mi.field_q.field_y = 80;
            hg.field_b.field_y = 80;
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 5) {
                var1_int = v.field_j.field_t + (v.field_j.field_H + 4);
                ak.field_m[7] = v.field_j.field_C + (200 + v.field_j.field_t) - -var1_int;
                ak.field_y[7] = 30 + 2 * var1_int;
                break L0;
              } else {
                L3: {
                  stackOut_5_0 = ok.field_Ib;
                  stackOut_5_1 = var1_int;
                  stackOut_5_2 = null;
                  stackOut_5_3 = null;
                  stackOut_5_4 = 24 * var1_int + ak.field_k[3];
                  stackOut_5_5 = ak.field_m[3] + -28;
                  stackOut_5_6 = ek.field_c[var1_int];
                  stackOut_5_7 = ek.field_c[5 + var1_int];
                  stackOut_5_8 = null;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_7_3 = stackOut_5_3;
                  stackIn_7_4 = stackOut_5_4;
                  stackIn_7_5 = stackOut_5_5;
                  stackIn_7_6 = stackOut_5_6;
                  stackIn_7_7 = stackOut_5_7;
                  stackIn_7_8 = stackOut_5_8;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  stackIn_6_4 = stackOut_5_4;
                  stackIn_6_5 = stackOut_5_5;
                  stackIn_6_6 = stackOut_5_6;
                  stackIn_6_7 = stackOut_5_7;
                  stackIn_6_8 = stackOut_5_8;
                  if (var1_int != 2) {
                    stackOut_7_0 = (cd[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = null;
                    stackOut_7_3 = null;
                    stackOut_7_4 = stackIn_7_4;
                    stackOut_7_5 = stackIn_7_5;
                    stackOut_7_6 = (rk) (Object) stackIn_7_6;
                    stackOut_7_7 = (rk) (Object) stackIn_7_7;
                    stackOut_7_8 = stackIn_7_8;
                    stackOut_7_9 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    stackIn_8_5 = stackOut_7_5;
                    stackIn_8_6 = stackOut_7_6;
                    stackIn_8_7 = stackOut_7_7;
                    stackIn_8_8 = stackOut_7_8;
                    stackIn_8_9 = stackOut_7_9;
                    break L3;
                  } else {
                    stackOut_6_0 = (cd[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = null;
                    stackOut_6_3 = null;
                    stackOut_6_4 = stackIn_6_4;
                    stackOut_6_5 = stackIn_6_5;
                    stackOut_6_6 = (rk) (Object) stackIn_6_6;
                    stackOut_6_7 = (rk) (Object) stackIn_6_7;
                    stackOut_6_8 = stackIn_6_8;
                    stackOut_6_9 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    stackIn_8_4 = stackOut_6_4;
                    stackIn_8_5 = stackOut_6_5;
                    stackIn_8_6 = stackOut_6_6;
                    stackIn_8_7 = stackOut_6_7;
                    stackIn_8_8 = stackOut_6_8;
                    stackIn_8_9 = stackOut_6_9;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    stackOut_8_0 = (cd[]) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = null;
                    stackOut_8_3 = null;
                    stackOut_8_4 = stackIn_8_4;
                    stackOut_8_5 = stackIn_8_5;
                    stackOut_8_6 = (rk) (Object) stackIn_8_6;
                    stackOut_8_7 = (rk) (Object) stackIn_8_7;
                    stackOut_8_8 = stackIn_8_8;
                    stackOut_8_9 = stackIn_8_9;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_10_3 = stackOut_8_3;
                    stackIn_10_4 = stackOut_8_4;
                    stackIn_10_5 = stackOut_8_5;
                    stackIn_10_6 = stackOut_8_6;
                    stackIn_10_7 = stackOut_8_7;
                    stackIn_10_8 = stackOut_8_8;
                    stackIn_10_9 = stackOut_8_9;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    stackIn_9_4 = stackOut_8_4;
                    stackIn_9_5 = stackOut_8_5;
                    stackIn_9_6 = stackOut_8_6;
                    stackIn_9_7 = stackOut_8_7;
                    stackIn_9_8 = stackOut_8_8;
                    stackIn_9_9 = stackOut_8_9;
                    if (var1_int == 3) {
                      break L5;
                    } else {
                      stackOut_9_0 = (cd[]) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = null;
                      stackOut_9_3 = null;
                      stackOut_9_4 = stackIn_9_4;
                      stackOut_9_5 = stackIn_9_5;
                      stackOut_9_6 = (rk) (Object) stackIn_9_6;
                      stackOut_9_7 = (rk) (Object) stackIn_9_7;
                      stackOut_9_8 = stackIn_9_8;
                      stackOut_9_9 = stackIn_9_9;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      stackIn_11_3 = stackOut_9_3;
                      stackIn_11_4 = stackOut_9_4;
                      stackIn_11_5 = stackOut_9_5;
                      stackIn_11_6 = stackOut_9_6;
                      stackIn_11_7 = stackOut_9_7;
                      stackIn_11_8 = stackOut_9_8;
                      stackIn_11_9 = stackOut_9_9;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      stackIn_10_4 = stackOut_9_4;
                      stackIn_10_5 = stackOut_9_5;
                      stackIn_10_6 = stackOut_9_6;
                      stackIn_10_7 = stackOut_9_7;
                      stackIn_10_8 = stackOut_9_8;
                      stackIn_10_9 = stackOut_9_9;
                      if (var1_int != 1) {
                        stackOut_11_0 = (cd[]) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = null;
                        stackOut_11_3 = null;
                        stackOut_11_4 = stackIn_11_4;
                        stackOut_11_5 = stackIn_11_5;
                        stackOut_11_6 = (rk) (Object) stackIn_11_6;
                        stackOut_11_7 = (rk) (Object) stackIn_11_7;
                        stackOut_11_8 = stackIn_11_8;
                        stackOut_11_9 = stackIn_11_9;
                        stackOut_11_10 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        stackIn_12_5 = stackOut_11_5;
                        stackIn_12_6 = stackOut_11_6;
                        stackIn_12_7 = stackOut_11_7;
                        stackIn_12_8 = stackOut_11_8;
                        stackIn_12_9 = stackOut_11_9;
                        stackIn_12_10 = stackOut_11_10;
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackOut_10_0 = (cd[]) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = null;
                  stackOut_10_3 = null;
                  stackOut_10_4 = stackIn_10_4;
                  stackOut_10_5 = stackIn_10_5;
                  stackOut_10_6 = (rk) (Object) stackIn_10_6;
                  stackOut_10_7 = (rk) (Object) stackIn_10_7;
                  stackOut_10_8 = stackIn_10_8;
                  stackOut_10_9 = stackIn_10_9;
                  stackOut_10_10 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  stackIn_12_4 = stackOut_10_4;
                  stackIn_12_5 = stackOut_10_5;
                  stackIn_12_6 = stackOut_10_6;
                  stackIn_12_7 = stackOut_10_7;
                  stackIn_12_8 = stackOut_10_8;
                  stackIn_12_9 = stackOut_10_9;
                  stackIn_12_10 = stackOut_10_10;
                  break L4;
                }
                stackIn_12_0[stackIn_12_1] = new cd(stackIn_12_4, stackIn_12_5, stackIn_12_6, stackIn_12_7, (rk) (Object) stackIn_12_8, stackIn_12_9 != 0, stackIn_12_10 != 0);
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "um.I(" + 640 + ')');
        }
    }

    private final synchronized void a(int param0, int param1) {
        if (!((um) this).field_k) {
            ((um) this).field_m[param0] = vm.a(dm.a(11076, 20325), ((um) this).field_i.c(param0, 1), false);
        } else {
            ((um) this).field_m[param0] = (Object) (Object) ((um) this).field_i.c(param0, 1);
        }
    }

    final synchronized byte[] b(byte param0, int param1) {
        if (!((um) this).c((byte) 125)) {
            return null;
        }
        if (((um) this).field_d.field_o.length == 1) {
            return ((um) this).a(0, param1, param0 + 5921);
        }
        if (!this.b(0, param1)) {
            return null;
        }
        if (((um) this).field_d.field_o[param1] == 1) {
            return ((um) this).a(param1, 0, 5847);
        }
        if (param0 != -74) {
            ((long[]) ((Object[]) ((um) this).field_m[2])[1])[0] = -41L;
        }
        throw new RuntimeException();
    }

    final synchronized boolean c(byte param0) {
        if (param0 < 117) {
            ((um) this).field_e = null;
        }
        if (null == ((um) this).field_d) {
            ((um) this).field_d = ((um) this).field_i.b(104);
            if (((um) this).field_d == null) {
                return false;
            }
            ((um) this).field_m = new Object[((um) this).field_d.field_g];
            ((um) this).field_e = new Object[((um) this).field_d.field_g][];
        }
        return true;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((um) this).c((byte) 120)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -78) {
                  break L1;
                } else {
                  int discarded$2 = ((um) this).a((String) ((um) this).field_m[0], ((int[]) ((um) this).field_m[0])[1], ((int[]) ((um) this).field_m[10])[1]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((um) this).field_d.field_e.a(ga.a((byte) -109, var6), (byte) 17);
              if (this.b(0, var4_int)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((um) this).field_d.field_j[var4_int].a(ga.a((byte) -112, var7), (byte) 17);
                stackOut_8_0 = ((um) this).a((byte) -80, var4_int, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("um.V(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final int a(String param0, int param1) {
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
            if (((um) this).c((byte) 124)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -124, var4), (byte) 17);
              if (!this.b(param1, var3_int)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return var3_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("um.P(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        if (((um) this).c((byte) 119)) {
          if (param0 == -40) {
            var2 = 1;
            var3 = 0;
            L0: while (true) {
              if (var3 >= ((um) this).field_d.field_q.length) {
                return var2 != 0;
              } else {
                var4 = ((um) this).field_d.field_q[var3];
                if (((um) this).field_m[var4] == null) {
                  this.a(var4, 11076);
                  if (((um) this).field_m[var4] == null) {
                    var2 = 0;
                    var3++;
                    continue L0;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((um) this).c((byte) 125)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 0) {
                  break L1;
                } else {
                  boolean discarded$2 = ((um) this).a(-40, ((byte[]) ((Object[]) ((um) this).field_m[9])[4])[14]);
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param0;
              var3_int = ((um) this).field_d.field_e.a(ga.a((byte) -94, var4), (byte) 17);
              stackOut_6_0 = ((um) this).c(var3_int, param1 + -47);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("um.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    um(ua param0, boolean param1, int param2) {
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
        ((um) this).field_d = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((um) this).field_i = param0;
                    ((um) this).field_f = param2;
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
                  ((um) this).field_k = stackIn_7_1 != 0;
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
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("um.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new km(640, 480);
        field_h = "No players";
        field_a = 0;
        field_l = new lm[13];
    }
}
