/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de implements ir {
    private hc field_c;
    private int field_d;
    private int field_e;
    private int field_a;
    private int field_g;
    private int field_b;
    private int field_f;
    private int field_h;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cn var14 = null;
        ea stackIn_3_0 = null;
        ea stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof cn) {
            stackOut_2_0 = (ea) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ea) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (cn) (cn) stackIn_3_0;
          vp.b(((ea) param3).field_p + param2, param4 - -((ea) param3).field_h, ((ea) param3).field_q, ((ea) param3).field_n, ((de) this).field_b);
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = param2 + (((ea) param3).field_p + ((cn) var14).field_C);
          var8 = param4 + ((ea) param3).field_h - -((cn) var14).field_x;
          vp.g(var7, var8, ((cn) var14).field_A, ((de) this).field_g);
          if ((((cn) var14).field_B ^ -1) != 0) {
            var9 = 3.141592653589793 * (double)((cn) var14).field_B * 2.0 / (double)((cn) var14).field_w;
            var11 = (int)(-Math.sin(var9) * (double)((cn) var14).field_A);
            var12 = (int)(Math.cos(var9) * (double)((cn) var14).field_A);
            vp.g(var7 - -var11, var8 + var12, 1, ((de) this).field_f);
            break L2;
          } else {
            break L2;
          }
        }
        vp.g(var7, var8, 2, 1);
        var9 = 2.0 * ((double)((cn) var14).field_y * 3.141592653589793) / (double)((cn) var14).field_w;
        var11 = (int)(-Math.sin(var9) * (double)((cn) var14).field_A);
        var12 = (int)(Math.cos(var9) * (double)((cn) var14).field_A);
        vp.f(var7, var8, var7 - -var11, var12 + var8, 1);
        if (param1 != -7592) {
          L3: {
            ((de) this).field_e = 72;
            if (((de) this).field_c == null) {
              break L3;
            } else {
              var13 = ((cn) var14).field_C + ((cn) var14).field_A + ((de) this).field_d;
              int discarded$2 = ((de) this).field_c.a(((ea) param3).field_f, param2 - -((ea) param3).field_p - -var13, ((ea) param3).field_h + param4 + ((de) this).field_h, ((ea) param3).field_q - var13 - ((de) this).field_d, -(((de) this).field_d << 2002516769) + ((ea) param3).field_n, ((de) this).field_a, ((de) this).field_e, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (((de) this).field_c == null) {
              break L4;
            } else {
              var13 = ((cn) var14).field_C + ((cn) var14).field_A + ((de) this).field_d;
              int discarded$3 = ((de) this).field_c.a(((ea) param3).field_f, param2 - -((ea) param3).field_p - -var13, ((ea) param3).field_h + param4 + ((de) this).field_h, ((ea) param3).field_q - var13 - ((de) this).field_d, -(((de) this).field_d << 2002516769) + ((ea) param3).field_n, ((de) this).field_a, ((de) this).field_e, 1, 1, 0);
              break L4;
            }
          }
          return;
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) ho.field_b);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ho.field_b);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) ho.field_b);
        if (param1) {
            return;
        }
    }

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 92) {
          boolean discarded$12 = vn.field_f.a(pd.field_b, true, qe.field_k, true);
          vn.field_f.f((byte) -117);
          L0: while (true) {
            if (!ek.a((byte) -127)) {
              if (-1 == dh.field_c) {
                if (ss.field_t) {
                  return 3;
                } else {
                  if (jq.field_fb == nb.field_c) {
                    return 1;
                  } else {
                    if (gm.field_x.a(false)) {
                      if (jq.field_fb == ht.field_k) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                var1 = dh.field_c;
                oi.a(-1, param0 + 20573);
                return var1;
              }
            } else {
              boolean discarded$13 = vn.field_f.a(param0 + -42, fr.field_e, bk.field_f);
              continue L0;
            }
          }
        } else {
          return -79;
        }
    }

    de(hc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((de) this).field_h = param2;
        ((de) this).field_b = param7;
        ((de) this).field_c = param0;
        ((de) this).field_e = param4;
        ((de) this).field_g = param5;
        ((de) this).field_a = param3;
        ((de) this).field_f = param6;
        ((de) this).field_d = param1;
    }

    static {
    }
}
