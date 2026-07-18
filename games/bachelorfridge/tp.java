/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends ana {
    private u field_w;
    private taa field_y;
    static kv field_x;
    static int field_v;

    private final void d(int param0) {
        hd var2 = null;
        op var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        hd var16_ref = null;
        int[][] var20 = null;
        var16 = null;
        var15 = BachelorFridge.field_y;
        var16_ref = (hd) (Object) al.a(103, ((tp) this).field_w.field_k);
        var2 = var16_ref;
        var3 = ((tp) this).field_q.field_h;
        aga discarded$2 = ((tp) this).field_w.field_l.a(63, ((tp) this).field_q.field_h);
        var20 = ((tp) this).field_w.e((byte) -18);
        var5 = ((tp) this).field_w.field_r;
        var6 = ((tp) this).field_w.field_q;
        var7 = 17;
        var8 = 17;
        var9 = -1 + var7 >> 1;
        var10 = -1 + var8 >> 1;
        var11 = 0;
        L0: while (true) {
          if (var7 <= var11) {
            ((tp) this).field_w.a(((tp) this).field_q.field_h, false);
            return;
          } else {
            var12 = 0;
            L1: while (true) {
              if (var12 >= var8) {
                var11++;
                continue L0;
              } else {
                if (-2 == var20[var11][var12]) {
                  var13 = var5 + (-var9 + var11);
                  var14 = var12 - (var10 - var6);
                  if (-1 <= var13) {
                    if (var3.field_z > var13) {
                      if (var14 >= 0) {
                        if (var3.field_B > var14) {
                          uea discarded$3 = new uea(((tp) this).field_q, var13, var14, gma.field_e[var16_ref.field_q].field_a);
                          var12++;
                          continue L1;
                        } else {
                          var12++;
                          continue L1;
                        }
                      } else {
                        var12++;
                        continue L1;
                      }
                    } else {
                      var12++;
                      continue L1;
                    }
                  } else {
                    var12++;
                    continue L1;
                  }
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    tp(gj param0, u param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((tp) this).field_w = param1;
            ((tp) this).field_y = new taa(((tp) this).field_q, ((tp) this).field_w.field_r, ((tp) this).field_w.field_q);
            ((tp) this).a(27799, (at) (Object) ((tp) this).field_y);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(int param0) {
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -68 / ((71 - param0) / 47);
        if (((tp) this).field_m.a((byte) -106)) {
          return false;
        } else {
          if (!((tp) this).field_y.a((byte) -106)) {
            int fieldTemp$2 = ((tp) this).field_l - 1;
            ((tp) this).field_l = ((tp) this).field_l - 1;
            if (fieldTemp$2 < 0) {
              this.e(-1);
              return true;
            } else {
              L0: {
                if (((tp) this).field_l != 75) {
                  break L0;
                } else {
                  jja.a(256, -1, 57);
                  this.d(17);
                  break L0;
                }
              }
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void e(byte param0) {
        field_x = null;
        if (param0 != -75) {
            tp.e((byte) 8);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = -1;
    }
}
