/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends ee implements pl {
    private String[] field_C;
    private hk[] field_I;
    private ta field_J;
    static qg field_D;
    static dm[] field_H;
    static dm field_G;
    static String field_E;

    final static na a(int param0, rh param1, int param2, boolean param3) {
        if (!mf.a(param0, param2, 123, param1)) {
            return null;
        }
        if (!param3) {
            Object var5 = null;
            na discarded$0 = vh.a(110, (rh) null, -39, true);
        }
        return ab.a(104);
    }

    final static boolean g(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -68) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (oc.field_e == null) {
              break L2;
            } else {
              if (!pk.field_l.a(true)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static String f(int param0) {
        if (param0 != 100) {
            String discarded$0 = vh.f(29);
        }
        if (kd.field_b == tf.field_d) {
            return rh.field_i;
        }
        if (!ih.field_c.a(-113)) {
            return ih.field_c.b(param0 + 19391);
        }
        if (si.field_g == tf.field_d) {
            return ih.field_c.b(19491);
        }
        return b.field_a;
    }

    public static void b(boolean param0) {
        field_H = null;
        field_D = null;
        if (!param0) {
            field_H = null;
        }
        field_E = null;
        field_G = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 88, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        m var5 = ng.field_F;
        int var6 = -69 / ((1 - param2) / 43);
        if (!(((vh) this).field_C == null)) {
            int discarded$0 = var5.a(ab.field_e, ((vh) this).field_v + param0, param1 + ((vh) this).field_m, ((vh) this).field_r, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_o);
        }
    }

    vh(ta param0) {
        super(0, 0, 0, 0, (dh) null);
        ((vh) this).field_J = param0;
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        if (param1 != 13) {
            field_E = null;
        }
        if (!(!super.a(param0, param1 + 0, param2, param3))) {
            return true;
        }
        if ((param0 ^ -1) == -99) {
            return ((vh) this).a(7305, param3);
        }
        if (99 == param0) {
            return ((vh) this).a(param3, -110);
        }
        return false;
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Geoblox.field_C;
        if (param1 == -20) {
          var6 = 0;
          L0: while (true) {
            if (((vh) this).field_C.length <= var6) {
              L1: {
                if (((vh) this).field_I[((vh) this).field_C.length] != param4) {
                  break L1;
                } else {
                  ((vh) this).field_J.a((byte) 83);
                  break L1;
                }
              }
              return;
            } else {
              if (((vh) this).field_I[var6] == param4) {
                ((vh) this).field_J.a(((vh) this).field_C[var6], 20);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        fh var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Geoblox.field_C;
        ((vh) this).field_z.c((byte) -98);
        if (param0 == 126) {
          L0: {
            if (param1 == null) {
              break L0;
            } else {
              if (param1.length != 0) {
                var3 = param1.length;
                ((vh) this).field_C = new String[var3];
                var4_int = 0;
                L1: while (true) {
                  if (var3 <= var4_int) {
                    var4 = new fh(ng.field_F, 0, 1);
                    ((vh) this).field_I = new hk[var3 + 1];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var3) {
                        ((vh) this).field_I[var3] = new hk(ll.field_a, (bb) this);
                        ((vh) this).field_I[var3].field_q = (dh) (Object) var4;
                        ((vh) this).field_I[var3].a(15, 100, (byte) -59, 16 + (var3 * 16 + 20), 0);
                        ((vh) this).b((byte) -122, (el) (Object) ((vh) this).field_I[var3]);
                        return;
                      } else {
                        ((vh) this).field_I[var5] = new hk(((vh) this).field_C[var5], (bb) this);
                        ((vh) this).field_I[var5].field_q = (dh) (Object) var4;
                        ((vh) this).field_I[var5].field_j = ml.field_u;
                        ((vh) this).field_I[var5].a(15, 80, (byte) -14, var5 * 16 + 20, 0);
                        ((vh) this).b((byte) -126, (el) (Object) ((vh) this).field_I[var5]);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    ((vh) this).field_C[var4_int] = p.a((CharSequence) (Object) param1[var4_int], param0 + -123).replace(' ', ' ');
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          ((vh) this).field_C = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new qg(0);
        field_E = "Welcome to Geoblox, a game where you earn points for matching geoblox by shape or colour. Just make sure you don't allow your falling geoblox to get out of control and stack outside of the play area!<br><br>To play Geoblox, you need to rotate the play area by pressing and holding the <img=0> or <img=1> arrow keys. Press <img=2> and then experiment with left and right rotation until the next tip comes up. Press <img=2> to continue.";
    }
}
