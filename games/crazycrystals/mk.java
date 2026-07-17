/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static vk field_b;
    static mg field_c;
    static dl field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -2) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((Object) (Object) tk.field_k == this) {
              break L2;
            } else {
              if (this == (Object) (Object) fm.field_y) {
                break L2;
              } else {
                if ((Object) (Object) ek.field_h != this) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_9_0 = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param3 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param3 == 1) {
                var10 = param1[param2];
                var4 = var10;
                if (var4 == null) {
                  stackOut_9_0 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  return ((Object) (Object) var10).toString();
                }
              } else {
                var4_int = param3 + param2;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      if (param0 >= 62) {
                        break L2;
                      } else {
                        field_c = null;
                        break L2;
                      }
                    }
                    var7 = param2;
                    L3: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_25_0 = var6.toString();
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        L4: {
                          var8 = param1[var7];
                          if (var8 != null) {
                            StringBuilder discarded$5 = var6.append(var8);
                            break L4;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param1[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4_ref;
            stackOut_27_1 = new StringBuilder().append("mk.B(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_26_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
    }
}
