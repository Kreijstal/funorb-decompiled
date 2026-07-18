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
        RuntimeException var7 = null;
        d var7_ref = null;
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
        eda var31_ref_eda = null;
        gta var31_ref_gta = null;
        int var31 = 0;
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
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_175_0 = 0;
        oc stackIn_178_0 = null;
        int stackIn_190_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_308_0 = 0;
        int stackIn_308_1 = 0;
        int stackIn_316_0 = 0;
        int stackIn_316_1 = 0;
        oc stackIn_351_0 = null;
        int stackIn_354_0 = 0;
        int stackIn_354_1 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_371_0 = 0;
        int stackIn_371_1 = 0;
        RuntimeException stackIn_390_0 = null;
        StringBuilder stackIn_390_1 = null;
        RuntimeException stackIn_392_0 = null;
        StringBuilder stackIn_392_1 = null;
        RuntimeException stackIn_393_0 = null;
        StringBuilder stackIn_393_1 = null;
        String stackIn_393_2 = null;
        RuntimeException stackIn_394_0 = null;
        StringBuilder stackIn_394_1 = null;
        RuntimeException stackIn_396_0 = null;
        StringBuilder stackIn_396_1 = null;
        RuntimeException stackIn_397_0 = null;
        StringBuilder stackIn_397_1 = null;
        String stackIn_397_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_122_0 = 0;
        byte stackOut_122_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_164_0 = 0;
        byte stackOut_162_0 = 0;
        int stackOut_174_0 = 0;
        oc stackOut_177_0 = null;
        short stackOut_189_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_292_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_307_1 = 0;
        int stackOut_315_0 = 0;
        int stackOut_315_1 = 0;
        oc stackOut_350_0 = null;
        int stackOut_352_0 = 0;
        int stackOut_352_1 = 0;
        int stackOut_357_0 = 0;
        int stackOut_357_1 = 0;
        int stackOut_370_0 = 0;
        int stackOut_370_1 = 0;
        RuntimeException stackOut_389_0 = null;
        StringBuilder stackOut_389_1 = null;
        RuntimeException stackOut_392_0 = null;
        StringBuilder stackOut_392_1 = null;
        String stackOut_392_2 = null;
        RuntimeException stackOut_390_0 = null;
        StringBuilder stackOut_390_1 = null;
        String stackOut_390_2 = null;
        RuntimeException stackOut_393_0 = null;
        StringBuilder stackOut_393_1 = null;
        RuntimeException stackOut_396_0 = null;
        StringBuilder stackOut_396_1 = null;
        String stackOut_396_2 = null;
        RuntimeException stackOut_394_0 = null;
        StringBuilder stackOut_394_1 = null;
        String stackOut_394_2 = null;
        var63 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7_ref = param0.field_c;
            ((gja) this).field_J = new int[1 + param1.field_L];
            var8 = new int[param1.field_o];
            var9_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var9_int <= ~param1.field_o) {
                    break L3;
                  } else {
                    if (var63 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (param1.field_G == null) {
                            break L5;
                          } else {
                            if (2 != param1.field_G[var9_int]) {
                              break L5;
                            } else {
                              if (var63 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          if (param1.field_r == null) {
                            break L6;
                          } else {
                            if (param1.field_r[var9_int] != -1) {
                              L7: {
                                var10_ref_dw = var7_ref.a((byte) -71, param1.field_r[var9_int] & 65535);
                                if ((64 & ((gja) this).field_h) == 0) {
                                  break L7;
                                } else {
                                  if (var10_ref_dw.field_p) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (var10_ref_dw.field_f) {
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        int fieldTemp$2 = ((gja) this).field_I;
                        ((gja) this).field_I = ((gja) this).field_I + 1;
                        var8[fieldTemp$2] = var9_int;
                        ((gja) this).field_J[param1.field_a[var9_int]] = ((gja) this).field_J[param1.field_a[var9_int]] + 1;
                        ((gja) this).field_J[param1.field_t[var9_int]] = ((gja) this).field_J[param1.field_t[var9_int]] + 1;
                        ((gja) this).field_J[param1.field_J[var9_int]] = ((gja) this).field_J[param1.field_J[var9_int]] + 1;
                        break L4;
                      }
                      var9_int++;
                      if (var63 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((gja) this).field_v = ((gja) this).field_I;
                break L2;
              }
              L8: {
                var9 = new long[((gja) this).field_I];
                if ((((gja) this).field_Y & 256) == 0) {
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  break L8;
                } else {
                  stackOut_33_0 = 1;
                  stackIn_36_0 = stackOut_33_0;
                  break L8;
                }
              }
              var10 = stackIn_36_0;
              var11_int = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (((gja) this).field_I <= var11_int) {
                      break L11;
                    } else {
                      var12 = var8[var11_int];
                      var13_ref = null;
                      var14_int = 0;
                      var15_int = 0;
                      var16 = 0;
                      var17_int = 0;
                      if (var63 != 0) {
                        break L10;
                      } else {
                        L12: {
                          L13: {
                            L14: {
                              L15: {
                                if (null != param1.field_m) {
                                  var18 = 0;
                                  var19 = 0;
                                  L16: while (true) {
                                    L17: {
                                      if (~param1.field_m.length >= ~var19) {
                                        break L17;
                                      } else {
                                        var20_ref_jt = param1.field_m[var19];
                                        stackOut_46_0 = var12;
                                        stackOut_46_1 = var20_ref_jt.field_a;
                                        stackIn_65_0 = stackOut_46_0;
                                        stackIn_65_1 = stackOut_46_1;
                                        stackIn_47_0 = stackOut_46_0;
                                        stackIn_47_1 = stackOut_46_1;
                                        if (var63 != 0) {
                                          break L14;
                                        } else {
                                          L18: {
                                            if (stackIn_47_0 != stackIn_47_1) {
                                              break L18;
                                            } else {
                                              L19: {
                                                var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                                                if (!var21_ref_lp.field_i) {
                                                  break L19;
                                                } else {
                                                  var18 = 1;
                                                  break L19;
                                                }
                                              }
                                              if (-1 == var21_ref_lp.field_f) {
                                                break L18;
                                              } else {
                                                var22_ref_dw = var7_ref.a((byte) 103, var21_ref_lp.field_f);
                                                if (2 != var22_ref_dw.field_d) {
                                                  break L18;
                                                } else {
                                                  ((gja) this).field_f = true;
                                                  break L18;
                                                }
                                              }
                                            }
                                          }
                                          var19++;
                                          if (var63 == 0) {
                                            continue L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    if (var18 == 0) {
                                      break L15;
                                    } else {
                                      var9[var11_int] = 9223372036854775807L;
                                      ((gja) this).field_v = ((gja) this).field_v - 1;
                                      if (var63 == 0) {
                                        break L12;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                } else {
                                  break L15;
                                }
                              }
                              var18 = -1;
                              if (null != param1.field_r) {
                                var18 = param1.field_r[var12];
                                stackOut_64_0 = -1;
                                stackOut_64_1 = var18;
                                stackIn_65_0 = stackOut_64_0;
                                stackIn_65_1 = stackOut_64_1;
                                break L14;
                              } else {
                                break L13;
                              }
                            }
                            if (stackIn_65_0 != stackIn_65_1) {
                              L20: {
                                L21: {
                                  var13_ref = (Object) (Object) var7_ref.a((byte) -27, var18 & 65535);
                                  if (0 == (((gja) this).field_h & 64)) {
                                    break L21;
                                  } else {
                                    if (((dw) var13_ref).field_p) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var17_int = ((dw) var13_ref).field_a;
                                var16 = ((dw) var13_ref).field_h;
                                if (var63 == 0) {
                                  break L13;
                                } else {
                                  break L20;
                                }
                              }
                              var18 = -1;
                              var13_ref = null;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L22: {
                            L23: {
                              L24: {
                                if (null == param1.field_n) {
                                  break L24;
                                } else {
                                  if (0 != param1.field_n[var12]) {
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              L25: {
                                if (var13_ref == null) {
                                  break L25;
                                } else {
                                  if (((dw) var13_ref).field_d == 0) {
                                    break L25;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              stackOut_85_0 = 0;
                              stackIn_86_0 = stackOut_85_0;
                              break L22;
                            }
                            stackOut_83_0 = 1;
                            stackIn_86_0 = stackOut_83_0;
                            break L22;
                          }
                          L26: {
                            L27: {
                              var19 = stackIn_86_0;
                              if (var10 != 0) {
                                break L27;
                              } else {
                                if (var19 == 0) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            if (param1.field_C == null) {
                              break L26;
                            } else {
                              var14_int = var14_int + (param1.field_C[var12] << 17);
                              break L26;
                            }
                          }
                          L28: {
                            if (var19 == 0) {
                              break L28;
                            } else {
                              var14_int = var14_int + 65536;
                              break L28;
                            }
                          }
                          var14_int = var14_int + (var16 << 8 & 65280);
                          var15_int = var15_int + (var18 << 16 & -65536);
                          var14_int = var14_int + (255 & var17_int);
                          var15_int = var15_int + (65535 & var11_int);
                          var9[var11_int] = (long)var15_int + ((long)var14_int << 32);
                          ((gja) this).field_f = ((gja) this).field_f | var19 != 0;
                          break L12;
                        }
                        var11_int++;
                        if (var63 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  ofa.a(var8, var9, 67);
                  ((gja) this).field_hb = param1.field_y;
                  ((gja) this).field_W = param1.field_L;
                  ((gja) this).field_r = param1.field_I;
                  ((gja) this).field_y = param1.field_E;
                  ((gja) this).field_l = param1.field_p;
                  ((gja) this).field_Z = param1.field_b;
                  break L10;
                }
                L29: {
                  L30: {
                    var11 = new eda[((gja) this).field_W];
                    ((gja) this).field_s = param1.field_e;
                    ((gja) this).field_X = param1.field_B;
                    if (null != param1.field_m) {
                      ((gja) this).field_L = param1.field_m.length;
                      ((gja) this).field_u = new ll[((gja) this).field_L];
                      ((gja) this).field_nb = new gca[((gja) this).field_L];
                      var12 = 0;
                      L31: while (true) {
                        if (((gja) this).field_L <= var12) {
                          break L30;
                        } else {
                          var13_ref = (Object) (Object) param1.field_m[var12];
                          var14 = fw.a(((jt) var13_ref).field_d, false);
                          var15_int = -1;
                          stackOut_104_0 = 0;
                          stackIn_125_0 = stackOut_104_0;
                          stackIn_105_0 = stackOut_104_0;
                          if (var63 != 0) {
                            break L29;
                          } else {
                            var16 = stackIn_105_0;
                            L32: while (true) {
                              L33: {
                                L34: {
                                  if (~((gja) this).field_I >= ~var16) {
                                    break L34;
                                  } else {
                                    stackOut_107_0 = ~((jt) var13_ref).field_a;
                                    stackOut_107_1 = ~var8[var16];
                                    stackIn_116_0 = stackOut_107_0;
                                    stackIn_116_1 = stackOut_107_1;
                                    stackIn_108_0 = stackOut_107_0;
                                    stackIn_108_1 = stackOut_107_1;
                                    if (var63 != 0) {
                                      break L33;
                                    } else {
                                      L35: {
                                        if (stackIn_108_0 != stackIn_108_1) {
                                          break L35;
                                        } else {
                                          var15_int = var16;
                                          if (var63 == 0) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      var16++;
                                      if (var63 == 0) {
                                        continue L32;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                stackOut_115_0 = -1;
                                stackOut_115_1 = var15_int;
                                stackIn_116_0 = stackOut_115_0;
                                stackIn_116_1 = stackOut_115_1;
                                break L33;
                              }
                              if (stackIn_116_0 != stackIn_116_1) {
                                L36: {
                                  var16 = 16777215 & cla.field_m[65535 & param1.field_A[((jt) var13_ref).field_a]];
                                  stackOut_119_0 = var16;
                                  stackIn_122_0 = stackOut_119_0;
                                  stackIn_120_0 = stackOut_119_0;
                                  if (param1.field_n != null) {
                                    stackOut_122_0 = stackIn_122_0;
                                    stackOut_122_1 = param1.field_n[((jt) var13_ref).field_a];
                                    stackIn_123_0 = stackOut_122_0;
                                    stackIn_123_1 = stackOut_122_1;
                                    break L36;
                                  } else {
                                    stackOut_120_0 = stackIn_120_0;
                                    stackOut_120_1 = 0;
                                    stackIn_123_0 = stackOut_120_0;
                                    stackIn_123_1 = stackOut_120_1;
                                    break L36;
                                  }
                                }
                                var16 = stackIn_123_0 | -stackIn_123_1 + 255 << 24;
                                ((gja) this).field_u[var12] = new ll(var15_int, (int) param1.field_a[((jt) var13_ref).field_a], (int) param1.field_t[((jt) var13_ref).field_a], (int) param1.field_J[((jt) var13_ref).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) var13_ref).field_c);
                                ((gja) this).field_nb[var12] = new gca(var16);
                                var12++;
                                if (var63 == 0) {
                                  continue L31;
                                } else {
                                  break L30;
                                }
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L30;
                    }
                  }
                  stackOut_124_0 = 3 * ((gja) this).field_I;
                  stackIn_125_0 = stackOut_124_0;
                  break L29;
                }
                L37: {
                  var12 = stackIn_125_0;
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
                    break L37;
                  } else {
                    break L37;
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
                L38: while (true) {
                  L39: {
                    L40: {
                      if (var14_int >= param1.field_L) {
                        break L40;
                      } else {
                        var15_int = ((gja) this).field_J[var14_int];
                        ((gja) this).field_J[var14_int] = var13;
                        var11[var14_int] = new eda();
                        var13 = var13 + var15_int;
                        var14_int++;
                        if (var63 != 0) {
                          break L39;
                        } else {
                          if (var63 == 0) {
                            continue L38;
                          } else {
                            break L40;
                          }
                        }
                      }
                    }
                    ((gja) this).field_J[param1.field_L] = var13;
                    break L39;
                  }
                  var14_ref = qqa.a(var8, param1, ((gja) this).field_I, (byte) -6);
                  var15 = new gta[param1.field_o];
                  var16 = 0;
                  L41: while (true) {
                    L42: {
                      L43: {
                        if (var16 >= param1.field_o) {
                          break L43;
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
                          stackOut_138_0 = -(var21 * var23_int) + var24_int * var20;
                          stackIn_175_0 = stackOut_138_0;
                          stackIn_139_0 = stackOut_138_0;
                          if (var63 != 0) {
                            break L42;
                          } else {
                            var28 = stackIn_139_0;
                            L44: while (true) {
                              L45: {
                                L46: {
                                  L47: {
                                    if (var26_int > 8192) {
                                      break L47;
                                    } else {
                                      stackOut_141_0 = ~var27_int;
                                      stackOut_141_1 = -8193;
                                      stackIn_158_0 = stackOut_141_0;
                                      stackIn_158_1 = stackOut_141_1;
                                      stackIn_142_0 = stackOut_141_0;
                                      stackIn_142_1 = stackOut_141_1;
                                      if (var63 != 0) {
                                        break L46;
                                      } else {
                                        if (stackIn_142_0 < stackIn_142_1) {
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
                                                  break L45;
                                                } else {
                                                  break L47;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var26_int = var26_int >> 1;
                                  var27_int = var27_int >> 1;
                                  stackOut_157_0 = var28;
                                  stackOut_157_1 = 1;
                                  stackIn_158_0 = stackOut_157_0;
                                  stackIn_158_1 = stackOut_157_1;
                                  break L46;
                                }
                                var28 = stackIn_158_0 >> stackIn_158_1;
                                if (var63 == 0) {
                                  continue L44;
                                } else {
                                  break L45;
                                }
                              }
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
                                  stackOut_164_0 = 0;
                                  stackIn_165_0 = stackOut_164_0;
                                  break L49;
                                } else {
                                  stackOut_162_0 = param1.field_G[var16];
                                  stackIn_165_0 = stackOut_162_0;
                                  break L49;
                                }
                              }
                              L50: {
                                L51: {
                                  var30 = stackIn_165_0;
                                  if (var30 == 0) {
                                    break L51;
                                  } else {
                                    if (var30 == 1) {
                                      gta dupTemp$3 = new gta();
                                      var15[var16] = dupTemp$3;
                                      var31_ref_gta = dupTemp$3;
                                      var31_ref_gta.field_c = var26_int;
                                      var31_ref_gta.field_h = var28;
                                      var31_ref_gta.field_d = var27_int;
                                      if (var63 == 0) {
                                        break L50;
                                      } else {
                                        break L51;
                                      }
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
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
                              }
                              var16++;
                              if (var63 == 0) {
                                continue L41;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                      }
                      stackOut_174_0 = 0;
                      stackIn_175_0 = stackOut_174_0;
                      break L42;
                    }
                    var16 = stackIn_175_0;
                    L52: while (true) {
                      L53: {
                        L54: {
                          L55: {
                            L56: {
                              L57: {
                                if (((gja) this).field_I <= var16) {
                                  break L57;
                                } else {
                                  var17_int = var8[var16];
                                  var18 = 65535 & param1.field_A[var17_int];
                                  stackOut_177_0 = (oc) param1;
                                  stackIn_351_0 = stackOut_177_0;
                                  stackIn_178_0 = stackOut_177_0;
                                  if (var63 != 0) {
                                    break L56;
                                  } else {
                                    L58: {
                                      L59: {
                                        if (stackIn_178_0.field_g == null) {
                                          break L59;
                                        } else {
                                          var19 = param1.field_g[var17_int];
                                          if (var63 == 0) {
                                            break L58;
                                          } else {
                                            break L59;
                                          }
                                        }
                                      }
                                      var19 = -1;
                                      break L58;
                                    }
                                    L60: {
                                      L61: {
                                        if (null != param1.field_n) {
                                          break L61;
                                        } else {
                                          var20 = 0;
                                          if (var63 == 0) {
                                            break L60;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      var20 = 255 & param1.field_n[var17_int];
                                      break L60;
                                    }
                                    L62: {
                                      if (null != param1.field_r) {
                                        stackOut_189_0 = param1.field_r[var17_int];
                                        stackIn_190_0 = stackOut_189_0;
                                        break L62;
                                      } else {
                                        stackOut_187_0 = -1;
                                        stackIn_190_0 = stackOut_187_0;
                                        break L62;
                                      }
                                    }
                                    L63: {
                                      var21 = stackIn_190_0;
                                      if (var21 == -1) {
                                        break L63;
                                      } else {
                                        if (0 != (((gja) this).field_h & 64)) {
                                          var22_ref_dw = var7_ref.a((byte) 2, 65535 & var21);
                                          if (!var22_ref_dw.field_p) {
                                            break L63;
                                          } else {
                                            var21 = -1;
                                            break L63;
                                          }
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                    L64: {
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
                                        break L64;
                                      } else {
                                        L65: {
                                          if (var19 != -1) {
                                            break L65;
                                          } else {
                                            var27 = 0.0f;
                                            var25 = 1.0f;
                                            var22_float = 0.0f;
                                            var28 = 1;
                                            var24 = 1.0f;
                                            var26 = 0.0f;
                                            var29 = 2;
                                            var23 = 1.0f;
                                            if (var63 == 0) {
                                              break L64;
                                            } else {
                                              break L65;
                                            }
                                          }
                                        }
                                        L66: {
                                          var19 = var19 & 255;
                                          var31 = param1.field_u[var19];
                                          if (var31 != 0) {
                                            break L66;
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
                                            if (var63 == 0) {
                                              break L64;
                                            } else {
                                              break L66;
                                            }
                                          }
                                        }
                                        L67: {
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
                                            break L67;
                                          } else {
                                            L68: {
                                              if (var31 == 2) {
                                                break L68;
                                              } else {
                                                if (var31 != 3) {
                                                  break L64;
                                                } else {
                                                  L69: {
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
                                                      break L69;
                                                    } else {
                                                      L70: {
                                                        L71: {
                                                          if (0.5f < var26 - var22_float) {
                                                            break L71;
                                                          } else {
                                                            if (0.5f < -var26 + var22_float) {
                                                              var29 = 2;
                                                              var26 = var26 + 1.0f;
                                                              if (var63 == 0) {
                                                                break L70;
                                                              } else {
                                                                break L71;
                                                              }
                                                            } else {
                                                              break L70;
                                                            }
                                                          }
                                                        }
                                                        var26 = var26 - 1.0f;
                                                        var29 = 1;
                                                        break L70;
                                                      }
                                                      L72: {
                                                        if (var24 - var22_float > 0.5f) {
                                                          break L72;
                                                        } else {
                                                          if (0.5f < var22_float - var24) {
                                                            var28 = 2;
                                                            var24 = var24 + 1.0f;
                                                            if (var63 == 0) {
                                                              break L64;
                                                            } else {
                                                              break L72;
                                                            }
                                                          } else {
                                                            break L64;
                                                          }
                                                        }
                                                      }
                                                      var28 = 1;
                                                      var24 = var24 - 1.0f;
                                                      if (var63 == 0) {
                                                        break L64;
                                                      } else {
                                                        break L69;
                                                      }
                                                    }
                                                  }
                                                  L73: {
                                                    L74: {
                                                      if (0.5f < var27 - var23) {
                                                        break L74;
                                                      } else {
                                                        if (-var27 + var23 > 0.5f) {
                                                          var27 = var27 + 1.0f;
                                                          var29 = 2;
                                                          if (var63 == 0) {
                                                            break L73;
                                                          } else {
                                                            break L74;
                                                          }
                                                        } else {
                                                          break L73;
                                                        }
                                                      }
                                                    }
                                                    var27 = var27 - 1.0f;
                                                    var29 = 1;
                                                    break L73;
                                                  }
                                                  L75: {
                                                    if (0.5f >= var25 - var23) {
                                                      break L75;
                                                    } else {
                                                      var25 = var25 - 1.0f;
                                                      var28 = 1;
                                                      if (var63 == 0) {
                                                        break L64;
                                                      } else {
                                                        break L75;
                                                      }
                                                    }
                                                  }
                                                  if (0.5f < var23 - var25) {
                                                    var28 = 2;
                                                    var25 = var25 + 1.0f;
                                                    if (var63 == 0) {
                                                      break L64;
                                                    } else {
                                                      break L68;
                                                    }
                                                  } else {
                                                    break L64;
                                                  }
                                                }
                                              }
                                            }
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
                                            if (var63 == 0) {
                                              break L64;
                                            } else {
                                              break L67;
                                            }
                                          }
                                        }
                                        L76: {
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
                                            break L76;
                                          } else {
                                            L77: {
                                              L78: {
                                                if (-var22_float + var24 > var42) {
                                                  break L78;
                                                } else {
                                                  if (-var24 + var22_float > var42) {
                                                    var28 = 2;
                                                    var24 = var24 + var41;
                                                    if (var63 == 0) {
                                                      break L77;
                                                    } else {
                                                      break L78;
                                                    }
                                                  } else {
                                                    break L77;
                                                  }
                                                }
                                              }
                                              var28 = 1;
                                              var24 = var24 - var41;
                                              break L77;
                                            }
                                            L79: {
                                              if (var42 < var26 - var22_float) {
                                                break L79;
                                              } else {
                                                if (-var26 + var22_float > var42) {
                                                  var26 = var26 + var41;
                                                  var29 = 2;
                                                  if (var63 == 0) {
                                                    break L64;
                                                  } else {
                                                    break L79;
                                                  }
                                                } else {
                                                  break L64;
                                                }
                                              }
                                            }
                                            var29 = 1;
                                            var26 = var26 - var41;
                                            if (var63 == 0) {
                                              break L64;
                                            } else {
                                              break L76;
                                            }
                                          }
                                        }
                                        L80: {
                                          L81: {
                                            if (var25 - var23 <= var42) {
                                              break L81;
                                            } else {
                                              var28 = 1;
                                              var25 = var25 - var41;
                                              if (var63 == 0) {
                                                break L80;
                                              } else {
                                                break L81;
                                              }
                                            }
                                          }
                                          if (-var25 + var23 <= var42) {
                                            break L80;
                                          } else {
                                            var25 = var25 + var41;
                                            var28 = 2;
                                            break L80;
                                          }
                                        }
                                        L82: {
                                          if (-var23 + var27 > var42) {
                                            break L82;
                                          } else {
                                            if (-var27 + var23 <= var42) {
                                              break L64;
                                            } else {
                                              var27 = var27 + var41;
                                              var29 = 2;
                                              if (var63 == 0) {
                                                break L64;
                                              } else {
                                                break L82;
                                              }
                                            }
                                          }
                                        }
                                        var29 = 1;
                                        var27 = var27 - var41;
                                        break L64;
                                      }
                                    }
                                    L83: {
                                      L84: {
                                        if (null != param1.field_G) {
                                          break L84;
                                        } else {
                                          var31 = 0;
                                          if (var63 == 0) {
                                            break L83;
                                          } else {
                                            break L84;
                                          }
                                        }
                                      }
                                      var31 = param1.field_G[var17_int];
                                      break L83;
                                    }
                                    L85: {
                                      L86: {
                                        if (0 != var31) {
                                          break L86;
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
                                          if (var63 == 0) {
                                            break L85;
                                          } else {
                                            break L86;
                                          }
                                        }
                                      }
                                      if (var31 != 1) {
                                        break L85;
                                      } else {
                                        L87: {
                                          var32 = var15[var17_int];
                                          if (0 >= var32.field_c) {
                                            stackOut_294_0 = 2048;
                                            stackIn_295_0 = stackOut_294_0;
                                            break L87;
                                          } else {
                                            stackOut_292_0 = 1024;
                                            stackIn_295_0 = stackOut_292_0;
                                            break L87;
                                          }
                                        }
                                        var33 = (long)(stackIn_295_0 + ((var19 << 2) + (var32.field_d + 256 << 12)) - -(var32.field_h - -256 << 22)) - -((long)var20 + (long)(var30 << 24) + (long)(var18 << 8) << 32);
                                        ((gja) this).field_M[var16] = this.a(var32.field_d, var16, var22_float, (int) param1.field_a[var17_int], var32.field_h, 0, var33, var32.field_c, var23, true, param1);
                                        ((gja) this).field_z[var16] = this.a(var32.field_d, var16, var24, (int) param1.field_t[var17_int], var32.field_h, 0, (long)var28 + var33, var32.field_c, var25, true, param1);
                                        ((gja) this).field_V[var16] = this.a(var32.field_d, var16, var26, (int) param1.field_J[var17_int], var32.field_h, 0, (long)var29 + var33, var32.field_c, var27, true, param1);
                                        break L85;
                                      }
                                    }
                                    L88: {
                                      if (null == param1.field_n) {
                                        break L88;
                                      } else {
                                        ((gja) this).field_C[var16] = param1.field_n[var17_int];
                                        break L88;
                                      }
                                    }
                                    L89: {
                                      if (param1.field_h != null) {
                                        ((gja) this).field_jb[var16] = param1.field_h[var17_int];
                                        break L89;
                                      } else {
                                        break L89;
                                      }
                                    }
                                    ((gja) this).field_P[var16] = param1.field_A[var17_int];
                                    ((gja) this).field_gb[var16] = (short) var21;
                                    var16++;
                                    if (var63 == 0) {
                                      continue L52;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                              }
                              L90: {
                                if (((gja) this).field_v <= 0) {
                                  break L90;
                                } else {
                                  var16 = 1;
                                  var17_int = ((gja) this).field_gb[0];
                                  var18 = 0;
                                  L91: while (true) {
                                    L92: {
                                      if (~((gja) this).field_v >= ~var18) {
                                        break L92;
                                      } else {
                                        var19 = ((gja) this).field_gb[var18];
                                        stackOut_307_0 = var19;
                                        stackOut_307_1 = var17_int;
                                        stackIn_354_0 = stackOut_307_0;
                                        stackIn_354_1 = stackOut_307_1;
                                        stackIn_308_0 = stackOut_307_0;
                                        stackIn_308_1 = stackOut_307_1;
                                        if (var63 != 0) {
                                          break L55;
                                        } else {
                                          L93: {
                                            if (stackIn_308_0 == stackIn_308_1) {
                                              break L93;
                                            } else {
                                              var16++;
                                              var17_int = var19;
                                              break L93;
                                            }
                                          }
                                          var18++;
                                          if (var63 == 0) {
                                            continue L91;
                                          } else {
                                            break L92;
                                          }
                                        }
                                      }
                                    }
                                    ((gja) this).field_U = new int[var16 - -1];
                                    ((gja) this).field_j = new int[var16];
                                    ((gja) this).field_R = new int[var16];
                                    ((gja) this).field_U[0] = 0;
                                    var18 = ((gja) this).field_fb;
                                    var17_int = ((gja) this).field_gb[0];
                                    var16 = 0;
                                    var19 = 0;
                                    var20 = 0;
                                    L94: while (true) {
                                      L95: {
                                        if (~var20 <= ~((gja) this).field_v) {
                                          break L95;
                                        } else {
                                          var21 = ((gja) this).field_gb[var20];
                                          stackOut_315_0 = var17_int;
                                          stackOut_315_1 = var21;
                                          stackIn_354_0 = stackOut_315_0;
                                          stackIn_354_1 = stackOut_315_1;
                                          stackIn_316_0 = stackOut_315_0;
                                          stackIn_316_1 = stackOut_315_1;
                                          if (var63 != 0) {
                                            break L55;
                                          } else {
                                            L96: {
                                              if (stackIn_316_0 == stackIn_316_1) {
                                                break L96;
                                              } else {
                                                ((gja) this).field_j[var16] = var18;
                                                ((gja) this).field_R[var16] = 1 + var19 - var18;
                                                var16++;
                                                ((gja) this).field_U[var16] = var20;
                                                var18 = ((gja) this).field_fb;
                                                var17_int = var21;
                                                var19 = 0;
                                                break L96;
                                              }
                                            }
                                            L97: {
                                              var22 = ((gja) this).field_M[var20];
                                              if (var22 < var18) {
                                                var18 = var22;
                                                break L97;
                                              } else {
                                                break L97;
                                              }
                                            }
                                            L98: {
                                              if (var19 < var22) {
                                                var19 = var22;
                                                break L98;
                                              } else {
                                                break L98;
                                              }
                                            }
                                            L99: {
                                              var22 = ((gja) this).field_z[var20];
                                              if (~var22 >= ~var19) {
                                                break L99;
                                              } else {
                                                var19 = var22;
                                                break L99;
                                              }
                                            }
                                            L100: {
                                              if (var18 <= var22) {
                                                break L100;
                                              } else {
                                                var18 = var22;
                                                break L100;
                                              }
                                            }
                                            L101: {
                                              var22 = ((gja) this).field_V[var20];
                                              if (~var19 <= ~var22) {
                                                break L101;
                                              } else {
                                                var19 = var22;
                                                break L101;
                                              }
                                            }
                                            L102: {
                                              if (var18 <= var22) {
                                                break L102;
                                              } else {
                                                var18 = var22;
                                                break L102;
                                              }
                                            }
                                            var20++;
                                            if (var63 == 0) {
                                              continue L94;
                                            } else {
                                              break L95;
                                            }
                                          }
                                        }
                                      }
                                      ((gja) this).field_j[var16] = var18;
                                      ((gja) this).field_R[var16] = 1 + -var18 + var19;
                                      var16++;
                                      ((gja) this).field_U[var16] = ((gja) this).field_v;
                                      break L90;
                                    }
                                  }
                                }
                              }
                              L103: {
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
                                  break L103;
                                } else {
                                  if (!qr.d(param2, ((gja) this).field_h, 32)) {
                                    break L103;
                                  } else {
                                    ((gja) this).field_D = param1.a(false, (byte) 64);
                                    break L103;
                                  }
                                }
                              }
                              L104: {
                                if (null == param1.field_m) {
                                  break L104;
                                } else {
                                  if (!ub.a(((gja) this).field_h, param2, (byte) -122)) {
                                    break L104;
                                  } else {
                                    ((gja) this).field_mb = param1.b((byte) -124);
                                    break L104;
                                  }
                                }
                              }
                              stackOut_350_0 = (oc) param1;
                              stackIn_351_0 = stackOut_350_0;
                              break L56;
                            }
                            if (stackIn_351_0.field_D == null) {
                              break L54;
                            } else {
                              stackOut_352_0 = param2;
                              stackOut_352_1 = ((gja) this).field_h;
                              stackIn_354_0 = stackOut_352_0;
                              stackIn_354_1 = stackOut_352_1;
                              break L55;
                            }
                          }
                          if (!ofa.a(stackIn_354_0, stackIn_354_1, (byte) -126)) {
                            break L54;
                          } else {
                            var16 = 0;
                            var17 = new int[256];
                            var18 = 0;
                            L105: while (true) {
                              L106: {
                                L107: {
                                  L108: {
                                    L109: {
                                      if (~((gja) this).field_I >= ~var18) {
                                        break L109;
                                      } else {
                                        var19 = param1.field_D[var8[var18]];
                                        stackOut_357_0 = ~var19;
                                        stackOut_357_1 = -1;
                                        stackIn_371_0 = stackOut_357_0;
                                        stackIn_371_1 = stackOut_357_1;
                                        stackIn_358_0 = stackOut_357_0;
                                        stackIn_358_1 = stackOut_357_1;
                                        if (var63 != 0) {
                                          L110: while (true) {
                                            if (stackIn_371_0 < stackIn_371_1) {
                                              break L107;
                                            } else {
                                              ((gja) this).field_q[var18] = new int[var17[var18]];
                                              var17[var18] = 0;
                                              var18++;
                                              if (var63 != 0) {
                                                break L106;
                                              } else {
                                                if (var63 == 0) {
                                                  stackOut_370_0 = var16;
                                                  stackOut_370_1 = var18;
                                                  stackIn_371_0 = stackOut_370_0;
                                                  stackIn_371_1 = stackOut_370_1;
                                                  continue L110;
                                                } else {
                                                  break L108;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L111: {
                                            if (stackIn_358_0 > stackIn_358_1) {
                                              break L111;
                                            } else {
                                              L112: {
                                                if (var16 < var19) {
                                                  var16 = var19;
                                                  break L112;
                                                } else {
                                                  break L112;
                                                }
                                              }
                                              var17[var19] = var17[var19] + 1;
                                              break L111;
                                            }
                                          }
                                          var18++;
                                          if (var63 == 0) {
                                            continue L105;
                                          } else {
                                            break L109;
                                          }
                                        }
                                      }
                                    }
                                    ((gja) this).field_q = new int[1 + var16][];
                                    var18 = 0;
                                    L113: while (true) {
                                      stackOut_370_0 = var16;
                                      stackOut_370_1 = var18;
                                      stackIn_371_0 = stackOut_370_0;
                                      stackIn_371_1 = stackOut_370_1;
                                      if (stackIn_371_0 < stackIn_371_1) {
                                        break L107;
                                      } else {
                                        ((gja) this).field_q[var18] = new int[var17[var18]];
                                        var17[var18] = 0;
                                        var18++;
                                        if (var63 != 0) {
                                          break L106;
                                        } else {
                                          if (var63 == 0) {
                                            continue L113;
                                          } else {
                                            break L108;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L107;
                                }
                                var18 = 0;
                                break L106;
                              }
                              L114: while (true) {
                                if (((gja) this).field_I <= var18) {
                                  break L54;
                                } else {
                                  var19 = param1.field_D[var8[var18]];
                                  if (var63 != 0) {
                                    break L53;
                                  } else {
                                    L115: {
                                      if (var19 >= 0) {
                                        var17[var19] = var17[var19] + 1;
                                        ((gja) this).field_q[var19][var17[var19]] = var18;
                                        break L115;
                                      } else {
                                        break L115;
                                      }
                                    }
                                    var18++;
                                    if (var63 == 0) {
                                      continue L114;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        break L53;
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L116: {
            var7 = decompiledCaughtException;
            stackOut_389_0 = (RuntimeException) var7;
            stackOut_389_1 = new StringBuilder().append("gja.<init>(");
            stackIn_392_0 = stackOut_389_0;
            stackIn_392_1 = stackOut_389_1;
            stackIn_390_0 = stackOut_389_0;
            stackIn_390_1 = stackOut_389_1;
            if (param0 == null) {
              stackOut_392_0 = (RuntimeException) (Object) stackIn_392_0;
              stackOut_392_1 = (StringBuilder) (Object) stackIn_392_1;
              stackOut_392_2 = "null";
              stackIn_393_0 = stackOut_392_0;
              stackIn_393_1 = stackOut_392_1;
              stackIn_393_2 = stackOut_392_2;
              break L116;
            } else {
              stackOut_390_0 = (RuntimeException) (Object) stackIn_390_0;
              stackOut_390_1 = (StringBuilder) (Object) stackIn_390_1;
              stackOut_390_2 = "{...}";
              stackIn_393_0 = stackOut_390_0;
              stackIn_393_1 = stackOut_390_1;
              stackIn_393_2 = stackOut_390_2;
              break L116;
            }
          }
          L117: {
            stackOut_393_0 = (RuntimeException) (Object) stackIn_393_0;
            stackOut_393_1 = ((StringBuilder) (Object) stackIn_393_1).append(stackIn_393_2).append(',');
            stackIn_396_0 = stackOut_393_0;
            stackIn_396_1 = stackOut_393_1;
            stackIn_394_0 = stackOut_393_0;
            stackIn_394_1 = stackOut_393_1;
            if (param1 == null) {
              stackOut_396_0 = (RuntimeException) (Object) stackIn_396_0;
              stackOut_396_1 = (StringBuilder) (Object) stackIn_396_1;
              stackOut_396_2 = "null";
              stackIn_397_0 = stackOut_396_0;
              stackIn_397_1 = stackOut_396_1;
              stackIn_397_2 = stackOut_396_2;
              break L117;
            } else {
              stackOut_394_0 = (RuntimeException) (Object) stackIn_394_0;
              stackOut_394_1 = (StringBuilder) (Object) stackIn_394_1;
              stackOut_394_2 = "{...}";
              stackIn_397_0 = stackOut_394_0;
              stackIn_397_1 = stackOut_394_1;
              stackIn_397_2 = stackOut_394_2;
              break L117;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_397_0, stackIn_397_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean NA() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((gja) this).field_D != null) {
              var1_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var1_int >= ((gja) this).field_y) {
                      break L3;
                    } else {
                      ((gja) this).field_Z[var1_int] = ((gja) this).field_Z[var1_int] << 4;
                      ((gja) this).field_r[var1_int] = ((gja) this).field_r[var1_int] << 4;
                      ((gja) this).field_l[var1_int] = ((gja) this).field_l[var1_int] << 4;
                      var1_int++;
                      if (var2 != 0) {
                        break L2;
                      } else {
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  pb.field_k = 0;
                  uu.field_c = 0;
                  ina.field_a = 0;
                  break L2;
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
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
        return stackIn_12_0 != 0;
    }

    private final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 69 / ((param0 - 66) / 38);
                if ((55 & ((gja) this).field_h) != 0) {
                  break L2;
                } else {
                  if (((gja) this).field_E != null) {
                    ((gja) this).field_E.field_h = false;
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (null != ((gja) this).field_O) {
                ((gja) this).field_O.field_h = false;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.R(" + param0 + ')');
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (~var5_int <= ~((gja) this).field_I) {
                        break L5;
                      } else {
                        var6_int = ((gja) this).field_P[var5_int] & 65535;
                        var7_int = (var6_int & 65039) >> 10;
                        var8 = (var6_int & 951) >> 7;
                        stackOut_3_0 = 0;
                        stackOut_3_1 = ~param0;
                        stackIn_20_0 = stackOut_3_0;
                        stackIn_20_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (var10 != 0) {
                          L6: while (true) {
                            if (stackIn_20_0 <= stackIn_20_1) {
                              break L3;
                            } else {
                              var6 = ((gja) this).field_u[var5_int];
                              var7 = ((gja) this).field_nb[var5_int];
                              var7.field_h = -16777216 & var7.field_h | cla.field_m[65535 & ((gja) this).field_P[var6.field_m]] & 16777215;
                              var5_int++;
                              if (var10 != 0) {
                                break L2;
                              } else {
                                if (var10 == 0) {
                                  stackOut_19_0 = ((gja) this).field_L;
                                  stackOut_19_1 = var5_int;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          L7: {
                            if (stackIn_4_0 == stackIn_4_1) {
                              break L7;
                            } else {
                              var7_int = var7_int + (param3 * (-var7_int + param0) >> 7);
                              break L7;
                            }
                          }
                          L8: {
                            var9 = var6_int & 127;
                            if (param1 == -1) {
                              break L8;
                            } else {
                              var8 = var8 + (param3 * (-var8 + param1) >> 7);
                              break L8;
                            }
                          }
                          L9: {
                            if (-1 != param2) {
                              var9 = var9 - -((param2 + -var9) * param3 >> 7);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          ((gja) this).field_P[var5_int] = (short)fh.a(var9, fh.a(var8 << 7, var7_int << 10));
                          var5_int++;
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (((gja) this).field_u != null) {
                      var5_int = 0;
                      L10: while (true) {
                        stackOut_19_0 = ((gja) this).field_L;
                        stackOut_19_1 = var5_int;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (stackIn_20_0 <= stackIn_20_1) {
                          break L3;
                        } else {
                          var6 = ((gja) this).field_u[var5_int];
                          var7 = ((gja) this).field_nb[var5_int];
                          var7.field_h = -16777216 & var7.field_h | cla.field_m[65535 & ((gja) this).field_P[var6.field_m]] & 16777215;
                          var5_int++;
                          if (var10 != 0) {
                            break L2;
                          } else {
                            if (var10 == 0) {
                              continue L10;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  break L3;
                }
                this.e(0);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "gja.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
                  this.f(-913);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  qra.field_d = var5_ref.field_o * var6.field_q + var6.field_l * var5_ref.field_p + var6.field_o * var5_ref.field_h;
                  gj.field_h = var6.field_e * var5_ref.field_p + var5_ref.field_o * var6.field_n + var6.field_i * var5_ref.field_h + var5_ref.field_i;
                  var7 = qra.field_d * (float)((gja) this).field_o + gj.field_h;
                  var8 = gj.field_h + qra.field_d * (float)((gja) this).field_n;
                  if (var8 < var7) {
                    break L3;
                  } else {
                    var9 = var7 - (float)((gja) this).field_H;
                    var10 = var8 + (float)((gja) this).field_H;
                    if (var23 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = var8 - (float)((gja) this).field_H;
                var10 = (float)((gja) this).field_H + var7;
                break L2;
              }
              if (((gja) this).field_S.field_Cb > var9) {
                if ((float)((gja) this).field_S.field_D >= var10) {
                  return;
                } else {
                  L4: {
                    L5: {
                      vta.field_e = var6.field_q * var5_ref.field_l + var6.field_l * var5_ref.field_g + var6.field_o * var5_ref.field_f;
                      fba.field_a = var5_ref.field_e + (var6.field_i * var5_ref.field_f + (var6.field_n * var5_ref.field_l + var5_ref.field_g * var6.field_e));
                      var11 = fba.field_a + vta.field_e * (float)((gja) this).field_o;
                      var12 = (float)((gja) this).field_n * vta.field_e + fba.field_a;
                      if (var11 > var12) {
                        break L5;
                      } else {
                        var14 = (var12 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                        var13 = (var11 - (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                        if (var23 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = (float)((gja) this).field_S.field_Ic * (var12 - (float)((gja) this).field_H);
                    var14 = (float)((gja) this).field_S.field_Ic * ((float)((gja) this).field_H + var11);
                    break L4;
                  }
                  if (var13 / (float)param2 >= ((gja) this).field_S.field_uc) {
                    return;
                  } else {
                    if (var14 / (float)param2 > ((gja) this).field_S.field_f) {
                      L6: {
                        L7: {
                          tu.field_g = var5_ref.field_k * var6.field_e + var6.field_n * var5_ref.field_q + var6.field_i * var5_ref.field_m + var5_ref.field_n;
                          kb.field_p = var6.field_l * var5_ref.field_k + var6.field_q * var5_ref.field_q + var5_ref.field_m * var6.field_o;
                          var15 = tu.field_g + (float)((gja) this).field_o * kb.field_p;
                          var16 = tu.field_g + (float)((gja) this).field_n * kb.field_p;
                          if (var15 > var16) {
                            break L7;
                          } else {
                            var18 = (float)((gja) this).field_S.field_h * (var16 + (float)((gja) this).field_H);
                            var17 = ((float)(-((gja) this).field_H) + var15) * (float)((gja) this).field_S.field_h;
                            if (var23 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var17 = (float)((gja) this).field_S.field_h * (var16 - (float)((gja) this).field_H);
                        var18 = (var15 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_h;
                        break L6;
                      }
                      if (((gja) this).field_S.field_H <= var17 / (float)param2) {
                        return;
                      } else {
                        if (var18 / (float)param2 > ((gja) this).field_S.field_zc) {
                          L8: {
                            L9: {
                              if (null != param1) {
                                break L9;
                              } else {
                                if (null == ((gja) this).field_u) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            vs.field_O = var5_ref.field_k * var6.field_g + var6.field_k * var5_ref.field_q + var5_ref.field_m * var6.field_p;
                            wka.field_b = var5_ref.field_f * var6.field_h + (var6.field_f * var5_ref.field_g + var5_ref.field_l * var6.field_m);
                            pl.field_a = var6.field_g * var5_ref.field_p + var5_ref.field_o * var6.field_k + var6.field_p * var5_ref.field_h;
                            baa.field_c = var5_ref.field_f * var6.field_p + (var6.field_k * var5_ref.field_l + var5_ref.field_g * var6.field_g);
                            ct.field_b = var6.field_h * var5_ref.field_m + (var5_ref.field_q * var6.field_m + var6.field_f * var5_ref.field_k);
                            hs.field_c = var6.field_h * var5_ref.field_h + (var6.field_m * var5_ref.field_o + var5_ref.field_p * var6.field_f);
                            break L8;
                          }
                          L10: {
                            if (param1 == null) {
                              break L10;
                            } else {
                              var19 = ((gja) this).field_K + ((gja) this).field_i >> 1;
                              var20 = ((gja) this).field_Q + ((gja) this).field_cb >> 1;
                              var21 = (int)(hs.field_c * (float)var20 + (gj.field_h + pl.field_a * (float)var19 + qra.field_d * (float)((gja) this).field_o));
                              var22 = (int)((float)((gja) this).field_n * qra.field_d + (gj.field_h + (float)var19 * pl.field_a) + hs.field_c * (float)var20);
                              if (~var21 <= ~((gja) this).field_S.field_D) {
                                break L10;
                              } else {
                                if (var22 < ((gja) this).field_S.field_D) {
                                  break L10;
                                } else {
                                  break L10;
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
          L11: {
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
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L11;
            }
          }
          L12: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
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
              break L12;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param2 + ',' + param3 + ')');
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_ref = new kh(param0.a("logo.fo3d", (byte) 126, ""));
            var3 = var2_ref.h(255);
            var2_ref.h((byte) 119);
            ej.field_d = uea.a(var2_ref, (byte) 8);
            tfa.field_e = new int[var3][];
            cq.field_b = new an[var3];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3 >= ~var4) {
                    break L3;
                  } else {
                    cq.field_b[var4] = jo.a(var2_ref, true);
                    var4++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_ref.i((byte) 98);
                break L2;
              }
              var4 = param1;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 >= var3) {
                      break L6;
                    } else {
                      var5 = cq.field_b[var4];
                      var5.a(6, 6, 6, true, 1);
                      var5.a((byte) -120);
                      var6 = new int[]{var5.field_i + var5.field_z >> 1, var5.field_b + var5.field_m >> 1, var5.field_a + var5.field_p >> 1};
                      tfa.field_e[var4] = var6;
                      var5.a(-var6[2], -var6[0], (byte) -86, -var6[1]);
                      var4++;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("gja.M(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
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
              L2: {
                L3: {
                  if (var10 >= ((gja) this).field_W) {
                    break L3;
                  } else {
                    var11 = ((gja) this).field_Z[var10];
                    var12 = ((gja) this).field_r[var10];
                    stackOut_3_0 = ~var12;
                    stackOut_3_1 = ~var6;
                    stackIn_32_0 = stackOut_3_0;
                    stackIn_32_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 >= stackIn_4_1) {
                          break L4;
                        } else {
                          var6 = var12;
                          break L4;
                        }
                      }
                      L5: {
                        if (~var3 >= ~var12) {
                          break L5;
                        } else {
                          var3 = var12;
                          break L5;
                        }
                      }
                      L6: {
                        if (~var11 <= ~var2_int) {
                          break L6;
                        } else {
                          var2_int = var11;
                          break L6;
                        }
                      }
                      L7: {
                        var13 = ((gja) this).field_l[var10];
                        if (~var5 > ~var11) {
                          var5 = var11;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (var7 >= var13) {
                          break L8;
                        } else {
                          var7 = var13;
                          break L8;
                        }
                      }
                      L9: {
                        if (~var13 > ~var4) {
                          var4 = var13;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        var14 = var13 * var13 + var11 * var11;
                        if (~var14 < ~var8) {
                          var8 = var14;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var14 = var13 * var13 + var11 * var11 - -(var12 * var12);
                        if (~var14 < ~var9) {
                          var9 = var14;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var10++;
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((gja) this).field_Q = var7;
                ((gja) this).field_n = var6;
                ((gja) this).field_K = var5;
                ((gja) this).field_i = var2_int;
                ((gja) this).field_o = var3;
                ((gja) this).field_cb = var4;
                ((gja) this).field_H = (int)(Math.sqrt((double)var8) + 0.99);
                ((gja) this).field_A = true;
                stackOut_31_0 = param0;
                stackOut_31_1 = -913;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                break L2;
              }
              L12: {
                if (stackIn_32_0 == stackIn_32_1) {
                  break L12;
                } else {
                  ka discarded$1 = this.a((gja) null, true, (gja) null, false, -20, false);
                  break L12;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.IA(" + param0 + ')');
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
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_3_0 = null;
            Object stackOut_1_0 = null;
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
              if (param2 == 0) {
                nj.a(var3, 107, param0, param1);
                stackOut_3_0 = (byte[]) var3;
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
                return (byte[]) (Object) stackIn_2_0;
              }
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
                stackOut_7_1 = new StringBuilder().append("gja.K(").append(param0).append(',');
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
              throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
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
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
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
                if (param0 == 0) {
                  break L2;
                } else {
                  ka discarded$1 = ((gja) this).a((byte) -37, -100, true);
                  break L2;
                }
              }
              L3: {
                var2_ref = ((gja) this).field_g.field_d;
                var2_ref.a(param0 + 28, 6 * ((gja) this).field_v);
                var3 = var2_ref.a(true, (byte) -10);
                if (null == var3) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        var4 = ((gja) this).field_S.a(var3, 127);
                        if (!jaclib.memory.Stream.b()) {
                          break L6;
                        } else {
                          var5 = 0;
                          L7: while (true) {
                            L8: {
                              if (~var5 <= ~((gja) this).field_v) {
                                break L8;
                              } else {
                                var4.a((int) ((gja) this).field_M[var5]);
                                var4.a((int) ((gja) this).field_z[var5]);
                                var4.a((int) ((gja) this).field_V[var5]);
                                var5++;
                                if (var6 != 0) {
                                  break L4;
                                } else {
                                  if (var6 == 0) {
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var5 = 0;
                      L9: while (true) {
                        if (~var5 <= ~((gja) this).field_v) {
                          break L5;
                        } else {
                          var4.b((int) ((gja) this).field_M[var5]);
                          var4.b((int) ((gja) this).field_z[var5]);
                          var4.b((int) ((gja) this).field_V[var5]);
                          var5++;
                          if (var6 != 0) {
                            break L4;
                          } else {
                            if (var6 == 0) {
                              continue L9;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    var4.a();
                    break L4;
                  }
                  if (!var2_ref.a((byte) 95)) {
                    break L3;
                  } else {
                    ((gja) this).field_g.field_a = true;
                    ((gja) this).field_g.field_c = var2_ref;
                    ((gja) this).field_N = true;
                    stackOut_30_0 = 1;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0 != 0;
                  }
                }
              }
              stackOut_32_0 = 0;
              stackIn_33_0 = stackOut_32_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.B(" + param0 + ')');
        }
        return stackIn_33_0 != 0;
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
                      if (!ei.a(((gja) this).field_h, ((gja) this).field_Y, (byte) 27)) {
                        L2: {
                          var2_int = 0;
                          var3 = 0;
                          var4 = 0;
                          if (null == ((gja) this).field_Z) {
                            break L2;
                          } else {
                            if (!tp.a(((gja) this).field_h, (byte) 3, ((gja) this).field_Y)) {
                              L3: {
                                L4: {
                                  if (null == ((gja) this).field_ib) {
                                    break L4;
                                  } else {
                                    if (!((gja) this).field_ib.b(16440)) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                var2_int = 1;
                                if (!((gja) this).field_A) {
                                  this.f(-913);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              ((gja) this).field_N = true;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L5: {
                          if (null == ((gja) this).field_r) {
                            break L5;
                          } else {
                            if (!qr.c(458752, ((gja) this).field_h, ((gja) this).field_Y)) {
                              L6: {
                                L7: {
                                  if (null == ((gja) this).field_ib) {
                                    break L7;
                                  } else {
                                    if (!((gja) this).field_ib.b(16440)) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var3 = 1;
                                if (!((gja) this).field_A) {
                                  this.f(-913);
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              ((gja) this).field_N = true;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L8: {
                          if (((gja) this).field_l == null) {
                            break L8;
                          } else {
                            if (cu.a(-79, ((gja) this).field_Y, ((gja) this).field_h)) {
                              break L8;
                            } else {
                              L9: {
                                if (null == ((gja) this).field_ib) {
                                  break L9;
                                } else {
                                  if (((gja) this).field_ib.b(16440)) {
                                    break L9;
                                  } else {
                                    ((gja) this).field_N = true;
                                    if (var5 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (((gja) this).field_A) {
                                  break L10;
                                } else {
                                  this.f(-913);
                                  break L10;
                                }
                              }
                              var4 = 1;
                              break L8;
                            }
                          }
                        }
                        L11: {
                          if (var3 != 0) {
                            ((gja) this).field_r = null;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (var4 != 0) {
                            ((gja) this).field_l = null;
                            break L12;
                          } else {
                            break L12;
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
              L13: {
                if (((gja) this).field_db == null) {
                  break L13;
                } else {
                  if (((gja) this).field_Z != null) {
                    break L13;
                  } else {
                    if (null != ((gja) this).field_r) {
                      break L13;
                    } else {
                      if (((gja) this).field_l != null) {
                        break L13;
                      } else {
                        ((gja) this).field_J = null;
                        ((gja) this).field_db = null;
                        break L13;
                      }
                    }
                  }
                }
              }
              L14: {
                if (null == ((gja) this).field_w) {
                  break L14;
                } else {
                  if (dba.a(((gja) this).field_h, 98, ((gja) this).field_Y)) {
                    break L14;
                  } else {
                    L15: {
                      L16: {
                        if (0 == (55 & ((gja) this).field_h)) {
                          if (((gja) this).field_E == null) {
                            break L16;
                          } else {
                            if (!((gja) this).field_E.b(16440)) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        } else {
                          if (null == ((gja) this).field_O) {
                            break L16;
                          } else {
                            if (!((gja) this).field_O.b(16440)) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      ((gja) this).field_lb = null;
                      ((gja) this).field_p = null;
                      ((gja) this).field_m = null;
                      ((gja) this).field_w = null;
                      if (var5 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                    ((gja) this).field_N = true;
                    break L14;
                  }
                }
              }
              L17: {
                if (null == ((gja) this).field_P) {
                  break L17;
                } else {
                  if (!th.b(((gja) this).field_Y, 8, ((gja) this).field_h)) {
                    L18: {
                      if (((gja) this).field_E == null) {
                        break L18;
                      } else {
                        if (((gja) this).field_E.b(16440)) {
                          break L18;
                        } else {
                          ((gja) this).field_N = true;
                          if (var5 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    ((gja) this).field_P = null;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L19: {
                if (((gja) this).field_C == null) {
                  break L19;
                } else {
                  if (!jda.d(((gja) this).field_h, -28090, ((gja) this).field_Y)) {
                    L20: {
                      L21: {
                        if (null == ((gja) this).field_E) {
                          break L21;
                        } else {
                          if (!((gja) this).field_E.b(16440)) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      ((gja) this).field_C = null;
                      if (var5 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                    ((gja) this).field_N = true;
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L22: {
                if (null == ((gja) this).field_eb) {
                  break L22;
                } else {
                  if (!ov.a((byte) -96, ((gja) this).field_Y, ((gja) this).field_h)) {
                    L23: {
                      if (((gja) this).field_d == null) {
                        break L23;
                      } else {
                        if (((gja) this).field_d.b(16440)) {
                          break L23;
                        } else {
                          ((gja) this).field_N = true;
                          if (var5 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    ((gja) this).field_t = null;
                    ((gja) this).field_eb = null;
                    break L22;
                  } else {
                    break L22;
                  }
                }
              }
              L24: {
                if (((gja) this).field_gb == null) {
                  break L24;
                } else {
                  if (!uw.a(((gja) this).field_h, ((gja) this).field_Y, -102)) {
                    L25: {
                      if (null == ((gja) this).field_E) {
                        break L25;
                      } else {
                        if (((gja) this).field_E.b(16440)) {
                          break L25;
                        } else {
                          ((gja) this).field_N = true;
                          if (var5 == 0) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    ((gja) this).field_gb = null;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L26: {
                if (null == ((gja) this).field_M) {
                  break L26;
                } else {
                  if (kd.c(-58, ((gja) this).field_Y, ((gja) this).field_h)) {
                    break L26;
                  } else {
                    L27: {
                      L28: {
                        L29: {
                          if (((gja) this).field_g == null) {
                            break L29;
                          } else {
                            if (!((gja) this).field_g.a(false)) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        if (null == ((gja) this).field_E) {
                          break L27;
                        } else {
                          if (((gja) this).field_E.b(16440)) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      ((gja) this).field_N = true;
                      if (var5 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                    ((gja) this).field_z = null;
                    ((gja) this).field_M = null;
                    ((gja) this).field_V = null;
                    break L26;
                  }
                }
              }
              L30: {
                if (((gja) this).field_kb != null) {
                  L31: {
                    L32: {
                      if (((gja) this).field_ib == null) {
                        break L32;
                      } else {
                        if (!((gja) this).field_ib.b(16440)) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    ((gja) this).field_kb = null;
                    if (var5 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                  ((gja) this).field_N = true;
                  break L30;
                } else {
                  break L30;
                }
              }
              L33: {
                if (null == ((gja) this).field_G) {
                  break L33;
                } else {
                  L34: {
                    L35: {
                      if (((gja) this).field_E == null) {
                        break L35;
                      } else {
                        if (!((gja) this).field_E.b(16440)) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    ((gja) this).field_G = null;
                    if (var5 == 0) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                  ((gja) this).field_N = true;
                  break L33;
                }
              }
              L36: {
                if (null == ((gja) this).field_q) {
                  break L36;
                } else {
                  if (ofa.a(((gja) this).field_Y, ((gja) this).field_h, (byte) -126)) {
                    break L36;
                  } else {
                    ((gja) this).field_q = null;
                    ((gja) this).field_jb = null;
                    break L36;
                  }
                }
              }
              L37: {
                var2_int = -112 / ((47 - param0) / 41);
                if (((gja) this).field_D == null) {
                  break L37;
                } else {
                  if (!qr.d(((gja) this).field_Y, ((gja) this).field_h, 32)) {
                    ((gja) this).field_D = null;
                    ((gja) this).field_hb = null;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
              L38: {
                if (((gja) this).field_mb == null) {
                  break L38;
                } else {
                  if (ub.a(((gja) this).field_h, ((gja) this).field_Y, (byte) 21)) {
                    break L38;
                  } else {
                    ((gja) this).field_mb = null;
                    break L38;
                  }
                }
              }
              L39: {
                if (((gja) this).field_U == null) {
                  break L39;
                } else {
                  if ((2048 & ((gja) this).field_Y) != 0) {
                    break L39;
                  } else {
                    if ((262144 & ((gja) this).field_Y) == 0) {
                      ((gja) this).field_U = null;
                      ((gja) this).field_j = null;
                      ((gja) this).field_R = null;
                      break L39;
                    } else {
                      break L39;
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
          throw tba.a((Throwable) (Object) var2, "gja.GA(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_k = null;
              if (param0 == 3) {
                break L1;
              } else {
                field_x = 122;
                break L1;
              }
            }
            field_bb = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "gja.P(" + param0 + ')');
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
                  L2: {
                    if (!this.c((byte) 66)) {
                      break L2;
                    } else {
                      if (!this.h(0)) {
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            ((gja) this).field_S.a(-126, 0, ((gja) this).field_ib.field_e);
                            ((gja) this).field_S.a(-128, 1, ((gja) this).field_E.field_e);
                            ((gja) this).field_S.a(-127, 2, ((gja) this).field_d.field_e);
                            if ((55 & ((gja) this).field_h) == 0) {
                              break L4;
                            } else {
                              ((gja) this).field_S.d(0, true);
                              var2_int = 1;
                              ((gja) this).field_S.a(-127, 3, ((gja) this).field_O.field_e);
                              ((gja) this).field_S.a(((gja) this).field_S.field_nc, -32);
                              if (var7 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((gja) this).field_S.d(0, false);
                          var2_int = 0;
                          ((gja) this).field_S.a(((gja) this).field_S.field_ob, -32);
                          break L3;
                        }
                        var3 = 0;
                        L5: while (true) {
                          if (~var3 <= ~((gja) this).field_j.length) {
                            break L2;
                          } else {
                            var4 = ((gja) this).field_U[var3];
                            var5 = ((gja) this).field_U[var3 - -1];
                            var6 = ((gja) this).field_gb[var4] & 65535;
                            if (var7 != 0) {
                              break L1;
                            } else {
                              L6: {
                                if (var6 == 65535) {
                                  var6 = -1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              ((gja) this).field_S.a((byte) -80, var2_int != 0, true, var6);
                              ((gja) this).field_S.a(((gja) this).field_g.field_c, -19394, ((gja) this).field_j[var3], var4 * 3, fma.field_f, ((gja) this).field_R[var3], var5 + -var4);
                              var3++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  this.b(-46);
                  break L1;
                }
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
          throw tba.a((Throwable) (Object) var2, "gja.T(" + param0 + ')');
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
              L2: {
                L3: {
                  if (~((gja) this).field_W >= ~var4_int) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (param0 != 0) {
                          ((gja) this).field_Z[var4_int] = ((gja) this).field_Z[var4_int] + param0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (param1 != 0) {
                          ((gja) this).field_r[var4_int] = ((gja) this).field_r[var4_int] + param1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (0 == param2) {
                          break L6;
                        } else {
                          ((gja) this).field_l[var4_int] = ((gja) this).field_l[var4_int] + param2;
                          break L6;
                        }
                      }
                      var4_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(1);
                ((gja) this).field_A = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void wa() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var1_int <= ~((gja) this).field_y) {
                    break L3;
                  } else {
                    ((gja) this).field_Z[var1_int] = ((gja) this).field_Z[var1_int] + 7 >> 4;
                    ((gja) this).field_r[var1_int] = 7 + ((gja) this).field_r[var1_int] >> 4;
                    ((gja) this).field_l[var1_int] = 7 + ((gja) this).field_l[var1_int] >> 4;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(-121);
                ((gja) this).field_A = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.wa()");
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
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
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
        int stackOut_35_0 = 0;
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
            if (param0 == 66) {
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
                    L9: {
                      var7 = ((gja) this).field_ib.field_a;
                      boolean discarded$4 = var7.a(12 * ((gja) this).field_fb, 12, true);
                      var8 = var7.a(-15730, true);
                      if (var8 != null) {
                        break L9;
                      } else {
                        var6 = 0;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      ((gja) this).field_S.field_P.copyPositions(((gja) this).field_Z, ((gja) this).field_r, ((gja) this).field_l, ((gja) this).field_kb, 0, 12, ((gja) this).field_fb, var8.getAddress());
                      if (!var7.a(true)) {
                        break L10;
                      } else {
                        ((gja) this).field_ib.field_e = var7;
                        ((gja) this).field_ib.field_h = true;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var6 = 0;
                    break L7;
                  } else {
                    stackOut_41_0 = 1;
                    stackIn_42_0 = stackOut_41_0;
                    return stackIn_42_0 != 0;
                  }
                }
              }
              L11: {
                if (var2_int == 0) {
                  break L11;
                } else {
                  L12: {
                    if (null != ((gja) this).field_E.field_a) {
                      break L12;
                    } else {
                      ((gja) this).field_E.field_a = ((gja) this).field_S.c(param0 + -60, ((gja) this).field_F);
                      break L12;
                    }
                  }
                  L13: {
                    var7 = ((gja) this).field_E.field_a;
                    boolean discarded$5 = var7.a(((gja) this).field_fb * 4, 4, true);
                    var8 = var7.a(-15730, true);
                    if (var8 == null) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          if ((55 & ((gja) this).field_h) == 0) {
                            break L15;
                          } else {
                            ((gja) this).field_S.field_P.copyColours(((gja) this).field_P, ((gja) this).field_C, ((gja) this).field_gb, (int) ((gja) this).field_T, ((gja) this).field_G, 0, 4, ((gja) this).field_fb, var8.getAddress());
                            if (var13 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          L17: {
                            if (((gja) this).field_e != null) {
                              break L17;
                            } else {
                              var10 = ((gja) this).field_m;
                              var9 = ((gja) this).field_lb;
                              var12 = ((gja) this).field_w;
                              var11 = ((gja) this).field_p;
                              if (var13 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var11 = ((gja) this).field_e.field_e;
                          var9 = ((gja) this).field_e.field_a;
                          var10 = ((gja) this).field_e.field_c;
                          var12 = ((gja) this).field_e.field_b;
                          break L16;
                        }
                        ((gja) this).field_S.field_P.copyLighting(((gja) this).field_P, ((gja) this).field_C, ((gja) this).field_gb, var9, var10, var11, var12, (int) ((gja) this).field_T, (int) ((gja) this).field_ab, ((gja) this).field_G, 0, 4, ((gja) this).field_fb, var8.getAddress());
                        break L14;
                      }
                      L18: {
                        if (!var7.a(true)) {
                          break L18;
                        } else {
                          ((gja) this).field_E.field_h = true;
                          ((gja) this).field_E.field_e = var7;
                          if (var13 == 0) {
                            break L11;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var6 = 0;
                      if (var13 == 0) {
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var6 = 0;
                  break L11;
                }
              }
              L19: {
                if (var3 == 0) {
                  break L19;
                } else {
                  L20: {
                    if (null == ((gja) this).field_O.field_a) {
                      ((gja) this).field_O.field_a = ((gja) this).field_S.c(param0 ^ 68, ((gja) this).field_F);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    var7 = ((gja) this).field_O.field_a;
                    boolean discarded$6 = var7.a(((gja) this).field_fb * 12, 12, true);
                    var8 = var7.a(-15730, true);
                    if (var8 != null) {
                      break L21;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L19;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    L23: {
                      if (((gja) this).field_e != null) {
                        break L23;
                      } else {
                        var11 = ((gja) this).field_p;
                        var9 = ((gja) this).field_lb;
                        var10 = ((gja) this).field_m;
                        var12 = ((gja) this).field_w;
                        if (var13 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    var10 = ((gja) this).field_e.field_c;
                    var9 = ((gja) this).field_e.field_a;
                    var11 = ((gja) this).field_e.field_e;
                    var12 = ((gja) this).field_e.field_b;
                    break L22;
                  }
                  L24: {
                    ((gja) this).field_S.field_P.copyNormals(var9, var10, var11, var12, 3.0f / (float)((gja) this).field_ab, 3.0f / (float)(((gja) this).field_ab / 2 + ((gja) this).field_ab), 0, 12, ((gja) this).field_fb, var8.getAddress());
                    if (var7.a(true)) {
                      break L24;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L19;
                      } else {
                        break L24;
                      }
                    }
                  }
                  ((gja) this).field_O.field_e = var7;
                  ((gja) this).field_O.field_h = true;
                  break L19;
                }
              }
              L25: {
                if (var5 == 0) {
                  break L25;
                } else {
                  L26: {
                    if (((gja) this).field_d.field_a == null) {
                      ((gja) this).field_d.field_a = ((gja) this).field_S.c(6, ((gja) this).field_F);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    var7 = ((gja) this).field_d.field_a;
                    boolean discarded$7 = var7.a(((gja) this).field_fb * 8, 8, true);
                    var8 = var7.a(-15730, true);
                    if (null != var8) {
                      break L27;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    ((gja) this).field_S.field_P.copyTexCoords(((gja) this).field_eb, ((gja) this).field_t, 0, 8, ((gja) this).field_fb, var8.getAddress());
                    if (var7.a(true)) {
                      break L28;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L25;
                      } else {
                        break L28;
                      }
                    }
                  }
                  ((gja) this).field_d.field_h = true;
                  ((gja) this).field_d.field_e = var7;
                  break L25;
                }
              }
              stackOut_113_0 = var6;
              stackIn_114_0 = stackOut_113_0;
              break L0;
            } else {
              stackOut_35_0 = 0;
              stackIn_36_0 = stackOut_35_0;
              return stackIn_36_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.L(" + param0 + ')');
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
                  L4: {
                    L5: {
                      if (~var4 <= ~((gja) this).field_L) {
                        break L5;
                      } else {
                        var5 = ((gja) this).field_u[var4];
                        var6 = ((gja) this).field_nb[var4];
                        if (var15 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (!var5.field_e) {
                                break L7;
                              } else {
                                if (!((gja) this).field_S.f()) {
                                  break L7;
                                } else {
                                  if (var15 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
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
                            break L6;
                          }
                          var4++;
                          if (var15 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    ((gja) this).field_S.a(1, false, lja.field_j);
                    ((gja) this).field_S.a(lja.field_j, 1, -117);
                    break L4;
                  }
                  ((gja) this).field_S.a(true, 0);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.D(" + param0 + ')');
        }
    }

    private final void e(int param0) {
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
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                ((gja) this).I(-112, (int[]) null, 56, 86, -123, true, 104, (int[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "gja.HA(" + param0 + ')');
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
              L2: {
                L3: {
                  if (var4_int >= ((gja) this).field_W) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (param0 == 128) {
                          break L4;
                        } else {
                          ((gja) this).field_Z[var4_int] = ((gja) this).field_Z[var4_int] * param0 >> 7;
                          break L4;
                        }
                      }
                      L5: {
                        if (128 != param1) {
                          ((gja) this).field_r[var4_int] = ((gja) this).field_r[var4_int] * param1 >> 7;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (param2 != 128) {
                          ((gja) this).field_l[var4_int] = param2 * ((gja) this).field_l[var4_int] >> 7;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var4_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(11);
                ((gja) this).field_A = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void FA(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
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
              L2: {
                L3: {
                  if (~var4 <= ~((gja) this).field_W) {
                    break L3;
                  } else {
                    var5 = -(((gja) this).field_l[var4] * var2_int) + var3 * ((gja) this).field_r[var4] >> 14;
                    ((gja) this).field_l[var4] = ((gja) this).field_l[var4] * var3 + ((gja) this).field_r[var4] * var2_int >> 14;
                    ((gja) this).field_r[var4] = var5;
                    var4++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(94);
                ((gja) this).field_A = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "gja.FA(" + param0 + ')');
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
        int stackIn_41_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_40_0 = 0;
        boolean stackOut_51_0 = false;
        L0: {
          L1: {
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
              break L1;
            } else {
              param0.field_f = true;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param0.field_f = ((gja) this).field_f;
          break L0;
        }
        L2: {
          L3: {
            L4: {
              param0.field_T = ((gja) this).field_T;
              param0.field_v = ((gja) this).field_v;
              var7_int = ir.a(param4, ((gja) this).field_h, (byte) -100) ? 1 : 0;
              var8 = cga.a(param4, -62, ((gja) this).field_h) ? 1 : 0;
              var9 = er.c(param4, ((gja) this).field_h, 52) ? 1 : 0;
              var10 = var8 | var7_int | var9;
              if (var10 != 0) {
                break L4;
              } else {
                param0.field_Z = ((gja) this).field_Z;
                param0.field_r = ((gja) this).field_r;
                param0.field_l = ((gja) this).field_l;
                if (var13 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                if (var7_int != 0) {
                  break L6;
                } else {
                  param0.field_Z = ((gja) this).field_Z;
                  if (var13 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (null == param2.field_Z) {
                  break L7;
                } else {
                  if (~param2.field_Z.length > ~((gja) this).field_y) {
                    break L7;
                  } else {
                    param0.field_Z = param2.field_Z;
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              param2.field_Z = new int[((gja) this).field_y];
              param0.field_Z = new int[((gja) this).field_y];
              break L5;
            }
            L8: {
              L9: {
                if (var8 == 0) {
                  break L9;
                } else {
                  L10: {
                    L11: {
                      if (param2.field_r == null) {
                        break L11;
                      } else {
                        if (((gja) this).field_y <= param2.field_r.length) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    param2.field_r = new int[((gja) this).field_y];
                    param0.field_r = new int[((gja) this).field_y];
                    if (var13 == 0) {
                      break L8;
                    } else {
                      break L10;
                    }
                  }
                  param0.field_r = param2.field_r;
                  if (var13 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              param0.field_r = ((gja) this).field_r;
              break L8;
            }
            L12: {
              L13: {
                if (var9 != 0) {
                  break L13;
                } else {
                  param0.field_l = ((gja) this).field_l;
                  if (var13 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                L15: {
                  if (param2.field_l == null) {
                    break L15;
                  } else {
                    if (~param2.field_l.length <= ~((gja) this).field_y) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                param2.field_l = new int[((gja) this).field_y];
                param0.field_l = new int[((gja) this).field_y];
                if (var13 == 0) {
                  break L12;
                } else {
                  break L14;
                }
              }
              param0.field_l = param2.field_l;
              break L12;
            }
            var11 = 0;
            L16: while (true) {
              if (~((gja) this).field_y >= ~var11) {
                break L3;
              } else {
                stackOut_40_0 = var7_int;
                stackIn_52_0 = stackOut_40_0;
                stackIn_41_0 = stackOut_40_0;
                if (var13 != 0) {
                  break L2;
                } else {
                  L17: {
                    if (stackIn_41_0 != 0) {
                      param0.field_Z[var11] = ((gja) this).field_Z[var11];
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var8 == 0) {
                      break L18;
                    } else {
                      param0.field_r[var11] = ((gja) this).field_r[var11];
                      break L18;
                    }
                  }
                  L19: {
                    if (var9 != 0) {
                      param0.field_l[var11] = ((gja) this).field_l[var11];
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var11++;
                  if (var13 == 0) {
                    continue L16;
                  } else {
                    break L3;
                  }
                }
              }
            }
          }
          stackOut_51_0 = uu.a(true, param4, ((gja) this).field_h);
          stackIn_52_0 = stackOut_51_0 ? 1 : 0;
          break L2;
        }
        L20: {
          L21: {
            if (stackIn_52_0 != 0) {
              break L21;
            } else {
              L22: {
                if (ss.a((byte) 114, ((gja) this).field_h, param4)) {
                  break L22;
                } else {
                  param0.field_ib = null;
                  if (var13 == 0) {
                    break L20;
                  } else {
                    break L22;
                  }
                }
              }
              param0.field_ib = ((gja) this).field_ib;
              if (var13 == 0) {
                break L20;
              } else {
                break L21;
              }
            }
          }
          param0.field_ib = param2.field_ib;
          param0.field_ib.field_h = ((gja) this).field_ib.field_h;
          param0.field_ib.field_b = true;
          param0.field_ib.field_e = ((gja) this).field_ib.field_e;
          break L20;
        }
        L23: {
          L24: {
            L25: {
              L26: {
                if (bqa.a(540800, param4, ((gja) this).field_h)) {
                  break L26;
                } else {
                  param0.field_P = ((gja) this).field_P;
                  if (var13 == 0) {
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              L27: {
                L28: {
                  if (param2.field_P == null) {
                    break L28;
                  } else {
                    if (~((gja) this).field_I < ~param2.field_P.length) {
                      break L28;
                    } else {
                      param0.field_P = param2.field_P;
                      if (var13 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                param2.field_P = new short[((gja) this).field_I];
                param0.field_P = new short[((gja) this).field_I];
                break L27;
              }
              var11 = 0;
              L29: while (true) {
                if (~var11 <= ~((gja) this).field_I) {
                  break L25;
                } else {
                  param0.field_P[var11] = ((gja) this).field_P[var11];
                  var11++;
                  if (var13 != 0) {
                    break L24;
                  } else {
                    if (var13 == 0) {
                      continue L29;
                    } else {
                      break L25;
                    }
                  }
                }
              }
            }
            if (!go.d(((gja) this).field_h, param4, 26205)) {
              break L24;
            } else {
              L30: {
                L31: {
                  L32: {
                    if (null == param2.field_C) {
                      break L32;
                    } else {
                      if (~param2.field_C.length <= ~((gja) this).field_I) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  param2.field_C = new byte[((gja) this).field_I];
                  param0.field_C = new byte[((gja) this).field_I];
                  if (var13 == 0) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
                param0.field_C = param2.field_C;
                break L30;
              }
              var11 = 0;
              L33: while (true) {
                L34: {
                  if (var11 >= ((gja) this).field_I) {
                    break L34;
                  } else {
                    param0.field_C[var11] = ((gja) this).field_C[var11];
                    var11++;
                    if (var13 != 0) {
                      break L23;
                    } else {
                      if (var13 == 0) {
                        continue L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                if (var13 == 0) {
                  break L23;
                } else {
                  break L24;
                }
              }
            }
          }
          param0.field_C = ((gja) this).field_C;
          break L23;
        }
        L35: {
          L36: {
            if (!no.a(((gja) this).field_h, param4, 36864)) {
              break L36;
            } else {
              param0.field_E = param2.field_E;
              param0.field_E.field_h = ((gja) this).field_E.field_h;
              param0.field_E.field_b = true;
              param0.field_E.field_e = ((gja) this).field_E.field_e;
              if (var13 == 0) {
                break L35;
              } else {
                break L36;
              }
            }
          }
          L37: {
            if (!lf.a(((gja) this).field_h, param4, 128)) {
              break L37;
            } else {
              param0.field_E = ((gja) this).field_E;
              if (var13 == 0) {
                break L35;
              } else {
                break L37;
              }
            }
          }
          param0.field_E = null;
          break L35;
        }
        L38: {
          L39: {
            if (!kaa.a(((gja) this).field_h, param4, param1)) {
              break L39;
            } else {
              L40: {
                L41: {
                  L42: {
                    if (null == param2.field_lb) {
                      break L42;
                    } else {
                      if (~((gja) this).field_fb >= ~param2.field_lb.length) {
                        break L41;
                      } else {
                        break L42;
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
                  if (var13 == 0) {
                    break L40;
                  } else {
                    break L41;
                  }
                }
                param0.field_p = param2.field_p;
                param0.field_lb = param2.field_lb;
                param0.field_m = param2.field_m;
                break L40;
              }
              L43: {
                L44: {
                  L45: {
                    if (null == ((gja) this).field_e) {
                      break L45;
                    } else {
                      L46: {
                        if (param2.field_e == null) {
                          param2.field_e = new mca();
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                      L47: {
                        L48: {
                          mca fieldTemp$2 = param2.field_e;
                          param0.field_e = param2.field_e;
                          var11_ref_mca = fieldTemp$2;
                          if (var11_ref_mca.field_a == null) {
                            break L48;
                          } else {
                            if (var11_ref_mca.field_a.length < ((gja) this).field_fb) {
                              break L48;
                            } else {
                              break L47;
                            }
                          }
                        }
                        var12 = ((gja) this).field_fb;
                        var11_ref_mca.field_a = new short[var12];
                        var11_ref_mca.field_e = new short[var12];
                        var11_ref_mca.field_b = new byte[var12];
                        var11_ref_mca.field_c = new short[var12];
                        break L47;
                      }
                      var12 = 0;
                      L49: while (true) {
                        L50: {
                          if (((gja) this).field_fb <= var12) {
                            break L50;
                          } else {
                            param0.field_lb[var12] = ((gja) this).field_lb[var12];
                            param0.field_m[var12] = ((gja) this).field_m[var12];
                            param0.field_p[var12] = ((gja) this).field_p[var12];
                            var11_ref_mca.field_a[var12] = ((gja) this).field_e.field_a[var12];
                            var11_ref_mca.field_c[var12] = ((gja) this).field_e.field_c[var12];
                            var11_ref_mca.field_e[var12] = ((gja) this).field_e.field_e[var12];
                            var11_ref_mca.field_b[var12] = ((gja) this).field_e.field_b[var12];
                            var12++;
                            if (var13 != 0) {
                              break L43;
                            } else {
                              if (var13 == 0) {
                                continue L49;
                              } else {
                                break L50;
                              }
                            }
                          }
                        }
                        if (var13 == 0) {
                          break L44;
                        } else {
                          break L45;
                        }
                      }
                    }
                  }
                  param0.field_e = null;
                  var11 = 0;
                  L51: while (true) {
                    if (~var11 <= ~((gja) this).field_fb) {
                      break L44;
                    } else {
                      param0.field_lb[var11] = ((gja) this).field_lb[var11];
                      param0.field_m[var11] = ((gja) this).field_m[var11];
                      param0.field_p[var11] = ((gja) this).field_p[var11];
                      var11++;
                      if (var13 != 0) {
                        break L43;
                      } else {
                        if (var13 == 0) {
                          continue L51;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                }
                param0.field_w = ((gja) this).field_w;
                break L43;
              }
              if (var13 == 0) {
                break L38;
              } else {
                break L39;
              }
            }
          }
          param0.field_p = ((gja) this).field_p;
          param0.field_m = ((gja) this).field_m;
          param0.field_w = ((gja) this).field_w;
          param0.field_e = ((gja) this).field_e;
          param0.field_lb = ((gja) this).field_lb;
          break L38;
        }
        L52: {
          L53: {
            if (oba.c(param4, ((gja) this).field_h, -19531)) {
              break L53;
            } else {
              L54: {
                if (!vta.a(((gja) this).field_h, param4, 2048)) {
                  break L54;
                } else {
                  param0.field_O = ((gja) this).field_O;
                  if (var13 == 0) {
                    break L52;
                  } else {
                    break L54;
                  }
                }
              }
              param0.field_O = null;
              if (var13 == 0) {
                break L52;
              } else {
                break L53;
              }
            }
          }
          param0.field_O = param2.field_O;
          param0.field_O.field_h = ((gja) this).field_O.field_h;
          param0.field_O.field_e = ((gja) this).field_O.field_e;
          param0.field_O.field_b = true;
          break L52;
        }
        L55: {
          L56: {
            if (!uk.a(((gja) this).field_h, (byte) -47, param4)) {
              break L56;
            } else {
              L57: {
                L58: {
                  L59: {
                    if (param2.field_eb == null) {
                      break L59;
                    } else {
                      if (~((gja) this).field_I >= ~param2.field_eb.length) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                  var11 = ((gja) this).field_fb;
                  param2.field_t = new float[var11];
                  param0.field_t = new float[var11];
                  param2.field_eb = new float[var11];
                  param0.field_eb = new float[var11];
                  if (var13 == 0) {
                    break L57;
                  } else {
                    break L58;
                  }
                }
                param0.field_eb = param2.field_eb;
                param0.field_t = param2.field_t;
                break L57;
              }
              var11 = 0;
              L60: while (true) {
                L61: {
                  if (((gja) this).field_fb <= var11) {
                    break L61;
                  } else {
                    param0.field_eb[var11] = ((gja) this).field_eb[var11];
                    param0.field_t[var11] = ((gja) this).field_t[var11];
                    var11++;
                    if (var13 != 0) {
                      break L55;
                    } else {
                      if (var13 == 0) {
                        continue L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                }
                if (var13 == 0) {
                  break L55;
                } else {
                  break L56;
                }
              }
            }
          }
          param0.field_t = ((gja) this).field_t;
          param0.field_eb = ((gja) this).field_eb;
          break L55;
        }
        L62: {
          L63: {
            if (!pr.a(param4, -23611, ((gja) this).field_h)) {
              break L63;
            } else {
              param0.field_d = param2.field_d;
              param0.field_d.field_e = ((gja) this).field_d.field_e;
              param0.field_d.field_h = ((gja) this).field_d.field_h;
              param0.field_d.field_b = true;
              if (var13 == 0) {
                break L62;
              } else {
                break L63;
              }
            }
          }
          L64: {
            if (foa.a(param4, ((gja) this).field_h, 0)) {
              break L64;
            } else {
              param0.field_d = null;
              if (var13 == 0) {
                break L62;
              } else {
                break L64;
              }
            }
          }
          param0.field_d = ((gja) this).field_d;
          break L62;
        }
        L65: {
          L66: {
            if (!pca.b(((gja) this).field_h, 71, param4)) {
              break L66;
            } else {
              L67: {
                L68: {
                  if (null == param2.field_M) {
                    break L68;
                  } else {
                    if (~param2.field_M.length > ~((gja) this).field_I) {
                      break L68;
                    } else {
                      param0.field_z = param2.field_z;
                      param0.field_M = param2.field_M;
                      param0.field_V = param2.field_V;
                      if (var13 == 0) {
                        break L67;
                      } else {
                        break L68;
                      }
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
                break L67;
              }
              var11 = 0;
              L69: while (true) {
                L70: {
                  if (((gja) this).field_I <= var11) {
                    break L70;
                  } else {
                    param0.field_M[var11] = ((gja) this).field_M[var11];
                    param0.field_z[var11] = ((gja) this).field_z[var11];
                    param0.field_V[var11] = ((gja) this).field_V[var11];
                    var11++;
                    if (var13 != 0) {
                      break L65;
                    } else {
                      if (var13 == 0) {
                        continue L69;
                      } else {
                        break L70;
                      }
                    }
                  }
                }
                if (var13 == 0) {
                  break L65;
                } else {
                  break L66;
                }
              }
            }
          }
          param0.field_z = ((gja) this).field_z;
          param0.field_V = ((gja) this).field_V;
          param0.field_M = ((gja) this).field_M;
          break L65;
        }
        L71: {
          L72: {
            if (uu.a(param4, ((gja) this).field_h, (byte) -116)) {
              break L72;
            } else {
              L73: {
                if (ag.b(-1, param4, ((gja) this).field_h)) {
                  break L73;
                } else {
                  param0.field_g = null;
                  if (var13 == 0) {
                    break L71;
                  } else {
                    break L73;
                  }
                }
              }
              param0.field_g = ((gja) this).field_g;
              if (var13 == 0) {
                break L71;
              } else {
                break L72;
              }
            }
          }
          param0.field_g = param2.field_g;
          param0.field_g.field_g = true;
          param0.field_g.field_a = ((gja) this).field_g.field_a;
          param0.field_g.field_c = ((gja) this).field_g.field_c;
          break L71;
        }
        L74: {
          L75: {
            if (!fua.a(98, param4, ((gja) this).field_h)) {
              break L75;
            } else {
              L76: {
                L77: {
                  if (param2.field_gb == null) {
                    break L77;
                  } else {
                    if (~param2.field_gb.length > ~((gja) this).field_I) {
                      break L77;
                    } else {
                      param0.field_gb = param2.field_gb;
                      if (var13 == 0) {
                        break L76;
                      } else {
                        break L77;
                      }
                    }
                  }
                }
                var11 = ((gja) this).field_I;
                param2.field_gb = new short[var11];
                param0.field_gb = new short[var11];
                break L76;
              }
              var11 = 0;
              L78: while (true) {
                L79: {
                  if (((gja) this).field_I <= var11) {
                    break L79;
                  } else {
                    param0.field_gb[var11] = ((gja) this).field_gb[var11];
                    var11++;
                    if (var13 != 0) {
                      break L74;
                    } else {
                      if (var13 == 0) {
                        continue L78;
                      } else {
                        break L79;
                      }
                    }
                  }
                }
                if (var13 == 0) {
                  break L74;
                } else {
                  break L75;
                }
              }
            }
          }
          param0.field_gb = ((gja) this).field_gb;
          break L74;
        }
        L80: {
          L81: {
            L82: {
              if (hk.a(param4, ((gja) this).field_h, -93)) {
                break L82;
              } else {
                param0.field_nb = ((gja) this).field_nb;
                if (var13 == 0) {
                  break L81;
                } else {
                  break L82;
                }
              }
            }
            L83: {
              if (param2.field_nb == null) {
                break L83;
              } else {
                if (((gja) this).field_L > param2.field_nb.length) {
                  break L83;
                } else {
                  param0.field_nb = param2.field_nb;
                  var11 = 0;
                  L84: while (true) {
                    L85: {
                      if (~var11 <= ~((gja) this).field_L) {
                        break L85;
                      } else {
                        param0.field_nb[var11].a((byte) -81, ((gja) this).field_nb[var11]);
                        var11++;
                        if (var13 != 0) {
                          break L81;
                        } else {
                          if (var13 == 0) {
                            continue L84;
                          } else {
                            break L85;
                          }
                        }
                      }
                    }
                    if (var13 == 0) {
                      break L81;
                    } else {
                      break L83;
                    }
                  }
                }
              }
            }
            var11 = ((gja) this).field_L;
            param2.field_nb = new gca[var11];
            param0.field_nb = new gca[var11];
            var12 = 0;
            L86: while (true) {
              if (((gja) this).field_L <= var12) {
                break L81;
              } else {
                param0.field_nb[var12] = ((gja) this).field_nb[var12].a(6);
                var12++;
                if (var13 != 0) {
                  break L80;
                } else {
                  if (var13 == 0) {
                    continue L86;
                  } else {
                    break L81;
                  }
                }
              }
            }
          }
          L87: {
            if (!param1) {
              break L87;
            } else {
              short discarded$3 = this.a(119, -102, -0.9161184430122375f, 115, -91, 115, -41L, -82, 0.9345446825027466f, false, (oc) null);
              break L87;
            }
          }
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
          break L80;
        }
        L88: {
          L89: {
            if (!((gja) this).field_A) {
              break L89;
            } else {
              param0.field_H = ((gja) this).field_H;
              param0.field_o = ((gja) this).field_o;
              param0.field_cb = ((gja) this).field_cb;
              param0.field_i = ((gja) this).field_i;
              param0.field_K = ((gja) this).field_K;
              param0.field_A = true;
              param0.field_Q = ((gja) this).field_Q;
              param0.field_n = ((gja) this).field_n;
              if (var13 == 0) {
                break L88;
              } else {
                break L89;
              }
            }
          }
          param0.field_A = false;
          break L88;
        }
        return (ka) (Object) param0;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_216_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        RuntimeException stackIn_290_0 = null;
        StringBuilder stackIn_290_1 = null;
        RuntimeException stackIn_292_0 = null;
        StringBuilder stackIn_292_1 = null;
        RuntimeException stackIn_293_0 = null;
        StringBuilder stackIn_293_1 = null;
        String stackIn_293_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_189_0 = 0;
        int stackOut_189_1 = 0;
        int stackOut_228_0 = 0;
        int stackOut_228_1 = 0;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_216_0 = 0;
        int stackOut_216_1 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_173_1 = 0;
        int stackOut_149_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_165_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_289_0 = null;
        StringBuilder stackOut_289_1 = null;
        RuntimeException stackOut_292_0 = null;
        StringBuilder stackOut_292_1 = null;
        String stackOut_292_2 = null;
        RuntimeException stackOut_290_0 = null;
        StringBuilder stackOut_290_1 = null;
        String stackOut_290_2 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8_int = param1.length;
            if (0 != param0) {
              if (param0 == 1) {
                param3 = param3 << 4;
                param2 = param2 << 4;
                param4 = param4 << 4;
                var9 = 0;
                L1: while (true) {
                  L2: {
                    if (var8_int <= var9) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          var10 = param1[var9];
                          if (((gja) this).field_D.length > var10) {
                            var11 = ((gja) this).field_D[var10];
                            var12 = 0;
                            L5: while (true) {
                              if (~var12 <= ~var11.length) {
                                break L4;
                              } else {
                                var13_int = var11[var12];
                                ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] + param2;
                                ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] + param3;
                                ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] + param4;
                                var12++;
                                if (var21 != 0) {
                                  break L3;
                                } else {
                                  if (var21 == 0) {
                                    continue L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var9++;
                        break L3;
                      }
                      if (var21 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (2 != param0) {
                  if (param0 == 3) {
                    var9 = 0;
                    L6: while (true) {
                      L7: {
                        if (var8_int <= var9) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              var10 = param1[var9];
                              if (~var10 > ~((gja) this).field_D.length) {
                                var11 = ((gja) this).field_D[var10];
                                var12 = 0;
                                L10: while (true) {
                                  if (~var12 <= ~var11.length) {
                                    break L9;
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
                                    if (var21 != 0) {
                                      break L8;
                                    } else {
                                      if (var21 == 0) {
                                        continue L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            var9++;
                            break L8;
                          }
                          if (var21 == 0) {
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (param0 != 5) {
                      if (param0 == 7) {
                        L11: {
                          if (null != ((gja) this).field_q) {
                            var9 = 0;
                            var10 = 0;
                            L12: while (true) {
                              L13: {
                                L14: {
                                  L15: {
                                    if (~var10 <= ~var8_int) {
                                      break L15;
                                    } else {
                                      var11_int = param1[var10];
                                      stackOut_189_0 = ((gja) this).field_q.length;
                                      stackOut_189_1 = var11_int;
                                      stackIn_229_0 = stackOut_189_0;
                                      stackIn_229_1 = stackOut_189_1;
                                      stackIn_190_0 = stackOut_189_0;
                                      stackIn_190_1 = stackOut_189_1;
                                      if (var21 != 0) {
                                        L16: while (true) {
                                          if (stackIn_229_0 <= stackIn_229_1) {
                                            break L13;
                                          } else {
                                            var11_ref = ((gja) this).field_u[var10];
                                            var12_ref_gca = ((gja) this).field_nb[var10];
                                            var12_ref_gca.field_h = 16777215 & cla.field_m[((gja) this).field_P[var11_ref.field_m] & 65535] | var12_ref_gca.field_h & -16777216;
                                            var10++;
                                            if (var21 != 0) {
                                              break L11;
                                            } else {
                                              if (var21 == 0) {
                                                stackOut_228_0 = ~var10;
                                                stackOut_228_1 = ~((gja) this).field_L;
                                                stackIn_229_0 = stackOut_228_0;
                                                stackIn_229_1 = stackOut_228_1;
                                                continue L16;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L17: {
                                          if (stackIn_190_0 > stackIn_190_1) {
                                            var12_ref_int__ = ((gja) this).field_q[var11_int];
                                            var13_int = 0;
                                            L18: while (true) {
                                              L19: {
                                                L20: {
                                                  if (~var13_int <= ~var12_ref_int__.length) {
                                                    break L20;
                                                  } else {
                                                    var14 = var12_ref_int__[var13_int];
                                                    var15 = ((gja) this).field_P[var14] & 65535;
                                                    var16 = 63 & var15 >> 10;
                                                    var17 = (var15 & 1004) >> 7;
                                                    var18 = 127 & var15;
                                                    var16 = 63 & param2 + var16;
                                                    var17 = var17 + param3 / 4;
                                                    stackOut_196_0 = 0;
                                                    stackOut_196_1 = var17;
                                                    stackIn_215_0 = stackOut_196_0;
                                                    stackIn_215_1 = stackOut_196_1;
                                                    stackIn_197_0 = stackOut_196_0;
                                                    stackIn_197_1 = stackOut_196_1;
                                                    if (var21 != 0) {
                                                      break L19;
                                                    } else {
                                                      L21: {
                                                        L22: {
                                                          if (stackIn_197_0 <= stackIn_197_1) {
                                                            break L22;
                                                          } else {
                                                            var17 = 0;
                                                            if (var21 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        if (var17 <= 7) {
                                                          break L21;
                                                        } else {
                                                          var17 = 7;
                                                          break L21;
                                                        }
                                                      }
                                                      L23: {
                                                        L24: {
                                                          var18 = var18 + param4;
                                                          if (0 <= var18) {
                                                            break L24;
                                                          } else {
                                                            var18 = 0;
                                                            if (var21 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        if (var18 > 127) {
                                                          var18 = 127;
                                                          break L23;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                      ((gja) this).field_P[var14] = (short)fh.a(fh.a(var17 << 7, var16 << 10), var18);
                                                      var13_int++;
                                                      if (var21 == 0) {
                                                        continue L18;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_214_0 = var9;
                                                stackOut_214_1 = ~var12_ref_int__.length;
                                                stackIn_215_0 = stackOut_214_0;
                                                stackIn_215_1 = stackOut_214_1;
                                                break L19;
                                              }
                                              L25: {
                                                stackOut_215_0 = stackIn_215_0;
                                                stackIn_218_0 = stackOut_215_0;
                                                stackIn_216_0 = stackOut_215_0;
                                                if (stackIn_215_1 >= -1) {
                                                  stackOut_218_0 = stackIn_218_0;
                                                  stackOut_218_1 = 0;
                                                  stackIn_219_0 = stackOut_218_0;
                                                  stackIn_219_1 = stackOut_218_1;
                                                  break L25;
                                                } else {
                                                  stackOut_216_0 = stackIn_216_0;
                                                  stackOut_216_1 = 1;
                                                  stackIn_219_0 = stackOut_216_0;
                                                  stackIn_219_1 = stackOut_216_1;
                                                  break L25;
                                                }
                                              }
                                              var9 = stackIn_219_0 | stackIn_219_1;
                                              break L17;
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var10++;
                                        if (var21 == 0) {
                                          continue L12;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  if (var9 == 0) {
                                    break L11;
                                  } else {
                                    if (((gja) this).field_u != null) {
                                      var10 = 0;
                                      L26: while (true) {
                                        stackOut_228_0 = ~var10;
                                        stackOut_228_1 = ~((gja) this).field_L;
                                        stackIn_229_0 = stackOut_228_0;
                                        stackIn_229_1 = stackOut_228_1;
                                        if (stackIn_229_0 <= stackIn_229_1) {
                                          break L13;
                                        } else {
                                          var11_ref = ((gja) this).field_u[var10];
                                          var12_ref_gca = ((gja) this).field_nb[var10];
                                          var12_ref_gca.field_h = 16777215 & cla.field_m[((gja) this).field_P[var11_ref.field_m] & 65535] | var12_ref_gca.field_h & -16777216;
                                          var10++;
                                          if (var21 != 0) {
                                            break L11;
                                          } else {
                                            if (var21 == 0) {
                                              continue L26;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                break L13;
                              }
                              this.e(0);
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        return;
                      } else {
                        if (param0 == 8) {
                          L27: {
                            if (((gja) this).field_mb == null) {
                              break L27;
                            } else {
                              var9 = 0;
                              L28: while (true) {
                                if (~var9 <= ~var8_int) {
                                  break L27;
                                } else {
                                  L29: {
                                    L30: {
                                      var10 = param1[var9];
                                      if (~((gja) this).field_mb.length >= ~var10) {
                                        break L30;
                                      } else {
                                        var11 = ((gja) this).field_mb[var10];
                                        var12 = 0;
                                        L31: while (true) {
                                          if (~var12 <= ~var11.length) {
                                            break L30;
                                          } else {
                                            var13 = ((gja) this).field_nb[var11[var12]];
                                            var13.field_b = var13.field_b + param3;
                                            var13.field_e = var13.field_e + param2;
                                            var12++;
                                            if (var21 != 0) {
                                              break L29;
                                            } else {
                                              if (var21 == 0) {
                                                continue L31;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var9++;
                                    break L29;
                                  }
                                  if (var21 == 0) {
                                    continue L28;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          if (10 == param0) {
                            L32: {
                              if (((gja) this).field_mb != null) {
                                var9 = 0;
                                L33: while (true) {
                                  if (var8_int <= var9) {
                                    break L32;
                                  } else {
                                    L34: {
                                      L35: {
                                        var10 = param1[var9];
                                        if (~var10 <= ~((gja) this).field_mb.length) {
                                          break L35;
                                        } else {
                                          var11 = ((gja) this).field_mb[var10];
                                          var12 = 0;
                                          L36: while (true) {
                                            if (~var11.length >= ~var12) {
                                              break L35;
                                            } else {
                                              var13 = ((gja) this).field_nb[var11[var12]];
                                              var13.field_k = param3 * var13.field_k >> 7;
                                              var13.field_m = var13.field_m * param2 >> 7;
                                              var12++;
                                              if (var21 != 0) {
                                                break L34;
                                              } else {
                                                if (var21 == 0) {
                                                  continue L36;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var9++;
                                      break L34;
                                    }
                                    if (var21 == 0) {
                                      continue L33;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                              } else {
                                break L32;
                              }
                            }
                            return;
                          } else {
                            if (9 != param0) {
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              L37: {
                                if (null == ((gja) this).field_mb) {
                                  break L37;
                                } else {
                                  var9 = 0;
                                  L38: while (true) {
                                    if (var8_int <= var9) {
                                      break L37;
                                    } else {
                                      L39: {
                                        L40: {
                                          var10 = param1[var9];
                                          if (~((gja) this).field_mb.length < ~var10) {
                                            var11 = ((gja) this).field_mb[var10];
                                            var12 = 0;
                                            L41: while (true) {
                                              if (~var12 <= ~var11.length) {
                                                break L40;
                                              } else {
                                                var13 = ((gja) this).field_nb[var11[var12]];
                                                var13.field_c = 16383 & var13.field_c - -param2;
                                                var12++;
                                                if (var21 != 0) {
                                                  break L39;
                                                } else {
                                                  if (var21 == 0) {
                                                    continue L41;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L40;
                                          }
                                        }
                                        var9++;
                                        break L39;
                                      }
                                      if (var21 == 0) {
                                        continue L38;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                              }
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      L42: {
                        if (((gja) this).field_q != null) {
                          var9 = 0;
                          var10 = 0;
                          L43: while (true) {
                            L44: {
                              L45: {
                                L46: {
                                  if (var8_int <= var10) {
                                    break L46;
                                  } else {
                                    var11_int = param1[var10];
                                    stackOut_142_0 = var11_int;
                                    stackOut_142_1 = ((gja) this).field_q.length;
                                    stackIn_174_0 = stackOut_142_0;
                                    stackIn_174_1 = stackOut_142_1;
                                    stackIn_143_0 = stackOut_142_0;
                                    stackIn_143_1 = stackOut_142_1;
                                    if (var21 != 0) {
                                      L47: while (true) {
                                        if (stackIn_174_0 <= stackIn_174_1) {
                                          break L44;
                                        } else {
                                          var11_ref = ((gja) this).field_u[var10];
                                          var12_ref_gca = ((gja) this).field_nb[var10];
                                          var12_ref_gca.field_h = 255 - (255 & ((gja) this).field_C[var11_ref.field_m]) << 24 | 16777215 & var12_ref_gca.field_h;
                                          var10++;
                                          if (var21 != 0) {
                                            break L42;
                                          } else {
                                            if (var21 == 0) {
                                              stackOut_173_0 = ~var10;
                                              stackOut_173_1 = ~((gja) this).field_L;
                                              stackIn_174_0 = stackOut_173_0;
                                              stackIn_174_1 = stackOut_173_1;
                                              continue L47;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L48: {
                                        if (stackIn_143_0 < stackIn_143_1) {
                                          var12_ref_int__ = ((gja) this).field_q[var11_int];
                                          var13_int = 0;
                                          L49: while (true) {
                                            L50: {
                                              L51: {
                                                if (~var12_ref_int__.length >= ~var13_int) {
                                                  break L51;
                                                } else {
                                                  var14 = var12_ref_int__[var13_int];
                                                  var15 = 8 * param2 + (((gja) this).field_C[var14] & 255);
                                                  stackOut_149_0 = var15;
                                                  stackIn_162_0 = stackOut_149_0;
                                                  stackIn_150_0 = stackOut_149_0;
                                                  if (var21 != 0) {
                                                    break L50;
                                                  } else {
                                                    L52: {
                                                      L53: {
                                                        if (stackIn_150_0 < 0) {
                                                          break L53;
                                                        } else {
                                                          if (var15 > 255) {
                                                            var15 = 255;
                                                            if (var21 == 0) {
                                                              break L52;
                                                            } else {
                                                              break L53;
                                                            }
                                                          } else {
                                                            break L52;
                                                          }
                                                        }
                                                      }
                                                      var15 = 0;
                                                      break L52;
                                                    }
                                                    ((gja) this).field_C[var14] = (byte)var15;
                                                    var13_int++;
                                                    if (var21 == 0) {
                                                      continue L49;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_161_0 = var9;
                                              stackIn_162_0 = stackOut_161_0;
                                              break L50;
                                            }
                                            L54: {
                                              stackOut_162_0 = stackIn_162_0;
                                              stackIn_165_0 = stackOut_162_0;
                                              stackIn_163_0 = stackOut_162_0;
                                              if (var12_ref_int__.length <= 0) {
                                                stackOut_165_0 = stackIn_165_0;
                                                stackOut_165_1 = 0;
                                                stackIn_166_0 = stackOut_165_0;
                                                stackIn_166_1 = stackOut_165_1;
                                                break L54;
                                              } else {
                                                stackOut_163_0 = stackIn_163_0;
                                                stackOut_163_1 = 1;
                                                stackIn_166_0 = stackOut_163_0;
                                                stackIn_166_1 = stackOut_163_1;
                                                break L54;
                                              }
                                            }
                                            var9 = stackIn_166_0 | stackIn_166_1;
                                            break L48;
                                          }
                                        } else {
                                          break L48;
                                        }
                                      }
                                      var10++;
                                      if (var21 == 0) {
                                        continue L43;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                if (var9 == 0) {
                                  break L42;
                                } else {
                                  if (((gja) this).field_u == null) {
                                    break L44;
                                  } else {
                                    var10 = 0;
                                    L55: while (true) {
                                      stackOut_173_0 = ~var10;
                                      stackOut_173_1 = ~((gja) this).field_L;
                                      stackIn_174_0 = stackOut_173_0;
                                      stackIn_174_1 = stackOut_173_1;
                                      if (stackIn_174_0 <= stackIn_174_1) {
                                        break L44;
                                      } else {
                                        var11_ref = ((gja) this).field_u[var10];
                                        var12_ref_gca = ((gja) this).field_nb[var10];
                                        var12_ref_gca.field_h = 255 - (255 & ((gja) this).field_C[var11_ref.field_m]) << 24 | 16777215 & var12_ref_gca.field_h;
                                        var10++;
                                        if (var21 != 0) {
                                          break L42;
                                        } else {
                                          if (var21 == 0) {
                                            continue L55;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              break L44;
                            }
                            this.e(0);
                            break L42;
                          }
                        } else {
                          break L42;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var9 = 0;
                  L56: while (true) {
                    stackOut_43_0 = var8_int;
                    stackIn_44_0 = stackOut_43_0;
                    L57: while (true) {
                      stackOut_44_0 = stackIn_44_0;
                      stackOut_44_1 = var9;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      L58: while (true) {
                        L59: {
                          L60: {
                            L61: {
                              if (stackIn_45_0 <= stackIn_45_1) {
                                break L61;
                              } else {
                                var10 = param1[var9];
                                stackOut_46_0 = ~var10;
                                stackOut_46_1 = ~((gja) this).field_D.length;
                                stackIn_86_0 = stackOut_46_0;
                                stackIn_86_1 = stackOut_46_1;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                if (var21 != 0) {
                                  L62: while (true) {
                                    if (stackIn_86_0 <= stackIn_86_1) {
                                      break L60;
                                    } else {
                                      var10 = param1[var9];
                                      if (var21 != 0) {
                                        break L59;
                                      } else {
                                        L63: {
                                          L64: {
                                            if (~var10 > ~((gja) this).field_D.length) {
                                              var11 = ((gja) this).field_D[var10];
                                              var12 = 0;
                                              L65: while (true) {
                                                stackOut_94_0 = var11.length;
                                                stackOut_94_1 = var12;
                                                stackIn_95_0 = stackOut_94_0;
                                                stackIn_95_1 = stackOut_94_1;
                                                L66: while (true) {
                                                  if (stackIn_95_0 <= stackIn_95_1) {
                                                    break L64;
                                                  } else {
                                                    var13_int = var11[var12];
                                                    var14 = ((gja) this).field_J[var13_int];
                                                    var15 = ((gja) this).field_J[1 + var13_int];
                                                    stackOut_96_0 = var14;
                                                    stackIn_85_0 = stackOut_96_0;
                                                    stackIn_97_0 = stackOut_96_0;
                                                    if (var21 != 0) {
                                                      break L63;
                                                    } else {
                                                      var16 = stackIn_97_0;
                                                      L67: while (true) {
                                                        L68: {
                                                          if (var16 >= var15) {
                                                            break L68;
                                                          } else {
                                                            var17 = ((gja) this).field_db[var16] + -1;
                                                            stackOut_99_0 = -1;
                                                            stackOut_99_1 = var17;
                                                            stackIn_95_0 = stackOut_99_0;
                                                            stackIn_95_1 = stackOut_99_1;
                                                            stackIn_100_0 = stackOut_99_0;
                                                            stackIn_100_1 = stackOut_99_1;
                                                            if (var21 != 0) {
                                                              continue L66;
                                                            } else {
                                                              L69: {
                                                                if (stackIn_100_0 != stackIn_100_1) {
                                                                  break L69;
                                                                } else {
                                                                  if (var21 == 0) {
                                                                    break L68;
                                                                  } else {
                                                                    break L69;
                                                                  }
                                                                }
                                                              }
                                                              L70: {
                                                                if (param4 == 0) {
                                                                  break L70;
                                                                } else {
                                                                  var18 = qu.field_b[param4];
                                                                  var19 = qu.field_d[param4];
                                                                  var20 = 16383 + (((gja) this).field_lb[var17] * var19 + ((gja) this).field_m[var17] * var18) >> 14;
                                                                  ((gja) this).field_m[var17] = (short)(-(var18 * ((gja) this).field_lb[var17]) + ((gja) this).field_m[var17] * var19 - -16383 >> 14);
                                                                  ((gja) this).field_lb[var17] = (short)var20;
                                                                  break L70;
                                                                }
                                                              }
                                                              L71: {
                                                                if (param2 == 0) {
                                                                  break L71;
                                                                } else {
                                                                  var18 = qu.field_b[param2];
                                                                  var19 = qu.field_d[param2];
                                                                  var20 = var19 * ((gja) this).field_m[var17] + (-(((gja) this).field_p[var17] * var18) - -16383) >> 14;
                                                                  ((gja) this).field_p[var17] = (short)(((gja) this).field_m[var17] * var18 + (var19 * ((gja) this).field_p[var17] - -16383) >> 14);
                                                                  ((gja) this).field_m[var17] = (short)var20;
                                                                  break L71;
                                                                }
                                                              }
                                                              L72: {
                                                                if (param3 == 0) {
                                                                  break L72;
                                                                } else {
                                                                  var18 = qu.field_b[param3];
                                                                  var19 = qu.field_d[param3];
                                                                  var20 = var18 * ((gja) this).field_p[var17] - (-(((gja) this).field_lb[var17] * var19) + -16383) >> 14;
                                                                  ((gja) this).field_p[var17] = (short)(-(((gja) this).field_lb[var17] * var18) + (((gja) this).field_p[var17] * var19 - -16383) >> 14);
                                                                  ((gja) this).field_lb[var17] = (short)var20;
                                                                  break L72;
                                                                }
                                                              }
                                                              var16++;
                                                              if (var21 == 0) {
                                                                continue L67;
                                                              } else {
                                                                break L68;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var12++;
                                                        if (var21 == 0) {
                                                          continue L65;
                                                        } else {
                                                          break L64;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L64;
                                            }
                                          }
                                          var9++;
                                          if (var21 == 0) {
                                            stackOut_84_0 = ~var9;
                                            stackIn_85_0 = stackOut_84_0;
                                            break L63;
                                          } else {
                                            break L60;
                                          }
                                        }
                                        stackOut_85_0 = stackIn_85_0;
                                        stackOut_85_1 = ~var8_int;
                                        stackIn_86_0 = stackOut_85_0;
                                        stackIn_86_1 = stackOut_85_1;
                                        continue L62;
                                      }
                                    }
                                  }
                                } else {
                                  L73: {
                                    if (stackIn_47_0 <= stackIn_47_1) {
                                      break L73;
                                    } else {
                                      L74: {
                                        var11 = ((gja) this).field_D[var10];
                                        if ((param5 & 1) == 0) {
                                          break L74;
                                        } else {
                                          var12 = 0;
                                          L75: while (true) {
                                            L76: {
                                              if (~var12 <= ~var11.length) {
                                                break L76;
                                              } else {
                                                var13_int = var11[var12];
                                                ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] - ina.field_a;
                                                ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] - pb.field_k;
                                                ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] - uu.field_c;
                                                stackOut_53_0 = param2;
                                                stackIn_44_0 = stackOut_53_0;
                                                stackIn_54_0 = stackOut_53_0;
                                                if (var21 != 0) {
                                                  continue L57;
                                                } else {
                                                  L77: {
                                                    if (stackIn_54_0 != 0) {
                                                      var14 = qu.field_b[param2];
                                                      var15 = qu.field_d[param2];
                                                      var16 = -(((gja) this).field_l[var13_int] * var14) + (((gja) this).field_r[var13_int] * var15 - -16383) >> 14;
                                                      ((gja) this).field_l[var13_int] = ((gja) this).field_r[var13_int] * var14 + (var15 * ((gja) this).field_l[var13_int] + 16383) >> 14;
                                                      ((gja) this).field_r[var13_int] = var16;
                                                      break L77;
                                                    } else {
                                                      break L77;
                                                    }
                                                  }
                                                  L78: {
                                                    if (param4 != 0) {
                                                      var14 = qu.field_b[param4];
                                                      var15 = qu.field_d[param4];
                                                      var16 = 16383 + var14 * ((gja) this).field_r[var13_int] + ((gja) this).field_Z[var13_int] * var15 >> 14;
                                                      ((gja) this).field_r[var13_int] = 16383 + (-(((gja) this).field_Z[var13_int] * var14) + var15 * ((gja) this).field_r[var13_int]) >> 14;
                                                      ((gja) this).field_Z[var13_int] = var16;
                                                      break L78;
                                                    } else {
                                                      break L78;
                                                    }
                                                  }
                                                  L79: {
                                                    if (param3 != 0) {
                                                      var14 = qu.field_b[param3];
                                                      var15 = qu.field_d[param3];
                                                      var16 = 16383 + var14 * ((gja) this).field_l[var13_int] - -(var15 * ((gja) this).field_Z[var13_int]) >> 14;
                                                      ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * var15 - (((gja) this).field_Z[var13_int] * var14 - 16383) >> 14;
                                                      ((gja) this).field_Z[var13_int] = var16;
                                                      break L79;
                                                    } else {
                                                      break L79;
                                                    }
                                                  }
                                                  ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] + ina.field_a;
                                                  ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] + pb.field_k;
                                                  ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] + uu.field_c;
                                                  var12++;
                                                  if (var21 == 0) {
                                                    continue L75;
                                                  } else {
                                                    break L76;
                                                  }
                                                }
                                              }
                                            }
                                            if (var21 == 0) {
                                              break L73;
                                            } else {
                                              break L74;
                                            }
                                          }
                                        }
                                      }
                                      var12 = 0;
                                      L80: while (true) {
                                        if (var11.length <= var12) {
                                          break L73;
                                        } else {
                                          var13_int = var11[var12];
                                          ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] - ina.field_a;
                                          ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] - pb.field_k;
                                          ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] - uu.field_c;
                                          stackOut_69_0 = -1;
                                          stackOut_69_1 = ~param4;
                                          stackIn_45_0 = stackOut_69_0;
                                          stackIn_45_1 = stackOut_69_1;
                                          stackIn_70_0 = stackOut_69_0;
                                          stackIn_70_1 = stackOut_69_1;
                                          if (var21 != 0) {
                                            continue L58;
                                          } else {
                                            L81: {
                                              if (stackIn_70_0 == stackIn_70_1) {
                                                break L81;
                                              } else {
                                                var14 = qu.field_b[param4];
                                                var15 = qu.field_d[param4];
                                                var16 = 16383 + (((gja) this).field_r[var13_int] * var14 + ((gja) this).field_Z[var13_int] * var15) >> 14;
                                                ((gja) this).field_r[var13_int] = -(var14 * ((gja) this).field_Z[var13_int]) + ((gja) this).field_r[var13_int] * var15 + 16383 >> 14;
                                                ((gja) this).field_Z[var13_int] = var16;
                                                break L81;
                                              }
                                            }
                                            L82: {
                                              if (param2 == 0) {
                                                break L82;
                                              } else {
                                                var14 = qu.field_b[param2];
                                                var15 = qu.field_d[param2];
                                                var16 = 16383 + -(var14 * ((gja) this).field_l[var13_int]) + var15 * ((gja) this).field_r[var13_int] >> 14;
                                                ((gja) this).field_l[var13_int] = 16383 + var14 * ((gja) this).field_r[var13_int] - -(((gja) this).field_l[var13_int] * var15) >> 14;
                                                ((gja) this).field_r[var13_int] = var16;
                                                break L82;
                                              }
                                            }
                                            L83: {
                                              if (param3 != 0) {
                                                var14 = qu.field_b[param3];
                                                var15 = qu.field_d[param3];
                                                var16 = 16383 + var15 * ((gja) this).field_Z[var13_int] + ((gja) this).field_l[var13_int] * var14 >> 14;
                                                ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] * var15 + (-(((gja) this).field_Z[var13_int] * var14) - -16383) >> 14;
                                                ((gja) this).field_Z[var13_int] = var16;
                                                break L83;
                                              } else {
                                                break L83;
                                              }
                                            }
                                            ((gja) this).field_Z[var13_int] = ((gja) this).field_Z[var13_int] + ina.field_a;
                                            ((gja) this).field_r[var13_int] = ((gja) this).field_r[var13_int] + pb.field_k;
                                            ((gja) this).field_l[var13_int] = ((gja) this).field_l[var13_int] + uu.field_c;
                                            var12++;
                                            if (var21 == 0) {
                                              continue L80;
                                            } else {
                                              break L73;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  if (var21 == 0) {
                                    continue L56;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                            }
                            if (param6) {
                              var9 = 0;
                              L84: while (true) {
                                stackOut_84_0 = ~var9;
                                stackIn_85_0 = stackOut_84_0;
                                L85: while (true) {
                                  stackOut_85_0 = stackIn_85_0;
                                  stackOut_85_1 = ~var8_int;
                                  stackIn_86_0 = stackOut_85_0;
                                  stackIn_86_1 = stackOut_85_1;
                                  if (stackIn_86_0 <= stackIn_86_1) {
                                    break L60;
                                  } else {
                                    var10 = param1[var9];
                                    if (var21 != 0) {
                                      break L59;
                                    } else {
                                      L86: {
                                        if (~var10 > ~((gja) this).field_D.length) {
                                          var11 = ((gja) this).field_D[var10];
                                          var12 = 0;
                                          L87: while (true) {
                                            stackOut_94_0 = var11.length;
                                            stackOut_94_1 = var12;
                                            stackIn_95_0 = stackOut_94_0;
                                            stackIn_95_1 = stackOut_94_1;
                                            L88: while (true) {
                                              if (stackIn_95_0 <= stackIn_95_1) {
                                                break L86;
                                              } else {
                                                var13_int = var11[var12];
                                                var14 = ((gja) this).field_J[var13_int];
                                                var15 = ((gja) this).field_J[1 + var13_int];
                                                stackOut_96_0 = var14;
                                                stackIn_85_0 = stackOut_96_0;
                                                stackIn_97_0 = stackOut_96_0;
                                                if (var21 != 0) {
                                                  continue L85;
                                                } else {
                                                  var16 = stackIn_97_0;
                                                  L89: while (true) {
                                                    L90: {
                                                      if (var16 >= var15) {
                                                        break L90;
                                                      } else {
                                                        var17 = ((gja) this).field_db[var16] + -1;
                                                        stackOut_99_0 = -1;
                                                        stackOut_99_1 = var17;
                                                        stackIn_95_0 = stackOut_99_0;
                                                        stackIn_95_1 = stackOut_99_1;
                                                        stackIn_100_0 = stackOut_99_0;
                                                        stackIn_100_1 = stackOut_99_1;
                                                        if (var21 != 0) {
                                                          continue L88;
                                                        } else {
                                                          L91: {
                                                            if (stackIn_100_0 != stackIn_100_1) {
                                                              break L91;
                                                            } else {
                                                              if (var21 == 0) {
                                                                break L90;
                                                              } else {
                                                                break L91;
                                                              }
                                                            }
                                                          }
                                                          L92: {
                                                            if (param4 == 0) {
                                                              break L92;
                                                            } else {
                                                              var18 = qu.field_b[param4];
                                                              var19 = qu.field_d[param4];
                                                              var20 = 16383 + (((gja) this).field_lb[var17] * var19 + ((gja) this).field_m[var17] * var18) >> 14;
                                                              ((gja) this).field_m[var17] = (short)(-(var18 * ((gja) this).field_lb[var17]) + ((gja) this).field_m[var17] * var19 - -16383 >> 14);
                                                              ((gja) this).field_lb[var17] = (short)var20;
                                                              break L92;
                                                            }
                                                          }
                                                          L93: {
                                                            if (param2 == 0) {
                                                              break L93;
                                                            } else {
                                                              var18 = qu.field_b[param2];
                                                              var19 = qu.field_d[param2];
                                                              var20 = var19 * ((gja) this).field_m[var17] + (-(((gja) this).field_p[var17] * var18) - -16383) >> 14;
                                                              ((gja) this).field_p[var17] = (short)(((gja) this).field_m[var17] * var18 + (var19 * ((gja) this).field_p[var17] - -16383) >> 14);
                                                              ((gja) this).field_m[var17] = (short)var20;
                                                              break L93;
                                                            }
                                                          }
                                                          L94: {
                                                            if (param3 == 0) {
                                                              break L94;
                                                            } else {
                                                              var18 = qu.field_b[param3];
                                                              var19 = qu.field_d[param3];
                                                              var20 = var18 * ((gja) this).field_p[var17] - (-(((gja) this).field_lb[var17] * var19) + -16383) >> 14;
                                                              ((gja) this).field_p[var17] = (short)(-(((gja) this).field_lb[var17] * var18) + (((gja) this).field_p[var17] * var19 - -16383) >> 14);
                                                              ((gja) this).field_lb[var17] = (short)var20;
                                                              break L94;
                                                            }
                                                          }
                                                          var16++;
                                                          if (var21 == 0) {
                                                            continue L89;
                                                          } else {
                                                            break L90;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var12++;
                                                    if (var21 == 0) {
                                                      continue L87;
                                                    } else {
                                                      break L86;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L86;
                                        }
                                      }
                                      var9++;
                                      if (var21 == 0) {
                                        continue L84;
                                      } else {
                                        break L60;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L59;
                            }
                          }
                          this.d((byte) 28);
                          break L59;
                        }
                        return;
                      }
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
              L95: while (true) {
                L96: {
                  L97: {
                    if (var10 >= var8_int) {
                      break L97;
                    } else {
                      var11_int = param1[var10];
                      stackOut_4_0 = var11_int;
                      stackOut_4_1 = ((gja) this).field_D.length;
                      stackIn_17_0 = stackOut_4_0;
                      stackIn_17_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var21 != 0) {
                        break L96;
                      } else {
                        L98: {
                          L99: {
                            if (stackIn_5_0 >= stackIn_5_1) {
                              break L99;
                            } else {
                              var12_ref_int__ = ((gja) this).field_D[var11_int];
                              var13_int = 0;
                              L100: while (true) {
                                if (~var13_int <= ~var12_ref_int__.length) {
                                  break L99;
                                } else {
                                  var14 = var12_ref_int__[var13_int];
                                  ina.field_a = ina.field_a + ((gja) this).field_Z[var14];
                                  pb.field_k = pb.field_k + ((gja) this).field_r[var14];
                                  var9++;
                                  uu.field_c = uu.field_c + ((gja) this).field_l[var14];
                                  var13_int++;
                                  if (var21 != 0) {
                                    break L98;
                                  } else {
                                    if (var21 == 0) {
                                      continue L100;
                                    } else {
                                      break L99;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var10++;
                          break L98;
                        }
                        if (var21 == 0) {
                          continue L95;
                        } else {
                          break L97;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 0;
                  stackOut_16_1 = var9;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L96;
                }
                L101: {
                  L102: {
                    if (stackIn_17_0 < stackIn_17_1) {
                      break L102;
                    } else {
                      ina.field_a = param2;
                      pb.field_k = param3;
                      uu.field_c = param4;
                      if (var21 == 0) {
                        break L101;
                      } else {
                        break L102;
                      }
                    }
                  }
                  uu.field_c = uu.field_c / var9 - -param4;
                  ina.field_a = ina.field_a / var9 + param2;
                  pb.field_k = param3 + pb.field_k / var9;
                  break L101;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L103: {
            var8 = decompiledCaughtException;
            stackOut_289_0 = (RuntimeException) var8;
            stackOut_289_1 = new StringBuilder().append("gja.U(").append(param0).append(',');
            stackIn_292_0 = stackOut_289_0;
            stackIn_292_1 = stackOut_289_1;
            stackIn_290_0 = stackOut_289_0;
            stackIn_290_1 = stackOut_289_1;
            if (param1 == null) {
              stackOut_292_0 = (RuntimeException) (Object) stackIn_292_0;
              stackOut_292_1 = (StringBuilder) (Object) stackIn_292_1;
              stackOut_292_2 = "null";
              stackIn_293_0 = stackOut_292_0;
              stackIn_293_1 = stackOut_292_1;
              stackIn_293_2 = stackOut_292_2;
              break L103;
            } else {
              stackOut_290_0 = (RuntimeException) (Object) stackIn_290_0;
              stackOut_290_1 = (StringBuilder) (Object) stackIn_290_1;
              stackOut_290_2 = "{...}";
              stackIn_293_0 = stackOut_290_0;
              stackIn_293_1 = stackOut_290_1;
              stackIn_293_2 = stackOut_290_2;
              break L103;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_293_0, stackIn_293_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
          throw tba.a((Throwable) (Object) runtimeException, "gja.J(" + param0 + ')');
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
          throw tba.a((Throwable) (Object) var2, "gja.F(" + param0 + ')');
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        RuntimeException var9 = null;
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
        int var16 = 0;
        int[] var16_ref_int__ = null;
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        Object stackIn_138_0 = null;
        int stackIn_146_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_178_0 = 0;
        Object stackIn_184_0 = null;
        Object stackIn_187_0 = null;
        Object stackIn_208_0 = null;
        Object stackIn_211_0 = null;
        int stackIn_226_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_241_0 = 0;
        Object stackIn_246_0 = null;
        Object stackIn_249_0 = null;
        int stackIn_264_0 = 0;
        int stackIn_264_1 = 0;
        Object stackIn_270_0 = null;
        Object stackIn_270_1 = null;
        int stackIn_290_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_293_0 = 0;
        int stackIn_293_1 = 0;
        Object stackIn_298_0 = null;
        Object stackIn_298_1 = null;
        int stackIn_301_0 = 0;
        int stackIn_301_1 = 0;
        int stackIn_315_0 = 0;
        int stackIn_315_1 = 0;
        Object stackIn_322_0 = null;
        Object stackIn_322_1 = null;
        int stackIn_345_0 = 0;
        int stackIn_347_0 = 0;
        int stackIn_348_0 = 0;
        int stackIn_348_1 = 0;
        Object stackIn_353_0 = null;
        Object stackIn_353_1 = null;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        RuntimeException stackIn_419_0 = null;
        StringBuilder stackIn_419_1 = null;
        RuntimeException stackIn_421_0 = null;
        StringBuilder stackIn_421_1 = null;
        RuntimeException stackIn_422_0 = null;
        StringBuilder stackIn_422_1 = null;
        String stackIn_422_2 = null;
        RuntimeException stackIn_423_0 = null;
        StringBuilder stackIn_423_1 = null;
        RuntimeException stackIn_425_0 = null;
        StringBuilder stackIn_425_1 = null;
        RuntimeException stackIn_426_0 = null;
        StringBuilder stackIn_426_1 = null;
        String stackIn_426_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        Object stackOut_110_0 = null;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        Object stackOut_137_0 = null;
        int stackOut_145_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_177_0 = 0;
        Object stackOut_183_0 = null;
        Object stackOut_186_0 = null;
        Object stackOut_207_0 = null;
        Object stackOut_210_0 = null;
        int stackOut_225_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_240_0 = 0;
        Object stackOut_244_0 = null;
        Object stackOut_248_0 = null;
        int stackOut_314_0 = 0;
        int stackOut_314_1 = 0;
        int stackOut_357_0 = 0;
        int stackOut_357_1 = 0;
        Object stackOut_321_0 = null;
        Object stackOut_321_1 = null;
        int stackOut_344_0 = 0;
        int stackOut_347_0 = 0;
        int stackOut_347_1 = 0;
        int stackOut_345_0 = 0;
        int stackOut_345_1 = 0;
        Object stackOut_351_0 = null;
        Object stackOut_351_1 = null;
        int stackOut_263_0 = 0;
        int stackOut_263_1 = 0;
        int stackOut_300_0 = 0;
        int stackOut_300_1 = 0;
        Object stackOut_269_0 = null;
        Object stackOut_269_1 = null;
        int stackOut_289_0 = 0;
        int stackOut_292_0 = 0;
        int stackOut_292_1 = 0;
        int stackOut_290_0 = 0;
        int stackOut_290_1 = 0;
        Object stackOut_296_0 = null;
        Object stackOut_296_1 = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_418_0 = null;
        StringBuilder stackOut_418_1 = null;
        RuntimeException stackOut_421_0 = null;
        StringBuilder stackOut_421_1 = null;
        String stackOut_421_2 = null;
        RuntimeException stackOut_419_0 = null;
        StringBuilder stackOut_419_1 = null;
        String stackOut_419_2 = null;
        RuntimeException stackOut_422_0 = null;
        StringBuilder stackOut_422_1 = null;
        RuntimeException stackOut_425_0 = null;
        StringBuilder stackOut_425_1 = null;
        String stackOut_425_2 = null;
        RuntimeException stackOut_423_0 = null;
        StringBuilder stackOut_423_1 = null;
        String stackOut_423_2 = null;
        var47 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var9_int = param1.length;
            if (0 != param0) {
              if (param0 != 1) {
                if (param0 == 2) {
                  L1: {
                    L2: {
                      if (param7 != null) {
                        break L2;
                      } else {
                        var10 = 0;
                        L3: while (true) {
                          L4: {
                            L5: {
                              L6: {
                                L7: {
                                  if (var10 >= var9_int) {
                                    break L7;
                                  } else {
                                    var11 = param1[var10];
                                    stackOut_68_0 = var11;
                                    stackOut_68_1 = ((gja) this).field_D.length;
                                    stackIn_102_0 = stackOut_68_0;
                                    stackIn_102_1 = stackOut_68_1;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    if (var47 != 0) {
                                      L8: while (true) {
                                        if (stackIn_102_0 >= stackIn_102_1) {
                                          break L6;
                                        } else {
                                          var11 = param1[var10];
                                          if (var47 != 0) {
                                            break L4;
                                          } else {
                                            L9: {
                                              if (var11 >= ((gja) this).field_D.length) {
                                                break L9;
                                              } else {
                                                var12 = ((gja) this).field_D[var11];
                                                var13 = 0;
                                                L10: while (true) {
                                                  stackOut_108_0 = var13;
                                                  stackOut_108_1 = var12.length;
                                                  stackIn_109_0 = stackOut_108_0;
                                                  stackIn_109_1 = stackOut_108_1;
                                                  L11: while (true) {
                                                    if (stackIn_109_0 >= stackIn_109_1) {
                                                      break L9;
                                                    } else {
                                                      var14_int = var12[var13];
                                                      stackOut_110_0 = this;
                                                      stackIn_138_0 = stackOut_110_0;
                                                      stackIn_111_0 = stackOut_110_0;
                                                      if (var47 != 0) {
                                                        break L5;
                                                      } else {
                                                        L12: {
                                                          L13: {
                                                            if (((gja) this).field_hb == null) {
                                                              break L13;
                                                            } else {
                                                              if ((((gja) this).field_hb[var14_int] & param6) == 0) {
                                                                break L12;
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                          }
                                                          var15 = ((gja) this).field_J[var14_int];
                                                          var16 = ((gja) this).field_J[1 + var14_int];
                                                          var17 = var15;
                                                          L14: while (true) {
                                                            if (~var16 >= ~var17) {
                                                              break L12;
                                                            } else {
                                                              var18 = ((gja) this).field_db[var17] - 1;
                                                              stackOut_119_0 = -1;
                                                              stackOut_119_1 = var18;
                                                              stackIn_109_0 = stackOut_119_0;
                                                              stackIn_109_1 = stackOut_119_1;
                                                              stackIn_120_0 = stackOut_119_0;
                                                              stackIn_120_1 = stackOut_119_1;
                                                              if (var47 != 0) {
                                                                continue L11;
                                                              } else {
                                                                L15: {
                                                                  if (stackIn_120_0 != stackIn_120_1) {
                                                                    break L15;
                                                                  } else {
                                                                    if (var47 == 0) {
                                                                      break L12;
                                                                    } else {
                                                                      break L15;
                                                                    }
                                                                  }
                                                                }
                                                                L16: {
                                                                  if (0 == param4) {
                                                                    break L16;
                                                                  } else {
                                                                    var19 = qu.field_b[param4];
                                                                    var20 = qu.field_d[param4];
                                                                    var21 = var19 * ((gja) this).field_m[var18] + ((gja) this).field_lb[var18] * var20 + 16383 >> 14;
                                                                    ((gja) this).field_m[var18] = (short)(-(((gja) this).field_lb[var18] * var19) + ((gja) this).field_m[var18] * var20 - -16383 >> 14);
                                                                    ((gja) this).field_lb[var18] = (short)var21;
                                                                    break L16;
                                                                  }
                                                                }
                                                                L17: {
                                                                  if (param2 != 0) {
                                                                    var19 = qu.field_b[param2];
                                                                    var20 = qu.field_d[param2];
                                                                    var21 = var20 * ((gja) this).field_m[var18] + -(((gja) this).field_p[var18] * var19) + 16383 >> 14;
                                                                    ((gja) this).field_p[var18] = (short)(16383 + (((gja) this).field_m[var18] * var19 + var20 * ((gja) this).field_p[var18]) >> 14);
                                                                    ((gja) this).field_m[var18] = (short)var21;
                                                                    break L17;
                                                                  } else {
                                                                    break L17;
                                                                  }
                                                                }
                                                                L18: {
                                                                  if (0 == param3) {
                                                                    break L18;
                                                                  } else {
                                                                    var19 = qu.field_b[param3];
                                                                    var20 = qu.field_d[param3];
                                                                    var21 = 16383 + var19 * ((gja) this).field_p[var18] - -(((gja) this).field_lb[var18] * var20) >> 14;
                                                                    ((gja) this).field_p[var18] = (short)(16383 + ((gja) this).field_p[var18] * var20 + -(((gja) this).field_lb[var18] * var19) >> 14);
                                                                    ((gja) this).field_lb[var18] = (short)var21;
                                                                    break L18;
                                                                  }
                                                                }
                                                                var17++;
                                                                if (var47 == 0) {
                                                                  continue L14;
                                                                } else {
                                                                  break L12;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var13++;
                                                        if (var47 == 0) {
                                                          continue L10;
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var10++;
                                            if (var47 == 0) {
                                              stackOut_101_0 = ~var9_int;
                                              stackOut_101_1 = ~var10;
                                              stackIn_102_0 = stackOut_101_0;
                                              stackIn_102_1 = stackOut_101_1;
                                              continue L8;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L19: {
                                        L20: {
                                          if (stackIn_69_0 >= stackIn_69_1) {
                                            break L20;
                                          } else {
                                            var12 = ((gja) this).field_D[var11];
                                            var13 = 0;
                                            L21: while (true) {
                                              if (var12.length <= var13) {
                                                break L20;
                                              } else {
                                                var14_int = var12[var13];
                                                if (var47 != 0) {
                                                  break L19;
                                                } else {
                                                  L22: {
                                                    L23: {
                                                      if (null == ((gja) this).field_hb) {
                                                        break L23;
                                                      } else {
                                                        if ((((gja) this).field_hb[var14_int] & param6) == 0) {
                                                          break L22;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] - ina.field_a;
                                                      ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] - pb.field_k;
                                                      ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] - uu.field_c;
                                                      if (0 != param4) {
                                                        var15 = qu.field_b[param4];
                                                        var16 = qu.field_d[param4];
                                                        var17 = var16 * ((gja) this).field_Z[var14_int] + var15 * ((gja) this).field_r[var14_int] - -16383 >> 14;
                                                        ((gja) this).field_r[var14_int] = 16383 + var16 * ((gja) this).field_r[var14_int] + -(((gja) this).field_Z[var14_int] * var15) >> 14;
                                                        ((gja) this).field_Z[var14_int] = var17;
                                                        break L24;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                    L25: {
                                                      if (param2 == 0) {
                                                        break L25;
                                                      } else {
                                                        var15 = qu.field_b[param2];
                                                        var16 = qu.field_d[param2];
                                                        var17 = 16383 + (var16 * ((gja) this).field_r[var14_int] - var15 * ((gja) this).field_l[var14_int]) >> 14;
                                                        ((gja) this).field_l[var14_int] = var16 * ((gja) this).field_l[var14_int] + var15 * ((gja) this).field_r[var14_int] - -16383 >> 14;
                                                        ((gja) this).field_r[var14_int] = var17;
                                                        break L25;
                                                      }
                                                    }
                                                    L26: {
                                                      if (param3 != 0) {
                                                        var15 = qu.field_b[param3];
                                                        var16 = qu.field_d[param3];
                                                        var17 = var16 * ((gja) this).field_Z[var14_int] + var15 * ((gja) this).field_l[var14_int] - -16383 >> 14;
                                                        ((gja) this).field_l[var14_int] = 16383 + var16 * ((gja) this).field_l[var14_int] + -(var15 * ((gja) this).field_Z[var14_int]) >> 14;
                                                        ((gja) this).field_Z[var14_int] = var17;
                                                        break L26;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                    ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] + ina.field_a;
                                                    ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] + pb.field_k;
                                                    ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] + uu.field_c;
                                                    break L22;
                                                  }
                                                  var13++;
                                                  if (var47 == 0) {
                                                    continue L21;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var10++;
                                        break L19;
                                      }
                                      if (var47 == 0) {
                                        continue L3;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                if (param5) {
                                  var10 = 0;
                                  L27: while (true) {
                                    stackOut_101_0 = ~var9_int;
                                    stackOut_101_1 = ~var10;
                                    stackIn_102_0 = stackOut_101_0;
                                    stackIn_102_1 = stackOut_101_1;
                                    if (stackIn_102_0 >= stackIn_102_1) {
                                      break L6;
                                    } else {
                                      var11 = param1[var10];
                                      if (var47 != 0) {
                                        break L4;
                                      } else {
                                        L28: {
                                          if (var11 >= ((gja) this).field_D.length) {
                                            break L28;
                                          } else {
                                            var12 = ((gja) this).field_D[var11];
                                            var13 = 0;
                                            L29: while (true) {
                                              stackOut_108_0 = var13;
                                              stackOut_108_1 = var12.length;
                                              stackIn_109_0 = stackOut_108_0;
                                              stackIn_109_1 = stackOut_108_1;
                                              L30: while (true) {
                                                if (stackIn_109_0 >= stackIn_109_1) {
                                                  break L28;
                                                } else {
                                                  var14_int = var12[var13];
                                                  stackOut_110_0 = this;
                                                  stackIn_138_0 = stackOut_110_0;
                                                  stackIn_111_0 = stackOut_110_0;
                                                  if (var47 != 0) {
                                                    break L5;
                                                  } else {
                                                    L31: {
                                                      L32: {
                                                        if (((gja) this).field_hb == null) {
                                                          break L32;
                                                        } else {
                                                          if ((((gja) this).field_hb[var14_int] & param6) == 0) {
                                                            break L31;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                      var15 = ((gja) this).field_J[var14_int];
                                                      var16 = ((gja) this).field_J[1 + var14_int];
                                                      var17 = var15;
                                                      L33: while (true) {
                                                        if (~var16 >= ~var17) {
                                                          break L31;
                                                        } else {
                                                          var18 = ((gja) this).field_db[var17] - 1;
                                                          stackOut_119_0 = -1;
                                                          stackOut_119_1 = var18;
                                                          stackIn_109_0 = stackOut_119_0;
                                                          stackIn_109_1 = stackOut_119_1;
                                                          stackIn_120_0 = stackOut_119_0;
                                                          stackIn_120_1 = stackOut_119_1;
                                                          if (var47 != 0) {
                                                            continue L30;
                                                          } else {
                                                            L34: {
                                                              if (stackIn_120_0 != stackIn_120_1) {
                                                                break L34;
                                                              } else {
                                                                if (var47 == 0) {
                                                                  break L31;
                                                                } else {
                                                                  break L34;
                                                                }
                                                              }
                                                            }
                                                            L35: {
                                                              if (0 == param4) {
                                                                break L35;
                                                              } else {
                                                                var19 = qu.field_b[param4];
                                                                var20 = qu.field_d[param4];
                                                                var21 = var19 * ((gja) this).field_m[var18] + ((gja) this).field_lb[var18] * var20 + 16383 >> 14;
                                                                ((gja) this).field_m[var18] = (short)(-(((gja) this).field_lb[var18] * var19) + ((gja) this).field_m[var18] * var20 - -16383 >> 14);
                                                                ((gja) this).field_lb[var18] = (short)var21;
                                                                break L35;
                                                              }
                                                            }
                                                            L36: {
                                                              if (param2 != 0) {
                                                                var19 = qu.field_b[param2];
                                                                var20 = qu.field_d[param2];
                                                                var21 = var20 * ((gja) this).field_m[var18] + -(((gja) this).field_p[var18] * var19) + 16383 >> 14;
                                                                ((gja) this).field_p[var18] = (short)(16383 + (((gja) this).field_m[var18] * var19 + var20 * ((gja) this).field_p[var18]) >> 14);
                                                                ((gja) this).field_m[var18] = (short)var21;
                                                                break L36;
                                                              } else {
                                                                break L36;
                                                              }
                                                            }
                                                            L37: {
                                                              if (0 == param3) {
                                                                break L37;
                                                              } else {
                                                                var19 = qu.field_b[param3];
                                                                var20 = qu.field_d[param3];
                                                                var21 = 16383 + var19 * ((gja) this).field_p[var18] - -(((gja) this).field_lb[var18] * var20) >> 14;
                                                                ((gja) this).field_p[var18] = (short)(16383 + ((gja) this).field_p[var18] * var20 + -(((gja) this).field_lb[var18] * var19) >> 14);
                                                                ((gja) this).field_lb[var18] = (short)var21;
                                                                break L37;
                                                              }
                                                            }
                                                            var17++;
                                                            if (var47 == 0) {
                                                              continue L33;
                                                            } else {
                                                              break L31;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var13++;
                                                    if (var47 == 0) {
                                                      continue L29;
                                                    } else {
                                                      break L28;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var10++;
                                        if (var47 == 0) {
                                          continue L27;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L1;
                                }
                              }
                              stackOut_137_0 = this;
                              stackIn_138_0 = stackOut_137_0;
                              break L5;
                            }
                            this.d((byte) 123);
                            break L4;
                          }
                          if (var47 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L38: {
                      var10 = param7[9] << 4;
                      var11 = param7[10] << 4;
                      var12_int = param7[11] << 4;
                      var13 = param7[12] << 4;
                      var14_int = param7[13] << 4;
                      var15 = param7[14] << 4;
                      if (vr.field_o) {
                        var16 = 8192 + ina.field_a * param7[0] + (param7[3] * pb.field_k + param7[6] * uu.field_c) >> 14;
                        var17 = 8192 + ina.field_a * param7[1] - -(param7[4] * pb.field_k) - -(uu.field_c * param7[7]) >> 14;
                        var18 = param7[8] * uu.field_c + param7[5] * pb.field_k + param7[2] * ina.field_a + 8192 >> 14;
                        var16 = var16 + var13;
                        var17 = var17 + var14_int;
                        ina.field_a = var16;
                        pb.field_k = var17;
                        var18 = var18 + var15;
                        vr.field_o = false;
                        uu.field_c = var18;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
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
                    L39: while (true) {
                      stackOut_145_0 = 3;
                      stackIn_146_0 = stackOut_145_0;
                      L40: while (true) {
                        L41: {
                          L42: {
                            if (stackIn_146_0 <= var32) {
                              break L42;
                            } else {
                              stackOut_147_0 = 0;
                              stackIn_161_0 = stackOut_147_0;
                              stackIn_148_0 = stackOut_147_0;
                              if (var47 != 0) {
                                break L41;
                              } else {
                                var33 = stackIn_148_0;
                                L43: while (true) {
                                  L44: {
                                    if (var33 >= 3) {
                                      break L44;
                                    } else {
                                      var34 = 0;
                                      stackOut_150_0 = 0;
                                      stackIn_146_0 = stackOut_150_0;
                                      stackIn_151_0 = stackOut_150_0;
                                      if (var47 != 0) {
                                        continue L40;
                                      } else {
                                        var35_int = stackIn_151_0;
                                        L45: while (true) {
                                          L46: {
                                            L47: {
                                              if (var35_int >= 3) {
                                                break L47;
                                              } else {
                                                var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var35_int + 3 * var33];
                                                var35_int++;
                                                if (var47 != 0) {
                                                  break L46;
                                                } else {
                                                  if (var47 == 0) {
                                                    continue L45;
                                                  } else {
                                                    break L47;
                                                  }
                                                }
                                              }
                                            }
                                            var31_ref_int__[3 * var32 + var33] = var34 + 8192 >> 14;
                                            var33++;
                                            break L46;
                                          }
                                          if (var47 == 0) {
                                            continue L43;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var32++;
                                  if (var47 == 0) {
                                    continue L39;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                            }
                          }
                          var32 = 8192 + var16_ref_int__[2] * var15 + (var13 * var16_ref_int__[0] + var14_int * var16_ref_int__[1]) >> 14;
                          stackOut_160_0 = var15 * var16_ref_int__[5] + (var14_int * var16_ref_int__[4] + var16_ref_int__[3] * var13) + 8192 >> 14;
                          stackIn_161_0 = stackOut_160_0;
                          break L41;
                        }
                        var33 = stackIn_161_0;
                        var32 = var32 + var28;
                        var34 = var15 * var16_ref_int__[8] + var13 * var16_ref_int__[6] + var16_ref_int__[7] * var14_int + 8192 >> 14;
                        var33 = var33 + var29_int;
                        var34 = var34 + var30;
                        var35 = new int[9];
                        var36 = 0;
                        L48: while (true) {
                          stackOut_162_0 = 3;
                          stackIn_163_0 = stackOut_162_0;
                          L49: while (true) {
                            L50: {
                              L51: {
                                if (stackIn_163_0 <= var36) {
                                  break L51;
                                } else {
                                  stackOut_164_0 = 0;
                                  stackIn_178_0 = stackOut_164_0;
                                  stackIn_165_0 = stackOut_164_0;
                                  if (var47 != 0) {
                                    break L50;
                                  } else {
                                    var37 = stackIn_165_0;
                                    L52: while (true) {
                                      L53: {
                                        if (var37 >= 3) {
                                          break L53;
                                        } else {
                                          var38 = 0;
                                          stackOut_167_0 = 0;
                                          stackIn_163_0 = stackOut_167_0;
                                          stackIn_168_0 = stackOut_167_0;
                                          if (var47 != 0) {
                                            continue L49;
                                          } else {
                                            var39 = stackIn_168_0;
                                            L54: while (true) {
                                              L55: {
                                                L56: {
                                                  if (3 <= var39) {
                                                    break L56;
                                                  } else {
                                                    var38 = var38 + var31_ref_int__[3 * var39 + var37] * param7[3 * var36 - -var39];
                                                    var39++;
                                                    if (var47 != 0) {
                                                      break L55;
                                                    } else {
                                                      if (var47 == 0) {
                                                        continue L54;
                                                      } else {
                                                        break L56;
                                                      }
                                                    }
                                                  }
                                                }
                                                var35[var36 * 3 - -var37] = var38 - -8192 >> 14;
                                                var37++;
                                                break L55;
                                              }
                                              if (var47 == 0) {
                                                continue L52;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var36++;
                                      if (var47 == 0) {
                                        continue L48;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                }
                              }
                              var36 = 8192 + var34 * param7[2] + (param7[0] * var32 + var33 * param7[1]) >> 14;
                              stackOut_177_0 = var33 * param7[4] + var32 * param7[3] - (-(param7[5] * var34) - 8192) >> 14;
                              stackIn_178_0 = stackOut_177_0;
                              break L50;
                            }
                            var37 = stackIn_178_0;
                            var38 = param7[8] * var34 + (param7[6] * var32 + param7[7] * var33 - -8192) >> 14;
                            var36 = var36 + var10;
                            var37 = var37 + var11;
                            var38 = var38 + var12_int;
                            var39 = 0;
                            L57: while (true) {
                              if (~var39 <= ~var9_int) {
                                break L1;
                              } else {
                                L58: {
                                  var40 = param1[var39];
                                  if (~var40 > ~((gja) this).field_D.length) {
                                    stackOut_183_0 = this;
                                    stackIn_184_0 = stackOut_183_0;
                                    L59: while (true) {
                                      var41 = ((gja) this).field_D[var40];
                                      var42 = 0;
                                      L60: while (true) {
                                        if (var42 >= var41.length) {
                                          break L58;
                                        } else {
                                          var43 = var41[var42];
                                          stackOut_186_0 = this;
                                          stackIn_184_0 = stackOut_186_0;
                                          stackIn_187_0 = stackOut_186_0;
                                          if (var47 != 0) {
                                            continue L59;
                                          } else {
                                            L61: {
                                              L62: {
                                                if (((gja) this).field_hb == null) {
                                                  break L62;
                                                } else {
                                                  if ((param6 & ((gja) this).field_hb[var43]) == 0) {
                                                    break L61;
                                                  } else {
                                                    break L62;
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
                                              break L61;
                                            }
                                            var42++;
                                            if (var47 == 0) {
                                              continue L60;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L58;
                                  }
                                }
                                var39++;
                                if (var47 == 0) {
                                  continue L57;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  if (3 == param0) {
                    L63: {
                      L64: {
                        if (param7 != null) {
                          break L64;
                        } else {
                          var10 = 0;
                          L65: while (true) {
                            L66: {
                              if (~var9_int >= ~var10) {
                                break L66;
                              } else {
                                var11 = param1[var10];
                                if (var47 != 0) {
                                  break L63;
                                } else {
                                  L67: {
                                    if (~var11 > ~((gja) this).field_D.length) {
                                      stackOut_207_0 = this;
                                      stackIn_208_0 = stackOut_207_0;
                                      L68: while (true) {
                                        var12 = ((gja) this).field_D[var11];
                                        var13 = 0;
                                        L69: while (true) {
                                          if (~var13 <= ~var12.length) {
                                            break L67;
                                          } else {
                                            var14_int = var12[var13];
                                            stackOut_210_0 = this;
                                            stackIn_208_0 = stackOut_210_0;
                                            stackIn_211_0 = stackOut_210_0;
                                            if (var47 != 0) {
                                              continue L68;
                                            } else {
                                              L70: {
                                                L71: {
                                                  if (((gja) this).field_hb == null) {
                                                    break L71;
                                                  } else {
                                                    if ((param6 & ((gja) this).field_hb[var14_int]) == 0) {
                                                      break L70;
                                                    } else {
                                                      break L71;
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
                                                break L70;
                                              }
                                              var13++;
                                              if (var47 == 0) {
                                                continue L69;
                                              } else {
                                                break L67;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L67;
                                    }
                                  }
                                  var10++;
                                  if (var47 == 0) {
                                    continue L65;
                                  } else {
                                    break L66;
                                  }
                                }
                              }
                            }
                            if (var47 == 0) {
                              break L63;
                            } else {
                              break L64;
                            }
                          }
                        }
                      }
                      L72: {
                        var10 = param7[9] << 4;
                        var11 = param7[10] << 4;
                        var12_int = param7[11] << 4;
                        var13 = param7[12] << 4;
                        var14_int = param7[13] << 4;
                        var15 = param7[14] << 4;
                        if (vr.field_o) {
                          var16 = 8192 + ina.field_a * param7[0] + (pb.field_k * param7[3] + param7[6] * uu.field_c) >> 14;
                          var17 = 8192 + (param7[1] * ina.field_a - (-(pb.field_k * param7[4]) - uu.field_c * param7[7])) >> 14;
                          var18 = uu.field_c * param7[8] + (param7[2] * ina.field_a + param7[5] * pb.field_k - -8192) >> 14;
                          var16 = var16 + var13;
                          var17 = var17 + var14_int;
                          var18 = var18 + var15;
                          ina.field_a = var16;
                          pb.field_k = var17;
                          vr.field_o = false;
                          uu.field_c = var18;
                          break L72;
                        } else {
                          break L72;
                        }
                      }
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
                      L73: while (true) {
                        stackOut_225_0 = -4;
                        stackIn_226_0 = stackOut_225_0;
                        L74: while (true) {
                          L75: {
                            L76: {
                              if (stackIn_226_0 >= ~var30) {
                                break L76;
                              } else {
                                stackOut_227_0 = 0;
                                stackIn_241_0 = stackOut_227_0;
                                stackIn_228_0 = stackOut_227_0;
                                if (var47 != 0) {
                                  break L75;
                                } else {
                                  var31 = stackIn_228_0;
                                  L77: while (true) {
                                    L78: {
                                      if (var31 >= 3) {
                                        break L78;
                                      } else {
                                        var32 = 0;
                                        stackOut_230_0 = 0;
                                        stackIn_226_0 = stackOut_230_0;
                                        stackIn_231_0 = stackOut_230_0;
                                        if (var47 != 0) {
                                          continue L74;
                                        } else {
                                          var33 = stackIn_231_0;
                                          L79: while (true) {
                                            L80: {
                                              L81: {
                                                if (var33 >= 3) {
                                                  break L81;
                                                } else {
                                                  var32 = var32 + param7[var33 + var30 * 3] * var25[var33 * 3 + var31];
                                                  var33++;
                                                  if (var47 != 0) {
                                                    break L80;
                                                  } else {
                                                    if (var47 == 0) {
                                                      continue L79;
                                                    } else {
                                                      break L81;
                                                    }
                                                  }
                                                }
                                              }
                                              var29[3 * var30 - -var31] = 8192 + var32 >> 14;
                                              var31++;
                                              break L80;
                                            }
                                            if (var47 == 0) {
                                              continue L77;
                                            } else {
                                              break L78;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var30++;
                                    if (var47 == 0) {
                                      continue L73;
                                    } else {
                                      break L76;
                                    }
                                  }
                                }
                              }
                            }
                            var30 = 8192 + (var27 * param7[1] + param7[0] * var26) + param7[2] * var28 >> 14;
                            stackOut_240_0 = 8192 + var28 * param7[5] + (var26 * param7[3] - -(param7[4] * var27)) >> 14;
                            stackIn_241_0 = stackOut_240_0;
                            break L75;
                          }
                          var31 = stackIn_241_0;
                          var30 = var30 + var10;
                          var32 = param7[7] * var27 + (param7[6] * var26 - (-(param7[8] * var28) + -8192)) >> 14;
                          var31 = var31 + var11;
                          var32 = var32 + var12_int;
                          var33 = 0;
                          L82: while (true) {
                            if (var33 >= var9_int) {
                              break L63;
                            } else {
                              L83: {
                                var34 = param1[var33];
                                if (~var34 <= ~((gja) this).field_D.length) {
                                  break L83;
                                } else {
                                  stackOut_244_0 = this;
                                  stackIn_246_0 = stackOut_244_0;
                                  L84: while (true) {
                                    var35 = ((gja) this).field_D[var34];
                                    var36 = 0;
                                    L85: while (true) {
                                      if (~var36 <= ~var35.length) {
                                        break L83;
                                      } else {
                                        var37 = var35[var36];
                                        stackOut_248_0 = this;
                                        stackIn_246_0 = stackOut_248_0;
                                        stackIn_249_0 = stackOut_248_0;
                                        if (var47 != 0) {
                                          continue L84;
                                        } else {
                                          L86: {
                                            L87: {
                                              if (((gja) this).field_hb == null) {
                                                break L87;
                                              } else {
                                                if ((((gja) this).field_hb[var37] & param6) == 0) {
                                                  break L86;
                                                } else {
                                                  break L87;
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
                                            break L86;
                                          }
                                          var36++;
                                          if (var47 == 0) {
                                            continue L85;
                                          } else {
                                            break L83;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var33++;
                              if (var47 == 0) {
                                continue L82;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    if (param0 != 5) {
                      if (param0 != 7) {
                        if (param0 == 8) {
                          L88: {
                            if (null == ((gja) this).field_mb) {
                              break L88;
                            } else {
                              var10 = 0;
                              L89: while (true) {
                                if (var10 >= var9_int) {
                                  break L88;
                                } else {
                                  L90: {
                                    L91: {
                                      var11 = param1[var10];
                                      if (((gja) this).field_mb.length > var11) {
                                        var12 = ((gja) this).field_mb[var11];
                                        var13 = 0;
                                        L92: while (true) {
                                          if (var13 >= var12.length) {
                                            break L91;
                                          } else {
                                            var14 = ((gja) this).field_nb[var12[var13]];
                                            var14.field_b = var14.field_b + param3;
                                            var14.field_e = var14.field_e + param2;
                                            var13++;
                                            if (var47 != 0) {
                                              break L90;
                                            } else {
                                              if (var47 == 0) {
                                                continue L92;
                                              } else {
                                                break L91;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L91;
                                      }
                                    }
                                    var10++;
                                    break L90;
                                  }
                                  if (var47 == 0) {
                                    continue L89;
                                  } else {
                                    break L88;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          if (param0 == 10) {
                            L93: {
                              if (null != ((gja) this).field_mb) {
                                var10 = 0;
                                L94: while (true) {
                                  if (~var10 <= ~var9_int) {
                                    break L93;
                                  } else {
                                    L95: {
                                      L96: {
                                        var11 = param1[var10];
                                        if (~((gja) this).field_mb.length >= ~var11) {
                                          break L96;
                                        } else {
                                          var12 = ((gja) this).field_mb[var11];
                                          var13 = 0;
                                          L97: while (true) {
                                            if (~var12.length >= ~var13) {
                                              break L96;
                                            } else {
                                              var14 = ((gja) this).field_nb[var12[var13]];
                                              var14.field_m = var14.field_m * param2 >> 7;
                                              var14.field_k = var14.field_k * param3 >> 7;
                                              var13++;
                                              if (var47 != 0) {
                                                break L95;
                                              } else {
                                                if (var47 == 0) {
                                                  continue L97;
                                                } else {
                                                  break L96;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var10++;
                                      break L95;
                                    }
                                    if (var47 == 0) {
                                      continue L94;
                                    } else {
                                      break L93;
                                    }
                                  }
                                }
                              } else {
                                break L93;
                              }
                            }
                            return;
                          } else {
                            if (param0 == 9) {
                              L98: {
                                if (null == ((gja) this).field_mb) {
                                  break L98;
                                } else {
                                  var10 = 0;
                                  L99: while (true) {
                                    if (var10 >= var9_int) {
                                      break L98;
                                    } else {
                                      L100: {
                                        L101: {
                                          var11 = param1[var10];
                                          if (((gja) this).field_mb.length <= var11) {
                                            break L101;
                                          } else {
                                            var12 = ((gja) this).field_mb[var11];
                                            var13 = 0;
                                            L102: while (true) {
                                              if (var12.length <= var13) {
                                                break L101;
                                              } else {
                                                var14 = ((gja) this).field_nb[var12[var13]];
                                                var14.field_c = 16383 & param2 + var14.field_c;
                                                var13++;
                                                if (var47 != 0) {
                                                  break L100;
                                                } else {
                                                  if (var47 == 0) {
                                                    continue L102;
                                                  } else {
                                                    break L101;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var10++;
                                        break L100;
                                      }
                                      if (var47 == 0) {
                                        continue L99;
                                      } else {
                                        break L98;
                                      }
                                    }
                                  }
                                }
                              }
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                      } else {
                        L103: {
                          if (null == ((gja) this).field_q) {
                            break L103;
                          } else {
                            var10 = 0;
                            var11 = 0;
                            L104: while (true) {
                              L105: {
                                L106: {
                                  L107: {
                                    L108: {
                                      if (var9_int <= var11) {
                                        break L108;
                                      } else {
                                        var12_int = param1[var11];
                                        stackOut_314_0 = ~((gja) this).field_q.length;
                                        stackOut_314_1 = ~var12_int;
                                        stackIn_358_0 = stackOut_314_0;
                                        stackIn_358_1 = stackOut_314_1;
                                        stackIn_315_0 = stackOut_314_0;
                                        stackIn_315_1 = stackOut_314_1;
                                        if (var47 != 0) {
                                          L109: while (true) {
                                            if (stackIn_358_0 <= stackIn_358_1) {
                                              break L105;
                                            } else {
                                              var12_ref = ((gja) this).field_u[var11];
                                              var13_ref_gca = ((gja) this).field_nb[var11];
                                              var13_ref_gca.field_h = cla.field_m[65535 & ((gja) this).field_P[var12_ref.field_m]] & 16777215 | var13_ref_gca.field_h & -16777216;
                                              var11++;
                                              if (var47 != 0) {
                                                break L103;
                                              } else {
                                                if (var47 == 0) {
                                                  stackOut_357_0 = ((gja) this).field_L;
                                                  stackOut_357_1 = var11;
                                                  stackIn_358_0 = stackOut_357_0;
                                                  stackIn_358_1 = stackOut_357_1;
                                                  continue L109;
                                                } else {
                                                  break L106;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L110: {
                                            if (stackIn_315_0 < stackIn_315_1) {
                                              var13_ref_int__ = ((gja) this).field_q[var12_int];
                                              var14_int = 0;
                                              L111: while (true) {
                                                L112: {
                                                  if (~var14_int <= ~var13_ref_int__.length) {
                                                    break L112;
                                                  } else {
                                                    var15 = var13_ref_int__[var14_int];
                                                    stackOut_321_0 = null;
                                                    stackOut_321_1 = this;
                                                    stackIn_353_0 = stackOut_321_0;
                                                    stackIn_353_1 = stackOut_321_1;
                                                    stackIn_322_0 = stackOut_321_0;
                                                    stackIn_322_1 = stackOut_321_1;
                                                    if (var47 != 0) {
                                                      break L107;
                                                    } else {
                                                      L113: {
                                                        L114: {
                                                          if (stackIn_322_0 == (Object) (Object) ((gja) this).field_jb) {
                                                            break L114;
                                                          } else {
                                                            if ((((gja) this).field_jb[var15] & param6) == 0) {
                                                              break L113;
                                                            } else {
                                                              break L114;
                                                            }
                                                          }
                                                        }
                                                        L115: {
                                                          L116: {
                                                            var16 = ((gja) this).field_P[var15] & 65535;
                                                            var17 = var16 >> 10 & 63;
                                                            var18 = 7 & var16 >> 7;
                                                            var18 = var18 + param3 / 4;
                                                            var19 = var16 & 127;
                                                            var17 = param2 + var17 & 63;
                                                            if (var18 >= 0) {
                                                              break L116;
                                                            } else {
                                                              var18 = 0;
                                                              if (var47 == 0) {
                                                                break L115;
                                                              } else {
                                                                break L116;
                                                              }
                                                            }
                                                          }
                                                          if (var18 <= 7) {
                                                            break L115;
                                                          } else {
                                                            var18 = 7;
                                                            break L115;
                                                          }
                                                        }
                                                        L117: {
                                                          L118: {
                                                            var19 = var19 + param4;
                                                            if (var19 >= 0) {
                                                              break L118;
                                                            } else {
                                                              var19 = 0;
                                                              if (var47 == 0) {
                                                                break L117;
                                                              } else {
                                                                break L118;
                                                              }
                                                            }
                                                          }
                                                          if (var19 > 127) {
                                                            var19 = 127;
                                                            break L117;
                                                          } else {
                                                            break L117;
                                                          }
                                                        }
                                                        ((gja) this).field_P[var15] = (short)fh.a(var19, fh.a(var18 << 7, var17 << 10));
                                                        break L113;
                                                      }
                                                      var14_int++;
                                                      if (var47 == 0) {
                                                        continue L111;
                                                      } else {
                                                        break L112;
                                                      }
                                                    }
                                                  }
                                                }
                                                L119: {
                                                  stackOut_344_0 = var10;
                                                  stackIn_347_0 = stackOut_344_0;
                                                  stackIn_345_0 = stackOut_344_0;
                                                  if (var13_ref_int__.length <= 0) {
                                                    stackOut_347_0 = stackIn_347_0;
                                                    stackOut_347_1 = 0;
                                                    stackIn_348_0 = stackOut_347_0;
                                                    stackIn_348_1 = stackOut_347_1;
                                                    break L119;
                                                  } else {
                                                    stackOut_345_0 = stackIn_345_0;
                                                    stackOut_345_1 = 1;
                                                    stackIn_348_0 = stackOut_345_0;
                                                    stackIn_348_1 = stackOut_345_1;
                                                    break L119;
                                                  }
                                                }
                                                var10 = stackIn_348_0 | stackIn_348_1;
                                                break L110;
                                              }
                                            } else {
                                              break L110;
                                            }
                                          }
                                          var11++;
                                          if (var47 == 0) {
                                            continue L104;
                                          } else {
                                            break L108;
                                          }
                                        }
                                      }
                                    }
                                    if (var10 == 0) {
                                      break L103;
                                    } else {
                                      stackOut_351_0 = null;
                                      stackOut_351_1 = this;
                                      stackIn_353_0 = stackOut_351_0;
                                      stackIn_353_1 = stackOut_351_1;
                                      break L107;
                                    }
                                  }
                                  if (stackIn_353_0 != (Object) (Object) ((gja) this).field_u) {
                                    var11 = 0;
                                    L120: while (true) {
                                      stackOut_357_0 = ((gja) this).field_L;
                                      stackOut_357_1 = var11;
                                      stackIn_358_0 = stackOut_357_0;
                                      stackIn_358_1 = stackOut_357_1;
                                      if (stackIn_358_0 <= stackIn_358_1) {
                                        break L105;
                                      } else {
                                        var12_ref = ((gja) this).field_u[var11];
                                        var13_ref_gca = ((gja) this).field_nb[var11];
                                        var13_ref_gca.field_h = cla.field_m[65535 & ((gja) this).field_P[var12_ref.field_m]] & 16777215 | var13_ref_gca.field_h & -16777216;
                                        var11++;
                                        if (var47 != 0) {
                                          break L103;
                                        } else {
                                          if (var47 == 0) {
                                            continue L120;
                                          } else {
                                            break L106;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L105;
                                  }
                                }
                                break L105;
                              }
                              this.e(0);
                              break L103;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L121: {
                        if (((gja) this).field_q == null) {
                          break L121;
                        } else {
                          var10 = 0;
                          var11 = 0;
                          L122: while (true) {
                            L123: {
                              L124: {
                                L125: {
                                  L126: {
                                    if (var11 >= var9_int) {
                                      break L126;
                                    } else {
                                      var12_int = param1[var11];
                                      stackOut_263_0 = ~var12_int;
                                      stackOut_263_1 = ~((gja) this).field_q.length;
                                      stackIn_301_0 = stackOut_263_0;
                                      stackIn_301_1 = stackOut_263_1;
                                      stackIn_264_0 = stackOut_263_0;
                                      stackIn_264_1 = stackOut_263_1;
                                      if (var47 != 0) {
                                        L127: while (true) {
                                          if (stackIn_301_0 >= stackIn_301_1) {
                                            break L123;
                                          } else {
                                            var12_ref = ((gja) this).field_u[var11];
                                            var13_ref_gca = ((gja) this).field_nb[var11];
                                            var13_ref_gca.field_h = var13_ref_gca.field_h & 16777215 | 255 + -(((gja) this).field_C[var12_ref.field_m] & 255) << 24;
                                            var11++;
                                            if (var47 != 0) {
                                              break L121;
                                            } else {
                                              if (var47 == 0) {
                                                stackOut_300_0 = ~((gja) this).field_L;
                                                stackOut_300_1 = ~var11;
                                                stackIn_301_0 = stackOut_300_0;
                                                stackIn_301_1 = stackOut_300_1;
                                                continue L127;
                                              } else {
                                                break L124;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L128: {
                                          if (stackIn_264_0 <= stackIn_264_1) {
                                            break L128;
                                          } else {
                                            var13_ref_int__ = ((gja) this).field_q[var12_int];
                                            var14_int = 0;
                                            L129: while (true) {
                                              L130: {
                                                if (~var13_ref_int__.length >= ~var14_int) {
                                                  break L130;
                                                } else {
                                                  var15 = var13_ref_int__[var14_int];
                                                  stackOut_269_0 = null;
                                                  stackOut_269_1 = this;
                                                  stackIn_298_0 = stackOut_269_0;
                                                  stackIn_298_1 = stackOut_269_1;
                                                  stackIn_270_0 = stackOut_269_0;
                                                  stackIn_270_1 = stackOut_269_1;
                                                  if (var47 != 0) {
                                                    break L125;
                                                  } else {
                                                    L131: {
                                                      L132: {
                                                        if (stackIn_270_0 == (Object) (Object) ((gja) this).field_jb) {
                                                          break L132;
                                                        } else {
                                                          if (0 != (param6 & ((gja) this).field_jb[var15])) {
                                                            break L132;
                                                          } else {
                                                            if (var47 == 0) {
                                                              break L131;
                                                            } else {
                                                              break L132;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L133: {
                                                        L134: {
                                                          var16 = 8 * param2 + (255 & ((gja) this).field_C[var15]);
                                                          if (0 <= var16) {
                                                            break L134;
                                                          } else {
                                                            var16 = 0;
                                                            if (var47 == 0) {
                                                              break L133;
                                                            } else {
                                                              break L134;
                                                            }
                                                          }
                                                        }
                                                        if (255 < var16) {
                                                          var16 = 255;
                                                          break L133;
                                                        } else {
                                                          break L133;
                                                        }
                                                      }
                                                      ((gja) this).field_C[var15] = (byte)var16;
                                                      break L131;
                                                    }
                                                    var14_int++;
                                                    if (var47 == 0) {
                                                      continue L129;
                                                    } else {
                                                      break L130;
                                                    }
                                                  }
                                                }
                                              }
                                              L135: {
                                                stackOut_289_0 = var10;
                                                stackIn_292_0 = stackOut_289_0;
                                                stackIn_290_0 = stackOut_289_0;
                                                if (var13_ref_int__.length <= 0) {
                                                  stackOut_292_0 = stackIn_292_0;
                                                  stackOut_292_1 = 0;
                                                  stackIn_293_0 = stackOut_292_0;
                                                  stackIn_293_1 = stackOut_292_1;
                                                  break L135;
                                                } else {
                                                  stackOut_290_0 = stackIn_290_0;
                                                  stackOut_290_1 = 1;
                                                  stackIn_293_0 = stackOut_290_0;
                                                  stackIn_293_1 = stackOut_290_1;
                                                  break L135;
                                                }
                                              }
                                              var10 = stackIn_293_0 | stackIn_293_1;
                                              break L128;
                                            }
                                          }
                                        }
                                        var11++;
                                        if (var47 == 0) {
                                          continue L122;
                                        } else {
                                          break L126;
                                        }
                                      }
                                    }
                                  }
                                  if (var10 == 0) {
                                    break L121;
                                  } else {
                                    stackOut_296_0 = null;
                                    stackOut_296_1 = this;
                                    stackIn_298_0 = stackOut_296_0;
                                    stackIn_298_1 = stackOut_296_1;
                                    break L125;
                                  }
                                }
                                if (stackIn_298_0 == (Object) (Object) ((gja) this).field_u) {
                                  break L123;
                                } else {
                                  var11 = 0;
                                  L136: while (true) {
                                    stackOut_300_0 = ~((gja) this).field_L;
                                    stackOut_300_1 = ~var11;
                                    stackIn_301_0 = stackOut_300_0;
                                    stackIn_301_1 = stackOut_300_1;
                                    if (stackIn_301_0 >= stackIn_301_1) {
                                      break L123;
                                    } else {
                                      var12_ref = ((gja) this).field_u[var11];
                                      var13_ref_gca = ((gja) this).field_nb[var11];
                                      var13_ref_gca.field_h = var13_ref_gca.field_h & 16777215 | 255 + -(((gja) this).field_C[var12_ref.field_m] & 255) << 24;
                                      var11++;
                                      if (var47 != 0) {
                                        break L121;
                                      } else {
                                        if (var47 == 0) {
                                          continue L136;
                                        } else {
                                          break L124;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              break L123;
                            }
                            this.e(0);
                            break L121;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              } else {
                L137: {
                  if (null == param7) {
                    break L137;
                  } else {
                    var10 = 8192 + (param3 * param7[1] + param2 * param7[0] + param4 * param7[2]) >> 14;
                    var11 = 8192 + (param4 * param7[5] + param3 * param7[4] + param2 * param7[3]) >> 14;
                    var12_int = 8192 + param7[8] * param4 + (param7[7] * param3 + param2 * param7[6]) >> 14;
                    param3 = var11;
                    param2 = var10;
                    param4 = var12_int;
                    break L137;
                  }
                }
                param3 = param3 << 4;
                param4 = param4 << 4;
                param2 = param2 << 4;
                var10 = 0;
                L138: while (true) {
                  L139: {
                    if (~var9_int >= ~var10) {
                      break L139;
                    } else {
                      L140: {
                        L141: {
                          var11 = param1[var10];
                          if (~((gja) this).field_D.length < ~var11) {
                            var12 = ((gja) this).field_D[var11];
                            var13 = 0;
                            L142: while (true) {
                              if (var13 >= var12.length) {
                                break L141;
                              } else {
                                var14_int = var12[var13];
                                if (var47 != 0) {
                                  break L140;
                                } else {
                                  L143: {
                                    L144: {
                                      if (null == ((gja) this).field_hb) {
                                        break L144;
                                      } else {
                                        if ((((gja) this).field_hb[var14_int] & param6) != 0) {
                                          break L144;
                                        } else {
                                          if (var47 == 0) {
                                            break L143;
                                          } else {
                                            break L144;
                                          }
                                        }
                                      }
                                    }
                                    ((gja) this).field_Z[var14_int] = ((gja) this).field_Z[var14_int] + param2;
                                    ((gja) this).field_r[var14_int] = ((gja) this).field_r[var14_int] + param3;
                                    ((gja) this).field_l[var14_int] = ((gja) this).field_l[var14_int] + param4;
                                    break L143;
                                  }
                                  var13++;
                                  if (var47 == 0) {
                                    continue L142;
                                  } else {
                                    break L141;
                                  }
                                }
                              }
                            }
                          } else {
                            break L141;
                          }
                        }
                        var10++;
                        break L140;
                      }
                      if (var47 == 0) {
                        continue L138;
                      } else {
                        break L139;
                      }
                    }
                  }
                  return;
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
              L145: while (true) {
                L146: {
                  L147: {
                    L148: {
                      if (var11 >= var9_int) {
                        break L148;
                      } else {
                        var12_int = param1[var11];
                        stackOut_4_0 = var12_int;
                        stackOut_4_1 = ((gja) this).field_D.length;
                        stackIn_32_0 = stackOut_4_0;
                        stackIn_32_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (var47 != 0) {
                          break L147;
                        } else {
                          L149: {
                            L150: {
                              if (stackIn_5_0 < stackIn_5_1) {
                                var13_ref_int__ = ((gja) this).field_D[var12_int];
                                var14_int = 0;
                                L151: while (true) {
                                  if (~var14_int <= ~var13_ref_int__.length) {
                                    break L150;
                                  } else {
                                    var15 = var13_ref_int__[var14_int];
                                    if (var47 != 0) {
                                      break L149;
                                    } else {
                                      L152: {
                                        L153: {
                                          if (null == ((gja) this).field_hb) {
                                            break L153;
                                          } else {
                                            if ((param6 & ((gja) this).field_hb[var15]) != 0) {
                                              break L153;
                                            } else {
                                              if (var47 == 0) {
                                                break L152;
                                              } else {
                                                break L153;
                                              }
                                            }
                                          }
                                        }
                                        ina.field_a = ina.field_a + ((gja) this).field_Z[var15];
                                        pb.field_k = pb.field_k + ((gja) this).field_r[var15];
                                        uu.field_c = uu.field_c + ((gja) this).field_l[var15];
                                        var10++;
                                        break L152;
                                      }
                                      var14_int++;
                                      if (var47 == 0) {
                                        continue L151;
                                      } else {
                                        break L150;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L150;
                              }
                            }
                            var11++;
                            break L149;
                          }
                          if (var47 == 0) {
                            continue L145;
                          } else {
                            break L148;
                          }
                        }
                      }
                    }
                    L154: {
                      if (var10 > 0) {
                        break L154;
                      } else {
                        uu.field_c = param4;
                        pb.field_k = param3;
                        ina.field_a = param2;
                        if (var47 == 0) {
                          break L146;
                        } else {
                          break L154;
                        }
                      }
                    }
                    vr.field_o = true;
                    uu.field_c = param4 + uu.field_c / var10;
                    ina.field_a = ina.field_a / var10 - -param2;
                    stackOut_30_0 = param3;
                    stackOut_30_1 = pb.field_k / var10;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    break L147;
                  }
                  pb.field_k = stackIn_32_0 + stackIn_32_1;
                  break L146;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L155: {
            var9 = decompiledCaughtException;
            stackOut_418_0 = (RuntimeException) var9;
            stackOut_418_1 = new StringBuilder().append("gja.I(").append(param0).append(',');
            stackIn_421_0 = stackOut_418_0;
            stackIn_421_1 = stackOut_418_1;
            stackIn_419_0 = stackOut_418_0;
            stackIn_419_1 = stackOut_418_1;
            if (param1 == null) {
              stackOut_421_0 = (RuntimeException) (Object) stackIn_421_0;
              stackOut_421_1 = (StringBuilder) (Object) stackIn_421_1;
              stackOut_421_2 = "null";
              stackIn_422_0 = stackOut_421_0;
              stackIn_422_1 = stackOut_421_1;
              stackIn_422_2 = stackOut_421_2;
              break L155;
            } else {
              stackOut_419_0 = (RuntimeException) (Object) stackIn_419_0;
              stackOut_419_1 = (StringBuilder) (Object) stackIn_419_1;
              stackOut_419_2 = "{...}";
              stackIn_422_0 = stackOut_419_0;
              stackIn_422_1 = stackOut_419_1;
              stackIn_422_2 = stackOut_419_2;
              break L155;
            }
          }
          L156: {
            stackOut_422_0 = (RuntimeException) (Object) stackIn_422_0;
            stackOut_422_1 = ((StringBuilder) (Object) stackIn_422_1).append(stackIn_422_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_425_0 = stackOut_422_0;
            stackIn_425_1 = stackOut_422_1;
            stackIn_423_0 = stackOut_422_0;
            stackIn_423_1 = stackOut_422_1;
            if (param7 == null) {
              stackOut_425_0 = (RuntimeException) (Object) stackIn_425_0;
              stackOut_425_1 = (StringBuilder) (Object) stackIn_425_1;
              stackOut_425_2 = "null";
              stackIn_426_0 = stackOut_425_0;
              stackIn_426_1 = stackOut_425_1;
              stackIn_426_2 = stackOut_425_2;
              break L156;
            } else {
              stackOut_423_0 = (RuntimeException) (Object) stackIn_423_0;
              stackOut_423_1 = (StringBuilder) (Object) stackIn_423_1;
              stackOut_423_2 = "{...}";
              stackIn_426_0 = stackOut_423_0;
              stackIn_426_1 = stackOut_423_1;
              stackIn_426_2 = stackOut_423_2;
              break L156;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_426_0, stackIn_426_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int stackIn_7_0 = 0;
        short stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        short stackOut_18_0 = 0;
        short stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param9) {
                break L1;
              } else {
                ((gja) this).field_W = -119;
                break L1;
              }
            }
            var13_int = ((gja) this).field_J[param3];
            var14 = ((gja) this).field_J[1 + param3];
            var15 = 0;
            var16 = var13_int;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var14 >= ~var16) {
                    break L4;
                  } else {
                    var17 = ((gja) this).field_db[var16];
                    stackOut_6_0 = 0;
                    stackIn_22_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var18 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0 == var17) {
                          var15 = var16;
                          if (var18 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      if (~param6 == ~tl.field_q[var16]) {
                        stackOut_18_0 = (short)(var17 - 1);
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        var16++;
                        if (var18 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
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
                stackOut_21_0 = (short)fieldTemp$1;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var13 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var13;
            stackOut_23_1 = new StringBuilder().append("gja.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param10 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return (short) stackIn_22_0;
    }

    final ka a(byte param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        gja var4_ref = null;
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
              L2: {
                if (param0 != 1) {
                  break L2;
                } else {
                  var5 = ((gja) this).field_S.field_tb;
                  var4_ref = ((gja) this).field_S.field_cc;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 == 2) {
                  break L3;
                } else {
                  L4: {
                    if (param0 == 3) {
                      break L4;
                    } else {
                      L5: {
                        if (param0 != 4) {
                          break L5;
                        } else {
                          var5 = ((gja) this).field_S.field_n;
                          var4_ref = ((gja) this).field_S.field_O;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (5 == param0) {
                          break L6;
                        } else {
                          gja dupTemp$1 = new gja(((gja) this).field_S, 0, 0, true, false);
                          var5 = dupTemp$1;
                          var4_ref = dupTemp$1;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = ((gja) this).field_S.field_tc;
                      var4_ref = ((gja) this).field_S.field_ec;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4_ref = ((gja) this).field_S.field_fb;
                  var5 = ((gja) this).field_S.field_E;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              var5 = ((gja) this).field_S.field_W;
              var4_ref = ((gja) this).field_S.field_gc;
              break L1;
            }
            L7: {
              stackOut_20_0 = this;
              stackOut_20_1 = (gja) var4_ref;
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
                break L7;
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
                break L7;
              }
            }
            stackOut_24_0 = this.a(stackIn_24_1, stackIn_24_2 != 0, stackIn_24_3, stackIn_24_4 != 0, param1, param2);
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "gja.A(" + param0 + ',' + param1 + ',' + param2 + ')');
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
                  this.f(-913);
                  break L1;
                }
              }
              L2: {
                L3: {
                  qra.field_d = var5.field_o * var4_ref.field_h + (var4_ref.field_o * var5.field_q + var4_ref.field_p * var5.field_l);
                  gj.field_h = var5.field_n * var4_ref.field_o + var5.field_e * var4_ref.field_p + var4_ref.field_h * var5.field_i + var4_ref.field_i;
                  var6 = gj.field_h + qra.field_d * (float)((gja) this).field_o;
                  var7 = gj.field_h + (float)((gja) this).field_n * qra.field_d;
                  if (var7 < var6) {
                    break L3;
                  } else {
                    var8 = var6 - (float)((gja) this).field_H;
                    var9 = (float)((gja) this).field_H + var7;
                    if (var24 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8 = (float)(-((gja) this).field_H) + var7;
                var9 = (float)((gja) this).field_H + var6;
                break L2;
              }
              if (var8 < ((gja) this).field_S.field_d) {
                if (var9 > (float)((gja) this).field_S.field_D) {
                  L4: {
                    L5: {
                      fba.field_a = var5.field_n * var4_ref.field_l + var4_ref.field_g * var5.field_e + var5.field_i * var4_ref.field_f + var4_ref.field_e;
                      vta.field_e = var4_ref.field_f * var5.field_o + (var5.field_l * var4_ref.field_g + var4_ref.field_l * var5.field_q);
                      var10 = (float)((gja) this).field_o * vta.field_e + fba.field_a;
                      var11 = (float)((gja) this).field_n * vta.field_e + fba.field_a;
                      if (var11 >= var10) {
                        break L5;
                      } else {
                        var13 = (var10 + (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                        var12 = (float)((gja) this).field_S.field_Ic * ((float)(-((gja) this).field_H) + var11);
                        if (var24 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var12 = (var10 - (float)((gja) this).field_H) * (float)((gja) this).field_S.field_Ic;
                    var13 = (float)((gja) this).field_S.field_Ic * (var11 + (float)((gja) this).field_H);
                    break L4;
                  }
                  if (((gja) this).field_S.field_uc > var12 / var9) {
                    if (((gja) this).field_S.field_f < var13 / var9) {
                      L6: {
                        L7: {
                          tu.field_g = var5.field_i * var4_ref.field_m + (var5.field_e * var4_ref.field_k + var4_ref.field_q * var5.field_n) + var4_ref.field_n;
                          kb.field_p = var4_ref.field_m * var5.field_o + (var4_ref.field_q * var5.field_q + var4_ref.field_k * var5.field_l);
                          var14 = tu.field_g + (float)((gja) this).field_o * kb.field_p;
                          var15 = tu.field_g + kb.field_p * (float)((gja) this).field_n;
                          if (var15 >= var14) {
                            break L7;
                          } else {
                            var17 = ((float)((gja) this).field_H + var14) * (float)((gja) this).field_S.field_h;
                            var16 = ((float)(-((gja) this).field_H) + var15) * (float)((gja) this).field_S.field_h;
                            if (var24 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var16 = ((float)(-((gja) this).field_H) + var14) * (float)((gja) this).field_S.field_h;
                        var17 = (float)((gja) this).field_S.field_h * ((float)((gja) this).field_H + var15);
                        break L6;
                      }
                      if (var16 / var9 < ((gja) this).field_S.field_H) {
                        if (var17 / var9 > ((gja) this).field_S.field_zc) {
                          L8: {
                            L9: {
                              if (null != param1) {
                                break L9;
                              } else {
                                if (((gja) this).field_u != null) {
                                  break L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            vs.field_O = var4_ref.field_m * var5.field_p + (var5.field_k * var4_ref.field_q + var5.field_g * var4_ref.field_k);
                            wka.field_b = var4_ref.field_f * var5.field_h + (var5.field_f * var4_ref.field_g + var5.field_m * var4_ref.field_l);
                            ct.field_b = var5.field_m * var4_ref.field_q + var5.field_f * var4_ref.field_k + var5.field_h * var4_ref.field_m;
                            hs.field_c = var4_ref.field_o * var5.field_m + var4_ref.field_p * var5.field_f + var4_ref.field_h * var5.field_h;
                            pl.field_a = var4_ref.field_o * var5.field_k + var5.field_g * var4_ref.field_p + var4_ref.field_h * var5.field_p;
                            baa.field_c = var4_ref.field_g * var5.field_g + var4_ref.field_l * var5.field_k + var5.field_p * var4_ref.field_f;
                            break L8;
                          }
                          L10: {
                            if (null != param1) {
                              L11: {
                                var18 = 0;
                                var19 = 1;
                                var20 = ((gja) this).field_K + ((gja) this).field_i >> 1;
                                var21 = ((gja) this).field_cb - -((gja) this).field_Q >> 1;
                                var22 = (int)(hs.field_c * (float)var21 + ((float)((gja) this).field_o * qra.field_d + (gj.field_h + (float)var20 * pl.field_a)));
                                if (var22 < ((gja) this).field_S.field_D) {
                                  var18 = 1;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                var23 = (int)(gj.field_h + pl.field_a * (float)var20 + qra.field_d * (float)((gja) this).field_n + hs.field_c * (float)var21);
                                if (((gja) this).field_S.field_D > var23) {
                                  var18 = 1;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if (var18 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (((gja) this).field_S.field_D <= var22) {
                                      break L14;
                                    } else {
                                      if (var23 < ((gja) this).field_S.field_D) {
                                        var19 = 0;
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (~var22 <= ~((gja) this).field_S.field_D) {
                                    if (((gja) this).field_S.field_D <= var23) {
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var19 == 0) {
                                break L10;
                              } else {
                                if (var23 >= var22) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              break L10;
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
          L15: {
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
              break L15;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L15;
            }
          }
          L16: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
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
              break L16;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L16;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param2 + ')');
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
                  if (foa.a(((gja) this).field_Y, ((gja) this).field_h, 0)) {
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
              ((gja) this).field_E = new hg(no.a(((gja) this).field_h, ((gja) this).field_Y, 36864));
              break L5;
            }
            L7: {
              L8: {
                if (param3) {
                  break L8;
                } else {
                  if (!vta.a(((gja) this).field_h, ((gja) this).field_Y, 2048)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              ((gja) this).field_O = new hg(oba.c(((gja) this).field_Y, ((gja) this).field_h, -19531));
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
          throw tba.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
