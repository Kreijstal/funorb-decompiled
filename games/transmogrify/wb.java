/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    private int field_b;
    private ri[] field_c;
    static String field_d;
    private long field_a;
    private ri field_e;

    final ri a(long param0, byte param1) {
        ri var4 = null;
        int var5 = 0;
        ri var6 = null;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        ((wb) this).field_a = param0;
        var4 = ((wb) this).field_c[(int)((long)(-1 + ((wb) this).field_b) & param0)];
        var5 = -40 % ((74 - param1) / 47);
        ((wb) this).field_e = var4.field_h;
        L0: while (true) {
          if (((wb) this).field_e != var4) {
            if (((wb) this).field_e.field_j == param0) {
              var6 = ((wb) this).field_e;
              ((wb) this).field_e = ((wb) this).field_e.field_h;
              return var6;
            } else {
              ((wb) this).field_e = ((wb) this).field_e.field_h;
              continue L0;
            }
          } else {
            ((wb) this).field_e = null;
            return null;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != 83) {
            wb.b((byte) -101);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (var1 != null) {
                try {
                  L0: {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                    qa.field_p = 1 + (int)(var3.longValue() / 1048576L);
                    break L0;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ri a(int param0) {
        ri var2 = null;
        int var3_int = 0;
        ri var3 = null;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != ((wb) this).field_e) {
          var2 = ((wb) this).field_c[(int)((long)(-1 + ((wb) this).field_b) & ((wb) this).field_a)];
          L0: while (true) {
            if (((wb) this).field_e != var2) {
              if (~((wb) this).field_e.field_j != ~((wb) this).field_a) {
                ((wb) this).field_e = ((wb) this).field_e.field_h;
                continue L0;
              } else {
                var3 = ((wb) this).field_e;
                ((wb) this).field_e = ((wb) this).field_e.field_h;
                return var3;
              }
            } else {
              var3_int = -43 % ((param0 - -19) / 55);
              ((wb) this).field_e = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    wb(int param0) {
        int var2 = 0;
        ri var3 = null;
        ((wb) this).field_c = new ri[param0];
        ((wb) this).field_b = param0;
        for (var2 = 0; param0 > var2; var2++) {
            ri dupTemp$0 = new ri();
            var3 = dupTemp$0;
            ((wb) this).field_c[var2] = dupTemp$0;
            var3.field_h = var3;
            var3.field_g = var3;
        }
    }

    final void a(int param0, long param1, ri param2) {
        ri var5 = null;
        try {
            if (null != param2.field_g) {
                param2.b((byte) -59);
            }
            var5 = ((wb) this).field_c[(int)((long)(((wb) this).field_b + -1) & param1)];
            param2.field_g = var5.field_g;
            param2.field_h = var5;
            param2.field_g.field_h = param2;
            param2.field_j = param1;
            if (param0 != 19200) {
                ri discarded$0 = ((wb) this).a(117);
            }
            param2.field_h.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "wb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
