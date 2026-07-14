/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends lw {
    static String field_o;
    static String field_l;
    static int[] field_m;
    static ee field_n;

    public static void d(byte param0) {
        field_l = null;
        field_o = null;
        field_m = null;
        field_n = null;
        if (param0 >= -54) {
            wa.e((byte) -49);
        }
    }

    final static sba a(int param0, byte[] param1) {
        sba var2 = null;
        Object var3 = null;
        if (param0 == -21231) {
          if (param1 == null) {
            return null;
          } else {
            var2 = new sba(param1, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
            al.b(-18073);
            return var2;
          }
        } else {
          var3 = null;
          sba discarded$4 = wa.a(-91, (byte[]) null);
          if (param1 == null) {
            return null;
          } else {
            var2 = new sba(param1, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
            al.b(-18073);
            return var2;
          }
        }
    }

    final void a(byte param0) {
        if (param0 <= 103) {
            wa.e((byte) -22);
        }
    }

    final void a(int param0, byte param1) {
        if ((param0 ^ -1) == -35) {
          ((wa) this).b(1);
          if (!((wa) this).c((byte) 95)) {
            L0: {
              if (param1 == 73) {
                break L0;
              } else {
                field_o = null;
                break L0;
              }
            }
            return;
          } else {
            ((wa) this).b((byte) 112);
            fla.b(23621);
            return;
          }
        } else {
          L1: {
            if (param1 == 73) {
              break L1;
            } else {
              field_o = null;
              break L1;
            }
          }
          return;
        }
    }

    wa() {
        super(true, new String[1], jla.field_f);
        ((wa) this).field_c = new int[][]{new int[2], new int[2]};
    }

    final static void e(byte param0) {
        Object var1 = null;
        kr var1_ref = null;
        int var2 = 0;
        var1 = null;
        var2 = BachelorFridge.field_y;
        if (param0 <= -85) {
          if (qg.field_b.field_z != null) {
            var1_ref = (kr) (Object) qg.field_b.field_z.b((byte) 90);
            L0: while (true) {
              if (var1_ref != null) {
                L1: {
                  if (var1_ref.field_R != 1) {
                    break L1;
                  } else {
                    qm.a(7, 7758);
                    var1_ref.field_yb.c((byte) -80);
                    if (-1 != (var1_ref.field_yb.field_g ^ -1)) {
                      gu.field_d = gu.field_d - 1;
                      break L1;
                    } else {
                      var1_ref.field_yb.a(false);
                      var1_ref.a(false);
                      gu.field_d = gu.field_d - 1;
                      break L1;
                    }
                  }
                }
                var1_ref = (kr) (Object) qg.field_b.field_z.c(0);
                continue L0;
              } else {
                qf.e(20434);
                iaa.a(-119);
                return;
              }
            }
          } else {
            qf.e(20434);
            iaa.a(-119);
            return;
          }
        } else {
          wa.d((byte) -63);
          if (qg.field_b.field_z != null) {
            var1_ref = (kr) (Object) qg.field_b.field_z.b((byte) 90);
            L2: while (true) {
              if (var1_ref != null) {
                L3: {
                  if (var1_ref.field_R != 1) {
                    break L3;
                  } else {
                    qm.a(7, 7758);
                    var1_ref.field_yb.c((byte) -80);
                    if (-1 != (var1_ref.field_yb.field_g ^ -1)) {
                      gu.field_d = gu.field_d - 1;
                      break L3;
                    } else {
                      var1_ref.field_yb.a(false);
                      var1_ref.a(false);
                      gu.field_d = gu.field_d - 1;
                      break L3;
                    }
                  }
                }
                var1_ref = (kr) (Object) qg.field_b.field_z.c(0);
                continue L2;
              } else {
                qf.e(20434);
                iaa.a(-119);
                return;
              }
            }
          } else {
            qf.e(20434);
            iaa.a(-119);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[1024];
        field_o = "This is <%0>'s RuneScape clan if they have one.";
        field_l = "Rankings";
    }
}
