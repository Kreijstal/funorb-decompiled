/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends jl {
    private String[] field_t;
    private int field_s;
    static int[] field_u;
    private tc[] field_r;
    static String field_q;

    private final void a(byte param0, String[] param1, int param2, int param3, int param4) {
        int var7 = 0;
        String var8 = null;
        int var9 = EscapeVector.field_A;
        if (((wd) this).field_h == null) {
            return;
        }
        if (!(param1 != null)) {
            return;
        }
        if (!((param1.length ^ -1) != -1)) {
            return;
        }
        if (param0 != -95) {
            return;
        }
        String[] var10 = param1;
        String[] var6 = var10;
        for (var7 = 0; var7 < var10.length; var7++) {
            var8 = var10[var7];
            if (var8 != null) {
                if (!(0 >= var8.length())) {
                    if ((param4 ^ -1) > -1) {
                        ((wd) this).field_h.a(var8, ((wd) this).field_d, param2, param3, -1);
                    }
                    if (-1 > (param4 ^ -1)) {
                        ((wd) this).field_h.b(var8, ((wd) this).field_d, param2, param3, -1);
                    }
                }
            }
            param2 = param2 + ((wd) this).field_f;
        }
    }

    private final void c(int param0) {
        int var2 = 640;
        int var3 = this.a(((wd) this).field_r, 0);
        int var4 = ((wd) this).a(((wd) this).field_t, 0);
        int var5 = 90 / ((42 - param0) / 41);
        ((wd) this).field_o = var4 + var3;
        ((wd) this).field_d = var3 + (var2 + -((wd) this).field_o) / 2;
    }

    final void a(int param0, int param1) {
        if (null == ((wd) this).field_h) {
            return;
        }
        int var3 = ((wd) this).field_h.field_r;
        if (param1 != 3) {
            return;
        }
        param0 = param0 + var3;
        param0 = param0 + ((wd) this).b(param0, param1 ^ 13944);
        this.a(param0, ((wd) this).field_r, (byte) -121);
        this.a((byte) -95, ((wd) this).field_t, param0, ((wd) this).field_s, -1);
    }

    private final void a(int param0, tc[] param1, byte param2) {
        int var7 = 0;
        tc var8 = null;
        int var9 = EscapeVector.field_A;
        if (!(((wd) this).field_h != null)) {
            return;
        }
        if (!(param1 != null)) {
            return;
        }
        if (!(0 != param1.length)) {
            return;
        }
        int var4 = ((wd) this).field_h.field_r;
        param0 = param0 - var4;
        tc[] var5 = param1;
        int var6 = 101 / ((param2 - -57) / 55);
        for (var7 = 0; var5.length > var7; var7++) {
            var8 = var5[var7];
            if (var8 != null) {
                var8.a(103, ((wd) this).field_d - var8.d(11384), param0);
            }
            param0 = param0 + ((wd) this).field_f;
        }
    }

    final void a(int param0, ih param1, int param2, int param3) {
        super.a(0, param1, param2, -80);
        ((wd) this).field_s = param0;
        int var5 = 77 % ((param3 - 47) / 60);
        this.c(126);
    }

    private final int a(tc[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (param0 != null) {
          if (param0.length == 0) {
            return 0;
          } else {
            var3 = param1;
            var4 = 0;
            L0: while (true) {
              if (var4 >= param0.length) {
                return var3;
              } else {
                var5 = param0[var4];
                if (var5 != null) {
                  var3 = t.a(var5.d(11384), var3, 41);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    public static void d(int param0) {
        field_u = null;
        field_q = null;
        if (param0 < 85) {
            wd.d(-128);
        }
    }

    wd(String param0, tc[] param1, String[] param2) {
        super(param0, param2);
        ((wd) this).field_t = param2;
        ((wd) this).field_r = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[256];
        field_q = "Targets";
    }
}
