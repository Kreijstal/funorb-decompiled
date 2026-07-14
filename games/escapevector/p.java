/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    ed[] field_g;
    static String[] field_f;
    static ed field_c;
    static int field_h;
    static int field_a;
    static int[] field_j;
    static String field_e;
    static String field_i;
    ed field_d;
    int field_b;

    public static void b(int param0) {
        field_c = null;
        field_j = null;
        if (param0 <= 39) {
            field_j = null;
        }
        field_e = null;
        field_i = null;
        field_f = null;
    }

    final boolean a(int param0) {
        ed[] var2 = null;
        ed[] var3 = null;
        if (!(null != ((p) this).field_g)) {
            var2 = tk.a(false, kc.field_c);
            var3 = tk.a(false, rb.field_k);
            if (var2 != null) {
                if (var3 != null) {
                    ((p) this).field_g = this.a((byte) -28, var2, var3);
                }
            }
        }
        if (param0 != 23389) {
            boolean discarded$0 = ((p) this).a(-100);
        }
        if (!(null != ((p) this).field_d)) {
            ((p) this).field_d = tk.field_b.b(-100);
        }
        if (!(null != ((p) this).field_g)) {
            return false;
        }
        if (null == ((p) this).field_d) {
            return false;
        }
        return true;
    }

    private final int a(int param0, ed param1, int param2, byte param3) {
        int var5 = this.a(param2, param0, param1, 5214);
        if ((var5 ^ -1) > -1) {
            return 0;
        }
        if (param3 >= -88) {
            Object var6 = null;
            int discarded$0 = this.a(43, 80, (ed) null, 108);
        }
        return param1.field_B[var5];
    }

    private final ed a(ed param0, ed param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (param2 == -48) {
            break L0;
          } else {
            field_a = -34;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (param0.field_z <= var4) {
            return param0;
          } else {
            var5 = 0;
            L2: while (true) {
              if (param0.field_A <= var5) {
                var4++;
                continue L1;
              } else {
                var6 = this.a(var5, param1, var4, (byte) -93);
                if (var6 == 0) {
                  this.a(var4, 0, (byte) -128, param0, var5);
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final ed[] a(int param0, ed[] param1) {
        int var3 = 0;
        ed var4 = null;
        int var5 = EscapeVector.field_A;
        for (var3 = param0; var3 < param1.length; var3++) {
            var4 = this.a(param0 + 0, param1[var3]);
            param1[var3] = var4;
        }
        return param1;
    }

    private final void a(int param0, int param1, byte param2, ed param3, int param4) {
        int var7 = -100 % ((param2 - 45) / 54);
        int var6 = this.a(param0, param4, param3, 5214);
        if (0 > var6) {
            return;
        }
        param3.field_B[var6] = param1;
    }

    final static ed a(byte param0, String param1, mf param2, String param3) {
        int var4 = param2.b(-1, param3);
        int var5 = param2.a(var4, param1, true);
        if (param0 != 8) {
            Object var6 = null;
            ed discarded$0 = p.a((byte) -89, (String) null, (mf) null, (String) null);
        }
        return hk.a(param2, true, var5, var4);
    }

    private final ed[] a(byte param0, ed[] param1, ed[] param2) {
        param2 = this.a(0, param2);
        if (param0 != -28) {
            ((p) this).field_d = null;
        }
        return this.a(0, param1, param2);
    }

    private final ed[] a(int param0, ed[] param1, ed[] param2) {
        int var4 = 0;
        ed var5 = null;
        int var6 = EscapeVector.field_A;
        for (var4 = param0; param1.length > var4; var4++) {
            var5 = this.a(param1[var4], param2[var4], (byte) -48);
            param1[var4] = var5;
        }
        return param1;
    }

    private final ed a(int param0, ed param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = param1.field_B;
        int[] var3 = var7;
        for (var4 = param0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (-1 == (var5 ^ -1)) {
                var5 = 0;
            } else {
                var5 = 1;
            }
            var7[var4] = var5;
        }
        return param1;
    }

    private final int a(int param0, int param1, ed param2, int param3) {
        if (!(param1 >= param2.field_q)) {
            return -1;
        }
        if (param2.field_v > param0) {
            return -1;
        }
        param1 = -param2.field_q + param1;
        if (param2.field_s <= param1) {
            return -1;
        }
        if (param3 != 5214) {
            p.b(43);
        }
        param0 = param0 + -param2.field_v;
        if (!(param2.field_x > param0)) {
            return -1;
        }
        int var5 = param0 * param2.field_s - -param1;
        return var5;
    }

    p() {
        ((p) this).field_b = 2917671;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = 20;
        field_e = "to return to the normal view.";
        field_j = new int[]{15, 26};
    }
}
