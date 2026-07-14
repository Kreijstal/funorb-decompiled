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
        dw var10_ref = null;
        int var11_int = 0;
        eda[] var11 = null;
        int var12 = 0;
        dw var13_ref = null;
        jt var13_ref_jt = null;
        int var13 = 0;
        int var14_int = 0;
        lp var14 = null;
        int var15_int = 0;
        gta[] var15 = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        jt var20_ref_jt = null;
        int var20 = 0;
        lp var21_ref = null;
        int var21 = 0;
        dw var22_ref = null;
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
        gta var31_ref = null;
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
          if ((var9_int ^ -1) <= (param1.field_o ^ -1)) {
            L1: {
              ((gja) this).field_v = ((gja) this).field_I;
              var9 = new long[((gja) this).field_I];
              if ((((gja) this).field_Y & 256 ^ -1) == -1) {
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
                        var13_ref_jt = param1.field_m[var12];
                        var14 = fw.a(var13_ref_jt.field_d, false);
                        var15_int = -1;
                        var16 = 0;
                        L5: while (true) {
                          L6: {
                            if ((((gja) this).field_I ^ -1) >= (var16 ^ -1)) {
                              break L6;
                            } else {
                              if ((var13_ref_jt.field_a ^ -1) != (var8[var16] ^ -1)) {
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
                              var16 = 16777215 & cla.field_m[65535 & param1.field_A[var13_ref_jt.field_a]];
                              stackOut_79_0 = var16;
                              stackIn_81_0 = stackOut_79_0;
                              stackIn_80_0 = stackOut_79_0;
                              if (param1.field_n != null) {
                                stackOut_81_0 = stackIn_81_0;
                                stackOut_81_1 = param1.field_n[var13_ref_jt.field_a];
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
                            var16 = stackIn_82_0 | -stackIn_82_1 + 255 << 196408536;
                            ((gja) this).field_u[var12] = new ll(var15_int, (int) param1.field_a[var13_ref_jt.field_a], (int) param1.field_t[var13_ref_jt.field_a], (int) param1.field_J[var13_ref_jt.field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, var13_ref_jt.field_c);
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
                    var14 = (lp) (Object) qqa.a(var8, param1, ((gja) this).field_I, (byte) -6);
                    var15 = new gta[param1.field_o];
                    var16 = 0;
                    L10: while (true) {
                      if (var16 >= param1.field_o) {
                        var16 = 0;
                        L11: while (true) {
                          if (((gja) this).field_I <= var16) {
                            L12: {
                              if ((((gja) this).field_v ^ -1) >= -1) {
                                break L12;
                              } else {
                                var16 = 1;
                                var17_int = ((gja) this).field_gb[0];
                                var18 = 0;
                                L13: while (true) {
                                  if ((((gja) this).field_v ^ -1) >= (var18 ^ -1)) {
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
                                      if ((var20 ^ -1) <= (((gja) this).field_v ^ -1)) {
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
                                          if ((var22 ^ -1) >= (var19 ^ -1)) {
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
                                          if ((var19 ^ -1) <= (var22 ^ -1)) {
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
                                if (!qr.d(param2, ((gja) this).field_h, 32)) {
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
                                if (!ofa.a(stackIn_253_0, stackIn_253_1, (byte) -126)) {
                                  break L25;
                                } else {
                                  var16 = 0;
                                  var17 = new int[256];
                                  var18 = 0;
                                  L26: while (true) {
                                    if ((((gja) this).field_I ^ -1) >= (var18 ^ -1)) {
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
                                                if (-1 >= (var19 ^ -1)) {
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
                                        if ((var19 ^ -1) > -1) {
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
                              if (0 == (var21 ^ -1)) {
                                break L35;
                              } else {
                                if (0 != (((gja) this).field_h & 64)) {
                                  var22_ref = var7.a((byte) 2, 65535 & var21);
                                  if (!var22_ref.field_p) {
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
                              if ((var21 ^ -1) == 0) {
                                break L36;
                              } else {
                                if (0 != (var19 ^ -1)) {
                                  var19 = var19 & 255;
                                  var31 = param1.field_u[var19];
                                  if (var31 != 0) {
                                    var32_int = param1.field_a[var17_int];
                                    var33_int = param1.field_t[var17_int];
                                    var34 = param1.field_J[var17_int];
                                    var35 = ((ima) (Object) var14).field_a[var19];
                                    var36 = ((ima) (Object) var14).field_c[var19];
                                    var37_int = ((ima) (Object) var14).field_d[var19];
                                    var38 = ((ima) (Object) var14).field_b[var19];
                                    var39 = param1.field_z[var19];
                                    var40 = (float)param1.field_d[var19] / 256.0f;
                                    if ((var31 ^ -1) == -2) {
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
                                      if ((1 & var39 ^ -1) != -1) {
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
                                      if (-3 == (var31 ^ -1)) {
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
                                        if ((var31 ^ -1) != -4) {
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
                                          if (-1 != (1 & var39 ^ -1)) {
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
                                if (-2 != (var31 ^ -1)) {
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
                                  var33 = (long)(stackIn_208_0 + ((var19 << -1545577054) + (var32.field_d + 256 << -148287444)) - -(var32.field_h - -256 << -1303013514)) - -((long)var20 + (long)(var30 << 1658284536) + (long)(var18 << -1751739576) << 1321630816);
                                  ((gja) this).field_M[var16] = this.a(var32.field_d, var16, var22_float, (int) param1.field_a[var17_int], var32.field_h, 0, var33, var32.field_c, var23, true, param1);
                                  ((gja) this).field_z[var16] = this.a(var32.field_d, var16, var24, (int) param1.field_t[var17_int], var32.field_h, 0, (long)var28 + var33, var32.field_c, var25, true, param1);
                                  ((gja) this).field_V[var16] = this.a(var32.field_d, var16, var26, (int) param1.field_J[var17_int], var32.field_h, 0, (long)var29 + var33, var32.field_c, var27, true, param1);
                                  break L42;
                                }
                              } else {
                                var32_long = (long)(var19 << 2028038562) + ((long)(var18 << -730046072) + (long)(var30 << -561891880) - -(long)var20 << 63058080);
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
                              if ((var27_int ^ -1) < -8193) {
                                break L47;
                              } else {
                                if ((var28 ^ -1) < -8193) {
                                  break L47;
                                } else {
                                  if (var26_int < -8192) {
                                    break L47;
                                  } else {
                                    if (8191 < (var27_int ^ -1)) {
                                      break L47;
                                    } else {
                                      if (8191 >= (var28 ^ -1)) {
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
                                          if ((var30 ^ -1) == -1) {
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
                                            if ((var30 ^ -1) == -2) {
                                              var15[var16] = new gta();
                                              var31_ref = new gta();
                                              var31_ref.field_c = var26_int;
                                              var31_ref.field_h = var28;
                                              var31_ref.field_d = var27_int;
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
                    var13_ref_jt = null;
                    var14_int = 0;
                    var15_int = 0;
                    var16 = 0;
                    var17_int = 0;
                    if (null != param1.field_m) {
                      var18 = 0;
                      var19 = 0;
                      L53: while (true) {
                        if ((param1.field_m.length ^ -1) >= (var19 ^ -1)) {
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
                                var21_ref = fw.a(var20_ref_jt.field_d, false);
                                if (!var21_ref.field_i) {
                                  break L55;
                                } else {
                                  var18 = 1;
                                  break L55;
                                }
                              }
                              if (-1 == var21_ref.field_f) {
                                break L54;
                              } else {
                                var22_ref = var7.a((byte) 103, var21_ref.field_f);
                                if (2 != var22_ref.field_d) {
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
                          var13_ref = var7.a((byte) -27, var18 & 65535);
                          if (0 == (((gja) this).field_h & 64)) {
                            break L57;
                          } else {
                            if (var13_ref.field_p) {
                              var18 = -1;
                              var13_ref = null;
                              break L56;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var17_int = var13_ref.field_a;
                        var16 = var13_ref.field_h;
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
                          if (var13_ref.field_d == 0) {
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
                      var14_int = var14_int + (param1.field_C[var12] << 828183153);
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
                  var14_int = var14_int + (var16 << -1553559672 & 65280);
                  var15_int = var15_int + (var18 << -591675856 & -65536);
                  var14_int = var14_int + (255 & var17_int);
                  var15_int = var15_int + (65535 & var11_int);
                  var9[var11_int] = (long)var15_int + ((long)var14_int << -1743052128);
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
                      var10_ref = var7.a((byte) -71, param1.field_r[var9_int] & 65535);
                      if ((64 & ((gja) this).field_h) == 0) {
                        break L68;
                      } else {
                        if (var10_ref.field_p) {
                          break L67;
                        } else {
                          break L68;
                        }
                      }
                    }
                    if (var10_ref.field_f) {
                      break L65;
                    } else {
                      break L67;
                    }
                  } else {
                    break L67;
                  }
                }
              }
              ((gja) this).field_I = ((gja) this).field_I + 1;
              var8[((gja) this).field_I] = var9_int;
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
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((gja) this).field_D != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var1_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var1_int >= ((gja) this).field_y) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((gja) this).field_Z[var1_int] = ((gja) this).field_Z[var1_int] << 4;
                        ((gja) this).field_r[var1_int] = ((gja) this).field_r[var1_int] << 4;
                        ((gja) this).field_l[var1_int] = ((gja) this).field_l[var1_int] << 4;
                        var1_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        pb.field_k = 0;
                        uu.field_c = 0;
                        ina.field_a = 0;
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var1, "gja.NA()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = 69 / ((param0 - 66) / 38);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if ((55 & ((gja) this).field_h ^ -1) != -1) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((gja) this).field_E != null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((gja) this).field_E.field_h = false;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null != ((gja) this).field_O) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((gja) this).field_O.field_h = false;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) runtimeException, "gja.R(" + param0 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var5_int ^ -1) <= (((gja) this).field_I ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6_int = ((gja) this).field_P[var5_int] & 65535;
                        var7_int = (var6_int & 65039) >> 1360517322;
                        var8 = (var6_int & 951) >> 218434919;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 == (param0 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7_int = var7_int + (param3 * (-var7_int + param0) >> -1000039705);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = var6_int & 127;
                        if (param1 == -1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = var8 + (param3 * (-var8 + param1) >> 1709488231);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1 != param2) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = var9 - -((param2 + -var9) * param3 >> -744327673);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((gja) this).field_P[var5_int] = (short)fh.a(var9, fh.a(var8 << -160360345, var7_int << 797556682));
                        var5_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((gja) this).field_u != null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (((gja) this).field_L <= var5_int) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = ((gja) this).field_u[var5_int];
                        var7 = ((gja) this).field_nb[var5_int];
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7.field_h = -16777216 & var7.field_h | cla.field_m[65535 & ((gja) this).field_P[var6.field_m]] & 16777215;
                        var5_int++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.e(0);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var5, "gja.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        Object stackIn_37_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        Object stackOut_36_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 == ((gja) this).field_fb) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var5_ref = ((gja) this).field_S.field_bb;
                        var6 = (asa) (Object) param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!((gja) this).field_A) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.f(-913);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qra.field_d = var5_ref.field_o * var6.field_q + var6.field_l * var5_ref.field_p + var6.field_o * var5_ref.field_h;
                        gj.field_h = var6.field_e * var5_ref.field_p + var5_ref.field_o * var6.field_n + var6.field_i * var5_ref.field_h + var5_ref.field_i;
                        var7 = qra.field_d * (float)((gja) this).field_o + gj.field_h;
                        var8 = gj.field_h + qra.field_d * (float)((gja) this).field_n;
                        if (var8 < var7) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = var7 - (float)((gja) this).field_H;
                        var10 = var8 + (float)((gja) this).field_H;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = var8 - (float)((gja) this).field_H;
                        var10 = (float)((gja) this).field_H + var7;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((gja) this).field_S.field_Cb > var9) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        if ((float)((gja) this).field_S.field_D >= var10) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        vta.field_e = var6.field_q * var5_ref.field_l + var6.field_l * var5_ref.field_g + var6.field_o * var5_ref.field_f;
                        fba.field_a = var5_ref.field_e + (var6.field_i * var5_ref.field_f + (var6.field_n * var5_ref.field_l + var5_ref.field_g * var6.field_e));
                        var11 = fba.field_a + vta.field_e * (float)((gja) this).field_o;
                        var12 = (float)((gja) this).field_n * vta.field_e + fba.field_a;
                        if (var11 > var12) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = (var12 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                        var13 = (var11 - (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = (float)((gja) this).field_S.field_Ic * (var12 - (float)((gja) this).field_H);
                        var14 = (float)((gja) this).field_S.field_Ic * ((float)((gja) this).field_H + var11);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var13 / (float)param2 >= ((gja) this).field_S.field_uc) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        if (var14 / (float)param2 > ((gja) this).field_S.field_f) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return;
                }
                case 26: {
                    try {
                        tu.field_g = var5_ref.field_k * var6.field_e + var6.field_n * var5_ref.field_q + var6.field_i * var5_ref.field_m + var5_ref.field_n;
                        kb.field_p = var6.field_l * var5_ref.field_k + var6.field_q * var5_ref.field_q + var5_ref.field_m * var6.field_o;
                        var15 = tu.field_g + (float)((gja) this).field_o * kb.field_p;
                        var16 = tu.field_g + (float)((gja) this).field_n * kb.field_p;
                        if (var15 > var16) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var18 = (float)((gja) this).field_S.field_h * (var16 + (float)((gja) this).field_H);
                        var17 = ((float)(-((gja) this).field_H) + var15) * (float)((gja) this).field_S.field_h;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var17 = (float)((gja) this).field_S.field_h * (var16 - (float)((gja) this).field_H);
                        var18 = (var15 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_h;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((gja) this).field_S.field_H <= var17 / (float)param2) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return;
                }
                case 33: {
                    try {
                        if (var18 / (float)param2 > ((gja) this).field_S.field_zc) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return;
                }
                case 35: {
                    try {
                        if (null != param1) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = null;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 == (Object) (Object) ((gja) this).field_u) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        vs.field_O = var5_ref.field_k * var6.field_g + var6.field_k * var5_ref.field_q + var5_ref.field_m * var6.field_p;
                        wka.field_b = var5_ref.field_f * var6.field_h + (var6.field_f * var5_ref.field_g + var5_ref.field_l * var6.field_m);
                        pl.field_a = var6.field_g * var5_ref.field_p + var5_ref.field_o * var6.field_k + var6.field_p * var5_ref.field_h;
                        baa.field_c = var5_ref.field_f * var6.field_p + (var6.field_k * var5_ref.field_l + var5_ref.field_g * var6.field_g);
                        ct.field_b = var6.field_h * var5_ref.field_m + (var5_ref.field_q * var6.field_m + var6.field_f * var5_ref.field_k);
                        hs.field_c = var6.field_h * var5_ref.field_h + (var6.field_m * var5_ref.field_o + var5_ref.field_p * var6.field_f);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (param1 == null) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var19 = ((gja) this).field_K + ((gja) this).field_i >> 791591361;
                        var20 = ((gja) this).field_Q + ((gja) this).field_cb >> 1970446689;
                        var21 = (int)(hs.field_c * (float)var20 + (gj.field_h + pl.field_a * (float)var19 + qra.field_d * (float)((gja) this).field_o));
                        var22 = (int)((float)((gja) this).field_n * qra.field_d + (gj.field_h + (float)var19 * pl.field_a) + hs.field_c * (float)var20);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var21 ^ -1) <= (((gja) this).field_S.field_D ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var22 < ((gja) this).field_S.field_D) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((gja) this).field_S.a((float)param2, -229);
                        ((gja) this).field_S.j((byte) 102);
                        ((gja) this).field_S.a(var6, (byte) 88);
                        this.b((byte) -100);
                        this.c(-125);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    try {
                        stackOut_52_0 = (RuntimeException) var5;
                        stackOut_52_1 = new StringBuilder().append("gja.Q(");
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (param0 == null) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackOut_53_2 = "{...}";
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_56_2 = stackOut_53_2;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 55: {
                    stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                    stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                    stackOut_55_2 = "null";
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    try {
                        stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                        stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44);
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_59_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if (param1 == null) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                        stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                        stackOut_57_2 = "{...}";
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 59: {
                    stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                    stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
                    stackOut_59_2 = "null";
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw tba.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + 44 + param2 + 44 + param3 + 41);
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(cn param0, int param1) {
        RuntimeException var2 = null;
        kh var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = new kh(param0.a("logo.fo3d", (byte) 126, ""));
                        var3 = var2_ref.h(255);
                        var2_ref.h((byte) 119);
                        ej.field_d = uea.a(var2_ref, (byte) 8);
                        tfa.field_e = new int[var3][];
                        cq.field_b = new an[var3];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        cq.field_b[var4] = jo.a(var2_ref, true);
                        var4++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_ref.i((byte) 98);
                        var4 = param1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 >= var3) {
                            statePc = 19;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = cq.field_b[var4];
                        var5.a(6, 6, 6, true, 1);
                        var5.a((byte) -120);
                        var6 = new int[]{var5.field_i + var5.field_z >> 404139873, var5.field_b + var5.field_m >> -72386815, var5.field_a + var5.field_p >> -393482079};
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        tfa.field_e[var4] = var6;
                        var5.a(-var6[2], -var6[0], (byte) -86, -var6[1]);
                        var4++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) var2;
                        stackOut_14_1 = new StringBuilder().append("gja.M(");
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param0 == null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_18_2 = stackOut_15_2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                    stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                    stackOut_17_2 = "null";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(int param0) {
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
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 32767;
                        var3 = 32767;
                        var4 = 32767;
                        var5 = -32768;
                        var6 = -32768;
                        var7 = -32768;
                        var8 = 0;
                        var9 = 0;
                        var10 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var10 >= ((gja) this).field_W) {
                            statePc = 34;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = ((gja) this).field_Z[var10];
                        var12 = ((gja) this).field_r[var10];
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var12 ^ -1) >= (var6 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = var12;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var3 ^ -1) >= (var12 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3 = var12;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var11 ^ -1) <= (var2_int ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int = var11;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var13 = ((gja) this).field_l[var10];
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var5 ^ -1) > (var11 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = var11;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 >= var13) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = var13;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var13 ^ -1) > (var4 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var4 = var13;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = var13 * var13 + var11 * var11;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((var14 ^ -1) < (var8 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = var14;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var14 = var13 * var13 + var11 * var11 - -(var12 * var12);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var14 ^ -1) < (var9 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = var14;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((gja) this).field_Q = var7;
                        ((gja) this).field_n = var6;
                        ((gja) this).field_K = var5;
                        ((gja) this).field_i = var2_int;
                        ((gja) this).field_o = var3;
                        ((gja) this).field_cb = var4;
                        ((gja) this).field_H = (int)(Math.sqrt((double)var8) + 0.99);
                        ((gja) this).field_A = true;
                        stackOut_34_0 = param0;
                        stackOut_34_1 = -913;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == stackIn_35_1) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ka discarded$1 = this.a((gja) null, true, (gja) null, false, -20, false);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.IA(" + param0 + 41);
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(int param0, File param1, int param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            Object stackIn_2_0 = null;
            byte[] stackIn_4_0 = null;
            Object stackIn_6_0 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Object stackOut_1_0 = null;
            byte[] stackOut_3_0 = null;
            Object stackOut_5_0 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = new byte[param0];
                            if (param2 == 0) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof IOException ? 5 : 7);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = null;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 5 : 7);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return (byte[]) (Object) stackIn_2_0;
                    }
                    case 3: {
                        try {
                            nj.a(var3, 107, param0, param1);
                            stackOut_3_0 = (byte[]) var3;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 5 : 7);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0;
                    }
                    case 5: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            stackOut_5_0 = null;
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return (byte[]) (Object) stackIn_6_0;
                    }
                    case 7: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = (RuntimeException) var3_ref2;
                            stackOut_8_1 = new StringBuilder().append("gja.K(").append(param0).append(44);
                            stackIn_11_0 = stackOut_8_0;
                            stackIn_11_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (param1 == null) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                            stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                            stackOut_9_2 = "{...}";
                            stackIn_12_0 = stackOut_9_0;
                            stackIn_12_1 = stackOut_9_1;
                            stackIn_12_2 = stackOut_9_2;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 11: {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "null";
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean h(int param0) {
        RuntimeException var2 = null;
        eja var2_ref = null;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((gja) this).field_g.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (((gja) this).field_g.field_d == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((gja) this).field_g.field_d = ((gja) this).field_S.a(26, ((gja) this).field_F);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ka discarded$1 = ((gja) this).a((byte) -37, -100, true);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2_ref = ((gja) this).field_g.field_d;
                        var2_ref.a(param0 + 28, 6 * ((gja) this).field_v);
                        var3 = var2_ref.a(true, (byte) -10);
                        if (null == var3) {
                            statePc = 30;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = ((gja) this).field_S.a(var3, 127);
                        if (!jaclib.memory.Stream.b()) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var5 ^ -1) <= (((gja) this).field_v ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4.a((int) ((gja) this).field_M[var5]);
                        var4.a((int) ((gja) this).field_z[var5]);
                        var4.a((int) ((gja) this).field_V[var5]);
                        var5++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var5 ^ -1) <= (((gja) this).field_v ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4.b((int) ((gja) this).field_M[var5]);
                        var4.b((int) ((gja) this).field_z[var5]);
                        var4.b((int) ((gja) this).field_V[var5]);
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4.a();
                        if (!var2_ref.a((byte) 95)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((gja) this).field_g.field_a = true;
                        ((gja) this).field_g.field_c = var2_ref;
                        ((gja) this).field_N = true;
                        stackOut_28_0 = 1;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.B(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_97_0 = null;
        Object stackIn_101_0 = null;
        Object stackIn_109_0 = null;
        Object stackIn_116_0 = null;
        Object stackIn_120_0 = null;
        Object stackIn_127_0 = null;
        Object stackIn_138_0 = null;
        Object stackIn_145_0 = null;
        Object stackIn_156_0 = null;
        Object stackIn_163_0 = null;
        int stackIn_174_0 = 0;
        Object stackIn_181_0 = null;
        Object stackIn_192_0 = null;
        Object stackIn_199_0 = null;
        int stackIn_210_0 = 0;
        Object stackIn_217_0 = null;
        Object stackIn_224_0 = null;
        Object stackIn_238_0 = null;
        Object stackIn_252_0 = null;
        Object stackIn_263_0 = null;
        Object stackIn_272_0 = null;
        Object stackIn_280_0 = null;
        int stackIn_288_0 = 0;
        int stackIn_292_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_58_0 = 0;
        Object stackOut_65_0 = null;
        Object stackOut_92_0 = null;
        Object stackOut_96_0 = null;
        Object stackOut_100_0 = null;
        Object stackOut_108_0 = null;
        Object stackOut_115_0 = null;
        Object stackOut_119_0 = null;
        Object stackOut_126_0 = null;
        Object stackOut_137_0 = null;
        Object stackOut_144_0 = null;
        Object stackOut_155_0 = null;
        Object stackOut_162_0 = null;
        int stackOut_173_0 = 0;
        Object stackOut_180_0 = null;
        Object stackOut_191_0 = null;
        Object stackOut_198_0 = null;
        int stackOut_209_0 = 0;
        Object stackOut_216_0 = null;
        Object stackOut_223_0 = null;
        Object stackOut_237_0 = null;
        Object stackOut_251_0 = null;
        Object stackOut_262_0 = null;
        Object stackOut_271_0 = null;
        Object stackOut_279_0 = null;
        int stackOut_287_0 = 0;
        int stackOut_291_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((gja) this).field_N) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ((gja) this).field_N = false;
                        if (null != ((gja) this).field_X) {
                            statePc = 91;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((gja) this).field_s != null) {
                            statePc = 91;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((gja) this).field_u != null) {
                            statePc = 91;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!ei.a(((gja) this).field_h, ((gja) this).field_Y, (byte) 27)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        var4 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == ((gja) this).field_Z) {
                            statePc = 38;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = this;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!tp.a(((gja) this).field_h, (byte) 3, ((gja) this).field_Y)) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null == ((gja) this).field_ib) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!((gja) this).field_ib.b(16440)) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var2_int = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!((gja) this).field_A) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.f(-913);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (null == ((gja) this).field_r) {
                            statePc = 57;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = 458752;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!qr.c(stackIn_40_0, ((gja) this).field_h, ((gja) this).field_Y)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == ((gja) this).field_ib) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!((gja) this).field_ib.b(16440)) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var3 = 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!((gja) this).field_A) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.f(-913);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (((gja) this).field_l == null) {
                            statePc = 79;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = -79;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (cu.a(stackIn_59_0, ((gja) this).field_Y, ((gja) this).field_h)) {
                            statePc = 79;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (null == ((gja) this).field_ib) {
                            statePc = 72;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = this;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (((gja) this).field_ib.b(16440)) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (((gja) this).field_A) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        this.f(-913);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var4 = 1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var3 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ((gja) this).field_r = null;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var4 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        ((gja) this).field_l = null;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var2_int == 0) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        ((gja) this).field_Z = null;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (((gja) this).field_db == null) {
                            statePc = 107;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = this;
                        stackIn_93_0 = stackOut_92_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (((gja) this).field_Z != null) {
                            statePc = 107;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = null;
                        stackIn_97_0 = stackOut_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (stackIn_97_0 != (Object) (Object) ((gja) this).field_r) {
                            statePc = 107;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = this;
                        stackIn_101_0 = stackOut_100_0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (((gja) this).field_l != null) {
                            statePc = 107;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        ((gja) this).field_J = null;
                        ((gja) this).field_db = null;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (null == ((gja) this).field_w) {
                            statePc = 136;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = this;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (dba.a(((gja) this).field_h, 98, ((gja) this).field_Y)) {
                            statePc = 136;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (0 == (55 & ((gja) this).field_h)) {
                            statePc = 125;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = null;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (stackIn_116_0 == (Object) (Object) ((gja) this).field_O) {
                            statePc = 130;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = this;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (!((gja) this).field_O.b(16440)) {
                            statePc = 133;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (((gja) this).field_E == null) {
                            statePc = 130;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = this;
                        stackIn_127_0 = stackOut_126_0;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!((gja) this).field_E.b(16440)) {
                            statePc = 133;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        ((gja) this).field_lb = null;
                        ((gja) this).field_p = null;
                        ((gja) this).field_m = null;
                        ((gja) this).field_w = null;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (null == ((gja) this).field_P) {
                            statePc = 154;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = this;
                        stackIn_138_0 = stackOut_137_0;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (!th.b(((gja) this).field_Y, 8, ((gja) this).field_h)) {
                            statePc = 143;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (((gja) this).field_E == null) {
                            statePc = 151;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        stackOut_144_0 = this;
                        stackIn_145_0 = stackOut_144_0;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (((gja) this).field_E.b(16440)) {
                            statePc = 151;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        ((gja) this).field_P = null;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (((gja) this).field_C == null) {
                            statePc = 172;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackOut_155_0 = this;
                        stackIn_156_0 = stackOut_155_0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (!jda.d(((gja) this).field_h, -28090, ((gja) this).field_Y)) {
                            statePc = 161;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (null == ((gja) this).field_E) {
                            statePc = 166;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = this;
                        stackIn_163_0 = stackOut_162_0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (!((gja) this).field_E.b(16440)) {
                            statePc = 169;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        ((gja) this).field_C = null;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (null == ((gja) this).field_eb) {
                            statePc = 190;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackOut_173_0 = -96;
                        stackIn_174_0 = stackOut_173_0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (!ov.a((byte) stackIn_174_0, ((gja) this).field_Y, ((gja) this).field_h)) {
                            statePc = 179;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (((gja) this).field_d == null) {
                            statePc = 187;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackOut_180_0 = this;
                        stackIn_181_0 = stackOut_180_0;
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (((gja) this).field_d.b(16440)) {
                            statePc = 187;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        ((gja) this).field_t = null;
                        ((gja) this).field_eb = null;
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if (((gja) this).field_gb == null) {
                            statePc = 208;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        stackOut_191_0 = this;
                        stackIn_192_0 = stackOut_191_0;
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (!uw.a(((gja) this).field_h, ((gja) this).field_Y, -102)) {
                            statePc = 197;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        if (null == ((gja) this).field_E) {
                            statePc = 205;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        stackOut_198_0 = this;
                        stackIn_199_0 = stackOut_198_0;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (((gja) this).field_E.b(16440)) {
                            statePc = 205;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        ((gja) this).field_gb = null;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if (null == ((gja) this).field_M) {
                            statePc = 233;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        stackOut_209_0 = -58;
                        stackIn_210_0 = stackOut_209_0;
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if (kd.c(stackIn_210_0, ((gja) this).field_Y, ((gja) this).field_h)) {
                            statePc = 233;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (((gja) this).field_g == null) {
                            statePc = 220;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = this;
                        stackIn_217_0 = stackOut_216_0;
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (!((gja) this).field_g.a(false)) {
                            statePc = 227;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if (null == ((gja) this).field_E) {
                            statePc = 230;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        stackOut_223_0 = this;
                        stackIn_224_0 = stackOut_223_0;
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        if (((gja) this).field_E.b(16440)) {
                            statePc = 230;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        statePc = 227;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        ((gja) this).field_z = null;
                        ((gja) this).field_M = null;
                        ((gja) this).field_V = null;
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        if (((gja) this).field_kb != null) {
                            statePc = 236;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if (((gja) this).field_ib == null) {
                            statePc = 241;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 240;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        stackOut_237_0 = this;
                        stackIn_238_0 = stackOut_237_0;
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 240;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        if (!((gja) this).field_ib.b(16440)) {
                            statePc = 244;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        ((gja) this).field_kb = null;
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        if (null == ((gja) this).field_G) {
                            statePc = 261;
                        } else {
                            statePc = 248;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if (((gja) this).field_E == null) {
                            statePc = 255;
                        } else {
                            statePc = 249;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        statePc = 251;
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        stackOut_251_0 = this;
                        stackIn_252_0 = stackOut_251_0;
                        statePc = 252;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        if (!((gja) this).field_E.b(16440)) {
                            statePc = 258;
                        } else {
                            statePc = 253;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 257;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        statePc = 255;
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 257;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 257;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        ((gja) this).field_G = null;
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        ((gja) this).field_N = true;
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        if (null == ((gja) this).field_q) {
                            statePc = 269;
                        } else {
                            statePc = 262;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        stackOut_262_0 = this;
                        stackIn_263_0 = stackOut_262_0;
                        statePc = 263;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        if (ofa.a(((gja) this).field_Y, ((gja) this).field_h, (byte) -126)) {
                            statePc = 269;
                        } else {
                            statePc = 264;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        statePc = 266;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        ((gja) this).field_q = null;
                        ((gja) this).field_jb = null;
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        var2_int = -112 / ((47 - param0) / 41);
                        statePc = 270;
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        if (((gja) this).field_D == null) {
                            statePc = 278;
                        } else {
                            statePc = 271;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 274;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        stackOut_271_0 = this;
                        stackIn_272_0 = stackOut_271_0;
                        statePc = 272;
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 274;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        if (!qr.d(((gja) this).field_Y, ((gja) this).field_h, 32)) {
                            statePc = 277;
                        } else {
                            statePc = 273;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 276;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 276;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 276;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 276;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        ((gja) this).field_D = null;
                        ((gja) this).field_hb = null;
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        if (((gja) this).field_mb == null) {
                            statePc = 286;
                        } else {
                            statePc = 279;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        stackOut_279_0 = this;
                        stackIn_280_0 = stackOut_279_0;
                        statePc = 280;
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        if (ub.a(((gja) this).field_h, ((gja) this).field_Y, (byte) 21)) {
                            statePc = 286;
                        } else {
                            statePc = 281;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        statePc = 283;
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        ((gja) this).field_mb = null;
                        statePc = 284;
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        statePc = 286;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        if (((gja) this).field_U == null) {
                            statePc = 300;
                        } else {
                            statePc = 287;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        stackOut_287_0 = 2048;
                        stackIn_288_0 = stackOut_287_0;
                        statePc = 288;
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        if ((stackIn_288_0 & ((gja) this).field_Y) != 0) {
                            statePc = 300;
                        } else {
                            statePc = 289;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 294;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 294;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 294;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        stackOut_291_0 = -1;
                        stackIn_292_0 = stackOut_291_0;
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 294;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        if (stackIn_292_0 == (262144 & ((gja) this).field_Y ^ -1)) {
                            statePc = 297;
                        } else {
                            statePc = 293;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        statePc = 295;
                        continue stateLoop;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        statePc = 300;
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        ((gja) this).field_U = null;
                        ((gja) this).field_j = null;
                        ((gja) this).field_R = null;
                        statePc = 300;
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 299: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.GA(" + param0 + 41);
                }
                case 300: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void g(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_k = null;
              if (param0 == 3) {
                break L0;
              } else {
                field_x = 122;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_bb = null;
          field_B = null;
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
        Object stackIn_7_0 = null;
        int stackIn_19_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 != ((gja) this).field_v) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param0 <= -8) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (!this.c((byte) 66)) {
                            statePc = 26;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!this.h(0)) {
                            statePc = 26;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((gja) this).field_S.a(-126, 0, ((gja) this).field_ib.field_e);
                        ((gja) this).field_S.a(-128, 1, ((gja) this).field_E.field_e);
                        ((gja) this).field_S.a(-127, 2, ((gja) this).field_d.field_e);
                        if ((55 & ((gja) this).field_h ^ -1) == -1) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((gja) this).field_S.d(0, true);
                        var2_int = 1;
                        ((gja) this).field_S.a(-127, 3, ((gja) this).field_O.field_e);
                        ((gja) this).field_S.a(((gja) this).field_S.field_nc, -32);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((gja) this).field_S.d(0, false);
                        var2_int = 0;
                        ((gja) this).field_S.a(((gja) this).field_S.field_ob, -32);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var3 ^ -1) <= (((gja) this).field_j.length ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4 = ((gja) this).field_U[var3];
                        var5 = ((gja) this).field_U[var3 - -1];
                        var6 = ((gja) this).field_gb[var4] & 65535;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = var6;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 == 65535) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = -1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((gja) this).field_S.a((byte) -80, var2_int != 0, true, var6);
                        ((gja) this).field_S.a(((gja) this).field_g.field_c, -19394, ((gja) this).field_j[var3], var4 * 3, fma.field_f, ((gja) this).field_R[var3], var5 + -var4);
                        var3++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.b(-46);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.T(" + param0 + 41);
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void H(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((gja) this).field_W ^ -1) >= (var4_int ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = -1;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != (param0 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((gja) this).field_Z[var4_int] = ((gja) this).field_Z[var4_int] + param0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param1 ^ -1) != -1) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((gja) this).field_r[var4_int] = ((gja) this).field_r[var4_int] + param1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 == param2) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((gja) this).field_l[var4_int] = ((gja) this).field_l[var4_int] + param2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.d(1);
                        ((gja) this).field_A = false;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) runtimeException, "gja.H(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void wa() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var1_int ^ -1) <= (((gja) this).field_y ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((gja) this).field_Z[var1_int] = ((gja) this).field_Z[var1_int] + 7 >> 701932932;
                        ((gja) this).field_r[var1_int] = 7 + ((gja) this).field_r[var1_int] >> 862535460;
                        ((gja) this).field_l[var1_int] = 7 + ((gja) this).field_l[var1_int] >> 715582212;
                        var1_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.d(-121);
                        ((gja) this).field_A = false;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var1, "gja.wa()");
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b() {
    }

    private final boolean c(byte param0) {
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
        Object stackIn_8_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_133_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_7_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_132_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((gja) this).field_E.field_h) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 1;
                        stackIn_5_0 = stackOut_2_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0 == (55 & ((gja) this).field_h)) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((gja) this).field_O.field_h) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 1;
                        stackIn_14_0 = stackOut_11_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((gja) this).field_ib.field_h) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((gja) this).field_d.field_h) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 1;
                        stackIn_24_0 = stackOut_21_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var4 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = var2_int;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = var3;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = var5;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = 1;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0 != 0;
                }
                case 42: {
                    try {
                        if (param0 == 66) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return stackIn_44_0 != 0;
                }
                case 45: {
                    try {
                        var6 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var4 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((gja) this).field_kb != null) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = 1;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return stackIn_51_0 != 0;
                }
                case 52: {
                    try {
                        if (((gja) this).field_ib.field_a != null) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((gja) this).field_ib.field_a = ((gja) this).field_S.c(6, ((gja) this).field_F);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7 = ((gja) this).field_ib.field_a;
                        boolean discarded$4 = var7.a(12 * ((gja) this).field_fb, 12, true);
                        var8 = var7.a(-15730, true);
                        if (var8 != null) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var6 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((gja) this).field_S.field_P.copyPositions(((gja) this).field_Z, ((gja) this).field_r, ((gja) this).field_l, ((gja) this).field_kb, 0, 12, ((gja) this).field_fb, var8.getAddress());
                        if (!var7.a(true)) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ((gja) this).field_ib.field_e = var7;
                        ((gja) this).field_ib.field_h = true;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var6 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var2_int == 0) {
                            statePc = 93;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (null != ((gja) this).field_E.field_a) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        ((gja) this).field_E.field_a = ((gja) this).field_S.c(param0 + -60, ((gja) this).field_F);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var7 = ((gja) this).field_E.field_a;
                        boolean discarded$5 = var7.a(((gja) this).field_fb * 4, 4, true);
                        var8 = var7.a(-15730, true);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var8 == null) {
                            statePc = 92;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((55 & ((gja) this).field_h ^ -1) == -1) {
                            statePc = 81;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ((gja) this).field_S.field_P.copyColours(((gja) this).field_P, ((gja) this).field_C, ((gja) this).field_gb, (int) ((gja) this).field_T, ((gja) this).field_G, 0, 4, ((gja) this).field_fb, var8.getAddress());
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (((gja) this).field_e != null) {
                            statePc = 85;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var10 = ((gja) this).field_m;
                        var9 = ((gja) this).field_lb;
                        var12 = ((gja) this).field_w;
                        var11 = ((gja) this).field_p;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var11 = ((gja) this).field_e.field_e;
                        var9 = ((gja) this).field_e.field_a;
                        var10 = ((gja) this).field_e.field_c;
                        var12 = ((gja) this).field_e.field_b;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        ((gja) this).field_S.field_P.copyLighting(((gja) this).field_P, ((gja) this).field_C, ((gja) this).field_gb, var9, var10, var11, var12, (int) ((gja) this).field_T, (int) ((gja) this).field_ab, ((gja) this).field_G, 0, 4, ((gja) this).field_fb, var8.getAddress());
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (!var7.a(true)) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        ((gja) this).field_E.field_h = true;
                        ((gja) this).field_E.field_e = var7;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var6 = 0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var6 = 0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var3 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (null == ((gja) this).field_O.field_a) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        ((gja) this).field_O.field_a = ((gja) this).field_S.c(param0 ^ 68, ((gja) this).field_F);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var7 = ((gja) this).field_O.field_a;
                        boolean discarded$6 = var7.a(((gja) this).field_fb * 12, 12, true);
                        var8 = var7.a(-15730, true);
                        if (var8 != null) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var6 = 0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (((gja) this).field_e != null) {
                            statePc = 107;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var11 = ((gja) this).field_p;
                        var9 = ((gja) this).field_lb;
                        var10 = ((gja) this).field_m;
                        var12 = ((gja) this).field_w;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var10 = ((gja) this).field_e.field_c;
                        var9 = ((gja) this).field_e.field_a;
                        var11 = ((gja) this).field_e.field_e;
                        var12 = ((gja) this).field_e.field_b;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        ((gja) this).field_S.field_P.copyNormals(var9, var10, var11, var12, 3.0f / (float)((gja) this).field_ab, 3.0f / (float)(((gja) this).field_ab / 2 + ((gja) this).field_ab), 0, 12, ((gja) this).field_fb, var8.getAddress());
                        if (var7.a(true)) {
                            statePc = 111;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var6 = 0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        ((gja) this).field_O.field_e = var7;
                        ((gja) this).field_O.field_h = true;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var5 == 0) {
                            statePc = 132;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (((gja) this).field_d.field_a == null) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ((gja) this).field_d.field_a = ((gja) this).field_S.c(6, ((gja) this).field_F);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var7 = ((gja) this).field_d.field_a;
                        boolean discarded$7 = var7.a(((gja) this).field_fb * 8, 8, true);
                        var8 = var7.a(-15730, true);
                        if (null != var8) {
                            statePc = 124;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var6 = 0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        ((gja) this).field_S.field_P.copyTexCoords(((gja) this).field_eb, ((gja) this).field_t, 0, 8, ((gja) this).field_fb, var8.getAddress());
                        if (var7.a(true)) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var6 = 0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        ((gja) this).field_d.field_h = true;
                        ((gja) this).field_d.field_e = var7;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = var6;
                        stackIn_133_0 = stackOut_132_0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    return stackIn_133_0 != 0;
                }
                case 134: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.L(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
        eo stackIn_4_0 = null;
        eo stackIn_6_0 = null;
        eo stackIn_8_0 = null;
        eo stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ll stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        eo stackOut_3_0 = null;
        eo stackOut_4_0 = null;
        eo stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        eo stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ll stackOut_12_0 = null;
        Object stackOut_16_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 55 % ((param0 - -30) / 59);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == ((gja) this).field_u) {
                            statePc = 28;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = ((gja) this).field_S;
                        stackIn_8_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (((gja) this).field_f) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (eo) (Object) stackIn_4_0;
                        stackIn_6_0 = stackOut_4_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (eo) (Object) stackIn_6_0;
                        stackOut_6_1 = 1;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (eo) (Object) stackIn_8_0;
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((eo) (Object) stackIn_9_0).a(stackIn_9_1 != 0, 0);
                        ((gja) this).field_S.d(0, false);
                        ((gja) this).field_S.a(pea.field_c, 1, -79);
                        ((gja) this).field_S.a(1, false, pea.field_c);
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var4 ^ -1) <= (((gja) this).field_L ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = ((gja) this).field_u[var4];
                        var6 = ((gja) this).field_nb[var4];
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (ll) var5;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!stackIn_13_0.field_e) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = this;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!((gja) this).field_S.f()) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = 0.3333333134651184f * (float)(((gja) this).field_Z[var5.field_i] + (((gja) this).field_Z[var5.field_c] - -((gja) this).field_Z[var5.field_k]));
                        var8 = 0.3333333134651184f * (float)(((gja) this).field_r[var5.field_k] + (((gja) this).field_r[var5.field_i] + ((gja) this).field_r[var5.field_c]));
                        var9 = (float)(((gja) this).field_l[var5.field_k] + ((gja) this).field_l[var5.field_c] - -((gja) this).field_l[var5.field_i]) * 0.3333333134651184f;
                        var10 = var9 * wka.field_b + (vta.field_e * var8 + baa.field_c * var7) + fba.field_a;
                        var11 = var9 * ct.field_b + (kb.field_p * var8 + var7 * vs.field_O) + tu.field_g;
                        var12 = gj.field_h + (var9 * hs.field_c + (var7 * pl.field_a + qra.field_d * var8));
                        var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + var10 * var10)))) * (float)var5.field_b;
                        var3 = ((gja) this).field_S.y((byte) -77);
                        var3.a(var10 + (float)var6.field_e - var10 * var13, var6.field_m * var5.field_j >> 746327975, var5.field_a * var6.field_k >> -1246777529, var6.field_c, 2, var12 - var12 * var13, var11 + (float)var6.field_b - var13 * var11);
                        var3.b((gda) (Object) ((gja) this).field_S.field_Y, 3);
                        ((gja) this).field_S.F(-1662);
                        var14 = var6.field_h;
                        ((gja) this).field_S.a((byte) -80, false, false, (int) var5.field_l);
                        ((gja) this).field_S.c((int) var5.field_f, 1);
                        ((gja) this).field_S.g(3625, var14);
                        ((gja) this).field_S.y(2);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((gja) this).field_S.a(1, false, lja.field_j);
                        ((gja) this).field_S.a(lja.field_j, 1, -117);
                        ((gja) this).field_S.a(true, 0);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.D(" + param0 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == ((gja) this).field_E) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((gja) this).field_E.field_h = false;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((gja) this).I(-112, (int[]) null, 56, 86, -123, true, 104, (int[]) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.HA(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void O(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4_int >= ((gja) this).field_W) {
                            statePc = 19;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = param0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((stackIn_4_0 ^ -1) == -129) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((gja) this).field_Z[var4_int] = ((gja) this).field_Z[var4_int] * param0 >> -885558809;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (128 != param1) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((gja) this).field_r[var4_int] = ((gja) this).field_r[var4_int] * param1 >> 699480647;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param2 != 128) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((gja) this).field_l[var4_int] = param2 * ((gja) this).field_l[var4_int] >> -1054421881;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.d(11);
                        ((gja) this).field_A = false;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) runtimeException, "gja.O(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void FA(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = qu.field_b[param0];
                        var3 = qu.field_d[param0];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) <= (((gja) this).field_W ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = -(((gja) this).field_l[var4] * var2_int) + var3 * ((gja) this).field_r[var4] >> 796594702;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((gja) this).field_l[var4] = ((gja) this).field_l[var4] * var3 + ((gja) this).field_r[var4] * var2_int >> 215139918;
                        ((gja) this).field_r[var4] = var5;
                        var4++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.d(94);
                        ((gja) this).field_A = false;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.FA(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ka a(gja param0, boolean param1, gja param2, boolean param3, int param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mca var11_ref = null;
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
          if (-1 == (param4 & 256 ^ -1)) {
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
          var9 = er.c(param4, ((gja) this).field_h, 52) ? 1 : 0;
          var10 = var8 | var7_int | var9;
          if (var10 != 0) {
            L2: {
              if (var7_int != 0) {
                L3: {
                  if (null == param2.field_Z) {
                    break L3;
                  } else {
                    if ((param2.field_Z.length ^ -1) > (((gja) this).field_y ^ -1)) {
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
                    if ((param2.field_l.length ^ -1) <= (((gja) this).field_y ^ -1)) {
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
              if ((((gja) this).field_y ^ -1) >= (var11 ^ -1)) {
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
                  if ((((gja) this).field_I ^ -1) < (param2.field_P.length ^ -1)) {
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
              if ((var11 ^ -1) <= (((gja) this).field_I ^ -1)) {
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
          if (!go.d(((gja) this).field_h, param4, 26205)) {
            param0.field_C = ((gja) this).field_C;
            break L17;
          } else {
            L18: {
              L19: {
                if (null == param2.field_C) {
                  break L19;
                } else {
                  if ((param2.field_C.length ^ -1) <= (((gja) this).field_I ^ -1)) {
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
          if (!no.a(((gja) this).field_h, param4, 36864)) {
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
          if (!kaa.a(((gja) this).field_h, param4, param1)) {
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
                  if ((((gja) this).field_fb ^ -1) >= (param2.field_lb.length ^ -1)) {
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
                  if ((var11 ^ -1) <= (((gja) this).field_fb ^ -1)) {
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
                    param0.field_e = param2.field_e;
                    var11_ref = param2.field_e;
                    if (var11_ref.field_a == null) {
                      break L29;
                    } else {
                      if (var11_ref.field_a.length < ((gja) this).field_fb) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  var12 = ((gja) this).field_fb;
                  var11_ref.field_a = new short[var12];
                  var11_ref.field_e = new short[var12];
                  var11_ref.field_b = new byte[var12];
                  var11_ref.field_c = new short[var12];
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
                    var11_ref.field_a[var12] = ((gja) this).field_e.field_a[var12];
                    var11_ref.field_c[var12] = ((gja) this).field_e.field_c[var12];
                    var11_ref.field_e[var12] = ((gja) this).field_e.field_e[var12];
                    var11_ref.field_b[var12] = ((gja) this).field_e.field_b[var12];
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
          if (oba.c(param4, ((gja) this).field_h, -19531)) {
            param0.field_O = param2.field_O;
            param0.field_O.field_h = ((gja) this).field_O.field_h;
            param0.field_O.field_e = ((gja) this).field_O.field_e;
            param0.field_O.field_b = true;
            break L31;
          } else {
            if (!vta.a(((gja) this).field_h, param4, 2048)) {
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
                  if ((((gja) this).field_I ^ -1) >= (param2.field_eb.length ^ -1)) {
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
            if (foa.a(param4, ((gja) this).field_h, 0)) {
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
                  if ((param2.field_M.length ^ -1) > (((gja) this).field_I ^ -1)) {
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
                  if ((param2.field_gb.length ^ -1) > (((gja) this).field_I ^ -1)) {
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
          if (hk.a(param4, ((gja) this).field_h, -93)) {
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
                    if ((var11 ^ -1) <= (((gja) this).field_L ^ -1)) {
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
          if (!param1) {
            break L50;
          } else {
            short discarded$1 = this.a(119, -102, -0.9161184430122375f, 115, -91, 115, -41L, -82, 0.9345446825027466f, false, (oc) null);
            break L50;
          }
        }
        L51: {
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
            break L51;
          } else {
            param0.field_H = ((gja) this).field_H;
            param0.field_o = ((gja) this).field_o;
            param0.field_cb = ((gja) this).field_cb;
            param0.field_i = ((gja) this).field_i;
            param0.field_K = ((gja) this).field_K;
            param0.field_A = true;
            param0.field_Q = ((gja) this).field_Q;
            param0.field_n = ((gja) this).field_n;
            break L51;
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
          if (-2 == (param0 ^ -1)) {
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
                      if ((var12 ^ -1) <= (var11.length ^ -1)) {
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
              if ((param0 ^ -1) == -4) {
                var9 = 0;
                L3: while (true) {
                  if (var8_int <= var9) {
                    return;
                  } else {
                    L4: {
                      var10 = param1[var9];
                      if ((var10 ^ -1) > (((gja) this).field_D.length ^ -1)) {
                        var11 = ((gja) this).field_D[var10];
                        var12 = 0;
                        L5: while (true) {
                          if ((var12 ^ -1) <= (var11.length ^ -1)) {
                            break L4;
                          } else {
                            var13_int = var11[var12];
                            ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] - ina.field_a;
                            ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] - pb.field_k;
                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] - uu.field_c;
                            ((gja) this).field_Z[var13_int] = param2 * ((gja) this).field_Z[var13_int] >> -1250635033;
                            ((gja) this).field_r[var13_int] = param3 * ((gja) this).field_r[var13_int] >> 459435143;
                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * param4 >> 1874874535;
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
                if (-6 != (param0 ^ -1)) {
                  if (-8 == (param0 ^ -1)) {
                    L6: {
                      if (null != ((gja) this).field_q) {
                        var9 = 0;
                        var10 = 0;
                        L7: while (true) {
                          if ((var10 ^ -1) <= (var8_int ^ -1)) {
                            if (var9 == 0) {
                              break L6;
                            } else {
                              L8: {
                                if (((gja) this).field_u != null) {
                                  var10 = 0;
                                  L9: while (true) {
                                    if ((var10 ^ -1) <= (((gja) this).field_L ^ -1)) {
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
                              this.e(0);
                              break L6;
                            }
                          } else {
                            L10: {
                              var11_int = param1[var10];
                              if (((gja) this).field_q.length > var11_int) {
                                var12_ref_int__ = ((gja) this).field_q[var11_int];
                                var13_int = 0;
                                L11: while (true) {
                                  if ((var13_int ^ -1) <= (var12_ref_int__.length ^ -1)) {
                                    L12: {
                                      stackOut_146_0 = var9;
                                      stackIn_148_0 = stackOut_146_0;
                                      stackIn_147_0 = stackOut_146_0;
                                      if ((var12_ref_int__.length ^ -1) >= -1) {
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
                                      var16 = 63 & var15 >> 2556426;
                                      var17 = (var15 & 1004) >> -1917344601;
                                      var18 = 127 & var15;
                                      var16 = 63 & param2 + var16;
                                      var17 = var17 + param3 / 4;
                                      if (0 <= var17) {
                                        if (-8 <= (var17 ^ -1)) {
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
                                    ((gja) this).field_P[var14] = (short)fh.a(fh.a(var17 << -1943078265, var16 << 1172976938), var18);
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
                    if ((param0 ^ -1) == -9) {
                      L15: {
                        if (((gja) this).field_mb == null) {
                          break L15;
                        } else {
                          var9 = 0;
                          L16: while (true) {
                            if ((var9 ^ -1) <= (var8_int ^ -1)) {
                              break L15;
                            } else {
                              L17: {
                                var10 = param1[var9];
                                if ((((gja) this).field_mb.length ^ -1) >= (var10 ^ -1)) {
                                  break L17;
                                } else {
                                  var11 = ((gja) this).field_mb[var10];
                                  var12 = 0;
                                  L18: while (true) {
                                    if ((var12 ^ -1) <= (var11.length ^ -1)) {
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
                                  if ((var10 ^ -1) <= (((gja) this).field_mb.length ^ -1)) {
                                    break L21;
                                  } else {
                                    var11 = ((gja) this).field_mb[var10];
                                    var12 = 0;
                                    L22: while (true) {
                                      if ((var11.length ^ -1) >= (var12 ^ -1)) {
                                        break L21;
                                      } else {
                                        var13 = ((gja) this).field_nb[var11[var12]];
                                        var13.field_k = param3 * var13.field_k >> 1652240135;
                                        var13.field_m = var13.field_m * param2 >> -574794041;
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
                                    if ((((gja) this).field_mb.length ^ -1) < (var10 ^ -1)) {
                                      var11 = ((gja) this).field_mb[var10];
                                      var12 = 0;
                                      L26: while (true) {
                                        if ((var12 ^ -1) <= (var11.length ^ -1)) {
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
                                  if ((var10 ^ -1) <= (((gja) this).field_L ^ -1)) {
                                    break L29;
                                  } else {
                                    var11_ref = ((gja) this).field_u[var10];
                                    var12_ref_gca = ((gja) this).field_nb[var10];
                                    var12_ref_gca.field_h = 255 - (255 & ((gja) this).field_C[var11_ref.field_m]) << -431912168 | 16777215 & var12_ref_gca.field_h;
                                    var10++;
                                    continue L30;
                                  }
                                }
                              }
                            }
                            this.e(0);
                            break L27;
                          }
                        } else {
                          L31: {
                            var11_int = param1[var10];
                            if (var11_int < ((gja) this).field_q.length) {
                              var12_ref_int__ = ((gja) this).field_q[var11_int];
                              var13_int = 0;
                              L32: while (true) {
                                if ((var12_ref_int__.length ^ -1) >= (var13_int ^ -1)) {
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
                        if ((var9 ^ -1) <= (var8_int ^ -1)) {
                          this.d((byte) 28);
                          break L36;
                        } else {
                          L38: {
                            var10 = param1[var9];
                            if ((var10 ^ -1) > (((gja) this).field_D.length ^ -1)) {
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
                                              var20 = 16383 + (((gja) this).field_lb[var17] * var19 + ((gja) this).field_m[var17] * var18) >> -1117593746;
                                              ((gja) this).field_m[var17] = (short)(-(var18 * ((gja) this).field_lb[var17]) + ((gja) this).field_m[var17] * var19 - -16383 >> 948940238);
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
                                              var20 = var19 * ((gja) this).field_m[var17] + (-(((gja) this).field_p[var17] * var18) - -16383) >> -1142044146;
                                              ((gja) this).field_p[var17] = (short)(((gja) this).field_m[var17] * var18 + (var19 * ((gja) this).field_p[var17] - -16383) >> -1785035250);
                                              ((gja) this).field_m[var17] = (short)var20;
                                              break L43;
                                            }
                                          }
                                          L44: {
                                            if (-1 == (param3 ^ -1)) {
                                              break L44;
                                            } else {
                                              var18 = qu.field_b[param3];
                                              var19 = qu.field_d[param3];
                                              var20 = var18 * ((gja) this).field_p[var17] - (-(((gja) this).field_lb[var17] * var19) + -16383) >> 1390212782;
                                              ((gja) this).field_p[var17] = (short)(-(((gja) this).field_lb[var17] * var18) + (((gja) this).field_p[var17] * var19 - -16383) >> -1407613906);
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
                    if ((var10 ^ -1) <= (((gja) this).field_D.length ^ -1)) {
                      break L45;
                    } else {
                      var11 = ((gja) this).field_D[var10];
                      if ((param5 & 1 ^ -1) == -1) {
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
                              if (-1 == (param4 ^ -1)) {
                                break L47;
                              } else {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = 16383 + (((gja) this).field_r[var13_int] * var14 + ((gja) this).field_Z[var13_int] * var15) >> 1480945454;
                                ((gja) this).field_r[var13_int] = -(var14 * ((gja) this).field_Z[var13_int]) + ((gja) this).field_r[var13_int] * var15 + 16383 >> 2033584814;
                                ((gja) this).field_Z[var13_int] = var16;
                                break L47;
                              }
                            }
                            L48: {
                              if ((param2 ^ -1) == -1) {
                                break L48;
                              } else {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = 16383 + -(var14 * ((gja) this).field_l[var13_int]) + var15 * ((gja) this).field_r[var13_int] >> 2032661230;
                                ((gja) this).field_l[var13_int] = 16383 + var14 * ((gja) this).field_r[var13_int] - -(((gja) this).field_l[var13_int] * var15) >> 311363182;
                                ((gja) this).field_r[var13_int] = var16;
                                break L48;
                              }
                            }
                            L49: {
                              if (-1 != (param3 ^ -1)) {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = 16383 + var15 * ((gja) this).field_Z[var13_int] + ((gja) this).field_l[var13_int] * var14 >> -1180152306;
                                ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * var15 + (-(((gja) this).field_Z[var13_int] * var14) - -16383) >> -1465875090;
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
                          if ((var12 ^ -1) <= (var11.length ^ -1)) {
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
                                var16 = -(((gja) this).field_l[var13_int] * var14) + (((gja) this).field_r[var13_int] * var15 - -16383) >> 149415118;
                                ((gja) this).field_l[var13_int] = ((gja) this).field_r[var13_int] * var14 + (var15 * ((gja) this).field_l[var13_int] + 16383) >> 897059438;
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
                                var16 = 16383 + var14 * ((gja) this).field_r[var13_int] + ((gja) this).field_Z[var13_int] * var15 >> -599770354;
                                ((gja) this).field_r[var13_int] = 16383 + (-(((gja) this).field_Z[var13_int] * var14) + var15 * ((gja) this).field_r[var13_int]) >> -797693554;
                                ((gja) this).field_Z[var13_int] = var16;
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            L53: {
                              if (-1 != (param3 ^ -1)) {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = 16383 + var14 * ((gja) this).field_l[var13_int] - -(var15 * ((gja) this).field_Z[var13_int]) >> 437860238;
                                ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * var15 - (((gja) this).field_Z[var13_int] * var14 - 16383) >> -1880370386;
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
                    if ((var13_int ^ -1) <= (var12_ref_int__.length ^ -1)) {
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = 85 / ((param0 - -81) / 40);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (null == ((gja) this).field_ib) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((gja) this).field_ib.field_h = false;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) runtimeException, "gja.J(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((gja) this).field_ib != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((gja) this).field_ib.c(-5941);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == ((gja) this).field_d) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((gja) this).field_d.c(-5941);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((gja) this).field_E == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((gja) this).field_E.c(-5941);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == ((gja) this).field_O) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((gja) this).field_O.c(-5941);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == ((gja) this).field_g) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((gja) this).field_g.a(-17253);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0 >= 109) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((gja) this).field_mb = null;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "gja.F(" + param0 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
            if (-3 == (param0 ^ -1)) {
              L0: {
                if (param7 != null) {
                  var10 = param7[9] << 22178692;
                  var11 = param7[10] << 353547428;
                  var12_int = param7[11] << -516736508;
                  var13 = param7[12] << -58444764;
                  var14_int = param7[13] << 166590180;
                  var15 = param7[14] << 1512349956;
                  var16_ref_int__ = new int[9];
                  var17 = qu.field_d[param2];
                  var18 = qu.field_b[param2];
                  var19 = qu.field_d[param3];
                  var20 = qu.field_b[param3];
                  var21 = qu.field_d[param4];
                  var22 = qu.field_b[param4];
                  var23 = 8192 + var18 * var21 >> 1137990574;
                  var24 = var18 * var22 + 8192 >> -1268889938;
                  var16_ref_int__[8] = var17 * var19 - -8192 >> 480003854;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[6] = var24 * var19 + (var21 * -var20 - -8192) >> -121983154;
                  var16_ref_int__[3] = 8192 + var22 * var17 >> 1778792622;
                  var16_ref_int__[1] = 8192 + var20 * var23 + var22 * -var19 >> 1178176974;
                  var16_ref_int__[7] = var22 * var20 - -(var19 * var23) - -8192 >> -547796498;
                  var16_ref_int__[2] = var17 * var20 + 8192 >> -1328860466;
                  var16_ref_int__[4] = var17 * var21 + 8192 >> -884441074;
                  var16_ref_int__[0] = 8192 + (var21 * var19 - -(var20 * var24)) >> 1834076974;
                  var25_int = 8192 + (var16_ref_int__[2] * -uu.field_c + -ina.field_a * var16_ref_int__[0]) + var16_ref_int__[1] * -pb.field_k >> 770500014;
                  var26 = 8192 + (var16_ref_int__[3] * -ina.field_a - (-(var16_ref_int__[4] * -pb.field_k) - -uu.field_c * var16_ref_int__[5])) >> 729317710;
                  var27 = 8192 + var16_ref_int__[8] * -uu.field_c + (-pb.field_k * var16_ref_int__[7] + var16_ref_int__[6] * -ina.field_a) >> -943117138;
                  var28 = var25_int + ina.field_a;
                  var29_int = pb.field_k + var26;
                  var30 = var27 + uu.field_c;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L1: while (true) {
                    if (3 <= var32) {
                      var32 = 8192 + var16_ref_int__[2] * var15 + (var13 * var16_ref_int__[0] + var14_int * var16_ref_int__[1]) >> 2142740174;
                      var33 = var15 * var16_ref_int__[5] + (var14_int * var16_ref_int__[4] + var16_ref_int__[3] * var13) + 8192 >> 866364718;
                      var32 = var32 + var28;
                      var34 = var15 * var16_ref_int__[8] + var13 * var16_ref_int__[6] + var16_ref_int__[7] * var14_int + 8192 >> -115548786;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var35 = new int[9];
                      var36 = 0;
                      L2: while (true) {
                        if (3 <= var36) {
                          var36 = 8192 + var34 * param7[2] + (param7[0] * var32 + var33 * param7[1]) >> 159692654;
                          var37 = var33 * param7[4] + var32 * param7[3] - (-(param7[5] * var34) - 8192) >> 1983123470;
                          var38 = param7[8] * var34 + (param7[6] * var32 + param7[7] * var33 - -8192) >> 719951630;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var38 + var12_int;
                          var39 = 0;
                          L3: while (true) {
                            if ((var39 ^ -1) <= (var9_int ^ -1)) {
                              break L0;
                            } else {
                              L4: {
                                var40 = param1[var39];
                                if ((var40 ^ -1) > (((gja) this).field_D.length ^ -1)) {
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
                                            if ((param6 & ((gja) this).field_hb[var43] ^ -1) == -1) {
                                              break L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        var44 = ((gja) this).field_Z[var43] * var35[0] - -(var35[1] * ((gja) this).field_r[var43]) - (-(var35[2] * ((gja) this).field_l[var43]) - 8192) >> 1694490414;
                                        var45 = var35[3] * ((gja) this).field_Z[var43] - -(((gja) this).field_r[var43] * var35[4]) - (-(((gja) this).field_l[var43] * var35[5]) - 8192) >> 1013706542;
                                        var45 = var45 + var37;
                                        var46 = 8192 + ((gja) this).field_l[var43] * var35[8] + (var35[7] * ((gja) this).field_r[var43] + var35[6] * ((gja) this).field_Z[var43]) >> 1441623182;
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
                            if (-4 >= (var37 ^ -1)) {
                              var36++;
                              continue L2;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L9: while (true) {
                                if (3 <= var39) {
                                  var35[var36 * 3 - -var37] = var38 - -8192 >> 1776382734;
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
                              var31_ref_int__[3 * var32 + var33] = var34 + 8192 >> 31999310;
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
                          if ((var9_int ^ -1) >= (var10 ^ -1)) {
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
                                          if ((((gja) this).field_hb[var14_int] & param6 ^ -1) == -1) {
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
                                        if ((var16 ^ -1) >= (var17 ^ -1)) {
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
                                                var21 = var19 * ((gja) this).field_m[var18] + ((gja) this).field_lb[var18] * var20 + 16383 >> 289769006;
                                                ((gja) this).field_m[var18] = (short)(-(((gja) this).field_lb[var18] * var19) + ((gja) this).field_m[var18] * var20 - -16383 >> -1366402450);
                                                ((gja) this).field_lb[var18] = (short)var21;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              if ((param2 ^ -1) != -1) {
                                                var19 = qu.field_b[param2];
                                                var20 = qu.field_d[param2];
                                                var21 = var20 * ((gja) this).field_m[var18] + -(((gja) this).field_p[var18] * var19) + 16383 >> -232201970;
                                                ((gja) this).field_p[var18] = (short)(16383 + (((gja) this).field_m[var18] * var19 + var20 * ((gja) this).field_p[var18]) >> -521257234);
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
                                                var21 = 16383 + var19 * ((gja) this).field_p[var18] - -(((gja) this).field_lb[var18] * var20) >> 1348708686;
                                                ((gja) this).field_p[var18] = (short)(16383 + ((gja) this).field_p[var18] * var20 + -(((gja) this).field_lb[var18] * var19) >> 1259144398);
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
                                    var17 = var16 * ((gja) this).field_Z[var14_int] + var15 * ((gja) this).field_r[var14_int] - -16383 >> 2047719310;
                                    ((gja) this).field_r[var14_int] = 16383 + var16 * ((gja) this).field_r[var14_int] + -(((gja) this).field_Z[var14_int] * var15) >> -199087826;
                                    ((gja) this).field_Z[var14_int] = var17;
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                                L27: {
                                  if ((param2 ^ -1) == -1) {
                                    break L27;
                                  } else {
                                    var15 = qu.field_b[param2];
                                    var16 = qu.field_d[param2];
                                    var17 = 16383 + (var16 * ((gja) this).field_r[var14_int] - var15 * ((gja) this).field_l[var14_int]) >> 1602735406;
                                    ((gja) this).field_l[var14_int] = var16 * ((gja) this).field_l[var14_int] + var15 * ((gja) this).field_r[var14_int] - -16383 >> 149711630;
                                    ((gja) this).field_r[var14_int] = var17;
                                    break L27;
                                  }
                                }
                                L28: {
                                  if (param3 != 0) {
                                    var15 = qu.field_b[param3];
                                    var16 = qu.field_d[param3];
                                    var17 = var16 * ((gja) this).field_Z[var14_int] + var15 * ((gja) this).field_l[var14_int] - -16383 >> 918812014;
                                    ((gja) this).field_l[var14_int] = 16383 + var16 * ((gja) this).field_l[var14_int] + -(var15 * ((gja) this).field_Z[var14_int]) >> 827230094;
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
                    var10 = param7[9] << -1338175228;
                    var11 = param7[10] << -1270325660;
                    var12_int = param7[11] << -2076591452;
                    var13 = param7[12] << -1371611740;
                    var14_int = param7[13] << -1120837244;
                    var15 = param7[14] << -1655869212;
                    var16 = param2 << -530543793 >> -957034329;
                    var17 = param3 << 1075409551 >> 1174744423;
                    var18 = param4 << -81791217 >> -574684249;
                    var19 = 8192 + var16 * -ina.field_a >> -630444562;
                    var20 = 8192 + -pb.field_k * var17 >> 660881390;
                    var21 = 8192 + var18 * -uu.field_c >> -301892690;
                    var22 = ina.field_a + var19;
                    var23 = pb.field_k + var20;
                    var24 = uu.field_c + var21;
                    var25 = new int[9];
                    var25[2] = var16 * param7[6] - -8192 >> 1157800974;
                    var25[0] = var16 * param7[0] + 8192 >> -2126321522;
                    var25[1] = 8192 + param7[3] * var16 >> -706774290;
                    var25[6] = param7[2] * var18 - -8192 >> 1679584078;
                    var25[4] = 8192 + var17 * param7[4] >> 993766478;
                    var25[5] = 8192 + param7[7] * var17 >> 1579122862;
                    var25[3] = 8192 + param7[1] * var17 >> 8317134;
                    var25[7] = param7[5] * var18 + 8192 >> -510753906;
                    var25[8] = var18 * param7[8] + 8192 >> -37034962;
                    var26 = 8192 + var13 * var16 >> -1097205138;
                    var27 = var14_int * var17 + 8192 >> 314942350;
                    var26 = var26 + var22;
                    var28 = var18 * var15 + 8192 >> -927559538;
                    var27 = var27 + var23;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    L30: while (true) {
                      if (-4 >= (var30 ^ -1)) {
                        var30 = 8192 + (var27 * param7[1] + param7[0] * var26) + param7[2] * var28 >> -1640362770;
                        var31 = 8192 + var28 * param7[5] + (var26 * param7[3] - -(param7[4] * var27)) >> 2010050926;
                        var30 = var30 + var10;
                        var32 = param7[7] * var27 + (param7[6] * var26 - (-(param7[8] * var28) + -8192)) >> -1270572146;
                        var31 = var31 + var11;
                        var32 = var32 + var12_int;
                        var33 = 0;
                        L31: while (true) {
                          if (var33 >= var9_int) {
                            break L29;
                          } else {
                            L32: {
                              var34 = param1[var33];
                              if ((var34 ^ -1) <= (((gja) this).field_D.length ^ -1)) {
                                break L32;
                              } else {
                                stackOut_155_0 = this;
                                stackIn_156_0 = stackOut_155_0;
                                var35 = ((gja) this).field_D[var34];
                                var36 = 0;
                                L33: while (true) {
                                  if ((var36 ^ -1) <= (var35.length ^ -1)) {
                                    break L32;
                                  } else {
                                    L34: {
                                      L35: {
                                        var37 = var35[var36];
                                        if (((gja) this).field_hb == null) {
                                          break L35;
                                        } else {
                                          if ((((gja) this).field_hb[var37] & param6 ^ -1) == -1) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      var38 = ((gja) this).field_r[var37] * var29[1] + var29[0] * ((gja) this).field_Z[var37] + var29[2] * ((gja) this).field_l[var37] - -8192 >> -951958898;
                                      var39 = ((gja) this).field_r[var37] * var29[4] + var29[3] * ((gja) this).field_Z[var37] + (var29[5] * ((gja) this).field_l[var37] + 8192) >> 1616958414;
                                      var39 = var39 + var31;
                                      var38 = var38 + var30;
                                      var40 = 8192 + var29[8] * ((gja) this).field_l[var37] + ((gja) this).field_Z[var37] * var29[6] + var29[7] * ((gja) this).field_r[var37] >> -1467132178;
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
                          if (-4 >= (var31 ^ -1)) {
                            var30++;
                            continue L30;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L37: while (true) {
                              if ((var33 ^ -1) <= -4) {
                                var29[3 * var30 - -var31] = 8192 + var32 >> 639691822;
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
                      if ((var9_int ^ -1) >= (var10 ^ -1)) {
                        break L29;
                      } else {
                        L39: {
                          var11 = param1[var10];
                          if ((var11 ^ -1) > (((gja) this).field_D.length ^ -1)) {
                            var12 = ((gja) this).field_D[var11];
                            var13 = 0;
                            L40: while (true) {
                              if ((var13 ^ -1) <= (var12.length ^ -1)) {
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
                                  ((gja) this).field_Z[var14_int] = param2 * ((gja) this).field_Z[var14_int] >> -751015033;
                                  ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] * param3 >> 597001735;
                                  ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] * param4 >> -914476025;
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
                if (-6 != (param0 ^ -1)) {
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
                              if ((var10 ^ -1) <= (var9_int ^ -1)) {
                                break L47;
                              } else {
                                L49: {
                                  var11 = param1[var10];
                                  if ((((gja) this).field_mb.length ^ -1) >= (var11 ^ -1)) {
                                    break L49;
                                  } else {
                                    var12 = ((gja) this).field_mb[var11];
                                    var13 = 0;
                                    L50: while (true) {
                                      if ((var12.length ^ -1) >= (var13 ^ -1)) {
                                        break L49;
                                      } else {
                                        var14 = ((gja) this).field_nb[var12[var13]];
                                        var14.field_m = var14.field_m * param2 >> 1068050695;
                                        var14.field_k = var14.field_k * param3 >> -1502683481;
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
                              this.e(0);
                              break L55;
                            }
                          } else {
                            L59: {
                              var12_int = param1[var11];
                              if ((((gja) this).field_q.length ^ -1) < (var12_int ^ -1)) {
                                var13_ref_int__ = ((gja) this).field_q[var12_int];
                                var14_int = 0;
                                L60: while (true) {
                                  if ((var14_int ^ -1) <= (var13_ref_int__.length ^ -1)) {
                                    L61: {
                                      stackOut_227_0 = var10;
                                      stackIn_229_0 = stackOut_227_0;
                                      stackIn_228_0 = stackOut_227_0;
                                      if ((var13_ref_int__.length ^ -1) >= -1) {
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
                                          if ((((gja) this).field_jb[var15] & param6 ^ -1) == -1) {
                                            break L62;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                      L64: {
                                        var16 = ((gja) this).field_P[var15] & 65535;
                                        var17 = var16 >> -867095574 & 63;
                                        var18 = 7 & var16 >> -12622009;
                                        var18 = var18 + param3 / 4;
                                        var19 = var16 & 127;
                                        var17 = param2 + var17 & 63;
                                        if ((var18 ^ -1) <= -1) {
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
                                        if ((var19 ^ -1) <= -1) {
                                          if ((var19 ^ -1) < -128) {
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
                                      ((gja) this).field_P[var15] = (short)fh.a(var19, fh.a(var18 << -539796377, var17 << 1237115018));
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
                                  if ((((gja) this).field_L ^ -1) >= (var11 ^ -1)) {
                                    break L68;
                                  } else {
                                    var12_ref = ((gja) this).field_u[var11];
                                    var13_ref_gca = ((gja) this).field_nb[var11];
                                    var13_ref_gca.field_h = var13_ref_gca.field_h & 16777215 | 255 + -(((gja) this).field_C[var12_ref.field_m] & 255) << 1001884504;
                                    var11++;
                                    continue L69;
                                  }
                                }
                              }
                            }
                            this.e(0);
                            break L66;
                          }
                        } else {
                          L70: {
                            var12_int = param1[var11];
                            if ((var12_int ^ -1) <= (((gja) this).field_q.length ^ -1)) {
                              break L70;
                            } else {
                              var13_ref_int__ = ((gja) this).field_q[var12_int];
                              var14_int = 0;
                              L71: while (true) {
                                if ((var13_ref_int__.length ^ -1) >= (var14_int ^ -1)) {
                                  L72: {
                                    stackOut_187_0 = var10;
                                    stackIn_189_0 = stackOut_187_0;
                                    stackIn_188_0 = stackOut_187_0;
                                    if ((var13_ref_int__.length ^ -1) >= -1) {
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
                var10 = 8192 + (param3 * param7[1] + param2 * param7[0] + param4 * param7[2]) >> 2103059054;
                var11 = 8192 + (param4 * param7[5] + param3 * param7[4] + param2 * param7[3]) >> -873298066;
                var12_int = 8192 + param7[8] * param4 + (param7[7] * param3 + param2 * param7[6]) >> -144060114;
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
              if ((var9_int ^ -1) >= (var10 ^ -1)) {
                return;
              } else {
                L78: {
                  var11 = param1[var10];
                  if ((((gja) this).field_D.length ^ -1) < (var11 ^ -1)) {
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
                              if ((((gja) this).field_hb[var14_int] & param6 ^ -1) != -1) {
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
                    if ((var14_int ^ -1) <= (var13_ref_int__.length ^ -1)) {
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
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        short stackIn_22_0 = 0;
        short stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        short stackOut_21_0 = 0;
        short stackOut_24_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param9) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((gja) this).field_W = -119;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var13_int = ((gja) this).field_J[param3];
                        var14 = ((gja) this).field_J[1 + param3];
                        var15 = 0;
                        var16 = var13_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var14 ^ -1) >= (var16 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var17 = ((gja) this).field_db[var16];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackOut_8_1 = var17;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var15 = var16;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param6 ^ -1L) == (tl.field_q[var16] ^ -1L)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (short)(var17 - 1);
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    try {
                        var16++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
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
                        ((gja) this).field_fb = ((gja) this).field_fb + 1;
                        stackOut_24_0 = (short)((gja) this).field_fb;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    var13 = (RuntimeException) (Object) caughtException;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) var13;
                        stackOut_27_1 = new StringBuilder().append("gja.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44);
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (param10 == null) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                        stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                        stackOut_28_2 = "{...}";
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_31_2 = stackOut_28_2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 30: {
                    stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                    stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                    stackOut_30_2 = "null";
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        gja var4 = null;
        RuntimeException var4_ref = null;
        gja var5 = null;
        int var6 = 0;
        Object stackIn_23_0 = null;
        gja stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        gja stackIn_23_3 = null;
        Object stackIn_25_0 = null;
        gja stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        gja stackIn_25_3 = null;
        Object stackIn_26_0 = null;
        gja stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        gja stackIn_26_3 = null;
        int stackIn_26_4 = 0;
        ka stackIn_27_0 = null;
        Object stackOut_22_0 = null;
        gja stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        gja stackOut_22_3 = null;
        Object stackOut_23_0 = null;
        gja stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        gja stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        Object stackOut_25_0 = null;
        gja stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        gja stackOut_25_3 = null;
        int stackOut_25_4 = 0;
        ka stackOut_26_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 != 1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = ((gja) this).field_S.field_tb;
                        var4 = ((gja) this).field_S.field_cc;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 2) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 3) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param0 ^ -1) != -5) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = ((gja) this).field_S.field_n;
                        var4 = ((gja) this).field_S.field_O;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (5 == param0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = new gja(((gja) this).field_S, 0, 0, true, false);
                        var4 = new gja(((gja) this).field_S, 0, 0, true, false);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5 = ((gja) this).field_S.field_tc;
                        var4 = ((gja) this).field_S.field_ec;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = ((gja) this).field_S.field_fb;
                        var5 = ((gja) this).field_S.field_E;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5 = ((gja) this).field_S.field_W;
                        var4 = ((gja) this).field_S.field_gc;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = this;
                        stackOut_22_1 = (gja) var4;
                        stackOut_22_2 = 0;
                        stackOut_22_3 = (gja) var5;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        stackIn_25_3 = stackOut_22_3;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        if (-1 == (param0 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = this;
                        stackOut_23_1 = (gja) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = (gja) (Object) stackIn_23_3;
                        stackOut_23_4 = 1;
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
                        stackIn_26_3 = stackOut_23_3;
                        stackIn_26_4 = stackOut_23_4;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this;
                        stackOut_25_1 = (gja) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = (gja) (Object) stackIn_25_3;
                        stackOut_25_4 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        stackIn_26_4 = stackOut_25_4;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = this.a(stackIn_26_1, stackIn_26_2 != 0, stackIn_26_3, stackIn_26_4 != 0, param1, param2);
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var4_ref, "gja.A(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
        Object stackIn_31_0 = null;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        Object stackOut_30_0 = null;
        int stackOut_54_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((gja) this).field_fb != 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var4_ref = ((gja) this).field_S.field_bb;
                        var5 = (asa) (Object) param0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((gja) this).field_A) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.f(-913);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qra.field_d = var5.field_o * var4_ref.field_h + (var4_ref.field_o * var5.field_q + var4_ref.field_p * var5.field_l);
                        gj.field_h = var5.field_n * var4_ref.field_o + var5.field_e * var4_ref.field_p + var4_ref.field_h * var5.field_i + var4_ref.field_i;
                        var6 = gj.field_h + qra.field_d * (float)((gja) this).field_o;
                        var7 = gj.field_h + (float)((gja) this).field_n * qra.field_d;
                        if (var7 < var6) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = var6 - (float)((gja) this).field_H;
                        var9 = (float)((gja) this).field_H + var7;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = (float)(-((gja) this).field_H) + var7;
                        var9 = (float)((gja) this).field_H + var6;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 < ((gja) this).field_S.field_d) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        if (var9 > (float)((gja) this).field_S.field_D) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        fba.field_a = var5.field_n * var4_ref.field_l + var4_ref.field_g * var5.field_e + var5.field_i * var4_ref.field_f + var4_ref.field_e;
                        vta.field_e = var4_ref.field_f * var5.field_o + (var5.field_l * var4_ref.field_g + var4_ref.field_l * var5.field_q);
                        var10 = (float)((gja) this).field_o * vta.field_e + fba.field_a;
                        var11 = (float)((gja) this).field_n * vta.field_e + fba.field_a;
                        if (var11 >= var10) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13 = (var10 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                        var12 = (float)((gja) this).field_S.field_Ic * ((float)(-((gja) this).field_H) + var11);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = (var10 - (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                        var13 = (float)((gja) this).field_S.field_Ic * (var11 + (float)((gja) this).field_H);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (((gja) this).field_S.field_uc > var12 / var9) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        if (((gja) this).field_S.field_f < var13 / var9) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        tu.field_g = var5.field_i * var4_ref.field_m + (var5.field_e * var4_ref.field_k + var4_ref.field_q * var5.field_n) + var4_ref.field_n;
                        kb.field_p = var4_ref.field_m * var5.field_o + (var4_ref.field_q * var5.field_q + var4_ref.field_k * var5.field_l);
                        var14 = tu.field_g + (float)((gja) this).field_o * kb.field_p;
                        var15 = tu.field_g + kb.field_p * (float)((gja) this).field_n;
                        if (var15 >= var14) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var17 = ((float)((gja) this).field_H + var14) * (float)((gja) this).field_S.field_h;
                        var16 = ((float)(-((gja) this).field_H) + var15) * (float)((gja) this).field_S.field_h;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var16 = ((float)(-((gja) this).field_H) + var14) * (float)((gja) this).field_S.field_h;
                        var17 = (float)((gja) this).field_S.field_h * ((float)((gja) this).field_H + var15);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var16 / var9 < ((gja) this).field_S.field_H) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        if (var17 / var9 > ((gja) this).field_S.field_zc) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return;
                }
                case 29: {
                    try {
                        if (null != param1) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = this;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((gja) this).field_u != null) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        vs.field_O = var4_ref.field_m * var5.field_p + (var5.field_k * var4_ref.field_q + var5.field_g * var4_ref.field_k);
                        wka.field_b = var4_ref.field_f * var5.field_h + (var5.field_f * var4_ref.field_g + var5.field_m * var4_ref.field_l);
                        ct.field_b = var5.field_m * var4_ref.field_q + var5.field_f * var4_ref.field_k + var5.field_h * var4_ref.field_m;
                        hs.field_c = var4_ref.field_o * var5.field_m + var4_ref.field_p * var5.field_f + var4_ref.field_h * var5.field_h;
                        pl.field_a = var4_ref.field_o * var5.field_k + var5.field_g * var4_ref.field_p + var4_ref.field_h * var5.field_p;
                        baa.field_c = var4_ref.field_g * var5.field_g + var4_ref.field_l * var5.field_k + var5.field_p * var4_ref.field_f;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null != param1) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var18 = 0;
                        var19 = 1;
                        var20 = ((gja) this).field_K + ((gja) this).field_i >> -759126463;
                        var21 = ((gja) this).field_cb - -((gja) this).field_Q >> -1468036991;
                        var22 = (int)(hs.field_c * (float)var21 + ((float)((gja) this).field_o * qra.field_d + (gj.field_h + (float)var20 * pl.field_a)));
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var22 < ((gja) this).field_S.field_D) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var18 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var23 = (int)(gj.field_h + pl.field_a * (float)var20 + qra.field_d * (float)((gja) this).field_n + hs.field_c * (float)var21);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((gja) this).field_S.field_D > var23) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var18 = 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var18 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (((gja) this).field_S.field_D <= var22) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = var23;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 < ((gja) this).field_S.field_D) {
                            statePc = 66;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var22 ^ -1) <= (((gja) this).field_S.field_D ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (((gja) this).field_S.field_D <= var23) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var19 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var19 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var23 >= var22) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ((gja) this).field_S.s(11);
                        ((gja) this).field_S.a(var5, (byte) 93);
                        this.b((byte) -51);
                        this.c(-119);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    try {
                        stackOut_74_0 = (RuntimeException) var4;
                        stackOut_74_1 = new StringBuilder().append("gja.N(");
                        stackIn_77_0 = stackOut_74_0;
                        stackIn_77_1 = stackOut_74_1;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        if (param0 == null) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                        stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
                        stackOut_75_2 = "{...}";
                        stackIn_78_0 = stackOut_75_0;
                        stackIn_78_1 = stackOut_75_1;
                        stackIn_78_2 = stackOut_75_2;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 77: {
                    stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
                    stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
                    stackOut_77_2 = "null";
                    stackIn_78_0 = stackOut_77_0;
                    stackIn_78_1 = stackOut_77_1;
                    stackIn_78_2 = stackOut_77_2;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    try {
                        stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
                        stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(44);
                        stackIn_81_0 = stackOut_78_0;
                        stackIn_81_1 = stackOut_78_1;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        if (param1 == null) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
                        stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
                        stackOut_79_2 = "{...}";
                        stackIn_82_0 = stackOut_79_0;
                        stackIn_82_1 = stackOut_79_1;
                        stackIn_82_2 = stackOut_79_2;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 81: {
                    stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
                    stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
                    stackOut_81_2 = "null";
                    stackIn_82_0 = stackOut_81_0;
                    stackIn_82_1 = stackOut_81_1;
                    stackIn_82_2 = stackOut_81_2;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw tba.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 44 + param2 + 41);
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    gja(eo param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int stackOut_2_0 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((gja) this).field_I = 0;
                    ((gja) this).field_F = false;
                    ((gja) this).field_v = 0;
                    ((gja) this).field_f = false;
                    ((gja) this).field_A = false;
                    ((gja) this).field_fb = 0;
                    ((gja) this).field_y = 0;
                    ((gja) this).field_N = true;
                    ((gja) this).field_W = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((gja) this).field_F = param4;
                        ((gja) this).field_S = param0;
                        ((gja) this).field_h = param2;
                        ((gja) this).field_Y = param1;
                        if (param3) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 112;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (ss.a((byte) stackIn_3_0, ((gja) this).field_h, ((gja) this).field_Y)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((gja) this).field_ib = new hg(uu.a(true, ((gja) this).field_Y, ((gja) this).field_h));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param3) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (foa.a(((gja) this).field_Y, ((gja) this).field_h, 0)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((gja) this).field_d = new hg(pr.a(((gja) this).field_Y, -23611, ((gja) this).field_h));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param3) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = this;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (lf.a(((gja) this).field_h, ((gja) this).field_Y, 128)) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((gja) this).field_E = new hg(no.a(((gja) this).field_h, ((gja) this).field_Y, 36864));
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param3) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = this;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!vta.a(((gja) this).field_h, ((gja) this).field_Y, 2048)) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((gja) this).field_O = new hg(oba.c(((gja) this).field_Y, ((gja) this).field_h, -19531));
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param3) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = -1;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!ag.b(stackIn_33_0, ((gja) this).field_Y, ((gja) this).field_h)) {
                            statePc = 46;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((gja) this).field_g = new gg(uu.a(((gja) this).field_Y, ((gja) this).field_h, (byte) -111));
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    try {
                        stackOut_41_0 = (RuntimeException) var6;
                        stackOut_41_1 = new StringBuilder().append("gja.<init>(");
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (param0 == null) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                        stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                        stackOut_42_2 = "{...}";
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        stackIn_45_2 = stackOut_42_2;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                    stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                    stackOut_44_2 = "null";
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    stackIn_45_2 = stackOut_44_2;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    throw tba.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 46: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
