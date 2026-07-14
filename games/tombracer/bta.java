/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bta extends vw {
    private gf field_p;
    private mf field_r;
    private mf field_o;
    static java.awt.Color field_i;
    private boolean field_m;
    private boolean field_g;
    private boolean field_j;
    static il field_d;
    static int[] field_f;
    static int field_q;
    private float[] field_h;
    private boolean field_k;
    static int[] field_n;
    private mf field_e;
    private mf field_l;

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
            ((bta) this).a(-124, false);
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            field_i = null;
        }
    }

    final void a(int param0, boolean param1) {
        ((bta) this).field_k = param1 ? true : false;
        ((bta) this).field_c.e(1, false);
        ((bta) this).field_c.a(true, (iva) (Object) ((bta) this).field_p);
        ((bta) this).field_c.a(ln.field_F, (byte) -110, r.field_m);
        ((bta) this).field_c.a(pea.field_c, 0, -30);
        ((bta) this).field_c.a(ej.field_c, 2, -6219, true, false);
        ((bta) this).field_c.a(0, false, lja.field_j);
        int var3 = -29 % ((param0 - 41) / 62);
        ((bta) this).field_c.e(0, false);
        this.d(-124);
    }

    public static void d(boolean param0) {
        if (param0) {
          field_d = null;
          field_f = null;
          field_i = null;
          field_n = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_i = null;
          field_n = null;
          field_d = null;
          return;
        }
    }

    bta(kda param0, cn param1) {
        super((eo) (Object) param0);
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        ((bta) this).field_j = false;
        ((bta) this).field_h = new float[4];
        if (param1 == null) {
          ((bta) this).field_m = false;
        } else {
          if (!param0.field_qd) {
            ((bta) this).field_m = false;
          } else {
            L0: {
              ((bta) this).field_e = wd.a((byte) -70, param0, param1.a("gl", (byte) 122, "uw_ground_unlit"), 34336);
              ((bta) this).field_l = wd.a((byte) -70, param0, param1.a("gl", (byte) 126, "uw_ground_lit"), 34336);
              ((bta) this).field_r = wd.a((byte) -70, param0, param1.a("gl", (byte) 121, "uw_model_unlit"), 34336);
              ((bta) this).field_o = wd.a((byte) -70, param0, param1.a("gl", (byte) 115, "uw_model_lit"), 34336);
              if (((bta) this).field_r == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            L1: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (((bta) this).field_e == null) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L1;
              }
            }
            L2: {
              stackOut_8_0 = stackIn_8_0;
              stackOut_8_1 = stackIn_8_1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (null == ((bta) this).field_l) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L2;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                break L2;
              }
            }
            L3: {
              stackOut_11_0 = stackIn_11_0 & (stackIn_11_1 & stackIn_11_2);
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (((bta) this).field_o == null) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L3;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L3;
              }
            }
            if ((stackIn_14_0 & stackIn_14_1) != 0) {
              ((bta) this).field_p = ((bta) this).field_c.a(true, 1, false, 2, new int[2]);
              ((bta) this).field_p.a((byte) -77, false, false);
              ((bta) this).field_m = true;
            } else {
              ((bta) this).field_m = false;
            }
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        if (!param0) {
          L0: {
            ((bta) this).a(false);
            if (((bta) this).field_g) {
              var2 = ((bta) this).field_c.XA();
              var3 = ((bta) this).field_c.i();
              var4 = (float)var2 - (float)(var2 + -var3) * 0.125f;
              var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((bta) this).field_c.g(false), (float)((bta) this).field_c.A(-2903) / 255.0f);
              ((bta) this).field_c.e(1, false);
              ((bta) this).field_c.g(3625, ((bta) this).field_c.t(65280));
              ((bta) this).field_c.e(0, false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((bta) this).field_g) {
              var2 = ((bta) this).field_c.XA();
              var3 = ((bta) this).field_c.i();
              var4 = (float)var2 - (float)(var2 + -var3) * 0.125f;
              var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((bta) this).field_c.g(false), (float)((bta) this).field_c.A(-2903) / 255.0f);
              ((bta) this).field_c.e(1, false);
              ((bta) this).field_c.g(3625, ((bta) this).field_c.t(65280));
              ((bta) this).field_c.e(0, false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        ((bta) this).field_c.e(1, false);
        if (param0 >= -4) {
          L0: {
            ((bta) this).a(73);
            ((bta) this).field_c.a(true, (iva) null);
            ((bta) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
            ((bta) this).field_c.a(ej.field_c, 0, -49);
            ((bta) this).field_c.a(pea.field_c, 2, -53);
            ((bta) this).field_c.a(0, false, ej.field_c);
            ((bta) this).field_c.e(0, false);
            if (((bta) this).field_j) {
              ((bta) this).field_c.a(ej.field_c, 0, -107);
              ((bta) this).field_c.a(0, false, ej.field_c);
              ((bta) this).field_j = false;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((bta) this).field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              ((bta) this).field_g = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            ((bta) this).field_c.a(true, (iva) null);
            ((bta) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
            ((bta) this).field_c.a(ej.field_c, 0, -49);
            ((bta) this).field_c.a(pea.field_c, 2, -53);
            ((bta) this).field_c.a(0, false, ej.field_c);
            ((bta) this).field_c.e(0, false);
            if (((bta) this).field_j) {
              ((bta) this).field_c.a(ej.field_c, 0, -107);
              ((bta) this).field_c.a(0, false, ej.field_c);
              ((bta) this).field_j = false;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((bta) this).field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              ((bta) this).field_g = false;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 == 24595) {
          if (param1 != null) {
            if (!((bta) this).field_j) {
              ((bta) this).field_c.a(true, param1);
              ((bta) this).field_c.a((byte) 114, param0);
              return;
            } else {
              ((bta) this).field_c.a(ej.field_c, 0, param2 ^ -24583);
              ((bta) this).field_c.a(0, false, ej.field_c);
              ((bta) this).field_j = false;
              ((bta) this).field_c.a(true, param1);
              ((bta) this).field_c.a((byte) 114, param0);
              return;
            }
          } else {
            if (!((bta) this).field_j) {
              ((bta) this).field_c.a(true, ((bta) this).field_c.field_Jb);
              ((bta) this).field_c.a((byte) 120, 1);
              ((bta) this).field_c.a(lja.field_j, 0, -21);
              ((bta) this).field_c.a(0, false, lja.field_j);
              ((bta) this).field_j = true;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            ((bta) this).field_p = null;
            return ((bta) this).field_m;
        }
        return ((bta) this).field_m;
    }

    private final void d(int param0) {
        int var2 = 0;
        asa var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        L0: {
          var2 = ((bta) this).field_c.d(false);
          var3 = ((bta) this).field_c.E(43);
          if (((bta) this).field_k) {
            L1: {
              stackOut_5_0 = 34336;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var2 == 2147483647) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = ((bta) this).field_l.field_b;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = ((bta) this).field_o.field_b;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L1;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
            break L0;
          } else {
            L2: {
              stackOut_1_0 = 34336;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (var2 == 2147483647) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = ((bta) this).field_e.field_b;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L2;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = ((bta) this).field_r.field_b;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L2;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
            break L0;
          }
        }
        jaggl.OpenGL.glEnable(34336);
        ((bta) this).field_g = true;
        var3.a(32560, 0.0f, 0.0f, ((bta) this).field_h, (float)var2, -1.0f);
        if (param0 > -123) {
          return;
        } else {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ((bta) this).field_h[0], ((bta) this).field_h[1], ((bta) this).field_h[2], ((bta) this).field_h[3]);
          ((bta) this).a(true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new java.awt.Color(10040319);
        field_q = 0;
        field_n = new int[7];
        field_n[6] = 2;
        field_f = new int[7];
        field_n[2] = 0;
        field_n[0] = 0;
        field_n[3] = 1;
        field_n[4] = 1;
        field_n[5] = 2;
        field_n[1] = 0;
        field_f[4] = 3;
        field_f[0] = 6;
        field_f[3] = 2;
        field_f[2] = 4;
        field_f[5] = 0;
        field_f[6] = 1;
        field_f[1] = 5;
    }
}
