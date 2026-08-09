/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends rq {
    static int[] field_k;
    static String field_n;
    private wg field_f;
    static int field_r;
    static jn field_q;
    private boolean field_e;
    private wg field_g;
    private boolean field_u;
    static hr field_t;
    private float[] field_s;
    private wg field_m;
    private boolean field_h;
    private wg field_j;
    private ru field_o;
    private boolean field_l;
    static int field_i;
    static int[] field_p;

    final void a(int param0) {
        int var2;
        int var3;
        float var4;
        float var5;
        if (param0 != 260) {
          L0: {
            this.a(-12, 3, -112);
            if (this.field_l) {
              var2 = this.field_b.XA();
              var3 = this.field_b.i();
              var4 = (float)var2 - (float)(-var3 + var2) * 0.125f;
              var5 = -(0.25f * (float)(var2 + -var3)) + (float)var2;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_b.S(98), (float)this.field_b.e((byte) 99) / 255.0f);
              this.field_b.g(1, -116);
              this.field_b.a(false, this.field_b.v(15));
              this.field_b.g(0, -117);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_l) {
              var2 = this.field_b.XA();
              var3 = this.field_b.i();
              var4 = (float)var2 - (float)(-var3 + var2) * 0.125f;
              var5 = -(0.25f * (float)(var2 + -var3)) + (float)var2;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_b.S(98), (float)this.field_b.e((byte) 99) / 255.0f);
              this.field_b.g(1, -116);
              this.field_b.a(false, this.field_b.v(15));
              this.field_b.g(0, -117);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 12) {
          field_t = (hr) null;
          field_q = null;
          field_k = null;
          field_p = null;
          field_t = null;
          return;
        } else {
          field_q = null;
          field_k = null;
          field_p = null;
          field_t = null;
          return;
        }
    }

    private final void e(byte param0) {
        int var2;
        ut var3;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        L0: {
          var2 = this.field_b.M(-125);
          var3 = this.field_b.g((byte) -28);
          if (!this.field_e) {
            L1: {
              stackIn_7_0 = 34336;

              if (2147483647 == var2) {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_m.field_b;
                break L1;
              } else {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_f.field_b;
                break L1;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
            break L0;
          } else {
            L2: {
              stackIn_3_0 = 34336;

              if (var2 == 2147483647) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_j.field_b;
                break L2;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_g.field_b;
                break L2;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
            break L0;
          }
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_l = true;
        var3.a(0.0f, this.field_s, (byte) 71, 0.0f, -1.0f, (float)var2);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_s[0], this.field_s[1], this.field_s[2], this.field_s[3]);
        this.a(param0 + 246);
        if (param0 != 14) {
          this.a(true, 123);
          return;
        } else {
          return;
        }
    }

    pn(on param0, ki param1) {
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
        this.field_s = new float[4];
        this.field_h = false;
        try {
          L0: {
            if (param1 == null) {
              break L0;
            } else {
              if (param0.field_Ac) {
                L1: {
                  this.field_m = ve.a((byte) 83, param0, param1.a("uw_ground_unlit", "gl", -1), 34336);
                  this.field_j = ve.a((byte) 83, param0, param1.a("uw_ground_lit", "gl", -1), 34336);
                  this.field_f = ve.a((byte) 73, param0, param1.a("uw_model_unlit", "gl", -1), 34336);
                  this.field_g = ve.a((byte) -120, param0, param1.a("uw_model_lit", "gl", -1), 34336);
                  if (this.field_f == null) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    break L1;
                  }
                }
                L2: {


                  if (this.field_j == null) {

                    stackIn_10_1 = 0;
                    break L2;
                  } else {

                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                L3: {




                  if (this.field_m == null) {


                    stackIn_13_2 = 0;
                    break L3;
                  } else {


                    stackIn_13_2 = 1;
                    break L3;
                  }
                }
                L4: {
                  stackIn_15_0 = stackIn_7_0 & (stackIn_10_1 & stackIn_13_2);

                  if (null == this.field_g) {
                    stackIn_16_0 = stackIn_15_0;
                    stackIn_16_1 = 0;
                    break L4;
                  } else {
                    stackIn_16_0 = stackIn_15_0;
                    stackIn_16_1 = 1;
                    break L4;
                  }
                }
                if ((stackIn_16_0 & stackIn_16_1) != 0) {
                  this.field_o = this.field_b.a(new int[]{0, -1}, 1, false, -119, 2);
                  this.field_o.a(false, false, true);
                  this.field_u = true;
                  return;
                } else {
                  this.field_u = false;
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          this.field_u = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("pn.<init>(");

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
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= -71) {
            pn.d(26);
        }
    }

    final void c(boolean param0) {
        L0: {
          this.field_b.g(1, -119);
          this.field_b.a((ed) null, 113);
          this.field_b.a((byte) -83, vi.field_v, vi.field_v);
          this.field_b.a(jq.field_a, 0, 0);
          this.field_b.a(mm.field_h, 2, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_b.g(0, -108);
          if (this.field_h) {
            this.field_b.a(jq.field_a, 0, 0);
            this.field_b.a(jq.field_a, 0, true);
            this.field_h = false;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_l) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            this.field_l = false;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0) {
          this.field_h = false;
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
            pn.d(21);
            return this.field_u;
        }
        return this.field_u;
    }

    final static void d(byte param0) {
        int var1;
        int var2;
        var1 = uv.b(-25843);
        var2 = fu.e((byte) 78);
        gk.field_v.a(var1 + (kf.field_B << -70628223), -kf.field_B + hu.field_b, (pd.field_l << -738081375) + var2, 19, hh.field_f - pd.field_l);
        if (param0 != -7) {
          return;
        } else {
          sj.a((byte) 124);
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 18834) {
                break L1;
              } else {
                field_i = -7;
                break L1;
              }
            }
            if (param2 == null) {
              if (this.field_h) {
                break L0;
              } else {
                this.field_b.a(this.field_b.field_D, 97);
                this.field_b.h(113, 1);
                this.field_b.a(ta.field_a, 0, 0);
                this.field_b.a(ta.field_a, 0, true);
                this.field_h = true;
                return;
              }
            } else {
              L2: {
                if (this.field_h) {
                  this.field_b.a(jq.field_a, 0, 0);
                  this.field_b.a(jq.field_a, 0, true);
                  this.field_h = false;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_b.a(param2, 121);
              this.field_b.h(37, param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("pn.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
            this.a(-3, -116, 82);
        }
    }

    final void a(boolean param0, int param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        if (param1 != 20186) {
          return;
        } else {
          L0: {
            stackIn_3_0 = this;

            if (!param0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L0;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L0;
            }
          }
          ((pn) (this)).field_e = stackIn_4_1 != 0;
          this.field_b.g(1, -112);
          this.field_b.a(this.field_o, param1 + -20070);
          this.field_b.a((byte) -83, lf.field_e, ua.field_n);
          this.field_b.a(mm.field_h, 0, 0);
          this.field_b.a((byte) 85, 2, true, false, jq.field_a);
          this.field_b.a(ta.field_a, 0, true);
          this.field_b.g(0, -108);
          this.e((byte) 14);
          return;
        }
    }

    static {
        field_k = new int[12];
        field_q = new jn();
    }
}
