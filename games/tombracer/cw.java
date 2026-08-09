/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw {
    private int field_o;
    private cka field_t;
    private int field_q;
    private cb field_e;
    private boolean field_a;
    private int field_g;
    private int field_k;
    private cb field_i;
    private cb field_d;
    private vna field_j;
    private boolean field_c;
    private kba field_l;
    private boolean field_h;
    private kba field_b;
    private boolean field_n;
    private rt[] field_r;
    private rt field_m;
    private boolean field_u;
    private int field_s;
    private int field_p;
    private boolean field_f;

    private final boolean c(int param0) {
        rt[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        rt[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        rt stackIn_32_2 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_59_0 = 0;
        int var3;
        oga var4;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 == -739) {
            break L0;
          } else {
            var4 = (oga) null;
            this.a(22, (oga) null);
            break L0;
          }
        }
        L1: {
          if (this.field_c) {
            L2: {
              if (null != this.field_b) {
                this.field_b.g(param0 ^ 653);
                this.field_b = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null != this.field_m) {
                this.field_m.b(0);
                this.field_m = null;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_e == null) {
                break L4;
              } else {
                this.field_b = new kba(this.field_t, 6402, this.field_k, this.field_g, this.field_t.field_gb);
                break L4;
              }
            }
            L5: {
              if (this.field_u) {
                this.field_m = new rt(this.field_t, 34037, 6402, this.field_k, this.field_g);
                break L5;
              } else {
                if (null != this.field_b) {
                  break L5;
                } else {
                  this.field_b = new kba(this.field_t, 6402, this.field_k, this.field_g);
                  break L5;
                }
              }
            }
            this.field_n = true;
            this.field_c = false;
            this.field_h = true;
            break L1;
          } else {
            break L1;
          }
        }
        L6: {
          if (this.field_f) {
            L7: {
              if (this.field_l != null) {
                this.field_l.g(80);
                this.field_l = null;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null == this.field_r[0]) {
                break L8;
              } else {
                this.field_r[0].b(0);
                this.field_r[0] = null;
                break L8;
              }
            }
            L9: {
              if (null != this.field_r[1]) {
                this.field_r[1].b(0);
                this.field_r[1] = null;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (this.field_e == null) {
                break L10;
              } else {
                this.field_l = new kba(this.field_t, this.field_s, this.field_k, this.field_g, this.field_t.field_gb);
                break L10;
              }
            }
            L11: {
              this.field_r[0] = new rt(this.field_t, 34037, this.field_s, this.field_k, this.field_g);
              stackIn_31_0 = this.field_r;

              stackIn_31_1 = 1;

              if (-2 <= (this.field_p ^ -1)) {
                stackIn_32_0 = (rt[]) ((Object) stackIn_31_0);
                stackIn_32_1 = stackIn_31_1;
                stackIn_32_2 = null;
                break L11;
              } else {
                stackIn_32_0 = (rt[]) ((Object) stackIn_31_0);
                stackIn_32_1 = stackIn_31_1;
                stackIn_32_2 = new rt(this.field_t, 34037, this.field_s, this.field_k, this.field_g);
                break L11;
              }
            }
            stackIn_32_0[stackIn_32_1] = stackIn_32_2;
            this.field_f = false;
            this.field_n = true;
            this.field_h = true;
            break L6;
          } else {
            break L6;
          }
        }
        L12: {
          if (this.field_h) {
            L13: {
              if (this.field_e == null) {
                L14: {
                  this.field_t.b((ks) (this.field_i), (byte) 81);
                  this.field_i.a(-110, 0);
                  this.field_i.a(-114, 1);
                  this.field_i.a(36, 8);
                  this.field_i.a(true, this.field_r[0], 0);
                  if (1 < this.field_p) {
                    this.field_i.a(true, this.field_r[1], 1);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (this.field_u) {
                    this.field_i.a(true, this.field_m, 8);
                    break L15;
                  } else {
                    this.field_i.a(8, this.field_b, true);
                    break L15;
                  }
                }
                this.field_t.b(this.field_i, 0);
                break L13;
              } else {
                L16: {
                  this.field_t.b((ks) (this.field_i), (byte) 81);
                  this.field_i.a(-93, 0);
                  this.field_i.a(-123, 1);
                  this.field_i.a(107, 8);
                  this.field_i.a(true, this.field_r[0], 0);
                  if (1 < this.field_p) {
                    this.field_i.a(true, this.field_r[1], 1);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (!this.field_u) {
                    break L17;
                  } else {
                    this.field_i.a(true, this.field_m, 8);
                    break L17;
                  }
                }
                this.field_t.b(this.field_i, 0);
                this.field_t.b((ks) (this.field_e), (byte) 81);
                this.field_e.a(124, 0);
                this.field_e.a(71, 8);
                this.field_e.a(0, this.field_l, true);
                this.field_e.a(8, this.field_b, true);
                this.field_t.b(this.field_e, 0);
                break L13;
              }
            }
            this.field_h = false;
            this.field_n = true;
            break L12;
          } else {
            break L12;
          }
        }
        L18: {
          if (this.field_n) {
            L19: {
              this.field_t.b((ks) (this.field_d), (byte) 81);
              stackIn_54_0 = this;

              if (this.field_d.c(20)) {
                stackIn_55_0 = this;
                stackIn_55_1 = 0;
                break L19;
              } else {
                stackIn_55_0 = this;
                stackIn_55_1 = 1;
                break L19;
              }
            }
            ((cw) (this)).field_n = stackIn_55_1 != 0;
            this.field_t.b(this.field_d, param0 + 739);
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (this.field_n) {
            stackIn_59_0 = 0;
            break L20;
          } else {
            stackIn_59_0 = 1;
            break L20;
          }
        }
        return stackIn_59_0 != 0;
    }

    final boolean a(int param0, oga param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                this.field_p = 84;
                break L1;
              }
            }
            if (this.field_d != null) {
              L2: {
                L3: {
                  if (param1.c((byte) 99)) {
                    break L3;
                  } else {
                    if (!param1.a((byte) 65)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_j.b((byte) -59, param1);
                this.b(114);
                if (!this.c(-739)) {
                  break L2;
                } else {
                  L4: {
                    if (-1 == this.field_k) {
                      break L4;
                    } else {
                      if ((this.field_g ^ -1) != 0) {
                        param1.a(this.field_g, (byte) -71, this.field_k);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param1.field_h = true;
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              this.a(false, param1);
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("cw.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        vg var6 = null;
        boolean discarded$0 = false;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_d) {
            return false;
        }
        if (this.field_j.d((byte) 14)) {
            return false;
        }
        if (param0 != this.field_k || param2 != this.field_g) {
            this.field_k = param0;
            this.field_g = param2;
            var6 = this.field_j.f(-80);
            while (this.field_j.field_e != var6) {
                ((oga) ((Object) var6)).a(this.field_g, (byte) -71, this.field_k);
                var6 = var6.field_a;
            }
            this.field_h = true;
            this.field_c = true;
            this.field_f = true;
        }
        if (!(!this.c(-739))) {
            this.field_q = param3;
            this.field_a = true;
            this.field_o = param1;
            this.field_t.b((ks) (this.field_d), (byte) 81);
            this.field_d.a(0, (byte) -91);
            this.field_t.a(4, -this.field_t.field_I + (this.field_g - -this.field_q), -this.field_o);
            return true;
        }
        if (param4 != 0) {
            discarded$0 = this.c(39);
        }
        return false;
    }

    private final void a(boolean param0, oga param1) {
        try {
            param1.field_h = param0 ? true : false;
            param1.d((byte) -71);
            param1.p(72);
            this.b(64);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cw.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        oga var4;
        oga var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          if (param0 < -43) {
            break L0;
          } else {
            this.b((byte) -49);
            break L0;
          }
        }
        if (this.field_a) {
          L1: {
            if (null != this.field_e) {
              L2: {
                var2 = 16384;
                this.field_t.a(this.field_e, -1090);
                this.field_t.a(0, this.field_i);
                this.field_e.b(-1, 0);
                this.field_i.a(0, (byte) -91);
                if (this.field_u) {
                  var2 = var2 | 256;
                  break L2;
                } else {
                  break L2;
                }
              }
              jaggl.OpenGL.glBlitFramebufferEXT(0, 0, this.field_k, this.field_g, 0, 0, this.field_k, this.field_g, var2, 9728);
              this.field_t.a((ks) (this.field_e), (byte) -38);
              this.field_t.c(this.field_i, -4);
              break L1;
            } else {
              break L1;
            }
          }
          this.field_t.q(2);
          this.field_t.a((byte) 66, 0);
          this.field_t.d(1, 1);
          this.field_t.la();
          var2 = 0;
          var3 = 1;
          var4 = (oga) ((Object) this.field_j.f(-80));
          L3: while (true) {
            if (var4 == null) {
              this.field_a = false;
              return;
            } else {
              var5 = (oga) ((Object) this.field_j.e(125));
              var6 = var4.c(1);
              var7 = 0;
              L4: while (true) {
                if (var6 <= var7) {
                  var4 = var5;
                  continue L3;
                } else {
                  L5: {
                    L6: {
                      var4.a(this.field_r[var2], var7, (byte) -100, this.field_m);
                      if (var5 != null) {
                        break L6;
                      } else {
                        if (-1 + var6 != var7) {
                          break L6;
                        } else {
                          this.field_t.b(this.field_i, 0);
                          this.field_t.a(4, 0, 0);
                          jaggl.OpenGL.glBegin(7);
                          jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_g);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
                          jaggl.OpenGL.glVertex2i(this.field_o, this.field_q);
                          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                          jaggl.OpenGL.glVertex2i(this.field_o, this.field_q + this.field_g);
                          jaggl.OpenGL.glTexCoord2f((float)this.field_k, 0.0f);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
                          jaggl.OpenGL.glVertex2i(this.field_o - -this.field_k, this.field_q - -this.field_g);
                          jaggl.OpenGL.glTexCoord2f((float)this.field_k, (float)this.field_g);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
                          jaggl.OpenGL.glVertex2i(this.field_k + this.field_o, this.field_q);
                          jaggl.OpenGL.glEnd();
                          break L5;
                        }
                      }
                    }
                    this.field_i.a(0 + var3, (byte) -91);
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_g);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(0, 0);
                    jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(0, this.field_g);
                    jaggl.OpenGL.glTexCoord2f((float)this.field_k, 0.0f);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(this.field_k, this.field_g);
                    jaggl.OpenGL.glTexCoord2f((float)this.field_k, (float)this.field_g);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(this.field_k, 0);
                    jaggl.OpenGL.glEnd();
                    break L5;
                  }
                  var3 = 1 & var3 + 1;
                  var2 = 1 + var2 & 1;
                  var4.a(var7, (byte) 120);
                  var7++;
                  continue L4;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        oga var9;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          var3 = 0;
          var4 = 0;
          var9 = (oga) ((Object) this.field_j.f(-80));
          if (param0 >= 35) {
            break L0;
          } else {
            this.field_f = false;
            break L0;
          }
        }
        L1: while (true) {
          if (var9 == null) {
            L2: {
              if (var3 != 2) {
                if (var3 == 1) {
                  var5 = 34842;
                  break L2;
                } else {
                  var5 = 6408;
                  break L2;
                }
              } else {
                var5 = 34836;
                break L2;
              }
            }
            L3: {
              if (this.field_s != var5) {
                this.field_f = true;
                this.field_s = var5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_p <= 2) {
                stackIn_18_0 = this.field_p;
                break L4;
              } else {
                stackIn_18_0 = 2;
                break L4;
              }
            }
            L5: {
              var6 = stackIn_18_0;
              if ((var4 ^ -1) >= -3) {
                stackIn_21_0 = var4;
                break L5;
              } else {
                stackIn_21_0 = 2;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_21_0;
              if (var7 == var6) {
                break L6;
              } else {
                this.field_f = true;
                this.field_h = true;
                break L6;
              }
            }
            L7: {
              if (this.field_u) {
                stackIn_26_0 = 0;
                break L7;
              } else {
                stackIn_26_0 = 1;
                break L7;
              }
            }
            L8: {


              if (var2 != 0) {

                stackIn_29_1 = 0;
                break L8;
              } else {

                stackIn_29_1 = 1;
                break L8;
              }
            }
            L9: {
              if (stackIn_26_0 != stackIn_29_1) {
                L10: {
                  stackIn_33_0 = this;

                  if (var2 == 0) {
                    stackIn_34_0 = this;
                    stackIn_34_1 = 0;
                    break L10;
                  } else {
                    stackIn_34_0 = this;
                    stackIn_34_1 = 1;
                    break L10;
                  }
                }
                ((cw) (this)).field_u = stackIn_34_1 != 0;
                this.field_c = true;
                break L9;
              } else {
                break L9;
              }
            }
            this.field_p = var4;
            return;
          } else {
            L11: {
              var6 = var9.b(13727);
              if (var6 > var3) {
                var3 = var6;
                break L11;
              } else {
                break L11;
              }
            }
            var4 = var4 + var9.c(1);
            var2 = var2 != 0 | var9.a(1) ? 1 : 0;
            var9 = (oga) ((Object) this.field_j.e(107));
            continue L1;
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 != -43) {
            this.field_d = (cb) null;
        }
        return this.field_d != null ? true : false;
    }

    final void a(int param0) {
        vg var2;
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          this.field_l = null;
          this.field_m = null;
          this.field_i = null;
          this.field_r = null;
          this.field_b = null;
          this.field_e = null;
          this.field_d = null;
          if (!this.field_j.d((byte) 14)) {
            var2 = this.field_j.f(-80);
            L1: while (true) {
              if (this.field_j.field_e == var2) {
                break L0;
              } else {
                ((oga) ((Object) var2)).d((byte) -35);
                var2 = var2.field_a;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 >= -43) {
          return;
        } else {
          this.field_k = 1;
          this.field_g = 1;
          return;
        }
    }

    cw(cka param0) {
        cb dupTemp$2 = null;
        cb dupTemp$3 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = 1;
        this.field_k = 1;
        this.field_q = 0;
        this.field_o = 0;
        this.field_j = new vna();
        this.field_c = true;
        this.field_h = true;
        this.field_u = false;
        this.field_n = true;
        this.field_r = new rt[2];
        this.field_s = -1;
        this.field_p = 0;
        this.field_f = true;
        try {
          L0: {
            L1: {
              L2: {
                this.field_t = param0;
                if (!this.field_t.field_id) {
                  break L2;
                } else {
                  if (!this.field_t.field_Cc) {
                    break L1;
                  } else {
                    dupTemp$2 = new cb(this.field_t);
                    this.field_i = dupTemp$2;
                    this.field_d = dupTemp$2;
                    if (1 >= this.field_t.field_gb) {
                      break L2;
                    } else {
                      if (!this.field_t.field_hc) {
                        break L2;
                      } else {
                        if (!this.field_t.field_ed) {
                          break L1;
                        } else {
                          dupTemp$3 = new cb(this.field_t);
                          this.field_e = dupTemp$3;
                          this.field_d = dupTemp$3;
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("cw.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
    }
}
