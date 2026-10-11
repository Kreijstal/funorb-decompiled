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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var1;
        int var2;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (mb.field_e.a((byte) -117) == null) {
          if (param0 > 125) {
            return;
          }
          mk.a(99);
          return;
        }
        var1 = qc.field_N;
        if (var1 == 0) {
          em.field_B = em.field_B - 1;
          if (-ii.field_B - 10 + 480 >= em.field_B) {
            qc.field_N = 1;
            s.field_O = 0;
          }
          if (param0 > 125) {
            return;
          }
          mk.a(99);
          return;
        }
        if (var1 == 1) {
          fieldTemp$0 = s.field_O;
          s.field_O = s.field_O + 1;
          if (fieldTemp$0 > 150) {
            qc.field_N = 2;
          }
          if (param0 > 125) {
            return;
          }
          mk.a(99);
          return;
        }
        if (var1 != 2) {
          if (param0 > 125) {
            return;
          }
          mk.a(99);
          return;
        }
        fieldTemp$1 = em.field_B;
        em.field_B = em.field_B + 1;
        if (480 < fieldTemp$1) {
          mb.field_e.d(4011);
          ke.b(8192);
        }
        if (param0 > 125) {
          return;
        }
        mk.a(99);
        return;
    }

    public static void a(int param0) {
        if (param0 != 8134) {
          return;
        }
        field_j = null;
    }

    final static String e(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (cf.field_b == ch.field_d) {
          return ac.field_c;
        }
        return wk.field_d;
    }

    private mk() throws Throwable {
        throw new Error();
    }

    final static String a(long param0, int param1) {
        StringBuilder var13 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3Lifetime1;
        long var4Lifetime1;
        long var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param0 % 37L) {
          return null;
        }
        if (param1 == 480) {
          var3 = 0;
          var4 = param0;
          while (0L != var4) {
            var3++;
            var4 = var4 / 37L;
          }
          var13 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = sc.field_a[(int)(-(param0 * 37L) + var7)];
            if (var9 == 95) {
              var10 = -1 + var13.length();
              var9 = 160;
              var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
            }
            discarded$0 = var13.append((char) var9);
          }
          var13.reverse();
          var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
          return var13.toString();
        }
        mk.e(-14);
        var3Lifetime1 = 0;
        var4Lifetime1 = param0;
        while (0L != var4Lifetime1) {
          var3Lifetime1++;
          var4Lifetime1 = var4Lifetime1 / 37L;
        }
        StringBuilder var12 = new StringBuilder(var3Lifetime1);
        while (param0 != 0L) {
          var7Lifetime1 = param0;
          param0 = param0 / 37L;
          var9Lifetime1 = sc.field_a[(int)(-(param0 * 37L) + var7Lifetime1)];
          if (var9Lifetime1 == 95) {
            var10Lifetime1 = -1 + var12.length();
            var9Lifetime1 = 160;
            var12.setCharAt(var10Lifetime1, Character.toUpperCase(var12.charAt(var10Lifetime1)));
          }
          discarded$1 = var12.append((char) var9Lifetime1);
        }
        var12.reverse();
        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
        return var12.toString();
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var5 = null;
          String var4 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          kd.field_e = param0;
          try {
            var3 = param2.getParameter("cookieprefix");
            var5 = var3;
            var5Lifetime1 = var3;
            var4 = param2.getParameter("cookiehost");
            var5Lifetime2 = var4;
            var5Lifetime3 = var4;
            var5Lifetime4 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
            if (0 == param0.length()) {
              var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            }
            mf.a(true, param2, "document.cookie=\"" + var5Lifetime4 + "\"");
          } catch (Throwable throwable) {
          }
          if (param1 != -5) {
            return;
          }
          try {
            tf.a((byte) -85, param2);
          } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_j = "Welcome to Monkey Puzzle 2. To read these instructions in-game, press <img=4> and select 'Instructions' from the pause menu.<br><br><shad=6767667>Story<br></shad>Deep in the jungle, the great explorer, Farnsworth, is up some creek without a paddle. The waters are rising and the locals will only throw him a line if he gets rid of the monkeys from the branches above. Fortunately, he has a catapult, lots of nuts and a good eye for monkey-hide.<br><br><shad=6767667>Controls<br></shad>Use the <img=0> and <img=1> keys to aim. Press the <img=3> bar or <img=5> to fire coconuts.";
    }
}
