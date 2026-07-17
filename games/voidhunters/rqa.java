/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rqa extends fh {
    String field_l;
    String field_k;
    Class[] field_n;
    static int[] field_m;

    public static void a(boolean param0) {
        field_m = null;
    }

    public final String toString() {
        return ((rqa) this).field_l;
    }

    final boolean a(boolean param0, String param1, nc[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Class var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (!((rqa) this).field_k.equals((Object) (Object) param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param2.length == ((rqa) this).field_n.length) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    field_m = null;
                    break L1;
                  }
                }
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= ((rqa) this).field_n.length) {
                    stackOut_30_0 = 1;
                    stackIn_31_0 = stackOut_30_0;
                    break L0;
                  } else {
                    L3: {
                      if (param2[var4_int].field_a) {
                        L4: {
                          var5 = sna.a(param2[var4_int].field_b, (byte) 124);
                          if (var5 != Boolean.TYPE) {
                            break L4;
                          } else {
                            if (((rqa) this).field_n[var4_int] != Boolean.TYPE) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              return stackIn_20_0 != 0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (var5 != Character.TYPE) {
                            break L5;
                          } else {
                            if (((rqa) this).field_n[var4_int] == Character.TYPE) {
                              break L5;
                            } else {
                              stackOut_23_0 = 0;
                              stackIn_24_0 = stackOut_23_0;
                              return stackIn_24_0 != 0;
                            }
                          }
                        }
                        if (!ke.a(var5, 24145)) {
                          break L3;
                        } else {
                          if (ke.a(((rqa) this).field_n[var4_int], 24145)) {
                            break L3;
                          } else {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0 != 0;
                          }
                        }
                      } else {
                        if (((rqa) this).field_n[var4_int].isInstance(param2[var4_int].field_b)) {
                          break L3;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        }
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("rqa.H(").append(param0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          L7: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
        return stackIn_31_0 != 0;
    }

    rqa(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        try {
            ((rqa) this).field_k = param0;
            ((rqa) this).field_n = param1;
            var7 = new StringBuilder(((rqa) this).field_k).append(40);
            var8 = var7;
            for (var5 = 0; var5 < ((rqa) this).field_n.length; var5++) {
                StringBuilder discarded$9 = var7.append(wp.a(((rqa) this).field_n[var5], false));
                if (var5 < -1 + ((rqa) this).field_n.length) {
                    StringBuilder discarded$10 = var8.append(", ");
                }
            }
            StringBuilder discarded$15 = var8.append(41);
            if (param2 != null) {
                StringBuilder discarded$16 = var8.append("     <col=ffaaff>" + param2 + "</col>");
            }
            ((rqa) this).field_l = var8.toString();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rqa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    abstract nc a(nc[] param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[5];
    }
}
