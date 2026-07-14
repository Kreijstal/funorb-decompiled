/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ff extends aj implements fb, df {
    static String field_C;
    static String field_x;
    static ti field_z;
    private boolean field_E;
    private lj field_J;
    private lj field_w;
    private rg field_G;
    static int[] field_H;
    private boolean field_y;
    private rg field_L;
    private boolean field_K;
    private lj field_A;
    private String field_B;
    static hj field_D;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = Transmogrify.field_A ? 1 : 0;
          if (param0 != ((ff) this).field_A) {
            if (param0 == ((ff) this).field_J) {
              hg.c(0);
              break L0;
            } else {
              if (((ff) this).field_w == param0) {
                if (!((ff) this).field_K) {
                  if (((ff) this).field_E) {
                    kc.a((byte) -128);
                    break L0;
                  } else {
                    qa.b(param1 + -13);
                    break L0;
                  }
                } else {
                  gb.a((byte) 81);
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            this.d((byte) -123);
            break L0;
          }
        }
        L1: {
          if (param1 == 17) {
            break L1;
          } else {
            ((ff) this).field_A = null;
            break L1;
          }
        }
    }

    public final void a(int param0, rg param1) {
        L0: {
          if (((ff) this).field_L == param1) {
            boolean discarded$2 = ((ff) this).field_G.a((qg) this, param0 + -1421);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 1330) {
          return;
        } else {
          L1: {
            if (param1 == ((ff) this).field_G) {
              this.d((byte) -123);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void d(byte param0) {
        if (!bg.g(-43)) {
            // if_icmple L60
            // ifgt L40
        } else {
            hd.a(((ff) this).field_G.field_k, ((ff) this).field_L.field_k, -4776);
        }
        if (param0 != -123) {
            field_D = null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (!(null == ((ff) this).field_B)) {
            int discarded$0 = vd.field_h.a(((ff) this).field_B, 20 + (((ff) this).field_p + param0), 15 + (((ff) this).field_n + param1), -40 + ((ff) this).field_l, ((ff) this).field_h, 16777215, -1, 1, 0, vd.field_h.field_y);
        }
        int var5 = -124 / ((param3 - 77) / 34);
        if (((ff) this).field_J != null) {
            sb.d(10 + param0, param1 - -134, ((ff) this).field_l - 20, 4210752);
        }
        super.a(param0, param1, param2, (byte) 119);
    }

    ff(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ui) null);
        qa var6 = null;
        kg var7 = null;
        String var8 = null;
        kh var9 = null;
        oc var12 = null;
        oc var13 = null;
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
        lj stackIn_16_1 = null;
        lj stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        lj stackIn_17_1 = null;
        lj stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        lj stackIn_18_1 = null;
        lj stackIn_18_2 = null;
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
        lj stackOut_15_1 = null;
        lj stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        lj stackOut_17_1 = null;
        lj stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        lj stackOut_16_1 = null;
        lj stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
          ((ff) this).field_y = stackIn_3_1 != 0;
          ((ff) this).field_B = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param4) {
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
          ((ff) this).field_E = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
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
          ((ff) this).field_K = stackIn_9_1 != 0;
          if (!((ff) this).field_K) {
            break L3;
          } else {
            L4: {
              if (((ff) this).field_y) {
                break L4;
              } else {
                if (!((ff) this).field_E) {
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
          ((ff) this).field_L = (rg) (Object) new vc(param0, (ma) this, 100);
          ((ff) this).field_G = (rg) (Object) new vc("", (ma) this, 20);
          if (!((ff) this).field_K) {
            L6: {
              ((ff) this).field_A = new lj(da.field_B, (ma) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((ff) this).field_E) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = gl.field_z;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = te.field_f;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new lj(stackIn_18_3, (ma) null);
            ((ff) this).field_w = stackIn_18_1;
            if (!((ff) this).field_y) {
              break L5;
            } else {
              ((ff) this).field_J = new lj(je.field_c, (ma) this);
              break L5;
            }
          } else {
            ((ff) this).field_A = new lj(rc.field_b, (ma) null);
            ((ff) this).field_w = new lj(ta.field_b, (ma) null);
            ((ff) this).field_L.field_t = false;
            break L5;
          }
        }
        L7: {
          ((ff) this).field_L.field_q = (ui) (Object) new ni(10000536);
          ((ff) this).field_G.field_q = (ui) (Object) new nc(10000536);
          var6 = new qa();
          ((ff) this).field_A.field_q = (ui) (Object) var6;
          if (null == ((ff) this).field_w) {
            break L7;
          } else {
            ((ff) this).field_w.field_q = (ui) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ff) this).field_L.field_j = fc.field_e;
          if (((ff) this).field_J == null) {
            break L8;
          } else {
            ((ff) this).field_J.field_q = (ui) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((ff) this).field_J) {
            break L9;
          } else {
            ((ff) this).field_J.field_j = uf.field_b;
            break L9;
          }
        }
        L10: {
          if (!((ff) this).field_K) {
            if (!((ff) this).field_E) {
              ((ff) this).field_w.field_q = (ui) (Object) new ek();
              break L10;
            } else {
              ((ff) this).field_w.field_j = pa.field_a;
              ((ff) this).field_w.field_q = (ui) (Object) new ek();
              break L10;
            }
          } else {
            ((ff) this).field_w.field_j = je.field_a;
            break L10;
          }
        }
        L11: {
          ((ff) this).field_n = 15;
          var7 = vd.field_h;
          if (((ff) this).field_B == null) {
            break L11;
          } else {
            ((ff) this).field_n = ((ff) this).field_n + (var7.a(((ff) this).field_B, ((ff) this).field_l - 40, var7.field_y) + 5);
            break L11;
          }
        }
        L12: {
          var8 = e.field_q;
          var9 = ga.a(125, ha.b(81));
          if (aa.field_d == var9) {
            var8 = pf.field_c;
            break L12;
          } else {
            if (of.field_f != var9) {
              break L12;
            } else {
              var8 = te.field_b;
              break L12;
            }
          }
        }
        L13: {
          var12 = new oc(10, ((ff) this).field_n, ((ff) this).field_l - 20, 25, (qg) (Object) ((ff) this).field_L, false, 80, 3, var7, 16777215, var8);
          ((ff) this).a((qg) (Object) new oc(10, ((ff) this).field_n, ((ff) this).field_l - 20, 25, (qg) (Object) ((ff) this).field_L, false, 80, 3, var7, 16777215, var8), (byte) -83);
          ((ff) this).field_n = ((ff) this).field_n + (((qg) (Object) var12).field_h + 5);
          var13 = new oc(10, ((ff) this).field_n, ((ff) this).field_l + -20, 25, (qg) (Object) ((ff) this).field_G, false, 80, 3, var7, 16777215, ee.field_y);
          ((ff) this).a((qg) (Object) new oc(10, ((ff) this).field_n, ((ff) this).field_l + -20, 25, (qg) (Object) ((ff) this).field_G, false, 80, 3, var7, 16777215, ee.field_y), (byte) -84);
          ((ff) this).field_n = ((ff) this).field_n + (((qg) (Object) var13).field_h + 5);
          ((ff) this).field_A.field_m = (ma) this;
          if (null == ((ff) this).field_J) {
            break L13;
          } else {
            ((ff) this).field_J.field_m = (ma) this;
            break L13;
          }
        }
        L14: {
          if (((ff) this).field_w == null) {
            break L14;
          } else {
            ((ff) this).field_w.field_m = (ma) this;
            break L14;
          }
        }
        L15: {
          if (null != ((ff) this).field_J) {
            ((ff) this).field_A.a(-116, ((ff) this).field_n, 85, ((ff) this).field_l - 95, 30);
            ((ff) this).field_n = ((ff) this).field_n + 60;
            break L15;
          } else {
            ((ff) this).field_A.a(-102, ((ff) this).field_n, 8, -6 + ((ff) this).field_l + -10, 30);
            ((ff) this).field_n = ((ff) this).field_n + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((ff) this).field_J) {
            break L16;
          } else {
            ((ff) this).field_J.a(92, ((ff) this).field_n, 8, -16 + ((ff) this).field_l, 30);
            ((ff) this).field_n = ((ff) this).field_n + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((ff) this).field_w) {
            break L17;
          } else {
            L18: {
              if (((ff) this).field_K) {
                break L18;
              } else {
                if (((ff) this).field_E) {
                  break L18;
                } else {
                  ((ff) this).field_w.a(58, ((ff) this).field_n, 8, 40, 20);
                  ((ff) this).field_n = ((ff) this).field_n + 25;
                  break L17;
                }
              }
            }
            ((ff) this).field_w.a(113, ((ff) this).field_n, 8, -6 + ((ff) this).field_l - 10, 30);
            ((ff) this).field_n = ((ff) this).field_n + 35;
            break L17;
          }
        }
        L19: {
          ((ff) this).a(26, 0, 0, ((ff) this).field_l, ((ff) this).field_n + 3);
          ((ff) this).a((qg) (Object) ((ff) this).field_A, (byte) -104);
          if (((ff) this).field_J == null) {
            break L19;
          } else {
            ((ff) this).a((qg) (Object) ((ff) this).field_J, (byte) -96);
            break L19;
          }
        }
        L20: {
          if (((ff) this).field_w == null) {
            break L20;
          } else {
            ((ff) this).a((qg) (Object) ((ff) this).field_w, (byte) -81);
            break L20;
          }
        }
    }

    final static void a(pl param0, boolean param1, int param2, int param3, byte param4) {
        if (param4 < 0) {
            return;
        }
        jj.field_a.a(param3, !param1 ? true : false, param2, 1000000, param0, 100);
    }

    final void a(String param0, int param1) {
        if (param1 != 30) {
            ff.m(-73);
        }
        rg var3 = ((ff) this).field_L;
        String var4 = param0;
        var3.a(var4, false, param1 + -29);
        ((ff) this).field_G.i(81);
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5 = 0;
        if (super.a(param0, param1, (byte) 123, param3)) {
          return true;
        } else {
          if (-99 != (param0 ^ -1)) {
            var5 = 39 % ((param2 - 65) / 55);
            if (99 == param0) {
              return ((ff) this).b(param1, 108);
            } else {
              return false;
            }
          } else {
            return ((ff) this).a(2, param1);
          }
        }
    }

    public static void m(int param0) {
        field_D = null;
        if (param0 <= 119) {
            field_x = null;
        }
        field_H = null;
        field_C = null;
        field_x = null;
        field_z = null;
    }

    public final void a(rg param0, int param1) {
        if (param1 >= -55) {
            ((ff) this).field_K = false;
        }
    }

    final String e(byte param0) {
        int var2 = 0;
        var2 = -69 / ((-53 - param0) / 57);
        if (null == ((ff) this).field_L.field_k) {
          return "";
        } else {
          return ((ff) this).field_L.field_k;
        }
    }

    final void l(int param0) {
        ((ff) this).field_L.i(81);
        ((ff) this).field_G.i(param0 ^ -31940);
        if (param0 != -31891) {
            field_z = null;
        }
    }

    final static void a(byte param0) {
        int var1 = -124 / ((param0 - -63) / 57);
        Object var2 = null;
        ec.a(hf.field_g, -126, (String) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Names can only contain letters, numbers, spaces and underscores";
        field_H = new int[]{7059175, 8189570, 16770707, 16536152};
        field_x = "Not yet achieved";
    }
}
