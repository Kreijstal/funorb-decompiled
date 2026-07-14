/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends aa {
    private int field_f;
    private long field_j;
    private int field_h;
    private long field_i;
    static int[] field_g;
    private long field_k;
    private long[] field_e;

    final void b(int param0) {
        if ((((g) this).field_i ^ -1L) > (((g) this).field_j ^ -1L)) {
            ((g) this).field_i = ((g) this).field_i + (-((g) this).field_i + ((g) this).field_j);
        }
        ((g) this).field_k = (long)param0;
    }

    public static void b(byte param0) {
        field_g = null;
        int var1 = 31 / ((48 - param0) / 47);
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -21342) {
            ((g) this).field_h = 48;
        }
        if (((g) this).field_j <= ((g) this).field_i) {
            var4 = 0;
            do {
                ((g) this).field_j = ((g) this).field_j + param1;
                var4++;
                // if_icmple L76
            } while ((((g) this).field_i ^ -1L) < (((g) this).field_j ^ -1L));
            if ((((g) this).field_j ^ -1L) > (((g) this).field_i ^ -1L)) {
                ((g) this).field_j = ((g) this).field_i;
            }
            return var4;
        }
        ((g) this).field_k = ((g) this).field_k + (((g) this).field_j - ((g) this).field_i);
        ((g) this).field_i = ((g) this).field_i + (-((g) this).field_i + ((g) this).field_j);
        ((g) this).field_j = ((g) this).field_j + param1;
        return 1;
    }

    final long a(int param0) {
        ((g) this).field_i = ((g) this).field_i + this.a(false);
        if (param0 != 17990) {
        }
        if (!(((g) this).field_i >= ((g) this).field_j)) {
            return (((g) this).field_j - ((g) this).field_i) / 1000000L;
        }
        return 0L;
    }

    final static String a(CharSequence param0, byte param1) {
        if (param1 != -119) {
            g.b((byte) 111);
        }
        String var2 = jj.a(param1 + 14580, bk.a(124, param0));
        if (!(var2 != null)) {
            var2 = "";
        }
        return var2;
    }

    final static String[] a(int param0, char param1, String param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = OrbDefence.field_D ? 1 : 0;
        CharSequence var11 = (CharSequence) (Object) param2;
        int var3 = bi.a(var11, param1, 126);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var7 = 85 % ((param0 - -27) / 51);
        int var6 = 0;
        for (var8 = 0; var3 > var8; var8++) {
            for (var9 = var6; param1 != param2.charAt(var9); var9++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var9);
            var6 = var9 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = OrbDefence.field_D ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -((g) this).field_k + var2;
        ((g) this).field_k = var2;
        if (var4 > -5000000000L) {
            if (!(5000000000L <= var4)) {
                ((g) this).field_e[((g) this).field_f] = var4;
                ((g) this).field_f = (((g) this).field_f - -1) % 10;
                if (1 > ((g) this).field_h) {
                    ((g) this).field_h = ((g) this).field_h + 1;
                }
            }
        }
        if (param0) {
            return 29L;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((g) this).field_h; var8++) {
            var6 = var6 + ((g) this).field_e[(-var8 + ((g) this).field_f + 10) % 10];
        }
        return var6 / (long)((g) this).field_h;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            Object var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 1) {
                  break L0;
                } else {
                  var4 = null;
                  String[] discarded$7 = g.a(16, 'L', (String) null);
                  break L0;
                }
              }
              var5 = param1.getCodeBase();
              var3 = f.a(param1, var5, -123).getFile();
              Object discarded$8 = gm.a(true, "updatelinks", new Object[2], param1);
              Object discarded$9 = gm.a(true, "updatelinks", new Object[2], param1);
              Object discarded$10 = gm.a(true, "updatelinks", new Object[2], param1);
              Object discarded$11 = gm.a(true, "updatelinks", new Object[2], param1);
              Object discarded$12 = gm.a(true, "updatelinks", new Object[2], param1);
              Object discarded$13 = gm.a(true, "updatelinks", new Object[2], param1);
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

    g() {
        ((g) this).field_f = 0;
        ((g) this).field_h = 1;
        ((g) this).field_i = 0L;
        ((g) this).field_k = 0L;
        ((g) this).field_j = 0L;
        ((g) this).field_e = new long[10];
        ((g) this).field_i = System.nanoTime();
        ((g) this).field_j = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[128];
    }
}
