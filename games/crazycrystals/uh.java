/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends fa {
    static uc field_p;
    static dl field_q;
    static String field_o;
    static boolean field_n;

    public static void c(int param0) {
        field_p = null;
        if (param0 != 128) {
          return;
        }
        field_o = null;
        field_q = null;
    }

    uh(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        String stackIn_3_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        var10 = CrazyCrystals.field_B;
        try {
          if (param1 != 192) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var13 = new char[param3];
          var12 = var13;
          var11 = var12;
          var4 = var11;
          var5 = 0;
          var6 = param2;
          var7 = param2 + param3;
          while (var7 > var6) {
            boolean decompiledFrameRemainder0 = true;
            incrementValue$0 = var6;
            var6++;
            var8 = param0[incrementValue$0] & 255;
            if (var8 < 128) {
              if (var8 != 0) {
                var9 = var8;
              } else {
                var9 = 65533;
              }
            } else {
              if (var8 < 192) {
                var9 = 65533;
              } else {
                if (var8 < 224) {
                  if (var6 < var7 &&
                    (192 & param0[var6]) == 128) {
                    incrementValue$1 = var6;
                    var6++;
                    var9 = param0[incrementValue$1] & 63 | (var8 & 31) << 6;
                    if (!(128 <= var9)) {
                      var9 = 65533;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var9 = 65533;
                  }
                } else {
                  if (240 > var8) {
                    if (var7 > 1 + var6 &&
                      (192 & param0[var6]) == 128 &&
                      (192 & param0[var6 + 1]) == 128) {
                      incrementValue$2 = var6;
                      var6++;
                      incrementValue$3 = var6;
                      var6++;
                      var9 = param0[incrementValue$2] << 6 & 4032 | var8 << 12 & 61440 | 63 & param0[incrementValue$3];
                      if (!(var9 >= 2048)) {
                        var9 = 65533;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var9 = 65533;
                    }
                  } else {
                    if (var8 < 248) {
                      if (2 + var6 < var7 &&
                        (param0[var6] & 192) == 128 &&
                        (192 & param0[var6 + 1]) == 128 &&
                        (param0[var6 + 2] & 192) == 128) {
                        incrementValue$4 = var6;
                        var6++;
                        incrementValue$5 = var6;
                        var6++;
                        incrementValue$6 = var6;
                        var6++;
                        var9 = 1835008 & var8 << 18 | (param0[incrementValue$4] & 63) << 12 | (param0[incrementValue$5] & 63) << 6 | param0[incrementValue$6] & 63;
                        if (65536 <= var9 &&
                          var9 <= 1114111) {
                          var9 = 65533;
                        } else {
                          var9 = 65533;
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var9 = 65533;
                      }
                    } else {
                      var9 = 65533;
                    }
                  }
                }
              }
            }
            incrementValue$7 = var5;
            var5++;
            var11[incrementValue$7] = (char)var9;
          }
          stackIn_41_0 = new String(var13, 0, var5);
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_44_0 = var4_ref;
          stackIn_44_1 = new StringBuilder().append("uh.F(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final wh a(int param0) {
        if (param0 != 0) {
          this.a(106);
          return ea.field_q;
        }
        return ea.field_q;
    }

    static {
        field_o = "Show All";
        field_p = null;
    }
}
