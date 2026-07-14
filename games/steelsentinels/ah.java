/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends gh {
    gh field_cc;
    String field_dc;
    static int field_Wb;
    gh field_Ub;
    static gh[] field_Yb;
    static String field_Sb;
    int field_bc;
    String field_Tb;
    String field_Vb;
    static wk[] field_Zb;
    String field_ac;
    static String field_Xb;
    static String field_fc;
    gh field_ec;

    public static void b(boolean param0) {
        Object var2 = null;
        field_Yb = null;
        field_Zb = null;
        field_Xb = null;
        if (param0) {
          var2 = null;
          Object discarded$2 = ah.a(false, (byte[]) null, 18);
          field_fc = null;
          field_Sb = null;
          return;
        } else {
          field_fc = null;
          field_Sb = null;
          return;
        }
    }

    final static void a(int param0, cm param1) {
        int var3 = 0;
        int var4 = 0;
        wk var5 = null;
        wk var6 = null;
        if (param0 < 54) {
          field_Xb = null;
          var5 = new wk(param1.a("", -742, "final_frame.jpg"), (java.awt.Component) (Object) sl.field_n);
          var3 = var5.field_A;
          var4 = var5.field_F;
          jl.a(false);
          dj.field_c = new wk(var3, 3 * var4 / 4);
          dj.field_c.d();
          var5.f(0, 0);
          hd.field_k = new wk(var3, -dj.field_c.field_F + var4);
          hd.field_k.d();
          var5.f(0, -dj.field_c.field_F);
          hd.field_k.field_H = dj.field_c.field_F;
          tk.f((byte) 107);
          return;
        } else {
          var6 = new wk(param1.a("", -742, "final_frame.jpg"), (java.awt.Component) (Object) sl.field_n);
          var3 = var6.field_A;
          var4 = var6.field_F;
          jl.a(false);
          dj.field_c = new wk(var3, 3 * var4 / 4);
          dj.field_c.d();
          var6.f(0, 0);
          hd.field_k = new wk(var3, -dj.field_c.field_F + var4);
          hd.field_k.d();
          var6.f(0, -dj.field_c.field_F);
          hd.field_k.field_H = dj.field_c.field_F;
          tk.f((byte) 107);
          return;
        }
    }

    ah() {
        super(0L, (gh) null);
    }

    final static Object a(boolean param0, byte[] param1, int param2) {
        ge var3 = null;
        if (param1 != null) {
          if (136 >= param1.length) {
            if (param2 == 0) {
              if (!param0) {
                return (Object) (Object) param1;
              } else {
                return (Object) (Object) ff.a((byte) 89, param1);
              }
            } else {
              field_Wb = -90;
              if (!param0) {
                return (Object) (Object) param1;
              } else {
                return (Object) (Object) ff.a((byte) 89, param1);
              }
            }
          } else {
            var3 = new ge();
            ((gb) (Object) var3).a((byte) -62, param1);
            return (Object) (Object) var3;
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, int param1) {
        Object var3 = null;
        if (je.field_t > 0) {
          if (im.field_b) {
            L0: {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fl.field_b.a(param0, (byte) 127);
              if (-1 > bd.field_c) {
                break L0;
              } else {
                if (-1 < fj.field_f) {
                  break L0;
                } else {
                  if (param1 <= -25) {
                    return;
                  } else {
                    var3 = null;
                    ah.a(87, (cm) null);
                    return;
                  }
                }
              }
            }
            if (!vb.field_c) {
              if (param1 <= -25) {
                return;
              } else {
                var3 = null;
                ah.a(87, (cm) null);
                return;
              }
            } else {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fb.field_r.a(param0, (byte) 127);
              if (param1 <= -25) {
                return;
              } else {
                var3 = null;
                ah.a(87, (cm) null);
                return;
              }
            }
          } else {
            L1: {
              if (-1 > bd.field_c) {
                break L1;
              } else {
                if (-1 < fj.field_f) {
                  break L1;
                } else {
                  if (param1 > -25) {
                    var3 = null;
                    ah.a(87, (cm) null);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (!vb.field_c) {
              if (param1 > -25) {
                var3 = null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            } else {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fb.field_r.a(param0, (byte) 127);
              if (param1 > -25) {
                var3 = null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (-1 <= (bd.field_c ^ -1)) {
            if (-1 <= (fj.field_f ^ -1)) {
              if (param1 > -25) {
                var3 = null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            } else {
              if (!vb.field_c) {
                if (param1 > -25) {
                  var3 = null;
                  ah.a(87, (cm) null);
                  return;
                } else {
                  return;
                }
              } else {
                pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
                fb.field_r.a(param0, (byte) 127);
                if (param1 > -25) {
                  var3 = null;
                  ah.a(87, (cm) null);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (!vb.field_c) {
              if (param1 > -25) {
                var3 = null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            } else {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fb.field_r.a(param0, (byte) 127);
              if (param1 > -25) {
                var3 = null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Xb = "Accept invitation to <%0>'s game";
        field_fc = "Searching for an opponent";
        field_Sb = "Continue";
    }
}
