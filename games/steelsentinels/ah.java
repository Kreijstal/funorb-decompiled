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
        byte[] var2;
        field_Yb = null;
        field_Zb = null;
        field_Xb = null;
        if (param0) {
          var2 = (byte[]) null;
          ah.a(false, (byte[]) null, 18);
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
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            if (param0 < 54) {
                field_Xb = (String) null;
            }
            var2 = new wk(param1.a("", -742, "final_frame.jpg"), (java.awt.Component) ((Object) sl.field_n));
            var3 = var2.field_A;
            var4 = var2.field_F;
            jl.a(false);
            dj.field_c = new wk(var3, 3 * var4 / 4);
            dj.field_c.d();
            var2.f(0, 0);
            hd.field_k = new wk(var3, -dj.field_c.field_F + var4);
            hd.field_k.d();
            var2.f(0, -dj.field_c.field_F);
            hd.field_k.field_H = dj.field_c.field_F;
            tk.f((byte) 107);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ah.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ah() {
        super(0L, (gh) null);
    }

    final static Object a(boolean param0, byte[] param1, int param2) {
        ge var3 = null;
        RuntimeException var3_ref = null;
        ge stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (136 >= param1.length) {
                L1: {
                  if (param2 == 0) {
                    break L1;
                  } else {
                    field_Wb = -90;
                    break L1;
                  }
                }
                if (param0) {
                  stackIn_12_0 = ff.a((byte) 89, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = (byte[]) (param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var3 = new ge();
                ((gb) ((Object) var3)).a((byte) -62, param1);
                stackIn_5_0 = (ge) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ah.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        cm var3;
        if (je.field_t > 0) {
          if (im.field_b) {
            L0: {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fl.field_b.a(param0, (byte) 127);
              if (-1 > (bd.field_c ^ -1)) {
                break L0;
              } else {
                if (-1 > (fj.field_f ^ -1)) {
                  break L0;
                } else {
                  if (param1 <= -25) {
                    return;
                  } else {
                    var3 = (cm) null;
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
                var3 = (cm) null;
                ah.a(87, (cm) null);
                return;
              }
            } else {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fb.field_r.a(param0, (byte) 127);
              if (param1 <= -25) {
                return;
              } else {
                var3 = (cm) null;
                ah.a(87, (cm) null);
                return;
              }
            }
          } else {
            L1: {
              if (-1 > (bd.field_c ^ -1)) {
                break L1;
              } else {
                if (-1 > (fj.field_f ^ -1)) {
                  break L1;
                } else {
                  if (param1 > -25) {
                    var3 = (cm) null;
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
                var3 = (cm) null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            } else {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fb.field_r.a(param0, (byte) 127);
              if (param1 > -25) {
                var3 = (cm) null;
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
                var3 = (cm) null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            } else {
              if (!vb.field_c) {
                if (param1 > -25) {
                  var3 = (cm) null;
                  ah.a(87, (cm) null);
                  return;
                } else {
                  return;
                }
              } else {
                pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
                fb.field_r.a(param0, (byte) 127);
                if (param1 > -25) {
                  var3 = (cm) null;
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
                var3 = (cm) null;
                ah.a(87, (cm) null);
                return;
              } else {
                return;
              }
            } else {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fb.field_r.a(param0, (byte) 127);
              if (param1 > -25) {
                var3 = (cm) null;
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
        field_Xb = "Accept invitation to <%0>'s game";
        field_fc = "Searching for an opponent";
        field_Sb = "Continue";
    }
}
