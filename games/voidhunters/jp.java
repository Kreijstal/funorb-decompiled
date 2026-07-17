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
                ((jp) this).field_Bc = null;
            }
            ((jp) this).field_Pc[param2] = (esb) (Object) param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jp.VC(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(byte param0, uja param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 == -111) {
              L1: {
                if (meb.field_d != param1) {
                  int discarded$2 = 9216;
                  var3_int = gm.a(param1);
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("jp.UC(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void a(jra param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("jp.DE(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void j(byte param0) {
        if (param0 != -56) {
            ((jp) this).field_Lc = false;
        }
        if (!((jp) this).field_zb) {
            jaggl.OpenGL.glDisable(3042);
        } else {
            jaggl.OpenGL.glEnable(3042);
        }
    }

    final void o(byte param0) {
        if (param0 != 81) {
            ((jp) this).ya();
        }
        if (((jp) this).field_ac) {
            jaggl.OpenGL.glEnable(3089);
        } else {
            jaggl.OpenGL.glDisable(3089);
        }
    }

    final vca a(byte param0, boolean param1) {
        if (param0 != -19) {
            return null;
        }
        return (vca) (Object) new mq((jp) this, mj.field_e, param1);
    }

    final boolean b() {
        return false;
    }

    final synchronized void b(int param0, int param1, boolean param2) {
        if (param2) {
            Object var5 = null;
            ((jp) this).a((aja) null, true);
        }
        hua var4 = new hua(param1);
        var4.field_b = (long)param0;
        ((jp) this).field_Ic.b(-10258, (ksa) (Object) var4);
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
            jaggl.OpenGL.glDisable(32925);
        } else {
            jaggl.OpenGL.glEnable(32925);
        }
        if (param0 >= -14) {
            ((jp) this).j((byte) -120);
        }
    }

    final void ya() {
        ((jp) this).b((byte) -74, true);
        jaggl.OpenGL.glClear(256);
    }

    final void o() {
        super.o();
        if (!(((jp) this).field_zc == null)) {
            boolean discarded$0 = ((jp) this).field_zc.b();
            ((jp) this).field_zc.release();
            ((jp) this).field_zc = null;
        }
    }

    final vmb a(int param0, qma[] param1) {
        RuntimeException var3 = null;
        bva stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bva stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                ((jp) this).field_Yc = true;
                break L1;
              }
            }
            stackOut_2_0 = new bva(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jp.NC(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (vmb) (Object) stackIn_3_0;
    }

    final void e(boolean param0) {
        if (param0) {
            ((jp) this).field_Cc = null;
        }
        if (((jp) this).field_g) {
            jaggl.OpenGL.glEnable(16384);
            jaggl.OpenGL.glEnable(16385);
        } else {
            jaggl.OpenGL.glDisable(16384);
            jaggl.OpenGL.glDisable(16385);
        }
    }

    final void F(int param0) {
        if (param0 != 12614) {
            ((jp) this).y(-43);
        }
        if (((jp) this).field_nc) {
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

    public static void K() {
        field_Jc = null;
    }

    final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = VoidHunters.field_G;
        var2 = -1 + ((jp) this).field_L;
        L0: while (true) {
          if (var2 < 0) {
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
            var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                L2: {
                  if (param0 >= 106) {
                    break L2;
                  } else {
                    ((jp) this).field_Gc = null;
                    break L2;
                  }
                }
                jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                jaggl.OpenGL.glFogi(2917, 9729);
                jaggl.OpenGL.glHint(3156, 4353);
                ((jp) this).field_zc.setSwapInterval(0);
                super.n(117);
                return;
              } else {
                var4 = var3 + 16384;
                jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                var3++;
                continue L1;
              }
            }
          } else {
            jaggl.OpenGL.glActiveTexture(var2 + 33984);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
            jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
            var2--;
            continue L0;
          }
        }
    }

    final hdb a(boolean param0, int param1, int[][] param2, int param3) {
        RuntimeException var5 = null;
        qva stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qva stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -5210) {
                break L1;
              } else {
                ((jp) this).u();
                break L1;
              }
            }
            stackOut_2_0 = new qva((jp) this, param3, param0, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("jp.TC(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
        return (hdb) (Object) stackIn_3_0;
    }

    final void B(int param0) {
        L0: {
          L1: {
            if (!((jp) this).field_Xb) {
              break L1;
            } else {
              if (((jp) this).field_Hb) {
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
            ((jp) this).field_bd = null;
            break L2;
          }
        }
    }

    final eb a(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        ubb var9 = null;
        Object stackIn_2_0 = null;
        gn stackIn_9_0 = null;
        ubb stackIn_11_0 = null;
        ubb stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ubb stackOut_10_0 = null;
        gn stackOut_8_0 = null;
        ubb stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param5) {
              L1: {
                if (((jp) this).field_Xc) {
                  break L1;
                } else {
                  L2: {
                    int discarded$8 = -95;
                    if (!bd.a(param0)) {
                      break L2;
                    } else {
                      int discarded$9 = -95;
                      if (bd.a(param3)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!((jp) this).field_Zc) {
                    var9 = new ubb((jp) this, qua.field_d, mj.field_f, hj.a(param0, (byte) -100), hj.a(param3, (byte) -121));
                    var9.a(0, param3, param0, param6, param4, param2, 0, (byte) -104);
                    stackOut_10_0 = (ubb) var9;
                    stackIn_11_0 = stackOut_10_0;
                    return (eb) (Object) stackIn_11_0;
                  } else {
                    stackOut_8_0 = new gn((jp) this, param0, param3, param2, param6, param4);
                    stackIn_9_0 = stackOut_8_0;
                    return (eb) (Object) stackIn_9_0;
                  }
                }
              }
              stackOut_12_0 = new ubb((jp) this, param0, param3, param1, param2, param6, param4);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (eb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("jp.ED(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return (eb) (Object) stackIn_13_0;
    }

    private final void I(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (!((jp) this).field_Dc) {
            break L0;
          } else {
            jaggl.OpenGL.glPopMatrix();
            break L0;
          }
        }
        L1: {
          var2 = -41 % ((param0 - 24) / 42);
          if (!((jp) this).field_pb.a(-12178)) {
            if (((jp) this).field_ec) {
              jaggl.OpenGL.glLoadIdentity();
              ((jp) this).field_Dc = false;
              break L1;
            } else {
              jaggl.OpenGL.glLoadMatrixf(((jp) this).field_O.b(msa.field_q, (byte) 114), 0);
              ((jp) this).field_Dc = false;
              break L1;
            }
          } else {
            L2: {
              if (((jp) this).field_cd) {
                break L2;
              } else {
                jaggl.OpenGL.glLoadMatrixf(((jp) this).field_gb.b(msa.field_q, (byte) 114), 0);
                ((jp) this).field_cd = true;
                ((jp) this).m(3);
                ((jp) this).f(73);
                break L2;
              }
            }
            if (!((jp) this).field_ec) {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glMultMatrixf(((jp) this).field_O.b(msa.field_q, (byte) 114), 0);
              ((jp) this).field_Dc = true;
              break L1;
            } else {
              ((jp) this).field_Dc = false;
              break L1;
            }
          }
        }
    }

    final void a(hf param0) {
    }

    final void h(boolean param0) {
        lva.field_o[2] = ((jp) this).field_Rb * ((jp) this).field_x;
        lva.field_o[1] = ((jp) this).field_Rb * ((jp) this).field_u;
        lva.field_o[0] = ((jp) this).field_Rb * ((jp) this).field_Sb;
        if (!param0) {
            field_Oc = -95;
        }
        lva.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightModelfv(2899, lva.field_o, 0);
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param1 <= 89) {
            ((jp) this).field_Gc = null;
        }
        hua var4 = new hua(param2);
        var4.field_b = (long)param0;
        ((jp) this).field_Uc.b(-10258, (ksa) (Object) var4);
    }

    final hf a(ekb param0, wib param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("jp.OB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return (hf) (Object) stackIn_1_0;
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            ((jp) this).h((byte) 101);
            ((jp) this).a((ura) null, -111);
            ((jp) this).c(71, 0);
            ((jp) this).c(true);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((jp) this).field_Nc, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jp.SA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
    }

    final mkb a(boolean param0, int param1) {
        if (param1 != 3) {
            return null;
        }
        return (mkb) (Object) new esb((jp) this, param0);
    }

    final void I(int param0) {
        if (!((jp) this).field_eb) {
            jaggl.OpenGL.glDisable(3008);
        } else {
            jaggl.OpenGL.glEnable(3008);
        }
        if (param0 != 17634) {
            ((jp) this).o();
        }
    }

    final uda a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var3 = -123 / ((-34 - param0) / 63);
        var4 = param1;
        if (3 != var4) {
          if (var4 != 4) {
            if (var4 != 8) {
              return super.a((byte) 54, param1);
            } else {
              return (uda) (Object) new fib((jp) this, ((jp) this).field_Ab, ((jp) this).field_Mb);
            }
          } else {
            return (uda) (Object) new vsb((jp) this, ((jp) this).field_Ab, ((jp) this).field_Mb);
          }
        } else {
          return (uda) (Object) new bma((jp) this, ((jp) this).field_Ab);
        }
    }

    final void a(boolean param0, int param1, boolean param2, slb param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              int discarded$19 = 0;
              jaggl.OpenGL.glTexEnvi(8960, param4 + 34176, qg.a(param3));
              if (param1 == -21115) {
                break L1;
              } else {
                ((jp) this).j(71);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                L3: {
                  stackOut_7_0 = 8960;
                  stackOut_7_1 = 34192 - -param4;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (param2) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 769;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L3;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 768;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L3;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_10_0, stackIn_10_1, stackIn_10_2);
                break L2;
              } else {
                L4: {
                  stackOut_3_0 = 8960;
                  stackOut_3_1 = 34192 + param4;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (!param2) {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 770;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L4;
                  } else {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 771;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
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
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("jp.MA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    final void y(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -41) {
            break L0;
          } else {
            ((jp) this).field_Cc = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((jp) this).field_M) {
              break L2;
            } else {
              if (!((jp) this).field_X) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        jaggl.OpenGL.glDepthMask(stackIn_6_0 != 0);
    }

    final void a(boolean param0, byte param1, slb param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              int discarded$16 = 0;
              jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, qg.a(param2));
              stackOut_0_0 = 8960;
              stackOut_0_1 = param3 + 34200;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param0) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 771;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 770;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              jaggl.OpenGL.glTexEnvi(stackIn_3_0, stackIn_3_1, stackIn_3_2);
              if (param1 == 94) {
                break L2;
              } else {
                var6 = null;
                ((jp) this).a(-51, (vmb) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jp.WC(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final boolean a(int param0, kb param1, mj param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = 43 % ((-77 - param0) / 49);
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("jp.HD(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final void w(int param0) {
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            ((jp) this).a(0.3592780530452728f, 1.5894063711166382f, 0.25299444794654846f);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((jp) this).field_cc) {
              break L2;
            } else {
              if (!((jp) this).field_ub) {
                break L2;
              } else {
                if (((jp) this).field_j < 0) {
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
            ((jp) this).field_Yc = false;
        }
        return 0.0f;
    }

    final void G(byte param0) {
        lva.field_o[2] = ((jp) this).field_x * ((jp) this).field_oc;
        lva.field_o[1] = ((jp) this).field_oc * ((jp) this).field_u;
        lva.field_o[0] = ((jp) this).field_Sb * ((jp) this).field_oc;
        lva.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16384, 4609, lva.field_o, 0);
        lva.field_o[1] = ((jp) this).field_u * -((jp) this).field_tc;
        if (param0 <= 4) {
            return;
        }
        lva.field_o[2] = -((jp) this).field_tc * ((jp) this).field_x;
        lva.field_o[3] = 1.0f;
        lva.field_o[0] = ((jp) this).field_Sb * -((jp) this).field_tc;
        jaggl.OpenGL.glLightfv(16385, 4609, lva.field_o, 0);
    }

    final void G(int param0) {
        ((jp) this).field_cd = false;
        this.I((byte) -105);
        if (param0 != 17891) {
            ((jp) this).j();
        }
    }

    final void y(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        if (param0 >= -17) {
            ((jp) this).s((byte) -2);
        }
        jaggl.OpenGL.glLoadMatrixf(((jp) this).field_Fb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final static float[] a(float[] param0, int param1) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new float[param1];
            var3 = var4;
            cua.a(param0, 0, var4, 0, param1);
            stackOut_0_0 = (float[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("jp.QD(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 7353 + 41);
        }
        return stackIn_1_0;
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        int var4 = 0;
        hua var5 = null;
        hua var6 = null;
        hua var7 = null;
        hua var8 = null;
        hua var9 = null;
        ksa var10 = null;
        ksa var11 = null;
        hua var12 = null;
        var4 = VoidHunters.field_G;
        var2 = 0;
        param0 = param0 & 2147483647;
        L0: while (true) {
          if (((jp) this).field_Ic.b(112)) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, tgb.field_c, 0);
                var2 = 0;
                break L1;
              }
            }
            L2: while (true) {
              if (((jp) this).field_Uc.b(120)) {
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
                  if (((jp) this).field_Cc.b(112)) {
                    L5: {
                      if (var2 <= 0) {
                        break L5;
                      } else {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, tgb.field_c, 0);
                        var2 = 0;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      if (((jp) this).field_bd.b(123)) {
                        L7: {
                          if (var2 <= 0) {
                            break L7;
                          } else {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, tgb.field_c, 0);
                            var2 = 0;
                            break L7;
                          }
                        }
                        L8: while (true) {
                          if (((jp) this).field_yc.b(-94)) {
                            L9: while (true) {
                              if (((jp) this).field_Ec.b(-96)) {
                                L10: while (true) {
                                  if (((jp) this).field_Gc.b(127)) {
                                    L11: while (true) {
                                      if (((jp) this).field_yc.b(-126)) {
                                        L12: {
                                          if (100663296 >= ((jp) this).g(3554)) {
                                            break L12;
                                          } else {
                                            if (~(((jp) this).field_Tc - -60000L) <= ~wt.a(false)) {
                                              break L12;
                                            } else {
                                              System.gc();
                                              ((jp) this).field_Tc = wt.a(false);
                                              break L12;
                                            }
                                          }
                                        }
                                        super.c(param0);
                                        return;
                                      } else {
                                        var12 = (hua) (Object) ((jp) this).field_yc.a(true);
                                        jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_d);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = ((jp) this).field_Gc.a(true);
                                    jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = ((jp) this).field_Ec.a(true);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (hua) (Object) ((jp) this).field_yc.a(true);
                            jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_d);
                            continue L8;
                          }
                        }
                      } else {
                        var8 = (hua) (Object) ((jp) this).field_bd.a(true);
                        int incrementValue$4 = var2;
                        var2++;
                        tgb.field_c[incrementValue$4] = (int)var8.field_b;
                        ((jp) this).field_mb = ((jp) this).field_mb - var8.field_d;
                        if (var2 == 1000) {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, tgb.field_c, 0);
                          var2 = 0;
                          continue L6;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var7 = (hua) (Object) ((jp) this).field_Cc.a(true);
                    int incrementValue$5 = var2;
                    var2++;
                    tgb.field_c[incrementValue$5] = var7.field_d;
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
                var6 = (hua) (Object) ((jp) this).field_Uc.a(true);
                int incrementValue$6 = var2;
                var2++;
                tgb.field_c[incrementValue$6] = (int)var6.field_b;
                ((jp) this).field_Nb = ((jp) this).field_Nb - var6.field_d;
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
            var5 = (hua) (Object) ((jp) this).field_Ic.a(true);
            int incrementValue$7 = var2;
            var2++;
            tgb.field_c[incrementValue$7] = (int)var5.field_b;
            ((jp) this).field_ob = ((jp) this).field_ob - var5.field_d;
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
        Object stackIn_2_0 = null;
        rab stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        rab stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param5 == -16539) {
              stackOut_3_0 = new rab((jp) this, param3, param4, param0, param1, param2);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (gf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("jp.BC(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 44 + param5 + 41);
        }
        return (gf) (Object) stackIn_4_0;
    }

    final eb a(kb param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        Object var10 = null;
        ubb var11 = null;
        ubb stackIn_7_0 = null;
        ubb stackIn_10_0 = null;
        gn stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        gn stackOut_11_0 = null;
        ubb stackOut_9_0 = null;
        ubb stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param6) {
                break L1;
              } else {
                var10 = null;
                ((jp) this).a((byte) -46, (uja) null);
                break L1;
              }
            }
            L2: {
              if (((jp) this).field_Xc) {
                break L2;
              } else {
                L3: {
                  int discarded$6 = -95;
                  if (!bd.a(param7)) {
                    break L3;
                  } else {
                    int discarded$7 = -95;
                    if (!bd.a(param4)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((jp) this).field_Zc) {
                  stackOut_11_0 = new gn((jp) this, param0, param7, param4, param1, param3, param5);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var11 = new ubb((jp) this, param0, mj.field_d, hj.a(param7, (byte) -125), hj.a(param4, (byte) -101));
                  var11.a(param4, param0, (byte) -51, param5, param1, 0, 0, param7, param3);
                  stackOut_9_0 = (ubb) var11;
                  stackIn_10_0 = stackOut_9_0;
                  return (eb) (Object) stackIn_10_0;
                }
              }
            }
            stackOut_6_0 = new ubb((jp) this, param0, param7, param4, param2, param1, param3, param5);
            stackIn_7_0 = stackOut_6_0;
            return (eb) (Object) stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("jp.VD(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return (eb) (Object) stackIn_12_0;
    }

    final wib b(int param0, int param1) {
        return null;
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        Long var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4 = (Long) param1;
              ((jp) this).field_zc.releaseSurface(param0, var4.longValue());
              if (param2 == 0) {
                break L1;
              } else {
                ((jp) this).e(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4_ref;
            stackOut_3_1 = new StringBuilder().append("jp.LC(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    final void f(int param0) {
        int var2 = 0;
        fsb var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        ((jp) this).c(true);
        var2 = 0;
        if (param0 > 66) {
          L0: while (true) {
            if (((jp) this).field_Kb <= var2) {
              L1: while (true) {
                if (((jp) this).field_bb <= var2) {
                  super.f(75);
                  return;
                } else {
                  jaggl.OpenGL.glDisable(var2 + 16386);
                  var2++;
                  continue L1;
                }
              }
            } else {
              var3 = ((jp) this).field_Lb[var2];
              var4 = var3.a(-118);
              var5 = 16386 - -var2;
              var6 = var3.d(-392138175) / 255.0f;
              lva.field_o[0] = (float)var3.c((byte) -79);
              lva.field_o[1] = (float)var3.a(true);
              lva.field_o[2] = (float)var3.d((byte) 62);
              lva.field_o[3] = 1.0f;
              jaggl.OpenGL.glLightfv(var5, 4611, lva.field_o, 0);
              lva.field_o[0] = (float)dla.a(255, var4 >> 16) * var6;
              lva.field_o[2] = (float)dla.a(255, var4) * var6;
              lva.field_o[1] = var6 * (float)(dla.a(var4, 65382) >> 8);
              lva.field_o[3] = 1.0f;
              jaggl.OpenGL.glLightfv(var5, 4609, lva.field_o, 0);
              jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.c(16777215) * var3.c(16777215)));
              jaggl.OpenGL.glEnable(var5);
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void a(long param0, int param1) {
        ksa var4 = new ksa();
        var4.field_b = param0;
        if (param1 != 0) {
            return;
        }
        ((jp) this).field_Gc.b(-10258, var4);
    }

    final Object a(byte param0, java.awt.Canvas param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Long stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Long stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3_long = ((jp) this).field_zc.prepareSurface(param1);
            if (param0 <= -21) {
              if (-1L == var3_long) {
                throw new RuntimeException();
              } else {
                stackOut_6_0 = new Long(var3_long);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("jp.MD(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return (Object) (Object) stackIn_7_0;
    }

    final void C(int param0) {
        if (param0 != 0) {
            return;
        }
        jaggl.OpenGL.glMatrixMode(5890);
        if (fsa.field_o == ((jp) this).field_A[((jp) this).field_ab]) {
            jaggl.OpenGL.glLoadIdentity();
        } else {
            jaggl.OpenGL.glLoadMatrixf(((jp) this).field_Eb[((jp) this).field_ab].b(msa.field_q, (byte) 114), 0);
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void v(byte param0) {
        lva.field_o[3] = (float)(((jp) this).field_jb >>> 24) / 255.0f;
        lva.field_o[2] = (float)dla.a(255, ((jp) this).field_jb) / 255.0f;
        lva.field_o[1] = (float)dla.a(65280, ((jp) this).field_jb) / 65280.0f;
        if (param0 != -109) {
            Object var3 = null;
            ((jp) this).a((byte) -64, (uja) null);
        }
        lva.field_o[0] = (float)dla.a(((jp) this).field_jb, 16711680) / 16711680.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, lva.field_o, 0);
    }

    final void l(byte param0) {
        if (param0 < 109) {
            return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, tc.a(8448, ((jp) this).field_U[((jp) this).field_ab]));
    }

    final void a(float param0, float param1, float param2) {
    }

    final void v() {
        if (0 >= ((jp) this).field_db) {
            if (!(0 < ((jp) this).field_i)) {
                return;
            }
        }
        int var1 = ((jp) this).field_H;
        int var2 = ((jp) this).field_F;
        int var3 = ((jp) this).field_xc;
        int var4 = ((jp) this).field_Bb;
        ((jp) this).v(-107);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((jp) this).w((byte) -101);
        ((jp) this).d(false, -30305);
        ((jp) this).c((byte) -73, false);
        ((jp) this).b(false, -1700);
        ((jp) this).b((byte) -74, false);
        ((jp) this).a((ura) null, -116);
        ((jp) this).a(false, (byte) -124, false, -2);
        ((jp) this).h(45, 1);
        ((jp) this).c(84, 0);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, ((jp) this).field_db, ((jp) this).field_i, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((jp) this).KA(var1, var3, var2, var4);
    }

    final eb a(int param0, byte[] param1, kb param2, int param3, int param4, int param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        ubb var10 = null;
        ubb stackIn_7_0 = null;
        gn stackIn_10_0 = null;
        ubb stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ubb stackOut_11_0 = null;
        gn stackOut_9_0 = null;
        ubb stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param7 == 11) {
                break L1;
              } else {
                hdb discarded$3 = ((jp) this).a(true, 116, (int[][]) null, -28);
                break L1;
              }
            }
            L2: {
              if (((jp) this).field_Xc) {
                break L2;
              } else {
                L3: {
                  int discarded$4 = -95;
                  if (!bd.a(param4)) {
                    break L3;
                  } else {
                    int discarded$5 = -95;
                    if (!bd.a(param5)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!((jp) this).field_Zc) {
                  var10 = new ubb((jp) this, param2, mj.field_f, hj.a(param4, (byte) -107), hj.a(param5, (byte) -127));
                  var10.a(param3, param1, param5, param4, param0, 0, 3314, 0, param2);
                  stackOut_11_0 = (ubb) var10;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = new gn((jp) this, param2, param4, param5, param1, param0, param3);
                  stackIn_10_0 = stackOut_9_0;
                  return (eb) (Object) stackIn_10_0;
                }
              }
            }
            stackOut_6_0 = new ubb((jp) this, param2, param4, param5, param6, param1, param0, param3);
            stackIn_7_0 = stackOut_6_0;
            return (eb) (Object) stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("jp.LD(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return (eb) (Object) stackIn_12_0;
    }

    final void m(byte param0) {
        jaggl.OpenGL.glViewport(((jp) this).field_Y, ((jp) this).field_Cb, ((jp) this).field_db, ((jp) this).field_i);
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
        super(param1, (Object) (Object) new Long(param2), param3, param4, param5, 1);
        String var21_ref = null;
        Throwable var8 = null;
        RuntimeException var8_ref = null;
        String[] var9 = null;
        NumberFormatException var10 = null;
        int var10_int = 0;
        Throwable var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        Object[] var14 = null;
        String[] var14_array = null;
        int var15 = 0;
        Object var16 = null;
        String var16_ref = null;
        Exception var17 = null;
        String var20 = null;
        Object var21 = null;
        int[] var26 = null;
        int[] var27 = null;
        Object var28 = null;
        Object var29 = null;
        Object var30 = null;
        CharSequence var31 = null;
        CharSequence var32 = null;
        CharSequence var33 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var21_ref = null;
        var28 = null;
        var29 = null;
        var30 = null;
        ((jp) this).field_yc = new ij();
        ((jp) this).field_Ic = new ij();
        ((jp) this).field_Uc = new ij();
        ((jp) this).field_Cc = new ij();
        ((jp) this).field_bd = new ij();
        ((jp) this).field_Ec = new ij();
        ((jp) this).field_Gc = new ij();
        ((jp) this).field_Pc = new esb[16];
        ((jp) this).field_Sc = new jaggl.MapBuffer();
        ((jp) this).field_Vc = new jaggl.MapBuffer();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  ((jp) this).field_zc = param0;
                  boolean discarded$2 = ((jp) this).field_zc.a();
                  ((jp) this).field_Bc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                  ((jp) this).field_ad = jaggl.OpenGL.glGetString(7937).toLowerCase();
                  if (((jp) this).field_Bc.indexOf("microsoft") != -1) {
                    break L2;
                  } else {
                    if (0 != ((jp) this).field_Bc.indexOf("brian paul")) {
                      break L2;
                    } else {
                      if (0 == ((jp) this).field_Bc.indexOf("mesa")) {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        var9 = up.a((byte) -67, ' ', var20.replace('.', ' '));
                        if (var9.length < 2) {
                          throw new RuntimeException("");
                        } else {
                          try {
                            L3: {
                              var10_int = lob.a(-102, (CharSequence) (Object) var9[0]);
                              var11_int = lob.a(38, (CharSequence) (Object) var9[1]);
                              ((jp) this).field_Fc = var10_int * 10 + var11_int;
                              break L3;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            var10 = (NumberFormatException) (Object) decompiledCaughtException;
                            throw new RuntimeException("");
                          }
                          if (((jp) this).field_Fc >= 12) {
                            if (((jp) this).field_zc.a("GL_ARB_multitexture")) {
                              if (((jp) this).field_zc.a("GL_ARB_texture_env_combine")) {
                                var26 = new int[1];
                                jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                                ((jp) this).field_L = var26[0];
                                if (2 <= ((jp) this).field_L) {
                                  L4: {
                                    ((jp) this).field_qb = 8;
                                    ((jp) this).field_Hc = ((jp) this).field_zc.a("GL_ARB_vertex_buffer_object");
                                    ((jp) this).field_sc = ((jp) this).field_zc.a("GL_ARB_multisample");
                                    ((jp) this).field_Zc = ((jp) this).field_zc.a("GL_ARB_texture_rectangle");
                                    ((jp) this).field_vb = ((jp) this).field_zc.a("GL_ARB_texture_cube_map");
                                    ((jp) this).field_Xc = ((jp) this).field_zc.a("GL_ARB_texture_non_power_of_two");
                                    ((jp) this).field_uc = ((jp) this).field_zc.a("GL_EXT_texture3D");
                                    ((jp) this).field_Mc = ((jp) this).field_zc.a("GL_ARB_vertex_shader");
                                    ((jp) this).field_Ac = ((jp) this).field_zc.a("GL_ARB_vertex_program");
                                    ((jp) this).field_Qc = ((jp) this).field_zc.a("GL_ARB_fragment_shader");
                                    boolean discarded$3 = ((jp) this).field_zc.a("GL_ARB_fragment_program");
                                    ((jp) this).field_Wc = new int[((jp) this).field_L];
                                    stackOut_18_0 = this;
                                    stackIn_20_0 = stackOut_18_0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (!jaclib.memory.Stream.a()) {
                                      stackOut_20_0 = this;
                                      stackOut_20_1 = 5121;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      break L4;
                                    } else {
                                      stackOut_19_0 = this;
                                      stackOut_19_1 = 33639;
                                      stackIn_21_0 = stackOut_19_0;
                                      stackIn_21_1 = stackOut_19_1;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    ((jp) this).field_Nc = stackIn_21_1;
                                    if (((jp) this).field_ad.indexOf("radeon") == -1) {
                                      break L5;
                                    } else {
                                      var11_int = 0;
                                      var12 = 0;
                                      var13 = 0;
                                      var14_array = up.a((byte) -67, ' ', ((jp) this).field_ad.replace('/', ' '));
                                      var15 = 0;
                                      L6: while (true) {
                                        L7: {
                                          if (var14_array.length <= var15) {
                                            break L7;
                                          } else {
                                            var21_ref = var14_array[var15];
                                            var16_ref = var21_ref;
                                            var16_ref = var21_ref;
                                            try {
                                              L8: {
                                                L9: {
                                                  if (var21_ref.length() <= 0) {
                                                    break L9;
                                                  } else {
                                                    L10: {
                                                      if (var21_ref.charAt(0) != 120) {
                                                        break L10;
                                                      } else {
                                                        if (var21_ref.length() < 3) {
                                                          break L10;
                                                        } else {
                                                          var31 = (CharSequence) (Object) var21_ref.substring(1, 3);
                                                          if (!hwa.a(var31, 10)) {
                                                            break L10;
                                                          } else {
                                                            var13 = 1;
                                                            var16_ref = var21_ref.substring(1);
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var16_ref.equals((Object) (Object) "hd")) {
                                                      var12 = 1;
                                                      break L9;
                                                    } else {
                                                      L11: {
                                                        if (!var16_ref.startsWith("hd")) {
                                                          break L11;
                                                        } else {
                                                          var16_ref = var16_ref.substring(2);
                                                          var12 = 1;
                                                          break L11;
                                                        }
                                                      }
                                                      if (var16_ref.length() < 4) {
                                                        break L9;
                                                      } else {
                                                        var32 = (CharSequence) (Object) var16_ref.substring(0, 4);
                                                        if (!hwa.a(var32, 10)) {
                                                          break L9;
                                                        } else {
                                                          var33 = (CharSequence) (Object) var16_ref.substring(0, 4);
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
                                                  if (var11_int > 7999) {
                                                    break L14;
                                                  } else {
                                                    ((jp) this).field_Hc = false;
                                                    break L14;
                                                  }
                                                }
                                              }
                                              if (7000 > var11_int) {
                                                break L13;
                                              } else {
                                                if (var11_int > 9250) {
                                                  break L13;
                                                } else {
                                                  ((jp) this).field_uc = false;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((jp) this).field_Zc = ((jp) this).field_Zc & ((jp) this).field_zc.a("GL_ARB_half_float_pixel");
                                        break L5;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (((jp) this).field_Bc.indexOf("intel") == -1) {
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (!((jp) this).field_Hc) {
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
              ((jp) this).a((byte) 30);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L18: {
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var8_ref;
            stackOut_59_1 = new StringBuilder().append("jp.<init>(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L18;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L18;
            }
          }
          L19: {
            stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L19;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L19;
            }
          }
          L20: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(44).append(param2).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param3 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param5 + 41);
        }
    }

    final int[] na(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = new int[param3 * param2];
        int[] var5 = var8;
        for (var6 = 0; param3 > var6; var6++) {
            jaggl.OpenGL.glReadPixelsi(param0, -1 + (-param1 + (((jp) this).field_i - var6)), param2, 1, 32993, ((jp) this).field_Nc, var8, param2 * var6);
        }
        return var8;
    }

    final void A(byte param0) {
        int var2 = -28 % ((param0 - -6) / 45);
        jaggl.OpenGL.glScissor(((jp) this).field_H + ((jp) this).field_Y, ((jp) this).field_i + (((jp) this).field_Cb - ((jp) this).field_Bb), ((jp) this).field_F + -((jp) this).field_H, -((jp) this).field_xc + ((jp) this).field_Bb);
    }

    final void t(int param0) {
        jaggl.OpenGL.glActiveTexture(33984 + ((jp) this).field_ab);
        if (param0 != 12) {
            ((jp) this).e(false);
        }
    }

    final synchronized void a(int param0, byte param1) {
        ksa var3 = new ksa();
        var3.field_b = (long)param0;
        if (param1 <= 94) {
            return;
        }
        ((jp) this).field_Ec.b(-10258, var3);
    }

    final void m(int param0) {
        if (param0 != 3) {
            return;
        }
        jaggl.OpenGL.glLightfv(16384, 4611, ((jp) this).field_wc, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, ((jp) this).field_cb, 0);
    }

    final void j(int param0) {
        ((jp) this).field_r = (float)(-((jp) this).field_Qb + ((jp) this).field_Wb);
        ((jp) this).field_p = (float)(-((jp) this).field_j) + ((jp) this).field_r;
        if (((jp) this).field_p < (float)((jp) this).field_h) {
            ((jp) this).field_p = (float)((jp) this).field_h;
        }
        jaggl.OpenGL.glFogf(2915, ((jp) this).field_p);
        jaggl.OpenGL.glFogf(2916, ((jp) this).field_r);
        lva.field_o[0] = (float)dla.a(((jp) this).field_lc, 16711680) / 16711680.0f;
        lva.field_o[1] = (float)dla.a(((jp) this).field_lc, 65280) / 65280.0f;
        if (param0 != 8) {
            ((jp) this).field_Cc = null;
        }
        lva.field_o[2] = (float)dla.a(255, ((jp) this).field_lc) / 255.0f;
        jaggl.OpenGL.glFogfv(2918, lva.field_o, 0);
    }

    final void u() {
    }

    final eb a(int param0, int param1, int param2, kb param3, mj param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        ubb stackIn_9_0 = null;
        gn stackIn_11_0 = null;
        ubb stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        gn stackOut_10_0 = null;
        ubb stackOut_8_0 = null;
        ubb stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param0 >= 115) {
              L1: {
                if (((jp) this).field_Xc) {
                  break L1;
                } else {
                  L2: {
                    int discarded$8 = -95;
                    if (!bd.a(param1)) {
                      break L2;
                    } else {
                      int discarded$9 = -95;
                      if (bd.a(param2)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((jp) this).field_Zc) {
                    stackOut_10_0 = new gn((jp) this, param3, param4, param1, param2);
                    stackIn_11_0 = stackOut_10_0;
                    return (eb) (Object) stackIn_11_0;
                  } else {
                    stackOut_8_0 = new ubb((jp) this, param3, param4, hj.a(param1, (byte) -102), hj.a(param2, (byte) -127));
                    stackIn_9_0 = stackOut_8_0;
                    return (eb) (Object) stackIn_9_0;
                  }
                }
              }
              stackOut_12_0 = new ubb((jp) this, param3, param4, param1, param2);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (eb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("jp.CD(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return (eb) (Object) stackIn_13_0;
    }

    final void j() {
    }

    final void o(int param0) {
        if (param0 > -64) {
            return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, tc.a(8448, ((jp) this).field_z[((jp) this).field_ab]));
    }

    final void d(int param0, int param1) {
        int var3 = 5 % ((36 - param0) / 33);
    }

    final boolean a(mj param0, kb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = 112 % ((-32 - param2) / 50);
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("jp.QC(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final void r(int param0) {
        int var2 = ((jp) this).field_Wc[((jp) this).field_ab];
        if (param0 != 3) {
            ((jp) this).field_Mc = false;
        }
        if (!(var2 == 0)) {
            ((jp) this).field_Wc[((jp) this).field_ab] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
    }

    final void a(int param0, int param1) throws jkb {
        ((jp) this).field_zc.swapBuffers();
    }

    final void a(int param0, vmb param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qma var9_ref_qma = null;
        int var9 = 0;
        esb var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        int var15 = 0;
        pb var16 = null;
        int var17 = 0;
        qma[] var18 = null;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        boolean stackIn_53_0 = false;
        boolean stackIn_54_0 = false;
        boolean stackIn_55_0 = false;
        int stackIn_55_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        boolean stackOut_52_0 = false;
        boolean stackOut_54_0 = false;
        int stackOut_54_1 = 0;
        boolean stackOut_53_0 = false;
        int stackOut_53_1 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var18 = ((bva) (Object) param1).field_f;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var18.length <= var8) {
                L2: {
                  if (var7 != 0) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L2;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L2;
                  }
                }
                L3: {
                  stackOut_25_0 = stackIn_25_0;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (((jp) this).field_Lc) {
                    stackOut_27_0 = stackIn_27_0;
                    stackOut_27_1 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    break L3;
                  } else {
                    stackOut_26_0 = stackIn_26_0;
                    stackOut_26_1 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    break L3;
                  }
                }
                L4: {
                  if (stackIn_28_0 != stackIn_28_1) {
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
                      stackOut_33_0 = this;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var7 == 0) {
                        stackOut_35_0 = this;
                        stackOut_35_1 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        break L6;
                      } else {
                        stackOut_34_0 = this;
                        stackOut_34_1 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        break L6;
                      }
                    }
                    ((jp) this).field_Lc = stackIn_36_1 != 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var6 != 0) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L7;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    break L7;
                  }
                }
                L8: {
                  stackOut_40_0 = stackIn_40_0;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_41_0 = stackOut_40_0;
                  if (((jp) this).field_Yc) {
                    stackOut_42_0 = stackIn_42_0;
                    stackOut_42_1 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    break L8;
                  } else {
                    stackOut_41_0 = stackIn_41_0;
                    stackOut_41_1 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    break L8;
                  }
                }
                L9: {
                  if (stackIn_43_0 != stackIn_43_1) {
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
                      stackOut_48_0 = this;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_49_0 = stackOut_48_0;
                      if (var6 == 0) {
                        stackOut_50_0 = this;
                        stackOut_50_1 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        break L11;
                      } else {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        break L11;
                      }
                    }
                    ((jp) this).field_Yc = stackIn_51_1 != 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L12: {
                  stackOut_52_0 = ((jp) this).field_Kc;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_53_0 = stackOut_52_0;
                  if (var5 != 0) {
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    break L12;
                  } else {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = 1;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
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
                      stackOut_60_0 = this;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_61_0 = stackOut_60_0;
                      if (var5 == 0) {
                        stackOut_62_0 = this;
                        stackOut_62_1 = 0;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        break L15;
                      } else {
                        stackOut_61_0 = this;
                        stackOut_61_1 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        break L15;
                      }
                    }
                    ((jp) this).field_Kc = stackIn_63_1 != 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  var8 = -72 % ((55 - param0) / 44);
                  if (var4 > ((jp) this).field_Rc) {
                    var9 = ((jp) this).field_Rc;
                    L17: while (true) {
                      if (var9 >= var4) {
                        ((jp) this).field_Rc = var4;
                        break L16;
                      } else {
                        jaggl.OpenGL.glClientActiveTexture(33984 + var9);
                        jaggl.OpenGL.glEnableClientState(32888);
                        var9++;
                        continue L17;
                      }
                    }
                  } else {
                    if (var4 < ((jp) this).field_Rc) {
                      var9 = var4;
                      L18: while (true) {
                        if (var9 >= ((jp) this).field_Rc) {
                          ((jp) this).field_Rc = var4;
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
                var10 = ((jp) this).field_Pc[var8];
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
                                int incrementValue$4 = var4;
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(incrementValue$4 + 33984);
                                jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                                break L20;
                              } else {
                                if (pb.field_h == var16) {
                                  int incrementValue$5 = var4;
                                  var4++;
                                  jaggl.OpenGL.glClientActiveTexture(33984 - -incrementValue$5);
                                  jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 - -(long)var11);
                                  break L20;
                                } else {
                                  if (var16 == pb.field_b) {
                                    int incrementValue$6 = var4;
                                    var4++;
                                    jaggl.OpenGL.glClientActiveTexture(33984 - -incrementValue$6);
                                    jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -(long)var11);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            } else {
                              int incrementValue$7 = var4;
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(incrementValue$7 + 33984);
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
            stackOut_76_0 = (RuntimeException) var3;
            stackOut_76_1 = new StringBuilder().append("jp.BE(").append(param0).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param1 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L21;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L21;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 41);
        }
    }

    final void s(byte param0) {
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (param0 == -39) {
          L0: {
            if (to.field_o != ((jp) this).field_fc) {
              if (((jp) this).field_fc == oj.field_b) {
                jaggl.OpenGL.glBlendFunc(1, 1);
                break L0;
              } else {
                if (ub.field_e == ((jp) this).field_fc) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Oc = 4;
    }
}
