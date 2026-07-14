/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    static vq field_c;
    static String field_b;
    ma field_e;
    private ma field_f;
    static String field_a;
    static String field_d;

    final ma b(int param0) {
        ma var2 = ((ko) this).field_e.field_k;
        if (var2 == ((ko) this).field_e) {
            return null;
        }
        var2.a((byte) -117);
        if (param0 != -1) {
            return null;
        }
        return var2;
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((ko) this).a(-24);
        }
        return ((ko) this).field_e == ((ko) this).field_e.field_d ? true : false;
    }

    final void d(byte param0) {
        ma var2 = null;
        if (param0 > 20) {
          L0: while (true) {
            var2 = ((ko) this).field_e.field_d;
            if (((ko) this).field_e != var2) {
              var2.a((byte) -117);
              continue L0;
            } else {
              ((ko) this).field_f = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    final ma e(byte param0) {
        ma var2 = ((ko) this).field_e.field_d;
        if (((ko) this).field_e == var2) {
            return null;
        }
        var2.a((byte) -117);
        if (param0 != -41) {
            return null;
        }
        return var2;
    }

    final ma a(byte param0) {
        if (param0 != -127) {
            ((ko) this).field_e = null;
        }
        ma var2 = ((ko) this).field_e.field_k;
        if (var2 == ((ko) this).field_e) {
            ((ko) this).field_f = null;
            return null;
        }
        ((ko) this).field_f = var2.field_k;
        return var2;
    }

    public static void d(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 >= -63) {
            field_a = null;
        }
        field_c = null;
    }

    final ma b(byte param0) {
        ma var2 = ((ko) this).field_f;
        if (!(((ko) this).field_e != var2)) {
            ((ko) this).field_f = null;
            return null;
        }
        if (param0 != -46) {
            field_a = null;
        }
        ((ko) this).field_f = var2.field_k;
        return var2;
    }

    final ma c(byte param0) {
        ma var2 = ((ko) this).field_e.field_d;
        if (((ko) this).field_e == var2) {
            ((ko) this).field_f = null;
            return null;
        }
        int var3 = -68 / ((param0 - 28) / 32);
        ((ko) this).field_f = var2.field_d;
        return var2;
    }

    final static boolean a(int param0, byte param1) {
        if (-1 == param0) {
            return true;
        }
        int var2 = -43 % ((param1 - -69) / 57);
        return (cb.field_d & 1 << param0) != 0 ? true : false;
    }

    final static void g(byte param0) {
        int var2 = Pool.field_O;
        int var1 = 0;
        if (param0 < 73) {
            field_d = null;
        }
        while (aa.field_e > var1) {
            wb.field_e[var1] = null;
            var1++;
        }
        aa.field_e = 0;
    }

    final void a(byte param0, ma param1) {
        if (!(null == param1.field_k)) {
            param1.a((byte) -117);
        }
        if (param0 != -84) {
            boolean discarded$0 = ko.a(-104, (byte) -10);
        }
        param1.field_k = ((ko) this).field_e;
        param1.field_d = ((ko) this).field_e.field_d;
        param1.field_k.field_d = param1;
        param1.field_d.field_k = param1;
    }

    final int a(int param0) {
        int var2 = 0;
        ma var3 = ((ko) this).field_e.field_d;
        if (param0 < 15) {
            field_d = null;
        }
        while (var3 != ((ko) this).field_e) {
            var2++;
            var3 = var3.field_d;
        }
        return var2;
    }

    final ma f(byte param0) {
        ma var2 = ((ko) this).field_f;
        if (param0 != -5) {
            ma discarded$0 = ((ko) this).b(63);
        }
        if (var2 == ((ko) this).field_e) {
            ((ko) this).field_f = null;
            return null;
        }
        ((ko) this).field_f = var2.field_d;
        return var2;
    }

    final ma a(ma param0, int param1) {
        ma var3 = null;
        if (param0 == null) {
            var3 = ((ko) this).field_e.field_d;
        } else {
            var3 = param0;
        }
        if (param1 != 0) {
            return null;
        }
        if (((ko) this).field_e == var3) {
            ((ko) this).field_f = null;
            return null;
        }
        ((ko) this).field_f = var3.field_d;
        return var3;
    }

    final void b(byte param0, ma param1) {
        if (param1.field_k != null) {
            param1.a((byte) -117);
        }
        param1.field_k = ((ko) this).field_e.field_k;
        param1.field_d = ((ko) this).field_e;
        param1.field_k.field_d = param1;
        param1.field_d.field_k = param1;
        int var3 = -68 / ((param0 - 40) / 40);
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        if (param4 != -147296924) {
            return;
        }
        while (var5 < lq.field_T.length) {
            param3 = lq.field_T[var5];
            var6 = var5 << -147296924;
            while (true) {
                param3--;
                if (param3 == 0) {
                    break;
                }
                var6++;
                param1 = tl.field_I[var6];
                param0[param2[param1]] = param0[param2[param1]] + 1;
                tl.field_I[param0[param2[param1]]] = param1;
            }
            var5++;
        }
    }

    public ko() {
        ((ko) this).field_e = new ma();
        ((ko) this).field_e.field_k = ((ko) this).field_e;
        ((ko) this).field_e.field_d = ((ko) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Resign";
        field_a = "Options";
        field_d = "Show all lobby chat";
    }
}
