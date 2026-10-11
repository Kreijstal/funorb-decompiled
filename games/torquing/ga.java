/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ga extends RuntimeException {
    Throwable field_a;
    String field_b;
    static String[] field_d;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2712) {
          field_c = -7;
        }
    }

    final static void a(fj param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          var5 = Torquing.field_u;
          try {
            var6 = new byte[param1];
            var2 = var6;
            if (null != jl.field_W) {
              try {
                jl.field_W.a(false, 0L);
                jl.field_W.a(-1, var6);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param0.a(24, 0, var2, (byte) -108);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.a(24, 0, var2, (byte) -108);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("ga.A(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, hi param1) {
        int var2_int = 0;
        hi var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Torquing.field_u;
        try {
          if (param1.field_a == null) {
            return;
          }
          if (param1.field_b != 0 ||
            param1.field_k != 0) {
            for (var2_int = 0; var2_int < kb.field_b; var2_int++) {
              var3 = hi.field_j[var2_int];
              if (var3.field_f == 2 &&
                var3.field_b == param1.field_b &&
                var3.field_k == param1.field_k) {
                return;
              }
            }
          }
          if (param0) {
            field_d = (String[]) null;
          }
          if (null == param1.field_c) {
          }
          wc.a(10842, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ga.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    ga(Throwable param0, String param1) {
        this.field_b = param1;
        this.field_a = param0;
    }

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = Torquing.field_u;
        if (param0 != 63) {
          return 'ﾮ';
        }
        var2 = param1;
        if (var2 != 32 &&
          160 != var2 &&
          var2 != 95 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            35 != var2) {
            if (var2 != 224 &&
              var2 != 225 &&
              var2 != 226 &&
              var2 != 228 &&
              227 != var2 &&
              var2 != 192 &&
              var2 != 193 &&
              var2 != 194 &&
              196 != var2 &&
              var2 != 195) {
              if (var2 != 232 &&
                233 != var2 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                202 != var2 &&
                203 != var2) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    243 != var2 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    210 != var2 &&
                    var2 != 211 &&
                    var2 != 212 &&
                    214 != var2 &&
                    213 != var2) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      var2 != 251 &&
                      var2 != 252 &&
                      217 != var2 &&
                      218 != var2 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (var2 != 231 &&
                        var2 != 199) {
                        if (var2 != 255 &&
                          var2 != 376) {
                          if (var2 != 241 &&
                            var2 != 209) {
                            if (var2 == 223) {
                              return 'b';
                            }
                            return Character.toLowerCase(param1);
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

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        try {
          if (2 <= param3 &&
            param3 <= 36) {
            var4_int = param0 ? 1 : 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param3) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param3;
                if (var6 != var10 / param3) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_39_0 = var6;
            return stackIn_39_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("ga.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = new String[]{"<col=2>Standard.</col> Not at all bouncy; good grip.", "<col=2>Very bouncy.</col> You will bounce off it at the same speed you hit it.", "<col=2>Icy.</col> Unless you have spikes, this surface has no grip at all.", "<col=2>Fairly bouncy.</col> You will bounce a little when you hit it.", "<col=2>Polished.</col> Has less grip than most surfaces.", "<col=2>Insanely bouncy.</col> You will bounce off it faster than you hit it."};
    }
}
