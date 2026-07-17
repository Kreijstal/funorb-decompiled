/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_a;
    int field_d;
    int field_e;
    byte[] field_c;
    int field_h;
    int field_g;
    static String field_i;
    boolean field_f;
    int[] field_j;
    private int field_b;

    final boolean a(int param0, int param1, bv param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (null != ((sl) this).field_c) {
              param2.a(0, param0, ((sl) this).field_b, ((sl) this).field_c);
              if (param1 == -1) {
                L1: {
                  ((sl) this).field_b = ((sl) this).field_b + param0;
                  if (((sl) this).field_b < ((sl) this).field_c.length) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("sl.B(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, vh param1) {
        try {
            this.b(8, param1);
            param1.a(((sl) this).field_c, param0, ((sl) this).field_c.length, 104);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sl.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b(int param0, vh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        vh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        vh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        vh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        vh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        vh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b(1, ((sl) this).field_g);
              param1.b(1, ((sl) this).field_e);
              param1.b(true, ((sl) this).field_d);
              stackOut_1_0 = (vh) param1;
              stackOut_1_1 = 1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((sl) this).field_f) {
                stackOut_3_0 = (vh) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (vh) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              ((vh) (Object) stackIn_4_0).b(stackIn_4_1 != 0, stackIn_4_2);
              if (((sl) this).field_j == null) {
                param1.b(1, 0);
                break L2;
              } else {
                param1.b(1, ((sl) this).field_j.length);
                var3_int = 0;
                L3: while (true) {
                  if (((sl) this).field_j.length <= var3_int) {
                    break L2;
                  } else {
                    param1.a((byte) -74, ((sl) this).field_j[var3_int]);
                    var3_int++;
                    continue L3;
                  }
                }
              }
            }
            param1.b(1, ((sl) this).field_h);
            param1.a((byte) -72, ((sl) this).field_c.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("sl.A(").append(8).append(44);
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        int var1 = -54 % ((param0 - -65) / 39);
    }

    sl(vh param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              ((sl) this).field_b = -1;
              ((sl) this).field_g = param0.k(0);
              ((sl) this).field_e = param0.k(0);
              ((sl) this).field_d = param0.e((byte) -104);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0.e((byte) -104) != 1) {
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
              ((sl) this).field_f = stackIn_4_1 != 0;
              if (param1 <= 7) {
                break L2;
              } else {
                L3: {
                  var4_int = param0.k(0);
                  if (var4_int <= 0) {
                    break L3;
                  } else {
                    ((sl) this).field_j = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= ((sl) this).field_j.length) {
                        break L3;
                      } else {
                        ((sl) this).field_j[var5] = param0.i(1);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
                if (param1 <= 8) {
                  break L2;
                } else {
                  ((sl) this).field_h = param0.k(0);
                  break L2;
                }
              }
            }
            L5: {
              var4_int = param0.i(1);
              if (var4_int >= 100000) {
                break L5;
              } else {
                if (var4_int <= 0) {
                  break L5;
                } else {
                  ((sl) this).field_c = new byte[var4_int];
                  if (param2) {
                    ((sl) this).field_b = 0;
                    break L5;
                  } else {
                    ((sl) this).field_b = -1;
                    param0.a(0, var4_int, 0, ((sl) this).field_c);
                    break L5;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("sl.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    sl(int param0, int param1, ha param2, int param3, boolean param4) {
        vh var7 = null;
        try {
            ((sl) this).field_e = param1;
            ((sl) this).field_g = param0;
            ((sl) this).field_b = -1;
            var7 = new vh(30000);
            param2.a(var7, -25771, param2.field_K.field_w);
            ((sl) this).field_c = var7.g((byte) -82);
            ((sl) this).field_h = param2.field_e;
            ((sl) this).field_f = param4 ? true : false;
            ((sl) this).field_d = param3;
            ((sl) this).field_j = new int[param2.field_H.length];
            vm.a(param2.field_H, 0, ((sl) this).field_j, 0, param2.field_H.length);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sl.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Elixirs to improve the abilities of your units.";
        field_i = "Rating";
    }
}
