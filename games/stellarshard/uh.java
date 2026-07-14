/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private gg field_c;
    private int field_d;
    private gg field_a;
    private int field_e;
    private gg[] field_b;

    final static void a(int param0, int param1, int param2, int param3) {
        lg.field_b = param3;
        if (param0 != 11130) {
            Object var5 = null;
            boolean discarded$0 = uh.a((fd) null, -29, (fd) null);
        }
        ul.field_G = param1;
        kl.field_k = param2;
    }

    final gg a(long param0, int param1) {
        gg var6 = null;
        int var7 = stellarshard.field_B;
        int var4 = 33 % ((-51 - param1) / 53);
        gg var5 = ((uh) this).field_b[(int)(param0 & (long)(((uh) this).field_d - 1))];
        ((uh) this).field_c = var5.field_g;
        while (((uh) this).field_c != var5) {
            if ((((uh) this).field_c.field_j ^ -1L) == (param0 ^ -1L)) {
                var6 = ((uh) this).field_c;
                ((uh) this).field_c = ((uh) this).field_c.field_g;
                return var6;
            }
            ((uh) this).field_c = ((uh) this).field_c.field_g;
        }
        ((uh) this).field_c = null;
        return null;
    }

    final static boolean a(fd param0, int param1, fd param2) {
        int var4 = stellarshard.field_B;
        int var3 = param2.field_ob + -param0.field_ob;
        if (param2.field_pb == uf.field_f) {
            // wide iinc 3 -200
        } else {
            if (!(param2.field_pb != null)) {
                // wide iinc 3 200
            }
        }
        if (param1 != 200) {
            Object var5 = null;
            boolean discarded$0 = uh.a((fd) null, 15, (fd) null);
        }
        if (uf.field_f == param0.field_pb) {
            // wide iinc 3 200
        } else {
            if (param0.field_pb == null) {
                // wide iinc 3 -200
            }
        }
        return var3 > 0 ? true : false;
    }

    final gg b(byte param0) {
        gg var2 = null;
        int var3 = 0;
        L0: {
          var3 = stellarshard.field_B;
          if ((((uh) this).field_e ^ -1) >= -1) {
            break L0;
          } else {
            if (((uh) this).field_a == ((uh) this).field_b[-1 + ((uh) this).field_e]) {
              break L0;
            } else {
              var2 = ((uh) this).field_a;
              ((uh) this).field_a = var2.field_g;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (((uh) this).field_d <= ((uh) this).field_e) {
            if (param0 < 38) {
              ((uh) this).field_d = -87;
              return null;
            } else {
              return null;
            }
          } else {
            ((uh) this).field_e = ((uh) this).field_e + 1;
            var2 = ((uh) this).field_b[((uh) this).field_e].field_g;
            if (((uh) this).field_b[((uh) this).field_e - 1] != var2) {
              ((uh) this).field_a = var2.field_g;
              return var2;
            } else {
              continue L1;
            }
          }
        }
    }

    final static wh[] a(ha param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        wh[] var4 = null;
        int var5 = 0;
        wh var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        var2 = param0.e(8, 8);
        if (0 >= var2) {
          if (param1 == -1) {
            var3 = param0.e(12, 8);
            var4 = new wh[var3];
            var5 = 0;
            L0: while (true) {
              if (var5 >= var3) {
                return var4;
              } else {
                if (!mh.a(param0, (byte) -77)) {
                  var6 = param0.e(eh.a(var5 - 1, (byte) -109), param1 ^ -9);
                  var4[var5] = var4[var6];
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new wh();
                  int discarded$156 = param0.e(24, 8);
                  int discarded$157 = param0.e(24, param1 + 9);
                  var6_ref.field_b = param0.e(24, 8);
                  int discarded$158 = param0.e(9, 8);
                  int discarded$159 = param0.e(12, 8);
                  int discarded$160 = param0.e(12, 8);
                  int discarded$161 = param0.e(12, 8);
                  var4[var5] = var6_ref;
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final gg a(byte param0) {
        int var2 = -68 % ((param0 - 32) / 59);
        ((uh) this).field_e = 0;
        return ((uh) this).b((byte) 63);
    }

    final void a(gg param0, long param1, int param2) {
        if (param0.field_c != null) {
            param0.c(20);
        }
        gg var5 = ((uh) this).field_b[(int)((long)(((uh) this).field_d - param2) & param1)];
        param0.field_g = var5;
        param0.field_c = var5.field_c;
        param0.field_c.field_g = param0;
        param0.field_g.field_c = param0;
        param0.field_j = param1;
    }

    uh(int param0) {
        int var2 = 0;
        gg var3 = null;
        ((uh) this).field_e = 0;
        ((uh) this).field_b = new gg[param0];
        ((uh) this).field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new gg();
            ((uh) this).field_b[var2] = new gg();
            var3.field_c = var3;
            var3.field_g = var3;
        }
    }

    static {
    }
}
