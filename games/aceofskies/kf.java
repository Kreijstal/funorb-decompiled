/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends sk {
    private mo field_o;
    private mo field_p;
    private mo field_j;
    private float[] field_l;
    private boolean field_f;
    private boolean field_i;
    private boolean field_k;
    static eg field_m;
    private mo field_g;
    private boolean field_h;
    private qi field_n;

    final void a(boolean param0) {
        ((kf) this).field_b.a(1, (byte) 116);
        ((kf) this).field_b.a((jj) null, -9135);
        ((kf) this).field_b.a(ru.field_a, param0, ru.field_a);
        ((kf) this).field_b.a((byte) 126, 0, dl.field_p);
        ((kf) this).field_b.a((byte) 119, 2, bs.field_a);
        ((kf) this).field_b.a(dl.field_p, 0, 0);
        if (param0) {
          ((kf) this).field_b.a(0, (byte) 79);
          if (((kf) this).field_i) {
            L0: {
              ((kf) this).field_b.a((byte) 125, 0, dl.field_p);
              ((kf) this).field_b.a(dl.field_p, 0, 0);
              ((kf) this).field_i = false;
              if (((kf) this).field_h) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                jaggl.OpenGL.glDisable(34820);
                jaggl.OpenGL.glDisable(34336);
                ((kf) this).field_h = false;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (((kf) this).field_h) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                jaggl.OpenGL.glDisable(34820);
                jaggl.OpenGL.glDisable(34336);
                ((kf) this).field_h = false;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void h() {
        int var2 = ((kf) this).field_b.n((byte) -103);
        ec var3 = ((kf) this).field_b.t(-11198);
        if (((kf) this).field_f) {
            jaggl.OpenGL.glBindProgramARB(34336, var2 == 2147483647 ? ((kf) this).field_g.field_d : ((kf) this).field_j.field_d);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, var2 == 2147483647 ? ((kf) this).field_o.field_d : ((kf) this).field_p.field_d);
        }
        jaggl.OpenGL.glEnable(34336);
        ((kf) this).field_h = true;
        var3.a(0.0f, -1.0f, ((kf) this).field_l, 0.0f, (float)var2, 11);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ((kf) this).field_l[0], ((kf) this).field_l[1], ((kf) this).field_l[2], ((kf) this).field_l[3]);
        ((kf) this).a(10);
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            ((kf) this).field_o = null;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            return true;
        }
        return ((kf) this).field_k;
    }

    kf(jc param0, gk param1) {
        super((bf) (Object) param0);
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        ((kf) this).field_l = new float[4];
        ((kf) this).field_i = false;
        try {
          L0: {
            if (param1 == null) {
              break L0;
            } else {
              if (param0.field_Vc) {
                L1: {
                  ((kf) this).field_o = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_unlit"), param0);
                  ((kf) this).field_g = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_lit"), param0);
                  ((kf) this).field_p = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_unlit"), param0);
                  ((kf) this).field_j = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_lit"), param0);
                  if (null == ((kf) this).field_p) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L1;
                  }
                }
                L2: {
                  stackOut_7_0 = stackIn_7_0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (((kf) this).field_o == null) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                L3: {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (((kf) this).field_g == null) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L3;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L3;
                  }
                }
                L4: {
                  stackOut_13_0 = stackIn_13_0 & (stackIn_13_1 & stackIn_13_2);
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (((kf) this).field_j == null) {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L4;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L4;
                  }
                }
                if ((stackIn_16_0 & stackIn_16_1) == 0) {
                  ((kf) this).field_k = false;
                  return;
                } else {
                  ((kf) this).field_n = ((kf) this).field_b.a(new int[2], 2, 0, false, 1);
                  ((kf) this).field_n.a(false, false, (byte) -127);
                  ((kf) this).field_k = true;
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          ((kf) this).field_k = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("kf.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    public static void g(int param0) {
        if (param0 != 25320) {
            kf.g(57);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
            ((kf) this).field_g = null;
        }
    }

    final void a(int param0, int param1, jj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 66) {
                break L1;
              } else {
                kf.g(59);
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (((kf) this).field_i) {
                  ((kf) this).field_b.a((byte) 120, 0, dl.field_p);
                  ((kf) this).field_b.a(dl.field_p, 0, 0);
                  ((kf) this).field_i = false;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((kf) this).field_b.a(param2, -9135);
              ((kf) this).field_b.b(param0, false);
              break L0;
            } else {
              if (!((kf) this).field_i) {
                ((kf) this).field_b.a(((kf) this).field_b.field_Kb, -9135);
                ((kf) this).field_b.b(1, false);
                ((kf) this).field_b.a((byte) 118, 0, un.field_i);
                ((kf) this).field_b.a(un.field_i, 0, 0);
                ((kf) this).field_i = true;
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("kf.I(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final static void f() {
        ud.field_e = null;
        ji.field_b = null;
        lh.field_a = null;
        fk.field_a = null;
        ee.field_e = null;
        lg.field_j = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        L0: {
          if (((kf) this).field_h) {
            var2 = ((kf) this).field_b.XA();
            var3 = ((kf) this).field_b.i();
            var4 = (float)var2 - 0.125f * (float)(-var3 + var2);
            var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((kf) this).field_b.j((byte) 5), (float)((kf) this).field_b.H(param0 ^ 111) / 255.0f);
            ((kf) this).field_b.a(1, (byte) 52);
            ((kf) this).field_b.a((byte) -74, ((kf) this).field_b.q(0));
            ((kf) this).field_b.a(0, (byte) 35);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 10) {
          kf.g(-79);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 <= 2) {
          L0: {
            ((kf) this).field_k = false;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((kf) this).field_f = stackIn_8_1 != 0;
          ((kf) this).field_b.a(1, (byte) 81);
          ((kf) this).field_b.a((jj) (Object) ((kf) this).field_n, -9135);
          ((kf) this).field_b.a(du.field_l, true, bd.field_C);
          ((kf) this).field_b.a((byte) 127, 0, bs.field_a);
          ((kf) this).field_b.a(true, 2, true, dl.field_p, false);
          ((kf) this).field_b.a(un.field_i, 0, 0);
          ((kf) this).field_b.a(0, (byte) 109);
          int discarded$2 = -23521;
          this.h();
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((kf) this).field_f = stackIn_4_1 != 0;
          ((kf) this).field_b.a(1, (byte) 81);
          ((kf) this).field_b.a((jj) (Object) ((kf) this).field_n, -9135);
          ((kf) this).field_b.a(du.field_l, true, bd.field_C);
          ((kf) this).field_b.a((byte) 127, 0, bs.field_a);
          ((kf) this).field_b.a(true, 2, true, dl.field_p, false);
          ((kf) this).field_b.a(un.field_i, 0, 0);
          ((kf) this).field_b.a(0, (byte) 109);
          int discarded$3 = -23521;
          this.h();
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new eg();
    }
}
