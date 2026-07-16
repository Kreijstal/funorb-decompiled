/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends jl {
    static String field_r;
    private int field_v;
    static String field_s;
    private String[] field_u;
    private int field_q;
    private String[] field_t;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var4 = param1.getCodeBase();
                  var3 = sh.a((byte) 104, param1, var4).getFile();
                  Object discarded$6 = sd.a((byte) 119, param1, new Object[2], "updatelinks");
                  Object discarded$7 = sd.a((byte) 107, param1, new Object[2], "updatelinks");
                  if (param0 == 15) {
                    break L1;
                  } else {
                    gl.b(true);
                    break L1;
                  }
                }
                Object discarded$8 = sd.a((byte) 112, param1, new Object[2], "updatelinks");
                Object discarded$9 = sd.a((byte) 110, param1, new Object[2], "updatelinks");
                Object discarded$10 = sd.a((byte) 104, param1, new Object[2], "updatelinks");
                Object discarded$11 = sd.a((byte) 123, param1, new Object[2], "updatelinks");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        if (param0) {
            return;
        }
        field_r = null;
    }

    gl(String param0, String[] param1, String[] param2) {
        super(param0, param1);
        ((gl) this).field_u = param1;
        ((gl) this).field_t = param2;
    }

    private final void d(byte param0) {
        int var2 = 15 % ((param0 - -92) / 33);
        int var3 = 640;
        int var4 = ((gl) this).a(((gl) this).field_u, 0);
        int var5 = ((gl) this).a(((gl) this).field_t, 0);
        ((gl) this).field_o = var4 + var5;
        ((gl) this).field_d = (-((gl) this).field_o + var3) / 2 + var4;
    }

    final static k c(boolean param0) {
        if (!param0) {
            return null;
        }
        if (!(null != vg.field_U)) {
            vg.field_U = new k(ke.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, ke.field_c.field_r, -1, 2147483647, true);
        }
        return vg.field_U;
    }

    final void a(int param0, int param1, int param2, byte param3, ih param4) {
        super.a(0, param4, param2, -101);
        if (param3 != -92) {
            return;
        }
        ((gl) this).field_v = param0;
        ((gl) this).field_q = param1;
        this.d((byte) 38);
    }

    private final void a(int param0, int param1, int param2, String[] param3, int param4) {
        int var7 = 0;
        String var8 = null;
        int var9 = EscapeVector.field_A;
        if (((gl) this).field_h == null) {
            return;
        }
        if (param3 == null) {
            return;
        }
        if (0 == param3.length) {
            return;
        }
        if (param0 != -1) {
            gl.b(true);
        }
        String[] var10 = param3;
        String[] var6 = var10;
        for (var7 = 0; var7 < var10.length; var7++) {
            var8 = var10[var7];
            if (var8 != null) {
                if ((var8.length() ^ -1) < -1) {
                    if (0 > param2) {
                        ((gl) this).field_h.a(var8, ((gl) this).field_d, param1, param4, -1);
                    }
                    if (0 < param2) {
                        ((gl) this).field_h.b(var8, ((gl) this).field_d, param1, param4, -1);
                    }
                }
            }
            param1 = param1 + ((gl) this).field_f;
        }
    }

    final void a(int param0, int param1) {
        if (!(null != ((gl) this).field_h)) {
            return;
        }
        if (param1 != 3) {
            gl.b(false);
        }
        int var3 = ((gl) this).field_h.field_r;
        param0 = param0 + var3;
        param0 = param0 + ((gl) this).b(param0, param1 + 13944);
        this.a(-1, param0, 1, ((gl) this).field_u, ((gl) this).field_q);
        this.a(-1, param0, -1, ((gl) this).field_t, ((gl) this).field_v);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Destroy all the alien infrastructure";
        field_s = "Retribution objectives";
    }
}
