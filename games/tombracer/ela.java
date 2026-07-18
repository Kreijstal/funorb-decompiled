/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ela extends od {
    String field_l;
    String field_k;
    Class[] field_n;
    static String field_m;

    public final String toString() {
        return ((ela) this).field_k;
    }

    public static void a(int param0) {
        field_m = null;
        int var1 = 6;
    }

    final boolean a(int param0, String param1, bfa[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        Class var5 = null;
        int var6 = 0;
        Object var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
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
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_13_0 = 0;
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!((ela) this).field_l.equals((Object) (Object) param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((ela) this).field_n.length == param2.length) {
                var4_int = 0;
                L1: while (true) {
                  if (((ela) this).field_n.length <= var4_int) {
                    if (param0 <= -49) {
                      stackOut_30_0 = 1;
                      stackIn_31_0 = stackOut_30_0;
                      break L0;
                    } else {
                      var7 = null;
                      boolean discarded$1 = ((ela) this).a(-67, (String) null, (bfa[]) null);
                      return true;
                    }
                  } else {
                    L2: {
                      if (param2[var4_int].field_a) {
                        L3: {
                          var5 = jd.a(param2[var4_int].field_d, 0);
                          if (Boolean.TYPE != var5) {
                            break L3;
                          } else {
                            if (((ela) this).field_n[var4_int] == Boolean.TYPE) {
                              break L3;
                            } else {
                              stackOut_17_0 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              return stackIn_18_0 != 0;
                            }
                          }
                        }
                        L4: {
                          if (Character.TYPE != var5) {
                            break L4;
                          } else {
                            if (((ela) this).field_n[var4_int] == Character.TYPE) {
                              break L4;
                            } else {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              return stackIn_22_0 != 0;
                            }
                          }
                        }
                        if (!hs.a((byte) -88, var5)) {
                          break L2;
                        } else {
                          if (hs.a((byte) -70, ((ela) this).field_n[var4_int])) {
                            break L2;
                          } else {
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0 != 0;
                          }
                        }
                      } else {
                        if (!((ela) this).field_n[var4_int].isInstance(param2[var4_int].field_d)) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4_int++;
                    continue L1;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("ela.D(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L5;
            }
          }
          L6: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
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
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_31_0 != 0;
    }

    abstract bfa a(bfa[] param0, int param1);

    ela(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        try {
            ((ela) this).field_n = param1;
            ((ela) this).field_l = param0;
            var7 = new StringBuilder(((ela) this).field_l).append('(');
            var8 = var7;
            for (var5 = 0; ((ela) this).field_n.length > var5; var5++) {
                StringBuilder discarded$9 = var7.append(rva.a(((ela) this).field_n[var5], (byte) -102));
                if (var5 < -1 + ((ela) this).field_n.length) {
                    StringBuilder discarded$10 = var8.append(", ");
                }
            }
            StringBuilder discarded$15 = var8.append(')');
            if (param2 != null) {
                StringBuilder discarded$16 = var8.append("     <col=ffaaff>" + param2 + "</col>");
            }
            ((ela) this).field_k = var8.toString();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ela.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Welcome to your DOOM!";
    }
}
