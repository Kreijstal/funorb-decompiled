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
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
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
        int var2 = 0;
        ut var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        L0: {
          L1: {
            var2 = this.field_b.M(-125);
            var3 = this.field_b.g((byte) -28);
            if (!this.field_e) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = 34336;
                stackIn_3_0 = stackOut_1_0;
                stackIn_2_0 = stackOut_1_0;
                if (var2 == 2147483647) {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = this.field_j.field_b;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  break L2;
                } else {
                  stackOut_2_0 = stackIn_2_0;
                  stackOut_2_1 = this.field_g.field_b;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  break L2;
                }
              }
              jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            stackOut_5_0 = 34336;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (2147483647 == var2) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = this.field_m.field_b;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L3;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = this.field_f.field_b;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L3;
            }
          }
          jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
          break L0;
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
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_s = new float[4];
        this.field_h = false;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    if (param0.field_Ac) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_u = false;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L4: {
                this.field_m = ve.a((byte) 83, param0, param1.a("uw_ground_unlit", "gl", -1), 34336);
                this.field_j = ve.a((byte) 83, param0, param1.a("uw_ground_lit", "gl", -1), 34336);
                this.field_f = ve.a((byte) 73, param0, param1.a("uw_model_unlit", "gl", -1), 34336);
                this.field_g = ve.a((byte) -120, param0, param1.a("uw_model_lit", "gl", -1), 34336);
                if (this.field_f == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L4;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L4;
                }
              }
              L5: {
                stackOut_7_0 = stackIn_7_0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (this.field_j == null) {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L5;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L5;
                }
              }
              L6: {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (this.field_m == null) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L6;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L6;
                }
              }
              L7: {
                stackOut_13_0 = stackIn_13_0 & (stackIn_13_1 & stackIn_13_2);
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (null == this.field_g) {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L7;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L7;
                }
              }
              L8: {
                if ((stackIn_16_0 & stackIn_16_1) != 0) {
                  break L8;
                } else {
                  this.field_u = false;
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_o = this.field_b.a(new int[]{0, -1}, 1, false, -119, 2);
              this.field_o.a(false, false, true);
              this.field_u = true;
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("pn.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          L10: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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
        int var1 = 0;
        int var2 = 0;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            L2: {
              L3: {
                if (param2 == null) {
                  break L3;
                } else {
                  L4: {
                    if (this.field_h) {
                      this.field_b.a(jq.field_a, 0, 0);
                      this.field_b.a(jq.field_a, 0, true);
                      this.field_h = false;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_b.a(param2, 121);
                  this.field_b.h(37, param0);
                  if (!Sumoblitz.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_h) {
                break L2;
              } else {
                this.field_b.a(this.field_b.field_D, 97);
                this.field_b.h(113, 1);
                this.field_b.a(ta.field_a, 0, 0);
                this.field_b.a(ta.field_a, 0, true);
                this.field_h = true;
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("pn.E(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != 20186) {
          return;
        } else {
          L0: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
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
