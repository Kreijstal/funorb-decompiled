/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rcb extends dqa implements oo {
    private htb[] field_v;
    private jpb field_x;
    private String[] field_w;

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, 96, param3);
        if (param2 < 47) {
            Object var6 = null;
            ((rcb) this).a(47, 33, 22, (htb) null, 15);
        }
        if (!(param1 == 0)) {
            return;
        }
        no var5 = loa.field_o;
        if (!(null == ((rcb) this).field_w)) {
            int discarded$0 = var5.a(lrb.field_a, ((rcb) this).field_g + param0, ((rcb) this).field_r + param3, ((rcb) this).field_h, 20, 16777215, -1, 0, 0, var5.field_k - -var5.field_A);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (param0 == 11) {
          var6 = 0;
          L0: while (true) {
            if (((rcb) this).field_w.length <= var6) {
              L1: {
                if (param3 != ((rcb) this).field_v[((rcb) this).field_w.length]) {
                  break L1;
                } else {
                  ((rcb) this).field_x.a(1546);
                  break L1;
                }
              }
              return;
            } else {
              if (((rcb) this).field_v[var6] == param3) {
                ((rcb) this).field_x.a((byte) 41, ((rcb) this).field_w[var6]);
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

    final void a(String[] param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        meb var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          ((rcb) this).field_t.e(101);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length != 0) {
              var3 = param0.length;
              ((rcb) this).field_w = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  var4 = new meb(loa.field_o, param1, 1);
                  ((rcb) this).field_v = new htb[1 + var3];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var3) {
                      ((rcb) this).field_v[var3] = new htb(wpa.field_o, (sba) this);
                      ((rcb) this).field_v[var3].field_q = (wwa) (Object) var4;
                      ((rcb) this).field_v[var3].a(0, 100, 15, 1, 16 - -(var3 * 16) + 20);
                      ((rcb) this).b(-18756, (shb) (Object) ((rcb) this).field_v[var3]);
                      return;
                    } else {
                      ((rcb) this).field_v[var5] = new htb(((rcb) this).field_w[var5], (sba) this);
                      ((rcb) this).field_v[var5].field_q = (wwa) (Object) var4;
                      ((rcb) this).field_v[var5].field_p = nv.field_p;
                      ((rcb) this).field_v[var5].a(0, 80, 15, 1, var5 * 16 + 20);
                      ((rcb) this).b(-18756, (shb) (Object) ((rcb) this).field_v[var5]);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  ((rcb) this).field_w[var4_int] = joa.a((CharSequence) (Object) param0[var4_int], false).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((rcb) this).field_w = null;
    }

    rcb(jpb param0) {
        super(0, 0, 0, 0, (wwa) null);
        ((rcb) this).field_x = param0;
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (98 == param1) {
            return ((rcb) this).a(param2, param0 + 15834);
        }
        if (99 != param1) {
            return false;
        }
        return ((rcb) this).a(true, param2);
    }

    static {
    }
}
