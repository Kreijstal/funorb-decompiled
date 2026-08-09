/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci {
    static int field_b;
    static String field_d;
    static String[] field_a;
    static String field_c;

    public static void c(int param0) {
        if (param0 != -1) {
          field_c = (String) null;
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final int a(long param0, int param1) {
        long var4;
        if (param1 == 1) {
          var4 = this.b(30393);
          if ((var4 ^ -1L) < -1L) {
            jj.a((byte) -114, var4);
            return this.a(true, param0);
          } else {
            return this.a(true, param0);
          }
        } else {
          return 38;
        }
    }

    abstract void a(byte param0);

    abstract int a(boolean param0, long param1);

    final static String a(String param0, char param1, String param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
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
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
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
                  if ((var8_int ^ -1) > -1) {
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
                if (-1 < (var10 ^ -1)) {
                  discarded$3 = var8.append(param0.substring(var9));
                  stackIn_12_0 = var8.toString();
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$4 = var8.append(param0.substring(var9, var10));
                  var9 = 1 + var10;
                  discarded$5 = var8.append(param2);
                  continue L3;
                }
              }
            } else {
              stackIn_7_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ci.I(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        String var5 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = stellarshard.field_B;
        try {
          var1 = pk.field_e;
          synchronized (var1) {
            L0: {
              L1: {
                if (param0 > 30) {
                  break L1;
                } else {
                  var5 = (String) null;
                  ci.a((String) null, 'ￛ', (String) null, -48);
                  break L1;
                }
              }
              L2: {
                ce.field_e = ce.field_e + 1;
                di.field_a = q.field_c;
                if (-1 >= (se.field_H ^ -1)) {
                  L3: while (true) {
                    if (se.field_H == vd.field_e) {
                      break L2;
                    } else {
                      var2 = ob.field_c[vd.field_e];
                      vd.field_e = 1 + vd.field_e & 127;
                      if (-1 < (var2 ^ -1)) {
                        si.field_jb[var2 ^ -1] = false;
                        continue L3;
                      } else {
                        si.field_jb[var2] = true;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L4: while (true) {
                    if (-113 >= (var2 ^ -1)) {
                      se.field_H = vd.field_e;
                      break L2;
                    } else {
                      si.field_jb[var2] = false;
                      var2++;
                      continue L4;
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
          throw ma.a((Throwable) ((Object) var1_ref), "ci.J(" + param0 + ')');
        }
    }

    abstract long b(int param0);

    static {
        field_d = "Homes in";
        field_c = "Updates will sent to the email address you've given";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
