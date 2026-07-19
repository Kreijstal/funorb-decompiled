/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt extends ev {
    static String field_f;
    static lw field_g;
    static wk[] field_h;
    static wk[] field_i;

    final static String a(int param0, long param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 > 0L) {
          if (param1 < 6582952005840035281L) {
            if (-1L == (param1 % 37L ^ -1L)) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                L1: {
                  if (-1L == (var4 ^ -1L)) {
                    break L1;
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    if (var11 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = new StringBuilder(var3);
                L2: while (true) {
                  L3: {
                    L4: {
                      if ((param1 ^ -1L) == -1L) {
                        break L4;
                      } else {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = hq.field_b[(int)(var7 + -(37L * param1))];
                        if (var11 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (var9 == 95) {
                              var10 = var6.length() + -1;
                              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                              var9 = 160;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          discarded$2 = var6.append((char) var9);
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    discarded$3 = var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(param0)));
                    break L3;
                  }
                  return var6.toString();
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public lt() {
    }

    public final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        if (ir.field_d != null) {
            ir.field_d.j(-128);
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        if (param0 >= -8) {
            field_h = (wk[]) null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    static {
        field_f = "<br><br><col=FF0000>This trinket is worth <%0> runes. You have <%1> runes left to use this game.</col>";
    }
}
