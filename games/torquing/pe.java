/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pe extends hn implements wm, ng {
    static String field_M;
    private lg field_B;
    private boolean field_I;
    private lg field_D;
    static t field_J;
    private String field_N;
    private lg field_K;
    private boolean field_F;
    private tk field_C;
    static uc field_E;
    private tk field_L;
    private boolean field_G;
    static char[] field_H;

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = -115 / ((-33 - param3) / 57);
        if (super.a(param0, param1, param2, -117)) {
            return true;
        }
        if (-99 == param0) {
            return ((pe) this).a((byte) -94, param1);
        }
        if (-100 != param0) {
            return false;
        }
        return ((pe) this).b(param1, -9928);
    }

    final void h(int param0) {
        ((pe) this).field_C.i((byte) 85);
        if (param0 != 16180) {
            return;
        }
        ((pe) this).field_L.i((byte) 77);
    }

    pe(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (el) null);
        rf var6 = null;
        uc var7 = null;
        String var8 = null;
        he var9 = null;
        na var12 = null;
        na var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        lg stackIn_16_1 = null;
        lg stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        lg stackIn_17_1 = null;
        lg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        lg stackIn_18_1 = null;
        lg stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        lg stackOut_15_1 = null;
        lg stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        lg stackOut_17_1 = null;
        lg stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        lg stackOut_16_1 = null;
        lg stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((pe) this).field_F = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((pe) this).field_G = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param3) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((pe) this).field_I = stackIn_9_1 != 0;
          ((pe) this).field_N = param1;
          if (!((pe) this).field_G) {
            break L3;
          } else {
            L4: {
              if (((pe) this).field_I) {
                break L4;
              } else {
                if (!((pe) this).field_F) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((pe) this).field_C = (tk) (Object) new gp(param0, (ca) this, 100);
          ((pe) this).field_L = (tk) (Object) new gp("", (ca) this, 20);
          if (!((pe) this).field_G) {
            L6: {
              ((pe) this).field_K = new lg(qp.field_r, (ca) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((pe) this).field_F) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = qh.field_a;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = ha.field_c;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new lg(stackIn_18_3, (ca) null);
            ((pe) this).field_B = stackIn_18_1;
            if (!((pe) this).field_I) {
              break L5;
            } else {
              ((pe) this).field_D = new lg(qh.field_e, (ca) this);
              break L5;
            }
          } else {
            ((pe) this).field_K = new lg(qm.field_b, (ca) null);
            ((pe) this).field_B = new lg(pf.field_q, (ca) null);
            ((pe) this).field_C.field_x = false;
            break L5;
          }
        }
        L7: {
          ((pe) this).field_C.field_q = (el) (Object) new ig(10000536);
          ((pe) this).field_L.field_q = (el) (Object) new io(10000536);
          var6 = new rf();
          ((pe) this).field_K.field_q = (el) (Object) var6;
          if (null == ((pe) this).field_B) {
            break L7;
          } else {
            ((pe) this).field_B.field_q = (el) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((pe) this).field_D == null) {
            break L8;
          } else {
            ((pe) this).field_D.field_q = (el) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((pe) this).field_C.field_n = eo.field_e;
          if (((pe) this).field_D == null) {
            break L9;
          } else {
            ((pe) this).field_D.field_n = um.field_q;
            break L9;
          }
        }
        L10: {
          if (((pe) this).field_G) {
            ((pe) this).field_B.field_n = qg.field_v;
            break L10;
          } else {
            if (((pe) this).field_F) {
              ((pe) this).field_B.field_n = ll.field_m;
              ((pe) this).field_B.field_q = (el) (Object) new je();
              break L10;
            } else {
              ((pe) this).field_B.field_q = (el) (Object) new je();
              break L10;
            }
          }
        }
        L11: {
          ((pe) this).field_k = 15;
          var7 = dg.field_e;
          if (((pe) this).field_N == null) {
            break L11;
          } else {
            ((pe) this).field_k = ((pe) this).field_k + (5 + var7.a(((pe) this).field_N, ((pe) this).field_p + -40, var7.field_x));
            break L11;
          }
        }
        L12: {
          var8 = hq.field_c;
          var9 = go.a(false, ip.a(9));
          if (var9 != mf.field_u) {
            if (h.field_l != var9) {
              break L12;
            } else {
              var8 = gj.field_g;
              break L12;
            }
          } else {
            var8 = go.field_v;
            break L12;
          }
        }
        L13: {
          var12 = new na(10, ((pe) this).field_k, ((pe) this).field_p + -20, 25, (gm) (Object) ((pe) this).field_C, false, 80, 3, var7, 16777215, var8);
          ((pe) this).a((gm) (Object) new na(10, ((pe) this).field_k, ((pe) this).field_p + -20, 25, (gm) (Object) ((pe) this).field_C, false, 80, 3, var7, 16777215, var8), -6938);
          ((pe) this).field_k = ((pe) this).field_k + (((gm) (Object) var12).field_o + 5);
          var13 = new na(10, ((pe) this).field_k, -20 + ((pe) this).field_p, 25, (gm) (Object) ((pe) this).field_L, false, 80, 3, var7, 16777215, hm.field_v);
          ((pe) this).a((gm) (Object) new na(10, ((pe) this).field_k, -20 + ((pe) this).field_p, 25, (gm) (Object) ((pe) this).field_L, false, 80, 3, var7, 16777215, hm.field_v), -6938);
          ((pe) this).field_K.field_t = (ca) this;
          ((pe) this).field_k = ((pe) this).field_k + (5 + ((gm) (Object) var13).field_o);
          if (((pe) this).field_D == null) {
            break L13;
          } else {
            ((pe) this).field_D.field_t = (ca) this;
            break L13;
          }
        }
        L14: {
          if (null == ((pe) this).field_B) {
            break L14;
          } else {
            ((pe) this).field_B.field_t = (ca) this;
            break L14;
          }
        }
        L15: {
          if (((pe) this).field_D == null) {
            ((pe) this).field_K.a((byte) -46, 8, ((pe) this).field_k, 30, -16 + ((pe) this).field_p);
            ((pe) this).field_k = ((pe) this).field_k + 35;
            break L15;
          } else {
            ((pe) this).field_K.a((byte) -97, 85, ((pe) this).field_k, 30, ((pe) this).field_p - 95);
            ((pe) this).field_k = ((pe) this).field_k + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((pe) this).field_D) {
            break L16;
          } else {
            ((pe) this).field_D.a((byte) -18, 8, ((pe) this).field_k, 30, ((pe) this).field_p - 6 - 10);
            ((pe) this).field_k = ((pe) this).field_k + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((pe) this).field_B) {
            break L17;
          } else {
            L18: {
              if (((pe) this).field_G) {
                break L18;
              } else {
                if (!((pe) this).field_F) {
                  ((pe) this).field_B.a((byte) -21, 8, ((pe) this).field_k, 20, 40);
                  ((pe) this).field_k = ((pe) this).field_k + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((pe) this).field_B.a((byte) -13, 8, ((pe) this).field_k, 30, -6 + ((pe) this).field_p - 10);
            ((pe) this).field_k = ((pe) this).field_k + 35;
            break L17;
          }
        }
        L19: {
          ((pe) this).a((byte) 123, 0, 0, 3 + ((pe) this).field_k, ((pe) this).field_p);
          ((pe) this).a((gm) (Object) ((pe) this).field_K, -6938);
          if (((pe) this).field_D == null) {
            break L19;
          } else {
            ((pe) this).a((gm) (Object) ((pe) this).field_D, -6938);
            break L19;
          }
        }
        L20: {
          if (((pe) this).field_B == null) {
            break L20;
          } else {
            ((pe) this).a((gm) (Object) ((pe) this).field_B, -6938);
            break L20;
          }
        }
    }

    final static void a(byte param0, double param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Torquing.field_u;
        if (param0 >= -97) {
            field_H = null;
        }
        if (param1 != eq.field_a) {
            for (var3 = 0; -257 < (var3 ^ -1); var3++) {
                var4 = (int)(Math.pow((double)var3 / 255.0, param1) * 255.0);
                uk.field_b[var3] = 255 >= var4 ? var4 : 255;
            }
            eq.field_a = param1;
        }
    }

    final String i(int param0) {
        if (param0 >= -68) {
            ((pe) this).field_B = null;
        }
        if (((pe) this).field_C.field_m == null) {
            return "";
        }
        return ((pe) this).field_C.field_m;
    }

    final void a(int param0, String param1) {
        if (param0 >= -54) {
            field_E = null;
        }
        tk var3 = ((pe) this).field_C;
        String var4 = param1;
        var3.a(false, var4, true);
        ((pe) this).field_L.i((byte) 68);
    }

    public final void a(int param0, tk param1) {
        if (param0 <= 3) {
            String discarded$0 = ((pe) this).i(127);
        }
    }

    public static void g(byte param0) {
        field_J = null;
        field_E = null;
        field_M = null;
        field_H = null;
        if (param0 >= -105) {
            pe.a((byte) -24, -0.6311276396635903);
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, df param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Torquing.field_u;
          var4 = param3.e(param1, -90);
          if (param0 > 74) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        if (-1 != (var4 ^ -1)) {
          L1: {
            L2: {
              if (param2 == null) {
                break L2;
              } else {
                if (param2.length == var4) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param2 = new byte[var4];
            break L1;
          }
          L3: {
            var5 = param3.e(3, 78);
            var6 = (byte)param3.e(8, -93);
            if (-1 <= (var5 ^ -1)) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param2[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param2[var7] = (byte)(param3.e(var5, -58) + var6);
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    private final void a(byte param0) {
        if (!vg.d(0)) {
            // ifle L59
            // if_icmpge L59
        }
        sa.a(((pe) this).field_C.field_m, 122, ((pe) this).field_L.field_m);
        if (param0 < 120) {
            boolean discarded$0 = ((pe) this).a(99, (gm) null, 'ﾠ', 63);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(null == ((pe) this).field_N)) {
            int discarded$0 = dg.field_e.a(((pe) this).field_N, param3 + ((pe) this).field_w + 20, param2 - -((pe) this).field_k + 15, -40 + ((pe) this).field_p, ((pe) this).field_o, 16777215, -1, 1, 0, dg.field_e.field_x);
        }
        if (param1 >= -7) {
            ((pe) this).field_C = null;
        }
        if (!(null == ((pe) this).field_D)) {
            ph.b(param3 + 10, 134 + param2, -20 + ((pe) this).field_p, 4210752);
        }
        super.a(param0, (byte) -98, param2, param3);
    }

    final static jb[] a(byte param0, df param1) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        jb[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        jb var6 = null;
        int var7 = 0;
        var7 = Torquing.field_u;
        var2 = param1.e(8, -80);
        if (var2 <= 0) {
          var4_int = -80 / ((-20 - param0) / 36);
          var3 = param1.e(12, -73);
          var4 = new jb[var3];
          var5 = 0;
          L0: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (df.a(param1, -103)) {
                var6 = new jb();
                int discarded$6 = param1.e(24, -59);
                int discarded$7 = param1.e(24, 55);
                var6.field_a = param1.e(24, -85);
                int discarded$8 = param1.e(9, -113);
                int discarded$9 = param1.e(12, -114);
                int discarded$10 = param1.e(12, 99);
                int discarded$11 = param1.e(12, 97);
                var4[var5] = var6;
                var5++;
                continue L0;
              } else {
                var6_int = param1.e(ci.a(-1 + var5, 2), -64);
                var4[var5] = var4[var6_int];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public final void a(tk param0, byte param1) {
        if (param1 > -122) {
            ((pe) this).field_F = false;
        }
        if (((pe) this).field_C == param0) {
            boolean discarded$0 = ((pe) this).field_L.a((gm) this, false);
        }
        if (((pe) this).field_L == param0) {
            this.a((byte) 124);
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (param0 <= -85) {
            break L0;
          } else {
            ((pe) this).field_F = false;
            break L0;
          }
        }
        L1: {
          if (param1 == ((pe) this).field_K) {
            this.a((byte) 123);
            break L1;
          } else {
            if (param1 == ((pe) this).field_D) {
              m.a(11);
              break L1;
            } else {
              if (((pe) this).field_B != param1) {
                break L1;
              } else {
                if (((pe) this).field_G) {
                  aj.a(2);
                  break L1;
                } else {
                  if (!((pe) this).field_F) {
                    ka.a((byte) -110);
                    break L1;
                  } else {
                    of.b((byte) 105);
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Discard";
        field_H = new char[128];
    }
}
