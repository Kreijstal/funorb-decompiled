/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lg {
    int field_f;
    int field_g;
    int field_c;
    String field_b;
    sna field_a;
    int field_d;
    private sna field_e;

    final static void c() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            cw.field_zb = new js(8);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= vca.field_f.length) {
                break L0;
              } else {
                cw.field_zb.a((long)vca.field_f[var1_int].toLowerCase().hashCode(), (byte) 104, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "lg.J(" + 8 + 41);
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        sna var7 = null;
        if (param2 != -4586) {
            return;
        }
        try {
            var7 = new sna(param0, ((lg) this).field_e, param5, param4, param3, param1, param0);
            ((lg) this).field_a.a(-1, var7);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lg.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            eo.field_f = new js(64);
            var1_int = 0;
            L1: while (true) {
              if (mka.field_i.length <= var1_int) {
                break L0;
              } else {
                eo.field_f.a((long)mka.field_i[var1_int].toLowerCase().hashCode(), (byte) -102, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "lg.K(" + -92 + 41);
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        hb.a(2, param1, kaa.field_m, param2);
        if (!param0) {
            return;
        }
    }

    final int b(int param0) {
        int var4 = BachelorFridge.field_y;
        ((lg) this).field_a.a(19842, true);
        sna var2 = (sna) (Object) ((lg) this).field_a.field_z.b((byte) 90);
        int var3 = param0;
        while (var2 != null) {
            var2.a(param0 ^ 19842, true);
            if (1 == var2.field_R) {
                return var3;
            }
            var2 = (sna) (Object) ((lg) this).field_a.field_z.c(0);
            var3++;
        }
        return -1;
    }

    lg(int param0, int param1, int param2, int param3, int param4, String param5) {
        try {
            ((lg) this).field_c = param3;
            ((lg) this).field_f = param1;
            ((lg) this).field_d = param2;
            ((lg) this).field_g = param0;
            ((lg) this).field_e = mka.a(13558251, 13558251, 13558251, (byte) -119, (po) (Object) jha.field_g, 13558251, 1118481, 13558251);
            ((lg) this).field_e.field_N = 1;
            ((lg) this).field_e.field_eb = wd.field_w;
            ((lg) this).field_e.field_db = op.field_I;
            ((lg) this).field_b = param5;
            ((lg) this).field_e.field_A = bla.field_p;
            ((lg) this).field_a = new sna();
            ((lg) this).field_a.a(((lg) this).field_c >> 2, 31407, ((lg) this).field_d, ((lg) this).field_g, -(((lg) this).field_c >> 2) + ((lg) this).field_f - -((lg) this).field_c);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lg.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
