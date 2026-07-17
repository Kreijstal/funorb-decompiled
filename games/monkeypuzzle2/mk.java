/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ug {
    int field_e;
    static String field_j;
    static int field_f;
    static int field_i;
    byte[] field_g;
    static int field_h;

    final static void f(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (mb.field_e.a((byte) -117) != null) {
          var1 = qc.field_N;
          if (var1 == 0) {
            em.field_B = em.field_B - 1;
            if (~(-ii.field_B + 470) <= ~em.field_B) {
              qc.field_N = 1;
              s.field_O = 0;
              return;
            } else {
              return;
            }
          } else {
            if (var1 == 1) {
              int fieldTemp$6 = s.field_O;
              s.field_O = s.field_O + 1;
              if (fieldTemp$6 > 150) {
                qc.field_N = 2;
                return;
              } else {
                return;
              }
            } else {
              if (var1 == 2) {
                int fieldTemp$7 = em.field_B;
                em.field_B = em.field_B + 1;
                if (480 < fieldTemp$7) {
                  ug discarded$8 = mb.field_e.d(4011);
                  ke.b(8192);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 8134) {
            return;
        }
        field_j = null;
    }

    final static String e(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (!(cf.field_b != ch.field_d)) {
            return ac.field_c;
        }
        return wk.field_d;
    }

    private mk() throws Throwable {
        throw new Error();
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 > 0L) {
          if (param0 < 6582952005840035281L) {
            if (0L == param0 % 37L) {
              return null;
            } else {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (0L == var4) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (param0 == 0L) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = sc.field_a[(int)(-(param0 * 37L) + var7)];
                        if (var9 == 95) {
                          var10 = -1 + var6.length();
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
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

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            kd.field_e = param0;
            try {
                var3 = param2.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (0 == param0.length()) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                mf.a(true, param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            if (param1 != -5) {
                return;
            }
            try {
                tf.a((byte) -85, param2);
            } catch (RuntimeException runtimeException) {
                throw la.a((Throwable) (Object) runtimeException, "mk.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Welcome to Monkey Puzzle 2. To read these instructions in-game, press <img=4> and select 'Instructions' from the pause menu.<br><br><shad=6767667>Story<br></shad>Deep in the jungle, the great explorer, Farnsworth, is up some creek without a paddle. The waters are rising and the locals will only throw him a line if he gets rid of the monkeys from the branches above. Fortunately, he has a catapult, lots of nuts and a good eye for monkey-hide.<br><br><shad=6767667>Controls<br></shad>Use the <img=0> and <img=1> keys to aim. Press the <img=3> bar or <img=5> to fire coconuts.";
    }
}
