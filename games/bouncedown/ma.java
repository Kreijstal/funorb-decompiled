/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ma extends ug {
    int field_s;
    int field_p;
    int field_t;
    int field_q;
    int field_o;
    static String field_u;
    int field_r;
    static fe field_m;
    static String field_n;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        this.a(param1 << -665256472, true, param0, param4, param3 << -741572379);
        if (param2 != -741572379) {
            Object var7 = null;
        }
    }

    public static void d(int param0) {
        field_n = null;
        field_u = null;
        if (param0 != 65) {
            field_u = null;
        }
        field_m = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    private final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = ((ma) this).field_t << 930633251;
        if (!param1) {
            ((ma) this).a(-84, -19, 80, 103, -64, 69);
        }
        param2 = (param2 << 754375524) + (var6 & 15);
        int var7 = ((ma) this).field_o << 450269283;
        param3 = (param3 << -1704518684) - -(15 & var7);
        ((ma) this).a(var6, var7, param2, param3, param0, param4);
    }

    ma() {
    }

    final static long a(byte param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Bounce.field_N;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (65 > var6) {
                    break L3;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + (1 + var6));
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (var6 > 122) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 - (-var6 - -97));
                      break L2;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(-48 + (var6 + 27));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (var2 < 177917621779460413L) {
                var5++;
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L5: while (true) {
            L6: {
              if ((var2 % 37L ^ -1L) != -1L) {
                break L6;
              } else {
                if (-1L == (var2 ^ -1L)) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            var5 = 119 / ((param0 - 23) / 36);
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "to return to the normal view.";
        field_n = "That name is not available";
    }
}
