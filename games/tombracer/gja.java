/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gja extends ka {
    private eo field_S;
    private int field_I;
    private short field_T;
    private gca[] field_nb;
    private int[][] field_D;
    private short[] field_m;
    private int field_i;
    private short[] field_P;
    private int field_H;
    private short[] field_lb;
    private int[] field_j;
    private int field_v;
    private hg field_d;
    private int[] field_R;
    private short[] field_M;
    private int field_Q;
    private float[] field_eb;
    private int field_L;
    private hg field_E;
    private int[] field_r;
    private boolean field_F;
    private int[] field_U;
    private short[] field_V;
    private int[][] field_q;
    private boolean field_f;
    private short[] field_jb;
    static boolean[] field_B;
    private byte[] field_C;
    private int[] field_J;
    private rga[] field_s;
    private float[] field_t;
    private hg field_ib;
    private int field_h;
    private gg field_g;
    private int field_K;
    private short[] field_G;
    private short[] field_p;
    private short[] field_kb;
    static String field_bb;
    private mca field_e;
    private ava[] field_X;
    private int field_n;
    private short[] field_hb;
    private int field_W;
    private short[] field_gb;
    static int field_x;
    private int[][] field_mb;
    private int field_fb;
    private int field_y;
    private int field_o;
    private hg field_O;
    private boolean field_A;
    private short field_ab;
    private int field_Y;
    private byte[] field_w;
    private int[] field_l;
    private ll[] field_u;
    private int[] field_Z;
    private boolean field_N;
    private short[] field_z;
    private short[] field_db;
    private int field_cb;
    static String field_k;

    gja(eo param0, oc param1, int param2, int param3, int param4, int param5) {
        this(param0, param2, param5, true, false);
        d var7 = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        dw var10_ref_dw = null;
        int var11_int = 0;
        eda[] var11 = null;
        int var12 = 0;
        Object var13_ref = null;
        int var13 = 0;
        int var14_int = 0;
        lp var14 = null;
        ima var14_ref = null;
        int var15_int = 0;
        gta[] var15 = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        jt var20_ref_jt = null;
        int var20 = 0;
        lp var21_ref_lp = null;
        int var21 = 0;
        dw var22_ref_dw = null;
        int var22 = 0;
        float var22_float = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        eda var31_ref_eda = null;
        gta var31_ref_gta = null;
        int var32_int = 0;
        long var32_long = 0L;
        gta var32 = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37_int = 0;
        eda var37 = null;
        float[] var38 = null;
        float var38_float = 0.0f;
        int var39 = 0;
        float var39_float = 0.0f;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43_float = 0.0f;
        int var43 = 0;
        float var44_float = 0.0f;
        int var44 = 0;
        float var45_float = 0.0f;
        int var45 = 0;
        float var46_float = 0.0f;
        int var46 = 0;
        float var47_float = 0.0f;
        int var47 = 0;
        float var48_float = 0.0f;
        int var48 = 0;
        float var49_float = 0.0f;
        int var49 = 0;
        float var50_float = 0.0f;
        int var50 = 0;
        float var51_float = 0.0f;
        int var51 = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int var63 = 0;
        int stackIn_22_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_253_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_81_0 = 0;
        byte stackOut_81_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_252_0 = 0;
        int stackOut_252_1 = 0;
        short stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_108_0 = 0;
        byte stackOut_107_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        var63 = TombRacer.field_G ? 1 : 0;
        var7 = param0.field_c;
        ((gja) this).field_J = new int[1 + param1.field_L];
        var8 = new int[param1.field_o];
        var9_int = 0;
        L0: while (true) {
          if (~var9_int <= ~param1.field_o) {
            L1: {
              ((gja) this).field_v = ((gja) this).field_I;
              var9 = new long[((gja) this).field_I];
              if ((((gja) this).field_Y & 256) == 0) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L1;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L1;
              }
            }
            var10 = stackIn_22_0;
            var11_int = 0;
            L2: while (true) {
              if (((gja) this).field_I <= var11_int) {
                L3: {
                  ofa.a(var8, var9, 67);
                  ((gja) this).field_hb = param1.field_y;
                  ((gja) this).field_W = param1.field_L;
                  ((gja) this).field_r = param1.field_I;
                  ((gja) this).field_y = param1.field_E;
                  ((gja) this).field_l = param1.field_p;
                  ((gja) this).field_Z = param1.field_b;
                  var11 = new eda[((gja) this).field_W];
                  ((gja) this).field_s = param1.field_e;
                  ((gja) this).field_X = param1.field_B;
                  if (null != param1.field_m) {
                    ((gja) this).field_L = param1.field_m.length;
                    ((gja) this).field_u = new ll[((gja) this).field_L];
                    ((gja) this).field_nb = new gca[((gja) this).field_L];
                    var12 = 0;
                    L4: while (true) {
                      if (((gja) this).field_L <= var12) {
                        break L3;
                      } else {
                        var13_ref = (Object) (Object) param1.field_m[var12];
                        var14 = fw.a(((jt) var13_ref).field_d, false);
                        var15_int = -1;
                        var16 = 0;
                        L5: while (true) {
                          L6: {
                            if (~((gja) this).field_I >= ~var16) {
                              break L6;
                            } else {
                              if (~((jt) var13_ref).field_a != ~var8[var16]) {
                                var16++;
                                continue L5;
                              } else {
                                var15_int = var16;
                                break L6;
                              }
                            }
                          }
                          if (-1 != var15_int) {
                            L7: {
                              var16 = 16777215 & cla.field_m[65535 & param1.field_A[((jt) var13_ref).field_a]];
                              stackOut_79_0 = var16;
                              stackIn_81_0 = stackOut_79_0;
                              stackIn_80_0 = stackOut_79_0;
                              if (param1.field_n != null) {
                                stackOut_81_0 = stackIn_81_0;
                                stackOut_81_1 = param1.field_n[((jt) var13_ref).field_a];
                                stackIn_82_0 = stackOut_81_0;
                                stackIn_82_1 = stackOut_81_1;
                                break L7;
                              } else {
                                stackOut_80_0 = stackIn_80_0;
                                stackOut_80_1 = 0;
                                stackIn_82_0 = stackOut_80_0;
                                stackIn_82_1 = stackOut_80_1;
                                break L7;
                              }
                            }
                            var16 = stackIn_82_0 | -stackIn_82_1 + 255 << 24;
                            ((gja) this).field_u[var12] = new ll(var15_int, (int) param1.field_a[((jt) var13_ref).field_a], (int) param1.field_t[((jt) var13_ref).field_a], (int) param1.field_J[((jt) var13_ref).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) var13_ref).field_c);
                            ((gja) this).field_nb[var12] = new gca(var16);
                            var12++;
                            continue L4;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L8: {
                  var12 = 3 * ((gja) this).field_I;
                  ((gja) this).field_db = new short[var12];
                  ((gja) this).field_V = new short[((gja) this).field_I];
                  ((gja) this).field_eb = new float[var12];
                  ((gja) this).field_M = new short[((gja) this).field_I];
                  ((gja) this).field_p = new short[var12];
                  ((gja) this).field_C = new byte[((gja) this).field_I];
                  ((gja) this).field_w = new byte[var12];
                  ((gja) this).field_kb = new short[var12];
                  ((gja) this).field_ab = (short)param4;
                  ((gja) this).field_lb = new short[var12];
                  if (null != param1.field_h) {
                    ((gja) this).field_jb = new short[((gja) this).field_I];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ((gja) this).field_gb = new short[((gja) this).field_I];
                tl.field_q = new long[var12];
                ((gja) this).field_T = (short)param3;
                ((gja) this).field_t = new float[var12];
                ((gja) this).field_P = new short[((gja) this).field_I];
                ((gja) this).field_z = new short[((gja) this).field_I];
                ((gja) this).field_G = new short[var12];
                ((gja) this).field_m = new short[var12];
                var13 = 0;
                var14_int = 0;
                L9: while (true) {
                  if (var14_int >= param1.field_L) {
                    ((gja) this).field_J[param1.field_L] = var13;
                    int discarded$5 = -6;
                    var14_ref = qqa.a(var8, param1, ((gja) this).field_I);
                    var15 = new gta[param1.field_o];
                    var16 = 0;
                    L10: while (true) {
                      if (var16 >= param1.field_o) {
                        var16 = 0;
                        L11: while (true) {
                          if (((gja) this).field_I <= var16) {
                            L12: {
                              if (((gja) this).field_v <= 0) {
                                break L12;
                              } else {
                                var16 = 1;
                                var17_int = ((gja) this).field_gb[0];
                                var18 = 0;
                                L13: while (true) {
                                  if (~((gja) this).field_v >= ~var18) {
                                    ((gja) this).field_U = new int[var16 - -1];
                                    ((gja) this).field_j = new int[var16];
                                    ((gja) this).field_R = new int[var16];
                                    ((gja) this).field_U[0] = 0;
                                    var18 = ((gja) this).field_fb;
                                    var17_int = ((gja) this).field_gb[0];
                                    var16 = 0;
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (~var20 <= ~((gja) this).field_v) {
                                        ((gja) this).field_j[var16] = var18;
                                        ((gja) this).field_R[var16] = 1 + -var18 + var19;
                                        var16++;
                                        ((gja) this).field_U[var16] = ((gja) this).field_v;
                                        break L12;
                                      } else {
                                        L15: {
                                          var21 = ((gja) this).field_gb[var20];
                                          if (var17_int == var21) {
                                            break L15;
                                          } else {
                                            ((gja) this).field_j[var16] = var18;
                                            ((gja) this).field_R[var16] = 1 + var19 - var18;
                                            var16++;
                                            ((gja) this).field_U[var16] = var20;
                                            var18 = ((gja) this).field_fb;
                                            var17_int = var21;
                                            var19 = 0;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          var22 = ((gja) this).field_M[var20];
                                          if (var22 < var18) {
                                            var18 = var22;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (var19 < var22) {
                                            var19 = var22;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          var22 = ((gja) this).field_z[var20];
                                          if (~var22 >= ~var19) {
                                            break L18;
                                          } else {
                                            var19 = var22;
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          if (var18 <= var22) {
                                            break L19;
                                          } else {
                                            var18 = var22;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          var22 = ((gja) this).field_V[var20];
                                          if (~var19 <= ~var22) {
                                            break L20;
                                          } else {
                                            var19 = var22;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (var18 <= var22) {
                                            break L21;
                                          } else {
                                            var18 = var22;
                                            break L21;
                                          }
                                        }
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    L22: {
                                      var19 = ((gja) this).field_gb[var18];
                                      if (var19 == var17_int) {
                                        break L22;
                                      } else {
                                        var16++;
                                        var17_int = var19;
                                        break L22;
                                      }
                                    }
                                    var18++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                            L23: {
                              tl.field_q = null;
                              ((gja) this).field_kb = op.a(((gja) this).field_kb, 119, ((gja) this).field_fb);
                              ((gja) this).field_G = op.a(((gja) this).field_G, 112, ((gja) this).field_fb);
                              ((gja) this).field_lb = op.a(((gja) this).field_lb, 114, ((gja) this).field_fb);
                              ((gja) this).field_m = op.a(((gja) this).field_m, 114, ((gja) this).field_fb);
                              ((gja) this).field_p = op.a(((gja) this).field_p, 123, ((gja) this).field_fb);
                              ((gja) this).field_w = kaa.a(0, ((gja) this).field_w, ((gja) this).field_fb);
                              ((gja) this).field_eb = fba.a(1, ((gja) this).field_eb, ((gja) this).field_fb);
                              ((gja) this).field_t = fba.a(1, ((gja) this).field_t, ((gja) this).field_fb);
                              if (null == param1.field_l) {
                                break L23;
                              } else {
                                int discarded$6 = 32;
                                if (!qr.d(param2, ((gja) this).field_h)) {
                                  break L23;
                                } else {
                                  ((gja) this).field_D = param1.a(false, (byte) 64);
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              if (null == param1.field_m) {
                                break L24;
                              } else {
                                if (!ub.a(((gja) this).field_h, param2, (byte) -122)) {
                                  break L24;
                                } else {
                                  ((gja) this).field_mb = param1.b((byte) -124);
                                  break L24;
                                }
                              }
                            }
                            L25: {
                              if (param1.field_D == null) {
                                break L25;
                              } else {
                                stackOut_252_0 = param2;
                                stackOut_252_1 = ((gja) this).field_h;
                                stackIn_253_0 = stackOut_252_0;
                                stackIn_253_1 = stackOut_252_1;
                                int discarded$7 = -126;
                                if (!ofa.a(stackIn_253_0, stackIn_253_1)) {
                                  break L25;
                                } else {
                                  var16 = 0;
                                  var17 = new int[256];
                                  var18 = 0;
                                  L26: while (true) {
                                    if (~((gja) this).field_I >= ~var18) {
                                      ((gja) this).field_q = new int[1 + var16][];
                                      var18 = 0;
                                      L27: while (true) {
                                        if (var16 < var18) {
                                          var18 = 0;
                                          L28: while (true) {
                                            if (((gja) this).field_I <= var18) {
                                              break L25;
                                            } else {
                                              L29: {
                                                var19 = param1.field_D[var8[var18]];
                                                if (var19 >= 0) {
                                                  var17[var19] = var17[var19] + 1;
                                                  ((gja) this).field_q[var19][var17[var19]] = var18;
                                                  break L29;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                              var18++;
                                              continue L28;
                                            }
                                          }
                                        } else {
                                          ((gja) this).field_q[var18] = new int[var17[var18]];
                                          var17[var18] = 0;
                                          var18++;
                                          continue L27;
                                        }
                                      }
                                    } else {
                                      L30: {
                                        var19 = param1.field_D[var8[var18]];
                                        if (var19 < 0) {
                                          break L30;
                                        } else {
                                          L31: {
                                            if (var16 < var19) {
                                              var16 = var19;
                                              break L31;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          var17[var19] = var17[var19] + 1;
                                          break L30;
                                        }
                                      }
                                      var18++;
                                      continue L26;
                                    }
                                  }
                                }
                              }
                            }
                            return;
                          } else {
                            L32: {
                              var17_int = var8[var16];
                              var18 = 65535 & param1.field_A[var17_int];
                              if (param1.field_g == null) {
                                var19 = -1;
                                break L32;
                              } else {
                                var19 = param1.field_g[var17_int];
                                break L32;
                              }
                            }
                            L33: {
                              if (null != param1.field_n) {
                                var20 = 255 & param1.field_n[var17_int];
                                break L33;
                              } else {
                                var20 = 0;
                                break L33;
                              }
                            }
                            L34: {
                              if (null != param1.field_r) {
                                stackOut_127_0 = param1.field_r[var17_int];
                                stackIn_128_0 = stackOut_127_0;
                                break L34;
                              } else {
                                stackOut_126_0 = -1;
                                stackIn_128_0 = stackOut_126_0;
                                break L34;
                              }
                            }
                            L35: {
                              var21 = stackIn_128_0;
                              if (var21 == -1) {
                                break L35;
                              } else {
                                if (0 != (((gja) this).field_h & 64)) {
                                  var22_ref_dw = var7.a((byte) 2, 65535 & var21);
                                  if (!var22_ref_dw.field_p) {
                                    break L35;
                                  } else {
                                    var21 = -1;
                                    break L35;
                                  }
                                } else {
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              var22_float = 0.0f;
                              var23 = 0.0f;
                              var24 = 0.0f;
                              var25 = 0.0f;
                              var26 = 0.0f;
                              var27 = 0.0f;
                              var28 = 0;
                              var29 = 0;
                              var30 = 0;
                              if (var21 == -1) {
                                break L36;
                              } else {
                                if (var19 != -1) {
                                  var19 = var19 & 255;
                                  var31 = param1.field_u[var19];
                                  if (var31 != 0) {
                                    var32_int = param1.field_a[var17_int];
                                    var33_int = param1.field_t[var17_int];
                                    var34 = param1.field_J[var17_int];
                                    var35 = var14_ref.field_a[var19];
                                    var36 = var14_ref.field_c[var19];
                                    var37_int = var14_ref.field_d[var19];
                                    var38 = var14_ref.field_b[var19];
                                    var39 = param1.field_z[var19];
                                    var40 = (float)param1.field_d[var19] / 256.0f;
                                    if (var31 == 1) {
                                      var41 = (float)param1.field_x[var19] / 1024.0f;
                                      loa.a(var39, rn.field_a, var41, param1.field_p[var32_int], param1.field_I[var32_int], -126, var38, var40, var36, var37_int, param1.field_b[var32_int], var35);
                                      var22_float = rn.field_a[0];
                                      var23 = rn.field_a[1];
                                      loa.a(var39, rn.field_a, var41, param1.field_p[var33_int], param1.field_I[var33_int], 72, var38, var40, var36, var37_int, param1.field_b[var33_int], var35);
                                      var24 = rn.field_a[0];
                                      var25 = rn.field_a[1];
                                      loa.a(var39, rn.field_a, var41, param1.field_p[var34], param1.field_I[var34], -108, var38, var40, var36, var37_int, param1.field_b[var34], var35);
                                      var27 = rn.field_a[1];
                                      var26 = rn.field_a[0];
                                      var42 = var41 / 2.0f;
                                      if ((1 & var39) != 0) {
                                        L37: {
                                          if (var25 - var23 <= var42) {
                                            if (-var25 + var23 <= var42) {
                                              break L37;
                                            } else {
                                              var25 = var25 + var41;
                                              var28 = 2;
                                              break L37;
                                            }
                                          } else {
                                            var28 = 1;
                                            var25 = var25 - var41;
                                            break L37;
                                          }
                                        }
                                        if (-var23 + var27 > var42) {
                                          var29 = 1;
                                          var27 = var27 - var41;
                                          break L36;
                                        } else {
                                          if (-var27 + var23 <= var42) {
                                            break L36;
                                          } else {
                                            var27 = var27 + var41;
                                            var29 = 2;
                                            break L36;
                                          }
                                        }
                                      } else {
                                        L38: {
                                          if (-var22_float + var24 > var42) {
                                            var28 = 1;
                                            var24 = var24 - var41;
                                            break L38;
                                          } else {
                                            if (-var24 + var22_float > var42) {
                                              var28 = 2;
                                              var24 = var24 + var41;
                                              break L38;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                        if (var42 < var26 - var22_float) {
                                          var29 = 1;
                                          var26 = var26 - var41;
                                          break L36;
                                        } else {
                                          if (-var26 + var22_float > var42) {
                                            var26 = var26 + var41;
                                            var29 = 2;
                                            break L36;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                    } else {
                                      if (var31 == 2) {
                                        var41 = (float)param1.field_v[var19] / 256.0f;
                                        var42 = (float)param1.field_c[var19] / 256.0f;
                                        var43 = param1.field_b[var33_int] + -param1.field_b[var32_int];
                                        var44 = param1.field_I[var33_int] + -param1.field_I[var32_int];
                                        var45 = param1.field_p[var33_int] + -param1.field_p[var32_int];
                                        var46 = param1.field_b[var34] + -param1.field_b[var32_int];
                                        var47 = param1.field_I[var34] + -param1.field_I[var32_int];
                                        var48 = -param1.field_p[var32_int] + param1.field_p[var34];
                                        var49 = var44 * var48 - var47 * var45;
                                        var50 = -(var43 * var48) + var46 * var45;
                                        var51 = -(var44 * var46) + var47 * var43;
                                        var52 = 64.0f / (float)param1.field_j[var19];
                                        var53 = 64.0f / (float)param1.field_f[var19];
                                        var54 = 64.0f / (float)param1.field_x[var19];
                                        var55 = (var38[2] * (float)var51 + (var38[0] * (float)var49 + var38[1] * (float)var50)) / var52;
                                        var56 = (var38[4] * (float)var50 + var38[3] * (float)var49 + (float)var51 * var38[5]) / var53;
                                        var57 = ((float)var51 * var38[8] + (var38[6] * (float)var49 + var38[7] * (float)var50)) / var54;
                                        var30 = mr.a(var57, var56, false, var55);
                                        as.a(var36, rn.field_a, param1.field_I[var32_int], var35, var42, var37_int, var41, param1.field_b[var32_int], var30, param1.field_p[var32_int], -102, var40, var39, var38);
                                        var22_float = rn.field_a[0];
                                        var23 = rn.field_a[1];
                                        as.a(var36, rn.field_a, param1.field_I[var33_int], var35, var42, var37_int, var41, param1.field_b[var33_int], var30, param1.field_p[var33_int], 32, var40, var39, var38);
                                        var25 = rn.field_a[1];
                                        var24 = rn.field_a[0];
                                        as.a(var36, rn.field_a, param1.field_I[var34], var35, var42, var37_int, var41, param1.field_b[var34], var30, param1.field_p[var34], 79, var40, var39, var38);
                                        var26 = rn.field_a[0];
                                        var27 = rn.field_a[1];
                                        break L36;
                                      } else {
                                        if (var31 != 3) {
                                          break L36;
                                        } else {
                                          ifa.a(param1.field_p[var32_int], param1.field_b[var32_int], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var32_int]);
                                          var23 = rn.field_a[1];
                                          var22_float = rn.field_a[0];
                                          ifa.a(param1.field_p[var33_int], param1.field_b[var33_int], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var33_int]);
                                          var24 = rn.field_a[0];
                                          var25 = rn.field_a[1];
                                          ifa.a(param1.field_p[var34], param1.field_b[var34], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var34]);
                                          var27 = rn.field_a[1];
                                          var26 = rn.field_a[0];
                                          if ((1 & var39) != 0) {
                                            L39: {
                                              if (0.5f < var27 - var23) {
                                                var27 = var27 - 1.0f;
                                                var29 = 1;
                                                break L39;
                                              } else {
                                                if (-var27 + var23 > 0.5f) {
                                                  var27 = var27 + 1.0f;
                                                  var29 = 2;
                                                  break L39;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                            if (0.5f >= var25 - var23) {
                                              if (0.5f < var23 - var25) {
                                                var28 = 2;
                                                var25 = var25 + 1.0f;
                                                break L36;
                                              } else {
                                                break L36;
                                              }
                                            } else {
                                              var25 = var25 - 1.0f;
                                              var28 = 1;
                                              break L36;
                                            }
                                          } else {
                                            L40: {
                                              if (0.5f < var26 - var22_float) {
                                                var26 = var26 - 1.0f;
                                                var29 = 1;
                                                break L40;
                                              } else {
                                                if (0.5f < -var26 + var22_float) {
                                                  var29 = 2;
                                                  var26 = var26 + 1.0f;
                                                  break L40;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                            if (var24 - var22_float > 0.5f) {
                                              var28 = 1;
                                              var24 = var24 - 1.0f;
                                              break L36;
                                            } else {
                                              if (0.5f < var22_float - var24) {
                                                var28 = 2;
                                                var24 = var24 + 1.0f;
                                                break L36;
                                              } else {
                                                break L36;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var32_int = param1.field_a[var17_int];
                                    var33_int = param1.field_t[var17_int];
                                    var34 = param1.field_J[var17_int];
                                    var35 = param1.field_s[var19];
                                    var36 = param1.field_q[var19];
                                    var37_int = param1.field_K[var19];
                                    var38_float = (float)param1.field_b[var35];
                                    var39_float = (float)param1.field_I[var35];
                                    var40 = (float)param1.field_p[var35];
                                    var41 = (float)param1.field_b[var36] - var38_float;
                                    var42 = (float)param1.field_I[var36] - var39_float;
                                    var43_float = -var40 + (float)param1.field_p[var36];
                                    var44_float = -var38_float + (float)param1.field_b[var37_int];
                                    var45_float = (float)param1.field_I[var37_int] - var39_float;
                                    var46_float = -var40 + (float)param1.field_p[var37_int];
                                    var47_float = (float)param1.field_b[var32_int] - var38_float;
                                    var48_float = (float)param1.field_I[var32_int] - var39_float;
                                    var49_float = -var40 + (float)param1.field_p[var32_int];
                                    var50_float = -var38_float + (float)param1.field_b[var33_int];
                                    var51_float = -var39_float + (float)param1.field_I[var33_int];
                                    var52 = (float)param1.field_p[var33_int] - var40;
                                    var53 = (float)param1.field_b[var34] - var38_float;
                                    var54 = (float)param1.field_I[var34] - var39_float;
                                    var55 = (float)param1.field_p[var34] - var40;
                                    var56 = -(var43_float * var45_float) + var46_float * var42;
                                    var57 = -(var41 * var46_float) + var44_float * var43_float;
                                    var58 = -(var42 * var44_float) + var45_float * var41;
                                    var59 = var58 * var45_float - var57 * var46_float;
                                    var60 = -(var58 * var44_float) + var46_float * var56;
                                    var61 = -(var45_float * var56) + var44_float * var57;
                                    var62 = 1.0f / (var41 * var59 + var60 * var42 + var61 * var43_float);
                                    var24 = var62 * (var50_float * var59 + var60 * var51_float + var52 * var61);
                                    var22_float = (var47_float * var59 + var48_float * var60 + var49_float * var61) * var62;
                                    var26 = var62 * (var53 * var59 + var60 * var54 + var55 * var61);
                                    var59 = -(var57 * var43_float) + var58 * var42;
                                    var60 = var43_float * var56 - var58 * var41;
                                    var61 = -(var42 * var56) + var41 * var57;
                                    var62 = 1.0f / (var61 * var46_float + (var60 * var45_float + var59 * var44_float));
                                    var27 = (var61 * var55 + (var54 * var60 + var53 * var59)) * var62;
                                    var25 = (var59 * var50_float + var60 * var51_float + var52 * var61) * var62;
                                    var23 = var62 * (var59 * var47_float + var48_float * var60 + var61 * var49_float);
                                    break L36;
                                  }
                                } else {
                                  var27 = 0.0f;
                                  var25 = 1.0f;
                                  var22_float = 0.0f;
                                  var28 = 1;
                                  var24 = 1.0f;
                                  var26 = 0.0f;
                                  var29 = 2;
                                  var23 = 1.0f;
                                  break L36;
                                }
                              }
                            }
                            L41: {
                              if (null != param1.field_G) {
                                var31 = param1.field_G[var17_int];
                                break L41;
                              } else {
                                var31 = 0;
                                break L41;
                              }
                            }
                            L42: {
                              if (0 != var31) {
                                if (var31 != 1) {
                                  break L42;
                                } else {
                                  L43: {
                                    var32 = var15[var17_int];
                                    if (0 >= var32.field_c) {
                                      stackOut_207_0 = 2048;
                                      stackIn_208_0 = stackOut_207_0;
                                      break L43;
                                    } else {
                                      stackOut_206_0 = 1024;
                                      stackIn_208_0 = stackOut_206_0;
                                      break L43;
                                    }
                                  }
                                  var33 = (long)(stackIn_208_0 + ((var19 << 2) + (var32.field_d + 256 << 12)) - -(var32.field_h - -256 << 22)) - -((long)var20 + (long)(var30 << 24) + (long)(var18 << 8) << 32);
                                  ((gja) this).field_M[var16] = this.a(var32.field_d, var16, var22_float, (int) param1.field_a[var17_int], var32.field_h, 0, var33, var32.field_c, var23, true, param1);
                                  ((gja) this).field_z[var16] = this.a(var32.field_d, var16, var24, (int) param1.field_t[var17_int], var32.field_h, 0, (long)var28 + var33, var32.field_c, var25, true, param1);
                                  ((gja) this).field_V[var16] = this.a(var32.field_d, var16, var26, (int) param1.field_J[var17_int], var32.field_h, 0, (long)var29 + var33, var32.field_c, var27, true, param1);
                                  break L42;
                                }
                              } else {
                                var32_long = (long)(var19 << 2) + ((long)(var18 << 8) + (long)(var30 << 24) - -(long)var20 << 32);
                                var34 = param1.field_a[var17_int];
                                var35 = param1.field_t[var17_int];
                                var36 = param1.field_J[var17_int];
                                var37 = var11[var34];
                                ((gja) this).field_M[var16] = this.a(var37.field_d, var16, var22_float, var34, var37.field_a, var37.field_c, var32_long, var37.field_b, var23, true, param1);
                                var37 = var11[var35];
                                ((gja) this).field_z[var16] = this.a(var37.field_d, var16, var24, var35, var37.field_a, var37.field_c, var32_long + (long)var28, var37.field_b, var25, true, param1);
                                var37 = var11[var36];
                                ((gja) this).field_V[var16] = this.a(var37.field_d, var16, var26, var36, var37.field_a, var37.field_c, var32_long + (long)var29, var37.field_b, var27, true, param1);
                                break L42;
                              }
                            }
                            L44: {
                              if (null == param1.field_n) {
                                break L44;
                              } else {
                                ((gja) this).field_C[var16] = param1.field_n[var17_int];
                                break L44;
                              }
                            }
                            L45: {
                              if (param1.field_h != null) {
                                ((gja) this).field_jb[var16] = param1.field_h[var17_int];
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                            ((gja) this).field_P[var16] = param1.field_A[var17_int];
                            ((gja) this).field_gb[var16] = (short) var21;
                            var16++;
                            continue L11;
                          }
                        }
                      } else {
                        var17_int = param1.field_a[var16];
                        var18 = param1.field_t[var16];
                        var19 = param1.field_J[var16];
                        var20 = ((gja) this).field_Z[var18] - ((gja) this).field_Z[var17_int];
                        var21 = ((gja) this).field_r[var18] + -((gja) this).field_r[var17_int];
                        var22 = -((gja) this).field_l[var17_int] + ((gja) this).field_l[var18];
                        var23_int = ((gja) this).field_Z[var19] + -((gja) this).field_Z[var17_int];
                        var24_int = -((gja) this).field_r[var17_int] + ((gja) this).field_r[var19];
                        var25_int = ((gja) this).field_l[var19] - ((gja) this).field_l[var17_int];
                        var26_int = -(var22 * var24_int) + var25_int * var21;
                        var27_int = -(var20 * var25_int) + var23_int * var22;
                        var28 = -(var21 * var23_int) + var24_int * var20;
                        L46: while (true) {
                          L47: {
                            if (var26_int > 8192) {
                              break L47;
                            } else {
                              if (var27_int > 8192) {
                                break L47;
                              } else {
                                if (var28 > 8192) {
                                  break L47;
                                } else {
                                  if (var26_int < -8192) {
                                    break L47;
                                  } else {
                                    if (var27_int < -8192) {
                                      break L47;
                                    } else {
                                      if (var28 >= -8192) {
                                        L48: {
                                          var29 = (int)Math.sqrt((double)(var27_int * var27_int + (var26_int * var26_int + var28 * var28)));
                                          if (0 < var29) {
                                            break L48;
                                          } else {
                                            var29 = 1;
                                            break L48;
                                          }
                                        }
                                        L49: {
                                          var26_int = 256 * var26_int / var29;
                                          var28 = var28 * 256 / var29;
                                          var27_int = 256 * var27_int / var29;
                                          if (null == param1.field_G) {
                                            stackOut_108_0 = 0;
                                            stackIn_109_0 = stackOut_108_0;
                                            break L49;
                                          } else {
                                            stackOut_107_0 = param1.field_G[var16];
                                            stackIn_109_0 = stackOut_107_0;
                                            break L49;
                                          }
                                        }
                                        L50: {
                                          var30 = stackIn_109_0;
                                          if (var30 == 0) {
                                            var31_ref_eda = var11[var17_int];
                                            var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                                            var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                                            var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                                            var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                                            var31_ref_eda = var11[var18];
                                            var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                                            var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                                            var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                                            var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                                            var31_ref_eda = var11[var19];
                                            var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                                            var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                                            var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                                            var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                                            break L50;
                                          } else {
                                            if (var30 == 1) {
                                              gta dupTemp$8 = new gta();
                                              var15[var16] = dupTemp$8;
                                              var31_ref_gta = dupTemp$8;
                                              var31_ref_gta.field_c = var26_int;
                                              var31_ref_gta.field_h = var28;
                                              var31_ref_gta.field_d = var27_int;
                                              break L50;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                        var16++;
                                        continue L10;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var26_int = var26_int >> 1;
                          var27_int = var27_int >> 1;
                          var28 = var28 >> 1;
                          continue L46;
                        }
                      }
                    }
                  } else {
                    var15_int = ((gja) this).field_J[var14_int];
                    ((gja) this).field_J[var14_int] = var13;
                    var11[var14_int] = new eda();
                    var13 = var13 + var15_int;
                    var14_int++;
                    continue L9;
                  }
                }
              } else {
                L51: {
                  L52: {
                    var12 = var8[var11_int];
                    var13_ref = null;
                    var14_int = 0;
                    var15_int = 0;
                    var16 = 0;
                    var17_int = 0;
                    if (null != param1.field_m) {
                      var18 = 0;
                      var19 = 0;
                      L53: while (true) {
                        if (~param1.field_m.length >= ~var19) {
                          if (var18 == 0) {
                            break L52;
                          } else {
                            var9[var11_int] = 9223372036854775807L;
                            ((gja) this).field_v = ((gja) this).field_v - 1;
                            break L51;
                          }
                        } else {
                          L54: {
                            var20_ref_jt = param1.field_m[var19];
                            if (var12 != var20_ref_jt.field_a) {
                              break L54;
                            } else {
                              L55: {
                                var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                                if (!var21_ref_lp.field_i) {
                                  break L55;
                                } else {
                                  var18 = 1;
                                  break L55;
                                }
                              }
                              if (-1 == var21_ref_lp.field_f) {
                                break L54;
                              } else {
                                var22_ref_dw = var7.a((byte) 103, var21_ref_lp.field_f);
                                if (2 != var22_ref_dw.field_d) {
                                  break L54;
                                } else {
                                  ((gja) this).field_f = true;
                                  break L54;
                                }
                              }
                            }
                          }
                          var19++;
                          continue L53;
                        }
                      }
                    } else {
                      break L52;
                    }
                  }
                  L56: {
                    var18 = -1;
                    if (null != param1.field_r) {
                      var18 = param1.field_r[var12];
                      if (-1 != var18) {
                        L57: {
                          var13_ref = (Object) (Object) var7.a((byte) -27, var18 & 65535);
                          if (0 == (((gja) this).field_h & 64)) {
                            break L57;
                          } else {
                            if (((dw) var13_ref).field_p) {
                              var18 = -1;
                              var13_ref = null;
                              break L56;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var17_int = ((dw) var13_ref).field_a;
                        var16 = ((dw) var13_ref).field_h;
                        break L56;
                      } else {
                        break L56;
                      }
                    } else {
                      break L56;
                    }
                  }
                  L58: {
                    L59: {
                      L60: {
                        if (null == param1.field_n) {
                          break L60;
                        } else {
                          if (0 != param1.field_n[var12]) {
                            break L59;
                          } else {
                            break L60;
                          }
                        }
                      }
                      L61: {
                        if (var13_ref == null) {
                          break L61;
                        } else {
                          if (((dw) var13_ref).field_d == 0) {
                            break L61;
                          } else {
                            break L59;
                          }
                        }
                      }
                      stackOut_56_0 = 0;
                      stackIn_57_0 = stackOut_56_0;
                      break L58;
                    }
                    stackOut_55_0 = 1;
                    stackIn_57_0 = stackOut_55_0;
                    break L58;
                  }
                  L62: {
                    L63: {
                      var19 = stackIn_57_0;
                      if (var10 != 0) {
                        break L63;
                      } else {
                        if (var19 == 0) {
                          break L62;
                        } else {
                          break L63;
                        }
                      }
                    }
                    if (param1.field_C == null) {
                      break L62;
                    } else {
                      var14_int = var14_int + (param1.field_C[var12] << 17);
                      break L62;
                    }
                  }
                  L64: {
                    if (var19 == 0) {
                      break L64;
                    } else {
                      var14_int = var14_int + 65536;
                      break L64;
                    }
                  }
                  var14_int = var14_int + (var16 << 8 & 65280);
                  var15_int = var15_int + (var18 << 16 & -65536);
                  var14_int = var14_int + (255 & var17_int);
                  var15_int = var15_int + (65535 & var11_int);
                  var9[var11_int] = (long)var15_int + ((long)var14_int << 32);
                  ((gja) this).field_f = ((gja) this).field_f | var19 != 0;
                  break L51;
                }
                var11_int++;
                continue L2;
              }
            }
          } else {
            L65: {
              L66: {
                if (param1.field_G == null) {
                  break L66;
                } else {
                  if (2 != param1.field_G[var9_int]) {
                    break L66;
                  } else {
                    break L65;
                  }
                }
              }
              L67: {
                if (param1.field_r == null) {
                  break L67;
                } else {
                  if (param1.field_r[var9_int] != -1) {
                    L68: {
                      var10_ref_dw = var7.a((byte) -71, param1.field_r[var9_int] & 65535);
                      if ((64 & ((gja) this).field_h) == 0) {
                        break L68;
                      } else {
                        if (var10_ref_dw.field_p) {
                          break L67;
                        } else {
                          break L68;
                        }
                      }
                    }
                    if (var10_ref_dw.field_f) {
                      break L65;
                    } else {
                      break L67;
                    }
                  } else {
                    break L67;
                  }
                }
              }
              int fieldTemp$9 = ((gja) this).field_I;
              ((gja) this).field_I = ((gja) this).field_I + 1;
              var8[fieldTemp$9] = var9_int;
              ((gja) this).field_J[param1.field_a[var9_int]] = ((gja) this).field_J[param1.field_a[var9_int]] + 1;
              ((gja) this).field_J[param1.field_t[var9_int]] = ((gja) this).field_J[param1.field_t[var9_int]] + 1;
              ((gja) this).field_J[param1.field_J[var9_int]] = ((gja) this).field_J[param1.field_J[var9_int]] + 1;
              break L65;
            }
            var9_int++;
            continue L0;
          }
        }
    }

    final boolean NA() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((gja) this).field_D != null) {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= ((gja) this).field_y) {
                  pb.field_k = 0;
                  uu.field_c = 0;
                  ina.field_a = 0;
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  ((gja) this).field_Z[var1_int] = ((gja) this).field_Z[var1_int] << 4;
                  ((gja) this).field_r[var1_int] = ((gja) this).field_r[var1_int] << 4;
                  ((gja) this).field_l[var1_int] = ((gja) this).field_l[var1_int] << 4;
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "gja.NA()");
        }
        return stackIn_10_0 != 0;
    }

    private final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 69 / ((param0 - 66) / 38);
              if ((55 & ((gja) this).field_h) != 0) {
                if (null != ((gja) this).field_O) {
                  ((gja) this).field_O.field_h = false;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (((gja) this).field_E != null) {
                  ((gja) this).field_E.field_h = false;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.R(" + param0 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        ll var6 = null;
        int var7_int = 0;
        gca var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (~var5_int <= ~((gja) this).field_I) {
                L2: {
                  if (((gja) this).field_u != null) {
                    var5_int = 0;
                    L3: while (true) {
                      if (((gja) this).field_L <= var5_int) {
                        break L2;
                      } else {
                        var6 = ((gja) this).field_u[var5_int];
                        var7 = ((gja) this).field_nb[var5_int];
                        var7.field_h = -16777216 & var7.field_h | cla.field_m[65535 & ((gja) this).field_P[var6.field_m]] & 16777215;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                int discarded$1 = 0;
                this.e();
                break L0;
              } else {
                L4: {
                  var6_int = ((gja) this).field_P[var5_int] & 65535;
                  var7_int = (var6_int & 65039) >> 10;
                  var8 = (var6_int & 951) >> 7;
                  if (param0 == -1) {
                    break L4;
                  } else {
                    var7_int = var7_int + (param3 * (-var7_int + param0) >> 7);
                    break L4;
                  }
                }
                L5: {
                  var9 = var6_int & 127;
                  if (param1 == -1) {
                    break L5;
                  } else {
                    var8 = var8 + (param3 * (-var8 + param1) >> 7);
                    break L5;
                  }
                }
                L6: {
                  if (-1 != param2) {
                    var9 = var9 - -((param2 + -var9) * param3 >> 7);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((gja) this).field_P[var5_int] = (short)fh.a(var9, fh.a(var8 << 7, var7_int << 10));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "gja.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a() {
    }

    final void a(gda param0, el param1, int param2, int param3) {
        RuntimeException var5 = null;
        asa var5_ref = null;
        asa var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (0 == ((gja) this).field_fb) {
              return;
            } else {
              L1: {
                var5_ref = ((gja) this).field_S.field_bb;
                var6 = (asa) (Object) param0;
                if (!((gja) this).field_A) {
                  int discarded$1 = -913;
                  this.f();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                qra.field_d = var5_ref.field_o * var6.field_q + var6.field_l * var5_ref.field_p + var6.field_o * var5_ref.field_h;
                gj.field_h = var6.field_e * var5_ref.field_p + var5_ref.field_o * var6.field_n + var6.field_i * var5_ref.field_h + var5_ref.field_i;
                var7 = qra.field_d * (float)((gja) this).field_o + gj.field_h;
                var8 = gj.field_h + qra.field_d * (float)((gja) this).field_n;
                if (var8 < var7) {
                  var9 = var8 - (float)((gja) this).field_H;
                  var10 = (float)((gja) this).field_H + var7;
                  break L2;
                } else {
                  var9 = var7 - (float)((gja) this).field_H;
                  var10 = var8 + (float)((gja) this).field_H;
                  break L2;
                }
              }
              if (((gja) this).field_S.field_Cb > var9) {
                if ((float)((gja) this).field_S.field_D >= var10) {
                  return;
                } else {
                  L3: {
                    vta.field_e = var6.field_q * var5_ref.field_l + var6.field_l * var5_ref.field_g + var6.field_o * var5_ref.field_f;
                    fba.field_a = var5_ref.field_e + (var6.field_i * var5_ref.field_f + (var6.field_n * var5_ref.field_l + var5_ref.field_g * var6.field_e));
                    var11 = fba.field_a + vta.field_e * (float)((gja) this).field_o;
                    var12 = (float)((gja) this).field_n * vta.field_e + fba.field_a;
                    if (var11 > var12) {
                      var13 = (float)((gja) this).field_S.field_Ic * (var12 - (float)((gja) this).field_H);
                      var14 = (float)((gja) this).field_S.field_Ic * ((float)((gja) this).field_H + var11);
                      break L3;
                    } else {
                      var14 = (var12 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                      var13 = (var11 - (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                      break L3;
                    }
                  }
                  if (var13 / (float)param2 >= ((gja) this).field_S.field_uc) {
                    return;
                  } else {
                    if (var14 / (float)param2 > ((gja) this).field_S.field_f) {
                      L4: {
                        tu.field_g = var5_ref.field_k * var6.field_e + var6.field_n * var5_ref.field_q + var6.field_i * var5_ref.field_m + var5_ref.field_n;
                        kb.field_p = var6.field_l * var5_ref.field_k + var6.field_q * var5_ref.field_q + var5_ref.field_m * var6.field_o;
                        var15 = tu.field_g + (float)((gja) this).field_o * kb.field_p;
                        var16 = tu.field_g + (float)((gja) this).field_n * kb.field_p;
                        if (var15 > var16) {
                          var17 = (float)((gja) this).field_S.field_h * (var16 - (float)((gja) this).field_H);
                          var18 = (var15 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_h;
                          break L4;
                        } else {
                          var18 = (float)((gja) this).field_S.field_h * (var16 + (float)((gja) this).field_H);
                          var17 = ((float)(-((gja) this).field_H) + var15) * (float)((gja) this).field_S.field_h;
                          break L4;
                        }
                      }
                      if (((gja) this).field_S.field_H <= var17 / (float)param2) {
                        return;
                      } else {
                        if (var18 / (float)param2 > ((gja) this).field_S.field_zc) {
                          L5: {
                            L6: {
                              if (null != param1) {
                                break L6;
                              } else {
                                if (null == ((gja) this).field_u) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            vs.field_O = var5_ref.field_k * var6.field_g + var6.field_k * var5_ref.field_q + var5_ref.field_m * var6.field_p;
                            wka.field_b = var5_ref.field_f * var6.field_h + (var6.field_f * var5_ref.field_g + var5_ref.field_l * var6.field_m);
                            pl.field_a = var6.field_g * var5_ref.field_p + var5_ref.field_o * var6.field_k + var6.field_p * var5_ref.field_h;
                            baa.field_c = var5_ref.field_f * var6.field_p + (var6.field_k * var5_ref.field_l + var5_ref.field_g * var6.field_g);
                            ct.field_b = var6.field_h * var5_ref.field_m + (var5_ref.field_q * var6.field_m + var6.field_f * var5_ref.field_k);
                            hs.field_c = var6.field_h * var5_ref.field_h + (var6.field_m * var5_ref.field_o + var5_ref.field_p * var6.field_f);
                            break L5;
                          }
                          L7: {
                            if (param1 == null) {
                              break L7;
                            } else {
                              var19 = ((gja) this).field_K + ((gja) this).field_i >> 1;
                              var20 = ((gja) this).field_Q + ((gja) this).field_cb >> 1;
                              var21 = (int)(hs.field_c * (float)var20 + (gj.field_h + pl.field_a * (float)var19 + qra.field_d * (float)((gja) this).field_o));
                              var22 = (int)((float)((gja) this).field_n * qra.field_d + (gj.field_h + (float)var19 * pl.field_a) + hs.field_c * (float)var20);
                              if (~var21 <= ~((gja) this).field_S.field_D) {
                                break L7;
                              } else {
                                if (var22 < ((gja) this).field_S.field_D) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          ((gja) this).field_S.a((float)param2, -229);
                          ((gja) this).field_S.j((byte) 102);
                          ((gja) this).field_S.a(var6, (byte) 88);
                          this.b((byte) -100);
                          this.c(-125);
                          break L0;
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var5;
            stackOut_47_1 = new StringBuilder().append("gja.Q(");
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L8;
            }
          }
          L9: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L9;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(cn param0) {
        RuntimeException var2 = null;
        kh var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_ref = new kh(param0.a("logo.fo3d", (byte) 126, ""));
            var3 = var2_ref.h(255);
            var2_ref.h((byte) 119);
            int discarded$2 = 8;
            ej.field_d = uea.a(var2_ref);
            tfa.field_e = new int[var3][];
            cq.field_b = new an[var3];
            var4 = 0;
            L1: while (true) {
              if (~var3 >= ~var4) {
                var2_ref.i((byte) 98);
                var4 = 0;
                L2: while (true) {
                  if (var4 >= var3) {
                    break L0;
                  } else {
                    var5 = cq.field_b[var4];
                    var5.a(6, 6, 6, true, 1);
                    var5.a((byte) -120);
                    var6 = new int[]{var5.field_i + var5.field_z >> 1, var5.field_b + var5.field_m >> 1, var5.field_a + var5.field_p >> 1};
                    tfa.field_e[var4] = var6;
                    var5.a(-var6[2], -var6[0], (byte) -86, -var6[1]);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                int discarded$3 = 1;
                cq.field_b[var4] = jo.a(var2_ref);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("gja.M(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 0 + 41);
        }
    }

    private final void f() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            L1: while (true) {
              if (var10 >= ((gja) this).field_W) {
                L2: {
                  ((gja) this).field_Q = var7;
                  ((gja) this).field_n = var6;
                  ((gja) this).field_K = var5;
                  ((gja) this).field_i = var2_int;
                  ((gja) this).field_o = var3;
                  ((gja) this).field_cb = var4;
                  ((gja) this).field_H = (int)(Math.sqrt((double)var8) + 0.99);
                  ((gja) this).field_A = true;
                  if (-913 == -913) {
                    break L2;
                  } else {
                    ka discarded$1 = this.a((gja) null, true, (gja) null, false, -20, false);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var11 = ((gja) this).field_Z[var10];
                  var12 = ((gja) this).field_r[var10];
                  if (~var12 >= ~var6) {
                    break L3;
                  } else {
                    var6 = var12;
                    break L3;
                  }
                }
                L4: {
                  if (~var3 >= ~var12) {
                    break L4;
                  } else {
                    var3 = var12;
                    break L4;
                  }
                }
                L5: {
                  if (~var11 <= ~var2_int) {
                    break L5;
                  } else {
                    var2_int = var11;
                    break L5;
                  }
                }
                L6: {
                  var13 = ((gja) this).field_l[var10];
                  if (~var5 > ~var11) {
                    var5 = var11;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var7 >= var13) {
                    break L7;
                  } else {
                    var7 = var13;
                    break L7;
                  }
                }
                L8: {
                  if (~var13 > ~var4) {
                    var4 = var13;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var14 = var13 * var13 + var11 * var11;
                  if (~var14 < ~var8) {
                    var8 = var14;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var14 = var13 * var13 + var11 * var11 - -(var12 * var12);
                  if (~var14 < ~var9) {
                    var9 = var14;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var10++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.IA(" + -913 + 41);
        }
    }

    final static byte[] a(int param0, File param1) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            byte[] stackIn_4_0 = null;
            Object stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_3_0 = null;
            Object stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              var3 = new byte[param0];
              nj.a(var3, 107, param0, param1);
              stackOut_3_0 = (byte[]) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (IOException) (Object) decompiledCaughtException;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (byte[]) (Object) stackIn_6_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var3_ref2;
                stackOut_7_1 = new StringBuilder().append("gja.K(").append(param0).append(44);
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L0;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L0;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean h() {
        RuntimeException var2 = null;
        eja var2_ref = null;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((gja) this).field_g.field_a) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (((gja) this).field_g.field_d == null) {
                  ((gja) this).field_g.field_d = ((gja) this).field_S.a(26, ((gja) this).field_F);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var2_ref = ((gja) this).field_g.field_d;
                var2_ref.a(28, 6 * ((gja) this).field_v);
                var3 = var2_ref.a(true, (byte) -10);
                if (null == var3) {
                  break L2;
                } else {
                  L3: {
                    var4 = ((gja) this).field_S.a(var3, 127);
                    if (!jaclib.memory.Stream.b()) {
                      var5 = 0;
                      L4: while (true) {
                        if (~var5 <= ~((gja) this).field_v) {
                          break L3;
                        } else {
                          var4.b((int) ((gja) this).field_M[var5]);
                          var4.b((int) ((gja) this).field_z[var5]);
                          var4.b((int) ((gja) this).field_V[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      var5 = 0;
                      L5: while (true) {
                        if (~var5 <= ~((gja) this).field_v) {
                          break L3;
                        } else {
                          var4.a((int) ((gja) this).field_M[var5]);
                          var4.a((int) ((gja) this).field_z[var5]);
                          var4.a((int) ((gja) this).field_V[var5]);
                          var5++;
                          continue L5;
                        }
                      }
                    }
                  }
                  var4.a();
                  if (!var2_ref.a((byte) 95)) {
                    break L2;
                  } else {
                    ((gja) this).field_g.field_a = true;
                    ((gja) this).field_g.field_c = var2_ref;
                    ((gja) this).field_N = true;
                    stackOut_27_0 = 1;
                    stackIn_28_0 = stackOut_27_0;
                    return stackIn_28_0 != 0;
                  }
                }
              }
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.B(" + 0 + 41);
        }
        return stackIn_30_0 != 0;
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((gja) this).field_N) {
              L1: {
                ((gja) this).field_N = false;
                if (null != ((gja) this).field_X) {
                  break L1;
                } else {
                  if (((gja) this).field_s != null) {
                    break L1;
                  } else {
                    if (((gja) this).field_u != null) {
                      break L1;
                    } else {
                      int discarded$7 = 27;
                      if (!ei.a(((gja) this).field_h, ((gja) this).field_Y)) {
                        L2: {
                          var2_int = 0;
                          var3 = 0;
                          var4 = 0;
                          if (null == ((gja) this).field_Z) {
                            break L2;
                          } else {
                            if (!tp.a(((gja) this).field_h, (byte) 3, ((gja) this).field_Y)) {
                              L3: {
                                if (null == ((gja) this).field_ib) {
                                  break L3;
                                } else {
                                  if (!((gja) this).field_ib.b(16440)) {
                                    ((gja) this).field_N = true;
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              var2_int = 1;
                              if (!((gja) this).field_A) {
                                int discarded$8 = -913;
                                this.f();
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        L4: {
                          if (null == ((gja) this).field_r) {
                            break L4;
                          } else {
                            if (!qr.c(458752, ((gja) this).field_h, ((gja) this).field_Y)) {
                              L5: {
                                if (null == ((gja) this).field_ib) {
                                  break L5;
                                } else {
                                  if (!((gja) this).field_ib.b(16440)) {
                                    ((gja) this).field_N = true;
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var3 = 1;
                              if (!((gja) this).field_A) {
                                int discarded$9 = -913;
                                this.f();
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (((gja) this).field_l == null) {
                            break L6;
                          } else {
                            if (cu.a(-79, ((gja) this).field_Y, ((gja) this).field_h)) {
                              break L6;
                            } else {
                              L7: {
                                if (null == ((gja) this).field_ib) {
                                  break L7;
                                } else {
                                  if (((gja) this).field_ib.b(16440)) {
                                    break L7;
                                  } else {
                                    ((gja) this).field_N = true;
                                    break L6;
                                  }
                                }
                              }
                              L8: {
                                if (((gja) this).field_A) {
                                  break L8;
                                } else {
                                  int discarded$10 = -913;
                                  this.f();
                                  break L8;
                                }
                              }
                              var4 = 1;
                              break L6;
                            }
                          }
                        }
                        L9: {
                          if (var3 != 0) {
                            ((gja) this).field_r = null;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (var4 != 0) {
                            ((gja) this).field_l = null;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          ((gja) this).field_Z = null;
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L11: {
                if (((gja) this).field_db == null) {
                  break L11;
                } else {
                  if (((gja) this).field_Z != null) {
                    break L11;
                  } else {
                    if (null != ((gja) this).field_r) {
                      break L11;
                    } else {
                      if (((gja) this).field_l != null) {
                        break L11;
                      } else {
                        ((gja) this).field_J = null;
                        ((gja) this).field_db = null;
                        break L11;
                      }
                    }
                  }
                }
              }
              L12: {
                if (null == ((gja) this).field_w) {
                  break L12;
                } else {
                  if (dba.a(((gja) this).field_h, 98, ((gja) this).field_Y)) {
                    break L12;
                  } else {
                    L13: {
                      L14: {
                        if (0 == (55 & ((gja) this).field_h)) {
                          if (((gja) this).field_E == null) {
                            break L13;
                          } else {
                            if (!((gja) this).field_E.b(16440)) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                        } else {
                          if (null == ((gja) this).field_O) {
                            break L13;
                          } else {
                            if (!((gja) this).field_O.b(16440)) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      ((gja) this).field_N = true;
                      break L12;
                    }
                    ((gja) this).field_lb = null;
                    ((gja) this).field_p = null;
                    ((gja) this).field_m = null;
                    ((gja) this).field_w = null;
                    break L12;
                  }
                }
              }
              L15: {
                if (null == ((gja) this).field_P) {
                  break L15;
                } else {
                  if (!th.b(((gja) this).field_Y, 8, ((gja) this).field_h)) {
                    L16: {
                      if (((gja) this).field_E == null) {
                        break L16;
                      } else {
                        if (((gja) this).field_E.b(16440)) {
                          break L16;
                        } else {
                          ((gja) this).field_N = true;
                          break L15;
                        }
                      }
                    }
                    ((gja) this).field_P = null;
                    break L15;
                  } else {
                    break L15;
                  }
                }
              }
              L17: {
                if (((gja) this).field_C == null) {
                  break L17;
                } else {
                  if (!jda.d(((gja) this).field_h, -28090, ((gja) this).field_Y)) {
                    L18: {
                      if (null == ((gja) this).field_E) {
                        break L18;
                      } else {
                        if (!((gja) this).field_E.b(16440)) {
                          ((gja) this).field_N = true;
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    ((gja) this).field_C = null;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L19: {
                if (null == ((gja) this).field_eb) {
                  break L19;
                } else {
                  if (!ov.a((byte) -96, ((gja) this).field_Y, ((gja) this).field_h)) {
                    L20: {
                      if (((gja) this).field_d == null) {
                        break L20;
                      } else {
                        if (((gja) this).field_d.b(16440)) {
                          break L20;
                        } else {
                          ((gja) this).field_N = true;
                          break L19;
                        }
                      }
                    }
                    ((gja) this).field_t = null;
                    ((gja) this).field_eb = null;
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L21: {
                if (((gja) this).field_gb == null) {
                  break L21;
                } else {
                  int discarded$11 = -102;
                  if (!uw.a(((gja) this).field_h, ((gja) this).field_Y)) {
                    L22: {
                      if (null == ((gja) this).field_E) {
                        break L22;
                      } else {
                        if (((gja) this).field_E.b(16440)) {
                          break L22;
                        } else {
                          ((gja) this).field_N = true;
                          break L21;
                        }
                      }
                    }
                    ((gja) this).field_gb = null;
                    break L21;
                  } else {
                    break L21;
                  }
                }
              }
              L23: {
                if (null == ((gja) this).field_M) {
                  break L23;
                } else {
                  if (kd.c(-58, ((gja) this).field_Y, ((gja) this).field_h)) {
                    break L23;
                  } else {
                    L24: {
                      L25: {
                        if (((gja) this).field_g == null) {
                          break L25;
                        } else {
                          if (!((gja) this).field_g.a(false)) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      L26: {
                        if (null == ((gja) this).field_E) {
                          break L26;
                        } else {
                          if (((gja) this).field_E.b(16440)) {
                            break L26;
                          } else {
                            break L24;
                          }
                        }
                      }
                      ((gja) this).field_z = null;
                      ((gja) this).field_M = null;
                      ((gja) this).field_V = null;
                      break L23;
                    }
                    ((gja) this).field_N = true;
                    break L23;
                  }
                }
              }
              L27: {
                if (((gja) this).field_kb != null) {
                  L28: {
                    if (((gja) this).field_ib == null) {
                      break L28;
                    } else {
                      if (!((gja) this).field_ib.b(16440)) {
                        ((gja) this).field_N = true;
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  ((gja) this).field_kb = null;
                  break L27;
                } else {
                  break L27;
                }
              }
              L29: {
                if (null == ((gja) this).field_G) {
                  break L29;
                } else {
                  L30: {
                    if (((gja) this).field_E == null) {
                      break L30;
                    } else {
                      if (!((gja) this).field_E.b(16440)) {
                        ((gja) this).field_N = true;
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  ((gja) this).field_G = null;
                  break L29;
                }
              }
              L31: {
                if (null == ((gja) this).field_q) {
                  break L31;
                } else {
                  int discarded$12 = -126;
                  if (ofa.a(((gja) this).field_Y, ((gja) this).field_h)) {
                    break L31;
                  } else {
                    ((gja) this).field_q = null;
                    ((gja) this).field_jb = null;
                    break L31;
                  }
                }
              }
              L32: {
                var2_int = -56;
                if (((gja) this).field_D == null) {
                  break L32;
                } else {
                  int discarded$13 = 32;
                  if (!qr.d(((gja) this).field_Y, ((gja) this).field_h)) {
                    ((gja) this).field_D = null;
                    ((gja) this).field_hb = null;
                    break L32;
                  } else {
                    break L32;
                  }
                }
              }
              L33: {
                if (((gja) this).field_mb == null) {
                  break L33;
                } else {
                  if (ub.a(((gja) this).field_h, ((gja) this).field_Y, (byte) 21)) {
                    break L33;
                  } else {
                    ((gja) this).field_mb = null;
                    break L33;
                  }
                }
              }
              L34: {
                if (((gja) this).field_U == null) {
                  break L34;
                } else {
                  if ((2048 & ((gja) this).field_Y) != 0) {
                    break L34;
                  } else {
                    if ((262144 & ((gja) this).field_Y) == 0) {
                      ((gja) this).field_U = null;
                      ((gja) this).field_j = null;
                      ((gja) this).field_R = null;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.GA(" + -46 + 41);
        }
    }

    public static void g() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_k = null;
            field_bb = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "gja.P(" + 3 + 41);
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (0 != ((gja) this).field_v) {
              if (param0 <= -8) {
                L1: {
                  int discarded$2 = 66;
                  if (!this.c()) {
                    break L1;
                  } else {
                    int discarded$3 = 0;
                    if (!this.h()) {
                      break L1;
                    } else {
                      L2: {
                        ((gja) this).field_S.a(-126, 0, ((gja) this).field_ib.field_e);
                        ((gja) this).field_S.a(-128, 1, ((gja) this).field_E.field_e);
                        ((gja) this).field_S.a(-127, 2, ((gja) this).field_d.field_e);
                        if ((55 & ((gja) this).field_h) == 0) {
                          ((gja) this).field_S.d(0, false);
                          var2_int = 0;
                          ((gja) this).field_S.a(((gja) this).field_S.field_ob, -32);
                          break L2;
                        } else {
                          ((gja) this).field_S.d(0, true);
                          var2_int = 1;
                          ((gja) this).field_S.a(-127, 3, ((gja) this).field_O.field_e);
                          ((gja) this).field_S.a(((gja) this).field_S.field_nc, -32);
                          break L2;
                        }
                      }
                      var3 = 0;
                      L3: while (true) {
                        if (~var3 <= ~((gja) this).field_j.length) {
                          break L1;
                        } else {
                          L4: {
                            var4 = ((gja) this).field_U[var3];
                            var5 = ((gja) this).field_U[var3 - -1];
                            var6 = ((gja) this).field_gb[var4] & 65535;
                            if (var6 == 65535) {
                              var6 = -1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((gja) this).field_S.a((byte) -80, var2_int != 0, true, var6);
                          ((gja) this).field_S.a(((gja) this).field_g.field_c, -19394, ((gja) this).field_j[var3], var4 * 3, fma.field_f, ((gja) this).field_R[var3], var5 + -var4);
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                this.b(-46);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.T(" + param0 + 41);
        }
    }

    final void H(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (~((gja) this).field_W >= ~var4_int) {
                this.d(1);
                ((gja) this).field_A = false;
                break L0;
              } else {
                L2: {
                  if (param0 != 0) {
                    ((gja) this).field_Z[var4_int] = ((gja) this).field_Z[var4_int] + param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1 != 0) {
                    ((gja) this).field_r[var4_int] = ((gja) this).field_r[var4_int] + param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (0 == param2) {
                    break L4;
                  } else {
                    ((gja) this).field_l[var4_int] = ((gja) this).field_l[var4_int] + param2;
                    break L4;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.H(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void wa() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (~var1_int <= ~((gja) this).field_y) {
                this.d(-121);
                ((gja) this).field_A = false;
                break L0;
              } else {
                ((gja) this).field_Z[var1_int] = ((gja) this).field_Z[var1_int] + 7 >> 4;
                ((gja) this).field_r[var1_int] = 7 + ((gja) this).field_r[var1_int] >> 4;
                ((gja) this).field_l[var1_int] = 7 + ((gja) this).field_l[var1_int] >> 4;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "gja.wa()");
        }
    }

    final void b() {
    }

    private final boolean c() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        jaclib.memory.Buffer var8 = null;
        short[] var9 = null;
        short[] var10 = null;
        short[] var11 = null;
        byte[] var12 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_114_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_113_0 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((gja) this).field_E.field_h) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = stackIn_5_0;
                if (0 == (55 & ((gja) this).field_h)) {
                  break L3;
                } else {
                  if (((gja) this).field_O.field_h) {
                    break L3;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_12_0 = stackOut_9_0;
                    break L2;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
            L4: {
              var3 = stackIn_12_0;
              if (((gja) this).field_ib.field_h) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var4 = stackIn_16_0;
              if (((gja) this).field_d.field_h) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L5;
              } else {
                stackOut_17_0 = 1;
                stackIn_20_0 = stackOut_17_0;
                break L5;
              }
            }
            L6: {
              var5 = stackIn_20_0;
              if (var4 != 0) {
                break L6;
              } else {
                if (var2_int != 0) {
                  break L6;
                } else {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      stackOut_32_0 = 1;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0 != 0;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
            L7: {
              var6 = 1;
              if (var4 == 0) {
                break L7;
              } else {
                if (((gja) this).field_kb != null) {
                  L8: {
                    if (((gja) this).field_ib.field_a != null) {
                      break L8;
                    } else {
                      ((gja) this).field_ib.field_a = ((gja) this).field_S.c(6, ((gja) this).field_F);
                      break L8;
                    }
                  }
                  var7 = ((gja) this).field_ib.field_a;
                  boolean discarded$4 = var7.a(12 * ((gja) this).field_fb, 12, true);
                  var8 = var7.a(-15730, true);
                  if (var8 != null) {
                    ((gja) this).field_S.field_P.copyPositions(((gja) this).field_Z, ((gja) this).field_r, ((gja) this).field_l, ((gja) this).field_kb, 0, 12, ((gja) this).field_fb, var8.getAddress());
                    if (!var7.a(true)) {
                      var6 = 0;
                      break L7;
                    } else {
                      ((gja) this).field_ib.field_e = var7;
                      ((gja) this).field_ib.field_h = true;
                      break L7;
                    }
                  } else {
                    var6 = 0;
                    break L7;
                  }
                } else {
                  stackOut_41_0 = 1;
                  stackIn_42_0 = stackOut_41_0;
                  return stackIn_42_0 != 0;
                }
              }
            }
            L9: {
              if (var2_int == 0) {
                break L9;
              } else {
                L10: {
                  if (null != ((gja) this).field_E.field_a) {
                    break L10;
                  } else {
                    ((gja) this).field_E.field_a = ((gja) this).field_S.c(6, ((gja) this).field_F);
                    break L10;
                  }
                }
                var7 = ((gja) this).field_E.field_a;
                boolean discarded$5 = var7.a(((gja) this).field_fb * 4, 4, true);
                var8 = var7.a(-15730, true);
                if (var8 == null) {
                  var6 = 0;
                  break L9;
                } else {
                  L11: {
                    if ((55 & ((gja) this).field_h) == 0) {
                      L12: {
                        if (((gja) this).field_e != null) {
                          var11 = ((gja) this).field_e.field_e;
                          var9 = ((gja) this).field_e.field_a;
                          var10 = ((gja) this).field_e.field_c;
                          var12 = ((gja) this).field_e.field_b;
                          break L12;
                        } else {
                          var10 = ((gja) this).field_m;
                          var9 = ((gja) this).field_lb;
                          var12 = ((gja) this).field_w;
                          var11 = ((gja) this).field_p;
                          break L12;
                        }
                      }
                      ((gja) this).field_S.field_P.copyLighting(((gja) this).field_P, ((gja) this).field_C, ((gja) this).field_gb, var9, var10, var11, var12, (int) ((gja) this).field_T, (int) ((gja) this).field_ab, ((gja) this).field_G, 0, 4, ((gja) this).field_fb, var8.getAddress());
                      break L11;
                    } else {
                      ((gja) this).field_S.field_P.copyColours(((gja) this).field_P, ((gja) this).field_C, ((gja) this).field_gb, (int) ((gja) this).field_T, ((gja) this).field_G, 0, 4, ((gja) this).field_fb, var8.getAddress());
                      break L11;
                    }
                  }
                  if (!var7.a(true)) {
                    var6 = 0;
                    break L9;
                  } else {
                    ((gja) this).field_E.field_h = true;
                    ((gja) this).field_E.field_e = var7;
                    break L9;
                  }
                }
              }
            }
            L13: {
              if (var3 == 0) {
                break L13;
              } else {
                L14: {
                  if (null == ((gja) this).field_O.field_a) {
                    ((gja) this).field_O.field_a = ((gja) this).field_S.c(6, ((gja) this).field_F);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var7 = ((gja) this).field_O.field_a;
                boolean discarded$6 = var7.a(((gja) this).field_fb * 12, 12, true);
                var8 = var7.a(-15730, true);
                if (var8 != null) {
                  L15: {
                    if (((gja) this).field_e != null) {
                      var10 = ((gja) this).field_e.field_c;
                      var9 = ((gja) this).field_e.field_a;
                      var11 = ((gja) this).field_e.field_e;
                      var12 = ((gja) this).field_e.field_b;
                      break L15;
                    } else {
                      var11 = ((gja) this).field_p;
                      var9 = ((gja) this).field_lb;
                      var10 = ((gja) this).field_m;
                      var12 = ((gja) this).field_w;
                      break L15;
                    }
                  }
                  ((gja) this).field_S.field_P.copyNormals(var9, var10, var11, var12, 3.0f / (float)((gja) this).field_ab, 3.0f / (float)(((gja) this).field_ab / 2 + ((gja) this).field_ab), 0, 12, ((gja) this).field_fb, var8.getAddress());
                  if (var7.a(true)) {
                    ((gja) this).field_O.field_e = var7;
                    ((gja) this).field_O.field_h = true;
                    break L13;
                  } else {
                    var6 = 0;
                    break L13;
                  }
                } else {
                  var6 = 0;
                  break L13;
                }
              }
            }
            L16: {
              if (var5 == 0) {
                break L16;
              } else {
                L17: {
                  if (((gja) this).field_d.field_a == null) {
                    ((gja) this).field_d.field_a = ((gja) this).field_S.c(6, ((gja) this).field_F);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                var7 = ((gja) this).field_d.field_a;
                boolean discarded$7 = var7.a(((gja) this).field_fb * 8, 8, true);
                var8 = var7.a(-15730, true);
                if (null != var8) {
                  ((gja) this).field_S.field_P.copyTexCoords(((gja) this).field_eb, ((gja) this).field_t, 0, 8, ((gja) this).field_fb, var8.getAddress());
                  if (var7.a(true)) {
                    ((gja) this).field_d.field_h = true;
                    ((gja) this).field_d.field_e = var7;
                    break L16;
                  } else {
                    var6 = 0;
                    break L16;
                  }
                } else {
                  var6 = 0;
                  break L16;
                }
              }
            }
            stackOut_113_0 = var6;
            stackIn_114_0 = stackOut_113_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.L(" + 66 + 41);
        }
        return stackIn_114_0 != 0;
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        asa var3 = null;
        int var4 = 0;
        ll var5 = null;
        gca var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        eo stackIn_3_0 = null;
        eo stackIn_5_0 = null;
        eo stackIn_7_0 = null;
        eo stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException decompiledCaughtException = null;
        eo stackOut_2_0 = null;
        eo stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        eo stackOut_3_0 = null;
        eo stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 55 % ((param0 - -30) / 59);
              if (null == ((gja) this).field_u) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = ((gja) this).field_S;
                  stackIn_7_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (((gja) this).field_f) {
                    stackOut_7_0 = (eo) (Object) stackIn_7_0;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  } else {
                    stackOut_3_0 = (eo) (Object) stackIn_3_0;
                    stackIn_5_0 = stackOut_3_0;
                    stackOut_5_0 = (eo) (Object) stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_8_1 = stackOut_5_1;
                    break L2;
                  }
                }
                ((eo) (Object) stackIn_8_0).a(stackIn_8_1 != 0, 0);
                ((gja) this).field_S.d(0, false);
                ((gja) this).field_S.a(pea.field_c, 1, -79);
                ((gja) this).field_S.a(1, false, pea.field_c);
                var4 = 0;
                L3: while (true) {
                  if (~var4 <= ~((gja) this).field_L) {
                    ((gja) this).field_S.a(1, false, lja.field_j);
                    ((gja) this).field_S.a(lja.field_j, 1, -117);
                    ((gja) this).field_S.a(true, 0);
                    break L1;
                  } else {
                    L4: {
                      L5: {
                        var5 = ((gja) this).field_u[var4];
                        var6 = ((gja) this).field_nb[var4];
                        if (!var5.field_e) {
                          break L5;
                        } else {
                          if (!((gja) this).field_S.f()) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7 = 0.3333333134651184f * (float)(((gja) this).field_Z[var5.field_i] + (((gja) this).field_Z[var5.field_c] - -((gja) this).field_Z[var5.field_k]));
                      var8 = 0.3333333134651184f * (float)(((gja) this).field_r[var5.field_k] + (((gja) this).field_r[var5.field_i] + ((gja) this).field_r[var5.field_c]));
                      var9 = (float)(((gja) this).field_l[var5.field_k] + ((gja) this).field_l[var5.field_c] - -((gja) this).field_l[var5.field_i]) * 0.3333333134651184f;
                      var10 = var9 * wka.field_b + (vta.field_e * var8 + baa.field_c * var7) + fba.field_a;
                      var11 = var9 * ct.field_b + (kb.field_p * var8 + var7 * vs.field_O) + tu.field_g;
                      var12 = gj.field_h + (var9 * hs.field_c + (var7 * pl.field_a + qra.field_d * var8));
                      var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + var10 * var10)))) * (float)var5.field_b;
                      var3 = ((gja) this).field_S.y((byte) -77);
                      var3.a(var10 + (float)var6.field_e - var10 * var13, var6.field_m * var5.field_j >> 7, var5.field_a * var6.field_k >> 7, var6.field_c, 2, var12 - var12 * var13, var11 + (float)var6.field_b - var13 * var11);
                      var3.b((gda) (Object) ((gja) this).field_S.field_Y, 3);
                      ((gja) this).field_S.F(-1662);
                      var14 = var6.field_h;
                      ((gja) this).field_S.a((byte) -80, false, false, (int) var5.field_l);
                      ((gja) this).field_S.c((int) var5.field_f, 1);
                      ((gja) this).field_S.g(3625, var14);
                      ((gja) this).field_S.y(2);
                      break L4;
                    }
                    var4++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.D(" + param0 + 41);
        }
    }

    private final void e() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((gja) this).field_E) {
                break L1;
              } else {
                ((gja) this).field_E.field_h = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.HA(" + 0 + 41);
        }
    }

    final void O(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= ((gja) this).field_W) {
                this.d(11);
                ((gja) this).field_A = false;
                break L0;
              } else {
                L2: {
                  if (param0 == 128) {
                    break L2;
                  } else {
                    ((gja) this).field_Z[var4_int] = ((gja) this).field_Z[var4_int] * param0 >> 7;
                    break L2;
                  }
                }
                L3: {
                  if (128 != param1) {
                    ((gja) this).field_r[var4_int] = ((gja) this).field_r[var4_int] * param1 >> 7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param2 != 128) {
                    ((gja) this).field_l[var4_int] = param2 * ((gja) this).field_l[var4_int] >> 7;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.O(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void FA(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = qu.field_b[param0];
            var3 = qu.field_d[param0];
            var4 = 0;
            L1: while (true) {
              if (~var4 <= ~((gja) this).field_W) {
                this.d(94);
                ((gja) this).field_A = false;
                break L0;
              } else {
                var5 = -(((gja) this).field_l[var4] * var2_int) + var3 * ((gja) this).field_r[var4] >> 14;
                ((gja) this).field_l[var4] = ((gja) this).field_l[var4] * var3 + ((gja) this).field_r[var4] * var2_int >> 14;
                ((gja) this).field_r[var4] = var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.FA(" + param0 + 41);
        }
    }

    private final ka a(gja param0, boolean param1, gja param2, boolean param3, int param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mca var11_ref_mca = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          param0.field_y = ((gja) this).field_y;
          param0.field_I = ((gja) this).field_I;
          param0.field_Y = param4;
          param0.field_ab = ((gja) this).field_ab;
          param0.field_L = ((gja) this).field_L;
          param0.field_W = ((gja) this).field_W;
          param0.field_h = ((gja) this).field_h;
          param0.field_fb = ((gja) this).field_fb;
          if ((param4 & 256) == 0) {
            param0.field_f = ((gja) this).field_f;
            break L0;
          } else {
            param0.field_f = true;
            break L0;
          }
        }
        L1: {
          param0.field_T = ((gja) this).field_T;
          param0.field_v = ((gja) this).field_v;
          var7_int = ir.a(param4, ((gja) this).field_h, (byte) -100) ? 1 : 0;
          var8 = cga.a(param4, -62, ((gja) this).field_h) ? 1 : 0;
          int discarded$9 = 52;
          var9 = er.c(param4, ((gja) this).field_h) ? 1 : 0;
          var10 = var8 | var7_int | var9;
          if (var10 != 0) {
            L2: {
              if (var7_int != 0) {
                L3: {
                  if (null == param2.field_Z) {
                    break L3;
                  } else {
                    if (~param2.field_Z.length > ~((gja) this).field_y) {
                      break L3;
                    } else {
                      param0.field_Z = param2.field_Z;
                      break L2;
                    }
                  }
                }
                param2.field_Z = new int[((gja) this).field_y];
                param0.field_Z = new int[((gja) this).field_y];
                break L2;
              } else {
                param0.field_Z = ((gja) this).field_Z;
                break L2;
              }
            }
            L4: {
              if (var8 == 0) {
                param0.field_r = ((gja) this).field_r;
                break L4;
              } else {
                L5: {
                  if (param2.field_r == null) {
                    break L5;
                  } else {
                    if (((gja) this).field_y <= param2.field_r.length) {
                      param0.field_r = param2.field_r;
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param2.field_r = new int[((gja) this).field_y];
                param0.field_r = new int[((gja) this).field_y];
                break L4;
              }
            }
            L6: {
              if (var9 != 0) {
                L7: {
                  if (param2.field_l == null) {
                    break L7;
                  } else {
                    if (~param2.field_l.length <= ~((gja) this).field_y) {
                      param0.field_l = param2.field_l;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param2.field_l = new int[((gja) this).field_y];
                param0.field_l = new int[((gja) this).field_y];
                break L6;
              } else {
                param0.field_l = ((gja) this).field_l;
                break L6;
              }
            }
            var11 = 0;
            L8: while (true) {
              if (~((gja) this).field_y >= ~var11) {
                break L1;
              } else {
                L9: {
                  if (var7_int != 0) {
                    param0.field_Z[var11] = ((gja) this).field_Z[var11];
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var8 == 0) {
                    break L10;
                  } else {
                    param0.field_r[var11] = ((gja) this).field_r[var11];
                    break L10;
                  }
                }
                L11: {
                  if (var9 != 0) {
                    param0.field_l[var11] = ((gja) this).field_l[var11];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var11++;
                continue L8;
              }
            }
          } else {
            param0.field_Z = ((gja) this).field_Z;
            param0.field_r = ((gja) this).field_r;
            param0.field_l = ((gja) this).field_l;
            break L1;
          }
        }
        L12: {
          if (uu.a(true, param4, ((gja) this).field_h)) {
            param0.field_ib = param2.field_ib;
            param0.field_ib.field_h = ((gja) this).field_ib.field_h;
            param0.field_ib.field_b = true;
            param0.field_ib.field_e = ((gja) this).field_ib.field_e;
            break L12;
          } else {
            if (ss.a((byte) 114, ((gja) this).field_h, param4)) {
              param0.field_ib = ((gja) this).field_ib;
              break L12;
            } else {
              param0.field_ib = null;
              break L12;
            }
          }
        }
        L13: {
          if (bqa.a(540800, param4, ((gja) this).field_h)) {
            L14: {
              L15: {
                if (param2.field_P == null) {
                  break L15;
                } else {
                  if (~((gja) this).field_I < ~param2.field_P.length) {
                    break L15;
                  } else {
                    param0.field_P = param2.field_P;
                    break L14;
                  }
                }
              }
              param2.field_P = new short[((gja) this).field_I];
              param0.field_P = new short[((gja) this).field_I];
              break L14;
            }
            var11 = 0;
            L16: while (true) {
              if (~var11 <= ~((gja) this).field_I) {
                break L13;
              } else {
                param0.field_P[var11] = ((gja) this).field_P[var11];
                var11++;
                continue L16;
              }
            }
          } else {
            param0.field_P = ((gja) this).field_P;
            break L13;
          }
        }
        L17: {
          int discarded$10 = 26205;
          if (!go.d(((gja) this).field_h, param4)) {
            param0.field_C = ((gja) this).field_C;
            break L17;
          } else {
            L18: {
              L19: {
                if (null == param2.field_C) {
                  break L19;
                } else {
                  if (~param2.field_C.length <= ~((gja) this).field_I) {
                    param0.field_C = param2.field_C;
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              param2.field_C = new byte[((gja) this).field_I];
              param0.field_C = new byte[((gja) this).field_I];
              break L18;
            }
            var11 = 0;
            L20: while (true) {
              if (var11 >= ((gja) this).field_I) {
                break L17;
              } else {
                param0.field_C[var11] = ((gja) this).field_C[var11];
                var11++;
                continue L20;
              }
            }
          }
        }
        L21: {
          int discarded$11 = 36864;
          if (!no.a(((gja) this).field_h, param4)) {
            if (!lf.a(((gja) this).field_h, param4, 128)) {
              param0.field_E = null;
              break L21;
            } else {
              param0.field_E = ((gja) this).field_E;
              break L21;
            }
          } else {
            param0.field_E = param2.field_E;
            param0.field_E.field_h = ((gja) this).field_E.field_h;
            param0.field_E.field_b = true;
            param0.field_E.field_e = ((gja) this).field_E.field_e;
            break L21;
          }
        }
        L22: {
          int discarded$12 = 0;
          if (!kaa.a(((gja) this).field_h, param4)) {
            param0.field_p = ((gja) this).field_p;
            param0.field_m = ((gja) this).field_m;
            param0.field_w = ((gja) this).field_w;
            param0.field_e = ((gja) this).field_e;
            param0.field_lb = ((gja) this).field_lb;
            break L22;
          } else {
            L23: {
              L24: {
                if (null == param2.field_lb) {
                  break L24;
                } else {
                  if (~((gja) this).field_fb >= ~param2.field_lb.length) {
                    param0.field_p = param2.field_p;
                    param0.field_lb = param2.field_lb;
                    param0.field_m = param2.field_m;
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              var11 = ((gja) this).field_fb;
              param2.field_lb = new short[var11];
              param0.field_lb = new short[var11];
              param2.field_p = new short[var11];
              param0.field_p = new short[var11];
              param2.field_m = new short[var11];
              param0.field_m = new short[var11];
              break L23;
            }
            L25: {
              if (null == ((gja) this).field_e) {
                param0.field_e = null;
                var11 = 0;
                L26: while (true) {
                  if (~var11 <= ~((gja) this).field_fb) {
                    break L25;
                  } else {
                    param0.field_lb[var11] = ((gja) this).field_lb[var11];
                    param0.field_m[var11] = ((gja) this).field_m[var11];
                    param0.field_p[var11] = ((gja) this).field_p[var11];
                    var11++;
                    continue L26;
                  }
                }
              } else {
                L27: {
                  if (param2.field_e == null) {
                    param2.field_e = new mca();
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  L29: {
                    mca fieldTemp$13 = param2.field_e;
                    param0.field_e = param2.field_e;
                    var11_ref_mca = fieldTemp$13;
                    if (var11_ref_mca.field_a == null) {
                      break L29;
                    } else {
                      if (var11_ref_mca.field_a.length < ((gja) this).field_fb) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  var12 = ((gja) this).field_fb;
                  var11_ref_mca.field_a = new short[var12];
                  var11_ref_mca.field_e = new short[var12];
                  var11_ref_mca.field_b = new byte[var12];
                  var11_ref_mca.field_c = new short[var12];
                  break L28;
                }
                var12 = 0;
                L30: while (true) {
                  if (((gja) this).field_fb <= var12) {
                    break L25;
                  } else {
                    param0.field_lb[var12] = ((gja) this).field_lb[var12];
                    param0.field_m[var12] = ((gja) this).field_m[var12];
                    param0.field_p[var12] = ((gja) this).field_p[var12];
                    var11_ref_mca.field_a[var12] = ((gja) this).field_e.field_a[var12];
                    var11_ref_mca.field_c[var12] = ((gja) this).field_e.field_c[var12];
                    var11_ref_mca.field_e[var12] = ((gja) this).field_e.field_e[var12];
                    var11_ref_mca.field_b[var12] = ((gja) this).field_e.field_b[var12];
                    var12++;
                    continue L30;
                  }
                }
              }
            }
            param0.field_w = ((gja) this).field_w;
            break L22;
          }
        }
        L31: {
          int discarded$14 = -19531;
          if (oba.c(param4, ((gja) this).field_h)) {
            param0.field_O = param2.field_O;
            param0.field_O.field_h = ((gja) this).field_O.field_h;
            param0.field_O.field_e = ((gja) this).field_O.field_e;
            param0.field_O.field_b = true;
            break L31;
          } else {
            int discarded$15 = 2048;
            if (!vta.a(((gja) this).field_h, param4)) {
              param0.field_O = null;
              break L31;
            } else {
              param0.field_O = ((gja) this).field_O;
              break L31;
            }
          }
        }
        L32: {
          if (!uk.a(((gja) this).field_h, (byte) -47, param4)) {
            param0.field_t = ((gja) this).field_t;
            param0.field_eb = ((gja) this).field_eb;
            break L32;
          } else {
            L33: {
              L34: {
                if (param2.field_eb == null) {
                  break L34;
                } else {
                  if (~((gja) this).field_I >= ~param2.field_eb.length) {
                    param0.field_eb = param2.field_eb;
                    param0.field_t = param2.field_t;
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              var11 = ((gja) this).field_fb;
              param2.field_t = new float[var11];
              param0.field_t = new float[var11];
              param2.field_eb = new float[var11];
              param0.field_eb = new float[var11];
              break L33;
            }
            var11 = 0;
            L35: while (true) {
              if (((gja) this).field_fb <= var11) {
                break L32;
              } else {
                param0.field_eb[var11] = ((gja) this).field_eb[var11];
                param0.field_t[var11] = ((gja) this).field_t[var11];
                var11++;
                continue L35;
              }
            }
          }
        }
        L36: {
          if (!pr.a(param4, -23611, ((gja) this).field_h)) {
            int discarded$16 = 0;
            if (foa.a(param4, ((gja) this).field_h)) {
              param0.field_d = ((gja) this).field_d;
              break L36;
            } else {
              param0.field_d = null;
              break L36;
            }
          } else {
            param0.field_d = param2.field_d;
            param0.field_d.field_e = ((gja) this).field_d.field_e;
            param0.field_d.field_h = ((gja) this).field_d.field_h;
            param0.field_d.field_b = true;
            break L36;
          }
        }
        L37: {
          if (!pca.b(((gja) this).field_h, 71, param4)) {
            param0.field_z = ((gja) this).field_z;
            param0.field_V = ((gja) this).field_V;
            param0.field_M = ((gja) this).field_M;
            break L37;
          } else {
            L38: {
              L39: {
                if (null == param2.field_M) {
                  break L39;
                } else {
                  if (~param2.field_M.length > ~((gja) this).field_I) {
                    break L39;
                  } else {
                    param0.field_z = param2.field_z;
                    param0.field_M = param2.field_M;
                    param0.field_V = param2.field_V;
                    break L38;
                  }
                }
              }
              var11 = ((gja) this).field_I;
              param2.field_z = new short[var11];
              param0.field_z = new short[var11];
              param2.field_M = new short[var11];
              param0.field_M = new short[var11];
              param2.field_V = new short[var11];
              param0.field_V = new short[var11];
              break L38;
            }
            var11 = 0;
            L40: while (true) {
              if (((gja) this).field_I <= var11) {
                break L37;
              } else {
                param0.field_M[var11] = ((gja) this).field_M[var11];
                param0.field_z[var11] = ((gja) this).field_z[var11];
                param0.field_V[var11] = ((gja) this).field_V[var11];
                var11++;
                continue L40;
              }
            }
          }
        }
        L41: {
          if (uu.a(param4, ((gja) this).field_h, (byte) -116)) {
            param0.field_g = param2.field_g;
            param0.field_g.field_g = true;
            param0.field_g.field_a = ((gja) this).field_g.field_a;
            param0.field_g.field_c = ((gja) this).field_g.field_c;
            break L41;
          } else {
            if (ag.b(-1, param4, ((gja) this).field_h)) {
              param0.field_g = ((gja) this).field_g;
              break L41;
            } else {
              param0.field_g = null;
              break L41;
            }
          }
        }
        L42: {
          if (!fua.a(98, param4, ((gja) this).field_h)) {
            param0.field_gb = ((gja) this).field_gb;
            break L42;
          } else {
            L43: {
              L44: {
                if (param2.field_gb == null) {
                  break L44;
                } else {
                  if (~param2.field_gb.length > ~((gja) this).field_I) {
                    break L44;
                  } else {
                    param0.field_gb = param2.field_gb;
                    break L43;
                  }
                }
              }
              var11 = ((gja) this).field_I;
              param2.field_gb = new short[var11];
              param0.field_gb = new short[var11];
              break L43;
            }
            var11 = 0;
            L45: while (true) {
              if (((gja) this).field_I <= var11) {
                break L42;
              } else {
                param0.field_gb[var11] = ((gja) this).field_gb[var11];
                var11++;
                continue L45;
              }
            }
          }
        }
        L46: {
          int discarded$17 = -93;
          if (hk.a(param4, ((gja) this).field_h)) {
            L47: {
              if (param2.field_nb == null) {
                break L47;
              } else {
                if (((gja) this).field_L > param2.field_nb.length) {
                  break L47;
                } else {
                  param0.field_nb = param2.field_nb;
                  var11 = 0;
                  L48: while (true) {
                    if (~var11 <= ~((gja) this).field_L) {
                      break L46;
                    } else {
                      param0.field_nb[var11].a((byte) -81, ((gja) this).field_nb[var11]);
                      var11++;
                      continue L48;
                    }
                  }
                }
              }
            }
            var11 = ((gja) this).field_L;
            param2.field_nb = new gca[var11];
            param0.field_nb = new gca[var11];
            var12 = 0;
            L49: while (true) {
              if (((gja) this).field_L <= var12) {
                break L46;
              } else {
                param0.field_nb[var12] = ((gja) this).field_nb[var12].a(6);
                var12++;
                continue L49;
              }
            }
          } else {
            param0.field_nb = ((gja) this).field_nb;
            break L46;
          }
        }
        L50: {
          param0.field_hb = ((gja) this).field_hb;
          param0.field_mb = ((gja) this).field_mb;
          param0.field_X = ((gja) this).field_X;
          param0.field_db = ((gja) this).field_db;
          param0.field_D = ((gja) this).field_D;
          param0.field_R = ((gja) this).field_R;
          param0.field_U = ((gja) this).field_U;
          param0.field_s = ((gja) this).field_s;
          param0.field_kb = ((gja) this).field_kb;
          param0.field_j = ((gja) this).field_j;
          param0.field_G = ((gja) this).field_G;
          param0.field_jb = ((gja) this).field_jb;
          param0.field_J = ((gja) this).field_J;
          param0.field_u = ((gja) this).field_u;
          param0.field_q = ((gja) this).field_q;
          if (!((gja) this).field_A) {
            param0.field_A = false;
            break L50;
          } else {
            param0.field_H = ((gja) this).field_H;
            param0.field_o = ((gja) this).field_o;
            param0.field_cb = ((gja) this).field_cb;
            param0.field_i = ((gja) this).field_i;
            param0.field_K = ((gja) this).field_K;
            param0.field_A = true;
            param0.field_Q = ((gja) this).field_Q;
            param0.field_n = ((gja) this).field_n;
            break L50;
          }
        }
        return (ka) (Object) param0;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        ll var11_ref = null;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        gca var12_ref_gca = null;
        int var13_int = 0;
        gca var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        var21 = TombRacer.field_G ? 1 : 0;
        var8_int = param1.length;
        if (0 != param0) {
          if (param0 == 1) {
            param3 = param3 << 4;
            param2 = param2 << 4;
            param4 = param4 << 4;
            var9 = 0;
            L0: while (true) {
              if (var8_int <= var9) {
                return;
              } else {
                L1: {
                  var10 = param1[var9];
                  if (((gja) this).field_D.length > var10) {
                    var11 = ((gja) this).field_D[var10];
                    var12 = 0;
                    L2: while (true) {
                      if (~var12 <= ~var11.length) {
                        break L1;
                      } else {
                        var13_int = var11[var12];
                        ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] + param2;
                        ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] + param3;
                        ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] + param4;
                        var12++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                var9++;
                continue L0;
              }
            }
          } else {
            if (2 != param0) {
              if (param0 == 3) {
                var9 = 0;
                L3: while (true) {
                  if (var8_int <= var9) {
                    return;
                  } else {
                    L4: {
                      var10 = param1[var9];
                      if (~var10 > ~((gja) this).field_D.length) {
                        var11 = ((gja) this).field_D[var10];
                        var12 = 0;
                        L5: while (true) {
                          if (~var12 <= ~var11.length) {
                            break L4;
                          } else {
                            var13_int = var11[var12];
                            ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] - ina.field_a;
                            ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] - pb.field_k;
                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] - uu.field_c;
                            ((gja) this).field_Z[var13_int] = param2 * ((gja) this).field_Z[var13_int] >> 7;
                            ((gja) this).field_r[var13_int] = param3 * ((gja) this).field_r[var13_int] >> 7;
                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * param4 >> 7;
                            ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] + ina.field_a;
                            ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] + pb.field_k;
                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] + uu.field_c;
                            var12++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                if (param0 != 5) {
                  if (param0 == 7) {
                    L6: {
                      if (null != ((gja) this).field_q) {
                        var9 = 0;
                        var10 = 0;
                        L7: while (true) {
                          if (~var10 <= ~var8_int) {
                            if (var9 == 0) {
                              break L6;
                            } else {
                              L8: {
                                if (((gja) this).field_u != null) {
                                  var10 = 0;
                                  L9: while (true) {
                                    if (~var10 <= ~((gja) this).field_L) {
                                      break L8;
                                    } else {
                                      var11_ref = ((gja) this).field_u[var10];
                                      var12_ref_gca = ((gja) this).field_nb[var10];
                                      var12_ref_gca.field_h = 16777215 & cla.field_m[((gja) this).field_P[var11_ref.field_m] & 65535] | var12_ref_gca.field_h & -16777216;
                                      var10++;
                                      continue L9;
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              int discarded$2 = 0;
                              this.e();
                              break L6;
                            }
                          } else {
                            L10: {
                              var11_int = param1[var10];
                              if (((gja) this).field_q.length > var11_int) {
                                var12_ref_int__ = ((gja) this).field_q[var11_int];
                                var13_int = 0;
                                L11: while (true) {
                                  if (~var13_int <= ~var12_ref_int__.length) {
                                    L12: {
                                      stackOut_146_0 = var9;
                                      stackIn_148_0 = stackOut_146_0;
                                      stackIn_147_0 = stackOut_146_0;
                                      if (var12_ref_int__.length <= 0) {
                                        stackOut_148_0 = stackIn_148_0;
                                        stackOut_148_1 = 0;
                                        stackIn_149_0 = stackOut_148_0;
                                        stackIn_149_1 = stackOut_148_1;
                                        break L12;
                                      } else {
                                        stackOut_147_0 = stackIn_147_0;
                                        stackOut_147_1 = 1;
                                        stackIn_149_0 = stackOut_147_0;
                                        stackIn_149_1 = stackOut_147_1;
                                        break L12;
                                      }
                                    }
                                    var9 = stackIn_149_0 | stackIn_149_1;
                                    break L10;
                                  } else {
                                    L13: {
                                      var14 = var12_ref_int__[var13_int];
                                      var15 = ((gja) this).field_P[var14] & 65535;
                                      var16 = 63 & var15 >> 10;
                                      var17 = (var15 & 1004) >> 7;
                                      var18 = 127 & var15;
                                      var16 = 63 & param2 + var16;
                                      var17 = var17 + param3 / 4;
                                      if (0 <= var17) {
                                        if (var17 <= 7) {
                                          break L13;
                                        } else {
                                          var17 = 7;
                                          break L13;
                                        }
                                      } else {
                                        var17 = 0;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      var18 = var18 + param4;
                                      if (0 <= var18) {
                                        if (var18 > 127) {
                                          var18 = 127;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        var18 = 0;
                                        break L14;
                                      }
                                    }
                                    ((gja) this).field_P[var14] = (short)fh.a(fh.a(var17 << 7, var16 << 10), var18);
                                    var13_int++;
                                    continue L11;
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                            var10++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    return;
                  } else {
                    if (param0 == 8) {
                      L15: {
                        if (((gja) this).field_mb == null) {
                          break L15;
                        } else {
                          var9 = 0;
                          L16: while (true) {
                            if (~var9 <= ~var8_int) {
                              break L15;
                            } else {
                              L17: {
                                var10 = param1[var9];
                                if (~((gja) this).field_mb.length >= ~var10) {
                                  break L17;
                                } else {
                                  var11 = ((gja) this).field_mb[var10];
                                  var12 = 0;
                                  L18: while (true) {
                                    if (~var12 <= ~var11.length) {
                                      break L17;
                                    } else {
                                      var13 = ((gja) this).field_nb[var11[var12]];
                                      var13.field_b = var13.field_b + param3;
                                      var13.field_e = var13.field_e + param2;
                                      var12++;
                                      continue L18;
                                    }
                                  }
                                }
                              }
                              var9++;
                              continue L16;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      if (10 == param0) {
                        L19: {
                          if (((gja) this).field_mb != null) {
                            var9 = 0;
                            L20: while (true) {
                              if (var8_int <= var9) {
                                break L19;
                              } else {
                                L21: {
                                  var10 = param1[var9];
                                  if (~var10 <= ~((gja) this).field_mb.length) {
                                    break L21;
                                  } else {
                                    var11 = ((gja) this).field_mb[var10];
                                    var12 = 0;
                                    L22: while (true) {
                                      if (~var11.length >= ~var12) {
                                        break L21;
                                      } else {
                                        var13 = ((gja) this).field_nb[var11[var12]];
                                        var13.field_k = param3 * var13.field_k >> 7;
                                        var13.field_m = var13.field_m * param2 >> 7;
                                        var12++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                                var9++;
                                continue L20;
                              }
                            }
                          } else {
                            break L19;
                          }
                        }
                        return;
                      } else {
                        if (9 != param0) {
                          return;
                        } else {
                          L23: {
                            if (null == ((gja) this).field_mb) {
                              break L23;
                            } else {
                              var9 = 0;
                              L24: while (true) {
                                if (var8_int <= var9) {
                                  break L23;
                                } else {
                                  L25: {
                                    var10 = param1[var9];
                                    if (~((gja) this).field_mb.length < ~var10) {
                                      var11 = ((gja) this).field_mb[var10];
                                      var12 = 0;
                                      L26: while (true) {
                                        if (~var12 <= ~var11.length) {
                                          break L25;
                                        } else {
                                          var13 = ((gja) this).field_nb[var11[var12]];
                                          var13.field_c = 16383 & var13.field_c - -param2;
                                          var12++;
                                          continue L26;
                                        }
                                      }
                                    } else {
                                      break L25;
                                    }
                                  }
                                  var9++;
                                  continue L24;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L27: {
                    if (((gja) this).field_q != null) {
                      var9 = 0;
                      var10 = 0;
                      L28: while (true) {
                        if (var8_int <= var10) {
                          if (var9 == 0) {
                            break L27;
                          } else {
                            L29: {
                              if (((gja) this).field_u == null) {
                                break L29;
                              } else {
                                var10 = 0;
                                L30: while (true) {
                                  if (~var10 <= ~((gja) this).field_L) {
                                    break L29;
                                  } else {
                                    var11_ref = ((gja) this).field_u[var10];
                                    var12_ref_gca = ((gja) this).field_nb[var10];
                                    var12_ref_gca.field_h = 255 - (255 & ((gja) this).field_C[var11_ref.field_m]) << 24 | 16777215 & var12_ref_gca.field_h;
                                    var10++;
                                    continue L30;
                                  }
                                }
                              }
                            }
                            int discarded$3 = 0;
                            this.e();
                            break L27;
                          }
                        } else {
                          L31: {
                            var11_int = param1[var10];
                            if (var11_int < ((gja) this).field_q.length) {
                              var12_ref_int__ = ((gja) this).field_q[var11_int];
                              var13_int = 0;
                              L32: while (true) {
                                if (~var12_ref_int__.length >= ~var13_int) {
                                  L33: {
                                    stackOut_109_0 = var9;
                                    stackIn_111_0 = stackOut_109_0;
                                    stackIn_110_0 = stackOut_109_0;
                                    if (var12_ref_int__.length <= 0) {
                                      stackOut_111_0 = stackIn_111_0;
                                      stackOut_111_1 = 0;
                                      stackIn_112_0 = stackOut_111_0;
                                      stackIn_112_1 = stackOut_111_1;
                                      break L33;
                                    } else {
                                      stackOut_110_0 = stackIn_110_0;
                                      stackOut_110_1 = 1;
                                      stackIn_112_0 = stackOut_110_0;
                                      stackIn_112_1 = stackOut_110_1;
                                      break L33;
                                    }
                                  }
                                  var9 = stackIn_112_0 | stackIn_112_1;
                                  break L31;
                                } else {
                                  L34: {
                                    var14 = var12_ref_int__[var13_int];
                                    var15 = 8 * param2 + (((gja) this).field_C[var14] & 255);
                                    if (var15 < 0) {
                                      var15 = 0;
                                      break L34;
                                    } else {
                                      if (var15 > 255) {
                                        var15 = 255;
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                  ((gja) this).field_C[var14] = (byte)var15;
                                  var13_int++;
                                  continue L32;
                                }
                              }
                            } else {
                              break L31;
                            }
                          }
                          var10++;
                          continue L28;
                        }
                      }
                    } else {
                      break L27;
                    }
                  }
                  return;
                }
              }
            } else {
              var9 = 0;
              L35: while (true) {
                if (var8_int <= var9) {
                  L36: {
                    if (param6) {
                      var9 = 0;
                      L37: while (true) {
                        if (~var9 <= ~var8_int) {
                          this.d((byte) 28);
                          break L36;
                        } else {
                          L38: {
                            var10 = param1[var9];
                            if (~var10 > ~((gja) this).field_D.length) {
                              var11 = ((gja) this).field_D[var10];
                              var12 = 0;
                              L39: while (true) {
                                if (var11.length <= var12) {
                                  break L38;
                                } else {
                                  var13_int = var11[var12];
                                  var14 = ((gja) this).field_J[var13_int];
                                  var15 = ((gja) this).field_J[1 + var13_int];
                                  var16 = var14;
                                  L40: while (true) {
                                    L41: {
                                      if (var16 >= var15) {
                                        break L41;
                                      } else {
                                        var17 = ((gja) this).field_db[var16] + -1;
                                        if (-1 != var17) {
                                          L42: {
                                            if (param4 == 0) {
                                              break L42;
                                            } else {
                                              var18 = qu.field_b[param4];
                                              var19 = qu.field_d[param4];
                                              var20 = 16383 + (((gja) this).field_lb[var17] * var19 + ((gja) this).field_m[var17] * var18) >> 14;
                                              ((gja) this).field_m[var17] = (short)(-(var18 * ((gja) this).field_lb[var17]) + ((gja) this).field_m[var17] * var19 - -16383 >> 14);
                                              ((gja) this).field_lb[var17] = (short)var20;
                                              break L42;
                                            }
                                          }
                                          L43: {
                                            if (param2 == 0) {
                                              break L43;
                                            } else {
                                              var18 = qu.field_b[param2];
                                              var19 = qu.field_d[param2];
                                              var20 = var19 * ((gja) this).field_m[var17] + (-(((gja) this).field_p[var17] * var18) - -16383) >> 14;
                                              ((gja) this).field_p[var17] = (short)(((gja) this).field_m[var17] * var18 + (var19 * ((gja) this).field_p[var17] - -16383) >> 14);
                                              ((gja) this).field_m[var17] = (short)var20;
                                              break L43;
                                            }
                                          }
                                          L44: {
                                            if (param3 == 0) {
                                              break L44;
                                            } else {
                                              var18 = qu.field_b[param3];
                                              var19 = qu.field_d[param3];
                                              var20 = var18 * ((gja) this).field_p[var17] - (-(((gja) this).field_lb[var17] * var19) + -16383) >> 14;
                                              ((gja) this).field_p[var17] = (short)(-(((gja) this).field_lb[var17] * var18) + (((gja) this).field_p[var17] * var19 - -16383) >> 14);
                                              ((gja) this).field_lb[var17] = (short)var20;
                                              break L44;
                                            }
                                          }
                                          var16++;
                                          continue L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                    var12++;
                                    continue L39;
                                  }
                                }
                              }
                            } else {
                              break L38;
                            }
                          }
                          var9++;
                          continue L37;
                        }
                      }
                    } else {
                      break L36;
                    }
                  }
                  return;
                } else {
                  L45: {
                    var10 = param1[var9];
                    if (~var10 <= ~((gja) this).field_D.length) {
                      break L45;
                    } else {
                      var11 = ((gja) this).field_D[var10];
                      if ((param5 & 1) == 0) {
                        var12 = 0;
                        L46: while (true) {
                          if (var11.length <= var12) {
                            break L45;
                          } else {
                            L47: {
                              var13_int = var11[var12];
                              ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] - ina.field_a;
                              ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] - pb.field_k;
                              ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] - uu.field_c;
                              if (param4 == 0) {
                                break L47;
                              } else {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = 16383 + (((gja) this).field_r[var13_int] * var14 + ((gja) this).field_Z[var13_int] * var15) >> 14;
                                ((gja) this).field_r[var13_int] = -(var14 * ((gja) this).field_Z[var13_int]) + ((gja) this).field_r[var13_int] * var15 + 16383 >> 14;
                                ((gja) this).field_Z[var13_int] = var16;
                                break L47;
                              }
                            }
                            L48: {
                              if (param2 == 0) {
                                break L48;
                              } else {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = 16383 + -(var14 * ((gja) this).field_l[var13_int]) + var15 * ((gja) this).field_r[var13_int] >> 14;
                                ((gja) this).field_l[var13_int] = 16383 + var14 * ((gja) this).field_r[var13_int] - -(((gja) this).field_l[var13_int] * var15) >> 14;
                                ((gja) this).field_r[var13_int] = var16;
                                break L48;
                              }
                            }
                            L49: {
                              if (param3 != 0) {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = 16383 + var15 * ((gja) this).field_Z[var13_int] + ((gja) this).field_l[var13_int] * var14 >> 14;
                                ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * var15 + (-(((gja) this).field_Z[var13_int] * var14) - -16383) >> 14;
                                ((gja) this).field_Z[var13_int] = var16;
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                            ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] + ina.field_a;
                            ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] + pb.field_k;
                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] + uu.field_c;
                            var12++;
                            continue L46;
                          }
                        }
                      } else {
                        var12 = 0;
                        L50: while (true) {
                          if (~var12 <= ~var11.length) {
                            break L45;
                          } else {
                            L51: {
                              var13_int = var11[var12];
                              ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] - ina.field_a;
                              ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] - pb.field_k;
                              ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] - uu.field_c;
                              if (param2 != 0) {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = -(((gja) this).field_l[var13_int] * var14) + (((gja) this).field_r[var13_int] * var15 - -16383) >> 14;
                                ((gja) this).field_l[var13_int] = ((gja) this).field_r[var13_int] * var14 + (var15 * ((gja) this).field_l[var13_int] + 16383) >> 14;
                                ((gja) this).field_r[var13_int] = var16;
                                break L51;
                              } else {
                                break L51;
                              }
                            }
                            L52: {
                              if (param4 != 0) {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = 16383 + var14 * ((gja) this).field_r[var13_int] + ((gja) this).field_Z[var13_int] * var15 >> 14;
                                ((gja) this).field_r[var13_int] = 16383 + (-(((gja) this).field_Z[var13_int] * var14) + var15 * ((gja) this).field_r[var13_int]) >> 14;
                                ((gja) this).field_Z[var13_int] = var16;
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            L53: {
                              if (param3 != 0) {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = 16383 + var14 * ((gja) this).field_l[var13_int] - -(var15 * ((gja) this).field_Z[var13_int]) >> 14;
                                ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * var15 - (((gja) this).field_Z[var13_int] * var14 - 16383) >> 14;
                                ((gja) this).field_Z[var13_int] = var16;
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                            ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] + ina.field_a;
                            ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] + pb.field_k;
                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] + uu.field_c;
                            var12++;
                            continue L50;
                          }
                        }
                      }
                    }
                  }
                  var9++;
                  continue L35;
                }
              }
            }
          }
        } else {
          param3 = param3 << 4;
          param2 = param2 << 4;
          param4 = param4 << 4;
          ina.field_a = 0;
          pb.field_k = 0;
          uu.field_c = 0;
          var9 = 0;
          var10 = 0;
          L54: while (true) {
            if (var10 >= var8_int) {
              L55: {
                if (0 < var9) {
                  uu.field_c = uu.field_c / var9 - -param4;
                  ina.field_a = ina.field_a / var9 + param2;
                  pb.field_k = param3 + pb.field_k / var9;
                  break L55;
                } else {
                  ina.field_a = param2;
                  pb.field_k = param3;
                  uu.field_c = param4;
                  break L55;
                }
              }
              return;
            } else {
              L56: {
                var11_int = param1[var10];
                if (var11_int >= ((gja) this).field_D.length) {
                  break L56;
                } else {
                  var12_ref_int__ = ((gja) this).field_D[var11_int];
                  var13_int = 0;
                  L57: while (true) {
                    if (~var13_int <= ~var12_ref_int__.length) {
                      break L56;
                    } else {
                      var14 = var12_ref_int__[var13_int];
                      ina.field_a = ina.field_a + ((gja) this).field_Z[var14];
                      pb.field_k = pb.field_k + ((gja) this).field_r[var14];
                      var9++;
                      uu.field_c = uu.field_c + ((gja) this).field_l[var14];
                      var13_int++;
                      continue L57;
                    }
                  }
                }
              }
              var10++;
              continue L54;
            }
          }
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 85 / ((param0 - -81) / 40);
              if (null == ((gja) this).field_ib) {
                break L1;
              } else {
                ((gja) this).field_ib.field_h = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.J(" + param0 + 41);
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((gja) this).field_ib != null) {
                ((gja) this).field_ib.c(-5941);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == ((gja) this).field_d) {
                break L2;
              } else {
                ((gja) this).field_d.c(-5941);
                break L2;
              }
            }
            L3: {
              if (((gja) this).field_E == null) {
                break L3;
              } else {
                ((gja) this).field_E.c(-5941);
                break L3;
              }
            }
            L4: {
              if (null == ((gja) this).field_O) {
                break L4;
              } else {
                ((gja) this).field_O.c(-5941);
                break L4;
              }
            }
            L5: {
              if (null == ((gja) this).field_g) {
                break L5;
              } else {
                ((gja) this).field_g.a(-17253);
                break L5;
              }
            }
            L6: {
              if (param0 >= 109) {
                break L6;
              } else {
                ((gja) this).field_mb = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.F(" + param0 + 41);
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        ll var12_ref = null;
        int var13 = 0;
        int[] var13_ref_int__ = null;
        gca var13_ref_gca = null;
        int var14_int = 0;
        gca var14 = null;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        int var35_int = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        Object stackIn_156_0 = null;
        int stackIn_188_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        Object stackIn_194_0 = null;
        Object stackIn_194_1 = null;
        int stackIn_228_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_230_1 = 0;
        Object stackIn_234_0 = null;
        Object stackIn_234_1 = null;
        Object stackOut_155_0 = null;
        Object stackOut_233_0 = null;
        Object stackOut_233_1 = null;
        int stackOut_227_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_229_1 = 0;
        int stackOut_228_0 = 0;
        int stackOut_228_1 = 0;
        Object stackOut_193_0 = null;
        Object stackOut_193_1 = null;
        int stackOut_187_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_189_1 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var47 = TombRacer.field_G ? 1 : 0;
        var9_int = param1.length;
        if (0 != param0) {
          if (param0 != 1) {
            if (param0 == 2) {
              L0: {
                if (param7 != null) {
                  var10 = param7[9] << 4;
                  var11 = param7[10] << 4;
                  var12_int = param7[11] << 4;
                  var13 = param7[12] << 4;
                  var14_int = param7[13] << 4;
                  var15 = param7[14] << 4;
                  var16_ref_int__ = new int[9];
                  var17 = qu.field_d[param2];
                  var18 = qu.field_b[param2];
                  var19 = qu.field_d[param3];
                  var20 = qu.field_b[param3];
                  var21 = qu.field_d[param4];
                  var22 = qu.field_b[param4];
                  var23 = 8192 + var18 * var21 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var16_ref_int__[8] = var17 * var19 - -8192 >> 14;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[6] = var24 * var19 + (var21 * -var20 - -8192) >> 14;
                  var16_ref_int__[3] = 8192 + var22 * var17 >> 14;
                  var16_ref_int__[1] = 8192 + var20 * var23 + var22 * -var19 >> 14;
                  var16_ref_int__[7] = var22 * var20 - -(var19 * var23) - -8192 >> 14;
                  var16_ref_int__[2] = var17 * var20 + 8192 >> 14;
                  var16_ref_int__[4] = var17 * var21 + 8192 >> 14;
                  var16_ref_int__[0] = 8192 + (var21 * var19 - -(var20 * var24)) >> 14;
                  var25_int = 8192 + (var16_ref_int__[2] * -uu.field_c + -ina.field_a * var16_ref_int__[0]) + var16_ref_int__[1] * -pb.field_k >> 14;
                  var26 = 8192 + (var16_ref_int__[3] * -ina.field_a - (-(var16_ref_int__[4] * -pb.field_k) - -uu.field_c * var16_ref_int__[5])) >> 14;
                  var27 = 8192 + var16_ref_int__[8] * -uu.field_c + (-pb.field_k * var16_ref_int__[7] + var16_ref_int__[6] * -ina.field_a) >> 14;
                  var28 = var25_int + ina.field_a;
                  var29_int = pb.field_k + var26;
                  var30 = var27 + uu.field_c;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L1: while (true) {
                    if (3 <= var32) {
                      var32 = 8192 + var16_ref_int__[2] * var15 + (var13 * var16_ref_int__[0] + var14_int * var16_ref_int__[1]) >> 14;
                      var33 = var15 * var16_ref_int__[5] + (var14_int * var16_ref_int__[4] + var16_ref_int__[3] * var13) + 8192 >> 14;
                      var32 = var32 + var28;
                      var34 = var15 * var16_ref_int__[8] + var13 * var16_ref_int__[6] + var16_ref_int__[7] * var14_int + 8192 >> 14;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var35 = new int[9];
                      var36 = 0;
                      L2: while (true) {
                        if (3 <= var36) {
                          var36 = 8192 + var34 * param7[2] + (param7[0] * var32 + var33 * param7[1]) >> 14;
                          var37 = var33 * param7[4] + var32 * param7[3] - (-(param7[5] * var34) - 8192) >> 14;
                          var38 = param7[8] * var34 + (param7[6] * var32 + param7[7] * var33 - -8192) >> 14;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var38 + var12_int;
                          var39 = 0;
                          L3: while (true) {
                            if (~var39 <= ~var9_int) {
                              break L0;
                            } else {
                              L4: {
                                var40 = param1[var39];
                                if (~var40 > ~((gja) this).field_D.length) {
                                  var41 = ((gja) this).field_D[var40];
                                  var42 = 0;
                                  L5: while (true) {
                                    if (var42 >= var41.length) {
                                      break L4;
                                    } else {
                                      L6: {
                                        L7: {
                                          var43 = var41[var42];
                                          if (((gja) this).field_hb == null) {
                                            break L7;
                                          } else {
                                            if ((param6 & ((gja) this).field_hb[var43]) == 0) {
                                              break L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        var44 = ((gja) this).field_Z[var43] * var35[0] - -(var35[1] * ((gja) this).field_r[var43]) - (-(var35[2] * ((gja) this).field_l[var43]) - 8192) >> 14;
                                        var45 = var35[3] * ((gja) this).field_Z[var43] - -(((gja) this).field_r[var43] * var35[4]) - (-(((gja) this).field_l[var43] * var35[5]) - 8192) >> 14;
                                        var45 = var45 + var37;
                                        var46 = 8192 + ((gja) this).field_l[var43] * var35[8] + (var35[7] * ((gja) this).field_r[var43] + var35[6] * ((gja) this).field_Z[var43]) >> 14;
                                        var44 = var44 + var36;
                                        ((gja) this).field_Z[var43] = var44;
                                        var46 = var46 + var38;
                                        ((gja) this).field_r[var43] = var45;
                                        ((gja) this).field_l[var43] = var46;
                                        break L6;
                                      }
                                      var42++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                              var39++;
                              continue L3;
                            }
                          }
                        } else {
                          var37 = 0;
                          L8: while (true) {
                            if (var37 >= 3) {
                              var36++;
                              continue L2;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L9: while (true) {
                                if (3 <= var39) {
                                  var35[var36 * 3 - -var37] = var38 - -8192 >> 14;
                                  var37++;
                                  continue L8;
                                } else {
                                  var38 = var38 + var31_ref_int__[3 * var39 + var37] * param7[3 * var36 - -var39];
                                  var39++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L10: while (true) {
                        if (var33 >= 3) {
                          var32++;
                          continue L1;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L11: while (true) {
                            if (var35_int >= 3) {
                              var31_ref_int__[3 * var32 + var33] = var34 + 8192 >> 14;
                              var33++;
                              continue L10;
                            } else {
                              var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var35_int + 3 * var33];
                              var35_int++;
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L12: while (true) {
                    if (var10 >= var9_int) {
                      if (param5) {
                        var10 = 0;
                        L13: while (true) {
                          if (~var9_int >= ~var10) {
                            this.d((byte) 123);
                            break L0;
                          } else {
                            L14: {
                              var11 = param1[var10];
                              if (var11 >= ((gja) this).field_D.length) {
                                break L14;
                              } else {
                                var12 = ((gja) this).field_D[var11];
                                var13 = 0;
                                L15: while (true) {
                                  if (var13 >= var12.length) {
                                    break L14;
                                  } else {
                                    L16: {
                                      L17: {
                                        var14_int = var12[var13];
                                        if (((gja) this).field_hb == null) {
                                          break L17;
                                        } else {
                                          if ((((gja) this).field_hb[var14_int] & param6) == 0) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      var15 = ((gja) this).field_J[var14_int];
                                      var16 = ((gja) this).field_J[1 + var14_int];
                                      var17 = var15;
                                      L18: while (true) {
                                        if (~var16 >= ~var17) {
                                          break L16;
                                        } else {
                                          var18 = ((gja) this).field_db[var17] - 1;
                                          if (-1 != var18) {
                                            L19: {
                                              if (0 == param4) {
                                                break L19;
                                              } else {
                                                var19 = qu.field_b[param4];
                                                var20 = qu.field_d[param4];
                                                var21 = var19 * ((gja) this).field_m[var18] + ((gja) this).field_lb[var18] * var20 + 16383 >> 14;
                                                ((gja) this).field_m[var18] = (short)(-(((gja) this).field_lb[var18] * var19) + ((gja) this).field_m[var18] * var20 - -16383 >> 14);
                                                ((gja) this).field_lb[var18] = (short)var21;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              if (param2 != 0) {
                                                var19 = qu.field_b[param2];
                                                var20 = qu.field_d[param2];
                                                var21 = var20 * ((gja) this).field_m[var18] + -(((gja) this).field_p[var18] * var19) + 16383 >> 14;
                                                ((gja) this).field_p[var18] = (short)(16383 + (((gja) this).field_m[var18] * var19 + var20 * ((gja) this).field_p[var18]) >> 14);
                                                ((gja) this).field_m[var18] = (short)var21;
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              if (0 == param3) {
                                                break L21;
                                              } else {
                                                var19 = qu.field_b[param3];
                                                var20 = qu.field_d[param3];
                                                var21 = 16383 + var19 * ((gja) this).field_p[var18] - -(((gja) this).field_lb[var18] * var20) >> 14;
                                                ((gja) this).field_p[var18] = (short)(16383 + ((gja) this).field_p[var18] * var20 + -(((gja) this).field_lb[var18] * var19) >> 14);
                                                ((gja) this).field_lb[var18] = (short)var21;
                                                break L21;
                                              }
                                            }
                                            var17++;
                                            continue L18;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                    var13++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L13;
                          }
                        }
                      } else {
                        break L0;
                      }
                    } else {
                      L22: {
                        var11 = param1[var10];
                        if (var11 >= ((gja) this).field_D.length) {
                          break L22;
                        } else {
                          var12 = ((gja) this).field_D[var11];
                          var13 = 0;
                          L23: while (true) {
                            if (var12.length <= var13) {
                              break L22;
                            } else {
                              L24: {
                                L25: {
                                  var14_int = var12[var13];
                                  if (null == ((gja) this).field_hb) {
                                    break L25;
                                  } else {
                                    if ((((gja) this).field_hb[var14_int] & param6) == 0) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                L26: {
                                  ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] - ina.field_a;
                                  ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] - pb.field_k;
                                  ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] - uu.field_c;
                                  if (0 != param4) {
                                    var15 = qu.field_b[param4];
                                    var16 = qu.field_d[param4];
                                    var17 = var16 * ((gja) this).field_Z[var14_int] + var15 * ((gja) this).field_r[var14_int] - -16383 >> 14;
                                    ((gja) this).field_r[var14_int] = 16383 + var16 * ((gja) this).field_r[var14_int] + -(((gja) this).field_Z[var14_int] * var15) >> 14;
                                    ((gja) this).field_Z[var14_int] = var17;
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                                L27: {
                                  if (param2 == 0) {
                                    break L27;
                                  } else {
                                    var15 = qu.field_b[param2];
                                    var16 = qu.field_d[param2];
                                    var17 = 16383 + (var16 * ((gja) this).field_r[var14_int] - var15 * ((gja) this).field_l[var14_int]) >> 14;
                                    ((gja) this).field_l[var14_int] = var16 * ((gja) this).field_l[var14_int] + var15 * ((gja) this).field_r[var14_int] - -16383 >> 14;
                                    ((gja) this).field_r[var14_int] = var17;
                                    break L27;
                                  }
                                }
                                L28: {
                                  if (param3 != 0) {
                                    var15 = qu.field_b[param3];
                                    var16 = qu.field_d[param3];
                                    var17 = var16 * ((gja) this).field_Z[var14_int] + var15 * ((gja) this).field_l[var14_int] - -16383 >> 14;
                                    ((gja) this).field_l[var14_int] = 16383 + var16 * ((gja) this).field_l[var14_int] + -(var15 * ((gja) this).field_Z[var14_int]) >> 14;
                                    ((gja) this).field_Z[var14_int] = var17;
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] + ina.field_a;
                                ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] + pb.field_k;
                                ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] + uu.field_c;
                                break L24;
                              }
                              var13++;
                              continue L23;
                            }
                          }
                        }
                      }
                      var10++;
                      continue L12;
                    }
                  }
                }
              }
              return;
            } else {
              if (3 == param0) {
                L29: {
                  if (param7 != null) {
                    var10 = param7[9] << 4;
                    var11 = param7[10] << 4;
                    var12_int = param7[11] << 4;
                    var13 = param7[12] << 4;
                    var14_int = param7[13] << 4;
                    var15 = param7[14] << 4;
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = 8192 + var16 * -ina.field_a >> 14;
                    var20 = 8192 + -pb.field_k * var17 >> 14;
                    var21 = 8192 + var18 * -uu.field_c >> 14;
                    var22 = ina.field_a + var19;
                    var23 = pb.field_k + var20;
                    var24 = uu.field_c + var21;
                    var25 = new int[9];
                    var25[2] = var16 * param7[6] - -8192 >> 14;
                    var25[0] = var16 * param7[0] + 8192 >> 14;
                    var25[1] = 8192 + param7[3] * var16 >> 14;
                    var25[6] = param7[2] * var18 - -8192 >> 14;
                    var25[4] = 8192 + var17 * param7[4] >> 14;
                    var25[5] = 8192 + param7[7] * var17 >> 14;
                    var25[3] = 8192 + param7[1] * var17 >> 14;
                    var25[7] = param7[5] * var18 + 8192 >> 14;
                    var25[8] = var18 * param7[8] + 8192 >> 14;
                    var26 = 8192 + var13 * var16 >> 14;
                    var27 = var14_int * var17 + 8192 >> 14;
                    var26 = var26 + var22;
                    var28 = var18 * var15 + 8192 >> 14;
                    var27 = var27 + var23;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    L30: while (true) {
                      if (var30 >= 3) {
                        var30 = 8192 + (var27 * param7[1] + param7[0] * var26) + param7[2] * var28 >> 14;
                        var31 = 8192 + var28 * param7[5] + (var26 * param7[3] - -(param7[4] * var27)) >> 14;
                        var30 = var30 + var10;
                        var32 = param7[7] * var27 + (param7[6] * var26 - (-(param7[8] * var28) + -8192)) >> 14;
                        var31 = var31 + var11;
                        var32 = var32 + var12_int;
                        var33 = 0;
                        L31: while (true) {
                          if (var33 >= var9_int) {
                            break L29;
                          } else {
                            L32: {
                              var34 = param1[var33];
                              if (~var34 <= ~((gja) this).field_D.length) {
                                break L32;
                              } else {
                                stackOut_155_0 = this;
                                stackIn_156_0 = stackOut_155_0;
                                var35 = ((gja) this).field_D[var34];
                                var36 = 0;
                                L33: while (true) {
                                  if (~var36 <= ~var35.length) {
                                    break L32;
                                  } else {
                                    L34: {
                                      L35: {
                                        var37 = var35[var36];
                                        if (((gja) this).field_hb == null) {
                                          break L35;
                                        } else {
                                          if ((((gja) this).field_hb[var37] & param6) == 0) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      var38 = ((gja) this).field_r[var37] * var29[1] + var29[0] * ((gja) this).field_Z[var37] + var29[2] * ((gja) this).field_l[var37] - -8192 >> 14;
                                      var39 = ((gja) this).field_r[var37] * var29[4] + var29[3] * ((gja) this).field_Z[var37] + (var29[5] * ((gja) this).field_l[var37] + 8192) >> 14;
                                      var39 = var39 + var31;
                                      var38 = var38 + var30;
                                      var40 = 8192 + var29[8] * ((gja) this).field_l[var37] + ((gja) this).field_Z[var37] * var29[6] + var29[7] * ((gja) this).field_r[var37] >> 14;
                                      var40 = var40 + var32;
                                      ((gja) this).field_Z[var37] = var38;
                                      ((gja) this).field_r[var37] = var39;
                                      ((gja) this).field_l[var37] = var40;
                                      break L34;
                                    }
                                    var36++;
                                    continue L33;
                                  }
                                }
                              }
                            }
                            var33++;
                            continue L31;
                          }
                        }
                      } else {
                        var31 = 0;
                        L36: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L30;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L37: while (true) {
                              if (var33 >= 3) {
                                var29[3 * var30 - -var31] = 8192 + var32 >> 14;
                                var31++;
                                continue L36;
                              } else {
                                var32 = var32 + param7[var33 + var30 * 3] * var25[var33 * 3 + var31];
                                var33++;
                                continue L37;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var10 = 0;
                    L38: while (true) {
                      if (~var9_int >= ~var10) {
                        break L29;
                      } else {
                        L39: {
                          var11 = param1[var10];
                          if (~var11 > ~((gja) this).field_D.length) {
                            var12 = ((gja) this).field_D[var11];
                            var13 = 0;
                            L40: while (true) {
                              if (~var13 <= ~var12.length) {
                                break L39;
                              } else {
                                L41: {
                                  L42: {
                                    var14_int = var12[var13];
                                    if (((gja) this).field_hb == null) {
                                      break L42;
                                    } else {
                                      if ((param6 & ((gja) this).field_hb[var14_int]) == 0) {
                                        break L41;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] - ina.field_a;
                                  ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] - pb.field_k;
                                  ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] - uu.field_c;
                                  ((gja) this).field_Z[var14_int] = param2 * ((gja) this).field_Z[var14_int] >> 7;
                                  ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] * param3 >> 7;
                                  ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] * param4 >> 7;
                                  ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] + ina.field_a;
                                  ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] + pb.field_k;
                                  ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] + uu.field_c;
                                  break L41;
                                }
                                var13++;
                                continue L40;
                              }
                            }
                          } else {
                            break L39;
                          }
                        }
                        var10++;
                        continue L38;
                      }
                    }
                  }
                }
                return;
              } else {
                if (param0 != 5) {
                  if (param0 != 7) {
                    if (param0 == 8) {
                      L43: {
                        if (null == ((gja) this).field_mb) {
                          break L43;
                        } else {
                          var10 = 0;
                          L44: while (true) {
                            if (var10 >= var9_int) {
                              break L43;
                            } else {
                              L45: {
                                var11 = param1[var10];
                                if (((gja) this).field_mb.length > var11) {
                                  var12 = ((gja) this).field_mb[var11];
                                  var13 = 0;
                                  L46: while (true) {
                                    if (var13 >= var12.length) {
                                      break L45;
                                    } else {
                                      var14 = ((gja) this).field_nb[var12[var13]];
                                      var14.field_b = var14.field_b + param3;
                                      var14.field_e = var14.field_e + param2;
                                      var13++;
                                      continue L46;
                                    }
                                  }
                                } else {
                                  break L45;
                                }
                              }
                              var10++;
                              continue L44;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      if (param0 == 10) {
                        L47: {
                          if (null != ((gja) this).field_mb) {
                            var10 = 0;
                            L48: while (true) {
                              if (~var10 <= ~var9_int) {
                                break L47;
                              } else {
                                L49: {
                                  var11 = param1[var10];
                                  if (~((gja) this).field_mb.length >= ~var11) {
                                    break L49;
                                  } else {
                                    var12 = ((gja) this).field_mb[var11];
                                    var13 = 0;
                                    L50: while (true) {
                                      if (~var12.length >= ~var13) {
                                        break L49;
                                      } else {
                                        var14 = ((gja) this).field_nb[var12[var13]];
                                        var14.field_m = var14.field_m * param2 >> 7;
                                        var14.field_k = var14.field_k * param3 >> 7;
                                        var13++;
                                        continue L50;
                                      }
                                    }
                                  }
                                }
                                var10++;
                                continue L48;
                              }
                            }
                          } else {
                            break L47;
                          }
                        }
                        return;
                      } else {
                        if (param0 == 9) {
                          L51: {
                            if (null == ((gja) this).field_mb) {
                              break L51;
                            } else {
                              var10 = 0;
                              L52: while (true) {
                                if (var10 >= var9_int) {
                                  break L51;
                                } else {
                                  L53: {
                                    var11 = param1[var10];
                                    if (((gja) this).field_mb.length <= var11) {
                                      break L53;
                                    } else {
                                      var12 = ((gja) this).field_mb[var11];
                                      var13 = 0;
                                      L54: while (true) {
                                        if (var12.length <= var13) {
                                          break L53;
                                        } else {
                                          var14 = ((gja) this).field_nb[var12[var13]];
                                          var14.field_c = 16383 & param2 + var14.field_c;
                                          var13++;
                                          continue L54;
                                        }
                                      }
                                    }
                                  }
                                  var10++;
                                  continue L52;
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    L55: {
                      if (null == ((gja) this).field_q) {
                        break L55;
                      } else {
                        var10 = 0;
                        var11 = 0;
                        L56: while (true) {
                          if (var9_int <= var11) {
                            if (var10 == 0) {
                              break L55;
                            } else {
                              stackOut_233_0 = null;
                              stackOut_233_1 = this;
                              stackIn_234_0 = stackOut_233_0;
                              stackIn_234_1 = stackOut_233_1;
                              L57: {
                                if (stackIn_234_0 != (Object) (Object) ((gja) this).field_u) {
                                  var11 = 0;
                                  L58: while (true) {
                                    if (((gja) this).field_L <= var11) {
                                      break L57;
                                    } else {
                                      var12_ref = ((gja) this).field_u[var11];
                                      var13_ref_gca = ((gja) this).field_nb[var11];
                                      var13_ref_gca.field_h = cla.field_m[65535 & ((gja) this).field_P[var12_ref.field_m]] & 16777215 | var13_ref_gca.field_h & -16777216;
                                      var11++;
                                      continue L58;
                                    }
                                  }
                                } else {
                                  break L57;
                                }
                              }
                              int discarded$2 = 0;
                              this.e();
                              break L55;
                            }
                          } else {
                            L59: {
                              var12_int = param1[var11];
                              if (~((gja) this).field_q.length < ~var12_int) {
                                var13_ref_int__ = ((gja) this).field_q[var12_int];
                                var14_int = 0;
                                L60: while (true) {
                                  if (~var14_int <= ~var13_ref_int__.length) {
                                    L61: {
                                      stackOut_227_0 = var10;
                                      stackIn_229_0 = stackOut_227_0;
                                      stackIn_228_0 = stackOut_227_0;
                                      if (var13_ref_int__.length <= 0) {
                                        stackOut_229_0 = stackIn_229_0;
                                        stackOut_229_1 = 0;
                                        stackIn_230_0 = stackOut_229_0;
                                        stackIn_230_1 = stackOut_229_1;
                                        break L61;
                                      } else {
                                        stackOut_228_0 = stackIn_228_0;
                                        stackOut_228_1 = 1;
                                        stackIn_230_0 = stackOut_228_0;
                                        stackIn_230_1 = stackOut_228_1;
                                        break L61;
                                      }
                                    }
                                    var10 = stackIn_230_0 | stackIn_230_1;
                                    break L59;
                                  } else {
                                    L62: {
                                      L63: {
                                        var15 = var13_ref_int__[var14_int];
                                        if (null == ((gja) this).field_jb) {
                                          break L63;
                                        } else {
                                          if ((((gja) this).field_jb[var15] & param6) == 0) {
                                            break L62;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                      L64: {
                                        var16 = ((gja) this).field_P[var15] & 65535;
                                        var17 = var16 >> 10 & 63;
                                        var18 = 7 & var16 >> 7;
                                        var18 = var18 + param3 / 4;
                                        var19 = var16 & 127;
                                        var17 = param2 + var17 & 63;
                                        if (var18 >= 0) {
                                          if (var18 <= 7) {
                                            break L64;
                                          } else {
                                            var18 = 7;
                                            break L64;
                                          }
                                        } else {
                                          var18 = 0;
                                          break L64;
                                        }
                                      }
                                      L65: {
                                        var19 = var19 + param4;
                                        if (var19 >= 0) {
                                          if (var19 > 127) {
                                            var19 = 127;
                                            break L65;
                                          } else {
                                            break L65;
                                          }
                                        } else {
                                          var19 = 0;
                                          break L65;
                                        }
                                      }
                                      ((gja) this).field_P[var15] = (short)fh.a(var19, fh.a(var18 << 7, var17 << 10));
                                      break L62;
                                    }
                                    var14_int++;
                                    continue L60;
                                  }
                                }
                              } else {
                                break L59;
                              }
                            }
                            var11++;
                            continue L56;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L66: {
                    if (((gja) this).field_q == null) {
                      break L66;
                    } else {
                      var10 = 0;
                      var11 = 0;
                      L67: while (true) {
                        if (var11 >= var9_int) {
                          if (var10 == 0) {
                            break L66;
                          } else {
                            stackOut_193_0 = null;
                            stackOut_193_1 = this;
                            stackIn_194_0 = stackOut_193_0;
                            stackIn_194_1 = stackOut_193_1;
                            L68: {
                              if (stackIn_194_0 == (Object) (Object) ((gja) this).field_u) {
                                break L68;
                              } else {
                                var11 = 0;
                                L69: while (true) {
                                  if (~((gja) this).field_L >= ~var11) {
                                    break L68;
                                  } else {
                                    var12_ref = ((gja) this).field_u[var11];
                                    var13_ref_gca = ((gja) this).field_nb[var11];
                                    var13_ref_gca.field_h = var13_ref_gca.field_h & 16777215 | 255 + -(((gja) this).field_C[var12_ref.field_m] & 255) << 24;
                                    var11++;
                                    continue L69;
                                  }
                                }
                              }
                            }
                            int discarded$3 = 0;
                            this.e();
                            break L66;
                          }
                        } else {
                          L70: {
                            var12_int = param1[var11];
                            if (~var12_int <= ~((gja) this).field_q.length) {
                              break L70;
                            } else {
                              var13_ref_int__ = ((gja) this).field_q[var12_int];
                              var14_int = 0;
                              L71: while (true) {
                                if (~var13_ref_int__.length >= ~var14_int) {
                                  L72: {
                                    stackOut_187_0 = var10;
                                    stackIn_189_0 = stackOut_187_0;
                                    stackIn_188_0 = stackOut_187_0;
                                    if (var13_ref_int__.length <= 0) {
                                      stackOut_189_0 = stackIn_189_0;
                                      stackOut_189_1 = 0;
                                      stackIn_190_0 = stackOut_189_0;
                                      stackIn_190_1 = stackOut_189_1;
                                      break L72;
                                    } else {
                                      stackOut_188_0 = stackIn_188_0;
                                      stackOut_188_1 = 1;
                                      stackIn_190_0 = stackOut_188_0;
                                      stackIn_190_1 = stackOut_188_1;
                                      break L72;
                                    }
                                  }
                                  var10 = stackIn_190_0 | stackIn_190_1;
                                  break L70;
                                } else {
                                  L73: {
                                    L74: {
                                      var15 = var13_ref_int__[var14_int];
                                      if (null == ((gja) this).field_jb) {
                                        break L74;
                                      } else {
                                        if (0 != (param6 & ((gja) this).field_jb[var15])) {
                                          break L74;
                                        } else {
                                          break L73;
                                        }
                                      }
                                    }
                                    L75: {
                                      var16 = 8 * param2 + (255 & ((gja) this).field_C[var15]);
                                      if (0 <= var16) {
                                        if (255 < var16) {
                                          var16 = 255;
                                          break L75;
                                        } else {
                                          break L75;
                                        }
                                      } else {
                                        var16 = 0;
                                        break L75;
                                      }
                                    }
                                    ((gja) this).field_C[var15] = (byte)var16;
                                    break L73;
                                  }
                                  var14_int++;
                                  continue L71;
                                }
                              }
                            }
                          }
                          var11++;
                          continue L67;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L76: {
              if (null == param7) {
                break L76;
              } else {
                var10 = 8192 + (param3 * param7[1] + param2 * param7[0] + param4 * param7[2]) >> 14;
                var11 = 8192 + (param4 * param7[5] + param3 * param7[4] + param2 * param7[3]) >> 14;
                var12_int = 8192 + param7[8] * param4 + (param7[7] * param3 + param2 * param7[6]) >> 14;
                param3 = var11;
                param2 = var10;
                param4 = var12_int;
                break L76;
              }
            }
            param3 = param3 << 4;
            param4 = param4 << 4;
            param2 = param2 << 4;
            var10 = 0;
            L77: while (true) {
              if (~var9_int >= ~var10) {
                return;
              } else {
                L78: {
                  var11 = param1[var10];
                  if (~((gja) this).field_D.length < ~var11) {
                    var12 = ((gja) this).field_D[var11];
                    var13 = 0;
                    L79: while (true) {
                      if (var13 >= var12.length) {
                        break L78;
                      } else {
                        L80: {
                          L81: {
                            var14_int = var12[var13];
                            if (null == ((gja) this).field_hb) {
                              break L81;
                            } else {
                              if ((((gja) this).field_hb[var14_int] & param6) != 0) {
                                break L81;
                              } else {
                                break L80;
                              }
                            }
                          }
                          ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] + param2;
                          ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] + param3;
                          ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] + param4;
                          break L80;
                        }
                        var13++;
                        continue L79;
                      }
                    }
                  } else {
                    break L78;
                  }
                }
                var10++;
                continue L77;
              }
            }
          }
        } else {
          param3 = param3 << 4;
          param4 = param4 << 4;
          param2 = param2 << 4;
          var10 = 0;
          pb.field_k = 0;
          ina.field_a = 0;
          uu.field_c = 0;
          var11 = 0;
          L82: while (true) {
            if (var11 >= var9_int) {
              L83: {
                if (var10 > 0) {
                  vr.field_o = true;
                  uu.field_c = param4 + uu.field_c / var10;
                  ina.field_a = ina.field_a / var10 - -param2;
                  stackOut_18_0 = param3;
                  stackOut_18_1 = pb.field_k / var10;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  pb.field_k = stackIn_19_0 + stackIn_19_1;
                  break L83;
                } else {
                  uu.field_c = param4;
                  pb.field_k = param3;
                  ina.field_a = param2;
                  break L83;
                }
              }
              return;
            } else {
              L84: {
                var12_int = param1[var11];
                if (var12_int < ((gja) this).field_D.length) {
                  var13_ref_int__ = ((gja) this).field_D[var12_int];
                  var14_int = 0;
                  L85: while (true) {
                    if (~var14_int <= ~var13_ref_int__.length) {
                      break L84;
                    } else {
                      L86: {
                        L87: {
                          var15 = var13_ref_int__[var14_int];
                          if (null == ((gja) this).field_hb) {
                            break L87;
                          } else {
                            if ((param6 & ((gja) this).field_hb[var15]) != 0) {
                              break L87;
                            } else {
                              break L86;
                            }
                          }
                        }
                        ina.field_a = ina.field_a + ((gja) this).field_Z[var15];
                        pb.field_k = pb.field_k + ((gja) this).field_r[var15];
                        uu.field_c = uu.field_c + ((gja) this).field_l[var15];
                        var10++;
                        break L86;
                      }
                      var14_int++;
                      continue L85;
                    }
                  }
                } else {
                  break L84;
                }
              }
              var11++;
              continue L82;
            }
          }
        }
    }

    private final short a(int param0, int param1, float param2, int param3, int param4, int param5, long param6, int param7, float param8, boolean param9, oc param10) {
        RuntimeException var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        short stackIn_18_0 = 0;
        short stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_17_0 = 0;
        short stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var13_int = ((gja) this).field_J[param3];
            var14 = ((gja) this).field_J[1 + param3];
            var15 = 0;
            var16 = var13_int;
            L1: while (true) {
              L2: {
                if (~var14 >= ~var16) {
                  break L2;
                } else {
                  var17 = ((gja) this).field_db[var16];
                  if (0 == var17) {
                    var15 = var16;
                    break L2;
                  } else {
                    if (~param6 == ~tl.field_q[var16]) {
                      stackOut_17_0 = (short)(var17 - 1);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      var16++;
                      continue L1;
                    }
                  }
                }
              }
              ((gja) this).field_db[var15] = (short)(((gja) this).field_fb + 1);
              tl.field_q[var15] = param6;
              ((gja) this).field_G[((gja) this).field_fb] = (short)param1;
              ((gja) this).field_kb[((gja) this).field_fb] = (short)param3;
              ((gja) this).field_lb[((gja) this).field_fb] = (short)param7;
              ((gja) this).field_m[((gja) this).field_fb] = (short)param0;
              ((gja) this).field_p[((gja) this).field_fb] = (short)param4;
              ((gja) this).field_w[((gja) this).field_fb] = (byte)param5;
              ((gja) this).field_eb[((gja) this).field_fb] = param2;
              ((gja) this).field_t[((gja) this).field_fb] = param8;
              int fieldTemp$1 = ((gja) this).field_fb;
              ((gja) this).field_fb = ((gja) this).field_fb + 1;
              stackOut_20_0 = (short)fieldTemp$1;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var13 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var13;
            stackOut_22_1 = new StringBuilder().append("gja.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(1).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param10 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_21_0;
    }

    final ka a(byte param0, int param1, boolean param2) {
        gja var4 = null;
        RuntimeException var4_ref = null;
        gja var5 = null;
        int var6 = 0;
        Object stackIn_21_0 = null;
        gja stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        gja stackIn_21_3 = null;
        Object stackIn_23_0 = null;
        gja stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        gja stackIn_23_3 = null;
        Object stackIn_24_0 = null;
        gja stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        gja stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        ka stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        gja stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        gja stackOut_20_3 = null;
        Object stackOut_23_0 = null;
        gja stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        gja stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        Object stackOut_21_0 = null;
        gja stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        gja stackOut_21_3 = null;
        int stackOut_21_4 = 0;
        ka stackOut_24_0 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != 1) {
                if (param0 == 2) {
                  var5 = ((gja) this).field_S.field_W;
                  var4 = ((gja) this).field_S.field_gc;
                  break L1;
                } else {
                  if (param0 == 3) {
                    var4 = ((gja) this).field_S.field_fb;
                    var5 = ((gja) this).field_S.field_E;
                    break L1;
                  } else {
                    if (param0 != 4) {
                      if (5 == param0) {
                        var5 = ((gja) this).field_S.field_tc;
                        var4 = ((gja) this).field_S.field_ec;
                        break L1;
                      } else {
                        gja dupTemp$61 = new gja(((gja) this).field_S, 0, 0, true, false);
                        var5 = dupTemp$61;
                        var4 = dupTemp$61;
                        break L1;
                      }
                    } else {
                      var5 = ((gja) this).field_S.field_n;
                      var4 = ((gja) this).field_S.field_O;
                      break L1;
                    }
                  }
                }
              } else {
                var5 = ((gja) this).field_S.field_tb;
                var4 = ((gja) this).field_S.field_cc;
                break L1;
              }
            }
            L2: {
              stackOut_20_0 = this;
              stackOut_20_1 = (gja) var4;
              stackOut_20_2 = 0;
              stackOut_20_3 = (gja) var5;
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              stackIn_23_3 = stackOut_20_3;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              stackIn_21_3 = stackOut_20_3;
              if (param0 == 0) {
                stackOut_23_0 = this;
                stackOut_23_1 = (gja) (Object) stackIn_23_1;
                stackOut_23_2 = stackIn_23_2;
                stackOut_23_3 = (gja) (Object) stackIn_23_3;
                stackOut_23_4 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                stackIn_24_4 = stackOut_23_4;
                break L2;
              } else {
                stackOut_21_0 = this;
                stackOut_21_1 = (gja) (Object) stackIn_21_1;
                stackOut_21_2 = stackIn_21_2;
                stackOut_21_3 = (gja) (Object) stackIn_21_3;
                stackOut_21_4 = 1;
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_24_2 = stackOut_21_2;
                stackIn_24_3 = stackOut_21_3;
                stackIn_24_4 = stackOut_21_4;
                break L2;
              }
            }
            stackOut_24_0 = this.a(stackIn_24_1, stackIn_24_2 != 0, stackIn_24_3, stackIn_24_4 != 0, param1, param2);
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4_ref, "gja.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_25_0;
    }

    final void a(gda param0, el param1, int param2) {
        RuntimeException var4 = null;
        asa var4_ref = null;
        asa var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((gja) this).field_fb != 0) {
              L1: {
                var4_ref = ((gja) this).field_S.field_bb;
                var5 = (asa) (Object) param0;
                if (((gja) this).field_A) {
                  break L1;
                } else {
                  int discarded$1 = -913;
                  this.f();
                  break L1;
                }
              }
              L2: {
                qra.field_d = var5.field_o * var4_ref.field_h + (var4_ref.field_o * var5.field_q + var4_ref.field_p * var5.field_l);
                gj.field_h = var5.field_n * var4_ref.field_o + var5.field_e * var4_ref.field_p + var4_ref.field_h * var5.field_i + var4_ref.field_i;
                var6 = gj.field_h + qra.field_d * (float)((gja) this).field_o;
                var7 = gj.field_h + (float)((gja) this).field_n * qra.field_d;
                if (var7 < var6) {
                  var8 = (float)(-((gja) this).field_H) + var7;
                  var9 = (float)((gja) this).field_H + var6;
                  break L2;
                } else {
                  var8 = var6 - (float)((gja) this).field_H;
                  var9 = (float)((gja) this).field_H + var7;
                  break L2;
                }
              }
              if (var8 < ((gja) this).field_S.field_d) {
                if (var9 > (float)((gja) this).field_S.field_D) {
                  L3: {
                    fba.field_a = var5.field_n * var4_ref.field_l + var4_ref.field_g * var5.field_e + var5.field_i * var4_ref.field_f + var4_ref.field_e;
                    vta.field_e = var4_ref.field_f * var5.field_o + (var5.field_l * var4_ref.field_g + var4_ref.field_l * var5.field_q);
                    var10 = (float)((gja) this).field_o * vta.field_e + fba.field_a;
                    var11 = (float)((gja) this).field_n * vta.field_e + fba.field_a;
                    if (var11 >= var10) {
                      var12 = (var10 - (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                      var13 = (float)((gja) this).field_S.field_Ic * (var11 + (float)((gja) this).field_H);
                      break L3;
                    } else {
                      var13 = (var10 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                      var12 = (float)((gja) this).field_S.field_Ic * ((float)(-((gja) this).field_H) + var11);
                      break L3;
                    }
                  }
                  if (((gja) this).field_S.field_uc > var12 / var9) {
                    if (((gja) this).field_S.field_f < var13 / var9) {
                      L4: {
                        tu.field_g = var5.field_i * var4_ref.field_m + (var5.field_e * var4_ref.field_k + var4_ref.field_q * var5.field_n) + var4_ref.field_n;
                        kb.field_p = var4_ref.field_m * var5.field_o + (var4_ref.field_q * var5.field_q + var4_ref.field_k * var5.field_l);
                        var14 = tu.field_g + (float)((gja) this).field_o * kb.field_p;
                        var15 = tu.field_g + kb.field_p * (float)((gja) this).field_n;
                        if (var15 >= var14) {
                          var16 = ((float)(-((gja) this).field_H) + var14) * (float)((gja) this).field_S.field_h;
                          var17 = (float)((gja) this).field_S.field_h * ((float)((gja) this).field_H + var15);
                          break L4;
                        } else {
                          var17 = ((float)((gja) this).field_H + var14) * (float)((gja) this).field_S.field_h;
                          var16 = ((float)(-((gja) this).field_H) + var15) * (float)((gja) this).field_S.field_h;
                          break L4;
                        }
                      }
                      if (var16 / var9 < ((gja) this).field_S.field_H) {
                        if (var17 / var9 > ((gja) this).field_S.field_zc) {
                          L5: {
                            L6: {
                              if (null != param1) {
                                break L6;
                              } else {
                                if (((gja) this).field_u != null) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            vs.field_O = var4_ref.field_m * var5.field_p + (var5.field_k * var4_ref.field_q + var5.field_g * var4_ref.field_k);
                            wka.field_b = var4_ref.field_f * var5.field_h + (var5.field_f * var4_ref.field_g + var5.field_m * var4_ref.field_l);
                            ct.field_b = var5.field_m * var4_ref.field_q + var5.field_f * var4_ref.field_k + var5.field_h * var4_ref.field_m;
                            hs.field_c = var4_ref.field_o * var5.field_m + var4_ref.field_p * var5.field_f + var4_ref.field_h * var5.field_h;
                            pl.field_a = var4_ref.field_o * var5.field_k + var5.field_g * var4_ref.field_p + var4_ref.field_h * var5.field_p;
                            baa.field_c = var4_ref.field_g * var5.field_g + var4_ref.field_l * var5.field_k + var5.field_p * var4_ref.field_f;
                            break L5;
                          }
                          L7: {
                            if (null != param1) {
                              L8: {
                                var18 = 0;
                                var19 = 1;
                                var20 = ((gja) this).field_K + ((gja) this).field_i >> 1;
                                var21 = ((gja) this).field_cb - -((gja) this).field_Q >> 1;
                                var22 = (int)(hs.field_c * (float)var21 + ((float)((gja) this).field_o * qra.field_d + (gj.field_h + (float)var20 * pl.field_a)));
                                if (var22 < ((gja) this).field_S.field_D) {
                                  var18 = 1;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                var23 = (int)(gj.field_h + pl.field_a * (float)var20 + qra.field_d * (float)((gja) this).field_n + hs.field_c * (float)var21);
                                if (((gja) this).field_S.field_D > var23) {
                                  var18 = 1;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if (var18 == 0) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (((gja) this).field_S.field_D <= var22) {
                                      break L11;
                                    } else {
                                      if (var23 < ((gja) this).field_S.field_D) {
                                        var19 = 0;
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  if (~var22 <= ~((gja) this).field_S.field_D) {
                                    if (((gja) this).field_S.field_D <= var23) {
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var19 == 0) {
                                break L7;
                              } else {
                                if (var23 >= var22) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                          ((gja) this).field_S.s(11);
                          ((gja) this).field_S.a(var5, (byte) 93);
                          this.b((byte) -51);
                          this.c(-119);
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var4;
            stackOut_67_1 = new StringBuilder().append("gja.N(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L12;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L12;
            }
          }
          L13: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L13;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L13;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param2 + 41);
        }
    }

    gja(eo param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        ((gja) this).field_I = 0;
        ((gja) this).field_F = false;
        ((gja) this).field_v = 0;
        ((gja) this).field_f = false;
        ((gja) this).field_A = false;
        ((gja) this).field_fb = 0;
        ((gja) this).field_y = 0;
        ((gja) this).field_N = true;
        ((gja) this).field_W = 0;
        try {
          L0: {
            L1: {
              L2: {
                ((gja) this).field_F = param4;
                ((gja) this).field_S = param0;
                ((gja) this).field_h = param2;
                ((gja) this).field_Y = param1;
                if (param3) {
                  break L2;
                } else {
                  if (ss.a((byte) 112, ((gja) this).field_h, ((gja) this).field_Y)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ((gja) this).field_ib = new hg(uu.a(true, ((gja) this).field_Y, ((gja) this).field_h));
              break L1;
            }
            L3: {
              L4: {
                if (param3) {
                  break L4;
                } else {
                  int discarded$4 = 0;
                  if (foa.a(((gja) this).field_Y, ((gja) this).field_h)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((gja) this).field_d = new hg(pr.a(((gja) this).field_Y, -23611, ((gja) this).field_h));
              break L3;
            }
            L5: {
              L6: {
                if (param3) {
                  break L6;
                } else {
                  if (lf.a(((gja) this).field_h, ((gja) this).field_Y, 128)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              int discarded$5 = 36864;
              ((gja) this).field_E = new hg(no.a(((gja) this).field_h, ((gja) this).field_Y));
              break L5;
            }
            L7: {
              L8: {
                if (param3) {
                  break L8;
                } else {
                  int discarded$6 = 2048;
                  if (!vta.a(((gja) this).field_h, ((gja) this).field_Y)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              int discarded$7 = -19531;
              ((gja) this).field_O = new hg(oba.c(((gja) this).field_Y, ((gja) this).field_h));
              break L7;
            }
            L9: {
              L10: {
                if (param3) {
                  break L10;
                } else {
                  if (!ag.b(-1, ((gja) this).field_Y, ((gja) this).field_h)) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              ((gja) this).field_g = new gg(uu.a(((gja) this).field_Y, ((gja) this).field_h, (byte) -111));
              break L9;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("gja.<init>(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Logging in...";
        field_k = "Auto-respond to <%0>";
    }
}
