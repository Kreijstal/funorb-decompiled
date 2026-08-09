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
        this.field_b.a(1, (byte) 116);
        this.field_b.a((jj) null, -9135);
        this.field_b.a(ru.field_a, param0, ru.field_a);
        this.field_b.a((byte) 126, 0, dl.field_p);
        this.field_b.a((byte) 119, 2, bs.field_a);
        this.field_b.a(dl.field_p, 0, 0);
        if (param0) {
          this.field_b.a(0, (byte) 79);
          if (this.field_i) {
            L0: {
              this.field_b.a((byte) 125, 0, dl.field_p);
              this.field_b.a(dl.field_p, 0, 0);
              this.field_i = false;
              if (this.field_h) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                jaggl.OpenGL.glDisable(34820);
                jaggl.OpenGL.glDisable(34336);
                this.field_h = false;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (this.field_h) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                jaggl.OpenGL.glDisable(34820);
                jaggl.OpenGL.glDisable(34336);
                this.field_h = false;
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

    private final void h(int param0) {
        int var2;
        ec var3;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        L0: {
          var2 = this.field_b.n((byte) -103);
          var3 = this.field_b.t(-11198);
          if (!this.field_f) {
            L1: {
              stackIn_7_0 = 34336;

              if ((var2 ^ -1) != -2147483648) {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_p.field_d;
                break L1;
              } else {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_o.field_d;
                break L1;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
            break L0;
          } else {
            L2: {
              stackIn_3_0 = 34336;

              if ((var2 ^ -1) != -2147483648) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_j.field_d;
                break L2;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_g.field_d;
                break L2;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
            break L0;
          }
        }
        jaggl.OpenGL.glEnable(34336);
        if (param0 != -23521) {
          field_m = (eg) null;
          this.field_h = true;
          var3.a(0.0f, -1.0f, this.field_l, 0.0f, (float)var2, 11);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_l[0], this.field_l[1], this.field_l[2], this.field_l[3]);
          this.a(10);
          return;
        } else {
          this.field_h = true;
          var3.a(0.0f, -1.0f, this.field_l, 0.0f, (float)var2, 11);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_l[0], this.field_l[1], this.field_l[2], this.field_l[3]);
          this.a(10);
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            this.field_o = (mo) null;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            return true;
        }
        return this.field_k;
    }

    kf(jc param0, gk param1) {
        super(param0);
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_l = new float[4];
        this.field_i = false;
        try {
          L0: {
            if (param1 == null) {
              break L0;
            } else {
              if (param0.field_Vc) {
                L1: {
                  this.field_o = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_unlit"), param0);
                  this.field_g = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_lit"), param0);
                  this.field_p = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_unlit"), param0);
                  this.field_j = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_lit"), param0);
                  if (null == this.field_p) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    break L1;
                  }
                }
                L2: {


                  if (this.field_o == null) {

                    stackIn_10_1 = 0;
                    break L2;
                  } else {

                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                L3: {




                  if (this.field_g == null) {


                    stackIn_13_2 = 0;
                    break L3;
                  } else {


                    stackIn_13_2 = 1;
                    break L3;
                  }
                }
                L4: {
                  stackIn_15_0 = stackIn_7_0 & (stackIn_10_1 & stackIn_13_2);

                  if (this.field_j == null) {
                    stackIn_16_0 = stackIn_15_0;
                    stackIn_16_1 = 0;
                    break L4;
                  } else {
                    stackIn_16_0 = stackIn_15_0;
                    stackIn_16_1 = 1;
                    break L4;
                  }
                }
                if ((stackIn_16_0 & stackIn_16_1) == 0) {
                  this.field_k = false;
                  return;
                } else {
                  this.field_n = this.field_b.a(new int[]{0, -1}, 2, 0, false, 1);
                  this.field_n.a(false, false, (byte) -127);
                  this.field_k = true;
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          this.field_k = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("kf.<init>(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
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
            this.field_g = (mo) null;
        }
    }

    final void a(int param0, int param1, jj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                if (this.field_i) {
                  this.field_b.a((byte) 120, 0, dl.field_p);
                  this.field_b.a(dl.field_p, 0, 0);
                  this.field_i = false;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_b.a(param2, -9135);
              this.field_b.b(param0, false);
              break L0;
            } else {
              if (!this.field_i) {
                this.field_b.a(this.field_b.field_Kb, -9135);
                this.field_b.b(1, false);
                this.field_b.a((byte) 118, 0, un.field_i);
                this.field_b.a(un.field_i, 0, 0);
                this.field_i = true;
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
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("kf.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static void f(int param0) {
        ud.field_e = null;
        ji.field_b = null;
        lh.field_a = null;
        fk.field_a = (byte[][]) null;
        ee.field_e = null;
        if (param0 != 1) {
          field_m = (eg) null;
          lg.field_j = null;
          return;
        } else {
          lg.field_j = null;
          return;
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        float var4;
        float var5;
        L0: {
          if (this.field_h) {
            var2 = this.field_b.XA();
            var3 = this.field_b.i();
            var4 = (float)var2 - 0.125f * (float)(-var3 + var2);
            var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_b.j((byte) 5), (float)this.field_b.H(param0 ^ 111) / 255.0f);
            this.field_b.a(1, (byte) 52);
            this.field_b.a((byte) -74, this.field_b.q(0));
            this.field_b.a(0, (byte) 35);
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 <= 2) {
          L0: {
            this.field_k = false;
            stackIn_7_0 = this;

            if (!param0) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((kf) (this)).field_f = stackIn_8_1 != 0;
          this.field_b.a(1, (byte) 81);
          this.field_b.a(this.field_n, -9135);
          this.field_b.a(du.field_l, true, bd.field_C);
          this.field_b.a((byte) 127, 0, bs.field_a);
          this.field_b.a(true, 2, true, dl.field_p, false);
          this.field_b.a(un.field_i, 0, 0);
          this.field_b.a(0, (byte) 109);
          this.h(-23521);
          return;
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((kf) (this)).field_f = stackIn_4_1 != 0;
          this.field_b.a(1, (byte) 81);
          this.field_b.a(this.field_n, -9135);
          this.field_b.a(du.field_l, true, bd.field_C);
          this.field_b.a((byte) 127, 0, bs.field_a);
          this.field_b.a(true, 2, true, dl.field_p, false);
          this.field_b.a(un.field_i, 0, 0);
          this.field_b.a(0, (byte) 109);
          this.h(-23521);
          return;
        }
    }

    static {
        field_m = new eg();
    }
}
