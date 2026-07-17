/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends dk {
    static dd field_E;
    static el field_G;
    static String field_H;
    private vc field_I;
    static int[] field_F;

    final static void d() {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (ge.field_d == null) {
                break L0;
              } else {
                try {
                  L1: {
                    ge.field_d.a(-107, 0L);
                    ge.field_d.a(ae.field_a.field_i, ae.field_a.field_k, 24, (byte) -23);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            }
            ae.field_a.field_i = ae.field_a.field_i + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public f() {
        super(0, 0, ll.field_m, ca.field_Q, (ch) null, (kd) null);
        ((f) this).field_I = new vc();
    }

    final void d(boolean param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (!param0) {
            ((f) this).field_I = null;
        }
        we var2 = new we(((f) this).field_I);
        db var3 = (db) (Object) var2.b(78);
        while (var3 != null) {
            if (!(!var3.a(-71))) {
                var3.c(-1);
            }
            var3 = (db) (Object) var2.c(-6144);
        }
        ((f) this).field_A = (qa) (Object) ((f) this).l(-75);
    }

    final void i(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 >= -55) {
            field_G = null;
        }
        we var2 = new we(((f) this).field_I);
        db var3 = (db) (Object) var2.b(84);
        while (var3 != null) {
            var3.field_G = false;
            var3 = (db) (Object) var2.c(-6144);
        }
        ((f) this).field_A = null;
    }

    final void k(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 >= -54) {
            ((f) this).d(false);
        }
        we var2 = new we(((f) this).field_I);
        db var3 = (db) (Object) var2.b(120);
        while (var3 != null) {
            if (var3.j(112)) {
                var3.c(-1);
            }
            var3 = (db) (Object) var2.c(-6144);
        }
    }

    final db l(int param0) {
        int var2 = 0;
        we var3 = null;
        db var4 = null;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 112 % ((-10 - param0) / 51);
        var3 = new we(((f) this).field_I);
        var4 = (db) (Object) var3.b(127);
        L0: while (true) {
          if (var4 != null) {
            if (!var4.field_G) {
              var4 = (db) (Object) var3.c(-6144);
              continue L0;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    final void b(qa param0, byte param1) {
        db var3 = null;
        try {
            if (!(param0 instanceof db)) {
                throw new IllegalArgumentException();
            }
            var3 = (db) (Object) param0;
            ((f) this).field_I.b(true, (lh) (Object) var3);
            if (param1 != -35) {
                field_G = null;
            }
            var3.field_G = true;
            boolean discarded$0 = var3.a((qa) this, -53);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "f.NA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void j(int param0) {
        field_E = null;
        if (param0 != -7409) {
            field_G = null;
        }
        field_G = null;
        field_F = null;
        field_H = null;
    }

    final qa a(int param0) {
        we var2 = null;
        db var3 = null;
        int var4 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          var2 = new we(((f) this).field_I);
          var3 = (db) (Object) var2.b(-59);
          if (param0 == 0) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3.i(-257);
            } else {
              var3 = (db) (Object) var2.c(-6144);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var7 = fleas.field_A ? 1 : 0;
        if (null != ((f) this).field_p) {
            ((f) this).field_p.a(-117, param1, true, (qa) this, param0);
        }
        we var5 = new we(((f) this).field_I);
        qa var6 = (qa) (Object) var5.a((byte) 106);
        while (var6 != null) {
            var6.b(((f) this).field_z + param0, ((f) this).field_y + param1, true, param3);
            var6 = (qa) (Object) var5.a(true);
        }
        if (!param2) {
            f.j(69);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Unpacking graphics";
        field_F = new int[10];
    }
}
