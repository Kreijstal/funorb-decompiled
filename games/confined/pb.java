/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    private jl field_d;
    private long field_c;
    private int field_f;
    private jl[] field_b;
    static mi field_e;
    static String field_a;

    final void a(long param0, jl param1, int param2) {
        jl var5 = null;
        try {
            if (null != param1.field_q) {
                param1.b(true);
            }
            var5 = ((pb) this).field_b[(int)(param0 & (long)(-1 + ((pb) this).field_f))];
            param1.field_o = var5;
            param1.field_q = var5.field_q;
            if (param2 < 115) {
                ((pb) this).field_f = -72;
            }
            param1.field_q.field_o = param1;
            param1.field_o.field_q = param1;
            param1.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "pb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final jl a(long param0, int param1) {
        jl var5 = null;
        int var6 = Confined.field_J ? 1 : 0;
        ((pb) this).field_c = param0;
        jl var4 = ((pb) this).field_b[(int)(param0 & (long)(param1 + ((pb) this).field_f))];
        ((pb) this).field_d = var4.field_o;
        while (var4 != ((pb) this).field_d) {
            if (param0 == ((pb) this).field_d.field_r) {
                var5 = ((pb) this).field_d;
                ((pb) this).field_d = ((pb) this).field_d.field_o;
                return var5;
            }
            ((pb) this).field_d = ((pb) this).field_d.field_o;
        }
        ((pb) this).field_d = null;
        return null;
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
    }

    pb(int param0) {
        int var2 = 0;
        jl var3 = null;
        ((pb) this).field_f = param0;
        ((pb) this).field_b = new jl[param0];
        for (var2 = 0; var2 < param0; var2++) {
            jl dupTemp$0 = new jl();
            var3 = dupTemp$0;
            ((pb) this).field_b[var2] = dupTemp$0;
            var3.field_q = var3;
            var3.field_o = var3;
        }
    }

    final static void a(ji param0, byte param1, ji param2, int param3, int param4, int param5) {
        try {
            n.field_d = param3;
            if (param1 >= -63) {
                Object var7 = null;
                pb.a((ji) null, (byte) -101, (ji) null, 96, -46, -6);
            }
            db.field_v = param0;
            nj.field_T = param2;
            kb.field_b = param5;
            jd.field_g = param4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "pb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final jl a(int param0) {
        jl var4 = null;
        int var5 = Confined.field_J ? 1 : 0;
        if (((pb) this).field_d == null) {
            return null;
        }
        int var2 = 86 / ((49 - param0) / 55);
        jl var3 = ((pb) this).field_b[(int)((long)(-1 + ((pb) this).field_f) & ((pb) this).field_c)];
        while (var3 != ((pb) this).field_d) {
            if (!(~((pb) this).field_d.field_r != ~((pb) this).field_c)) {
                var4 = ((pb) this).field_d;
                ((pb) this).field_d = ((pb) this).field_d.field_o;
                return var4;
            }
            ((pb) this).field_d = ((pb) this).field_d.field_o;
        }
        ((pb) this).field_d = null;
        return null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            ti.b();
            oj.field_D = new int[260];
            pc.field_h = 11;
            var1_int = 0;
            L1: while (true) {
              if (256 <= var1_int) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (oj.field_D.length <= var5) {
                    break L0;
                  } else {
                    oj.field_D[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                oj.field_D[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "pb.B(" + 126 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for fonts";
    }
}
