/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    private gn field_e;
    private int field_a;
    private gn[] field_d;
    private gn field_c;
    static String field_f;
    private int field_b;
    static ut[] field_g;

    final gn b(int param0) {
        ((kc) this).field_a = param0;
        return ((kc) this).a(-1);
    }

    final void a(gn param0, int param1, long param2) {
        gn var5 = null;
        try {
            if (!(param0.field_b == null)) {
                param0.c((byte) -109);
            }
            var5 = ((kc) this).field_d[(int)((long)(((kc) this).field_b + -1) & param2)];
            param0.field_b = var5.field_b;
            int var6 = -58 % ((param1 - 27) / 42);
            param0.field_d = var5;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            param0.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "kc.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final gn a(boolean param0, long param1) {
        gn var5 = null;
        int var6 = Kickabout.field_G;
        gn var4 = ((kc) this).field_d[(int)(param1 & (long)(((kc) this).field_b - 1))];
        ((kc) this).field_c = var4.field_d;
        while (((kc) this).field_c != var4) {
            if (!(param1 != ((kc) this).field_c.field_a)) {
                var5 = ((kc) this).field_c;
                ((kc) this).field_c = ((kc) this).field_c.field_d;
                return var5;
            }
            ((kc) this).field_c = ((kc) this).field_c.field_d;
        }
        ((kc) this).field_c = null;
        if (param0) {
            return null;
        }
        ((kc) this).field_c = null;
        return null;
    }

    final static void a(int param0, int param1) {
        ua.field_l = param0;
        if (param1 != 415422632) {
            return;
        }
        cf.field_Db = param0;
        dc.field_d = 0;
        wm.field_s = 1;
    }

    final void a(boolean param0) {
        int var2 = 0;
        gn var3 = null;
        gn var4 = null;
        int var5 = Kickabout.field_G;
        if (!param0) {
            return;
        }
        for (var2 = 0; var2 < ((kc) this).field_b; var2++) {
            var3 = ((kc) this).field_d[var2];
            while (true) {
                var4 = var3.field_d;
                if (var4 == var3) {
                    break;
                }
                var4.c((byte) -109);
            }
        }
        ((kc) this).field_c = null;
        ((kc) this).field_e = null;
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
    }

    final gn a(int param0) {
        gn var2 = null;
        int var3 = Kickabout.field_G;
        if (0 < ((kc) this).field_a) {
            if (!(((kc) this).field_e == ((kc) this).field_d[-1 + ((kc) this).field_a])) {
                var2 = ((kc) this).field_e;
                ((kc) this).field_e = var2.field_d;
                return var2;
            }
        }
        if (param0 != -1) {
            ((kc) this).field_b = -73;
        }
        do {
            if (((kc) this).field_b <= ((kc) this).field_a) {
                return null;
            }
            int fieldTemp$0 = ((kc) this).field_a;
            ((kc) this).field_a = ((kc) this).field_a + 1;
            var2 = ((kc) this).field_d[fieldTemp$0].field_d;
        } while (((kc) this).field_d[((kc) this).field_a + -1] == var2);
        ((kc) this).field_e = var2.field_d;
        return var2;
    }

    final static void a(boolean param0, ut[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ut var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            ug.field_c = param1;
            sp.field_Hb = new ut[ug.field_c.length];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= ug.field_c.length) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_g = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = ug.field_c[var2_int].b();
                var4 = 0;
                var5 = 0;
                var6 = -1 + var3.field_y.length;
                L3: while (true) {
                  if (var6 < 0) {
                    sp.field_Hb[var2_int] = var3;
                    var2_int++;
                    continue L1;
                  } else {
                    L4: {
                      if (var3.field_y[var6] < -1) {
                        var3.field_y[var6] = var4;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (-1 != var6 % var3.field_o) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var6--;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("kc.G(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    kc(int param0) {
        int var2 = 0;
        gn var3 = null;
        ((kc) this).field_a = 0;
        ((kc) this).field_d = new gn[param0];
        ((kc) this).field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
            gn dupTemp$0 = new gn();
            var3 = dupTemp$0;
            ((kc) this).field_d[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_d = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "ESC - cancel private message";
        field_g = (ut[]) (Object) new ot[7];
    }
}
