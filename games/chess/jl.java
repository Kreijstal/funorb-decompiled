/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String field_a;
    static String field_b;

    final static boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        if (0 == (sb.field_sb ^ -1)) {
            if (!(tk.a(-121, 1))) {
                return false;
            }
            sb.field_sb = tk.field_h.i(-117);
            tk.field_h.field_l = 0;
        }
        if (!(-2 != sb.field_sb)) {
            if (!(tk.a(60, 2))) {
                return false;
            }
            sb.field_sb = tk.field_h.f(674914976);
            tk.field_h.field_l = 0;
        }
        return tk.a(-121, sb.field_sb);
    }

    final static long a(CharSequence param0, boolean param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Chess.field_G;
          var2 = 0L;
          if (!param1) {
            break L0;
          } else {
            var8 = null;
            break L0;
          }
        }
        var4 = param0.length();
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 > 90) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(var6 + 1 + -65);
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (var6 > 122) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(var6 + 1 + -97);
                      break L3;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(-48 + (27 + var6));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if ((var2 ^ -1L) > -177917621779460414L) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (var2 % 37L != 0L) {
                break L7;
              } else {
                if (-1L == (var2 ^ -1L)) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1699) {
            boolean discarded$0 = jl.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Add <%0> to friend list";
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
