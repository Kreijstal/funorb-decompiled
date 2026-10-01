/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends hf {
    int[] field_k;
    static cj field_p;
    int[] field_j;
    int[] field_g;
    int field_m;
    static dm[] field_q;
    cb[] field_i;
    static volatile int field_h;
    byte[][][] field_o;
    cb[] field_n;
    int field_f;
    static String field_l;

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
            field_l = (String) null;
            field_p = null;
            field_l = null;
            return;
        }
        field_p = null;
        field_l = null;
    }

    final static int a(CharSequence param0, byte param1, int param2, boolean param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        try {
          L0: {
            if (2 <= param2) {
              if (-37 <= (param2 ^ -1)) {
                var4_int = 0;
                var5 = 0;
                var6 = 0;
                var7 = param0.length();
                if (param1 <= 2) {
                  var11 = (CharSequence) null;
                  eg.a((CharSequence) null, (byte) 58, 6, false);
                }
                for (var8 = 0; var7 > var8; var8++) {
                  L4: {
                    var9 = param0.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L4;
                      } else {
                        if (var9 == 43) {
                          if (param3) {
                            break L4;
                          }
                        }
                      }
                    }
                    L6: {
                      if (48 <= var9) {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L6;
                        }
                      }
                      if (65 <= var9) {
                        if (90 >= var9) {
                          var9 -= 55;
                          break L6;
                        }
                      }
                      if (var9 >= 97) {
                        if (122 >= var9) {
                          var9 -= 87;
                          break L6;
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 < param2) {
                      if (var4_int != 0) {
                        var9 = -var9;
                      }
                      var10 = var6 * param2 + var9;
                      if (var6 != var10 / param2) {
                        throw new NumberFormatException();
                      } else {
                        var5 = 1;
                        var6 = var10;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
                if (var5 != 0) {
                  stackIn_41_0 = var6;
                  break L0;
                } else {
                  throw new NumberFormatException();
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = (RuntimeException) (var4);

          stackIn_44_1 = new StringBuilder().append("eg.B(");

          if (param0 == null) {
            stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
            stackIn_45_2 = "null";
          } else {
            stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
            stackIn_45_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_41_0;
    }

    eg() {
    }

    static {
        field_h = -1;
    }
}
