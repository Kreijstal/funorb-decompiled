/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends dk {
    static dd field_E;
    static el field_G;
    static String field_H;
    private vc field_I;
    static int[] field_F;

    final static void d(byte param0) {
        try {
            if (ge.field_d != null) {
                try {
                    ge.field_d.a(-107, 0L);
                    ge.field_d.a(ae.field_a.field_i, ae.field_a.field_k, 24, (byte) -23);
                } catch (Exception exception) {
                }
            }
            if (param0 >= -9) {
                return;
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
        this.field_I = new vc();
    }

    final void d(boolean param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (!param0) {
            this.field_I = (vc) null;
        }
        we var2 = new we(this.field_I);
        db var3 = (db) ((Object) var2.b(78));
        while (var3 != null) {
            if (!(!var3.a(-71))) {
                var3.c(-1);
            }
            var3 = (db) ((Object) var2.c(-6144));
        }
        this.field_A = (qa) ((Object) this.l(-75));
    }

    final void i(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 >= -55) {
            field_G = (el) null;
        }
        we var2 = new we(this.field_I);
        db var3 = (db) ((Object) var2.b(84));
        while (var3 != null) {
            var3.field_G = false;
            var3 = (db) ((Object) var2.c(-6144));
        }
        this.field_A = null;
    }

    final void k(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 >= -54) {
            this.d(false);
        }
        we var2 = new we(this.field_I);
        db var3 = (db) ((Object) var2.b(120));
        while (var3 != null) {
            if (var3.j(112)) {
                var3.c(-1);
            }
            var3 = (db) ((Object) var2.c(-6144));
        }
    }

    final db l(int param0) {
        int var2;
        we var3;
        db var4;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 112 % ((-10 - param0) / 51);
        var3 = new we(this.field_I);
        var4 = (db) ((Object) var3.b(127));
        L0: while (true) {
          if (var4 != null) {
            if (!var4.field_G) {
              var4 = (db) ((Object) var3.c(-6144));
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
            var3 = (db) ((Object) param0);
            this.field_I.b(true, var3);
            if (param1 != -35) {
                field_G = (el) null;
            }
            var3.field_G = true;
            var3.a((qa) (this), -53);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "f.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void j(int param0) {
        field_E = null;
        if (param0 != -7409) {
            field_G = (el) null;
        }
        field_G = null;
        field_F = null;
        field_H = null;
    }

    final qa a(int param0) {
        we var2;
        db var3;
        int var4;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          var2 = new we(this.field_I);
          var3 = (db) ((Object) var2.b(-59));
          if (param0 == 0) {
            break L0;
          } else {
            field_E = (dd) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3.i(-257);
            } else {
              var3 = (db) ((Object) var2.c(-6144));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var7 = fleas.field_A ? 1 : 0;
        if (null != this.field_p) {
            this.field_p.a(-117, param1, true, (qa) (this), param0);
        }
        we var5 = new we(this.field_I);
        qa var6 = (qa) ((Object) var5.a((byte) 106));
        while (var6 != null) {
            var6.b(this.field_z + param0, this.field_y + param1, true, param3);
            var6 = (qa) ((Object) var5.a(true));
        }
        if (!param2) {
            f.j(69);
        }
    }

    static {
        field_H = "Unpacking graphics";
        field_F = new int[10];
    }
}
