/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jp extends pf {
    static Random field_Jc;
    static int field_Oc;
    private ij field_yc;
    private jaggl.OpenGL field_zc;
    private ij field_Ic;
    private ij field_Uc;
    private ij field_Cc;
    private ij field_bd;
    private ij field_Ec;
    private ij field_Gc;
    private boolean field_cd;
    private boolean field_Kc;
    private long field_Tc;
    jaggl.MapBuffer field_Sc;
    private int field_Rc;
    private boolean field_Lc;
    private boolean field_Yc;
    private esb[] field_Pc;
    private boolean field_Dc;
    jaggl.MapBuffer field_Vc;
    boolean field_Ac;
    private int field_Fc;
    int[] field_Wc;
    private boolean field_Zc;
    private boolean field_Xc;
    private String field_Bc;
    boolean field_Hc;
    boolean field_Qc;
    boolean field_Mc;
    private String field_ad;
    int field_Nc;

    final void a(byte param0, mkb param1, int param2) {
        try {
            if (param0 != -6) {
                this.field_Bc = (String) null;
            }
            this.field_Pc[param2] = (esb) ((Object) param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jp.VC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, uja param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 == -111) {
              L1: {
                if (meb.field_d != param1) {
                  var3_int = gm.a(param1, 9216);
                  jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
                  jaggl.OpenGL.glEnable(3168);
                  jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
                  jaggl.OpenGL.glEnable(3169);
                  jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
                  jaggl.OpenGL.glEnable(3170);
                  break L1;
                } else {
                  jaggl.OpenGL.glDisable(3168);
                  jaggl.OpenGL.glDisable(3169);
                  jaggl.OpenGL.glDisable(3170);
                  break L1;
                }
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("jp.UC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(jra param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = -83 / ((-4 - param3) / 32);
              if (tu.field_b != param0) {
                if (era.field_o != param0) {
                  if (di.field_i == param0) {
                    var6 = 4;
                    var7 = 3 * param2;
                    break L1;
                  } else {
                    if (param0 != bk.field_v) {
                      if (param0 != fu.field_o) {
                        var7 = param2;
                        var6 = 0;
                        break L1;
                      } else {
                        var7 = 2 + param2;
                        var6 = 5;
                        break L1;
                      }
                    } else {
                      var6 = 6;
                      var7 = param2 - -2;
                      break L1;
                    }
                  }
                } else {
                  var7 = param2 + 1;
                  var6 = 3;
                  break L1;
                }
              } else {
                var7 = param2 * 2;
                var6 = 1;
                break L1;
              }
            }
            jaggl.OpenGL.glDrawArrays(var6, param1, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("jp.DE(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void j(byte param0) {
        if (param0 != -56) {
            this.field_Lc = false;
        }
        if (!this.field_zb) {
            jaggl.OpenGL.glDisable(3042);
        } else {
            jaggl.OpenGL.glEnable(3042);
        }
    }

    final void o(byte param0) {
        if (param0 != 81) {
            this.ya();
        }
        if (this.field_ac) {
            jaggl.OpenGL.glEnable(3089);
        } else {
            jaggl.OpenGL.glDisable(3089);
        }
    }

    final vca a(byte param0, boolean param1) {
        if (param0 != -19) {
            return (vca) null;
        }
        return (vca) ((Object) new mq((jp) (this), mj.field_e, param1));
    }

    final boolean b() {
        return false;
    }

    final synchronized void b(int param0, int param1, boolean param2) {
        if (param2) {
            aja var5 = (aja) null;
            this.a((aja) null, true);
        }
        hua var4 = new hua(param1);
        var4.field_b = (long)param0;
        this.field_Ic.b(-10258, var4);
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
            jaggl.OpenGL.glDisable(32925);
        } else {
            jaggl.OpenGL.glEnable(32925);
        }
        if (param0 >= -14) {
            this.j((byte) -120);
        }
    }

    final void ya() {
        this.b((byte) -74, true);
        jaggl.OpenGL.glClear(256);
    }

    final void o() {
        super.o();
        if (!(this.field_zc == null)) {
            this.field_zc.b();
            this.field_zc.release();
            this.field_zc = null;
        }
    }

    final vmb a(int param0, qma[] param1) {
        RuntimeException var3 = null;
        bva stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                this.field_Yc = true;
                break L1;
              }
            }
            stackIn_3_0 = new bva(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jp.NC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (vmb) ((Object) stackIn_3_0);
    }

    final void e(boolean param0) {
        if (param0) {
            this.field_Cc = (ij) null;
        }
        if (this.field_g) {
            jaggl.OpenGL.glEnable(16384);
            jaggl.OpenGL.glEnable(16385);
        } else {
            jaggl.OpenGL.glDisable(16384);
            jaggl.OpenGL.glDisable(16385);
        }
    }

    final void F(int param0) {
        if (param0 != 12614) {
            this.y(-43);
        }
        if (this.field_nc) {
            jaggl.OpenGL.glEnable(2929);
        } else {
            jaggl.OpenGL.glDisable(2929);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final boolean s() {
        return false;
    }

    public static void K(int param0) {
        field_Jc = null;
        if (param0 != 771) {
            field_Oc = -126;
        }
    }

    final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        for (var2 = -1 + this.field_L; var2 >= 0; var2--) {
            jaggl.OpenGL.glActiveTexture(var2 + 33984);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
            jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34186, 34168);
        jaggl.OpenGL.glShadeModel(7425);
        jaggl.OpenGL.glClearDepth(1.0f);
        jaggl.OpenGL.glDepthFunc(515);
        jaggl.OpenGL.glPolygonMode(1028, 6914);
        jaggl.OpenGL.glEnable(2884);
        jaggl.OpenGL.glCullFace(1029);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glColorMaterial(1028, 5634);
        jaggl.OpenGL.glEnable(2903);
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = 0; 8 > var3; var3++) {
            var4 = var3 + 16384;
            jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
            jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
            jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        if (param0 < 106) {
            this.field_Gc = (ij) null;
        }
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_zc.setSwapInterval(0);
        super.n(117);
    }

    final hdb a(boolean param0, int param1, int[][] param2, int param3) {
        RuntimeException var5 = null;
        qva stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -5210) {
                break L1;
              } else {
                this.u();
                break L1;
              }
            }
            stackIn_3_0 = new qva((jp) (this), param3, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("jp.TC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return (hdb) ((Object) stackIn_3_0);
    }

    final void B(int param0) {
        L0: {
          L1: {
            if (!this.field_Xb) {
              break L1;
            } else {
              if (this.field_Hb) {
                break L1;
              } else {
                jaggl.OpenGL.glEnable(2896);
                break L0;
              }
            }
          }
          jaggl.OpenGL.glDisable(2896);
          break L0;
        }
        L2: {
          if (param0 < -15) {
            break L2;
          } else {
            this.field_bd = (ij) null;
            break L2;
          }
        }
    }

    final eb a(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        ubb var9 = null;
        eb stackIn_2_0 = null;
        gn stackIn_9_0 = null;
        ubb stackIn_11_0 = null;
        ubb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5) {
              L1: {
                if (this.field_Xc) {
                  break L1;
                } else {
                  L2: {
                    if (!bd.a(param0, (byte) -95)) {
                      break L2;
                    } else {
                      if (bd.a(param3, (byte) -95)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!this.field_Zc) {
                    var9 = new ubb((jp) (this), qua.field_d, mj.field_f, hj.a(param0, (byte) -100), hj.a(param3, (byte) -121));
                    var9.a(0, param3, param0, param6, param4, param2, 0, (byte) -104);
                    stackIn_11_0 = (ubb) (var9);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_9_0 = new gn((jp) (this), param0, param3, param2, param6, param4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_13_0 = new ubb((jp) (this), param0, param3, param1, param2, param6, param4);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_2_0 = (eb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("jp.ED(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (eb) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (eb) ((Object) stackIn_11_0);
            } else {
              return (eb) ((Object) stackIn_13_0);
            }
          }
        }
    }

    private final void I(byte param0) {
        int var2;
        int var3;
        L0: {
          var3 = VoidHunters.field_G;
          if (!this.field_Dc) {
            break L0;
          } else {
            jaggl.OpenGL.glPopMatrix();
            break L0;
          }
        }
        L1: {
          var2 = -41 % ((param0 - 24) / 42);
          if (!this.field_pb.a(-12178)) {
            if (this.field_ec) {
              jaggl.OpenGL.glLoadIdentity();
              this.field_Dc = false;
              break L1;
            } else {
              jaggl.OpenGL.glLoadMatrixf(this.field_O.b(msa.field_q, (byte) 114), 0);
              this.field_Dc = false;
              break L1;
            }
          } else {
            L2: {
              if (this.field_cd) {
                break L2;
              } else {
                jaggl.OpenGL.glLoadMatrixf(this.field_gb.b(msa.field_q, (byte) 114), 0);
                this.field_cd = true;
                this.m(3);
                this.f(73);
                break L2;
              }
            }
            if (!this.field_ec) {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glMultMatrixf(this.field_O.b(msa.field_q, (byte) 114), 0);
              this.field_Dc = true;
              break L1;
            } else {
              this.field_Dc = false;
              break L1;
            }
          }
        }
    }

    final void a(hf param0) {
    }

    final void h(boolean param0) {
        lva.field_o[2] = this.field_Rb * this.field_x;
        lva.field_o[1] = this.field_Rb * this.field_u;
        lva.field_o[0] = this.field_Rb * this.field_Sb;
        if (!param0) {
            field_Oc = -95;
        }
        lva.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightModelfv(2899, lva.field_o, 0);
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param1 <= 89) {
            this.field_Gc = (ij) null;
        }
        hua var4 = new hua(param2);
        var4.field_b = (long)param0;
        this.field_Uc.b(-10258, var4);
    }

    final hf a(ekb param0, wib param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("jp.OB(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return (hf) ((Object) stackIn_1_0);
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 648860920) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.h((byte) 101);
            this.a((ura) null, -111);
            this.c(71, 0);
            this.c(true);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_Nc, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jp.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final mkb a(boolean param0, int param1) {
        if (param1 != 3) {
            return (mkb) null;
        }
        return (mkb) ((Object) new esb((jp) (this), param0));
    }

    final void I(int param0) {
        if (!this.field_eb) {
            jaggl.OpenGL.glDisable(3008);
        } else {
            jaggl.OpenGL.glEnable(3008);
        }
        if (param0 != 17634) {
            this.o();
        }
    }

    final uda a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = -123 / ((-34 - param0) / 63);
        var4 = param1;
        if (3 != var4) {
          if ((var4 ^ -1) != -5) {
            if ((var4 ^ -1) != -9) {
              return super.a((byte) 54, param1);
            } else {
              return (uda) ((Object) new fib((jp) (this), this.field_Ab, this.field_Mb));
            }
          } else {
            return (uda) ((Object) new vsb((jp) (this), this.field_Ab, this.field_Mb));
          }
        } else {
          return (uda) ((Object) new bma((jp) (this), this.field_Ab));
        }
    }

    final void a(boolean param0, int param1, boolean param2, slb param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glTexEnvi(8960, param4 + 34176, qg.a(param3, false));
              if (param1 == -21115) {
                break L1;
              } else {
                this.j(71);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                L3: {
                  stackIn_9_0 = 8960;

                  stackIn_9_1 = 34192 - -param4;

                  if (param2) {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = 769;
                    break L3;
                  } else {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = 768;
                    break L3;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_10_0, stackIn_10_1, stackIn_10_2);
                break L2;
              } else {
                L4: {
                  stackIn_5_0 = 8960;

                  stackIn_5_1 = 34192 + param4;

                  if (!param2) {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 770;
                    break L4;
                  } else {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 771;
                    break L4;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_6_0, stackIn_6_1, stackIn_6_2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("jp.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void y(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 < -41) {
            break L0;
          } else {
            this.field_Cc = (ij) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_M) {
              break L2;
            } else {
              if (!this.field_X) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        jaggl.OpenGL.glDepthMask(stackIn_6_0 != 0);
    }

    final void a(boolean param0, byte param1, slb param2, int param3) {
        vmb var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, qg.a(param2, false));
              stackIn_2_0 = 8960;

              stackIn_2_1 = param3 + 34200;

              if (param0) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 771;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 770;
                break L1;
              }
            }
            L2: {
              jaggl.OpenGL.glTexEnvi(stackIn_3_0, stackIn_3_1, stackIn_3_2);
              if (param1 == 94) {
                break L2;
              } else {
                var6 = (vmb) null;
                this.a(-51, (vmb) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jp.WC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, kb param1, mj param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 43 % ((-77 - param0) / 49);
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("jp.HD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void w(int param0) {
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            this.a(0.3592780530452728f, 1.5894063711166382f, 0.25299444794654846f);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_cc) {
              break L2;
            } else {
              if (!this.field_ub) {
                break L2;
              } else {
                if ((this.field_j ^ -1) > -1) {
                  break L2;
                } else {
                  jaggl.OpenGL.glEnable(2912);
                  break L1;
                }
              }
            }
          }
          jaggl.OpenGL.glDisable(2912);
          break L1;
        }
    }

    final void a(aja param0, boolean param1) {
    }

    final float f(byte param0) {
        if (param0 > -90) {
            this.field_Yc = false;
        }
        return 0.0f;
    }

    final void G(byte param0) {
        lva.field_o[2] = this.field_x * this.field_oc;
        lva.field_o[1] = this.field_oc * this.field_u;
        lva.field_o[0] = this.field_Sb * this.field_oc;
        lva.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16384, 4609, lva.field_o, 0);
        lva.field_o[1] = this.field_u * -this.field_tc;
        if (param0 <= 4) {
            return;
        }
        lva.field_o[2] = -this.field_tc * this.field_x;
        lva.field_o[3] = 1.0f;
        lva.field_o[0] = this.field_Sb * -this.field_tc;
        jaggl.OpenGL.glLightfv(16385, 4609, lva.field_o, 0);
    }

    final void G(int param0) {
        this.field_cd = false;
        this.I((byte) -105);
        if (param0 != 17891) {
            this.j();
        }
    }

    final void y(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        if (param0 >= -17) {
            this.s((byte) -2);
        }
        jaggl.OpenGL.glLoadMatrixf(this.field_Fb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final static float[] a(float[] param0, int param1, int param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new float[param1];
              var3 = var4;
              cua.a(param0, 0, var4, 0, param1);
              if (param2 == 7353) {
                break L1;
              } else {
                field_Oc = -20;
                break L1;
              }
            }
            stackIn_3_0 = (float[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("jp.QD(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized void c(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var2;
        int var4;
        hua var5;
        hua var6;
        hua var7;
        hua var8;
        hua var9;
        ksa var10;
        ksa var11;
        hua var12;
        var4 = VoidHunters.field_G;
        var2 = 0;
        param0 = param0 & 2147483647;
        L0: while (true) {
          if (this.field_Ic.b(112)) {
            L1: {
              if ((var2 ^ -1) >= -1) {
                break L1;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, tgb.field_c, 0);
                var2 = 0;
                break L1;
              }
            }
            L2: while (true) {
              if (this.field_Uc.b(120)) {
                L3: {
                  if (var2 <= 0) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, tgb.field_c, 0);
                    var2 = 0;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (this.field_Cc.b(112)) {
                    L5: {
                      if (-1 <= (var2 ^ -1)) {
                        break L5;
                      } else {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, tgb.field_c, 0);
                        var2 = 0;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      if (this.field_bd.b(123)) {
                        L7: {
                          if ((var2 ^ -1) >= -1) {
                            break L7;
                          } else {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, tgb.field_c, 0);
                            var2 = 0;
                            break L7;
                          }
                        }
                        L8: while (true) {
                          if (this.field_yc.b(-94)) {
                            L9: while (true) {
                              if (this.field_Ec.b(-96)) {
                                L10: while (true) {
                                  if (this.field_Gc.b(127)) {
                                    L11: while (true) {
                                      if (this.field_yc.b(-126)) {
                                        L12: {
                                          if (100663296 >= this.g(3554)) {
                                            break L12;
                                          } else {
                                            if ((this.field_Tc - -60000L ^ -1L) <= (wt.a(false) ^ -1L)) {
                                              break L12;
                                            } else {
                                              System.gc();
                                              this.field_Tc = wt.a(false);
                                              break L12;
                                            }
                                          }
                                        }
                                        super.c(param0);
                                        return;
                                      } else {
                                        var12 = (hua) ((Object) this.field_yc.a(true));
                                        jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_d);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = this.field_Gc.a(true);
                                    jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = this.field_Ec.a(true);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (hua) ((Object) this.field_yc.a(true));
                            jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_d);
                            continue L8;
                          }
                        }
                      } else {
                        var8 = (hua) ((Object) this.field_bd.a(true));
                        incrementValue$0 = var2;
                        var2++;
                        tgb.field_c[incrementValue$0] = (int)var8.field_b;
                        this.field_mb = this.field_mb - var8.field_d;
                        if (-1001 == (var2 ^ -1)) {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, tgb.field_c, 0);
                          var2 = 0;
                          continue L6;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var7 = (hua) ((Object) this.field_Cc.a(true));
                    incrementValue$1 = var2;
                    var2++;
                    tgb.field_c[incrementValue$1] = var7.field_d;
                    if (1000 == var2) {
                      jaggl.OpenGL.glDeleteFramebuffersEXT(var2, tgb.field_c, 0);
                      var2 = 0;
                      continue L4;
                    } else {
                      continue L4;
                    }
                  }
                }
              } else {
                var6 = (hua) ((Object) this.field_Uc.a(true));
                incrementValue$2 = var2;
                var2++;
                tgb.field_c[incrementValue$2] = (int)var6.field_b;
                this.field_Nb = this.field_Nb - var6.field_d;
                if (var2 == 1000) {
                  jaggl.OpenGL.glDeleteTextures(var2, tgb.field_c, 0);
                  var2 = 0;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          } else {
            var5 = (hua) ((Object) this.field_Ic.a(true));
            incrementValue$3 = var2;
            var2++;
            tgb.field_c[incrementValue$3] = (int)var5.field_b;
            this.field_ob = this.field_ob - var5.field_d;
            if (1000 != var2) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, tgb.field_c, 0);
              var2 = 0;
              continue L0;
            }
          }
        }
    }

    final gf a(int param0, int param1, byte[] param2, kb param3, int param4, int param5) {
        RuntimeException var7 = null;
        gf stackIn_2_0 = null;
        rab stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 == -16539) {
              stackIn_4_0 = new rab((jp) (this), param3, param4, param0, param1, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (gf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("jp.BC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (gf) ((Object) stackIn_4_0);
        }
    }

    final eb a(kb param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        uja var10 = null;
        ubb var11 = null;
        ubb stackIn_7_0 = null;
        ubb stackIn_10_0 = null;
        gn stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6) {
                break L1;
              } else {
                var10 = (uja) null;
                this.a((byte) -46, (uja) null);
                break L1;
              }
            }
            L2: {
              if (this.field_Xc) {
                break L2;
              } else {
                L3: {
                  if (!bd.a(param7, (byte) -95)) {
                    break L3;
                  } else {
                    if (!bd.a(param4, (byte) -95)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.field_Zc) {
                  stackIn_12_0 = new gn((jp) (this), param0, param7, param4, param1, param3, param5);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var11 = new ubb((jp) (this), param0, mj.field_d, hj.a(param7, (byte) -125), hj.a(param4, (byte) -101));
                  var11.a(param4, param0, (byte) -51, param5, param1, 0, 0, param7, param3);
                  stackIn_10_0 = (ubb) (var11);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_7_0 = new ubb((jp) (this), param0, param7, param4, param2, param1, param3, param5);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var9);

            stackIn_15_1 = new StringBuilder().append("jp.VD(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (eb) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (eb) ((Object) stackIn_10_0);
          } else {
            return (eb) ((Object) stackIn_12_0);
          }
        }
    }

    final wib b(int param0, int param1) {
        return null;
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        Long var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              var4 = (Long) (param1);
              this.field_zc.releaseSurface(param0, var4.longValue());
              if (param2 == 0) {
                break L1;
              } else {
                this.e(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4_ref);

            stackIn_5_1 = new StringBuilder().append("jp.LC(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final void f(int param0) {
        fsb var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = VoidHunters.field_G;
        this.c(true);
        int var2 = 0;
        if (param0 <= 66) {
            return;
        }
        while (this.field_Kb > var2) {
            var3 = this.field_Lb[var2];
            var4 = var3.a(-118);
            var5 = 16386 - -var2;
            var6 = var3.d(-392138175) / 255.0f;
            lva.field_o[0] = (float)var3.c((byte) -79);
            lva.field_o[1] = (float)var3.a(true);
            lva.field_o[2] = (float)var3.d((byte) 62);
            lva.field_o[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var5, 4611, lva.field_o, 0);
            lva.field_o[0] = (float)dla.a(255, var4 >> -1366000368) * var6;
            lva.field_o[2] = (float)dla.a(255, var4) * var6;
            lva.field_o[1] = var6 * (float)(dla.a(var4, 65382) >> 1747844744);
            lva.field_o[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var5, 4609, lva.field_o, 0);
            jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.c(16777215) * var3.c(16777215)));
            jaggl.OpenGL.glEnable(var5);
            var2++;
        }
        while (this.field_bb > var2) {
            jaggl.OpenGL.glDisable(var2 + 16386);
            var2++;
        }
        super.f(75);
    }

    final synchronized void a(long param0, int param1) {
        ksa var4 = new ksa();
        var4.field_b = param0;
        if (param1 != 0) {
            return;
        }
        this.field_Gc.b(-10258, var4);
    }

    final Object a(byte param0, java.awt.Canvas param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Long stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_long = this.field_zc.prepareSurface(param1);
            if (param0 <= -21) {
              if (-1L == var3_long) {
                throw new RuntimeException();
              } else {
                stackIn_7_0 = new Long(var3_long);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (Object) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jp.MD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void C(int param0) {
        if (param0 != 0) {
            return;
        }
        jaggl.OpenGL.glMatrixMode(5890);
        if (fsa.field_o == this.field_A[this.field_ab]) {
            jaggl.OpenGL.glLoadIdentity();
        } else {
            jaggl.OpenGL.glLoadMatrixf(this.field_Eb[this.field_ab].b(msa.field_q, (byte) 114), 0);
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void v(byte param0) {
        lva.field_o[3] = (float)(this.field_jb >>> -786604744) / 255.0f;
        lva.field_o[2] = (float)dla.a(255, this.field_jb) / 255.0f;
        lva.field_o[1] = (float)dla.a(65280, this.field_jb) / 65280.0f;
        if (param0 != -109) {
            uja var3 = (uja) null;
            this.a((byte) -64, (uja) null);
        }
        lva.field_o[0] = (float)dla.a(this.field_jb, 16711680) / 16711680.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, lva.field_o, 0);
    }

    final void l(byte param0) {
        if (param0 < 109) {
            return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, tc.a(8448, this.field_U[this.field_ab]));
    }

    final void a(float param0, float param1, float param2) {
    }

    final void v() {
        if (0 >= this.field_db) {
            if (!(0 < this.field_i)) {
                return;
            }
        }
        int var1 = this.field_H;
        int var2 = this.field_F;
        int var3 = this.field_xc;
        int var4 = this.field_Bb;
        this.v(-107);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.w((byte) -101);
        this.d(false, -30305);
        this.c((byte) -73, false);
        this.b(false, -1700);
        this.b((byte) -74, false);
        this.a((ura) null, -116);
        this.a(false, (byte) -124, false, -2);
        this.h(45, 1);
        this.c(84, 0);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, this.field_db, this.field_i, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.KA(var1, var3, var2, var4);
    }

    final eb a(int param0, byte[] param1, kb param2, int param3, int param4, int param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        ubb var10 = null;
        ubb stackIn_7_0 = null;
        gn stackIn_10_0 = null;
        ubb stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param7 == 11) {
                break L1;
              } else {
                this.a(true, 116, (int[][]) null, -28);
                break L1;
              }
            }
            L2: {
              if (this.field_Xc) {
                break L2;
              } else {
                L3: {
                  if (!bd.a(param4, (byte) -95)) {
                    break L3;
                  } else {
                    if (!bd.a(param5, (byte) -95)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.field_Zc) {
                  var10 = new ubb((jp) (this), param2, mj.field_f, hj.a(param4, (byte) -107), hj.a(param5, (byte) -127));
                  var10.a(param3, param1, param5, param4, param0, 0, 3314, 0, param2);
                  stackIn_12_0 = (ubb) (var10);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = new gn((jp) (this), param2, param4, param5, param1, param0, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_7_0 = new ubb((jp) (this), param2, param4, param5, param6, param1, param0, param3);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var9);

            stackIn_15_1 = new StringBuilder().append("jp.LD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (eb) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (eb) ((Object) stackIn_10_0);
          } else {
            return (eb) ((Object) stackIn_12_0);
          }
        }
    }

    final void m(byte param0) {
        jaggl.OpenGL.glViewport(this.field_Y, this.field_Cb, this.field_db, this.field_i);
        int var2 = 105 / ((param0 - -40) / 57);
    }

    final void p(byte param0) {
        if (param0 <= 84) {
            return;
        }
        this.I((byte) 92);
    }

    final void i(byte param0) {
        int var2 = -60 % ((-45 - param0) / 51);
    }

    jp(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, asb param4, int param5) {
        super(param1, new Long(param2), param3, param4, param5, 1);
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Throwable var8 = null;
        RuntimeException var8_ref = null;
        String[] var9 = null;
        int var10_int = 0;
        NumberFormatException var10 = null;
        int var11_int = 0;
        Throwable var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var15 = 0;
        String var16 = null;
        Exception var17 = null;
        String var20 = null;
        String var21 = null;
        int[] var26 = null;
        int[] var27 = null;
        Object var28 = null;
        Object var29 = null;
        Object var30 = null;
        CharSequence var31 = null;
        CharSequence var32 = null;
        CharSequence var33 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        this.field_yc = new ij();
        this.field_Ic = new ij();
        this.field_Uc = new ij();
        this.field_Cc = new ij();
        this.field_bd = new ij();
        this.field_Ec = new ij();
        this.field_Gc = new ij();
        this.field_Pc = new esb[16];
        this.field_Sc = new jaggl.MapBuffer();
        this.field_Vc = new jaggl.MapBuffer();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  this.field_zc = param0;
                  this.field_zc.a();
                  this.field_Bc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                  this.field_ad = jaggl.OpenGL.glGetString(7937).toLowerCase();
                  if (this.field_Bc.indexOf("microsoft") != -1) {
                    break L2;
                  } else {
                    if (0 != (this.field_Bc.indexOf("brian paul") ^ -1)) {
                      break L2;
                    } else {
                      if (0 == (this.field_Bc.indexOf("mesa") ^ -1)) {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        var9 = up.a((byte) -67, ' ', var20.replace('.', ' '));
                        if ((var9.length ^ -1) > -3) {
                          throw new RuntimeException("");
                        } else {
                          try {
                            L3: {
                              var10_int = lob.a(-102, (CharSequence) ((Object) var9[0]));
                              var11_int = lob.a(38, (CharSequence) ((Object) var9[1]));
                              this.field_Fc = var10_int * 10 + var11_int;
                              break L3;
                            }
                          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            var10 = (NumberFormatException) (Object) decompiledCaughtException;
                            throw new RuntimeException("");
                          }
                          if ((this.field_Fc ^ -1) <= -13) {
                            if (this.field_zc.a("GL_ARB_multitexture")) {
                              if (this.field_zc.a("GL_ARB_texture_env_combine")) {
                                var26 = new int[1];
                                jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                                this.field_L = var26[0];
                                if (2 <= this.field_L) {
                                  L4: {
                                    this.field_qb = 8;
                                    this.field_Hc = this.field_zc.a("GL_ARB_vertex_buffer_object");
                                    this.field_sc = this.field_zc.a("GL_ARB_multisample");
                                    this.field_Zc = this.field_zc.a("GL_ARB_texture_rectangle");
                                    this.field_vb = this.field_zc.a("GL_ARB_texture_cube_map");
                                    this.field_Xc = this.field_zc.a("GL_ARB_texture_non_power_of_two");
                                    this.field_uc = this.field_zc.a("GL_EXT_texture3D");
                                    this.field_Mc = this.field_zc.a("GL_ARB_vertex_shader");
                                    this.field_Ac = this.field_zc.a("GL_ARB_vertex_program");
                                    this.field_Qc = this.field_zc.a("GL_ARB_fragment_shader");
                                    this.field_zc.a("GL_ARB_fragment_program");
                                    this.field_Wc = new int[this.field_L];
                                    stackIn_20_0 = this;

                                    if (!jaclib.memory.Stream.a()) {
                                      stackIn_21_0 = this;
                                      stackIn_21_1 = 5121;
                                      break L4;
                                    } else {
                                      stackIn_21_0 = this;
                                      stackIn_21_1 = 33639;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    ((jp) (this)).field_Nc = stackIn_21_1;
                                    if (this.field_ad.indexOf("radeon") == -1) {
                                      break L5;
                                    } else {
                                      var11_int = 0;
                                      var12 = 0;
                                      var13 = 0;
                                      var14 = up.a((byte) -67, ' ', this.field_ad.replace('/', ' '));
                                      var15 = 0;
                                      L6: while (true) {
                                        L7: {
                                          if (var14.length <= var15) {
                                            break L7;
                                          } else {
                                            var21 = var14[var15];
                                            var16 = var21;
                                            var16 = var21;
                                            var16 = var21;
                                            try {
                                              L8: {
                                                L9: {
                                                  if (var21.length() <= 0) {
                                                    break L9;
                                                  } else {
                                                    L10: {
                                                      if (var21.charAt(0) != 120) {
                                                        break L10;
                                                      } else {
                                                        if (var21.length() < 3) {
                                                          break L10;
                                                        } else {
                                                          var31 = (CharSequence) ((Object) var21.substring(1, 3));
                                                          if (!hwa.a(var31, 10)) {
                                                            break L10;
                                                          } else {
                                                            var13 = 1;
                                                            var16 = var21.substring(1);
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var16.equals("hd")) {
                                                      var12 = 1;
                                                      break L9;
                                                    } else {
                                                      L11: {
                                                        if (!var16.startsWith("hd")) {
                                                          break L11;
                                                        } else {
                                                          var16 = var16.substring(2);
                                                          var12 = 1;
                                                          break L11;
                                                        }
                                                      }
                                                      if ((var16.length() ^ -1) > -5) {
                                                        break L9;
                                                      } else {
                                                        var32 = (CharSequence) ((Object) var16.substring(0, 4));
                                                        if (!hwa.a(var32, 10)) {
                                                          break L9;
                                                        } else {
                                                          var33 = (CharSequence) ((Object) var16.substring(0, 4));
                                                          var11_int = lob.a(63, var33);
                                                          decompiledRegionSelector0 = 1;
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                decompiledRegionSelector0 = 0;
                                                break L8;
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter1) {
                                              decompiledCaughtException = decompiledCaughtParameter1;
                                              L12: {
                                                var17 = (Exception) (Object) decompiledCaughtException;
                                                decompiledRegionSelector0 = 0;
                                                break L12;
                                              }
                                            }
                                            if (decompiledRegionSelector0 == 0) {
                                              var15++;
                                              continue L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (var13 != 0) {
                                            break L13;
                                          } else {
                                            if (var12 != 0) {
                                              break L13;
                                            } else {
                                              L14: {
                                                if (var11_int < 7000) {
                                                  break L14;
                                                } else {
                                                  if (-8000 > (var11_int ^ -1)) {
                                                    break L14;
                                                  } else {
                                                    this.field_Hc = false;
                                                    break L14;
                                                  }
                                                }
                                              }
                                              if (7000 > var11_int) {
                                                break L13;
                                              } else {
                                                if ((var11_int ^ -1) < -9251) {
                                                  break L13;
                                                } else {
                                                  this.field_uc = false;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.field_Zc = this.field_Zc & this.field_zc.a("GL_ARB_half_float_pixel");
                                        break L5;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (0 == (this.field_Bc.indexOf("intel") ^ -1)) {
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (!this.field_Hc) {
                                      break L16;
                                    } else {
                                      try {
                                        L17: {
                                          var27 = new int[1];
                                          jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                                          break L17;
                                        }
                                      } catch (java.lang.Throwable decompiledCaughtParameter2) {
                                        decompiledCaughtException = decompiledCaughtParameter2;
                                        var11 = decompiledCaughtException;
                                        throw new RuntimeException("");
                                      }
                                      break L16;
                                    }
                                  }
                                  break L1;
                                } else {
                                  throw new RuntimeException("");
                                }
                              } else {
                                throw new RuntimeException("");
                              }
                            } else {
                              throw new RuntimeException("");
                            }
                          } else {
                            throw new RuntimeException("");
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var8 = decompiledCaughtException;
              var8.printStackTrace();
              this.a((byte) 30);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L18: {
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var8_ref);

            stackIn_61_1 = new StringBuilder().append("jp.<init>(");

            if (param0 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L18;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_64_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');

            if (param1 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L19;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L20;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');

            if (param4 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L21;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L21;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_62_0), stackIn_71_2 + ',' + param5 + ')');
        }
    }

    final int[] na(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = new int[param3 * param2];
        int[] var5 = var8;
        for (var6 = 0; param3 > var6; var6++) {
            jaggl.OpenGL.glReadPixelsi(param0, -1 + (-param1 + (this.field_i - var6)), param2, 1, 32993, this.field_Nc, var8, param2 * var6);
        }
        return var8;
    }

    final void A(byte param0) {
        int var2 = -28 % ((param0 - -6) / 45);
        jaggl.OpenGL.glScissor(this.field_H + this.field_Y, this.field_i + (this.field_Cb - this.field_Bb), this.field_F + -this.field_H, -this.field_xc + this.field_Bb);
    }

    final void t(int param0) {
        jaggl.OpenGL.glActiveTexture(33984 + this.field_ab);
        if (param0 != 12) {
            this.e(false);
        }
    }

    final synchronized void a(int param0, byte param1) {
        ksa var3 = new ksa();
        var3.field_b = (long)param0;
        if (param1 <= 94) {
            return;
        }
        this.field_Ec.b(-10258, var3);
    }

    final void m(int param0) {
        if (param0 != 3) {
            return;
        }
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_wc, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_cb, 0);
    }

    final void j(int param0) {
        this.field_r = (float)(-this.field_Qb + this.field_Wb);
        this.field_p = (float)(-this.field_j) + this.field_r;
        if (this.field_p < (float)this.field_h) {
            this.field_p = (float)this.field_h;
        }
        jaggl.OpenGL.glFogf(2915, this.field_p);
        jaggl.OpenGL.glFogf(2916, this.field_r);
        lva.field_o[0] = (float)dla.a(this.field_lc, 16711680) / 16711680.0f;
        lva.field_o[1] = (float)dla.a(this.field_lc, 65280) / 65280.0f;
        if (param0 != 8) {
            this.field_Cc = (ij) null;
        }
        lva.field_o[2] = (float)dla.a(255, this.field_lc) / 255.0f;
        jaggl.OpenGL.glFogfv(2918, lva.field_o, 0);
    }

    final void u() {
    }

    final eb a(int param0, int param1, int param2, kb param3, mj param4) {
        RuntimeException var6 = null;
        eb stackIn_2_0 = null;
        ubb stackIn_9_0 = null;
        gn stackIn_11_0 = null;
        ubb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 115) {
              L1: {
                if (this.field_Xc) {
                  break L1;
                } else {
                  L2: {
                    if (!bd.a(param1, (byte) -95)) {
                      break L2;
                    } else {
                      if (bd.a(param2, (byte) -95)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_Zc) {
                    stackIn_11_0 = new gn((jp) (this), param3, param4, param1, param2);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_9_0 = new ubb((jp) (this), param3, param4, hj.a(param1, (byte) -102), hj.a(param2, (byte) -127));
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_13_0 = new ubb((jp) (this), param3, param4, param1, param2);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_2_0 = (eb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("jp.CD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (eb) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (eb) ((Object) stackIn_11_0);
            } else {
              return (eb) ((Object) stackIn_13_0);
            }
          }
        }
    }

    final void j() {
    }

    final void o(int param0) {
        if (param0 > -64) {
            return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, tc.a(8448, this.field_z[this.field_ab]));
    }

    final void d(int param0, int param1) {
        int var3 = 5 % ((36 - param0) / 33);
    }

    final boolean a(mj param0, kb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 112 % ((-32 - param2) / 50);
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("jp.QC(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void r(int param0) {
        int var2 = this.field_Wc[this.field_ab];
        if (param0 != 3) {
            this.field_Mc = false;
        }
        if (!(var2 == 0)) {
            this.field_Wc[this.field_ab] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
    }

    final void a(int param0, int param1) throws jkb {
        this.field_zc.swapBuffers();
    }

    final void a(int param0, vmb param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_1 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        boolean stackIn_54_0 = false;
        boolean stackIn_55_0 = false;
        int stackIn_55_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qma var9_ref_qma = null;
        esb var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        int var15 = 0;
        pb var16 = null;
        int var17 = 0;
        qma[] var18 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var18 = ((bva) ((Object) param1)).field_f;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var18.length <= var8) {
                L2: {
                  if (var7 != 0) {
                    stackIn_25_0 = 0;
                    break L2;
                  } else {
                    stackIn_25_0 = 1;
                    break L2;
                  }
                }
                L3: {


                  if (this.field_Lc) {

                    stackIn_28_1 = 0;
                    break L3;
                  } else {

                    stackIn_28_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  if (stackIn_25_0 != stackIn_28_1) {
                    L5: {
                      if (var7 == 0) {
                        jaggl.OpenGL.glDisableClientState(32884);
                        break L5;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32884);
                        break L5;
                      }
                    }
                    L6: {
                      stackIn_35_0 = this;

                      if (var7 == 0) {
                        stackIn_36_0 = this;
                        stackIn_36_1 = 0;
                        break L6;
                      } else {
                        stackIn_36_0 = this;
                        stackIn_36_1 = 1;
                        break L6;
                      }
                    }
                    ((jp) (this)).field_Lc = stackIn_36_1 != 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var6 != 0) {
                    stackIn_40_0 = 0;
                    break L7;
                  } else {
                    stackIn_40_0 = 1;
                    break L7;
                  }
                }
                L8: {


                  if (this.field_Yc) {

                    stackIn_43_1 = 0;
                    break L8;
                  } else {

                    stackIn_43_1 = 1;
                    break L8;
                  }
                }
                L9: {
                  if (stackIn_40_0 != stackIn_43_1) {
                    L10: {
                      if (var6 == 0) {
                        jaggl.OpenGL.glDisableClientState(32885);
                        break L10;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32885);
                        break L10;
                      }
                    }
                    L11: {
                      stackIn_50_0 = this;

                      if (var6 == 0) {
                        stackIn_51_0 = this;
                        stackIn_51_1 = 0;
                        break L11;
                      } else {
                        stackIn_51_0 = this;
                        stackIn_51_1 = 1;
                        break L11;
                      }
                    }
                    ((jp) (this)).field_Yc = stackIn_51_1 != 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L12: {
                  stackIn_54_0 = this.field_Kc;

                  if (var5 != 0) {
                    stackIn_55_0 = stackIn_54_0;
                    stackIn_55_1 = 0;
                    break L12;
                  } else {
                    stackIn_55_0 = stackIn_54_0;
                    stackIn_55_1 = 1;
                    break L12;
                  }
                }
                L13: {
                  if ((stackIn_55_0 ? 1 : 0) == stackIn_55_1) {
                    L14: {
                      if (var5 != 0) {
                        jaggl.OpenGL.glEnableClientState(32886);
                        break L14;
                      } else {
                        jaggl.OpenGL.glDisableClientState(32886);
                        break L14;
                      }
                    }
                    L15: {
                      stackIn_62_0 = this;

                      if (var5 == 0) {
                        stackIn_63_0 = this;
                        stackIn_63_1 = 0;
                        break L15;
                      } else {
                        stackIn_63_0 = this;
                        stackIn_63_1 = 1;
                        break L15;
                      }
                    }
                    ((jp) (this)).field_Kc = stackIn_63_1 != 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  var8 = -72 % ((55 - param0) / 44);
                  if (var4 > this.field_Rc) {
                    var9 = this.field_Rc;
                    L17: while (true) {
                      if (var9 >= var4) {
                        this.field_Rc = var4;
                        break L16;
                      } else {
                        jaggl.OpenGL.glClientActiveTexture(33984 + var9);
                        jaggl.OpenGL.glEnableClientState(32888);
                        var9++;
                        continue L17;
                      }
                    }
                  } else {
                    if (var4 < this.field_Rc) {
                      var9 = var4;
                      L18: while (true) {
                        if (var9 >= this.field_Rc) {
                          this.field_Rc = var4;
                          break L16;
                        } else {
                          jaggl.OpenGL.glClientActiveTexture(33984 - -var9);
                          jaggl.OpenGL.glDisableClientState(32888);
                          var9++;
                          continue L18;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                break L0;
              } else {
                var9_ref_qma = var18[var8];
                var10 = this.field_Pc[var8];
                var11 = 0;
                var12 = var10.b((byte) 125);
                var13 = var10.c(2);
                var10.a((byte) 54);
                var15 = 0;
                L19: while (true) {
                  if (var9_ref_qma.a(86) <= var15) {
                    var8++;
                    continue L1;
                  } else {
                    L20: {
                      var16 = var9_ref_qma.b(var15, 71);
                      if (pb.field_k == var16) {
                        jaggl.OpenGL.glVertexPointer(3, 5126, var12, (long)var11 + var13);
                        var7 = 1;
                        break L20;
                      } else {
                        if (var16 != pb.field_g) {
                          if (pb.field_d != var16) {
                            if (var16 != pb.field_e) {
                              if (var16 == pb.field_l) {
                                incrementValue$0 = var4;
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(incrementValue$0 + 33984);
                                jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                                break L20;
                              } else {
                                if (pb.field_h == var16) {
                                  incrementValue$1 = var4;
                                  var4++;
                                  jaggl.OpenGL.glClientActiveTexture(33984 - -incrementValue$1);
                                  jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 - -(long)var11);
                                  break L20;
                                } else {
                                  if (var16 == pb.field_b) {
                                    incrementValue$2 = var4;
                                    var4++;
                                    jaggl.OpenGL.glClientActiveTexture(33984 - -incrementValue$2);
                                    jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -(long)var11);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            } else {
                              incrementValue$3 = var4;
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(incrementValue$3 + 33984);
                              jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, (long)var11 + var13);
                              break L20;
                            }
                          } else {
                            jaggl.OpenGL.glColorPointer(4, 5121, var12, var13 - -(long)var11);
                            var5 = 1;
                            break L20;
                          }
                        } else {
                          var6 = 1;
                          jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                          break L20;
                        }
                      }
                    }
                    var11 = var11 + var16.field_i;
                    var15++;
                    continue L19;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var3);

            stackIn_78_1 = new StringBuilder().append("jp.BE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L21;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L21;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
    }

    final void s(byte param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (param0 == -39) {
          L0: {
            if (to.field_o != this.field_fc) {
              if (this.field_fc == oj.field_b) {
                jaggl.OpenGL.glBlendFunc(1, 1);
                break L0;
              } else {
                if (ub.field_e == this.field_fc) {
                  jaggl.OpenGL.glBlendFunc(774, 1);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              jaggl.OpenGL.glBlendFunc(770, 771);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        field_Oc = 4;
    }
}
