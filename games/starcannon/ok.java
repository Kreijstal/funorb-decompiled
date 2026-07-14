/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends ph implements ga {
    private kh field_pb;
    static sb field_sb;
    static String field_qb;
    static hj[] field_rb;
    static ed field_tb;
    private boolean field_ob;
    private boolean field_ub;

    final static int a(byte param0, ma param1, ma param2) {
        if (param0 != -49) {
            field_tb = null;
        }
        Object var4 = null;
        return bf.a(0, false, (String) null, (byte) 6, param1, param2, 0);
    }

    public static void i(byte param0) {
        field_sb = null;
        if (param0 != -90) {
            return;
        }
        field_qb = null;
        field_rb = null;
        field_tb = null;
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        if (((ok) this).field_ub) {
            ba.a(true, false, 2);
            return;
        }
        ej.f((byte) -80);
        if (param2) {
            ((ok) this).p(108);
        }
        ((ok) this).n(-115);
    }

    private final void a(boolean param0, ig param1, int param2) {
        String var4 = null;
        kj var5 = null;
        Object var6 = null;
        L0: {
          if (param2 == 10476) {
            break L0;
          } else {
            var6 = null;
            this.a(false, (ig) null, 102);
            break L0;
          }
        }
        L1: {
          ((ok) this).field_ob = true;
          if (param1.field_f) {
            var4 = qd.field_C;
            break L1;
          } else {
            if (null != param1.field_a) {
              var4 = cf.field_s;
              if (((ok) this).field_pb != null) {
                ((ok) this).field_pb.a(-12920);
                break L1;
              } else {
                break L1;
              }
            } else {
              var4 = param1.field_d;
              if ((param1.field_e ^ -1) != -249) {
                break L1;
              } else {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    u.a(true);
                    break L2;
                  }
                }
                ((ok) this).field_ub = true;
                var4 = bg.field_d;
                break L1;
              }
            }
          }
        }
        L3: {
          var5 = new kj((ph) this, tk.field_a, var4);
          if (param1.field_f) {
            if (param1.field_g) {
              ((ok) this).c(20317, (uj) (Object) new jj((ok) this));
              return;
            } else {
              dk discarded$2 = var5.a((byte) 110, (qg) this, ui.field_s);
              break L3;
            }
          } else {
            L4: {
              if (!((ok) this).field_ub) {
                if ((param1.field_e ^ -1) == -6) {
                  var5.a(hd.field_i, 13759, 11);
                  var5.a(bg.field_b, 13759, 17);
                  break L4;
                } else {
                  var5.a(dk.field_t, 13759, -1);
                  break L4;
                }
              } else {
                dk discarded$3 = var5.a((byte) 110, (qg) this, ui.field_s);
                break L4;
              }
            }
            if (param1.field_e == 3) {
              var5.a(kf.field_u, param2 ^ 7507, 7);
              break L3;
            } else {
              if (6 != param1.field_e) {
                break L3;
              } else {
                var5.a(dk.field_w, 13759, 9);
                break L3;
              }
            }
          }
        }
        ((ok) this).c(param2 + 9841, (uj) (Object) var5);
    }

    ok(tc param0, kh param1) {
        super(param0, tk.field_a, ge.field_a, false, false);
        ((ok) this).field_pb = param1;
    }

    final void p(int param0) {
        if (param0 != 10341) {
            field_tb = null;
        }
        this.a(true, fb.a(bg.field_d, 248, 0), 10476);
    }

    final boolean g(byte param0) {
        ig var2 = null;
        if (((ok) this).field_G) {
            if (!((ok) this).field_ob) {
                var2 = ii.a((byte) -92);
                if (!(var2 == null)) {
                    this.a(false, var2, 10476);
                }
            }
        }
        if (param0 != -124) {
            field_rb = null;
        }
        return super.g((byte) -124);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_rb = new hj[255];
        field_qb = "Names can only contain letters, numbers, spaces and underscores";
        for (var0 = 0; var0 < field_rb.length; var0++) {
            field_rb[var0] = new hj();
        }
    }
}
