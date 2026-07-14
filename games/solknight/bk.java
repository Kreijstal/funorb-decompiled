/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bk {
    static nj field_a;

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = param0; var2 > var4; var4++) {
            var3 = el.a((byte) 91, param1.charAt(var4)) + (-var3 + (var3 << -1266079899));
        }
        return var3;
    }

    final static int a(int param0, Random param1, byte param2) {
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        int var3 = -6 % ((param2 - -2) / 44);
        if (!(param0 > 0)) {
            throw new IllegalArgumentException();
        }
        if (ri.a(-6873, param0)) {
            return (int)(((long)param1.nextInt() & 4294967295L) * (long)param0 >> -1882241056);
        }
        int var4 = -(int)(4294967296L % (long)param0) + -2147483648;
        do {
            var5 = param1.nextInt();
        } while ((var5 ^ -1) <= (var4 ^ -1));
        return te.b(25403, param0, var5);
    }

    public static void a(byte param0) {
        int var1 = 82 % ((2 - param0) / 55);
        field_a = null;
    }

    final static int a(byte param0, String param1, mg param2, int param3, String[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        var5 = param2.b(param1);
        if ((var5 ^ -1) < (param3 ^ -1)) {
          var6 = (-1 + (var5 - -param3)) / param3;
          param3 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param1.length();
          var9 = 0;
          L0: while (true) {
            if ((var8 ^ -1) >= (var9 ^ -1)) {
              if (param0 != 3) {
                bk.a((byte) -51);
                if ((var7 ^ -1) > (var8 ^ -1)) {
                  var6++;
                  param4[var6] = param1.substring(var7, var8).trim();
                  return var6;
                } else {
                  return var6;
                }
              } else {
                L1: {
                  if ((var7 ^ -1) <= (var8 ^ -1)) {
                    break L1;
                  } else {
                    var6++;
                    param4[var6] = param1.substring(var7, var8).trim();
                    break L1;
                  }
                }
                return var6;
              }
            } else {
              L2: {
                L3: {
                  var10 = param1.charAt(var9);
                  if (var10 == 32) {
                    break L3;
                  } else {
                    if (45 != var10) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var11 = param1.substring(var7, 1 + var9).trim();
                var12 = param2.b(var11);
                if (var12 < param3) {
                  break L2;
                } else {
                  var6++;
                  param4[var6] = var11;
                  var7 = 1 + var9;
                  break L2;
                }
              }
              L4: {
                if (62 != var10) {
                  var9++;
                  break L4;
                } else {
                  if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                    var6++;
                    param4[var6] = param1.substring(var7, var9 - 3).trim();
                    var7 = var9 + 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              var9++;
              continue L0;
            }
          }
        } else {
          if (-1 == param1.indexOf("<br>")) {
            param4[0] = (String) (Object) param4;
            return 1;
          } else {
            var6 = (-1 + (var5 - -param3)) / param3;
            param3 = var5 / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L5: while (true) {
              if ((var8 ^ -1) >= (var9 ^ -1)) {
                if (param0 == 3) {
                  if ((var7 ^ -1) <= (var8 ^ -1)) {
                    return var6;
                  } else {
                    var6++;
                    param4[var6] = param1.substring(var7, var8).trim();
                    return var6;
                  }
                } else {
                  bk.a((byte) -51);
                  if ((var7 ^ -1) > (var8 ^ -1)) {
                    var6++;
                    param4[var6] = param1.substring(var7, var8).trim();
                    return var6;
                  } else {
                    return var6;
                  }
                }
              } else {
                L6: {
                  L7: {
                    var10 = param1.charAt(var9);
                    if (var10 == 32) {
                      break L7;
                    } else {
                      if (45 != var10) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var11 = param1.substring(var7, 1 + var9).trim();
                  var12 = param2.b(var11);
                  if (var12 < param3) {
                    break L6;
                  } else {
                    var6++;
                    param4[var6] = var11;
                    var7 = 1 + var9;
                    break L6;
                  }
                }
                L8: {
                  if (62 != var10) {
                    var9++;
                    break L8;
                  } else {
                    if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                      var6++;
                      param4[var6] = param1.substring(var7, var9 - 3).trim();
                      var7 = var9 + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                var9++;
                continue L5;
              }
            }
          }
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_a = null;
            return te.field_N.h(param0 + 109);
        }
        return te.field_N.h(param0 + 109);
    }

    static {
    }
}
