/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    static String field_f;
    static int field_e;
    static ea field_a;
    static ea field_c;
    static int field_b;
    static ea field_d;
    static int field_g;

    final static gj a(int param0, String param1) {
        gj stackIn_4_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        gj stackIn_28_0 = null;
        gj stackIn_41_0 = null;
        gj stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = MinerDisturbance.field_ab;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = dh.field_d;
            return stackIn_4_0;
          }
          if (64 < var2_int) {
            stackIn_8_0 = ec.field_d;
            return stackIn_8_0;
          }
          if (param0 != 92) {
            var7 = (String) null;
            ha.a(2, (String) null);
          }
          if (34 == param1.charAt(0)) {
            if (param1.charAt(-1 + var2_int) != 34) {
              stackIn_14_0 = vh.field_f;
              return stackIn_14_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param1.charAt(var4);
              if (92 == var5) {
                stackIn_23_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_23_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_28_0 = vh.field_f;
                  return stackIn_28_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (var4Lifetime1 != 0 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_41_0 = vh.field_f;
                return stackIn_41_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (al.field_o.indexOf(var5Lifetime1) == -1) {
                stackIn_46_0 = vh.field_f;
                return stackIn_46_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("ha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        var3 = MinerDisturbance.field_ab;
        if (param0 != 242) {
          ha.a((byte) 76);
        }
        var2 = param1;
        if (var2 != 32 &&
          160 != var2 &&
          95 != var2 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            var2 != 35) {
            if (var2 != 224 &&
              225 != var2 &&
              var2 != 226 &&
              228 != var2 &&
              227 != var2 &&
              var2 != 192 &&
              var2 != 193 &&
              var2 != 194 &&
              196 != var2 &&
              var2 != 195) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                203 != var2) {
                if (237 != var2 &&
                  238 != var2 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    var2 != 243 &&
                    244 != var2 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    var2 != 210 &&
                    var2 != 211 &&
                    var2 != 212 &&
                    214 != var2 &&
                    var2 != 213) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      var2 != 251 &&
                      var2 != 252 &&
                      var2 != 217 &&
                      var2 != 218 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (231 != var2 &&
                        var2 != 199) {
                        if (255 != var2 &&
                          var2 != 376) {
                          if (var2 != 241 &&
                            var2 != 209) {
                            if (var2 != 223) {
                              return Character.toLowerCase(param1);
                            }
                            return 'b';
                          }
                          return 'n';
                        }
                        return 'y';
                      }
                      return 'c';
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        return '_';
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 != 28) {
          String var2 = (String) null;
          ha.a(-127, (String) null);
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 92) {
            var4 = (String) null;
            ha.a(91, (String) null);
          }
          stackIn_3_0 = pd.a(param0, true, true, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ha.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_f = "Create your own free Jagex account";
        field_b = -1;
    }
}
