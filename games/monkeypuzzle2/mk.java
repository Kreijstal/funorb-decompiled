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

    final static void f() {
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
              int fieldTemp$8 = s.field_O;
              s.field_O = s.field_O + 1;
              if (fieldTemp$8 > 150) {
                qc.field_N = 2;
                return;
              } else {
                return;
              }
            } else {
              if (var1 == 2) {
                int fieldTemp$9 = em.field_B;
                em.field_B = em.field_B + 1;
                if (480 < fieldTemp$9) {
                  ug discarded$10 = mb.field_e.d(4011);
                  int discarded$11 = 8192;
                  ke.b();
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

    public static void a() {
        field_j = null;
    }

    final static String e() {
        if (!(cf.field_b != ch.field_d)) {
            return ac.field_c;
        }
        return wk.field_d;
    }

    private mk() throws Throwable {
        throw new Error();
    }

    final static String a(long param0) {
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
                      StringBuilder discarded$3 = var6.append((char) var9);
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
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var3_ref2 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                kd.field_e = param0;
                try {
                  L1: {
                    L2: {
                      var3_ref2 = param2.getParameter("cookieprefix");
                      var5 = var3_ref2;
                      var5 = var3_ref2;
                      var4 = param2.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var5 = var3_ref2 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                      if (0 != param0.length()) {
                        break L2;
                      } else {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                    }
                    mf.a(true, param2, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    break L3;
                  }
                }
                tf.a((byte) -85, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var3_ref;
                stackOut_9_1 = new StringBuilder().append("mk.B(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L4;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L4;
                }
              }
              L5: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(-5).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L5;
                }
              }
              throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
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
