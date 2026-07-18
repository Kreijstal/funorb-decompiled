/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sv extends wv {
    static String field_q;
    private dea field_r;

    final static String a(byte param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param1 > 0L) {
          if (param1 < 6582952005840035281L) {
            if (param1 % 37L != 0L) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (0L == param1) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = fra.field_n[(int)(-(37L * param1) + var7)];
                        if (95 == var9) {
                          var10 = var6.length() + -1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append((char) var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0, int param1) {
        if (0 == param1) {
            return 0;
        }
        if (param0 < 111) {
            int discarded$11 = ((sv) this).g(19, -86);
            if (!(param1 != -1 + ((sv) this).field_m.length)) {
                return aaa.a(false) - ((sv) this).field_m[param1].e(-163);
            }
            if (!(param1 >= 3)) {
                return 30 + (20 + aaa.a(false) / 2) - ((sv) this).field_m[param1].e(-163);
            }
            return aaa.a(false) / 2 + 30;
        }
        if (!(param1 != -1 + ((sv) this).field_m.length)) {
            return aaa.a(false) - ((sv) this).field_m[param1].e(-163);
        }
        if (!(param1 >= 3)) {
            return 30 + (20 + aaa.a(false) / 2) - ((sv) this).field_m[param1].e(-163);
        }
        return aaa.a(false) / 2 + 30;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        ((sv) this).field_r.c(param0 ^ -87);
    }

    final void a(byte param0, boolean param1) {
        super.a(param0, param1);
        int var3 = ((sv) this).field_m[1].field_i + -70 + ((sv) this).field_r.e(47) + -150;
        tp.field_K.a((aaa.a(false) >> 1) - (tp.field_K.a() >> 1), var3);
    }

    public static void d() {
        field_q = null;
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          int discarded$2 = ((sv) this).g(-74, 3);
          return ((sv) this).a((byte) 116, param0) + ((sv) this).field_m[param0].e(-163);
        } else {
          return ((sv) this).a((byte) 116, param0) + ((sv) this).field_m[param0].e(-163);
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        ((sv) this).field_r.a((byte) -111, param0, !param1 ? true : false);
    }

    final boolean a(int param0, char param1, int param2) {
        if (param0 != 13) {
          if (param2 != 1) {
            ((sv) this).field_r = null;
            return super.a(param0, param1, 1);
          } else {
            return super.a(param0, param1, 1);
          }
        } else {
          return true;
        }
    }

    final int g(int param0, int param1) {
        int var3 = 0;
        if (param0 != 0) {
          if (param0 != ((sv) this).field_m.length - 1) {
            if (3 > param0) {
              var3 = 20;
              return var3 + (((sv) this).field_n - -((param0 + -1) * ((sv) this).field_m[param0].d(11919)) + -((sv) this).field_m[0].d(11919));
            } else {
              if (param1 != 30) {
                field_q = null;
                return ((sv) this).field_n + ((param0 - 3) * ((sv) this).field_i + -((sv) this).field_m[param0].d(11919));
              } else {
                return ((sv) this).field_n + ((param0 - 3) * ((sv) this).field_i + -((sv) this).field_m[param0].d(11919));
              }
            }
          } else {
            var3 = 60;
            param0 = -1 + ((sv) this).field_m.length;
            return -var3 + ((sv) this).field_n - (-(param0 * ((sv) this).field_i) + ((sv) this).field_m[param0].d(11919));
          }
        } else {
          var3 = 60;
          param0 = -1 + ((sv) this).field_m.length;
          return -var3 + ((sv) this).field_n - (-(param0 * ((sv) this).field_i) + ((sv) this).field_m[param0].d(11919));
        }
    }

    final static kg a(cn param0, int param1, cn param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        kg stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (jna.a(false, param4, param1, param2)) {
              int discarded$2 = -123;
              stackOut_4_0 = ci.a(param0.a(false, param1, param4));
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sv.CA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 24876 + ',' + param4 + ')');
        }
        return stackIn_5_0;
    }

    sv(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((sv) this).field_r = new dea();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Reject";
    }
}
