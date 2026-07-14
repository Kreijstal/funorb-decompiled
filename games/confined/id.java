/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id extends ee {
    static int field_rb;
    da field_Eb;
    da field_tb;
    ek field_fb;
    tf field_nb;
    oi field_ib;
    double field_qb;
    int field_ob;
    double field_Y;
    private hm field_mb;
    double field_cb;
    private double field_T;
    boolean field_ab;
    private double field_bb;
    double field_ub;
    int field_Ab;
    private double field_Q;
    double field_Db;
    rd field_eb;
    boolean field_db;
    boolean field_kb;
    private double field_Cb;
    double field_X;
    double field_hb;
    private int field_jb;
    boolean field_vb;
    private double field_lb;
    double field_Z;
    boolean field_yb;
    double field_xb;
    double field_R;
    private gk field_pb;
    int field_zb;
    boolean field_gb;
    int field_sb;
    private double field_U;
    boolean field_S;
    int field_wb;
    int field_V;
    int field_Bb;
    int field_W;

    final void a(byte param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        double stackIn_3_1 = 0.0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        double stackOut_2_1 = 0.0;
        Object stackOut_1_0 = null;
        double stackOut_1_1 = 0.0;
        L0: {
          var19 = Confined.field_J ? 1 : 0;
          ((id) this).field_A.field_x.b(3, param1, ((id) this).field_D);
          var3 = ((id) this).field_E - ((id) this).field_A.field_x.field_B;
          var5 = ((id) this).field_t - ((id) this).field_A.field_x.field_G;
          var7 = Math.sqrt(var5 * var5 + var3 * var3);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var7 >= 0.001) {
            stackOut_2_0 = this;
            stackOut_2_1 = Math.atan2(var3, -var5);
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = Math.random() * 6.283185307179586;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((id) this).field_hb = stackIn_3_1;
          if (param0 >= 124) {
            break L1;
          } else {
            ((id) this).field_V = -58;
            break L1;
          }
        }
        L2: {
          var9 = 6.283185307179586 * Math.random();
          var11 = ((id) this).field_A.field_J.field_b * Math.sin(var9);
          var13 = ((id) this).field_A.field_J.field_b * Math.cos(var9);
          ((id) this).field_qb = var11;
          var15 = ((id) this).field_A.field_x.a((byte) 78, ((id) this).field_C);
          if (var7 > var15) {
            var7 = var15;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (Math.random() < var7 / var15) {
            ((id) this).field_R = 0.0;
            ((id) this).field_X = 1.5707963267948966;
            ((id) this).field_Db = Math.random() * var13;
            var17 = -var15 + (var7 + var15) * Math.random();
            var15 = Math.random() * (var15 - var7) + var7;
            ((id) this).field_ub = 0.5 * (var15 + var17);
            ((id) this).field_Z = (-var17 + var15) * 0.5;
            break L3;
          } else {
            ((id) this).field_X = 6.283185307179586 * Math.random();
            ((id) this).field_R = Math.random() * 0.2;
            ((id) this).field_Db = Math.random() * var13;
            ((id) this).field_ub = 0.0;
            ((id) this).field_Z = Math.random() * (var15 - var7) + var7;
            break L3;
          }
        }
        L4: {
          if (((id) this).field_Z < 0.001) {
            ((id) this).field_cb = 6.283185307179586 * Math.random();
            break L4;
          } else {
            var17 = (-((id) this).field_ub + var7) / ((id) this).field_Z;
            if (var17 < 1.0) {
              if (var17 <= -1.0) {
                ((id) this).field_cb = 3.141592653589793;
                break L4;
              } else {
                ((id) this).field_cb = Math.asin(var17);
                if (0.5 > Math.random()) {
                  break L4;
                } else {
                  ((id) this).field_cb = -((id) this).field_cb + 3.141592653589793;
                  break L4;
                }
              }
            } else {
              ((id) this).field_cb = 0.0;
              break L4;
            }
          }
        }
    }

    abstract pm h(byte param0);

    final void a(double param0, byte param1, double param2, double param3) {
        super.a(param0, param1, param2, param3);
        ((id) this).field_nb.a(param0, param3, param2, 100);
    }

    final static void a(kg param0, java.math.BigInteger param1, int param2, int param3, byte[] param4, java.math.BigInteger param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Confined.field_J ? 1 : 0;
          var7 = jk.a((byte) 125, param6);
          if (on.field_d != null) {
            break L0;
          } else {
            on.field_d = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L2: {
              L3: {
                if (null == jf.field_b) {
                  break L3;
                } else {
                  if (var7 > jf.field_b.field_m.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              jf.field_b = new kg(var7);
              break L2;
            }
            L4: {
              L5: {
                jf.field_b.field_n = 0;
                jf.field_b.a(param6, param3, param4, 109);
                jf.field_b.a(var7, (byte) 25);
                jf.field_b.a(65280, var15);
                if (null == pc.field_j) {
                  break L5;
                } else {
                  if (100 > pc.field_j.field_m.length) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              pc.field_j = new kg(100);
              break L4;
            }
            pc.field_j.field_n = 0;
            pc.field_j.f(117, 10);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if ((var11 ^ -1) <= -5) {
                L7: {
                  pc.field_j.c(param6, 8);
                  pc.field_j.a(param1, 0, param5);
                  if (param2 > 29) {
                    break L7;
                  } else {
                    field_rb = 41;
                    break L7;
                  }
                }
                param0.a(pc.field_j.field_n, 0, pc.field_j.field_m, 93);
                param0.a(jf.field_b.field_n, 0, jf.field_b.field_m, 127);
                return;
              } else {
                pc.field_j.d(-126, var15[var11]);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = on.field_d.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final void a(pm param0, int param1) {
        if (param1 >= -81) {
            ((id) this).a(-0.8161853895945157, (byte) -4, -0.33336518185274866, 0.5249105804573666);
        }
        param0.a(true, (ee) this);
    }

    final double[] e(int param0) {
        if (param0 != 3008) {
            ((id) this).field_db = true;
        }
        return ((id) this).field_nb.a(16777215);
    }

    final void d(int param0, int param1) {
        double var3 = ((id) this).field_ub + ((id) this).field_Z * Math.sin(((id) this).field_cb);
        if (param1 >= -52) {
            ((id) this).a(110, (byte) -60);
        }
        ((id) this).field_A.field_x.b(3, param0, ((id) this).field_D);
        ((id) this).field_E = ((id) this).field_A.field_x.field_B + var3 * Math.sin(((id) this).field_hb);
        ((id) this).field_t = ((id) this).field_A.field_x.field_G - var3 * Math.cos(((id) this).field_hb);
        ((id) this).m(12);
        var3 = ((id) this).field_ub + ((id) this).field_Z * Math.sin(((id) this).field_cb);
        ((id) this).field_A.field_x.b(3, param0, ((id) this).field_L + ((id) this).field_D);
        ((id) this).field_K = ((id) this).field_A.field_x.field_B + var3 * Math.sin(((id) this).field_hb) - ((id) this).field_E;
        ((id) this).field_G = ((id) this).field_A.field_x.field_G - Math.cos(((id) this).field_hb) * var3 - ((id) this).field_t;
        if (((id) this).field_yb) {
            ((id) this).a(0.0, 1.0, false, 0.0);
        }
        if (!(!((id) this).field_gb)) {
            ((id) this).b(0.0, true, 0.0, 1.0);
        }
    }

    final void a(double param0, double param1, boolean param2, double param3) {
        ((id) this).field_yb = true;
        double var8 = ((id) this).field_A.field_B.field_Lb.field_i - ((id) this).field_E;
        double var10 = -((id) this).field_t + ((id) this).field_A.field_B.field_Lb.field_f;
        double var12 = ((id) this).field_A.field_B.field_Lb.field_j - ((id) this).field_D;
        this.a(param3, var8, (byte) 121, var12, var10, param0, param1);
        if (param2) {
            Object var14 = null;
            boolean discarded$0 = ((id) this).a(false, (pm) null);
        }
    }

    void a(mn param0, byte param1) {
        ((id) this).field_fb.a(-104, param0);
        int var3 = 70 / ((-2 - param1) / 62);
    }

    final boolean a(boolean param0, pm param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            ((id) this).a(0.3696081545462991, -1.49477050488514, 0.3668563040992294, -1.7765318072222878, -0.8734525371023923, (byte) -19, 1.6304989655706312, 1.0689660871787772, 0.6101916020456307);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-129 >= (((id) this).field_ob ^ -1)) {
              break L2;
            } else {
              if (!param1.f(-63)) {
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
        return stackIn_6_0 != 0;
    }

    final static gj a(int param0, df param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var9 = af.a(param4, param5, param3, param2, param1, 23221);
        java.awt.Frame var6 = var9;
        if (var9 == null) {
            return null;
        }
        if (param0 != 2401) {
            Object var8 = null;
            gj discarded$0 = id.a(62, (df) null, 51, -70, 79, 121);
        }
        gj var7 = new gj();
        var7.field_e = var9;
        java.awt.Component discarded$1 = var7.field_e.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param2, param5);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    abstract pm i(byte param0);

    abstract void a(int param0, byte param1);

    final boolean c(int param0) {
        if (param0 != 5) {
            return false;
        }
        return true;
    }

    private final void a(double param0, boolean param1, double param2, double param3) {
        double[] var8 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double[] var25 = null;
        double[] var26 = null;
        double[] var27 = null;
        double[] var28 = null;
        double[] var29 = null;
        L0: {
          var29 = new double[12];
          var28 = var29;
          var27 = var28;
          var26 = var27;
          var25 = var26;
          var8 = var25;
          ((id) this).field_Eb.a((byte) 75, var29);
          var9 = var29[9] * ((id) this).field_Cb + (var29[3] * ((id) this).field_bb + var29[6] * ((id) this).field_U);
          var11 = ((id) this).field_Cb * var29[10] + (var29[4] * ((id) this).field_bb + var29[7] * ((id) this).field_U);
          var13 = ((id) this).field_Cb * var29[11] + (var29[5] * ((id) this).field_bb + var29[8] * ((id) this).field_U);
          if (!param1) {
            break L0;
          } else {
            ((id) this).d(123, -65);
            break L0;
          }
        }
        L1: {
          var15 = -(var13 * param3) + param2 * var11;
          var17 = -(var9 * param2) + param0 * var13;
          var19 = -(param0 * var11) + param3 * var9;
          var21 = Math.sqrt(var19 * var19 + (var17 * var17 + var15 * var15));
          if (var21 >= 0.0001) {
            L2: {
              var19 = var19 / var21;
              var15 = var15 / var21;
              var17 = var17 / var21;
              var23 = Math.atan2(var21, var11 * param3 + var9 * param0 + var13 * param2);
              if (0.1 < var23) {
                var23 = 0.1;
                break L2;
              } else {
                break L2;
              }
            }
            hd.field_e.a(var23, var19, var15, var17, 7);
            ((id) this).field_Eb.a(-100, hd.field_e);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void c(byte param0, int param1) {
        ((id) this).field_fb.a(((id) this).field_nb, 3);
        ((id) this).field_Eb.a(-51, ((id) this).field_tb);
        ((id) this).field_K = ((id) this).field_K * 0.998;
        ((id) this).field_L = ((id) this).field_L * 0.998;
        ((id) this).field_G = ((id) this).field_G * 0.998;
        int var3 = -11 / ((param0 - 37) / 43);
        super.a(11878, param1);
        ((id) this).field_nb.c(16777215);
        if (((id) this).field_ob > 0) {
            ((id) this).field_ob = ((id) this).field_ob - 16;
        }
        if (128 > ((id) this).field_ob) {
            ((id) this).field_nb.b(118);
        }
    }

    final void l(int param0) {
        ((id) this).field_mb = new hm((pm) this, ca.field_r);
        ((id) this).field_pb = new gk((pm) this, nm.field_F);
        if (param0 != 22475) {
            ((id) this).field_vb = true;
        }
        ((id) this).field_pb.field_m = 0;
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            ((id) this).field_mb = null;
            return false;
        }
        return false;
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            return false;
        }
        return param0.f(-59);
    }

    private final void a(double param0, double param1, byte param2, double param3, double param4, double param5, double param6) {
        double[] var14 = null;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double[] var32 = null;
        double[] var33 = null;
        double[] var34 = null;
        double[] var35 = null;
        double[] var36 = null;
        L0: {
          ((id) this).field_bb = param5;
          ((id) this).field_U = param0;
          ((id) this).field_Cb = param6;
          var36 = new double[12];
          var35 = var36;
          var34 = var35;
          var33 = var34;
          var32 = var33;
          var14 = var32;
          ((id) this).field_Eb.a((byte) 41, var36);
          var15 = var36[6] * param0 + param5 * var36[3] + var36[9] * param6;
          var21 = -66 % ((54 - param2) / 63);
          var17 = param6 * var36[10] + (param0 * var36[7] + var36[4] * param5);
          var19 = var36[11] * param6 + (param5 * var36[5] + param0 * var36[8]);
          var22 = -(param4 * var19) + var17 * param3;
          var24 = param1 * var19 - param3 * var15;
          var26 = param4 * var15 - var17 * param1;
          var28 = Math.sqrt(var24 * var24 + var22 * var22 + var26 * var26);
          if (var28 >= 0.0001) {
            var26 = var26 / var28;
            var22 = var22 / var28;
            var24 = var24 / var28;
            var30 = Math.atan2(var28, var19 * param3 + (param1 * var15 + var17 * param4));
            hd.field_e.a(var30, var26, var22, var24, 7);
            ((id) this).field_Eb.a(-13, hd.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        var26 = param3;
        var22 = param1;
        var24 = param4;
        var28 = 1.0 / Math.sqrt(var26 * var26 + (var22 * var22 + var24 * var24));
        var24 = var24 * var28;
        var22 = var22 * var28;
        var26 = var26 * var28;
        var30 = 6.283185307179586 * Math.random();
        hd.field_e.a(var30, var26, var22, var24, 7);
        ((id) this).field_Eb.a(-40, hd.field_e);
    }

    id(hn param0, double param1, double param2, double param3, double param4, double param5, double param6, double param7, double param8, boolean param9, int param10, double param11, double param12) {
        super(param0, param1, param2, param3, param7, param8);
        ((id) this).field_Eb = new da();
        ((id) this).field_tb = new da();
        ((id) this).field_nb = new tf((ee) this);
        ((id) this).field_ib = new oi((pm) this);
        ((id) this).field_yb = false;
        ((id) this).field_eb = null;
        ((id) this).field_jb = 0;
        ((id) this).field_lb = 5.0;
        ((id) this).field_Q = 0.0;
        ((id) this).field_gb = false;
        ((id) this).field_K = param4;
        ((id) this).field_G = param5;
        ((id) this).field_L = param6;
        ((id) this).field_nb.b(118);
        ((id) this).field_fb = new ek((ee) this, false, param9, param10);
        ((id) this).field_xb = param11;
        ((id) this).field_T = param12;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            ((id) this).field_Q = 0.0065937605579924185;
        }
        return ((id) this).field_fb.a(0, false, param1, param2);
    }

    id(hn param0, double param1, double param2, double param3, int param4, double param5, double param6) {
        this(param0, 0.0, 0.0, param1, 0.0, 0.0, 0.0, param2, param3, true, param4, param5, param6);
        ((id) this).l(22475);
        ((id) this).field_lb = 2.0;
    }

    final void b(byte param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        L0: {
          var3 = ((id) this).field_ub + ((id) this).field_Z * Math.sin(((id) this).field_cb);
          ((id) this).field_A.field_x.b(3, param1, ((id) this).field_D);
          var5 = ((id) this).field_A.field_x.field_B + var3 * Math.sin(((id) this).field_hb);
          var7 = ((id) this).field_A.field_x.field_G - Math.cos(((id) this).field_hb) * var3;
          ((id) this).m(12);
          var3 = ((id) this).field_ub + ((id) this).field_Z * Math.sin(((id) this).field_cb);
          ((id) this).field_A.field_x.b(3, param1, ((id) this).field_L + ((id) this).field_D);
          var9 = ((id) this).field_A.field_x.field_B + Math.sin(((id) this).field_hb) * var3 - var5 + (var5 - ((id) this).field_E) * 0.1;
          var11 = ((id) this).field_A.field_x.field_G - Math.cos(((id) this).field_hb) * var3 - var7 + (-((id) this).field_t + var7) * 0.1;
          var9 = var9 - ((id) this).field_K;
          var11 = var11 - ((id) this).field_G;
          var15 = 6 / ((param0 - 58) / 35);
          var13 = Math.sqrt(var9 * var9 + var11 * var11);
          if (var13 <= 0.04) {
            var13 = 1.0;
            break L0;
          } else {
            var13 = 0.04 / var13;
            break L0;
          }
        }
        ((id) this).field_G = ((id) this).field_G + var11 * var13;
        ((id) this).field_K = ((id) this).field_K + var13 * var9;
    }

    final void b(double param0, boolean param1, double param2, double param3) {
        ((id) this).field_gb = param1 ? true : false;
        this.a(param0, 0.0, (byte) 119, -1.0, 0.0, param2, param3);
    }

    void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_39_2 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        af stackOut_38_2 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        uc stackOut_37_2 = null;
        L0: {
          L1: {
            var9 = Confined.field_J ? 1 : 0;
            if (((id) this).field_A.field_y) {
              break L1;
            } else {
              if (null != ((id) this).field_A.field_K) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((id) this).d(10797);
          break L0;
        }
        L2: {
          ((id) this).field_fb.a(((id) this).field_nb, param0 + -11875);
          if (((id) this).field_yb) {
            var3 = -((id) this).field_E + ((id) this).field_A.field_B.field_Lb.field_i;
            var5 = ((id) this).field_A.field_B.field_Lb.field_f - ((id) this).field_t;
            var7 = -((id) this).field_D + ((id) this).field_A.field_B.field_Lb.field_j;
            this.a(var3, false, var7, var5);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          ((id) this).field_Eb.a(-101, ((id) this).field_tb);
          if (!((id) this).field_S) {
            ((id) this).field_V = 0;
            ((id) this).a(param1, (byte) 120);
            if (!((id) this).field_ab) {
              break L3;
            } else {
              var3 = 0.01 * (((id) this).field_xb + ((id) this).field_A.field_B.field_Lb.field_j - ((id) this).field_D);
              if (var3 < 0.0) {
                break L3;
              } else {
                L4: {
                  if (0.01 < var3) {
                    var3 = 0.01;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((id) this).field_L = ((id) this).field_L + var3;
                break L3;
              }
            }
          } else {
            ((id) this).field_V = ((id) this).field_V + 1;
            ((id) this).b((pm) (Object) ((id) this).field_A.field_B, (byte) 106);
            ((id) this).a(false, ((id) this).field_T, param0 + 15993);
            break L3;
          }
        }
        L5: {
          if (((id) this).field_gb) {
            this.a(((id) this).field_K, false, -0.05 + ((id) this).field_L, ((id) this).field_G);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          ((id) this).field_L = ((id) this).field_L * 0.98;
          ((id) this).field_K = ((id) this).field_K * 0.98;
          ((id) this).field_G = ((id) this).field_G * 0.98;
          super.a(param0, param1);
          ((id) this).field_nb.c(param0 ^ 16765337);
          if ((((id) this).field_wb ^ -1) >= -1) {
            if (0 >= ((id) this).field_sb) {
              break L6;
            } else {
              ((id) this).field_W = ((id) this).field_W - 1;
              if (((id) this).field_W == 0) {
                ((id) this).field_W = ((id) this).field_sb;
                ((id) this).field_nb.b(118);
                ri.a((rk) this, param0 + -11878, (rk) (Object) ((id) this).i((byte) 96));
                break L6;
              } else {
                if (0 >= ((id) this).field_sb) {
                  break L6;
                } else {
                  ((id) this).field_W = ((id) this).field_W - 1;
                  if (((id) this).field_W != 0) {
                    break L6;
                  } else {
                    ((id) this).field_W = ((id) this).field_sb;
                    ((id) this).field_nb.b(118);
                    ri.a((rk) this, param0 + -11878, (rk) (Object) ((id) this).i((byte) 96));
                    break L6;
                  }
                }
              }
            }
          } else {
            if (0 >= ((id) this).field_sb) {
              break L6;
            } else {
              ((id) this).field_W = ((id) this).field_W - 1;
              if (((id) this).field_W == 0) {
                ((id) this).field_W = ((id) this).field_sb;
                ((id) this).field_nb.b(118);
                ri.a((rk) this, param0 + -11878, (rk) (Object) ((id) this).i((byte) 96));
                break L6;
              } else {
                if (0 >= ((id) this).field_sb) {
                  break L6;
                } else {
                  ((id) this).field_W = ((id) this).field_W - 1;
                  if (((id) this).field_W != 0) {
                    break L6;
                  } else {
                    ((id) this).field_W = ((id) this).field_sb;
                    ((id) this).field_nb.b(118);
                    ri.a((rk) this, param0 + -11878, (rk) (Object) ((id) this).i((byte) 96));
                    break L6;
                  }
                }
              }
            }
          }
        }
        L7: {
          if (-1 <= (((id) this).field_jb ^ -1)) {
            if ((((id) this).field_Ab ^ -1) >= -1) {
              break L7;
            } else {
              if (Math.random() >= 0.01) {
                break L7;
              } else {
                L8: {
                  ((id) this).field_jb = 50;
                  stackOut_36_0 = this;
                  stackOut_36_1 = 0;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (((id) this).field_Ab == 1) {
                    stackOut_38_0 = this;
                    stackOut_38_1 = stackIn_38_1;
                    stackOut_38_2 = new af(((id) this).field_A, (ee) this, ((id) this).field_Eb);
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = (Object) (Object) stackOut_38_2;
                    break L8;
                  } else {
                    stackOut_37_0 = this;
                    stackOut_37_1 = stackIn_37_1;
                    stackOut_37_2 = new uc(((id) this).field_A, (ee) this, ((id) this).field_Eb);
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = (Object) (Object) stackOut_37_2;
                    break L8;
                  }
                }
                ri.a((rk) this, stackIn_39_1, (rk) (Object) stackIn_39_2);
                ((id) this).field_nb.b(param0 ^ 11792);
                break L7;
              }
            }
          } else {
            ((id) this).field_jb = ((id) this).field_jb - 1;
            break L7;
          }
        }
        L9: {
          if (((id) this).field_vb) {
            L10: {
              ((id) this).field_Q = ((id) this).field_Q * 0.92;
              ((id) this).field_mb.a(16736448, param0 ^ 11878, 50.0, 0.5);
              if (!((id) this).field_mb.a((hm[]) null, false, ((id) this).field_lb)) {
                break L10;
              } else {
                ((id) this).field_nb.b(param0 + -11760);
                ((id) this).field_A.field_F.a((rk) (Object) ((id) this).field_mb, (byte) -84);
                ((id) this).field_Q = ((id) this).field_Q + 4.0;
                break L10;
              }
            }
            ((id) this).field_pb.field_m = (int)(Math.sqrt(((id) this).field_Q) * 16.0);
            break L9;
          } else {
            break L9;
          }
        }
        L11: {
          if (((id) this).field_kb) {
            if ((((id) this).field_ob ^ -1) > -257) {
              ((id) this).field_ob = ((id) this).field_ob + 16;
              break L11;
            } else {
              break L11;
            }
          } else {
            if (((id) this).field_ob <= 0) {
              break L11;
            } else {
              ((id) this).field_ob = ((id) this).field_ob - 16;
              break L11;
            }
          }
        }
        L12: {
          if ((((id) this).field_ob ^ -1) > -129) {
            ((id) this).field_nb.b(118);
            break L12;
          } else {
            break L12;
          }
        }
        L13: while (true) {
          L14: {
            if (((id) this).field_eb != null) {
              if (((id) this).field_eb.o(640)) {
                ((id) this).field_eb = ((id) this).field_eb.field_eb;
                continue L13;
              } else {
                if (((id) this).field_ab) {
                  break L14;
                } else {
                  if (((id) this).field_D >= 0.0) {
                    break L14;
                  } else {
                    if (((id) this).field_eb != null) {
                      break L14;
                    } else {
                      ((id) this).field_s = 2;
                      ((id) this).field_z = true;
                      break L14;
                    }
                  }
                }
              }
            } else {
              if (((id) this).field_ab) {
                break L14;
              } else {
                if (((id) this).field_D >= 0.0) {
                  break L14;
                } else {
                  if (((id) this).field_eb != null) {
                    break L14;
                  } else {
                    ((id) this).field_s = 2;
                    ((id) this).field_z = true;
                    break L14;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final static void c(int param0, int param1) {
        int var3 = Confined.field_J ? 1 : 0;
        bj var5 = (bj) (Object) lf.field_k.a(-124);
        while (var5 != null) {
            lf.a(param1, 74, var5);
            var5 = (bj) (Object) lf.field_k.d(2123);
        }
        if (param0 != -1) {
            Object var4 = null;
            gj discarded$0 = id.a(-71, (df) null, 89, -73, -25, -28);
        }
        qn var2 = (qn) (Object) na.field_T.a(59);
        while (var2 != null) {
            dh.a(param1, var2, param0 ^ -21822);
            var2 = (qn) (Object) na.field_T.d(2123);
        }
    }

    final void m(int param0) {
        int var4 = Confined.field_J ? 1 : 0;
        double var2 = ((id) this).field_Db * Math.sin(((id) this).field_X);
        if (param0 != 12) {
            ((id) this).field_yb = false;
        }
        ((id) this).field_hb = ((id) this).field_hb + var2;
        while (((id) this).field_hb >= 6.283185307179586) {
            ((id) this).field_hb = ((id) this).field_hb - 6.283185307179586;
        }
        while (((id) this).field_hb < 0.0) {
            ((id) this).field_hb = ((id) this).field_hb + 6.283185307179586;
        }
        ((id) this).field_cb = ((id) this).field_cb + ((id) this).field_qb;
        while (((id) this).field_cb >= 6.283185307179586) {
            ((id) this).field_cb = ((id) this).field_cb - 6.283185307179586;
        }
        while (0.0 > ((id) this).field_cb) {
            ((id) this).field_cb = ((id) this).field_cb + 6.283185307179586;
        }
        ((id) this).field_X = ((id) this).field_X + ((id) this).field_R;
        while (((id) this).field_X >= 6.283185307179586) {
            ((id) this).field_X = ((id) this).field_X - 6.283185307179586;
        }
        while (((id) this).field_X < 0.0) {
            ((id) this).field_X = ((id) this).field_X + 6.283185307179586;
        }
    }

    final void a(double param0, double param1, double param2, double param3, double param4, byte param5, double param6, double param7, double param8) {
        param4 = param4 * 6.283185307179586;
        double var18 = param1 * Math.sin(param4);
        if (param5 < 24) {
            ((id) this).field_jb = -4;
        }
        double var20 = Math.cos(param4) * param1;
        ((id) this).field_hb = param6 * 6.283185307179586;
        if (param8 < 0.5) {
            ((id) this).field_ub = param7 * param0;
            ((id) this).field_qb = var18;
            ((id) this).field_cb = 6.283185307179586 * param2;
            ((id) this).field_Z = -((id) this).field_ub + param7;
            ((id) this).field_X = 1.5707963267948966;
            ((id) this).field_R = 0.0;
            ((id) this).field_Db = param3 * var20;
        } else {
            ((id) this).field_qb = var18;
            ((id) this).field_R = 0.2 * param3;
            ((id) this).field_Db = var20 * param3;
            ((id) this).field_cb = param2 * 6.283185307179586;
            ((id) this).field_X = param0 * 6.283185307179586;
            ((id) this).field_ub = 0.0;
            ((id) this).field_Z = param7;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rb = -1;
    }
}
