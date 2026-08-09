/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static String field_a;
    static double[] field_b;

    final static String a(CharSequence param0, int param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!ra.a(param0.charAt(var2_int), 252)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!ra.a(param0.charAt(var3 - 1), 252)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 - var2_int;
                  if (-2 >= (var4 ^ -1)) {
                    if (12 >= var4) {
                      L5: {
                        var5 = new StringBuilder(var4);
                        if (param1 > 97) {
                          break L5;
                        } else {
                          field_b = (double[]) null;
                          break L5;
                        }
                      }
                      var6 = var2_int;
                      L6: while (true) {
                        if (var3 <= var6) {
                          if (0 != var5.length()) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (!ik.a((char) var7, (byte) -46)) {
                              break L7;
                            } else {
                              var8 = ga.a((byte) 63, (char) var7);
                              if (var8 == 0) {
                                break L7;
                              } else {
                                discarded$0 = var5.append((char) var8);
                                break L7;
                              }
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("hf.B(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        return (String) ((Object) stackIn_3_0);
    }

    public static void a(int param0) {
        CharSequence var2;
        if (param0 != 12) {
          var2 = (CharSequence) null;
          hf.a((CharSequence) null, 79);
          field_b = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_b = new double[13];
    }
}
