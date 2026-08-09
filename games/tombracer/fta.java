/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fta {
    static fpa field_c;
    static iu field_b;
    static iu field_a;

    final static int c(int param0) {
        if (param0 > -86) {
            fta.c(114);
            return ov.field_p;
        }
        return ov.field_p;
    }

    final static String a(String param0, String param1, int param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var12 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            var5 = param1.length();
            var6 = param3.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (0 == var8) {
                  break L1;
                } else {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param0.indexOf(param1, var9_int);
                    if ((var9_int ^ -1) <= -1) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var9 = new StringBuilder(var7);
              var10 = param2;
              L3: while (true) {
                var11 = param0.indexOf(param1, var10);
                if (var11 < 0) {
                  discarded$0 = var9.append(param0.substring(var10));
                  stackIn_12_0 = var9.toString();
                  break L0;
                } else {
                  discarded$1 = var9.append(param0.substring(var10, var11));
                  discarded$2 = var9.append(param3);
                  var10 = var5 + var11;
                  continue L3;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("fta.A(");

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


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
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
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ')');
        }
        return stackIn_12_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_c = (fpa) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final boolean a(int param0) {
        String var3;
        int stackIn_7_0 = 0;
        if (param0 == 0) {
          if (ria.field_o != this) {
            if (eo.field_w != this) {
              if (this == uga.field_n) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = (String) null;
          fta.a((String) null, (String) null, -76, (String) null);
          if (ria.field_o != this) {
            if (eo.field_w == this) {
              return true;
            } else {
              L0: {
                if (this != uga.field_n) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    static {
        field_c = new fpa();
    }
}
