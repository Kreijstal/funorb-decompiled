/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi implements ml {
    static ad field_d;
    static long field_f;
    static le field_e;
    static String field_a;
    static int field_c;
    static String[] field_b;

    final static void a(int param0, int param1) {
        int var3 = 0;
        me var4 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = (me) (Object) af.field_a.a((byte) -117);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 1197) {
              field_d = null;
              return;
            } else {
              return;
            }
          } else {
            qc.a(var4, (byte) 117, param0);
            var4 = (me) (Object) af.field_a.d((byte) 63);
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 256) {
          wi.a(127, 91);
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        le var9 = null;
        le var10 = null;
        if (param4 > 19) {
          var6 = param3 + param1.field_r;
          var7 = param1.field_e + param2;
          eb.b(var6, 0, param1.field_p, param1.field_l, var7);
          var10 = hk.field_i[1];
          if (param1 instanceof t) {
            if (((t) (Object) param1).field_u) {
              var10.c((-var10.field_m + param1.field_l >> 1687994465) + var6 + 1, (param1.field_p - var10.field_n >> 1839470177) + (1 + var7), 256);
              if (param1.b((byte) 64)) {
                hk.a(2 + var6, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
                return;
              } else {
                return;
              }
            } else {
              if (param1.b((byte) 64)) {
                hk.a(2 + var6, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1.b((byte) 64)) {
              hk.a(2 + var6, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
              return;
            } else {
              return;
            }
          }
        } else {
          wi.a(-113);
          var6 = param3 + param1.field_r;
          var7 = param1.field_e + param2;
          eb.b(var6, 0, param1.field_p, param1.field_l, var7);
          var9 = hk.field_i[1];
          if (param1 instanceof t) {
            if (((t) (Object) param1).field_u) {
              var9.c((-var9.field_m + param1.field_l >> 1687994465) + var6 + 1, (param1.field_p - var9.field_n >> 1839470177) + (1 + var7), 256);
              if (param1.b((byte) 64)) {
                hk.a(2 + var6, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
                return;
              } else {
                return;
              }
            } else {
              if (param1.b((byte) 64)) {
                hk.a(2 + var6, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1.b((byte) 64)) {
              hk.a(2 + var6, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = "OK";
    }
}
