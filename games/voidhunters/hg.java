/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg implements ntb {
    static aib field_b;
    int field_d;
    static int[] field_a;
    static int field_c;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                if (param0 <= -4) {
                  break L0;
                } else {
                  field_a = null;
                  break L0;
                }
              }
              var3 = ne.a(var4, (byte) -107, param1).getFile();
              Object discarded$6 = ia.a(new Object[2], param1, "updatelinks", (byte) -71);
              Object discarded$7 = ia.a(new Object[2], param1, "updatelinks", (byte) 97);
              Object discarded$8 = ia.a(new Object[2], param1, "updatelinks", (byte) 121);
              Object discarded$9 = ia.a(new Object[2], param1, "updatelinks", (byte) 67);
              Object discarded$10 = ia.a(new Object[2], param1, "updatelinks", (byte) -69);
              Object discarded$11 = ia.a(new Object[2], param1, "updatelinks", (byte) 70);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (param0) {
            Object var2 = null;
            hg.a(-91, (java.applet.Applet) null);
        }
    }

    public final void b(byte param0, tv param1) {
        hg var5 = (hg) (Object) param1;
        hg var6 = var5;
        var6.field_d = var5.field_d;
        if (param0 <= 54) {
            hg.a((byte) 23, 42L);
        }
    }

    final static void a(byte param0, pgb param1) {
        int var2 = 0;
        pgb var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param1.field_d == null) {
          return;
        } else {
          L0: {
            L1: {
              if (param1.field_f != 0) {
                break L1;
              } else {
                if (-1 == param1.field_h) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= ou.field_q) {
                break L0;
              } else {
                var3 = nrb.field_b[var2];
                if (-3 == var3.field_a) {
                  if (param1.field_f == var3.field_f) {
                    if (param1.field_h == var3.field_h) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1.field_m != null) {
              itb.field_p = param1.field_i;
              rea.field_d = param1.field_n;
              abb.field_a = param1.field_a;
              wrb.field_p = param1.field_m;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            fpb.a(param1, 0);
            if (param0 > 105) {
              break L4;
            } else {
              hg.a(true);
              break L4;
            }
          }
          return;
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            ((hg) this).field_d = 42;
        }
        param0.a(-632, ((hg) this).field_d, 32);
    }

    public final boolean a(byte param0, tv param1) {
        hg var3 = (hg) (Object) param1;
        int var4 = -84 % ((22 - param0) / 59);
        return var3.field_d != var3.field_d ? true : false;
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        ((hg) this).field_d = param0.i(0, 32);
    }

    public final void a(tv param0, int param1) {
        hg var3 = (hg) (Object) param0;
        if (param1 > -19) {
            return;
        }
        int var4 = 0;
        if (!(var3.field_d == var3.field_d)) {
            var4 = 1;
            iva.a(-6940, "int playerid has changed. before=" + var3.field_d + ", now=" + var3.field_d);
        }
        if (!(var4 == 0)) {
            tfb.a((byte) -123, "This instance of PlayerLeave has changed");
        }
    }

    final static void a(byte param0, long param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 == 90) {
            Thread.sleep(param1);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (InterruptedException) (Object) decompiledCaughtException;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[2];
    }
}
