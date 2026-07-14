/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends wl {
    static int field_t;
    int field_u;
    static String field_m;
    static String field_i;
    static o field_l;
    int field_p;
    int field_v;
    int field_s;
    static int field_k;
    int field_r;
    static o field_n;
    static boolean field_j;
    int[] field_q;
    int field_o;

    public static void a(int param0) {
        field_l = null;
        field_i = null;
        field_n = null;
        field_m = null;
        if (param0 == 1) {
            return;
        }
        ei.a((byte) 91, -43);
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ei) this).field_o = param1;
        ((ei) this).field_v = param4;
        if (param5 != -24536) {
          return;
        } else {
          ((ei) this).field_r = param2;
          ((ei) this).field_s = param6;
          ((ei) this).field_q = param0;
          ((ei) this).field_u = param7;
          ((ei) this).field_p = param3;
          return;
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4) {
        o[] var5 = null;
        o[] var6 = null;
        var6 = new o[9];
        var5 = var6;
        var6[6] = id.a((byte) 107, param1, param3);
        var5[3] = id.a((byte) 107, param1, param3);
        var5[2] = id.a((byte) 107, param1, param3);
        var5[1] = id.a((byte) 107, param1, param3);
        var5[0] = id.a((byte) 107, param1, param3);
        if (param4 == 20230) {
          var6[8] = id.a((byte) 76, param0, param3);
          var5[7] = id.a((byte) 76, param0, param3);
          var5[5] = id.a((byte) 76, param0, param3);
          if (-1 != (param2 ^ -1)) {
            var6[4] = id.a((byte) 98, param2, 64);
            return var5;
          } else {
            return var5;
          }
        } else {
          ei.a(-59);
          var6[8] = id.a((byte) 76, param0, param3);
          var5[7] = id.a((byte) 76, param0, param3);
          var5[5] = id.a((byte) 76, param0, param3);
          if (-1 == (param2 ^ -1)) {
            return var5;
          } else {
            var6[4] = id.a((byte) 98, param2, 64);
            return var5;
          }
        }
    }

    final static void a(byte param0, int param1) {
        wl var2 = null;
        int var3 = 0;
        pg var4 = null;
        var3 = wizardrun.field_H;
        var4 = (pg) (Object) sf.field_j.b((byte) 115);
        L0: while (true) {
          if (var4 == null) {
            var2 = bk.field_d.b((byte) 96);
            L1: while (true) {
              if (var2 == null) {
                if (param0 == 51) {
                  return;
                } else {
                  o[] discarded$1 = ei.a(122, 75, 31, 20, 79);
                  return;
                }
              } else {
                hg.a(param1, (byte) 106);
                var2 = bk.field_d.d(param0 + 8141);
                continue L1;
              }
            }
          } else {
            pg.a(param1, true, var4);
            var4 = (pg) (Object) sf.field_j.d(8192);
            continue L0;
          }
        }
    }

    ei() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Player";
        field_m = "Hold <%0> or SPACE";
        field_j = true;
    }
}
