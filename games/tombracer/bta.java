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
        field_f = null;
        field_i = null;
        field_n = null;
        field_d = null;
    }

    bta(kda param0, cn param1) {
        super((eo) (Object) param0);
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        ((bta) this).field_j = false;
        ((bta) this).field_h = new float[4];
        try {
          if (param1 == null) {
            ((bta) this).field_m = false;
            return;
          } else {
            if (!param0.field_qd) {
              ((bta) this).field_m = false;
              return;
            } else {
              L0: {
                ((bta) this).field_e = wd.a((byte) -70, param0, param1.a("gl", (byte) 122, "uw_ground_unlit"), 34336);
                ((bta) this).field_l = wd.a((byte) -70, param0, param1.a("gl", (byte) 126, "uw_ground_lit"), 34336);
                ((bta) this).field_r = wd.a((byte) -70, param0, param1.a("gl", (byte) 121, "uw_model_unlit"), 34336);
                ((bta) this).field_o = wd.a((byte) -70, param0, param1.a("gl", (byte) 115, "uw_model_lit"), 34336);
                if (((bta) this).field_r == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
              L1: {
                stackOut_6_0 = stackIn_6_0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (((bta) this).field_e == null) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L1;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L1;
                }
              }
              L2: {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (null == ((bta) this).field_l) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L2;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L2;
                }
              }
              L3: {
                stackOut_12_0 = stackIn_12_0 & (stackIn_12_1 & stackIn_12_2);
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (((bta) this).field_o == null) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L3;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L3;
                }
              }
              if ((stackIn_15_0 & stackIn_15_1) != 0) {
                ((bta) this).field_p = ((bta) this).field_c.a(true, 1, false, 2, new int[2]);
                ((bta) this).field_p.a((byte) -77, false, false);
                ((bta) this).field_m = true;
                return;
              } else {
                ((bta) this).field_m = false;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("bta.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          L5: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param2 == 24595) {
              L1: {
                if (param1 != null) {
                  L2: {
                    if (!((bta) this).field_j) {
                      break L2;
                    } else {
                      ((bta) this).field_c.a(ej.field_c, 0, param2 ^ -24583);
                      ((bta) this).field_c.a(0, false, ej.field_c);
                      ((bta) this).field_j = false;
                      break L2;
                    }
                  }
                  ((bta) this).field_c.a(true, param1);
                  ((bta) this).field_c.a((byte) 114, param0);
                  break L1;
                } else {
                  if (((bta) this).field_j) {
                    break L1;
                  } else {
                    ((bta) this).field_c.a(true, ((bta) this).field_c.field_Jb);
                    ((bta) this).field_c.a((byte) 120, 1);
                    ((bta) this).field_c.a(lja.field_j, 0, -21);
                    ((bta) this).field_c.a(0, false, lja.field_j);
                    ((bta) this).field_j = true;
                    return;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("bta.E(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
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
        int var2 = ((bta) this).field_c.d(false);
        asa var3 = ((bta) this).field_c.E(43);
        if (!((bta) this).field_k) {
            jaggl.OpenGL.glBindProgramARB(34336, var2 != 2147483647 ? ((bta) this).field_r.field_b : ((bta) this).field_e.field_b);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, var2 != 2147483647 ? ((bta) this).field_o.field_b : ((bta) this).field_l.field_b);
        }
        jaggl.OpenGL.glEnable(34336);
        ((bta) this).field_g = true;
        var3.a(32560, 0.0f, 0.0f, ((bta) this).field_h, (float)var2, -1.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ((bta) this).field_h[0], ((bta) this).field_h[1], ((bta) this).field_h[2], ((bta) this).field_h[3]);
        ((bta) this).a(true);
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
