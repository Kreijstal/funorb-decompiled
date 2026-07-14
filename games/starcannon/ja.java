/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static hl field_e;
    static int field_d;
    private ue field_h;
    private ue field_b;
    static String field_g;
    private ih field_f;
    static n field_c;
    private ih field_a;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var3 = 0;
        var4 = nd.field_m;
        if (param2 > 91) {
          L0: while (true) {
            if (var3 >= uh.field_h.length) {
              return -1;
            } else {
              var5 = eg.field_a[var3];
              if (0 > var5) {
                var4 = var4 + sg.field_e;
                var3++;
                continue L0;
              } else {
                var6 = fb.a(uh.field_h[var3], (byte) 26, true);
                var4 = var4 + mc.field_h;
                var7 = ee.field_b + -(var6 >> -2037948255);
                if (!rh.a(pk.field_c - -(kc.field_S << -798496127), param1, (rh.field_i << 919036801) + var6, -rh.field_i + var7, var4, param0, -89)) {
                  var4 = var4 + (pk.field_c + mc.field_h + (kc.field_S << 144335681));
                  var3++;
                  continue L0;
                } else {
                  return var5;
                }
              }
            }
          }
        } else {
          return 72;
        }
    }

    private final ud a(int[] param0, int param1, int param2, int param3) {
        int var5 = (param3 >>> 660508620 | (param3 & -805302273) << -1695677948) ^ param1;
        var5 = var5 | param3 << -154911344;
        long var6 = (long)var5;
        ud var8 = (ud) (Object) ((ja) this).field_a.a(var6, (byte) 111);
        if (param2 != 0) {
            ((ja) this).field_h = null;
        }
        if (var8 != null) {
            return var8;
        }
        if (param0 != null) {
            if (-1 <= (param0[0] ^ -1)) {
                return null;
            }
        }
        aj var9 = aj.a(((ja) this).field_h, param3, param1);
        if (var9 == null) {
            return null;
        }
        ud var10 = var9.a();
        ud var8_ref = var10;
        ((ja) this).field_a.a(var6, (byte) -100, (rf) (Object) var8_ref);
        if (param0 != null) {
            param0[0] = param0[0] - var10.field_i.length;
        }
        return var8_ref;
    }

    final ud a(int param0, int param1, byte param2) {
        if (param2 != 41) {
            return null;
        }
        return this.a(param1, (byte) 127, param0, (int[]) null);
    }

    public static void a(byte param0) {
        if (param0 <= 67) {
            return;
        }
        field_e = null;
        field_c = null;
        field_g = null;
    }

    private final ud a(int param0, byte param1, int param2, int[] param3) {
        nj var9_ref = null;
        int var5 = param0 ^ (param2 >>> 251397644 | 65521 & param2 << 2095765188);
        var5 = var5 | param2 << 1082343472;
        long var6 = (long)var5 ^ 4294967296L;
        ud var8 = (ud) (Object) ((ja) this).field_a.a(var6, (byte) 60);
        if (var8 != null) {
            return var8;
        }
        if (param3 != null) {
            if (0 >= param3[0]) {
                return null;
            }
        }
        nj var9 = (nj) (Object) ((ja) this).field_f.a(var6, (byte) 42);
        if (!(var9 != null)) {
            var9_ref = nj.a(((ja) this).field_b, param2, param0);
            if (var9_ref == null) {
                return null;
            }
            ((ja) this).field_f.a(var6, (byte) -100, (rf) (Object) var9_ref);
        }
        if (param1 <= 120) {
            return null;
        }
        ud var8_ref = var9_ref.a(param3);
        if (var8_ref == null) {
            return null;
        }
        var9_ref.b(4);
        ((ja) this).field_a.a(var6, (byte) -100, (rf) (Object) var8_ref);
        return var8_ref;
    }

    final ud b(int param0, int param1, int param2) {
        if (param2 < 87) {
            field_g = null;
        }
        return this.a((int[]) null, param0, 0, param1);
    }

    ja(ue param0, ue param1) {
        ((ja) this).field_f = new ih(256);
        ((ja) this).field_a = new ih(256);
        ((ja) this).field_b = param1;
        ((ja) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Orb coins: <%0>";
        field_c = new n(1);
    }
}
