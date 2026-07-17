/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends tfa implements gf {
    static String field_m;
    private int field_l;
    static cn field_n;
    private int field_k;

    public final float a(float param0, byte param1) {
        if (param1 != -33) {
            return -0.828248143196106f;
        }
        return param0 / (float)((hm) this).field_k;
    }

    hm(kda param0, ft param1, una param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        try {
            ((hm) this).field_k = param3;
            ((hm) this).field_l = param4;
            ((hm) this).field_j.a(true, (iva) this);
            int discarded$0 = 5126;
            jaggl.OpenGL.glTexImage2Dub(((hm) this).field_i, 0, ((hm) this).d(108), param3, param4, 0, waa.a(((hm) this).field_f, 1383), lr.a(((hm) this).field_a), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, float[] param1, int param2, int param3, int param4, int param5, int param6, ft param7, boolean param8) {
        try {
            ((hm) this).field_j.a(param8, (iva) this);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexSubImage2Df(((hm) this).field_i, 0, param0, param2, param3, param4, waa.a(param7, 1383), 5121, param1, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hm.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 41);
        }
    }

    public static void g(byte param0) {
        field_n = null;
        if (param0 != 4) {
            return;
        }
        field_m = null;
    }

    public final void b(byte param0) {
        super.b((byte) 66);
        if (param0 < 32) {
            field_m = null;
        }
    }

    public final int a(byte param0) {
        Object var3 = null;
        if (param0 >= 0) {
          var3 = null;
          ((hm) this).a(-26, (byte) -121, -51, (byte[]) null, 52, 85, (ft) null, -93, 99);
          return ((hm) this).field_l;
        } else {
          return ((hm) this).field_l;
        }
    }

    hm(kda param0, ft param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, una.field_g, param3 * param2, param4);
        RuntimeException var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            L1: {
              L2: {
                ((hm) this).field_l = param3;
                ((hm) this).field_k = param2;
                ((hm) this).field_j.a(true, (iva) this);
                jaggl.OpenGL.glPixelStorei(3317, 1);
                if (!param4) {
                  break L2;
                } else {
                  if (param7 != 0) {
                    break L2;
                  } else {
                    if (0 == param6) {
                      ((hm) this).a(((hm) this).field_i, param2, param5, -118, param3);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Dub(((hm) this).field_i, 0, ((hm) this).d(110), param2, param3, 0, waa.a(((hm) this).field_f, 1383), 5121, param5, param6);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              break L1;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var9;
            stackOut_8_1 = new StringBuilder().append("hm.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
            return true;
        }
        return true;
    }

    final static void h() {
        gg.field_f = null;
        uda.field_r = null;
        uua.field_a = null;
        nm.field_l = null;
        ep.field_n = null;
        int var1 = -60;
        mc.field_r = null;
        cb.field_i = null;
        dp.field_d = null;
        tv.field_wb = null;
        sta.field_y = null;
        bm.field_f = null;
        vna.field_c = null;
        wh.field_y = null;
        la.field_j = null;
        lm.field_m = null;
        po.field_l = null;
        pq.field_a = null;
        ik.field_h = null;
        bd.field_i = null;
        uta.field_d = null;
        ng.field_b = null;
        em.field_h = null;
        qf.field_k = null;
        la.field_p = null;
        dn.field_d = null;
        ng.field_k = null;
        ega.field_e = null;
        vua.field_A = null;
        dr.field_a = null;
        ij.field_X = null;
        fa.field_a = null;
        ufa.field_r = null;
        lva.field_m = null;
        tp.field_K = null;
        aq.field_a = null;
        je.field_E = null;
        haa.field_z = null;
        eca.field_c = null;
        fra.field_q = null;
        lh.field_b = null;
        kq.field_a = null;
        eu.field_a = null;
        tka.field_p = null;
        gca.field_a = null;
        bsa.field_i = null;
        nc.field_e = null;
        System.gc();
    }

    hm(kda param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, gpa.field_a, una.field_g, param1 * param2, param3);
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              L2: {
                ((hm) this).field_k = param1;
                ((hm) this).field_l = param2;
                ((hm) this).field_j.a(true, (iva) this);
                if (!param3) {
                  break L2;
                } else {
                  if (param6 != 0) {
                    break L2;
                  } else {
                    if (param5 == 0) {
                      ((hm) this).a((byte) 99, ((hm) this).field_i, param2, param4, param1);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param6);
              jaggl.OpenGL.glTexImage2Di(((hm) this).field_i, 0, 6408, ((hm) this).field_k, ((hm) this).field_l, 0, 32993, ((hm) this).field_j.field_od, param4, param5 * 4);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("hm.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        Object var5 = null;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          ((hm) this).field_j.a(true, (iva) this);
          stackOut_0_0 = ((hm) this).field_i;
          stackOut_0_1 = 10242;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param1) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 10497;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 33071;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          jaggl.OpenGL.glTexParameteri(stackIn_3_0, stackIn_3_1, stackIn_3_2);
          stackOut_3_0 = ((hm) this).field_i;
          stackOut_3_1 = 10243;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (param2) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 10497;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 33071;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        jaggl.OpenGL.glTexParameteri(stackIn_6_0, stackIn_6_1, stackIn_6_2);
        if (param0 > -60) {
          var5 = null;
          ((hm) this).a(-2, (byte) 55, 95, (byte[]) null, -118, 102, (ft) null, -23, 82);
          return;
        } else {
          return;
        }
    }

    hm(kda param0, ft param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, una.field_h, param2 * param3, param4);
        RuntimeException var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ((hm) this).field_l = param3;
                ((hm) this).field_k = param2;
                ((hm) this).field_j.a(true, (iva) this);
                if (param4) {
                  break L2;
                } else {
                  if (param7 != 0) {
                    break L2;
                  } else {
                    if (0 != param6) {
                      break L2;
                    } else {
                      ((hm) this).a(-1, param5, param3, ((hm) this).field_i, param2);
                      break L1;
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Df(((hm) this).field_i, 0, ((hm) this).d(44), param2, param3, 0, waa.a(((hm) this).field_f, 1383), 5126, param5, param6 * 4);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var9;
            stackOut_7_1 = new StringBuilder().append("hm.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static int a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param8 >= param2) {
          if (param7 >= param9) {
            if (param8 <= param3) {
              if (param7 <= param4) {
                L0: {
                  if (param8 < param2) {
                    break L0;
                  } else {
                    if (param8 > param3) {
                      break L0;
                    } else {
                      if (param9 > param7) {
                        break L0;
                      } else {
                        if (param4 < param7) {
                          break L0;
                        } else {
                          if (param6 < param2) {
                            break L0;
                          } else {
                            if (param6 > param3) {
                              break L0;
                            } else {
                              if (param9 > param0) {
                                break L0;
                              } else {
                                if (param4 >= param0) {
                                  return 1 + (1 << param5);
                                } else {
                                  L1: {
                                    param8 = param8 - param2;
                                    param3 = param3 - param2;
                                    param6 = param6 - param2;
                                    param0 = param0 - param9;
                                    param4 = param4 - param9;
                                    param7 = param7 - param9;
                                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                                    if (0 < var10) {
                                      param8 = param8 >> var10;
                                      param6 = param6 >> var10;
                                      param3 = param3 >> var10;
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  }
                                  L2: {
                                    var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                                    if (var10 <= 0) {
                                      break L2;
                                    } else {
                                      param7 = param7 >> var10;
                                      param0 = param0 >> var10;
                                      param4 = param4 >> var10;
                                      break L2;
                                    }
                                  }
                                  L3: {
                                    var10 = param0 + -param7;
                                    var11 = -param8 + param6;
                                    var12 = -1;
                                    if (var11 != 0) {
                                      var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    if (var10 != 0) {
                                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    param0 = param0 - param4;
                                    param8 = param8 - param3;
                                    param7 = param7 - param4;
                                    param6 = param6 - param3;
                                    if (var11 != 0) {
                                      var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (0 == var10) {
                                      break L6;
                                    } else {
                                      var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                      break L6;
                                    }
                                  }
                                  return var12;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L7: {
                  param8 = param8 - param2;
                  param3 = param3 - param2;
                  param6 = param6 - param2;
                  param0 = param0 - param9;
                  param4 = param4 - param9;
                  param7 = param7 - param9;
                  var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                  if (0 < var10) {
                    param8 = param8 >> var10;
                    param6 = param6 >> var10;
                    param3 = param3 >> var10;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                  if (var10 <= 0) {
                    break L8;
                  } else {
                    param7 = param7 >> var10;
                    param0 = param0 >> var10;
                    param4 = param4 >> var10;
                    break L8;
                  }
                }
                L9: {
                  var10 = param0 + -param7;
                  var11 = -param8 + param6;
                  var12 = -1;
                  if (var11 != 0) {
                    var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var10 != 0) {
                    var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  param0 = param0 - param4;
                  param8 = param8 - param3;
                  param7 = param7 - param4;
                  param6 = param6 - param3;
                  if (var11 != 0) {
                    var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (0 == var10) {
                    break L12;
                  } else {
                    var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                    break L12;
                  }
                }
                return var12;
              } else {
                if (param0 <= param4) {
                  if (param8 >= param2) {
                    if (param8 <= param3) {
                      if (param9 <= param7) {
                        L13: {
                          if (param4 < param7) {
                            break L13;
                          } else {
                            if (param6 < param2) {
                              break L13;
                            } else {
                              if (param6 > param3) {
                                break L13;
                              } else {
                                if (param9 > param0) {
                                  break L13;
                                } else {
                                  if (param4 >= param0) {
                                    return 1 + (1 << param5);
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                          if (var10 <= 0) {
                            break L15;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L15;
                          }
                        }
                        L16: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (var10 != 0) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          param6 = param6 - param3;
                          if (var11 != 0) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (0 == var10) {
                            break L19;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L19;
                          }
                        }
                        return var12;
                      } else {
                        L20: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                          if (var10 <= 0) {
                            break L21;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L21;
                          }
                        }
                        L22: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (var10 != 0) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          param6 = param6 - param3;
                          if (var11 != 0) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          if (0 == var10) {
                            break L25;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L25;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L26: {
                        param8 = param8 - param2;
                        param3 = param3 - param2;
                        param6 = param6 - param2;
                        param0 = param0 - param9;
                        param4 = param4 - param9;
                        param7 = param7 - param9;
                        var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                        if (0 < var10) {
                          param8 = param8 >> var10;
                          param6 = param6 >> var10;
                          param3 = param3 >> var10;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                        if (var10 <= 0) {
                          break L27;
                        } else {
                          param7 = param7 >> var10;
                          param0 = param0 >> var10;
                          param4 = param4 >> var10;
                          break L27;
                        }
                      }
                      L28: {
                        var10 = param0 + -param7;
                        var11 = -param8 + param6;
                        var12 = -1;
                        if (var11 != 0) {
                          var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (var10 != 0) {
                          var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        param0 = param0 - param4;
                        param8 = param8 - param3;
                        param7 = param7 - param4;
                        param6 = param6 - param3;
                        if (var11 != 0) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (0 == var10) {
                          break L31;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L31;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L32: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                      if (var10 <= 0) {
                        break L33;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L33;
                      }
                    }
                    L34: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L35: {
                      if (var10 != 0) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    L36: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      param6 = param6 - param3;
                      if (var11 != 0) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    L37: {
                      if (0 == var10) {
                        break L37;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L37;
                      }
                    }
                    return var12;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (param3 >= param6) {
                L38: {
                  if (param7 <= param4) {
                    break L38;
                  } else {
                    if (param0 > param4) {
                      return -1;
                    } else {
                      break L38;
                    }
                  }
                }
                if (param8 >= param2) {
                  if (param8 <= param3) {
                    if (param9 <= param7) {
                      if (param4 >= param7) {
                        if (param6 >= param2) {
                          if (param6 <= param3) {
                            if (param9 <= param0) {
                              if (param4 >= param0) {
                                return 1 + (1 << param5);
                              } else {
                                L39: {
                                  param8 = param8 - param2;
                                  param3 = param3 - param2;
                                  param6 = param6 - param2;
                                  param0 = param0 - param9;
                                  param4 = param4 - param9;
                                  param7 = param7 - param9;
                                  var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                                  if (0 < var10) {
                                    param8 = param8 >> var10;
                                    param6 = param6 >> var10;
                                    param3 = param3 >> var10;
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L40: {
                                  var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                                  if (var10 <= 0) {
                                    break L40;
                                  } else {
                                    param7 = param7 >> var10;
                                    param0 = param0 >> var10;
                                    param4 = param4 >> var10;
                                    break L40;
                                  }
                                }
                                L41: {
                                  var10 = param0 + -param7;
                                  var11 = -param8 + param6;
                                  var12 = -1;
                                  if (var11 != 0) {
                                    var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                                L42: {
                                  if (var10 != 0) {
                                    var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                                L43: {
                                  param0 = param0 - param4;
                                  param8 = param8 - param3;
                                  param7 = param7 - param4;
                                  param6 = param6 - param3;
                                  if (var11 != 0) {
                                    var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                }
                                L44: {
                                  if (0 == var10) {
                                    break L44;
                                  } else {
                                    var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                    break L44;
                                  }
                                }
                                return var12;
                              }
                            } else {
                              L45: {
                                param8 = param8 - param2;
                                param3 = param3 - param2;
                                param6 = param6 - param2;
                                param0 = param0 - param9;
                                param4 = param4 - param9;
                                param7 = param7 - param9;
                                var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                                if (0 < var10) {
                                  param8 = param8 >> var10;
                                  param6 = param6 >> var10;
                                  param3 = param3 >> var10;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              L46: {
                                var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                                if (var10 <= 0) {
                                  break L46;
                                } else {
                                  param7 = param7 >> var10;
                                  param0 = param0 >> var10;
                                  param4 = param4 >> var10;
                                  break L46;
                                }
                              }
                              L47: {
                                var10 = param0 + -param7;
                                var11 = -param8 + param6;
                                var12 = -1;
                                if (var11 != 0) {
                                  var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                              L48: {
                                if (var10 != 0) {
                                  var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                              L49: {
                                param0 = param0 - param4;
                                param8 = param8 - param3;
                                param7 = param7 - param4;
                                param6 = param6 - param3;
                                if (var11 != 0) {
                                  var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              L50: {
                                if (0 == var10) {
                                  break L50;
                                } else {
                                  var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                  break L50;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L51: {
                              param8 = param8 - param2;
                              param3 = param3 - param2;
                              param6 = param6 - param2;
                              param0 = param0 - param9;
                              param4 = param4 - param9;
                              param7 = param7 - param9;
                              var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                              if (0 < var10) {
                                param8 = param8 >> var10;
                                param6 = param6 >> var10;
                                param3 = param3 >> var10;
                                break L51;
                              } else {
                                break L51;
                              }
                            }
                            L52: {
                              var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                              if (var10 <= 0) {
                                break L52;
                              } else {
                                param7 = param7 >> var10;
                                param0 = param0 >> var10;
                                param4 = param4 >> var10;
                                break L52;
                              }
                            }
                            L53: {
                              var10 = param0 + -param7;
                              var11 = -param8 + param6;
                              var12 = -1;
                              if (var11 != 0) {
                                var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                            L54: {
                              if (var10 != 0) {
                                var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                break L54;
                              } else {
                                break L54;
                              }
                            }
                            L55: {
                              param0 = param0 - param4;
                              param8 = param8 - param3;
                              param7 = param7 - param4;
                              param6 = param6 - param3;
                              if (var11 != 0) {
                                var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                break L55;
                              } else {
                                break L55;
                              }
                            }
                            L56: {
                              if (0 == var10) {
                                break L56;
                              } else {
                                var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                break L56;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L57: {
                            param8 = param8 - param2;
                            param3 = param3 - param2;
                            param6 = param6 - param2;
                            param0 = param0 - param9;
                            param4 = param4 - param9;
                            param7 = param7 - param9;
                            var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                            if (0 < var10) {
                              param8 = param8 >> var10;
                              param6 = param6 >> var10;
                              param3 = param3 >> var10;
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          L58: {
                            var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                            if (var10 <= 0) {
                              break L58;
                            } else {
                              param7 = param7 >> var10;
                              param0 = param0 >> var10;
                              param4 = param4 >> var10;
                              break L58;
                            }
                          }
                          L59: {
                            var10 = param0 + -param7;
                            var11 = -param8 + param6;
                            var12 = -1;
                            if (var11 != 0) {
                              var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                              break L59;
                            } else {
                              break L59;
                            }
                          }
                          L60: {
                            if (var10 != 0) {
                              var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                          L61: {
                            param0 = param0 - param4;
                            param8 = param8 - param3;
                            param7 = param7 - param4;
                            param6 = param6 - param3;
                            if (var11 != 0) {
                              var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                          L62: {
                            if (0 == var10) {
                              break L62;
                            } else {
                              var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                              break L62;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L63: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                        L64: {
                          var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                          if (var10 <= 0) {
                            break L64;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L64;
                          }
                        }
                        L65: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                            break L65;
                          } else {
                            break L65;
                          }
                        }
                        L66: {
                          if (var10 != 0) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L66;
                          } else {
                            break L66;
                          }
                        }
                        L67: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          param6 = param6 - param3;
                          if (var11 != 0) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L67;
                          } else {
                            break L67;
                          }
                        }
                        L68: {
                          if (0 == var10) {
                            break L68;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L68;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L69: {
                        param8 = param8 - param2;
                        param3 = param3 - param2;
                        param6 = param6 - param2;
                        param0 = param0 - param9;
                        param4 = param4 - param9;
                        param7 = param7 - param9;
                        var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                        if (0 < var10) {
                          param8 = param8 >> var10;
                          param6 = param6 >> var10;
                          param3 = param3 >> var10;
                          break L69;
                        } else {
                          break L69;
                        }
                      }
                      L70: {
                        var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                        if (var10 <= 0) {
                          break L70;
                        } else {
                          param7 = param7 >> var10;
                          param0 = param0 >> var10;
                          param4 = param4 >> var10;
                          break L70;
                        }
                      }
                      L71: {
                        var10 = param0 + -param7;
                        var11 = -param8 + param6;
                        var12 = -1;
                        if (var11 != 0) {
                          var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                          break L71;
                        } else {
                          break L71;
                        }
                      }
                      L72: {
                        if (var10 != 0) {
                          var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                          break L72;
                        } else {
                          break L72;
                        }
                      }
                      L73: {
                        param0 = param0 - param4;
                        param8 = param8 - param3;
                        param7 = param7 - param4;
                        param6 = param6 - param3;
                        if (var11 != 0) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L73;
                        } else {
                          break L73;
                        }
                      }
                      L74: {
                        if (0 == var10) {
                          break L74;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L74;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L75: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L75;
                      } else {
                        break L75;
                      }
                    }
                    L76: {
                      var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                      if (var10 <= 0) {
                        break L76;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L76;
                      }
                    }
                    L77: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                        break L77;
                      } else {
                        break L77;
                      }
                    }
                    L78: {
                      if (var10 != 0) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L78;
                      } else {
                        break L78;
                      }
                    }
                    L79: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      param6 = param6 - param3;
                      if (var11 != 0) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L79;
                      } else {
                        break L79;
                      }
                    }
                    L80: {
                      if (0 == var10) {
                        break L80;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L80;
                      }
                    }
                    return var12;
                  }
                } else {
                  L81: {
                    param8 = param8 - param2;
                    param3 = param3 - param2;
                    param6 = param6 - param2;
                    param0 = param0 - param9;
                    param4 = param4 - param9;
                    param7 = param7 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                    if (0 < var10) {
                      param8 = param8 >> var10;
                      param6 = param6 >> var10;
                      param3 = param3 >> var10;
                      break L81;
                    } else {
                      break L81;
                    }
                  }
                  L82: {
                    var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                    if (var10 <= 0) {
                      break L82;
                    } else {
                      param7 = param7 >> var10;
                      param0 = param0 >> var10;
                      param4 = param4 >> var10;
                      break L82;
                    }
                  }
                  L83: {
                    var10 = param0 + -param7;
                    var11 = -param8 + param6;
                    var12 = -1;
                    if (var11 != 0) {
                      var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                      break L83;
                    } else {
                      break L83;
                    }
                  }
                  L84: {
                    if (var10 != 0) {
                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                      break L84;
                    } else {
                      break L84;
                    }
                  }
                  L85: {
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    param6 = param6 - param3;
                    if (var11 != 0) {
                      var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                      break L85;
                    } else {
                      break L85;
                    }
                  }
                  L86: {
                    if (0 == var10) {
                      break L86;
                    } else {
                      var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                      break L86;
                    }
                  }
                  return var12;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (param0 >= param9) {
              L87: {
                L88: {
                  if (param8 <= param3) {
                    break L88;
                  } else {
                    if (param3 < param6) {
                      break L87;
                    } else {
                      break L88;
                    }
                  }
                }
                L89: {
                  if (param7 <= param4) {
                    break L89;
                  } else {
                    if (param0 > param4) {
                      break L87;
                    } else {
                      break L89;
                    }
                  }
                }
                if (param8 >= param2) {
                  if (param8 <= param3) {
                    if (param9 <= param7) {
                      if (param4 >= param7) {
                        if (param6 >= param2) {
                          if (param6 <= param3) {
                            if (param9 <= param0) {
                              if (param4 >= param0) {
                                return 1 + (1 << param5);
                              } else {
                                L90: {
                                  param8 = param8 - param2;
                                  param3 = param3 - param2;
                                  param6 = param6 - param2;
                                  param0 = param0 - param9;
                                  param4 = param4 - param9;
                                  param7 = param7 - param9;
                                  var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                                  if (0 < var10) {
                                    param8 = param8 >> var10;
                                    param6 = param6 >> var10;
                                    param3 = param3 >> var10;
                                    break L90;
                                  } else {
                                    break L90;
                                  }
                                }
                                L91: {
                                  var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                                  if (var10 <= 0) {
                                    break L91;
                                  } else {
                                    param7 = param7 >> var10;
                                    param0 = param0 >> var10;
                                    param4 = param4 >> var10;
                                    break L91;
                                  }
                                }
                                L92: {
                                  var10 = param0 + -param7;
                                  var11 = -param8 + param6;
                                  var12 = -1;
                                  if (var11 != 0) {
                                    var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                    break L92;
                                  } else {
                                    break L92;
                                  }
                                }
                                L93: {
                                  if (var10 != 0) {
                                    var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                    break L93;
                                  } else {
                                    break L93;
                                  }
                                }
                                L94: {
                                  param0 = param0 - param4;
                                  param8 = param8 - param3;
                                  param7 = param7 - param4;
                                  param6 = param6 - param3;
                                  if (var11 != 0) {
                                    var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                    break L94;
                                  } else {
                                    break L94;
                                  }
                                }
                                L95: {
                                  if (0 == var10) {
                                    break L95;
                                  } else {
                                    var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                    break L95;
                                  }
                                }
                                return var12;
                              }
                            } else {
                              L96: {
                                param8 = param8 - param2;
                                param3 = param3 - param2;
                                param6 = param6 - param2;
                                param0 = param0 - param9;
                                param4 = param4 - param9;
                                param7 = param7 - param9;
                                var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                                if (0 < var10) {
                                  param8 = param8 >> var10;
                                  param6 = param6 >> var10;
                                  param3 = param3 >> var10;
                                  break L96;
                                } else {
                                  break L96;
                                }
                              }
                              L97: {
                                var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                                if (var10 <= 0) {
                                  break L97;
                                } else {
                                  param7 = param7 >> var10;
                                  param0 = param0 >> var10;
                                  param4 = param4 >> var10;
                                  break L97;
                                }
                              }
                              L98: {
                                var10 = param0 + -param7;
                                var11 = -param8 + param6;
                                var12 = -1;
                                if (var11 != 0) {
                                  var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                  break L98;
                                } else {
                                  break L98;
                                }
                              }
                              L99: {
                                if (var10 != 0) {
                                  var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                  break L99;
                                } else {
                                  break L99;
                                }
                              }
                              L100: {
                                param0 = param0 - param4;
                                param8 = param8 - param3;
                                param7 = param7 - param4;
                                param6 = param6 - param3;
                                if (var11 != 0) {
                                  var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                  break L100;
                                } else {
                                  break L100;
                                }
                              }
                              L101: {
                                if (0 == var10) {
                                  break L101;
                                } else {
                                  var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                  break L101;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L102: {
                              param8 = param8 - param2;
                              param3 = param3 - param2;
                              param6 = param6 - param2;
                              param0 = param0 - param9;
                              param4 = param4 - param9;
                              param7 = param7 - param9;
                              var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                              if (0 < var10) {
                                param8 = param8 >> var10;
                                param6 = param6 >> var10;
                                param3 = param3 >> var10;
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                            L103: {
                              var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                              if (var10 <= 0) {
                                break L103;
                              } else {
                                param7 = param7 >> var10;
                                param0 = param0 >> var10;
                                param4 = param4 >> var10;
                                break L103;
                              }
                            }
                            L104: {
                              var10 = param0 + -param7;
                              var11 = -param8 + param6;
                              var12 = -1;
                              if (var11 != 0) {
                                var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                break L104;
                              } else {
                                break L104;
                              }
                            }
                            L105: {
                              if (var10 != 0) {
                                var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                break L105;
                              } else {
                                break L105;
                              }
                            }
                            L106: {
                              param0 = param0 - param4;
                              param8 = param8 - param3;
                              param7 = param7 - param4;
                              param6 = param6 - param3;
                              if (var11 != 0) {
                                var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                break L106;
                              } else {
                                break L106;
                              }
                            }
                            L107: {
                              if (0 == var10) {
                                break L107;
                              } else {
                                var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                break L107;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L108: {
                            param8 = param8 - param2;
                            param3 = param3 - param2;
                            param6 = param6 - param2;
                            param0 = param0 - param9;
                            param4 = param4 - param9;
                            param7 = param7 - param9;
                            var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                            if (0 < var10) {
                              param8 = param8 >> var10;
                              param6 = param6 >> var10;
                              param3 = param3 >> var10;
                              break L108;
                            } else {
                              break L108;
                            }
                          }
                          L109: {
                            var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                            if (var10 <= 0) {
                              break L109;
                            } else {
                              param7 = param7 >> var10;
                              param0 = param0 >> var10;
                              param4 = param4 >> var10;
                              break L109;
                            }
                          }
                          L110: {
                            var10 = param0 + -param7;
                            var11 = -param8 + param6;
                            var12 = -1;
                            if (var11 != 0) {
                              var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                              break L110;
                            } else {
                              break L110;
                            }
                          }
                          L111: {
                            if (var10 != 0) {
                              var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                              break L111;
                            } else {
                              break L111;
                            }
                          }
                          L112: {
                            param0 = param0 - param4;
                            param8 = param8 - param3;
                            param7 = param7 - param4;
                            param6 = param6 - param3;
                            if (var11 != 0) {
                              var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                              break L112;
                            } else {
                              break L112;
                            }
                          }
                          L113: {
                            if (0 == var10) {
                              break L113;
                            } else {
                              var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                              break L113;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L114: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L114;
                          } else {
                            break L114;
                          }
                        }
                        L115: {
                          var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                          if (var10 <= 0) {
                            break L115;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L115;
                          }
                        }
                        L116: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                            break L116;
                          } else {
                            break L116;
                          }
                        }
                        L117: {
                          if (var10 != 0) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L117;
                          } else {
                            break L117;
                          }
                        }
                        L118: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          param6 = param6 - param3;
                          if (var11 != 0) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L118;
                          } else {
                            break L118;
                          }
                        }
                        L119: {
                          if (0 == var10) {
                            break L119;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L119;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L120: {
                        param8 = param8 - param2;
                        param3 = param3 - param2;
                        param6 = param6 - param2;
                        param0 = param0 - param9;
                        param4 = param4 - param9;
                        param7 = param7 - param9;
                        var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                        if (0 < var10) {
                          param8 = param8 >> var10;
                          param6 = param6 >> var10;
                          param3 = param3 >> var10;
                          break L120;
                        } else {
                          break L120;
                        }
                      }
                      L121: {
                        var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                        if (var10 <= 0) {
                          break L121;
                        } else {
                          param7 = param7 >> var10;
                          param0 = param0 >> var10;
                          param4 = param4 >> var10;
                          break L121;
                        }
                      }
                      L122: {
                        var10 = param0 + -param7;
                        var11 = -param8 + param6;
                        var12 = -1;
                        if (var11 != 0) {
                          var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                          break L122;
                        } else {
                          break L122;
                        }
                      }
                      L123: {
                        if (var10 != 0) {
                          var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                          break L123;
                        } else {
                          break L123;
                        }
                      }
                      L124: {
                        param0 = param0 - param4;
                        param8 = param8 - param3;
                        param7 = param7 - param4;
                        param6 = param6 - param3;
                        if (var11 != 0) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L124;
                        } else {
                          break L124;
                        }
                      }
                      L125: {
                        if (0 == var10) {
                          break L125;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L125;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L126: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L126;
                      } else {
                        break L126;
                      }
                    }
                    L127: {
                      var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                      if (var10 <= 0) {
                        break L127;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L127;
                      }
                    }
                    L128: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                        break L128;
                      } else {
                        break L128;
                      }
                    }
                    L129: {
                      if (var10 != 0) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L129;
                      } else {
                        break L129;
                      }
                    }
                    L130: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      param6 = param6 - param3;
                      if (var11 != 0) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L130;
                      } else {
                        break L130;
                      }
                    }
                    L131: {
                      if (0 == var10) {
                        break L131;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L131;
                      }
                    }
                    return var12;
                  }
                } else {
                  L132: {
                    param8 = param8 - param2;
                    param3 = param3 - param2;
                    param6 = param6 - param2;
                    param0 = param0 - param9;
                    param4 = param4 - param9;
                    param7 = param7 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                    if (0 < var10) {
                      param8 = param8 >> var10;
                      param6 = param6 >> var10;
                      param3 = param3 >> var10;
                      break L132;
                    } else {
                      break L132;
                    }
                  }
                  L133: {
                    var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                    if (var10 <= 0) {
                      break L133;
                    } else {
                      param7 = param7 >> var10;
                      param0 = param0 >> var10;
                      param4 = param4 >> var10;
                      break L133;
                    }
                  }
                  L134: {
                    var10 = param0 + -param7;
                    var11 = -param8 + param6;
                    var12 = -1;
                    if (var11 != 0) {
                      var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                      break L134;
                    } else {
                      break L134;
                    }
                  }
                  L135: {
                    if (var10 != 0) {
                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                      break L135;
                    } else {
                      break L135;
                    }
                  }
                  L136: {
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    param6 = param6 - param3;
                    if (var11 != 0) {
                      var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                      break L136;
                    } else {
                      break L136;
                    }
                  }
                  L137: {
                    if (0 == var10) {
                      break L137;
                    } else {
                      var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                      break L137;
                    }
                  }
                  return var12;
                }
              }
              return -1;
            } else {
              return -1;
            }
          }
        } else {
          if (param6 >= param2) {
            L138: {
              L139: {
                if (param7 >= param9) {
                  break L139;
                } else {
                  if (param0 < param9) {
                    break L138;
                  } else {
                    break L139;
                  }
                }
              }
              L140: {
                if (param8 <= param3) {
                  break L140;
                } else {
                  if (param3 < param6) {
                    break L138;
                  } else {
                    break L140;
                  }
                }
              }
              L141: {
                if (param7 <= param4) {
                  break L141;
                } else {
                  if (param0 > param4) {
                    break L138;
                  } else {
                    break L141;
                  }
                }
              }
              if (param8 >= param2) {
                if (param8 <= param3) {
                  if (param9 <= param7) {
                    if (param4 >= param7) {
                      if (param6 >= param2) {
                        if (param6 <= param3) {
                          if (param9 <= param0) {
                            if (param4 >= param0) {
                              return 1 + (1 << param5);
                            } else {
                              L142: {
                                param8 = param8 - param2;
                                param3 = param3 - param2;
                                param6 = param6 - param2;
                                param0 = param0 - param9;
                                param4 = param4 - param9;
                                param7 = param7 - param9;
                                var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                                if (0 < var10) {
                                  param8 = param8 >> var10;
                                  param6 = param6 >> var10;
                                  param3 = param3 >> var10;
                                  break L142;
                                } else {
                                  break L142;
                                }
                              }
                              L143: {
                                var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                                if (var10 <= 0) {
                                  break L143;
                                } else {
                                  param7 = param7 >> var10;
                                  param0 = param0 >> var10;
                                  param4 = param4 >> var10;
                                  break L143;
                                }
                              }
                              L144: {
                                var10 = param0 + -param7;
                                var11 = -param8 + param6;
                                var12 = -1;
                                if (var11 != 0) {
                                  var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                  break L144;
                                } else {
                                  break L144;
                                }
                              }
                              L145: {
                                if (var10 != 0) {
                                  var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                  break L145;
                                } else {
                                  break L145;
                                }
                              }
                              L146: {
                                param0 = param0 - param4;
                                param8 = param8 - param3;
                                param7 = param7 - param4;
                                param6 = param6 - param3;
                                if (var11 != 0) {
                                  var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                  break L146;
                                } else {
                                  break L146;
                                }
                              }
                              L147: {
                                if (0 == var10) {
                                  break L147;
                                } else {
                                  var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                  break L147;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L148: {
                              param8 = param8 - param2;
                              param3 = param3 - param2;
                              param6 = param6 - param2;
                              param0 = param0 - param9;
                              param4 = param4 - param9;
                              param7 = param7 - param9;
                              var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                              if (0 < var10) {
                                param8 = param8 >> var10;
                                param6 = param6 >> var10;
                                param3 = param3 >> var10;
                                break L148;
                              } else {
                                break L148;
                              }
                            }
                            L149: {
                              var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                              if (var10 <= 0) {
                                break L149;
                              } else {
                                param7 = param7 >> var10;
                                param0 = param0 >> var10;
                                param4 = param4 >> var10;
                                break L149;
                              }
                            }
                            L150: {
                              var10 = param0 + -param7;
                              var11 = -param8 + param6;
                              var12 = -1;
                              if (var11 != 0) {
                                var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                                break L150;
                              } else {
                                break L150;
                              }
                            }
                            L151: {
                              if (var10 != 0) {
                                var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                break L151;
                              } else {
                                break L151;
                              }
                            }
                            L152: {
                              param0 = param0 - param4;
                              param8 = param8 - param3;
                              param7 = param7 - param4;
                              param6 = param6 - param3;
                              if (var11 != 0) {
                                var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                break L152;
                              } else {
                                break L152;
                              }
                            }
                            L153: {
                              if (0 == var10) {
                                break L153;
                              } else {
                                var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                break L153;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L154: {
                            param8 = param8 - param2;
                            param3 = param3 - param2;
                            param6 = param6 - param2;
                            param0 = param0 - param9;
                            param4 = param4 - param9;
                            param7 = param7 - param9;
                            var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                            if (0 < var10) {
                              param8 = param8 >> var10;
                              param6 = param6 >> var10;
                              param3 = param3 >> var10;
                              break L154;
                            } else {
                              break L154;
                            }
                          }
                          L155: {
                            var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                            if (var10 <= 0) {
                              break L155;
                            } else {
                              param7 = param7 >> var10;
                              param0 = param0 >> var10;
                              param4 = param4 >> var10;
                              break L155;
                            }
                          }
                          L156: {
                            var10 = param0 + -param7;
                            var11 = -param8 + param6;
                            var12 = -1;
                            if (var11 != 0) {
                              var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                              break L156;
                            } else {
                              break L156;
                            }
                          }
                          L157: {
                            if (var10 != 0) {
                              var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                              break L157;
                            } else {
                              break L157;
                            }
                          }
                          L158: {
                            param0 = param0 - param4;
                            param8 = param8 - param3;
                            param7 = param7 - param4;
                            param6 = param6 - param3;
                            if (var11 != 0) {
                              var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                              break L158;
                            } else {
                              break L158;
                            }
                          }
                          L159: {
                            if (0 == var10) {
                              break L159;
                            } else {
                              var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                              break L159;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L160: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L160;
                          } else {
                            break L160;
                          }
                        }
                        L161: {
                          var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                          if (var10 <= 0) {
                            break L161;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L161;
                          }
                        }
                        L162: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                            break L162;
                          } else {
                            break L162;
                          }
                        }
                        L163: {
                          if (var10 != 0) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L163;
                          } else {
                            break L163;
                          }
                        }
                        L164: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          param6 = param6 - param3;
                          if (var11 != 0) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L164;
                          } else {
                            break L164;
                          }
                        }
                        L165: {
                          if (0 == var10) {
                            break L165;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L165;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L166: {
                        param8 = param8 - param2;
                        param3 = param3 - param2;
                        param6 = param6 - param2;
                        param0 = param0 - param9;
                        param4 = param4 - param9;
                        param7 = param7 - param9;
                        var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                        if (0 < var10) {
                          param8 = param8 >> var10;
                          param6 = param6 >> var10;
                          param3 = param3 >> var10;
                          break L166;
                        } else {
                          break L166;
                        }
                      }
                      L167: {
                        var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                        if (var10 <= 0) {
                          break L167;
                        } else {
                          param7 = param7 >> var10;
                          param0 = param0 >> var10;
                          param4 = param4 >> var10;
                          break L167;
                        }
                      }
                      L168: {
                        var10 = param0 + -param7;
                        var11 = -param8 + param6;
                        var12 = -1;
                        if (var11 != 0) {
                          var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                          break L168;
                        } else {
                          break L168;
                        }
                      }
                      L169: {
                        if (var10 != 0) {
                          var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                          break L169;
                        } else {
                          break L169;
                        }
                      }
                      L170: {
                        param0 = param0 - param4;
                        param8 = param8 - param3;
                        param7 = param7 - param4;
                        param6 = param6 - param3;
                        if (var11 != 0) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L170;
                        } else {
                          break L170;
                        }
                      }
                      L171: {
                        if (0 == var10) {
                          break L171;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L171;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L172: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L172;
                      } else {
                        break L172;
                      }
                    }
                    L173: {
                      var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                      if (var10 <= 0) {
                        break L173;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L173;
                      }
                    }
                    L174: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                        break L174;
                      } else {
                        break L174;
                      }
                    }
                    L175: {
                      if (var10 != 0) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L175;
                      } else {
                        break L175;
                      }
                    }
                    L176: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      param6 = param6 - param3;
                      if (var11 != 0) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L176;
                      } else {
                        break L176;
                      }
                    }
                    L177: {
                      if (0 == var10) {
                        break L177;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L177;
                      }
                    }
                    return var12;
                  }
                } else {
                  L178: {
                    param8 = param8 - param2;
                    param3 = param3 - param2;
                    param6 = param6 - param2;
                    param0 = param0 - param9;
                    param4 = param4 - param9;
                    param7 = param7 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                    if (0 < var10) {
                      param8 = param8 >> var10;
                      param6 = param6 >> var10;
                      param3 = param3 >> var10;
                      break L178;
                    } else {
                      break L178;
                    }
                  }
                  L179: {
                    var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                    if (var10 <= 0) {
                      break L179;
                    } else {
                      param7 = param7 >> var10;
                      param0 = param0 >> var10;
                      param4 = param4 >> var10;
                      break L179;
                    }
                  }
                  L180: {
                    var10 = param0 + -param7;
                    var11 = -param8 + param6;
                    var12 = -1;
                    if (var11 != 0) {
                      var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                      break L180;
                    } else {
                      break L180;
                    }
                  }
                  L181: {
                    if (var10 != 0) {
                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                      break L181;
                    } else {
                      break L181;
                    }
                  }
                  L182: {
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    param6 = param6 - param3;
                    if (var11 != 0) {
                      var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                      break L182;
                    } else {
                      break L182;
                    }
                  }
                  L183: {
                    if (0 == var10) {
                      break L183;
                    } else {
                      var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                      break L183;
                    }
                  }
                  return var12;
                }
              } else {
                L184: {
                  param8 = param8 - param2;
                  param3 = param3 - param2;
                  param6 = param6 - param2;
                  param0 = param0 - param9;
                  param4 = param4 - param9;
                  param7 = param7 - param9;
                  var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(1, param6)), vd.b(1, param3));
                  if (0 < var10) {
                    param8 = param8 >> var10;
                    param6 = param6 >> var10;
                    param3 = param3 >> var10;
                    break L184;
                  } else {
                    break L184;
                  }
                }
                L185: {
                  var10 = -14 + Math.max(Math.max(vd.b(1, param7), vd.b(1, param0)), vd.b(1, param4));
                  if (var10 <= 0) {
                    break L185;
                  } else {
                    param7 = param7 >> var10;
                    param0 = param0 >> var10;
                    param4 = param4 >> var10;
                    break L185;
                  }
                }
                L186: {
                  var10 = param0 + -param7;
                  var11 = -param8 + param6;
                  var12 = -1;
                  if (var11 != 0) {
                    var12 = gv.a(0, param5, param8, param0, var12, 0, param7, var10, var11, param4);
                    break L186;
                  } else {
                    break L186;
                  }
                }
                L187: {
                  if (var10 != 0) {
                    var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                    break L187;
                  } else {
                    break L187;
                  }
                }
                L188: {
                  param0 = param0 - param4;
                  param8 = param8 - param3;
                  param7 = param7 - param4;
                  param6 = param6 - param3;
                  if (var11 != 0) {
                    var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                    break L188;
                  } else {
                    break L188;
                  }
                }
                L189: {
                  if (0 == var10) {
                    break L189;
                  } else {
                    var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                    break L189;
                  }
                }
                return var12;
              }
            }
            return -1;
          } else {
            return -1;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        try {
            ((hm) this).field_j.a(true, (iva) this);
            if (param3 < 101) {
                field_n = null;
            }
            jaggl.OpenGL.glPixelStorei(3314, param2);
            jaggl.OpenGL.glTexSubImage2Di(((hm) this).field_i, 0, param7, param4, param6, param1, 32993, ((hm) this).field_j.field_od, param5, param0);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hm.J(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 41);
        }
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
            hm.g((byte) -22);
            return param1 / (float)((hm) this).field_l;
        }
        return param1 / (float)((hm) this).field_l;
    }

    final void a(int param0, byte param1, int param2, byte[] param3, int param4, int param5, ft param6, int param7, int param8) {
        try {
            ((hm) this).field_j.a(true, (iva) this);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param4);
            jaggl.OpenGL.glTexSubImage2Dub(((hm) this).field_i, 0, param0, param8, param7, param2, waa.a(param6, 1383), 5121, param3, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            int var10_int = -48 % ((-62 - param1) / 60);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hm.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    public final void a(int param0, hs param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hm.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final int b(int param0) {
        Object var3 = null;
        if (param0 != -7070) {
          var3 = null;
          ((hm) this).a(-114, 19, 79, 107, -106, (int[]) null, -103, 40);
          return ((hm) this).field_k;
        } else {
          return ((hm) this).field_k;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Off";
    }
}
