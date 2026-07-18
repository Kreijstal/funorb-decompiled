/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends ee {
    static String field_W;
    static int field_gb;
    static String field_Ib;
    da field_jb;
    private da field_Jb;
    int field_yb;
    ek field_Bb;
    tf field_Lb;
    int field_R;
    int field_Hb;
    int field_ib;
    boolean field_mb;
    private int field_Qb;
    boolean field_eb;
    boolean field_Eb;
    boolean field_Sb;
    boolean field_Rb;
    int field_tb;
    int field_ub;
    private kh[] field_Ab;
    h[] field_Nb;
    private double[] field_bb;
    boolean field_cb;
    boolean field_hb;
    int field_Pb;
    boolean field_T;
    private int field_kb;
    private int field_Kb;
    private gk field_wb;
    private gk field_Y;
    boolean field_Ob;
    int field_ab;
    private int field_Z;
    boolean field_rb;
    private gk field_Cb;
    int field_zb;
    private boolean field_Mb;
    boolean field_nb;
    boolean field_sb;
    int field_U;
    boolean field_X;
    int field_Gb;
    double field_Db;
    private gk field_V;
    private int field_Q;
    private hm field_S;
    private gk field_db;
    private int field_fb;
    private int field_lb;
    private oi field_qb;
    private oi field_pb;
    private int field_ob;
    private int field_xb;
    private boolean field_Fb;
    private boolean field_vb;

    final boolean o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        h var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        if (param0 <= -84) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= 5) {
              L1: {
                if (var2 == 0) {
                  break L1;
                } else {
                  if (var3 != 5) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ((dj) this).field_A.field_J.field_o;
                      if (((dj) this).field_A.field_x.field_t <= 0) {
                        break L2;
                      } else {
                        if (((dj) this).field_A.field_B.field_D >= ((dj) this).field_A.field_x.field_r[((dj) this).field_A.field_x.field_t]) {
                          break L2;
                        } else {
                          var4--;
                          break L2;
                        }
                      }
                    }
                    if (var4 > 8) {
                      if (12 >= var4) {
                        di.a(-30867, 247, 8);
                        break L1;
                      } else {
                        if (var4 <= 16) {
                          di.a(-30867, 248, 7);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      di.a(-30867, 246, 9);
                      break L1;
                    }
                  }
                }
              }
              return var2 != 0;
            } else {
              L3: {
                if (var2 != 0) {
                  break L3;
                } else {
                  if (((dj) this).field_Nb[var4] == null) {
                    var5 = new h(((dj) this).field_A, (dj) this, var4);
                    ri.a((rk) this, 0, (rk) (Object) var5);
                    ((dj) this).field_Nb[var4] = var5;
                    var2 = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (null != ((dj) this).field_Nb[var4]) {
                var3++;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    dj(hn param0) {
        super(param0, 0.0, 0.0, 5.0, 0.3, 0.1);
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((dj) this).field_jb = new da();
        ((dj) this).field_Jb = new da();
        ((dj) this).field_yb = 2;
        ((dj) this).field_Bb = new ek((ee) this, true, false, 8);
        ((dj) this).field_Lb = new tf((ee) this);
        ((dj) this).field_Hb = 65536;
        ((dj) this).field_Rb = true;
        ((dj) this).field_R = 0;
        ((dj) this).field_T = true;
        ((dj) this).field_cb = false;
        ((dj) this).field_Kb = 0;
        ((dj) this).field_ub = -1;
        ((dj) this).field_Sb = false;
        ((dj) this).field_Z = 0;
        ((dj) this).field_bb = new double[12];
        ((dj) this).field_ib = 0;
        ((dj) this).field_Pb = 0;
        ((dj) this).field_Eb = false;
        ((dj) this).field_rb = false;
        ((dj) this).field_mb = false;
        ((dj) this).field_ab = -1;
        ((dj) this).field_kb = 0;
        ((dj) this).field_tb = -1;
        ((dj) this).field_hb = true;
        ((dj) this).field_Y = null;
        ((dj) this).field_Qb = 0;
        ((dj) this).field_eb = false;
        ((dj) this).field_wb = null;
        ((dj) this).field_zb = -1;
        ((dj) this).field_Ob = true;
        ((dj) this).field_Nb = new h[5];
        ((dj) this).field_sb = true;
        ((dj) this).field_nb = true;
        ((dj) this).field_Mb = false;
        ((dj) this).field_Gb = 0;
        ((dj) this).field_U = 0;
        ((dj) this).field_Ab = new kh[]{new kh((pm) this, hf.field_T, 0), new kh((pm) this, hf.field_T, 53), new kh((pm) this, hf.field_T, 134), new kh((pm) this, hf.field_T, 231)};
        ((dj) this).field_Db = 0.0;
        ((dj) this).field_Q = 0;
        ((dj) this).field_S = new hm((pm) this, ki.field_a);
        ((dj) this).field_fb = 0;
        ((dj) this).field_lb = 0;
        ((dj) this).field_qb = new oi((pm) this);
        ((dj) this).field_pb = new oi((pm) this);
        ((dj) this).field_ob = 0;
        ((dj) this).field_vb = false;
        ((dj) this).field_Fb = false;
        try {
          L0: {
            ((dj) this).field_db = new gk((pm) this, se.field_a);
            ((dj) this).field_db.field_m = 0;
            ((dj) this).field_V = new gk((pm) this, nm.field_F);
            ((dj) this).field_V.field_m = 0;
            ((dj) this).field_Cb = new gk((pm) this, di.field_a);
            ((dj) this).field_Cb.field_m = 12;
            ((dj) this).field_Bb.field_d = 0;
            ((dj) this).field_L = 0.0;
            ((dj) this).field_Lb.b(118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("dj.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void n() {
        field_W = null;
        field_Ib = null;
    }

    final static Boolean i() {
        Boolean var1 = ca.field_o;
        ca.field_o = null;
        return var1;
    }

    final void a(int param0, int param1) {
        double[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        pm var11_ref_pm = null;
        double var12_double = 0.0;
        Object var12_ref_Object = null;
        int var12 = 0;
        double var13_double = 0.0;
        int var13_int = 0;
        h var13 = null;
        double var14 = 0.0;
        h var14_ref_h = null;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        double var18_double = 0.0;
        int var18 = 0;
        h var19 = null;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        Throwable var30 = null;
        Throwable var31 = null;
        int var32 = 0;
        double[] var33 = null;
        h var34 = null;
        int var35 = 0;
        double[] var36 = null;
        double[] var37 = null;
        h var38 = null;
        h var39 = null;
        double[] var40 = null;
        double[] var41 = null;
        double[] var42 = null;
        double[] var43 = null;
        double[] var44 = null;
        double[] var45 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        cf stackIn_92_2 = null;
        cf stackIn_92_3 = null;
        hn stackIn_92_4 = null;
        Object stackIn_92_5 = null;
        double[] stackIn_92_6 = null;
        double[] stackIn_92_7 = null;
        double stackIn_92_8 = 0.0;
        double stackIn_92_9 = 0.0;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        cf stackIn_93_2 = null;
        cf stackIn_93_3 = null;
        hn stackIn_93_4 = null;
        Object stackIn_93_5 = null;
        double[] stackIn_93_6 = null;
        double[] stackIn_93_7 = null;
        double stackIn_93_8 = 0.0;
        double stackIn_93_9 = 0.0;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        cf stackIn_94_2 = null;
        cf stackIn_94_3 = null;
        hn stackIn_94_4 = null;
        Object stackIn_94_5 = null;
        double[] stackIn_94_6 = null;
        double[] stackIn_94_7 = null;
        double stackIn_94_8 = 0.0;
        double stackIn_94_9 = 0.0;
        int stackIn_94_10 = 0;
        Object stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        cf stackIn_95_2 = null;
        cf stackIn_95_3 = null;
        hn stackIn_95_4 = null;
        Object stackIn_95_5 = null;
        double[] stackIn_95_6 = null;
        double[] stackIn_95_7 = null;
        double stackIn_95_8 = 0.0;
        double stackIn_95_9 = 0.0;
        int stackIn_95_10 = 0;
        boolean stackIn_95_11 = false;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        cf stackIn_96_2 = null;
        cf stackIn_96_3 = null;
        hn stackIn_96_4 = null;
        Object stackIn_96_5 = null;
        double[] stackIn_96_6 = null;
        double[] stackIn_96_7 = null;
        double stackIn_96_8 = 0.0;
        double stackIn_96_9 = 0.0;
        int stackIn_96_10 = 0;
        boolean stackIn_96_11 = false;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        cf stackIn_97_2 = null;
        cf stackIn_97_3 = null;
        hn stackIn_97_4 = null;
        Object stackIn_97_5 = null;
        double[] stackIn_97_6 = null;
        double[] stackIn_97_7 = null;
        double stackIn_97_8 = 0.0;
        double stackIn_97_9 = 0.0;
        int stackIn_97_10 = 0;
        boolean stackIn_97_11 = false;
        int stackIn_97_12 = 0;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        Object stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        cf stackIn_103_2 = null;
        cf stackIn_103_3 = null;
        hn stackIn_103_4 = null;
        Object stackIn_103_5 = null;
        double[] stackIn_103_6 = null;
        double[] stackIn_103_7 = null;
        double stackIn_103_8 = 0.0;
        double stackIn_103_9 = 0.0;
        Object stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        cf stackIn_104_2 = null;
        cf stackIn_104_3 = null;
        hn stackIn_104_4 = null;
        Object stackIn_104_5 = null;
        double[] stackIn_104_6 = null;
        double[] stackIn_104_7 = null;
        double stackIn_104_8 = 0.0;
        double stackIn_104_9 = 0.0;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        cf stackIn_105_2 = null;
        cf stackIn_105_3 = null;
        hn stackIn_105_4 = null;
        Object stackIn_105_5 = null;
        double[] stackIn_105_6 = null;
        double[] stackIn_105_7 = null;
        double stackIn_105_8 = 0.0;
        double stackIn_105_9 = 0.0;
        int stackIn_105_10 = 0;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        cf stackIn_106_2 = null;
        cf stackIn_106_3 = null;
        hn stackIn_106_4 = null;
        Object stackIn_106_5 = null;
        double[] stackIn_106_6 = null;
        double[] stackIn_106_7 = null;
        double stackIn_106_8 = 0.0;
        double stackIn_106_9 = 0.0;
        int stackIn_106_10 = 0;
        int stackIn_106_11 = 0;
        Object stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        cf stackIn_107_2 = null;
        cf stackIn_107_3 = null;
        hn stackIn_107_4 = null;
        Object stackIn_107_5 = null;
        double[] stackIn_107_6 = null;
        double[] stackIn_107_7 = null;
        double stackIn_107_8 = 0.0;
        double stackIn_107_9 = 0.0;
        int stackIn_107_10 = 0;
        int stackIn_107_11 = 0;
        Object stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        cf stackIn_108_2 = null;
        cf stackIn_108_3 = null;
        hn stackIn_108_4 = null;
        Object stackIn_108_5 = null;
        double[] stackIn_108_6 = null;
        double[] stackIn_108_7 = null;
        double stackIn_108_8 = 0.0;
        double stackIn_108_9 = 0.0;
        int stackIn_108_10 = 0;
        int stackIn_108_11 = 0;
        int stackIn_108_12 = 0;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        cf stackIn_109_2 = null;
        cf stackIn_109_3 = null;
        hn stackIn_109_4 = null;
        Object stackIn_109_5 = null;
        double[] stackIn_109_6 = null;
        double[] stackIn_109_7 = null;
        double stackIn_109_8 = 0.0;
        double stackIn_109_9 = 0.0;
        Object stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        cf stackIn_110_2 = null;
        cf stackIn_110_3 = null;
        hn stackIn_110_4 = null;
        Object stackIn_110_5 = null;
        double[] stackIn_110_6 = null;
        double[] stackIn_110_7 = null;
        double stackIn_110_8 = 0.0;
        double stackIn_110_9 = 0.0;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        cf stackIn_111_2 = null;
        cf stackIn_111_3 = null;
        hn stackIn_111_4 = null;
        Object stackIn_111_5 = null;
        double[] stackIn_111_6 = null;
        double[] stackIn_111_7 = null;
        double stackIn_111_8 = 0.0;
        double stackIn_111_9 = 0.0;
        int stackIn_111_10 = 0;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        cf stackIn_112_2 = null;
        cf stackIn_112_3 = null;
        hn stackIn_112_4 = null;
        Object stackIn_112_5 = null;
        double[] stackIn_112_6 = null;
        double[] stackIn_112_7 = null;
        double stackIn_112_8 = 0.0;
        double stackIn_112_9 = 0.0;
        int stackIn_112_10 = 0;
        int stackIn_112_11 = 0;
        Object stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        cf stackIn_113_2 = null;
        cf stackIn_113_3 = null;
        hn stackIn_113_4 = null;
        Object stackIn_113_5 = null;
        double[] stackIn_113_6 = null;
        double[] stackIn_113_7 = null;
        double stackIn_113_8 = 0.0;
        double stackIn_113_9 = 0.0;
        int stackIn_113_10 = 0;
        int stackIn_113_11 = 0;
        Object stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        cf stackIn_114_2 = null;
        cf stackIn_114_3 = null;
        hn stackIn_114_4 = null;
        Object stackIn_114_5 = null;
        double[] stackIn_114_6 = null;
        double[] stackIn_114_7 = null;
        double stackIn_114_8 = 0.0;
        double stackIn_114_9 = 0.0;
        int stackIn_114_10 = 0;
        int stackIn_114_11 = 0;
        int stackIn_114_12 = 0;
        Object stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        cf stackIn_115_2 = null;
        cf stackIn_115_3 = null;
        hn stackIn_115_4 = null;
        Object stackIn_115_5 = null;
        double[] stackIn_115_6 = null;
        double[] stackIn_115_7 = null;
        double stackIn_115_8 = 0.0;
        double stackIn_115_9 = 0.0;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        cf stackIn_116_2 = null;
        cf stackIn_116_3 = null;
        hn stackIn_116_4 = null;
        Object stackIn_116_5 = null;
        double[] stackIn_116_6 = null;
        double[] stackIn_116_7 = null;
        double stackIn_116_8 = 0.0;
        double stackIn_116_9 = 0.0;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        cf stackIn_117_2 = null;
        cf stackIn_117_3 = null;
        hn stackIn_117_4 = null;
        Object stackIn_117_5 = null;
        double[] stackIn_117_6 = null;
        double[] stackIn_117_7 = null;
        double stackIn_117_8 = 0.0;
        double stackIn_117_9 = 0.0;
        int stackIn_117_10 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        cf stackIn_118_2 = null;
        cf stackIn_118_3 = null;
        hn stackIn_118_4 = null;
        Object stackIn_118_5 = null;
        double[] stackIn_118_6 = null;
        double[] stackIn_118_7 = null;
        double stackIn_118_8 = 0.0;
        double stackIn_118_9 = 0.0;
        int stackIn_118_10 = 0;
        int stackIn_118_11 = 0;
        Object stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        cf stackIn_119_2 = null;
        cf stackIn_119_3 = null;
        hn stackIn_119_4 = null;
        Object stackIn_119_5 = null;
        double[] stackIn_119_6 = null;
        double[] stackIn_119_7 = null;
        double stackIn_119_8 = 0.0;
        double stackIn_119_9 = 0.0;
        int stackIn_119_10 = 0;
        int stackIn_119_11 = 0;
        Object stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        cf stackIn_120_2 = null;
        cf stackIn_120_3 = null;
        hn stackIn_120_4 = null;
        Object stackIn_120_5 = null;
        double[] stackIn_120_6 = null;
        double[] stackIn_120_7 = null;
        double stackIn_120_8 = 0.0;
        double stackIn_120_9 = 0.0;
        int stackIn_120_10 = 0;
        int stackIn_120_11 = 0;
        int stackIn_120_12 = 0;
        Object stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        cf stackIn_121_2 = null;
        cf stackIn_121_3 = null;
        hn stackIn_121_4 = null;
        Object stackIn_121_5 = null;
        double[] stackIn_121_6 = null;
        double[] stackIn_121_7 = null;
        double stackIn_121_8 = 0.0;
        double stackIn_121_9 = 0.0;
        Object stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        cf stackIn_122_2 = null;
        cf stackIn_122_3 = null;
        hn stackIn_122_4 = null;
        Object stackIn_122_5 = null;
        double[] stackIn_122_6 = null;
        double[] stackIn_122_7 = null;
        double stackIn_122_8 = 0.0;
        double stackIn_122_9 = 0.0;
        Object stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        cf stackIn_123_2 = null;
        cf stackIn_123_3 = null;
        hn stackIn_123_4 = null;
        Object stackIn_123_5 = null;
        double[] stackIn_123_6 = null;
        double[] stackIn_123_7 = null;
        double stackIn_123_8 = 0.0;
        double stackIn_123_9 = 0.0;
        int stackIn_123_10 = 0;
        Object stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        cf stackIn_124_2 = null;
        cf stackIn_124_3 = null;
        hn stackIn_124_4 = null;
        Object stackIn_124_5 = null;
        double[] stackIn_124_6 = null;
        double[] stackIn_124_7 = null;
        double stackIn_124_8 = 0.0;
        double stackIn_124_9 = 0.0;
        int stackIn_124_10 = 0;
        int stackIn_124_11 = 0;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        cf stackIn_125_2 = null;
        cf stackIn_125_3 = null;
        hn stackIn_125_4 = null;
        Object stackIn_125_5 = null;
        double[] stackIn_125_6 = null;
        double[] stackIn_125_7 = null;
        double stackIn_125_8 = 0.0;
        double stackIn_125_9 = 0.0;
        int stackIn_125_10 = 0;
        int stackIn_125_11 = 0;
        Object stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        cf stackIn_126_2 = null;
        cf stackIn_126_3 = null;
        hn stackIn_126_4 = null;
        Object stackIn_126_5 = null;
        double[] stackIn_126_6 = null;
        double[] stackIn_126_7 = null;
        double stackIn_126_8 = 0.0;
        double stackIn_126_9 = 0.0;
        int stackIn_126_10 = 0;
        int stackIn_126_11 = 0;
        int stackIn_126_12 = 0;
        Object stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        cf stackIn_132_2 = null;
        cf stackIn_132_3 = null;
        hn stackIn_132_4 = null;
        h stackIn_132_5 = null;
        double[] stackIn_132_6 = null;
        double[] stackIn_132_7 = null;
        double stackIn_132_8 = 0.0;
        double stackIn_132_9 = 0.0;
        Object stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        cf stackIn_133_2 = null;
        cf stackIn_133_3 = null;
        hn stackIn_133_4 = null;
        h stackIn_133_5 = null;
        double[] stackIn_133_6 = null;
        double[] stackIn_133_7 = null;
        double stackIn_133_8 = 0.0;
        double stackIn_133_9 = 0.0;
        Object stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        cf stackIn_134_2 = null;
        cf stackIn_134_3 = null;
        hn stackIn_134_4 = null;
        h stackIn_134_5 = null;
        double[] stackIn_134_6 = null;
        double[] stackIn_134_7 = null;
        double stackIn_134_8 = 0.0;
        double stackIn_134_9 = 0.0;
        int stackIn_134_10 = 0;
        Object stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        cf stackIn_135_2 = null;
        cf stackIn_135_3 = null;
        hn stackIn_135_4 = null;
        h stackIn_135_5 = null;
        double[] stackIn_135_6 = null;
        double[] stackIn_135_7 = null;
        double stackIn_135_8 = 0.0;
        double stackIn_135_9 = 0.0;
        int stackIn_135_10 = 0;
        int stackIn_135_11 = 0;
        Object stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        cf stackIn_136_2 = null;
        cf stackIn_136_3 = null;
        hn stackIn_136_4 = null;
        h stackIn_136_5 = null;
        double[] stackIn_136_6 = null;
        double[] stackIn_136_7 = null;
        double stackIn_136_8 = 0.0;
        double stackIn_136_9 = 0.0;
        int stackIn_136_10 = 0;
        int stackIn_136_11 = 0;
        Object stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        cf stackIn_137_2 = null;
        cf stackIn_137_3 = null;
        hn stackIn_137_4 = null;
        h stackIn_137_5 = null;
        double[] stackIn_137_6 = null;
        double[] stackIn_137_7 = null;
        double stackIn_137_8 = 0.0;
        double stackIn_137_9 = 0.0;
        int stackIn_137_10 = 0;
        int stackIn_137_11 = 0;
        int stackIn_137_12 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        bi stackIn_141_2 = null;
        int stackIn_153_0 = 0;
        Object stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        wm stackIn_162_2 = null;
        wm stackIn_162_3 = null;
        hn stackIn_162_4 = null;
        Object stackIn_162_5 = null;
        double[] stackIn_162_6 = null;
        double stackIn_162_7 = 0.0;
        Object stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        wm stackIn_163_2 = null;
        wm stackIn_163_3 = null;
        hn stackIn_163_4 = null;
        Object stackIn_163_5 = null;
        double[] stackIn_163_6 = null;
        double stackIn_163_7 = 0.0;
        Object stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        wm stackIn_164_2 = null;
        wm stackIn_164_3 = null;
        hn stackIn_164_4 = null;
        Object stackIn_164_5 = null;
        double[] stackIn_164_6 = null;
        double stackIn_164_7 = 0.0;
        int stackIn_164_8 = 0;
        int stackIn_187_0 = 0;
        Object stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        il stackIn_197_2 = null;
        il stackIn_197_3 = null;
        hn stackIn_197_4 = null;
        Object stackIn_197_5 = null;
        double[] stackIn_197_6 = null;
        double stackIn_197_7 = 0.0;
        Object stackIn_198_0 = null;
        int stackIn_198_1 = 0;
        il stackIn_198_2 = null;
        il stackIn_198_3 = null;
        hn stackIn_198_4 = null;
        Object stackIn_198_5 = null;
        double[] stackIn_198_6 = null;
        double stackIn_198_7 = 0.0;
        Object stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        il stackIn_199_2 = null;
        il stackIn_199_3 = null;
        hn stackIn_199_4 = null;
        Object stackIn_199_5 = null;
        double[] stackIn_199_6 = null;
        double stackIn_199_7 = 0.0;
        int stackIn_199_8 = 0;
        pm stackIn_223_0 = null;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        cf stackOut_91_2 = null;
        cf stackOut_91_3 = null;
        hn stackOut_91_4 = null;
        Object stackOut_91_5 = null;
        double[] stackOut_91_6 = null;
        double[] stackOut_91_7 = null;
        double stackOut_91_8 = 0.0;
        double stackOut_91_9 = 0.0;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        cf stackOut_93_2 = null;
        cf stackOut_93_3 = null;
        hn stackOut_93_4 = null;
        Object stackOut_93_5 = null;
        double[] stackOut_93_6 = null;
        double[] stackOut_93_7 = null;
        double stackOut_93_8 = 0.0;
        double stackOut_93_9 = 0.0;
        int stackOut_93_10 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        cf stackOut_92_2 = null;
        cf stackOut_92_3 = null;
        hn stackOut_92_4 = null;
        Object stackOut_92_5 = null;
        double[] stackOut_92_6 = null;
        double[] stackOut_92_7 = null;
        double stackOut_92_8 = 0.0;
        double stackOut_92_9 = 0.0;
        int stackOut_92_10 = 0;
        Object stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        cf stackOut_94_2 = null;
        cf stackOut_94_3 = null;
        hn stackOut_94_4 = null;
        Object stackOut_94_5 = null;
        double[] stackOut_94_6 = null;
        double[] stackOut_94_7 = null;
        double stackOut_94_8 = 0.0;
        double stackOut_94_9 = 0.0;
        int stackOut_94_10 = 0;
        boolean stackOut_94_11 = false;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        cf stackOut_96_2 = null;
        cf stackOut_96_3 = null;
        hn stackOut_96_4 = null;
        Object stackOut_96_5 = null;
        double[] stackOut_96_6 = null;
        double[] stackOut_96_7 = null;
        double stackOut_96_8 = 0.0;
        double stackOut_96_9 = 0.0;
        int stackOut_96_10 = 0;
        boolean stackOut_96_11 = false;
        int stackOut_96_12 = 0;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        cf stackOut_95_2 = null;
        cf stackOut_95_3 = null;
        hn stackOut_95_4 = null;
        Object stackOut_95_5 = null;
        double[] stackOut_95_6 = null;
        double[] stackOut_95_7 = null;
        double stackOut_95_8 = 0.0;
        double stackOut_95_9 = 0.0;
        int stackOut_95_10 = 0;
        boolean stackOut_95_11 = false;
        int stackOut_95_12 = 0;
        Object stackOut_97_0 = null;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        cf stackOut_102_2 = null;
        cf stackOut_102_3 = null;
        hn stackOut_102_4 = null;
        Object stackOut_102_5 = null;
        double[] stackOut_102_6 = null;
        double[] stackOut_102_7 = null;
        double stackOut_102_8 = 0.0;
        double stackOut_102_9 = 0.0;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        cf stackOut_104_2 = null;
        cf stackOut_104_3 = null;
        hn stackOut_104_4 = null;
        Object stackOut_104_5 = null;
        double[] stackOut_104_6 = null;
        double[] stackOut_104_7 = null;
        double stackOut_104_8 = 0.0;
        double stackOut_104_9 = 0.0;
        int stackOut_104_10 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        cf stackOut_103_2 = null;
        cf stackOut_103_3 = null;
        hn stackOut_103_4 = null;
        Object stackOut_103_5 = null;
        double[] stackOut_103_6 = null;
        double[] stackOut_103_7 = null;
        double stackOut_103_8 = 0.0;
        double stackOut_103_9 = 0.0;
        int stackOut_103_10 = 0;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        cf stackOut_105_2 = null;
        cf stackOut_105_3 = null;
        hn stackOut_105_4 = null;
        Object stackOut_105_5 = null;
        double[] stackOut_105_6 = null;
        double[] stackOut_105_7 = null;
        double stackOut_105_8 = 0.0;
        double stackOut_105_9 = 0.0;
        int stackOut_105_10 = 0;
        int stackOut_105_11 = 0;
        Object stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        cf stackOut_107_2 = null;
        cf stackOut_107_3 = null;
        hn stackOut_107_4 = null;
        Object stackOut_107_5 = null;
        double[] stackOut_107_6 = null;
        double[] stackOut_107_7 = null;
        double stackOut_107_8 = 0.0;
        double stackOut_107_9 = 0.0;
        int stackOut_107_10 = 0;
        int stackOut_107_11 = 0;
        int stackOut_107_12 = 0;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        cf stackOut_106_2 = null;
        cf stackOut_106_3 = null;
        hn stackOut_106_4 = null;
        Object stackOut_106_5 = null;
        double[] stackOut_106_6 = null;
        double[] stackOut_106_7 = null;
        double stackOut_106_8 = 0.0;
        double stackOut_106_9 = 0.0;
        int stackOut_106_10 = 0;
        int stackOut_106_11 = 0;
        int stackOut_106_12 = 0;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        cf stackOut_108_2 = null;
        cf stackOut_108_3 = null;
        hn stackOut_108_4 = null;
        Object stackOut_108_5 = null;
        double[] stackOut_108_6 = null;
        double[] stackOut_108_7 = null;
        double stackOut_108_8 = 0.0;
        double stackOut_108_9 = 0.0;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        cf stackOut_110_2 = null;
        cf stackOut_110_3 = null;
        hn stackOut_110_4 = null;
        Object stackOut_110_5 = null;
        double[] stackOut_110_6 = null;
        double[] stackOut_110_7 = null;
        double stackOut_110_8 = 0.0;
        double stackOut_110_9 = 0.0;
        int stackOut_110_10 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        cf stackOut_109_2 = null;
        cf stackOut_109_3 = null;
        hn stackOut_109_4 = null;
        Object stackOut_109_5 = null;
        double[] stackOut_109_6 = null;
        double[] stackOut_109_7 = null;
        double stackOut_109_8 = 0.0;
        double stackOut_109_9 = 0.0;
        int stackOut_109_10 = 0;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        cf stackOut_111_2 = null;
        cf stackOut_111_3 = null;
        hn stackOut_111_4 = null;
        Object stackOut_111_5 = null;
        double[] stackOut_111_6 = null;
        double[] stackOut_111_7 = null;
        double stackOut_111_8 = 0.0;
        double stackOut_111_9 = 0.0;
        int stackOut_111_10 = 0;
        int stackOut_111_11 = 0;
        Object stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        cf stackOut_113_2 = null;
        cf stackOut_113_3 = null;
        hn stackOut_113_4 = null;
        Object stackOut_113_5 = null;
        double[] stackOut_113_6 = null;
        double[] stackOut_113_7 = null;
        double stackOut_113_8 = 0.0;
        double stackOut_113_9 = 0.0;
        int stackOut_113_10 = 0;
        int stackOut_113_11 = 0;
        int stackOut_113_12 = 0;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        cf stackOut_112_2 = null;
        cf stackOut_112_3 = null;
        hn stackOut_112_4 = null;
        Object stackOut_112_5 = null;
        double[] stackOut_112_6 = null;
        double[] stackOut_112_7 = null;
        double stackOut_112_8 = 0.0;
        double stackOut_112_9 = 0.0;
        int stackOut_112_10 = 0;
        int stackOut_112_11 = 0;
        int stackOut_112_12 = 0;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        cf stackOut_114_2 = null;
        cf stackOut_114_3 = null;
        hn stackOut_114_4 = null;
        Object stackOut_114_5 = null;
        double[] stackOut_114_6 = null;
        double[] stackOut_114_7 = null;
        double stackOut_114_8 = 0.0;
        double stackOut_114_9 = 0.0;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        cf stackOut_116_2 = null;
        cf stackOut_116_3 = null;
        hn stackOut_116_4 = null;
        Object stackOut_116_5 = null;
        double[] stackOut_116_6 = null;
        double[] stackOut_116_7 = null;
        double stackOut_116_8 = 0.0;
        double stackOut_116_9 = 0.0;
        int stackOut_116_10 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        cf stackOut_115_2 = null;
        cf stackOut_115_3 = null;
        hn stackOut_115_4 = null;
        Object stackOut_115_5 = null;
        double[] stackOut_115_6 = null;
        double[] stackOut_115_7 = null;
        double stackOut_115_8 = 0.0;
        double stackOut_115_9 = 0.0;
        int stackOut_115_10 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        cf stackOut_117_2 = null;
        cf stackOut_117_3 = null;
        hn stackOut_117_4 = null;
        Object stackOut_117_5 = null;
        double[] stackOut_117_6 = null;
        double[] stackOut_117_7 = null;
        double stackOut_117_8 = 0.0;
        double stackOut_117_9 = 0.0;
        int stackOut_117_10 = 0;
        int stackOut_117_11 = 0;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        cf stackOut_119_2 = null;
        cf stackOut_119_3 = null;
        hn stackOut_119_4 = null;
        Object stackOut_119_5 = null;
        double[] stackOut_119_6 = null;
        double[] stackOut_119_7 = null;
        double stackOut_119_8 = 0.0;
        double stackOut_119_9 = 0.0;
        int stackOut_119_10 = 0;
        int stackOut_119_11 = 0;
        int stackOut_119_12 = 0;
        Object stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        cf stackOut_118_2 = null;
        cf stackOut_118_3 = null;
        hn stackOut_118_4 = null;
        Object stackOut_118_5 = null;
        double[] stackOut_118_6 = null;
        double[] stackOut_118_7 = null;
        double stackOut_118_8 = 0.0;
        double stackOut_118_9 = 0.0;
        int stackOut_118_10 = 0;
        int stackOut_118_11 = 0;
        int stackOut_118_12 = 0;
        Object stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        cf stackOut_120_2 = null;
        cf stackOut_120_3 = null;
        hn stackOut_120_4 = null;
        Object stackOut_120_5 = null;
        double[] stackOut_120_6 = null;
        double[] stackOut_120_7 = null;
        double stackOut_120_8 = 0.0;
        double stackOut_120_9 = 0.0;
        Object stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        cf stackOut_122_2 = null;
        cf stackOut_122_3 = null;
        hn stackOut_122_4 = null;
        Object stackOut_122_5 = null;
        double[] stackOut_122_6 = null;
        double[] stackOut_122_7 = null;
        double stackOut_122_8 = 0.0;
        double stackOut_122_9 = 0.0;
        int stackOut_122_10 = 0;
        Object stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        cf stackOut_121_2 = null;
        cf stackOut_121_3 = null;
        hn stackOut_121_4 = null;
        Object stackOut_121_5 = null;
        double[] stackOut_121_6 = null;
        double[] stackOut_121_7 = null;
        double stackOut_121_8 = 0.0;
        double stackOut_121_9 = 0.0;
        int stackOut_121_10 = 0;
        Object stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        cf stackOut_123_2 = null;
        cf stackOut_123_3 = null;
        hn stackOut_123_4 = null;
        Object stackOut_123_5 = null;
        double[] stackOut_123_6 = null;
        double[] stackOut_123_7 = null;
        double stackOut_123_8 = 0.0;
        double stackOut_123_9 = 0.0;
        int stackOut_123_10 = 0;
        int stackOut_123_11 = 0;
        Object stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        cf stackOut_125_2 = null;
        cf stackOut_125_3 = null;
        hn stackOut_125_4 = null;
        Object stackOut_125_5 = null;
        double[] stackOut_125_6 = null;
        double[] stackOut_125_7 = null;
        double stackOut_125_8 = 0.0;
        double stackOut_125_9 = 0.0;
        int stackOut_125_10 = 0;
        int stackOut_125_11 = 0;
        int stackOut_125_12 = 0;
        Object stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        cf stackOut_124_2 = null;
        cf stackOut_124_3 = null;
        hn stackOut_124_4 = null;
        Object stackOut_124_5 = null;
        double[] stackOut_124_6 = null;
        double[] stackOut_124_7 = null;
        double stackOut_124_8 = 0.0;
        double stackOut_124_9 = 0.0;
        int stackOut_124_10 = 0;
        int stackOut_124_11 = 0;
        int stackOut_124_12 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        bi stackOut_140_2 = null;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        bi stackOut_139_2 = null;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        cf stackOut_131_2 = null;
        cf stackOut_131_3 = null;
        hn stackOut_131_4 = null;
        h stackOut_131_5 = null;
        double[] stackOut_131_6 = null;
        double[] stackOut_131_7 = null;
        double stackOut_131_8 = 0.0;
        double stackOut_131_9 = 0.0;
        Object stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        cf stackOut_133_2 = null;
        cf stackOut_133_3 = null;
        hn stackOut_133_4 = null;
        h stackOut_133_5 = null;
        double[] stackOut_133_6 = null;
        double[] stackOut_133_7 = null;
        double stackOut_133_8 = 0.0;
        double stackOut_133_9 = 0.0;
        int stackOut_133_10 = 0;
        Object stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        cf stackOut_132_2 = null;
        cf stackOut_132_3 = null;
        hn stackOut_132_4 = null;
        h stackOut_132_5 = null;
        double[] stackOut_132_6 = null;
        double[] stackOut_132_7 = null;
        double stackOut_132_8 = 0.0;
        double stackOut_132_9 = 0.0;
        int stackOut_132_10 = 0;
        Object stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        cf stackOut_134_2 = null;
        cf stackOut_134_3 = null;
        hn stackOut_134_4 = null;
        h stackOut_134_5 = null;
        double[] stackOut_134_6 = null;
        double[] stackOut_134_7 = null;
        double stackOut_134_8 = 0.0;
        double stackOut_134_9 = 0.0;
        int stackOut_134_10 = 0;
        int stackOut_134_11 = 0;
        Object stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        cf stackOut_136_2 = null;
        cf stackOut_136_3 = null;
        hn stackOut_136_4 = null;
        h stackOut_136_5 = null;
        double[] stackOut_136_6 = null;
        double[] stackOut_136_7 = null;
        double stackOut_136_8 = 0.0;
        double stackOut_136_9 = 0.0;
        int stackOut_136_10 = 0;
        int stackOut_136_11 = 0;
        int stackOut_136_12 = 0;
        Object stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        cf stackOut_135_2 = null;
        cf stackOut_135_3 = null;
        hn stackOut_135_4 = null;
        h stackOut_135_5 = null;
        double[] stackOut_135_6 = null;
        double[] stackOut_135_7 = null;
        double stackOut_135_8 = 0.0;
        double stackOut_135_9 = 0.0;
        int stackOut_135_10 = 0;
        int stackOut_135_11 = 0;
        int stackOut_135_12 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_144_0 = 0;
        Object stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        wm stackOut_161_2 = null;
        wm stackOut_161_3 = null;
        hn stackOut_161_4 = null;
        Object stackOut_161_5 = null;
        double[] stackOut_161_6 = null;
        double stackOut_161_7 = 0.0;
        Object stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        wm stackOut_163_2 = null;
        wm stackOut_163_3 = null;
        hn stackOut_163_4 = null;
        Object stackOut_163_5 = null;
        double[] stackOut_163_6 = null;
        double stackOut_163_7 = 0.0;
        int stackOut_163_8 = 0;
        Object stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        wm stackOut_162_2 = null;
        wm stackOut_162_3 = null;
        hn stackOut_162_4 = null;
        Object stackOut_162_5 = null;
        double[] stackOut_162_6 = null;
        double stackOut_162_7 = 0.0;
        int stackOut_162_8 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_178_0 = 0;
        Object stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        il stackOut_196_2 = null;
        il stackOut_196_3 = null;
        hn stackOut_196_4 = null;
        Object stackOut_196_5 = null;
        double[] stackOut_196_6 = null;
        double stackOut_196_7 = 0.0;
        Object stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        il stackOut_198_2 = null;
        il stackOut_198_3 = null;
        hn stackOut_198_4 = null;
        Object stackOut_198_5 = null;
        double[] stackOut_198_6 = null;
        double stackOut_198_7 = 0.0;
        int stackOut_198_8 = 0;
        Object stackOut_197_0 = null;
        int stackOut_197_1 = 0;
        il stackOut_197_2 = null;
        il stackOut_197_3 = null;
        hn stackOut_197_4 = null;
        Object stackOut_197_5 = null;
        double[] stackOut_197_6 = null;
        double stackOut_197_7 = 0.0;
        int stackOut_197_8 = 0;
        Object stackOut_222_0 = null;
        pm stackOut_221_0 = null;
        L0: {
          var32 = Confined.field_J ? 1 : 0;
          if (((dj) this).field_Qb <= 0) {
            break L0;
          } else {
            ((dj) this).field_Qb = ((dj) this).field_Qb - 1;
            break L0;
          }
        }
        L1: {
          ((dj) this).field_Bb.a(((dj) this).field_Lb, 3);
          ((dj) this).field_Hb = ((dj) this).field_Hb + 1024;
          if (((dj) this).field_Hb > 65536) {
            ((dj) this).field_Hb = 65536;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((dj) this).field_kb > 0) {
            ((dj) this).field_kb = ((dj) this).field_kb - 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((dj) this).field_Hb < 32768) {
            break L3;
          } else {
            ((dj) this).field_Mb = false;
            break L3;
          }
        }
        L4: {
          var44 = new double[12];
          var42 = var44;
          var40 = var42;
          var36 = var40;
          var33 = var36;
          var45 = var33;
          var43 = var45;
          var41 = var43;
          var37 = var41;
          var3 = var37;
          ((dj) this).field_jb.a((byte) 68, var44);
          var4 = 0;
          if (!mc.field_e[96]) {
            break L4;
          } else {
            var4--;
            break L4;
          }
        }
        L5: {
          var5 = 0;
          if (!mc.field_e[98]) {
            break L5;
          } else {
            var5--;
            break L5;
          }
        }
        L6: {
          if (mc.field_e[97]) {
            var4++;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (mc.field_e[99]) {
            var5++;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (!mk.field_l) {
            break L8;
          } else {
            var5 = -var5;
            break L8;
          }
        }
        L9: {
          var6 = (double)var4;
          var8 = (double)var5;
          if (((dj) this).field_A.field_M) {
            L10: {
              if (((dj) this).field_A.field_y) {
                break L10;
              } else {
                if (null != ((dj) this).field_A.field_K) {
                  break L10;
                } else {
                  L11: {
                    if (0 != (var5 | var4)) {
                      break L11;
                    } else {
                      if (rh.field_X != 0) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ((dj) this).field_A.field_M = false;
                  break L9;
                }
              }
            }
            if (((dj) this).field_A.field_x.field_a >= 2) {
              L12: {
                ((dj) this).field_A.field_x.b(3, param1, ((dj) this).field_D + 2.0);
                var10_double = -((dj) this).field_A.field_x.field_B + ((dj) this).field_E;
                var12_double = ((dj) this).field_t - ((dj) this).field_A.field_x.field_G;
                var14 = Math.sqrt(-(var44[5] * var44[5]) + 1.0);
                var16 = var44[3] / var14;
                var18_double = var44[4] / var14;
                var20 = Math.sqrt(1.0 - var44[8] * var44[8]);
                var22 = var44[6] / var20;
                var24 = var44[7] / var20;
                var26 = var12_double * var18_double + var10_double * var16;
                var28 = var12_double * var24 + var10_double * var22;
                var6 = -var26;
                var8 = -var28;
                if (-1.0 <= var6) {
                  break L12;
                } else {
                  var6 = -1.0;
                  break L12;
                }
              }
              L13: {
                if (var6 <= 1.0) {
                  break L13;
                } else {
                  var6 = 1.0;
                  break L13;
                }
              }
              L14: {
                if (var8 < -1.0) {
                  var8 = -1.0;
                  break L14;
                } else {
                  break L14;
                }
              }
              if (var8 > 1.0) {
                var8 = 1.0;
                break L9;
              } else {
                break L9;
              }
            } else {
              var8 = 0.0;
              var6 = 0.0;
              break L9;
            }
          } else {
            break L9;
          }
        }
        L15: {
          if (!((dj) this).field_A.field_M) {
            L16: {
              if (0 == rh.field_X) {
                break L16;
              } else {
                if (!((dj) this).field_vb) {
                  ((dj) this).field_vb = true;
                  break L16;
                } else {
                  ((dj) this).field_Fb = true;
                  break L16;
                }
              }
            }
            L17: {
              L18: {
                if (0 != var4) {
                  break L18;
                } else {
                  if (var5 != 0) {
                    break L18;
                  } else {
                    break L17;
                  }
                }
              }
              ((dj) this).field_vb = false;
              break L17;
            }
            if (!((dj) this).field_vb) {
              break L15;
            } else {
              L19: {
                if (-1 != ld.field_l) {
                  break L19;
                } else {
                  if (b.field_f != 0) {
                    break L19;
                  } else {
                    break L15;
                  }
                }
              }
              L20: {
                var10_double = 320.0;
                var12_double = 188.0;
                if (qc.field_n) {
                  var10_double = var10_double + (((dj) this).field_L * var45[5] + (var45[4] * ((dj) this).field_G + var45[3] * ((dj) this).field_K)) * 1280.0;
                  var12_double = var12_double + (((dj) this).field_L * var45[8] + (((dj) this).field_G * var45[7] + var45[6] * ((dj) this).field_K)) * 1280.0;
                  break L20;
                } else {
                  var14 = -((dj) this).field_A.field_m.field_T + ((dj) this).field_E;
                  var16 = -((dj) this).field_A.field_m.field_L + ((dj) this).field_t;
                  var18_double = ((dj) this).field_D - ((dj) this).field_A.field_m.field_O;
                  var20 = ((dj) this).field_A.field_m.field_M * var18_double + (((dj) this).field_A.field_m.field_R * var14 + ((dj) this).field_A.field_m.field_ab * var16);
                  var22 = var16 * ((dj) this).field_A.field_m.field_U + ((dj) this).field_A.field_m.field_V * var14 + ((dj) this).field_A.field_m.field_F * var18_double;
                  var24 = ((dj) this).field_A.field_m.field_P * var14 + ((dj) this).field_A.field_m.field_H * var16 + ((dj) this).field_A.field_m.field_N * var18_double;
                  if (var24 < 0.01) {
                    break L20;
                  } else {
                    var10_double = 320.0 + 640.0 * (var20 / var24);
                    var12_double = 188.0 + 640.0 * (var22 / var24);
                    break L20;
                  }
                }
              }
              L21: {
                var6 = ((double)ld.field_l - var10_double) * 0.02127659574468085;
                var8 = 0.02127659574468085 * ((double)jh.field_R - var12_double);
                if (var6 < -1.0) {
                  var8 = var8 / -var6;
                  var6 = -1.0;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (1.0 < var6) {
                  var8 = var8 / var6;
                  var6 = 1.0;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (var8 < -1.0) {
                  var6 = var6 / -var8;
                  var8 = -1.0;
                  break L23;
                } else {
                  break L23;
                }
              }
              if (var8 > 1.0) {
                var6 = var6 / var8;
                var8 = 1.0;
                break L15;
              } else {
                break L15;
              }
            }
          } else {
            break L15;
          }
        }
        L24: {
          if (var6 != 0.0) {
            ((dj) this).field_G = ((dj) this).field_G + var6 * 0.005 * var45[4];
            ((dj) this).field_L = ((dj) this).field_L + var45[5] * (0.005 * var6);
            ((dj) this).field_K = ((dj) this).field_K + var45[3] * (var6 * 0.005);
            hd.field_e.a(var6 * 0.001, var45[8], var45[6], var45[7], 7);
            ((dj) this).field_Jb.a(-117, hd.field_e);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          if (var8 == 0.0) {
            break L25;
          } else {
            ((dj) this).field_L = ((dj) this).field_L + var45[8] * (0.005 * var8);
            ((dj) this).field_G = ((dj) this).field_G + var8 * 0.005 * var45[7];
            ((dj) this).field_K = ((dj) this).field_K + 0.005 * var8 * var45[6];
            hd.field_e.a(-0.001 * var8, var45[5], var45[3], var45[4], 7);
            ((dj) this).field_Jb.a(param0 + -11895, hd.field_e);
            break L25;
          }
        }
        L26: {
          ((dj) this).field_Jb.a(0.9, (byte) -65);
          ((dj) this).field_jb.a(-84, ((dj) this).field_Jb);
          ((dj) this).field_jb.a((byte) 27, var45);
          if (var45[11] < 0.8660254037844386) {
            var10_double = Math.sqrt(-(var45[11] * var45[11]) + 1.0);
            var12_double = var45[10] / var10_double;
            var14 = -var45[9] / var10_double;
            var16 = -Math.asin(var45[11]) + 1.0471975511965976;
            hd.field_e.a(var16, 0.0, var12_double, var14, 7);
            ((dj) this).field_jb.a(-33, hd.field_e);
            ((dj) this).field_jb.a((byte) 75, var45);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          L28: {
            ((dj) this).field_G = (((dj) this).field_G + 0.01 * var45[10]) * 0.95;
            ((dj) this).field_L = (((dj) this).field_L + var45[11] * 0.01) * 0.95;
            ((dj) this).field_K = (((dj) this).field_K + var45[9] * 0.01) * 0.95;
            super.a(param0, param1);
            ((dj) this).field_Lb.c(16777215);
            var10 = mc.field_e[82] ? 1 : 0;
            if (!((dj) this).field_vb) {
              break L28;
            } else {
              if (!((dj) this).field_Fb) {
                break L28;
              } else {
                if (b.field_f != 0) {
                  var10 = 1;
                  break L27;
                } else {
                  break L28;
                }
              }
            }
          }
          ((dj) this).field_Fb = false;
          break L27;
        }
        L29: {
          if (((dj) this).field_A.field_M) {
            break L29;
          } else {
            if (((dj) this).field_Mb) {
              break L29;
            } else {
              if (var10 == 0) {
                break L29;
              } else {
                if (0 != ((dj) this).field_kb) {
                  break L29;
                } else {
                  var11 = 5120;
                  if (((dj) this).field_Hb < var11) {
                    ((dj) this).field_Mb = true;
                    break L29;
                  } else {
                    L30: {
                      ((dj) this).field_A.field_v = true;
                      ((dj) this).field_A.field_t = true;
                      ((dj) this).field_Lb.b(118);
                      stackOut_91_0 = this;
                      stackOut_91_1 = 0;
                      stackOut_91_2 = null;
                      stackOut_91_3 = null;
                      stackOut_91_4 = ((dj) this).field_A;
                      stackOut_91_5 = this;
                      stackOut_91_6 = (double[]) var3;
                      stackOut_91_7 = me.field_J;
                      stackOut_91_8 = 0.0;
                      stackOut_91_9 = 0.0;
                      stackIn_93_0 = stackOut_91_0;
                      stackIn_93_1 = stackOut_91_1;
                      stackIn_93_2 = stackOut_91_2;
                      stackIn_93_3 = stackOut_91_3;
                      stackIn_93_4 = stackOut_91_4;
                      stackIn_93_5 = stackOut_91_5;
                      stackIn_93_6 = stackOut_91_6;
                      stackIn_93_7 = stackOut_91_7;
                      stackIn_93_8 = stackOut_91_8;
                      stackIn_93_9 = stackOut_91_9;
                      stackIn_92_0 = stackOut_91_0;
                      stackIn_92_1 = stackOut_91_1;
                      stackIn_92_2 = stackOut_91_2;
                      stackIn_92_3 = stackOut_91_3;
                      stackIn_92_4 = stackOut_91_4;
                      stackIn_92_5 = stackOut_91_5;
                      stackIn_92_6 = stackOut_91_6;
                      stackIn_92_7 = stackOut_91_7;
                      stackIn_92_8 = stackOut_91_8;
                      stackIn_92_9 = stackOut_91_9;
                      if (0 >= ((dj) this).field_Pb) {
                        stackOut_93_0 = this;
                        stackOut_93_1 = stackIn_93_1;
                        stackOut_93_2 = null;
                        stackOut_93_3 = null;
                        stackOut_93_4 = (hn) (Object) stackIn_93_4;
                        stackOut_93_5 = this;
                        stackOut_93_6 = (double[]) (Object) stackIn_93_6;
                        stackOut_93_7 = (double[]) (Object) stackIn_93_7;
                        stackOut_93_8 = stackIn_93_8;
                        stackOut_93_9 = stackIn_93_9;
                        stackOut_93_10 = 0;
                        stackIn_94_0 = stackOut_93_0;
                        stackIn_94_1 = stackOut_93_1;
                        stackIn_94_2 = stackOut_93_2;
                        stackIn_94_3 = stackOut_93_3;
                        stackIn_94_4 = stackOut_93_4;
                        stackIn_94_5 = stackOut_93_5;
                        stackIn_94_6 = stackOut_93_6;
                        stackIn_94_7 = stackOut_93_7;
                        stackIn_94_8 = stackOut_93_8;
                        stackIn_94_9 = stackOut_93_9;
                        stackIn_94_10 = stackOut_93_10;
                        break L30;
                      } else {
                        stackOut_92_0 = this;
                        stackOut_92_1 = stackIn_92_1;
                        stackOut_92_2 = null;
                        stackOut_92_3 = null;
                        stackOut_92_4 = (hn) (Object) stackIn_92_4;
                        stackOut_92_5 = this;
                        stackOut_92_6 = (double[]) (Object) stackIn_92_6;
                        stackOut_92_7 = (double[]) (Object) stackIn_92_7;
                        stackOut_92_8 = stackIn_92_8;
                        stackOut_92_9 = stackIn_92_9;
                        stackOut_92_10 = 1;
                        stackIn_94_0 = stackOut_92_0;
                        stackIn_94_1 = stackOut_92_1;
                        stackIn_94_2 = stackOut_92_2;
                        stackIn_94_3 = stackOut_92_3;
                        stackIn_94_4 = stackOut_92_4;
                        stackIn_94_5 = stackOut_92_5;
                        stackIn_94_6 = stackOut_92_6;
                        stackIn_94_7 = stackOut_92_7;
                        stackIn_94_8 = stackOut_92_8;
                        stackIn_94_9 = stackOut_92_9;
                        stackIn_94_10 = stackOut_92_10;
                        break L30;
                      }
                    }
                    L31: {
                      stackOut_94_0 = this;
                      stackOut_94_1 = stackIn_94_1;
                      stackOut_94_2 = null;
                      stackOut_94_3 = null;
                      stackOut_94_4 = (hn) (Object) stackIn_94_4;
                      stackOut_94_5 = this;
                      stackOut_94_6 = (double[]) (Object) stackIn_94_6;
                      stackOut_94_7 = (double[]) (Object) stackIn_94_7;
                      stackOut_94_8 = stackIn_94_8;
                      stackOut_94_9 = stackIn_94_9;
                      stackOut_94_10 = stackIn_94_10;
                      stackOut_94_11 = ((dj) this).field_Eb;
                      stackIn_96_0 = stackOut_94_0;
                      stackIn_96_1 = stackOut_94_1;
                      stackIn_96_2 = stackOut_94_2;
                      stackIn_96_3 = stackOut_94_3;
                      stackIn_96_4 = stackOut_94_4;
                      stackIn_96_5 = stackOut_94_5;
                      stackIn_96_6 = stackOut_94_6;
                      stackIn_96_7 = stackOut_94_7;
                      stackIn_96_8 = stackOut_94_8;
                      stackIn_96_9 = stackOut_94_9;
                      stackIn_96_10 = stackOut_94_10;
                      stackIn_96_11 = stackOut_94_11;
                      stackIn_95_0 = stackOut_94_0;
                      stackIn_95_1 = stackOut_94_1;
                      stackIn_95_2 = stackOut_94_2;
                      stackIn_95_3 = stackOut_94_3;
                      stackIn_95_4 = stackOut_94_4;
                      stackIn_95_5 = stackOut_94_5;
                      stackIn_95_6 = stackOut_94_6;
                      stackIn_95_7 = stackOut_94_7;
                      stackIn_95_8 = stackOut_94_8;
                      stackIn_95_9 = stackOut_94_9;
                      stackIn_95_10 = stackOut_94_10;
                      stackIn_95_11 = stackOut_94_11;
                      if (((dj) this).field_U <= 0) {
                        stackOut_96_0 = this;
                        stackOut_96_1 = stackIn_96_1;
                        stackOut_96_2 = null;
                        stackOut_96_3 = null;
                        stackOut_96_4 = (hn) (Object) stackIn_96_4;
                        stackOut_96_5 = this;
                        stackOut_96_6 = (double[]) (Object) stackIn_96_6;
                        stackOut_96_7 = (double[]) (Object) stackIn_96_7;
                        stackOut_96_8 = stackIn_96_8;
                        stackOut_96_9 = stackIn_96_9;
                        stackOut_96_10 = stackIn_96_10;
                        stackOut_96_11 = stackIn_96_11;
                        stackOut_96_12 = 0;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        stackIn_97_2 = stackOut_96_2;
                        stackIn_97_3 = stackOut_96_3;
                        stackIn_97_4 = stackOut_96_4;
                        stackIn_97_5 = stackOut_96_5;
                        stackIn_97_6 = stackOut_96_6;
                        stackIn_97_7 = stackOut_96_7;
                        stackIn_97_8 = stackOut_96_8;
                        stackIn_97_9 = stackOut_96_9;
                        stackIn_97_10 = stackOut_96_10;
                        stackIn_97_11 = stackOut_96_11;
                        stackIn_97_12 = stackOut_96_12;
                        break L31;
                      } else {
                        stackOut_95_0 = this;
                        stackOut_95_1 = stackIn_95_1;
                        stackOut_95_2 = null;
                        stackOut_95_3 = null;
                        stackOut_95_4 = (hn) (Object) stackIn_95_4;
                        stackOut_95_5 = this;
                        stackOut_95_6 = (double[]) (Object) stackIn_95_6;
                        stackOut_95_7 = (double[]) (Object) stackIn_95_7;
                        stackOut_95_8 = stackIn_95_8;
                        stackOut_95_9 = stackIn_95_9;
                        stackOut_95_10 = stackIn_95_10;
                        stackOut_95_11 = stackIn_95_11;
                        stackOut_95_12 = 1;
                        stackIn_97_0 = stackOut_95_0;
                        stackIn_97_1 = stackOut_95_1;
                        stackIn_97_2 = stackOut_95_2;
                        stackIn_97_3 = stackOut_95_3;
                        stackIn_97_4 = stackOut_95_4;
                        stackIn_97_5 = stackOut_95_5;
                        stackIn_97_6 = stackOut_95_6;
                        stackIn_97_7 = stackOut_95_7;
                        stackIn_97_8 = stackOut_95_8;
                        stackIn_97_9 = stackOut_95_9;
                        stackIn_97_10 = stackOut_95_10;
                        stackIn_97_11 = stackOut_95_11;
                        stackIn_97_12 = stackOut_95_12;
                        break L31;
                      }
                    }
                    L32: {
                      ri.a((rk) this, stackIn_97_1, (rk) (Object) new cf(stackIn_97_4, (ee) this, stackIn_97_6, stackIn_97_7, stackIn_97_8, stackIn_97_9, stackIn_97_10 != 0, stackIn_97_11, stackIn_97_12 != 0));
                      stackOut_97_0 = this;
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_98_0 = stackOut_97_0;
                      if (((dj) this).field_mb) {
                        stackOut_99_0 = this;
                        stackOut_99_1 = 3;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        break L32;
                      } else {
                        stackOut_98_0 = this;
                        stackOut_98_1 = 12;
                        stackIn_100_0 = stackOut_98_0;
                        stackIn_100_1 = stackOut_98_1;
                        break L32;
                      }
                    }
                    L33: {
                      ((dj) this).field_kb = stackIn_100_1;
                      var12 = 4;
                      if (((dj) this).field_Eb) {
                        L34: {
                          var13_double = (double)((dj) this).field_Z * 0.09817477042468103;
                          var15 = Math.sin(var13_double);
                          var17 = Math.cos(var13_double);
                          stackOut_102_0 = this;
                          stackOut_102_1 = param0 ^ 11878;
                          stackOut_102_2 = null;
                          stackOut_102_3 = null;
                          stackOut_102_4 = ((dj) this).field_A;
                          stackOut_102_5 = this;
                          stackOut_102_6 = (double[]) var3;
                          stackOut_102_7 = me.field_J;
                          stackOut_102_8 = -0.04 * var17;
                          stackOut_102_9 = -0.04 * var15;
                          stackIn_104_0 = stackOut_102_0;
                          stackIn_104_1 = stackOut_102_1;
                          stackIn_104_2 = stackOut_102_2;
                          stackIn_104_3 = stackOut_102_3;
                          stackIn_104_4 = stackOut_102_4;
                          stackIn_104_5 = stackOut_102_5;
                          stackIn_104_6 = stackOut_102_6;
                          stackIn_104_7 = stackOut_102_7;
                          stackIn_104_8 = stackOut_102_8;
                          stackIn_104_9 = stackOut_102_9;
                          stackIn_103_0 = stackOut_102_0;
                          stackIn_103_1 = stackOut_102_1;
                          stackIn_103_2 = stackOut_102_2;
                          stackIn_103_3 = stackOut_102_3;
                          stackIn_103_4 = stackOut_102_4;
                          stackIn_103_5 = stackOut_102_5;
                          stackIn_103_6 = stackOut_102_6;
                          stackIn_103_7 = stackOut_102_7;
                          stackIn_103_8 = stackOut_102_8;
                          stackIn_103_9 = stackOut_102_9;
                          if (0 >= ((dj) this).field_Pb) {
                            stackOut_104_0 = this;
                            stackOut_104_1 = stackIn_104_1;
                            stackOut_104_2 = null;
                            stackOut_104_3 = null;
                            stackOut_104_4 = (hn) (Object) stackIn_104_4;
                            stackOut_104_5 = this;
                            stackOut_104_6 = (double[]) (Object) stackIn_104_6;
                            stackOut_104_7 = (double[]) (Object) stackIn_104_7;
                            stackOut_104_8 = stackIn_104_8;
                            stackOut_104_9 = stackIn_104_9;
                            stackOut_104_10 = 0;
                            stackIn_105_0 = stackOut_104_0;
                            stackIn_105_1 = stackOut_104_1;
                            stackIn_105_2 = stackOut_104_2;
                            stackIn_105_3 = stackOut_104_3;
                            stackIn_105_4 = stackOut_104_4;
                            stackIn_105_5 = stackOut_104_5;
                            stackIn_105_6 = stackOut_104_6;
                            stackIn_105_7 = stackOut_104_7;
                            stackIn_105_8 = stackOut_104_8;
                            stackIn_105_9 = stackOut_104_9;
                            stackIn_105_10 = stackOut_104_10;
                            break L34;
                          } else {
                            stackOut_103_0 = this;
                            stackOut_103_1 = stackIn_103_1;
                            stackOut_103_2 = null;
                            stackOut_103_3 = null;
                            stackOut_103_4 = (hn) (Object) stackIn_103_4;
                            stackOut_103_5 = this;
                            stackOut_103_6 = (double[]) (Object) stackIn_103_6;
                            stackOut_103_7 = (double[]) (Object) stackIn_103_7;
                            stackOut_103_8 = stackIn_103_8;
                            stackOut_103_9 = stackIn_103_9;
                            stackOut_103_10 = 1;
                            stackIn_105_0 = stackOut_103_0;
                            stackIn_105_1 = stackOut_103_1;
                            stackIn_105_2 = stackOut_103_2;
                            stackIn_105_3 = stackOut_103_3;
                            stackIn_105_4 = stackOut_103_4;
                            stackIn_105_5 = stackOut_103_5;
                            stackIn_105_6 = stackOut_103_6;
                            stackIn_105_7 = stackOut_103_7;
                            stackIn_105_8 = stackOut_103_8;
                            stackIn_105_9 = stackOut_103_9;
                            stackIn_105_10 = stackOut_103_10;
                            break L34;
                          }
                        }
                        L35: {
                          stackOut_105_0 = this;
                          stackOut_105_1 = stackIn_105_1;
                          stackOut_105_2 = null;
                          stackOut_105_3 = null;
                          stackOut_105_4 = (hn) (Object) stackIn_105_4;
                          stackOut_105_5 = this;
                          stackOut_105_6 = (double[]) (Object) stackIn_105_6;
                          stackOut_105_7 = (double[]) (Object) stackIn_105_7;
                          stackOut_105_8 = stackIn_105_8;
                          stackOut_105_9 = stackIn_105_9;
                          stackOut_105_10 = stackIn_105_10;
                          stackOut_105_11 = 1;
                          stackIn_107_0 = stackOut_105_0;
                          stackIn_107_1 = stackOut_105_1;
                          stackIn_107_2 = stackOut_105_2;
                          stackIn_107_3 = stackOut_105_3;
                          stackIn_107_4 = stackOut_105_4;
                          stackIn_107_5 = stackOut_105_5;
                          stackIn_107_6 = stackOut_105_6;
                          stackIn_107_7 = stackOut_105_7;
                          stackIn_107_8 = stackOut_105_8;
                          stackIn_107_9 = stackOut_105_9;
                          stackIn_107_10 = stackOut_105_10;
                          stackIn_107_11 = stackOut_105_11;
                          stackIn_106_0 = stackOut_105_0;
                          stackIn_106_1 = stackOut_105_1;
                          stackIn_106_2 = stackOut_105_2;
                          stackIn_106_3 = stackOut_105_3;
                          stackIn_106_4 = stackOut_105_4;
                          stackIn_106_5 = stackOut_105_5;
                          stackIn_106_6 = stackOut_105_6;
                          stackIn_106_7 = stackOut_105_7;
                          stackIn_106_8 = stackOut_105_8;
                          stackIn_106_9 = stackOut_105_9;
                          stackIn_106_10 = stackOut_105_10;
                          stackIn_106_11 = stackOut_105_11;
                          if (((dj) this).field_U <= 0) {
                            stackOut_107_0 = this;
                            stackOut_107_1 = stackIn_107_1;
                            stackOut_107_2 = null;
                            stackOut_107_3 = null;
                            stackOut_107_4 = (hn) (Object) stackIn_107_4;
                            stackOut_107_5 = this;
                            stackOut_107_6 = (double[]) (Object) stackIn_107_6;
                            stackOut_107_7 = (double[]) (Object) stackIn_107_7;
                            stackOut_107_8 = stackIn_107_8;
                            stackOut_107_9 = stackIn_107_9;
                            stackOut_107_10 = stackIn_107_10;
                            stackOut_107_11 = stackIn_107_11;
                            stackOut_107_12 = 0;
                            stackIn_108_0 = stackOut_107_0;
                            stackIn_108_1 = stackOut_107_1;
                            stackIn_108_2 = stackOut_107_2;
                            stackIn_108_3 = stackOut_107_3;
                            stackIn_108_4 = stackOut_107_4;
                            stackIn_108_5 = stackOut_107_5;
                            stackIn_108_6 = stackOut_107_6;
                            stackIn_108_7 = stackOut_107_7;
                            stackIn_108_8 = stackOut_107_8;
                            stackIn_108_9 = stackOut_107_9;
                            stackIn_108_10 = stackOut_107_10;
                            stackIn_108_11 = stackOut_107_11;
                            stackIn_108_12 = stackOut_107_12;
                            break L35;
                          } else {
                            stackOut_106_0 = this;
                            stackOut_106_1 = stackIn_106_1;
                            stackOut_106_2 = null;
                            stackOut_106_3 = null;
                            stackOut_106_4 = (hn) (Object) stackIn_106_4;
                            stackOut_106_5 = this;
                            stackOut_106_6 = (double[]) (Object) stackIn_106_6;
                            stackOut_106_7 = (double[]) (Object) stackIn_106_7;
                            stackOut_106_8 = stackIn_106_8;
                            stackOut_106_9 = stackIn_106_9;
                            stackOut_106_10 = stackIn_106_10;
                            stackOut_106_11 = stackIn_106_11;
                            stackOut_106_12 = 1;
                            stackIn_108_0 = stackOut_106_0;
                            stackIn_108_1 = stackOut_106_1;
                            stackIn_108_2 = stackOut_106_2;
                            stackIn_108_3 = stackOut_106_3;
                            stackIn_108_4 = stackOut_106_4;
                            stackIn_108_5 = stackOut_106_5;
                            stackIn_108_6 = stackOut_106_6;
                            stackIn_108_7 = stackOut_106_7;
                            stackIn_108_8 = stackOut_106_8;
                            stackIn_108_9 = stackOut_106_9;
                            stackIn_108_10 = stackOut_106_10;
                            stackIn_108_11 = stackOut_106_11;
                            stackIn_108_12 = stackOut_106_12;
                            break L35;
                          }
                        }
                        L36: {
                          ri.a((rk) this, stackIn_108_1, (rk) (Object) new cf(stackIn_108_4, (ee) this, stackIn_108_6, stackIn_108_7, stackIn_108_8, stackIn_108_9, stackIn_108_10 != 0, stackIn_108_11 != 0, stackIn_108_12 != 0));
                          stackOut_108_0 = this;
                          stackOut_108_1 = 0;
                          stackOut_108_2 = null;
                          stackOut_108_3 = null;
                          stackOut_108_4 = ((dj) this).field_A;
                          stackOut_108_5 = this;
                          stackOut_108_6 = (double[]) var3;
                          stackOut_108_7 = me.field_J;
                          stackOut_108_8 = -0.02 * var17;
                          stackOut_108_9 = var15 * -0.02;
                          stackIn_110_0 = stackOut_108_0;
                          stackIn_110_1 = stackOut_108_1;
                          stackIn_110_2 = stackOut_108_2;
                          stackIn_110_3 = stackOut_108_3;
                          stackIn_110_4 = stackOut_108_4;
                          stackIn_110_5 = stackOut_108_5;
                          stackIn_110_6 = stackOut_108_6;
                          stackIn_110_7 = stackOut_108_7;
                          stackIn_110_8 = stackOut_108_8;
                          stackIn_110_9 = stackOut_108_9;
                          stackIn_109_0 = stackOut_108_0;
                          stackIn_109_1 = stackOut_108_1;
                          stackIn_109_2 = stackOut_108_2;
                          stackIn_109_3 = stackOut_108_3;
                          stackIn_109_4 = stackOut_108_4;
                          stackIn_109_5 = stackOut_108_5;
                          stackIn_109_6 = stackOut_108_6;
                          stackIn_109_7 = stackOut_108_7;
                          stackIn_109_8 = stackOut_108_8;
                          stackIn_109_9 = stackOut_108_9;
                          if (((dj) this).field_Pb <= 0) {
                            stackOut_110_0 = this;
                            stackOut_110_1 = stackIn_110_1;
                            stackOut_110_2 = null;
                            stackOut_110_3 = null;
                            stackOut_110_4 = (hn) (Object) stackIn_110_4;
                            stackOut_110_5 = this;
                            stackOut_110_6 = (double[]) (Object) stackIn_110_6;
                            stackOut_110_7 = (double[]) (Object) stackIn_110_7;
                            stackOut_110_8 = stackIn_110_8;
                            stackOut_110_9 = stackIn_110_9;
                            stackOut_110_10 = 0;
                            stackIn_111_0 = stackOut_110_0;
                            stackIn_111_1 = stackOut_110_1;
                            stackIn_111_2 = stackOut_110_2;
                            stackIn_111_3 = stackOut_110_3;
                            stackIn_111_4 = stackOut_110_4;
                            stackIn_111_5 = stackOut_110_5;
                            stackIn_111_6 = stackOut_110_6;
                            stackIn_111_7 = stackOut_110_7;
                            stackIn_111_8 = stackOut_110_8;
                            stackIn_111_9 = stackOut_110_9;
                            stackIn_111_10 = stackOut_110_10;
                            break L36;
                          } else {
                            stackOut_109_0 = this;
                            stackOut_109_1 = stackIn_109_1;
                            stackOut_109_2 = null;
                            stackOut_109_3 = null;
                            stackOut_109_4 = (hn) (Object) stackIn_109_4;
                            stackOut_109_5 = this;
                            stackOut_109_6 = (double[]) (Object) stackIn_109_6;
                            stackOut_109_7 = (double[]) (Object) stackIn_109_7;
                            stackOut_109_8 = stackIn_109_8;
                            stackOut_109_9 = stackIn_109_9;
                            stackOut_109_10 = 1;
                            stackIn_111_0 = stackOut_109_0;
                            stackIn_111_1 = stackOut_109_1;
                            stackIn_111_2 = stackOut_109_2;
                            stackIn_111_3 = stackOut_109_3;
                            stackIn_111_4 = stackOut_109_4;
                            stackIn_111_5 = stackOut_109_5;
                            stackIn_111_6 = stackOut_109_6;
                            stackIn_111_7 = stackOut_109_7;
                            stackIn_111_8 = stackOut_109_8;
                            stackIn_111_9 = stackOut_109_9;
                            stackIn_111_10 = stackOut_109_10;
                            break L36;
                          }
                        }
                        L37: {
                          stackOut_111_0 = this;
                          stackOut_111_1 = stackIn_111_1;
                          stackOut_111_2 = null;
                          stackOut_111_3 = null;
                          stackOut_111_4 = (hn) (Object) stackIn_111_4;
                          stackOut_111_5 = this;
                          stackOut_111_6 = (double[]) (Object) stackIn_111_6;
                          stackOut_111_7 = (double[]) (Object) stackIn_111_7;
                          stackOut_111_8 = stackIn_111_8;
                          stackOut_111_9 = stackIn_111_9;
                          stackOut_111_10 = stackIn_111_10;
                          stackOut_111_11 = 1;
                          stackIn_113_0 = stackOut_111_0;
                          stackIn_113_1 = stackOut_111_1;
                          stackIn_113_2 = stackOut_111_2;
                          stackIn_113_3 = stackOut_111_3;
                          stackIn_113_4 = stackOut_111_4;
                          stackIn_113_5 = stackOut_111_5;
                          stackIn_113_6 = stackOut_111_6;
                          stackIn_113_7 = stackOut_111_7;
                          stackIn_113_8 = stackOut_111_8;
                          stackIn_113_9 = stackOut_111_9;
                          stackIn_113_10 = stackOut_111_10;
                          stackIn_113_11 = stackOut_111_11;
                          stackIn_112_0 = stackOut_111_0;
                          stackIn_112_1 = stackOut_111_1;
                          stackIn_112_2 = stackOut_111_2;
                          stackIn_112_3 = stackOut_111_3;
                          stackIn_112_4 = stackOut_111_4;
                          stackIn_112_5 = stackOut_111_5;
                          stackIn_112_6 = stackOut_111_6;
                          stackIn_112_7 = stackOut_111_7;
                          stackIn_112_8 = stackOut_111_8;
                          stackIn_112_9 = stackOut_111_9;
                          stackIn_112_10 = stackOut_111_10;
                          stackIn_112_11 = stackOut_111_11;
                          if (((dj) this).field_U <= 0) {
                            stackOut_113_0 = this;
                            stackOut_113_1 = stackIn_113_1;
                            stackOut_113_2 = null;
                            stackOut_113_3 = null;
                            stackOut_113_4 = (hn) (Object) stackIn_113_4;
                            stackOut_113_5 = this;
                            stackOut_113_6 = (double[]) (Object) stackIn_113_6;
                            stackOut_113_7 = (double[]) (Object) stackIn_113_7;
                            stackOut_113_8 = stackIn_113_8;
                            stackOut_113_9 = stackIn_113_9;
                            stackOut_113_10 = stackIn_113_10;
                            stackOut_113_11 = stackIn_113_11;
                            stackOut_113_12 = 0;
                            stackIn_114_0 = stackOut_113_0;
                            stackIn_114_1 = stackOut_113_1;
                            stackIn_114_2 = stackOut_113_2;
                            stackIn_114_3 = stackOut_113_3;
                            stackIn_114_4 = stackOut_113_4;
                            stackIn_114_5 = stackOut_113_5;
                            stackIn_114_6 = stackOut_113_6;
                            stackIn_114_7 = stackOut_113_7;
                            stackIn_114_8 = stackOut_113_8;
                            stackIn_114_9 = stackOut_113_9;
                            stackIn_114_10 = stackOut_113_10;
                            stackIn_114_11 = stackOut_113_11;
                            stackIn_114_12 = stackOut_113_12;
                            break L37;
                          } else {
                            stackOut_112_0 = this;
                            stackOut_112_1 = stackIn_112_1;
                            stackOut_112_2 = null;
                            stackOut_112_3 = null;
                            stackOut_112_4 = (hn) (Object) stackIn_112_4;
                            stackOut_112_5 = this;
                            stackOut_112_6 = (double[]) (Object) stackIn_112_6;
                            stackOut_112_7 = (double[]) (Object) stackIn_112_7;
                            stackOut_112_8 = stackIn_112_8;
                            stackOut_112_9 = stackIn_112_9;
                            stackOut_112_10 = stackIn_112_10;
                            stackOut_112_11 = stackIn_112_11;
                            stackOut_112_12 = 1;
                            stackIn_114_0 = stackOut_112_0;
                            stackIn_114_1 = stackOut_112_1;
                            stackIn_114_2 = stackOut_112_2;
                            stackIn_114_3 = stackOut_112_3;
                            stackIn_114_4 = stackOut_112_4;
                            stackIn_114_5 = stackOut_112_5;
                            stackIn_114_6 = stackOut_112_6;
                            stackIn_114_7 = stackOut_112_7;
                            stackIn_114_8 = stackOut_112_8;
                            stackIn_114_9 = stackOut_112_9;
                            stackIn_114_10 = stackOut_112_10;
                            stackIn_114_11 = stackOut_112_11;
                            stackIn_114_12 = stackOut_112_12;
                            break L37;
                          }
                        }
                        L38: {
                          ri.a((rk) this, stackIn_114_1, (rk) (Object) new cf(stackIn_114_4, (ee) this, stackIn_114_6, stackIn_114_7, stackIn_114_8, stackIn_114_9, stackIn_114_10 != 0, stackIn_114_11 != 0, stackIn_114_12 != 0));
                          stackOut_114_0 = this;
                          stackOut_114_1 = 0;
                          stackOut_114_2 = null;
                          stackOut_114_3 = null;
                          stackOut_114_4 = ((dj) this).field_A;
                          stackOut_114_5 = this;
                          stackOut_114_6 = (double[]) var3;
                          stackOut_114_7 = me.field_J;
                          stackOut_114_8 = 0.02 * var17;
                          stackOut_114_9 = 0.02 * var15;
                          stackIn_116_0 = stackOut_114_0;
                          stackIn_116_1 = stackOut_114_1;
                          stackIn_116_2 = stackOut_114_2;
                          stackIn_116_3 = stackOut_114_3;
                          stackIn_116_4 = stackOut_114_4;
                          stackIn_116_5 = stackOut_114_5;
                          stackIn_116_6 = stackOut_114_6;
                          stackIn_116_7 = stackOut_114_7;
                          stackIn_116_8 = stackOut_114_8;
                          stackIn_116_9 = stackOut_114_9;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          stackIn_115_2 = stackOut_114_2;
                          stackIn_115_3 = stackOut_114_3;
                          stackIn_115_4 = stackOut_114_4;
                          stackIn_115_5 = stackOut_114_5;
                          stackIn_115_6 = stackOut_114_6;
                          stackIn_115_7 = stackOut_114_7;
                          stackIn_115_8 = stackOut_114_8;
                          stackIn_115_9 = stackOut_114_9;
                          if (-1 <= ((dj) this).field_Pb) {
                            stackOut_116_0 = this;
                            stackOut_116_1 = stackIn_116_1;
                            stackOut_116_2 = null;
                            stackOut_116_3 = null;
                            stackOut_116_4 = (hn) (Object) stackIn_116_4;
                            stackOut_116_5 = this;
                            stackOut_116_6 = (double[]) (Object) stackIn_116_6;
                            stackOut_116_7 = (double[]) (Object) stackIn_116_7;
                            stackOut_116_8 = stackIn_116_8;
                            stackOut_116_9 = stackIn_116_9;
                            stackOut_116_10 = 0;
                            stackIn_117_0 = stackOut_116_0;
                            stackIn_117_1 = stackOut_116_1;
                            stackIn_117_2 = stackOut_116_2;
                            stackIn_117_3 = stackOut_116_3;
                            stackIn_117_4 = stackOut_116_4;
                            stackIn_117_5 = stackOut_116_5;
                            stackIn_117_6 = stackOut_116_6;
                            stackIn_117_7 = stackOut_116_7;
                            stackIn_117_8 = stackOut_116_8;
                            stackIn_117_9 = stackOut_116_9;
                            stackIn_117_10 = stackOut_116_10;
                            break L38;
                          } else {
                            stackOut_115_0 = this;
                            stackOut_115_1 = stackIn_115_1;
                            stackOut_115_2 = null;
                            stackOut_115_3 = null;
                            stackOut_115_4 = (hn) (Object) stackIn_115_4;
                            stackOut_115_5 = this;
                            stackOut_115_6 = (double[]) (Object) stackIn_115_6;
                            stackOut_115_7 = (double[]) (Object) stackIn_115_7;
                            stackOut_115_8 = stackIn_115_8;
                            stackOut_115_9 = stackIn_115_9;
                            stackOut_115_10 = 1;
                            stackIn_117_0 = stackOut_115_0;
                            stackIn_117_1 = stackOut_115_1;
                            stackIn_117_2 = stackOut_115_2;
                            stackIn_117_3 = stackOut_115_3;
                            stackIn_117_4 = stackOut_115_4;
                            stackIn_117_5 = stackOut_115_5;
                            stackIn_117_6 = stackOut_115_6;
                            stackIn_117_7 = stackOut_115_7;
                            stackIn_117_8 = stackOut_115_8;
                            stackIn_117_9 = stackOut_115_9;
                            stackIn_117_10 = stackOut_115_10;
                            break L38;
                          }
                        }
                        L39: {
                          stackOut_117_0 = this;
                          stackOut_117_1 = stackIn_117_1;
                          stackOut_117_2 = null;
                          stackOut_117_3 = null;
                          stackOut_117_4 = (hn) (Object) stackIn_117_4;
                          stackOut_117_5 = this;
                          stackOut_117_6 = (double[]) (Object) stackIn_117_6;
                          stackOut_117_7 = (double[]) (Object) stackIn_117_7;
                          stackOut_117_8 = stackIn_117_8;
                          stackOut_117_9 = stackIn_117_9;
                          stackOut_117_10 = stackIn_117_10;
                          stackOut_117_11 = 1;
                          stackIn_119_0 = stackOut_117_0;
                          stackIn_119_1 = stackOut_117_1;
                          stackIn_119_2 = stackOut_117_2;
                          stackIn_119_3 = stackOut_117_3;
                          stackIn_119_4 = stackOut_117_4;
                          stackIn_119_5 = stackOut_117_5;
                          stackIn_119_6 = stackOut_117_6;
                          stackIn_119_7 = stackOut_117_7;
                          stackIn_119_8 = stackOut_117_8;
                          stackIn_119_9 = stackOut_117_9;
                          stackIn_119_10 = stackOut_117_10;
                          stackIn_119_11 = stackOut_117_11;
                          stackIn_118_0 = stackOut_117_0;
                          stackIn_118_1 = stackOut_117_1;
                          stackIn_118_2 = stackOut_117_2;
                          stackIn_118_3 = stackOut_117_3;
                          stackIn_118_4 = stackOut_117_4;
                          stackIn_118_5 = stackOut_117_5;
                          stackIn_118_6 = stackOut_117_6;
                          stackIn_118_7 = stackOut_117_7;
                          stackIn_118_8 = stackOut_117_8;
                          stackIn_118_9 = stackOut_117_9;
                          stackIn_118_10 = stackOut_117_10;
                          stackIn_118_11 = stackOut_117_11;
                          if (-1 >= ((dj) this).field_U) {
                            stackOut_119_0 = this;
                            stackOut_119_1 = stackIn_119_1;
                            stackOut_119_2 = null;
                            stackOut_119_3 = null;
                            stackOut_119_4 = (hn) (Object) stackIn_119_4;
                            stackOut_119_5 = this;
                            stackOut_119_6 = (double[]) (Object) stackIn_119_6;
                            stackOut_119_7 = (double[]) (Object) stackIn_119_7;
                            stackOut_119_8 = stackIn_119_8;
                            stackOut_119_9 = stackIn_119_9;
                            stackOut_119_10 = stackIn_119_10;
                            stackOut_119_11 = stackIn_119_11;
                            stackOut_119_12 = 0;
                            stackIn_120_0 = stackOut_119_0;
                            stackIn_120_1 = stackOut_119_1;
                            stackIn_120_2 = stackOut_119_2;
                            stackIn_120_3 = stackOut_119_3;
                            stackIn_120_4 = stackOut_119_4;
                            stackIn_120_5 = stackOut_119_5;
                            stackIn_120_6 = stackOut_119_6;
                            stackIn_120_7 = stackOut_119_7;
                            stackIn_120_8 = stackOut_119_8;
                            stackIn_120_9 = stackOut_119_9;
                            stackIn_120_10 = stackOut_119_10;
                            stackIn_120_11 = stackOut_119_11;
                            stackIn_120_12 = stackOut_119_12;
                            break L39;
                          } else {
                            stackOut_118_0 = this;
                            stackOut_118_1 = stackIn_118_1;
                            stackOut_118_2 = null;
                            stackOut_118_3 = null;
                            stackOut_118_4 = (hn) (Object) stackIn_118_4;
                            stackOut_118_5 = this;
                            stackOut_118_6 = (double[]) (Object) stackIn_118_6;
                            stackOut_118_7 = (double[]) (Object) stackIn_118_7;
                            stackOut_118_8 = stackIn_118_8;
                            stackOut_118_9 = stackIn_118_9;
                            stackOut_118_10 = stackIn_118_10;
                            stackOut_118_11 = stackIn_118_11;
                            stackOut_118_12 = 1;
                            stackIn_120_0 = stackOut_118_0;
                            stackIn_120_1 = stackOut_118_1;
                            stackIn_120_2 = stackOut_118_2;
                            stackIn_120_3 = stackOut_118_3;
                            stackIn_120_4 = stackOut_118_4;
                            stackIn_120_5 = stackOut_118_5;
                            stackIn_120_6 = stackOut_118_6;
                            stackIn_120_7 = stackOut_118_7;
                            stackIn_120_8 = stackOut_118_8;
                            stackIn_120_9 = stackOut_118_9;
                            stackIn_120_10 = stackOut_118_10;
                            stackIn_120_11 = stackOut_118_11;
                            stackIn_120_12 = stackOut_118_12;
                            break L39;
                          }
                        }
                        L40: {
                          ri.a((rk) this, stackIn_120_1, (rk) (Object) new cf(stackIn_120_4, (ee) this, stackIn_120_6, stackIn_120_7, stackIn_120_8, stackIn_120_9, stackIn_120_10 != 0, stackIn_120_11 != 0, stackIn_120_12 != 0));
                          stackOut_120_0 = this;
                          stackOut_120_1 = 0;
                          stackOut_120_2 = null;
                          stackOut_120_3 = null;
                          stackOut_120_4 = ((dj) this).field_A;
                          stackOut_120_5 = this;
                          stackOut_120_6 = (double[]) var3;
                          stackOut_120_7 = me.field_J;
                          stackOut_120_8 = var17 * 0.04;
                          stackOut_120_9 = 0.04 * var15;
                          stackIn_122_0 = stackOut_120_0;
                          stackIn_122_1 = stackOut_120_1;
                          stackIn_122_2 = stackOut_120_2;
                          stackIn_122_3 = stackOut_120_3;
                          stackIn_122_4 = stackOut_120_4;
                          stackIn_122_5 = stackOut_120_5;
                          stackIn_122_6 = stackOut_120_6;
                          stackIn_122_7 = stackOut_120_7;
                          stackIn_122_8 = stackOut_120_8;
                          stackIn_122_9 = stackOut_120_9;
                          stackIn_121_0 = stackOut_120_0;
                          stackIn_121_1 = stackOut_120_1;
                          stackIn_121_2 = stackOut_120_2;
                          stackIn_121_3 = stackOut_120_3;
                          stackIn_121_4 = stackOut_120_4;
                          stackIn_121_5 = stackOut_120_5;
                          stackIn_121_6 = stackOut_120_6;
                          stackIn_121_7 = stackOut_120_7;
                          stackIn_121_8 = stackOut_120_8;
                          stackIn_121_9 = stackOut_120_9;
                          if (0 >= ((dj) this).field_Pb) {
                            stackOut_122_0 = this;
                            stackOut_122_1 = stackIn_122_1;
                            stackOut_122_2 = null;
                            stackOut_122_3 = null;
                            stackOut_122_4 = (hn) (Object) stackIn_122_4;
                            stackOut_122_5 = this;
                            stackOut_122_6 = (double[]) (Object) stackIn_122_6;
                            stackOut_122_7 = (double[]) (Object) stackIn_122_7;
                            stackOut_122_8 = stackIn_122_8;
                            stackOut_122_9 = stackIn_122_9;
                            stackOut_122_10 = 0;
                            stackIn_123_0 = stackOut_122_0;
                            stackIn_123_1 = stackOut_122_1;
                            stackIn_123_2 = stackOut_122_2;
                            stackIn_123_3 = stackOut_122_3;
                            stackIn_123_4 = stackOut_122_4;
                            stackIn_123_5 = stackOut_122_5;
                            stackIn_123_6 = stackOut_122_6;
                            stackIn_123_7 = stackOut_122_7;
                            stackIn_123_8 = stackOut_122_8;
                            stackIn_123_9 = stackOut_122_9;
                            stackIn_123_10 = stackOut_122_10;
                            break L40;
                          } else {
                            stackOut_121_0 = this;
                            stackOut_121_1 = stackIn_121_1;
                            stackOut_121_2 = null;
                            stackOut_121_3 = null;
                            stackOut_121_4 = (hn) (Object) stackIn_121_4;
                            stackOut_121_5 = this;
                            stackOut_121_6 = (double[]) (Object) stackIn_121_6;
                            stackOut_121_7 = (double[]) (Object) stackIn_121_7;
                            stackOut_121_8 = stackIn_121_8;
                            stackOut_121_9 = stackIn_121_9;
                            stackOut_121_10 = 1;
                            stackIn_123_0 = stackOut_121_0;
                            stackIn_123_1 = stackOut_121_1;
                            stackIn_123_2 = stackOut_121_2;
                            stackIn_123_3 = stackOut_121_3;
                            stackIn_123_4 = stackOut_121_4;
                            stackIn_123_5 = stackOut_121_5;
                            stackIn_123_6 = stackOut_121_6;
                            stackIn_123_7 = stackOut_121_7;
                            stackIn_123_8 = stackOut_121_8;
                            stackIn_123_9 = stackOut_121_9;
                            stackIn_123_10 = stackOut_121_10;
                            break L40;
                          }
                        }
                        L41: {
                          stackOut_123_0 = this;
                          stackOut_123_1 = stackIn_123_1;
                          stackOut_123_2 = null;
                          stackOut_123_3 = null;
                          stackOut_123_4 = (hn) (Object) stackIn_123_4;
                          stackOut_123_5 = this;
                          stackOut_123_6 = (double[]) (Object) stackIn_123_6;
                          stackOut_123_7 = (double[]) (Object) stackIn_123_7;
                          stackOut_123_8 = stackIn_123_8;
                          stackOut_123_9 = stackIn_123_9;
                          stackOut_123_10 = stackIn_123_10;
                          stackOut_123_11 = 1;
                          stackIn_125_0 = stackOut_123_0;
                          stackIn_125_1 = stackOut_123_1;
                          stackIn_125_2 = stackOut_123_2;
                          stackIn_125_3 = stackOut_123_3;
                          stackIn_125_4 = stackOut_123_4;
                          stackIn_125_5 = stackOut_123_5;
                          stackIn_125_6 = stackOut_123_6;
                          stackIn_125_7 = stackOut_123_7;
                          stackIn_125_8 = stackOut_123_8;
                          stackIn_125_9 = stackOut_123_9;
                          stackIn_125_10 = stackOut_123_10;
                          stackIn_125_11 = stackOut_123_11;
                          stackIn_124_0 = stackOut_123_0;
                          stackIn_124_1 = stackOut_123_1;
                          stackIn_124_2 = stackOut_123_2;
                          stackIn_124_3 = stackOut_123_3;
                          stackIn_124_4 = stackOut_123_4;
                          stackIn_124_5 = stackOut_123_5;
                          stackIn_124_6 = stackOut_123_6;
                          stackIn_124_7 = stackOut_123_7;
                          stackIn_124_8 = stackOut_123_8;
                          stackIn_124_9 = stackOut_123_9;
                          stackIn_124_10 = stackOut_123_10;
                          stackIn_124_11 = stackOut_123_11;
                          if (((dj) this).field_U <= 0) {
                            stackOut_125_0 = this;
                            stackOut_125_1 = stackIn_125_1;
                            stackOut_125_2 = null;
                            stackOut_125_3 = null;
                            stackOut_125_4 = (hn) (Object) stackIn_125_4;
                            stackOut_125_5 = this;
                            stackOut_125_6 = (double[]) (Object) stackIn_125_6;
                            stackOut_125_7 = (double[]) (Object) stackIn_125_7;
                            stackOut_125_8 = stackIn_125_8;
                            stackOut_125_9 = stackIn_125_9;
                            stackOut_125_10 = stackIn_125_10;
                            stackOut_125_11 = stackIn_125_11;
                            stackOut_125_12 = 0;
                            stackIn_126_0 = stackOut_125_0;
                            stackIn_126_1 = stackOut_125_1;
                            stackIn_126_2 = stackOut_125_2;
                            stackIn_126_3 = stackOut_125_3;
                            stackIn_126_4 = stackOut_125_4;
                            stackIn_126_5 = stackOut_125_5;
                            stackIn_126_6 = stackOut_125_6;
                            stackIn_126_7 = stackOut_125_7;
                            stackIn_126_8 = stackOut_125_8;
                            stackIn_126_9 = stackOut_125_9;
                            stackIn_126_10 = stackOut_125_10;
                            stackIn_126_11 = stackOut_125_11;
                            stackIn_126_12 = stackOut_125_12;
                            break L41;
                          } else {
                            stackOut_124_0 = this;
                            stackOut_124_1 = stackIn_124_1;
                            stackOut_124_2 = null;
                            stackOut_124_3 = null;
                            stackOut_124_4 = (hn) (Object) stackIn_124_4;
                            stackOut_124_5 = this;
                            stackOut_124_6 = (double[]) (Object) stackIn_124_6;
                            stackOut_124_7 = (double[]) (Object) stackIn_124_7;
                            stackOut_124_8 = stackIn_124_8;
                            stackOut_124_9 = stackIn_124_9;
                            stackOut_124_10 = stackIn_124_10;
                            stackOut_124_11 = stackIn_124_11;
                            stackOut_124_12 = 1;
                            stackIn_126_0 = stackOut_124_0;
                            stackIn_126_1 = stackOut_124_1;
                            stackIn_126_2 = stackOut_124_2;
                            stackIn_126_3 = stackOut_124_3;
                            stackIn_126_4 = stackOut_124_4;
                            stackIn_126_5 = stackOut_124_5;
                            stackIn_126_6 = stackOut_124_6;
                            stackIn_126_7 = stackOut_124_7;
                            stackIn_126_8 = stackOut_124_8;
                            stackIn_126_9 = stackOut_124_9;
                            stackIn_126_10 = stackOut_124_10;
                            stackIn_126_11 = stackOut_124_11;
                            stackIn_126_12 = stackOut_124_12;
                            break L41;
                          }
                        }
                        ri.a((rk) this, stackIn_126_1, (rk) (Object) new cf(stackIn_126_4, (ee) this, stackIn_126_6, stackIn_126_7, stackIn_126_8, stackIn_126_9, stackIn_126_10 != 0, stackIn_126_11 != 0, stackIn_126_12 != 0));
                        ((dj) this).field_Z = 63 & ((dj) this).field_Z + ((dj) this).field_kb;
                        var12 += 4;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    var13_int = 0;
                    L42: while (true) {
                      if (5 <= var13_int) {
                        L43: {
                          ((dj) this).field_Hb = ((dj) this).field_Hb - var11;
                          stackOut_138_0 = (int)(24.0 * Math.sqrt((double)var12));
                          stackOut_138_1 = 0;
                          stackIn_140_0 = stackOut_138_0;
                          stackIn_140_1 = stackOut_138_1;
                          stackIn_139_0 = stackOut_138_0;
                          stackIn_139_1 = stackOut_138_1;
                          if (((dj) this).field_U <= 0) {
                            stackOut_140_0 = stackIn_140_0;
                            stackOut_140_1 = stackIn_140_1;
                            stackOut_140_2 = d.field_g;
                            stackIn_141_0 = stackOut_140_0;
                            stackIn_141_1 = stackOut_140_1;
                            stackIn_141_2 = stackOut_140_2;
                            break L43;
                          } else {
                            stackOut_139_0 = stackIn_139_0;
                            stackOut_139_1 = stackIn_139_1;
                            stackOut_139_2 = qj.field_b;
                            stackIn_141_0 = stackOut_139_0;
                            stackIn_141_1 = stackOut_139_1;
                            stackIn_141_2 = stackOut_139_2;
                            break L43;
                          }
                        }
                        da.a(stackIn_141_0, stackIn_141_1, stackIn_141_2, true, (pm) this);
                        break L29;
                      } else {
                        var14_ref_h = ((dj) this).field_Nb[var13_int];
                        if (var14_ref_h != null) {
                          L44: {
                            var14_ref_h.field_Z.b(118);
                            var12++;
                            stackOut_131_0 = this;
                            stackOut_131_1 = 0;
                            stackOut_131_2 = null;
                            stackOut_131_3 = null;
                            stackOut_131_4 = ((dj) this).field_A;
                            stackOut_131_5 = (h) var14_ref_h;
                            stackOut_131_6 = (double[]) var3;
                            stackOut_131_7 = og.field_g;
                            stackOut_131_8 = 0.0;
                            stackOut_131_9 = 0.0;
                            stackIn_133_0 = stackOut_131_0;
                            stackIn_133_1 = stackOut_131_1;
                            stackIn_133_2 = stackOut_131_2;
                            stackIn_133_3 = stackOut_131_3;
                            stackIn_133_4 = stackOut_131_4;
                            stackIn_133_5 = stackOut_131_5;
                            stackIn_133_6 = stackOut_131_6;
                            stackIn_133_7 = stackOut_131_7;
                            stackIn_133_8 = stackOut_131_8;
                            stackIn_133_9 = stackOut_131_9;
                            stackIn_132_0 = stackOut_131_0;
                            stackIn_132_1 = stackOut_131_1;
                            stackIn_132_2 = stackOut_131_2;
                            stackIn_132_3 = stackOut_131_3;
                            stackIn_132_4 = stackOut_131_4;
                            stackIn_132_5 = stackOut_131_5;
                            stackIn_132_6 = stackOut_131_6;
                            stackIn_132_7 = stackOut_131_7;
                            stackIn_132_8 = stackOut_131_8;
                            stackIn_132_9 = stackOut_131_9;
                            if (((dj) this).field_Pb <= 0) {
                              stackOut_133_0 = this;
                              stackOut_133_1 = stackIn_133_1;
                              stackOut_133_2 = null;
                              stackOut_133_3 = null;
                              stackOut_133_4 = (hn) (Object) stackIn_133_4;
                              stackOut_133_5 = (h) (Object) stackIn_133_5;
                              stackOut_133_6 = (double[]) (Object) stackIn_133_6;
                              stackOut_133_7 = (double[]) (Object) stackIn_133_7;
                              stackOut_133_8 = stackIn_133_8;
                              stackOut_133_9 = stackIn_133_9;
                              stackOut_133_10 = 0;
                              stackIn_134_0 = stackOut_133_0;
                              stackIn_134_1 = stackOut_133_1;
                              stackIn_134_2 = stackOut_133_2;
                              stackIn_134_3 = stackOut_133_3;
                              stackIn_134_4 = stackOut_133_4;
                              stackIn_134_5 = stackOut_133_5;
                              stackIn_134_6 = stackOut_133_6;
                              stackIn_134_7 = stackOut_133_7;
                              stackIn_134_8 = stackOut_133_8;
                              stackIn_134_9 = stackOut_133_9;
                              stackIn_134_10 = stackOut_133_10;
                              break L44;
                            } else {
                              stackOut_132_0 = this;
                              stackOut_132_1 = stackIn_132_1;
                              stackOut_132_2 = null;
                              stackOut_132_3 = null;
                              stackOut_132_4 = (hn) (Object) stackIn_132_4;
                              stackOut_132_5 = (h) (Object) stackIn_132_5;
                              stackOut_132_6 = (double[]) (Object) stackIn_132_6;
                              stackOut_132_7 = (double[]) (Object) stackIn_132_7;
                              stackOut_132_8 = stackIn_132_8;
                              stackOut_132_9 = stackIn_132_9;
                              stackOut_132_10 = 1;
                              stackIn_134_0 = stackOut_132_0;
                              stackIn_134_1 = stackOut_132_1;
                              stackIn_134_2 = stackOut_132_2;
                              stackIn_134_3 = stackOut_132_3;
                              stackIn_134_4 = stackOut_132_4;
                              stackIn_134_5 = stackOut_132_5;
                              stackIn_134_6 = stackOut_132_6;
                              stackIn_134_7 = stackOut_132_7;
                              stackIn_134_8 = stackOut_132_8;
                              stackIn_134_9 = stackOut_132_9;
                              stackIn_134_10 = stackOut_132_10;
                              break L44;
                            }
                          }
                          L45: {
                            stackOut_134_0 = this;
                            stackOut_134_1 = stackIn_134_1;
                            stackOut_134_2 = null;
                            stackOut_134_3 = null;
                            stackOut_134_4 = (hn) (Object) stackIn_134_4;
                            stackOut_134_5 = (h) (Object) stackIn_134_5;
                            stackOut_134_6 = (double[]) (Object) stackIn_134_6;
                            stackOut_134_7 = (double[]) (Object) stackIn_134_7;
                            stackOut_134_8 = stackIn_134_8;
                            stackOut_134_9 = stackIn_134_9;
                            stackOut_134_10 = stackIn_134_10;
                            stackOut_134_11 = 0;
                            stackIn_136_0 = stackOut_134_0;
                            stackIn_136_1 = stackOut_134_1;
                            stackIn_136_2 = stackOut_134_2;
                            stackIn_136_3 = stackOut_134_3;
                            stackIn_136_4 = stackOut_134_4;
                            stackIn_136_5 = stackOut_134_5;
                            stackIn_136_6 = stackOut_134_6;
                            stackIn_136_7 = stackOut_134_7;
                            stackIn_136_8 = stackOut_134_8;
                            stackIn_136_9 = stackOut_134_9;
                            stackIn_136_10 = stackOut_134_10;
                            stackIn_136_11 = stackOut_134_11;
                            stackIn_135_0 = stackOut_134_0;
                            stackIn_135_1 = stackOut_134_1;
                            stackIn_135_2 = stackOut_134_2;
                            stackIn_135_3 = stackOut_134_3;
                            stackIn_135_4 = stackOut_134_4;
                            stackIn_135_5 = stackOut_134_5;
                            stackIn_135_6 = stackOut_134_6;
                            stackIn_135_7 = stackOut_134_7;
                            stackIn_135_8 = stackOut_134_8;
                            stackIn_135_9 = stackOut_134_9;
                            stackIn_135_10 = stackOut_134_10;
                            stackIn_135_11 = stackOut_134_11;
                            if (0 >= ((dj) this).field_U) {
                              stackOut_136_0 = this;
                              stackOut_136_1 = stackIn_136_1;
                              stackOut_136_2 = null;
                              stackOut_136_3 = null;
                              stackOut_136_4 = (hn) (Object) stackIn_136_4;
                              stackOut_136_5 = (h) (Object) stackIn_136_5;
                              stackOut_136_6 = (double[]) (Object) stackIn_136_6;
                              stackOut_136_7 = (double[]) (Object) stackIn_136_7;
                              stackOut_136_8 = stackIn_136_8;
                              stackOut_136_9 = stackIn_136_9;
                              stackOut_136_10 = stackIn_136_10;
                              stackOut_136_11 = stackIn_136_11;
                              stackOut_136_12 = 0;
                              stackIn_137_0 = stackOut_136_0;
                              stackIn_137_1 = stackOut_136_1;
                              stackIn_137_2 = stackOut_136_2;
                              stackIn_137_3 = stackOut_136_3;
                              stackIn_137_4 = stackOut_136_4;
                              stackIn_137_5 = stackOut_136_5;
                              stackIn_137_6 = stackOut_136_6;
                              stackIn_137_7 = stackOut_136_7;
                              stackIn_137_8 = stackOut_136_8;
                              stackIn_137_9 = stackOut_136_9;
                              stackIn_137_10 = stackOut_136_10;
                              stackIn_137_11 = stackOut_136_11;
                              stackIn_137_12 = stackOut_136_12;
                              break L45;
                            } else {
                              stackOut_135_0 = this;
                              stackOut_135_1 = stackIn_135_1;
                              stackOut_135_2 = null;
                              stackOut_135_3 = null;
                              stackOut_135_4 = (hn) (Object) stackIn_135_4;
                              stackOut_135_5 = (h) (Object) stackIn_135_5;
                              stackOut_135_6 = (double[]) (Object) stackIn_135_6;
                              stackOut_135_7 = (double[]) (Object) stackIn_135_7;
                              stackOut_135_8 = stackIn_135_8;
                              stackOut_135_9 = stackIn_135_9;
                              stackOut_135_10 = stackIn_135_10;
                              stackOut_135_11 = stackIn_135_11;
                              stackOut_135_12 = 1;
                              stackIn_137_0 = stackOut_135_0;
                              stackIn_137_1 = stackOut_135_1;
                              stackIn_137_2 = stackOut_135_2;
                              stackIn_137_3 = stackOut_135_3;
                              stackIn_137_4 = stackOut_135_4;
                              stackIn_137_5 = stackOut_135_5;
                              stackIn_137_6 = stackOut_135_6;
                              stackIn_137_7 = stackOut_135_7;
                              stackIn_137_8 = stackOut_135_8;
                              stackIn_137_9 = stackOut_135_9;
                              stackIn_137_10 = stackOut_135_10;
                              stackIn_137_11 = stackOut_135_11;
                              stackIn_137_12 = stackOut_135_12;
                              break L45;
                            }
                          }
                          ri.a((rk) this, stackIn_137_1, (rk) (Object) new cf(stackIn_137_4, (ee) (Object) stackIn_137_5, stackIn_137_6, stackIn_137_7, stackIn_137_8, stackIn_137_9, stackIn_137_10 != 0, stackIn_137_11 != 0, stackIn_137_12 != 0));
                          var13_int++;
                          continue L42;
                        } else {
                          var13_int++;
                          continue L42;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L46: {
          if (((dj) this).field_cb) {
            if (!((dj) this).field_A.field_M) {
              if (!((dj) this).field_Mb) {
                if (mc.field_e[ql.field_u]) {
                  stackOut_151_0 = 1;
                  stackIn_153_0 = stackOut_151_0;
                  break L46;
                } else {
                  stackOut_150_0 = 0;
                  stackIn_153_0 = stackOut_150_0;
                  break L46;
                }
              } else {
                stackOut_148_0 = 0;
                stackIn_153_0 = stackOut_148_0;
                break L46;
              }
            } else {
              stackOut_146_0 = 0;
              stackIn_153_0 = stackOut_146_0;
              break L46;
            }
          } else {
            stackOut_144_0 = 0;
            stackIn_153_0 = stackOut_144_0;
            break L46;
          }
        }
        L47: {
          L48: {
            var11 = stackIn_153_0;
            if (var11 == 0) {
              break L48;
            } else {
              if (((dj) this).field_Hb >= 2048) {
                ((dj) this).field_fb = ((dj) this).field_fb + 1;
                ((dj) this).field_Hb = ((dj) this).field_Hb - 2048;
                if (null != ((dj) this).field_wb) {
                  break L47;
                } else {
                  ((dj) this).field_wb = new gk((pm) this, sf.field_p, 1, true);
                  break L47;
                }
              } else {
                break L48;
              }
            }
          }
          L49: {
            if (var11 != 0) {
              ((dj) this).field_Mb = true;
              break L49;
            } else {
              break L49;
            }
          }
          L50: {
            L51: {
              if (!((dj) this).field_cb) {
                break L51;
              } else {
                if (16 > ((dj) this).field_fb) {
                  break L51;
                } else {
                  L52: {
                    ((dj) this).field_A.field_t = true;
                    ((dj) this).field_A.field_v = true;
                    ((dj) this).field_Lb.b(118);
                    stackOut_161_0 = this;
                    stackOut_161_1 = 0;
                    stackOut_161_2 = null;
                    stackOut_161_3 = null;
                    stackOut_161_4 = ((dj) this).field_A;
                    stackOut_161_5 = this;
                    stackOut_161_6 = (double[]) var3;
                    stackOut_161_7 = 0.015625 * (double)((dj) this).field_fb;
                    stackIn_163_0 = stackOut_161_0;
                    stackIn_163_1 = stackOut_161_1;
                    stackIn_163_2 = stackOut_161_2;
                    stackIn_163_3 = stackOut_161_3;
                    stackIn_163_4 = stackOut_161_4;
                    stackIn_163_5 = stackOut_161_5;
                    stackIn_163_6 = stackOut_161_6;
                    stackIn_163_7 = stackOut_161_7;
                    stackIn_162_0 = stackOut_161_0;
                    stackIn_162_1 = stackOut_161_1;
                    stackIn_162_2 = stackOut_161_2;
                    stackIn_162_3 = stackOut_161_3;
                    stackIn_162_4 = stackOut_161_4;
                    stackIn_162_5 = stackOut_161_5;
                    stackIn_162_6 = stackOut_161_6;
                    stackIn_162_7 = stackOut_161_7;
                    if (0 >= ((dj) this).field_Pb) {
                      stackOut_163_0 = this;
                      stackOut_163_1 = stackIn_163_1;
                      stackOut_163_2 = null;
                      stackOut_163_3 = null;
                      stackOut_163_4 = (hn) (Object) stackIn_163_4;
                      stackOut_163_5 = this;
                      stackOut_163_6 = (double[]) (Object) stackIn_163_6;
                      stackOut_163_7 = stackIn_163_7;
                      stackOut_163_8 = 0;
                      stackIn_164_0 = stackOut_163_0;
                      stackIn_164_1 = stackOut_163_1;
                      stackIn_164_2 = stackOut_163_2;
                      stackIn_164_3 = stackOut_163_3;
                      stackIn_164_4 = stackOut_163_4;
                      stackIn_164_5 = stackOut_163_5;
                      stackIn_164_6 = stackOut_163_6;
                      stackIn_164_7 = stackOut_163_7;
                      stackIn_164_8 = stackOut_163_8;
                      break L52;
                    } else {
                      stackOut_162_0 = this;
                      stackOut_162_1 = stackIn_162_1;
                      stackOut_162_2 = null;
                      stackOut_162_3 = null;
                      stackOut_162_4 = (hn) (Object) stackIn_162_4;
                      stackOut_162_5 = this;
                      stackOut_162_6 = (double[]) (Object) stackIn_162_6;
                      stackOut_162_7 = stackIn_162_7;
                      stackOut_162_8 = 1;
                      stackIn_164_0 = stackOut_162_0;
                      stackIn_164_1 = stackOut_162_1;
                      stackIn_164_2 = stackOut_162_2;
                      stackIn_164_3 = stackOut_162_3;
                      stackIn_164_4 = stackOut_162_4;
                      stackIn_164_5 = stackOut_162_5;
                      stackIn_164_6 = stackOut_162_6;
                      stackIn_164_7 = stackOut_162_7;
                      stackIn_164_8 = stackOut_162_8;
                      break L52;
                    }
                  }
                  ri.a((rk) this, stackIn_164_1, (rk) (Object) new wm(stackIn_164_4, (dj) this, stackIn_164_6, stackIn_164_7, stackIn_164_8 != 0));
                  ((dj) this).field_fb = 0;
                  break L50;
                }
              }
            }
            if (0 >= ((dj) this).field_fb) {
              break L50;
            } else {
              ((dj) this).field_fb = ((dj) this).field_fb - 1;
              break L50;
            }
          }
          if (null != ((dj) this).field_wb) {
            var12_ref_Object = (Object) (Object) cb.field_a;
            synchronized (var12_ref_Object) {
              L53: {
                ((dj) this).field_wb.field_n.b(true);
                ((dj) this).field_wb.field_n.c(0);
                break L53;
              }
            }
            ((dj) this).field_wb = null;
            break L47;
          } else {
            break L47;
          }
        }
        L54: {
          if (((dj) this).field_eb) {
            if (!((dj) this).field_A.field_M) {
              if (!((dj) this).field_Mb) {
                if (mc.field_e[nl.field_b]) {
                  stackOut_185_0 = 1;
                  stackIn_187_0 = stackOut_185_0;
                  break L54;
                } else {
                  stackOut_184_0 = 0;
                  stackIn_187_0 = stackOut_184_0;
                  break L54;
                }
              } else {
                stackOut_182_0 = 0;
                stackIn_187_0 = stackOut_182_0;
                break L54;
              }
            } else {
              stackOut_180_0 = 0;
              stackIn_187_0 = stackOut_180_0;
              break L54;
            }
          } else {
            stackOut_178_0 = 0;
            stackIn_187_0 = stackOut_178_0;
            break L54;
          }
        }
        L55: {
          L56: {
            var11 = stackIn_187_0;
            if (var11 == 0) {
              break L56;
            } else {
              if (((dj) this).field_Hb < 2048) {
                break L56;
              } else {
                ((dj) this).field_Hb = ((dj) this).field_Hb - 2048;
                ((dj) this).field_lb = ((dj) this).field_lb + 1;
                if (null != ((dj) this).field_Y) {
                  break L55;
                } else {
                  ((dj) this).field_Y = new gk((pm) this, th.field_bb, 1, true);
                  break L55;
                }
              }
            }
          }
          L57: {
            if (var11 != 0) {
              ((dj) this).field_Mb = true;
              break L57;
            } else {
              break L57;
            }
          }
          L58: {
            L59: {
              if (!((dj) this).field_eb) {
                break L59;
              } else {
                if (((dj) this).field_lb < 16) {
                  break L59;
                } else {
                  L60: {
                    ((dj) this).field_A.field_v = true;
                    ((dj) this).field_A.field_t = true;
                    ((dj) this).field_Lb.b(118);
                    stackOut_196_0 = this;
                    stackOut_196_1 = 0;
                    stackOut_196_2 = null;
                    stackOut_196_3 = null;
                    stackOut_196_4 = ((dj) this).field_A;
                    stackOut_196_5 = this;
                    stackOut_196_6 = (double[]) var3;
                    stackOut_196_7 = (double)((dj) this).field_lb * 0.015625;
                    stackIn_198_0 = stackOut_196_0;
                    stackIn_198_1 = stackOut_196_1;
                    stackIn_198_2 = stackOut_196_2;
                    stackIn_198_3 = stackOut_196_3;
                    stackIn_198_4 = stackOut_196_4;
                    stackIn_198_5 = stackOut_196_5;
                    stackIn_198_6 = stackOut_196_6;
                    stackIn_198_7 = stackOut_196_7;
                    stackIn_197_0 = stackOut_196_0;
                    stackIn_197_1 = stackOut_196_1;
                    stackIn_197_2 = stackOut_196_2;
                    stackIn_197_3 = stackOut_196_3;
                    stackIn_197_4 = stackOut_196_4;
                    stackIn_197_5 = stackOut_196_5;
                    stackIn_197_6 = stackOut_196_6;
                    stackIn_197_7 = stackOut_196_7;
                    if (-1 <= ((dj) this).field_Pb) {
                      stackOut_198_0 = this;
                      stackOut_198_1 = stackIn_198_1;
                      stackOut_198_2 = null;
                      stackOut_198_3 = null;
                      stackOut_198_4 = (hn) (Object) stackIn_198_4;
                      stackOut_198_5 = this;
                      stackOut_198_6 = (double[]) (Object) stackIn_198_6;
                      stackOut_198_7 = stackIn_198_7;
                      stackOut_198_8 = 0;
                      stackIn_199_0 = stackOut_198_0;
                      stackIn_199_1 = stackOut_198_1;
                      stackIn_199_2 = stackOut_198_2;
                      stackIn_199_3 = stackOut_198_3;
                      stackIn_199_4 = stackOut_198_4;
                      stackIn_199_5 = stackOut_198_5;
                      stackIn_199_6 = stackOut_198_6;
                      stackIn_199_7 = stackOut_198_7;
                      stackIn_199_8 = stackOut_198_8;
                      break L60;
                    } else {
                      stackOut_197_0 = this;
                      stackOut_197_1 = stackIn_197_1;
                      stackOut_197_2 = null;
                      stackOut_197_3 = null;
                      stackOut_197_4 = (hn) (Object) stackIn_197_4;
                      stackOut_197_5 = this;
                      stackOut_197_6 = (double[]) (Object) stackIn_197_6;
                      stackOut_197_7 = stackIn_197_7;
                      stackOut_197_8 = 1;
                      stackIn_199_0 = stackOut_197_0;
                      stackIn_199_1 = stackOut_197_1;
                      stackIn_199_2 = stackOut_197_2;
                      stackIn_199_3 = stackOut_197_3;
                      stackIn_199_4 = stackOut_197_4;
                      stackIn_199_5 = stackOut_197_5;
                      stackIn_199_6 = stackOut_197_6;
                      stackIn_199_7 = stackOut_197_7;
                      stackIn_199_8 = stackOut_197_8;
                      break L60;
                    }
                  }
                  ri.a((rk) this, stackIn_199_1, (rk) (Object) new il(stackIn_199_4, (dj) this, stackIn_199_6, stackIn_199_7, stackIn_199_8 != 0));
                  ((dj) this).field_lb = 0;
                  break L58;
                }
              }
            }
            if (-1 >= ((dj) this).field_lb) {
              break L58;
            } else {
              ((dj) this).field_lb = ((dj) this).field_lb - 1;
              break L58;
            }
          }
          if (null != ((dj) this).field_Y) {
            var12_ref_Object = (Object) (Object) cb.field_a;
            synchronized (var12_ref_Object) {
              L61: {
                ((dj) this).field_Y.field_n.b(true);
                ((dj) this).field_Y.field_n.c(0);
                break L61;
              }
            }
            ((dj) this).field_Y = null;
            break L55;
          } else {
            break L55;
          }
        }
        L62: {
          L63: {
            if (!((dj) this).field_Sb) {
              break L63;
            } else {
              if (((dj) this).field_A.field_M) {
                break L63;
              } else {
                if (((dj) this).field_Mb) {
                  break L63;
                } else {
                  if (mc.field_e[ln.field_b]) {
                    if (((dj) this).field_Hb >= 2048) {
                      ((dj) this).field_A.field_v = true;
                      ((dj) this).field_A.field_t = true;
                      ((dj) this).field_Q = 8;
                      break L62;
                    } else {
                      ((dj) this).field_Q = ((dj) this).field_Q - 1;
                      ((dj) this).field_Mb = true;
                      break L62;
                    }
                  } else {
                    break L63;
                  }
                }
              }
            }
          }
          if (((dj) this).field_Q <= 0) {
            break L62;
          } else {
            ((dj) this).field_Q = ((dj) this).field_Q - 1;
            break L62;
          }
        }
        L64: {
          if (((dj) this).field_Pb <= 0) {
            stackOut_222_0 = null;
            stackIn_223_0 = (pm) (Object) stackOut_222_0;
            break L64;
          } else {
            stackOut_221_0 = ((dj) this).a(var45[9], var45[10], var45[11], false);
            stackIn_223_0 = stackOut_221_0;
            break L64;
          }
        }
        L65: {
          var11_ref_pm = stackIn_223_0;
          if (var11_ref_pm == null) {
            var12 = 0;
            L66: while (true) {
              if (((dj) this).field_bb.length <= var12) {
                var12 = 0;
                L67: while (true) {
                  if (var12 >= 5) {
                    break L65;
                  } else {
                    var34 = ((dj) this).field_Nb[var12];
                    var19 = var34;
                    var19 = var34;
                    var13 = var34;
                    if (var13 != null) {
                      var34.field_T[2] = var45[11];
                      var34.field_T[0] = var45[9];
                      var34.field_T[1] = var45[10];
                      var12++;
                      continue L67;
                    } else {
                      var12++;
                      continue L67;
                    }
                  }
                }
              } else {
                ((dj) this).field_bb[var12] = var45[9];
                ((dj) this).field_bb[1 + var12] = var45[10];
                ((dj) this).field_bb[var12 + 2] = var45[11];
                var12 += 3;
                continue L66;
              }
            }
          } else {
            ((dj) this).a(((dj) this).field_bb, var11_ref_pm, 0.2, ((dj) this).field_jb, ac.field_c, -115);
            var12 = 0;
            L68: while (true) {
              if (var12 >= 5) {
                break L65;
              } else {
                var38 = ((dj) this).field_Nb[var12];
                var19 = var38;
                var19 = var38;
                if (var38 != null) {
                  ((dj) this).a(var38.field_T, var11_ref_pm, 0.2, ((dj) this).field_jb, og.field_g, param0 ^ 11780);
                  var12++;
                  continue L68;
                } else {
                  var12++;
                  continue L68;
                }
              }
            }
          }
        }
        L69: {
          if (((dj) this).field_Q <= 0) {
            break L69;
          } else {
            L70: {
              ((dj) this).field_Lb.b(118);
              ((dj) this).field_Hb = ((dj) this).field_Hb - 256 * ((dj) this).field_Q;
              if (((dj) this).field_Hb >= 0) {
                break L70;
              } else {
                ((dj) this).field_Hb = 0;
                ((dj) this).field_Mb = true;
                break L70;
              }
            }
            var11 = -1610547456 & 32768 * ((dj) this).field_Q >>> 3 | (((dj) this).field_Q * 4194559 & 133695480) >>> 3;
            var12_double = (double)(((dj) this).field_Q / 8);
            var14 = 1.0 * var12_double;
            var16 = var12_double;
            var18 = 0;
            L71: while (true) {
              if (var18 >= 4) {
                var35 = 0;
                var18 = var35;
                L72: while (true) {
                  if (var35 >= 5) {
                    break L69;
                  } else {
                    var19 = ((dj) this).field_Nb[var35];
                    if (var19 != null) {
                      L73: {
                        var19.field_Z.b(param0 ^ 11792);
                        var19.a(false, var45, 0, og.field_g);
                        var19.field_Q.a(ud.field_o, var11, var19.field_T[2], var14, var12_double, dh.field_sb, rn.field_c, var19.field_T[0], false, var19.field_T[1]);
                        if (null == var19.field_Q.field_Q) {
                          break L73;
                        } else {
                          var19.field_Q.field_Q.field_m = ((dj) this).field_Q * 96 >> 3;
                          break L73;
                        }
                      }
                      ((dj) this).field_A.field_b.a((rk) (Object) var19.field_Q, (byte) 79);
                      var35++;
                      continue L72;
                    } else {
                      var35++;
                      continue L72;
                    }
                  }
                }
              } else {
                ((dj) this).a(false, var45, var18 * 3, ac.field_c);
                ((dj) this).field_Ab[var18].a(ud.field_o, var11, ((dj) this).field_bb[2 + var18 * 3], var14, var16, dh.field_sb, rn.field_c, ((dj) this).field_bb[var18 * 3], false, ((dj) this).field_bb[1 + 3 * var18]);
                ((dj) this).field_Ab[var18].field_Q.field_m = ((dj) this).field_Q * 96 >> 3;
                ((dj) this).field_A.field_b.a((rk) (Object) ((dj) this).field_Ab[var18], (byte) -64);
                var18++;
                continue L71;
              }
            }
          }
        }
        L74: {
          ((dj) this).field_Db = ((dj) this).field_Db * 0.92;
          ((dj) this).field_db.field_m = 0;
          if (!((dj) this).field_rb) {
            break L74;
          } else {
            if (((dj) this).field_A.field_M) {
              break L74;
            } else {
              if (((dj) this).field_Mb) {
                break L74;
              } else {
                if (!mc.field_e[oc.field_e]) {
                  break L74;
                } else {
                  ((dj) this).field_Hb = ((dj) this).field_Hb - 2048;
                  if (0 <= ((dj) this).field_Hb) {
                    L75: {
                      ((dj) this).field_db.field_m = 48;
                      var11 = 0;
                      ((dj) this).field_S.a(12607743, 0, 50.0, 8.0);
                      if (!((dj) this).field_S.a((hm[]) null, false, 10.0)) {
                        break L75;
                      } else {
                        ((dj) this).field_A.field_t = true;
                        var11 += 4;
                        ((dj) this).field_Lb.b(118);
                        ((dj) this).field_S.field_Q.field_m = 48;
                        ((dj) this).field_A.field_F.a((rk) (Object) ((dj) this).field_S, (byte) 116);
                        break L75;
                      }
                    }
                    var12 = 0;
                    L76: while (true) {
                      if (var12 >= 5) {
                        ((dj) this).field_Db = ((dj) this).field_Db + (double)var11;
                        break L74;
                      } else {
                        var39 = ((dj) this).field_Nb[var12];
                        if (var39 != null) {
                          var39.field_X.a(12607743, param0 ^ 11878, 50.0, 8.0);
                          if (var39.field_X.a((hm[]) null, false, 3.0)) {
                            var39.field_X.field_Q.field_m = 32;
                            ((dj) this).field_A.field_t = true;
                            ((dj) this).field_A.field_F.a((rk) (Object) var39.field_X, (byte) -95);
                            var39.field_Z.b(118);
                            var11++;
                            var12++;
                            continue L76;
                          } else {
                            var12++;
                            continue L76;
                          }
                        } else {
                          var12++;
                          continue L76;
                        }
                      }
                    }
                  } else {
                    ((dj) this).field_Mb = true;
                    ((dj) this).field_Hb = 0;
                    break L74;
                  }
                }
              }
            }
          }
        }
        L77: {
          ((dj) this).field_V.field_m = (int)(8.0 * Math.sqrt(((dj) this).field_Db));
          if (((dj) this).field_ob != 0) {
            ((dj) this).field_ob = ((dj) this).field_ob - 1;
            break L77;
          } else {
            L78: {
              if (((dj) this).field_ub <= 0) {
                break L78;
              } else {
                if (((dj) this).field_A.field_M) {
                  break L78;
                } else {
                  if (mc.field_e[ja.field_d]) {
                    ((dj) this).field_Lb.b(118);
                    ri.a((rk) this, 0, (rk) (Object) new th(((dj) this).field_A, (dj) this));
                    ((dj) this).field_ob = 16;
                    ((dj) this).field_ub = ((dj) this).field_ub - 1;
                    break L77;
                  } else {
                    break L78;
                  }
                }
              }
            }
            L79: {
              if (0 >= ((dj) this).field_tb) {
                break L79;
              } else {
                if (((dj) this).field_A.field_M) {
                  break L79;
                } else {
                  if (mc.field_e[ib.field_W]) {
                    ((dj) this).field_Lb.b(118);
                    ri.a((rk) this, 0, (rk) (Object) new gm(((dj) this).field_A, (dj) this));
                    ((dj) this).field_tb = ((dj) this).field_tb - 1;
                    ((dj) this).field_ob = 16;
                    break L77;
                  } else {
                    break L79;
                  }
                }
              }
            }
            L80: {
              if (((dj) this).field_zb <= 0) {
                break L80;
              } else {
                if (((dj) this).field_A.field_M) {
                  break L80;
                } else {
                  if (mc.field_e[vf.field_l]) {
                    ((dj) this).field_Lb.b(118);
                    ri.a((rk) this, 0, (rk) (Object) new ik(((dj) this).field_A, (dj) this));
                    ((dj) this).field_zb = ((dj) this).field_zb - 1;
                    ((dj) this).field_ob = 16;
                    break L77;
                  } else {
                    break L80;
                  }
                }
              }
            }
            if (((dj) this).field_ab <= 0) {
              break L77;
            } else {
              if (((dj) this).field_A.field_M) {
                break L77;
              } else {
                if (!mc.field_e[sb.field_f]) {
                  break L77;
                } else {
                  if (((dj) this).field_A.field_P) {
                    break L77;
                  } else {
                    if (0 == ((dj) this).field_A.field_L) {
                      ((dj) this).field_Lb.b(118);
                      ri.a((rk) this, 0, (rk) (Object) new gi(((dj) this).field_A, (dj) this));
                      ((dj) this).field_ob = 16;
                      ((dj) this).field_A.field_P = true;
                      ((dj) this).field_ab = ((dj) this).field_ab - 1;
                      break L77;
                    } else {
                      break L77;
                    }
                  }
                }
              }
            }
          }
        }
        L81: {
          if (0 >= ((dj) this).field_U) {
            break L81;
          } else {
            ((dj) this).field_U = ((dj) this).field_U - 1;
            break L81;
          }
        }
        L82: {
          if (0 >= ((dj) this).field_Pb) {
            break L82;
          } else {
            ((dj) this).field_Pb = ((dj) this).field_Pb - 1;
            break L82;
          }
        }
        L83: {
          if (0 >= ((dj) this).field_ib) {
            break L83;
          } else {
            ((dj) this).field_ib = ((dj) this).field_ib - 1;
            if (-1 != ((dj) this).field_ib) {
              break L83;
            } else {
              ((dj) this).field_Bb.field_l = false;
              var11 = 0;
              L84: while (true) {
                if (-6 <= var11) {
                  break L83;
                } else {
                  if (null != ((dj) this).field_Nb[var11]) {
                    ((dj) this).field_Nb[var11].field_ab.field_l = false;
                    var11++;
                    continue L84;
                  } else {
                    var11++;
                    continue L84;
                  }
                }
              }
            }
          }
        }
        L85: {
          if (((dj) this).field_Gb > 0) {
            ((dj) this).field_Gb = ((dj) this).field_Gb - 1;
            break L85;
          } else {
            break L85;
          }
        }
        L86: {
          if (((dj) this).field_Gb <= 0) {
            if (((dj) this).field_Kb > 0) {
              ((dj) this).field_Kb = ((dj) this).field_Kb - 16;
              break L86;
            } else {
              break L86;
            }
          } else {
            if (256 > ((dj) this).field_Kb) {
              ((dj) this).field_Kb = ((dj) this).field_Kb + 16;
              break L86;
            } else {
              break L86;
            }
          }
        }
        L87: {
          if (128 <= ((dj) this).field_Kb) {
            break L87;
          } else {
            ((dj) this).field_Lb.b(param0 ^ 11792);
            var11 = 0;
            L88: while (true) {
              if (var11 >= 5) {
                break L87;
              } else {
                if (null != ((dj) this).field_Nb[var11]) {
                  ((dj) this).field_Nb[var11].field_Z.b(118);
                  var11++;
                  continue L88;
                } else {
                  var11++;
                  continue L88;
                }
              }
            }
          }
        }
        L89: {
          if (((dj) this).field_R <= 0) {
            break L89;
          } else {
            ((dj) this).field_R = ((dj) this).field_R - 1;
            break L89;
          }
        }
    }

    final boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 8) {
            break L0;
          } else {
            ((dj) this).a(-87, -78);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((dj) this).field_A.field_K == null) {
              break L2;
            } else {
              if (((dj) this).field_A.field_x.field_r[-1 + ((dj) this).field_A.field_x.field_a] < ((dj) this).field_D) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void g(int param0) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        ka var13 = null;
        L0: {
          ((dj) this).field_A.field_m.m(10959);
          ((dj) this).field_A.field_m.field_D = ((dj) this).field_A.field_m.field_O;
          ((dj) this).field_A.field_m.field_E = ((dj) this).field_A.field_m.field_T;
          ((dj) this).field_A.field_m.field_t = ((dj) this).field_A.field_m.field_L;
          ((dj) this).field_A.field_m.field_X = new da(((dj) this).field_A.field_m.field_W);
          var13 = ((dj) this).a((byte) 107, ri.field_b, 2.0);
          var13.field_M.field_w = ((dj) this).field_C * 2.0;
          int discarded$3 = -1;
          this.m();
          int discarded$4 = 94;
          this.h();
          int discarded$5 = 0;
          this.d();
          if (((dj) this).field_A.field_L > 0) {
            var3 = ((dj) this).field_A.field_A * ((dj) this).field_A.field_A;
            var5 = ((dj) this).field_E - ((dj) this).field_A.field_s;
            var7 = ((dj) this).field_t - ((dj) this).field_A.field_r;
            var9 = -((dj) this).field_A.field_E + ((dj) this).field_D;
            var11 = var7 * var7 + var5 * var5 + var9 * var9;
            if (var11 > var3) {
              break L0;
            } else {
              di.a(-30867, 245, 10);
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == 26402) {
            break L1;
          } else {
            ((dj) this).field_Sb = false;
            break L1;
          }
        }
    }

    final void a(double param0, byte param1, double param2, double param3) {
        super.a(param0, param1, param2, param3);
        ((dj) this).field_Lb.a(param0, param3, param2, 47);
    }

    final void a(mn param0, byte param1) {
        double[] var3 = null;
        try {
            if (!(((dj) this).field_fb < 16)) {
                var3 = new double[12];
                ((dj) this).field_jb.a((byte) 47, var3);
                ak.a((double)((dj) this).field_fb * 0.015625, var3, (dj) this, 4825, ((dj) this).field_qb, param0);
            }
            if (!(((dj) this).field_lb < 16)) {
                var3 = new double[12];
                ((dj) this).field_jb.a((byte) 34, var3);
                int discarded$0 = 0;
                rf.a(param0, 0.015625 * (double)((dj) this).field_lb, ((dj) this).field_pb, (dj) this, var3);
            }
            ((dj) this).field_Bb.a(-96, param0);
            int var3_int = 81 % ((param1 - -2) / 62);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "dj.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean l(int param0) {
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        int var2 = 29 / ((60 - param0) / 61);
        for (var3 = 0; var3 < 5; var3++) {
            if (null == ((dj) this).field_Nb[var3]) {
                return true;
            }
        }
        return false;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            Object var6 = null;
            ((dj) this).a((pm) null, 126);
        }
        if (!((dj) this).field_A.field_y) {
            if (!((dj) this).field_A.field_i) {
                if (!(((dj) this).field_Qb != 0)) {
                    return ((dj) this).field_Bb.a(0, true, param1, param2);
                }
            }
        }
        return 0.0;
    }

    final void c(boolean param0) {
        int var2 = 0;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          L1: {
            var9 = Confined.field_J ? 1 : 0;
            ((dj) this).field_X = true;
            if (((dj) this).field_A.field_y) {
              break L1;
            } else {
              if (null != ((dj) this).field_A.field_K) {
                break L1;
              } else {
                L2: {
                  if (((dj) this).field_yb <= 0) {
                    break L2;
                  } else {
                    int fieldTemp$1 = ((dj) this).field_xb - 1;
                    ((dj) this).field_xb = ((dj) this).field_xb - 1;
                    if (fieldTemp$1 <= 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((dj) this).field_yb > 0) {
                  var2 = 0;
                  L3: while (true) {
                    L4: {
                      if (((dj) this).field_A.field_x.field_a - 2 <= var2) {
                        break L4;
                      } else {
                        if (((dj) this).field_A.field_x.field_r[1 + var2] > ((dj) this).field_D) {
                          break L4;
                        } else {
                          var2++;
                          continue L3;
                        }
                      }
                    }
                    ((dj) this).field_A.field_x.b(3, var2, ((dj) this).field_D);
                    var3 = 0.5 * (-Math.cos(0.026399938265460447 * (double)((dj) this).field_xb) + 1.0);
                    var5 = 0.5 * (1.0 - Math.cos(0.026399938265460447 * (double)(-1 + ((dj) this).field_xb)));
                    var7 = var5 / var3;
                    ((dj) this).field_E = ((dj) this).field_A.field_x.field_B + (((dj) this).field_E - ((dj) this).field_A.field_x.field_B) * var7;
                    ((dj) this).field_t = ((dj) this).field_A.field_x.field_G + var7 * (-((dj) this).field_A.field_x.field_G + ((dj) this).field_t);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          L5: {
            if (((dj) this).field_Bb.field_b <= 8) {
              break L5;
            } else {
              ((dj) this).field_Bb.field_d = 65536;
              break L5;
            }
          }
          ((dj) this).field_Jb.a(0);
          ((dj) this).field_G = 0.0;
          ((dj) this).field_K = 0.0;
          ((dj) this).field_L = 0.0;
          ((dj) this).field_z = false;
          ((dj) this).field_Bb.field_i.d(209);
          ((dj) this).field_Bb.field_g.d(209);
          var10 = 0;
          var2 = var10;
          L6: while (true) {
            if (4 <= var10) {
              ((dj) this).field_S.field_Q.d(209);
              ((dj) this).field_V.d(209);
              ((dj) this).field_db.d(209);
              ((dj) this).field_Cb.d(209);
              ((dj) this).field_yb = ((dj) this).field_yb - 1;
              rc.field_i = rc.field_i + 1;
              ((dj) this).field_Qb = 400;
              ((dj) this).field_A.field_g.a((rk) this, -1);
              break L0;
            } else {
              ((dj) this).field_Ab[var10].field_Q.d(209);
              var10++;
              continue L6;
            }
          }
        }
        L7: {
          if (!param0) {
            break L7;
          } else {
            break L7;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return false;
        }
        return true;
    }

    final void a(cl param0, byte param1) {
        try {
            int var3_int = -66 / ((param1 - -35) / 60);
            param0.a((dj) this, (byte) 80);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "dj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void d() {
        ((dj) this).field_X = true;
        if (((dj) this).field_yb > 0) {
            ((dj) this).field_xb = 120;
        } else {
            hc.field_u = null;
            we.field_a = 0;
            of.field_a = true;
            sg.f((byte) 99);
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == 72) {
              L1: {
                if (param0.f(-96)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("dj.WA(");
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    private final void h() {
        ((dj) this).field_Bb.b(-790952351);
        ((dj) this).field_Z = 0;
        ((dj) this).field_lb = 0;
        ((dj) this).field_fb = 0;
        ((dj) this).field_Mb = false;
        ((dj) this).field_Q = 0;
        ((dj) this).field_kb = 0;
        ((dj) this).field_ob = 0;
        ((dj) this).field_Hb = 65536;
    }

    final void a(boolean param0, ee param1) {
        if (!param0) {
            return;
        }
        try {
            if (!(!(param1 instanceof wc))) {
                ((dj) this).field_A.field_B.field_X = true;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "dj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        ((dj) this).field_X = true;
        super.a(param0, param1, param2, param3, param4, param5, param6);
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            boolean discarded$0 = ((dj) this).f(10);
            return true;
        }
        return true;
    }

    private final void m() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          var2 = 0;
          if (((dj) this).field_mb) {
            var2++;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((dj) this).field_Eb) {
            break L1;
          } else {
            var2++;
            break L1;
          }
        }
        L2: {
          if (!((dj) this).field_Sb) {
            break L2;
          } else {
            var2++;
            break L2;
          }
        }
        L3: {
          if (!((dj) this).field_cb) {
            break L3;
          } else {
            var2++;
            break L3;
          }
        }
        L4: {
          if (((dj) this).field_eb) {
            var2++;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((dj) this).field_rb) {
            var2++;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var2 = var2 + (((dj) this).field_ub + 3 >> 2);
          var2 = var2 + (3 + ((dj) this).field_tb >> 2);
          var2 = var2 + (3 + ((dj) this).field_zb >> 2);
          var2 = var2 + ((dj) this).field_ab;
          var2 = var2 + (((dj) this).field_Bb.field_b + -8);
          var3 = 3;
          if (!((dj) this).field_mb) {
            break L6;
          } else {
            int incrementValue$11 = var2;
            var2--;
            if ((double)var3 > Math.random() * (double)incrementValue$11) {
              ((dj) this).field_mb = false;
              var3--;
              ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 0));
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (!((dj) this).field_Eb) {
            break L7;
          } else {
            int incrementValue$12 = var2;
            var2--;
            if ((double)var3 > Math.random() * (double)incrementValue$12) {
              ((dj) this).field_Eb = false;
              var3--;
              ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 1));
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if (!((dj) this).field_Sb) {
            if (!((dj) this).field_cb) {
              break L8;
            } else {
              int incrementValue$13 = var2;
              var2--;
              if ((double)incrementValue$13 * Math.random() >= (double)var3) {
                break L8;
              } else {
                var3--;
                ((dj) this).field_cb = false;
                ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 3));
                break L8;
              }
            }
          } else {
            if (!((dj) this).field_cb) {
              break L8;
            } else {
              int incrementValue$14 = var2;
              var2--;
              if ((double)incrementValue$14 * Math.random() >= (double)var3) {
                break L8;
              } else {
                var3--;
                ((dj) this).field_cb = false;
                ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 3));
                break L8;
              }
            }
          }
        }
        L9: {
          if (!((dj) this).field_eb) {
            break L9;
          } else {
            int incrementValue$15 = var2;
            var2--;
            if ((double)incrementValue$15 * Math.random() >= (double)var3) {
              break L9;
            } else {
              ((dj) this).field_eb = false;
              var3--;
              ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 5));
              break L9;
            }
          }
        }
        L10: {
          if (!((dj) this).field_rb) {
            break L10;
          } else {
            int incrementValue$16 = var2;
            var2--;
            if ((double)var3 > (double)incrementValue$16 * Math.random()) {
              var3--;
              ((dj) this).field_rb = false;
              ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 4));
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (((dj) this).field_U <= 0) {
            break L11;
          } else {
            ((dj) this).field_U = 0;
            ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 8));
            break L11;
          }
        }
        L12: {
          if (0 < ((dj) this).field_Pb) {
            ((dj) this).field_Pb = 0;
            ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 7));
            break L12;
          } else {
            break L12;
          }
        }
        var4 = ((dj) this).field_ub;
        L13: while (true) {
          if (var4 <= 0) {
            var4 = ((dj) this).field_tb;
            L14: while (true) {
              if (0 >= var4) {
                var4 = ((dj) this).field_zb;
                L15: while (true) {
                  if (0 >= var4) {
                    var4 = ((dj) this).field_ab;
                    L16: while (true) {
                      if (var4 <= 0) {
                        var4 = ((dj) this).field_Bb.field_b;
                        L17: while (true) {
                          if (var4 <= 8) {
                            L18: {
                              if (((dj) this).field_Bb.field_b == 8) {
                                ((dj) this).field_Bb.field_d = 0;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (((dj) this).field_ib > 0) {
                                ((dj) this).field_ib = 0;
                                ((dj) this).field_Bb.field_l = false;
                                var4 = 0;
                                L20: while (true) {
                                  if (var4 >= 5) {
                                    ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 15));
                                    break L19;
                                  } else {
                                    if (((dj) this).field_Nb[var4] != null) {
                                      ((dj) this).field_Nb[var4].field_ab.field_l = false;
                                      var4++;
                                      continue L20;
                                    } else {
                                      var4++;
                                      continue L20;
                                    }
                                  }
                                }
                              } else {
                                break L19;
                              }
                            }
                            L21: {
                              if (((dj) this).field_Gb <= 0) {
                                break L21;
                              } else {
                                ((dj) this).field_Gb = 0;
                                ((dj) this).field_Kb = 0;
                                ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 16));
                                break L21;
                              }
                            }
                            L22: {
                              if (((dj) this).field_R <= 0) {
                                break L22;
                              } else {
                                ((dj) this).field_R = 0;
                                ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 9));
                                break L22;
                              }
                            }
                            return;
                          } else {
                            int incrementValue$17 = var2;
                            var2--;
                            if ((double)var3 > (double)incrementValue$17 * Math.random()) {
                              ((dj) this).field_Bb.field_b = ((dj) this).field_Bb.field_b - 1;
                              var3--;
                              ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 14));
                              var4--;
                              continue L17;
                            } else {
                              var4--;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        int incrementValue$18 = var2;
                        var2--;
                        if (Math.random() * (double)incrementValue$18 < (double)var3) {
                          ((dj) this).field_ab = ((dj) this).field_ab - 1;
                          var3--;
                          ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 13));
                          var4--;
                          continue L16;
                        } else {
                          var4--;
                          continue L16;
                        }
                      }
                    }
                  } else {
                    int incrementValue$19 = var2;
                    var2--;
                    if ((double)var3 > Math.random() * (double)incrementValue$19) {
                      L23: {
                        ((dj) this).field_zb = ((dj) this).field_zb - 4;
                        var3--;
                        if (0 <= ((dj) this).field_zb) {
                          break L23;
                        } else {
                          ((dj) this).field_zb = 0;
                          break L23;
                        }
                      }
                      ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 12));
                      var4 -= 4;
                      continue L15;
                    } else {
                      var4 -= 4;
                      continue L15;
                    }
                  }
                }
              } else {
                int incrementValue$20 = var2;
                var2--;
                if ((double)var3 > (double)incrementValue$20 * Math.random()) {
                  L24: {
                    var3--;
                    ((dj) this).field_tb = ((dj) this).field_tb - 4;
                    if (((dj) this).field_tb < 0) {
                      ((dj) this).field_tb = 0;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 11));
                  var4 -= 4;
                  continue L14;
                } else {
                  var4 -= 4;
                  continue L14;
                }
              }
            }
          } else {
            int incrementValue$21 = var2;
            var2--;
            if (Math.random() * (double)incrementValue$21 < (double)var3) {
              L25: {
                ((dj) this).field_ub = ((dj) this).field_ub - 4;
                var3--;
                if (((dj) this).field_ub >= 0) {
                  break L25;
                } else {
                  ((dj) this).field_ub = 0;
                  break L25;
                }
              }
              ri.a((rk) this, 0, (rk) (Object) new cl(((dj) this).field_A, (dj) this, 10));
              var4 -= 4;
              continue L13;
            } else {
              var4 -= 4;
              continue L13;
            }
          }
        }
    }

    final double[] e(int param0) {
        if (param0 != 3008) {
            return null;
        }
        return ((dj) this).field_Lb.a(16777215);
    }

    final void a(pm param0, int param1) {
        try {
            if (param1 > -81) {
                Object var4 = null;
                ((dj) this).a((mn) null, (byte) 65);
            }
            param0.a((dj) this, (byte) 80);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "dj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((dj) this).field_Gb = 61;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.f(-91)) {
                  break L3;
                } else {
                  if (((dj) this).field_Kb >= 128) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("dj.CB(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException var7 = null;
        double[] var7_array = null;
        int var7_int = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        Object var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        double[] var19 = null;
        double[] var20 = null;
        double[] var22 = null;
        double[] var23 = null;
        double[] var25 = null;
        double[] var26 = null;
        double[] var27 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (16 > ((dj) this).field_fb) {
                break L1;
              } else {
                var25 = new double[12];
                var22 = var25;
                var19 = var22;
                var16 = var19;
                var7_array = var16;
                ((dj) this).field_jb.a((byte) 37, var25);
                qg.a(param1, ((dj) this).field_fb, var7_array, (double)((dj) this).field_fb * 0.015625, param3, (dj) this, 64);
                break L1;
              }
            }
            L2: {
              if (((dj) this).field_lb < 16) {
                break L2;
              } else {
                var26 = new double[12];
                var23 = var26;
                var20 = var23;
                var17 = var20;
                var7_array = var17;
                ((dj) this).field_jb.a((byte) 114, var26);
                se.a(param3, false, var7_array, true, 0.015625 * (double)((dj) this).field_lb, param1, (dj) this);
                break L2;
              }
            }
            L3: {
              var7_int = md.a(-123) ? 1 : 0;
              if (!((dj) this).field_N) {
                break L3;
              } else {
                if (var7_int == 0) {
                  return;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var7_int != 0) {
                ((dj) this).field_Bb.a(-96);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == ((dj) this).field_A.field_a) {
                break L5;
              } else {
                if (var7_int != 0) {
                  var8 = ((dj) this).field_A.field_a.field_E;
                  var10 = ((dj) this).field_A.field_a.field_t;
                  var12 = ((dj) this).field_A.field_a.field_D;
                  var27 = new double[12];
                  ((dj) this).field_jb.a((byte) 90, var27);
                  ((dj) this).field_A.field_a.field_t = ((dj) this).field_t + ((dj) this).field_C * var27[10] * 2.0;
                  ((dj) this).field_A.field_a.field_D = (((dj) this).field_D + 2.0 * (((dj) this).field_C * var27[11])) * 0.9 + var12 * 0.1;
                  ((dj) this).field_A.field_a.field_E = ((dj) this).field_E + 2.0 * (((dj) this).field_C * var27[9]);
                  ((dj) this).field_A.field_a.a(param0, param1, -33, param3, param4);
                  ((dj) this).field_A.field_a.field_D = var12;
                  ((dj) this).field_A.field_a.field_t = var10;
                  ((dj) this).field_A.field_a.field_E = var8;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if ((4 & ((dj) this).field_Qb) != 0) {
                break L6;
              } else {
                ((dj) this).a(512, true, param1, (byte) 44, fc.field_d, ((dj) this).field_jb, param3, param4, param0, ((dj) this).field_Kb);
                break L6;
              }
            }
            L7: {
              if (var7_int != 0) {
                break L7;
              } else {
                ((dj) this).field_Bb.a(param3, param1, (byte) 125);
                break L7;
              }
            }
            L8: {
              if (param2 < -5) {
                break L8;
              } else {
                var15 = null;
                ((dj) this).a((mn) null, (byte) -40);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("dj.QA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Power-up attractor";
        field_Ib = "Shield";
    }
}
