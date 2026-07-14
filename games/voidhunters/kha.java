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
        param0.field_f = param1 ? true : false;
        param0.c((byte) 66);
        param0.b(-3846);
        this.c(false);
    }

    private final void c(boolean param0) {
        int var6 = 0;
        int var5 = 0;
        int var8 = VoidHunters.field_G;
        int var2 = param0 ? 1 : 0;
        int var3 = 0;
        int var4 = 0;
        mea var9 = (mea) (Object) ((kha) this).field_i.d(0);
        while (var9 != null) {
            var6 = var9.d((byte) 7);
            if (!(var6 <= var3)) {
                var3 = var6;
            }
            var4 = var4 + var9.d(23230);
            var2 = var2 != 0 | var9.e(0) ? 1 : 0;
            var9 = (mea) (Object) ((kha) this).field_i.a((byte) 72);
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
        if (var5 != ((kha) this).field_r) {
            ((kha) this).field_e = true;
            ((kha) this).field_r = var5;
        }
        var6 = 2 < ((kha) this).field_p ? 2 : ((kha) this).field_p;
        int var7 = var4 <= 2 ? var4 : 2;
        ((kha) this).field_p = var4;
        if (var6 != var7) {
            ((kha) this).field_e = true;
            ((kha) this).field_j = true;
        }
        if ((var2 == 0 ? 1 : 0) == (((kha) this).field_c ? 1 : 0)) {
            ((kha) this).field_c = var2 != 0 ? true : false;
            ((kha) this).field_f = true;
        }
    }

    final boolean a(int param0, mea param1) {
        if (param0 != 2998) {
            ((kha) this).field_h = null;
        }
        if (null == ((kha) this).field_h) {
            return false;
        }
        if (!param1.f(-257)) {
            // ifne L53
        } else {
            ((kha) this).field_i.b(-10258, (ksa) (Object) param1);
            this.c(false);
            if (!this.b(false)) {
                this.a(param1, false);
                return false;
            }
            if (0 != (((kha) this).field_q ^ -1)) {
                if (-1 != ((kha) this).field_b) {
                    param1.a(((kha) this).field_b, ((kha) this).field_q, -19454);
                }
            }
            param1.field_f = true;
            return true;
        }
        this.a(param1, false);
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        ksa var6 = null;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param4 == -5214) {
            break L0;
          } else {
            ((kha) this).field_i = null;
            break L0;
          }
        }
        L1: {
          if (null == ((kha) this).field_h) {
            break L1;
          } else {
            if (((kha) this).field_i.b(118)) {
              break L1;
            } else {
              L2: {
                L3: {
                  if (((kha) this).field_q != param2) {
                    break L3;
                  } else {
                    if (param3 != ((kha) this).field_b) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                ((kha) this).field_b = param3;
                ((kha) this).field_q = param2;
                var6 = ((kha) this).field_i.d(param4 + 5214);
                L4: while (true) {
                  if (var6 == ((kha) this).field_i.field_a) {
                    ((kha) this).field_j = true;
                    ((kha) this).field_f = true;
                    ((kha) this).field_e = true;
                    break L2;
                  } else {
                    ((mea) (Object) var6).a(((kha) this).field_b, ((kha) this).field_q, -19454);
                    var6 = var6.field_c;
                    continue L4;
                  }
                }
              }
              if (this.b(false)) {
                ((kha) this).field_g = param1;
                ((kha) this).field_m = param0;
                ((kha) this).field_k = true;
                ((kha) this).field_t.a((byte) -120, (jaa) (Object) ((kha) this).field_h);
                ((kha) this).field_h.a(0, 0);
                ((kha) this).field_t.c(((kha) this).field_b - -((kha) this).field_g - ((kha) this).field_t.field_Y, -((kha) this).field_m, 0);
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
        int var3 = 0;
        Object var4 = null;
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
          if (((kha) this).field_f) {
            L1: {
              if (null != ((kha) this).field_u) {
                ((kha) this).field_u.e((byte) 119);
                ((kha) this).field_u = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != ((kha) this).field_w) {
                ((kha) this).field_w.e(0);
                ((kha) this).field_w = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null == ((kha) this).field_s) {
                break L3;
              } else {
                ((kha) this).field_u = new nv(((kha) this).field_t, 6402, ((kha) this).field_q, ((kha) this).field_b, ((kha) this).field_t.field_Kc);
                break L3;
              }
            }
            L4: {
              if (!((kha) this).field_c) {
                if (((kha) this).field_u == null) {
                  ((kha) this).field_u = new nv(((kha) this).field_t, 6402, ((kha) this).field_q, ((kha) this).field_b);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                ((kha) this).field_w = new aia(((kha) this).field_t, 34037, 6402, ((kha) this).field_q, ((kha) this).field_b);
                break L4;
              }
            }
            ((kha) this).field_j = true;
            ((kha) this).field_f = false;
            ((kha) this).field_a = true;
            break L0;
          } else {
            break L0;
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            var4 = null;
            boolean discarded$1 = ((kha) this).a(120, (mea) null);
            break L5;
          }
        }
        L6: {
          if (((kha) this).field_e) {
            L7: {
              if (((kha) this).field_n != null) {
                ((kha) this).field_n.e((byte) 110);
                ((kha) this).field_n = null;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != ((kha) this).field_l[0]) {
                ((kha) this).field_l[0].e(0);
                ((kha) this).field_l[0] = null;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (null != ((kha) this).field_l[1]) {
                ((kha) this).field_l[1].e(0);
                ((kha) this).field_l[1] = null;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((kha) this).field_s == null) {
                break L10;
              } else {
                ((kha) this).field_n = new nv(((kha) this).field_t, ((kha) this).field_r, ((kha) this).field_q, ((kha) this).field_b, ((kha) this).field_t.field_Kc);
                break L10;
              }
            }
            L11: {
              ((kha) this).field_l[0] = new aia(((kha) this).field_t, 34037, ((kha) this).field_r, ((kha) this).field_q, ((kha) this).field_b);
              stackOut_31_0 = ((kha) this).field_l;
              stackOut_31_1 = 1;
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              if (1 >= ((kha) this).field_p) {
                stackOut_33_0 = (aia[]) (Object) stackIn_33_0;
                stackOut_33_1 = stackIn_33_1;
                stackOut_33_2 = null;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = (aia) (Object) stackOut_33_2;
                break L11;
              } else {
                stackOut_32_0 = (aia[]) (Object) stackIn_32_0;
                stackOut_32_1 = stackIn_32_1;
                stackOut_32_2 = new aia(((kha) this).field_t, 34037, ((kha) this).field_r, ((kha) this).field_q, ((kha) this).field_b);
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                break L11;
              }
            }
            stackIn_34_0[stackIn_34_1] = stackIn_34_2;
            ((kha) this).field_j = true;
            ((kha) this).field_a = true;
            ((kha) this).field_e = false;
            break L6;
          } else {
            break L6;
          }
        }
        L12: {
          if (!((kha) this).field_j) {
            break L12;
          } else {
            L13: {
              if (((kha) this).field_s != null) {
                L14: {
                  ((kha) this).field_t.a((byte) -126, (jaa) (Object) ((kha) this).field_o);
                  ((kha) this).field_o.a(0, (byte) -27);
                  ((kha) this).field_o.a(1, (byte) -27);
                  ((kha) this).field_o.a(8, (byte) 110);
                  ((kha) this).field_o.a(0, (byte) -126, ((kha) this).field_l[0]);
                  if ((((kha) this).field_p ^ -1) < -2) {
                    ((kha) this).field_o.a(1, (byte) -126, ((kha) this).field_l[1]);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (!((kha) this).field_c) {
                    break L15;
                  } else {
                    ((kha) this).field_o.a(8, (byte) -128, ((kha) this).field_w);
                    break L15;
                  }
                }
                ((kha) this).field_t.a((jaa) (Object) ((kha) this).field_o, 2896);
                ((kha) this).field_t.a((byte) -122, (jaa) (Object) ((kha) this).field_s);
                ((kha) this).field_s.a(0, (byte) -48);
                ((kha) this).field_s.a(8, (byte) -80);
                ((kha) this).field_s.a(0, ((kha) this).field_n, (byte) -20);
                ((kha) this).field_s.a(8, ((kha) this).field_u, (byte) -20);
                ((kha) this).field_t.a((jaa) (Object) ((kha) this).field_s, 2896);
                break L13;
              } else {
                L16: {
                  ((kha) this).field_t.a((byte) -125, (jaa) (Object) ((kha) this).field_o);
                  ((kha) this).field_o.a(0, (byte) -36);
                  ((kha) this).field_o.a(1, (byte) -61);
                  ((kha) this).field_o.a(8, (byte) -5);
                  ((kha) this).field_o.a(0, (byte) -127, ((kha) this).field_l[0]);
                  if (((kha) this).field_p <= 1) {
                    break L16;
                  } else {
                    ((kha) this).field_o.a(1, (byte) -127, ((kha) this).field_l[1]);
                    break L16;
                  }
                }
                if (!((kha) this).field_c) {
                  ((kha) this).field_o.a(8, ((kha) this).field_u, (byte) -20);
                  ((kha) this).field_t.a((jaa) (Object) ((kha) this).field_o, 2896);
                  break L13;
                } else {
                  ((kha) this).field_o.a(8, (byte) -126, ((kha) this).field_w);
                  ((kha) this).field_t.a((jaa) (Object) ((kha) this).field_o, 2896);
                  break L13;
                }
              }
            }
            ((kha) this).field_j = false;
            ((kha) this).field_a = true;
            break L12;
          }
        }
        L17: {
          if (!((kha) this).field_a) {
            break L17;
          } else {
            L18: {
              ((kha) this).field_t.a((byte) -121, (jaa) (Object) ((kha) this).field_h);
              stackOut_52_0 = this;
              stackIn_54_0 = stackOut_52_0;
              stackIn_53_0 = stackOut_52_0;
              if (((kha) this).field_h.g(93)) {
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
            ((kha) this).field_a = stackIn_55_1 != 0;
            ((kha) this).field_t.a((jaa) (Object) ((kha) this).field_h, 2896);
            break L17;
          }
        }
        L19: {
          if (((kha) this).field_a) {
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
        mea var4_ref = null;
        mea var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (((kha) this).field_k) {
          L0: {
            if (null == ((kha) this).field_s) {
              break L0;
            } else {
              L1: {
                var2 = 16384;
                ((kha) this).field_t.b((byte) 101, (jaa) (Object) ((kha) this).field_s);
                ((kha) this).field_t.b(0, (jaa) (Object) ((kha) this).field_o);
                ((kha) this).field_s.b(119, 0);
                ((kha) this).field_o.a(0, 0);
                if (((kha) this).field_c) {
                  var2 = var2 | 256;
                  break L1;
                } else {
                  break L1;
                }
              }
              jaggl.OpenGL.glBlitFramebufferEXT(0, 0, ((kha) this).field_q, ((kha) this).field_b, 0, 0, ((kha) this).field_q, ((kha) this).field_b, var2, 9728);
              ((kha) this).field_t.a((jaa) (Object) ((kha) this).field_s, (byte) -94);
              ((kha) this).field_t.a(56, (jaa) (Object) ((kha) this).field_o);
              break L0;
            }
          }
          ((kha) this).field_t.n(27841);
          ((kha) this).field_t.d(0, 127);
          ((kha) this).field_t.c(0, 1);
          ((kha) this).field_t.t(110);
          var2 = 0;
          var3 = 1;
          var4_ref_mea = (mea) (Object) ((kha) this).field_i.d(0);
          L2: while (true) {
            if (var4_ref_mea == null) {
              ((kha) this).field_k = false;
              var4 = -21 / ((55 - param0) / 61);
              return;
            } else {
              var5 = (mea) (Object) ((kha) this).field_i.a((byte) 112);
              var6 = var4_ref_mea.d(23230);
              var7 = 0;
              L3: while (true) {
                if (var6 <= var7) {
                  var4_ref = var5;
                  continue L2;
                } else {
                  L4: {
                    L5: {
                      var4_ref_mea.a(((kha) this).field_l[var2], -3009, ((kha) this).field_w, var7);
                      if (var5 != null) {
                        break L5;
                      } else {
                        if (-1 + var6 != var7) {
                          break L5;
                        } else {
                          ((kha) this).field_t.a((jaa) (Object) ((kha) this).field_o, 2896);
                          ((kha) this).field_t.c(0, 0, 0);
                          jaggl.OpenGL.glBegin(7);
                          jaggl.OpenGL.glTexCoord2f(0.0f, (float)((kha) this).field_b);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
                          jaggl.OpenGL.glVertex2i(((kha) this).field_m, ((kha) this).field_g);
                          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                          jaggl.OpenGL.glVertex2i(((kha) this).field_m, ((kha) this).field_b + ((kha) this).field_g);
                          jaggl.OpenGL.glTexCoord2f((float)((kha) this).field_q, 0.0f);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
                          jaggl.OpenGL.glVertex2i(((kha) this).field_m + ((kha) this).field_q, ((kha) this).field_b + ((kha) this).field_g);
                          jaggl.OpenGL.glTexCoord2f((float)((kha) this).field_q, (float)((kha) this).field_b);
                          jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
                          jaggl.OpenGL.glVertex2i(((kha) this).field_q + ((kha) this).field_m, ((kha) this).field_g);
                          jaggl.OpenGL.glEnd();
                          break L4;
                        }
                      }
                    }
                    ((kha) this).field_o.a(0, 0 + var3);
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glTexCoord2f(0.0f, (float)((kha) this).field_b);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(0, 0);
                    jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(0, ((kha) this).field_b);
                    jaggl.OpenGL.glTexCoord2f((float)((kha) this).field_q, 0.0f);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
                    jaggl.OpenGL.glVertex2i(((kha) this).field_q, ((kha) this).field_b);
                    jaggl.OpenGL.glTexCoord2f((float)((kha) this).field_q, (float)((kha) this).field_b);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
                    jaggl.OpenGL.glVertex2i(((kha) this).field_q, 0);
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
        ((kha) this).field_s = null;
        ((kha) this).field_l = null;
        ((kha) this).field_w = null;
        ((kha) this).field_u = null;
        ((kha) this).field_h = null;
        ((kha) this).field_n = null;
        if (!param0) {
            kha.b(0);
        }
        ((kha) this).field_o = null;
        if (!(((kha) this).field_i.b(8))) {
            var2 = ((kha) this).field_i.d(0);
            while (var2 != ((kha) this).field_i.field_a) {
                ((mea) (Object) var2).c((byte) 66);
                var2 = var2.field_c;
            }
        }
        ((kha) this).field_b = 1;
        ((kha) this).field_q = 1;
    }

    final boolean a(int param0) {
        if (param0 > -125) {
            Object var3 = null;
            this.a((mea) null, true);
        }
        return ((kha) this).field_h != null ? true : false;
    }

    kha(qfa param0) {
        ((kha) this).field_g = 0;
        ((kha) this).field_q = 1;
        ((kha) this).field_b = 1;
        ((kha) this).field_m = 0;
        ((kha) this).field_i = new ij();
        ((kha) this).field_l = new aia[2];
        ((kha) this).field_p = 0;
        ((kha) this).field_a = true;
        ((kha) this).field_f = true;
        ((kha) this).field_r = -1;
        ((kha) this).field_e = true;
        ((kha) this).field_c = false;
        ((kha) this).field_j = true;
        ((kha) this).field_t = param0;
        if (((kha) this).field_t.field_U) {
            if (((kha) this).field_t.field_g) {
                ((kha) this).field_o = new rpa(((kha) this).field_t);
                ((kha) this).field_h = new rpa(((kha) this).field_t);
                if (1 < ((kha) this).field_t.field_Kc) {
                    if (((kha) this).field_t.field_Ob) {
                        if (((kha) this).field_t.field_gb) {
                            ((kha) this).field_s = new rpa(((kha) this).field_t);
                            ((kha) this).field_h = new rpa(((kha) this).field_t);
                        }
                    }
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Uses energy to block projectiles";
    }
}
