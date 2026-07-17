/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends nm {
    static String field_l;
    static jp field_q;
    static int[] field_k;
    static String field_j;
    static jp[][] field_o;
    static int[] field_p;
    int field_n;
    private Object[] field_i;
    private int field_m;

    public static void a(int param0) {
        field_j = null;
        field_o = null;
        field_q = null;
        field_p = null;
        field_l = null;
        field_k = null;
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
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
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_26_0 = null;
        Object stackOut_12_0 = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (1 != param1) {
                var4_int = param0 + param1;
                if (param2 == 19166) {
                  var5 = 0;
                  var6_int = param0;
                  L1: while (true) {
                    if (var6_int >= var4_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param0;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackOut_26_0 = var6.toString();
                          stackIn_27_0 = stackOut_26_0;
                          break L0;
                        } else {
                          L3: {
                            var8 = param3[var7];
                            if (var8 == null) {
                              StringBuilder discarded$5 = var6.append("null");
                              break L3;
                            } else {
                              StringBuilder discarded$6 = var6.append(var8);
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param3[var6_int];
                        if (var7_ref_CharSequence == null) {
                          var5 += 4;
                          break L4;
                        } else {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (String) (Object) stackIn_13_0;
                }
              } else {
                var10 = param3[param0];
                var4 = var10;
                if (var4 != null) {
                  stackOut_9_0 = ((Object) (Object) var10).toString();
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4_ref;
            stackOut_28_1 = new StringBuilder().append("ao.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return stackIn_27_0;
    }

    final Object a(int param0, int param1) {
        if (!(((ao) this).field_n >= param0)) {
            throw new RuntimeException("State in future " + ((ao) this).field_n + " " + param0);
        }
        int var3 = 80 / ((11 - param1) / 35);
        if (!(1 + (((ao) this).field_n + -((ao) this).field_m) <= param0)) {
            throw new RuntimeException("State erased " + param0 + ". Lastest entry: " + ((ao) this).field_n);
        }
        return ((ao) this).field_i[param0 % ((ao) this).field_m];
    }

    final void a(Object param0, byte param1) {
        try {
            if (param1 != -39) {
                ((ao) this).a(((Object[]) ((ao) this).field_i[8])[13], ((byte[]) ((ao) this).field_i[1])[9]);
            }
            int fieldTemp$0 = ((ao) this).field_n + 1;
            ((ao) this).field_n = ((ao) this).field_n + 1;
            ((ao) this).field_i[fieldTemp$0 % ((ao) this).field_m] = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ao.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    ao(int param0) {
        ((ao) this).field_n = -1;
        ((ao) this).field_m = param0;
        ((ao) this).field_i = new Object[((ao) this).field_m];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Show all private chat";
        field_k = new int[]{8, 14, 15, 16, 43};
        field_j = "You have not yet unlocked this option for use.";
    }
}
