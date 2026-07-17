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

    public static void b() {
        field_Yb = null;
        field_Zb = null;
        field_Xb = null;
        field_fc = null;
        field_Sb = null;
    }

    final static void a(int param0, cm param1) {
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new wk(param1.a("", -742, "final_frame.jpg"), (java.awt.Component) (Object) sl.field_n);
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
            throw ci.a((Throwable) (Object) runtimeException, "ah.C(" + 77 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ah() {
        super(0L, (gh) null);
    }

    final static Object a(boolean param0, byte[] param1) {
        ge var3 = null;
        RuntimeException var3_ref = null;
        ge stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        ge stackOut_4_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (136 >= param1.length) {
                field_Wb = -90;
                stackOut_6_0 = (byte[]) param1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = new ge();
                ((gb) (Object) var3).a((byte) -62, param1);
                stackOut_4_0 = (ge) var3;
                stackIn_5_0 = stackOut_4_0;
                return (Object) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ah.D(").append(0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 0 + 41);
        }
        return (Object) (Object) stackIn_7_0;
    }

    final static void a(boolean param0, int param1) {
        if (je.field_t > 0) {
          if (im.field_b) {
            pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
            fl.field_b.a(param0, (byte) 127);
            if (bd.field_c <= 0) {
              if (fj.field_f <= 0) {
                return;
              } else {
                if (!vb.field_c) {
                  return;
                } else {
                  pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
                  fb.field_r.a(param0, (byte) 127);
                  return;
                }
              }
            } else {
              if (!vb.field_c) {
                return;
              } else {
                pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
                fb.field_r.a(param0, (byte) 127);
                return;
              }
            }
          } else {
            if (bd.field_c <= 0) {
              if (fj.field_f <= 0) {
                return;
              } else {
                if (!vb.field_c) {
                  return;
                } else {
                  pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
                  fb.field_r.a(param0, (byte) 127);
                  return;
                }
              }
            } else {
              if (!vb.field_c) {
                return;
              } else {
                pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
                fb.field_r.a(param0, (byte) 127);
                return;
              }
            }
          }
        } else {
          if (bd.field_c <= 0) {
            if (fj.field_f <= 0) {
              return;
            } else {
              if (!vb.field_c) {
                return;
              } else {
                pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
                fb.field_r.a(param0, (byte) 127);
                return;
              }
            }
          } else {
            if (!vb.field_c) {
              return;
            } else {
              pb.f(0, 0, pb.field_c, qc.field_V.field_cb);
              fb.field_r.a(param0, (byte) 127);
              return;
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
