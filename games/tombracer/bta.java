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
            this.a(-124, false);
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            field_i = (java.awt.Color) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_k = param1 ? true : false;
        this.field_c.e(1, false);
        this.field_c.a(true, this.field_p);
        this.field_c.a(ln.field_F, (byte) -110, r.field_m);
        this.field_c.a(pea.field_c, 0, -30);
        this.field_c.a(ej.field_c, 2, -6219, true, false);
        this.field_c.a(0, false, lja.field_j);
        int var3 = -29 % ((param0 - 41) / 62);
        this.field_c.e(0, false);
        this.d(-124);
    }

    public static void d(boolean param0) {
        if (param0) {
          field_d = (il) null;
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
        super(param0);
        RuntimeException var3 = null;
        int var4 = 0;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_j = false;
        this.field_h = new float[4];
        try {
          L0: {
            if (param1 == null) {
              this.field_m = false;
              return;
            } else {
              if (!param0.field_qd) {
                this.field_m = false;
                return;
              } else {
                L1: {
                  this.field_e = wd.a((byte) -70, param0, param1.a("gl", (byte) 122, "uw_ground_unlit"), 34336);
                  this.field_l = wd.a((byte) -70, param0, param1.a("gl", (byte) 126, "uw_ground_lit"), 34336);
                  this.field_r = wd.a((byte) -70, param0, param1.a("gl", (byte) 121, "uw_model_unlit"), 34336);
                  this.field_o = wd.a((byte) -70, param0, param1.a("gl", (byte) 115, "uw_model_lit"), 34336);
                  if (this.field_r == null) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L1;
                  }
                }
                L2: {
                  stackOut_6_0 = stackIn_6_0;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (this.field_e == null) {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (null == this.field_l) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L3;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L3;
                  }
                }
                L4: {
                  stackOut_12_0 = stackIn_12_0 & (stackIn_12_1 & stackIn_12_2);
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (this.field_o == null) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L4;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if ((stackIn_15_0 & stackIn_15_1) != 0) {
                      break L6;
                    } else {
                      this.field_m = false;
                      if (var4 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.field_p = this.field_c.a(true, 1, false, 2, new int[]{0, -1});
                  this.field_p.a((byte) -77, false, false);
                  this.field_m = true;
                  if (var4 == 0) {
                    break L5;
                  } else {
                    this.field_m = false;
                    return;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("bta.<init>(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        if (!param0) {
          L0: {
            this.a(false);
            if (this.field_g) {
              var2 = this.field_c.XA();
              var3 = this.field_c.i();
              var4 = (float)var2 - (float)(var2 + -var3) * 0.125f;
              var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_c.g(false), (float)this.field_c.A(-2903) / 255.0f);
              this.field_c.e(1, false);
              this.field_c.g(3625, this.field_c.t(65280));
              this.field_c.e(0, false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_g) {
              var2 = this.field_c.XA();
              var3 = this.field_c.i();
              var4 = (float)var2 - (float)(var2 + -var3) * 0.125f;
              var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_c.g(false), (float)this.field_c.A(-2903) / 255.0f);
              this.field_c.e(1, false);
              this.field_c.g(3625, this.field_c.t(65280));
              this.field_c.e(0, false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        this.field_c.e(1, false);
        if (param0 >= -4) {
          L0: {
            this.a(73);
            this.field_c.a(true, (iva) null);
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(ej.field_c, 0, -49);
            this.field_c.a(pea.field_c, 2, -53);
            this.field_c.a(0, false, ej.field_c);
            this.field_c.e(0, false);
            if (this.field_j) {
              this.field_c.a(ej.field_c, 0, -107);
              this.field_c.a(0, false, ej.field_c);
              this.field_j = false;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            this.field_c.a(true, (iva) null);
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(ej.field_c, 0, -49);
            this.field_c.a(pea.field_c, 2, -53);
            this.field_c.a(0, false, ej.field_c);
            this.field_c.e(0, false);
            if (this.field_j) {
              this.field_c.a(ej.field_c, 0, -107);
              this.field_c.a(0, false, ej.field_c);
              this.field_j = false;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (this.field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param2 == 24595) {
              L1: {
                L2: {
                  if (param1 != null) {
                    break L2;
                  } else {
                    if (this.field_j) {
                      break L1;
                    } else {
                      this.field_c.a(true, this.field_c.field_Jb);
                      this.field_c.a((byte) 120, 1);
                      this.field_c.a(lja.field_j, 0, -21);
                      this.field_c.a(0, false, lja.field_j);
                      this.field_j = true;
                      if (!TombRacer.field_G) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  if (!this.field_j) {
                    break L3;
                  } else {
                    this.field_c.a(ej.field_c, 0, param2 ^ -24583);
                    this.field_c.a(0, false, ej.field_c);
                    this.field_j = false;
                    break L3;
                  }
                }
                this.field_c.a(true, param1);
                this.field_c.a((byte) 114, param0);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("bta.E(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            this.field_p = (gf) null;
            return this.field_m;
        }
        return this.field_m;
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
            var2 = this.field_c.d(false);
            var3 = this.field_c.E(43);
            if (this.field_k) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = 34336;
                stackIn_3_0 = stackOut_1_0;
                stackIn_2_0 = stackOut_1_0;
                if (var2 == 2147483647) {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = this.field_e.field_b;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  break L2;
                } else {
                  stackOut_2_0 = stackIn_2_0;
                  stackOut_2_1 = this.field_r.field_b;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  break L2;
                }
              }
              jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
              if (!TombRacer.field_G) {
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
            if (var2 == 2147483647) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = this.field_l.field_b;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L3;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = this.field_o.field_b;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L3;
            }
          }
          jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
          break L0;
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_g = true;
        var3.a(32560, 0.0f, 0.0f, this.field_h, (float)var2, -1.0f);
        if (param0 > -123) {
          return;
        } else {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_h[0], this.field_h[1], this.field_h[2], this.field_h[3]);
          this.a(true);
          return;
        }
    }

    static {
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
