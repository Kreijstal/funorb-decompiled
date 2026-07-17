/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends ii {
    static String field_j;
    static String[] field_n;
    private long field_m;
    private long field_k;
    private int field_f;
    static int field_o;
    static cj field_l;
    static String field_p;
    static ri[] field_h;
    private int field_q;
    private long[] field_g;
    private long field_i;

    final static ra b(int param0, int param1) {
        ra var2 = new ra();
        if (param0 != -19300) {
            Object var3 = null;
            aa.a(true, (uj) null);
        }
        so.field_j.a((br) (Object) var2, false);
        qo.b(true, 4);
        return var2;
    }

    final long a(byte param0) {
        ((aa) this).field_k = ((aa) this).field_k + this.d(1);
        if (!(~((aa) this).field_k <= ~((aa) this).field_i)) {
            return (((aa) this).field_i + -((aa) this).field_k) / 1000000L;
        }
        int var2 = 33 % ((73 - param0) / 46);
        return 0L;
    }

    final static void a(byte param0, boolean param1) {
        if (!(ki.field_e == null)) {
            if (ki.field_e.b(0, param1)) {
                ki.field_e = null;
            }
        }
        if (param0 <= 113) {
            field_l = null;
        }
    }

    final static boolean e(int param0) {
        return ch.field_e;
    }

    public static void f(int param0) {
        field_n = null;
        field_p = null;
        field_l = null;
        field_h = null;
        field_j = null;
    }

    private final long d(int param0) {
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 + -((aa) this).field_m;
        ((aa) this).field_m = var2;
        if (var4 > -5000000000L) {
            if (var4 < 5000000000L) {
                ((aa) this).field_g[((aa) this).field_q] = var4;
                if (!(1 <= ((aa) this).field_f)) {
                    ((aa) this).field_f = ((aa) this).field_f + 1;
                }
                ((aa) this).field_q = (((aa) this).field_q - -1) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((aa) this).field_f; var8++) {
            var6 = var6 + ((aa) this).field_g[(-var8 + (((aa) this).field_q - -10)) % 10];
        }
        return var6 / (long)((aa) this).field_f;
    }

    final int a(long param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1) {
          if (~((aa) this).field_k <= ~((aa) this).field_i) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((aa) this).field_i = ((aa) this).field_i + param0;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (((aa) this).field_k > ((aa) this).field_i) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((aa) this).field_i < ((aa) this).field_k) {
                  ((aa) this).field_i = ((aa) this).field_k;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((aa) this).field_m = ((aa) this).field_m + (((aa) this).field_i - ((aa) this).field_k);
            ((aa) this).field_k = ((aa) this).field_k + (((aa) this).field_i - ((aa) this).field_k);
            ((aa) this).field_i = ((aa) this).field_i + param0;
            return 1;
          }
        } else {
          return 31;
        }
    }

    final static void a(boolean param0, uj param1) {
        if (!param0) {
            return;
        }
        try {
            bh.field_a.a((gq) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "aa.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0) {
        if (!(((aa) this).field_i <= ((aa) this).field_k)) {
            ((aa) this).field_k = ((aa) this).field_k + (((aa) this).field_i + -((aa) this).field_k);
        }
        ((aa) this).field_m = 0L;
        if (param0 >= -93) {
            field_l = null;
        }
    }

    aa() {
        ((aa) this).field_f = 1;
        ((aa) this).field_k = 0L;
        ((aa) this).field_m = 0L;
        ((aa) this).field_q = 0;
        ((aa) this).field_i = 0L;
        ((aa) this).field_g = new long[10];
        ((aa) this).field_k = System.nanoTime();
        ((aa) this).field_i = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = 20;
        field_p = "(Research Points can only be earned in Rated games!)";
    }
}
