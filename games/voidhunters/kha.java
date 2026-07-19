/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kha {
    private int field_b;
    private rpa field_o;
    private int field_g;
    private ij field_i;
    private rpa field_s;
    private qfa field_t;
    private boolean field_k;
    private int field_q;
    static int field_v;
    private rpa field_h;
    private int field_m;
    static String field_d;
    private aia field_w;
    private boolean field_e;
    private aia[] field_l;
    private nv field_n;
    private int field_p;
    private boolean field_f;
    private boolean field_a;
    private int field_r;
    private boolean field_c;
    private nv field_u;
    private boolean field_j;

    private final void a(mea param0, boolean param1) {
        try {
            param0.field_f = param1 ? true : false;
            param0.c((byte) 66);
            param0.b(-3846);
            this.c(false);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0) {
        int var5 = 0;
        int var6 = 0;
        int var8 = VoidHunters.field_G;
        int var2 = param0 ? 1 : 0;
        int var3 = 0;
        int var4 = 0;
        mea var9 = (mea) ((Object) this.field_i.d(0));
        while (var9 != null) {
            var6 = var9.d((byte) 7);
            if (!(var6 <= var3)) {
                var3 = var6;
            }
            var4 = var4 + var9.d(23230);
            var2 = var2 != 0 | var9.e(0) ? 1 : 0;
            var9 = (mea) ((Object) this.field_i.a((byte) 72));
        }
        if (2 == var3) {
            var5 = 34836;
        } else {
            if ((var3 ^ -1) == -2) {
                var5 = 34842;
            } else {
                var5 = 6408;
            }
        }
        if (var5 != this.field_r) {
            this.field_e = true;
            this.field_r = var5;
        }
        var6 = 2 < this.field_p ? 2 : this.field_p;
        int var7 = var4 <= 2 ? var4 : 2;
        this.field_p = var4;
        if (var6 != var7) {
            this.field_e = true;
            this.field_j = true;
        }
        if ((var2 == 0 ? 1 : 0) == (this.field_c ? 1 : 0)) {
            this.field_c = var2 != 0 ? true : false;
            this.field_f = true;
        }
    }

    final boolean a(int param0, mea param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 2998) {
                break L1;
              } else {
                this.field_h = (rpa) null;
                break L1;
              }
            }
            L2: {
              if (null == this.field_h) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param1.f(-257)) {
                      break L4;
                    } else {
                      if (param1.a(param0 + -2907)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_i.b(-10258, param1);
                  this.c(false);
                  if (!this.b(false)) {
                    break L3;
                  } else {
                    L5: {
                      if (0 == (this.field_q ^ -1)) {
                        break L5;
                      } else {
                        if (-1 == this.field_b) {
                          break L5;
                        } else {
                          param1.a(this.field_b, this.field_q, -19454);
                          break L5;
                        }
                      }
                    }
                    param1.field_f = true;
                    stackOut_10_0 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
                this.a(param1, false);
                break L2;
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("kha.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        ksa var6 = null;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param4 == -5214) {
            break L0;
          } else {
            this.field_i = (ij) null;
            break L0;
          }
        }
        L1: {
          if (null == this.field_h) {
            break L1;
          } else {
            if (this.field_i.b(118)) {
              break L1;
            } else {
              L2: {
                L3: {
                  if (this.field_q != param2) {
                    break L3;
                  } else {
                    if (param3 != this.field_b) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_b = param3;
                this.field_q = param2;
                var6 = this.field_i.d(param4 + 5214);
                L4: while (true) {
                  if (var6 == this.field_i.field_a) {
                    this.field_j = true;
                    this.field_f = true;
                    this.field_e = true;
                    break L2;
                  } else {
                    ((mea) ((Object) var6)).a(this.field_b, this.field_q, -19454);
                    var6 = var6.field_c;
                    continue L4;
                  }
                }
              }
              if (this.b(false)) {
                this.field_g = param1;
                this.field_m = param0;
                this.field_k = true;
                this.field_t.a((byte) -120, (jaa) (this.field_h));
                this.field_h.a(0, 0);
                this.field_t.c(this.field_b - -this.field_g - this.field_t.field_Y, -this.field_m, 0);
                return true;
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    private final boolean b(boolean param0) {
        boolean discarded$1 = false;
        int var3 = 0;
        mea var4 = null;
        aia[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        aia[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        aia[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        aia stackIn_34_2 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_59_0 = 0;
        aia[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        aia[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_33_2 = null;
        aia[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        aia stackOut_32_2 = null;
        Object stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (this.field_f) {
            L1: {
              if (null != this.field_u) {
                this.field_u.e((byte) 119);
                this.field_u = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != this.field_w) {
                this.field_w.e(0);
                this.field_w = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null == this.field_s) {
                break L3;
              } else {
                this.field_u = new nv(this.field_t, 6402, this.field_q, this.field_b, this.field_t.field_Kc);
                break L3;
              }
            }
            L4: {
              if (!this.field_c) {
                if (this.field_u == null) {
                  this.field_u = new nv(this.field_t, 6402, this.field_q, this.field_b);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                this.field_w = new aia(this.field_t, 34037, 6402, this.field_q, this.field_b);
                break L4;
              }
            }
            this.field_j = true;
            this.field_f = false;
            this.field_a = true;
            break L0;
          } else {
            break L0;
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            var4 = (mea) null;
            discarded$1 = this.a(120, (mea) null);
            break L5;
          }
        }
        L6: {
          if (this.field_e) {
            L7: {
              if (this.field_n != null) {
                this.field_n.e((byte) 110);
                this.field_n = null;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != this.field_l[0]) {
                this.field_l[0].e(0);
                this.field_l[0] = null;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (null != this.field_l[1]) {
                this.field_l[1].e(0);
                this.field_l[1] = null;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (this.field_s == null) {
                break L10;
              } else {
                this.field_n = new nv(this.field_t, this.field_r, this.field_q, this.field_b, this.field_t.field_Kc);
                break L10;
              }
            }
            L11: {
              this.field_l[0] = new aia(this.field_t, 34037, this.field_r, this.field_q, this.field_b);
              stackOut_31_0 = this.field_l;
              stackOut_31_1 = 1;
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              if (1 >= this.field_p) {
                stackOut_33_0 = (aia[]) ((Object) stackIn_33_0);
                stackOut_33_1 = stackIn_33_1;
                stackOut_33_2 = null;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = (aia) ((Object) stackOut_33_2);
                break L11;
              } else {
                stackOut_32_0 = (aia[]) ((Object) stackIn_32_0);
                stackOut_32_1 = stackIn_32_1;
                stackOut_32_2 = new aia(this.field_t, 34037, this.field_r, this.field_q, this.field_b);
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                break L11;
              }
            }
            stackIn_34_0[stackIn_34_1] = stackIn_34_2;
            this.field_j = true;
            this.field_a = true;
            this.field_e = false;
            break L6;
          } else {
            break L6;
          }
        }
        L12: {
          if (!this.field_j) {
            break L12;
          } else {
            L13: {
              if (this.field_s != null) {
                L14: {
                  this.field_t.a((byte) -126, (jaa) (this.field_o));
                  this.field_o.a(0, (byte) -27);
                  this.field_o.a(1, (byte) -27);
                  this.field_o.a(8, (byte) 110);
                  this.field_o.a(0, (byte) -126, this.field_l[0]);
                  if ((this.field_p ^ -1) < -2) {
                    this.field_o.a(1, (byte) -126, this.field_l[1]);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (!this.field_c) {
                    break L15;
                  } else {
                    this.field_o.a(8, (byte) -128, this.field_w);
                    break L15;
                  }
                }
                this.field_t.a(this.field_o, 2896);
                this.field_t.a((byte) -122, (jaa) (this.field_s));
                this.field_s.a(0, (byte) -48);
                this.field_s.a(8, (byte) -80);
                this.field_s.a(0, this.field_n, (byte) -20);
                this.field_s.a(8, this.field_u, (byte) -20);
                this.field_t.a(this.field_s, 2896);
                break L13;
              } else {
                L16: {
                  this.field_t.a((byte) -125, (jaa) (this.field_o));
                  this.field_o.a(0, (byte) -36);
                  this.field_o.a(1, (byte) -61);
                  this.field_o.a(8, (byte) -5);
                  this.field_o.a(0, (byte) -127, this.field_l[0]);
                  if (this.field_p <= 1) {
                    break L16;
                  } else {
                    this.field_o.a(1, (byte) -127, this.field_l[1]);
                    break L16;
                  }
                }
                if (!this.field_c) {
                  this.field_o.a(8, this.field_u, (byte) -20);
                  this.field_t.a(this.field_o, 2896);
                  break L13;
                } else {
                  this.field_o.a(8, (byte) -126, this.field_w);
                  this.field_t.a(this.field_o, 2896);
                  break L13;
                }
              }
            }
            this.field_j = false;
            this.field_a = true;
            break L12;
          }
        }
        L17: {
          if (!this.field_a) {
            break L17;
          } else {
            L18: {
              this.field_t.a((byte) -121, (jaa) (this.field_h));
              stackOut_52_0 = this;
              stackIn_54_0 = stackOut_52_0;
              stackIn_53_0 = stackOut_52_0;
              if (this.field_h.g(93)) {
                stackOut_54_0 = this;
                stackOut_54_1 = 0;
                stackIn_55_0 = stackOut_54_0;
                stackIn_55_1 = stackOut_54_1;
                break L18;
              } else {
                stackOut_53_0 = this;
                stackOut_53_1 = 1;
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                break L18;
              }
            }
            ((kha) (this)).field_a = stackIn_55_1 != 0;
            this.field_t.a(this.field_h, 2896);
            break L17;
          }
        }
        L19: {
          if (this.field_a) {
            stackOut_58_0 = 0;
            stackIn_59_0 = stackOut_58_0;
            break L19;
          } else {
            stackOut_57_0 = 1;
            stackIn_59_0 = stackOut_57_0;
            break L19;
          }
        }
        return stackIn_59_0 != 0;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        mea var4_ref_mea = null;
        int var4 = 0;
        mea var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (this.field_k) {
          L0: {
            if (null == this.field_s) {
              break L0;
            } else {
              L1: {
                var2 = 16384;
                this.field_t.b((byte) 101, (jaa) (this.field_s));
                this.field_t.b(0, this.field_o);
                this.field_s.b(119, 0);
                this.field_o.a(0, 0);
                if (this.field_c) {
                  var2 = var2 | 256;
                  break L1;
                } else {
                  break L1;
                }
              }
              jaggl.OpenGL.glBlitFramebufferEXT(0, 0, this.field_q, this.field_b, 0, 0, this.field_q, this.field_b, var2, 9728);
              this.field_t.a((jaa) (this.field_s), (byte) -94);
              this.field_t.a(56, this.field_o);
              break L0;
            }
          }
          this.field_t.n(27841);
          this.field_t.d(0, 127);
          this.field_t.c(0, 1);
          this.field_t.t(110);
          var2 = 0;
          var3 = 1;
          var4_ref_mea = (mea) ((Object) this.field_i.d(0));
          L2: while (true) {
            if (var4_ref_mea == null) {
              this.field_k = false;
              var4 = -21 / ((55 - param0) / 61);
              return;
            } else {
              var5 = (mea) ((Object) this.field_i.a((byte) 112));
              var6 = var4_ref_mea.d(23230);
              var7 = 0;
              L3: while (true) {
                if (var6 <= var7) {
                  var4_ref_mea = var5;
                  continue L2;
                } else {
                  L4: {
                    L5: {
                      var4_ref_mea.a(this.field_l[var2], -3009, this.field_w, var7);
                      if (var5 != null) {
                        break L5;
                      } else {
                        if (-1 + var6 != var7) {
                          break L5;
                        } else {
                          this.field_t.a(this.field_o, 2896);
                          this.field_t.c(0, 0, 0);
                          jaggl.OpenGL.glBegin(7);
                          jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_b);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
                          jaggl.OpenGL.glVertex2i(this.field_m, this.field_g);
                          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                          jaggl.OpenGL.glVertex2i(this.field_m, this.field_b + this.field_g);
                          jaggl.OpenGL.glTexCoord2f((float)this.field_q, 0.0f);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
                          jaggl.OpenGL.glVertex2i(this.field_m + this.field_q, this.field_b + this.field_g);
                          jaggl.OpenGL.glTexCoord2f((float)this.field_q, (float)this.field_b);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
                          jaggl.OpenGL.glVertex2i(this.field_q + this.field_m, this.field_g);
                          jaggl.OpenGL.glEnd();
                          break L4;
                        }
                      }
                    }
                    this.field_o.a(0, 0 + var3);
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_b);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(0, 0);
                    jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(0, this.field_b);
                    jaggl.OpenGL.glTexCoord2f((float)this.field_q, 0.0f);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(this.field_q, this.field_b);
                    jaggl.OpenGL.glTexCoord2f((float)this.field_q, (float)this.field_b);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(this.field_q, 0);
                    jaggl.OpenGL.glEnd();
                    break L4;
                  }
                  var2 = 1 + var2 & 1;
                  var4_ref_mea.a(var7, 1);
                  var3 = var3 + 1 & 1;
                  var7++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
            return;
        }
        field_d = null;
    }

    final void a(boolean param0) {
        ksa var2 = null;
        int var3 = VoidHunters.field_G;
        this.field_s = null;
        this.field_l = null;
        this.field_w = null;
        this.field_u = null;
        this.field_h = null;
        this.field_n = null;
        if (!param0) {
            kha.b(0);
        }
        this.field_o = null;
        if (!(this.field_i.b(8))) {
            var2 = this.field_i.d(0);
            while (var2 != this.field_i.field_a) {
                ((mea) ((Object) var2)).c((byte) 66);
                var2 = var2.field_c;
            }
        }
        this.field_b = 1;
        this.field_q = 1;
    }

    final boolean a(int param0) {
        if (param0 > -125) {
            mea var3 = (mea) null;
            this.a((mea) null, true);
        }
        return this.field_h != null ? true : false;
    }

    kha(qfa param0) {
        rpa dupTemp$4 = null;
        rpa dupTemp$5 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        this.field_g = 0;
        this.field_q = 1;
        this.field_b = 1;
        this.field_m = 0;
        this.field_i = new ij();
        this.field_l = new aia[2];
        this.field_p = 0;
        this.field_a = true;
        this.field_f = true;
        this.field_r = -1;
        this.field_e = true;
        this.field_c = false;
        this.field_j = true;
        try {
          L0: {
            L1: {
              this.field_t = param0;
              if (!this.field_t.field_U) {
                break L1;
              } else {
                if (!this.field_t.field_g) {
                  break L1;
                } else {
                  dupTemp$4 = new rpa(this.field_t);
                  this.field_o = dupTemp$4;
                  this.field_h = dupTemp$4;
                  if (1 >= this.field_t.field_Kc) {
                    break L1;
                  } else {
                    if (!this.field_t.field_Ob) {
                      break L1;
                    } else {
                      if (!this.field_t.field_gb) {
                        break L1;
                      } else {
                        dupTemp$5 = new rpa(this.field_t);
                        this.field_s = dupTemp$5;
                        this.field_h = dupTemp$5;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("kha.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_d = "Uses energy to block projectiles";
    }
}
