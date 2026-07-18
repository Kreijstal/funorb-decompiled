/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nf {
    int field_mb;
    private int field_w;
    private tg field_I;
    ll field_V;
    private int[] field_ib;
    int field_t;
    int field_hb;
    th field_Ib;
    int field_q;
    int[] field_pb;
    private boolean field_Gb;
    static String[] field_qb;
    private int[] field_a;
    private boolean field_Mb;
    boolean field_M;
    private int[] field_E;
    private boolean field_zb;
    int[] field_Eb;
    int field_Q;
    private mo field_B;
    int field_Hb;
    int field_tb;
    int[] field_Ab;
    boolean[] field_u;
    int field_y;
    int field_G;
    int[] field_Ob;
    private int[] field_ob;
    static Calendar field_Bb;
    int[] field_c;
    int[] field_U;
    static int[] field_z;
    int[] field_X;
    vn field_kb;
    int[] field_R;
    int field_bb;
    private int field_nb;
    int field_C;
    private int field_m;
    wf[] field_rb;
    vn field_Kb;
    private int field_Cb;
    int[] field_cb;
    vn field_i;
    int[] field_o;
    int[] field_ab;
    private int field_jb;
    int[] field_s;
    private int field_xb;
    int[] field_wb;
    static kc field_j;
    int[] field_b;
    private vn field_Db;
    private int[][] field_lb;
    boolean field_D;
    String[] field_k;
    boolean field_f;
    int[] field_db;
    int[] field_x;
    int[] field_n;
    int[] field_p;
    int[] field_K;
    private ll field_Jb;
    int[] field_Nb;
    tg field_h;
    int field_H;
    int[] field_S;
    int field_Y;
    boolean field_d;
    private boolean field_l;
    private int[] field_fb;
    private boolean field_eb;
    private int[][] field_v;
    boolean field_Z;
    wf[] field_sb;
    int[] field_T;
    int field_F;
    vn field_r;
    private int[][] field_vb;
    int[][] field_N;
    private int field_J;
    static int field_W;
    private boolean[][] field_L;
    private boolean field_ub;
    int[] field_Fb;
    static hn field_P;
    int[] field_gb;
    int[] field_g;
    private int field_O;
    static String field_yb;
    static String field_e;
    static kc field_A;
    static int[] field_Lb;

    private final int c() {
        int var3 = 0;
        oc var4 = null;
        ml var5_ref_ml = null;
        mi var5_ref_mi = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = 0;
        var4 = new oc(((nf) this).field_i);
        var5_ref_ml = (ml) (Object) var4.b(-99);
        L0: while (true) {
          if (var5_ref_ml == null) {
            var4.a((byte) 82, ((nf) this).field_Kb);
            var5_ref_mi = (mi) (Object) var4.b(-60);
            L1: while (true) {
              if (var5_ref_mi == null) {
                var4.a((byte) 31, ((nf) this).field_r);
                var6 = 26;
                var5_ref_mi = (mi) (Object) var4.b(-104);
                L2: while (true) {
                  if (var5_ref_mi == null) {
                    L3: {
                      var3 = var3 + ((nf) this).field_mb;
                      if (((nf) this).field_mb == -1000) {
                        break L3;
                      } else {
                        var3 = var3 + ((nf) this).field_t * 1001;
                        break L3;
                      }
                    }
                    var5 = ((nf) this).field_Jb.field_m.length + -1;
                    L4: while (true) {
                      if (0 > var5) {
                        return var3;
                      } else {
                        L5: {
                          if (((nf) this).field_Jb.field_m[var5] == 0) {
                            break L5;
                          } else {
                            var3 = var3 + (37 + (var5 & 7) * 37);
                            break L5;
                          }
                        }
                        var5--;
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (!var5_ref_mi.k(-83)) {
                        var3 = var3 + (19 * (var5_ref_mi.field_z * (var5_ref_mi.field_o + 17)) + (23 + var5_ref_mi.field_I) * (var5_ref_mi.field_H * 29 + var5_ref_mi.field_y));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var5_ref_mi = (mi) (Object) var4.d(-18502);
                    continue L2;
                  }
                }
              } else {
                L7: {
                  if (var5_ref_mi.k(-36)) {
                    break L7;
                  } else {
                    var3 = var3 + ((var5_ref_mi.field_y + var5_ref_mi.field_H * 29) * (23 + var5_ref_mi.field_I) + (var5_ref_mi.field_o - -17) * 19 * var5_ref_mi.field_z);
                    break L7;
                  }
                }
                var5_ref_mi = (mi) (Object) var4.d(-18502);
                continue L1;
              }
            }
          } else {
            var3 = var3 + ((var5_ref_ml.field_R - -11) * (var5_ref_ml.field_X + 5) + (var5_ref_ml.field_q * 13 + (7 * var5_ref_ml.field_ib - -var5_ref_ml.field_jb)) * (1 + var5_ref_ml.field_T));
            var5_ref_ml = (ml) (Object) var4.d(-18502);
            continue L0;
          }
        }
    }

    final ml a(int param0, boolean param1) {
        if (!param1) {
            ((nf) this).field_u = null;
        }
        return (ml) (Object) ((nf) this).field_B.a((long)param0, (byte) -87);
    }

    final boolean b(int param0, int param1, int param2, qb param3) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == 2) {
                break L1;
              } else {
                nf.r(-29);
                break L1;
              }
            }
            stackOut_2_0 = fk.a((nf) this, param0, ((nf) this).field_Jb, param2, (byte) -1, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("nf.JC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          if (null != ti.field_I) {
            var2 = ti.field_I[((nf) this).field_O].field_m.length + -1;
            L1: while (true) {
              if (var2 < 0) {
                mn.field_y.field_l[253] = 11184810;
                mn.field_y.field_l[251] = 16777215;
                mn.field_y.field_l[252] = 16777215;
                mn.field_y.field_l[254] = 7829367;
                break L0;
              } else {
                var2--;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          var2 = 16384;
          var3 = 18048;
          if (~var3 >= ~ti.field_I[((nf) this).field_O].field_m.length) {
            break L2;
          } else {
            var3 = ti.field_I[((nf) this).field_O].field_m.length;
            break L2;
          }
        }
        L3: {
          var4 = 2;
          if (0 != ((nf) this).field_O) {
            break L3;
          } else {
            var4 = 4;
            break L3;
          }
        }
        L4: {
          if (((nf) this).field_O == 5) {
            var4 = 4;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var5 = 0;
          if (((nf) this).field_O == 6) {
            break L5;
          } else {
            var6 = 0;
            L6: while (true) {
              if (~((nf) this).field_H >= ~var6) {
                var5 = 0;
                var6 = 0;
                L7: while (true) {
                  if (((nf) this).field_H <= var6) {
                    break L5;
                  } else {
                    var7 = 0;
                    L8: while (true) {
                      if (~((nf) this).field_y >= ~var7) {
                        var6++;
                        continue L7;
                      } else {
                        L9: {
                          L10: {
                            L11: {
                              if (var5 <= 0) {
                                break L11;
                              } else {
                                if (mn.field_y.field_m[var5] != -5) {
                                  break L11;
                                } else {
                                  if (mn.field_y.field_m[-1 + var5] == -5) {
                                    break L11;
                                  } else {
                                    if (0 == mn.field_y.field_m[-1 + var5]) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            if (~var5 <= ~(-1 + mn.field_y.field_m.length)) {
                              break L9;
                            } else {
                              if (mn.field_y.field_m[var5] != -5) {
                                break L9;
                              } else {
                                if (-5 == mn.field_y.field_m[1 + var5]) {
                                  break L9;
                                } else {
                                  if (mn.field_y.field_m[var5 - -1] == 0) {
                                    break L10;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          var8 = (var7 & 127) + var3 - 128;
                          if (ti.field_I[((nf) this).field_O].field_m[var8] != 0) {
                            sn.a(var7, ((nf) this).field_V, 0, 12, (nf) this, false, var6, ti.field_I[((nf) this).field_O].field_m[var8]);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var5++;
                        var7++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                var7 = 0;
                L12: while (true) {
                  if (~((nf) this).field_y >= ~var7) {
                    var6++;
                    continue L6;
                  } else {
                    L13: {
                      if (((nf) this).field_y > var5) {
                        break L13;
                      } else {
                        if (mn.field_y.field_m[var5] != -5) {
                          break L13;
                        } else {
                          if (-5 != mn.field_y.field_m[var5 - ((nf) this).field_y]) {
                            var8 = var6 - 5;
                            var9 = (127 & var7) + var2;
                            L14: while (true) {
                              if (~var9 <= ~var3) {
                                break L13;
                              } else {
                                L15: {
                                  if (ti.field_I[((nf) this).field_O].field_m[var9] != 0) {
                                    sn.a(var7, ((nf) this).field_V, 0, 125, (nf) this, false, var8 - var4, ti.field_I[((nf) this).field_O].field_m[var9]);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                var8++;
                                var9 += 128;
                                continue L14;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L16: {
                      if (~(-((nf) this).field_y + mn.field_y.field_m.length) >= ~var5) {
                        break L16;
                      } else {
                        if (mn.field_y.field_m[var5] != -5) {
                          break L16;
                        } else {
                          if (mn.field_y.field_m[((nf) this).field_y + var5] == -5) {
                            break L16;
                          } else {
                            var8 = var6 - 1;
                            var9 = (var7 & 127) + var3;
                            L17: while (true) {
                              if (~var9 <= ~ti.field_I[((nf) this).field_O].field_m.length) {
                                break L16;
                              } else {
                                L18: {
                                  if (0 == ti.field_I[((nf) this).field_O].field_m[var9]) {
                                    break L18;
                                  } else {
                                    sn.a(var7, ((nf) this).field_V, 0, 125, (nf) this, false, var8, ti.field_I[((nf) this).field_O].field_m[var9]);
                                    break L18;
                                  }
                                }
                                var8++;
                                var9 += 128;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                    }
                    var5++;
                    var7++;
                    continue L12;
                  }
                }
              }
            }
          }
        }
        var5 = 0;
        L19: {
          if (null == ti.field_I) {
            break L19;
          } else {
            var6 = 0;
            var7 = 0;
            L20: while (true) {
              if (~var7 <= ~((nf) this).field_H) {
                break L19;
              } else {
                var6 = (127 & var7) << 7;
                var5 = var7 * ((nf) this).field_y;
                var8 = 0;
                L21: while (true) {
                  if (~var8 <= ~((nf) this).field_y) {
                    var7++;
                    continue L20;
                  } else {
                    L22: {
                      if (((nf) this).field_V.field_m[var5] != -5) {
                        break L22;
                      } else {
                        ((nf) this).field_V.field_m[var5] = ti.field_I[((nf) this).field_O].field_m[var6];
                        break L22;
                      }
                    }
                    var5++;
                    var6 = 1 + var6 & 16383;
                    var8++;
                    continue L21;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int[] param0, jd param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ll var5 = null;
        int var6 = 0;
        qb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ll var20 = null;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = uj.a(param1, 8, (byte) -61) + 8 * ((nf) this).field_O;
            var6 = -115 % ((param2 - -59) / 54);
            var5 = go.field_j[var4_int];
            var7 = new qb(512, 512);
            var8 = 128;
            L1: while (true) {
              if (var8 >= -128 + ((nf) this).field_y) {
                break L0;
              } else {
                var9 = 0;
                var10 = 0;
                L2: while (true) {
                  var10++;
                  var11 = 0;
                  var12 = 0;
                  var13 = -(var5.field_h / 4) + var8;
                  L3: while (true) {
                    L4: {
                      if (~var11 <= ~(-8 + ((nf) this).field_H)) {
                        break L4;
                      } else {
                        if (0 != mn.field_y.field_m[var13]) {
                          break L4;
                        } else {
                          var13 = var13 + ((nf) this).field_y;
                          var11++;
                          continue L3;
                        }
                      }
                    }
                    var13 = var5.field_h / 2 + var8;
                    L5: while (true) {
                      L6: {
                        if (var12 >= -8 + ((nf) this).field_H) {
                          break L6;
                        } else {
                          if (mn.field_y.field_m[var13] != 0) {
                            break L6;
                          } else {
                            var12++;
                            var13 = var13 + ((nf) this).field_y;
                            continue L5;
                          }
                        }
                      }
                      L7: {
                        L8: {
                          L9: {
                            var13 = var8 - var5.field_h / 4;
                            if (!tc.field_D[var4_int]) {
                              break L9;
                            } else {
                              L10: {
                                stackOut_13_0 = Math.abs(var11 + -var12);
                                stackIn_15_0 = stackOut_13_0;
                                stackIn_14_0 = stackOut_13_0;
                                if (ig.field_a[var4_int]) {
                                  stackOut_15_0 = stackIn_15_0;
                                  stackOut_15_1 = var5.field_h / 2;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  break L10;
                                } else {
                                  stackOut_14_0 = stackIn_14_0;
                                  stackOut_14_1 = var5.field_h;
                                  stackIn_16_0 = stackOut_14_0;
                                  stackIn_16_1 = stackOut_14_1;
                                  break L10;
                                }
                              }
                              if (stackIn_16_0 >= stackIn_16_1) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (~(2 * var5.field_c) > ~(var12 + var11)) {
                            L11: {
                              var9 = 1;
                              var14 = (var12 + var11) / 2;
                              var15 = 0;
                              var15 = -on.a(var5.field_h / 2, (-var11 + var12) / 4, (byte) 98);
                              var15 = var15 & 8191;
                              if (4096 > var15) {
                                var8 = var8 - var5.field_h / 4;
                                var14 = var11;
                                break L11;
                              } else {
                                var14 = var12;
                                var8 = var8 + var5.field_h / 4;
                                break L11;
                              }
                            }
                            L12: {
                              if (ig.field_a[var4_int]) {
                                break L12;
                              } else {
                                var15 = 0;
                                break L12;
                              }
                            }
                            L13: {
                              L14: {
                                if (var4_int == 25) {
                                  break L14;
                                } else {
                                  if (26 == var4_int) {
                                    break L14;
                                  } else {
                                    if (var4_int == 27) {
                                      break L14;
                                    } else {
                                      if (6 == var4_int) {
                                        break L14;
                                      } else {
                                        if (var4_int == 7) {
                                          break L14;
                                        } else {
                                          if (33 == var4_int) {
                                            break L14;
                                          } else {
                                            if (34 == var4_int) {
                                              break L14;
                                            } else {
                                              if (35 == var4_int) {
                                                break L14;
                                              } else {
                                                if (var4_int == 39) {
                                                  break L14;
                                                } else {
                                                  if (var4_int == 40) {
                                                    break L14;
                                                  } else {
                                                    if (42 == var4_int) {
                                                      break L14;
                                                    } else {
                                                      if (var4_int == 43) {
                                                        break L14;
                                                      } else {
                                                        if (46 == var4_int) {
                                                          break L14;
                                                        } else {
                                                          if (var4_int == 47) {
                                                            break L14;
                                                          } else {
                                                            if (58 == var4_int) {
                                                              break L14;
                                                            } else {
                                                              if (var4_int == 60) {
                                                                break L14;
                                                              } else {
                                                                if (var4_int == 61) {
                                                                  break L14;
                                                                } else {
                                                                  if (var4_int == 62) {
                                                                    break L14;
                                                                  } else {
                                                                    if (var4_int == 63) {
                                                                      break L14;
                                                                    } else {
                                                                      break L13;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              sn.a(var8, mn.field_y, var5.field_c / 2, 124, (nf) this, false, -(var5.field_c / 4) + var14, (byte) 0);
                              sn.a(var8, ((nf) this).field_V, var5.field_c / 2, 122, (nf) this, false, -(var5.field_c / 4) + var14, (byte) 0);
                              var16 = -var5.field_h / 3;
                              L15: while (true) {
                                if (~var16 <= ~(var5.field_h / 3)) {
                                  break L13;
                                } else {
                                  var17 = (var16 * j.a(var15, -111) >> 16) + var8;
                                  var18 = var14 - -(var5.field_c * 4 / 10) + -(of.a(127, var15) * var16 >> 16);
                                  sn.a(var17, mn.field_y, 2 * var5.field_c / 10, -58, (nf) this, false, var18, (byte) -5);
                                  sn.a(var17, ((nf) this).field_V, 2 * var5.field_c / 10, 124, (nf) this, false, var18, (byte) -5);
                                  var16++;
                                  continue L15;
                                }
                              }
                            }
                            L16: {
                              var7.a();
                              de.d(0, 0, 512, 512, 0);
                              var16 = var5.field_f - -(8 * var5.field_c / 10);
                              var17 = 1;
                              if (var4_int != 25) {
                                break L16;
                              } else {
                                var16 -= 16;
                                break L16;
                              }
                            }
                            L17: {
                              if (var4_int == 26) {
                                var16 -= 4;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (var4_int == 27) {
                                var16 -= 8;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var4_int == 28) {
                                var17 = 0;
                                var16 += 8;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (var4_int == 29) {
                                var17 = 0;
                                var16 += 8;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            L21: {
                              if (var4_int != 30) {
                                break L21;
                              } else {
                                var16 += 16;
                                var17 = 0;
                                break L21;
                              }
                            }
                            L22: {
                              if (var4_int != 31) {
                                break L22;
                              } else {
                                var17 = 0;
                                break L22;
                              }
                            }
                            L23: {
                              if (56 == var4_int) {
                                var17 = 0;
                                var16 += 0;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            L24: {
                              if (57 != var4_int) {
                                break L24;
                              } else {
                                var17 = 0;
                                var16 += 16;
                                break L24;
                              }
                            }
                            L25: {
                              if (59 == var4_int) {
                                var16 += 8;
                                var17 = 0;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (var4_int < 0) {
                                break L26;
                              } else {
                                if (8 <= var4_int) {
                                  break L26;
                                } else {
                                  if (0 == var4_int) {
                                    break L26;
                                  } else {
                                    if (var4_int == 2) {
                                      break L26;
                                    } else {
                                      var17 = 0;
                                      break L26;
                                    }
                                  }
                                }
                              }
                            }
                            L27: {
                              if (8 > var4_int) {
                                break L27;
                              } else {
                                if (var4_int < 16) {
                                  var17 = 0;
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            L28: {
                              if (40 > var4_int) {
                                break L28;
                              } else {
                                if (48 > var4_int) {
                                  var17 = 0;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            L29: {
                              if (var4_int < 32) {
                                break L29;
                              } else {
                                if (var4_int >= 40) {
                                  break L29;
                                } else {
                                  if (var4_int != 39) {
                                    var17 = 0;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                            var5.b().b(var5.field_h / 2 + var5.field_j << 4, var16 << 4, 4096, 4096, var15 << 3, 4096);
                            this.a(false, -256 + var8, ((nf) this).field_V, var17 != 0, -256 + var14, var7);
                            if (26 != var4_int) {
                              break L7;
                            } else {
                              var8 += 24;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var4_int = uj.a(param1, 8, (byte) -26) + 8 * ((nf) this).field_O;
                        var5 = go.field_j[var4_int];
                        break L7;
                      }
                      L30: {
                        if (var9 != 0) {
                          break L30;
                        } else {
                          if (var10 < 50) {
                            continue L2;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L31: {
                        var4_int = uj.a(param1, 8, (byte) -83) - -(((nf) this).field_O * 8);
                        var20 = go.field_j[var4_int];
                        var8 = var8 + var20.field_h / 2;
                        if (26 != var4_int) {
                          break L31;
                        } else {
                          var8 += 24;
                          break L31;
                        }
                      }
                      var8 = var8 + (32 + uj.a(param1, 128, (byte) -62));
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var4 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var4;
            stackOut_101_1 = new StringBuilder().append("nf.I(");
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param0 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L32;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L32;
            }
          }
          L33: {
            stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
            stackOut_104_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',');
            stackIn_106_0 = stackOut_104_0;
            stackIn_106_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param1 == null) {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L33;
            } else {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "{...}";
              stackIn_107_0 = stackOut_105_0;
              stackIn_107_1 = stackOut_105_1;
              stackIn_107_2 = stackOut_105_2;
              break L33;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_107_0, stackIn_107_2 + ',' + param2 + ')');
        }
    }

    final void t(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          ((nf) this).field_Y = -1;
          ((nf) this).field_bb = -1;
          ((nf) this).field_tb = 0;
          ((nf) this).field_C = -1;
          ((nf) this).field_D = false;
          ((nf) this).field_Gb = false;
          var2 = -13 % ((param0 - -59) / 42);
          if (2 < ((nf) this).field_q) {
            var3 = 0;
            var4 = 250;
            var5 = 0;
            L1: while (true) {
              if (((nf) this).field_q <= var5) {
                L2: {
                  if (-2 == ((nf) this).field_C) {
                    ((nf) this).field_C = -1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (((nf) this).field_bb != -2) {
                  break L0;
                } else {
                  ((nf) this).field_bb = -1;
                  break L0;
                }
              } else {
                L3: {
                  var6 = ((nf) this).a(var5, true);
                  if (var6 == null) {
                    break L3;
                  } else {
                    if (var6.field_ib > 0) {
                      L4: {
                        if (((nf) this).field_C <= -1) {
                          break L4;
                        } else {
                          if (var3 != var6.field_ib) {
                            break L4;
                          } else {
                            ((nf) this).field_C = -2;
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (((nf) this).field_bb <= -1) {
                          break L5;
                        } else {
                          if (var4 == var6.field_ib) {
                            ((nf) this).field_bb = -2;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (-1 == ((nf) this).field_C) {
                            break L7;
                          } else {
                            if (var3 < var6.field_ib) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((nf) this).field_C = var5;
                        var3 = var6.field_ib;
                        break L6;
                      }
                      L8: {
                        if (((nf) this).field_bb == -1) {
                          break L8;
                        } else {
                          if (~var4 >= ~var6.field_ib) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var4 = var6.field_ib;
                      ((nf) this).field_bb = var5;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L9: {
          if (~((nf) this).field_jb > ~((nf) this).l(4)) {
            break L9;
          } else {
            this.i(-17837);
            break L9;
          }
        }
        var3 = 0;
        L10: while (true) {
          if (var3 >= 16) {
            this.o((byte) 69);
            return;
          } else {
            L11: {
              if (((nf) this).field_lb[((nf) this).field_J][var3] <= 0) {
                break L11;
              } else {
                ((nf) this).field_lb[((nf) this).field_J][var3] = ((nf) this).field_lb[((nf) this).field_J][var3] - 1;
                if (((nf) this).field_lb[((nf) this).field_J][var3] > 0) {
                  break L11;
                } else {
                  if (87 == ((nf) this).field_v[((nf) this).field_J][var3]) {
                    break L11;
                  } else {
                    if (((nf) this).field_v[((nf) this).field_J][var3] == 116) {
                      break L11;
                    } else {
                      ((nf) this).field_vb[((nf) this).field_J][var3] = 1;
                      break L11;
                    }
                  }
                }
              }
            }
            var3++;
            continue L10;
          }
        }
    }

    final int d(boolean param0) {
        if (param0) {
            return -114;
        }
        return ((nf) this).field_J;
    }

    final boolean d(int param0) {
        if (param0 != 1) {
            boolean discarded$0 = ((nf) this).a(false, (ml) null, 79, -2, -47);
        }
        return ((nf) this).field_fb != null ? true : false;
    }

    private final int[] c(jd param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        ll var21 = null;
        ll var22 = null;
        ll var23 = null;
        ll var24 = null;
        ll var25 = null;
        ll var26 = null;
        ll var27 = null;
        ll var28 = null;
        ll var29 = null;
        ll var30 = null;
        ll var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        Object stackIn_49_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_48_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -128 + (((nf) this).field_H + -256);
              var4 = 170;
              var42 = new int[6];
              var38 = var42;
              var34 = var38;
              var19 = var34;
              var5 = var19;
              var5[0] = var4 * 3 / 2 + uj.a(param0, -(3 * var4) + (((nf) this).field_y >> 1), (byte) -90);
              var5[1] = var42[0] - (uj.a(param0, var4 / 2, (byte) -39) - -(var4 / 2));
              var5[2] = var4 / 2 + var42[0] + uj.a(param0, var4 / 2, (byte) -97);
              var5[3] = 3 * var4 / 2 + (uj.a(param0, -(var4 * 3) + (((nf) this).field_y >> 1), (byte) -32) - -(((nf) this).field_y >> 1));
              var5[4] = -(var4 / 2) + (var42[3] - uj.a(param0, var4 / 2, (byte) -44));
              var5[5] = var4 / 2 + var42[3] + uj.a(param0, var4 / 2, (byte) -83);
              var7 = var3_int;
              if (var7 < 257) {
                var7 = 257;
                break L1;
              } else {
                break L1;
              }
            }
            var43 = new int[6];
            var39 = var43;
            var35 = var39;
            var20 = var35;
            var8 = var20;
            var43[3] = var7;
            var43[0] = var7;
            var8[1] = 128 + uj.a(param0, var7 + -256, (byte) -113);
            var8[4] = uj.a(param0, -256 + var7, (byte) -125) + 128;
            var8[2] = var43[0] + -var43[1];
            var8[5] = var43[3] + -var43[4];
            var9 = 0;
            L2: while (true) {
              if (6 <= var9) {
                L3: {
                  System.gc();
                  ((nf) this).field_V = new ll(((nf) this).field_y, ((nf) this).field_H, gg.field_c);
                  if (null != ti.field_I) {
                    ((nf) this).field_V.field_l = ti.field_I[((nf) this).field_O].field_l;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.a(0, 120, mn.field_y, 0, ((nf) this).field_V);
                var21 = go.field_j[0 - -(((nf) this).field_O * 8)];
                this.a(false, -32 + (var42[0] - 128), ((nf) this).field_V, true, -var43[0] + (((nf) this).field_H + -256) + -120, var21.b());
                var22 = go.field_j[((nf) this).field_O * 8 + 1];
                this.a(false, -96 + var42[3], ((nf) this).field_V, true, -376 + (((nf) this).field_H - var43[3]), var22.b());
                var23 = go.field_j[3 + ((nf) this).field_O * 8];
                this.a(false, var42[4] + -128, ((nf) this).field_V, true, -32 + (-256 + ((nf) this).field_H) + -var43[4], var23.b());
                var24 = var23.a();
                this.a(false, -128 + var42[2], ((nf) this).field_V, true, -256 + ((nf) this).field_H + (-var43[2] - param1), var24.b());
                var10 = 0;
                L4: while (true) {
                  if (var10 >= 3) {
                    var10 = 3;
                    L5: while (true) {
                      if (var10 >= 6) {
                        var44 = new int[1000];
                        var45 = new int[1000];
                        var12 = 0;
                        var13 = 0;
                        L6: while (true) {
                          if (1000 <= var13) {
                            this.a(0, 121, ((nf) this).field_V, 0, mn.field_y);
                            int discarded$1 = 5;
                            this.b();
                            stackOut_48_0 = null;
                            stackIn_49_0 = stackOut_48_0;
                            break L0;
                          } else {
                            var33 = go.field_j[4 + (uj.a(param0, 4, (byte) -60) - -(((nf) this).field_O * 8))];
                            var14 = uj.a(param0, -256 + ((nf) this).field_y, (byte) -115);
                            var15 = uj.a(param0, -256 + ((nf) this).field_H, (byte) -68);
                            var16 = 1;
                            var17 = 0;
                            L7: while (true) {
                              if (var17 >= var12) {
                                L8: {
                                  if (var16 == 0) {
                                    break L8;
                                  } else {
                                    var44[var12] = var14;
                                    var45[var12] = var15;
                                    var12++;
                                    this.a(false, var14, ((nf) this).field_V, false, var15, var33.b());
                                    break L8;
                                  }
                                }
                                var13++;
                                continue L6;
                              } else {
                                L9: {
                                  if (Math.abs(var44[var17] + -var14) >= 192) {
                                    break L9;
                                  } else {
                                    if (Math.abs(var45[var17] - var15) >= 192) {
                                      break L9;
                                    } else {
                                      var16 = 0;
                                      break L9;
                                    }
                                  }
                                }
                                var17++;
                                continue L7;
                              }
                            }
                          }
                        }
                      } else {
                        var28 = go.field_j[((nf) this).field_O * 8 + 2];
                        this.a(false, 3 + var42[var10] + -128, ((nf) this).field_V, true, -256 + (((nf) this).field_H + -var43[var10]), var28.b());
                        var29 = go.field_j[4 + (uj.a(param0, 4, (byte) -56) + ((nf) this).field_O * 8)];
                        this.a(false, 3 + (var42[var10] - 192), ((nf) this).field_V, true, -160 + ((nf) this).field_H, var29.b());
                        var30 = go.field_j[4 + (uj.a(param0, 4, (byte) -127) + 8 * ((nf) this).field_O)];
                        this.a(false, 3 + (var42[var10] + -64), ((nf) this).field_V, true, ((nf) this).field_H - 160, var30.b());
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    var25 = go.field_j[8 * ((nf) this).field_O + 2];
                    this.a(false, 3 + (var42[var10] + -128), ((nf) this).field_V, true, -256 + ((nf) this).field_H - var43[var10], var25.b());
                    var26 = go.field_j[uj.a(param0, 4, (byte) -39) - (-4 - ((nf) this).field_O * 8)];
                    this.a(false, -192 + var42[var10] - -3, ((nf) this).field_V, true, -160 + ((nf) this).field_H, var26.b());
                    var27 = go.field_j[4 + (uj.a(param0, 4, (byte) -100) + ((nf) this).field_O * 8)];
                    this.a(false, 3 + (-64 + var42[var10]), ((nf) this).field_V, true, ((nf) this).field_H - 160, var27.b());
                    var10++;
                    continue L4;
                  }
                }
              } else {
                L10: {
                  if (~var42[var9] > ~(var4 >> 1)) {
                    var5[var9] = var4 >> 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var42[var9] >= ((nf) this).field_y + -(var4 >> 1)) {
                    var5[var9] = -(var4 >> 1) + (((nf) this).field_y - 1);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (~var4 >= ~var10) {
                    var9++;
                    continue L2;
                  } else {
                    var11 = -var43[var9] + ((nf) this).field_H;
                    L13: while (true) {
                      if (var11 >= ((nf) this).field_H) {
                        var10++;
                        continue L12;
                      } else {
                        L14: {
                          var6 = -(var4 >> 1) + var10 + var42[var9] - -(var11 * ((nf) this).field_y);
                          mn.field_y.field_m[var6] = (byte) -5;
                          if (var10 != 0) {
                            break L14;
                          } else {
                            mn.field_y.field_m[var6] = (byte) 1;
                            break L14;
                          }
                        }
                        L15: {
                          if (var10 != 1) {
                            break L15;
                          } else {
                            mn.field_y.field_m[var6] = (byte) 2;
                            break L15;
                          }
                        }
                        L16: {
                          if (var4 + -2 != var10) {
                            break L16;
                          } else {
                            mn.field_y.field_m[var6] = (byte) 3;
                            break L16;
                          }
                        }
                        L17: {
                          if (var10 == -1 + var4) {
                            mn.field_y.field_m[var6] = (byte) 4;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var11++;
                        continue L13;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var3;
            stackOut_50_1 = new StringBuilder().append("nf.NA(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L18;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param1 + ')');
        }
        return (int[]) (Object) stackIn_49_0;
    }

    private final void a(int[] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = 32;
              if (((nf) this).field_w != -320) {
                break L1;
              } else {
                var4 = 0;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (-1 + param0.length <= var5) {
                L3: {
                  if (param1 < -103) {
                    break L3;
                  } else {
                    field_qb = null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var6 = var5 * (((nf) this).field_y - 2 * var4) / (param0.length + -1) + var4;
                  var7 = var4 + (var5 - -1) * (((nf) this).field_y + -(var4 * 2)) / (param0.length + -1);
                  var8 = 32 + param0[var5];
                  var9 = param0[var5 + 1] + 32;
                  var10 = (var9 + -var8) / (-var6 + var7);
                  var11 = 0;
                  if (1 >= Math.abs(var10)) {
                    var3_int = var6;
                    L5: while (true) {
                      if (~var3_int <= ~var7) {
                        break L4;
                      } else {
                        L6: {
                          var12 = (var3_int - var6) * 4096 / (var7 - var6);
                          var13 = j.a(var12, -115);
                          var14 = (var8 << 16) + (var9 + -var8) * ((-var13 + 65536) / 2) >> 16;
                          var15 = ((nf) this).field_H - var14;
                          if (var3_int < 0) {
                            break L6;
                          } else {
                            if (((nf) this).field_y <= var3_int) {
                              break L6;
                            } else {
                              L7: {
                                if (0 <= var14) {
                                  break L7;
                                } else {
                                  var15 = var15 - -var14;
                                  var14 = 0;
                                  break L7;
                                }
                              }
                              L8: {
                                if (~((nf) this).field_H <= ~(var14 - -var15)) {
                                  break L8;
                                } else {
                                  var15 = ((nf) this).field_H + -var14;
                                  break L8;
                                }
                              }
                              var16 = var3_int - -(var14 * ((nf) this).field_y);
                              var17 = 0;
                              L9: while (true) {
                                if (~var17 <= ~var15) {
                                  break L6;
                                } else {
                                  mn.field_y.field_m[((nf) this).field_y * var17 + var16] = (byte) -5;
                                  var17++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                        var3_int++;
                        continue L5;
                      }
                    }
                  } else {
                    L10: while (true) {
                      L11: {
                        var11 = 0;
                        if (var5 >= -2 + param0.length) {
                          break L11;
                        } else {
                          L12: {
                            var5++;
                            var11 = 1;
                            var12 = (((nf) this).field_y - 2 * var4) * var5 / (-1 + param0.length) + var4;
                            var13 = (1 + var5) * (((nf) this).field_y - 2 * var4) / (-1 + param0.length) - -var4;
                            var14 = 32 + param0[var5];
                            var15 = param0[1 + var5] - -32;
                            var16 = (-var14 + var15) / (var13 - var12);
                            if (Math.abs(var16) <= 1) {
                              break L12;
                            } else {
                              L13: {
                                if (0 < var16) {
                                  stackOut_11_0 = 1;
                                  stackIn_12_0 = stackOut_11_0;
                                  break L13;
                                } else {
                                  stackOut_10_0 = -1;
                                  stackIn_12_0 = stackOut_10_0;
                                  break L13;
                                }
                              }
                              L14: {
                                stackOut_12_0 = stackIn_12_0;
                                stackIn_14_0 = stackOut_12_0;
                                stackIn_13_0 = stackOut_12_0;
                                if (var10 > 0) {
                                  stackOut_14_0 = stackIn_14_0;
                                  stackOut_14_1 = 1;
                                  stackIn_15_0 = stackOut_14_0;
                                  stackIn_15_1 = stackOut_14_1;
                                  break L14;
                                } else {
                                  stackOut_13_0 = stackIn_13_0;
                                  stackOut_13_1 = -1;
                                  stackIn_15_0 = stackOut_13_0;
                                  stackIn_15_1 = stackOut_13_1;
                                  break L14;
                                }
                              }
                              if (stackIn_15_0 != stackIn_15_1) {
                                break L12;
                              } else {
                                var9 = var15;
                                var7 = var13;
                                break L11;
                              }
                            }
                          }
                          var5--;
                          var11 = 0;
                          break L11;
                        }
                      }
                      if (var11 != 0) {
                        continue L10;
                      } else {
                        L15: {
                          if (var9 > var8) {
                            var3_int = var8;
                            L16: while (true) {
                              if (var9 <= var3_int) {
                                break L15;
                              } else {
                                L17: {
                                  var12 = var3_int;
                                  var13 = var6;
                                  var14 = -var6 + var7;
                                  var15 = var9 + -var8;
                                  var16 = (var3_int + -var9) * 8192 / var15;
                                  var17 = of.a(-107, var16);
                                  var18 = ((-var8 + var3_int) * 131072 / var15 - -var17) * (var14 / 2) >> 16;
                                  if (var12 < 0) {
                                    break L17;
                                  } else {
                                    if (((nf) this).field_H > var12) {
                                      L18: {
                                        if (var13 < 0) {
                                          var18 = var18 + var13;
                                          var13 = 0;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        if (((nf) this).field_y >= var13 - -var18) {
                                          break L19;
                                        } else {
                                          var18 = ((nf) this).field_y - var13;
                                          break L19;
                                        }
                                      }
                                      var19 = var12 * ((nf) this).field_y + var13;
                                      var20 = 0;
                                      L20: while (true) {
                                        if (var18 <= var20) {
                                          break L17;
                                        } else {
                                          mn.field_y.field_m[var20 + var19] = (byte) -5;
                                          var20++;
                                          continue L20;
                                        }
                                      }
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                var3_int++;
                                continue L16;
                              }
                            }
                          } else {
                            var3_int = var9;
                            L21: while (true) {
                              if (~var3_int <= ~var8) {
                                break L15;
                              } else {
                                L22: {
                                  var12 = var3_int;
                                  var13 = var6;
                                  var14 = -var6 + var7;
                                  var15 = -var8 + var9;
                                  var16 = 8192 * (var3_int - var9) / var15;
                                  var17 = of.a(-122, var16);
                                  var18 = var14 / 2 * (var17 + (var3_int - var8) * 131072 / var15) >> 16;
                                  var13 = var13 + var18;
                                  var18 = -var18 + (var7 + -var6);
                                  if (0 > var12) {
                                    break L22;
                                  } else {
                                    if (~((nf) this).field_H >= ~var12) {
                                      break L22;
                                    } else {
                                      L23: {
                                        if (var13 < 0) {
                                          var18 = var18 - (0 - var13);
                                          var13 = 0;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        if (~(var18 + var13) >= ~((nf) this).field_y) {
                                          break L24;
                                        } else {
                                          var18 = -var13 + ((nf) this).field_y;
                                          break L24;
                                        }
                                      }
                                      var19 = var13 + var12 * ((nf) this).field_y;
                                      var20 = 0;
                                      L25: while (true) {
                                        if (~var20 <= ~var18) {
                                          break L22;
                                        } else {
                                          mn.field_y.field_m[var19 - -var20] = (byte) -5;
                                          var20++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                }
                                var3_int++;
                                continue L21;
                              }
                            }
                          }
                        }
                        var3_int = var6;
                        L26: while (true) {
                          if (~var3_int <= ~var7) {
                            break L4;
                          } else {
                            L27: {
                              var12 = var8;
                              if (var8 >= var9) {
                                break L27;
                              } else {
                                var12 = var9;
                                break L27;
                              }
                            }
                            L28: {
                              var13 = ((nf) this).field_H - var12;
                              if (var3_int < 0) {
                                break L28;
                              } else {
                                if (~var3_int > ~((nf) this).field_y) {
                                  L29: {
                                    if (var12 >= 0) {
                                      break L29;
                                    } else {
                                      var13 = var13 - (0 - var12);
                                      var12 = 0;
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (((nf) this).field_H >= var12 - -var13) {
                                      break L30;
                                    } else {
                                      var13 = ((nf) this).field_H - var12;
                                      break L30;
                                    }
                                  }
                                  var14 = var3_int - -(((nf) this).field_y * var12);
                                  var15 = 0;
                                  L31: while (true) {
                                    if (var15 >= var13) {
                                      break L28;
                                    } else {
                                      mn.field_y.field_m[var14 - -(var15 * ((nf) this).field_y)] = (byte) -5;
                                      var15++;
                                      continue L31;
                                    }
                                  }
                                } else {
                                  break L28;
                                }
                              }
                            }
                            var3_int++;
                            continue L26;
                          }
                        }
                      }
                    }
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var3 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var3;
            stackOut_78_1 = new StringBuilder().append("nf.KB(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L32;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L32;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, nf param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ml var3_ref = null;
        mi var3_ref2 = null;
        mi var4 = null;
        int var5 = 0;
        ml var6 = null;
        ml var7 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1.field_Jb == null) {
              return;
            } else {
              ((nf) this).field_Cb = param1.field_Cb;
              ((nf) this).field_ub = param1.field_ub;
              ((nf) this).field_jb = param1.field_jb;
              ((nf) this).field_J = param1.field_J;
              ((nf) this).field_f = param1.field_f;
              sf.a(param1.field_V.field_m, 0, ((nf) this).field_V.field_m, 0, ((nf) this).field_V.field_m.length);
              sf.a(param1.field_Jb.field_m, 0, ((nf) this).field_Jb.field_m, 0, ((nf) this).field_Jb.field_m.length);
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= ((nf) this).field_v.length) {
                  var3_int = 0;
                  L2: while (true) {
                    if (~var3_int <= ~((nf) this).field_lb.length) {
                      var3_int = 0;
                      L3: while (true) {
                        if (var3_int >= ((nf) this).field_vb.length) {
                          var3_int = 0;
                          L4: while (true) {
                            if (((nf) this).field_L.length <= var3_int) {
                              var3_ref = (ml) (Object) ((nf) this).field_i.b(12623);
                              L5: while (true) {
                                if (var3_ref == null) {
                                  var3_ref2 = (mi) (Object) ((nf) this).field_Kb.b(12623);
                                  L6: while (true) {
                                    if (var3_ref2 == null) {
                                      var3_ref2 = (mi) (Object) ((nf) this).field_r.b(12623);
                                      L7: while (true) {
                                        if (var3_ref2 == null) {
                                          ((nf) this).field_Kb.c(-3);
                                          ((nf) this).field_r.c(3);
                                          var3_ref = (ml) (Object) param1.field_i.b(12623);
                                          L8: while (true) {
                                            if (var3_ref == null) {
                                              var3_ref = (ml) (Object) ((nf) this).field_i.b(12623);
                                              L9: while (true) {
                                                if (var3_ref == null) {
                                                  var3_ref2 = (mi) (Object) param1.field_Kb.b(12623);
                                                  L10: while (true) {
                                                    if (var3_ref2 == null) {
                                                      var3_ref2 = (mi) (Object) param1.field_r.b(12623);
                                                      L11: while (true) {
                                                        if (var3_ref2 == null) {
                                                          L12: {
                                                            if (param1.field_I.b(116) != null) {
                                                              break L12;
                                                            } else {
                                                              if (!param1.field_kb.b(true)) {
                                                                break L12;
                                                              } else {
                                                                if (param1.field_h.d(122)) {
                                                                  ((nf) this).field_I.a(17);
                                                                  ((nf) this).field_kb.c(74);
                                                                  ((nf) this).field_h.a(17);
                                                                  var3_int = 0;
                                                                  L13: while (true) {
                                                                    if (~((nf) this).field_N.length >= ~var3_int) {
                                                                      var3_int = 0;
                                                                      L14: while (true) {
                                                                        if (~var3_int <= ~((nf) this).field_v.length) {
                                                                          sf.a(param1.field_x, 0, ((nf) this).field_x, 0, ((nf) this).field_x.length);
                                                                          sf.a(param1.field_X, 0, ((nf) this).field_X, 0, ((nf) this).field_X.length);
                                                                          sf.a(param1.field_Ab, 0, ((nf) this).field_Ab, 0, ((nf) this).field_Ab.length);
                                                                          sf.a(param1.field_o, 0, ((nf) this).field_o, 0, ((nf) this).field_o.length);
                                                                          sf.a(param1.field_K, 0, ((nf) this).field_K, 0, ((nf) this).field_K.length);
                                                                          sf.a(param1.field_g, 0, ((nf) this).field_g, 0, ((nf) this).field_g.length);
                                                                          sf.a(param1.field_db, 0, ((nf) this).field_db, 0, ((nf) this).field_db.length);
                                                                          sf.a(param1.field_s, 0, ((nf) this).field_s, 0, ((nf) this).field_s.length);
                                                                          sf.a(param1.field_ib, 0, ((nf) this).field_ib, 0, ((nf) this).field_ib.length);
                                                                          sf.a(param1.field_ob, 0, ((nf) this).field_ob, 0, ((nf) this).field_ob.length);
                                                                          sf.a(param1.field_U, 0, ((nf) this).field_U, 0, ((nf) this).field_U.length);
                                                                          sf.a(param1.field_ab, 0, ((nf) this).field_ab, 0, ((nf) this).field_ab.length);
                                                                          sf.a(param1.field_Eb, 0, ((nf) this).field_Eb, 0, ((nf) this).field_Eb.length);
                                                                          sf.a(param1.field_wb, 0, ((nf) this).field_wb, 0, ((nf) this).field_wb.length);
                                                                          sf.a(param1.field_Nb, 0, ((nf) this).field_Nb, 0, ((nf) this).field_Nb.length);
                                                                          if (param0 > 71) {
                                                                            sf.a(param1.field_T, 0, ((nf) this).field_T, 0, ((nf) this).field_T.length);
                                                                            sf.a(param1.field_n, 0, ((nf) this).field_n, 0, ((nf) this).field_n.length);
                                                                            sf.a(param1.field_gb, 0, ((nf) this).field_gb, 0, ((nf) this).field_gb.length);
                                                                            sf.a(param1.field_Fb, 0, ((nf) this).field_Fb, 0, ((nf) this).field_Fb.length);
                                                                            sf.a(param1.field_Ob, 0, ((nf) this).field_Ob, 0, ((nf) this).field_Ob.length);
                                                                            sf.a(param1.field_c, 0, ((nf) this).field_c, 0, ((nf) this).field_c.length);
                                                                            sf.a(param1.field_b, 0, ((nf) this).field_b, 0, ((nf) this).field_b.length);
                                                                            sf.a(param1.field_u, 0, ((nf) this).field_u, 0, ((nf) this).field_u.length);
                                                                            sf.a(param1.field_R, 0, ((nf) this).field_R, 0, ((nf) this).field_R.length);
                                                                            sf.a(param1.field_cb, 0, ((nf) this).field_cb, 0, ((nf) this).field_cb.length);
                                                                            sf.a(param1.field_a, 0, ((nf) this).field_a, 0, ((nf) this).field_a.length);
                                                                            sf.a(param1.field_p, 0, ((nf) this).field_p, 0, ((nf) this).field_p.length);
                                                                            ((nf) this).field_t = param1.field_t;
                                                                            ((nf) this).field_mb = param1.field_mb;
                                                                            ((nf) this).field_nb = param1.field_nb;
                                                                            if (!param1.field_Gb) {
                                                                              ((nf) this).field_Gb = false;
                                                                              if (!param1.field_zb) {
                                                                                ((nf) this).field_zb = false;
                                                                                if (param1.field_Mb) {
                                                                                  throw new IllegalStateException();
                                                                                } else {
                                                                                  ((nf) this).field_Mb = false;
                                                                                  if (!param1.field_Db.b(true)) {
                                                                                    throw new IllegalStateException();
                                                                                  } else {
                                                                                    ((nf) this).field_Db.c(29);
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                throw new IllegalStateException();
                                                                              }
                                                                            } else {
                                                                              throw new IllegalStateException();
                                                                            }
                                                                          } else {
                                                                            return;
                                                                          }
                                                                        } else {
                                                                          sf.a(param1.field_v[var3_int], 0, ((nf) this).field_v[var3_int], 0, 16);
                                                                          var3_int++;
                                                                          continue L14;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      sf.a(param1.field_N[var3_int], 0, ((nf) this).field_N[var3_int], 0, 18);
                                                                      var3_int++;
                                                                      continue L13;
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L12;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          throw new RuntimeException();
                                                        } else {
                                                          var4 = var3_ref2.b(21310, (nf) this);
                                                          ((nf) this).field_r.b((pg) (Object) var4, -1);
                                                          var3_ref2 = (mi) (Object) param1.field_r.a(0);
                                                          continue L11;
                                                        }
                                                      }
                                                    } else {
                                                      var4 = var3_ref2.b(21310, (nf) this);
                                                      ((nf) this).field_Kb.b((pg) (Object) var4, -1);
                                                      var3_ref2 = (mi) (Object) param1.field_Kb.a(0);
                                                      continue L10;
                                                    }
                                                  }
                                                } else {
                                                  L15: {
                                                    var7 = param1.a(var3_ref.field_T, true);
                                                    if (null != var7.field_s) {
                                                      var3_ref.field_s = ((nf) this).a(var7.field_s.field_T, true);
                                                      break L15;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                  var3_ref = (ml) (Object) ((nf) this).field_i.a(0);
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              var6 = var3_ref.a((nf) this, (byte) 59);
                                              ((nf) this).field_i.b((pg) (Object) var6, -1);
                                              ((nf) this).field_B.a((tf) (Object) var6, (long)var6.field_T, (byte) 121);
                                              var3_ref = (ml) (Object) param1.field_i.a(0);
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          var3_ref2.f(0);
                                          var3_ref2 = (mi) (Object) ((nf) this).field_r.a(0);
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      var3_ref2.f(0);
                                      var3_ref2 = (mi) (Object) ((nf) this).field_Kb.a(0);
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var3_ref.a(true);
                                  var3_ref.a((byte) 88);
                                  var3_ref = (ml) (Object) ((nf) this).field_i.a(0);
                                  continue L5;
                                }
                              }
                            } else {
                              sf.a(param1.field_L[var3_int], 0, ((nf) this).field_L[var3_int], 0, 16);
                              var3_int++;
                              continue L4;
                            }
                          }
                        } else {
                          sf.a(param1.field_vb[var3_int], 0, ((nf) this).field_vb[var3_int], 0, 16);
                          var3_int++;
                          continue L3;
                        }
                      }
                    } else {
                      sf.a(param1.field_lb[var3_int], 0, ((nf) this).field_lb[var3_int], 0, 16);
                      var3_int++;
                      continue L2;
                    }
                  }
                } else {
                  sf.a(param1.field_v[var3_int], 0, ((nf) this).field_v[var3_int], 0, 16);
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var3;
            stackOut_65_1 = new StringBuilder().append("nf.J(").append(param0).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L16;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L16;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ')');
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 19) {
            ((nf) this).a(103, (ml) null);
        }
        for (var2 = 0; var2 < 16; var2++) {
            ((nf) this).field_vb[0][var2] = 0;
            ((nf) this).field_lb[0][var2] = 0;
            ((nf) this).field_v[0][var2] = -1;
        }
    }

    final int h(int param0) {
        if (param0 >= -69) {
            ((nf) this).a(118, (ml) null);
        }
        int fieldTemp$0 = ((nf) this).field_nb;
        ((nf) this).field_nb = ((nf) this).field_nb + 1;
        return fieldTemp$0;
    }

    final int f(int param0) {
        if (param0 != 12955) {
            ((nf) this).field_N = null;
        }
        return gj.field_a[((nf) this).field_F];
    }

    private final int[] a(int param0, jd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_17_0 = null;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var16 = new int[10];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var9 = var10;
            var17 = var9;
            var15 = var17;
            var13 = var15;
            var11 = var13;
            var5 = var11;
            var6_int = 0;
            L1: while (true) {
              if (~(var16.length + -1) >= ~var6_int) {
                var5[1 + uj.a(param1, -2 + var17.length, (byte) -71)] = ((nf) this).field_H * 3 / 8 - uj.a(param1, 2 * ((nf) this).field_H / 8, (byte) -104);
                var5[uj.a(param1, -2 + var17.length, (byte) -103) - -1] = ((nf) this).field_H * 3 / 8 - uj.a(param1, 2 * ((nf) this).field_H / 8, (byte) -127);
                var5[1 + uj.a(param1, -2 + var17.length, (byte) -119)] = ((nf) this).field_H * 3 / 8 + -uj.a(param1, 2 * ((nf) this).field_H / 8, (byte) -91);
                var5[uj.a(param1, var17.length + -2, (byte) -34) + 1] = ((nf) this).field_H * 3 / param0 + -uj.a(param1, ((nf) this).field_H * 2 / 8, (byte) -59);
                var5[0] = 64 + ((nf) this).field_H;
                var5[-1 + var17.length] = var17[0];
                L2: while (true) {
                  if (var5.length >= ((nf) this).field_y / 2) {
                    this.a(var5, (byte) -121);
                    stackOut_17_0 = (int[]) var5;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    L3: {
                      var3_int = 100;
                      if (((nf) this).field_y / 8 >= var5.length) {
                        break L3;
                      } else {
                        var3_int = 5;
                        break L3;
                      }
                    }
                    var6 = new int[var5.length * 2 - 1];
                    var6[0] = var5[0];
                    var7 = 1;
                    L4: while (true) {
                      if (var5.length <= var7) {
                        var5 = var6;
                        continue L2;
                      } else {
                        L5: {
                          var4 = (Math.abs(-var5[var7] + var5[var7 - 1]) + 5) * var3_int / 100;
                          if (((nf) this).field_H / 2 >= var5[var7]) {
                            break L5;
                          } else {
                            var4 = 2 * ((nf) this).field_H / var5.length;
                            break L5;
                          }
                        }
                        L6: {
                          stackOut_12_0 = (int[]) var6;
                          stackOut_12_1 = 2 * var7 - 1;
                          stackOut_12_2 = var5[var7] + (var5[-1 + var7] + -var4) >> 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          if (var4 == 0) {
                            stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = stackIn_14_2;
                            stackOut_14_3 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            break L6;
                          } else {
                            stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = stackIn_13_2;
                            stackOut_13_3 = uj.a(param1, var4, (byte) -57);
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            break L6;
                          }
                        }
                        stackIn_15_0[stackIn_15_1] = stackIn_15_2 + stackIn_15_3;
                        var6[2 * var7] = var5[var7];
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var9[var6_int] = 7 * ((nf) this).field_H / 8 - uj.a(param1, ((nf) this).field_H * 2 / 8, (byte) -113);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("nf.FA(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        ((nf) this).field_Cb = ((nf) this).field_J;
        ((nf) this).field_jb = param0;
        ((nf) this).field_J = param2;
        ((nf) this).field_f = false;
        if (~((nf) this).field_jb > ~((nf) this).field_q) {
            if (mj.field_p == 7) {
                for (var4 = 0; ((nf) this).field_q > var4; var4++) {
                    for (var5 = 0; ~var5 > ~((nf) this).field_v[var4].length; var5++) {
                        if (!(11 != ((nf) this).field_v[var4][var5])) {
                            ((nf) this).field_f = true;
                        }
                    }
                }
            }
        }
        if (!param1) {
            int[] discarded$0 = this.d(67, (jd) null);
        }
    }

    final void f(byte param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        mk.field_J.a((byte) 72, ((nf) this).field_i);
        if (param0 != -20) {
            return;
        }
        ml var2 = (ml) (Object) mk.field_J.b(-64);
        while (var2 != null) {
            if (~var2.field_u == ~((nf) this).field_J) {
                var2.field_D = false;
            }
            var2 = (ml) (Object) mk.field_J.d(param0 + -18482);
        }
    }

    final boolean g(int param0) {
        if (param0 < 115) {
            int discarded$0 = ((nf) this).e((byte) 27);
        }
        return ((nf) this).field_Mb;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((nf) this).field_v[param0][param1] = param4;
        if (param3 < 12) {
            ((nf) this).field_X = null;
        }
        ((nf) this).field_vb[param0][param1] = param2;
        ((nf) this).field_lb[param0][param1] = 0;
    }

    final void a(ml param0, int param1) {
        try {
            pe.a(-(param0.field_Y >> 1) + param0.field_lb, (nf) this, (byte) 0, param0.field_db + -param0.field_Y, 21374, param0.field_w, ((nf) this).field_Jb);
            if (param1 != 0) {
                this.a((int[]) null, (byte) 67);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nf.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (((nf) this).field_Cb == ((nf) this).field_J) {
            ((nf) this).field_Cb = ((nf) this).field_Cb - 1;
        }
        if (param0 != -1) {
            field_e = null;
        }
        int var2 = ((nf) this).field_J;
        if (((nf) this).field_d) {
            ((nf) this).field_J = ((nf) this).field_Cb;
            do {
                ((nf) this).field_J = (((nf) this).field_J - -2) % ((nf) this).field_q;
                ((nf) this).field_jb = ((nf) this).field_jb + 1;
            } while (((nf) this).a(((nf) this).field_J, true) == null);
        } else {
            do {
                ((nf) this).field_jb = ((nf) this).field_jb + 1;
                ((nf) this).field_J = (((nf) this).field_J - -1) % ((nf) this).field_q;
            } while (((nf) this).a(((nf) this).field_J, true) == null);
        }
        ((nf) this).field_Cb = var2;
    }

    final boolean a(int param0, int param1, byte param2, ml param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
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
              var5_int = param3.p(-8323);
              if (var5_int > param0) {
                break L1;
              } else {
                if (~param0 < ~(-var5_int + ((nf) this).field_y)) {
                  break L1;
                } else {
                  if (param1 < var5_int) {
                    break L1;
                  } else {
                    if (-16 + ((nf) this).field_H < param1) {
                      break L1;
                    } else {
                      L2: {
                        boolean discarded$3 = this.a(param0, var5_int >> 1, ((nf) this).field_H - 16, -59);
                        if (param2 == -75) {
                          break L2;
                        } else {
                          ((nf) this).field_i = null;
                          break L2;
                        }
                      }
                      L3: {
                        if (jo.field_b) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L3;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L3;
                        }
                      }
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("nf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final vn g(byte param0) {
        if (param0 <= 33) {
            ((nf) this).p(-3);
        }
        return ((nf) this).field_i;
    }

    final boolean c(byte param0) {
        if (param0 != 89) {
            boolean discarded$0 = ((nf) this).b(-39, (ml) null, 42, -60);
        }
        return ((nf) this).field_Gb;
    }

    final int a(byte param0, int param1) {
        if (param0 < 97) {
            ((nf) this).a(55, -107, -93, -42, -41);
        }
        return ((nf) this).field_fb[param1];
    }

    final int l(int param0) {
        if (7 == ((nf) this).field_O) {
            if (!(!lk.a(0, (byte) -52))) {
                return 0;
            }
        }
        if (param0 != 4) {
            return -60;
        }
        return 10 * ((nf) this).field_q;
    }

    private final int[] b(jd param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[][] var7 = null;
        int[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[][] var24 = null;
        int[] var25 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int[] stackIn_48_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_47_0 = null;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var23 = new int[7];
            var20 = var23;
            var17 = var20;
            var14 = var17;
            var5 = var14;
            ((nf) this).field_w = -320;
            var6 = 0;
            L1: while (true) {
              if (~var23.length >= ~var6) {
                L2: while (true) {
                  if (~var5.length <= ~(((nf) this).field_y / 64)) {
                    this.a(var5, (byte) -107);
                    var24 = new int[2][7];
                    var21 = var24;
                    var18 = var21;
                    var15 = var18;
                    var7 = var15;
                    var6 = 1;
                    L3: while (true) {
                      if (var6 >= -1 + var24[0].length) {
                        var24[0][0] = 448;
                        var24[1][0] = 576;
                        var24[0][var24[0].length + -1] = var24[0][0];
                        var24[1][-1 + var24[0].length] = var24[1][0];
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= 2) {
                            var8 = 0;
                            var9 = 0;
                            L5: while (true) {
                              if (~var9 <= ~((nf) this).field_y) {
                                stackOut_47_0 = (int[]) var5;
                                stackIn_48_0 = stackOut_47_0;
                                break L0;
                              } else {
                                var8 = var9;
                                var10 = var24[0].length * var9 / ((nf) this).field_y;
                                var11 = 0;
                                L6: while (true) {
                                  if (~var11 <= ~((nf) this).field_H) {
                                    var9++;
                                    continue L5;
                                  } else {
                                    L7: {
                                      var12 = 0;
                                      if (var24[0][var10] <= var24[1][var10]) {
                                        break L7;
                                      } else {
                                        L8: {
                                          if (~var24[0][var10] <= ~var11) {
                                            break L8;
                                          } else {
                                            var12++;
                                            break L8;
                                          }
                                        }
                                        if (var24[1][var10] < var11) {
                                          var12++;
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (var12 % 2 != 1) {
                                        break L9;
                                      } else {
                                        mn.field_y.field_m[var8] = (byte) -5;
                                        break L9;
                                      }
                                    }
                                    var8 = var8 + ((nf) this).field_y;
                                    var11++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            L10: while (true) {
                              if (~((nf) this).field_y >= ~var24[var8].length) {
                                var8++;
                                continue L4;
                              } else {
                                L11: {
                                  var3_int = 100;
                                  if (((nf) this).field_y / 8 < var24[var8].length) {
                                    var3_int = 5;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var25 = new int[-1 + 2 * var24[var8].length];
                                var22 = var25;
                                var19 = var22;
                                var16 = var19;
                                var9_ref_int__ = var16;
                                var9_ref_int__[0] = var24[var8][0];
                                var6 = 1;
                                L12: while (true) {
                                  if (var24[var8].length <= var6) {
                                    var7[var8] = var25;
                                    continue L10;
                                  } else {
                                    L13: {
                                      var4 = (5 + Math.abs(var24[var8][var6 + -1] - var24[var8][var6])) * var3_int / 100;
                                      stackOut_25_0 = (int[]) var9_ref_int__;
                                      stackOut_25_1 = -1 + 2 * var6;
                                      stackOut_25_2 = (var24[var8][var6 + -1] + var24[var8][var6]) / 2;
                                      stackIn_27_0 = stackOut_25_0;
                                      stackIn_27_1 = stackOut_25_1;
                                      stackIn_27_2 = stackOut_25_2;
                                      stackIn_26_0 = stackOut_25_0;
                                      stackIn_26_1 = stackOut_25_1;
                                      stackIn_26_2 = stackOut_25_2;
                                      if (0 >= var4) {
                                        stackOut_27_0 = (int[]) (Object) stackIn_27_0;
                                        stackOut_27_1 = stackIn_27_1;
                                        stackOut_27_2 = stackIn_27_2;
                                        stackOut_27_3 = 0;
                                        stackIn_28_0 = stackOut_27_0;
                                        stackIn_28_1 = stackOut_27_1;
                                        stackIn_28_2 = stackOut_27_2;
                                        stackIn_28_3 = stackOut_27_3;
                                        break L13;
                                      } else {
                                        stackOut_26_0 = (int[]) (Object) stackIn_26_0;
                                        stackOut_26_1 = stackIn_26_1;
                                        stackOut_26_2 = stackIn_26_2;
                                        stackOut_26_3 = uj.a(param0, var4, (byte) -37);
                                        stackIn_28_0 = stackOut_26_0;
                                        stackIn_28_1 = stackOut_26_1;
                                        stackIn_28_2 = stackOut_26_2;
                                        stackIn_28_3 = stackOut_26_3;
                                        break L13;
                                      }
                                    }
                                    stackIn_28_0[stackIn_28_1] = stackIn_28_2 + (stackIn_28_3 - var4 / 2);
                                    var9_ref_int__[var6 * 2] = var24[var8][var6];
                                    var6++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var24[0][var6] = (-(2 * uj.a(param0, 450, (byte) -74)) + 1400) / 3;
                        var24[1][var6] = 2 * (700 + -uj.a(param0, 450, (byte) -27)) / 3;
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    L14: {
                      var3_int = 100;
                      if (var5.length <= ((nf) this).field_y / 8) {
                        break L14;
                      } else {
                        var3_int = 5;
                        break L14;
                      }
                    }
                    var7_array = new int[1 + 2 * (-1 + var5.length)];
                    var7_array[0] = var5[0];
                    var6 = 1;
                    L15: while (true) {
                      if (var6 >= var5.length) {
                        var5 = var7_array;
                        continue L2;
                      } else {
                        L16: {
                          var4 = ((nf) this).field_H / var5.length;
                          stackOut_9_0 = (int[]) var7_array;
                          stackOut_9_1 = -1 + 2 * var6;
                          stackOut_9_2 = (var5[var6] + var5[-1 + var6]) / 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          if (var4 > 0) {
                            stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = stackIn_11_2;
                            stackOut_11_3 = uj.a(param0, var4, (byte) -33);
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            break L16;
                          } else {
                            stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = stackIn_10_2;
                            stackOut_10_3 = 0;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            break L16;
                          }
                        }
                        stackIn_12_0[stackIn_12_1] = stackIn_12_2 + (stackIn_12_3 + -(var4 / 2));
                        var7_array[var6 * 2] = var5[var6];
                        var6++;
                        continue L15;
                      }
                    }
                  }
                }
              } else {
                var5[var6] = ((nf) this).field_H - (uj.a(param0, ((nf) this).field_H / 3, (byte) -126) - -Math.abs((((nf) this).field_y / 2 - ((nf) this).field_y * var6 / var23.length) * ((nf) this).field_H / ((nf) this).field_y));
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var3;
            stackOut_49_1 = new StringBuilder().append("nf.JD(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + -30390 + ')');
        }
        return stackIn_48_0;
    }

    final int s(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((nf) this).h(114);
        }
        return ((nf) this).field_q;
    }

    final boolean a(int param0, ml param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
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
              param3 = param3 - bg.field_e.field_w;
              if (param2 == 30882) {
                break L1;
              } else {
                ((nf) this).field_Kb = null;
                break L1;
              }
            }
            L2: {
              param0 = param0 - bg.field_e.field_n / 2;
              if (0 > param0) {
                break L2;
              } else {
                if (param0 > ((nf) this).field_y + -bg.field_e.field_n) {
                  break L2;
                } else {
                  if (param3 < 0) {
                    break L2;
                  } else {
                    if (~(((nf) this).field_H - bg.field_e.field_w) <= ~param3) {
                      L3: {
                        if (((nf) this).b(param3, 2, param0, bg.field_e)) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L3;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L3;
                        }
                      }
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("nf.TA(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final vn e(int param0) {
        int var2 = -15 / ((-54 - param0) / 34);
        return ((nf) this).field_Kb;
    }

    final boolean a(int param0, int param1, ml param2, byte param3, int param4) {
        qb var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              var6 = uj.field_i[0];
              if (param0 != 55) {
                break L1;
              } else {
                var6 = uj.field_i[1];
                break L1;
              }
            }
            L2: {
              if (31 == param0) {
                var6 = uj.field_i[2];
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 60) {
                var6 = uj.field_i[3];
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 != 81) {
                break L4;
              } else {
                var6 = uj.field_i[4];
                break L4;
              }
            }
            L5: {
              if (param0 == 91) {
                var6 = uj.field_i[5];
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 != 114) {
                break L6;
              } else {
                var6 = uj.field_i[6];
                break L6;
              }
            }
            if (param1 < var6.field_w - -2) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0 != 0;
            } else {
              boolean discarded$2 = this.a(param2, var6, 0, param1 + -var6.field_w, -(var6.field_n / 2) + param4);
              if (!jo.field_b) {
                boolean discarded$3 = this.a(param2, var6, 0, 2 + (param1 + -var6.field_w), param4 + -(var6.field_n / 2));
                if (!jo.field_b) {
                  if (param3 > 27) {
                    stackOut_27_0 = 1;
                    stackIn_28_0 = stackOut_27_0;
                    break L0;
                  } else {
                    ((nf) this).field_w = -39;
                    return true;
                  }
                } else {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0 != 0;
                }
              } else {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6_ref;
            stackOut_29_1 = new StringBuilder().append("nf.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_28_0 != 0;
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        int var5 = -106 / ((9 - param3) / 60);
        int discarded$0 = 16777215;
        return ko.a((nf) this, param2, param0, param1, ((nf) this).field_Jb);
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > param1) {
            return false;
        }
        if (param0 < 0) {
            return false;
        }
        for (var4 = param2; var4 < 16; var4++) {
            if (!(~param1 != ~((nf) this).field_v[param0][var4])) {
                return true;
            }
        }
        return false;
    }

    final void a(int param0, int param1, ll param2, int param3) {
        try {
            int var5_int = 37 % ((-78 - param0) / 34);
            int discarded$0 = -126;
            this.a(param3, ((nf) this).field_Jb, param2, param1);
            this.a(param3, 117, param2, param1, ((nf) this).field_V);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nf.JB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, ml param1) {
        try {
            pe.a(param1.field_lb - (param1.field_Y >> 1), (nf) this, (byte) -1, -param1.field_Y + param1.field_db, 21374, param1.field_w, ((nf) this).field_Jb);
            if (param0 > -36) {
                field_z = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nf.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void o(byte param0) {
        ml var3 = null;
        int var3_int = 0;
        mi var3_ref = null;
        int var4_int = 0;
        Object var4 = null;
        double var4_double = 0.0;
        mi var5_ref_mi = null;
        double var5_double = 0.0;
        jd var5_ref_jd = null;
        int var5 = 0;
        int var6_int = 0;
        mi var6 = null;
        double var6_double = 0.0;
        double var7_double = 0.0;
        int var7 = 0;
        int var8 = 0;
        double var8_double = 0.0;
        double var9 = 0.0;
        double var10 = 0.0;
        double var11 = 0.0;
        double var12 = 0.0;
        double var13 = 0.0;
        double var14 = 0.0;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        double var18 = 0.0;
        double var19 = 0.0;
        double var20 = 0.0;
        double var21 = 0.0;
        double var22 = 0.0;
        double var23 = 0.0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        mi var29_ref_mi = null;
        mi var30 = null;
        int var31 = 0;
        mi var32 = null;
        ml var33 = null;
        mi var34 = null;
        ml var35 = null;
        mi var36 = null;
        mi var37 = null;
        ml var38 = null;
        mi var39 = null;
        mi var40 = null;
        mi var41 = null;
        int stackIn_39_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var31 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 69) {
            break L0;
          } else {
            ((nf) this).a(38, (mi) null);
            break L0;
          }
        }
        L1: {
          var35 = ((nf) this).a(((nf) this).field_J, true);
          ((nf) this).field_f = false;
          if (~((nf) this).field_q >= ~((nf) this).field_jb) {
            break L1;
          } else {
            if (mj.field_p == -1) {
              var3_int = 0;
              L2: while (true) {
                if (((nf) this).field_q <= var3_int) {
                  break L1;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= ((nf) this).field_v[var3_int].length) {
                      var3_int++;
                      continue L2;
                    } else {
                      L4: {
                        if (((nf) this).field_v[var3_int][var4_int] == 11) {
                          ((nf) this).field_f = true;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
        ge.field_p.a((byte) 31, ((nf) this).field_i);
        var3 = (ml) (Object) ge.field_p.b(-98);
        L5: while (true) {
          if (var3 == null) {
            var3 = (ml) (Object) ge.field_p.b(-102);
            L6: while (true) {
              if (var3 == null) {
                var3_ref = (mi) (Object) ((nf) this).field_Kb.b(12623);
                L7: while (true) {
                  if (var3_ref == null) {
                    this.p((byte) 123);
                    return;
                  } else {
                    L8: {
                      if (var3_ref.field_I == 69) {
                        var3_ref.field_y = 0;
                        ((nf) this).field_Gb = true;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var3_ref.field_I == 123) {
                        n.field_d.a((byte) 41, ((nf) this).field_i);
                        var4 = (Object) (Object) (ml) (Object) n.field_d.b(-96);
                        L10: while (true) {
                          if (var4 == null) {
                            break L9;
                          } else {
                            L11: {
                              if (((ml) var4).field_jb != 33) {
                                break L11;
                              } else {
                                if (~((nf) this).field_J != ~((ml) var4).field_u) {
                                  break L11;
                                } else {
                                  var5_double = (double)(-((ml) var4).field_lb + var3_ref.field_v << 4);
                                  var7_double = (double)((var3_ref.field_G + -((ml) var4).field_db << 4) - -256);
                                  var9 = 64.0;
                                  var11 = var5_double * (4.0 * var5_double) / (var9 * 2.0 * var9);
                                  var13 = var5_double;
                                  var15 = var5_double * (var5_double * 4.0) / (var9 * (2.0 * var9)) - var7_double;
                                  L12: while (true) {
                                    L13: {
                                      if (var11 == 0.0) {
                                        break L13;
                                      } else {
                                        if (-(4.0 * var11 * var15) + var13 * var13 >= 0.0) {
                                          break L13;
                                        } else {
                                          if (768.0 <= var9) {
                                            break L13;
                                          } else {
                                            var9 = var9 + 8.0;
                                            var11 = var5_double * (var5_double * 4.0) / (var9 * (2.0 * var9));
                                            var13 = var5_double;
                                            var15 = var5_double * (4.0 * var5_double) / (var9 * (var9 * 2.0)) - var7_double;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                    if (var11 == 0.0) {
                                      break L11;
                                    } else {
                                      if (0.0 <= -(var15 * (4.0 * var11)) + var13 * var13) {
                                        L14: {
                                          var17 = (-var13 + Math.sqrt(var13 * var13 - var15 * (4.0 * var11))) / (var11 * 2.0);
                                          var19 = (-Math.sqrt(-(4.0 * var11 * var15) + var13 * var13) + -var13) / (2.0 * var11);
                                          if (Math.abs(var17) <= Math.abs(var19)) {
                                            break L14;
                                          } else {
                                            var17 = var19;
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          var21 = var9 * var9 / (var17 * var17 + 1.0);
                                          var23 = var9 * var9 / (1.0 + 1.0 / (var17 * var17));
                                          var25 = (int)Math.sqrt(var21);
                                          var26 = (int)Math.sqrt(var23);
                                          if (0.0 < var17) {
                                            if (var5_double >= 0.0) {
                                              break L15;
                                            } else {
                                              var26 = -var26;
                                              break L15;
                                            }
                                          } else {
                                            if (var5_double <= 0.0) {
                                              break L15;
                                            } else {
                                              var26 = -var26;
                                              break L15;
                                            }
                                          }
                                        }
                                        L16: {
                                          if (var25 <= 0) {
                                            break L16;
                                          } else {
                                            if (0.0 <= var5_double) {
                                              break L16;
                                            } else {
                                              var25 = -var25;
                                              break L16;
                                            }
                                          }
                                        }
                                        L17: {
                                          var27 = 8;
                                          var28 = (int)((double)((ml) var4).field_lb + (double)(var25 * (4 + ((ml) var4).field_Y / 2 + var27)) / var9);
                                          var29 = (int)((double)((ml) var4).field_db + (double)((var27 - (-(((ml) var4).field_Y / 2) + -4)) * var26) / var9 - (double)(((ml) var4).field_Y / 2));
                                          var30 = j.a(((nf) this).a(((ml) var4).field_u, true), var29, (byte) -122, (nf) this, 148, var28, 125);
                                          ((nf) this).b(52, var30);
                                          var30.field_y = 20;
                                          if (((nf) this).field_x[((ml) var4).field_u] == 6) {
                                            var30.field_y = var30.field_y - ((nf) this).field_X[((ml) var4).field_u] / 4;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var30.field_u = var25;
                                        var30.field_F = var26;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var4 = (Object) (Object) (ml) (Object) n.field_d.d(-18502);
                            continue L10;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    L18: {
                      if (149 != var3_ref.field_I) {
                        break L18;
                      } else {
                        if (var3_ref.field_y != 256) {
                          break L18;
                        } else {
                          var3_ref.field_y = 0;
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (var3_ref.field_t == null) {
                        break L19;
                      } else {
                        if (var3_ref.field_t.field_u == ((nf) this).field_J) {
                          L20: {
                            if (127 == var3_ref.field_I) {
                              var33 = var3_ref.field_t;
                              var38 = var33;
                              if (var38 == null) {
                                break L20;
                              } else {
                                var5_ref_jd = new jd(new int[4]);
                                var6_int = 0;
                                L21: while (true) {
                                  if (var6_int >= 5) {
                                    var6_int = 0;
                                    L22: while (true) {
                                      if (5 <= var6_int) {
                                        ((nf) this).a(var38, 0);
                                        var38.field_ib = 0;
                                        var38.d(((nf) this).field_J, param0 + 51);
                                        break L20;
                                      } else {
                                        var40 = j.a((ml) null, -(var38.field_Y / 2) + var38.field_db, (byte) -97, (nf) this, 95, var38.field_lb, 122);
                                        var8 = u.a(var5_ref_jd, -2147483648, 8192);
                                        var40.field_u = of.a(-8, var8) >> 9;
                                        var40.field_F = -64 + (3 * j.a(var8, -113) >> 11);
                                        ((nf) this).b(param0 ^ 113, var40);
                                        var6_int++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var39 = j.a((ml) null, var38.field_db - var38.field_Y / 2, (byte) 51, (nf) this, 95, var38.field_lb, 116);
                                    var8 = u.a(var5_ref_jd, param0 + 2147483579, 8192);
                                    var39.field_u = of.a(-56, var8) >> 9;
                                    var39.field_F = (j.a(var8, -109) * 3 >> 11) + -64;
                                    ((nf) this).b(52, var39);
                                    var6_int++;
                                    continue L21;
                                  }
                                }
                              }
                            } else {
                              break L20;
                            }
                          }
                          L23: {
                            if (var3_ref.field_I != 148) {
                              break L23;
                            } else {
                              var3_ref.field_y = var3_ref.field_y + 5;
                              ((nf) this).field_Gb = true;
                              break L23;
                            }
                          }
                          L24: {
                            if (var3_ref.field_I != 29) {
                              break L24;
                            } else {
                              if (var3_ref.field_y <= 0) {
                                break L24;
                              } else {
                                var3_ref.field_H = var3_ref.field_H + 1;
                                ((nf) this).field_Gb = true;
                                break L24;
                              }
                            }
                          }
                          L25: {
                            L26: {
                              if (var3_ref.field_I == 19) {
                                break L26;
                              } else {
                                if (var3_ref.field_I == 62) {
                                  break L26;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            ((nf) this).field_Gb = true;
                            var3_ref.field_y = var3_ref.field_y + 1;
                            break L25;
                          }
                          L27: {
                            if (var3_ref.field_I == 47) {
                              break L27;
                            } else {
                              if (var3_ref.field_I == 71) {
                                break L27;
                              } else {
                                if (var3_ref.field_I == 142) {
                                  ((nf) this).field_Gb = true;
                                  var3_ref.field_y = var3_ref.field_y + 1;
                                  break L19;
                                } else {
                                  if (var3_ref.field_I != 36) {
                                    if (134 == var3_ref.field_I) {
                                      var3_ref.field_y = var3_ref.field_y + 1;
                                      ((nf) this).field_Gb = true;
                                      break L19;
                                    } else {
                                      if (var3_ref.field_I == 68) {
                                        ((nf) this).field_Gb = true;
                                        var3_ref.field_H = var3_ref.field_H + 1;
                                        var3_ref.field_y = 0;
                                        if (var3_ref.field_H >= 5) {
                                          var3_ref.f(0);
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        if (var3_ref.field_I != 138) {
                                          if (var3_ref.field_I != 15) {
                                            L28: {
                                              if (var3_ref.field_I == 69) {
                                                break L28;
                                              } else {
                                                if (var3_ref.field_I == 107) {
                                                  break L28;
                                                } else {
                                                  L29: {
                                                    if (var3_ref.field_I == 148) {
                                                      break L29;
                                                    } else {
                                                      if (70 == var3_ref.field_I) {
                                                        break L29;
                                                      } else {
                                                        if (var3_ref.field_I == 55) {
                                                          break L29;
                                                        } else {
                                                          if (111 != var3_ref.field_I) {
                                                            L30: {
                                                              if (var3_ref.field_I == 157) {
                                                                break L30;
                                                              } else {
                                                                if (var3_ref.field_I == 168) {
                                                                  break L30;
                                                                } else {
                                                                  break L19;
                                                                }
                                                              }
                                                            }
                                                            ((nf) this).field_Gb = true;
                                                            var3_ref.field_H = var3_ref.field_H + 1;
                                                            if (3 <= var3_ref.field_H) {
                                                              var3_ref.field_y = -1;
                                                              var3_ref.a(((nf) this).field_jb, (byte) -67, ((nf) this).field_t, ((nf) this).field_mb);
                                                              var3_ref.f(param0 ^ 69);
                                                              break L19;
                                                            } else {
                                                              break L19;
                                                            }
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var3_ref.field_H = var3_ref.field_H + 1;
                                                  var3_ref.field_y = 0;
                                                  ((nf) this).field_Gb = true;
                                                  if (var3_ref.field_H >= 5) {
                                                    var3_ref.f(param0 + -69);
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                            var3_ref.field_H = var3_ref.field_H + 1;
                                            ((nf) this).field_Gb = true;
                                            var3_ref.field_y = 0;
                                            if (var3_ref.field_H < 3) {
                                              break L19;
                                            } else {
                                              var3_ref.f(0);
                                              break L19;
                                            }
                                          } else {
                                            var3_ref.field_H = var3_ref.field_H + 1;
                                            var3_ref.field_y = 0;
                                            ((nf) this).field_Gb = true;
                                            if (var3_ref.field_H < 5) {
                                              break L19;
                                            } else {
                                              var3_ref.f(param0 + -69);
                                              break L19;
                                            }
                                          }
                                        } else {
                                          var3_ref.field_y = 0;
                                          ((nf) this).field_Gb = true;
                                          break L19;
                                        }
                                      }
                                    }
                                  } else {
                                    var3_ref.field_y = var3_ref.field_y + 1;
                                    ((nf) this).field_Gb = true;
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                          var3_ref.field_y = var3_ref.field_y + 1;
                          ((nf) this).field_Gb = true;
                          if (var3_ref.field_t == null) {
                            break L19;
                          } else {
                            if (var3_ref.field_t.field_jb == 5) {
                              var3_ref.field_y = 301;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L31: {
                      if (var3_ref.field_I != 16) {
                        break L31;
                      } else {
                        var3_ref.field_H = var3_ref.field_H + 1;
                        ((nf) this).field_Gb = true;
                        if (var3_ref.field_H <= ((nf) this).field_q * 5) {
                          break L31;
                        } else {
                          var3_ref.f(0);
                          break L31;
                        }
                      }
                    }
                    L32: {
                      if (117 != var3_ref.field_I) {
                        break L32;
                      } else {
                        ((nf) this).field_Gb = true;
                        var3_ref.field_H = var3_ref.field_H + 1;
                        if (var3_ref.field_H <= ((nf) this).field_q * 20) {
                          break L32;
                        } else {
                          var3_ref.a(0, 16, 32, 8);
                          var3_ref.f(param0 ^ 69);
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (var3_ref.field_I == 127) {
                        var3_ref.field_t.field_D = true;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (var3_ref.field_I != 165) {
                        break L34;
                      } else {
                        ((nf) this).field_Gb = true;
                        var3_ref.field_H = var3_ref.field_H - 1;
                        if (var3_ref.field_H <= 0) {
                          var41 = aj.a((ml) null, var3_ref.field_G, false, 163, (nf) this, var3_ref.field_v);
                          ((nf) this).b(52, var41);
                          var3_ref.a(50, 100, 100, param0 ^ 77);
                          var3_ref.f(0);
                          var5 = 0;
                          L35: while (true) {
                            if (var5 >= 5) {
                              break L34;
                            } else {
                              var6 = j.a(var3_ref.field_t, var3_ref.field_G, (byte) -109, (nf) this, 117, var3_ref.field_v, 159);
                              var7 = var5 * 8192 / 5;
                              var6.field_u = of.a(-93, var7) >> 10;
                              var6.field_F = (j.a(var7, -112) >> 11) + -64;
                              ((nf) this).b(param0 ^ 113, var6);
                              var5++;
                              continue L35;
                            }
                          }
                        } else {
                          var3_ref = (mi) (Object) ((nf) this).field_Kb.a(0);
                          continue L7;
                        }
                      }
                    }
                    var3_ref = (mi) (Object) ((nf) this).field_Kb.a(0);
                    continue L7;
                  }
                }
              } else {
                L36: {
                  if (var3.field_jb != 35) {
                    break L36;
                  } else {
                    var3.a(false, true);
                    break L36;
                  }
                }
                var3.field_W = 0;
                var3.field_G = -1;
                var3 = (ml) (Object) ge.field_p.d(-18502);
                continue L6;
              }
            }
          } else {
            L37: {
              if (~var3.field_u != ~((nf) this).field_J) {
                break L37;
              } else {
                if (var3.field_ib <= 0) {
                  break L37;
                } else {
                  L38: {
                    if (5 != ((nf) this).field_x[((nf) this).field_J]) {
                      break L38;
                    } else {
                      if (0 >= ((nf) this).field_X[((nf) this).field_J]) {
                        break L38;
                      } else {
                        if (var3.field_jb == 12) {
                          break L38;
                        } else {
                          if (!var3.field_U) {
                            var4 = null;
                            var5_ref_mi = (mi) (Object) ((nf) this).field_Kb.b(12623);
                            L39: while (true) {
                              if (var5_ref_mi == null) {
                                if (var4 == null) {
                                  var32 = j.a(var3, var3.field_db, (byte) 35, (nf) this, 145, var3.field_lb, 106);
                                  var34 = var32;
                                  var32.field_y = 50 + -(((nf) this).field_X[((nf) this).field_J] / 20);
                                  ((nf) this).b(52, var34);
                                  break L38;
                                } else {
                                  ((mi) var4).field_y = ((mi) var4).field_y - ((nf) this).field_X[((nf) this).field_J] / 20;
                                  if (((mi) var4).field_y >= 0) {
                                    break L38;
                                  } else {
                                    ((mi) var4).field_y = 0;
                                    break L38;
                                  }
                                }
                              } else {
                                L40: {
                                  if (var5_ref_mi.field_I != 106) {
                                    break L40;
                                  } else {
                                    if (var5_ref_mi.field_t != var3) {
                                      break L40;
                                    } else {
                                      var4 = (Object) (Object) var5_ref_mi;
                                      break L40;
                                    }
                                  }
                                }
                                var5_ref_mi = (mi) (Object) ((nf) this).field_Kb.a(0);
                                continue L39;
                              }
                            }
                          } else {
                            break L38;
                          }
                        }
                      }
                    }
                  }
                  L41: {
                    L42: {
                      if (16 == var3.field_jb) {
                        break L42;
                      } else {
                        if (23 != var3.field_jb) {
                          break L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                    L43: {
                      if (var3.field_jb == 16) {
                        stackOut_38_0 = 71;
                        stackIn_39_0 = stackOut_38_0;
                        break L43;
                      } else {
                        stackOut_37_0 = 60;
                        stackIn_39_0 = stackOut_37_0;
                        break L43;
                      }
                    }
                    var4_int = stackIn_39_0;
                    var36 = j.a(var35, var3.field_db, (byte) 49, (nf) this, var4_int, var3.field_lb, 111);
                    var36.field_H = 4;
                    ((nf) this).b(52, var36);
                    break L41;
                  }
                  L44: {
                    L45: {
                      if (var3.field_jb == 6) {
                        break L45;
                      } else {
                        if (var3.field_jb == 26) {
                          break L45;
                        } else {
                          if (!var3.field_U) {
                            break L44;
                          } else {
                            if (var3.field_jb != 17) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                      }
                    }
                    L46: {
                      if (var3.field_jb != 6) {
                        stackOut_47_0 = 76;
                        stackIn_48_0 = stackOut_47_0;
                        break L46;
                      } else {
                        stackOut_46_0 = 64;
                        stackIn_48_0 = stackOut_46_0;
                        break L46;
                      }
                    }
                    var4_int = stackIn_48_0;
                    var37 = j.a(var3, var3.field_db, (byte) 11, (nf) this, var4_int, var3.field_lb, 55);
                    var37.field_H = 4;
                    ((nf) this).b(52, var37);
                    break L44;
                  }
                  L47: {
                    if (!var3.field_U) {
                      break L47;
                    } else {
                      if (16 != var3.field_jb) {
                        var3.field_ib = var3.field_ib - 5;
                        if (var3.field_ib < 1) {
                          var3.field_ib = 1;
                          break L47;
                        } else {
                          break L47;
                        }
                      } else {
                        break L47;
                      }
                    }
                  }
                  L48: {
                    if (var3.field_jb == 23) {
                      var3.field_q = var3.field_q + 30;
                      if (var3.field_q <= 75) {
                        break L48;
                      } else {
                        var3.field_q = 75;
                        break L48;
                      }
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    if (12 == var3.field_jb) {
                      var3.field_x = var3.field_x + 15;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  L50: {
                    if (var3.field_jb == 39) {
                      var3.field_ib = var3.field_ib + 25;
                      if (var3.field_ib <= 100) {
                        break L50;
                      } else {
                        var3.field_ib = 100;
                        break L50;
                      }
                    } else {
                      break L50;
                    }
                  }
                  L51: {
                    L52: {
                      if (var3.field_jb == 24) {
                        break L52;
                      } else {
                        if (var3.field_jb != 18) {
                          break L51;
                        } else {
                          break L52;
                        }
                      }
                    }
                    var3.a(10, -28922);
                    break L51;
                  }
                  if (var3.field_jb == 36) {
                    var4_double = (double)(var3.w(24501).field_lb - var3.field_lb << 4);
                    var6_double = (double)(256 + (var3.w(param0 + 24432).field_db - var3.field_db << 4));
                    var8_double = 64.0;
                    var10 = var4_double * 4.0 * var4_double / (2.0 * var8_double * var8_double);
                    var12 = var4_double;
                    var14 = -var6_double + var4_double * (4.0 * var4_double) / (var8_double * 2.0 * var8_double);
                    L53: while (true) {
                      L54: {
                        if (var10 == 0.0) {
                          break L54;
                        } else {
                          if (var12 * var12 - var14 * (var10 * 4.0) >= 0.0) {
                            break L54;
                          } else {
                            if (768.0 <= var8_double) {
                              break L54;
                            } else {
                              var8_double = var8_double + 8.0;
                              var14 = var4_double * (4.0 * var4_double) / (var8_double * (2.0 * var8_double)) - var6_double;
                              var12 = var4_double;
                              var10 = var4_double * (var4_double * 4.0) / (2.0 * var8_double * var8_double);
                              continue L53;
                            }
                          }
                        }
                      }
                      if (var10 == 0.0) {
                        break L37;
                      } else {
                        if (0.0 <= -(var14 * (var10 * 4.0)) + var12 * var12) {
                          L55: {
                            var16 = (-var12 + Math.sqrt(-(var14 * (4.0 * var10)) + var12 * var12)) / (2.0 * var10);
                            var18 = (-var12 - Math.sqrt(-(var10 * 4.0 * var14) + var12 * var12)) / (2.0 * var10);
                            if (Math.abs(var16) > Math.abs(var18)) {
                              var16 = var18;
                              break L55;
                            } else {
                              break L55;
                            }
                          }
                          L56: {
                            var20 = var8_double * var8_double / (var16 * var16 + 1.0);
                            var22 = var8_double * var8_double / (1.0 / (var16 * var16) + 1.0);
                            var24 = (int)Math.sqrt(var20);
                            var25 = (int)Math.sqrt(var22);
                            if (0.0 < var16) {
                              if (0.0 <= var4_double) {
                                break L56;
                              } else {
                                var25 = -var25;
                                break L56;
                              }
                            } else {
                              if (var4_double <= 0.0) {
                                break L56;
                              } else {
                                var25 = -var25;
                                break L56;
                              }
                            }
                          }
                          L57: {
                            if (var24 <= 0) {
                              break L57;
                            } else {
                              if (0.0 <= var4_double) {
                                break L57;
                              } else {
                                var24 = -var24;
                                break L57;
                              }
                            }
                          }
                          var26 = 8;
                          var27 = (int)((double)(var24 * (4 + (var3.field_Y / 2 + var26))) / var8_double + (double)var3.field_lb);
                          var28 = (int)((double)(-(var3.field_Y / 2)) + ((double)var3.field_db + (double)(var25 * (var26 + (var3.field_Y / 2 - -4))) / var8_double));
                          var29_ref_mi = j.a(((nf) this).a(var3.field_u, true), var28, (byte) 18, (nf) this, -1, var27, 153);
                          ((nf) this).b(52, var29_ref_mi);
                          var29_ref_mi.field_y = 20;
                          var29_ref_mi.field_u = var24;
                          var29_ref_mi.field_F = var25;
                          var29_ref_mi.field_w = true;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                  } else {
                    break L37;
                  }
                }
              }
            }
            var3 = (ml) (Object) ge.field_p.d(-18502);
            continue L5;
          }
        }
    }

    private final void i(int param0) {
        int var3 = 0;
        ml var5 = null;
        int var6 = 0;
        ml var6_ref_ml = null;
        int var7_int = 0;
        ml var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        mi var13 = null;
        mi var14 = null;
        mi var15 = null;
        mi var16 = null;
        mi var17 = null;
        mi var18 = null;
        mi var19 = null;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          ((nf) this).field_mb = -1000;
          var12 = new jd(new int[2]);
          var3 = uj.a(var12, 2, (byte) -68);
          if (var3 == 0) {
            var3 = 128 + uj.a(var12, 128 * ((((nf) this).field_jb + -((nf) this).l(4)) / ((nf) this).field_q) - -1, (byte) -66);
            if (~(-128 + ((nf) this).field_y) > ~var3) {
              var3 = uj.a(var12, -256 + ((nf) this).field_y, (byte) -31) + 128;
              break L0;
            } else {
              break L0;
            }
          } else {
            var3 = -128 + ((nf) this).field_y - uj.a(var12, (((nf) this).field_jb + -((nf) this).l(4)) / ((nf) this).field_q * 128 + 1, (byte) -57);
            if (var3 >= 128) {
              break L0;
            } else {
              var3 = 128 + uj.a(var12, -256 + ((nf) this).field_y, (byte) -32);
              break L0;
            }
          }
        }
        L1: {
          var5 = ((nf) this).a(((nf) this).field_J, true);
          var6 = ((nf) this).field_O;
          if (var6 != 3) {
            if (0 != var6) {
              L2: {
                if (2 != var6) {
                  if (5 != var6) {
                    if (var6 != 1) {
                      if (4 == var6) {
                        var17 = j.a(var5, -480, (byte) -93, (nf) this, 46, var3, 36);
                        var17.field_w = true;
                        var17.field_F = 0;
                        var17.field_u = 0;
                        ((nf) this).b(52, var17);
                        break L1;
                      } else {
                        if (var6 == 6) {
                          if (((nf) this).field_jb % 2 != 0) {
                            break L2;
                          } else {
                            var18 = j.a(var5, -480, (byte) -125, (nf) this, 73, var3, 60);
                            var18.field_w = true;
                            ((nf) this).b(52, var18);
                            break L1;
                          }
                        } else {
                          if (7 != var6) {
                            if (var6 != 8) {
                              break L2;
                            } else {
                              L3: {
                                var19 = j.a(var5, ((nf) this).field_H, (byte) 19, (nf) this, 0, var3, 74);
                                var19.field_y = -((nf) this).field_jb;
                                var19.field_F = -512;
                                var19.field_u = 0;
                                if (var19.field_y >= -100) {
                                  break L3;
                                } else {
                                  var19.field_y = -100;
                                  break L3;
                                }
                              }
                              ((nf) this).b(52, var19);
                              ((nf) this).field_mb = -1;
                              var6 = 0;
                              var7 = (ml) (Object) ((nf) this).field_i.b(12623);
                              L4: while (true) {
                                if (var7 == null) {
                                  if (-1 == ((nf) this).field_mb) {
                                    ((nf) this).field_mb = 128 + uj.a(var12, ((nf) this).field_y - 256, (byte) -121);
                                    ((nf) this).field_t = 128 + uj.a(var12, ((nf) this).field_H + -128, (byte) -32);
                                    break L2;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  L5: {
                                    if (var7.field_jb != 11) {
                                      break L5;
                                    } else {
                                      L6: {
                                        var8 = var7.field_X >> 4;
                                        var9 = var7.field_R >> 4;
                                        var10 = Math.abs(-var3 + var8) + Math.abs(-((nf) this).field_H + var8);
                                        if (((nf) this).field_mb == -1) {
                                          break L6;
                                        } else {
                                          if (~var10 > ~var6) {
                                            break L6;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      var6 = var10;
                                      ((nf) this).field_mb = var8;
                                      ((nf) this).field_t = var9;
                                      break L5;
                                    }
                                  }
                                  L7: {
                                    if (!var7.t(94)) {
                                      break L7;
                                    } else {
                                      if (var7.field_jb == 20) {
                                        break L7;
                                      } else {
                                        if (~((nf) this).field_jb >= ~(20 * ((nf) this).field_q)) {
                                          break L7;
                                        } else {
                                          if (var7 == var5) {
                                            ((nf) this).field_t = var7.field_R >> 4;
                                            ((nf) this).field_mb = var7.field_X >> 4;
                                            break L7;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var7 = (ml) (Object) ((nf) this).field_i.a(0);
                                  continue L4;
                                }
                              }
                            }
                          } else {
                            if (((nf) this).c((byte) -119, ((nf) this).field_J) < 4) {
                              var6_ref_ml = new ml(36, var3, -480, ((nf) this).h(-118), (nf) this, var5);
                              ((nf) this).a((byte) -117, var6_ref_ml);
                              ((nf) this).field_ob[((nf) this).field_J] = ((nf) this).field_ob[((nf) this).field_J] + 1;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    } else {
                      var6 = ((nf) this).field_H / 2;
                      var7_int = gf.a((15360 + 32 * var6) / 4, -266740663);
                      var8 = (var3 & 1) * 192 - 96;
                      var16 = j.a(var5, -544, (byte) -117, (nf) this, 58, var3 + -(var7_int * var8 / 16), 49);
                      var16.field_w = true;
                      var16.field_F = 0;
                      var16.field_u = var8;
                      ((nf) this).b(52, var16);
                      break L1;
                    }
                  } else {
                    var6 = ((nf) this).field_H / 2;
                    var7_int = gf.a((480 + var6) * 32 / 4, -266740663);
                    var8 = -96 + 192 * (1 & var3);
                    var9 = 1;
                    var10 = 0;
                    L8: while (true) {
                      if (var10 >= 7) {
                        ((nf) this).field_t = var6;
                        ((nf) this).field_mb = var3;
                        break L1;
                      } else {
                        var9 = -var9;
                        var15 = j.a(var5, -544, (byte) 99, (nf) this, 61, -(var8 * var9 * var7_int / 16) + (-3 + var10) * 48 + var3, 50);
                        var15.field_F = 0;
                        var15.field_u = var9 * var8;
                        var15.field_w = true;
                        ((nf) this).b(52, var15);
                        var10++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  if (0 != ((nf) this).field_jb % 2) {
                    break L2;
                  } else {
                    var14 = j.a(var5, ((nf) this).field_H, (byte) -97, (nf) this, 35, var3, 29);
                    var14.field_w = true;
                    ((nf) this).b(52, var14);
                    break L1;
                  }
                }
              }
              break L1;
            } else {
              if (((nf) this).field_jb % 5 == 0) {
                var13 = j.a(var5, ((nf) this).field_H, (byte) 82, (nf) this, 22, var3, 19);
                var13.field_w = true;
                ((nf) this).b(52, var13);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
    }

    final void b(byte param0, int param1) {
        int var4 = 0;
        ml var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(((nf) this).field_J < 0)) {
            if (!(~((nf) this).field_ib[((nf) this).field_J] <= ~((nf) this).field_tb)) {
                ((nf) this).field_ib[((nf) this).field_J] = ((nf) this).field_tb;
            }
        }
        ml var7 = ((nf) this).a(((nf) this).field_J, true);
        if (var7 != null) {
            if (128 + ((nf) this).field_H <= var7.field_db) {
                var4 = var7.field_ib / 2;
                if (var4 < 25) {
                    var4 = 25;
                }
                var7.field_x = var7.field_x + var4;
                var7.field_z = true;
            }
        }
        for (var4 = 0; ~((nf) this).field_q < ~var4; var4++) {
            if (!((1 << var4 & param1) == 0)) {
                var5 = ((nf) this).a(var4, true);
                if (!(var5 == null)) {
                    var5.field_ib = 0;
                    var5.field_x = 1;
                }
            }
        }
        if (param0 != 88) {
            ((nf) this).b((byte) -37, -9);
        }
    }

    final boolean a(ml param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        ll var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var6 = go.field_j[29];
              param1 = param1 - var6.field_k;
              if (param3 == -5) {
                break L1;
              } else {
                boolean discarded$2 = this.c(-47, -85, 123);
                break L1;
              }
            }
            L2: {
              param2 = param2 - var6.field_g / 2;
              if (var6.field_j + param2 < 0) {
                break L2;
              } else {
                if (var6.field_j + (param2 - -var6.field_h) > ((nf) this).field_y) {
                  break L2;
                } else {
                  if (param1 - -var6.field_f < 0) {
                    break L2;
                  } else {
                    if (param1 - -var6.field_k < -5 + ((nf) this).field_H) {
                      L3: {
                        L4: {
                          if (!((nf) this).b(param1, param3 + 7, param2, var6.b())) {
                            break L4;
                          } else {
                            if (jo.field_b) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("nf.OB(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final void a(int param0, int param1, ll param2, int param3, ll param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (param4 == null) {
              return;
            } else {
              L1: {
                param0 = param0 + param2.field_f;
                param3 = param3 + param2.field_j;
                var6_int = param0 * ((nf) this).field_y + param3;
                var7 = 0;
                if (param1 >= 103) {
                  break L1;
                } else {
                  boolean discarded$1 = ((nf) this).b(-7, -107);
                  break L1;
                }
              }
              L2: {
                var8 = param2.field_c;
                var9 = param2.field_h;
                var10 = ((nf) this).field_y + -var9;
                var11 = 0;
                if (param0 >= 0) {
                  break L2;
                } else {
                  var12 = 0 - param0;
                  var6_int = var6_int + ((nf) this).field_y * var12;
                  var7 = var7 + var12 * var9;
                  var8 = var8 - var12;
                  param0 = 0;
                  break L2;
                }
              }
              L3: {
                if (0 > param3) {
                  var12 = 0 - param3;
                  var6_int = var6_int + var12;
                  param3 = 0;
                  var10 = var10 + var12;
                  var7 = var7 + var12;
                  var9 = var9 - var12;
                  var11 = var11 + var12;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (~(param0 + var8) < ~(-1 + ((nf) this).field_H)) {
                  var8 = var8 - (1 - ((nf) this).field_H + (var8 + param0));
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (-1 + ((nf) this).field_y >= var9 + param3) {
                  break L5;
                } else {
                  var12 = var9 + param3 + (-((nf) this).field_y + 1);
                  var10 = var10 + var12;
                  var9 = var9 - var12;
                  var11 = var11 + var12;
                  break L5;
                }
              }
              L6: {
                if (var9 <= 0) {
                  break L6;
                } else {
                  if (var8 > 0) {
                    vn.a(param2.field_m, var9, var7, 111, var6_int, var11, var8, param4.field_m, var10, true);
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("nf.HC(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final int d(int param0, int param1) {
        int var3 = -119 % ((param0 - -17) / 56);
        return ((nf) this).field_E[param1];
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < 18) {
            boolean discarded$0 = this.k((byte) 46);
        }
        ((nf) this).field_J = param0;
        ((nf) this).field_ub = true;
        this.a(9, param2);
    }

    final boolean b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (((nf) this).field_ub) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (!((nf) this).field_d) {
              var3 = -1;
              var4 = 0;
              var5 = 0;
              L1: while (true) {
                if (~var5 <= ~((nf) this).field_q) {
                  if (1 >= var4) {
                    ((nf) this).a(var3, (byte) 46, param0);
                    return true;
                  } else {
                    break L0;
                  }
                } else {
                  L2: {
                    var6 = ((nf) this).a(var5, true);
                    if (var6 == null) {
                      break L2;
                    } else {
                      var4++;
                      var3 = var5;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              var3 = 0;
              var4 = -1;
              var5 = 0;
              L3: while (true) {
                if (~var5 <= ~((nf) this).field_q) {
                  if (1 >= tm.a(var3, (byte) -68)) {
                    ((nf) this).a(var4, (byte) 98, param0);
                    return true;
                  } else {
                    break L0;
                  }
                } else {
                  L4: {
                    var6 = ((nf) this).a(var5, true);
                    if (var6 == null) {
                      break L4;
                    } else {
                      var3 = var3 | (var5 & 1) - -1;
                      var4 = var5;
                      break L4;
                    }
                  }
                  var5++;
                  continue L3;
                }
              }
            }
          }
          var3 = 119 / ((-1 - param1) / 56);
          return false;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((nf) this).field_Db.b((pg) (Object) new ge(param0, param7, param4, param5, param8, param6, param1, param3), -1);
        int var10 = -97 % ((param2 - -41) / 40);
    }

    final boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -128) {
            break L0;
          } else {
            int[] discarded$2 = this.a(-37, (jd) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.j((byte) -94)) {
              break L2;
            } else {
              if (((nf) this).field_Db.b(true)) {
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

    final int b(boolean param0) {
        if (!param0) {
            ((nf) this).b(20, true, -2);
        }
        return ((nf) this).field_w;
    }

    final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            ((nf) this).a(false, (ol) null, 106);
            if (((nf) this).d((byte) -128)) {
              break L1;
            } else {
              if (((nf) this).field_zb) {
                break L1;
              } else {
                L2: {
                  if (param0 == 72) {
                    break L2;
                  } else {
                    ((nf) this).field_b = null;
                    break L2;
                  }
                }
                return var2;
              }
            }
          }
          var2++;
          if (4096 >= var2) {
            continue L0;
          } else {
            throw new qg();
          }
        }
    }

    final void b(int param0, mi param1) {
        if (!param1.k(param0 + -149)) {
            ((nf) this).field_Gb = true;
        } else {
            if (!(!((nf) this).field_l)) {
                return;
            }
        }
        try {
            ((nf) this).field_kb.b((pg) (Object) param1, -1);
            if (param0 != 52) {
                ((nf) this).field_Z = true;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nf.AD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, ml param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        boolean stackIn_112_0 = false;
        boolean stackIn_115_0 = false;
        int stackIn_117_0 = 0;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_107_0 = 0;
        boolean stackOut_111_0 = false;
        int stackOut_116_0 = 0;
        boolean stackOut_114_0 = false;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        try {
          L0: {
            L1: {
              if (120 != param0) {
                break L1;
              } else {
                if (param1.field_jb == 11) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 != 121) {
                break L2;
              } else {
                if (4 != param1.field_jb) {
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            }
            L3: {
              if (param0 != 122) {
                break L3;
              } else {
                if (param1.field_jb != 5) {
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              }
            }
            L4: {
              if (param0 != 123) {
                break L4;
              } else {
                if (param1.field_jb != 5) {
                  break L4;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              }
            }
            L5: {
              if (124 != param0) {
                break L5;
              } else {
                if (param1.field_jb == 1) {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (125 != param0) {
                break L6;
              } else {
                if (param1.field_jb != 1) {
                  break L6;
                } else {
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                }
              }
            }
            L7: {
              if (param0 != 137) {
                break L7;
              } else {
                if (2 != param1.field_jb) {
                  break L7;
                } else {
                  stackOut_28_0 = 1;
                  stackIn_29_0 = stackOut_28_0;
                  return stackIn_29_0 != 0;
                }
              }
            }
            L8: {
              if (param0 != 126) {
                break L8;
              } else {
                if (3 == param1.field_jb) {
                  stackOut_33_0 = 1;
                  stackIn_34_0 = stackOut_33_0;
                  return stackIn_34_0 != 0;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (127 != param0) {
                break L9;
              } else {
                if (param1.field_jb != 13) {
                  break L9;
                } else {
                  stackOut_37_0 = 1;
                  stackIn_38_0 = stackOut_37_0;
                  return stackIn_38_0 != 0;
                }
              }
            }
            L10: {
              if (param0 != 128) {
                break L10;
              } else {
                if (param1.field_jb == 15) {
                  stackOut_42_0 = 1;
                  stackIn_43_0 = stackOut_42_0;
                  return stackIn_43_0 != 0;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (param0 != 129) {
                break L11;
              } else {
                if (14 != param1.field_jb) {
                  break L11;
                } else {
                  stackOut_46_0 = 1;
                  stackIn_47_0 = stackOut_46_0;
                  return stackIn_47_0 != 0;
                }
              }
            }
            L12: {
              if (param0 != 136) {
                break L12;
              } else {
                if (param1.field_jb == 26) {
                  stackOut_51_0 = 1;
                  stackIn_52_0 = stackOut_51_0;
                  return stackIn_52_0 != 0;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (param0 != 130) {
                break L13;
              } else {
                if (7 == param1.field_jb) {
                  stackOut_56_0 = 1;
                  stackIn_57_0 = stackOut_56_0;
                  return stackIn_57_0 != 0;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (param0 != 131) {
                break L14;
              } else {
                if (8 == param1.field_jb) {
                  stackOut_61_0 = 1;
                  stackIn_62_0 = stackOut_61_0;
                  return stackIn_62_0 != 0;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (138 != param0) {
                break L15;
              } else {
                if (param1.field_jb != 9) {
                  break L15;
                } else {
                  stackOut_65_0 = 1;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0 != 0;
                }
              }
            }
            L16: {
              if (param0 != 132) {
                break L16;
              } else {
                if (10 == param1.field_jb) {
                  stackOut_70_0 = 1;
                  stackIn_71_0 = stackOut_70_0;
                  return stackIn_71_0 != 0;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (param0 != 154) {
                break L17;
              } else {
                if (param1.field_jb != 37) {
                  break L17;
                } else {
                  stackOut_74_0 = 1;
                  stackIn_75_0 = stackOut_74_0;
                  return stackIn_75_0 != 0;
                }
              }
            }
            L18: {
              if (param0 != 155) {
                break L18;
              } else {
                if (param1.field_jb != 39) {
                  break L18;
                } else {
                  stackOut_78_0 = 1;
                  stackIn_79_0 = stackOut_78_0;
                  return stackIn_79_0 != 0;
                }
              }
            }
            L19: {
              if (param0 != 149) {
                break L19;
              } else {
                if (param1.field_jb != 31) {
                  break L19;
                } else {
                  stackOut_82_0 = 1;
                  stackIn_83_0 = stackOut_82_0;
                  return stackIn_83_0 != 0;
                }
              }
            }
            L20: {
              if (param0 != 148) {
                break L20;
              } else {
                if (33 != param1.field_jb) {
                  break L20;
                } else {
                  stackOut_86_0 = 1;
                  stackIn_87_0 = stackOut_86_0;
                  return stackIn_87_0 != 0;
                }
              }
            }
            L21: {
              if (133 != param0) {
                break L21;
              } else {
                if (param1.field_jb != 25) {
                  break L21;
                } else {
                  stackOut_90_0 = 1;
                  stackIn_91_0 = stackOut_90_0;
                  return stackIn_91_0 != 0;
                }
              }
            }
            L22: {
              if (62 != param0) {
                break L22;
              } else {
                if (10 != param1.field_jb) {
                  break L22;
                } else {
                  L23: {
                    stackOut_94_0 = 1;
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_95_0 = stackOut_94_0;
                    if (param1.field_U) {
                      stackOut_96_0 = stackIn_96_0;
                      stackOut_96_1 = 0;
                      stackIn_97_0 = stackOut_96_0;
                      stackIn_97_1 = stackOut_96_1;
                      break L23;
                    } else {
                      stackOut_95_0 = stackIn_95_0;
                      stackOut_95_1 = 1;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      break L23;
                    }
                  }
                  if (stackIn_97_0 == stackIn_97_1) {
                    break L22;
                  } else {
                    stackOut_98_0 = 1;
                    stackIn_99_0 = stackOut_98_0;
                    return stackIn_99_0 != 0;
                  }
                }
              }
            }
            L24: {
              if (param0 != 62) {
                break L24;
              } else {
                if (param1.field_jb != 17) {
                  break L24;
                } else {
                  L25: {
                    if (param1.field_U) {
                      stackOut_104_0 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      break L25;
                    } else {
                      stackOut_103_0 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      break L25;
                    }
                  }
                  if (stackIn_105_0 != 1) {
                    stackOut_107_0 = 1;
                    stackIn_108_0 = stackOut_107_0;
                    return stackIn_108_0 != 0;
                  } else {
                    break L24;
                  }
                }
              }
            }
            if (135 == param0) {
              stackOut_111_0 = this.c(param1.field_u, 72, 0);
              stackIn_112_0 = stackOut_111_0;
              return stackIn_112_0;
            } else {
              if (param0 != 134) {
                stackOut_116_0 = 0;
                stackIn_117_0 = stackOut_116_0;
                break L0;
              } else {
                stackOut_114_0 = this.c(param1.field_u, 41, 0);
                stackIn_115_0 = stackOut_114_0;
                return stackIn_115_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var4 = decompiledCaughtException;
            stackOut_118_0 = (RuntimeException) var4;
            stackOut_118_1 = new StringBuilder().append("nf.KA(").append(param0).append(',');
            stackIn_120_0 = stackOut_118_0;
            stackIn_120_1 = stackOut_118_1;
            stackIn_119_0 = stackOut_118_0;
            stackIn_119_1 = stackOut_118_1;
            if (param1 == null) {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "null";
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              stackIn_121_2 = stackOut_120_2;
              break L26;
            } else {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "{...}";
              stackIn_121_0 = stackOut_119_0;
              stackIn_121_1 = stackOut_119_1;
              stackIn_121_2 = stackOut_119_2;
              break L26;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_121_0, stackIn_121_2 + ',' + 1 + ')');
        }
        return stackIn_117_0 != 0;
    }

    final vn l(byte param0) {
        if (param0 != 48) {
            ((nf) this).field_t = -21;
        }
        return ((nf) this).field_r;
    }

    final int c(byte param0, int param1) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        gh.field_D.a((byte) 102, ((nf) this).field_i);
        int var3 = 0;
        if (param0 >= -101) {
            int[] discarded$0 = this.c((jd) null, -100);
        }
        ml var4 = (ml) (Object) gh.field_D.b(-107);
        while (var4 != null) {
            if (12 != var4.field_jb) {
                if (var4.field_s != null) {
                    if (param1 == var4.field_u) {
                        var3++;
                    }
                }
            }
            var4 = (ml) (Object) gh.field_D.d(-18502);
        }
        return var3;
    }

    final void c(boolean param0) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        qb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        jd var21 = null;
        ml var22 = null;
        ml var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        ml var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        L0: {
          var16 = ArcanistsMulti.field_G ? 1 : 0;
          var21 = new jd(new int[2]);
          if (param0) {
            break L0;
          } else {
            int[] discarded$8 = this.d(-68, (jd) null);
            break L0;
          }
        }
        L1: {
          var3 = 0;
          var4 = ((nf) this).field_q;
          var7 = new qb(36, 36);
          var7.a();
          de.i(18, 18, 16, 16777215);
          if (!((nf) this).field_d) {
            L2: while (true) {
              var44 = new int[var4];
              var38 = var44;
              var32 = var38;
              var25 = var32;
              var6 = var25;
              var43 = new int[var4];
              var37 = var43;
              var31 = var37;
              var24 = var31;
              var5 = var24;
              var3 = 0;
              var8 = 0;
              L3: while (true) {
                if (~var4 >= ~var8) {
                  L4: {
                    if (~var3 > ~((nf) this).field_q) {
                      var4 += 4;
                      if (var4 < 100) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  ((nf) this).field_nb = 0;
                  var8 = 0;
                  L5: while (true) {
                    if (((nf) this).field_q <= var8) {
                      break L1;
                    } else {
                      L6: {
                        var9 = 0;
                        if (((nf) this).field_x[var8] != 9) {
                          break L6;
                        } else {
                          var9 = 27;
                          break L6;
                        }
                      }
                      L7: {
                        if (var3 == 0) {
                          var10 = uj.a(var21, var8, (byte) -124);
                          var26 = ((nf) this).a(var10, true);
                          int fieldTemp$9 = ((nf) this).field_nb;
                          ((nf) this).field_nb = ((nf) this).field_nb + 1;
                          ((nf) this).a((byte) -118, new ml(var9, var26.field_lb, -32 + var26.field_db, fieldTemp$9, (nf) this, var8));
                          break L7;
                        } else {
                          var10 = uj.a(var21, var3, (byte) -79);
                          int fieldTemp$10 = ((nf) this).field_nb;
                          ((nf) this).field_nb = ((nf) this).field_nb + 1;
                          ((nf) this).a((byte) -127, new ml(var9, var43[var10], var44[var10], fieldTemp$10, (nf) this, var8));
                          var3--;
                          var5[var10] = var43[var3];
                          var6[var10] = var44[var3];
                          break L7;
                        }
                      }
                      var8++;
                      continue L5;
                    }
                  }
                } else {
                  L8: {
                    var9 = ((nf) this).field_y * (var8 + 1) / (1 + var4);
                    if (0 != (var8 & 1)) {
                      var10 = 64;
                      L9: while (true) {
                        L10: {
                          if (kk.a(var7, -18 + var9, 1 + var10 + -34, ((nf) this).field_V, 0, 0)) {
                            break L10;
                          } else {
                            if (~var10 < ~(-64 + ((nf) this).field_H)) {
                              break L10;
                            } else {
                              var10++;
                              continue L9;
                            }
                          }
                        }
                        if (((nf) this).field_H + -64 <= var10) {
                          break L8;
                        } else {
                          if (var10 != 64) {
                            var43[var3] = var9;
                            var44[var3] = var10;
                            var3++;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    } else {
                      var10 = ((nf) this).field_H - 64;
                      L11: while (true) {
                        L12: {
                          if (!kk.a(var7, -18 + var9, var10 + -34, ((nf) this).field_V, 0, 0)) {
                            break L12;
                          } else {
                            if (64 > var10) {
                              break L12;
                            } else {
                              var10--;
                              continue L11;
                            }
                          }
                        }
                        L13: {
                          if (var10 == -64 + ((nf) this).field_H) {
                            break L13;
                          } else {
                            if (64 >= var10) {
                              break L13;
                            } else {
                              var43[var3] = var9;
                              var44[var3] = var10;
                              var3++;
                              break L8;
                            }
                          }
                        }
                        break L8;
                      }
                    }
                  }
                  var8++;
                  continue L3;
                }
              }
            }
          } else {
            var8 = 0;
            var9 = ((nf) this).field_q;
            L14: while (true) {
              var40 = new int[var4];
              var34 = var40;
              var28 = var34;
              var18 = var28;
              var6 = var18;
              var3 = 0;
              var39 = new int[var4];
              var33 = var39;
              var27 = var33;
              var17 = var27;
              var5 = var17;
              var12 = 0;
              L15: while (true) {
                if (~var4 >= ~var12) {
                  L16: {
                    if (~((nf) this).field_q >= ~var3) {
                      break L16;
                    } else {
                      var4 += 4;
                      if (var4 < 100) {
                        continue L14;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: while (true) {
                    var41 = new int[var9];
                    var35 = var41;
                    var29 = var35;
                    var19 = var29;
                    var10_ref_int__ = var19;
                    var8 = 0;
                    var42 = new int[var9];
                    var36 = var42;
                    var30 = var36;
                    var20 = var30;
                    var11 = var20;
                    var12 = 0;
                    L18: while (true) {
                      if (var12 >= var9) {
                        L19: {
                          if (~var8 > ~((nf) this).field_q) {
                            var9 += 4;
                            if (100 > var9) {
                              continue L17;
                            } else {
                              break L19;
                            }
                          } else {
                            break L19;
                          }
                        }
                        ((nf) this).field_nb = 0;
                        var12 = 0;
                        L20: while (true) {
                          if (((nf) this).field_q <= var12) {
                            break L1;
                          } else {
                            L21: {
                              var13 = 0;
                              if ((1 & var12) != 0) {
                                if (var8 != 0) {
                                  var14 = uj.a(var21, var8, (byte) -53);
                                  var8--;
                                  int fieldTemp$11 = ((nf) this).field_nb;
                                  ((nf) this).field_nb = ((nf) this).field_nb + 1;
                                  ((nf) this).a((byte) -116, new ml(var13, var41[var14], var42[var14], fieldTemp$11, (nf) this, var12));
                                  var10_ref_int__[var14] = var41[var8];
                                  var11[var14] = var42[var8];
                                  break L21;
                                } else {
                                  var14 = uj.a(var21, var12, (byte) -81);
                                  var23 = ((nf) this).a(var14, true);
                                  int fieldTemp$12 = ((nf) this).field_nb;
                                  ((nf) this).field_nb = ((nf) this).field_nb + 1;
                                  ((nf) this).a((byte) -122, new ml(var13, var23.field_lb, var23.field_db - 32, fieldTemp$12, (nf) this, var12));
                                  break L21;
                                }
                              } else {
                                if (0 == var3) {
                                  var14 = uj.a(var21, var12, (byte) -123);
                                  var22 = ((nf) this).a(var14, true);
                                  int fieldTemp$13 = ((nf) this).field_nb;
                                  ((nf) this).field_nb = ((nf) this).field_nb + 1;
                                  ((nf) this).a((byte) -124, new ml(var13, var22.field_lb, -32 + var22.field_db, fieldTemp$13, (nf) this, var12));
                                  break L21;
                                } else {
                                  var14 = uj.a(var21, var3, (byte) -110);
                                  int fieldTemp$14 = ((nf) this).field_nb;
                                  ((nf) this).field_nb = ((nf) this).field_nb + 1;
                                  ((nf) this).a((byte) -123, new ml(var13, var39[var14], var40[var14], fieldTemp$14, (nf) this, var12));
                                  var3--;
                                  var5[var14] = var39[var3];
                                  var6[var14] = var40[var3];
                                  break L21;
                                }
                              }
                            }
                            var12++;
                            continue L20;
                          }
                        }
                      } else {
                        L22: {
                          var13 = ((nf) this).field_y / 2 + (var12 + 1) * (((nf) this).field_y / 2) / (1 + var9);
                          if ((var12 & 1) != 0) {
                            var14 = 64;
                            L23: while (true) {
                              L24: {
                                if (kk.a(var7, var13 + -18, var14 + -33, ((nf) this).field_V, 0, 0)) {
                                  break L24;
                                } else {
                                  if (~(((nf) this).field_H - 64) > ~var14) {
                                    break L24;
                                  } else {
                                    var14++;
                                    continue L23;
                                  }
                                }
                              }
                              if (((nf) this).field_H + -64 <= var14) {
                                break L22;
                              } else {
                                if (var14 != 64) {
                                  var41[var8] = var13;
                                  var42[var8] = var14;
                                  var8++;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          } else {
                            var14 = -64 + ((nf) this).field_H;
                            L25: while (true) {
                              L26: {
                                if (!kk.a(var7, var13 - 18, var14 - 34, ((nf) this).field_V, 0, 0)) {
                                  break L26;
                                } else {
                                  if (var14 < 64) {
                                    break L26;
                                  } else {
                                    var14--;
                                    continue L25;
                                  }
                                }
                              }
                              L27: {
                                if (~(-64 + ((nf) this).field_H) == ~var14) {
                                  break L27;
                                } else {
                                  if (64 < var14) {
                                    var41[var8] = var13;
                                    var42[var8] = var14;
                                    var8++;
                                    break L27;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              break L22;
                            }
                          }
                        }
                        var12++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  L28: {
                    var13 = ((nf) this).field_y / 2 * (1 + var12) / (1 + var4);
                    if ((var12 & 1) != 0) {
                      var14 = 64;
                      L29: while (true) {
                        L30: {
                          if (kk.a(var7, var13 - 18, var14 - 33, ((nf) this).field_V, 0, 0)) {
                            break L30;
                          } else {
                            if (~(((nf) this).field_H + -64) > ~var14) {
                              break L30;
                            } else {
                              var14++;
                              continue L29;
                            }
                          }
                        }
                        if (~(-64 + ((nf) this).field_H) >= ~var14) {
                          break L28;
                        } else {
                          if (var14 != 64) {
                            var39[var3] = var13;
                            var40[var3] = var14;
                            var3++;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                    } else {
                      var14 = ((nf) this).field_H + -64;
                      L31: while (true) {
                        L32: {
                          if (!kk.a(var7, var13 - 18, var14 - 34, ((nf) this).field_V, 0, 0)) {
                            break L32;
                          } else {
                            if (var14 < 64) {
                              break L32;
                            } else {
                              var14--;
                              continue L31;
                            }
                          }
                        }
                        L33: {
                          if (~(((nf) this).field_H - 64) == ~var14) {
                            break L33;
                          } else {
                            if (var14 <= 64) {
                              break L33;
                            } else {
                              var39[var3] = var13;
                              var40[var3] = var14;
                              var3++;
                              break L28;
                            }
                          }
                        }
                        break L28;
                      }
                    }
                  }
                  var12++;
                  continue L15;
                }
              }
            }
          }
        }
        int discarded$15 = ((nf) this).e((byte) 72);
    }

    final int[] e(int param0, int param1) {
        if (param0 != 3) {
            field_P = null;
        }
        return ((nf) this).field_v[param1];
    }

    final void a(boolean param0, ol param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        mi var5 = null;
        ml var5_ref = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.j((byte) -104)) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var4_int = stackIn_4_0;
              ((nf) this).field_zb = false;
              ((nf) this).field_Gb = false;
              ((nf) this).field_Mb = false;
              if (var4_int != 0) {
                this.a(-109, param1);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = (mi) (Object) ((nf) this).field_Kb.b(12623);
            L3: while (true) {
              if (var5 == null) {
                u.field_f.a((byte) 120, ((nf) this).field_i);
                var5_ref = (ml) (Object) u.field_f.b(-67);
                L4: while (true) {
                  if (var5_ref == null) {
                    L5: {
                      if (param2 >= 103) {
                        break L5;
                      } else {
                        int[] discarded$1 = this.b(126, (jd) null);
                        break L5;
                      }
                    }
                    L6: {
                      this.p((byte) 78);
                      if (!((nf) this).field_Gb) {
                        break L6;
                      } else {
                        ((nf) this).field_zb = false;
                        break L6;
                      }
                    }
                    L7: {
                      if (((nf) this).field_zb) {
                        ((nf) this).field_Gb = true;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        if (param0) {
                          break L9;
                        } else {
                          if (!this.k((byte) -127)) {
                            break L9;
                          } else {
                            ((nf) this).field_D = true;
                            break L8;
                          }
                        }
                      }
                      break L8;
                    }
                    break L0;
                  } else {
                    L10: {
                      if (var5_ref.field_M != 0) {
                        ((nf) this).field_zb = true;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (!var5_ref.field_z) {
                        break L11;
                      } else {
                        if (var5_ref.field_x == 0) {
                          ((nf) this).field_zb = true;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      var5_ref.k(-55);
                      if (!var5_ref.b((byte) -32)) {
                        ((nf) this).field_Gb = true;
                        break L12;
                      } else {
                        ((nf) this).field_Gb = ((nf) this).field_Gb | var5_ref.f(true);
                        ((nf) this).field_Mb = ((nf) this).field_Mb | var5_ref.e(120);
                        break L12;
                      }
                    }
                    var5_ref = (ml) (Object) u.field_f.d(-18502);
                    continue L4;
                  }
                }
              } else {
                L13: {
                  var5.a(((nf) this).field_jb, (byte) -47, ((nf) this).field_t, ((nf) this).field_mb);
                  if (!var5.b((byte) -32)) {
                    break L13;
                  } else {
                    ((nf) this).field_Gb = ((nf) this).field_Gb | var5.h(-139);
                    break L13;
                  }
                }
                var5 = (mi) (Object) ((nf) this).field_Kb.a(0);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var4;
            stackOut_36_1 = new StringBuilder().append("nf.G(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param2 + ')');
        }
    }

    private final int[] c(int param0, jd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int[][] var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int[] var8_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[][] var24 = null;
        int[] var25 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int[] stackIn_85_0 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_84_0 = null;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            ((nf) this).field_w = -320;
            var23 = new int[7];
            var20 = var23;
            var17 = var20;
            var14 = var17;
            var4 = var14;
            var5 = 0;
            L1: while (true) {
              if (~var5 <= ~(-1 + var23.length)) {
                var4[-1 + var23.length] = var23[0];
                var5 = uj.a(param1, var23.length - 4, (byte) -103) - -2;
                var4[var5] = ((nf) this).field_H + (-100 + -uj.a(param1, 250, (byte) -34));
                var4[var5 - 1] = (var4[var5 - 1] - -var23[var5]) / 2;
                var4[1 + var5] = (var4[param0 + var5] + var23[var5]) / 2;
                L2: while (true) {
                  if (~var4.length <= ~((nf) this).field_y) {
                    var24 = new int[6][7];
                    var21 = var24;
                    var18 = var21;
                    var15 = var18;
                    var6 = var15;
                    var5 = 0;
                    L3: while (true) {
                      if (~var24[0].length >= ~var5) {
                        var7 = 0;
                        L4: while (true) {
                          if (var7 >= 6) {
                            var7 = 0;
                            var8 = 0;
                            L5: while (true) {
                              if (~((nf) this).field_y >= ~var8) {
                                var7 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (~var8 <= ~((nf) this).field_y) {
                                    stackOut_84_0 = (int[]) var4;
                                    stackIn_85_0 = stackOut_84_0;
                                    break L0;
                                  } else {
                                    var7 = var8;
                                    var9 = var24[0].length * var8 / ((nf) this).field_y;
                                    var13 = 0;
                                    var10 = var13;
                                    L7: while (true) {
                                      if (~var13 <= ~((nf) this).field_H) {
                                        var8++;
                                        continue L6;
                                      } else {
                                        L8: {
                                          var11 = 0;
                                          if (var24[0][var9] > var24[1][var9]) {
                                            L9: {
                                              if (var13 <= var24[0][var9]) {
                                                break L9;
                                              } else {
                                                var11++;
                                                break L9;
                                              }
                                            }
                                            if (~var24[1][var9] > ~var13) {
                                              var11++;
                                              break L8;
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            break L8;
                                          }
                                        }
                                        L10: {
                                          if (var24[3][var9] >= var24[2][var9]) {
                                            break L10;
                                          } else {
                                            L11: {
                                              if (var13 > var24[2][var9]) {
                                                var11++;
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            if (var13 > var24[3][var9]) {
                                              var11++;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (var24[5][var9] >= var24[4][var9]) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (var24[4][var9] >= var13) {
                                                break L13;
                                              } else {
                                                var11++;
                                                break L13;
                                              }
                                            }
                                            if (var24[5][var9] < var13) {
                                              var11++;
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (1 != var11 % 2) {
                                            break L14;
                                          } else {
                                            L15: {
                                              if (var11 > 0) {
                                                break L15;
                                              } else {
                                                if (~var13 >= ~var4[var9]) {
                                                  break L14;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            mn.field_y.field_m[var7] = (byte) 0;
                                            break L14;
                                          }
                                        }
                                        var7 = var7 + ((nf) this).field_y;
                                        var13++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var7 = var8;
                                var9 = var24[0].length * var8 / ((nf) this).field_y;
                                var10 = 0;
                                L16: while (true) {
                                  if (~((nf) this).field_H >= ~var10) {
                                    var8++;
                                    continue L5;
                                  } else {
                                    L17: {
                                      var11 = 0;
                                      if (~var10 >= ~var4[var9 / 32]) {
                                        break L17;
                                      } else {
                                        var11++;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if (~var24[1][var9] <= ~var24[1][var9]) {
                                        break L18;
                                      } else {
                                        L19: {
                                          if (~var24[1][var9] <= ~var10) {
                                            break L19;
                                          } else {
                                            var11++;
                                            break L19;
                                          }
                                        }
                                        if (~var10 < ~var24[2][var9]) {
                                          var11++;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (~var24[4][var9] <= ~var24[3][var9]) {
                                        break L20;
                                      } else {
                                        L21: {
                                          if (var10 > var24[3][var9]) {
                                            var11++;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        if (~var10 < ~var24[4][var9]) {
                                          var11++;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    L22: {
                                      if (~var24[5][var9] <= ~var10) {
                                        break L22;
                                      } else {
                                        var11++;
                                        break L22;
                                      }
                                    }
                                    L23: {
                                      if (var11 % 2 != 0) {
                                        break L23;
                                      } else {
                                        if (~var4[var9] <= ~var10) {
                                          break L23;
                                        } else {
                                          mn.field_y.field_m[var7] = (byte) -5;
                                          break L23;
                                        }
                                      }
                                    }
                                    var7 = var7 + ((nf) this).field_y;
                                    var10++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          } else {
                            L24: while (true) {
                              if (~var24[var7].length <= ~((nf) this).field_y) {
                                var7++;
                                continue L4;
                              } else {
                                var25 = new int[1 + 2 * (var24[var7].length - 1)];
                                var22 = var25;
                                var19 = var22;
                                var16 = var19;
                                var8_ref_int__ = var16;
                                var8_ref_int__[0] = var24[var7][0];
                                var5 = 1;
                                L25: while (true) {
                                  if (var24[var7].length <= var5) {
                                    var6[var7] = var25;
                                    continue L24;
                                  } else {
                                    L26: {
                                      var3_int = 4 * (((nf) this).field_H / var24[var7].length);
                                      stackOut_21_0 = (int[]) var8_ref_int__;
                                      stackOut_21_1 = -1 + 2 * var5;
                                      stackOut_21_2 = -(var3_int / 2) + (var24[var7][var5 + -1] + var24[var7][var5]) / 2;
                                      stackIn_23_0 = stackOut_21_0;
                                      stackIn_23_1 = stackOut_21_1;
                                      stackIn_23_2 = stackOut_21_2;
                                      stackIn_22_0 = stackOut_21_0;
                                      stackIn_22_1 = stackOut_21_1;
                                      stackIn_22_2 = stackOut_21_2;
                                      if (var3_int == 0) {
                                        stackOut_23_0 = (int[]) (Object) stackIn_23_0;
                                        stackOut_23_1 = stackIn_23_1;
                                        stackOut_23_2 = stackIn_23_2;
                                        stackOut_23_3 = 0;
                                        stackIn_24_0 = stackOut_23_0;
                                        stackIn_24_1 = stackOut_23_1;
                                        stackIn_24_2 = stackOut_23_2;
                                        stackIn_24_3 = stackOut_23_3;
                                        break L26;
                                      } else {
                                        stackOut_22_0 = (int[]) (Object) stackIn_22_0;
                                        stackOut_22_1 = stackIn_22_1;
                                        stackOut_22_2 = stackIn_22_2;
                                        stackOut_22_3 = uj.a(param1, var3_int, (byte) -78);
                                        stackIn_24_0 = stackOut_22_0;
                                        stackIn_24_1 = stackOut_22_1;
                                        stackIn_24_2 = stackOut_22_2;
                                        stackIn_24_3 = stackOut_22_3;
                                        break L26;
                                      }
                                    }
                                    stackIn_24_0[stackIn_24_1] = stackIn_24_2 - -stackIn_24_3;
                                    var8_ref_int__[2 * var5] = var24[var7][var5];
                                    var5++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var24[0][var5] = ((nf) this).field_H + -uj.a(param1, ((nf) this).field_H + -250, (byte) -103);
                        var24[1][var5] = ((nf) this).field_H + -uj.a(param1, -200 + ((nf) this).field_H, (byte) -100);
                        var24[2][var5] = ((nf) this).field_H - uj.a(param1, -150 + ((nf) this).field_H, (byte) -107);
                        var24[3][var5] = ((nf) this).field_H + -uj.a(param1, ((nf) this).field_H + -100, (byte) -121);
                        var24[4][var5] = ((nf) this).field_H + -uj.a(param1, -50 + ((nf) this).field_H, (byte) -60);
                        var24[5][var5] = ((nf) this).field_H + -uj.a(param1, ((nf) this).field_H, (byte) -60);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    var6_array = new int[var4.length * 2 - 1];
                    var6_array[0] = var4[0];
                    var5 = 1;
                    L27: while (true) {
                      if (var5 >= var4.length) {
                        var4 = var6_array;
                        continue L2;
                      } else {
                        L28: {
                          var3_int = ((nf) this).field_H / var4.length;
                          stackOut_8_0 = (int[]) var6_array;
                          stackOut_8_1 = -1 + var5 * 2;
                          stackOut_8_2 = (var4[var5 - 1] - -var4[var5]) / 2;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          if (var3_int != 0) {
                            stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = stackIn_10_2;
                            stackOut_10_3 = uj.a(param1, var3_int, (byte) -30);
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            break L28;
                          } else {
                            stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = stackIn_9_2;
                            stackOut_9_3 = 0;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_11_3 = stackOut_9_3;
                            break L28;
                          }
                        }
                        stackIn_11_0[stackIn_11_1] = stackIn_11_2 + stackIn_11_3 + -(var3_int / 2);
                        var6_array[2 * var5] = var4[var5];
                        var5++;
                        continue L27;
                      }
                    }
                  }
                }
              } else {
                var4[var5] = ((nf) this).field_H / 2 + -uj.a(param1, ((nf) this).field_H / 2, (byte) -26);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var3 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var3;
            stackOut_86_1 = new StringBuilder().append("nf.S(").append(param0).append(',');
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param1 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L29;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L29;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + ')');
        }
        return stackIn_85_0;
    }

    final boolean a(boolean param0, ml param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        try {
          L0: {
            if (16384 < (-param4 + param1.field_lb) * (-param4 + param1.field_lb) - -((-param3 + param1.field_db) * (-param3 + param1.field_db))) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                var6_int = 32;
                if (param2 != 57) {
                  break L1;
                } else {
                  var6_int = 64;
                  break L1;
                }
              }
              L2: {
                if (param2 != 33) {
                  break L2;
                } else {
                  var6_int = 64;
                  break L2;
                }
              }
              if (!param0) {
                L3: {
                  if (param2 != 42) {
                    break L3;
                  } else {
                    var6_int = 64;
                    break L3;
                  }
                }
                L4: {
                  if (param2 != 23) {
                    break L4;
                  } else {
                    var6_int = 100;
                    break L4;
                  }
                }
                L5: {
                  if (param2 != 59) {
                    break L5;
                  } else {
                    var6_int = 100;
                    break L5;
                  }
                }
                L6: {
                  if (param2 != 47) {
                    break L6;
                  } else {
                    var6_int = 100;
                    break L6;
                  }
                }
                L7: {
                  if (65 != param2) {
                    break L7;
                  } else {
                    var6_int = 48;
                    break L7;
                  }
                }
                L8: {
                  if (67 == param2) {
                    var6_int = 48;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (76 == param2) {
                    var6_int = 80;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (77 != param2) {
                    break L10;
                  } else {
                    var6_int = 48;
                    break L10;
                  }
                }
                L11: {
                  if (param2 != 6) {
                    break L11;
                  } else {
                    var6_int = 96;
                    break L11;
                  }
                }
                L12: {
                  if (param2 != 79) {
                    break L12;
                  } else {
                    var6_int = 96;
                    break L12;
                  }
                }
                L13: {
                  if (param2 == 98) {
                    var6_int = 96;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (92 != param2) {
                    break L14;
                  } else {
                    var6_int = 96;
                    break L14;
                  }
                }
                L15: {
                  if (param2 == 90) {
                    var6_int = 64;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (107 != param2) {
                    break L16;
                  } else {
                    var6_int = 128;
                    break L16;
                  }
                }
                L17: {
                  if (param2 == 118) {
                    var6_int = 100;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (~(var6_int / 2) < ~param4) {
                    break L18;
                  } else {
                    if (~param4 < ~(((nf) this).field_y + -(var6_int / 2))) {
                      break L18;
                    } else {
                      if (var6_int > param3) {
                        break L18;
                      } else {
                        if (~param3 >= ~(((nf) this).field_H - var6_int / 2)) {
                          L19: {
                            if (this.a(param4, var6_int >> 1, param3, 124)) {
                              stackOut_55_0 = 0;
                              stackIn_56_0 = stackOut_55_0;
                              break L19;
                            } else {
                              stackOut_54_0 = 1;
                              stackIn_56_0 = stackOut_54_0;
                              break L19;
                            }
                          }
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
                stackOut_51_0 = 0;
                stackIn_52_0 = stackOut_51_0;
                return stackIn_52_0 != 0;
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("nf.UB(").append(param0).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param1 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L20;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L20;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_56_0 != 0;
    }

    final boolean n(int param0) {
        if (param0 != 4) {
            field_Bb = null;
        }
        return ((nf) this).field_ub;
    }

    final boolean m(int param0) {
        if (param0 != -28046) {
            boolean discarded$0 = this.a((ml) null, (qb) null, 91, 30, -97);
        }
        return ((nf) this).field_l;
    }

    final boolean d(byte param0, int param1) {
        if (param1 != 158) {
          if (param1 != 157) {
            if (param1 == 159) {
              return true;
            } else {
              L0: {
                if (param0 == 66) {
                  break L0;
                } else {
                  boolean discarded$1 = ((nf) this).a((ml) null, 31, 63, -105);
                  break L0;
                }
              }
              if (3 == param1) {
                return true;
              } else {
                if (param1 == 4) {
                  return true;
                } else {
                  if (param1 != 5) {
                    if (param1 == 2) {
                      return true;
                    } else {
                      if (param1 == 55) {
                        return true;
                      } else {
                        if (param1 == 54) {
                          return true;
                        } else {
                          if (param1 == 31) {
                            return true;
                          } else {
                            if (param1 != 81) {
                              if (param1 != 60) {
                                if (param1 != 91) {
                                  if (72 != param1) {
                                    if (38 == param1) {
                                      return true;
                                    } else {
                                      if (param1 != 16) {
                                        if (param1 == 45) {
                                          return true;
                                        } else {
                                          if (param1 != 152) {
                                            if (param1 != 87) {
                                              if (param1 == 78) {
                                                return true;
                                              } else {
                                                if (param1 == 30) {
                                                  return true;
                                                } else {
                                                  if (rd.field_e[param1] != 4) {
                                                    if (param1 == 114) {
                                                      return true;
                                                    } else {
                                                      if (param1 != 108) {
                                                        if (109 == param1) {
                                                          return true;
                                                        } else {
                                                          if (88 == param1) {
                                                            return true;
                                                          } else {
                                                            if (param1 == 112) {
                                                              return true;
                                                            } else {
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        return true;
                                                      }
                                                    }
                                                  } else {
                                                    return true;
                                                  }
                                                }
                                              }
                                            } else {
                                              return true;
                                            }
                                          } else {
                                            return true;
                                          }
                                        }
                                      } else {
                                        return true;
                                      }
                                    }
                                  } else {
                                    return true;
                                  }
                                } else {
                                  return true;
                                }
                              } else {
                                return true;
                              }
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final boolean a(int param0, qb param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 > 22) {
                break L1;
              } else {
                ((nf) this).field_ob = null;
                break L1;
              }
            }
            stackOut_2_0 = ti.a(param2, param4, false, param1, ((nf) this).field_Jb, (nf) this, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("nf.DA(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final void c(int param0, int param1) {
        ((nf) this).field_Cb = -1 + param1;
        ((nf) this).field_J = param1;
        if (((nf) this).field_Cb < 0) {
            ((nf) this).field_Cb = ((nf) this).field_Cb + ((nf) this).field_q;
        }
        if (param0 != -4207) {
            ((nf) this).field_hb = -48;
        }
    }

    final void a(int param0, int param1, int param2, qb param3) {
        try {
            if (param1 > -3) {
                boolean discarded$0 = ((nf) this).c((byte) 69);
            }
            this.a(param2, (byte) -79, param0, ((nf) this).field_Jb, param3);
            this.a(false, param2, ((nf) this).field_V, true, param0, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nf.LC(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        ((nf) this).field_nb = 0;
        ml var2 = (ml) (Object) ((nf) this).field_i.b(param0 ^ -12561);
        while (var2 != null) {
            var2.a(true);
            var2.a((byte) 88);
            var2 = (ml) (Object) ((nf) this).field_i.a(0);
        }
        if (param0 != -96) {
            return;
        }
        ((nf) this).field_Kb.c(param0 + 91);
        ((nf) this).field_r.c(-126);
    }

    final void b(int param0, boolean param1) {
        Object var4 = null;
        int[] var4_array = null;
        int var4_int = 0;
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
        int var16 = 0;
        jd var17 = null;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 649860712) {
            break L0;
          } else {
            ((nf) this).field_Jb = null;
            break L0;
          }
        }
        L1: {
          var17 = new jd(new int[2]);
          ((nf) this).field_O = ((nf) this).field_xb;
          if (((nf) this).field_O == 9) {
            ((nf) this).field_O = dh.a(((nf) this).field_Q, true, 8);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ed.field_Cb == -1) {
            break L2;
          } else {
            ((nf) this).field_O = ed.field_Cb;
            break L2;
          }
        }
        L3: {
          L4: {
            if (!param1) {
              L5: {
                if (((nf) this).field_O != 8) {
                  ((nf) this).field_y = 1920;
                  ((nf) this).field_H = 960;
                  break L5;
                } else {
                  ((nf) this).field_y = 3840;
                  ((nf) this).field_H = 480;
                  break L5;
                }
              }
              L6: {
                ((nf) this).field_Hb = ((nf) this).field_H / 2;
                ((nf) this).field_hb = ((nf) this).field_y / 2;
                if (null == mn.field_y) {
                  break L6;
                } else {
                  if (((nf) this).field_y != mn.field_y.field_g) {
                    break L6;
                  } else {
                    if (mn.field_y.field_k == ((nf) this).field_H) {
                      var16 = 0;
                      var4_int = var16;
                      L7: while (true) {
                        if (~mn.field_y.field_m.length >= ~var16) {
                          break L4;
                        } else {
                          mn.field_y.field_m[var16] = (byte) 0;
                          var16++;
                          continue L7;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                }
              }
              mn.field_y = new ll(((nf) this).field_y, ((nf) this).field_H, gg.field_c);
              if (null == go.field_j) {
                break L3;
              } else {
                mn.field_y.field_l = go.field_j[8 * ((nf) this).field_O].field_l;
                break L3;
              }
            } else {
              L8: {
                ((nf) this).field_Hb = ((nf) this).field_H / 2;
                ((nf) this).field_hb = ((nf) this).field_y / 2;
                if (null == mn.field_y) {
                  break L8;
                } else {
                  if (((nf) this).field_y != mn.field_y.field_g) {
                    break L8;
                  } else {
                    if (mn.field_y.field_k == ((nf) this).field_H) {
                      var4_int = 0;
                      L9: while (true) {
                        if (~mn.field_y.field_m.length >= ~var4_int) {
                          break L4;
                        } else {
                          mn.field_y.field_m[var4_int] = (byte) 0;
                          var4_int++;
                          continue L9;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
              }
              mn.field_y = new ll(((nf) this).field_y, ((nf) this).field_H, gg.field_c);
              if (null == go.field_j) {
                break L3;
              } else {
                mn.field_y.field_l = go.field_j[8 * ((nf) this).field_O].field_l;
                break L3;
              }
            }
          }
          if (go.field_j != null) {
            mn.field_y.field_l = go.field_j[((nf) this).field_O * 8].field_l;
            break L3;
          } else {
            break L3;
          }
        }
        L10: {
          var4 = null;
          ((nf) this).field_w = 320;
          var5 = ((nf) this).field_O;
          if (var5 == 0) {
            var4_array = this.a(param0 ^ 649860704, var17);
            break L10;
          } else {
            L11: {
              if (var5 != 1) {
                if (var5 == 2) {
                  var4_array = this.b((byte) 34, var17);
                  break L10;
                } else {
                  if (var5 == 3) {
                    int discarded$4 = -12260;
                    var4_array = this.a(var17);
                    break L10;
                  } else {
                    if (var5 != 4) {
                      if (var5 == 5) {
                        int discarded$5 = -30390;
                        var4_array = this.b(var17);
                        break L10;
                      } else {
                        if (var5 != 6) {
                          if (var5 == 7) {
                            var4_array = this.d(-22070, var17);
                            break L10;
                          } else {
                            if (var5 != 8) {
                              break L11;
                            } else {
                              var4_array = this.b(0, var17);
                              break L10;
                            }
                          }
                        } else {
                          var4_array = this.c(var17, 32);
                          break L10;
                        }
                      }
                    } else {
                      var4_array = this.c(param0 ^ 649860713, var17);
                      break L10;
                    }
                  }
                }
              } else {
                break L11;
              }
            }
            var4_array = this.a((byte) -70, var17);
            break L10;
          }
        }
        L12: {
          if (var4_array == null) {
            break L12;
          } else {
            L13: {
              System.gc();
              ((nf) this).field_V = new ll(((nf) this).field_y, ((nf) this).field_H, gg.field_c);
              if (ti.field_I != null) {
                ((nf) this).field_V.field_l = ti.field_I[((nf) this).field_O].field_l;
                break L13;
              } else {
                break L13;
              }
            }
            this.a(0, 117, mn.field_y, 0, ((nf) this).field_V);
            this.a(var4_array, var17, (byte) -121);
            this.a(0, 113, ((nf) this).field_V, 0, mn.field_y);
            int discarded$6 = 5;
            this.b();
            break L12;
          }
        }
        ((nf) this).field_Jb = new ll(((nf) this).field_hb, ((nf) this).field_Hb, gg.field_c);
        ((nf) this).field_Jb.field_l = ((nf) this).field_V.field_l;
        int discarded$7 = -126;
        this.a(0, ((nf) this).field_Jb, ((nf) this).field_V, 0);
        var5 = 0;
        var6 = 0;
        L14: while (true) {
          if (((nf) this).field_q <= var6) {
            L15: {
              if (var5 != 0) {
                var6 = ((nf) this).field_V.field_l.length;
                ((nf) this).field_pb = new int[var6];
                var7 = 0;
                L16: while (true) {
                  if (~var6 >= ~var7) {
                    break L15;
                  } else {
                    var8 = ((nf) this).field_V.field_l[var7];
                    var9 = var8 >> 16 & 255;
                    var10 = (65280 & var8) >> 8;
                    var11 = var8 & 255;
                    var12 = (var10 + var9) / 2;
                    var13 = (var11 + var9) / 2;
                    var14 = (var10 - -var11) / 2;
                    ((nf) this).field_pb[var7] = (var12 << 16) - -(var13 << 8) - -var14;
                    var7++;
                    continue L16;
                  }
                }
              } else {
                ((nf) this).field_pb = null;
                break L15;
              }
            }
            System.gc();
            return;
          } else {
            L17: {
              if (((nf) this).field_x[var6] == 9) {
                var5 = 1;
                break L17;
              } else {
                break L17;
              }
            }
            var6++;
            continue L14;
          }
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        if (param1 != -1) {
            this.o((byte) -114);
        }
        ((nf) this).field_M = param0 ? true : false;
        ((nf) this).field_eb = param2 ? true : false;
    }

    private final int[] b(byte param0, jd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[][] var6_array = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var8_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var15 = null;
        int[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[][] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[][] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var25 = null;
        int[] var26 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int[] stackIn_86_0 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_85_0 = null;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var24 = new int[7];
            var21 = var24;
            var18 = var21;
            var15 = var18;
            var4 = var15;
            ((nf) this).field_w = -320;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var24.length - 1) {
                var4[-1 + var24.length] = var24[0];
                var5 = uj.a(param1, -4 + var24.length, (byte) -80) + 2;
                var4[var5] = -100 + ((nf) this).field_H - uj.a(param1, 250, (byte) -82);
                var4[var5 - 1] = (var24[var5] + var4[-1 + var5]) / 2;
                var4[var5 - -1] = (var24[var5] + var4[1 + var5]) / 2;
                L2: while (true) {
                  if (var4.length >= ((nf) this).field_y) {
                    var5 = 0;
                    L3: while (true) {
                      if (~var4.length >= ~var5) {
                        var25 = new int[6][7];
                        var22 = var25;
                        var19 = var22;
                        var16 = var19;
                        var6_array = var16;
                        var5 = 0;
                        L4: while (true) {
                          if (~(-1 + var25[0].length) >= ~var5) {
                            var25[0][-1 + var25[0].length] = var25[0][0];
                            var25[1][-1 + var25[0].length] = var25[1][0];
                            var25[2][var25[0].length - 1] = var25[2][0];
                            var25[3][var25[0].length - 1] = var25[3][0];
                            var25[4][var25[0].length + -1] = var25[4][0];
                            var25[5][var25[0].length + -1] = var25[5][0];
                            var7 = 0;
                            L5: while (true) {
                              if (var7 >= 6) {
                                var7 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var8 >= ((nf) this).field_y) {
                                    var7 = 0;
                                    var8 = 0;
                                    L7: while (true) {
                                      if (((nf) this).field_y <= var8) {
                                        stackOut_85_0 = (int[]) var4;
                                        stackIn_86_0 = stackOut_85_0;
                                        break L0;
                                      } else {
                                        var7 = var8;
                                        var9 = var25[0].length * var8 / ((nf) this).field_y;
                                        var14 = 0;
                                        var10 = var14;
                                        L8: while (true) {
                                          if (var14 >= ((nf) this).field_H) {
                                            var8++;
                                            continue L7;
                                          } else {
                                            L9: {
                                              var11 = 0;
                                              if (var25[0][var9] <= var25[1][var9]) {
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (var14 > var25[0][var9]) {
                                                    var11++;
                                                    break L10;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                if (var14 > var25[1][var9]) {
                                                  var11++;
                                                  break L9;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            L11: {
                                              if (~var25[3][var9] <= ~var25[2][var9]) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  if (var14 <= var25[2][var9]) {
                                                    break L12;
                                                  } else {
                                                    var11++;
                                                    break L12;
                                                  }
                                                }
                                                if (var25[3][var9] < var14) {
                                                  var11++;
                                                  break L11;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            L13: {
                                              if (var25[5][var9] >= var25[4][var9]) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  if (~var14 < ~var25[4][var9]) {
                                                    var11++;
                                                    break L14;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                                if (var25[5][var9] >= var14) {
                                                  break L13;
                                                } else {
                                                  var11++;
                                                  break L13;
                                                }
                                              }
                                            }
                                            L15: {
                                              if (var11 % 2 == 1) {
                                                mn.field_y.field_m[var7] = (byte) 0;
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                            var7 = var7 + ((nf) this).field_y;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var9 = var8 * var25[0].length / ((nf) this).field_y;
                                    var7 = var8;
                                    var10 = 0;
                                    L16: while (true) {
                                      if (~var10 <= ~((nf) this).field_H) {
                                        var8++;
                                        continue L6;
                                      } else {
                                        L17: {
                                          var11 = 0;
                                          if (~var10 >= ~var25[0][var9]) {
                                            break L17;
                                          } else {
                                            var11++;
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          if (~var10 < ~var25[1][var9]) {
                                            var11++;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          if (~var25[2][var9] > ~var10) {
                                            var11++;
                                            break L19;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (var10 <= var25[3][var9]) {
                                            break L20;
                                          } else {
                                            var11++;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (var25[4][var9] >= var10) {
                                            break L21;
                                          } else {
                                            var11++;
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          if (~var10 >= ~var25[5][var9]) {
                                            break L22;
                                          } else {
                                            var11++;
                                            break L22;
                                          }
                                        }
                                        L23: {
                                          if (0 != var11 % 2) {
                                            break L23;
                                          } else {
                                            if (var11 > 0) {
                                              mn.field_y.field_m[var7] = (byte) -5;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        var7 = var7 + ((nf) this).field_y;
                                        var10++;
                                        continue L16;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L24: while (true) {
                                  if (~var25[var7].length <= ~((nf) this).field_y) {
                                    var7++;
                                    continue L5;
                                  } else {
                                    var26 = new int[-2 + (var25[var7].length * 2 - -1)];
                                    var23 = var26;
                                    var20 = var23;
                                    var17 = var20;
                                    var8_ref_int__ = var17;
                                    var8_ref_int__[0] = var25[var7][0];
                                    var5 = 1;
                                    L25: while (true) {
                                      if (~var5 <= ~var25[var7].length) {
                                        var6_array[var7] = var26;
                                        continue L24;
                                      } else {
                                        L26: {
                                          var3_int = ((nf) this).field_H / var25[var7].length;
                                          stackOut_27_0 = (int[]) var8_ref_int__;
                                          stackOut_27_1 = var5 * 2 + -1;
                                          stackOut_27_2 = -(var3_int / 2);
                                          stackOut_27_3 = (var25[var7][-1 + var5] + var25[var7][var5]) / 2;
                                          stackIn_29_0 = stackOut_27_0;
                                          stackIn_29_1 = stackOut_27_1;
                                          stackIn_29_2 = stackOut_27_2;
                                          stackIn_29_3 = stackOut_27_3;
                                          stackIn_28_0 = stackOut_27_0;
                                          stackIn_28_1 = stackOut_27_1;
                                          stackIn_28_2 = stackOut_27_2;
                                          stackIn_28_3 = stackOut_27_3;
                                          if (var3_int != 0) {
                                            stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                                            stackOut_29_1 = stackIn_29_1;
                                            stackOut_29_2 = stackIn_29_2;
                                            stackOut_29_3 = stackIn_29_3;
                                            stackOut_29_4 = uj.a(param1, var3_int, (byte) -83);
                                            stackIn_30_0 = stackOut_29_0;
                                            stackIn_30_1 = stackOut_29_1;
                                            stackIn_30_2 = stackOut_29_2;
                                            stackIn_30_3 = stackOut_29_3;
                                            stackIn_30_4 = stackOut_29_4;
                                            break L26;
                                          } else {
                                            stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                                            stackOut_28_1 = stackIn_28_1;
                                            stackOut_28_2 = stackIn_28_2;
                                            stackOut_28_3 = stackIn_28_3;
                                            stackOut_28_4 = 0;
                                            stackIn_30_0 = stackOut_28_0;
                                            stackIn_30_1 = stackOut_28_1;
                                            stackIn_30_2 = stackOut_28_2;
                                            stackIn_30_3 = stackOut_28_3;
                                            stackIn_30_4 = stackOut_28_4;
                                            break L26;
                                          }
                                        }
                                        stackIn_30_0[stackIn_30_1] = stackIn_30_2 + (stackIn_30_3 - -stackIn_30_4);
                                        var8_ref_int__[2 * var5] = var25[var7][var5];
                                        var5++;
                                        continue L25;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var25[0][var5] = ((nf) this).field_H - 250 + -uj.a(param1, ((nf) this).field_H + -300, (byte) -73);
                            var25[1][var5] = -200 + (((nf) this).field_H + -uj.a(param1, ((nf) this).field_H + -250, (byte) -30));
                            var25[2][var5] = -150 + (((nf) this).field_H - uj.a(param1, -200 + ((nf) this).field_H, (byte) -39));
                            var25[3][var5] = ((nf) this).field_H - 100 - uj.a(param1, -150 + ((nf) this).field_H, (byte) -122);
                            var25[4][var5] = ((nf) this).field_H + -50 + -uj.a(param1, -100 + ((nf) this).field_H, (byte) -54);
                            var25[5][var5] = ((nf) this).field_H + -uj.a(param1, -50 + ((nf) this).field_H, (byte) -117);
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        var6_int = ((nf) this).field_y * var5 / var4.length - -(((nf) this).field_y * var4[var5]);
                        var7 = 0;
                        L27: while (true) {
                          if (var7 >= ((nf) this).field_H - var4[var5]) {
                            var5++;
                            continue L3;
                          } else {
                            mn.field_y.field_m[var6_int] = (byte) -5;
                            var6_int = var6_int + ((nf) this).field_y;
                            var7++;
                            continue L27;
                          }
                        }
                      }
                    }
                  } else {
                    var13 = new int[2 * (var4.length - 1) + 1];
                    var6 = var13;
                    var13[0] = var4[0];
                    var5 = 1;
                    L28: while (true) {
                      if (~var4.length >= ~var5) {
                        var4 = var6;
                        continue L2;
                      } else {
                        L29: {
                          var3_int = ((nf) this).field_H / var4.length;
                          stackOut_8_0 = (int[]) var6;
                          stackOut_8_1 = -1 + 2 * var5;
                          stackOut_8_2 = (var4[-1 + var5] + var4[var5]) / 2;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          if (0 == var3_int) {
                            stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = stackIn_10_2;
                            stackOut_10_3 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            break L29;
                          } else {
                            stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = stackIn_9_2;
                            stackOut_9_3 = uj.a(param1, var3_int, (byte) -81);
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_11_3 = stackOut_9_3;
                            break L29;
                          }
                        }
                        stackIn_11_0[stackIn_11_1] = stackIn_11_2 - (-stackIn_11_3 + var3_int / 2);
                        var13[2 * var5] = var4[var5];
                        var5++;
                        continue L28;
                      }
                    }
                  }
                }
              } else {
                var4[var5] = ((nf) this).field_H / 2 + 150 + -uj.a(param1, -100 + ((nf) this).field_H / 2, (byte) -24);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_87_0 = (RuntimeException) var3;
            stackOut_87_1 = new StringBuilder().append("nf.MB(").append(34).append(',');
            stackIn_89_0 = stackOut_87_0;
            stackIn_89_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param1 == null) {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L30;
            } else {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "{...}";
              stackIn_90_0 = stackOut_88_0;
              stackIn_90_1 = stackOut_88_1;
              stackIn_90_2 = stackOut_88_2;
              break L30;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_90_0, stackIn_90_2 + ')');
        }
        return stackIn_86_0;
    }

    final boolean j(int param0) {
        if (param0 != 39) {
            return true;
        }
        return ((nf) this).field_zb;
    }

    final int a(int param0) {
        if (param0 != -31497) {
            return -27;
        }
        return ((nf) this).field_O;
    }

    final void a(int param0, byte param1) {
        int var3 = 12 % ((-31 - param1) / 48);
        ((nf) this).field_q = param0;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            ((nf) this).field_T = null;
        }
        return ((nf) this).field_D;
    }

    final void q(int param0) {
        ((nf) this).field_ub = false;
        if (param0 != -256) {
            ((nf) this).field_o = null;
        }
    }

    final void a(byte param0, ml param1) {
        try {
            ((nf) this).field_i.b((pg) (Object) param1, -1);
            if (param0 > -114) {
                ((nf) this).field_f = false;
            }
            ((nf) this).field_B.a((tf) (Object) param1, (long)param1.field_T, (byte) 110);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nf.KD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, ll param3, qb param4) {
        RuntimeException var6 = null;
        byte[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        byte[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        byte[] var30 = null;
        int[] var31 = null;
        byte[] var32 = null;
        int[] var33 = null;
        byte[] var34 = null;
        int[] var35 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var27 = new byte[param4.field_A.length];
            var34 = var27;
            var32 = var34;
            var30 = var32;
            var28 = var30;
            var6_array = var28;
            param2 = param2 >> 1;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param4.field_A.length) {
                L2: {
                  param0 = param0 >> 1;
                  var7 = param4.field_q >> 1;
                  var8 = param4.field_y >> 1;
                  if (param1 <= -55) {
                    break L2;
                  } else {
                    boolean discarded$1 = ((nf) this).a((ml) null, 126, -2, -112, 24);
                    break L2;
                  }
                }
                L3: {
                  param2 = param2 + param4.field_o / 2;
                  param0 = param0 + param4.field_x / 2;
                  var9 = 0;
                  var10 = 0;
                  var11 = ((nf) this).field_hb;
                  var12 = ((nf) this).field_Hb;
                  if (~param0 > ~var9) {
                    stackOut_8_0 = var9 - param0 << 1;
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (~var11 <= ~(param0 - -var7)) {
                    stackOut_11_0 = -2 + param4.field_q;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = -2 + (var11 - param0 << 1);
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  if (param2 < var10) {
                    stackOut_14_0 = var10 - param2 << 1;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                L6: {
                  var15 = stackIn_15_0;
                  if (var12 >= param2 + var8) {
                    stackOut_17_0 = param4.field_y + -2;
                    stackIn_18_0 = stackOut_17_0;
                    break L6;
                  } else {
                    stackOut_16_0 = (-param2 + var12 << 1) - 2;
                    stackIn_18_0 = stackOut_16_0;
                    break L6;
                  }
                }
                var16 = stackIn_18_0;
                var35 = new int[4];
                var33 = var35;
                var31 = var33;
                var29 = var31;
                var17 = var29;
                var18 = var15;
                L7: while (true) {
                  if (var18 > var16) {
                    break L0;
                  } else {
                    var19 = var13;
                    L8: while (true) {
                      if (var19 > var14) {
                        var18 += 2;
                        continue L7;
                      } else {
                        var20 = var19 + param4.field_q * var18;
                        var21 = (var19 >> 1) - -param0 + (param2 - -(var18 >> 1)) * ((nf) this).field_hb;
                        var17[0] = param3.field_l[dg.a(255, (int) var34[var20])];
                        var17[1] = param3.field_l[dg.a((int) var6_array[1 + var20], 255)];
                        var17[2] = param3.field_l[dg.a((int) var6_array[var20 - -param4.field_q], 255)];
                        var17[3] = param3.field_l[dg.a(255, (int) var6_array[1 + var20])];
                        var22 = 0;
                        var23 = 0;
                        var24 = 0;
                        var25 = 0;
                        L9: while (true) {
                          if (var25 >= 4) {
                            param3.field_m[var21] = (byte)hk.field_p[((nf) this).field_O].a(fj.b(fj.b(var23 >> 2 << 8, var22 >> 2 << 16), var24 >> 2), 510);
                            var19 += 2;
                            continue L8;
                          } else {
                            L10: {
                              if (var35[var25] != 0) {
                                break L10;
                              } else {
                                var17[var25] = param3.field_l[dg.a(255, (int) param3.field_m[var21])];
                                break L10;
                              }
                            }
                            var22 = var22 + (var35[var25] >> 16);
                            var24 = var24 + (255 & var35[var25]);
                            var23 = var23 + (var35[var25] >> 8 & 255);
                            var25++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var27[var7] = (byte)hk.field_p[((nf) this).field_O].a(param4.field_A[var7], 510);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("nf.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          L12: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        ml var4 = ((nf) this).a(param2, param1);
        if (var4 == null) {
            return false;
        }
        return this.a(param0, var4, param1);
    }

    final int n(byte param0) {
        if (param0 != -75) {
            boolean discarded$0 = ((nf) this).d(-46);
        }
        return ((nf) this).field_jb;
    }

    final void e(boolean param0) {
        ((nf) this).field_D = param0 ? true : false;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(param0 != 153)) {
            return ((nf) this).a(39, param1, -770226943);
        }
        if (param0 < 0) {
            return 0;
        }
        if (param1 < 0) {
            return 0;
        }
        int var4 = 0;
        if (param2 != -770226943) {
            return -40;
        }
        while (var4 < 16) {
            if (!(param0 != ((nf) this).field_v[param1][var4])) {
                return ((nf) this).field_vb[param1][var4];
            }
            var4++;
        }
        return 0;
    }

    private final int[] b(int param0, jd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7_int = 0;
        ll var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int[] stackIn_47_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_46_0 = null;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            ((nf) this).field_w = -320;
            var29 = new int[30];
            var25 = var29;
            var21 = var25;
            var17 = var21;
            var16 = var17;
            var30 = var16;
            var26 = var30;
            var22 = var26;
            var18 = var22;
            var4 = var18;
            var5 = 0;
            L1: while (true) {
              if (~(-1 + var29.length) >= ~var5) {
                var30[0] = 0;
                var4[var30.length + -1] = var30[0];
                L2: while (true) {
                  if (~var4.length <= ~(((nf) this).field_y / 32)) {
                    this.a(var4, (byte) -113);
                    var5 = 0;
                    var6 = 0;
                    L3: while (true) {
                      var5++;
                      var7_int = uj.a(param1, ((nf) this).field_y / 2, (byte) -94) - -(((nf) this).field_y / 4);
                      var8 = 2;
                      var9 = ((nf) this).field_y * var8 + var7_int;
                      L4: while (true) {
                        L5: {
                          if (~((nf) this).field_H >= ~var8) {
                            break L5;
                          } else {
                            if (mn.field_y.field_m[var9] != 0) {
                              break L5;
                            } else {
                              L6: {
                                var7_int = var7_int + (-1 + var5 % 3);
                                var8++;
                                var9 = var9 + ((nf) this).field_y;
                                var9 = var9 + (var5 % 3 - 1);
                                if (0 <= var7_int) {
                                  break L6;
                                } else {
                                  var9 = var9 + ((nf) this).field_y;
                                  var7_int = var7_int + ((nf) this).field_y;
                                  break L6;
                                }
                              }
                              if (~var7_int > ~((nf) this).field_y) {
                                continue L4;
                              } else {
                                var7_int = var7_int - ((nf) this).field_y;
                                var9 = var9 - ((nf) this).field_y;
                                continue L4;
                              }
                            }
                          }
                        }
                        L7: {
                          var10 = (((nf) this).field_H - var8) * 64 / ((nf) this).field_H - -uj.a(param1, 16, (byte) -37);
                          if (~((nf) this).field_H >= ~var8) {
                            break L7;
                          } else {
                            if (~(32 + var10) <= ~var8) {
                              break L7;
                            } else {
                              if (~var10 <= ~var7_int) {
                                break L7;
                              } else {
                                if (var7_int < ((nf) this).field_y - var10) {
                                  o.a(mn.field_y, (byte) -47, var10, (byte) -5, var8, var7_int, (nf) this);
                                  var6 = var8;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        L8: {
                          if (var8 < 32 + var10) {
                            var6 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (var6 > 128) {
                          continue L3;
                        } else {
                          L9: {
                            System.gc();
                            ((nf) this).field_V = new ll(((nf) this).field_y, ((nf) this).field_H, gg.field_c);
                            if (ti.field_I != null) {
                              ((nf) this).field_V.field_l = ti.field_I[((nf) this).field_O].field_l;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          this.a(0, 120, mn.field_y, 0, ((nf) this).field_V);
                          var31 = new int[1000];
                          var32 = new int[1000];
                          var10 = param0;
                          var5 = 0;
                          L10: while (true) {
                            if (var5 >= 10) {
                              this.a(0, 114, ((nf) this).field_V, 0, mn.field_y);
                              stackOut_46_0 = (int[]) var4;
                              stackIn_47_0 = stackOut_46_0;
                              break L0;
                            } else {
                              var7 = go.field_j[4 + (uj.a(param1, 4, (byte) -124) - -(((nf) this).field_O * 8))];
                              var11 = uj.a(param1, ((nf) this).field_y + -256, (byte) -69);
                              var12 = uj.a(param1, -256 + ((nf) this).field_H, (byte) -86);
                              var13 = 1;
                              var14 = 0;
                              L11: while (true) {
                                if (var14 >= var10) {
                                  L12: {
                                    if (var13 == 0) {
                                      break L12;
                                    } else {
                                      var31[var10] = var11;
                                      var32[var10] = var12;
                                      var10++;
                                      this.a(false, var11, ((nf) this).field_V, false, var12, var7.b());
                                      break L12;
                                    }
                                  }
                                  var5++;
                                  continue L10;
                                } else {
                                  L13: {
                                    if (Math.abs(var31[var14] + -var11) >= 192) {
                                      break L13;
                                    } else {
                                      if (192 > Math.abs(var32[var14] - var12)) {
                                        var13 = 0;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var14++;
                                  continue L11;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var6_ref_int__ = new int[1 + (2 * var4.length - 2)];
                    var6_ref_int__[0] = var4[0];
                    var5 = 1;
                    L14: while (true) {
                      if (~var4.length >= ~var5) {
                        var4 = var6_ref_int__;
                        continue L2;
                      } else {
                        L15: {
                          var3_int = ((nf) this).field_H / var4.length;
                          stackOut_8_0 = (int[]) var6_ref_int__;
                          stackOut_8_1 = 2 * var5 + -1;
                          stackOut_8_2 = -(var3_int / 2);
                          stackOut_8_3 = (var4[-1 + var5] - -var4[var5]) / 2;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_10_3 = stackOut_8_3;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          stackIn_9_3 = stackOut_8_3;
                          if (var3_int != 0) {
                            stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = stackIn_10_2;
                            stackOut_10_3 = stackIn_10_3;
                            stackOut_10_4 = param1.a(var3_int, (byte) -116);
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            stackIn_11_4 = stackOut_10_4;
                            break L15;
                          } else {
                            stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = stackIn_9_2;
                            stackOut_9_3 = stackIn_9_3;
                            stackOut_9_4 = 0;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_11_3 = stackOut_9_3;
                            stackIn_11_4 = stackOut_9_4;
                            break L15;
                          }
                        }
                        stackIn_11_0[stackIn_11_1] = stackIn_11_2 + (stackIn_11_3 + stackIn_11_4);
                        var6_ref_int__[var5 * 2] = var4[var5];
                        var5++;
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                var16[var5] = 10 * ((nf) this).field_H / 8 - uj.a(param1, ((nf) this).field_H, (byte) -65);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var3;
            stackOut_48_1 = new StringBuilder().append("nf.T(").append(param0).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L16;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ')');
        }
        return stackIn_47_0;
    }

    final void p(int param0) {
        if (param0 <= 40) {
            ((nf) this).a(-94, 10, (byte) 54, 18);
        }
        ((nf) this).b(649860712, false);
    }

    private final void a(int param0, ll param1, ll param2, int param3) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var25 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            param0 = param0 >> 1;
            param3 = param3 >> 1;
            var6_int = param2.field_h >> 1;
            param3 = param3 + param2.field_j / 2;
            var7 = param2.field_c >> 1;
            param0 = param0 + param2.field_f / 2;
            var8 = 0;
            var9 = 0;
            var10 = ((nf) this).field_hb;
            var11 = ((nf) this).field_Hb;
            L1: {
              if (param3 < var8) {
                stackOut_5_0 = -param3 + var8 << 1;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_6_0;
              if (~var10 > ~(param3 - -var6_int)) {
                stackOut_8_0 = -2 + (var10 + -param3 << 1);
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -2 + param2.field_h;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var13 = stackIn_9_0;
              if (~var9 >= ~param0) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = -param0 + var9 << 1;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var14 = stackIn_12_0;
              if (~(var7 + param0) < ~var11) {
                stackOut_14_0 = (-param0 + var11 << 1) + -2;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = param2.field_c - 2;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            var15 = stackIn_15_0;
            var29 = new int[4];
            var28 = var29;
            var27 = var28;
            var26 = var27;
            var16 = var26;
            var17 = var14;
            L5: while (true) {
              if (var15 < var17) {
                break L0;
              } else {
                var18 = var12;
                L6: while (true) {
                  if (~var13 > ~var18) {
                    var17 += 2;
                    continue L5;
                  } else {
                    var19 = var18 + param2.field_h * var17;
                    var16[0] = param2.field_l[dg.a((int) param2.field_m[var19], 255)];
                    var20 = ((nf) this).field_hb * ((var17 >> 1) + param0) - (-(var18 >> 1) + -param3);
                    var16[1] = param2.field_l[dg.a(255, (int) param2.field_m[1 + var19])];
                    var16[2] = param2.field_l[dg.a(255, (int) param2.field_m[param2.field_h + var19])];
                    var16[3] = param2.field_l[dg.a(255, (int) param2.field_m[1 + var19])];
                    var21 = 0;
                    var22 = 0;
                    var23 = 0;
                    var24 = 0;
                    L7: while (true) {
                      if (var24 >= 4) {
                        param1.field_m[var20] = (byte)hk.field_p[((nf) this).field_O].a(fj.b(var23 >> 2, fj.b(var21 >> 2 << 16, var22 >> 2 << 8)), 510);
                        var18 += 2;
                        continue L6;
                      } else {
                        L8: {
                          if (var29[var24] != 0) {
                            break L8;
                          } else {
                            var16[var24] = param1.field_l[dg.a((int) param1.field_m[var20], 255)];
                            break L8;
                          }
                        }
                        var23 = var23 + (var29[var24] & 255);
                        var22 = var22 + ((var29[var24] & 65305) >> 8);
                        var21 = var21 + (var29[var24] >> 16);
                        var24++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("nf.GA(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param3 + ',' + -126 + ')');
        }
    }

    final void e(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 0) {
          return;
        } else {
          if (param0 >= ((nf) this).field_q) {
            return;
          } else {
            var7 = ((nf) this).a(param0, true);
            if (var7 == null) {
              return;
            } else {
              if (var7.field_ib <= 20) {
                return;
              } else {
                L0: {
                  if (!param1) {
                    break L0;
                  } else {
                    ((nf) this).field_Q = 81;
                    break L0;
                  }
                }
                L1: {
                  var4 = 100;
                  if (((nf) this).field_x[param0] == 4) {
                    var4 = 5 * (((nf) this).field_X[param0] / 5) + 5;
                    if (0 >= ((nf) this).field_X[param0]) {
                      break L1;
                    } else {
                      if (5 + ((nf) this).field_X[param0] != var4) {
                        break L1;
                      } else {
                        var4 = ((nf) this).field_X[param0];
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                if (~((nf) this).field_X[param0] <= ~var4) {
                  return;
                } else {
                  L2: {
                    L3: {
                      if (9 == ((nf) this).field_x[param0]) {
                        L4: {
                          stackOut_31_0 = this;
                          stackOut_31_1 = param0;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_33_1 = stackOut_31_1;
                          stackIn_32_0 = stackOut_31_0;
                          stackIn_32_1 = stackOut_31_1;
                          if (param1) {
                            stackOut_33_0 = this;
                            stackOut_33_1 = stackIn_33_1;
                            stackOut_33_2 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            stackIn_34_2 = stackOut_33_2;
                            break L4;
                          } else {
                            stackOut_32_0 = this;
                            stackOut_32_1 = stackIn_32_1;
                            stackOut_32_2 = 1;
                            stackIn_34_0 = stackOut_32_0;
                            stackIn_34_1 = stackOut_32_1;
                            stackIn_34_2 = stackOut_32_2;
                            break L4;
                          }
                        }
                        ml dupTemp$3 = ((nf) this).a(stackIn_34_1, stackIn_34_2 != 0);
                        dupTemp$3.field_ib = dupTemp$3.field_ib - 100;
                        var5 = 0;
                        L5: while (true) {
                          if (~((nf) this).field_q >= ~var5) {
                            break L3;
                          } else {
                            ((nf) this).field_X[var5] = 0;
                            var5++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          ml dupTemp$4 = ((nf) this).a(param0, true);
                          dupTemp$4.field_ib = dupTemp$4.field_ib - 20;
                          if (((nf) this).field_x[param0] != 4) {
                            ((nf) this).field_X[param0] = ((nf) this).field_X[param0] + 20;
                            break L6;
                          } else {
                            ((nf) this).field_X[param0] = ((nf) this).field_X[param0] + 1;
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            if (((nf) this).field_x[param0] == 4) {
                              break L8;
                            } else {
                              if (((nf) this).field_X[param0] == 20) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((nf) this).field_Ab[param0] = var7.field_lb;
                          ((nf) this).field_o[param0] = var7.field_db;
                          break L7;
                        }
                        if (((nf) this).field_sb == null) {
                          break L2;
                        } else {
                          if (((nf) this).field_sb[ah.field_f[((nf) this).field_x[param0]]] == null) {
                            break L3;
                          } else {
                            fk discarded$5 = ti.a((byte) -30, to.field_r[ah.field_f[((nf) this).field_x[param0]]], ((nf) this).field_sb[ah.field_f[((nf) this).field_x[param0]]]);
                            break L2;
                          }
                        }
                      }
                    }
                    break L2;
                  }
                  return;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(0 <= param0)) {
            return;
        }
        if (0 > param1) {
            return;
        }
        int var4 = 0;
        if (!param2) {
            boolean discarded$0 = ((nf) this).a(true, (ml) null, 10, -31, 10);
        }
        while (var4 < 16) {
            if (~param0 == ~((nf) this).field_v[param1][var4]) {
                if (-1 == mj.field_p) {
                    ((nf) this).field_vb[param1][var4] = ((nf) this).field_vb[param1][var4] + 1;
                }
                ((nf) this).field_lb[param1][var4] = 0;
                break;
            }
            var4++;
        }
    }

    final boolean a(ml param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_3_0 = false;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_21_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_28_0 = 0;
        boolean stackIn_31_0 = false;
        boolean stackIn_34_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_69_0 = false;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_24_0 = false;
        boolean stackOut_37_0 = false;
        boolean stackOut_68_0 = false;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        boolean stackOut_64_0 = false;
        boolean stackOut_33_0 = false;
        boolean stackOut_30_0 = false;
        int stackOut_27_0 = 0;
        boolean stackOut_20_0 = false;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        try {
          L0: {
            if (param4 == 153) {
              stackOut_2_0 = ((nf) this).a(param0, param1, param2, param3, 39);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param4 != 151) {
                L1: {
                  if (!((nf) this).field_f) {
                    break L1;
                  } else {
                    if (!((nf) this).d((byte) 66, param4)) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (2 == param4) {
                    break L2;
                  } else {
                    if (param4 == 81) {
                      break L2;
                    } else {
                      if (91 == param4) {
                        break L2;
                      } else {
                        if (param4 == 31) {
                          break L2;
                        } else {
                          if (param4 == 60) {
                            break L2;
                          } else {
                            if (param4 == 55) {
                              break L2;
                            } else {
                              if (param4 == 114) {
                                break L2;
                              } else {
                                if (30 == param4) {
                                  stackOut_24_0 = ((nf) this).a(param2, param0, param3 + 31011, param1);
                                  stackIn_25_0 = stackOut_24_0;
                                  return stackIn_25_0;
                                } else {
                                  if (param3 == -129) {
                                    if (param4 != 78) {
                                      if (param4 != 4) {
                                        if (param4 == 150) {
                                          stackOut_37_0 = ((nf) this).a(param2, param1, (byte) -75, param0);
                                          stackIn_38_0 = stackOut_37_0;
                                          return stackIn_38_0;
                                        } else {
                                          L3: {
                                            if (param4 == 56) {
                                              break L3;
                                            } else {
                                              if (57 == param4) {
                                                break L3;
                                              } else {
                                                if (param4 == 32) {
                                                  break L3;
                                                } else {
                                                  if (param4 == 33) {
                                                    break L3;
                                                  } else {
                                                    if (param4 == 42) {
                                                      break L3;
                                                    } else {
                                                      if (param4 == 17) {
                                                        break L3;
                                                      } else {
                                                        if (param4 == 23) {
                                                          break L3;
                                                        } else {
                                                          if (param4 == 59) {
                                                            break L3;
                                                          } else {
                                                            if (param4 == 47) {
                                                              break L3;
                                                            } else {
                                                              if (param4 == 65) {
                                                                break L3;
                                                              } else {
                                                                if (param4 == 67) {
                                                                  break L3;
                                                                } else {
                                                                  if (64 == param4) {
                                                                    break L3;
                                                                  } else {
                                                                    if (44 == param4) {
                                                                      break L3;
                                                                    } else {
                                                                      if (77 == param4) {
                                                                        break L3;
                                                                      } else {
                                                                        if (param4 == 76) {
                                                                          break L3;
                                                                        } else {
                                                                          if (param4 == 6) {
                                                                            break L3;
                                                                          } else {
                                                                            if (param4 == 79) {
                                                                              break L3;
                                                                            } else {
                                                                              if (param4 == 98) {
                                                                                break L3;
                                                                              } else {
                                                                                if (param4 == 90) {
                                                                                  break L3;
                                                                                } else {
                                                                                  if (107 == param4) {
                                                                                    break L3;
                                                                                  } else {
                                                                                    if (param4 == 104) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      if (param4 == 92) {
                                                                                        break L3;
                                                                                      } else {
                                                                                        if (param4 == 112) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          if (118 == param4) {
                                                                                            break L3;
                                                                                          } else {
                                                                                            if (9 == param4) {
                                                                                              stackOut_68_0 = ((nf) this).a(false, param2, param1);
                                                                                              stackIn_69_0 = stackOut_68_0;
                                                                                              return stackIn_69_0;
                                                                                            } else {
                                                                                              if (5 != ti.field_N) {
                                                                                                if (param4 != 11) {
                                                                                                  stackOut_79_0 = 1;
                                                                                                  stackIn_80_0 = stackOut_79_0;
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  stackOut_77_0 = 0;
                                                                                                  stackIn_78_0 = stackOut_77_0;
                                                                                                  return stackIn_78_0 != 0;
                                                                                                }
                                                                                              } else {
                                                                                                L4: {
                                                                                                  L5: {
                                                                                                    if (!((nf) this).a(false, param2, param1)) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if (!((nf) this).a(false, param0.field_lb, -32 + (param0.field_db - param0.field_Y))) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        stackOut_73_0 = 1;
                                                                                                        stackIn_75_0 = stackOut_73_0;
                                                                                                        break L4;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  stackOut_74_0 = 0;
                                                                                                  stackIn_75_0 = stackOut_74_0;
                                                                                                  break L4;
                                                                                                }
                                                                                                return stackIn_75_0 != 0;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          stackOut_64_0 = ((nf) this).a(false, param0, param4, param1, param2);
                                          stackIn_65_0 = stackOut_64_0;
                                          return stackIn_65_0;
                                        }
                                      } else {
                                        stackOut_33_0 = ((nf) this).b(param2, param0, -16, param1);
                                        stackIn_34_0 = stackOut_33_0;
                                        return stackIn_34_0;
                                      }
                                    } else {
                                      stackOut_30_0 = ((nf) this).a(param0, param1, param2, -5);
                                      stackIn_31_0 = stackOut_30_0;
                                      return stackIn_31_0;
                                    }
                                  } else {
                                    stackOut_27_0 = 0;
                                    stackIn_28_0 = stackOut_27_0;
                                    return stackIn_28_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_20_0 = ((nf) this).a(param4, param1, param0, (byte) 74, param2);
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_81_0 = (RuntimeException) var6;
            stackOut_81_1 = new StringBuilder().append("nf.HD(");
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L6;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_80_0 != 0;
    }

    final boolean k(int param0) {
        int var2 = 16 % ((param0 - 46) / 48);
        return !((nf) this).field_Db.b(true) ? true : false;
    }

    final void d(int param0, boolean param1) {
        if (!param1) {
            ((nf) this).a((byte) -37);
        }
        ((nf) this).field_Q = param0;
    }

    private final boolean a(ml param0, qb param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
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
            ((nf) this).a(param0, param2 + param2);
            var6_int = ((nf) this).b(param3, 2, param4, param1) ? 1 : 0;
            ((nf) this).a(-62, param0);
            stackOut_0_0 = var6_int;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("nf.A(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0 != 0;
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ml var10 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        if (!((nf) this).field_ub) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (((nf) this).field_J < 0) {
              break L0;
            } else {
              var10 = ((nf) this).a(((nf) this).field_J, true);
              if (var10 != null) {
                L1: {
                  if (var10.field_ib != 1) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4 = 0;
                var5 = 0;
                var6_ref_ml = (ml) (Object) ((nf) this).field_i.b(12623);
                L2: while (true) {
                  if (var6_ref_ml == null) {
                    L3: {
                      if (16 != var10.field_jb) {
                        break L3;
                      } else {
                        if (var5 <= 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var4 >= 4) {
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    L4: {
                      if (var6_ref_ml.field_jb == 26) {
                        var5++;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var6_ref_ml.field_jb == 30) {
                        var4++;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var6_ref_ml = (ml) (Object) ((nf) this).field_i.a(0);
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L6: {
            ((nf) this).field_E = new int[((nf) this).field_q];
            ((nf) this).field_fb = new int[17];
            var3 = 0;
            if (((nf) this).field_J < 0) {
              break L6;
            } else {
              if (((nf) this).field_d) {
                var4 = ((nf) this).field_J & 1;
                L7: while (true) {
                  if (~var4 <= ~((nf) this).field_q) {
                    break L6;
                  } else {
                    var3++;
                    ((nf) this).field_E[var4] = ((nf) this).field_E[var4] + 1;
                    var4 += 2;
                    continue L7;
                  }
                }
              } else {
                var3++;
                ((nf) this).field_E[((nf) this).field_J] = ((nf) this).field_E[((nf) this).field_J] + 1;
                break L6;
              }
            }
          }
          var4 = 0;
          var5 = 0;
          L8: while (true) {
            if (var5 >= 17) {
              var5 = 0;
              L9: while (true) {
                if (~((nf) this).field_q >= ~var5) {
                  L10: {
                    if (-1 == ((nf) this).field_fb[11]) {
                      break L10;
                    } else {
                      if (((nf) this).field_fb[0] != -1) {
                        break L10;
                      } else {
                        if (((nf) this).field_fb[1] == -1) {
                          ((nf) this).field_fb[11] = -1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    if (((nf) this).field_fb[7] == -1) {
                      break L11;
                    } else {
                      if (((nf) this).field_fb[0] != -1) {
                        break L11;
                      } else {
                        if (((nf) this).field_fb[1] == -1) {
                          ((nf) this).field_fb[7] = -1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  L12: {
                    if (((nf) this).field_fb[13] != ((nf) this).field_fb[12]) {
                      break L12;
                    } else {
                      ((nf) this).field_fb[12] = -1;
                      ((nf) this).field_fb[13] = -1;
                      break L12;
                    }
                  }
                  L13: {
                    if (((nf) this).field_fb[7] == ((nf) this).field_fb[1]) {
                      ((nf) this).field_fb[1] = -1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (((nf) this).field_fb[7] == ((nf) this).field_fb[0]) {
                      ((nf) this).field_fb[0] = -1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    var5 = -1 + ((nf) this).field_q * 2;
                    if (~var5 < ~(-2 + ((nf) this).field_jb / ((nf) this).field_q)) {
                      var5 = -2 + ((nf) this).field_jb / ((nf) this).field_q;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 < 0) {
                      var5 = 0;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var6 = 0;
                  L17: while (true) {
                    if (((nf) this).field_fb.length <= var6) {
                      var6 = 0;
                      L18: while (true) {
                        if (~var6 <= ~((nf) this).field_q) {
                          return;
                        } else {
                          L19: {
                            if (0 >= ((nf) this).field_E[var6]) {
                              break L19;
                            } else {
                              L20: {
                                ((nf) this).field_E[var6] = ((nf) this).field_E[var6] * var5 / var3;
                                if (((nf) this).field_E[var6] == 0) {
                                  ((nf) this).field_E[var6] = 1;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              var7 = 250 * ((nf) this).field_S[var6];
                              if (~var7 >= ~((nf) this).field_m) {
                                break L19;
                              } else {
                                L21: {
                                  var8 = 1 + (var7 + -((nf) this).field_m) / 250;
                                  if (~((nf) this).field_E[var6] <= ~var8) {
                                    break L21;
                                  } else {
                                    var8 = ((nf) this).field_E[var6];
                                    break L21;
                                  }
                                }
                                ((nf) this).field_E[var6] = ((nf) this).field_E[var6] - var8;
                                break L19;
                              }
                            }
                          }
                          var6++;
                          continue L18;
                        }
                      }
                    } else {
                      L22: {
                        var7 = ((nf) this).field_fb[var6];
                        if (var7 == -1) {
                          break L22;
                        } else {
                          L23: {
                            if ((param1 & 1 << var7) != 0) {
                              break L23;
                            } else {
                              ((nf) this).field_E[var7] = ((nf) this).field_E[var7] + 1;
                              break L23;
                            }
                          }
                          var3++;
                          break L22;
                        }
                      }
                      var6++;
                      continue L17;
                    }
                  }
                } else {
                  L24: {
                    L25: {
                      var6 = 0;
                      if (-1 == ((nf) this).field_fb[var6]) {
                        break L25;
                      } else {
                        if (((nf) this).field_K[var5] > ((nf) this).field_K[((nf) this).field_fb[var6]]) {
                          break L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                    if (((nf) this).field_K[var5] >= 1000) {
                      ((nf) this).field_fb[var6] = var5;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L26: {
                    L27: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L27;
                      } else {
                        if (~((nf) this).field_ib[((nf) this).field_fb[var6]] > ~((nf) this).field_ib[var5]) {
                          break L27;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (((nf) this).field_ib[var5] < 100) {
                      break L26;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L26;
                    }
                  }
                  L28: {
                    L29: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L29;
                      } else {
                        if (((nf) this).field_g[var5] <= ((nf) this).field_g[((nf) this).field_fb[var6]]) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (((nf) this).field_g[var5] >= 100) {
                      ((nf) this).field_fb[var6] = var5;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L30: {
                    L31: {
                      var6++;
                      if (-1 == ((nf) this).field_fb[var6]) {
                        break L31;
                      } else {
                        if (((nf) this).field_ob[var5] <= ((nf) this).field_ob[((nf) this).field_fb[var6]]) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                    if (3 >= ((nf) this).field_ob[var5]) {
                      break L30;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L30;
                    }
                  }
                  L32: {
                    L33: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L33;
                      } else {
                        if (~((nf) this).field_U[var5] >= ~((nf) this).field_U[((nf) this).field_fb[var6]]) {
                          break L32;
                        } else {
                          break L33;
                        }
                      }
                    }
                    if (((nf) this).field_U[var5] <= 1) {
                      break L32;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L32;
                    }
                  }
                  L34: {
                    L35: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L35;
                      } else {
                        if (~((nf) this).field_ab[var5] < ~((nf) this).field_ab[((nf) this).field_fb[var6]]) {
                          break L35;
                        } else {
                          break L34;
                        }
                      }
                    }
                    if (((nf) this).field_ab[var5] < 5) {
                      break L34;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L34;
                    }
                  }
                  L36: {
                    L37: {
                      var6++;
                      if (-1 == ((nf) this).field_fb[var6]) {
                        break L37;
                      } else {
                        if (((nf) this).field_Eb[((nf) this).field_fb[var6]] < ((nf) this).field_Eb[var5]) {
                          break L37;
                        } else {
                          break L36;
                        }
                      }
                    }
                    if (((nf) this).field_Eb[var5] > 1) {
                      ((nf) this).field_fb[var6] = var5;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L38: {
                    L39: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L39;
                      } else {
                        if (~((nf) this).field_K[var5] > ~((nf) this).field_K[((nf) this).field_fb[var6]]) {
                          break L39;
                        } else {
                          break L38;
                        }
                      }
                    }
                    if (((nf) this).field_K[var5] > 250) {
                      break L38;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L38;
                    }
                  }
                  L40: {
                    L41: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L41;
                      } else {
                        if (~((nf) this).field_wb[((nf) this).field_fb[var6]] <= ~((nf) this).field_wb[var5]) {
                          break L40;
                        } else {
                          break L41;
                        }
                      }
                    }
                    if (200 <= ((nf) this).field_wb[var5]) {
                      ((nf) this).field_fb[var6] = var5;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L42: {
                    L43: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L43;
                      } else {
                        if (~((nf) this).field_Nb[((nf) this).field_fb[var6]] <= ~((nf) this).field_Nb[var5]) {
                          break L42;
                        } else {
                          break L43;
                        }
                      }
                    }
                    if (((nf) this).field_Nb[var5] >= 100) {
                      ((nf) this).field_fb[var6] = var5;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L44: {
                    L45: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L45;
                      } else {
                        if (~((nf) this).field_T[var5] >= ~((nf) this).field_T[((nf) this).field_fb[var6]]) {
                          break L44;
                        } else {
                          break L45;
                        }
                      }
                    }
                    if (250 > ((nf) this).field_T[var5]) {
                      break L44;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L44;
                    }
                  }
                  L46: {
                    L47: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L47;
                      } else {
                        if (((nf) this).field_n[var5] > ((nf) this).field_n[((nf) this).field_fb[var6]]) {
                          break L47;
                        } else {
                          break L46;
                        }
                      }
                    }
                    if (((nf) this).field_n[var5] >= 5) {
                      ((nf) this).field_fb[var6] = var5;
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  L48: {
                    L49: {
                      var6++;
                      if (-1 == ((nf) this).field_fb[var6]) {
                        break L49;
                      } else {
                        if (((nf) this).field_gb[((nf) this).field_fb[var6]] < ((nf) this).field_gb[var5]) {
                          break L49;
                        } else {
                          break L48;
                        }
                      }
                    }
                    if (((nf) this).field_gb[var5] > 1) {
                      ((nf) this).field_fb[var6] = var5;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L50: {
                    L51: {
                      var6++;
                      if (-1 == ((nf) this).field_fb[var6]) {
                        break L51;
                      } else {
                        if (((nf) this).field_Fb[((nf) this).field_fb[var6]] >= ((nf) this).field_Fb[var5]) {
                          break L50;
                        } else {
                          break L51;
                        }
                      }
                    }
                    if (((nf) this).field_Fb[var5] <= 1) {
                      break L50;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L50;
                    }
                  }
                  L52: {
                    L53: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L53;
                      } else {
                        if (((nf) this).field_Ob[var5] > ((nf) this).field_Ob[((nf) this).field_fb[var6]]) {
                          break L53;
                        } else {
                          break L52;
                        }
                      }
                    }
                    if (((nf) this).field_Ob[var5] >= 3000) {
                      ((nf) this).field_fb[var6] = var5;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  L54: {
                    L55: {
                      var6++;
                      if (((nf) this).field_fb[var6] == -1) {
                        break L55;
                      } else {
                        if (~((nf) this).field_c[var5] < ~((nf) this).field_c[((nf) this).field_fb[var6]]) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    if (50 > ((nf) this).field_c[var5]) {
                      break L54;
                    } else {
                      ((nf) this).field_fb[var6] = var5;
                      break L54;
                    }
                  }
                  L56: {
                    var6++;
                    if (!lk.a(0, (byte) -63)) {
                      break L56;
                    } else {
                      L57: {
                        if (-1 == ((nf) this).field_fb[var6]) {
                          break L57;
                        } else {
                          if (((nf) this).field_b[((nf) this).field_fb[var6]] < ((nf) this).field_b[var5]) {
                            break L57;
                          } else {
                            break L56;
                          }
                        }
                      }
                      if (((nf) this).field_b[var5] >= 1) {
                        ((nf) this).field_fb[var6] = var5;
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                  }
                  var5++;
                  continue L9;
                }
              }
            } else {
              ((nf) this).field_fb[var5] = -1;
              var5++;
              continue L8;
            }
          }
        }
    }

    final boolean a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((nf) this).field_fb = null;
            break L0;
          }
        }
        L1: {
          var4 = 32;
          if (param1 < var4) {
            break L1;
          } else {
            if (~param1 < ~(((nf) this).field_y - var4)) {
              break L1;
            } else {
              if (~var4 < ~param2) {
                break L1;
              } else {
                if (~(((nf) this).field_H - var4) > ~param2) {
                  break L1;
                } else {
                  L2: {
                    if (this.a(param1, var4 >> 1, param2, -66)) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  return stackIn_11_0 != 0;
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean k(byte param0) {
        int var4 = 0;
        ml var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = 0;
        int var3 = -5 / ((param0 - -57) / 54);
        for (var4 = 0; ~var4 > ~((nf) this).field_q; var4++) {
            var5 = ((nf) this).a(var4, true);
            if (!(var5 == null)) {
                var2++;
            }
        }
        return var2 <= 1 ? true : false;
    }

    private final int[] d(int param0, jd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        qb var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        Object stackIn_43_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_42_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var33 = new int[20];
            var31 = var33;
            var29 = var31;
            var27 = var29;
            var25 = var27;
            var34 = var25;
            var32 = var34;
            var30 = var32;
            var28 = var30;
            var4 = var28;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var33.length) {
                L2: {
                  var4[0] = ((nf) this).field_H + 64;
                  var4[19] = 64 + ((nf) this).field_H;
                  var6 = uj.a(param1, 5, (byte) -110) + 1;
                  var7 = -2 + (uj.a(param1, 5, (byte) -90) + 10);
                  var8 = -6 + uj.a(param1, 5, (byte) -80) + 20;
                  if (var6 > 1) {
                    var4[-1 + var6] = ((nf) this).field_H * 6 / 8 - uj.a(param1, 5 * ((nf) this).field_H / 8, (byte) -28);
                    break L2;
                  } else {
                    var4[3 + var6] = ((nf) this).field_H * 6 / 8 + -uj.a(param1, ((nf) this).field_H * 3 / 8, (byte) -69);
                    break L2;
                  }
                }
                L3: {
                  var4[var6] = 6 * ((nf) this).field_H / 8 - uj.a(param1, ((nf) this).field_H * 5 / 8, (byte) -30);
                  var4[var6 + 1] = ((nf) this).field_H * 6 / 8 - uj.a(param1, ((nf) this).field_H * 5 / 8, (byte) -23);
                  var4[var6 - -2] = 6 * ((nf) this).field_H / 8 + -uj.a(param1, 4 * ((nf) this).field_H / 8, (byte) -27);
                  var9 = var34[var6];
                  var4[var8 + -1] = 6 * ((nf) this).field_H / 8 - uj.a(param1, ((nf) this).field_H * 5 / 8, (byte) -54);
                  var4[var8 + -2] = ((nf) this).field_H * 6 / 8 + -uj.a(param1, 4 * ((nf) this).field_H / 8, (byte) -93);
                  var4[var8] = 6 * ((nf) this).field_H / 8 + -uj.a(param1, 5 * ((nf) this).field_H / 8, (byte) -97);
                  if (var8 < 17) {
                    var4[1 + var8] = 6 * ((nf) this).field_H / 8 - uj.a(param1, ((nf) this).field_H * 5 / 8, (byte) -57);
                    break L3;
                  } else {
                    var4[var8 + -3] = 6 * ((nf) this).field_H / 8 + -uj.a(param1, 3 * ((nf) this).field_H / 8, (byte) -115);
                    break L3;
                  }
                }
                L4: {
                  var10 = var34[var8];
                  var4[-2 + var7] = 6 * ((nf) this).field_H / 8 - uj.a(param1, ((nf) this).field_H * 3 / 8, (byte) -100);
                  var4[-1 + var7] = 6 * ((nf) this).field_H / 8 + -uj.a(param1, ((nf) this).field_H * 4 / 8, (byte) -95);
                  var4[var7] = 6 * ((nf) this).field_H / 8 + -uj.a(param1, 5 * ((nf) this).field_H / 8, (byte) -74);
                  if (param0 == -22070) {
                    break L4;
                  } else {
                    ((nf) this).field_y = 13;
                    break L4;
                  }
                }
                var4[1 + var7] = 6 * ((nf) this).field_H / 8 + -uj.a(param1, ((nf) this).field_H * 4 / 8, (byte) -114);
                var4[var7 + 2] = 6 * ((nf) this).field_H / 8 + -uj.a(param1, ((nf) this).field_H * 3 / 8, (byte) -30);
                var11 = var34[var7];
                var4[(var7 + var6) / 2] = 64 + ((nf) this).field_H;
                var4[(var7 + var8) / 2] = ((nf) this).field_H - -64;
                L5: while (true) {
                  if (((nf) this).field_y / 32 <= var4.length) {
                    var6 = (var6 - -1) * var4.length / 20;
                    var12 = var4.length * (var8 + -1) / 20;
                    var8 = var4.length * (var7 - -2) / 20;
                    var9 = var4[var6] + 24;
                    var7 = (var7 - 2) * var4.length / 20;
                    var10 = var4[var8] + 24;
                    var11 = 24 + var4[var7];
                    var13 = 24 + var4[var12];
                    var14 = -1;
                    L6: while (true) {
                      if (1 <= var14) {
                        var14 = -1;
                        L7: while (true) {
                          if (var14 >= 1) {
                            L8: {
                              this.a(var4, (byte) -106);
                              System.gc();
                              ((nf) this).field_V = new ll(((nf) this).field_y, ((nf) this).field_H, gg.field_c);
                              if (ti.field_I != null) {
                                ((nf) this).field_V.field_l = ti.field_I[((nf) this).field_O].field_l;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            this.a(0, 127, mn.field_y, 0, ((nf) this).field_V);
                            var14 = ((nf) this).field_y * var6 / var4.length;
                            var15 = ((nf) this).field_y * var7 / var4.length;
                            var16 = var8 * ((nf) this).field_y / var4.length;
                            var17 = var12 * ((nf) this).field_y / var4.length;
                            var18 = new qb(20, 20);
                            var18.a();
                            gj.field_f[5].a(2, 2);
                            var19 = 0;
                            L9: while (true) {
                              if (var19 >= var18.field_A.length) {
                                L10: {
                                  var18.d(0, 0, 9584406);
                                  var18.d(1);
                                  var18.d(1);
                                  var19 = -var14 + var15;
                                  var20 = -var9 + var11;
                                  if (~Math.abs(var20) <= ~var19) {
                                    break L10;
                                  } else {
                                    var21 = var14;
                                    L11: while (true) {
                                      if (var15 <= var21) {
                                        break L10;
                                      } else {
                                        var22 = Math.abs(var19 / 2 - var21 - -var14);
                                        var23 = (-(var22 * var22) + var19 * var19 / 4) / (var19 * 4);
                                        this.a(false, var21 + -10, ((nf) this).field_V, false, var23 + (var9 - -(var20 * (var21 + -var14) / var19)) - 10, var18);
                                        var21 += 14;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                                L12: {
                                  var20 = -var10 + var13;
                                  var19 = -var16 + var17;
                                  if (~Math.abs(var20) > ~var19) {
                                    var21 = var16;
                                    L13: while (true) {
                                      if (var21 >= var17) {
                                        break L12;
                                      } else {
                                        var22 = Math.abs(-var21 + var16 + var19 / 2);
                                        var23 = (-(var22 * var22) + var19 * var19 / 4) / (var19 * 4);
                                        this.a(false, var21 + -10, ((nf) this).field_V, false, var23 + (-10 + (-var16 + var21) * var20 / var19 + var10), var18);
                                        var21 += 14;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                                this.a(var4, param1, (byte) 75);
                                this.a(0, 121, ((nf) this).field_V, 0, mn.field_y);
                                int discarded$1 = 5;
                                this.b();
                                stackOut_42_0 = null;
                                stackIn_43_0 = stackOut_42_0;
                                break L0;
                              } else {
                                var18.field_A[var19] = 65793 * dg.a(var18.field_A[var19], 255);
                                var19++;
                                continue L9;
                              }
                            }
                          } else {
                            var4[var14 + var6] = var4[var14 + var6] - 64;
                            var4[var7 + var14] = var4[var7 + var14] - 64;
                            var4[var8 + var14] = var4[var8 + var14] - 64;
                            var4[var12 + var14] = var4[var12 + var14] - 64;
                            var14++;
                            continue L7;
                          }
                        }
                      } else {
                        var4[var14 + var6] = var4[var6];
                        var4[var14 + var7] = var4[var7];
                        var4[var14 + var8] = var4[var8];
                        var4[var14 + var12] = var4[var12];
                        var14++;
                        continue L6;
                      }
                    }
                  } else {
                    var12_ref_int__ = new int[(-1 + var4.length) * 2 - -1];
                    var12_ref_int__[0] = var4[0];
                    var26 = 1;
                    var5 = var26;
                    L14: while (true) {
                      if (~var4.length >= ~var26) {
                        var4 = var12_ref_int__;
                        continue L5;
                      } else {
                        L15: {
                          var3_int = ((nf) this).field_H / var4.length;
                          stackOut_16_0 = (int[]) var12_ref_int__;
                          stackOut_16_1 = -1 + 2 * var26;
                          stackOut_16_2 = -(var3_int / 2);
                          stackOut_16_3 = (var4[var26] + var4[var26 + -1]) / 2;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_18_2 = stackOut_16_2;
                          stackIn_18_3 = stackOut_16_3;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          stackIn_17_3 = stackOut_16_3;
                          if (0 == var3_int) {
                            stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                            stackOut_18_1 = stackIn_18_1;
                            stackOut_18_2 = stackIn_18_2;
                            stackOut_18_3 = stackIn_18_3;
                            stackOut_18_4 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            stackIn_19_2 = stackOut_18_2;
                            stackIn_19_3 = stackOut_18_3;
                            stackIn_19_4 = stackOut_18_4;
                            break L15;
                          } else {
                            stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = stackIn_17_2;
                            stackOut_17_3 = stackIn_17_3;
                            stackOut_17_4 = param1.a(var3_int, (byte) -116);
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            stackIn_19_2 = stackOut_17_2;
                            stackIn_19_3 = stackOut_17_3;
                            stackIn_19_4 = stackOut_17_4;
                            break L15;
                          }
                        }
                        stackIn_19_0[stackIn_19_1] = stackIn_19_2 + (stackIn_19_3 + stackIn_19_4);
                        var12_ref_int__[var26 * 2] = var4[var26];
                        var26++;
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                var25[var5] = 64 + (((nf) this).field_H + -uj.a(param1, 256, (byte) -123));
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var3;
            stackOut_44_1 = new StringBuilder().append("nf.UA(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L16;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L16;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ')');
        }
        return (int[]) (Object) stackIn_43_0;
    }

    final ll m(byte param0) {
        if (param0 != 69) {
            return null;
        }
        return ((nf) this).field_Jb;
    }

    final int o(int param0) {
        if (param0 != 4) {
            boolean discarded$0 = this.c(-95, 63, -13);
        }
        int discarded$1 = 0;
        int discarded$2 = 106;
        return this.c();
    }

    public static void r(int param0) {
        if (param0 != 0) {
            return;
        }
        field_P = null;
        field_Bb = null;
        field_yb = null;
        field_e = null;
        field_j = null;
        field_qb = null;
        field_A = null;
        field_Lb = null;
        field_z = null;
    }

    private final void i() {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(((nf) this).field_i);
        ml var3 = (ml) (Object) var2.b(-42);
        while (var3 != null) {
            ((nf) this).a(-100, var3);
            var3 = (ml) (Object) var2.d(-18502);
        }
    }

    private final int[] a(jd param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_13_0 = null;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var16 = new int[10];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var8 = var10;
            var17 = var8;
            var15 = var17;
            var13 = var15;
            var11 = var13;
            var4 = var11;
            var5 = 0;
            L1: while (true) {
              if (~(-1 + var16.length) >= ~var5) {
                var4[0] = ((nf) this).field_H + 64;
                var4[1] = var17[1] / 2;
                var4[var17.length + -2] = var4[-2 + var17.length] / 2;
                var4[var17.length - 1] = var17[0];
                L2: while (true) {
                  if (~(((nf) this).field_y / 32) >= ~var4.length) {
                    this.a(var4, (byte) -115);
                    stackOut_13_0 = (int[]) var4;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    var6 = new int[1 + 2 * (-1 + var4.length)];
                    var6[0] = var4[0];
                    var9 = 1;
                    var5 = var9;
                    L3: while (true) {
                      if (var4.length <= var9) {
                        var4 = var6;
                        continue L2;
                      } else {
                        L4: {
                          var3_int = ((nf) this).field_H / var4.length;
                          stackOut_8_0 = (int[]) var6;
                          stackOut_8_1 = 2 * var9 - 1;
                          stackOut_8_2 = (var4[var9 - 1] + var4[var9]) / 2;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          if (var3_int == 0) {
                            stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = stackIn_10_2;
                            stackOut_10_3 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            break L4;
                          } else {
                            stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = stackIn_9_2;
                            stackOut_9_3 = param0.a(var3_int, (byte) -116);
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_11_3 = stackOut_9_3;
                            break L4;
                          }
                        }
                        stackIn_11_0[stackIn_11_1] = stackIn_11_2 - -stackIn_11_3 - var3_int / 2;
                        var6[2 * var9] = var4[var9];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var8[var5] = ((nf) this).field_H * 6 / 8 - uj.a(param0, ((nf) this).field_H * 5 / 8, (byte) -125);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("nf.GD(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + -12260 + ')');
        }
        return stackIn_14_0;
    }

    final int q(byte param0) {
        if (param0 >= -109) {
            field_z = null;
        }
        if (!((nf) this).field_d) {
            return ((nf) this).field_J;
        }
        return 1 & ((nf) this).field_J;
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 != -83) {
            this.a(1, (byte) 42, 71, (ll) null, (qb) null);
        }
        return ee.a(((nf) this).field_Jb, param0, param1, 96);
    }

    private final void p(byte param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        mi var2 = (mi) (Object) ((nf) this).field_I.b(117);
        while (var2 != null) {
            var2.a(true);
            var2 = (mi) (Object) ((nf) this).field_I.e(-124);
        }
        var2 = (mi) (Object) ((nf) this).field_h.b(117);
        while (var2 != null) {
            ((nf) this).field_r.b((pg) (Object) var2, -1);
            var2 = (mi) (Object) ((nf) this).field_h.e(123);
        }
        ((nf) this).field_kb.a(((nf) this).field_Kb, false);
        ((nf) this).field_I.a(17);
        if (param0 <= 71) {
            this.a(-89, (byte) 119, 52, (ll) null, (qb) null);
        }
        ((nf) this).field_h.a(17);
        ((nf) this).field_kb.c(-128);
    }

    private final void a(boolean param0, int param1, ll param2, boolean param3, int param4, qb param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              return;
            } else {
              L1: {
                param1 = param1 + param5.field_x;
                param4 = param4 + param5.field_o;
                var7_int = param1 - -(param4 * ((nf) this).field_y);
                var8 = 0;
                var9 = param5.field_y;
                var10 = param5.field_q;
                var11 = ((nf) this).field_y - var10;
                if (param4 < 0) {
                  var13_int = -param4;
                  var7_int = var7_int + var13_int * ((nf) this).field_y;
                  var8 = var8 + var10 * var13_int;
                  param4 = 0;
                  var9 = var9 - var13_int;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var12 = 0;
                if (var9 + param4 <= ((nf) this).field_H + -1) {
                  break L2;
                } else {
                  var9 = var9 - (1 - ((nf) this).field_H + param4 + var9);
                  break L2;
                }
              }
              L3: {
                if (param1 >= 0) {
                  break L3;
                } else {
                  var13_int = -param1;
                  var8 = var8 + var13_int;
                  param1 = 0;
                  var11 = var11 + var13_int;
                  var7_int = var7_int + var13_int;
                  var12 = var12 + var13_int;
                  var10 = var10 - var13_int;
                  break L3;
                }
              }
              L4: {
                if (~(((nf) this).field_y + -1) > ~(param1 + var10)) {
                  var13_int = -((nf) this).field_y - -1 + var10 + param1;
                  var10 = var10 - var13_int;
                  var11 = var11 + var13_int;
                  var12 = var12 + var13_int;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var10 <= 0) {
                  break L5;
                } else {
                  if (0 >= var9) {
                    break L5;
                  } else {
                    var19 = new byte[param5.field_A.length];
                    var18 = var19;
                    var17 = var18;
                    var16 = var17;
                    var13 = var16;
                    var14 = 0;
                    L6: while (true) {
                      if (~var14 <= ~param5.field_A.length) {
                        vn.a(var19, var10, var8, 115, var7_int, var12, var9, param2.field_m, var11, param3);
                        break L0;
                      } else {
                        var13[var14] = (byte)hk.field_p[((nf) this).field_O].a(param5.field_A[var14], 510);
                        var14++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("nf.R(").append(false).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    private final boolean j(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 <= -62) {
            break L0;
          } else {
            ((nf) this).field_Ab = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!((nf) this).field_Gb) {
                break L3;
              } else {
                if (!((nf) this).field_zb) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (!((nf) this).field_Mb) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    private final void a(int param0, ol param1) {
        ge var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ml var12 = null;
        mi var13_ref_mi = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24_ref = null;
        int var24 = 0;
        ml var24_ref_ml = null;
        mi var24_ref_mi = null;
        int[] var24_ref_int__ = null;
        int var25_int = 0;
        mi var25 = null;
        ml var25_ref = null;
        int[] var25_array = null;
        int var26 = 0;
        double var26_double = 0.0;
        int[] var26_ref_int__ = null;
        mi var26_ref_mi = null;
        int var27 = 0;
        int[] var27_ref_int__ = null;
        mi var27_ref_mi = null;
        mi var28 = null;
        double var28_double = 0.0;
        int var28_int = 0;
        ml var28_ref = null;
        qb var29 = null;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        mi var46 = null;
        int var47 = 0;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        var24_ref = null;
        var47 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.j((byte) -82)) {
          var3 = (ge) (Object) ((nf) this).field_Db.c(true);
          if (var3 != null) {
            ((nf) this).field_Z = false;
            ((nf) this).field_tb = 0;
            var4 = var3.field_t;
            var5 = var3.field_o;
            var6 = var3.field_j;
            var7 = var3.field_q;
            var8 = var3.field_s;
            var9 = var3.field_k;
            var10 = var3.field_m;
            var11 = var3.field_h;
            if (var4 < 0) {
              throw new IllegalArgumentException();
            } else {
              if (!((nf) this).field_ub) {
                var12 = ((nf) this).a(var5, true);
                if (var12 != null) {
                  if (var10 == 157) {
                    L0: {
                      if (param1 == null) {
                        break L0;
                      } else {
                        param1.a(-85, var12);
                        if (((nf) this).field_sb == null) {
                          break L0;
                        } else {
                          if (((nf) this).field_sb[225] == null) {
                            break L0;
                          } else {
                            fk discarded$16 = ti.a((byte) -30, to.field_r[225], ((nf) this).field_sb[225]);
                            break L0;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    if (var10 == 158) {
                      L1: {
                        if (var8 != 0) {
                          break L1;
                        } else {
                          var12.field_M = -1;
                          break L1;
                        }
                      }
                      L2: {
                        if (var8 != 1) {
                          break L2;
                        } else {
                          var12.field_M = 1;
                          break L2;
                        }
                      }
                      L3: {
                        if (var8 == 2) {
                          var12.field_E = -1;
                          var12.field_M = 2;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (var8 == 3) {
                          var12.field_E = -1;
                          var12.field_M = 3;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (4 != var8) {
                          break L5;
                        } else {
                          var12.field_M = 2;
                          var12.field_E = 1;
                          break L5;
                        }
                      }
                      L6: {
                        var11--;
                        if (5 != var8) {
                          break L6;
                        } else {
                          var12.field_M = 3;
                          var12.field_E = 1;
                          break L6;
                        }
                      }
                      L7: {
                        if (var11 > 0) {
                          var3.field_h = var11;
                          ((nf) this).field_Db.a((pg) (Object) var3, (byte) -58);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      return;
                    } else {
                      if (var10 != 159) {
                        L8: {
                          if (null != var12.field_s) {
                            break L8;
                          } else {
                            var13_ref_mi = (mi) (Object) ((nf) this).field_Kb.b(12623);
                            L9: while (true) {
                              if (var13_ref_mi == null) {
                                break L8;
                              } else {
                                L10: {
                                  if (var12 != var13_ref_mi.field_t) {
                                    break L10;
                                  } else {
                                    if (var13_ref_mi.field_I != 107) {
                                      break L10;
                                    } else {
                                      var13_ref_mi.f(0);
                                      break L10;
                                    }
                                  }
                                }
                                var13_ref_mi = (mi) (Object) ((nf) this).field_Kb.a(0);
                                continue L9;
                              }
                            }
                          }
                        }
                        L11: {
                          if (var6 >= -640) {
                            break L11;
                          } else {
                            var6 = -640;
                            break L11;
                          }
                        }
                        L12: {
                          if (((nf) this).field_sb == null) {
                            break L12;
                          } else {
                            if (null == ((nf) this).field_sb[64 - -var10]) {
                              break L12;
                            } else {
                              fk discarded$17 = ti.a((byte) -30, to.field_r[64 + var10], ((nf) this).field_sb[64 - -var10]);
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (var7 >= -480) {
                            break L13;
                          } else {
                            var7 = -480;
                            break L13;
                          }
                        }
                        L14: {
                          if (var6 <= ((nf) this).field_y - -640) {
                            break L14;
                          } else {
                            var6 = 640 + ((nf) this).field_y;
                            break L14;
                          }
                        }
                        L15: {
                          if (~(480 + ((nf) this).field_H) <= ~var7) {
                            break L15;
                          } else {
                            var7 = ((nf) this).field_H - -480;
                            break L15;
                          }
                        }
                        var13 = var6 - var12.field_lb;
                        var14 = (var12.field_Y >> 1) + var7 + -var12.field_db;
                        var15 = var13 * var13 - -(var14 * var14);
                        if (var15 <= 0) {
                          return;
                        } else {
                          L16: {
                            var15 = am.a(var14, var13, false);
                            ((nf) this).field_mb = var8;
                            if (var13 > 0) {
                              var12.field_E = 1;
                              break L16;
                            } else {
                              var12.field_E = -1;
                              break L16;
                            }
                          }
                          L17: {
                            ((nf) this).field_t = var9;
                            if (((nf) this).field_Gb) {
                              break L17;
                            } else {
                              L18: {
                                if (1 == rd.field_e[var10]) {
                                  if (var8 != -1000) {
                                    break L18;
                                  } else {
                                    if (var15 <= 32) {
                                      break L18;
                                    } else {
                                      var11 = 0;
                                      break L18;
                                    }
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  if (2 == rd.field_e[var10]) {
                                    break L20;
                                  } else {
                                    if (rd.field_e[var10] == 4) {
                                      break L20;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                var9 = var7;
                                var8 = var6;
                                break L19;
                              }
                              if (var10 == 4) {
                                if (((nf) this).b(-var12.field_Y + var9, 2, var8 + -(var12.field_Y >> 1), var12.field_w)) {
                                  if (32 >= var15) {
                                    break L17;
                                  } else {
                                    var11 = 0;
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          L21: {
                            if (rd.field_e[var10] != 0) {
                              break L21;
                            } else {
                              if (!var12.t(44)) {
                                break L21;
                              } else {
                                ((nf) this).field_Z = true;
                                break L21;
                              }
                            }
                          }
                          L22: {
                            ((nf) this).field_Y = var10;
                            var16 = 0;
                            var17 = 8;
                            var18 = -1;
                            var19 = 1;
                            if (62 == var10) {
                              var18 = 52;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          L23: {
                            if (131 == var10) {
                              var18 = 52;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            if (var10 == 63) {
                              var18 = 53;
                              var19 = 1;
                              var16 = 1;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          L25: {
                            if (66 != var10) {
                              break L25;
                            } else {
                              var18 = 54;
                              break L25;
                            }
                          }
                          L26: {
                            if (var10 == 69) {
                              var18 = 56;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (0 != var10) {
                              break L27;
                            } else {
                              var18 = 74;
                              break L27;
                            }
                          }
                          L28: {
                            if (10 != var10) {
                              break L28;
                            } else {
                              var18 = 2;
                              var19 = 0;
                              break L28;
                            }
                          }
                          L29: {
                            if (var10 != 12) {
                              break L29;
                            } else {
                              var18 = 10;
                              break L29;
                            }
                          }
                          L30: {
                            if (var10 == 13) {
                              var18 = 11;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (14 == var10) {
                              var19 = 1;
                              var16 = 1;
                              var18 = 12;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (var10 != 15) {
                              break L32;
                            } else {
                              var18 = 13;
                              var19 = 1;
                              var16 = 1;
                              break L32;
                            }
                          }
                          L33: {
                            if (var10 != 16) {
                              break L33;
                            } else {
                              var18 = 68;
                              break L33;
                            }
                          }
                          L34: {
                            if (72 != var10) {
                              break L34;
                            } else {
                              var18 = 106;
                              break L34;
                            }
                          }
                          L35: {
                            if (var10 != 135) {
                              break L35;
                            } else {
                              var18 = 106;
                              break L35;
                            }
                          }
                          L36: {
                            if (var10 != 82) {
                              break L36;
                            } else {
                              var18 = 107;
                              break L36;
                            }
                          }
                          L37: {
                            if (var10 == 84) {
                              var18 = 115;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (var10 != 85) {
                              break L38;
                            } else {
                              var19 = 1;
                              var18 = 116;
                              var16 = 1;
                              break L38;
                            }
                          }
                          L39: {
                            if (86 == var10) {
                              var18 = 118;
                              var11 = 48;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          L40: {
                            if (var10 == 149) {
                              var11 = 48;
                              var18 = 118;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          L41: {
                            if (var10 != 87) {
                              break L41;
                            } else {
                              var18 = 119;
                              var11 = 48;
                              break L41;
                            }
                          }
                          L42: {
                            if (99 == var10) {
                              var18 = 140;
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                          L43: {
                            if (96 == var10) {
                              var18 = 133;
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                          L44: {
                            if (var10 != 18) {
                              break L44;
                            } else {
                              var18 = 73;
                              var11 = 48;
                              var19 = 0;
                              break L44;
                            }
                          }
                          L45: {
                            if (var10 != 19) {
                              break L45;
                            } else {
                              var19 = 1;
                              var18 = 67;
                              var16 = 1;
                              break L45;
                            }
                          }
                          L46: {
                            if (var10 != 52) {
                              break L46;
                            } else {
                              var18 = 45;
                              break L46;
                            }
                          }
                          L47: {
                            if (var10 == 74) {
                              var18 = 61;
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                          L48: {
                            if (50 != var10) {
                              break L48;
                            } else {
                              var11 = 48;
                              var18 = 75;
                              break L48;
                            }
                          }
                          L49: {
                            if (var10 != 51) {
                              break L49;
                            } else {
                              var18 = 44;
                              break L49;
                            }
                          }
                          L50: {
                            if (var10 == 48) {
                              var18 = 40;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          L51: {
                            if (var10 == 49) {
                              var19 = 1;
                              var18 = 41;
                              var16 = 1;
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                          L52: {
                            if (var10 != 80) {
                              break L52;
                            } else {
                              var18 = 66;
                              break L52;
                            }
                          }
                          L53: {
                            if (var10 == 121) {
                              var18 = 97;
                              var11 = 48;
                              break L53;
                            } else {
                              break L53;
                            }
                          }
                          L54: {
                            if (122 != var10) {
                              break L54;
                            } else {
                              var18 = 40;
                              break L54;
                            }
                          }
                          L55: {
                            if (var10 != 123) {
                              break L55;
                            } else {
                              var18 = 78;
                              var19 = 0;
                              break L55;
                            }
                          }
                          L56: {
                            if (var10 != 137) {
                              break L56;
                            } else {
                              var19 = 0;
                              var18 = 78;
                              break L56;
                            }
                          }
                          L57: {
                            if (var10 == 138) {
                              var18 = 78;
                              var19 = 0;
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          L58: {
                            if (var10 != 155) {
                              break L58;
                            } else {
                              var19 = 0;
                              var12.field_F = -3.0;
                              var18 = 78;
                              break L58;
                            }
                          }
                          L59: {
                            if (24 == var10) {
                              var11 = 48;
                              var18 = 81;
                              break L59;
                            } else {
                              break L59;
                            }
                          }
                          L60: {
                            if (var10 == 26) {
                              var18 = 22;
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                          L61: {
                            if (var10 == 28) {
                              var17 = 16;
                              var18 = 24;
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                          L62: {
                            if (var10 != 25) {
                              break L62;
                            } else {
                              var18 = 21;
                              break L62;
                            }
                          }
                          L63: {
                            if (var10 == 27) {
                              var17 = 16;
                              var18 = 23;
                              break L63;
                            } else {
                              break L63;
                            }
                          }
                          L64: {
                            if (29 != var10) {
                              break L64;
                            } else {
                              var17 = 16;
                              var18 = 25;
                              var19 = 1;
                              break L64;
                            }
                          }
                          L65: {
                            if (var10 != 124) {
                              break L65;
                            } else {
                              var18 = 79;
                              break L65;
                            }
                          }
                          L66: {
                            if (var10 == 125) {
                              var18 = 80;
                              var19 = 0;
                              break L66;
                            } else {
                              break L66;
                            }
                          }
                          L67: {
                            if (36 != var10) {
                              break L67;
                            } else {
                              var18 = 84;
                              var11 = 48;
                              break L67;
                            }
                          }
                          L68: {
                            if (var10 == 126) {
                              var18 = 84;
                              var11 = 48;
                              break L68;
                            } else {
                              break L68;
                            }
                          }
                          L69: {
                            if (var10 != 88) {
                              break L69;
                            } else {
                              var18 = 120;
                              break L69;
                            }
                          }
                          L70: {
                            if (var10 != 89) {
                              break L70;
                            } else {
                              var16 = 1;
                              var18 = 122;
                              var19 = 1;
                              break L70;
                            }
                          }
                          L71: {
                            if (var10 == 1) {
                              var19 = 1;
                              var18 = 147;
                              var16 = 1;
                              break L71;
                            } else {
                              break L71;
                            }
                          }
                          L72: {
                            if (var10 == 3) {
                              var18 = 148;
                              break L72;
                            } else {
                              break L72;
                            }
                          }
                          L73: {
                            if (var10 != 102) {
                              break L73;
                            } else {
                              var18 = 144;
                              var19 = 0;
                              var11 = 48;
                              break L73;
                            }
                          }
                          L74: {
                            if (var10 == 103) {
                              var16 = 1;
                              var18 = 146;
                              var19 = 1;
                              break L74;
                            } else {
                              break L74;
                            }
                          }
                          L75: {
                            if (var10 == 108) {
                              var19 = 0;
                              var18 = 156;
                              break L75;
                            } else {
                              break L75;
                            }
                          }
                          L76: {
                            if (var10 != 109) {
                              break L76;
                            } else {
                              var18 = 157;
                              var19 = 0;
                              break L76;
                            }
                          }
                          L77: {
                            if (var10 != 110) {
                              break L77;
                            } else {
                              var18 = 158;
                              var19 = 0;
                              break L77;
                            }
                          }
                          L78: {
                            if (var10 != 113) {
                              break L78;
                            } else {
                              var19 = 0;
                              var18 = 161;
                              break L78;
                            }
                          }
                          L79: {
                            if (var10 == 115) {
                              var18 = 162;
                              break L79;
                            } else {
                              break L79;
                            }
                          }
                          L80: {
                            if (116 != var10) {
                              break L80;
                            } else {
                              if (((nf) this).b(116, -102, var12.field_u) <= 0) {
                                var19 = 1;
                                var11 = 48;
                                var18 = 164;
                                break L80;
                              } else {
                                return;
                              }
                            }
                          }
                          L81: {
                            if (var10 == 117) {
                              var16 = 1;
                              var19 = 1;
                              var18 = 165;
                              break L81;
                            } else {
                              break L81;
                            }
                          }
                          L82: {
                            L83: {
                              if (130 == var10) {
                                break L83;
                              } else {
                                if (var10 == 127) {
                                  break L83;
                                } else {
                                  if (128 == var10) {
                                    break L83;
                                  } else {
                                    if (var10 == 129) {
                                      break L83;
                                    } else {
                                      if (var10 == 136) {
                                        break L83;
                                      } else {
                                        if (var10 != 155) {
                                          break L82;
                                        } else {
                                          break L83;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (Math.abs(var13) < Math.abs(var14)) {
                              L84: {
                                if (var14 < 0) {
                                  var14 = -64;
                                  break L84;
                                } else {
                                  var14 = 64;
                                  break L84;
                                }
                              }
                              var13 = 64 * var12.field_E;
                              var15 = am.a(var14, var13, false);
                              break L82;
                            } else {
                              break L82;
                            }
                          }
                          L85: {
                            if (var10 == 127) {
                              var11 = 48;
                              var18 = 91;
                              var12.field_F = -3.0;
                              break L85;
                            } else {
                              break L85;
                            }
                          }
                          L86: {
                            if (128 == var10) {
                              var18 = 92;
                              var11 = 48;
                              var12.field_F = -3.0;
                              break L86;
                            } else {
                              break L86;
                            }
                          }
                          L87: {
                            if (var10 == 129) {
                              var12.field_F = -3.0;
                              var11 = 48;
                              var18 = 93;
                              break L87;
                            } else {
                              break L87;
                            }
                          }
                          L88: {
                            if (var10 == 136) {
                              var12.field_F = -3.0;
                              var18 = 113;
                              var11 = 48;
                              break L88;
                            } else {
                              break L88;
                            }
                          }
                          L89: {
                            L90: {
                              if (var10 == 38) {
                                break L90;
                              } else {
                                if (var10 == 133) {
                                  break L90;
                                } else {
                                  break L89;
                                }
                              }
                            }
                            var18 = 69;
                            break L89;
                          }
                          L91: {
                            if (var10 == 40) {
                              var19 = 1;
                              var16 = 1;
                              var18 = 33;
                              break L91;
                            } else {
                              break L91;
                            }
                          }
                          L92: {
                            if (var10 != 37) {
                              break L92;
                            } else {
                              var18 = 31;
                              var19 = 1;
                              var11 = 48;
                              break L92;
                            }
                          }
                          L93: {
                            L94: {
                              if (var10 == 41) {
                                break L94;
                              } else {
                                if (var10 != 134) {
                                  break L93;
                                } else {
                                  break L94;
                                }
                              }
                            }
                            var18 = 70;
                            break L93;
                          }
                          L95: {
                            if (var10 != 43) {
                              break L95;
                            } else {
                              var18 = 34;
                              var19 = 1;
                              var17 = 16;
                              break L95;
                            }
                          }
                          L96: {
                            var17 += 2;
                            if (var10 != 130) {
                              break L96;
                            } else {
                              var18 = 98;
                              break L96;
                            }
                          }
                          L97: {
                            if (var16 == 0) {
                              break L97;
                            } else {
                              if (var12.s(-1)) {
                                break L97;
                              } else {
                                if (!var12.g((byte) 113)) {
                                  break L97;
                                } else {
                                  break L97;
                                }
                              }
                            }
                          }
                          L98: {
                            var20 = (var12.field_Y / 2 + (var17 - -4)) * var13 / var15;
                            var21 = (var12.field_Y / 2 + var17 + 4) * var14 / var15 - var12.field_Y / 2;
                            var22 = var11 * var13 / var15;
                            var23 = var14 * var11 / var15;
                            if (var19 == 0) {
                              break L98;
                            } else {
                              L99: {
                                var21 = var17 * var14 / var15 + -(var12.field_Y / 2);
                                if (var11 >= 10) {
                                  break L99;
                                } else {
                                  var11 = 10;
                                  break L99;
                                }
                              }
                              var20 = var13 * var17 / var15;
                              var23 = var11 * var14 / var15;
                              var22 = var11 * var13 / var15;
                              break L98;
                            }
                          }
                          L100: {
                            if (var18 < 0) {
                              break L100;
                            } else {
                              L101: {
                                if (var22 <= 0) {
                                  var12.field_E = -1;
                                  break L101;
                                } else {
                                  var12.field_E = 1;
                                  break L101;
                                }
                              }
                              L102: {
                                L103: {
                                  if (var18 == 69) {
                                    break L103;
                                  } else {
                                    if (var18 == 70) {
                                      break L103;
                                    } else {
                                      if (var18 == 68) {
                                        break L103;
                                      } else {
                                        if (var18 != 157) {
                                          break L102;
                                        } else {
                                          break L103;
                                        }
                                      }
                                    }
                                  }
                                }
                                var24_ref_mi = (mi) (Object) ((nf) this).field_Kb.b(12623);
                                L104: while (true) {
                                  if (var24_ref_mi == null) {
                                    break L102;
                                  } else {
                                    L105: {
                                      if (var18 != var24_ref_mi.field_I) {
                                        break L105;
                                      } else {
                                        if (var24_ref_mi.field_t != var12) {
                                          break L105;
                                        } else {
                                          var24_ref_mi.f(0);
                                          break L105;
                                        }
                                      }
                                    }
                                    var24_ref_mi = (mi) (Object) ((nf) this).field_Kb.a(0);
                                    continue L104;
                                  }
                                }
                              }
                              var24_ref_mi = (mi) (Object) ((nf) this).field_Kb.b(12623);
                              L106: while (true) {
                                if (var24_ref_mi == null) {
                                  L107: {
                                    this.a((byte) 80, var10, var4);
                                    var24_ref_mi = j.a(var12, var12.field_db - -var21, (byte) 36, (nf) this, var10, var12.field_lb + var20, var18);
                                    var24_ref_mi.field_F = 8 * var23;
                                    var24_ref_mi.field_u = var22 * 8;
                                    ((nf) this).b(52, var24_ref_mi);
                                    if (var18 == 119) {
                                      break L107;
                                    } else {
                                      if (var18 == 164) {
                                        break L107;
                                      } else {
                                        ((nf) this).field_D = true;
                                        break L107;
                                      }
                                    }
                                  }
                                  var11 = 0;
                                  if (param1 == null) {
                                    break L100;
                                  } else {
                                    param1.a(var24_ref_mi, -126);
                                    break L100;
                                  }
                                } else {
                                  L108: {
                                    if (69 != var24_ref_mi.field_I) {
                                      break L108;
                                    } else {
                                      var24_ref_mi.field_y = 0;
                                      break L108;
                                    }
                                  }
                                  var24_ref_mi = (mi) (Object) ((nf) this).field_Kb.a(0);
                                  continue L106;
                                }
                              }
                            }
                          }
                          L109: {
                            if (var10 != 119) {
                              break L109;
                            } else {
                              var24 = 0;
                              L110: while (true) {
                                if (~((nf) this).field_q >= ~var24) {
                                  ((nf) this).field_D = true;
                                  break L109;
                                } else {
                                  var25_int = 0;
                                  L111: while (true) {
                                    if (16 <= var25_int) {
                                      var24++;
                                      continue L110;
                                    } else {
                                      L112: {
                                        L113: {
                                          ((nf) this).field_lb[var24][var25_int] = 0;
                                          if (((nf) this).field_v[var24][var25_int] == -1) {
                                            break L113;
                                          } else {
                                            if (((nf) this).field_v[var24][var25_int] >= 156) {
                                              break L113;
                                            } else {
                                              if (((nf) this).field_v[var24][var25_int] == 119) {
                                                break L113;
                                              } else {
                                                ((nf) this).field_vb[var24][var25_int] = hh.field_b[((nf) this).field_v[var24][var25_int]];
                                                if (-1 != ((nf) this).field_vb[var24][var25_int]) {
                                                  if (0 == ((nf) this).field_vb[var24][var25_int]) {
                                                    ((nf) this).field_vb[var24][var25_int] = -1;
                                                    break L112;
                                                  } else {
                                                    break L112;
                                                  }
                                                } else {
                                                  ((nf) this).field_vb[var24][var25_int] = 1;
                                                  break L112;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((nf) this).field_v[var24][var25_int] = -1;
                                        break L112;
                                      }
                                      var25_int++;
                                      continue L111;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L114: {
                            if (78 == var10) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(12, var8, var9, ((nf) this).h(-111), (nf) this, var12);
                              ((nf) this).a((byte) -120, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              break L114;
                            } else {
                              break L114;
                            }
                          }
                          L115: {
                            if (var10 == 23) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(13, var8, var9, ((nf) this).h(-92), (nf) this, var12);
                              ((nf) this).a((byte) -124, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L115;
                            } else {
                              break L115;
                            }
                          }
                          L116: {
                            if (118 == var10) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(39, var8, var9, ((nf) this).h(-98), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -116, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L116;
                            } else {
                              break L116;
                            }
                          }
                          L117: {
                            if (var10 != 59) {
                              break L117;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(15, var8, var9, ((nf) this).h(-107), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -123, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L117;
                            }
                          }
                          L118: {
                            if (var10 != 47) {
                              break L118;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(14, var8, var9, ((nf) this).h(-119), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -120, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L118;
                            }
                          }
                          L119: {
                            if (var10 != 98) {
                              break L119;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(28, -32 + var8, var9, ((nf) this).h(-81), (nf) this, var12);
                              ((nf) this).a((byte) -124, var24_ref_ml);
                              var25 = aj.a(var24_ref_ml, var24_ref_ml.field_db, false, 138, (nf) this, var24_ref_ml.field_lb);
                              ((nf) this).b(52, var25);
                              var24_ref_ml = new ml(28, 32 + var8, var9, ((nf) this).h(-98), (nf) this, var12);
                              ((nf) this).a((byte) -124, var24_ref_ml);
                              var25 = aj.a(var24_ref_ml, var24_ref_ml.field_db, false, 138, (nf) this, var24_ref_ml.field_lb);
                              ((nf) this).b(52, var25);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 2;
                              break L119;
                            }
                          }
                          L120: {
                            if (92 != var10) {
                              break L120;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(33, var8 + -32, var9, ((nf) this).h(-113), (nf) this, var12);
                              ((nf) this).a((byte) -119, var24_ref_ml);
                              var24_ref_ml = new ml(33, var8 + 32, var9, ((nf) this).h(-118), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -128, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 2;
                              break L120;
                            }
                          }
                          L121: {
                            if (90 != var10) {
                              break L121;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(31, var8, var9, ((nf) this).h(-80), (nf) this, var12);
                              ((nf) this).a((byte) -119, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L121;
                            }
                          }
                          L122: {
                            if (107 == var10) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(32, var8, var9, ((nf) this).h(-124), (nf) this, var12);
                              ((nf) this).a((byte) -128, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L122;
                            } else {
                              break L122;
                            }
                          }
                          L123: {
                            if (var10 == 56) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(4, var8, var9, ((nf) this).h(-120), (nf) this, var12);
                              ((nf) this).a((byte) -116, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L123;
                            } else {
                              break L123;
                            }
                          }
                          L124: {
                            if (var10 != 112) {
                              break L124;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(37, var8, var9, ((nf) this).h(-93), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -118, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L124;
                            }
                          }
                          L125: {
                            if (104 == var10) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(34, var8, var9, ((nf) this).h(-107), (nf) this, var12);
                              ((nf) this).a((byte) -121, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L125;
                            } else {
                              break L125;
                            }
                          }
                          L126: {
                            if (var10 == 64) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(6, var8, var9, ((nf) this).h(-122), (nf) this, var12);
                              ((nf) this).a((byte) -127, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              var25 = j.a(var24_ref_ml, var24_ref_ml.field_db, (byte) 17, (nf) this, var10, var24_ref_ml.field_lb, 55);
                              var25.field_H = 4;
                              ((nf) this).b(52, var25);
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L126;
                            } else {
                              break L126;
                            }
                          }
                          L127: {
                            if (var10 != 44) {
                              break L127;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(25, var8, var9, ((nf) this).h(-122), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -119, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L127;
                            }
                          }
                          L128: {
                            if (var10 == 57) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(5, var8, var9, ((nf) this).h(-98), (nf) this, var12);
                              ((nf) this).a((byte) -120, var24_ref_ml);
                              var8 = -1000;
                              var25 = j.a(var24_ref_ml, -480, (byte) -103, (nf) this, var10, var8, 71);
                              var25.field_u = 0;
                              var25.field_F = 0;
                              ((nf) this).b(52, var25);
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              ((nf) this).field_D = true;
                              break L128;
                            } else {
                              break L128;
                            }
                          }
                          L129: {
                            if (var10 == 42) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(3, var8, var9, ((nf) this).h(-91), (nf) this, var12);
                              ((nf) this).a((byte) -115, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L129;
                            } else {
                              break L129;
                            }
                          }
                          L130: {
                            if (65 == var10) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(7, var8, var9, ((nf) this).h(-82), (nf) this, var12);
                              ((nf) this).a((byte) -121, var24_ref_ml);
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L130;
                            } else {
                              break L130;
                            }
                          }
                          L131: {
                            if (var10 != 67) {
                              break L131;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(8, var8, var9, ((nf) this).h(-99), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -127, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L131;
                            }
                          }
                          L132: {
                            if (var10 != 6) {
                              break L132;
                            } else {
                              this.a((byte) 80, var10, var4);
                              ((nf) this).a((byte) -115, new ml(11, -32 + var8, var9, ((nf) this).h(-93), (nf) this, var12));
                              ((nf) this).a((byte) -120, new ml(11, var8, var9 + -16, ((nf) this).h(-84), (nf) this, var12));
                              ((nf) this).a((byte) -121, new ml(11, var8 + 32, var9, ((nf) this).h(-120), (nf) this, var12));
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L132;
                            }
                          }
                          L133: {
                            if (var10 == 32) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(1, var8, var9, ((nf) this).h(-77), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -115, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L133;
                            } else {
                              break L133;
                            }
                          }
                          L134: {
                            if (var10 != 33) {
                              break L134;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(2, var8, var9, ((nf) this).h(-78), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -120, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L134;
                            }
                          }
                          L135: {
                            if (var10 != 79) {
                              break L135;
                            } else {
                              this.a((byte) 80, var10, var4);
                              ((nf) this).a((byte) -116, new ml(10, var8 + -32, var9, ((nf) this).h(-76), (nf) this, var12));
                              ((nf) this).a((byte) -124, new ml(10, var8, -16 + var9, ((nf) this).h(-87), (nf) this, var12));
                              ((nf) this).a((byte) -127, new ml(10, var8 + 32, var9, ((nf) this).h(-108), (nf) this, var12));
                              var8 = -1000;
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L135;
                            }
                          }
                          L136: {
                            if (var10 == 77) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(9, var8, var9, ((nf) this).h(-83), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -124, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L136;
                            } else {
                              break L136;
                            }
                          }
                          L137: {
                            if (76 != var10) {
                              break L137;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_ml = new ml(17, var8, var9, ((nf) this).h(-112), (nf) this, var12);
                              var8 = -1000;
                              ((nf) this).a((byte) -118, var24_ref_ml);
                              ((nf) this).field_D = true;
                              ((nf) this).field_ob[var4] = ((nf) this).field_ob[var4] + 1;
                              break L137;
                            }
                          }
                          L138: {
                            if (var10 == 54) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) -106, (nf) this, var10, var12.field_lb, 72);
                              ((nf) this).b(52, var24_ref_mi);
                              break L138;
                            } else {
                              break L138;
                            }
                          }
                          L139: {
                            L140: {
                              if (var10 == 39) {
                                break L140;
                              } else {
                                if (var10 == 153) {
                                  break L140;
                                } else {
                                  break L139;
                                }
                              }
                            }
                            L141: {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) 37, (nf) this, var10, var12.field_lb, 32);
                              ((nf) this).b(52, var24_ref_mi);
                              if (153 == var10) {
                                var12.field_z = true;
                                var12.field_ib = 0;
                                break L141;
                              } else {
                                break L141;
                              }
                            }
                            ((nf) this).field_D = true;
                            break L139;
                          }
                          L142: {
                            if (var10 == 106) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) -110, (nf) this, var10, var12.field_lb, 136);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L142;
                            } else {
                              break L142;
                            }
                          }
                          L143: {
                            if (var10 == 8) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) -97, (nf) this, var10, var12.field_lb, 83);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L143;
                            } else {
                              break L143;
                            }
                          }
                          L144: {
                            if (var10 != 26) {
                              break L144;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) -113, (nf) this, var10, var12.field_lb, 22);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L144;
                            }
                          }
                          L145: {
                            if (var10 == 35) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, ((nf) this).field_H, (byte) -96, (nf) this, var10, var8, 29);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L145;
                            } else {
                              break L145;
                            }
                          }
                          L146: {
                            if (var10 != 73) {
                              break L146;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, -480, (byte) -96, (nf) this, var10, var8, 60);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L146;
                            }
                          }
                          L147: {
                            if (120 == var10) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) -101, (nf) this, var10, var12.field_lb, 77);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L147;
                            } else {
                              break L147;
                            }
                          }
                          L148: {
                            if (60 != var10) {
                              break L148;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_jb = 23;
                              var12.e((byte) 6);
                              ((nf) this).a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, -(var12.field_Y >> 1) + (var12.field_db - 10));
                              int discarded$18 = 0;
                              i.a(((nf) this).field_V, -var12.field_Y + var12.field_db, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, (nf) this, var12.field_w);
                              int discarded$19 = 86;
                              this.i();
                              var11 = 0;
                              ((nf) this).field_D = true;
                              var24_ref_mi = aj.a(var12, var12.field_db - var12.field_Y / 2, false, 103, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var24_ref_mi);
                              var24_ref_mi = j.a(var12, -(var12.field_Y / 2) + var12.field_db, (byte) -107, (nf) this, var10, var12.field_lb, 111);
                              var24_ref_mi.field_H = 4;
                              ((nf) this).b(52, var24_ref_mi);
                              break L148;
                            }
                          }
                          L149: {
                            if (var10 == 81) {
                              this.a((byte) 80, var10, var4);
                              var12.field_jb = 24;
                              var12.e((byte) 6);
                              ((nf) this).a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, -10 + (var12.field_db + -(var12.field_Y >> 1)));
                              int discarded$20 = 0;
                              i.a(((nf) this).field_V, var12.field_db + -var12.field_Y, var12.field_lb - (var12.field_Y >> 1), (byte) 0, (nf) this, var12.field_w);
                              int discarded$21 = 86;
                              this.i();
                              ((nf) this).field_D = true;
                              var11 = 0;
                              var24_ref_mi = aj.a(var12, -(var12.field_Y / 2) + var12.field_db, false, 108, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var24_ref_mi);
                              break L149;
                            } else {
                              break L149;
                            }
                          }
                          L150: {
                            if (91 != var10) {
                              break L150;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_jb = 35;
                              var12.e((byte) 6);
                              ((nf) this).a(var12.field_lb, (var12.field_Y >> 1) - -10, (byte) 51, -10 + (-(var12.field_Y >> 1) + var12.field_db));
                              int discarded$22 = 0;
                              i.a(((nf) this).field_V, -var12.field_Y + var12.field_db, var12.field_lb - (var12.field_Y >> 1), (byte) 0, (nf) this, var12.field_w);
                              int discarded$23 = 86;
                              this.i();
                              ((nf) this).field_D = true;
                              var11 = 0;
                              var24_ref_mi = aj.a(var12, var12.field_db + -(var12.field_Y / 2), false, 154, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var24_ref_mi);
                              break L150;
                            }
                          }
                          L151: {
                            if (var10 == 61) {
                              this.a((byte) 80, var10, var4);
                              var24 = gf.a((var9 - -480) * 32 / 4, -266740663);
                              var25_int = -96 + 192 * (1 & var8);
                              var26 = 1;
                              var27 = 0;
                              L152: while (true) {
                                if (var27 >= 7) {
                                  ((nf) this).field_D = true;
                                  break L151;
                                } else {
                                  var26 = -var26;
                                  var28 = j.a(var12, -544, (byte) 55, (nf) this, var10, -(var24 * (var25_int * var26) / 16) + (48 * var27 - 144 + var8), 50);
                                  var28.field_u = var26 * var25_int;
                                  var28.field_F = 0;
                                  ((nf) this).b(52, var28);
                                  var27++;
                                  continue L152;
                                }
                              }
                            } else {
                              break L151;
                            }
                          }
                          L153: {
                            if (var10 == 68) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var9, (byte) -104, (nf) this, var10, var8, 55);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L153;
                            } else {
                              break L153;
                            }
                          }
                          L154: {
                            if (var10 == 9) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, -24 + var9, (byte) 121, (nf) this, var10, var8, 3);
                              ((nf) this).b(52, var24_ref_mi);
                              var24_ref_mi = j.a(var12, -11 + var9, (byte) -122, (nf) this, var10, -8 + var8, 3);
                              ((nf) this).b(52, var24_ref_mi);
                              var24_ref_mi = j.a(var12, var9 + -12, (byte) -114, (nf) this, var10, 8 + var8, 3);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L154;
                            } else {
                              break L154;
                            }
                          }
                          L155: {
                            if (var10 != 7) {
                              break L155;
                            } else {
                              this.a((byte) 80, var10, var4);
                              n.field_d.a((byte) 96, ((nf) this).field_i);
                              var24_ref_ml = (ml) (Object) n.field_d.b(-74);
                              L156: while (true) {
                                if (var24_ref_ml == null) {
                                  ((nf) this).field_D = true;
                                  break L155;
                                } else {
                                  L157: {
                                    if (var24_ref_ml.field_jb == 11) {
                                      var25 = aj.a(((nf) this).a(var24_ref_ml.field_u, true), var24_ref_ml.field_db, false, 101, (nf) this, var24_ref_ml.field_lb);
                                      ((nf) this).b(52, var25);
                                      var25 = j.a(var12, var24_ref_ml.field_db, (byte) 38, (nf) this, var10, var24_ref_ml.field_lb, 74);
                                      var25.field_y = -(var24_ref_ml.field_ib / 2) - -20;
                                      var25.field_u = 0;
                                      var25.field_F = -var24_ref_ml.field_ib;
                                      ((nf) this).b(52, var25);
                                      var24_ref_ml.field_ib = 0;
                                      var24_ref_ml.d(var4, 116);
                                      break L157;
                                    } else {
                                      break L157;
                                    }
                                  }
                                  var24_ref_ml = (ml) (Object) n.field_d.d(-18502);
                                  continue L156;
                                }
                              }
                            }
                          }
                          L158: {
                            if (var10 != 95) {
                              break L158;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) 95, (nf) this, var10, var12.field_lb, 127);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L158;
                            }
                          }
                          L159: {
                            if (var10 != 94) {
                              break L159;
                            } else {
                              this.a((byte) 80, var10, var4);
                              n.field_d.a((byte) 83, ((nf) this).field_Kb);
                              var24_ref_mi = (mi) (Object) n.field_d.b(-105);
                              L160: while (true) {
                                if (var24_ref_mi == null) {
                                  var24_ref_mi = j.a(var12, 0, (byte) -125, (nf) this, var10, var8, 126);
                                  ((nf) this).b(52, var24_ref_mi);
                                  ((nf) this).field_D = true;
                                  break L159;
                                } else {
                                  L161: {
                                    if (var24_ref_mi.field_I != 126) {
                                      break L161;
                                    } else {
                                      var24_ref_mi.f(0);
                                      break L161;
                                    }
                                  }
                                  L162: {
                                    if (var24_ref_mi.field_I == 117) {
                                      var24_ref_mi.a(0, 0, 16, 8);
                                      break L162;
                                    } else {
                                      break L162;
                                    }
                                  }
                                  var24_ref_mi = (mi) (Object) n.field_d.d(-18502);
                                  continue L160;
                                }
                              }
                            }
                          }
                          L163: {
                            if (var10 == 148) {
                              this.a((byte) 80, var10, var4);
                              n.field_d.a((byte) 67, ((nf) this).field_Kb);
                              var24_ref_mi = (mi) (Object) n.field_d.b(-57);
                              L164: while (true) {
                                if (var24_ref_mi == null) {
                                  var24_ref_mi = j.a(var12, var9, (byte) -105, (nf) this, var10, var8, 123);
                                  ((nf) this).b(52, var24_ref_mi);
                                  ((nf) this).field_D = true;
                                  break L163;
                                } else {
                                  L165: {
                                    if (var24_ref_mi.field_I != 123) {
                                      break L165;
                                    } else {
                                      var24_ref_mi.f(0);
                                      break L165;
                                    }
                                  }
                                  var24_ref_mi = (mi) (Object) n.field_d.d(-18502);
                                  continue L164;
                                }
                              }
                            } else {
                              break L163;
                            }
                          }
                          L166: {
                            if (var10 == 93) {
                              this.a((byte) 80, var10, var4);
                              n.field_d.a((byte) 40, ((nf) this).field_Kb);
                              var24 = 0;
                              var25 = (mi) (Object) n.field_d.b(-83);
                              L167: while (true) {
                                if (var25 == null) {
                                  n.field_d.a((byte) 69, ((nf) this).field_i);
                                  var25_ref = (ml) (Object) n.field_d.b(-50);
                                  L168: while (true) {
                                    if (var25_ref == null) {
                                      ((nf) this).field_D = true;
                                      if (var24 >= 4) {
                                        break L166;
                                      } else {
                                        break L166;
                                      }
                                    } else {
                                      if (var25_ref.field_jb == 33) {
                                        var14 = (var9 - var25_ref.field_db << 4) - -256;
                                        var13 = -var25_ref.field_lb + var8 << 4;
                                        var26_double = 64.0;
                                        var28_double = (double)(var13 * (4 * var13)) / (var26_double * (var26_double * 2.0));
                                        var30 = (double)var13;
                                        var32 = (double)(var13 * var13 * 4) / (var26_double * (2.0 * var26_double)) - (double)var14;
                                        L169: while (true) {
                                          L170: {
                                            if (0.0 == var28_double) {
                                              break L170;
                                            } else {
                                              if (0.0 <= var30 * var30 - var32 * (var28_double * 4.0)) {
                                                break L170;
                                              } else {
                                                if (768.0 <= var26_double) {
                                                  break L170;
                                                } else {
                                                  var26_double = var26_double + 8.0;
                                                  var28_double = (double)(var13 * var13 * 4) / (2.0 * var26_double * var26_double);
                                                  var30 = (double)var13;
                                                  var32 = (double)(-var14) + (double)(var13 * (4 * var13)) / (var26_double * (2.0 * var26_double));
                                                  continue L169;
                                                }
                                              }
                                            }
                                          }
                                          L171: {
                                            if (var28_double == 0.0) {
                                              break L171;
                                            } else {
                                              if (0.0 <= var30 * var30 - var28_double * 4.0 * var32) {
                                                L172: {
                                                  var34 = (Math.sqrt(-(var32 * (var28_double * 4.0)) + var30 * var30) + -var30) / (var28_double * 2.0);
                                                  var36 = (-var30 - Math.sqrt(-(var28_double * 4.0 * var32) + var30 * var30)) / (var28_double * 2.0);
                                                  if (Math.abs(var34) <= Math.abs(var36)) {
                                                    break L172;
                                                  } else {
                                                    var34 = var36;
                                                    break L172;
                                                  }
                                                }
                                                L173: {
                                                  var38 = var26_double * var26_double / (1.0 + var34 * var34);
                                                  var40 = var26_double * var26_double / (1.0 / (var34 * var34) + 1.0);
                                                  var42 = (int)Math.sqrt(var38);
                                                  var43 = (int)Math.sqrt(var40);
                                                  if (var42 <= 0) {
                                                    break L173;
                                                  } else {
                                                    if (var13 < 0) {
                                                      var42 = -var42;
                                                      break L173;
                                                    } else {
                                                      break L173;
                                                    }
                                                  }
                                                }
                                                L174: {
                                                  if (0.0 < var34) {
                                                    if (0 <= var13) {
                                                      break L174;
                                                    } else {
                                                      var43 = -var43;
                                                      break L174;
                                                    }
                                                  } else {
                                                    if (var13 <= 0) {
                                                      break L174;
                                                    } else {
                                                      var43 = -var43;
                                                      break L174;
                                                    }
                                                  }
                                                }
                                                L175: {
                                                  var44 = (int)((double)((4 + (var25_ref.field_Y / 2 + var17)) * var42) / var26_double + (double)var25_ref.field_lb);
                                                  var45 = (int)((double)(-(var12.field_Y / 2)) + ((double)(var43 * (var17 + (var25_ref.field_Y / 2 - -4))) / var26_double + (double)var25_ref.field_db));
                                                  var46 = j.a(((nf) this).a(var25_ref.field_u, true), var45, (byte) -95, (nf) this, var10, var44, 125);
                                                  ((nf) this).b(52, var46);
                                                  var46.field_y = 10;
                                                  if (((nf) this).field_x[var25_ref.field_u] != 6) {
                                                    break L175;
                                                  } else {
                                                    var46.field_y = var46.field_y - ((nf) this).field_X[var25_ref.field_u] / 2;
                                                    if (((nf) this).field_X[var25_ref.field_u] == 100) {
                                                      var24++;
                                                      break L175;
                                                    } else {
                                                      break L175;
                                                    }
                                                  }
                                                }
                                                var46.field_u = var42;
                                                var46.field_F = var43;
                                                break L171;
                                              } else {
                                                break L171;
                                              }
                                            }
                                          }
                                          var25_ref = (ml) (Object) n.field_d.d(-18502);
                                          continue L168;
                                        }
                                      } else {
                                        var25_ref = (ml) (Object) n.field_d.d(-18502);
                                        continue L168;
                                      }
                                    }
                                  }
                                } else {
                                  L176: {
                                    if (var25.field_I == 123) {
                                      var25.f(0);
                                      break L176;
                                    } else {
                                      break L176;
                                    }
                                  }
                                  var25 = (mi) (Object) n.field_d.d(-18502);
                                  continue L167;
                                }
                              }
                            } else {
                              break L166;
                            }
                          }
                          L177: {
                            if (var10 == 70) {
                              this.a((byte) 80, var10, var4);
                              n.field_d.a((byte) 99, ((nf) this).field_i);
                              var24_ref_ml = (ml) (Object) n.field_d.b(-113);
                              L178: while (true) {
                                if (var24_ref_ml == null) {
                                  ((nf) this).field_D = true;
                                  break L177;
                                } else {
                                  L179: {
                                    if (var24_ref_ml.field_s == null) {
                                      break L179;
                                    } else {
                                      if (var24_ref_ml.field_U) {
                                        break L179;
                                      } else {
                                        if (var24_ref_ml.field_jb != 12) {
                                          var25 = aj.a(((nf) this).a(var24_ref_ml.field_u, true), var24_ref_ml.field_db, false, 103, (nf) this, var24_ref_ml.field_lb);
                                          ((nf) this).b(52, var25);
                                          var25 = j.a(var12, var24_ref_ml.field_db, (byte) 40, (nf) this, var10, var24_ref_ml.field_lb, 55);
                                          ((nf) this).b(52, var25);
                                          var24_ref_ml.field_ib = 0;
                                          var24_ref_ml.d(var4, 24);
                                          break L179;
                                        } else {
                                          break L179;
                                        }
                                      }
                                    }
                                  }
                                  var24_ref_ml = (ml) (Object) n.field_d.d(-18502);
                                  continue L178;
                                }
                              }
                            } else {
                              break L177;
                            }
                          }
                          L180: {
                            if (83 != var10) {
                              break L180;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_eb = -50;
                              var12.field_jb = 18;
                              var12.field_z = true;
                              var24_ref_mi = aj.a(var12, var12.field_db - (var12.field_Y >> 1), false, 108, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L180;
                            }
                          }
                          L181: {
                            if (var10 == 71) {
                              L182: {
                                this.a((byte) 80, var10, var4);
                                var12.field_U = true;
                                var12.field_jb = 16;
                                if (var12.field_I == null) {
                                  break L182;
                                } else {
                                  var12.field_I.a();
                                  de.d(0, 0, var12.field_I.field_n, var12.field_I.field_w, 0);
                                  if (null == tk.field_x) {
                                    break L182;
                                  } else {
                                    L183: {
                                      L184: {
                                        var48 = new int[]{255, 0, 0};
                                        var24_ref_int__ = var48;
                                        var49 = new int[]{0, 255, 0};
                                        var25_array = var49;
                                        var50 = new int[]{0, 0, 255};
                                        var26_ref_int__ = var50;
                                        var51 = new int[]{255, 255, 255};
                                        var27_ref_int__ = var51;
                                        var28_int = var12.field_u;
                                        if (0 == var28_int) {
                                          break L184;
                                        } else {
                                          if (var28_int == 3) {
                                            break L184;
                                          } else {
                                            if (var28_int != 4) {
                                              break L183;
                                            } else {
                                              break L184;
                                            }
                                          }
                                        }
                                      }
                                      var48[1] = 255;
                                      var48[2] = 255;
                                      break L183;
                                    }
                                    L185: {
                                      L186: {
                                        if (var28_int == 1) {
                                          break L186;
                                        } else {
                                          if (var28_int == 3) {
                                            break L186;
                                          } else {
                                            if (var28_int != 5) {
                                              break L185;
                                            } else {
                                              break L186;
                                            }
                                          }
                                        }
                                      }
                                      var49[2] = 255;
                                      var49[0] = 255;
                                      break L185;
                                    }
                                    L187: {
                                      L188: {
                                        if (var28_int == 2) {
                                          break L188;
                                        } else {
                                          if (4 == var28_int) {
                                            break L188;
                                          } else {
                                            if (var28_int != 5) {
                                              break L187;
                                            } else {
                                              break L188;
                                            }
                                          }
                                        }
                                      }
                                      var50[0] = 255;
                                      var50[2] = 255;
                                      break L187;
                                    }
                                    L189: {
                                      if (((nf) this).field_N != null) {
                                        var24_ref_int__[0] = ((nf) this).field_N[var28_int][0];
                                        var24_ref_int__[1] = ((nf) this).field_N[var28_int][1];
                                        var24_ref_int__[2] = ((nf) this).field_N[var28_int][2];
                                        var25_array[0] = ((nf) this).field_N[var28_int][3];
                                        var25_array[1] = ((nf) this).field_N[var28_int][4];
                                        var25_array[2] = ((nf) this).field_N[var28_int][5];
                                        var26_ref_int__[0] = ((nf) this).field_N[var28_int][6];
                                        var26_ref_int__[1] = ((nf) this).field_N[var28_int][7];
                                        var26_ref_int__[2] = ((nf) this).field_N[var28_int][8];
                                        var27_ref_int__[0] = ((nf) this).field_N[var28_int][9];
                                        var27_ref_int__[1] = ((nf) this).field_N[var28_int][10];
                                        var27_ref_int__[2] = ((nf) this).field_N[var28_int][11];
                                        break L189;
                                      } else {
                                        break L189;
                                      }
                                    }
                                    var29 = new qb(64, 96);
                                    var29.a();
                                    pc.a(var50, 16, var51, var48, (byte) 80, var49, tk.field_x[2], 0);
                                    var12.field_I.f();
                                    var12.field_I.a();
                                    de.d(0, 0, 32, 48, 0);
                                    var29.a(16, 24, 0, 2048);
                                    var12.field_I.e();
                                    break L182;
                                  }
                                }
                              }
                              var24_ref_mi = j.a(var12, var12.field_db, (byte) 32, (nf) this, var10, var12.field_lb, 111);
                              var24_ref_mi.field_H = 4;
                              ((nf) this).b(52, var24_ref_mi);
                              var24_ref_mi = aj.a((ml) null, var12.field_db + -(var12.field_Y / 2), false, 103, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L181;
                            } else {
                              break L181;
                            }
                          }
                          L190: {
                            if (45 != var10) {
                              break L190;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_z = true;
                              var12.field_eb = -50;
                              var12.field_jb = 19;
                              break L190;
                            }
                          }
                          L191: {
                            if (var10 != 58) {
                              break L191;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24 = gf.a((480 + var9) * 32 / 4, -266740663);
                              var25_int = -96 + (var8 & 1) * 192;
                              var26_ref_mi = j.a(var12, -544, (byte) -128, (nf) this, var10, var8 - var24 * var25_int / 16, 49);
                              var26_ref_mi.field_u = var25_int;
                              var26_ref_mi.field_F = 0;
                              ((nf) this).b(52, var26_ref_mi);
                              ((nf) this).field_D = true;
                              break L191;
                            }
                          }
                          L192: {
                            if (var10 == 17) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, var9, (byte) 103, (nf) this, var10, var8, 15);
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L192;
                            } else {
                              break L192;
                            }
                          }
                          L193: {
                            if (var10 == 34) {
                              this.a((byte) 80, var10, var4);
                              var24 = gf.a((var9 + 480) * 32 / 4, -266740663);
                              var25_int = (1 & var8) * 192 - 96;
                              var26_ref_mi = j.a(var12, -544, (byte) -119, (nf) this, var10, var8 + -(var24 * var25_int / 16), 28);
                              var26_ref_mi.field_u = var25_int;
                              var26_ref_mi.field_F = 0;
                              ((nf) this).b(52, var26_ref_mi);
                              ((nf) this).field_D = true;
                              break L193;
                            } else {
                              break L193;
                            }
                          }
                          L194: {
                            if (var10 != 20) {
                              break L194;
                            } else {
                              L195: {
                                this.a((byte) 80, var10, var4);
                                var24 = gf.a((var9 + 480) * 32 / 4, -266740663);
                                var25_int = (1 & var8) * 192 - 96;
                                var26 = 5;
                                if (0 == ((nf) this).field_x[var4]) {
                                  var26 = var26 + ((nf) this).field_X[var4] / 40;
                                  break L195;
                                } else {
                                  break L195;
                                }
                              }
                              var27 = 0;
                              L196: while (true) {
                                if (~var26 >= ~var27) {
                                  ((nf) this).field_D = true;
                                  break L194;
                                } else {
                                  var28 = j.a(var12, -544, (byte) -94, (nf) this, var10, -(var24 * var25_int / 16) + (64 * var27 - 128 + var8), 17);
                                  var28.field_u = var25_int;
                                  var28.field_F = 0;
                                  ((nf) this).b(52, var28);
                                  var27++;
                                  continue L196;
                                }
                              }
                            }
                          }
                          L197: {
                            if (var10 != 105) {
                              break L197;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24 = gf.a((15360 + var9 * 32) / 4, -266740663);
                              var25_int = -96 + 192 * (var8 & 1);
                              var26 = 0;
                              L198: while (true) {
                                if (var26 >= 5) {
                                  ((nf) this).field_D = true;
                                  break L197;
                                } else {
                                  var27_ref_mi = j.a(var12, -544, (byte) 17, (nf) this, var10, var8 - (192 + -(96 * var26)) - var24 * var25_int / 16, 143);
                                  var27_ref_mi.field_u = var25_int;
                                  var27_ref_mi.field_F = 0;
                                  ((nf) this).b(52, var27_ref_mi);
                                  var26++;
                                  continue L198;
                                }
                              }
                            }
                          }
                          L199: {
                            if (var10 == 21) {
                              L200: {
                                this.a((byte) 80, var10, var4);
                                var24 = gf.a(32 * (var9 - -480) / 4, -266740663);
                                var25_int = -96 + 192 * (1 & var8);
                                var26 = 5;
                                if (((nf) this).field_x[var4] == 0) {
                                  var26 = var26 + ((nf) this).field_X[var4] / 40;
                                  break L200;
                                } else {
                                  break L200;
                                }
                              }
                              var27 = 0;
                              L201: while (true) {
                                if (~var26 >= ~var27) {
                                  ((nf) this).field_D = true;
                                  break L199;
                                } else {
                                  var28 = j.a(var12, -544, (byte) -128, (nf) this, var10, var8 - (-(64 * (-2 + var27)) + var25_int * var24 / 16), 18);
                                  ((nf) this).b(52, var28);
                                  var27++;
                                  continue L201;
                                }
                              }
                            } else {
                              break L199;
                            }
                          }
                          L202: {
                            if (var10 != 22) {
                              break L202;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, ((nf) this).field_H, (byte) -109, (nf) this, var10, var8, 19);
                              var24_ref_mi.field_F = 0;
                              var24_ref_mi.field_u = 0;
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L202;
                            }
                          }
                          L203: {
                            if (var10 != 75) {
                              break L203;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, -480, (byte) -98, (nf) this, var10, var8, 62);
                              var24_ref_mi.field_u = 0;
                              var24_ref_mi.field_F = 0;
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L203;
                            }
                          }
                          L204: {
                            if (var10 == 53) {
                              this.a((byte) 80, var10, var4);
                              var24_ref_mi = j.a(var12, -480, (byte) 30, (nf) this, var10, var8, 47);
                              var24_ref_mi.field_u = 0;
                              var24_ref_mi.field_F = 0;
                              ((nf) this).b(52, var24_ref_mi);
                              ((nf) this).field_D = true;
                              break L204;
                            } else {
                              break L204;
                            }
                          }
                          L205: {
                            var24 = 0;
                            if (var10 == 100) {
                              this.a((byte) 80, var10, var4);
                              var25 = j.a(var12, -480, (byte) -120, (nf) this, var10, var8, 141);
                              var25.field_u = 0;
                              var25.field_F = 0;
                              ((nf) this).b(52, var25);
                              ((nf) this).field_D = true;
                              break L205;
                            } else {
                              break L205;
                            }
                          }
                          L206: {
                            if (111 == var10) {
                              this.a((byte) 80, var10, var4);
                              var25 = j.a(var12, -480, (byte) 124, (nf) this, var10, var8, 160);
                              var25.field_F = 0;
                              var25.field_u = 0;
                              ((nf) this).b(52, var25);
                              ((nf) this).field_D = true;
                              break L206;
                            } else {
                              break L206;
                            }
                          }
                          L207: {
                            if (var10 != 101) {
                              break L207;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var25 = j.a(var12, -480, (byte) 118, (nf) this, var10, var8, 142);
                              var25.field_u = 0;
                              var25.field_F = 0;
                              ((nf) this).b(52, var25);
                              ((nf) this).field_D = true;
                              break L207;
                            }
                          }
                          L208: {
                            if (var10 != 97) {
                              break L208;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var25 = j.a(var12, ((nf) this).field_H, (byte) -93, (nf) this, var10, var8, 134);
                              var25.field_u = 0;
                              var25.field_F = 0;
                              ((nf) this).b(52, var25);
                              ((nf) this).field_D = true;
                              break L208;
                            }
                          }
                          L209: {
                            if (46 == var10) {
                              this.a((byte) 80, var10, var4);
                              var25 = j.a(var12, -480, (byte) 29, (nf) this, var10, var8, 36);
                              var25.field_F = 0;
                              var25.field_u = 0;
                              ((nf) this).b(52, var25);
                              ((nf) this).field_D = true;
                              break L209;
                            } else {
                              break L209;
                            }
                          }
                          L210: {
                            if (var10 != 5) {
                              break L210;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var25 = aj.a(var12, var9, false, 101, (nf) this, var8);
                              ((nf) this).b(52, var25);
                              var25 = aj.a(var12, -32 + -var12.field_Y + var12.field_db, false, 101, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var25);
                              var25 = (mi) (Object) ((nf) this).field_Kb.b(12623);
                              L211: while (true) {
                                if (var25 == null) {
                                  var25 = j.a(var12, -32 + (var12.field_db + -var12.field_Y), (byte) 29, (nf) this, var10, var12.field_lb, 149);
                                  var25.field_F = -var12.field_db - (-var12.field_Y - 32) + var9;
                                  var25.field_u = var8 + -var12.field_lb;
                                  ((nf) this).b(52, var25);
                                  ((nf) this).field_D = true;
                                  break L210;
                                } else {
                                  L212: {
                                    if (var25.field_I != 149) {
                                      break L212;
                                    } else {
                                      if (var12 != var25.field_t) {
                                        break L212;
                                      } else {
                                        var25.f(0);
                                        break L212;
                                      }
                                    }
                                  }
                                  var25 = (mi) (Object) ((nf) this).field_Kb.a(0);
                                  continue L211;
                                }
                              }
                            }
                          }
                          L213: {
                            if (var10 != 4) {
                              break L213;
                            } else {
                              L214: {
                                if (~var12.field_db <= ~((nf) this).field_H) {
                                  var25_int = ((nf) this).a(4, var4, -770226943);
                                  if (0 < var25_int) {
                                    break L214;
                                  } else {
                                    L215: {
                                      var26 = var12.field_ib / 3;
                                      if (5 > var26) {
                                        var26 = 5;
                                        break L215;
                                      } else {
                                        break L215;
                                      }
                                    }
                                    var12.field_ib = var12.field_ib - var26;
                                    if (var12.field_ib >= 1) {
                                      break L214;
                                    } else {
                                      var12.field_ib = 1;
                                      break L214;
                                    }
                                  }
                                } else {
                                  break L214;
                                }
                              }
                              L216: {
                                var25 = aj.a(var12, var9, false, 101, (nf) this, var8);
                                ((nf) this).b(52, var25);
                                var25 = aj.a(var12, var12.field_db, false, 101, (nf) this, var12.field_lb);
                                ((nf) this).b(52, var25);
                                this.a((byte) 80, var10, var4);
                                ((nf) this).a(var12, 0);
                                if (var12.field_jb == 20) {
                                  break L216;
                                } else {
                                  L217: {
                                    var12.field_q = 0;
                                    if (var12.g((byte) 111)) {
                                      var12.field_db = var12.field_db - var12.field_Y / 2;
                                      var12.field_q = 0;
                                      var12.field_Y = 32;
                                      var12.field_R = var12.field_db << 4;
                                      var12.field_jb = 0;
                                      var12.field_w = new qb(var12.field_Y, var12.field_Y);
                                      var12.field_w.a();
                                      de.i(var12.field_Y >> 1, var12.field_Y >> 1, var12.field_Y >> 1, 16777215);
                                      break L217;
                                    } else {
                                      break L217;
                                    }
                                  }
                                  if (var12.field_jb != 19) {
                                    break L216;
                                  } else {
                                    var12.field_jb = 0;
                                    break L216;
                                  }
                                }
                              }
                              var12.field_db = var9;
                              var12.field_lb = var8;
                              var11 = 0;
                              var12.field_z = true;
                              ((nf) this).field_D = true;
                              var12.field_R = var12.field_db << 4;
                              var12.field_eb = 0;
                              var12.field_X = var12.field_lb << 4;
                              var12.field_kb = 0;
                              break L213;
                            }
                          }
                          L218: {
                            if (var10 == 150) {
                              L219: {
                                var25 = aj.a(var12, var12.field_db, false, 137, (nf) this, var8);
                                ((nf) this).b(52, var25);
                                var25 = aj.a(var12, var12.field_db, false, 137, (nf) this, var12.field_lb);
                                ((nf) this).b(52, var25);
                                this.a((byte) 80, var10, var4);
                                ((nf) this).a(var12, 0);
                                if (!var12.x(32)) {
                                  break L219;
                                } else {
                                  if (var12.field_s.field_q <= 0) {
                                    ((nf) this).a(var12.field_s, 0);
                                    var13 = -var12.field_lb + var12.field_s.field_lb;
                                    var14 = -(var12.field_s.field_Y / 2) + (var12.field_s.field_db + -var12.field_db + var12.field_Y / 2);
                                    if (var13 * var13 - -(var14 * var14) >= (var12.field_Y + var12.field_s.field_Y) * (var12.field_Y - -var12.field_s.field_Y) >> 2) {
                                      break L219;
                                    } else {
                                      L220: {
                                        var12.field_s.field_R = var12.field_R + -(var12.field_Y << 3);
                                        var12.field_s.field_X = (var8 << 4) + -(var12.field_E * (var12.field_Y << 1));
                                        if (32 >= var12.field_s.field_Y) {
                                          break L220;
                                        } else {
                                          var12.field_s.field_R = var12.field_s.field_R + 192;
                                          var12.field_s.field_X = var12.field_s.field_X + 0 * var12.field_E;
                                          break L220;
                                        }
                                      }
                                      var12.field_db = var12.field_R >> 4;
                                      var12.field_lb = var12.field_X >> 4;
                                      var12.field_s.field_E = var12.field_E;
                                      var12.field_s.field_db = var12.field_s.field_R >> 4;
                                      var12.field_s.field_lb = var12.field_s.field_X >> 4;
                                      break L219;
                                    }
                                  } else {
                                    break L219;
                                  }
                                }
                              }
                              var12.field_lb = var8;
                              var12.field_db = ((nf) this).field_H;
                              var12.field_z = true;
                              var12.field_eb = 0;
                              ((nf) this).field_D = true;
                              var12.field_kb = 0;
                              var12.field_R = var12.field_db << 4;
                              var12.field_X = var12.field_lb << 4;
                              var11 = 0;
                              break L218;
                            } else {
                              break L218;
                            }
                          }
                          L221: {
                            if (var10 == 139) {
                              var12.field_ib = 0;
                              var12.field_x = 1;
                              var25 = aj.a(var12, var12.field_db, false, 101, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var25);
                              var25.a(0, 0, 32, 8);
                              break L221;
                            } else {
                              break L221;
                            }
                          }
                          L222: {
                            if (var10 != 152) {
                              break L222;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_z = true;
                              var12.field_jb = 0;
                              break L222;
                            }
                          }
                          L223: {
                            if (var10 != 132) {
                              break L223;
                            } else {
                              L224: {
                                var25 = aj.a(var12, var12.field_db, false, 108, (nf) this, var12.field_lb);
                                ((nf) this).b(52, var25);
                                var26 = var12.field_lb;
                                var27 = var12.field_db;
                                if (var26 >= 96) {
                                  break L224;
                                } else {
                                  var26 = 96;
                                  break L224;
                                }
                              }
                              L225: {
                                if (var27 < 128) {
                                  var27 = 128;
                                  break L225;
                                } else {
                                  break L225;
                                }
                              }
                              L226: {
                                if (~(((nf) this).field_y - 96) > ~var26) {
                                  var26 = ((nf) this).field_y + -96;
                                  break L226;
                                } else {
                                  break L226;
                                }
                              }
                              var25.field_v = var26;
                              var25.field_G = var27;
                              var25.a(0, 0, 64, 8);
                              var25.field_v = var12.field_lb;
                              var25.field_G = var12.field_db;
                              n.field_d.a((byte) 83, ((nf) this).field_i);
                              var28_ref = (ml) (Object) n.field_d.b(-44);
                              L227: while (true) {
                                if (var28_ref == null) {
                                  ((nf) this).field_D = true;
                                  var12.field_ib = 0;
                                  var12.field_x = 1;
                                  break L223;
                                } else {
                                  L228: {
                                    if (var28_ref == var12) {
                                      break L228;
                                    } else {
                                      if (var28_ref.field_u != var4) {
                                        break L228;
                                      } else {
                                        if (12 == var28_ref.field_jb) {
                                          break L228;
                                        } else {
                                          var14 = var28_ref.field_db - var9;
                                          var13 = var28_ref.field_lb - var8;
                                          if (Math.abs(var13) >= 64) {
                                            break L228;
                                          } else {
                                            if (Math.abs(var14) < 64) {
                                              L229: {
                                                if (var28_ref.field_jb != 20) {
                                                  var28_ref.field_q = 0;
                                                  break L229;
                                                } else {
                                                  break L229;
                                                }
                                              }
                                              ((nf) this).a(var28_ref, 0);
                                              var28_ref.field_lb = var13 + var26;
                                              var28_ref.field_db = var14 + var27;
                                              var28_ref.field_z = true;
                                              var28_ref.field_X = var28_ref.field_lb << 4;
                                              var28_ref.field_R = var28_ref.field_db << 4;
                                              break L228;
                                            } else {
                                              break L228;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var28_ref = (ml) (Object) n.field_d.d(-18502);
                                  continue L227;
                                }
                              }
                            }
                          }
                          L230: {
                            if (var10 == 154) {
                              L231: {
                                var25 = aj.a(var12, var12.field_db, false, 86, (nf) this, var12.field_lb);
                                ((nf) this).b(52, var25);
                                ((nf) this).a(var12.field_s, 0);
                                if (~var12.field_s.i((byte) -3) >= ~((nf) this).field_H) {
                                  break L231;
                                } else {
                                  ((nf) this).field_D = true;
                                  break L231;
                                }
                              }
                              var12.field_s.field_R = var12.field_R;
                              var12.field_s.field_lb = var12.field_lb;
                              var12.field_z = true;
                              var12.field_s.field_db = var12.field_db;
                              var12.field_s.field_X = var12.field_X;
                              var12.field_s.field_z = true;
                              var12.field_x = 1;
                              var12.field_ib = 0;
                              break L230;
                            } else {
                              break L230;
                            }
                          }
                          L232: {
                            if (var10 == 2) {
                              this.a((byte) 80, var10, var4);
                              var12.field_jb = 20;
                              var12.e((byte) 6);
                              ((nf) this).a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, var12.field_db + (-(var12.field_Y >> 1) + -10));
                              int discarded$24 = 0;
                              i.a(((nf) this).field_V, var12.field_db - var12.field_Y, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, (nf) this, var12.field_w);
                              int discarded$25 = 86;
                              this.i();
                              var11 = 0;
                              ((nf) this).field_D = true;
                              var25 = aj.a(var12, -(var12.field_Y / 2) + var12.field_db, false, 101, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var25);
                              break L232;
                            } else {
                              break L232;
                            }
                          }
                          L233: {
                            if (var10 != 114) {
                              break L233;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_jb = 38;
                              var12.e((byte) 6);
                              ((nf) this).a(var12.field_lb, (var12.field_Y >> 1) - -10, (byte) 51, -10 + (-(var12.field_Y >> 1) + var12.field_db));
                              int discarded$26 = 0;
                              i.a(((nf) this).field_V, var12.field_db + -var12.field_Y, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, (nf) this, var12.field_w);
                              int discarded$27 = 86;
                              this.i();
                              var11 = 0;
                              ((nf) this).field_D = true;
                              var25 = aj.a(var12, -(var12.field_Y / 2) + var12.field_db, false, 86, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var25);
                              break L233;
                            }
                          }
                          L234: {
                            if (55 != var10) {
                              break L234;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_jb = 22;
                              var12.e((byte) 6);
                              ((nf) this).a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, var12.field_db + (-(var12.field_Y >> 1) + -10));
                              int discarded$28 = 0;
                              i.a(((nf) this).field_V, -var12.field_Y + var12.field_db, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, (nf) this, var12.field_w);
                              int discarded$29 = 86;
                              this.i();
                              var11 = 0;
                              ((nf) this).field_D = true;
                              var25 = aj.a(var12, var12.field_db + -(var12.field_Y / 2), false, 94, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var25);
                              break L234;
                            }
                          }
                          L235: {
                            if (var10 != 31) {
                              break L235;
                            } else {
                              this.a((byte) 80, var10, var4);
                              var12.field_jb = 21;
                              var12.e((byte) 6);
                              ((nf) this).a(var12.field_lb, 10 + (var12.field_Y >> 1), (byte) 51, -(var12.field_Y >> 1) + var12.field_db - 10);
                              int discarded$30 = 0;
                              i.a(((nf) this).field_V, var12.field_db - var12.field_Y, -(var12.field_Y >> 1) + var12.field_lb, (byte) 0, (nf) this, var12.field_w);
                              int discarded$31 = 86;
                              this.i();
                              ((nf) this).field_D = true;
                              var11 = 0;
                              var25 = aj.a(var12, var12.field_db + -(var12.field_Y / 2), false, 89, (nf) this, var12.field_lb);
                              ((nf) this).b(52, var25);
                              break L235;
                            }
                          }
                          L236: {
                            if (30 != var10) {
                              break L236;
                            } else {
                              this.a(false, var8 - (bg.field_e.field_n >> 1), ((nf) this).field_V, true, var9 - bg.field_e.field_w, bg.field_e);
                              this.a(-(bg.field_e.field_n >> 1) + var8, (byte) -91, -bg.field_e.field_w + var9, ((nf) this).field_Jb, bg.field_e);
                              ((nf) this).field_D = true;
                              break L236;
                            }
                          }
                          L237: {
                            ((nf) this).field_mb = var8;
                            ((nf) this).field_t = var9;
                            if (var10 == 116) {
                              break L237;
                            } else {
                              if (var10 == 87) {
                                break L237;
                              } else {
                                if (var10 == 45) {
                                  break L237;
                                } else {
                                  if (54 == var10) {
                                    break L237;
                                  } else {
                                    if (var10 == 154) {
                                      break L237;
                                    } else {
                                      if (var10 == 139) {
                                        break L237;
                                      } else {
                                        if (var10 != 152) {
                                          if (((nf) this).field_D) {
                                            break L237;
                                          } else {
                                            throw new IllegalStateException();
                                          }
                                        } else {
                                          break L237;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.p((byte) 99);
                          return;
                        }
                      } else {
                        ((nf) this).e(var4, false);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                throw new IllegalStateException();
              }
            }
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final int[] a(byte param0, jd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int[] stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_36_0 = null;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var20 = new int[20];
            var18 = var20;
            var16 = var18;
            var14 = var16;
            var13 = var14;
            var21 = var13;
            var19 = var21;
            var17 = var19;
            var15 = var17;
            var5 = var15;
            var6 = 43;
            var7 = 0;
            L1: while (true) {
              if (var7 >= -1 + var20.length) {
                var5[1 + uj.a(param1, var21.length - 2, (byte) -26)] = 32 + ((nf) this).field_H;
                var5[uj.a(param1, var21.length + -2, (byte) -111) + 1] = ((nf) this).field_H - -32;
                var5[uj.a(param1, -2 + var21.length, (byte) -111) + 1] = ((nf) this).field_H - -32;
                var5[1 + uj.a(param1, var21.length + -2, (byte) -81)] = 32 + ((nf) this).field_H;
                var5[0] = ((nf) this).field_H + 64;
                var5[-1 + var21.length] = var21[0];
                L2: while (true) {
                  if (((nf) this).field_y / 64 <= var5.length) {
                    this.a(var5, (byte) -109);
                    var6 = 0;
                    var7 = 0;
                    L3: while (true) {
                      var7++;
                      var8 = uj.a(param1, ((nf) this).field_y, (byte) -36);
                      var9 = 2;
                      var10 = var8 + ((nf) this).field_y * var9;
                      L4: while (true) {
                        L5: {
                          if (((nf) this).field_H <= var9) {
                            break L5;
                          } else {
                            if (mn.field_y.field_m[var10] != 0) {
                              break L5;
                            } else {
                              L6: {
                                var10 = var10 + ((nf) this).field_y;
                                var9++;
                                var8 = var8 + (-1 + var7 % 3);
                                var10 = var10 + (-1 + var7 % 3);
                                if (var8 < 0) {
                                  var8 = var8 + ((nf) this).field_y;
                                  var10 = var10 + ((nf) this).field_y;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              if (~((nf) this).field_y >= ~var8) {
                                var8 = var8 - ((nf) this).field_y;
                                var10 = var10 - ((nf) this).field_y;
                                continue L4;
                              } else {
                                continue L4;
                              }
                            }
                          }
                        }
                        L7: {
                          var11 = 64 * (-var9 + ((nf) this).field_H) / ((nf) this).field_H + uj.a(param1, 16, (byte) -34);
                          if (~var9 <= ~((nf) this).field_H) {
                            break L7;
                          } else {
                            if (~var9 >= ~(var11 - -32)) {
                              break L7;
                            } else {
                              if (~var11 <= ~var8) {
                                break L7;
                              } else {
                                if (-var11 + ((nf) this).field_y > var8) {
                                  o.a(mn.field_y, (byte) -47, var11, (byte) -5, var9, var8, (nf) this);
                                  var6 = var9;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        L8: {
                          if (var9 >= 32 + var11) {
                            break L8;
                          } else {
                            var6 = 0;
                            break L8;
                          }
                        }
                        if (var6 > 128) {
                          continue L3;
                        } else {
                          stackOut_36_0 = (int[]) var5;
                          stackIn_37_0 = stackOut_36_0;
                          break L0;
                        }
                      }
                    }
                  } else {
                    L9: {
                      var3_int = 100;
                      if (~var5.length >= ~(((nf) this).field_y / 8)) {
                        break L9;
                      } else {
                        var3_int = 5;
                        break L9;
                      }
                    }
                    var6_ref_int__ = new int[1 + (var5.length + -1) * 2];
                    var6_ref_int__[0] = var5[0];
                    var7 = 1;
                    L10: while (true) {
                      if (~var7 <= ~var5.length) {
                        var5 = var6_ref_int__;
                        continue L2;
                      } else {
                        L11: {
                          var4 = (5 + Math.abs(-var5[var7] + var5[-1 + var7])) * var3_int / 100;
                          if (((nf) this).field_H / 2 >= var5[var7]) {
                            break L11;
                          } else {
                            var4 = 2 * ((nf) this).field_H / var5.length;
                            break L11;
                          }
                        }
                        L12: {
                          stackOut_12_0 = (int[]) var6_ref_int__;
                          stackOut_12_1 = var7 * 2 - 1;
                          stackOut_12_2 = -var4 + (var5[-1 + var7] + var5[var7]) >> 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          if (var4 == 0) {
                            stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = stackIn_14_2;
                            stackOut_14_3 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            break L12;
                          } else {
                            stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = stackIn_13_2;
                            stackOut_13_3 = uj.a(param1, var4, (byte) -62);
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            break L12;
                          }
                        }
                        stackIn_15_0[stackIn_15_1] = stackIn_15_2 - -stackIn_15_3;
                        var6_ref_int__[2 * var7] = var5[var7];
                        var7++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                var13[var7] = 7 * ((nf) this).field_H / 8 - uj.a(param1, ((nf) this).field_H * 2 / 8, (byte) -25);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("nf.VB(").append(-70).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_37_0;
    }

    private final boolean a(int param0, ml param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_227_0 = 0;
        int stackIn_230_0 = 0;
        RuntimeException stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        RuntimeException stackIn_233_0 = null;
        StringBuilder stackIn_233_1 = null;
        RuntimeException stackIn_234_0 = null;
        StringBuilder stackIn_234_1 = null;
        String stackIn_234_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_231_0 = null;
        StringBuilder stackOut_231_1 = null;
        RuntimeException stackOut_233_0 = null;
        StringBuilder stackOut_233_1 = null;
        String stackOut_233_2 = null;
        RuntimeException stackOut_232_0 = null;
        StringBuilder stackOut_232_1 = null;
        String stackOut_232_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 153) {
              stackOut_3_0 = this.a(39, param1, true);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 != 11) {
                if (param0 == 159) {
                  L1: {
                    var4_int = 100;
                    if (((nf) this).field_x[param1.field_u] == 4) {
                      var4_int = ((nf) this).field_X[param1.field_u] / 5 * 5 + 5;
                      if (((nf) this).field_X[param1.field_u] <= 0) {
                        break L1;
                      } else {
                        if (~var4_int != ~(((nf) this).field_X[param1.field_u] + 5)) {
                          break L1;
                        } else {
                          var4_int = ((nf) this).field_X[param1.field_u];
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (20 >= param1.field_ib) {
                      break L2;
                    } else {
                      if (!param1.t(29)) {
                        break L2;
                      } else {
                        if (((nf) this).field_x[param1.field_u] == 10) {
                          break L2;
                        } else {
                          if (~var4_int < ~((nf) this).field_X[param1.field_u]) {
                            L3: {
                              if (9 == ((nf) this).field_x[param1.field_u]) {
                                L4: {
                                  if (param1.field_ib <= 100) {
                                    break L4;
                                  } else {
                                    if (param1.field_jb == 27) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                stackOut_27_0 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                return stackIn_28_0 != 0;
                              } else {
                                break L3;
                              }
                            }
                            stackOut_29_0 = 1;
                            stackIn_30_0 = stackOut_29_0;
                            return stackIn_30_0 != 0;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                } else {
                  L5: {
                    if (!((nf) this).field_f) {
                      break L5;
                    } else {
                      if (((nf) this).d((byte) 66, param0)) {
                        break L5;
                      } else {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        return stackIn_34_0 != 0;
                      }
                    }
                  }
                  L6: {
                    if (param0 != 87) {
                      break L6;
                    } else {
                      if (0 >= ((nf) this).b(param0, -102, param1.field_u)) {
                        break L6;
                      } else {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0 != 0;
                      }
                    }
                  }
                  L7: {
                    if (param0 != 116) {
                      break L7;
                    } else {
                      if (0 >= ((nf) this).b(param0, -102, param1.field_u)) {
                        break L7;
                      } else {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0 != 0;
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (param0 == 124) {
                        break L9;
                      } else {
                        if (param0 != 130) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (param1.field_D) {
                      stackOut_48_0 = 0;
                      stackIn_49_0 = stackOut_48_0;
                      return stackIn_49_0 != 0;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    cf.field_f = false;
                    if (param0 != 139) {
                      break L10;
                    } else {
                      if (null == param1.field_s) {
                        break L10;
                      } else {
                        stackOut_52_0 = 1;
                        stackIn_53_0 = stackOut_52_0;
                        return stackIn_53_0 != 0;
                      }
                    }
                  }
                  L11: {
                    if (param0 != 152) {
                      break L11;
                    } else {
                      if (param1.field_jb == 19) {
                        stackOut_57_0 = 1;
                        stackIn_58_0 = stackOut_57_0;
                        return stackIn_58_0 != 0;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (152 != param0) {
                      break L12;
                    } else {
                      if (param1.field_jb == 19) {
                        break L12;
                      } else {
                        stackOut_61_0 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        return stackIn_62_0 != 0;
                      }
                    }
                  }
                  L13: {
                    if (param0 != 87) {
                      break L13;
                    } else {
                      if (param1.field_jb == 19) {
                        stackOut_66_0 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        return stackIn_67_0 != 0;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (150 != param0) {
                      break L14;
                    } else {
                      if (-16 + ((nf) this).field_H <= param1.field_db) {
                        stackOut_71_0 = 1;
                        stackIn_72_0 = stackOut_71_0;
                        return stackIn_72_0 != 0;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (param0 != 158) {
                    L15: {
                      if (null == param1.field_s) {
                        break L15;
                      } else {
                        if (this.a(param0, param1, 1)) {
                          stackOut_79_0 = 1;
                          stackIn_80_0 = stackOut_79_0;
                          return stackIn_80_0 != 0;
                        } else {
                          L16: {
                            var4_array = gj.field_c[param1.field_jb];
                            if (param1.field_jb != 17) {
                              break L16;
                            } else {
                              if (!param1.field_U) {
                                break L16;
                              } else {
                                var4_array = lj.field_u;
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (param1.field_jb != 10) {
                              break L17;
                            } else {
                              L18: {
                                stackOut_85_0 = 1;
                                stackIn_87_0 = stackOut_85_0;
                                stackIn_86_0 = stackOut_85_0;
                                if (param1.field_U) {
                                  stackOut_87_0 = stackIn_87_0;
                                  stackOut_87_1 = 0;
                                  stackIn_88_0 = stackOut_87_0;
                                  stackIn_88_1 = stackOut_87_1;
                                  break L18;
                                } else {
                                  stackOut_86_0 = stackIn_86_0;
                                  stackOut_86_1 = 1;
                                  stackIn_88_0 = stackOut_86_0;
                                  stackIn_88_1 = stackOut_86_1;
                                  break L18;
                                }
                              }
                              if (stackIn_88_0 == stackIn_88_1) {
                                break L17;
                              } else {
                                var4_array = vi.field_N;
                                break L17;
                              }
                            }
                          }
                          var5 = 0;
                          var6 = 0;
                          L19: while (true) {
                            if (var6 >= var4_array.length) {
                              if (var5 != 0) {
                                break L15;
                              } else {
                                stackOut_96_0 = 0;
                                stackIn_97_0 = stackOut_96_0;
                                return stackIn_97_0 != 0;
                              }
                            } else {
                              L20: {
                                if (var4_array[var6] != param0) {
                                  break L20;
                                } else {
                                  var5 = 1;
                                  break L20;
                                }
                              }
                              var6++;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (param0 == 6) {
                          break L22;
                        } else {
                          if (param0 == 79) {
                            break L22;
                          } else {
                            L23: {
                              if (98 == param0) {
                                break L23;
                              } else {
                                if (param0 == 92) {
                                  break L23;
                                } else {
                                  if (param0 >= 156) {
                                    break L21;
                                  } else {
                                    if (param0 <= -1) {
                                      break L21;
                                    } else {
                                      if (rd.field_e[param0] != 4) {
                                        break L21;
                                      } else {
                                        if (4 >= 1 + ((nf) this).c((byte) -116, param1.field_u)) {
                                          if (((nf) this).b(12) + 1 <= 4 * ((nf) this).field_q) {
                                            break L21;
                                          } else {
                                            cf.field_f = true;
                                            stackOut_109_0 = 0;
                                            stackIn_110_0 = stackOut_109_0;
                                            return stackIn_110_0 != 0;
                                          }
                                        } else {
                                          cf.field_f = true;
                                          stackOut_106_0 = 0;
                                          stackIn_107_0 = stackOut_106_0;
                                          return stackIn_107_0 != 0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (4 >= 2 + ((nf) this).c((byte) -113, param1.field_u)) {
                              if (2 + ((nf) this).b(12) <= ((nf) this).field_q * 4) {
                                break L21;
                              } else {
                                cf.field_f = true;
                                stackOut_115_0 = 0;
                                stackIn_116_0 = stackOut_115_0;
                                return stackIn_116_0 != 0;
                              }
                            } else {
                              cf.field_f = true;
                              stackOut_112_0 = 0;
                              stackIn_113_0 = stackOut_112_0;
                              return stackIn_113_0 != 0;
                            }
                          }
                        }
                      }
                      if (3 + ((nf) this).c((byte) -128, param1.field_u) > 4) {
                        cf.field_f = true;
                        stackOut_119_0 = 0;
                        stackIn_120_0 = stackOut_119_0;
                        return stackIn_120_0 != 0;
                      } else {
                        if (3 + ((nf) this).b(12) <= 4 * ((nf) this).field_q) {
                          break L21;
                        } else {
                          cf.field_f = true;
                          stackOut_122_0 = 0;
                          stackIn_123_0 = stackOut_122_0;
                          return stackIn_123_0 != 0;
                        }
                      }
                    }
                    L24: {
                      if (param0 != 93) {
                        break L24;
                      } else {
                        if (!param1.t(57)) {
                          break L24;
                        } else {
                          stackOut_126_0 = 0;
                          stackIn_127_0 = stackOut_126_0;
                          return stackIn_127_0 != 0;
                        }
                      }
                    }
                    L25: {
                      if (param0 != 95) {
                        break L25;
                      } else {
                        if (param1.t(27)) {
                          stackOut_131_0 = 0;
                          stackIn_132_0 = stackOut_131_0;
                          return stackIn_132_0 != 0;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (2 != param0) {
                        break L26;
                      } else {
                        if (param1.field_jb != 0) {
                          stackOut_136_0 = 0;
                          stackIn_137_0 = stackOut_136_0;
                          return stackIn_137_0 != 0;
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (param0 != 55) {
                        break L27;
                      } else {
                        if (param1.field_jb != 0) {
                          stackOut_141_0 = 0;
                          stackIn_142_0 = stackOut_141_0;
                          return stackIn_142_0 != 0;
                        } else {
                          break L27;
                        }
                      }
                    }
                    L28: {
                      if (31 != param0) {
                        break L28;
                      } else {
                        if (param1.field_jb == 0) {
                          break L28;
                        } else {
                          stackOut_145_0 = 0;
                          stackIn_146_0 = stackOut_145_0;
                          return stackIn_146_0 != 0;
                        }
                      }
                    }
                    L29: {
                      if (param0 != 60) {
                        break L29;
                      } else {
                        if (0 == param1.field_jb) {
                          break L29;
                        } else {
                          stackOut_149_0 = 0;
                          stackIn_150_0 = stackOut_149_0;
                          return stackIn_150_0 != 0;
                        }
                      }
                    }
                    L30: {
                      if (param0 != 81) {
                        break L30;
                      } else {
                        if (param1.field_jb == 0) {
                          break L30;
                        } else {
                          stackOut_153_0 = 0;
                          stackIn_154_0 = stackOut_153_0;
                          return stackIn_154_0 != 0;
                        }
                      }
                    }
                    L31: {
                      if (param0 != 91) {
                        break L31;
                      } else {
                        if (param1.field_jb == 0) {
                          break L31;
                        } else {
                          stackOut_157_0 = 0;
                          stackIn_158_0 = stackOut_157_0;
                          return stackIn_158_0 != 0;
                        }
                      }
                    }
                    L32: {
                      if (param0 != 114) {
                        break L32;
                      } else {
                        if (0 == param1.field_jb) {
                          break L32;
                        } else {
                          stackOut_161_0 = 0;
                          stackIn_162_0 = stackOut_161_0;
                          return stackIn_162_0 != 0;
                        }
                      }
                    }
                    L33: {
                      if (param2) {
                        break L33;
                      } else {
                        ((nf) this).field_ib = null;
                        break L33;
                      }
                    }
                    L34: {
                      if (param0 != 71) {
                        break L34;
                      } else {
                        if (param1.field_jb == 0) {
                          break L34;
                        } else {
                          if (param1.field_jb == 19) {
                            break L34;
                          } else {
                            stackOut_168_0 = 0;
                            stackIn_169_0 = stackOut_168_0;
                            return stackIn_169_0 != 0;
                          }
                        }
                      }
                    }
                    L35: {
                      if (param0 != 83) {
                        break L35;
                      } else {
                        if (param1.field_jb == 0) {
                          break L35;
                        } else {
                          if (param1.field_jb == 19) {
                            break L35;
                          } else {
                            stackOut_173_0 = 0;
                            stackIn_174_0 = stackOut_173_0;
                            return stackIn_174_0 != 0;
                          }
                        }
                      }
                    }
                    L36: {
                      if (param0 != 45) {
                        break L36;
                      } else {
                        if (!param1.g((byte) 90)) {
                          break L36;
                        } else {
                          stackOut_177_0 = 0;
                          stackIn_178_0 = stackOut_177_0;
                          return stackIn_178_0 != 0;
                        }
                      }
                    }
                    L37: {
                      if (param0 != 45) {
                        break L37;
                      } else {
                        if (27 == param1.field_jb) {
                          stackOut_182_0 = 0;
                          stackIn_183_0 = stackOut_182_0;
                          return stackIn_183_0 != 0;
                        } else {
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (param1.field_jb == 16) {
                        L39: {
                          if (60 > param0) {
                            break L39;
                          } else {
                            if (71 >= param0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                        if (param0 >= 12) {
                          stackOut_198_0 = 0;
                          stackIn_199_0 = stackOut_198_0;
                          return stackIn_199_0 != 0;
                        } else {
                          break L38;
                        }
                      } else {
                        if (param1.field_jb != 18) {
                          break L38;
                        } else {
                          L40: {
                            if (param0 < 72) {
                              break L40;
                            } else {
                              if (param0 <= 83) {
                                break L38;
                              } else {
                                break L40;
                              }
                            }
                          }
                          if (param0 >= 12) {
                            stackOut_191_0 = 0;
                            stackIn_192_0 = stackOut_191_0;
                            return stackIn_192_0 != 0;
                          } else {
                            break L38;
                          }
                        }
                      }
                    }
                    if (param0 >= 0) {
                      if (param1.field_db > ((nf) this).field_H) {
                        L41: {
                          if (param0 != 4) {
                            stackOut_207_0 = 0;
                            stackIn_208_0 = stackOut_207_0;
                            break L41;
                          } else {
                            stackOut_206_0 = 1;
                            stackIn_208_0 = stackOut_206_0;
                            break L41;
                          }
                        }
                        return stackIn_208_0 != 0;
                      } else {
                        L42: {
                          if (param0 != 4) {
                            break L42;
                          } else {
                            if (param1.field_gb == null) {
                              break L42;
                            } else {
                              if (param1.field_gb.field_I != 121) {
                                break L42;
                              } else {
                                stackOut_212_0 = 0;
                                stackIn_213_0 = stackOut_212_0;
                                return stackIn_213_0 != 0;
                              }
                            }
                          }
                        }
                        L43: {
                          if (((nf) this).field_J >= 0) {
                            var4_int = 0;
                            L44: while (true) {
                              if (16 <= var4_int) {
                                break L43;
                              } else {
                                if (param0 == ((nf) this).field_v[((nf) this).field_J][var4_int]) {
                                  if (0 == ((nf) this).field_vb[((nf) this).field_J][var4_int]) {
                                    stackOut_222_0 = 0;
                                    stackIn_223_0 = stackOut_222_0;
                                    return stackIn_223_0 != 0;
                                  } else {
                                    if (~(((nf) this).field_jb / ((nf) this).field_q) > ~le.field_d[param0]) {
                                      stackOut_226_0 = 0;
                                      stackIn_227_0 = stackOut_226_0;
                                      return stackIn_227_0 != 0;
                                    } else {
                                      return true;
                                    }
                                  }
                                } else {
                                  var4_int++;
                                  continue L44;
                                }
                              }
                            }
                          } else {
                            break L43;
                          }
                        }
                        stackOut_229_0 = 0;
                        stackIn_230_0 = stackOut_229_0;
                        break L0;
                      }
                    } else {
                      stackOut_201_0 = 1;
                      stackIn_202_0 = stackOut_201_0;
                      return stackIn_202_0 != 0;
                    }
                  } else {
                    stackOut_74_0 = 1;
                    stackIn_75_0 = stackOut_74_0;
                    return stackIn_75_0 != 0;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L45: {
            var4 = decompiledCaughtException;
            stackOut_231_0 = (RuntimeException) var4;
            stackOut_231_1 = new StringBuilder().append("nf.CC(").append(param0).append(',');
            stackIn_233_0 = stackOut_231_0;
            stackIn_233_1 = stackOut_231_1;
            stackIn_232_0 = stackOut_231_0;
            stackIn_232_1 = stackOut_231_1;
            if (param1 == null) {
              stackOut_233_0 = (RuntimeException) (Object) stackIn_233_0;
              stackOut_233_1 = (StringBuilder) (Object) stackIn_233_1;
              stackOut_233_2 = "null";
              stackIn_234_0 = stackOut_233_0;
              stackIn_234_1 = stackOut_233_1;
              stackIn_234_2 = stackOut_233_2;
              break L45;
            } else {
              stackOut_232_0 = (RuntimeException) (Object) stackIn_232_0;
              stackOut_232_1 = (StringBuilder) (Object) stackIn_232_1;
              stackOut_232_2 = "{...}";
              stackIn_234_0 = stackOut_232_0;
              stackIn_234_1 = stackOut_232_1;
              stackIn_234_2 = stackOut_232_2;
              break L45;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_234_0, stackIn_234_2 + ',' + param2 + ')');
        }
        return stackIn_230_0 != 0;
    }

    final void a(int param0, mi param1) {
        try {
            if (param0 != -1) {
                ((nf) this).field_fb = null;
            }
            ((nf) this).field_I.a((tf) (Object) param1, 15893);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nf.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 < 0) {
          return;
        } else {
          if (param2 < 0) {
            return;
          } else {
            if (param1 != 153) {
              if (152 != param1) {
                var6 = 0;
                var4 = var6;
                L0: while (true) {
                  L1: {
                    if (var6 >= 16) {
                      break L1;
                    } else {
                      if (param1 != ((nf) this).field_v[param2][var6]) {
                        var6++;
                        continue L0;
                      } else {
                        L2: {
                          ((nf) this).field_L[param2][var6] = true;
                          if (hh.field_b[param1] == -1) {
                            L3: {
                              ((nf) this).field_lb[param2][var6] = 5;
                              if (param1 != 46) {
                                break L3;
                              } else {
                                if (2 != ((nf) this).field_x[param2]) {
                                  break L3;
                                } else {
                                  ((nf) this).field_lb[param2][var6] = ((nf) this).field_lb[param2][var6] - ((nf) this).field_X[param2] / 20;
                                  break L3;
                                }
                              }
                            }
                            L4: {
                              if (0 < ((nf) this).field_vb[param2][var6]) {
                                ((nf) this).field_vb[param2][var6] = ((nf) this).field_vb[param2][var6] - 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            if (((nf) this).field_lb[param2][var6] <= 0) {
                              ((nf) this).field_vb[param2][var6] = 1;
                              ((nf) this).field_lb[param2][var6] = 0;
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            if (((nf) this).field_vb[param2][var6] <= 0) {
                              break L2;
                            } else {
                              L5: {
                                if (-1 == mj.field_p) {
                                  break L5;
                                } else {
                                  if (param1 == 5) {
                                    break L5;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              ((nf) this).field_vb[param2][var6] = ((nf) this).field_vb[param2][var6] - 1;
                              break L2;
                            }
                          }
                        }
                        L6: {
                          if (param1 != 87) {
                            break L6;
                          } else {
                            ((nf) this).field_lb[param2][var6] = 1;
                            break L6;
                          }
                        }
                        if (116 != param1) {
                          break L1;
                        } else {
                          ((nf) this).field_lb[param2][var6] = 1;
                          break L1;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                var4 = 0;
                L7: while (true) {
                  if (var4 >= 16) {
                    return;
                  } else {
                    if (152 != ((nf) this).field_v[param2][var4]) {
                      var4++;
                      continue L7;
                    } else {
                      L8: {
                        if (((nf) this).field_vb[param2][var4] <= 0) {
                          break L8;
                        } else {
                          ((nf) this).field_vb[param2][var4] = 0;
                          ((nf) this).field_lb[param2][var4] = 1;
                          break L8;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            } else {
              this.a((byte) 80, 39, param2);
              return;
            }
          }
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > param0) {
            return 0;
        }
        if (0 > param2) {
            return 0;
        }
        if (param1 != -102) {
            return 57;
        }
        if (!(param0 != 153)) {
            return ((nf) this).b(39, -102, param2);
        }
        for (var4 = 0; var4 < 16; var4++) {
            if (param0 == ((nf) this).field_v[param2][var4]) {
                return ((nf) this).field_lb[param2][var4];
            }
        }
        return -1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(((nf) this).field_eb)) {
            return;
        }
        th.a((nf) this, ((nf) this).field_V, -1, 4 + param1, param0, param3);
        if (param2 != 51) {
            ((nf) this).field_D = false;
        }
        o.a(((nf) this).field_V, (byte) -47, param1, (byte) 0, param3, param0, (nf) this);
        hj.a(((nf) this).field_Jb, param1, param3, (nf) this, (byte) 0, param0, param2 ^ -95);
    }

    final boolean b(int param0, ml param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param1.p(-8323);
              if (param2 == -16) {
                break L1;
              } else {
                ((nf) this).field_lb = null;
                break L1;
              }
            }
            L2: {
              if (~var5_int < ~param0) {
                break L2;
              } else {
                if (~param0 < ~(((nf) this).field_y - var5_int)) {
                  break L2;
                } else {
                  if (~param3 > ~var5_int) {
                    break L2;
                  } else {
                    if (-16 + ((nf) this).field_H < param3) {
                      break L2;
                    } else {
                      L3: {
                        if (null == param1.field_gb) {
                          break L3;
                        } else {
                          if (121 == param1.field_gb.field_I) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (this.a(param0, var5_int >> 1, param3, param2 ^ -70)) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L4;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L4;
                        }
                      }
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("nf.CB(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0 != 0;
    }

    nf(boolean param0, boolean param1, int param2, int param3, boolean param4, String[] param5, int param6, int param7, int[][] param8, int[][] param9, int[] param10, int param11, boolean[] param12) {
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          ((nf) this).field_M = true;
          ((nf) this).field_E = null;
          ((nf) this).field_C = -1;
          ((nf) this).field_y = 1920;
          ((nf) this).field_tb = 0;
          ((nf) this).field_H = 960;
          ((nf) this).field_Hb = ((nf) this).field_H / 2;
          ((nf) this).field_eb = true;
          ((nf) this).field_hb = ((nf) this).field_y / 2;
          ((nf) this).field_Z = false;
          ((nf) this).field_bb = -1;
          ((nf) this).field_fb = null;
          ((nf) this).field_nb = 0;
          ((nf) this).field_Y = -1;
          gh.field_D = new oc();
          n.field_d = new oc();
          u.field_f = new oc();
          mk.field_J = new oc();
          ge.field_p = new oc();
          ((nf) this).field_m = param11;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          L2: {
            ((nf) this).field_l = stackIn_3_1 != 0;
            var14_int = param5.length;
            ((nf) this).field_Cb = param7 + -1;
            if (var14_int == 4) {
              break L2;
            } else {
              if (var14_int == 6) {
                break L2;
              } else {
                ((nf) this).field_d = false;
                break L1;
              }
            }
          }
          L3: {
            stackOut_6_0 = this;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (!param4) {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L3;
            } else {
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L3;
            }
          }
          ((nf) this).field_d = stackIn_9_1 != 0;
          break L1;
        }
        L4: {
          ((nf) this).field_J = param7;
          ((nf) this).field_xb = param3;
          ((nf) this).field_Q = param6;
          if (((nf) this).field_d) {
            nj.field_n = ke.field_M;
            break L4;
          } else {
            nj.field_n = nj.field_a;
            break L4;
          }
        }
        L5: {
          ((nf) this).field_k = param5;
          if (0 <= ((nf) this).field_Cb) {
            break L5;
          } else {
            ((nf) this).field_Cb = ((nf) this).field_Cb + var14_int;
            break L5;
          }
        }
        L6: {
          if (param8 == null) {
            break L6;
          } else {
            ((nf) this).field_N = new int[var14_int][18];
            var15 = 0;
            L7: while (true) {
              if (var14_int <= var15) {
                break L6;
              } else {
                var16 = 0;
                L8: while (true) {
                  if (var16 >= 18) {
                    var15++;
                    continue L7;
                  } else {
                    ((nf) this).field_N[var15][var16] = param8[var15][var16];
                    var16++;
                    continue L8;
                  }
                }
              }
            }
          }
        }
        L9: {
          if (param10 != null) {
            ((nf) this).field_S = new int[var14_int];
            var15 = 0;
            L10: while (true) {
              if (var14_int <= var15) {
                break L9;
              } else {
                ((nf) this).field_S[var15] = param10[var15];
                var15++;
                continue L10;
              }
            }
          } else {
            ((nf) this).field_S = new int[var14_int];
            break L9;
          }
        }
        ((nf) this).field_g = new int[var14_int];
        ((nf) this).field_R = new int[var14_int];
        ((nf) this).field_Ob = new int[var14_int];
        ((nf) this).field_T = new int[var14_int];
        ((nf) this).field_U = new int[var14_int];
        ((nf) this).field_c = new int[var14_int];
        ((nf) this).field_db = new int[var14_int];
        ((nf) this).field_K = new int[var14_int];
        ((nf) this).field_wb = new int[var14_int];
        ((nf) this).field_b = new int[var14_int];
        ((nf) this).field_s = new int[var14_int];
        ((nf) this).field_ob = new int[var14_int];
        ((nf) this).field_gb = new int[var14_int];
        ((nf) this).field_F = param2;
        ((nf) this).field_ab = new int[var14_int];
        ((nf) this).field_Nb = new int[var14_int];
        ((nf) this).field_u = new boolean[var14_int];
        ((nf) this).field_Fb = new int[var14_int];
        ((nf) this).field_ib = new int[var14_int];
        ((nf) this).field_a = new int[var14_int];
        ((nf) this).field_Eb = new int[var14_int];
        ((nf) this).field_cb = new int[var14_int];
        ((nf) this).field_p = new int[var14_int];
        ((nf) this).field_n = new int[var14_int];
        ((nf) this).field_q = param5.length;
        var15 = 0;
        L11: while (true) {
          if (var15 >= ((nf) this).field_q) {
            ((nf) this).field_i = new vn();
            ((nf) this).field_B = new mo(32);
            ((nf) this).field_Kb = new vn();
            ((nf) this).field_I = new tg();
            ((nf) this).field_kb = new vn();
            ((nf) this).field_Db = new vn();
            ((nf) this).field_r = new vn();
            ((nf) this).field_h = new tg();
            ((nf) this).field_v = new int[((nf) this).field_q][16];
            ((nf) this).field_x = new int[((nf) this).field_q];
            ((nf) this).field_lb = new int[((nf) this).field_q][];
            ((nf) this).field_f = false;
            ((nf) this).field_L = new boolean[((nf) this).field_q][16];
            ((nf) this).field_vb = new int[((nf) this).field_q][];
            ((nf) this).field_o = new int[((nf) this).field_q];
            ((nf) this).field_X = new int[((nf) this).field_q];
            ((nf) this).field_Ab = new int[((nf) this).field_q];
            var15 = 0;
            L12: while (true) {
              if (~((nf) this).field_q >= ~var15) {
                return;
              } else {
                L13: {
                  ((nf) this).field_x[var15] = 10;
                  ((nf) this).field_X[var15] = 0;
                  ((nf) this).field_Ab[var15] = 0;
                  ((nf) this).field_o[var15] = 0;
                  if (param9 == null) {
                    L14: {
                      var16 = 1;
                      if (2 != var16) {
                        break L14;
                      } else {
                        ((nf) this).field_v[var15][0] = 0;
                        ((nf) this).field_v[var15][1] = 4;
                        ((nf) this).field_v[var15][2] = 6;
                        ((nf) this).field_v[var15][3] = 45;
                        ((nf) this).field_v[var15][4] = 8;
                        ((nf) this).field_v[var15][5] = 36;
                        ((nf) this).field_v[var15][6] = 37;
                        ((nf) this).field_v[var15][7] = 38;
                        ((nf) this).field_v[var15][8] = 39;
                        ((nf) this).field_v[var15][9] = 40;
                        ((nf) this).field_v[var15][10] = 41;
                        ((nf) this).field_v[var15][11] = 42;
                        ((nf) this).field_v[var15][12] = 43;
                        ((nf) this).field_v[var15][13] = 44;
                        ((nf) this).field_v[var15][14] = 46;
                        ((nf) this).field_v[var15][15] = 47;
                        break L14;
                      }
                    }
                    L15: {
                      if (3 != var16) {
                        break L15;
                      } else {
                        ((nf) this).field_v[var15][0] = 0;
                        ((nf) this).field_v[var15][1] = 4;
                        ((nf) this).field_v[var15][2] = 6;
                        ((nf) this).field_v[var15][3] = 17;
                        ((nf) this).field_v[var15][4] = 8;
                        ((nf) this).field_v[var15][5] = 12;
                        ((nf) this).field_v[var15][6] = 13;
                        ((nf) this).field_v[var15][7] = 14;
                        ((nf) this).field_v[var15][8] = 15;
                        ((nf) this).field_v[var15][9] = 16;
                        ((nf) this).field_v[var15][10] = 18;
                        ((nf) this).field_v[var15][11] = 19;
                        ((nf) this).field_v[var15][12] = 20;
                        ((nf) this).field_v[var15][13] = 21;
                        ((nf) this).field_v[var15][14] = 22;
                        ((nf) this).field_v[var15][15] = 10;
                        break L15;
                      }
                    }
                    L16: {
                      if (4 != var16) {
                        break L16;
                      } else {
                        ((nf) this).field_v[var15][0] = 0;
                        ((nf) this).field_v[var15][1] = 4;
                        ((nf) this).field_v[var15][2] = 6;
                        ((nf) this).field_v[var15][3] = 10;
                        ((nf) this).field_v[var15][4] = 8;
                        ((nf) this).field_v[var15][5] = 48;
                        ((nf) this).field_v[var15][6] = 50;
                        ((nf) this).field_v[var15][7] = 52;
                        ((nf) this).field_v[var15][8] = 56;
                        ((nf) this).field_v[var15][9] = 49;
                        ((nf) this).field_v[var15][10] = 51;
                        ((nf) this).field_v[var15][11] = 53;
                        ((nf) this).field_v[var15][12] = 57;
                        ((nf) this).field_v[var15][13] = 58;
                        ((nf) this).field_v[var15][14] = 54;
                        ((nf) this).field_v[var15][15] = 55;
                        break L16;
                      }
                    }
                    if (var16 != 1) {
                      break L13;
                    } else {
                      ((nf) this).field_v[var15][0] = 0;
                      ((nf) this).field_v[var15][1] = 4;
                      ((nf) this).field_v[var15][2] = 6;
                      ((nf) this).field_v[var15][3] = 10;
                      ((nf) this).field_v[var15][4] = 35;
                      ((nf) this).field_v[var15][5] = 24;
                      ((nf) this).field_v[var15][6] = 28;
                      ((nf) this).field_v[var15][7] = 30;
                      ((nf) this).field_v[var15][8] = 32;
                      ((nf) this).field_v[var15][9] = 25;
                      ((nf) this).field_v[var15][10] = 27;
                      ((nf) this).field_v[var15][11] = 29;
                      ((nf) this).field_v[var15][12] = 33;
                      ((nf) this).field_v[var15][13] = 34;
                      ((nf) this).field_v[var15][14] = 26;
                      ((nf) this).field_v[var15][15] = 31;
                      break L13;
                    }
                  } else {
                    var16 = 0;
                    L17: while (true) {
                      if (var16 >= 16) {
                        break L13;
                      } else {
                        L18: {
                          ((nf) this).field_v[var15][var16] = param9[var15][var16];
                          if (((nf) this).field_v[var15][var16] != 11) {
                            break L18;
                          } else {
                            ((nf) this).field_f = true;
                            break L18;
                          }
                        }
                        var16++;
                        continue L17;
                      }
                    }
                  }
                }
                ((nf) this).field_lb[var15] = new int[16];
                ((nf) this).field_vb[var15] = new int[16];
                var16 = 0;
                L19: while (true) {
                  if (var16 >= 16) {
                    L20: {
                      if (!param12[var15]) {
                        var16 = 0;
                        L21: while (true) {
                          if (var16 > 4) {
                            break L20;
                          } else {
                            L22: {
                              if (((nf) this).field_v[var15][var16] < 12) {
                                break L22;
                              } else {
                                if (((nf) this).field_v[var15][var16] % 12 != 0) {
                                  break L22;
                                } else {
                                  if (((nf) this).field_v[var15][var16 - -11] != 11 + ((nf) this).field_v[var15][var16]) {
                                    break L22;
                                  } else {
                                    ((nf) this).field_x[var15] = -1 + ((nf) this).field_v[var15][var16] / 12;
                                    break L22;
                                  }
                                }
                              }
                            }
                            var16++;
                            continue L21;
                          }
                        }
                      } else {
                        var16 = 0;
                        L23: while (true) {
                          if (var16 > 4) {
                            break L20;
                          } else {
                            L24: {
                              if (((nf) this).field_v[var15][var16] < 0) {
                                break L24;
                              } else {
                                if (((nf) this).field_v[var15][var16] % 12 != 0) {
                                  break L24;
                                } else {
                                  if (((nf) this).field_v[var15][11 + var16] != 11 + ((nf) this).field_v[var15][var16]) {
                                    break L24;
                                  } else {
                                    ((nf) this).field_x[var15] = ((nf) this).field_v[var15][var16] / 12 + -1;
                                    if (((nf) this).field_x[var15] != -1) {
                                      break L24;
                                    } else {
                                      ((nf) this).field_x[var15] = 9;
                                      var17 = new int[nj.field_n.length];
                                      var18 = 0;
                                      L25: while (true) {
                                        if (~nj.field_n.length >= ~var18) {
                                          nj.field_n = var17;
                                          nj.field_n[var15] = 13413102;
                                          break L24;
                                        } else {
                                          var17[var18] = nj.field_n[var18];
                                          var18++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var16++;
                            continue L23;
                          }
                        }
                      }
                    }
                    var15++;
                    continue L12;
                  } else {
                    L26: {
                      L27: {
                        if (-1 == ((nf) this).field_v[var15][var16]) {
                          break L27;
                        } else {
                          if (((nf) this).field_v[var15][var16] < 156) {
                            ((nf) this).field_vb[var15][var16] = hh.field_b[((nf) this).field_v[var15][var16]];
                            if (-1 != ((nf) this).field_vb[var15][var16]) {
                              if (((nf) this).field_vb[var15][var16] != 0) {
                                break L26;
                              } else {
                                ((nf) this).field_vb[var15][var16] = -1;
                                break L26;
                              }
                            } else {
                              ((nf) this).field_vb[var15][var16] = 1;
                              break L26;
                            }
                          } else {
                            break L27;
                          }
                        }
                      }
                      ((nf) this).field_v[var15][var16] = -1;
                      break L26;
                    }
                    var16++;
                    continue L19;
                  }
                }
              }
            }
          } else {
            var15++;
            continue L11;
          }
        }
    }

    final int b(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = 0;
        if (param0 != 12) {
            int discarded$0 = ((nf) this).f(-25);
        }
        gh.field_D.a((byte) 78, ((nf) this).field_i);
        ml var3 = (ml) (Object) gh.field_D.b(-43);
        while (var3 != null) {
            if (12 != var3.field_jb) {
                if (!(null == var3.field_s)) {
                    var2++;
                }
            }
            var3 = (ml) (Object) gh.field_D.d(param0 ^ -18506);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_W = -1;
        field_Bb = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_yb = "Become a member to earn wands and unlock this spellbook.";
        field_e = "Book of Nature";
        field_Lb = new int[8192];
    }
}
