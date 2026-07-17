/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends bw {
    int[] field_g;
    int field_i;
    static int field_h;
    static kv field_j;
    static eaa field_f;

    final static void a(int param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        ug.field_o.e(param0, param1);
        var4 = -98 % ((param2 - -3) / 53);
        if (param3) {
          L0: {
            var5 = 2 * (wga.field_s % ug.field_o.field_q);
            if (ug.field_o.field_q <= var5) {
              var5 = ug.field_o.field_q - var5 - -ug.field_o.field_q;
              break L0;
            } else {
              break L0;
            }
          }
          if (10 > var5) {
            var5 = 10;
            int discarded$4 = 30;
            int discarded$5 = -3702;
            iaa.a(param1, 80, var5, 0, param0, 0, ug.field_o);
            return;
          } else {
            L1: {
              if (-40 + ug.field_o.field_q >= var5) {
                break L1;
              } else {
                var5 = ug.field_o.field_q + -40;
                break L1;
              }
            }
            int discarded$6 = 30;
            int discarded$7 = -3702;
            iaa.a(param1, 80, var5, 0, param0, 0, ug.field_o);
            return;
          }
        } else {
          return;
        }
    }

    public static void a() {
        field_f = null;
        field_j = null;
    }

    final static void a(String param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            io.field_q.field_Z = param0;
            eda.field_j = true;
            var2_int = hga.field_U.field_b;
            var3 = hga.field_U.field_f;
            var4 = io.field_q.field_jb.a(param0, 272, io.field_q.field_B);
            var5 = 7 + (-110 + var3 / 2 - var4 / 2);
            sb.field_n.a(var3 - 120 - var5 * 2, 31407, 320, (-320 + var2_int) / 2, var5);
            sb.field_n.field_eb = mu.a(11579568, 3, sb.field_n.field_p, 8421504, 2105376, (byte) 17);
            io.field_q.a(-24 + (sb.field_n.field_p - 20), 31407, -24 + (-24 + sb.field_n.field_sb), 24, 16);
            aja.field_l.a(24, 31407, 80, 120, -24 + (-20 + sb.field_n.field_p));
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rg.D(" + (param0 != null ? "{...}" : "null") + 44 + 2 + 41);
        }
    }

    private rg() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1) {
        bw var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        cfa var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var5 = (cfa) (Object) eaa.field_d.b((byte) 90);
            L1: while (true) {
              if (var5 == null) {
                var2 = gs.field_l.b((byte) 90);
                var3 = -17;
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$8 = 4;
                    int discarded$9 = 4;
                    ah.a();
                    var2 = gs.field_l.c(0);
                    continue L2;
                  }
                }
              } else {
                nr.a(4, var5, (byte) 102);
                var5 = (cfa) (Object) eaa.field_d.c(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "rg.C(" + 35 + 44 + 4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new kv(270, 70);
        field_f = new eaa();
    }
}
