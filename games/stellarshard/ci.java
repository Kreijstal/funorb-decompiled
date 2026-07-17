/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci {
    static int field_b;
    static String field_d;
    static String[] field_a;
    static String field_c;

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 == 1) {
          var4 = ((ci) this).b(30393);
          if (var4 > 0L) {
            jj.a((byte) -114, var4);
            return ((ci) this).a(true, param0);
          } else {
            return ((ci) this).a(true, param0);
          }
        } else {
          return 38;
        }
    }

    abstract void a(byte param0);

    abstract int a(boolean param0, long param1);

    final static String a(String param0, char param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_7_0 = null;
        String stackIn_12_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        Object stackOut_6_0 = null;
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
        var11 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (var7 == 0) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param0.indexOf((int) param1, var8_int);
                  if (var8_int < 0) {
                    break L1;
                  } else {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            if (param3 == 2619) {
              var9 = 0;
              L3: while (true) {
                var10 = param0.indexOf((int) param1, var9);
                if (var10 < 0) {
                  StringBuilder discarded$6 = var8.append(param0.substring(var9));
                  stackOut_11_0 = var8.toString();
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  StringBuilder discarded$7 = var8.append(param0.substring(var9, var10));
                  var9 = 1 + var10;
                  StringBuilder discarded$8 = var8.append(param2);
                  continue L3;
                }
              }
            } else {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (String) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ci.I(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          var1 = (Object) (Object) pk.field_e;
          synchronized (var1) {
            L0: {
              L1: {
                ce.field_e = ce.field_e + 1;
                di.field_a = q.field_c;
                if (se.field_H >= 0) {
                  L2: while (true) {
                    if (~se.field_H == ~vd.field_e) {
                      break L1;
                    } else {
                      var2 = ob.field_c[vd.field_e];
                      vd.field_e = 1 + vd.field_e & 127;
                      if (var2 < 0) {
                        si.field_jb[~var2] = false;
                        continue L2;
                      } else {
                        si.field_jb[var2] = true;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L3: while (true) {
                    if (var2 >= 112) {
                      se.field_H = vd.field_e;
                      break L1;
                    } else {
                      si.field_jb[var2] = false;
                      var2++;
                      continue L3;
                    }
                  }
                }
              }
              q.field_c = l.field_h;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "ci.J(" + 36 + 41);
        }
    }

    abstract long b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Homes in";
        field_c = "Updates will sent to the email address you've given";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
